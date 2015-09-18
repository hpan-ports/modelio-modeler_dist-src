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
package org.modelio.metamodel.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("0074fd92-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnLaneSet extends BpmnBaseElement {
    @objid ("1d0dc0b4-d084-4b2f-99d9-5f236da29578")
    EList<BpmnLane> getLane();

    @objid ("3dbc2819-cea9-449b-9fda-a5f2a51cf077")
    <T extends BpmnLane> List<T> getLane(java.lang.Class<T> filterClass);

    @objid ("f74966c5-6443-4fb1-96c4-ca47967792b2")
    BpmnProcess getProcess();

    @objid ("065f358c-04ea-44d4-a6fb-137a60ad8426")
    void setProcess(BpmnProcess value);

    @objid ("add3b5fa-77e2-4fa7-86c3-f08762d106f7")
    BpmnLane getParentLane();

    @objid ("902247d9-decc-4408-898c-b854f734b2f9")
    void setParentLane(BpmnLane value);

    @objid ("ad56535e-db6d-4e48-9b32-3be17aae4c15")
    BpmnSubProcess getSubProcess();

    @objid ("5423e19d-540a-4e05-be9a-1b929103c913")
    void setSubProcess(BpmnSubProcess value);

}
