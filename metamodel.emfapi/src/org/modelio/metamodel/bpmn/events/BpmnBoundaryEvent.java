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
import org.modelio.metamodel.bpmn.activities.BpmnActivity;

/**
 * BpmnBoundaryEvent v0.0.9054
 * 
 * 
 * Event attached to the boundary of an activity. 
 */
@objid ("00875c94-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnBoundaryEvent extends BpmnCatchEvent {
    @objid ("0455acf5-4f8e-4742-9b22-66426853a05b")
    public static final String MNAME = "BpmnBoundaryEvent";

    /**
     * Getter for attribute 'BpmnBoundaryEvent.CancelActivity'
     * 
     * Metamodel description:
     * <i>Denotes whether the Activity should be cancelled or not, i.e., whether the boundary catch Event acts as an Error or an Escalation. If the Activity is not cancelled, multiple instances of that handler can run concurrently.
     * This attribute cannot be applied to Error Events (where it?s always true), or Compensation Events (where it doesn?t apply).</i>
     */
    @objid ("b8b78516-54c5-4b13-b655-da6385ecf3da")
    boolean isCancelActivity();

    /**
     * Setter for attribute 'BpmnBoundaryEvent.CancelActivity'
     * 
     * Metamodel description:
     * <i>Denotes whether the Activity should be cancelled or not, i.e., whether the boundary catch Event acts as an Error or an Escalation. If the Activity is not cancelled, multiple instances of that handler can run concurrently.
     * This attribute cannot be applied to Error Events (where it?s always true), or Compensation Events (where it doesn?t apply).</i>
     */
    @objid ("687f2859-c460-4a19-a03e-a3f3d8fc0e10")
    void setCancelActivity(boolean value);

    /**
     * Getter for relation 'BpmnBoundaryEvent->AttachedToRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3204b317-8bbd-41a3-b287-a9e439fc896d")
    BpmnActivity getAttachedToRef();

    /**
     * Setter for relation 'BpmnBoundaryEvent->AttachedToRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("468a973a-3754-465e-acff-db2f5bfb8eb4")
    void setAttachedToRef(BpmnActivity value);

}
