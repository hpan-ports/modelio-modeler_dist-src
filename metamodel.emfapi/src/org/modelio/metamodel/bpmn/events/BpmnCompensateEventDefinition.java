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
 * BpmnCompensateEventDefinition v0.0.9054
 * 
 * 
 * Compensation Events are used in the context of triggering or handling compensation. There are four (4) variations: a Start Event, both a catch and throw Intermediate Event, and an End Event.
 * - The Compensation Start Event MAY NOT be used for a top-level Process.
 * - The Compensation Start Event MAY be used for an Event Sub-Process.
 * - The catch Compensation Intermediate Event MUST only be attached to the boundary of an Activity and, thus, MAY NOT be used in normal flow.
 * - The throw Compensation Intermediate Event MAY be used in normal flow.
 * - The Compensation End Event MAY be used within any Sub-Process or Process.
 */
@objid ("008944c8-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnCompensateEventDefinition extends BpmnEventDefinition {
    @objid ("de02c043-9fc4-4925-bc6c-658105113d3b")
    public static final String MNAME = "BpmnCompensateEventDefinition";

    /**
     * Getter for relation 'BpmnCompensateEventDefinition->ActivityRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("98b00873-9242-472a-8982-eebe6d27d674")
    BpmnActivity getActivityRef();

    /**
     * Setter for relation 'BpmnCompensateEventDefinition->ActivityRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b0e2f08e-dab1-4230-af66-5b25f754d7d3")
    void setActivityRef(BpmnActivity value);

}
