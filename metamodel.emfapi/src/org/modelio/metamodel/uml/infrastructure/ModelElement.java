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
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.LocalNote;
import org.modelio.metamodel.uml.infrastructure.LocalTaggedValue;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
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

@objid ("00886f12-c4be-1fd8-97fe-001ec947cd2a")
public interface ModelElement extends Element {
    /**
     * Checks if a model element has the stereotype specified by the
     * (moduleName, stereotypeName) pair.
     * @param moduleName
     * - the name of the module providing the type. Cannot be null.
     * @param stereotypeName The stereotype to find. Cannot be null.
     * @return true if the element has the given stereotype or a stereotype
     * derived from the given one.
     */
    @objid ("dcfe9255-d804-11e1-b25c-001ec947ccaf")
    boolean isStereotyped(String modulePattern, String stereotypeName);

    /**
     * This method removes the stereotype the stereotype specified by the
     * (moduleName, stereotypeName) pair. If several instances of the stereotype
     * are present, they are all removed.
     * @param type
     * - the stereotype name. Cannot be null.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     */
    @objid ("f26ff6c2-a983-47c2-bf20-913c7e441ed8")
    void removeStereotypes(String moduleName, String stereotypeName);

    /**
     * This method returns 'true' if the element has a tagged value of the type
     * indicated by the (moduleName, tagTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param tagTypeName - The tagged value type name. Cannot be null.
     * @return 'true' if the element has a tagged value with the corresponding
     * type.
     */
    @objid ("dcfe9251-d804-11e1-b25c-001ec947ccaf")
    boolean isTagged(String moduleName, String tagTypeName);

    /**
     * This method returns the (first) tagged value of the type indicated by the
     * (moduleName, tagTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param tagTypeName - The tagged value type name. Cannot be null.
     * @return The tag or null if it can't be found
     */
    @objid ("dcfe9263-d804-11e1-b25c-001ec947ccaf")
    TaggedValue getTag(String moduleName, String tagTypeName);

    /**
     * This method returns the first parameter value of the first tagged value
     * of the type indicated by the (moduleName, tagTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param tagTypeName - The tagged value type name. Cannot be null.
     * @return null if no tag can be found or there are no parameters, otherwise
     * the first parameter value.
     */
    @objid ("dcfe925f-d804-11e1-b25c-001ec947ccaf")
    String getTagValue(String moduleName, String tagTypeName);

    /**
     * This method returns the parameter values of the first tagged value of the
     * type indicated by the (moduleName, tagTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param tagTypeName - The tagged value type name. Cannot be null.
     * @return null if no tag can be found otherwise the (possibly empty)
     * parameter list
     */
    @objid ("dcfe9259-d804-11e1-b25c-001ec947ccaf")
    List<String> getTagValues(String moduleName, String tagTypeName);

    /**
     * This method sets the parameter of the tagged value of the type indicated
     * by the (moduleName, tagTypeName) pair.
     * 
     * The tagged value and the parameter are created if they don't exist.<br/>
     * 
     * If values is <tt>null</tt> or empty the existing tag is deleted.
     * @param values
     * - the values to store on the tag parameters. If value is
     * <tt>null</tt> the tag is deleted.
     * @throws ElementNotUniqueException
     * @throws ExtensionNotFoundException
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param tagTypeName - The tagged value type name. Cannot be null.
     */
    @objid ("5caef430-b9e6-4b7c-900c-b7deb17a8197")
    void putTagValue(String moduleName, String tagTypeName, String value) throws ExtensionNotFoundException;

    /**
     * This method sets the parameters of the tagged value of the type indicated
     * by the (moduleName, tagTypeName) pair.
     * 
     * The tagged value and the parameter are created if they don't exist.<br/>
     * If values is <tt>null</tt> or empty list the existing tag is deleted.
     * @throws ElementNotUniqueException
     * @throws ExtensionNotFoundException
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param tagTypeName - The tagged value type name. Cannot be null.
     */
    @objid ("d59462b8-4bf4-4878-a82a-8eede2c93613")
    void putTagValues(String moduleName, String tagTypeName, List<String> values) throws ExtensionNotFoundException;

    /**
     * This method deletes all the tagged values of the type indicated by the
     * (moduleName, tagTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param tagTypeName - The tagged value type name. Cannot be null.
     */
    @objid ("00ecbac8-6298-4f80-825f-8975409d150d")
    void removeTags(String moduleName, String tagTypeName);

    /**
     * This operation returns the first note of the type indicated by the
     * (moduleName, noteTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param noteTypeName - the note type name. Cannot be null.
     * @return The note or null if the note can't be found.
     */
    @objid ("dd00f4b1-d804-11e1-b25c-001ec947ccaf")
    Note getNote(String moduleName, String noteTypeName);

