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
    @objid ("23973df0-720e-4c48-a20e-891ee7b0019d")
    BpmnTask getCalledGlobalTask();

    @objid ("d0dcd8f4-73e1-42ca-9557-a6af27e75623")
    void setCalledGlobalTask(BpmnTask value);

    @objid ("a2794d39-39f6-43cf-b4e6-038b96f3ade4")
    BpmnProcess getCalledProcess();

    @objid ("a021ad9f-bac1-418a-b9aa-d09c26e72596")
    void setCalledProcess(BpmnProcess value);

    @objid ("f26e7549-66a4-4d77-9915-9b54a1986d85")
    Operation getCalledOperation();

    @objid ("1ef39e1d-93e6-44c2-84e7-86bd88d4ec6b")
    void setCalledOperation(Operation value);

    @objid ("b12e02da-7d80-434f-a2fa-a7cb004a06f9")
    Behavior getCalledBehavior();

    @objid ("81c98351-b379-4097-9c70-f8076a0187a1")
    void setCalledBehavior(Behavior value);

}
