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
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;

/**
 * Instance v0.0.9054
 * 
 * 
 * In Modelio, Instances represent both the UML 2.0 Instance specification, and the UML 2.0 Part within structured Classifiers. The distinction is made through the definition context.  If the context is a namespacing context (such as Package or Class), then it corresponds to the UML 2.0 instance specification. If the context of the instance is an instantiation context, such as typically in the case of Collaborations, then it corresponds to Parts. Parts and Ports are handled as instances in Modelio, whereas UML 2.0 handles them as properties.  
 * 
 * An Instance is connected to zero or several Classifiers, which declare its structure and behavior. It has a set of attribute values (Slot in UML, and AttributeLink in Modelio) and is connected to a set of Links, where both sets match the definitions of its Classifiers/NameSpaces (if there are any). The two sets implement the current state of the Instance.  
 * 
 * In Modelio, an Instance belongs to its NameSpace (Class, Package, Collaboration, and so on), or to another Instance (Cluster association).  
 * 
 * There exist three important cases of configuration for instances in Modelio:  
 * 1 - The Instance belongs to a Package. This corresponds to the UML 2.0 notion of InstanceSpecification.  
 * 2 - The Instance belongs to a Collaboration (it is a Part, and its links are Connectors). 
 * 3 - The Instance belongs to a Classifier. In this case, it is a Part or a Port of the Classifier.  
 * 
 * (UML 2.0 semantics): When an Instance of the containing Classifier is created, a set of Instances corresponding to its properties may be created either immediately or at some later time, depending on the multiplicity. These Instances are Instances of the Classifier typing the property. 
 * 
 * A Part specifies that a set of Instances may exist.  This set of Instances is a subset of the total set of Instances specified by the Classifier typing the Part. A Part of a Classifier declares that an Instance of this Classifier may contain a set of Instances by composition. All such Instances are destroyed when the container Classifier Instance is destroyed.  
 * 
 * In Modelio, an Instance belongs to another Instance (embedded or clustered Instances) or belongs to a NameSpace (Package, Class, Collaboration).
 */
@objid ("000d46d4-c4bf-1fd8-97fe-001ec947cd2a")
public interface Instance extends ModelElement {
    @objid ("28beba8c-20f9-4565-adbc-8019b76b1bb5")
    public static final String MNAME = "Instance";

    /**
     * Getter for attribute 'Instance.IsConstant'
     * 
     * Metamodel description:
     * <i>Determines whether it is a constant.</i>
     */
    @objid ("66549f98-805c-4783-8763-e9b5cf78d27d")
    boolean isIsConstant();

    /**
     * Setter for attribute 'Instance.IsConstant'
     * 
     * Metamodel description:
     * <i>Determines whether it is a constant.</i>
     */
    @objid ("bedaa7a5-2cf6-4755-a65e-eef571474ef3")
    void setIsConstant(boolean value);

    /**
     * Getter for attribute 'Instance.MultiplicityMin'
     * 
     * Metamodel description:
     * <i>Minimum number of Instances that can exist. In the case where the Instance belongs to a Collaboration (typically in the case of internalStructure) this represents the number of instances at the time of creation of the container NameSpace or Classifier.</i>
     */
    @objid ("ab809b4b-7a03-4cd4-97f6-8dfa42bee744")
    String getMultiplicityMin();

    /**
     * Setter for attribute 'Instance.MultiplicityMin'
     * 
     * Metamodel description:
     * <i>Minimum number of Instances that can exist. In the case where the Instance belongs to a Collaboration (typically in the case of internalStructure) this represents the number of instances at the time of creation of the container NameSpace or Classifier.</i>
     */
    @objid ("cc49dc01-2488-44a5-80f2-c3abef64c8e9")
    void setMultiplicityMin(String value);

    /**
     * Getter for attribute 'Instance.MultiplicityMax'
     * 
     * Metamodel description:
     * <i>Maximum number of Instances that can exist in the context of the owner NameSpace.</i>
     */
    @objid ("5af13dbf-e0da-43e4-bed9-8c8e14a84974")
    String getMultiplicityMax();

    /**
     * Setter for attribute 'Instance.MultiplicityMax'
     * 
     * Metamodel description:
     * <i>Maximum number of Instances that can exist in the context of the owner NameSpace.</i>
     */
    @objid ("95b906aa-3ac2-49f3-8552-5a5453c7d698")
    void setMultiplicityMax(String value);

    /**
     * Getter for attribute 'Instance.Value'
     * 
     * Metamodel description:
     * <i>Current value of the Instance. This can be an expression, used instead of the set of values of the AttributeLinks of the instance.</i>
     */
    @objid ("cd88509a-0eaf-40d2-89b6-11ed7c84d963")
    String getValue();

    /**
     * Setter for attribute 'Instance.Value'
     * 
     * Metamodel description:
     * <i>Current value of the Instance. This can be an expression, used instead of the set of values of the AttributeLinks of the instance.</i>
     */
    @objid ("2e4727c8-e6a9-4d6c-b877-c5a97f28d55d")
    void setValue(String value);