    /**
     * This method returns the content of the first note of the type indicated
     * by the (moduleName, noteTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param noteTypeName - the note type name. Cannot be null.
     * @return The note or null if the note can't be found.
     */
    @objid ("dcfe9267-d804-11e1-b25c-001ec947ccaf")
    String getNoteContent(String moduleName, String noteTypeName);

    /**
     * This method  sets the content of the first note of the type
     * indicated by the (moduleName, noteTypeName) pair.
     * 
     * If no note with the given type is found one is created.
     * @throws ElementNotUniqueException
     * @throws ExtensionNotFoundException
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param noteTypeName - the note type name. Cannot be null.
     * @param content - the note content
     */
    @objid ("73b0ebfc-5dab-4ecb-b39e-3dd5a188916f")
    void putNoteContent(String moduleName, String noteTypeName, String content) throws ExtensionNotFoundException;

    /**
     * This method deletes all the notes having this noteType of the type
     * indicated by the (moduleName, noteTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param noteTypeName - the note type name. Cannot be null.
     */
    @objid ("1ce053ff-3366-465d-a318-fba170933dff")
    void removeNotes(String moduleName, String noteTypeName);

    /**
     * Get a property value.
     * <p>
     * Return <code>null</code> if no {@link PropertyTable} with the given name
     * exist or it does not contain the given property.
     * @param tableName The table name. The table may not exist.
     * @param key a property name
     * @return The property value or <code>null</code>.
     */
    @objid ("45c55b29-2831-11e2-bf07-001ec947ccaf")
    String getProperty(String tableName, String key);

    /**
     * Get the first found {@link PropertyTable} that has the given name.
     * @param name a property table name
     * @return the found table or <code>null</code>.
     */
    @objid ("45c55b2e-2831-11e2-bf07-001ec947ccaf")
    PropertyTable getProperties(String name);

    @objid ("b8420d79-1070-4b84-893a-2ce777c1a4f6")
    String getName();

    @objid ("c6d617a4-2613-4b33-bd88-b94734c771bc")
    void setName(String value);

    @objid ("0b7b8cf8-9f2a-4cfe-818d-5263485bc8a5")
    LocalPropertyTable getLocalProperties();

    @objid ("3a69b507-b475-477b-a050-b5b743d654ff")
    void setLocalProperties(LocalPropertyTable value);

    @objid ("513df3e5-b119-4755-89d9-ed5258b42405")
    EList<TemplateParameterSubstitution> getTemplateSubstitution();

    @objid ("7eb34d88-5782-405f-903f-103e688405e8")
    <T extends TemplateParameterSubstitution> List<T> getTemplateSubstitution(java.lang.Class<T> filterClass);

    @objid ("e6581100-143d-4306-8186-251440c96da6")
    EList<BpmnLane> getBpmnLaneRefs();

    @objid ("10dc5c35-bc89-40df-b72a-afab78d07c24")
    <T extends BpmnLane> List<T> getBpmnLaneRefs(java.lang.Class<T> filterClass);

    @objid ("1944f2b6-a6e9-4519-9da8-b5500f6aae7a")
    EList<Stereotype> getExtension();

    @objid ("eba4ea66-9174-4c23-918e-3f10815d8ab8")
    <T extends Stereotype> List<T> getExtension(java.lang.Class<T> filterClass);

    @objid ("9d20a16d-9bd5-4486-884b-92d5a17a33ca")
    EList<LocalTaggedValue> getLocalTag();

    @objid ("0b07b8b6-ba0b-4bad-9cd7-90f431b3d990")
    <T extends LocalTaggedValue> List<T> getLocalTag(java.lang.Class<T> filterClass);

    @objid ("0955d77a-b48f-435d-80fc-0db31f931e94")
    EList<Dependency> getDependsOnDependency();

    @objid ("59e0583a-bc3d-4099-a007-0eda8e237d9b")
    <T extends Dependency> List<T> getDependsOnDependency(java.lang.Class<T> filterClass);

    @objid ("61324693-16e8-4237-b313-bc80f3be309f")
    EList<TemplateParameter> getDefaultParametering();

    @objid ("868b4dfb-e9c1-4728-810b-c4bc3397a6eb")
    <T extends TemplateParameter> List<T> getDefaultParametering(java.lang.Class<T> filterClass);

    @objid ("028dcf43-0fbf-43bd-b45d-8f8e177ec4ee")
    EList<Binding> getRepresents();

    @objid ("c8be6fe6-dc68-47a4-b72f-4ee1679ad18c")
    <T extends Binding> List<T> getRepresents(java.lang.Class<T> filterClass);

    @objid ("a651e036-11da-4390-b4f4-837977322415")
    EList<ExternDocument> getDocument();

    @objid ("e4b4bc84-5dbf-4dbe-840f-31a3428265c5")
    <T extends ExternDocument> List<T> getDocument(java.lang.Class<T> filterClass);

    @objid ("57e3a403-841e-4338-9345-18d8dbbcdd8f")
    EList<TaggedValue> getTag();

