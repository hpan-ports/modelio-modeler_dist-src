/*
 * Copyright 2013 Modeliosoft
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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.impl.uml.infrastructure;

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.factory.ModelFactory;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.LocalPropertyTable;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.NaryConnector;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0088a34c-c4be-1fd8-97fe-001ec947cd2a")
public abstract class ModelElementImpl extends ElementImpl implements ModelElement {
    /**
     * {@inheritDoc}
     */
    @objid ("97ee8995-d803-11e1-b25c-001ec947ccaf")
    @Override
    public final boolean isStereotyped(String moduleName, String stereotypeName) {
        if (stereotypeName == null || moduleName == null) {
            throw new IllegalArgumentException("isStereotyped(): Parameters cannot be null");
        }
        
        for (Stereotype s : getExtension()) {
            if (inheritsFrom(s, stereotypeName)) {
                if (moduleName.equals(s.getModule().getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    @objid ("80f3dc16-cdd8-48b6-90e7-0a9e55768ac2")
    @Override
    public final void addStereotype(String moduleName, String stereotypeName) throws ExtensionNotFoundException {
        IModelFactory factory = ModelFactory.getFactory(this);
        
        List<Stereotype> stereotypes = factory.findStereotype(moduleName, stereotypeName, getMClass());
        if (stereotypes.size() == 0) {
            throw new ExtensionNotFoundException("'" + stereotypeName + "' stereotype not found");
        } else if (stereotypes.size() == 1) {
            EList<Stereotype> existingStereotypes = getExtension();
            if (!existingStereotypes.contains(stereotypes.get(0)))
                existingStereotypes.add(stereotypes.get(0));
        } else {
            throw new InvalidParameterException("'" + stereotypeName + "' stereotype is not unique in module '" + moduleName + "'");
        }
    }

    /**
     * {@inheritDoc}
     */
    @objid ("dbd8e19d-f363-4e05-9c12-87254ac70f24")
    @Override
    public void removeStereotypes(String moduleName, String stereotypeName) {
        List<Stereotype> toRemove = new ArrayList<>();
        
        for (Stereotype stereotype : getExtension()) {
            if (stereotype.getName().equals(stereotypeName)) {
                if (moduleName.equals(stereotype.getModule().getName())) {
                    toRemove.add(stereotype);
                }
            }
        }
        
        getExtension().removeAll(toRemove);
    }

    /**
     * {@inheritDoc}
     */
    @objid ("97f0ecc2-d803-11e1-b25c-001ec947ccaf")
    @Override
    public final boolean isTagged(String moduleName, String tagTypeName) {
        for (TaggedValue tag : getTag()) {
            TagType tagType = tag.getDefinition();
            if (tagType != null && tagType.getName().equals(tagTypeName)) {
                if (moduleName.equals(tagType.getModule().getName())) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("97ee8976-d803-11e1-b25c-001ec947ccaf")
    @Override
    public final TaggedValue getTag(String moduleName, String tagTypeName) {
        for (TaggedValue tag : getTag()) {
            TagType tagType = tag.getDefinition();
            if (tagType != null && tagType.getName().equals(tagTypeName)) {
                if (moduleName.equals(tagType.getModule().getName())) {
                    return tag;
                }
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("97ee897e-d803-11e1-b25c-001ec947ccaf")
    @Override
    public final String getTagValue(String moduleName, String tagTypeName) {
        TaggedValue tag = getTag(moduleName, tagTypeName);
        if (tag == null) {
            return null;
        }
        List<TagParameter> tagParameters = tag.getActual();
        return tagParameters.isEmpty() ? null : tagParameters.get(0).getValue();
    }

    /**
     * {@inheritDoc}
     */
    @objid ("97ee8989-d803-11e1-b25c-001ec947ccaf")
    @Override
    public final List<String> getTagValues(String moduleName, String tagTypeName) {
        TaggedValue tag = getTag(moduleName, tagTypeName);
        if (tag == null) {
            return null;
        }
        List<TagParameter> tagParameters = tag.getActual();
        List<String> parameters = new ArrayList<>(tagParameters.size());
        for (TagParameter parameter : tagParameters) {
            parameters.add(parameter.getValue());
        }
        return parameters;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("ce50811d-dbfa-4cea-9586-7f014f1fadd4")
    @Override
    public void putTagValue(String moduleName, String tagTypeName, String value) throws ExtensionNotFoundException {
        TaggedValue tag = getTag(moduleName, tagTypeName);
        
        if (value == null) {
            // Delete the tag if no more value
            if (tag != null)
                tag.delete();
            return;
        }
        
        IModelFactory factory = ModelFactory.getFactory(this);
        
        // Create the tag if not present
        if (tag == null) {
            tag = factory.createTaggedValue(moduleName, tagTypeName, this);
        }
        
        final List<TagParameter> oldParameters = tag.getActual();
        int cpt = 0;
        
        // Replace existing parameter values and delete spare ones
        for (int i = 0; i < oldParameters.size() && i < 1; i++) {
            oldParameters.get(i).setValue(value);
            cpt++;
        }
        
        // Delete spare parameter
        while (oldParameters.size() > 1) {
            oldParameters.get(oldParameters.size() - 1).delete();
        }
        
        // Add missing parameter
        if (cpt < 1) {
            factory.createTagParameter(value, tag);
        }
    }

    /**
     * {@inheritDoc}
     */
    @objid ("fb629575-89cc-4917-9950-111a2836ed6b")
    @Override
    public void putTagValues(String moduleName, String tagTypeName, List<String> values) throws ExtensionNotFoundException {
        TaggedValue tag = getTag(moduleName, tagTypeName);
        
        if (values == null || values.isEmpty()) {
            // Delete the tag if no more value
            if (tag != null)
                tag.delete();
            return;
        }
        
        IModelFactory factory = ModelFactory.getFactory(this);
        
        // Create tag if not present
        if (tag == null) {
            tag = factory.createTaggedValue(moduleName, tagTypeName, this);
        }
        
        // Set the tag parameters values, merging existing values and new values
        final int newSize = values.size();
        final List<TagParameter> oldParameters = tag.getActual();
        int cpt = 0;
        
        // Replace existing parameter values and delete spare ones
        for (int i = 0; i < oldParameters.size() && i < newSize; i++) {
            oldParameters.get(i).setValue(values.get(i));
            cpt++;
        }
        
        // Delete spare parameter
        while (oldParameters.size() > newSize) {
            oldParameters.get(oldParameters.size() - 1).delete();
        }
        
        // Add missing parameters
        while (cpt < newSize) {
            factory.createTagParameter(values.get(cpt), tag);
            cpt++;
        }
    }

    @objid ("fe9fdc86-7c1f-402a-a53d-bbce0f8e6d4b")
    @Override
    public void removeTags(String moduleName, String tagTypeName) {
        List<TaggedValue> toRemove = new ArrayList<>();
        
        for (TaggedValue tag : getTag()) {
            TagType tagType = tag.getDefinition();
            if (tagType != null && tagType.getName().equals(tagTypeName)) {
                if (moduleName.equals(tagType.getModule().getName())) {
                    toRemove.add(tag);
                }
            }
        }
        
        for (TaggedValue tag : toRemove) {
            tag.delete();
        }
    }

    /**
     * {@inheritDoc}
     */
    @objid ("97ee8964-d803-11e1-b25c-001ec947ccaf")
    @Override
    public final Note getNote(String moduleName, String noteTypeName) {
        for (Note note : this.getDescriptor()) {
            final NoteType model = note.getModel();
            if (model != null && model.getName().contentEquals(noteTypeName)) {
                if (moduleName.equals(model.getModule().getName())) {
                    return note;
                }
            }
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("97ee896c-d803-11e1-b25c-001ec947ccaf")
    @Override
    public final String getNoteContent(String moduleName, String noteTypeName) {
        Note note = getNote(moduleName, noteTypeName);
        return (note != null) ? note.getContent() : null;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("7abfeac2-e619-4405-9895-b83d3b8c818f")
    @Override
    public void putNoteContent(String moduleName, String noteTypeName, String content) throws ExtensionNotFoundException {
        Note theNote = getNote(moduleName, noteTypeName);
        
        if (theNote == null) {
            // No such note on element, the factory creates it if there is only
            // one matching
            // type
            IModelFactory factory = ModelFactory.getFactory(this);
            factory.createNote(moduleName, noteTypeName, this, content);
        } else {
            theNote.setContent(content);
        }
    }

    /**
     * {@inheritDoc}
     */
    @objid ("7cb75488-166c-4c68-99b1-b4c847647aa6")
    @Override
    public void removeNotes(String moduleName, String noteTypeName) {
        List<Note> toRemove = new ArrayList<>();
        for (Note note : getDescriptor()) {
            NoteType model = note.getModel();
            if (model != null && model.getName().equals(noteTypeName)) {
                if (moduleName.equals(model.getModule().getName())) {
                    toRemove.add(note);
                }
            }
        }
        for (Note note : toRemove) {
            note.delete();
        }
    }

    /**
     * {@inheritDoc}
     */
    @objid ("aedcff9b-2830-11e2-bf07-001ec947ccaf")
    @Override
    public final PropertyTable getProperties(String name) {
        for (PropertyTable t : getProperties()) {
            if (t.getName().equals(name))
                return t;
        }
        return null;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("aedcffa1-2830-11e2-bf07-001ec947ccaf")
    @Override
    public final String getProperty(String tableName, String key) {
        PropertyTable props = getProperties(tableName);
        if (props == null)
            return null;
        else
            return props.getProperty(key);
    }

    /**
     * Answer to the question: is 'stereotype' a child of the stereotype named
     * by 'stereotypeName' Companion method of the public isStereoyped() method
     * @param stereotype a stereotype
     * @param stereotypeName the name of another stereotype.
     * @return <code>true</code> if 'stereotype' a child of the stereotype named
     * by 'stereotypeName' else <code>false</code>.
     */
    @objid ("2bb117ce-82e7-424a-9352-c37a231c95c5")
    private static boolean inheritsFrom(Stereotype stereotype, String stereotypeName) {
        if (stereotype.getName().equals(stereotypeName)) {
            return true;
        }
        
        if (stereotype.getParent() != null) {
            if (inheritsFrom(stereotype.getParent(), stereotypeName)) {
                return true;
            }
        }
        return false;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("0ca61d4e-418c-443f-be4b-e7c66435aba9")
    @Override
    public final String getLocalProperty(String key) {
        LocalPropertyTable table = getLocalProperties();
        return (table != null) ? table.getProperty(key) : null;
    }

    /**
     * {@inheritDoc}
     */
    @objid ("c1843b5a-2198-47a6-9bf5-79d3435cadc5")
    @Override
    public void setLocalProperty(String key, String value) {
        LocalPropertyTable table = getLocalProperties();
        if (table == null) {
            IModelFactory factory = ModelFactory.getFactory(this);
            table = factory.createLocalPropertyTable();
            table.setLocalAnnoted(this);
        }
        table.setProperty(key, value);
    }

    @objid ("bcf68592-d993-489a-bdf6-4ebfc3df4387")
    @Override
    public String getName() {
        return (String) getAttVal(ModelElementData.Metadata.NameAtt());
    }

    @objid ("9ecd8c14-0a88-42d5-873a-ec30540b5bd7")
    @Override
    public void setName(String value) {
        setAttVal(ModelElementData.Metadata.NameAtt(), value);
    }

    @objid ("51014142-e808-464e-800e-49c4a46b3bb4")
    @Override
    public LocalPropertyTable getLocalProperties() {
        return (LocalPropertyTable) getDepVal(ModelElementData.Metadata.LocalPropertiesDep());
    }

    @objid ("d9c97259-726a-49c1-b3cf-9ea6d9297050")
    @Override
    public void setLocalProperties(LocalPropertyTable value) {
        appendDepVal(ModelElementData.Metadata.LocalPropertiesDep(), (SmObjectImpl)value);
    }

    @objid ("bdd5a65e-5bae-4363-beae-57c086b82096")
    @Override
    public EList<TemplateParameterSubstitution> getTemplateSubstitution() {
        return new SmList<>(this, ModelElementData.Metadata.TemplateSubstitutionDep());
    }

    @objid ("e2c6c954-b444-4791-b57d-bfc59821dc61")
    @Override
    public <T extends TemplateParameterSubstitution> List<T> getTemplateSubstitution(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateParameterSubstitution element : getTemplateSubstitution()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("965a2c83-a3fb-41e1-a093-90ef0c335868")
    @Override
    public EList<BpmnLane> getBpmnLaneRefs() {
        return new SmList<>(this, ModelElementData.Metadata.BpmnLaneRefsDep());
    }

    @objid ("088e6b7c-3b0b-47ba-898d-c31e01021751")
    @Override
    public <T extends BpmnLane> List<T> getBpmnLaneRefs(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnLane element : getBpmnLaneRefs()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b25977cf-8a39-4c78-a351-aae15c7ab03a")
    @Override
    public EList<Stereotype> getExtension() {
        return new SmList<>(this, ModelElementData.Metadata.ExtensionDep());
    }

    @objid ("03a4815e-7e71-4977-a77b-2170939331f0")
    @Override
    public <T extends Stereotype> List<T> getExtension(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Stereotype element : getExtension()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ca6e1428-1fad-47c0-ba44-7c6902b921a0")
    @Override
    public EList<Dependency> getDependsOnDependency() {
        return new SmList<>(this, ModelElementData.Metadata.DependsOnDependencyDep());
    }

    @objid ("95bfda9d-126b-49fe-bbf0-ded0acb3f4d3")
    @Override
    public <T extends Dependency> List<T> getDependsOnDependency(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Dependency element : getDependsOnDependency()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2af66730-ea38-4e81-8a76-ba3aadb21fb8")
    @Override
    public EList<TemplateParameter> getDefaultParametering() {
        return new SmList<>(this, ModelElementData.Metadata.DefaultParameteringDep());
    }

    @objid ("71662317-f683-4c88-b96c-e14b7216c62f")
    @Override
    public <T extends TemplateParameter> List<T> getDefaultParametering(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateParameter element : getDefaultParametering()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("22283bbe-fb06-446d-aeae-995033bca4f7")
    @Override
    public EList<Binding> getRepresents() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentsDep());
    }

    @objid ("e9630bc3-2629-4457-b1a0-c35d0c47bd3d")
    @Override
    public <T extends Binding> List<T> getRepresents(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Binding element : getRepresents()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("59a5503f-ad00-4e24-a00d-1dfe820396b9")
    @Override
    public EList<ExternDocument> getDocument() {
        return new SmList<>(this, ModelElementData.Metadata.DocumentDep());
    }

    @objid ("90d50433-5db9-4ed4-be5c-072a0825d622")
    @Override
    public <T extends ExternDocument> List<T> getDocument(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExternDocument element : getDocument()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4f23c38f-5d28-45a4-83de-b580fed9237b")
    @Override
    public EList<TaggedValue> getTag() {
        return new SmList<>(this, ModelElementData.Metadata.TagDep());
    }

    @objid ("8f47104d-088c-4b00-8ecd-8ed47925cada")
    @Override
    public <T extends TaggedValue> List<T> getTag(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TaggedValue element : getTag()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f2179821-1082-45d8-9084-34421bbd8712")
    @Override
    public TemplateParameter getOwnerTemplateParameter() {
        return (TemplateParameter) getDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep());
    }

    @objid ("e65e025b-8c50-4777-9fc5-388fa665f9c5")
    @Override
    public void setOwnerTemplateParameter(TemplateParameter value) {
        appendDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep(), (SmObjectImpl)value);
    }

    @objid ("a7a94312-a56f-4f0f-b1f1-7c8b5840a9be")
    @Override
    public EList<Dependency> getImpactedDependency() {
        return new SmList<>(this, ModelElementData.Metadata.ImpactedDependencyDep());
    }

    @objid ("8b37d47b-06c2-423c-89c9-89788ebf9be6")
    @Override
    public <T extends Dependency> List<T> getImpactedDependency(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Dependency element : getImpactedDependency()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5189b767-0137-4635-b67f-2b714ad0303c")
    @Override
    public EList<ConnectorEnd> getRepresentingEnd() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingEndDep());
    }

    @objid ("0bf1f749-f0a4-47f8-bc74-1fdca5c5594f")
    @Override
    public <T extends ConnectorEnd> List<T> getRepresentingEnd(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ConnectorEnd element : getRepresentingEnd()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("63749298-9ffb-48eb-9c0d-0c730073813b")
    @Override
    public EList<ActivityPartition> getRepresentingPartition() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingPartitionDep());
    }

    @objid ("fd1d3fc0-5117-4b97-813b-c08ee9c18f25")
    @Override
    public <T extends ActivityPartition> List<T> getRepresentingPartition(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ActivityPartition element : getRepresentingPartition()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0201bf04-6ea0-412d-b90c-4d26cee90133")
    @Override
    public EList<Constraint> getConstraintDefinition() {
        return new SmList<>(this, ModelElementData.Metadata.ConstraintDefinitionDep());
    }

    @objid ("6edc4ecd-3693-408f-a9cf-9a849ac46f2f")
    @Override
    public <T extends Constraint> List<T> getConstraintDefinition(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Constraint element : getConstraintDefinition()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a8019bda-23a5-4bb4-9b0a-113d10fd81c0")
    @Override
    public EList<TemplateParameter> getTypingParameter() {
        return new SmList<>(this, ModelElementData.Metadata.TypingParameterDep());
    }

    @objid ("d319d043-dc89-4a88-a5cb-9b748904232f")
    @Override
    public <T extends TemplateParameter> List<T> getTypingParameter(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateParameter element : getTypingParameter()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ba71e224-d058-4751-ab87-65ba579ec481")
    @Override
    public EList<Manifestation> getManifesting() {
        return new SmList<>(this, ModelElementData.Metadata.ManifestingDep());
    }

    @objid ("c0b81d36-0329-4cf6-a4c4-48efa1ab67fa")
    @Override
    public <T extends Manifestation> List<T> getManifesting(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Manifestation element : getManifesting()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5d40ded9-4b70-4671-8be3-958f9b3e50b8")
    @Override
    public EList<PropertyTable> getProperties() {
        return new SmList<>(this, ModelElementData.Metadata.PropertiesDep());
    }

    @objid ("4b868723-c0f5-447f-9bde-b40a28e91bfb")
    @Override
    public <T extends PropertyTable> List<T> getProperties(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PropertyTable element : getProperties()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("afd0b2dd-81fe-4157-9353-50cac7b8b1d5")
    @Override
    public EList<AbstractDiagram> getProduct() {
        return new SmList<>(this, ModelElementData.Metadata.ProductDep());
    }

    @objid ("7b5e8e46-6399-461f-89ef-6287387bdc99")
    @Override
    public <T extends AbstractDiagram> List<T> getProduct(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AbstractDiagram element : getProduct()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8baae4d5-4ce0-41cd-9298-21cc34ea359c")
    @Override
    public EList<BindableInstance> getRepresentingInstance() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingInstanceDep());
    }

    @objid ("359487b2-1e29-425d-a985-db95d6de17cc")
    @Override
    public <T extends BindableInstance> List<T> getRepresentingInstance(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BindableInstance element : getRepresentingInstance()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d0dbe33f-1319-4e02-b5bb-38faaede4ade")
    @Override
    public EList<InformationFlow> getReceivedInfo() {
        return new SmList<>(this, ModelElementData.Metadata.ReceivedInfoDep());
    }

    @objid ("a3492165-9d46-4d2a-97bb-59323c60f90d")
    @Override
    public <T extends InformationFlow> List<T> getReceivedInfo(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getReceivedInfo()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9eb212ae-6907-416e-904c-cc9e482ced8e")
    @Override
    public EList<InformationFlow> getSentInfo() {
        return new SmList<>(this, ModelElementData.Metadata.SentInfoDep());
    }

    @objid ("7cb005c1-a9b7-4c8b-af4f-922348f56d40")
    @Override
    public <T extends InformationFlow> List<T> getSentInfo(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InformationFlow element : getSentInfo()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("33642f64-0b6e-4f5a-bb8b-6b2ed2933f70")
    @Override
    public EList<Note> getDescriptor() {
        return new SmList<>(this, ModelElementData.Metadata.DescriptorDep());
    }

    @objid ("2db7281d-2c06-4ccd-b2a7-45fa33b71c4f")
    @Override
    public <T extends Note> List<T> getDescriptor(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Note element : getDescriptor()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b176fb1f-95b4-4bfe-b6da-a4fea34fb276")
    @Override
    public EList<NaryConnector> getRepresentingConnector() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingConnectorDep());
    }

    @objid ("af2bba52-2e8e-4f8d-a24e-1c2d3360b6d3")
    @Override
    public <T extends NaryConnector> List<T> getRepresentingConnector(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryConnector element : getRepresentingConnector()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("32041b85-78e0-42ab-a07a-f8fd5ceeb741")
    @Override
    public EList<MatrixDefinition> getMatrix() {
        return new SmList<>(this, ModelElementData.Metadata.MatrixDep());
    }

    @objid ("2f4b2030-1ee2-4855-996a-ca051bb4da46")
    @Override
    public <T extends MatrixDefinition> List<T> getMatrix(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final MatrixDefinition element : getMatrix()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f788b90b-74db-4756-adcf-609bca11baf8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("64a4832e-9242-4188-9933-136673164ee3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep());
        if (obj != null)
          return new SmDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("e025ffbd-c893-464f-97a6-075dfb84b02e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModelElement(this);
        else
          return null;
    }

}