    /**
     * Getter for relation 'Instance->RepresentedCommunicationNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ce692436-4cb0-4079-acce-2471c8a09067")
    EList<CommunicationNode> getRepresentedCommunicationNode();

    /**
     * Filtered Getter for relation 'Instance->RepresentedCommunicationNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("94aee2b0-ea30-4d48-83f6-284874149a35")
    <T extends CommunicationNode> List<T> getRepresentedCommunicationNode(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Instance->RepresentingItem'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4e05d5ce-d6ba-4c9f-9a2b-1de43a0233d0")
    EList<BpmnItemAwareElement> getRepresentingItem();

    /**
     * Filtered Getter for relation 'Instance->RepresentingItem'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cdd49992-2dbf-480f-9efe-55ab6cc49127")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Instance->OwnedEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e0e2cc41-2d0b-4bc1-bd97-61be61dd9144")
    EList<LinkEnd> getOwnedEnd();

    /**
     * Filtered Getter for relation 'Instance->OwnedEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4954586f-419e-4132-9278-10a7796bb254")
    <T extends LinkEnd> List<T> getOwnedEnd(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Instance->Base'
     * 
     * Metamodel description:
     * <i>Defines the Classifier as the model of the Instance or Role.</i>
     */
    @objid ("e304540c-7577-4566-8cc8-69e914fa6009")
    NameSpace getBase();

    /**
     * Setter for relation 'Instance->Base'
     * 
     * Metamodel description:
     * <i>Defines the Classifier as the model of the Instance or Role.</i>
     */
    @objid ("b020d3e1-3604-4919-93b3-4953c757d544")
    void setBase(NameSpace value);

    /**
     * Getter for relation 'Instance->RepresentingObjectNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("304cf8cd-dfa5-4507-b1e0-f4c18cba80ec")
    EList<ObjectNode> getRepresentingObjectNode();

    /**
     * Filtered Getter for relation 'Instance->RepresentingObjectNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("835543c5-155e-40a8-b2b3-57529fed1aac")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Instance->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d58f8ded-1548-438e-b474-6642b5622310")
    NameSpace getOwner();

    /**
     * Setter for relation 'Instance->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cfcdf2d9-0d24-4dd3-8dae-71eb8e3572f9")
    void setOwner(NameSpace value);

    /**
     * Getter for relation 'Instance->OwnedNaryEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("edfb002e-2fdc-4269-ad03-1df25e34a1ba")
    EList<NaryLinkEnd> getOwnedNaryEnd();

    /**
     * Filtered Getter for relation 'Instance->OwnedNaryEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ec2f3a89-a78a-43cc-85f5-54046f9c9429")
    <T extends NaryLinkEnd> List<T> getOwnedNaryEnd(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Instance->RepresentedLifeLine'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bfe9f399-92ac-4d24-ae60-463de9cadd50")
    EList<Lifeline> getRepresentedLifeLine();

    /**
     * Filtered Getter for relation 'Instance->RepresentedLifeLine'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("87ae1098-4652-47c2-8b8b-e1574c600038")
    <T extends Lifeline> List<T> getRepresentedLifeLine(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Instance->Slot'
     * 
     * Metamodel description:
     * <i>Occurrences of attributes for the current object (Instance or Role).</i>
     */
    @objid ("94d31e39-404c-41fa-8f62-4d61baeb9a9c")
    EList<AttributeLink> getSlot();

    /**
     * Filtered Getter for relation 'Instance->Slot'
     * 
     * Metamodel description:
     * <i>Occurrences of attributes for the current object (Instance or Role).</i>
     */
    @objid ("8b944703-589c-4ce5-800f-50f62d74b8a1")
    <T extends AttributeLink> List<T> getSlot(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Instance->Part'
     * 
     * Metamodel description:
     * <i>Instances can be embedded. This can represent cluster. In Modelio, this is used to represent ComponentInstance supported by NodeInstances, or Objects in ComponentInstances or NodeInstances.</i>
     */
    @objid ("3b3bde33-4da0-4fb5-b815-bb22f35893aa")
    EList<BindableInstance> getPart();

    /**
     * Filtered Getter for relation 'Instance->Part'
     * 
     * Metamodel description:
     * <i>Instances can be embedded. This can represent cluster. In Modelio, this is used to represent ComponentInstance supported by NodeInstances, or Objects in ComponentInstances or NodeInstances.</i>
     */
    @objid ("24f0b566-9960-4e4f-9828-babe53ee49b3")
    <T extends BindableInstance> List<T> getPart(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Instance->TargetingEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e6785478-0887-48b0-bc76-0006cf7956c5")
    EList<LinkEnd> getTargetingEnd();

    /**
     * Filtered Getter for relation 'Instance->TargetingEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("67e5c8d5-8286-4220-95d2-4d09ab8f3b00")
    <T extends LinkEnd> List<T> getTargetingEnd(java.lang.Class<T> filterClass);

}