    @objid ("2b3d9cdc-934f-4014-a9d5-be3b0e8ccbac")
    <T extends TaggedValue> List<T> getTag(java.lang.Class<T> filterClass);

    @objid ("48f32717-6c4c-4b4c-ada3-176da4dd3d5f")
    TemplateParameter getOwnerTemplateParameter();

    @objid ("312c7542-ba2e-4e2a-926d-d0e556b947cf")
    void setOwnerTemplateParameter(TemplateParameter value);

    @objid ("731d7165-d0a7-42ab-b3dd-d15174c7d8f6")
    EList<LocalNote> getLocalDescriptor();

    @objid ("2554422b-0b83-4012-ab9c-9438cf131f90")
    <T extends LocalNote> List<T> getLocalDescriptor(java.lang.Class<T> filterClass);

    @objid ("9c215f77-194a-4fca-a604-ffd8256ef23e")
    EList<Dependency> getImpactedDependency();

    @objid ("aa7188b5-10ad-431d-8f5e-035129b401a3")
    <T extends Dependency> List<T> getImpactedDependency(java.lang.Class<T> filterClass);

    @objid ("92b72aa6-958a-44e5-8501-4673c5c84270")
    EList<ConnectorEnd> getRepresentingEnd();

    @objid ("937fc410-493c-4dc5-97f2-feb25d110b53")
    <T extends ConnectorEnd> List<T> getRepresentingEnd(java.lang.Class<T> filterClass);

    @objid ("dc665f5d-c45c-412c-bf6d-77330fb2e232")
    EList<ActivityPartition> getRepresentingPartition();

    @objid ("77289cf0-5c38-49c0-a561-5f080c8eba19")
    <T extends ActivityPartition> List<T> getRepresentingPartition(java.lang.Class<T> filterClass);

    @objid ("5c40df21-ec83-41a4-af13-386c835b75d0")
    EList<Constraint> getConstraintDefinition();

    @objid ("cd67bb9f-6a94-41ed-92ce-b20eae97e459")
    <T extends Constraint> List<T> getConstraintDefinition(java.lang.Class<T> filterClass);

    @objid ("50928cc7-60f2-4695-9eac-504f6dcc3e31")
    EList<TemplateParameter> getTypingParameter();

    @objid ("6e1fece0-ff5d-462d-9cee-bfd5fa7265d9")
    <T extends TemplateParameter> List<T> getTypingParameter(java.lang.Class<T> filterClass);

    @objid ("5719087f-01fe-4688-96b6-4ab2becf3c5c")
    EList<Manifestation> getManifesting();

    @objid ("8ae9c135-a385-4fcc-b89f-23b3ca3c5f8f")
    <T extends Manifestation> List<T> getManifesting(java.lang.Class<T> filterClass);

    @objid ("c66113ed-202d-4472-ad01-988c82a5bc96")
    EList<PropertyTable> getProperties();

    @objid ("beb586b4-2032-450f-8806-67f959414ef0")
    <T extends PropertyTable> List<T> getProperties(java.lang.Class<T> filterClass);

    @objid ("86d42857-dcc4-4408-9221-6b1cc437eb07")
    EList<AbstractDiagram> getProduct();

    @objid ("7864cc7b-a781-4dbb-8845-e633862a5b1f")
    <T extends AbstractDiagram> List<T> getProduct(java.lang.Class<T> filterClass);

    @objid ("6805768e-d07d-4da2-a983-bf87ccb340d1")
    EList<BindableInstance> getRepresentingInstance();

    @objid ("9ca4cb12-7936-4d9d-b875-8e4a63c791dd")
    <T extends BindableInstance> List<T> getRepresentingInstance(java.lang.Class<T> filterClass);

    @objid ("56cc7af7-1a05-4032-8159-b88e79d6d5fc")
    EList<InformationFlow> getReceivedInfo();

    @objid ("8e927d6c-a437-4c5f-9145-d51032911c10")
    <T extends InformationFlow> List<T> getReceivedInfo(java.lang.Class<T> filterClass);

    @objid ("6da49810-611d-401f-9f00-66e8562266ad")
    EList<InformationFlow> getSentInfo();

    @objid ("1d140a5a-30b3-4725-b5d7-4d8dfa732eb6")
    <T extends InformationFlow> List<T> getSentInfo(java.lang.Class<T> filterClass);

    @objid ("e38fca81-e6be-4707-ace6-fa0b8e16dded")
    EList<Note> getDescriptor();

    @objid ("da8771ba-7095-4207-a237-a7799df29b8f")
    <T extends Note> List<T> getDescriptor(java.lang.Class<T> filterClass);

    @objid ("86f733b1-4de7-4128-8f4a-9387ba66c3ca")
    EList<NaryConnector> getRepresentingConnector();

    @objid ("1c23de7f-df14-4082-89ea-f4ecd38299f9")
    <T extends NaryConnector> List<T> getRepresentingConnector(java.lang.Class<T> filterClass);

}
