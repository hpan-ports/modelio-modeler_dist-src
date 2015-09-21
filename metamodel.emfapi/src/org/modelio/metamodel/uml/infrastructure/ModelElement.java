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


/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
/* WARNING: GENERATED FILE -  DO NOT EDIT
 Metamodel: Standard, version 0.0.9024, by Modeliosoft
 Generator version: 3.2.10.9023
 Generated on: Mar 19, 2015
 */
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.factory.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
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

/**
 * ModelElement v0.0.9054
 * 
 * 
 * A ModelElement describes every element that can exist in a model. Only low-level Elements are not ModelElements. 
 * 
 * ModelElements can be extended by Stereotypes and TaggedValues, can have Notes, can be the origin or target of Dependencies, and can have Constraints.
 */
@objid ("00886f12-c4be-1fd8-97fe-001ec947cd2a")
public interface ModelElement extends Element {
    @objid ("2c8aa68e-c719-4305-8a48-c6c51ca2e744")
    public static final String MNAME = "ModelElement";

    /**
     * Checks if a model element has the stereotype specified by the (moduleName, stereotypeName) pair.
     * @param moduleName
     * - the name of the module providing the type. Cannot be null.
     * @param stereotypeName The stereotype to find. Cannot be null.
     * @return true if the element has the given stereotype or a stereotype derived from the given one.
     */
    @objid ("dcfe9255-d804-11e1-b25c-001ec947ccaf")
    boolean isStereotyped(String modulePattern, String stereotypeName);

    /**
     * Get the stereotype specified by the (moduleName, stereotypeName) pair from this model element.
     * @return the specified stereotype or <code>null</code>.
     * @since Modelio 3.4
     * @param moduleName - the name of the module providing the type. Cannot be null.
     * @param stereotypeName The stereotype to find. Cannot be <code>null</code>.
     */
    @objid ("4601cf60-e004-4047-a69c-5b34dad34860")
    void addStereotype(String moduleName, String stereotypeName) throws ExtensionNotFoundException;

    /**
     * This method removes the stereotype the stereotype specified by the (moduleName, stereotypeName) pair. If several instances of
     * the stereotype are present, they are all removed.
     * @param type
     * - the stereotype name. Cannot be <code>null</code>.
     * @param moduleName - the name of the module providing the type. Cannot be <code>null</code>.
     */
    @objid ("f26ff6c2-a983-47c2-bf20-913c7e441ed8")
    void removeStereotypes(String moduleName, String stereotypeName);

    @objid ("6c25b162-5c2e-479b-919b-f3a142d61e18")
    Stereotype getStereotype(String moduleName, String stereotypeName);

    /**
     * This method returns 'true' if the element has a tagged value of the type indicated by the (moduleName, tagTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be <code>null</code>.
     * @param tagTypeName - The tagged value type name. Cannot be <code>null</code>.
     * @return 'true' if the element has a tagged value with the corresponding type.
     */
    @objid ("dcfe9251-d804-11e1-b25c-001ec947ccaf")
    boolean isTagged(String moduleName, String tagTypeName);

    /**
     * This method returns the (first) tagged value of the type indicated by the (moduleName, tagTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be <code>null</code>.
     * @param tagTypeName - The tagged value type name. Cannot be <code>null</code>.
     * @return The tag or <code>null</code> if it can't be found
     */
    @objid ("dcfe9263-d804-11e1-b25c-001ec947ccaf")
    TaggedValue getTag(String moduleName, String tagTypeName);

    /**
     * This method returns the first parameter value of the first tagged value of the type indicated by the (moduleName,
     * tagTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be <code>null</code>.
     * @param tagTypeName - The tagged value type name. Cannot be <code>null</code>.
     * @return <code>null</code> if no tag can be found or there are no parameters, otherwise the first parameter value.
     */
    @objid ("dcfe925f-d804-11e1-b25c-001ec947ccaf")
    String getTagValue(String moduleName, String tagTypeName);

    /**
     * This method returns the parameter values of the first tagged value of the type indicated by the (moduleName, tagTypeName)
     * pair.
     * @param moduleName - the name of the module providing the type. Cannot be <code>null</code>.
     * @param tagTypeName - The tagged value type name. Cannot be <code>null</code>.
     * @return <code>null</code> if no tag can be found otherwise the (possibly empty) parameter list
     */
    @objid ("dcfe9259-d804-11e1-b25c-001ec947ccaf")
    List<String> getTagValues(String moduleName, String tagTypeName);

