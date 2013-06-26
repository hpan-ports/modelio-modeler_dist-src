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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("0a8c57a5-2c66-44f0-be52-f9bcc0ec9783")
    EList<BpmnGroup> getGroups();

    @objid ("901de64e-5c1d-4577-9c75-37918cdd0cfa")
    <T extends BpmnGroup> List<T> getGroups(java.lang.Class<T> filterClass);

    @objid ("84e4b798-62fe-41a2-ad85-73078f8dbcec")
    BpmnSubProcess getSubProcess();

    @objid ("d00a9948-0e7a-48a8-a5ba-d58e5d9d506c")
    void setSubProcess(BpmnSubProcess value);

    @objid ("0df73678-baf1-462b-a8ab-94d9b17f759e")
    EList<BpmnLane> getLane();

    @objid ("08b1a20c-3f95-422a-8f0e-5a9e052a4055")
    <T extends BpmnLane> List<T> getLane(java.lang.Class<T> filterClass);

    @objid ("fcf4a0df-b972-4615-ae7d-ed9b65d9dc24")
    BpmnProcess getContainer();

    @objid ("f164d031-a2c2-46ec-8d99-b56aa119bcae")
    void setContainer(BpmnProcess value);

}
