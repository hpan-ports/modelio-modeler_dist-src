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
 * BpmnIntermediateCatchEvent v0.0.9054
 * 
 * 
 * the Intermediate Event indicates where something happens (an Event) somewhere between the
 * start and end of a Process. It will affect the flow of the Process, but will not start or (directly) terminate the Process.
 * Intermediate Events can be used to:
 * ? Show where Messages are expected or sent within the Process,
 * ? Show delays are expected within the Process,
 * ? Disrupt the normal flow through exception handling, or
 * ? Show the extra work required for compensation.
 */
@objid ("008ea3be-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnIntermediateCatchEvent extends BpmnCatchEvent {
    @objid ("61eb5feb-f4b5-4e58-a1ea-d34895feee6a")
    public static final String MNAME = "BpmnIntermediateCatchEvent";

}