    /**
     * This method sets the parameter of the tagged value of the type indicated by the (moduleName, tagTypeName) pair.
     * 
     * The tagged value and the parameter are created if they don't exist.<br/>
     * 
     * If values is <code>null</code> or empty the existing tag is deleted.
     * @param values
     * - the values to store on the tag parameters. If value is <code>null</code> the tag is deleted.
     * @throws ElementNotUniqueException
     * @throws ExtensionNotFoundException
     * @param moduleName - the name of the module providing the type. Cannot be <code>null</code>.
     * @param tagTypeName - The tagged value type name. Cannot be <code>null</code>.
     */
    @objid ("5caef430-b9e6-4b7c-900c-b7deb17a8197")
    void putTagValue(String moduleName, String tagTypeName, String value) throws ExtensionNotFoundException;

    /**
     * This method sets the parameters of the tagged value of the type indicated by the (moduleName, tagTypeName) pair.
     * 
     * The tagged value and the parameter are created if they don't exist.<br/>
     * If values is <code>null</code> or empty list the existing tag is deleted.
     * @throws ElementNotUniqueException
     * @throws ExtensionNotFoundException
     * @param moduleName - the name of the module providing the type. Cannot be <code>null</code>.
     * @param tagTypeName - The tagged value type name. Cannot be <code>null</code>.
     */
    @objid ("d59462b8-4bf4-4878-a82a-8eede2c93613")
    void putTagValues(String moduleName, String tagTypeName, List<String> values) throws ExtensionNotFoundException;

    /**
     * This method deletes all the tagged values of the type indicated by the (moduleName, tagTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be <code>null</code>.
     * @param tagTypeName - The tagged value type name. Cannot be <code>null</code>.
     */
    @objid ("00ecbac8-6298-4f80-825f-8975409d150d")
    void removeTags(String moduleName, String tagTypeName);

    /**
     * This operation returns the first note of the type indicated by the (moduleName, noteTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be <code>null</code>.
     * @param noteTypeName - the note type name. Cannot be <code>null</code>.
     * @return The note or <code>null</code> if the note can't be found.
     */
    @objid ("dd00f4b1-d804-11e1-b25c-001ec947ccaf")
    Note getNote(String moduleName, String noteTypeName);

    /**
     * This method returns the content of the first note of the type indicated by the (moduleName, noteTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be <code>null</code>.
     * @param noteTypeName - the note type name. Cannot be <code>null</code>.
     * @return The note or <code>null</code> if the note can't be found.
     */
    @objid ("dcfe9267-d804-11e1-b25c-001ec947ccaf")
    String getNoteContent(String moduleName, String noteTypeName);

    /**
     * This method sets the content of the first note of the type indicated by the (moduleName, noteTypeName) pair.
     * 
     * If no note with the given type is found one is created.
     * @throws ElementNotUniqueException
     * @throws ExtensionNotFoundException
     * @param moduleName - the name of the module providing the type. Cannot be <code>null</code>.
     * @param noteTypeName - the note type name. Cannot be <code>null</code>.
     * @param content - the note content
     */
    @objid ("73b0ebfc-5dab-4ecb-b39e-3dd5a188916f")
    void putNoteContent(String moduleName, String noteTypeName, String content) throws ExtensionNotFoundException;

    /**
     * This method deletes all the notes having this noteType of the type indicated by the (moduleName, noteTypeName) pair.
     * @param moduleName - the name of the module providing the type. Cannot be <code>null</code>.
     * @param noteTypeName - the note type name. Cannot be <code>null</code>.
     */
    @objid ("1ce053ff-3366-465d-a318-fba170933dff")
    void removeNotes(String moduleName, String noteTypeName);

    /**
     * Get a property value.
     * <p>
     * Return <code>null</code> if no {@link PropertyTable} with the given name exists or it does not contain the given property.
     * </p>
     * @param tableName The table name. The table may not exist.
     * @param key a property name
     * @return The property value or <code>null</code>.
     */
    @objid ("45c55b29-2831-11e2-bf07-001ec947ccaf")
    String getProperty(String tableName, String key);

