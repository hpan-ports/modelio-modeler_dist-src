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
package org.modelio.metamodel.bpmn.bpmnService;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.uml.statik.Operation;

/**
 * BpmnOperation v0.0.9054
 * 
 * 
 * null
 */
@objid ("000d4990-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnOperation extends BpmnBaseElement {
    @objid ("69e14f4e-9d83-47d6-804e-63bdbeeb7e7c")
    public static final String MNAME = "BpmnOperation";

    /**
     * Getter for relation 'BpmnOperation->Sender'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("76c5fae6-7146-4386-8035-e9cd766f99c5")
    EList<BpmnSendTask> getSender();

    /**
     * Filtered Getter for relation 'BpmnOperation->Sender'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d85fa56c-314d-4ec4-8daa-a68224d5e988")
    <T extends BpmnSendTask> List<T> getSender(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnOperation->InMessageRef'
     * 
     * Metamodel description:
     * <i>specifies the input Message of the Operation. An Operation has exactly one input Message. </i>
     */
    @objid ("f491ce5a-2171-4b3f-8a7e-47f1bac0b424")
    BpmnMessage getInMessageRef();

    /**
     * Setter for relation 'BpmnOperation->InMessageRef'
     * 
     * Metamodel description:
     * <i>specifies the input Message of the Operation. An Operation has exactly one input Message. </i>
     */
    @objid ("1285377e-72aa-42d7-b308-932d90f82031")
    void setInMessageRef(BpmnMessage value);

    /**
     * Getter for relation 'BpmnOperation->Caller'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("49a55b64-e5d9-4957-a8c3-721205023b39")
    EList<BpmnServiceTask> getCaller();

    /**
     * Filtered Getter for relation 'BpmnOperation->Caller'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("dd4276d7-bc9d-4936-82f2-90299e3e30fa")
    <T extends BpmnServiceTask> List<T> getCaller(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnOperation->OutMessageRef'
     * 
     * Metamodel description:
     * <i>specifies the output Message of the Operation. An Operation has at most one input Message.</i>
     */
    @objid ("03d9b7fa-4751-43b9-9887-46a5ffac81d9")
    BpmnMessage getOutMessageRef();

    /**
     * Setter for relation 'BpmnOperation->OutMessageRef'
     * 
     * Metamodel description:
     * <i>specifies the output Message of the Operation. An Operation has at most one input Message.</i>
     */
    @objid ("a8c16f58-2abf-43ca-b17f-09249d17e29e")
    void setOutMessageRef(BpmnMessage value);

    /**
     * Getter for relation 'BpmnOperation->EventDefinition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5f5f80a5-df25-4806-8d25-87af0c88114f")
    EList<BpmnMessageEventDefinition> getEventDefinition();

    /**
     * Filtered Getter for relation 'BpmnOperation->EventDefinition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("269366b2-52d2-475d-a02b-8fa9ef5038a4")
    <T extends BpmnMessageEventDefinition> List<T> getEventDefinition(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnOperation->ImplementationRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e63dcc6a-6fe1-4a7a-ade3-d4754865bb79")
    Operation getImplementationRef();

    /**
     * Setter for relation 'BpmnOperation->ImplementationRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8b633c87-9332-4ad4-b841-40c618b4f295")
    void setImplementationRef(Operation value);

    /**
     * Getter for relation 'BpmnOperation->BpmnInterfaceRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("78c84324-d6d9-4989-92d5-c856f8d94845")
    BpmnInterface getBpmnInterfaceRef();

    /**
     * Setter for relation 'BpmnOperation->BpmnInterfaceRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("79d22768-08d1-4447-97dd-e7107bb4fca1")
    void setBpmnInterfaceRef(BpmnInterface value);

    /**
     * Getter for relation 'BpmnOperation->Receiver'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f284836e-c0d2-46b1-a999-4a0be0cd49ff")
    EList<BpmnReceiveTask> getReceiver();

    /**
     * Filtered Getter for relation 'BpmnOperation->Receiver'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e5c0f592-abb9-456e-9968-a3c790e7bdec")
    <T extends BpmnReceiveTask> List<T> getReceiver(java.lang.Class<T> filterClass);

}
