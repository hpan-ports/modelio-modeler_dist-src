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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;

/**
 * BpmnEvent v0.0.9054
 * 
 * 
 * An Event is something that ?happens? during the course of a Process. These Events affect the flow of the Process and usually have a cause or an impact and in general require or allow for a reaction. The term ?event? is general enough to cover many things in a Process. The start of an Activity, the end of an Activity, the change of state of a document, a Message that arrives, etc., all could be considered Events.
 * Events allow for the description of ?event-driven? Processes. In these Processes, There are three main types of Events:
 * ? Start Events, which indicate where a Process will start.
 * ? End Events, which indicate where a path of a Process will end.
 * ? Intermediate Events, which indicate where something happens somewhere between the start and end of a Process.
 * Within these three types, Events come in two flavors:
 * ? Events that catch a Trigger. All Start Events and some Intermediate Events are catching Events.
 * ? Events that throw a Result. All End Events and some Intermediate Events are throwing Events that may eventually be caught by another Event. Typically the Trigger carries information out of the scope where the throw Event occurred into the scope of the catching Events. The throwing of a trigger may be either implicit as defined by this standard or an extension to it or explicit by a throw Event.
 * 
 * Ownership
 * Events belong to Flow element containers or subprocesses
 */
@objid ("008c8ed0-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnEvent extends BpmnFlowNode {
    @objid ("0ba2c516-61b1-4736-be02-e7de2a890f3f")
    public static final String MNAME = "BpmnEvent";

    /**
     * Getter for relation 'BpmnEvent->EventDefinitions'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3c2aaee1-b4cf-464f-b3ec-2a8cf6313dba")
    EList<BpmnEventDefinition> getEventDefinitions();

    /**
     * Filtered Getter for relation 'BpmnEvent->EventDefinitions'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6857cb9d-d493-4671-8f57-511a357b1e73")
    <T extends BpmnEventDefinition> List<T> getEventDefinitions(java.lang.Class<T> filterClass);

}
