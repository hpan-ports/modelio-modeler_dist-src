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

    @objid ("4601cf60-e004-4047-a69c-5b34dad34860")
    void addStereotype(String moduleName, String stereotypeName) throws ExtensionNotFoundException;

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

    @objid ("762030c9-3782-4956-bb25-f0dc4d749404")
    String getLocalProperty(String key);

    @objid ("2aaaa3c2-dc0c-495d-8060-07b6eb14dc6b")
    void setLocalProperty(String key, String value);

    @objid ("36518511-4eb5-491c-b773-9e19ce7221e4")
    String getName();

    @objid ("8a45dc3c-23c6-45e7-9d82-94d6458dd6ab")
    void setName(String value);

    @objid ("58e89ff7-6d30-4ebe-b359-5d8212ab4df8")
    LocalPropertyTable getLocalProperties();

    @objid ("bb4707d7-0b8c-4a6e-b094-91f6125cd38b")
    void setLocalProperties(LocalPropertyTable value);

    @objid ("a7654a66-d013-4059-b742-a7df9a17f63b")
    EList<TemplateParameterSubstitution> getTemplateSubstitution();

    @objid ("0c03562d-917c-48e1-90f7-4feef1c0f65a")
    <T extends TemplateParameterSubstitution> List<T> getTemplateSubstitution(java.lang.Class<T> filterClass);

    @objid ("161a367b-9a20-4707-9190-eaa5eb7575e2")
    EList<BpmnLane> getBpmnLaneRefs();

    @objid ("082ab184-a676-4a88-8ab0-35c393c4bdd5")
    <T extends BpmnLane> List<T> getBpmnLaneRefs(java.lang.Class<T> filterClass);

    @objid ("c5d9a311-e032-4648-8dd1-ea3b5f2cc319")
    EList<Stereotype> getExtension();

    @objid ("184f3e65-8e6c-46c7-909c-5d9bd0b74de5")
    <T extends Stereotype> List<T> getExtension(java.lang.Class<T> filterClass);

    @objid ("f701bbb3-fe1a-434f-8c50-63ee610b1f45")
    EList<Dependency> getDependsOnDependency();

    @objid ("50be17a9-dc14-4048-ae9c-f1800abb6f5c")
    <T extends Dependency> List<T> getDependsOnDependency(java.lang.Class<T> filterClass);

    @objid ("6d8a2925-aabd-402b-9b43-9bc496923112")
    EList<TemplateParameter> getDefaultParametering();

    @objid ("e844ad5f-6c7b-474c-861f-bdd26340c3b7")
    <T extends TemplateParameter> List<T> getDefaultParametering(java.lang.Class<T> filterClass);

    @objid ("188f5fea-cf5b-4b48-b94a-f6426505d6ae")
    EList<Binding> getRepresents();

    @objid ("3de82204-63ab-48e0-ba80-4bc52395c5b1")
    <T extends Binding> List<T> getRepresents(java.lang.Class<T> filterClass);

    @objid ("57d4f54f-c8fe-4be7-ab8d-54f69cd71881")
    EList<ExternDocument> getDocument();

    @objid ("e0c94f1b-8d4c-4a1f-a4ef-4a45bb91a2d1")
    <T extends ExternDocument> List<T> getDocument(java.lang.Class<T> filterClass);

    @objid ("45f014cf-7773-489a-946c-bde9f1fe9f1b")
    EList<TaggedValue> getTag();

    @objid ("7cc6f660-1b98-4d0d-b83a-8040b0e6e25b")
    <T extends TaggedValue> List<T> getTag(java.lang.Class<T> filterClass);

    @objid ("d253320c-8c66-4b43-a1af-25a63aded899")
    TemplateParameter getOwnerTemplateParameter();

    @objid ("8cb86fb4-edb5-4537-b397-053ba9eef3a4")
    void setOwnerTemplateParameter(TemplateParameter value);

    @objid ("584ce582-e57e-4a55-9da1-c9dc95472530")
    EList<Dependency> getImpactedDependency();

    @objid ("6b12f9e1-0b1f-4627-a839-8c54bd426d5c")
    <T extends Dependency> List<T> getImpactedDependency(java.lang.Class<T> filterClass);

    @objid ("721a0739-bc25-45f3-958b-487dc323d3be")
    EList<ConnectorEnd> getRepresentingEnd();

    @objid ("90720088-a8ff-478a-9d8a-e9317116489c")
    <T extends ConnectorEnd> List<T> getRepresentingEnd(java.lang.Class<T> filterClass);

    @objid ("bf382e9b-2acd-477f-a5cd-aa0fe75a9652")
    EList<ActivityPartition> getRepresentingPartition();

    @objid ("41c98cda-3622-4a63-a342-c5d233b87760")
    <T extends ActivityPartition> List<T> getRepresentingPartition(java.lang.Class<T> filterClass);

    @objid ("a6134091-c172-4a7d-8385-5852711dce0e")
    EList<Constraint> getConstraintDefinition();

    @objid ("f7d3ac0f-5626-4e58-b3bc-a04e2320f957")
    <T extends Constraint> List<T> getConstraintDefinition(java.lang.Class<T> filterClass);

    @objid ("2731f25f-a6c5-41b0-9a9e-26e719a51270")
    EList<TemplateParameter> getTypingParameter();

    @objid ("e7d69468-5671-4a60-994c-4d7e0e89d605")
    <T extends TemplateParameter> List<T> getTypingParameter(java.lang.Class<T> filterClass);

    @objid ("6e7bb384-f418-4425-a279-9c05c64f8ccf")
    EList<Manifestation> getManifesting();

    @objid ("3fe8271c-a0d9-4728-b088-e1dcb6fa4f75")
    <T extends Manifestation> List<T> getManifesting(java.lang.Class<T> filterClass);

    @objid ("70db5256-0fc8-45a7-8984-76bad9dd50c4")
    EList<PropertyTable> getProperties();

    @objid ("364027d4-b1dd-4bc1-9de0-099720666366")
    <T extends PropertyTable> List<T> getProperties(java.lang.Class<T> filterClass);

    @objid ("4daaaab0-99a5-45d4-b0c1-67d37dab6bc6")
    EList<AbstractDiagram> getProduct();

    @objid ("5e2287f6-1c2d-4b80-9785-cf824f17321c")
    <T extends AbstractDiagram> List<T> getProduct(java.lang.Class<T> filterClass);

    @objid ("9afe243e-d03b-4b57-917a-72a05d6e51d6")
    EList<BindableInstance> getRepresentingInstance();

    @objid ("8d15d435-fcf4-4df9-a029-665c0402915d")
    <T extends BindableInstance> List<T> getRepresentingInstance(java.lang.Class<T> filterClass);

    @objid ("38b9a5b0-9256-4bb9-bd96-e0d74d37fcf7")
    EList<InformationFlow> getReceivedInfo();

    @objid ("74d5ce6c-42ab-4078-9894-a1c6e6c3b169")
    <T extends InformationFlow> List<T> getReceivedInfo(java.lang.Class<T> filterClass);

    @objid ("a7c780a1-92ac-4ff7-9ea3-b638533147b0")
    EList<InformationFlow> getSentInfo();

    @objid ("c1b6365b-969f-4ff4-8b55-a49e52aa0aec")
    <T extends InformationFlow> List<T> getSentInfo(java.lang.Class<T> filterClass);

    @objid ("afd8d2a8-c9c3-4a31-8246-c513aa4f53d3")
    EList<Note> getDescriptor();

    @objid ("e1bf5042-5f1e-4db0-bf60-be620f9098e3")
    <T extends Note> List<T> getDescriptor(java.lang.Class<T> filterClass);

    @objid ("75952977-35ee-4f64-bf28-1525c032fc80")
    EList<NaryConnector> getRepresentingConnector();

    @objid ("9392ea52-d619-4bc9-bc79-caa29b93fffc")
    <T extends NaryConnector> List<T> getRepresentingConnector(java.lang.Class<T> filterClass);

    @objid ("031edfe7-a02c-4051-94d0-9c8da3c61a19")
    EList<MatrixDefinition> getMatrix();

    @objid ("4b6af99a-384a-4288-b9b0-6d995fa39111")
    <T extends MatrixDefinition> List<T> getMatrix(java.lang.Class<T> filterClass);

}
