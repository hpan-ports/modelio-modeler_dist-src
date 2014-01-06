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
    @objid ("5b5e4cc8-d695-4c77-bbab-4b6bcc11a0ec")
    EList<BpmnLane> getLane();

    @objid ("8451fd02-5a21-4f1d-9aca-d17e54b6e23d")
    <T extends BpmnLane> List<T> getLane(java.lang.Class<T> filterClass);

    @objid ("a57401e5-03e0-4d7f-b084-04b94fa36ac7")
    BpmnProcess getProcess();

    @objid ("df2a0815-a662-4a56-adc1-2b28789cc18f")
    void setProcess(BpmnProcess value);

    @objid ("78652c93-108e-49f8-a741-0592018a34af")
    BpmnLane getParentLane();

    @objid ("3b381ce3-4780-4f7a-bf1a-3380df322256")
    void setParentLane(BpmnLane value);

    @objid ("a5a538c4-7a7a-4a32-9590-2e266b7ff1ed")
    BpmnSubProcess getSubProcess();

    @objid ("5e3b2b2d-d30c-4bda-8499-6268d5386d78")
    void setSubProcess(BpmnSubProcess value);

}
