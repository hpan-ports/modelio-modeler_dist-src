/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.behavior.stateMachineModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
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

/**
 * State v0.0.9054
 * 
 * 
 * A State represents a period of time during which an object waits for an Event or some Events to occur, or a period of time during which an object performs some ongoing activity. 
 * 
 * States are interconnected by Transitions. 
 * 
 * In Modelio, States belong either to another State, or to a StateMachine if they are the root.
 */
@objid ("0053788e-c4bf-1fd8-97fe-001ec947cd2a")
public interface State extends StateVertex {
    @objid ("785fad5b-98ef-4bc7-9760-a0f5c65df7b8")
    public static final String MNAME = "State";

    /**
     * Getter for relation 'State->ExitPoint'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("8805a634-02aa-4ff0-a5c3-2294d0cd7b41")
    EList<ExitPointPseudoState> getExitPoint();

    /**
     * Filtered Getter for relation 'State->ExitPoint'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("fd8c7f06-d830-4196-b5a3-5e28a19d765e")
    <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'State->BpmnDataStateRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ef1a952c-856d-4309-a390-3e41c3630ab5")
    EList<BpmnDataState> getBpmnDataStateRefs();

    /**
     * Filtered Getter for relation 'State->BpmnDataStateRefs'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("92fba525-4dd0-42f0-bafb-8ab4c66d5c37")
    <T extends BpmnDataState> List<T> getBpmnDataStateRefs(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'State->Deffered'
     * 
     * Metamodel description:
     * <i>A list of Events the effect of whose occurrence during the State is postponed until the owner enters a State in which they are not deferred, at which time they may trigger Transitions as if they had just occurred.</i>
     */
    @objid ("2684770f-9b06-4b78-827d-0844696614c2")
    EList<Event> getDeffered();

    /**
     * Filtered Getter for relation 'State->Deffered'
     * 
     * Metamodel description:
     * <i>A list of Events the effect of whose occurrence during the State is postponed until the owner enters a State in which they are not deferred, at which time they may trigger Transitions as if they had just occurred.</i>
     */
    @objid ("51558138-7d02-4236-b340-9f2098eee714")
    <T extends Event> List<T> getDeffered(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'State->Internal'
     * 
     * Metamodel description:
     * <i>Transitions that occur entirely within the State. If one of their triggers is satisfied then the action is performed without changing State. This means that the entry or exit condition of the State will not be invoked. These Transitions apply even if the StateMachine is in a nested region and they leave it in the same State.</i>
     */
    @objid ("4e27e5ed-627d-4f63-9969-ececcba9b28d")
    EList<InternalTransition> getInternal();

    /**
     * Filtered Getter for relation 'State->Internal'
     * 
     * Metamodel description:
     * <i>Transitions that occur entirely within the State. If one of their triggers is satisfied then the action is performed without changing State. This means that the entry or exit condition of the State will not be invoked. These Transitions apply even if the StateMachine is in a nested region and they leave it in the same State.</i>
     */
    @objid ("6b9cf33f-a735-41b5-b0ea-c18bdde0398b")
    <T extends InternalTransition> List<T> getInternal(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'State->EntryPoint'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("6293b36a-0273-411f-a856-9965f63a1819")
    EList<EntryPointPseudoState> getEntryPoint();

    /**
     * Filtered Getter for relation 'State->EntryPoint'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("0d7b11c4-4163-4328-9cda-96c77abacb80")
    <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'State->OwnedRegion'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("6fcd4432-8a03-49a4-8f11-a68c71f7a9bf")
    EList<Region> getOwnedRegion();

    /**
     * Filtered Getter for relation 'State->OwnedRegion'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("54910bcf-3110-4105-a695-46b1ddd6d559")
    <T extends Region> List<T> getOwnedRegion(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'State->RequiredStateOfBpmnMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e6e96d0c-d3a9-453f-96a1-7563c6b837ba")
    EList<BpmnMessage> getRequiredStateOfBpmnMessage();

    /**
     * Filtered Getter for relation 'State->RequiredStateOfBpmnMessage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("42372499-2f4b-4fe8-a903-18f8f6e661d5")
    <T extends BpmnMessage> List<T> getRequiredStateOfBpmnMessage(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'State->RequiredStateOf'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b452d3db-ae64-4e5c-aa70-96ca2d476a10")
    EList<ObjectNode> getRequiredStateOf();

    /**
     * Filtered Getter for relation 'State->RequiredStateOf'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a5cd37b7-0475-44bb-a113-e1626624a20b")
    <T extends ObjectNode> List<T> getRequiredStateOf(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'State->Connection'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("1478e81d-8734-4e8d-ac30-68bbb81bc52a")
    EList<ConnectionPointReference> getConnection();

    /**
     * Filtered Getter for relation 'State->Connection'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("bce28a18-24e2-4520-bfb8-25f608b515f4")
    <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'State->SubMachine'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("9ea796f4-7a2c-42f8-86e6-cdc35f7ac156")
    StateMachine getSubMachine();

    /**
     * Setter for relation 'State->SubMachine'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("1afaa223-7323-4d76-861f-ae28866b242c")
    void setSubMachine(StateMachine value);

    /**
     * Getter for relation 'State->RequiredStateOfBpmnItem'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4840e0ed-dd5d-4c1d-9bbf-18d6ae7f15ac")
    EList<BpmnItemAwareElement> getRequiredStateOfBpmnItem();

    /**
     * Filtered Getter for relation 'State->RequiredStateOfBpmnItem'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b1e670db-0782-4e95-8d42-952a24180bed")
    <T extends BpmnItemAwareElement> List<T> getRequiredStateOfBpmnItem(java.lang.Class<T> filterClass);

}
