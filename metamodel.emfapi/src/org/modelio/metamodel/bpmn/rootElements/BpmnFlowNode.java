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
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;

/**
 * BpmnFlowNode v0.0.9054
 * 
 * 
 * FlowNodes represent nodes interconnected using sequence flows or message flows.
 * 
 * Ownership
 * FlowNodes belong to a FlowElementContainer or a sub process
 */
@objid ("0079b594-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnFlowNode extends BpmnFlowElement {
    @objid ("8ae72dc8-e705-40d5-befd-fbdaf3c351e2")
    public static final String MNAME = "BpmnFlowNode";

    /**
     * Getter for relation 'BpmnFlowNode->Outgoing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("47db958c-c3c4-4ac5-a9d4-d0b9602db769")
    EList<BpmnSequenceFlow> getOutgoing();

    /**
     * Filtered Getter for relation 'BpmnFlowNode->Outgoing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fa5b1030-e096-407f-92d3-a21da9c4dcdf")
    <T extends BpmnSequenceFlow> List<T> getOutgoing(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnFlowNode->Resource'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e774b130-2d40-4040-8a2f-070402721fac")
    EList<BpmnResourceRole> getResource();

    /**
     * Filtered Getter for relation 'BpmnFlowNode->Resource'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("78fb57db-75b5-4efc-9b98-62f7d5a8eac6")
    <T extends BpmnResourceRole> List<T> getResource(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnFlowNode->Incoming'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("733354c8-96d0-49f0-947d-56e7b4981dc4")
    EList<BpmnSequenceFlow> getIncoming();

    /**
     * Filtered Getter for relation 'BpmnFlowNode->Incoming'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("78f541ad-4d35-4f6f-8fdc-eec9630cf01e")
    <T extends BpmnSequenceFlow> List<T> getIncoming(java.lang.Class<T> filterClass);

}
