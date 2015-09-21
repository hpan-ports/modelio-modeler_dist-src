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
package org.modelio.metamodel.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

/**
 * BpmnLaneSet v0.0.9054
 * 
 * 
 * The LaneSet element defines the container for one or more Lanes. A Process can contain one or more LaneSets.
 * Each LaneSet and its Lanes can partition the Flow Elements in a different way.
 * 
 * Ownership:
 * A LaneSet belongs to a process, or to a Lane.
 */
@objid ("0074fd92-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnLaneSet extends BpmnBaseElement {
    @objid ("683df1d6-d9d6-4118-b666-9c8a6e5e49dd")
    public static final String MNAME = "BpmnLaneSet";

    /**
     * Getter for relation 'BpmnLaneSet->Lane'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("746742ea-0bbf-440f-9a6c-fbae72587827")
    EList<BpmnLane> getLane();

    /**
     * Filtered Getter for relation 'BpmnLaneSet->Lane'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("678df55b-6c4c-4f48-b5a8-dbc696037853")
    <T extends BpmnLane> List<T> getLane(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnLaneSet->Process'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fd50bcee-c6e5-4f0c-a012-7a3660463a82")
    BpmnProcess getProcess();

    /**
     * Setter for relation 'BpmnLaneSet->Process'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e872ddec-a8dc-47bf-a1d5-f1af7c90684d")
    void setProcess(BpmnProcess value);

    /**
     * Getter for relation 'BpmnLaneSet->ParentLane'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d536567d-6886-4cc1-b66c-179400d615cd")
    BpmnLane getParentLane();

    /**
     * Setter for relation 'BpmnLaneSet->ParentLane'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9a97c72d-a67f-435b-8932-b043605a3e6f")
    void setParentLane(BpmnLane value);

    /**
     * Getter for relation 'BpmnLaneSet->SubProcess'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3abfed92-6bc6-4e06-85e2-ac07c5315f2a")
    BpmnSubProcess getSubProcess();

    /**
     * Setter for relation 'BpmnLaneSet->SubProcess'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4dff70f1-d2bc-4738-92a7-655b4526fbc1")
    void setSubProcess(BpmnSubProcess value);

}
