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
package org.modelio.metamodel.bpmn.flows;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.GeneralClass;

@objid ("007be7e2-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnMessage extends BpmnRootElement {
    @objid ("0ee75f51-2a6e-46d5-abab-cc20eb25fc0f")
    GeneralClass getType();

    @objid ("6d59d879-374a-40c4-8290-00d6b4c82e02")
    void setType(GeneralClass value);

    @objid ("e29e4061-6e66-4b87-9c3d-bd7123085b6c")
    EList<BpmnOperation> getOutputMessage();

    @objid ("a3135c0b-ce6d-483a-87f3-edf22957c864")
    <T extends BpmnOperation> List<T> getOutputMessage(java.lang.Class<T> filterClass);

    @objid ("36292a8e-b1ce-43f7-a99c-2dc97cc9de22")
    BpmnItemDefinition getItemRef();

    @objid ("a51502ab-9100-4ecd-abd2-b273e1a46f41")
    void setItemRef(BpmnItemDefinition value);

    @objid ("287c8602-0a40-47dd-b02b-b40c70bbb369")
    State getInState();

    @objid ("c52ae9d6-6e3b-4883-bf91-de09539c11e8")
    void setInState(State value);

    @objid ("b75faf96-805a-4f86-a4c4-3604f99be968")
    EList<BpmnMessageEventDefinition> getEventDefinition();

    @objid ("55f27cac-b785-43cd-a8cd-750d8b26784a")
    <T extends BpmnMessageEventDefinition> List<T> getEventDefinition(java.lang.Class<T> filterClass);

    @objid ("73c2619a-c6f1-4fb1-b3b5-b7c10c8a59df")
    EList<BpmnSendTask> getSender();

    @objid ("9dc28298-a304-43c0-bc08-c49b2ed4d786")
    <T extends BpmnSendTask> List<T> getSender(java.lang.Class<T> filterClass);

    @objid ("bf6718ee-b7db-49e9-b850-ed68a0aef3db")
    EList<BpmnOperation> getInputMessage();

    @objid ("d8a53670-1fa5-4df0-9dec-e5220260e86f")
    <T extends BpmnOperation> List<T> getInputMessage(java.lang.Class<T> filterClass);

    @objid ("0253f643-9ddf-43a2-8ed6-aaef8d743d83")
    EList<BpmnReceiveTask> getReceiver();

    @objid ("d4ad1b4d-59bc-4f47-a4bd-e9a870146885")
    <T extends BpmnReceiveTask> List<T> getReceiver(java.lang.Class<T> filterClass);

    @objid ("7b357c17-eb7c-46e8-9b32-daaf3b06f79e")
    EList<BpmnMessageFlow> getMessageFlow();

    @objid ("5cbeb1b7-3e82-425a-8be1-ca7f2ee7df1c")
    <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass);

}
