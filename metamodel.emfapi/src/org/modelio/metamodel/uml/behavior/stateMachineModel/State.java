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
package org.modelio.metamodel.uml.behavior.stateMachineModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;

@objid ("0053788e-c4bf-1fd8-97fe-001ec947cd2a")
public interface State extends StateVertex {
    @objid ("efb93eca-9b20-41b6-9c67-c6cd64ad1077")
    EList<ExitPointPseudoState> getExitPoint();

    @objid ("21c8bc33-3df1-469f-893d-47e32da7e105")
    <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass);

    @objid ("a853ad92-7971-46ab-b4e5-ff4821233baa")
    EList<BpmnDataState> getBpmnDataStateRefs();

    @objid ("38ddb5d2-f596-4e8a-a656-de4579065b5a")
    <T extends BpmnDataState> List<T> getBpmnDataStateRefs(java.lang.Class<T> filterClass);

    @objid ("3f8b019f-24c0-4ed3-b841-47a3d86f6cd4")
    EList<Event> getDeffered();

    @objid ("606e0ff4-09c2-4b97-ac46-c68282a1bb69")
    <T extends Event> List<T> getDeffered(java.lang.Class<T> filterClass);

    @objid ("4805f1ce-df04-454e-8760-bdaefa649af4")
    EList<InternalTransition> getInternal();

    @objid ("104eb439-ab73-49a7-8a15-7e7e96838e2c")
    <T extends InternalTransition> List<T> getInternal(java.lang.Class<T> filterClass);

    @objid ("ca4ff8dc-70ce-4004-ae96-f7c96cdaf120")
    EList<EntryPointPseudoState> getEntryPoint();

    @objid ("edf3bfb8-5293-4fa9-8de4-a5f577d11da3")
    <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass);

    @objid ("466ccfc0-9604-44eb-84fc-db304106d248")
    EList<Region> getOwnedRegion();

    @objid ("ac567ae4-5130-47a4-bc4f-f492fe4e83b1")
    <T extends Region> List<T> getOwnedRegion(java.lang.Class<T> filterClass);

    @objid ("b8d6a9fc-f555-44b6-b3d0-20ca2f9ad8c3")
    EList<BpmnMessage> getRequiredStateOfBpmnMessage();

    @objid ("2009fe10-bc93-4fc3-aeaf-ce5551e8b098")
    <T extends BpmnMessage> List<T> getRequiredStateOfBpmnMessage(java.lang.Class<T> filterClass);

    @objid ("6eba57f3-116d-4876-a124-43ddacb1e141")
    EList<ObjectNode> getRequiredStateOf();

    @objid ("50b1a001-c34a-416b-a4b5-6a4c853b9774")
    <T extends ObjectNode> List<T> getRequiredStateOf(java.lang.Class<T> filterClass);

    @objid ("a818d137-009e-4503-a314-eb737a955c60")
    EList<ConnectionPointReference> getConnection();

    @objid ("d781280c-04ac-4ed9-b42c-5d65871544e6")
    <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass);

    @objid ("da865350-c655-47be-b7c6-78b8a9c2debd")
    StateMachine getSubMachine();

    @objid ("c029e528-b49d-4808-a126-04538074a34c")
    void setSubMachine(StateMachine value);

    @objid ("0c7defe2-0a3a-469a-a468-c0379991db6c")
    EList<BpmnItemAwareElement> getRequiredStateOfBpmnItem();

    @objid ("30c393bc-f494-46cc-b16c-4d12245203d5")
    <T extends BpmnItemAwareElement> List<T> getRequiredStateOfBpmnItem(java.lang.Class<T> filterClass);

}
