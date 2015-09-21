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
package org.modelio.metamodel.bpmn.bpmnDiagrams;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.diagrams.BehaviorDiagram;

/**
 * BpmnSubProcessDiagram v0.0.9054
 * 
 * 
 * Diagram dedicated to subprocesses. A sub process can be collapsed, in that case, a separated SubProcessDiagram is created. If it is expanded, then the elements are drawn within the subprocess inside the process-collaboration diagram. 
 * 
 * SubProcess Diagrams contain a subset of the elements that supports a collaboration-process diagram: in particular, elements specific to collaboration, such as message flow, participants, pools and lanes are not presented in SubProcessDiagrams.
 */
@objid ("000c897e-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnSubProcessDiagram extends BehaviorDiagram {
    @objid ("0661679c-784b-497b-968f-0af52cc32a9e")
    public static final String MNAME = "BpmnSubProcessDiagram";

}
