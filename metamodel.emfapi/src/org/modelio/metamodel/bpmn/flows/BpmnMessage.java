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
package org.modelio.metamodel.bpmn.flows;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.GeneralClass;

/**
 * BpmnMessage v0.0.9054
 * 
 * 
 * A Message represents the content of a communication between two Participants. In BPMN 2.0, a Message is a graphical object (it was a supporting element in BPMN 1.2). An ItemDefinition is used to specify the Message structure.
 * In a Process that is not used in a Collaboration, the communication is not displayed, but a Message can be defined for Activities that send and receive Messages (such as a Send Task?see Figure 8.33). Note that the display of Messages in a Process, Collaboration, or Choreography is optional.
 * 
 * Ownership:
 * A message belongs to a collaboration
 */
@objid ("007be7e2-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnMessage extends BpmnRootElement {
    @objid ("a6c6037b-a2f6-40fb-8378-84bf40692eea")
    public static final String MNAME = "BpmnMessage";

    /**
     * Getter for relation 'BpmnMessage->Type'
     * 
     * Metamodel description:
     * <i>UML type of the message. UML equivalant of 'ItemRef' association.</i>
     */
    @objid ("ec52af5a-826e-4ef2-a2a4-859ea1506ff1")
    GeneralClass getType();

    /**
     * Setter for relation 'BpmnMessage->Type'
     * 
     * Metamodel description:
     * <i>UML type of the message. UML equivalant of 'ItemRef' association.</i>
     */
    @objid ("e5229d7f-173b-4bd3-a969-8e97629a5193")
    void setType(GeneralClass value);

    /**
     * Getter for relation 'BpmnMessage->OutputMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("43e3ad96-1ffe-4f87-97eb-c50c50f4e593")
    EList<BpmnOperation> getOutputMessage();

    /**
     * Filtered Getter for relation 'BpmnMessage->OutputMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2840bc4e-0cbc-4c9a-8da4-75b854bf7e49")
    <T extends BpmnOperation> List<T> getOutputMessage(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnMessage->ItemRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a668c17b-e51a-4615-ad08-c1e341a60d39")
    BpmnItemDefinition getItemRef();

    /**
     * Setter for relation 'BpmnMessage->ItemRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("249f2d2d-e71b-4fc3-ad0a-0cf1093e57c5")
    void setItemRef(BpmnItemDefinition value);

    /**
     * Getter for relation 'BpmnMessage->InState'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("78d6f7d7-d003-4dc2-9d30-873a661b81fb")
    State getInState();

    /**
     * Setter for relation 'BpmnMessage->InState'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c9937556-abf4-4373-b22d-7a89816c483e")
    void setInState(State value);

    /**
     * Getter for relation 'BpmnMessage->EventDefinition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("824ada86-8d1c-4fc8-964d-ef46fdec4663")
    EList<BpmnMessageEventDefinition> getEventDefinition();

    /**
     * Filtered Getter for relation 'BpmnMessage->EventDefinition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("df51b2a4-9fb2-4fb4-bd30-bea5b4046e6e")
    <T extends BpmnMessageEventDefinition> List<T> getEventDefinition(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnMessage->Sender'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3ddf6342-639a-4e53-9132-d6f64f469eea")
    EList<BpmnSendTask> getSender();

    /**
     * Filtered Getter for relation 'BpmnMessage->Sender'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4325dc4d-d830-4266-a452-bbe3a4c52bcd")
    <T extends BpmnSendTask> List<T> getSender(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnMessage->InputMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5de3102a-8f42-4d6d-bd7a-899b9ea4bc48")
    EList<BpmnOperation> getInputMessage();

    /**
     * Filtered Getter for relation 'BpmnMessage->InputMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cfce1503-9b4f-4968-bdfc-7c566530dfbd")
    <T extends BpmnOperation> List<T> getInputMessage(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnMessage->Receiver'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0d119640-d6f6-4068-9c6d-4124da536b05")
    EList<BpmnReceiveTask> getReceiver();

    /**
     * Filtered Getter for relation 'BpmnMessage->Receiver'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("67fc1398-8e4d-4ef1-ab43-3adc26ee1547")
    <T extends BpmnReceiveTask> List<T> getReceiver(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnMessage->MessageFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5f930ab2-c3c1-4ee1-aa3e-a4e1dd303f69")
    EList<BpmnMessageFlow> getMessageFlow();

    /**
     * Filtered Getter for relation 'BpmnMessage->MessageFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c51ebc5a-ac37-4733-86db-cd6d715fee30")
    <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass);

}
