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
    @objid ("943b7466-c7eb-45fd-8e47-be7a4030b1ae")
    EList<BpmnSendTask> getSender();

    @objid ("17525203-208a-4707-87d8-0d631276f0f9")
    <T extends BpmnSendTask> List<T> getSender(java.lang.Class<T> filterClass);

    @objid ("d9a0919b-dc8d-44fc-a3c0-eb749a52bfb8")
    BpmnMessage getInMessageRef();

    @objid ("494d7588-736d-4999-bb26-9e868e32591e")
    void setInMessageRef(BpmnMessage value);

    @objid ("d8e29502-a01e-426a-bb16-ea04cfe15743")
    EList<BpmnServiceTask> getCaller();

    @objid ("04bff37f-3431-4941-8df0-4e8cb715a6b1")
    <T extends BpmnServiceTask> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("ddb98c2f-c976-4433-a830-4f51d57a8c2d")
    BpmnMessage getOutMessageRef();

    @objid ("5be4dfab-9ce9-4dc8-a849-dbf35dc0d209")
    void setOutMessageRef(BpmnMessage value);

    @objid ("c571a014-9dc7-4471-881c-22cd7e33a6dd")
    EList<BpmnMessageEventDefinition> getEventDefinition();

    @objid ("282fb89b-10f3-41cb-ac5f-e736b00f82c9")
    <T extends BpmnMessageEventDefinition> List<T> getEventDefinition(java.lang.Class<T> filterClass);

    @objid ("8019e0ce-edae-4558-8a75-442b4d351d0e")
    Operation getImplementationRef();

    @objid ("99a06a2a-c805-492f-b4ea-f944af9f98c2")
    void setImplementationRef(Operation value);

    @objid ("1af0d39b-c137-4038-8325-17b5a3620697")
    BpmnInterface getBpmnInterfaceRef();

    @objid ("84025b41-90e7-4cdc-85b4-c11a36fb00ff")
    void setBpmnInterfaceRef(BpmnInterface value);

    @objid ("59928f68-064f-4e55-ba26-7769e072737a")
    EList<BpmnReceiveTask> getReceiver();

    @objid ("c00f476e-0a6c-4fb4-a142-ff4f7d171231")
    <T extends BpmnReceiveTask> List<T> getReceiver(java.lang.Class<T> filterClass);

}
