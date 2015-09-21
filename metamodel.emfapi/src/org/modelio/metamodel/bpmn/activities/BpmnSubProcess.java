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
package org.modelio.metamodel.bpmn.activities;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;

/**
 * BpmnSubProcess v0.0.9054
 * 
 * 
 * A Sub-Process is an Activity whose internal details have been modeled using Activities, Gateways, Events, and Sequence Flow. A Sub-Process is a graphical object within a Process, but it also can be ?opened up? to show a lower-level Process. Sub-Processes define a contextual scope that can be used for attribute visibility, transactional scope, for the handling of exceptions, of Events, or for compensation. 
 * 
 * An Event Sub-Process may or may not occur while the parent Process is active, but it is possible that it will occur many times. Unlike a standard  Sub-Process, which uses the flow of the parent Process as a trigger, an Event Sub- Process has a Start Event with a trigger. Each time the Start Event is triggered while the parent Process is active, then the Event Sub-Process will start.
 */
@objid ("00843028-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnSubProcess extends BpmnActivity {
    @objid ("1218b437-a9f7-4124-b267-3cc031a14d4c")
    public static final String MNAME = "BpmnSubProcess";

    /**
     * Getter for attribute 'BpmnSubProcess.TriggeredByEvent'
     * 
     * Metamodel description:
     * <i>A flag that identifies whether this Sub-Process is an Event Sub-Process.
     * ? If false, then this Sub-Process is a normal Sub-Process.
     * ? If true, then this Sub-Process is an Event Sub-Process and is subject to additional constraints.</i>
     */
    @objid ("89b2bfa7-07ce-45e5-a62a-b558da62dc7b")
    boolean isTriggeredByEvent();

    /**
     * Setter for attribute 'BpmnSubProcess.TriggeredByEvent'
     * 
     * Metamodel description:
     * <i>A flag that identifies whether this Sub-Process is an Event Sub-Process.
     * ? If false, then this Sub-Process is a normal Sub-Process.
     * ? If true, then this Sub-Process is an Event Sub-Process and is subject to additional constraints.</i>
     */
    @objid ("c0c14818-a3bd-4a07-b0bc-be9fbb409a83")
    void setTriggeredByEvent(boolean value);

    /**
     * Getter for relation 'BpmnSubProcess->Artifact'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2783212e-e7ea-49de-9dc0-c15e417c31c3")
    EList<BpmnArtifact> getArtifact();

    /**
     * Filtered Getter for relation 'BpmnSubProcess->Artifact'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("129ba232-3b52-402a-852c-1e7ccf2e0f3e")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnSubProcess->FlowElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d674be52-1813-4965-855d-e22efbdd949c")
    EList<BpmnFlowElement> getFlowElement();

    /**
     * Filtered Getter for relation 'BpmnSubProcess->FlowElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a5ce14d6-0f89-4ad5-88b4-f8d464df3d7d")
    <T extends BpmnFlowElement> List<T> getFlowElement(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnSubProcess->LaneSet'
     * 
     * Metamodel description:
     * <i>laneset of the process. The process is represented in this cas by a pool which is decomposed by lansets and lanes.</i>
     */
    @objid ("c861c38f-5286-4a8f-b136-31e5009da49b")
    EList<BpmnLaneSet> getLaneSet();

    /**
     * Filtered Getter for relation 'BpmnSubProcess->LaneSet'
     * 
     * Metamodel description:
     * <i>laneset of the process. The process is represented in this cas by a pool which is decomposed by lansets and lanes.</i>
     */
    @objid ("5b13a97f-7602-4502-a067-2b0f5b5760d5")
    <T extends BpmnLaneSet> List<T> getLaneSet(java.lang.Class<T> filterClass);

}