    /**
     * Get a property value.
     * <p>
     * Return <code>null</code> if no {@link TypedPropertyTable} for the stereotype exists or it does not contain the given
     * property.
     * </p>
     * @throws ExtensionNotFoundException
     * @param moduleName - the name of the module providing stereotype. Cannot be <code>null</code>.
     * @param stereotypeName - the name of the stereotype providing the table type. Cannot be <code>null</code>.
     * @param key a property name
     * @return The property value or <code>null</code>.
     * @since Modelio 3.4
     */
    @objid ("a102d222-688b-45ac-bc95-5d68fc907403")
    String getProperty(String moduleName, String stereotypeName, String key) throws ExtensionNotFoundException;

    /**
     * Get the first found {@link PropertyTable} that has the given name.
     * @param name a property table name
     * @return the found table or <code>null</code>.
     */
    @objid ("45c55b2e-2831-11e2-bf07-001ec947ccaf")
    PropertyTable getProperties(String name);

    /**
     * Set a property value.
     * <p>
     * Update the value of a property in a stereotype's {@link TypedPropertyTable}. If missing, the table itself is created.
     * </p>
     * @throws ExtensionNotFoundException
     * @param moduleName - the name of the module providing stereotype. Cannot be <code>null</code>.
     * @param stereotypeName - the name of the stereotype providing the table type. Cannot be <code>null</code>.
     * @param key a property name
     * @param value the property value.
     * @since Modelio 3.4
     */
    @objid ("5bd36280-3dc5-4bdd-9e7c-c5b1fc16e7f1")
    void setProperty(String moduleName, String stereotypeName, String key, String value) throws ExtensionNotFoundException;

    /**
     * Set a property value.
     * <p>
     * Update the value of a property in a {@link PropertyTable}. If missing, the table itself is created.
     * </p>
     * @param tableName The table name. The table may not exist.
     * @param key a property name
     * @param value the property value.
     * @since Modelio 3.4
     */
    @objid ("adf13e7a-b7eb-4f56-bb54-02a378df1260")
    void setProperty(String tableName, String key, String value);

    @objid ("762030c9-3782-4956-bb25-f0dc4d749404")
    String getLocalProperty(String key);

    @objid ("2aaaa3c2-dc0c-495d-8060-07b6eb14dc6b")
    void setLocalProperty(String key, String value);

    /**
     * Getter for attribute 'ModelElement.Name'
     * 
     * Metamodel description:
     * <i>Name of the element.</i>
     */
    @objid ("8e76e052-76bc-4390-9ce8-06f0abd04021")
    String getName();

    /**
     * Setter for attribute 'ModelElement.Name'
     * 
     * Metamodel description:
     * <i>Name of the element.</i>
     */
    @objid ("1c5bd56c-c494-42bb-8169-e35bd45d8621")
    void setName(String value);

    /**
     * Getter for relation 'ModelElement->LocalProperties'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("79ef1d35-976d-4e0a-81f7-27fa3b51e4e1")
    LocalPropertyTable getLocalProperties();

    /**
     * Setter for relation 'ModelElement->LocalProperties'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b8167bb4-d1f9-4225-b364-a140237c8692")
    void setLocalProperties(LocalPropertyTable value);

    /**
     * Getter for relation 'ModelElement->TemplateSubstitution'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6bdcc249-c8e7-4424-bdad-9833026bf9f1")
    EList<TemplateParameterSubstitution> getTemplateSubstitution();

    /**
     * Filtered Getter for relation 'ModelElement->TemplateSubstitution'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6e8f9fe6-ae13-4f78-bcc5-60d15fa804c0")
    <T extends TemplateParameterSubstitution> List<T> getTemplateSubstitution(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->BpmnLaneRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("adb45392-a4b4-45e2-9f87-9c32133b8540")
    EList<BpmnLane> getBpmnLaneRefs();

    /**
     * Filtered Getter for relation 'ModelElement->BpmnLaneRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8c517179-c2ae-4608-946f-9e56ae986ac0")
    <T extends BpmnLane> List<T> getBpmnLaneRefs(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->Extension'
     * 
     * Metamodel description:
     * <i>Stereotype metaclassifying the ModelElement.</i>
     */
    @objid ("113d1fbb-3489-446a-b0df-b427a9313c4e")
    EList<Stereotype> getExtension();

