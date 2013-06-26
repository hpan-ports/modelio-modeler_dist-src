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
    @objid ("900eb1a2-3813-4b14-9d13-0df0b054503c")
    GeneralClass getType();

    @objid ("9d883954-ba57-4d40-967a-69ed0438a9c2")
    void setType(GeneralClass value);

    @objid ("138bf814-967b-427a-8440-1e41bba5b0c3")
    EList<BpmnOperation> getOutputMessage();

    @objid ("424d233b-b77d-4fb8-a3c5-3e752e975fd1")
    <T extends BpmnOperation> List<T> getOutputMessage(java.lang.Class<T> filterClass);

    @objid ("22350d50-d2f8-4846-aafa-e023c242923c")
    BpmnItemDefinition getItemRef();

    @objid ("dc2fe617-8123-4eb8-8b82-804d966fe09b")
    void setItemRef(BpmnItemDefinition value);

    @objid ("986104fd-9b43-46d5-97ba-92965ab5e06b")
    State getInState();

    @objid ("9416f34d-0ab7-47e3-8dbf-d7d204eda553")
    void setInState(State value);

    @objid ("4bde3ce2-d4aa-44a5-b7f0-9ee5d5e29a30")
    EList<BpmnMessageEventDefinition> getEventDefinition();

    @objid ("384610a8-f707-43d7-9dcc-9779cc12ad6d")
    <T extends BpmnMessageEventDefinition> List<T> getEventDefinition(java.lang.Class<T> filterClass);

    @objid ("c04ecb42-3cb2-4f1a-80d3-a6a6d83bb3eb")
    EList<BpmnSendTask> getSender();

    @objid ("b9510f67-45c8-473e-a10e-7288d66e9adb")
    <T extends BpmnSendTask> List<T> getSender(java.lang.Class<T> filterClass);

    @objid ("0c170ce1-eead-436e-9959-6f62dc3adb42")
    EList<BpmnOperation> getInputMessage();

    @objid ("13546ed4-1abb-4938-a6c9-72a24fb51124")
    <T extends BpmnOperation> List<T> getInputMessage(java.lang.Class<T> filterClass);

    @objid ("1775b2b5-2106-4287-a27e-1eb0548046f2")
    EList<BpmnReceiveTask> getReceiver();

    @objid ("0d604b6d-04db-48f3-997e-78dba2f40ff9")
    <T extends BpmnReceiveTask> List<T> getReceiver(java.lang.Class<T> filterClass);

    @objid ("b2abadd9-9b9c-4102-b665-9a7af14bee22")
    EList<BpmnMessageFlow> getMessageFlow();

    @objid ("d2160110-58de-4e82-9780-3dd551fbd7ad")
    <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass);

}
