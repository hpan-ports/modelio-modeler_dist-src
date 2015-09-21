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
package org.modelio.metamodel.uml.behavior.commonBehaviors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.uml.behavior.activityModel.CallBehaviorAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;

/**
 * Behavior v0.0.9054
 * 
 * 
 * Behavior is a specification of how its context classifier changes state over time. This specification may be either a definition of possible behavior execution or emergent behavior, or a selective illustration of an interesting subset of possible executions. The latter form is typically used for capturing examples, such as a trace of a particular execution. 
 */
@objid ("00409570-c4bf-1fd8-97fe-001ec947cd2a")
public interface Behavior extends ModelElement {
    @objid ("01a10fce-150a-42ce-b4cb-85c4a7f4a726")
    public static final String MNAME = "Behavior";

    /**
     * Getter for attribute 'Behavior.IsReentrant'
     * 
     * Metamodel description:
     * <i>Indicates whether the behavior can be invoked while it is still executing from a previous invocation. The default value is false.</i>
     */
    @objid ("9c74dfe7-4367-4d7a-b088-fac595855bce")
    boolean isIsReentrant();

    /**
     * Setter for attribute 'Behavior.IsReentrant'
     * 
     * Metamodel description:
     * <i>Indicates whether the behavior can be invoked while it is still executing from a previous invocation. The default value is false.</i>
     */
    @objid ("2553cbc7-263a-474a-8257-cfc24de92411")
    void setIsReentrant(boolean value);

    /**
     * Getter for relation 'Behavior->BpmnCaller'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("78615b43-fa4f-4144-ac79-90d64c174d96")
    EList<BpmnCallActivity> getBpmnCaller();

    /**
     * Filtered Getter for relation 'Behavior->BpmnCaller'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a43e4c5a-7b10-4b6c-b3a3-ae3f2809654f")
    <T extends BpmnCallActivity> List<T> getBpmnCaller(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Behavior->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4d7dd12c-b8af-4916-a6ab-884472a81b7d")
    NameSpace getOwner();

    /**
     * Setter for relation 'Behavior->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d6d003f4-4249-409f-9d90-1d6d4005daf2")
    void setOwner(NameSpace value);

    /**
     * Getter for relation 'Behavior->Parameter'
     * 
     * Metamodel description:
     * <i>References a list of parameters to the behavior that describes the order and type of arguments that can be given when the behavior is invoked and of the values that will be returned when the behavior completes its execution.</i>
     */
    @objid ("f844632a-221a-41df-ac34-7116a2b1add9")
    EList<BehaviorParameter> getParameter();

    /**
     * Filtered Getter for relation 'Behavior->Parameter'
     * 
     * Metamodel description:
     * <i>References a list of parameters to the behavior that describes the order and type of arguments that can be given when the behavior is invoked and of the values that will be returned when the behavior completes its execution.</i>
     */
    @objid ("1924073f-4372-41f0-980b-1da37fd0829a")
    <T extends BehaviorParameter> List<T> getParameter(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Behavior->OwnerOperation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("03f6d8d1-0a63-4b0d-b43f-3eb001499b22")
    Operation getOwnerOperation();

    /**
     * Setter for relation 'Behavior->OwnerOperation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1a77246f-5e76-44a8-a102-c96dea68c82f")
    void setOwnerOperation(Operation value);

    /**
     * Getter for relation 'Behavior->OwnedCollaboration'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("bfb7c967-43eb-4a96-8e79-459d6b0bf874")
    EList<Collaboration> getOwnedCollaboration();

    /**
     * Filtered Getter for relation 'Behavior->OwnedCollaboration'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("0b139d15-7c8d-45ce-9500-74088bfa8161")
    <T extends Collaboration> List<T> getOwnedCollaboration(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Behavior->Caller'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5b57396a-7ba5-49ab-a483-e2bfe02680d9")
    EList<CallBehaviorAction> getCaller();

    /**
     * Filtered Getter for relation 'Behavior->Caller'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bc53d0bd-2e3e-4a95-9118-c4235a5562c7")
    <T extends CallBehaviorAction> List<T> getCaller(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Behavior->EComponent'
     * 
     * Metamodel description:
     * <i>Events are defined in the context of a Behavior.</i>
     */
    @objid ("2256e7fa-cf16-4cbd-82fa-93a2014a6948")
    EList<Event> getEComponent();

    /**
     * Filtered Getter for relation 'Behavior->EComponent'
     * 
     * Metamodel description:
     * <i>Events are defined in the context of a Behavior.</i>
     */
    @objid ("d63dd567-ddbe-4688-8092-287113048655")
    <T extends Event> List<T> getEComponent(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Behavior->EffectOf'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e67b0032-3016-491f-8ad3-7a21a17eda4d")
    EList<Transition> getEffectOf();

    /**
     * Filtered Getter for relation 'Behavior->EffectOf'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3db960de-8138-4624-9222-81740d85c288")
    <T extends Transition> List<T> getEffectOf(java.lang.Class<T> filterClass);

}
