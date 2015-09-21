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
package org.modelio.metamodel.bpmn.gateways;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGatewayType;

/**
 * BpmnEventBasedGateway v0.0.9054
 * 
 * 
 * The Event-Based Gateway represents a branching point in the Process where the alternative paths that follow the Gateway are based on Events that occur, rather than the evaluation of Expressions using Process data (as with an Exclusive or Inclusive Gateway). A specific Event, usually the receipt of a Message, determines the path that will be taken. Basically, the decision is made by another Participant, based on data that is not visible to Process, thus, requiring the use of the Event-Based Gateway.
 * For example, if a company is waiting for a response from a customer they will perform one set of Activities if the customer responds ?Yes? and another set of Activities if the customer responds ?No.? The customer?s response determines which path is taken. The identity of the Message determines which path is taken. That is, the ?Yes? Message and the ?No? Message are different Messages?i.e., they are not the same Message with different values within a property of the Message. The receipt of the Message can be modeled with an Intermediate Event with a
 * Message Trigger or a Receive Task. In addition to Messages, other Triggers for Intermediate Events can be used, such as Timers.
 */
@objid ("0097e370-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnEventBasedGateway extends BpmnGateway {
    @objid ("122ef191-a6a8-457f-8276-f5ee1460d570")
    public static final String MNAME = "BpmnEventBasedGateway";

    /**
     * Getter for attribute 'BpmnEventBasedGateway.Instanciate'
     * 
     * Metamodel description:
     * <i>Event Gateways can be used to instantiate a Process. By default the Gateway?s instantiate attribute is false, but if set to true, then the Process is instantiated when the first Event of the Gateway?s configuration is triggered.</i>
     */
    @objid ("77df92fc-e803-4f09-9b44-25fb752f893f")
    boolean isInstanciate();

    /**
     * Setter for attribute 'BpmnEventBasedGateway.Instanciate'
     * 
     * Metamodel description:
     * <i>Event Gateways can be used to instantiate a Process. By default the Gateway?s instantiate attribute is false, but if set to true, then the Process is instantiated when the first Event of the Gateway?s configuration is triggered.</i>
     */
    @objid ("f9eb90a1-a35f-4810-8aae-11d904d896b8")
    void setInstanciate(boolean value);

    /**
     * Getter for attribute 'BpmnEventBasedGateway.EventGatewayType'
     * 
     * Metamodel description:
     * <i>The eventGatewayType determines the behavior of the Gateway when used to instantiate a Process (as described above).
     * </i>
     */
    @objid ("3b0888c3-3f9f-464e-bcdf-e2b90d6e3b4d")
    BpmnEventBasedGatewayType getEventGatewayType();

    /**
     * Setter for attribute 'BpmnEventBasedGateway.EventGatewayType'
     * 
     * Metamodel description:
     * <i>The eventGatewayType determines the behavior of the Gateway when used to instantiate a Process (as described above).
     * </i>
     */
    @objid ("9441c21d-2eaf-4da7-86a7-f88799b4de4e")
    void setEventGatewayType(BpmnEventBasedGatewayType value);

}
