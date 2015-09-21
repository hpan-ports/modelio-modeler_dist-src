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
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.LinkEnd;

/**
 * AssociationEnd v0.0.9054
 * 
 * 
 * An AssociationEnd is an endpoint of an Association, which connects the Association to a Classifier. Each AssociationEnd is part of one Association. 
 * 
 * When the Association is navigable, this link is considered to be a property of the connected Class. It is thus a Feature in the same way as Attributes or Operations. 
 * 
 * An Association is linked to several Classes via AssociationEnds, which determine roles, multiplicities and navigabilities. The connected Classifier is defined by the usual composition link from Classifier to Feature. 
 * 
 * In Modelio, an AssociationEnd is a Feature of a Class.
 */
@objid ("00974ea6-c4be-1fd8-97fe-001ec947cd2a")
public interface AssociationEnd extends StructuralFeature {
    @objid ("153b6b60-dec1-4bda-ac68-cfc6de4db7a2")
    public static final String MNAME = "AssociationEnd";

    /**
     * Get the 'graphical owner' related to this end.
     * The owner is the current source or the opposite end's target according to the navigability.
     */
    @objid ("1bfd0899-45a2-49c8-b8dc-083141e68be2")
    Classifier getOwner();

    /**
     * Sets both ends sources and targets according to the given navigability.
     * <ul>
     * <li>THISSIDE: only current source and target must be filled.</li>
     * <li>OHERSIDE: only opposite source and target must be filled.</li>
     * <li>BOTHSIDES: current source must be equals to opposite target as well as current target and opposite source.</li>
     * <li>NONE: both sources must be filled, but no target</li>
     * </ul>
     * @param value whether or not to synchronize the other end and both source/target values. This end will be made navigable whatever the current navigability is.
     */
    @objid ("00788250-28da-1080-943a-001ec947cd2a")
    void setNavigable(boolean value);

    /**
     * Sets the value of the 'target' dependency.
     * @param fixModel whether or not to synchronize the other end and both source/target values. This end will be made navigable whatever the current navigability is.
     */
    @objid ("00308234-28fb-1080-943a-001ec947cd2a")
    void setTarget(Classifier value, boolean fixModel);

    /**
     * Sets the value of the 'source' dependency.
     * @param fixModel whether or not to synchronize the other end and both source/target values. This end will be made navigable whatever the current navigability is.
     */
    @objid ("000bdc7c-291a-1080-943a-001ec947cd2a")
    void setSource(Classifier value, boolean fixModel);

    @objid ("44b82fff-5b39-4aaa-ac0d-ddb26b837ecd")
    boolean isNavigable();

    /**
     * Getter for attribute 'AssociationEnd.Aggregation'
     * 
     * Metamodel description:
     * <i>This attribute is used to distinguish between normal Associations (KindIsAssociation), shared aggregation (KindIsAggregation) and strong aggregations (KindIsComposition)</i>
     */
    @objid ("ace14938-601c-4027-a968-20a1610900b5")
    AggregationKind getAggregation();

    /**
     * Setter for attribute 'AssociationEnd.Aggregation'
     * 
     * Metamodel description:
     * <i>This attribute is used to distinguish between normal Associations (KindIsAssociation), shared aggregation (KindIsAggregation) and strong aggregations (KindIsComposition)</i>
     */
    @objid ("6da045b3-33bf-44ea-8619-fb35fc6a123c")
    void setAggregation(AggregationKind value);

    /**
     * Getter for attribute 'AssociationEnd.IsChangeable'
     * 
     * Metamodel description:
     * <i>When placed on a target end, specifies whether an instance of the Association may be modified from the source end.</i>
     */
    @objid ("d03ae292-a7d6-4ada-8f7f-d7aeb8c651cb")
    boolean isIsChangeable();

    /**
     * Setter for attribute 'AssociationEnd.IsChangeable'
     * 
     * Metamodel description:
     * <i>When placed on a target end, specifies whether an instance of the Association may be modified from the source end.</i>
     */
    @objid ("40c9206f-36bc-436b-84cd-ea50dd6667f9")
    void setIsChangeable(boolean value);

