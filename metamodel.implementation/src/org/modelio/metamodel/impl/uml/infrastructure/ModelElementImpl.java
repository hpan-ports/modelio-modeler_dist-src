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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.impl.uml.infrastructure;

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
import org.modelio.metamodel.uml.infrastructure.LocalNote;
import org.modelio.metamodel.uml.infrastructure.LocalTaggedValue;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
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

    @objid ("0a6aa37d-115e-4930-9ec8-bc25a62b95e5")
    @Override
    public String getName() {
        return (String) getAttVal(ModelElementData.Metadata.NameAtt());
    }

    @objid ("ec6bf6fb-4234-41c2-a5c1-d153911aa86f")
    @Override
    public void setName(String value) {
        setAttVal(ModelElementData.Metadata.NameAtt(), value);
    }

    @objid ("5b09fcf6-869d-45af-a90f-72fc6eaec73e")
    @Override
    public LocalPropertyTable getLocalProperties() {
        return (LocalPropertyTable) getDepVal(ModelElementData.Metadata.LocalPropertiesDep());
    }

    @objid ("e60bebdf-a537-43a2-836c-596ec3f85e2b")
    @Override
    public void setLocalProperties(LocalPropertyTable value) {
        appendDepVal(ModelElementData.Metadata.LocalPropertiesDep(), (SmObjectImpl)value);
    }

    @objid ("df73903f-efa4-42dc-a046-a7ca702d74fd")
    @Override
    public EList<TemplateParameterSubstitution> getTemplateSubstitution() {
        return new SmList<>(this, ModelElementData.Metadata.TemplateSubstitutionDep());
    }

    @objid ("1009f5f7-8eaa-4226-8839-d7629b64c1b1")
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

    @objid ("7b1f4c55-7853-486e-a426-b3aaa72bda1b")
    @Override
    public EList<BpmnLane> getBpmnLaneRefs() {
        return new SmList<>(this, ModelElementData.Metadata.BpmnLaneRefsDep());
    }

    @objid ("142f4c4f-e431-4adb-9c3e-ec5718b2645c")
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

    @objid ("1cdfe6a4-a88e-4ec8-8682-6243d8988338")
    @Override
    public EList<Stereotype> getExtension() {
        return new SmList<>(this, ModelElementData.Metadata.ExtensionDep());
    }

    @objid ("b5223de9-1dcc-4279-8783-7c7adf18e0ec")
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

    @objid ("673de07a-5d30-4871-8991-4fbbc637c317")
    @Override
    public EList<LocalTaggedValue> getLocalTag() {
        return new SmList<>(this, ModelElementData.Metadata.LocalTagDep());
    }

    @objid ("94724fb7-e8c9-4b38-a92b-061b5133e6c8")
    @Override
    public <T extends LocalTaggedValue> List<T> getLocalTag(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LocalTaggedValue element : getLocalTag()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cb05e798-3527-4fc2-9160-42a78f1adfa9")
    @Override
    public EList<Dependency> getDependsOnDependency() {
        return new SmList<>(this, ModelElementData.Metadata.DependsOnDependencyDep());
    }

    @objid ("77de5dc2-fd4b-4400-b99d-a2abefac0b0a")
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

    @objid ("43b03696-8d46-4dce-876c-4afdebab77bc")
    @Override
    public EList<TemplateParameter> getDefaultParametering() {
        return new SmList<>(this, ModelElementData.Metadata.DefaultParameteringDep());
    }

    @objid ("9979ee2d-fbd0-44c8-b4a0-ecbdd9b4515d")
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

    @objid ("56f0f9ea-a0a6-464e-bd2f-1b7bb3d33f31")
    @Override
    public EList<Binding> getRepresents() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentsDep());
    }

    @objid ("ff7aeb27-ff45-4f00-abc7-7044ff73e893")
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

    @objid ("b54e8225-4f1a-4d08-aad2-50fa9c9971d7")
    @Override
    public EList<ExternDocument> getDocument() {
        return new SmList<>(this, ModelElementData.Metadata.DocumentDep());
    }

    @objid ("81335aee-8fbb-49a3-967a-424eeba38af4")
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

    @objid ("1b8ef39b-8297-4a44-9750-7dba7760f662")
    @Override
    public EList<TaggedValue> getTag() {
        return new SmList<>(this, ModelElementData.Metadata.TagDep());
    }

    @objid ("a5a62bec-32a5-4bfb-9338-4f5122965bc2")
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

    @objid ("13eb8985-cdfe-4b66-ab12-cb1e4888e8fa")
    @Override
    public TemplateParameter getOwnerTemplateParameter() {
        return (TemplateParameter) getDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep());
    }

    @objid ("bd2a33ef-b2bb-4c43-80b1-fbbc7ba2231a")
    @Override
    public void setOwnerTemplateParameter(TemplateParameter value) {
        appendDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep(), (SmObjectImpl)value);
    }

    @objid ("14124ee8-9346-4c2f-922e-435335192127")
    @Override
    public EList<LocalNote> getLocalDescriptor() {
        return new SmList<>(this, ModelElementData.Metadata.LocalDescriptorDep());
    }

    @objid ("bdddb298-316e-42dc-add9-1cec7c8e99b6")
    @Override
    public <T extends LocalNote> List<T> getLocalDescriptor(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LocalNote element : getLocalDescriptor()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9c2b587d-bda8-4df6-b00c-496d89113ef4")
    @Override
    public EList<Dependency> getImpactedDependency() {
        return new SmList<>(this, ModelElementData.Metadata.ImpactedDependencyDep());
    }

    @objid ("21103e64-3ccd-42d2-ba61-300ba2fe8803")
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

    @objid ("3e23bd99-0456-4c42-a52a-088092bd093d")
    @Override
    public EList<ConnectorEnd> getRepresentingEnd() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingEndDep());
    }

    @objid ("8b841879-4ec9-4962-bb06-916444c163ea")
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

    @objid ("7ef23cc1-3ffa-4def-9b61-f83979af7ead")
    @Override
    public EList<ActivityPartition> getRepresentingPartition() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingPartitionDep());
    }

    @objid ("e8e94297-31f6-46b0-87e4-24192b9c95e1")
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

    @objid ("39698bf7-97ea-4589-ab76-da249a87bb95")
    @Override
    public EList<Constraint> getConstraintDefinition() {
        return new SmList<>(this, ModelElementData.Metadata.ConstraintDefinitionDep());
    }

    @objid ("1625f253-9259-4c95-97cf-31d46ff271e2")
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

    @objid ("8b4bcee5-16d4-4cb0-9e6b-6fecc5bcdb1e")
    @Override
    public EList<TemplateParameter> getTypingParameter() {
        return new SmList<>(this, ModelElementData.Metadata.TypingParameterDep());
    }

    @objid ("d481348e-b42a-4f56-aa1c-56489e438533")
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

    @objid ("217f75b6-26f6-4de8-824b-033dc1e1c0c9")
    @Override
    public EList<Manifestation> getManifesting() {
        return new SmList<>(this, ModelElementData.Metadata.ManifestingDep());
    }

    @objid ("008d469f-e94e-4770-b1a3-6dc78e67a815")
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

    @objid ("353a9cd9-23d0-4283-84f4-319020d1985f")
    @Override
    public EList<PropertyTable> getProperties() {
        return new SmList<>(this, ModelElementData.Metadata.PropertiesDep());
    }

    @objid ("6e4bab90-7650-4546-bd8e-859b8fbcb4b2")
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

    @objid ("e839396a-f8df-494d-b687-c5bac27ae207")
    @Override
    public EList<AbstractDiagram> getProduct() {
        return new SmList<>(this, ModelElementData.Metadata.ProductDep());
    }

    @objid ("e0996ab6-c6ee-40de-962f-95059d42773e")
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

    @objid ("631d7e30-a910-4b3c-8b76-0929b4a11f1a")
    @Override
    public EList<BindableInstance> getRepresentingInstance() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingInstanceDep());
    }

    @objid ("c5051467-8b8b-48ca-b0d3-709bba5f8651")
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

    @objid ("061726b3-f681-4700-a7d4-9ffd2ebb7692")
    @Override
    public EList<InformationFlow> getReceivedInfo() {
        return new SmList<>(this, ModelElementData.Metadata.ReceivedInfoDep());
    }

    @objid ("632b897d-d8e9-4f53-8c66-51b899139fb7")
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

    @objid ("15d57e14-e888-40af-ab52-8f7d7787eeec")
    @Override
    public EList<InformationFlow> getSentInfo() {
        return new SmList<>(this, ModelElementData.Metadata.SentInfoDep());
    }

    @objid ("c31ff100-b359-4935-ab50-573d9ed985b6")
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

    @objid ("35f67f29-3620-4ea4-a71c-abb4642ce22c")
    @Override
    public EList<Note> getDescriptor() {
        return new SmList<>(this, ModelElementData.Metadata.DescriptorDep());
    }

    @objid ("66430410-ef56-447c-a4e1-5890b3b6b3d2")
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

    @objid ("21011364-1fe4-4728-8344-0b3be721b193")
    @Override
    public EList<NaryConnector> getRepresentingConnector() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingConnectorDep());
    }

    @objid ("82852f2b-19be-403f-9cc8-ac89e65c18c3")
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

    @objid ("7cbff6ac-3898-4f5c-85d0-4dd3ebc19026")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("cb0fa7c2-4ef1-4638-a7b6-4c56c43f2398")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep());
        if (obj != null)
          return new SmDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("cabd00f9-0595-45ca-b75c-b97e2f9f235d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModelElement(this);
        else
          return null;
    }

}
