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
    @objid ("760938c4-8080-4e01-be9b-985d90a89d31")
    GeneralClass getType();

    @objid ("a18cae2e-7af1-4212-939d-96c1c3b55fe4")
    void setType(GeneralClass value);

    @objid ("44e8aecc-2c2c-4616-b9b3-8d46901628e0")
    EList<BpmnOperation> getOutputMessage();

    @objid ("bfe3ebc3-7a63-4f0c-ac27-82ef943db66a")
    <T extends BpmnOperation> List<T> getOutputMessage(java.lang.Class<T> filterClass);

    @objid ("87643cc4-5e6a-4d88-aceb-b0eab0d6276b")
    BpmnItemDefinition getItemRef();

    @objid ("7dad058d-0a4d-4009-b4a2-986df7553655")
    void setItemRef(BpmnItemDefinition value);

    @objid ("133fef4b-3a0f-45a6-84e9-e5034dffd20b")
    State getInState();

    @objid ("d4a99722-1128-4ff5-8885-658095510521")
    void setInState(State value);

    @objid ("f9f38cd8-6635-414c-9f62-350c21bd2487")
    EList<BpmnMessageEventDefinition> getEventDefinition();

    @objid ("0dbb8a28-6b8d-4dff-a800-15a31e86d170")
    <T extends BpmnMessageEventDefinition> List<T> getEventDefinition(java.lang.Class<T> filterClass);

    @objid ("2459fd80-e793-4414-85b8-c3184dd8aacb")
    EList<BpmnSendTask> getSender();

    @objid ("3474394d-9cff-4a34-b7c6-6b9f012ac714")
    <T extends BpmnSendTask> List<T> getSender(java.lang.Class<T> filterClass);

    @objid ("64e573ec-105a-4643-ad07-62f8cc3f8c39")
    EList<BpmnOperation> getInputMessage();

    @objid ("252374b1-cb7c-4ace-bbba-3f1ef88ddbe3")
    <T extends BpmnOperation> List<T> getInputMessage(java.lang.Class<T> filterClass);

    @objid ("706eaac2-1b4b-40bb-ab1e-316593d8f21f")
    EList<BpmnReceiveTask> getReceiver();

    @objid ("24bc31e9-8369-4d02-a593-def31e4e175a")
    <T extends BpmnReceiveTask> List<T> getReceiver(java.lang.Class<T> filterClass);

    @objid ("8eea52be-a672-4dae-98a9-ec78afc9c4a1")
    EList<BpmnMessageFlow> getMessageFlow();

    @objid ("73084995-7d00-494f-92a8-e5c2ef574ece")
    <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass);

}
