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
    @objid ("bd1a9217-4c69-48cb-9f6d-2711807a743e")
    EList<ExitPointPseudoState> getExitPoint();

    @objid ("4a74bae4-e0b1-4b8b-a862-99b1819daf7a")
    <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass);

    @objid ("179f5731-48ef-4cf3-b779-6cbf6060256b")
    EList<BpmnDataState> getBpmnDataStateRefs();

    @objid ("2167c112-ff06-4ecc-9947-24398f56b501")
    <T extends BpmnDataState> List<T> getBpmnDataStateRefs(java.lang.Class<T> filterClass);

    @objid ("1f12f6a1-62ab-4c78-8303-a08391294802")
    EList<Event> getDeffered();

    @objid ("24ffcec9-a6d0-4367-b546-1239988adc3c")
    <T extends Event> List<T> getDeffered(java.lang.Class<T> filterClass);

    @objid ("c2554c52-6c5e-42ab-849c-f2482ffcd328")
    EList<InternalTransition> getInternal();

    @objid ("2131aa15-ea44-4f5d-8500-8bc5d4ed6577")
    <T extends InternalTransition> List<T> getInternal(java.lang.Class<T> filterClass);

    @objid ("282787b7-c8a0-4777-8ab6-8cbf7fc0be0c")
    EList<EntryPointPseudoState> getEntryPoint();

    @objid ("259b174c-50ec-4ad7-a629-811fabc9507c")
    <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass);

    @objid ("d88af4a2-8145-4304-817f-120f5db6519c")
    EList<Region> getOwnedRegion();

    @objid ("5f4fdc55-0250-4f19-ba73-3a1551b4e795")
    <T extends Region> List<T> getOwnedRegion(java.lang.Class<T> filterClass);

    @objid ("79e77e29-a860-4ecc-9741-e28a10364c58")
    EList<BpmnMessage> getRequiredStateOfBpmnMessage();

    @objid ("95529036-07ac-45de-bc5f-d43a92dcea74")
    <T extends BpmnMessage> List<T> getRequiredStateOfBpmnMessage(java.lang.Class<T> filterClass);

    @objid ("ed81c03d-be47-4707-b004-8f0bc119fd9e")
    EList<ObjectNode> getRequiredStateOf();

    @objid ("2679665f-252e-4dc2-b364-6ea4832f8eab")
    <T extends ObjectNode> List<T> getRequiredStateOf(java.lang.Class<T> filterClass);

    @objid ("ab6d3837-5939-4537-b8b4-46767b837cbd")
    EList<ConnectionPointReference> getConnection();

    @objid ("8638de2d-6fec-4352-a660-0a6bdce504b1")
    <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass);

    @objid ("371e39d8-4bdf-416c-aef3-c061180bc4c5")
    StateMachine getSubMachine();

    @objid ("e7aec53c-a0a7-4834-ad36-3938ea6cc7f4")
    void setSubMachine(StateMachine value);

    @objid ("6e452ef4-40c4-42c1-9b8b-45a33bd75c59")
    EList<BpmnItemAwareElement> getRequiredStateOfBpmnItem();

    @objid ("37070a1f-d022-426e-80e4-c254afeed684")
    <T extends BpmnItemAwareElement> List<T> getRequiredStateOfBpmnItem(java.lang.Class<T> filterClass);

}
