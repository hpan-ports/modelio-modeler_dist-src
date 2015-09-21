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
package org.modelio.metamodel.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * BpmnLane v0.0.9054
 * 
 * 
 * A Lane element defines one specific partition in a LaneSet. The Lane can define a partition element which specifies the value and element type, a tool can use to determine the list of Flow Elements to be partitioned into this Lane.
 * 
 * Ownership:
 * A Lane belongs to a LaneSet
 */
@objid ("00746c56-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnLane extends BpmnBaseElement {
    @objid ("40fd650d-cb98-4541-aba6-0cb4447940a3")
    public static final String MNAME = "BpmnLane";

    /**
     * Getter for relation 'BpmnLane->ChildLaneSet'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1cbc9c6c-111e-44f1-b666-eace7e81e0bc")
    BpmnLaneSet getChildLaneSet();

    /**
     * Setter for relation 'BpmnLane->ChildLaneSet'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("729f1486-ac13-47ad-8081-9d7ebd7d5199")
    void setChildLaneSet(BpmnLaneSet value);

    /**
     * Getter for relation 'BpmnLane->PartitionElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b30db3b8-c41a-4abe-806e-e0d76077b58e")
    ModelElement getPartitionElement();

    /**
     * Setter for relation 'BpmnLane->PartitionElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d05cdfd7-5241-4e16-a8b9-cc7499990bbf")
    void setPartitionElement(ModelElement value);

    /**
     * Getter for relation 'BpmnLane->FlowElementRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("630a7aba-a7fc-4846-9bca-30bd76590a47")
    EList<BpmnFlowElement> getFlowElementRef();

    /**
     * Filtered Getter for relation 'BpmnLane->FlowElementRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b1f9ad59-acb9-4b68-87f6-539105490d44")
    <T extends BpmnFlowElement> List<T> getFlowElementRef(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnLane->LaneSet'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("27e6b878-7c5b-475f-a55a-a0e507137f5b")
    BpmnLaneSet getLaneSet();

    /**
     * Setter for relation 'BpmnLane->LaneSet'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("613e2761-6bbb-4e92-9dec-7fa98910f9f1")
    void setLaneSet(BpmnLaneSet value);

}