    /**
     * Filtered Getter for relation 'ModelElement->Extension'
     * 
     * Metamodel description:
     * <i>Stereotype metaclassifying the ModelElement.</i>
     */
    @objid ("754e13f1-b4e1-4ca0-8cdd-8287bf399a4f")
    <T extends Stereotype> List<T> getExtension(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->DependsOnDependency'
     * 
     * Metamodel description:
     * <i>Designates a Dependency that relates to a supplier ModelElement.</i>
     */
    @objid ("de25abba-fc1b-440d-8920-363fe379499b")
    EList<Dependency> getDependsOnDependency();

    /**
     * Filtered Getter for relation 'ModelElement->DependsOnDependency'
     * 
     * Metamodel description:
     * <i>Designates a Dependency that relates to a supplier ModelElement.</i>
     */
    @objid ("0efb7fa8-f3c3-460f-9d15-357841bbac22")
    <T extends Dependency> List<T> getDependsOnDependency(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->DefaultParametering'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1e2e2333-9658-4153-ab55-8c6ad63645b9")
    EList<TemplateParameter> getDefaultParametering();

    /**
     * Filtered Getter for relation 'ModelElement->DefaultParametering'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("751c33d9-ec4a-43ff-941d-682b0b750f6c")
    <T extends TemplateParameter> List<T> getDefaultParametering(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->Represents'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("16a2af08-0258-4f1f-9e5b-8a5be7a3e1d5")
    EList<Binding> getRepresents();

    /**
     * Filtered Getter for relation 'ModelElement->Represents'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2da54a54-3009-4975-babc-0ce69120bf8e")
    <T extends Binding> List<T> getRepresents(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->Document'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("913f2be0-ba7a-4044-80f5-162356a8c2d4")
    EList<ExternDocument> getDocument();

    /**
     * Filtered Getter for relation 'ModelElement->Document'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("db31cd5b-9d65-4293-8125-bd16699abb4b")
    <T extends ExternDocument> List<T> getDocument(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->Tag'
     * 
     * Metamodel description:
     * <i>TaggedValues annotating the ModelElement.</i>
     */
    @objid ("385ff6e6-f3b5-4c2e-870b-6e9726a6432d")
    EList<TaggedValue> getTag();

    /**
     * Filtered Getter for relation 'ModelElement->Tag'
     * 
     * Metamodel description:
     * <i>TaggedValues annotating the ModelElement.</i>
     */
    @objid ("2295792c-5a74-4e42-abf7-1ee25411365a")
    <T extends TaggedValue> List<T> getTag(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->OwnerTemplateParameter'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f9f402a3-4423-498f-a087-130f5a25028d")
    TemplateParameter getOwnerTemplateParameter();

    /**
     * Setter for relation 'ModelElement->OwnerTemplateParameter'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("429063b1-15d2-4844-af2c-73b3cffaaa67")
    void setOwnerTemplateParameter(TemplateParameter value);

    /**
     * Getter for relation 'ModelElement->ImpactedDependency'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cde63548-15fc-4ea8-ba3a-4d21925793d2")
    EList<Dependency> getImpactedDependency();

    /**
     * Filtered Getter for relation 'ModelElement->ImpactedDependency'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0baee7bf-adb3-4561-b216-b79c37c8b8a7")
    <T extends Dependency> List<T> getImpactedDependency(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->RepresentingEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f9d9f593-7a9a-4369-9f47-f979986a0417")
    EList<ConnectorEnd> getRepresentingEnd();

    /**
     * Filtered Getter for relation 'ModelElement->RepresentingEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("725525b7-6f36-465b-9b98-dc14bd951f71")
    <T extends ConnectorEnd> List<T> getRepresentingEnd(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->RepresentingPartition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f56d38e9-c059-46e8-94bf-2b186595f77e")
    EList<ActivityPartition> getRepresentingPartition();

    /**
     * Filtered Getter for relation 'ModelElement->RepresentingPartition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b1ec3ebf-146e-4b37-9c1f-ca0319eaad6a")
    <T extends ActivityPartition> List<T> getRepresentingPartition(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->ConstraintDefinition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4f8c2ec0-f07d-4aa5-83fa-ef5ad226fc5b")
    EList<Constraint> getConstraintDefinition();

    /**
     * Filtered Getter for relation 'ModelElement->ConstraintDefinition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a678dd51-ab5f-41e6-9f83-56ec7a9dd482")
    <T extends Constraint> List<T> getConstraintDefinition(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->TypingParameter'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("62903bad-7014-43b7-a285-e559e443d211")
    EList<TemplateParameter> getTypingParameter();

    /**
     * Filtered Getter for relation 'ModelElement->TypingParameter'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("070fbb21-b4ca-4e75-a7ae-84650ed3882e")
    <T extends TemplateParameter> List<T> getTypingParameter(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->Manifesting'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3b787ad0-2806-4a91-a3e0-fa5274a0baed")
    EList<Manifestation> getManifesting();

    /**
     * Filtered Getter for relation 'ModelElement->Manifesting'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0228044d-fa25-46bd-b92c-b4a0b6d0f9c7")
    <T extends Manifestation> List<T> getManifesting(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->Properties'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c3df7b21-0c45-4fff-9f46-c187b34e09c1")
    EList<PropertyTable> getProperties();

    /**
     * Filtered Getter for relation 'ModelElement->Properties'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7371e86f-ae7c-46e9-a77e-de9cb06668f1")
    <T extends PropertyTable> List<T> getProperties(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->Product'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f426d354-aa1b-4174-b21b-192fff6f9753")
    EList<AbstractDiagram> getProduct();

    /**
     * Filtered Getter for relation 'ModelElement->Product'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e770e29c-d2bc-40e5-8ebb-7eb0d49ecbed")
    <T extends AbstractDiagram> List<T> getProduct(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->RepresentingInstance'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d23973ec-7de7-4aa6-97c2-8abd50fbe71e")
    EList<BindableInstance> getRepresentingInstance();

    /**
     * Filtered Getter for relation 'ModelElement->RepresentingInstance'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("95a0e0f5-b50b-4a62-bbc9-565adf9af669")
    <T extends BindableInstance> List<T> getRepresentingInstance(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->ReceivedInfo'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bf1c27a2-3659-44f5-9120-ffc4169c7d79")
    EList<InformationFlow> getReceivedInfo();

    /**
     * Filtered Getter for relation 'ModelElement->ReceivedInfo'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("addf371a-3293-4c5e-8cf9-7cdbf35620f5")
    <T extends InformationFlow> List<T> getReceivedInfo(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->SentInfo'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4229029b-5829-4ee1-97d9-4a6c45b96e98")
    EList<InformationFlow> getSentInfo();

    /**
     * Filtered Getter for relation 'ModelElement->SentInfo'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8fa48ca3-e611-47d8-9e51-548fa4fc9334")
    <T extends InformationFlow> List<T> getSentInfo(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->Descriptor'
     * 
     * Metamodel description:
     * <i>Notes (documentation, code, and so on) describing the ModelElement.</i>
     */
    @objid ("e350275f-ac5a-4beb-b332-3e004c973c03")
    EList<Note> getDescriptor();

    /**
     * Filtered Getter for relation 'ModelElement->Descriptor'
     * 
     * Metamodel description:
     * <i>Notes (documentation, code, and so on) describing the ModelElement.</i>
     */
    @objid ("63988e56-47e8-406d-8385-14ac74878259")
    <T extends Note> List<T> getDescriptor(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->RepresentingConnector'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b0570a19-1213-4fca-88eb-014a7b64866b")
    EList<NaryConnector> getRepresentingConnector();

    /**
     * Filtered Getter for relation 'ModelElement->RepresentingConnector'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b9964470-e269-4bc1-a3a2-1642aa588e20")
    <T extends NaryConnector> List<T> getRepresentingConnector(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ModelElement->Matrix'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("abd85d20-250f-4788-9826-6be8ff37cd10")
    EList<MatrixDefinition> getMatrix();

    /**
     * Filtered Getter for relation 'ModelElement->Matrix'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("619139ee-8fef-42f0-8fe2-94e4798ea2fe")
    <T extends MatrixDefinition> List<T> getMatrix(java.lang.Class<T> filterClass);

}
