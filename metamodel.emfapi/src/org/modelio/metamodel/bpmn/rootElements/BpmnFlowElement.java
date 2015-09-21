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
package org.modelio.metamodel.bpmn.rootElements;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnGroup;

/**
 * BpmnFlowElement v0.0.9054
 * 
 * 
 * FlowElement is the abstract super class for all elements that can appear in a Process flow, which are FlowNodes - which consist of Activities, Choreography Activities  Gateways, and Events - Data Objects, Data Associations, and Sequence Flow.
 * 
 * Ownership:
 * A FlowElement belongs to an Element Container or a SubProcess
 */
@objid ("00792098-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnFlowElement extends BpmnBaseElement {
    @objid ("d25790a6-4d9f-44eb-a3ca-4051562f0be8")
    public static final String MNAME = "BpmnFlowElement";

    /**
     * Getter for relation 'BpmnFlowElement->Groups'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7c23cbeb-c54f-4d1e-b824-c0af3cec945c")
    EList<BpmnGroup> getGroups();

    /**
     * Filtered Getter for relation 'BpmnFlowElement->Groups'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("854dda84-2a92-4b0e-b433-422adbb02e88")
    <T extends BpmnGroup> List<T> getGroups(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnFlowElement->SubProcess'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3175b192-38f7-4d52-8036-efaeef59bf4f")
    BpmnSubProcess getSubProcess();

    /**
     * Setter for relation 'BpmnFlowElement->SubProcess'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fdaea8be-97c9-4f99-b493-3b9aab270ad9")
    void setSubProcess(BpmnSubProcess value);

    /**
     * Getter for relation 'BpmnFlowElement->Lane'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6b23987f-274d-4df7-8885-e39693269544")
    EList<BpmnLane> getLane();

    /**
     * Filtered Getter for relation 'BpmnFlowElement->Lane'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("088d4238-1eec-4114-898e-24e5d0cf929c")
    <T extends BpmnLane> List<T> getLane(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnFlowElement->Container'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2a6ec1ab-2215-4306-9ad5-0aaaa94c67b8")
    BpmnProcess getContainer();

    /**
     * Setter for relation 'BpmnFlowElement->Container'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2e8b1a23-6ff4-4a21-ad29-fe333346bee1")
    void setContainer(BpmnProcess value);

}
