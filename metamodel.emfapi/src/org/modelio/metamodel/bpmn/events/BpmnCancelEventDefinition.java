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
 * BpmnCancelEventDefinition v0.0.9054
 * 
 * 
 * Cancel Events are only used in the context of modeling Transaction Sub-Processes. There are two (2) variations: a catch Intermediate Event and an End Event.
 * - The catch Cancel Intermediate Event MUST only be attached to the boundary of a Transaction Sub-Process and, thus, MAY NOT be used in normal flow.
 * - The Cancel End Event MUST only be used within a Transaction Sub-Process and, thus, MAY NOT be used in any other type of Sub-Process or Process.
 */
@objid ("0087fdd4-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnCancelEventDefinition extends BpmnEventDefinition {
    @objid ("ed39bab6-263c-4f51-bc3d-0e94869c24fb")
    public static final String MNAME = "BpmnCancelEventDefinition";

}
