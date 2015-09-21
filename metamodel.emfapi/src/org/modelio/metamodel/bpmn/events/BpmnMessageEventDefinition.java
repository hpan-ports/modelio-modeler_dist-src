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
package org.modelio.metamodel.bpmn.events;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;

/**
 * BpmnMessageEventDefinition v0.0.9054
 * 
 * 
 * Specifies the receive or sending of a message.
 */
@objid ("0090c6e4-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnMessageEventDefinition extends BpmnEventDefinition {
    @objid ("0b5b9398-203c-496f-b328-ec8e6a4c8eed")
    public static final String MNAME = "BpmnMessageEventDefinition";

    /**
     * Getter for relation 'BpmnMessageEventDefinition->MessageRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9d72e5ed-5c31-4697-a660-002e5e72a7d0")
    BpmnMessage getMessageRef();

    /**
     * Setter for relation 'BpmnMessageEventDefinition->MessageRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("61546f8e-21aa-478b-807d-28e331ba98dd")
    void setMessageRef(BpmnMessage value);

    /**
     * Getter for relation 'BpmnMessageEventDefinition->OperationRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ba461b71-ec69-411b-ba66-8d90f807b406")
    BpmnOperation getOperationRef();

    /**
     * Setter for relation 'BpmnMessageEventDefinition->OperationRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d43de766-6aea-49e6-b5d3-66cc916be757")
    void setOperationRef(BpmnOperation value);

}
