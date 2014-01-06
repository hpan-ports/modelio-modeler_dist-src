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
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("007f01c0-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnCallActivity extends BpmnActivity {
    @objid ("cb9b9bda-963e-491b-9b59-e6fe7e445a96")
    BpmnTask getCalledGlobalTask();

    @objid ("d94e3e23-2e95-41a3-a41f-c121901f85fb")
    void setCalledGlobalTask(BpmnTask value);

    @objid ("146eef21-b5c8-464d-9ee2-9210534e1532")
    BpmnProcess getCalledProcess();

    @objid ("ff3d1185-d36a-4dd7-97fe-cd370c43ba94")
    void setCalledProcess(BpmnProcess value);

    @objid ("527282ac-6a95-4988-b161-099df937107f")
    Operation getCalledOperation();

    @objid ("cd02056e-9d4b-4ebc-8a8b-70fbb8f7de3b")
    void setCalledOperation(Operation value);

    @objid ("acecc211-3be6-4ce8-8a94-3bfcc54a7fa3")
    Behavior getCalledBehavior();

    @objid ("d7c8e846-fc41-4da1-9049-03297d528d09")
    void setCalledBehavior(Behavior value);

}
