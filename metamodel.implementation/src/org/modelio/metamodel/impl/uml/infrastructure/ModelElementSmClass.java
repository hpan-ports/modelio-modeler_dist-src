/* 
 * Copyright 2013-2015 Modeliosoft
 * 
 * This file is part of Modelio.
 * 
 * Modelio is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * Modelio is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with Modelio.  If not, see <http://www.gnu.org/licenses/>.
 * 
 */


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnLaneSmClass;
import org.modelio.metamodel.impl.diagrams.AbstractDiagramSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.ActivityPartitionSmClass;
import org.modelio.metamodel.impl.uml.informationFlow.InformationFlowSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ConstraintSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.DependencySmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ElementSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ExternDocumentSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.NoteSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.StereotypeSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.TaggedValueSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.matrix.MatrixDefinitionSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.LocalPropertyTableSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTableSmClass;
import org.modelio.metamodel.impl.uml.statik.BindableInstanceSmClass;
import org.modelio.metamodel.impl.uml.statik.BindingSmClass;
import org.modelio.metamodel.impl.uml.statik.ConnectorEndSmClass;
import org.modelio.metamodel.impl.uml.statik.ManifestationSmClass;
import org.modelio.metamodel.impl.uml.statik.NaryConnectorSmClass;
import org.modelio.metamodel.impl.uml.statik.TemplateParameterSmClass;
import org.modelio.metamodel.impl.uml.statik.TemplateParameterSubstitutionSmClass;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("0fe746a0-5fbd-4e65-a5b2-a33e5981c48f")
public class ModelElementSmClass extends ElementSmClass {
    @objid ("ede9f9ff-74f7-4393-b786-fecd56529485")
    private SmAttribute nameAtt;

    @objid ("a82234d2-4028-4a00-bb2a-38cb10727fb8")
    private SmDependency localPropertiesDep;

    @objid ("04468b0f-9cc8-48f1-b308-9e82194180cd")
    private SmDependency templateSubstitutionDep;

    @objid ("a3d440bc-bade-4263-89df-36103c53cf7d")
    private SmDependency bpmnLaneRefsDep;

    @objid ("20db9e01-602a-42aa-a5cc-f1179fc0f55f")
    private SmDependency extensionDep;

    @objid ("1394bf35-b697-45e6-94e4-46a5a796d442")
    private SmDependency dependsOnDependencyDep;

    @objid ("5b02f669-08e8-412d-9404-9416e1e329de")
    private SmDependency defaultParameteringDep;

    @objid ("fa23a601-de50-4aa1-a5f6-59ba7c417d55")
    private SmDependency representsDep;

    @objid ("bd9aa781-1fc3-4ba9-bfe5-c4cd40e76386")
    private SmDependency documentDep;

    @objid ("6f555831-5fce-4e0c-abce-c960dcc7bd5f")
    private SmDependency tagDep;

    @objid ("eb6a56be-2695-473d-98c3-7344a037d890")
    private SmDependency ownerTemplateParameterDep;

    @objid ("a80c2ad1-4286-4a02-9be8-4d4c2fb1336a")
    private SmDependency impactedDependencyDep;

    @objid ("81e36ec7-b765-4600-bea2-18dd7e186f74")
    private SmDependency representingEndDep;

    @objid ("64229b96-6536-46fd-ab88-1db3314a25b5")
    private SmDependency representingPartitionDep;

    @objid ("201942a3-d81a-4d65-a729-475c8b0f75af")
    private SmDependency constraintDefinitionDep;

    @objid ("f3a22fef-2c70-4454-8d69-65448998ed57")
    private SmDependency typingParameterDep;

    @objid ("250d6a1b-b941-4f07-8975-83b477dc8f0b")
    private SmDependency manifestingDep;

    @objid ("521a461c-ca6a-4179-a7a4-62974257d10d")
    private SmDependency propertiesDep;

    @objid ("afecaa20-5da8-422c-b914-5424400202f8")
    private SmDependency productDep;

    @objid ("49b3f3bc-1e9e-4d6b-8613-e30a38b84b98")
    private SmDependency representingInstanceDep;

    @objid ("3d7b5785-6a61-41ec-9a7f-2d47d05d40d1")
    private SmDependency receivedInfoDep;

    @objid ("201fdb91-6ee7-4dca-81e5-a464de5f056d")
    private SmDependency sentInfoDep;

    @objid ("a2286e2f-12e1-45e8-9571-2a032c01dfc8")
    private SmDependency descriptorDep;

    @objid ("7b78acbf-361d-4486-9514-6aeea575e70b")
    private SmDependency representingConnectorDep;

    @objid ("1c37b8fd-5b2b-4bc2-97a0-71cd52e398c3")
    private SmDependency matrixDep;

