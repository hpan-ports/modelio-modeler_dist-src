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
 * BpmnErrorEventDefinition v0.0.9054
 * 
 * 
 * Event definition for an error.
 */
@objid ("008b3af8-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnErrorEventDefinition extends BpmnEventDefinition {
    @objid ("8fd10057-2907-45a6-9fae-ac6c6bac5328")
    public static final String MNAME = "BpmnErrorEventDefinition";

    /**
     * Getter for attribute 'BpmnErrorEventDefinition.ErrorCode'
     * 
     * Metamodel description:
     * <i>For an End Event:
     * If the result is an Error, then the errorCode MUST be supplied (if the processType attribute of the Process is set to executable) This ?throws? the Error.
     * For an Intermediate Event within normal flow:
     * If the Trigger is an Error, then the errorCode MUST be entered (if the processType attribute of the Process is set to executable). This ?throws? the Error.
     * For an Intermediate Event attached to the boundary of an Activity:
     * If the Trigger is an Error, then the errorCode MAY be entered. This Event ?catches? the Error. If there is no errorCode, then any error SHALL trigger the Event. If there is an errorCode, then only an Error that matches the errorCode SHALL trigger the Event.</i>
     */
    @objid ("5373c428-32d8-4d9c-b83f-30df4ca1df5c")
    String getErrorCode();

    /**
     * Setter for attribute 'BpmnErrorEventDefinition.ErrorCode'
     * 
     * Metamodel description:
     * <i>For an End Event:
     * If the result is an Error, then the errorCode MUST be supplied (if the processType attribute of the Process is set to executable) This ?throws? the Error.
     * For an Intermediate Event within normal flow:
     * If the Trigger is an Error, then the errorCode MUST be entered (if the processType attribute of the Process is set to executable). This ?throws? the Error.
     * For an Intermediate Event attached to the boundary of an Activity:
     * If the Trigger is an Error, then the errorCode MAY be entered. This Event ?catches? the Error. If there is no errorCode, then any error SHALL trigger the Event. If there is an errorCode, then only an Error that matches the errorCode SHALL trigger the Event.</i>
     */
    @objid ("3fbbed6d-2802-4b25-a539-8cb7e4efc41b")
    void setErrorCode(String value);

}
