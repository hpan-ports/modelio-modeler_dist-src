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

/**
 * BpmnEscalationEventDefinition v0.0.9054
 * 
 * 
 * Event corresponding to an escalation.
 */
@objid ("008be606-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnEscalationEventDefinition extends BpmnEventDefinition {
    @objid ("ba05d29f-abb6-4564-ba9c-028a16a45577")
    public static final String MNAME = "BpmnEscalationEventDefinition";

    /**
     * Getter for attribute 'BpmnEscalationEventDefinition.EscalationCode'
     * 
     * Metamodel description:
     * <i>For an End Event:
     * If the Result is an Escalation, then the escalationCode MUST be supplied (if the processType attribute of the Process is set to executable).
     * This ?throws? the Escalation.
     * For an Intermediate Event within normal flow:
     * If the trigger is an Escalation, then the escalationCode MUST be entered (if the processType attribute of the Process is set to executable).
     * This ?throws? the Escalation.
     * For an Intermediate Event attached to the boundary of an Activity: 
     * If the trigger is an Escalation, then the escalationCode MAY be entered.
     * This Event ?catches? the Escalation. If there is no escalationCode, then any Escalation SHALL trigger the Event. If there is an escalationCode, then only an Escalation that matches the escalationCode SHALL trigger the Event.</i>
     */
    @objid ("7460ac98-2aeb-42b2-8ff2-dc6076fae9d3")
    String getEscalationCode();

    /**
     * Setter for attribute 'BpmnEscalationEventDefinition.EscalationCode'
     * 
     * Metamodel description:
     * <i>For an End Event:
     * If the Result is an Escalation, then the escalationCode MUST be supplied (if the processType attribute of the Process is set to executable).
     * This ?throws? the Escalation.
     * For an Intermediate Event within normal flow:
     * If the trigger is an Escalation, then the escalationCode MUST be entered (if the processType attribute of the Process is set to executable).
     * This ?throws? the Escalation.
     * For an Intermediate Event attached to the boundary of an Activity: 
     * If the trigger is an Escalation, then the escalationCode MAY be entered.
     * This Event ?catches? the Escalation. If there is no escalationCode, then any Escalation SHALL trigger the Event. If there is an escalationCode, then only an Escalation that matches the escalationCode SHALL trigger the Event.</i>
     */
    @objid ("4af2791e-9f38-465b-a478-d022cde44c14")
    void setEscalationCode(String value);

}
