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

import java.security.InvalidParameterException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.factory.IModelFactory;
import org.modelio.metamodel.factory.ModelFactory;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
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
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

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
        return getStereotype(moduleName, stereotypeName) != null;
    }

    @objid ("80f3dc16-cdd8-48b6-90e7-0a9e55768ac2")
    @Override
    public final void addStereotype(String moduleName, String stereotypeName) throws ExtensionNotFoundException {
        IModelFactory factory = ModelFactory.getFactory(this);
        
        // Since Modelio 3.4, stereotypeName might contain "module#stereotype"
        if (stereotypeName.contains("#")) {
            String stereotype = stereotypeName;
            moduleName = stereotype.substring(0, stereotype.indexOf("#"));
            stereotypeName = stereotype.substring(stereotype.indexOf("#") + 1, stereotype.length());
        }
        
        List<Stereotype> stereotypes = factory.findStereotype(moduleName, stereotypeName, getMClass());
        if (stereotypes.size() == 0) {
            throw new ExtensionNotFoundException("'" + stereotypeName + "' stereotype not found");
        } else if (stereotypes.size() == 1) {
            EList<Stereotype> existingStereotypes = getExtension();
            if (!existingStereotypes.contains(stereotypes.get(0))) {
                existingStereotypes.add(stereotypes.get(0));
            }
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
        
        // Since Modelio 3.4, stereotypeName might contain "module#stereotype"
        if (stereotypeName.contains("#")) {
            String stereotype = stereotypeName;
            moduleName = stereotype.substring(0, stereotype.indexOf("#"));
            stereotypeName = stereotype.substring(stereotype.indexOf("#") + 1, stereotype.length());
        }
        
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
    @objid ("04b55263-aadd-4e21-9bf9-4a467f2b8a83")
    @Override
    public Stereotype getStereotype(String moduleName, String stereotypeName) {
        // Since Modelio 3.4, stereotypeName might contain "module#stereotype"
        if (stereotypeName.contains("#")) {
            String stereotype = stereotypeName;
            moduleName = stereotype.substring(0, stereotype.indexOf("#"));
            stereotypeName = stereotype.substring(stereotype.indexOf("#") + 1, stereotype.length());
        }
        
        for (Stereotype s : getExtension()) {
            if (inheritsFrom(s, stereotypeName)) {
                if (s.getModule() == null) {
                    if (moduleName == null) {
                        return s;
                    }
                } else if (s.getModule().getName().equals(moduleName)) {
                    return s;
                }
            }
        }
        return null;
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
            if (tag != null) {
                tag.delete();
            }
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
            if (tag != null) {
                tag.delete();
            }
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
            if (t.getName().equals(name)) {
                return t;
            }
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
        if (props == null) {
            return null;
        } else {
            return props.getProperty(key);
        }
    }

    /**
     * {@inheritDoc}
     */
    @objid ("1d48ff5f-be07-4379-a570-386efed731a9")
    @Override
    public String getProperty(String moduleName, String stereotypeName, String key) throws ExtensionNotFoundException {
        if (stereotypeName == null) {
            throw new IllegalArgumentException("setProperty(): stereotype name cannot be null");
        }
        
        Stereotype s = getStereotype(moduleName, stereotypeName);
        if (s == null) {
            throw new ExtensionNotFoundException("'" + stereotypeName + "' stereotype not found");
        }
        
        String tableName = s.getUuid().toString();
        PropertyTable props = getProperties(tableName);
        if (props == null) {
            return null;
        } else {
            return props.getProperty(key);
        }
    }

    /**
     * {@inheritDoc}
     */
    @objid ("6f56b93d-1506-457e-932f-0b5c13dc205e")
    @Override
    public void setProperty(String tableName, String key, String value) {
        PropertyTable props = getProperties(tableName);
        if (props == null) {
            IModelFactory factory = ModelFactory.getFactory(this);
            props = factory.createPropertyTable();
            props.setName(tableName);
            props.setOwner(this);
        }
        
        props.setProperty(key, value);
    }

    /**
     * {@inheritDoc}
     */
    @objid ("d7bb4f95-2012-4a9e-9606-8db9208f9d84")
    @Override
    public void setProperty(String moduleName, String stereotypeName, String key, String value) throws ExtensionNotFoundException {
        if (stereotypeName == null) {
            throw new IllegalArgumentException("setProperty(): stereotype name cannot be null");
        }
        
        Stereotype s = getStereotype(moduleName, stereotypeName);
        if (s == null) {
            throw new ExtensionNotFoundException("'" + stereotypeName + "' stereotype not found");
        }
        
        String tableName = s.getUuid().toString();
        PropertyTable props = getProperties(tableName);
        if (props == null) {
            IModelFactory factory = ModelFactory.getFactory(this);
            props = factory.createTypedPropertyTable();
            props.setName(tableName);
            props.setOwner(this);
            ((TypedPropertyTable) props).setType(s.getDefinedTable());
        }
        
        props.setProperty(key, value);
    }

    /**
     * Answer to the question: is 'stereotype' a child of the stereotype named by 'stereotypeName' Companion method of the public
     * isStereoyped() method
     * @param stereotype a stereotype
     * @param stereotypeName the name of another stereotype.
     * @return <code>true</code> if 'stereotype' a child of the stereotype named by 'stereotypeName' else <code>false</code>.
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

    @objid ("7dc378d8-3a48-4702-9bc8-6c5d43730b65")
    @Override
    public String getName() {
        return (String) getAttVal(((ModelElementSmClass)getClassOf()).getNameAtt());
    }

    @objid ("f728976c-3604-4995-afb5-79549b76877d")
    @Override
    public void setName(String value) {
        setAttVal(((ModelElementSmClass)getClassOf()).getNameAtt(), value);
    }

    @objid ("26f36b17-8f8b-4631-a982-d01d079c8e6b")
    @Override
    public LocalPropertyTable getLocalProperties() {
        Object obj = getDepVal(((ModelElementSmClass)getClassOf()).getLocalPropertiesDep());
        return (obj instanceof LocalPropertyTable)? (LocalPropertyTable)obj : null;
    }

    @objid ("5ca06b8b-4d8a-47d3-8b9a-8562b303bec9")
    @Override
    public void setLocalProperties(LocalPropertyTable value) {
        appendDepVal(((ModelElementSmClass)getClassOf()).getLocalPropertiesDep(), (SmObjectImpl)value);
    }

    @objid ("92a436cb-802c-4034-b517-3bc10c4c3506")
    @Override
    public EList<TemplateParameterSubstitution> getTemplateSubstitution() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getTemplateSubstitutionDep());
    }

    @objid ("a52c4d85-b260-473c-978a-ee08f06c91b2")
    @Override
    public <T extends TemplateParameterSubstitution> List<T> getTemplateSubstitution(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TemplateParameterSubstitution element : getTemplateSubstitution()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b4b1f9e9-9f02-417a-9608-b1ebe41666e5")
    @Override
    public EList<BpmnLane> getBpmnLaneRefs() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getBpmnLaneRefsDep());
    }

    @objid ("06fbe0fb-fcd2-45e6-83f9-ff527d160ed3")
    @Override
    public <T extends BpmnLane> List<T> getBpmnLaneRefs(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnLane element : getBpmnLaneRefs()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e4da483a-f13e-4a5f-8d41-dca02787236b")
    @Override
    public EList<Stereotype> getExtension() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getExtensionDep());
    }

    @objid ("629896c7-828d-4bcf-848c-178e113e4125")
    @Override
    public <T extends Stereotype> List<T> getExtension(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Stereotype element : getExtension()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9a6bf8da-a7d7-4bb3-b7cb-ecf03610235e")
    @Override
    public EList<Dependency> getDependsOnDependency() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getDependsOnDependencyDep());
    }

    @objid ("e2985980-2874-4aea-96da-a7f23887132a")
    @Override
    public <T extends Dependency> List<T> getDependsOnDependency(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Dependency element : getDependsOnDependency()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b9f882e2-60ab-4f0a-88fa-4c561c41d9bd")
    @Override
    public EList<TemplateParameter> getDefaultParametering() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getDefaultParameteringDep());
    }

    @objid ("f314524a-e254-44bd-a302-9cad9d2edab7")
    @Override
    public <T extends TemplateParameter> List<T> getDefaultParametering(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TemplateParameter element : getDefaultParametering()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1f6f67a6-f466-400a-8be0-bc2c9eabf459")
    @Override
    public EList<Binding> getRepresents() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getRepresentsDep());
    }

    @objid ("799eca06-0b3c-4205-91e8-61245c7c1dca")
    @Override
    public <T extends Binding> List<T> getRepresents(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Binding element : getRepresents()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("690ec9e7-e554-487e-b34f-20a88293bc24")
    @Override
    public EList<ExternDocument> getDocument() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getDocumentDep());
    }

    @objid ("78a7e4c3-c76e-4d23-834f-3b85d16e2fdc")
    @Override
    public <T extends ExternDocument> List<T> getDocument(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ExternDocument element : getDocument()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7f25d173-4e32-4fbc-8a01-a66c0b42a393")
    @Override
    public EList<TaggedValue> getTag() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getTagDep());
    }

    @objid ("2f37125c-d4a3-4083-846c-eb00a70f963c")
    @Override
    public <T extends TaggedValue> List<T> getTag(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TaggedValue element : getTag()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6bbd2525-837a-46f7-bfa7-d117fc335772")
    @Override
    public TemplateParameter getOwnerTemplateParameter() {
        Object obj = getDepVal(((ModelElementSmClass)getClassOf()).getOwnerTemplateParameterDep());
        return (obj instanceof TemplateParameter)? (TemplateParameter)obj : null;
    }

    @objid ("ff5210b0-4672-48c7-bc1e-1b8be0d6a96f")
    @Override
    public void setOwnerTemplateParameter(TemplateParameter value) {
        appendDepVal(((ModelElementSmClass)getClassOf()).getOwnerTemplateParameterDep(), (SmObjectImpl)value);
    }

    @objid ("ef183c79-608b-4b86-bb0d-fef5accd532d")
    @Override
    public EList<Dependency> getImpactedDependency() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getImpactedDependencyDep());
    }

    @objid ("272b5283-f2ab-4515-8ce9-0e9612efedf0")
    @Override
    public <T extends Dependency> List<T> getImpactedDependency(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Dependency element : getImpactedDependency()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4b3e314b-199f-4b5c-b9df-e2d99456086a")
    @Override
    public EList<ConnectorEnd> getRepresentingEnd() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getRepresentingEndDep());
    }

    @objid ("4be9a95f-9715-43e2-9ca0-ae91011dff68")
    @Override
    public <T extends ConnectorEnd> List<T> getRepresentingEnd(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ConnectorEnd element : getRepresentingEnd()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("25febdc1-1463-4293-9402-67c269c581ef")
    @Override
    public EList<ActivityPartition> getRepresentingPartition() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getRepresentingPartitionDep());
    }

    @objid ("5e1bb8cc-5a86-43bd-b7ca-051f1549f61a")
    @Override
    public <T extends ActivityPartition> List<T> getRepresentingPartition(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ActivityPartition element : getRepresentingPartition()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e3cae485-a429-4b89-90d6-55bce52545de")
    @Override
    public EList<Constraint> getConstraintDefinition() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getConstraintDefinitionDep());
    }

    @objid ("bc8c62ff-c95c-433d-850e-cf91d40b2f57")
    @Override
    public <T extends Constraint> List<T> getConstraintDefinition(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Constraint element : getConstraintDefinition()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c2756416-e4d0-4a7b-a3a2-1298c1a5015b")
    @Override
    public EList<TemplateParameter> getTypingParameter() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getTypingParameterDep());
    }

    @objid ("cf54daa5-8bba-4f02-b9c5-10fd85c64d16")
    @Override
    public <T extends TemplateParameter> List<T> getTypingParameter(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TemplateParameter element : getTypingParameter()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9685fcd7-07bc-45ee-97ce-ef6bb7c25b90")
    @Override
    public EList<Manifestation> getManifesting() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getManifestingDep());
    }

    @objid ("1a490532-15df-4ca2-be56-6743ab5344cc")
    @Override
    public <T extends Manifestation> List<T> getManifesting(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Manifestation element : getManifesting()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a3822653-c17a-4f10-b956-9dedc2a067b0")
    @Override
    public EList<PropertyTable> getProperties() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getPropertiesDep());
    }

    @objid ("75c929b3-7e57-4466-86e0-dc8d66a7a383")
    @Override
    public <T extends PropertyTable> List<T> getProperties(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final PropertyTable element : getProperties()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ba3afa3a-c223-4764-a094-e17d572f2392")
    @Override
    public EList<AbstractDiagram> getProduct() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getProductDep());
    }

    @objid ("714921a6-b004-4301-8e14-e24da958eaa4")
    @Override
    public <T extends AbstractDiagram> List<T> getProduct(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final AbstractDiagram element : getProduct()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a290f546-f310-4cfe-ad0c-526693198c9a")
    @Override
    public EList<BindableInstance> getRepresentingInstance() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getRepresentingInstanceDep());
    }

    @objid ("5f8dd2c7-fbcb-4be6-9cbd-3d931649aa19")
    @Override
    public <T extends BindableInstance> List<T> getRepresentingInstance(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BindableInstance element : getRepresentingInstance()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2889e3d4-6bb1-4e71-ad98-a198f0848008")
    @Override
    public EList<InformationFlow> getReceivedInfo() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getReceivedInfoDep());
    }

    @objid ("26f575fa-ad51-4220-a745-39126dd4740c")
    @Override
    public <T extends InformationFlow> List<T> getReceivedInfo(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InformationFlow element : getReceivedInfo()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("23460a14-5e64-4889-8625-0e7abd51e4ca")
    @Override
    public EList<InformationFlow> getSentInfo() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getSentInfoDep());
    }

    @objid ("136448bd-791d-44b5-b6dd-38b80462a168")
    @Override
    public <T extends InformationFlow> List<T> getSentInfo(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final InformationFlow element : getSentInfo()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("27e8dd23-1e86-4a9a-a1f5-5fdb5368ff99")
    @Override
    public EList<Note> getDescriptor() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getDescriptorDep());
    }

    @objid ("0f5569c5-ed59-49db-b189-2ab125f1e15e")
    @Override
    public <T extends Note> List<T> getDescriptor(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Note element : getDescriptor()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f1efd50b-b77d-4318-8218-dc23b361d76d")
    @Override
    public EList<NaryConnector> getRepresentingConnector() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getRepresentingConnectorDep());
    }

    @objid ("3ebb8765-5b75-4109-a99e-8c86fd6a3ca1")
    @Override
    public <T extends NaryConnector> List<T> getRepresentingConnector(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final NaryConnector element : getRepresentingConnector()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c9d3f5a4-cfea-4358-aa63-a6956d0bc209")
    @Override
    public EList<MatrixDefinition> getMatrix() {
        return new SmList<>(this, ((ModelElementSmClass)getClassOf()).getMatrixDep());
    }

    @objid ("4d2495fe-064f-4f1c-990f-22b2e0b209ba")
    @Override
    public <T extends MatrixDefinition> List<T> getMatrix(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final MatrixDefinition element : getMatrix()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("708fddf6-5c18-4031-ba2e-25855891b81f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerTemplateParameter
        obj = (SmObjectImpl)this.getDepVal(((ModelElementSmClass)getClassOf()).getOwnerTemplateParameterDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4e8e3da6-ee38-4ee8-a1e7-35d00b35a531")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerTemplateParameter
        dep = ((ModelElementSmClass)getClassOf()).getOwnerTemplateParameterDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("acaf643c-688a-4002-983a-97f61f31bc62")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModelElement(this);
        else
          return null;
    }

}
