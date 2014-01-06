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
/*   Metamodel version: 9019              */
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
    @objid ("06787bee-f222-4cce-942c-f0fb36526936")
    EList<BpmnGroup> getGroups();

    @objid ("bc92db29-f028-494d-83d7-a856df196836")
    <T extends BpmnGroup> List<T> getGroups(java.lang.Class<T> filterClass);

    @objid ("6f37bba6-3f08-4829-8dc4-47c46a61ab88")
    BpmnSubProcess getSubProcess();

    @objid ("1bb050ed-dfe6-413b-b113-7456dd75f694")
    void setSubProcess(BpmnSubProcess value);

    @objid ("c6480f31-b243-4fb4-9998-3dff811ec2b0")
    EList<BpmnLane> getLane();

    @objid ("28cd07f2-b21b-43a7-a46e-5c290ddb4d14")
    <T extends BpmnLane> List<T> getLane(java.lang.Class<T> filterClass);

    @objid ("add6beff-96b3-4a8e-808e-4980a2adfda5")
    BpmnProcess getContainer();

    @objid ("09425c45-3336-4fb9-9969-a15463401635")
    void setContainer(BpmnProcess value);

}
