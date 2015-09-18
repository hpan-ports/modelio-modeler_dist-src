/*
 * Copyright 2013 Modeliosoft
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
package org.modelio.metamodel.bpmn.rootElements;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnGroup;

@objid ("00792098-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnFlowElement extends BpmnBaseElement {
    @objid ("0918f0a3-2ab2-4d81-83d6-176878383200")
    EList<BpmnGroup> getGroups();

    @objid ("fbf5dfb5-13cd-4546-9440-32890684063b")
    <T extends BpmnGroup> List<T> getGroups(java.lang.Class<T> filterClass);

    @objid ("3fb35454-d77a-42d8-9484-28ab0af3c4a0")
    BpmnSubProcess getSubProcess();

    @objid ("e854e434-7c52-4f9b-9e78-9cf8eea1a14b")
    void setSubProcess(BpmnSubProcess value);

    @objid ("222078e7-2372-4542-a68e-16b3e5ae6241")
    EList<BpmnLane> getLane();

    @objid ("49c67969-cdf9-405f-abfc-6d1b5be83a8e")
    <T extends BpmnLane> List<T> getLane(java.lang.Class<T> filterClass);

    @objid ("4660f4fa-8933-4c3b-80f2-8f1b9c9376c5")
    BpmnProcess getContainer();

    @objid ("6879d386-1d2d-409e-bc2a-d30f483d73c1")
    void setContainer(BpmnProcess value);

}
