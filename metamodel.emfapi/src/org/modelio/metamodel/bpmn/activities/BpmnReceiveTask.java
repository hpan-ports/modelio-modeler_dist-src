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
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.uml.statik.Operation;

/**
 * BpmnReceiveTask v0.0.9054
 * 
 * 
 * A Receive Task is a simple Task that is designed to wait for a Message to arrive from an external Participant (relative to the Process). Once the Message has been received, the Task is completed.
 * The actual Participant from which the Message is received can be identified by connecting the Receive Task to a Participant using a Message Flow within the definitional Collaboration of the Process.
 * 
 * A Receive Task is often used to start a Process. In a sense, the Process is bootstrapped by the receipt of the Message. In order for the Task to Instantiate the Process it must meet one of the following conditions:
 * - The Process does not have a Start Event and the Receive Task has no incoming Sequence Flow.
 * - The incoming Sequence Flow for the Receive Task has a source of a Start Event.
 * - Note that no other incoming Sequence Flow are allowed for that Receive Task (in particular, a loop
 * connection from a downstream object).
 */
@objid ("008180d0-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnReceiveTask extends BpmnTask {
    @objid ("903d53cf-92a9-42f6-8d36-a596e6d98590")
    public static final String MNAME = "BpmnReceiveTask";

    /**
     * Getter for attribute 'BpmnReceiveTask.Implementation'
     * 
     * Metamodel description:
     * <i>This attribute specifies the technology that will be used to send and receive the Messages. 
     * 
     * Valid values are "##unspecified" for leaving the implementation technology open, "##WebService" for the Web service technology or a URI identifying any other technology or coordination protocol.
     * 
     * A Web service is the default technology.</i>
     */
    @objid ("87a041ca-9efc-42ec-99be-8541c9ffba60")
    String getImplementation();

    /**
     * Setter for attribute 'BpmnReceiveTask.Implementation'
     * 
     * Metamodel description:
     * <i>This attribute specifies the technology that will be used to send and receive the Messages. 
     * 
     * Valid values are "##unspecified" for leaving the implementation technology open, "##WebService" for the Web service technology or a URI identifying any other technology or coordination protocol.
     * 
     * A Web service is the default technology.</i>
     */
    @objid ("a57a1789-aabe-4160-874f-9979f0f76c8b")
    void setImplementation(String value);

    /**
     * Getter for attribute 'BpmnReceiveTask.Instanciate'
     * 
     * Metamodel description:
     * <i>Receive Tasks can be defined as the instantiation mechanism for the Process with the instantiate attribute. 
     * 
     * This attribute MAY be set to true if the Task is the first Activity (i.e., there are no incoming Sequence Flows). 
     * 
     * Multiple Tasks MAY have this attribute set to true.</i>
     */
    @objid ("745ef8d8-5449-4fae-bb5f-27c32836df51")
    boolean isInstanciate();

    /**
     * Setter for attribute 'BpmnReceiveTask.Instanciate'
     * 
     * Metamodel description:
     * <i>Receive Tasks can be defined as the instantiation mechanism for the Process with the instantiate attribute. 
     * 
     * This attribute MAY be set to true if the Task is the first Activity (i.e., there are no incoming Sequence Flows). 
     * 
     * Multiple Tasks MAY have this attribute set to true.</i>
     */
    @objid ("ebff1f92-f319-488a-bcb1-b2634308f4f6")
    void setInstanciate(boolean value);

    /**
     * Getter for relation 'BpmnReceiveTask->MessageRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("535f0bd2-0734-4a92-843c-617f7ae701d5")
    BpmnMessage getMessageRef();

    /**
     * Setter for relation 'BpmnReceiveTask->MessageRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("40890227-4247-4a6d-ae8b-c2a53bd221de")
    void setMessageRef(BpmnMessage value);

    /**
     * Getter for relation 'BpmnReceiveTask->OperationRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fc7613ba-f7b3-4a94-bf31-aac05f961170")
    BpmnOperation getOperationRef();

    /**
     * Setter for relation 'BpmnReceiveTask->OperationRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e23c0e4a-57ac-4c58-a813-83bf454c1fea")
    void setOperationRef(BpmnOperation value);

    /**
     * Getter for relation 'BpmnReceiveTask->CalledOperation'
     * 
     * Metamodel description:
     * <i>specifies the operation that is invoked</i>
     */
    @objid ("4899484d-cca7-4a8c-b082-90fd1daf8104")
    Operation getCalledOperation();

    /**
     * Setter for relation 'BpmnReceiveTask->CalledOperation'
     * 
     * Metamodel description:
     * <i>specifies the operation that is invoked</i>
     */
    @objid ("9479975b-fd01-4168-ae17-050a2783b05d")
    void setCalledOperation(Operation value);

}
