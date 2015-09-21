/* 
 * Copyright 2013-2015 Modeliosoft - www.modeliosoft.com 
 * 
 * All information contained herein is, and remains the property of Modeliosoft.
 * The intellectual and technical concepts contained herein are proprietary 
 * to Modeliosoft and may be covered by French and Foreign Patents, patents
 * in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained
 * from Modeliosoft.
 * 
 */


package org.modelio.patterns.exporter.impl;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.model.IUMLTypes;
import org.modelio.api.modelio.Modelio;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.patterns.exporter.PatternModelAnalysis;
import org.modelio.patterns.model.ProfileUtils.PatternDesignerStereotypes;
import org.modelio.patterns.model.ProfileUtils;
import org.modelio.vcore.smkernel.mapi.MDependency;
import org.modelio.vcore.smkernel.mapi.MObject;

@objid ("e5ba4016-a1f5-4289-92c3-374851f37d4c")
class RelationGenerator {
    @objid ("cba82d9f-0435-4d3f-be12-709f90a8bfe9")
    private List<Relation> relations;

    @objid ("8ab36f6a-3782-4997-8047-f9a153e0a87b")
    private Set<MObject> rootParents;

    @objid ("ef93673a-0d12-417d-bc43-14bed120d636")
    private ParameterManager paramManager;

    @objid ("de4f14ed-2879-4b0d-b0e8-5b99eb8c039d")
    public PatternModelAnalysis patternModelAnalysis;

    @objid ("e1772880-cd5f-44ef-9a03-454d35bdd1ab")
    private PatternModelAnalysis report;

    @objid ("c5daf89e-dba1-4347-91b4-ca708c32363c")
    public RelationGenerator(PatternModelAnalysis report, ParameterManager paramManager) {
        this.report = report;
        this.paramManager = paramManager;
        this.relations = new ArrayList<>();
    }

    @objid ("daac3d35-682a-415b-95a5-3d07cf1e711c")
    public void addRelation(MObject source, MDependency dependency) {
        for (MObject destination : source.mGet(dependency)) {
            this.relations.add(new Relation(source, destination, dependency));
        }
    }

    @objid ("dea57eb1-66c0-4779-aa98-eb374eeb39e4")
    public void generate(FileWriterUtil filewriter) {
        // Export roots are composition parents of each pattern root, except for the pattern itself.
        this.rootParents = new HashSet<>();
        for (ModelElement root : this.report.getRootParameters()) {
            this.rootParents.add(root.getCompositionOwner());
        }
        
        for (Relation relation : this.relations) {
            if (relation.source != null && relation.destination != null) {
                String sourceElement = getSourceId(relation.source, relation.relationType);
                String destElement = getDestinationId(relation.source, relation.destination);
        
                if (sourceElement != null && destElement != null) {
                    filewriter.countWrite(sourceElement + ".add(" + destElement + ");");
                } else {
                    filewriter.countWrite("// " + sourceElement + ".add(" + destElement + ");");
                }
            }
        }
    }

    @objid ("674b43ba-4269-4045-952e-6ad49e26c4a4")
    private String getSourceId(MObject element, MDependency dependency) {
        if (IdGenerator.getInstance().exists(element)) {
            return "elements.get(" + IdGenerator.getInstance().getId(element) + ").mGet(elements.get("
                    + IdGenerator.getInstance().getId(element) + ").getMClass().getDependency(\"" + dependency.getName() + "\"))";
        }
        return null;
    }