    /**
     * Getter for relation 'AssociationEnd->Target'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("dc96ba23-912d-4099-ab5f-1f1fbd6aeb29")
    Classifier getTarget();

    /**
     * Setter for relation 'AssociationEnd->Target'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7569e9be-960a-457a-b3ae-bde4f9d07c01")
    void setTarget(Classifier value);

    /**
     * Getter for relation 'AssociationEnd->OppositeOwner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e432e7e3-05f0-4286-8ade-4e2e3637f12d")
    AssociationEnd getOppositeOwner();

    /**
     * Setter for relation 'AssociationEnd->OppositeOwner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2612c14d-a2e2-4d68-8ed4-97b2f81a25c8")
    void setOppositeOwner(AssociationEnd value);

    /**
     * Getter for relation 'AssociationEnd->Source'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cc5f42d6-cdc6-4aa5-88c6-f281aa90f2ef")
    Classifier getSource();

    /**
     * Setter for relation 'AssociationEnd->Source'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("46e061d1-790a-4a2a-bd2e-d72a851cc8ca")
    void setSource(Classifier value);

    /**
     * Getter for relation 'AssociationEnd->Occurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0d3fd12e-e3ae-49d9-b2b4-985a61de193a")
    EList<LinkEnd> getOccurence();

    /**
     * Filtered Getter for relation 'AssociationEnd->Occurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e8118212-9c8b-466f-9f64-3bc8f1029a63")
    <T extends LinkEnd> List<T> getOccurence(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'AssociationEnd->Sent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9bc26694-0a2c-4e6e-997f-46818376d956")
    EList<InformationFlow> getSent();

    /**
     * Filtered Getter for relation 'AssociationEnd->Sent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("abb7a2a1-af04-4227-8986-5b37d3b49c65")
    <T extends InformationFlow> List<T> getSent(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'AssociationEnd->Qualifier'
     * 
     * Metamodel description:
     * <i>Defines a Qualifier on the AssociationEnd. </i>
     */
    @objid ("204e8e27-b201-47d3-9d26-1c208ea32e9f")
    EList<Attribute> getQualifier();

    /**
     * Filtered Getter for relation 'AssociationEnd->Qualifier'
     * 
     * Metamodel description:
     * <i>Defines a Qualifier on the AssociationEnd. </i>
     */
    @objid ("76acc2db-9557-435b-aeb0-adb5665dfc92")
    <T extends Attribute> List<T> getQualifier(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'AssociationEnd->Opposite'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4b26922d-ddbf-434c-87fa-b013fb8e921e")
    AssociationEnd getOpposite();

    /**
     * Setter for relation 'AssociationEnd->Opposite'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c751845b-3cd4-470b-8284-bc73ea685c80")
    void setOpposite(AssociationEnd value);

    /**
     * Getter for relation 'AssociationEnd->RepresentingObjectNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("109b2ef7-388d-4a64-b23b-aaf27cc486dd")
    EList<ObjectNode> getRepresentingObjectNode();

    /**
     * Filtered Getter for relation 'AssociationEnd->RepresentingObjectNode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("50eb8548-7303-45dd-9b25-b51f87338ca1")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'AssociationEnd->Association'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7421ab75-c8db-4841-832b-6df4485b94ad")
    Association getAssociation();

    /**
     * Setter for relation 'AssociationEnd->Association'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e8754136-d7cc-4ae4-a969-e6447a26f164")
    void setAssociation(Association value);

    /**
     * Getter for relation 'AssociationEnd->RepresentingItem'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6731fe7e-d37a-4570-8add-6b406100471b")
    EList<BpmnItemAwareElement> getRepresentingItem();

    /**
     * Filtered Getter for relation 'AssociationEnd->RepresentingItem'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a377b462-72b9-4c25-a314-a4c6fb598d10")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

}
