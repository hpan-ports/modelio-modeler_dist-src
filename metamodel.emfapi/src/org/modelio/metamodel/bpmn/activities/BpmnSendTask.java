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
 * BpmnSendTask v0.0.9054
 * 
 * 
 * A Send Task is a simple Task that is designed to send a Message to an external Participant (relative to the Process). Once the Message has been sent, the Task is completed.
 * The actual Participant which the Message is sent can be identified by connecting the Send Task to a Participant using a Message Flow within the definitional Collaboration of the Process
 */
@objid ("00828728-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnSendTask extends BpmnTask {
    @objid ("b6548cb1-365c-43ce-b512-1a8843c61d29")
    public static final String MNAME = "BpmnSendTask";

    /**
     * Getter for attribute 'BpmnSendTask.Implementation'
     * 
     * Metamodel description:
     * <i>This attribute specifies the technology that will be used to send and receive the Messages. 
     * 
     * Valid values are "##unspecified" for leaving the implementation technology open, "##WebService" for the Web service technology or a URI identifying any other technology or coordination protocol.
     * 
     * A Web service is the default technology.</i>
     */
    @objid ("304f2406-c531-48aa-9caa-2191814ce753")
    String getImplementation();

    /**
     * Setter for attribute 'BpmnSendTask.Implementation'
     * 
     * Metamodel description:
     * <i>This attribute specifies the technology that will be used to send and receive the Messages. 
     * 
     * Valid values are "##unspecified" for leaving the implementation technology open, "##WebService" for the Web service technology or a URI identifying any other technology or coordination protocol.
     * 
     * A Web service is the default technology.</i>
     */
    @objid ("72b330fe-6f73-4d3b-ad9f-65082b58cbe7")
    void setImplementation(String value);

    /**
     * Getter for relation 'BpmnSendTask->MessageRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("61121f3f-b41e-4844-a293-e64675644cba")
    BpmnMessage getMessageRef();

    /**
     * Setter for relation 'BpmnSendTask->MessageRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ad216e0e-b82e-456b-866b-31f4c1ff191f")
    void setMessageRef(BpmnMessage value);

    /**
     * Getter for relation 'BpmnSendTask->OperationRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b7d20def-b56b-462b-bf56-7e15a6757cc0")
    BpmnOperation getOperationRef();

    /**
     * Setter for relation 'BpmnSendTask->OperationRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2b30578e-231c-48cf-bc8d-2e5c15f7b28d")
    void setOperationRef(BpmnOperation value);

    /**
     * Getter for relation 'BpmnSendTask->CalledOperation'
     * 
     * Metamodel description:
     * <i>specifies the operation that is invoked</i>
     */
    @objid ("09eae3a4-fef5-4962-966d-5fece3e0f9f3")
    Operation getCalledOperation();

    /**
     * Setter for relation 'BpmnSendTask->CalledOperation'
     * 
     * Metamodel description:
     * <i>specifies the operation that is invoked</i>
     */
    @objid ("b4c3fd2f-6c9e-4d05-b765-0f6e9c151736")
    void setCalledOperation(Operation value);

}
