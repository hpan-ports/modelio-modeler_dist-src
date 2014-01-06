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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.LinkEnd;

@objid ("00974ea6-c4be-1fd8-97fe-001ec947cd2a")
public interface AssociationEnd extends StructuralFeature {
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

    @objid ("b9d820d8-c98b-451b-918e-036227da8fe0")
    AggregationKind getAggregation();

    @objid ("58060dbe-7689-4a3e-8912-b98383cf4c03")
    void setAggregation(AggregationKind value);

    @objid ("a352ce65-c1cf-498f-950a-ed6ca036320d")
    boolean isIsChangeable();

    @objid ("6d82aa5f-d45b-483d-ac0c-9f9f5b3d8660")
    void setIsChangeable(boolean value);

    @objid ("81bc3b2e-0f23-465e-b15c-78eade28452c")
    Classifier getTarget();

    @objid ("bf387ab3-7ea3-42eb-a4fb-61f548d58017")
    void setTarget(Classifier value);

    @objid ("e5767665-15d9-471c-872b-bf56a36e8a54")
    AssociationEnd getOppositeOwner();

    @objid ("97a7d81d-4cd9-4309-8c72-79a86de36d6e")
    void setOppositeOwner(AssociationEnd value);

    @objid ("b12cc6b9-fd02-4cdc-acd8-1b609f68fbd2")
    Classifier getSource();

    @objid ("acb2fb51-65f2-4688-84d0-4912cec40008")
    void setSource(Classifier value);

    @objid ("9e00a853-782f-46b2-a811-645f2bd287fc")
    EList<LinkEnd> getOccurence();

    @objid ("dc347df7-d11e-4280-8bf2-546166e53d3a")
    <T extends LinkEnd> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("94684ccd-d4bf-4222-ac4b-edaedbfefc6b")
    EList<InformationFlow> getSent();

    @objid ("11882dfc-8289-4d2a-bb51-18885f1db4cf")
    <T extends InformationFlow> List<T> getSent(java.lang.Class<T> filterClass);

    @objid ("23aa4143-a5e0-4c68-9bd8-e97e19a308bc")
    EList<Attribute> getQualifier();

    @objid ("7d5b38a2-3bbf-4ea2-b839-30273803eae0")
    <T extends Attribute> List<T> getQualifier(java.lang.Class<T> filterClass);

    @objid ("6441db4e-877f-4da6-a4a0-7c920e71c76a")
    AssociationEnd getOpposite();

    @objid ("b872975a-2711-4f71-af17-7f6da9be925c")
    void setOpposite(AssociationEnd value);

    @objid ("52ee7e93-d5ca-4621-9629-0644a5192510")
    EList<ObjectNode> getRepresentingObjectNode();

    @objid ("b85006bd-1451-4fb1-a3b9-afeee1276fb4")
    <T extends ObjectNode> List<T> getRepresentingObjectNode(java.lang.Class<T> filterClass);

    @objid ("31d7b756-9d5b-4663-a08b-bb39b33093cd")
    Association getAssociation();

    @objid ("a3ec2180-fd72-4060-8a87-5e549afd925d")
    void setAssociation(Association value);

    @objid ("e12d7dd7-2da9-478c-bf82-6d5cf086c776")
    EList<BpmnItemAwareElement> getRepresentingItem();

    @objid ("d25874b1-07e8-4ae9-8fcf-9e547f2be8bb")
    <T extends BpmnItemAwareElement> List<T> getRepresentingItem(java.lang.Class<T> filterClass);

}