    @objid ("e00a8660-76bf-4689-82d1-d9a6704b8213")
    public ModelElementSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("5a16e8b6-1599-42be-ab44-92cd52ef7e15")
    @Override
    public String getName() {
        return "ModelElement";
    }

    @objid ("9a46802e-b24b-4fc7-a99e-95772e35b327")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("d26b1273-30c5-4f73-b95c-8e64f2b73829")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ModelElement.class;
    }

    @objid ("6480989a-ca8d-4fd2-b7c3-d5d4b6acbb16")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("315b88b2-9f2b-49ac-be88-09a3862b4717")
    @Override
    public boolean isAbstract() {
        return true;
    }

    @objid ("af9c5f47-623c-4e0e-805a-6356c1ed6326")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Element");
        this.registerFactory(new ModelElementObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.nameAtt = new NameSmAttribute();
        this.nameAtt.init("Name", this, String.class );
        registerAttribute(this.nameAtt);
        
        
        // Initialize and register the SmDependency
        this.localPropertiesDep = new LocalPropertiesSmDependency();
        this.localPropertiesDep.init("LocalProperties", this, metamodel.getMClass("LocalPropertyTable"), 0, 1 , SmDirective.SMCDTODELETE);
        registerDependency(this.localPropertiesDep);
        
        this.templateSubstitutionDep = new TemplateSubstitutionSmDependency();
        this.templateSubstitutionDep.init("TemplateSubstitution", this, metamodel.getMClass("TemplateParameterSubstitution"), 0, -1 );
        registerDependency(this.templateSubstitutionDep);
        
        this.bpmnLaneRefsDep = new BpmnLaneRefsSmDependency();
        this.bpmnLaneRefsDep.init("BpmnLaneRefs", this, metamodel.getMClass("BpmnLane"), 0, -1 );
        registerDependency(this.bpmnLaneRefsDep);
        
        this.extensionDep = new ExtensionSmDependency();
        this.extensionDep.init("Extension", this, metamodel.getMClass("Stereotype"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.extensionDep);
        
        this.dependsOnDependencyDep = new DependsOnDependencySmDependency();
        this.dependsOnDependencyDep.init("DependsOnDependency", this, metamodel.getMClass("Dependency"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.dependsOnDependencyDep);
        
        this.defaultParameteringDep = new DefaultParameteringSmDependency();
        this.defaultParameteringDep.init("DefaultParametering", this, metamodel.getMClass("TemplateParameter"), 0, -1 );
        registerDependency(this.defaultParameteringDep);
        
        this.representsDep = new RepresentsSmDependency();
        this.representsDep.init("Represents", this, metamodel.getMClass("Binding"), 0, -1 );
        registerDependency(this.representsDep);
        
        this.documentDep = new DocumentSmDependency();
        this.documentDep.init("Document", this, metamodel.getMClass("ExternDocument"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.documentDep);
        
        this.tagDep = new TagSmDependency();
        this.tagDep.init("Tag", this, metamodel.getMClass("TaggedValue"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.tagDep);
        
        this.ownerTemplateParameterDep = new OwnerTemplateParameterSmDependency();
        this.ownerTemplateParameterDep.init("OwnerTemplateParameter", this, metamodel.getMClass("TemplateParameter"), 0, 1 );
        registerDependency(this.ownerTemplateParameterDep);
        
        this.impactedDependencyDep = new ImpactedDependencySmDependency();
        this.impactedDependencyDep.init("ImpactedDependency", this, metamodel.getMClass("Dependency"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.impactedDependencyDep);
        
        this.representingEndDep = new RepresentingEndSmDependency();
        this.representingEndDep.init("RepresentingEnd", this, metamodel.getMClass("ConnectorEnd"), 0, -1 );
        registerDependency(this.representingEndDep);
        
        this.representingPartitionDep = new RepresentingPartitionSmDependency();
        this.representingPartitionDep.init("RepresentingPartition", this, metamodel.getMClass("ActivityPartition"), 0, -1 );
        registerDependency(this.representingPartitionDep);
        
        this.constraintDefinitionDep = new ConstraintDefinitionSmDependency();
        this.constraintDefinitionDep.init("ConstraintDefinition", this, metamodel.getMClass("Constraint"), 0, -1 , SmDirective.SMCDSHAREDCOMPONENT, SmDirective.SMCDTODELETE);
        registerDependency(this.constraintDefinitionDep);
        
        this.typingParameterDep = new TypingParameterSmDependency();
        this.typingParameterDep.init("TypingParameter", this, metamodel.getMClass("TemplateParameter"), 0, -1 );
        registerDependency(this.typingParameterDep);
        
        this.manifestingDep = new ManifestingSmDependency();
        this.manifestingDep.init("Manifesting", this, metamodel.getMClass("Manifestation"), 0, -1 , SmDirective.SMCDTODELETE);
        registerDependency(this.manifestingDep);
        
        this.propertiesDep = new PropertiesSmDependency();
        this.propertiesDep.init("Properties", this, metamodel.getMClass("PropertyTable"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.propertiesDep);
        
        this.productDep = new ProductSmDependency();
        this.productDep.init("Product", this, metamodel.getMClass("AbstractDiagram"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.productDep);
        
        this.representingInstanceDep = new RepresentingInstanceSmDependency();
        this.representingInstanceDep.init("RepresentingInstance", this, metamodel.getMClass("BindableInstance"), 0, -1 );
        registerDependency(this.representingInstanceDep);
        
        this.receivedInfoDep = new ReceivedInfoSmDependency();
        this.receivedInfoDep.init("ReceivedInfo", this, metamodel.getMClass("InformationFlow"), 0, -1 );
        registerDependency(this.receivedInfoDep);
        
        this.sentInfoDep = new SentInfoSmDependency();
        this.sentInfoDep.init("SentInfo", this, metamodel.getMClass("InformationFlow"), 0, -1 );
        registerDependency(this.sentInfoDep);
        
        this.descriptorDep = new DescriptorSmDependency();
        this.descriptorDep.init("Descriptor", this, metamodel.getMClass("Note"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.descriptorDep);
        
        this.representingConnectorDep = new RepresentingConnectorSmDependency();
        this.representingConnectorDep.init("RepresentingConnector", this, metamodel.getMClass("NaryConnector"), 0, -1 );
        registerDependency(this.representingConnectorDep);
        
        this.matrixDep = new MatrixSmDependency();
        this.matrixDep.init("Matrix", this, metamodel.getMClass("MatrixDefinition"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.matrixDep);
    }

    @objid ("ed1785f0-04ee-4ab9-93ca-6d70779bb380")
    public SmAttribute getNameAtt() {
        if (this.nameAtt == null) {
        	this.nameAtt = this.getAttributeDef("Name");
        }
        return this.nameAtt;
    }

    @objid ("32bb6137-6157-4fef-ac44-82aa86684d4a")
    public SmDependency getLocalPropertiesDep() {
        if (this.localPropertiesDep == null) {
        	this.localPropertiesDep = this.getDependencyDef("LocalProperties");
        }
        return this.localPropertiesDep;
    }

    @objid ("daab2977-d8b9-49e8-a76a-8a218b0fbb93")
    public SmDependency getTemplateSubstitutionDep() {
        if (this.templateSubstitutionDep == null) {
        	this.templateSubstitutionDep = this.getDependencyDef("TemplateSubstitution");
        }
        return this.templateSubstitutionDep;
    }

    @objid ("b13579e8-0268-4a81-a2ab-9ff346aed9d1")
    public SmDependency getBpmnLaneRefsDep() {
        if (this.bpmnLaneRefsDep == null) {
        	this.bpmnLaneRefsDep = this.getDependencyDef("BpmnLaneRefs");
        }
        return this.bpmnLaneRefsDep;
    }

    @objid ("f0565e23-a5da-4668-8c6f-6b9ab2d6db56")
    public SmDependency getExtensionDep() {
        if (this.extensionDep == null) {
        	this.extensionDep = this.getDependencyDef("Extension");
        }
        return this.extensionDep;
    }

    @objid ("f8a5d740-d0ac-43fb-8c76-170540897606")
    public SmDependency getDependsOnDependencyDep() {
        if (this.dependsOnDependencyDep == null) {
        	this.dependsOnDependencyDep = this.getDependencyDef("DependsOnDependency");
        }
        return this.dependsOnDependencyDep;
    }

    @objid ("81354146-3300-4cdd-9a2b-492b79c1d270")
    public SmDependency getDefaultParameteringDep() {
        if (this.defaultParameteringDep == null) {
        	this.defaultParameteringDep = this.getDependencyDef("DefaultParametering");
        }
        return this.defaultParameteringDep;
    }

    @objid ("27551038-daae-45da-a9cb-99cd02579e01")
    public SmDependency getRepresentsDep() {
        if (this.representsDep == null) {
        	this.representsDep = this.getDependencyDef("Represents");
        }
        return this.representsDep;
    }

    @objid ("d578e12c-18cc-48dc-9717-7fe13eaf82c2")
    public SmDependency getDocumentDep() {
        if (this.documentDep == null) {
        	this.documentDep = this.getDependencyDef("Document");
        }
        return this.documentDep;
    }

    @objid ("7957393e-f5a2-4d2d-bd71-8a912decf2b8")
    public SmDependency getTagDep() {
        if (this.tagDep == null) {
        	this.tagDep = this.getDependencyDef("Tag");
        }
        return this.tagDep;
    }

    @objid ("cded3b4e-5793-489f-a8ba-369bc344bcf9")
    public SmDependency getOwnerTemplateParameterDep() {
        if (this.ownerTemplateParameterDep == null) {
        	this.ownerTemplateParameterDep = this.getDependencyDef("OwnerTemplateParameter");
        }
        return this.ownerTemplateParameterDep;
    }

    @objid ("db6c42a7-cc4f-48fa-bad0-8cf7ed20bfd3")
    public SmDependency getImpactedDependencyDep() {
        if (this.impactedDependencyDep == null) {
        	this.impactedDependencyDep = this.getDependencyDef("ImpactedDependency");
        }
        return this.impactedDependencyDep;
    }

    @objid ("9bfcbddf-196c-41cf-ac17-9afb3897b215")
    public SmDependency getRepresentingEndDep() {
        if (this.representingEndDep == null) {
        	this.representingEndDep = this.getDependencyDef("RepresentingEnd");
        }
        return this.representingEndDep;
    }

    @objid ("2add74d0-089d-4d85-acb6-f3b04983fde2")
    public SmDependency getRepresentingPartitionDep() {
        if (this.representingPartitionDep == null) {
        	this.representingPartitionDep = this.getDependencyDef("RepresentingPartition");
        }
        return this.representingPartitionDep;
    }

    @objid ("e364cc3b-9069-4bd7-865a-bbb75be89130")
    public SmDependency getConstraintDefinitionDep() {
        if (this.constraintDefinitionDep == null) {
        	this.constraintDefinitionDep = this.getDependencyDef("ConstraintDefinition");
        }
        return this.constraintDefinitionDep;
    }

    @objid ("102d848d-cf02-4e44-af55-876b33d60446")
    public SmDependency getTypingParameterDep() {
        if (this.typingParameterDep == null) {
        	this.typingParameterDep = this.getDependencyDef("TypingParameter");
        }
        return this.typingParameterDep;
    }

    @objid ("5fb38b35-d1b3-4476-95f1-ab782a5458f9")
    public SmDependency getManifestingDep() {
        if (this.manifestingDep == null) {
        	this.manifestingDep = this.getDependencyDef("Manifesting");
        }
        return this.manifestingDep;
    }

    @objid ("a704d9cc-d7f2-45f9-b0ca-5ac5cb459e86")
    public SmDependency getPropertiesDep() {
        if (this.propertiesDep == null) {
        	this.propertiesDep = this.getDependencyDef("Properties");
        }
        return this.propertiesDep;
    }

    @objid ("2fa5c2bb-a266-403a-ab36-3f197e719c2e")
    public SmDependency getProductDep() {
        if (this.productDep == null) {
        	this.productDep = this.getDependencyDef("Product");
        }
        return this.productDep;
    }

    @objid ("91e565d4-f99d-416a-b5d4-6ce73d5c0682")
    public SmDependency getRepresentingInstanceDep() {
        if (this.representingInstanceDep == null) {
        	this.representingInstanceDep = this.getDependencyDef("RepresentingInstance");
        }
        return this.representingInstanceDep;
    }

    @objid ("b24cbffd-e404-4b7a-9573-d0fd168d2a54")
    public SmDependency getReceivedInfoDep() {
        if (this.receivedInfoDep == null) {
        	this.receivedInfoDep = this.getDependencyDef("ReceivedInfo");
        }
        return this.receivedInfoDep;
    }

    @objid ("f3cf900c-78be-41c8-bc5a-f3d70e4f21fd")
    public SmDependency getSentInfoDep() {
        if (this.sentInfoDep == null) {
        	this.sentInfoDep = this.getDependencyDef("SentInfo");
        }
        return this.sentInfoDep;
    }

    @objid ("af9d289e-63df-4e86-bb9d-55a0c8aa901f")
    public SmDependency getDescriptorDep() {
        if (this.descriptorDep == null) {
        	this.descriptorDep = this.getDependencyDef("Descriptor");
        }
        return this.descriptorDep;
    }

    @objid ("b31dd87b-6ff4-49bb-9722-c4b85cb21c1e")
    public SmDependency getRepresentingConnectorDep() {
        if (this.representingConnectorDep == null) {
        	this.representingConnectorDep = this.getDependencyDef("RepresentingConnector");
        }
        return this.representingConnectorDep;
    }

    @objid ("b02d3a3b-2e24-490e-b808-2b11eef4a669")
    public SmDependency getMatrixDep() {
        if (this.matrixDep == null) {
        	this.matrixDep = this.getDependencyDef("Matrix");
        }
        return this.matrixDep;
    }

    @objid ("036188cc-1e84-4a29-bfcd-e7254ed39e1f")
    private static class ModelElementObjectFactory implements ISmObjectFactory {
        @objid ("426f528d-49be-4530-9dfe-fb40eb70aced")
        private ModelElementSmClass smClass;

        @objid ("a7832acf-1978-42b1-a1c1-c7e4ff3b0ce5")
        public ModelElementObjectFactory(ModelElementSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("4ba9f550-424d-418d-bfc8-5cfc2e7b150b")
        @Override
        public ISmObjectData createData() {
            throw new UnsupportedOperationException();
        }

        @objid ("36a8bd91-5dc7-41c3-863e-86ad5886a8b8")
        @Override
        public SmObjectImpl createImpl() {
            throw new UnsupportedOperationException();
        }

    }

    @objid ("db1dbb84-71b6-4b53-a315-b5e06cfc5559")
    public static class NameSmAttribute extends SmAttribute {
        @objid ("c90e4976-63fc-4f81-b965-c7f36c43538e")
        public Object getValue(ISmObjectData data) {
            return ((ModelElementData) data).mName;
        }

        @objid ("aecee79c-064e-44fa-a9d6-48033135d0c9")
        public void setValue(ISmObjectData data, Object value) {
            ((ModelElementData) data).mName = value;
        }

    }

    @objid ("aff7cd94-3ad3-4069-b27a-cdbef2cac31e")
    public static class LocalPropertiesSmDependency extends SmSingleDependency {
        @objid ("fafecc9a-48b2-43f0-85ec-8a7798b6fc73")
        private SmDependency symetricDep;

        @objid ("c2ac6151-34d0-4fca-8e78-a20a2fc0ebb8")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ModelElementData) data).mLocalProperties;
        }

        @objid ("65e7b5be-ce48-4454-a28a-7f9f5e5f6a3c")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ModelElementData) data).mLocalProperties = value;
        }

        @objid ("3915053c-a201-49ad-ae5e-fc93722e8033")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((LocalPropertyTableSmClass)this.getTarget()).getLocalAnnotedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a7d379d9-f84c-4ba1-b9ef-f8a104b2a548")
    public static class TemplateSubstitutionSmDependency extends SmMultipleDependency {
        @objid ("5e30a532-8634-4dfd-ad05-c276f9805054")
        private SmDependency symetricDep;

        @objid ("5c5cc513-977e-403d-9a36-4faf4b10afdb")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mTemplateSubstitution != null)? ((ModelElementData)data).mTemplateSubstitution:SmMultipleDependency.EMPTY;
        }

        @objid ("7938bf00-6415-4fbd-8ea3-c79bb19981b4")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mTemplateSubstitution = values;
        }

        @objid ("f3175ebf-53d5-44da-92c5-1c60eaaf4d60")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TemplateParameterSubstitutionSmClass)this.getTarget()).getActualDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("60bcc3a1-9051-4a72-a6eb-c45591f0a6c0")
    public static class BpmnLaneRefsSmDependency extends SmMultipleDependency {
        @objid ("2bf33825-b026-4d95-a6e8-71c5d93ea57e")
        private SmDependency symetricDep;

        @objid ("6a88b65b-e485-45ad-9c18-82a909a48422")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mBpmnLaneRefs != null)? ((ModelElementData)data).mBpmnLaneRefs:SmMultipleDependency.EMPTY;
        }

        @objid ("2462283d-c7d2-438d-a465-6973da9f3ccb")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mBpmnLaneRefs = values;
        }

        @objid ("91fc223d-c165-4321-9ff7-ddbd4b31878b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnLaneSmClass)this.getTarget()).getPartitionElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c5e1de23-716c-494b-9973-0ecc205abb51")
    public static class ExtensionSmDependency extends SmMultipleDependency {
        @objid ("2869dbed-363b-48bc-86a7-607df5371dfd")
        private SmDependency symetricDep;

        @objid ("e84a2e9a-416e-44b6-86e9-e69cbee74a42")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mExtension != null)? ((ModelElementData)data).mExtension:SmMultipleDependency.EMPTY;
        }

        @objid ("0db9e046-2219-4fe6-bcf4-81be17145591")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mExtension = values;
        }

        @objid ("d37d57c8-3f98-45a0-8083-45322c9d328e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StereotypeSmClass)this.getTarget()).getExtendedElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0549ea9f-ab80-4025-85e0-552cf57f25b9")
    public static class DependsOnDependencySmDependency extends SmMultipleDependency {
        @objid ("da3c62ef-ae8f-448b-8c99-6f2def3829f0")
        private SmDependency symetricDep;

        @objid ("9a2c246e-20ff-40f5-846e-cad165f8ac66")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mDependsOnDependency != null)? ((ModelElementData)data).mDependsOnDependency:SmMultipleDependency.EMPTY;
        }

        @objid ("d1cf3080-2891-4c64-8fef-7b969498706e")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mDependsOnDependency = values;
        }

        @objid ("c10d70f9-7027-439a-b80d-902bec91e9b1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((DependencySmClass)this.getTarget()).getImpactedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0de8cc7b-3105-4fbe-8f29-b1811b5ce47b")
    public static class DefaultParameteringSmDependency extends SmMultipleDependency {
        @objid ("45286b93-7d0a-4bea-bbe8-720317552ccd")
        private SmDependency symetricDep;

        @objid ("6f08670e-6c11-4e60-a32f-6cd123fd9c68")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mDefaultParametering != null)? ((ModelElementData)data).mDefaultParametering:SmMultipleDependency.EMPTY;
        }

        @objid ("1af16555-f5dc-48f5-bc5f-ab55773b053a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mDefaultParametering = values;
        }

        @objid ("f5d6be16-ecca-42c2-b8a3-1812483db9e9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TemplateParameterSmClass)this.getTarget()).getDefaultTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("853cee40-eca9-4102-9e64-e3dcea08b9a4")
    public static class RepresentsSmDependency extends SmMultipleDependency {
        @objid ("cdc5d312-b843-4e7e-95f2-f0d411b67f40")
        private SmDependency symetricDep;

        @objid ("a67907d2-894f-4a08-bef6-22e39db92928")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mRepresents != null)? ((ModelElementData)data).mRepresents:SmMultipleDependency.EMPTY;
        }

        @objid ("52828fa2-7379-444a-8a80-c3f83b5896be")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mRepresents = values;
        }

        @objid ("ef6d2187-6363-4896-8b0f-90be97b8e7b3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BindingSmClass)this.getTarget()).getRepresentedFeatureDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7367ece7-fea4-4631-bcf4-c8d48e33b97c")
    public static class DocumentSmDependency extends SmMultipleDependency {
        @objid ("072045f8-320a-48c6-9786-70dea09ce618")
        private SmDependency symetricDep;

        @objid ("397e983c-abc0-44b2-a555-9ff002a1da86")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mDocument != null)? ((ModelElementData)data).mDocument:SmMultipleDependency.EMPTY;
        }

        @objid ("caeb12d6-5c22-4964-a99b-76336d6388b1")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mDocument = values;
        }

        @objid ("5e017f2b-0226-4d52-b550-0ef421a795b0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ExternDocumentSmClass)this.getTarget()).getSubjectDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b426ced1-6fcb-42bb-bd0f-655297ef2438")
    public static class TagSmDependency extends SmMultipleDependency {
        @objid ("a659c94d-e991-4cda-809d-3f90a3aa041e")
        private SmDependency symetricDep;

        @objid ("a5ce763e-afbe-49a0-8dc5-656855fc4804")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mTag != null)? ((ModelElementData)data).mTag:SmMultipleDependency.EMPTY;
        }

        @objid ("08346189-620f-4048-bf05-7121742f553a")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mTag = values;
        }

        @objid ("722322ab-ce7d-4c91-93dd-7becf8ab470e")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TaggedValueSmClass)this.getTarget()).getAnnotedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("fd65b809-16cf-4e31-84dc-24352fd95b82")
    public static class OwnerTemplateParameterSmDependency extends SmSingleDependency {
        @objid ("1141c5b8-c3ea-40c1-a0dc-e1f07183adad")
        private SmDependency symetricDep;

        @objid ("2a22ca44-c2f8-467f-8248-46d0ac20d060")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((ModelElementData) data).mOwnerTemplateParameter;
        }

        @objid ("b0d11f46-cbc5-4efa-972d-69f3a0f0f902")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((ModelElementData) data).mOwnerTemplateParameter = value;
        }

        @objid ("7f82178e-49a2-48eb-9cff-a5868e035490")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TemplateParameterSmClass)this.getTarget()).getOwnedParameterElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("92448dd7-774f-4b23-9b9c-8d37efc40f56")
    public static class ImpactedDependencySmDependency extends SmMultipleDependency {
        @objid ("869dce51-72b5-4f20-b039-db502103b132")
        private SmDependency symetricDep;

        @objid ("074c5850-2c8b-4599-8036-f45314fbd111")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mImpactedDependency != null)? ((ModelElementData)data).mImpactedDependency:SmMultipleDependency.EMPTY;
        }

        @objid ("1e233203-1fea-4440-a770-7646c3b4f612")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mImpactedDependency = values;
        }

        @objid ("81bc5e60-8ade-4d53-9f77-6cefe6aa2c37")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((DependencySmClass)this.getTarget()).getDependsOnDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("2b4205bb-b013-4572-b80f-36f3bc636b60")
    public static class RepresentingEndSmDependency extends SmMultipleDependency {
        @objid ("81c5c15a-e72d-4c98-b73d-ab22769b2d2f")
        private SmDependency symetricDep;

        @objid ("e56fb64d-02b7-4f69-9d5b-63455bd540f6")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mRepresentingEnd != null)? ((ModelElementData)data).mRepresentingEnd:SmMultipleDependency.EMPTY;
        }

        @objid ("b1ee4aaf-cecf-4b79-8226-453e1fa6ab3b")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mRepresentingEnd = values;
        }

        @objid ("80a552b8-36c0-4b7e-9489-7ccae152a38d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ConnectorEndSmClass)this.getTarget()).getRepresentedFeatureDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a6bd61af-bf64-43c9-87c8-aa531ea3e14f")
    public static class RepresentingPartitionSmDependency extends SmMultipleDependency {
        @objid ("8b7233c2-5eab-49bb-8f55-f4a397d2a8d0")
        private SmDependency symetricDep;

        @objid ("eeae1745-745d-4538-a97b-819822ec2ebd")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mRepresentingPartition != null)? ((ModelElementData)data).mRepresentingPartition:SmMultipleDependency.EMPTY;
        }

        @objid ("d7b888c1-9570-4432-90e0-b5242d8e0c34")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mRepresentingPartition = values;
        }

        @objid ("760d3a79-4aac-41d6-8460-c8afab86842a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ActivityPartitionSmClass)this.getTarget()).getRepresentedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("99d6e950-f9b0-4c07-9c2d-5ad2568a22fa")
    public static class ConstraintDefinitionSmDependency extends SmMultipleDependency {
        @objid ("4947e978-008e-4fa2-8881-471d8bd79f20")
        private SmDependency symetricDep;

        @objid ("67691295-d1f2-4945-95f4-f2b3aa920f13")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mConstraintDefinition != null)? ((ModelElementData)data).mConstraintDefinition:SmMultipleDependency.EMPTY;
        }

        @objid ("d802975e-295c-4afe-b099-ff2985dfed46")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mConstraintDefinition = values;
        }

        @objid ("de9a1345-013e-4f50-8ba2-053188dded78")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ConstraintSmClass)this.getTarget()).getConstrainedElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("fadf3cbe-eb9b-4ec5-831f-ada4b8d9a1ef")
    public static class TypingParameterSmDependency extends SmMultipleDependency {
        @objid ("41899932-ad82-495b-bff3-645d03bda42c")
        private SmDependency symetricDep;

        @objid ("9d4701e7-3a17-4dc7-9eaf-eca1e6d27a02")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mTypingParameter != null)? ((ModelElementData)data).mTypingParameter:SmMultipleDependency.EMPTY;
        }

        @objid ("cbeb48e5-d309-4517-af10-36d888f1c83c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mTypingParameter = values;
        }

        @objid ("b1ba748b-bdf6-4876-8537-4d70fd878841")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TemplateParameterSmClass)this.getTarget()).getTypeDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("907ee8d5-7b6c-415b-819d-692432032b36")
    public static class ManifestingSmDependency extends SmMultipleDependency {
        @objid ("777e1e0f-6168-49fd-a7bd-9af291f5c666")
        private SmDependency symetricDep;

        @objid ("7885f266-2f85-44bc-b4bb-b13580c9517d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mManifesting != null)? ((ModelElementData)data).mManifesting:SmMultipleDependency.EMPTY;
        }

        @objid ("c56752cc-a521-4e35-af80-a9f3a6350024")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mManifesting = values;
        }

        @objid ("788e47a0-0f34-4639-99c1-d983a13aa435")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ManifestationSmClass)this.getTarget()).getUtilizedElementDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c4ca3456-a463-4871-8710-73fbcb21cec9")
    public static class PropertiesSmDependency extends SmMultipleDependency {
        @objid ("192295fe-a938-4cb9-9bea-291ace952816")
        private SmDependency symetricDep;

        @objid ("e1c20661-568e-4d84-aa4b-6bc82a65859e")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mProperties != null)? ((ModelElementData)data).mProperties:SmMultipleDependency.EMPTY;
        }

        @objid ("83f99536-dafa-4c4e-a38b-331c33f4b154")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mProperties = values;
        }

        @objid ("23a8861c-cef1-4ede-b6b1-f7523bafe2a3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyTableSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c55efd9c-2c63-43da-88e4-dd37f6f8e558")
    public static class ProductSmDependency extends SmMultipleDependency {
        @objid ("9d3f8176-d485-481f-ac4c-6cedf3c51058")
        private SmDependency symetricDep;

        @objid ("5ff16668-34e2-4bf2-886c-7b5be1de8ab4")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mProduct != null)? ((ModelElementData)data).mProduct:SmMultipleDependency.EMPTY;
        }

        @objid ("6fb5a943-c3ea-4c3e-822c-190512310510")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mProduct = values;
        }

        @objid ("2d3c0d73-12c8-451c-82cc-1934acb15b5a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AbstractDiagramSmClass)this.getTarget()).getOriginDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b7f4ad0e-8872-4915-825f-383f6da29160")
    public static class RepresentingInstanceSmDependency extends SmMultipleDependency {
        @objid ("4079dca0-eff5-40aa-982d-96e85ee21dfc")
        private SmDependency symetricDep;

        @objid ("db755d38-7d66-4508-abf6-0c339e6a43cd")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mRepresentingInstance != null)? ((ModelElementData)data).mRepresentingInstance:SmMultipleDependency.EMPTY;
        }

        @objid ("5af3ed54-f2d0-4491-ac09-6728084eda18")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mRepresentingInstance = values;
        }

        @objid ("82fe2d7a-cde2-4823-b8f4-76b1add0ba30")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BindableInstanceSmClass)this.getTarget()).getRepresentedFeatureDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6c4d8988-88c1-4596-b200-7ad9759492d9")
    public static class ReceivedInfoSmDependency extends SmMultipleDependency {
        @objid ("24172564-5359-4512-92e2-3b620c67620e")
        private SmDependency symetricDep;

        @objid ("8759b1f4-99ee-492f-a1a5-f7469068b8cb")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mReceivedInfo != null)? ((ModelElementData)data).mReceivedInfo:SmMultipleDependency.EMPTY;
        }

        @objid ("b640cbe6-c757-46b5-9d10-a10392ba79f0")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mReceivedInfo = values;
        }

        @objid ("87cffa93-bc79-469f-b4b9-4e0cdee3a5cb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InformationFlowSmClass)this.getTarget()).getInformationTargetDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0d9fb751-cf05-4e0a-a7bb-6d85338bb972")
    public static class SentInfoSmDependency extends SmMultipleDependency {
        @objid ("baa184ed-7cae-4507-9ae0-333c4c0ddc8e")
        private SmDependency symetricDep;

        @objid ("5fbd0c25-aaec-4f56-b506-13e7aaf361ea")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mSentInfo != null)? ((ModelElementData)data).mSentInfo:SmMultipleDependency.EMPTY;
        }

        @objid ("adbe5a3e-b986-46ad-a20e-c1b7691ba027")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mSentInfo = values;
        }

        @objid ("53f386fe-8fae-4ac0-a764-dbece378dea1")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((InformationFlowSmClass)this.getTarget()).getInformationSourceDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0b436365-330b-4d05-af04-36d9544b7549")
    public static class DescriptorSmDependency extends SmMultipleDependency {
        @objid ("7adba21f-2a88-4dcc-91c2-52d0d6c9bc39")
        private SmDependency symetricDep;

        @objid ("d7973f60-ad31-4b51-9112-f14aeb4ef988")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mDescriptor != null)? ((ModelElementData)data).mDescriptor:SmMultipleDependency.EMPTY;
        }

        @objid ("257de022-ea6f-4536-b498-53fe802cf08c")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mDescriptor = values;
        }

        @objid ("762ac555-987d-4579-a51d-369d136dfc4f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NoteSmClass)this.getTarget()).getSubjectDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5f82cdf7-9518-4818-a251-d2ff43d678ba")
    public static class RepresentingConnectorSmDependency extends SmMultipleDependency {
        @objid ("59e52cc7-a936-49bb-bf11-aa446268adac")
        private SmDependency symetricDep;

        @objid ("c081b9a2-d9cd-458b-88d3-958566f0eb4f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mRepresentingConnector != null)? ((ModelElementData)data).mRepresentingConnector:SmMultipleDependency.EMPTY;
        }

        @objid ("793505d5-d136-486a-bddd-b0c32a97dbb8")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mRepresentingConnector = values;
        }

        @objid ("b991d05f-83d5-4afa-94c8-5578d5396939")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((NaryConnectorSmClass)this.getTarget()).getRepresentedFeatureDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("60e9fd0f-82ff-4167-b541-949deb07d0a5")
    public static class MatrixSmDependency extends SmMultipleDependency {
        @objid ("01cb87cd-2777-44bb-80a2-a6696e3244d3")
        private SmDependency symetricDep;

        @objid ("fe6dbc2c-8ee6-4e2b-b979-d76e19200b27")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModelElementData)data).mMatrix != null)? ((ModelElementData)data).mMatrix:SmMultipleDependency.EMPTY;
        }

        @objid ("2b869bb3-3158-41d7-9d07-084b3cd8d706")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModelElementData) data).mMatrix = values;
        }

        @objid ("4106fcb9-b075-4035-9034-816123e5dcae")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MatrixDefinitionSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

}