    @objid ("77572641-40ec-46d4-9363-c13da6caec31")
    private String getDestinationId(MObject source, MObject element) {
        // Elementary
        if (element instanceof DataType) {
            IUMLTypes umltype = Modelio.getInstance().getModelingSession().getModel().getUmlTypes();
            DataType type = (DataType) element;
            if (((DataType) element).equals(umltype.getBOOLEAN()) || ((DataType) element).equals(umltype.getBOOLEAN())
                    || ((DataType) element).equals(umltype.getBYTE()) || ((DataType) element).equals(umltype.getCHAR())
                    || ((DataType) element).equals(umltype.getDATE()) || ((DataType) element).equals(umltype.getDOUBLE())
                    || ((DataType) element).equals(umltype.getFLOAT()) || ((DataType) element).equals(umltype.getINTEGER())
                    || ((DataType) element).equals(umltype.getLONG()) || ((DataType) element).equals(umltype.getSHORT())
                    || ((DataType) element).equals(umltype.getSTRING()) || ((DataType) element).equals(umltype.getUNDEFINED())) {
                return "umltypes.get" + type.getName().toUpperCase() + "()";
            }
        }
        
        // Root
        for (MObject exportRoot : this.rootParents) {
            if (element.equals(exportRoot)) {
                return this.paramManager.parameterFormater((ModelElement) element);
            }
        }
        
        // Stereotypes
        if (element instanceof Stereotype) {
            Stereotype stereotype = (Stereotype) element;
        
            ModuleComponent module = stereotype.getModule();
            this.report.addModuleDependency(module);
            return "metamodel.getStereotype(\"" + module.getName() + "\",\"" + stereotype.getName() + "\",Metamodel.getMClass(\"" + source.getMClass().getName() + "\"))";
        }
        
        // TagType
        if (element instanceof TagType) {
            TagType tagtype = (TagType) element;
        
            ModuleComponent module = tagtype.getModule();
            this.report.addModuleDependency(module);
            return "metamodel.getTagType(\"" + module.getName() + "\",\"" + tagtype.getName() + "\",Metamodel.getMClass(\"" + source.getCompositionOwner().getMClass().getName() + "\"))";
        }
        
        // NoteType
        if (element instanceof NoteType) {
            NoteType notetype = (NoteType) element;
        
            ModuleComponent module = notetype.getModule();
            this.report.addModuleDependency(module);
            return "metamodel.getNoteType(\"" + module.getName() + "\",\"" + notetype.getName() + "\",Metamodel.getMClass(\"" + source.getCompositionOwner().getMClass().getName() + "\"))";
        }
        
        // ExternDocumentType
        if (element instanceof ExternDocumentType) {
            ExternDocumentType externdoctype = (ExternDocumentType) element;
        
            ModuleComponent module = externdoctype.getModule();
            this.report.addModuleDependency(module);
            return "metamodel.getExternDocumentType(\"" + module.getName() + "\",\"" + externdoctype.getName() + "\",Metamodel.getMClass(\"" + source.getCompositionOwner().getMClass().getName() + "\"))";
        }
        
        // PropertyTableDefinition
        if (element instanceof PropertyTableDefinition) {
            PropertyTableDefinition propertytabledef = (PropertyTableDefinition) element;
        
            Stereotype stereotype = propertytabledef.getOwnerStereotype();
            if (stereotype != null) {
                ModuleComponent module = stereotype.getModule();
                this.report.addModuleDependency(module);
                return "(" + element.getMClass().getName()
                        + ")session.findElementById(Metamodel.getJavaInterface(Metamodel.getMClass(\"" + element.getMClass().getName()
                        + "\")),\"" + element.getUuid().toString() + "\")";
            }
        }
        
        // RAMC Element
        if (element.getStatus().isRamc()) {
            this.report.addRamcDependency((ModelElement) element);
            return "(" + element.getMClass().getName()
                    + ")session.findElementById(Metamodel.getJavaInterface(Metamodel.getMClass(\"" + element.getMClass().getName()
                    + "\")),\"" + element.getUuid().toString() + "\")";
        }
        
        // Others Elements
        if (IdGenerator.getInstance().exists(element)) {
            return "elements.get(" + IdGenerator.getInstance().getId(element) + ")";
        }
        if (element instanceof ModelElement) {
            if (((ModelElement) element).isStereotyped(ProfileUtils.MODULE_NAME, PatternDesignerStereotypes.PATTERNPARAMETER)) {
                return this.paramManager.parameterFormater((ModelElement) element);
            } else if (!(element instanceof AssociationEnd || element instanceof ConnectorEnd || element instanceof NamespaceUse)) {
                return this.paramManager.parameterFormater((ModelElement) element);
            }
        }
        return null;
    }

    @objid ("7b8c6021-0f14-43d0-99d6-fd0d7a33b5e2")
    private static class Relation {
        @objid ("d7a17680-fcc4-4cfb-9dc4-3abff57794fe")
        public static final String BIDIRECTIONAL = "BIDIRECTIONAL";

        @objid ("a9929eeb-c295-4006-999a-608a43582615")
        public MDependency relationType;

        @objid ("230e6faa-9cbf-44a2-84d7-cbf14f8e97b0")
        public MObject source;

        @objid ("28dc19ce-edb9-4616-9829-ef2540b95d0d")
        public MObject destination;

        @objid ("678ebde6-cc57-4f14-a85a-9a76e3467e4f")
        public Relation(MObject source, MObject destination, MDependency relationType) {
            this.source = source;
            this.relationType = relationType;
            this.destination = destination;
        }

    }

}
