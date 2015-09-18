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

    @objid ("b436660b-7728-4c10-ae78-aa5e4f496ff4")
    String getName();

    @objid ("2869ce11-ca1e-40dd-9653-dfb1b46ecab2")
    void setName(String value);

    @objid ("40b8b60f-8cfe-41e3-9546-396318001c42")
    LocalPropertyTable getLocalProperties();

    @objid ("a310fa87-9118-46dd-9f9c-19193ed82a03")
    void setLocalProperties(LocalPropertyTable value);

    @objid ("cb405c53-082f-4236-bdb9-d24ee7b51a1c")
    EList<TemplateParameterSubstitution> getTemplateSubstitution();

    @objid ("37bbda14-d132-46cc-b1ff-261a0fd1c7a6")
    <T extends TemplateParameterSubstitution> List<T> getTemplateSubstitution(java.lang.Class<T> filterClass);

    @objid ("18730137-6d48-4004-b422-8e9f8292a9fd")
    EList<BpmnLane> getBpmnLaneRefs();

    @objid ("45ce6b75-1546-4df7-8c6e-e7da4ad09023")
    <T extends BpmnLane> List<T> getBpmnLaneRefs(java.lang.Class<T> filterClass);

    @objid ("7333d82e-17af-408b-b812-958688381619")
    EList<Stereotype> getExtension();

    @objid ("23dfef6c-bb32-4cba-972a-26018391b86f")
    <T extends Stereotype> List<T> getExtension(java.lang.Class<T> filterClass);

    @objid ("2a055741-2ff1-4ee4-8b9b-d5a289a33ff9")
    EList<Dependency> getDependsOnDependency();

    @objid ("57853737-5fcb-4683-a480-0bc13ff26c2a")
    <T extends Dependency> List<T> getDependsOnDependency(java.lang.Class<T> filterClass);

    @objid ("a7009c79-48ad-4479-90d0-152e3566c1c0")
    EList<TemplateParameter> getDefaultParametering();

    @objid ("d32b1657-6fba-4015-a5da-3e7f6ab5f84e")
    <T extends TemplateParameter> List<T> getDefaultParametering(java.lang.Class<T> filterClass);

    @objid ("9c71a0c4-b162-4ebf-a1b0-d7db710dd394")
    EList<Binding> getRepresents();

    @objid ("4faa0050-0f98-4f89-85d4-e099b949b943")
    <T extends Binding> List<T> getRepresents(java.lang.Class<T> filterClass);

    @objid ("2108af58-4aaf-4a16-b69d-82964f050766")
    EList<ExternDocument> getDocument();

    @objid ("56e35c83-7d04-4277-90d0-980472102a64")
    <T extends ExternDocument> List<T> getDocument(java.lang.Class<T> filterClass);

    @objid ("d801e325-f08a-4692-a097-2c67f5909c47")
    EList<TaggedValue> getTag();

    @objid ("0a51fcdf-f6cf-4093-bf53-ed3ef571f828")
    <T extends TaggedValue> List<T> getTag(java.lang.Class<T> filterClass);

    @objid ("ea055aee-50f7-4c4c-b4df-4a8c0d2274df")
    TemplateParameter getOwnerTemplateParameter();

    @objid ("405e3a27-b8b3-4bc0-bdef-b0bc2bfa7e47")
    void setOwnerTemplateParameter(TemplateParameter value);

    @objid ("5ff7c86f-34bd-4385-aae7-4a31e7ba921e")
    EList<Dependency> getImpactedDependency();

    @objid ("182f8cca-2191-4b3d-8463-019354ba2aec")
    <T extends Dependency> List<T> getImpactedDependency(java.lang.Class<T> filterClass);

    @objid ("fcc5d7ee-8b3e-4d60-b984-ca06577a4f8a")
    EList<ConnectorEnd> getRepresentingEnd();

    @objid ("7dad6c7f-8a25-494e-8771-1c13375920e0")
    <T extends ConnectorEnd> List<T> getRepresentingEnd(java.lang.Class<T> filterClass);

    @objid ("b896df77-7a7e-403f-bac6-a733ea769b1f")
    EList<ActivityPartition> getRepresentingPartition();

    @objid ("d2a4ade3-a6bc-42f0-8642-312e206bff37")
    <T extends ActivityPartition> List<T> getRepresentingPartition(java.lang.Class<T> filterClass);

    @objid ("d500551a-0b2b-4c01-af3c-3ec5b34273e2")
    EList<Constraint> getConstraintDefinition();

    @objid ("cd69fb55-02e9-47e9-a18b-87b0606ff37e")
    <T extends Constraint> List<T> getConstraintDefinition(java.lang.Class<T> filterClass);

    @objid ("7c1ee358-177f-47d3-87ac-d950d288ed2c")
    EList<TemplateParameter> getTypingParameter();

    @objid ("995da77f-2067-4b11-8fef-d8d34a7ef3b6")
    <T extends TemplateParameter> List<T> getTypingParameter(java.lang.Class<T> filterClass);

    @objid ("0e0d65a5-e11f-45b4-a682-c4e9e2b1503f")
    EList<Manifestation> getManifesting();

    @objid ("462be12c-5df8-4f76-a19c-bc611ce8c98f")
    <T extends Manifestation> List<T> getManifesting(java.lang.Class<T> filterClass);

    @objid ("9310aff2-c13f-470a-b7b5-0a2115cbf68c")
    EList<PropertyTable> getProperties();

    @objid ("7a3520b3-5cbd-4d00-a90a-f210f5fb909c")
    <T extends PropertyTable> List<T> getProperties(java.lang.Class<T> filterClass);

    @objid ("2722554c-6447-4e47-a449-4ca777b32c7a")
    EList<AbstractDiagram> getProduct();

    @objid ("35b4de2d-59ff-4a94-86eb-385975ddff7b")
    <T extends AbstractDiagram> List<T> getProduct(java.lang.Class<T> filterClass);

    @objid ("81168c42-cc26-442f-8ae1-c3f919b9811b")
    EList<BindableInstance> getRepresentingInstance();

    @objid ("5d819082-ed68-4339-8d44-61d837f11c5b")
    <T extends BindableInstance> List<T> getRepresentingInstance(java.lang.Class<T> filterClass);

    @objid ("426a037d-807c-4e12-b8b3-4051b0ba750e")
    EList<InformationFlow> getReceivedInfo();

    @objid ("ebf72a0e-9fff-4a1c-b86c-c77404b764ab")
    <T extends InformationFlow> List<T> getReceivedInfo(java.lang.Class<T> filterClass);

    @objid ("4da90262-02b2-444e-aa6f-bbf52151153f")
    EList<InformationFlow> getSentInfo();

    @objid ("3d0bf5d9-536d-4a69-a80e-b15445ace867")
    <T extends InformationFlow> List<T> getSentInfo(java.lang.Class<T> filterClass);

    @objid ("a809b54e-ec8c-43dc-9b8b-666c3df8fb7d")
    EList<Note> getDescriptor();

    @objid ("0f9c7449-d039-47c3-ad88-a1deed86f66f")
    <T extends Note> List<T> getDescriptor(java.lang.Class<T> filterClass);

    @objid ("166f8a86-21fc-4671-a8de-913af2616678")
    EList<NaryConnector> getRepresentingConnector();

    @objid ("21f95d4c-89cf-44f8-839a-6dd7d977a226")
    <T extends NaryConnector> List<T> getRepresentingConnector(java.lang.Class<T> filterClass);

    @objid ("870aaa79-a3e9-4688-808e-03b76a63e002")
    EList<MatrixDefinition> getMatrix();

    @objid ("7b6963f6-ad54-441c-ab1d-2d67a73c64d3")
    <T extends MatrixDefinition> List<T> getMatrix(java.lang.Class<T> filterClass);

}
