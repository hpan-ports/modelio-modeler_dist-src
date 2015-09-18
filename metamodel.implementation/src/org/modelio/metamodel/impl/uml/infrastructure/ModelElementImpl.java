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
/*   Metamodel version: 9022              */
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
        if (stereotypeName == null) {
            throw new IllegalArgumentException("isStereotyped(): stereotype name cannot be null");
        }
        
        for (Stereotype s : getExtension()) {
            if (inheritsFrom(s, stereotypeName)) {
                if (s.getModule() == null) {
                    if (moduleName == null) {
                        return true;
                    }
                } else if (s.getModule().getName().equals(moduleName)) {
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
                if (stereotype.getModule() == null) {
                    if (moduleName == null) {
                        toRemove.add(stereotype);
                    }
                } else if (stereotype.getModule().getName().equals(moduleName)) {
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
                if (tagType.getModule() == null) {
                    if (moduleName == null) {
                        return true;
                    }
                } else if (tagType.getModule().getName().equals(moduleName)) {
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
                if (tagType.getModule() == null) {
                    if (moduleName == null) {
                        return tag;
                    }
                } else if (tagType.getModule().getName().equals(moduleName)) {
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
                if (tagType.getModule() == null) {
                    if (moduleName == null) {
                        toRemove.add(tag);
                    }
                } else if (tagType.getModule().getName().equals(moduleName)) {
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
                if (model.getModule() == null) {
                    if (moduleName == null) {
                        return note;
                    }
                } else if (model.getModule().getName().equals(moduleName)) {
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
                if (model.getModule() == null) {
                    if (moduleName == null) {
                        toRemove.add(note);
                    }
                } else if (model.getModule().getName().equals(moduleName)) {
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

    @objid ("ea434d89-8911-4679-9e31-6c176f050dec")
    @Override
    public String getName() {
        return (String) getAttVal(ModelElementData.Metadata.NameAtt());
    }

    @objid ("4e6bb111-577f-41b6-b7c5-83d1422f7568")
    @Override
    public void setName(String value) {
        setAttVal(ModelElementData.Metadata.NameAtt(), value);
    }

    @objid ("fd40fc5f-2cb5-4310-b676-5c3245d39b6c")
    @Override
    public LocalPropertyTable getLocalProperties() {
        return (LocalPropertyTable) getDepVal(ModelElementData.Metadata.LocalPropertiesDep());
    }

    @objid ("3a47e111-a0e9-487d-a583-28704f6c1e7b")
    @Override
    public void setLocalProperties(LocalPropertyTable value) {
        appendDepVal(ModelElementData.Metadata.LocalPropertiesDep(), (SmObjectImpl)value);
    }

    @objid ("40bca87a-c399-496b-82d9-47e5a6eff3a0")
    @Override
    public EList<TemplateParameterSubstitution> getTemplateSubstitution() {
        return new SmList<>(this, ModelElementData.Metadata.TemplateSubstitutionDep());
    }

    @objid ("478df7dd-3d3d-4da6-ad16-138edb238ba2")
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

    @objid ("c8c0d219-2b61-4b97-803a-22c0f80c75ea")
    @Override
    public EList<BpmnLane> getBpmnLaneRefs() {
        return new SmList<>(this, ModelElementData.Metadata.BpmnLaneRefsDep());
    }

    @objid ("9979d0c7-f352-49de-bb8a-825a10f3c2ec")
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

    @objid ("9bf5de47-0f00-4e9c-91c1-b19792d5cfbc")
    @Override
    public EList<Stereotype> getExtension() {
        return new SmList<>(this, ModelElementData.Metadata.ExtensionDep());
    }

    @objid ("dfdec230-3c45-4165-9303-f918bc75ef26")
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

    @objid ("716b3f19-18ef-44ff-8c65-06e9cacf4dcc")
    @Override
    public EList<Dependency> getDependsOnDependency() {
        return new SmList<>(this, ModelElementData.Metadata.DependsOnDependencyDep());
    }

    @objid ("087e8ba1-685c-46b6-92ea-05797dec0fbe")
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

    @objid ("1321308b-cf74-4675-b1e0-ffa50f4f31ee")
    @Override
    public EList<TemplateParameter> getDefaultParametering() {
        return new SmList<>(this, ModelElementData.Metadata.DefaultParameteringDep());
    }

    @objid ("bc42dae6-e192-4bfa-9bf2-7dda1dd1d74b")
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

    @objid ("48e80b34-5e79-4162-b615-2a14c9d91a06")
    @Override
    public EList<Binding> getRepresents() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentsDep());
    }

    @objid ("00037625-fa3e-4e2f-bc61-f90c95bd9bca")
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

    @objid ("237d74ba-1bf0-49ec-b55a-6c12b59bf2bd")
    @Override
    public EList<ExternDocument> getDocument() {
        return new SmList<>(this, ModelElementData.Metadata.DocumentDep());
    }

    @objid ("2987ac26-2045-4430-9287-1a250b96c455")
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

    @objid ("af3ae4a1-8cc4-4b6b-807b-18ade349f428")
    @Override
    public EList<TaggedValue> getTag() {
        return new SmList<>(this, ModelElementData.Metadata.TagDep());
    }

    @objid ("6bc7fabe-e8e4-4e67-925b-0d803c5f4870")
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

    @objid ("8d403f60-445c-4449-842b-6adae2f1749e")
    @Override
    public TemplateParameter getOwnerTemplateParameter() {
        return (TemplateParameter) getDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep());
    }

    @objid ("a818a2ba-29e6-4a67-9a4d-5162fb92164c")
    @Override
    public void setOwnerTemplateParameter(TemplateParameter value) {
        appendDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep(), (SmObjectImpl)value);
    }

    @objid ("0a4c632b-62aa-4904-9316-4a300dfd72dc")
    @Override
    public EList<Dependency> getImpactedDependency() {
        return new SmList<>(this, ModelElementData.Metadata.ImpactedDependencyDep());
    }

    @objid ("06b08c5f-5f95-46f2-afcf-e316dbe4b52c")
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

    @objid ("e2101598-e39d-45ca-9584-78bde919b4f8")
    @Override
    public EList<ConnectorEnd> getRepresentingEnd() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingEndDep());
    }

    @objid ("e9ea67f0-3565-47f2-aeee-e3ab8ccf009e")
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

    @objid ("2078732b-9968-4ddf-935b-f1d32001a673")
    @Override
    public EList<ActivityPartition> getRepresentingPartition() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingPartitionDep());
    }

    @objid ("867827c1-6b54-4cd8-ba7a-4b94565ce1a1")
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

    @objid ("2256aa2a-48b8-4e3f-87d6-85403c79efa9")
    @Override
    public EList<Constraint> getConstraintDefinition() {
        return new SmList<>(this, ModelElementData.Metadata.ConstraintDefinitionDep());
    }

    @objid ("1e25edf9-0f7d-4e27-8952-852bb50e2e47")
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

    @objid ("adb787ef-aacc-47ab-b94e-e8de4df351ec")
    @Override
    public EList<TemplateParameter> getTypingParameter() {
        return new SmList<>(this, ModelElementData.Metadata.TypingParameterDep());
    }

    @objid ("32df91dc-74b3-4ef4-901e-0a94c274ed72")
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

    @objid ("473008bf-fd89-4df9-8d2a-94b7f6a5d631")
    @Override
    public EList<Manifestation> getManifesting() {
        return new SmList<>(this, ModelElementData.Metadata.ManifestingDep());
    }

    @objid ("9245c6de-9aac-4c92-9f39-90969ee1c71c")
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

    @objid ("6e3efda4-7ec3-428b-a845-ac5ae3f54a3f")
    @Override
    public EList<PropertyTable> getProperties() {
        return new SmList<>(this, ModelElementData.Metadata.PropertiesDep());
    }

    @objid ("67bbd6fb-a959-4488-b71a-1dc9e57e0288")
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

    @objid ("249d6b5c-c6ea-4cee-a43a-8af8cb316216")
    @Override
    public EList<AbstractDiagram> getProduct() {
        return new SmList<>(this, ModelElementData.Metadata.ProductDep());
    }

    @objid ("098c8a11-bba2-4e48-9b04-8b0e87c2b185")
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

    @objid ("f8dcc9bf-cdf0-4d52-8074-143102e73958")
    @Override
    public EList<BindableInstance> getRepresentingInstance() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingInstanceDep());
    }

    @objid ("ea10f27f-3817-4982-99ae-448ce1c0ad8d")
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

    @objid ("bc53bf3b-2145-4256-a34e-8c7ecc5d379d")
    @Override
    public EList<InformationFlow> getReceivedInfo() {
        return new SmList<>(this, ModelElementData.Metadata.ReceivedInfoDep());
    }

    @objid ("c8afc383-0980-435c-8c8d-11dd010369b0")
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

    @objid ("bc24456f-d3dc-48f0-9ecd-3400dda9d3ed")
    @Override
    public EList<InformationFlow> getSentInfo() {
        return new SmList<>(this, ModelElementData.Metadata.SentInfoDep());
    }

    @objid ("30963f2b-7b29-440e-99e5-59c80393708e")
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

    @objid ("0087f209-e5ca-4540-b8c3-e368c15a6b4d")
    @Override
    public EList<Note> getDescriptor() {
        return new SmList<>(this, ModelElementData.Metadata.DescriptorDep());
    }

    @objid ("ce0f12ba-5c35-4d8c-bfab-614dc3cbf652")
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

    @objid ("7a37b243-db00-457f-b66d-bfefef340946")
    @Override
    public EList<NaryConnector> getRepresentingConnector() {
        return new SmList<>(this, ModelElementData.Metadata.RepresentingConnectorDep());
    }

    @objid ("72d057fc-d710-4b96-b0a3-e589e90ac14f")
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

    @objid ("54949dc7-4845-408c-a2e1-223539d3847d")
    @Override
    public EList<MatrixDefinition> getMatrix() {
        return new SmList<>(this, ModelElementData.Metadata.MatrixDep());
    }

    @objid ("3661bf5f-2f05-4770-8466-9ae4c4d687b8")
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

    @objid ("cea1b6a5-e26a-44ae-aa64-65a8d40c81be")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("99ba7219-0e0f-401d-aad6-d420583d1e3b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep());
        if (obj != null)
          return new SmDepVal(ModelElementData.Metadata.OwnerTemplateParameterDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("527db626-190b-454d-bfaf-ebb9e9837f61")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModelElement(this);
        else
          return null;
    }

}
