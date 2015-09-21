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
 * BpmnTimerEventDefinition v0.0.9054
 * 
 * 
 * Event corresponding to a timer event, such as the end of a duration
 */
@objid ("00965cf8-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnTimerEventDefinition extends BpmnEventDefinition {
    @objid ("75821be3-2dcc-415d-b602-d1b809912357")
    public static final String MNAME = "BpmnTimerEventDefinition";

    /**
     * Getter for attribute 'BpmnTimerEventDefinition.TimeCycle'
     * 
     * Metamodel description:
     * <i>If the trigger is a Timer, then a timeCycle MAY be entered. If a timeCycle is not entered, then a timeDate MUST be entered (see attribute above?if the processType attribute of the Process is set to executable).</i>
     */
    @objid ("13863791-3f15-45b4-8e61-ae6036219538")
    String getTimeCycle();

    /**
     * Setter for attribute 'BpmnTimerEventDefinition.TimeCycle'
     * 
     * Metamodel description:
     * <i>If the trigger is a Timer, then a timeCycle MAY be entered. If a timeCycle is not entered, then a timeDate MUST be entered (see attribute above?if the processType attribute of the Process is set to executable).</i>
     */
    @objid ("4983387d-f775-430a-ade9-3847affd3ddc")
    void setTimeCycle(String value);

    /**
     * Getter for attribute 'BpmnTimerEventDefinition.TimeD'
     * 
     * Metamodel description:
     * <i>If the trigger is a Timer, then a timeDate MAY be entered. If a timeDate is not entered, then a timeCycle MUST be entered (see attribute below?if the processType attribute of the Process is set to executable).</i>
     */
    @objid ("5eeeff18-4d38-4a09-b147-f385c031abb4")
    String getTimeD();

    /**
     * Setter for attribute 'BpmnTimerEventDefinition.TimeD'
     * 
     * Metamodel description:
     * <i>If the trigger is a Timer, then a timeDate MAY be entered. If a timeDate is not entered, then a timeCycle MUST be entered (see attribute below?if the processType attribute of the Process is set to executable).</i>
     */
    @objid ("03dbab0a-fc2a-486e-bf14-4198d94e502d")
    void setTimeD(String value);

}
