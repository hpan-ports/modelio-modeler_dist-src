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
package org.modelio.metamodel.bpmn.bpmnService;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.uml.statik.Operation;

@objid ("000d4990-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnOperation extends BpmnBaseElement {
    @objid ("ce462df9-c3ad-4418-86e6-27c6f21ccee6")
    EList<BpmnSendTask> getSender();

    @objid ("a0db956d-3f8c-4eaf-b9c8-d72fed03bde3")
    <T extends BpmnSendTask> List<T> getSender(java.lang.Class<T> filterClass);

    @objid ("ea1c722e-bf5d-49e8-baaa-2fa39b52b349")
    BpmnMessage getInMessageRef();

    @objid ("4fda3789-27ba-497c-9051-d9c9b9650e41")
    void setInMessageRef(BpmnMessage value);

    @objid ("2adbad13-aad6-461d-af78-c8fa5bc91370")
    EList<BpmnServiceTask> getCaller();

    @objid ("599ac8ed-bc2d-486b-9a49-e54df02464fd")
    <T extends BpmnServiceTask> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("5e8605be-58e5-430a-a326-a7a3f49f109f")
    BpmnMessage getOutMessageRef();

    @objid ("b794b2bd-008b-4a4e-bed0-6ba65cbc152c")
    void setOutMessageRef(BpmnMessage value);

    @objid ("5b8f3250-c088-4453-a259-0d894f524040")
    EList<BpmnMessageEventDefinition> getEventDefinition();

    @objid ("b0754413-feaa-42fe-b2c7-e1d7802e01fa")
    <T extends BpmnMessageEventDefinition> List<T> getEventDefinition(java.lang.Class<T> filterClass);

    @objid ("579a55e4-761b-43f4-af97-fdb0f0288f90")
    Operation getImplementationRef();

    @objid ("801d297f-95ae-427f-9311-81bcfe0b2ccc")
    void setImplementationRef(Operation value);

    @objid ("c822b55b-112d-4536-8d14-e4013d237540")
    BpmnInterface getBpmnInterfaceRef();

    @objid ("c9adfc77-ea91-4761-b622-fcf7a64e4576")
    void setBpmnInterfaceRef(BpmnInterface value);

    @objid ("63784244-7039-4189-a5a3-4f0f26cb0e1b")
    EList<BpmnReceiveTask> getReceiver();

    @objid ("4fae9acc-4d77-4f38-8f9e-b48c3ce944ed")
    <T extends BpmnReceiveTask> List<T> getReceiver(java.lang.Class<T> filterClass);

}
