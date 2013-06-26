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
    @objid ("1e5e141e-e66e-43c7-8cd5-6b8da0b2834c")
    EList<BpmnSendTask> getSender();

    @objid ("df70057c-bf18-4236-9b57-3fd05c2be273")
    <T extends BpmnSendTask> List<T> getSender(java.lang.Class<T> filterClass);

    @objid ("dd2111ee-a52a-4284-8301-935c4f35ac32")
    BpmnMessage getInMessageRef();

    @objid ("43e89eda-5846-4059-bda9-74826a74dfd7")
    void setInMessageRef(BpmnMessage value);

    @objid ("422021b8-245d-4219-8943-1f246d527c5f")
    EList<BpmnServiceTask> getCaller();

    @objid ("3d598e64-e597-4ed5-9098-f171c97677b6")
    <T extends BpmnServiceTask> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("d17a7797-4eb4-4498-8100-f1a0510a4b85")
    BpmnMessage getOutMessageRef();

    @objid ("d91ac22b-2727-42cd-8fd4-8cfd12c8bd16")
    void setOutMessageRef(BpmnMessage value);

    @objid ("b3f4cb5c-8ada-4c26-abd8-ec45457ea818")
    EList<BpmnMessageEventDefinition> getEventDefinition();

    @objid ("ecaff9b1-34fe-4022-a570-d5d96dc17c71")
    <T extends BpmnMessageEventDefinition> List<T> getEventDefinition(java.lang.Class<T> filterClass);

    @objid ("90711a77-f5c0-41fe-867e-bd87d9639aaa")
    Operation getImplementationRef();

    @objid ("79a80ab2-bbd0-4c0a-b463-527296f78dec")
    void setImplementationRef(Operation value);

    @objid ("c273b708-4c1c-4d6c-b9ea-67fb5d0f6a09")
    BpmnInterface getBpmnInterfaceRef();

    @objid ("681c4bfc-c54e-4b49-8649-2d3eb5006761")
    void setBpmnInterfaceRef(BpmnInterface value);

    @objid ("02ab491f-c0de-48f7-82a1-59f6dc00539f")
    EList<BpmnReceiveTask> getReceiver();

    @objid ("1b71c72a-1e3a-4ffc-989b-e2340796951f")
    <T extends BpmnReceiveTask> List<T> getReceiver(java.lang.Class<T> filterClass);

}
