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
 * BpmnStartEvent v0.0.9054
 * 
 * 
 * the Start Event indicates where a particular Process will start. In terms of Sequence Flow, the
 * Start Event starts the flow of the Process, and thus, will not have any incoming Sequence Flow?no Sequence Flow can connect to a Start Event.
 */
@objid ("00924686-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnStartEvent extends BpmnCatchEvent {
    @objid ("16720878-5297-445f-8180-dea3f3ac224a")
    public static final String MNAME = "BpmnStartEvent";

    /**
     * Getter for attribute 'BpmnStartEvent.IsInterrupting'
     * 
     * Metamodel description:
     * <i>This attribute only applies to Start Events of Event Sub-Processes; it is ignored for other Start Events. This attribute denotes whether the Sub-Process encompassing the Event Sub-Process should be cancelled or not, If the encompassing Sub-Process is not cancelled, multiple instances of the Event Sub-Process can run concurrently. This attribute cannot be applied to Error Events (where it?s always true), or Compensation Events (where it doesn?t apply).</i>
     */
    @objid ("532a4615-49b4-4247-bf84-951efe4bf935")
    boolean isIsInterrupting();

    /**
     * Setter for attribute 'BpmnStartEvent.IsInterrupting'
     * 
     * Metamodel description:
     * <i>This attribute only applies to Start Events of Event Sub-Processes; it is ignored for other Start Events. This attribute denotes whether the Sub-Process encompassing the Event Sub-Process should be cancelled or not, If the encompassing Sub-Process is not cancelled, multiple instances of the Event Sub-Process can run concurrently. This attribute cannot be applied to Error Events (where it?s always true), or Compensation Events (where it doesn?t apply).</i>
     */
    @objid ("7b3fe6fb-17e7-4b49-bfb7-040efda93780")
    void setIsInterrupting(boolean value);

}
