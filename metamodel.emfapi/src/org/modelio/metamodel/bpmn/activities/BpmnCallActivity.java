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
    @objid ("4e47f625-44bd-442d-bcea-296d0c775c85")
    BpmnTask getCalledGlobalTask();

    @objid ("93baca06-da23-467a-9558-91376c60705a")
    void setCalledGlobalTask(BpmnTask value);

    @objid ("0bda83a3-82a2-4bcd-98c9-d858987efcb2")
    BpmnProcess getCalledProcess();

    @objid ("d27ef94b-e43b-4d58-b7c0-d6d310c8a80e")
    void setCalledProcess(BpmnProcess value);

    @objid ("e7dc2c90-2f8c-492f-9e1d-9fae00150cf5")
    Operation getCalledOperation();

    @objid ("59ac7f47-8682-405f-bca1-859113112dac")
    void setCalledOperation(Operation value);

    @objid ("27578c36-deea-4461-bac4-2c43878549e1")
    Behavior getCalledBehavior();

    @objid ("631332aa-8b0a-4d5a-ba3b-0eb6c7abaf82")
    void setCalledBehavior(Behavior value);

}
