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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptCallEventAction;
import org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.MethodPassingMode;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;

@objid ("001449ac-c4bf-1fd8-97fe-001ec947cd2a")
public interface Operation extends BehavioralFeature {
    @objid ("9068841f-e8cf-4be2-aea6-03ff3e2323f6")
    boolean isConcurrency();

    @objid ("4877fc84-b639-415e-8807-a2e6619772e2")
    void setConcurrency(boolean value);

    @objid ("a1915d8b-6506-4cf6-8738-a3d46113bd8c")
    boolean isFinal();

    @objid ("41b47da9-f98c-487f-806e-f810ec189b04")
    void setFinal(boolean value);

    @objid ("98d3d08d-4849-4fa0-b6e7-4993fcd9216e")
    MethodPassingMode getPassing();

    @objid ("c61c22ed-037c-44be-bf82-12cd852899d8")
    void setPassing(MethodPassingMode value);

    @objid ("2eea2aef-450c-48fc-906d-baf37b274da3")
    EList<ElementImport> getOwnedImport();

    @objid ("d6bedce5-d906-4bb6-9cc4-08ae3fef873b")
    <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass);

    @objid ("50760bdb-1be2-4755-8f0c-03c153cf2c7c")
    EList<RaisedException> getThrown();

    @objid ("15462edf-ebd4-4b5b-9c27-5f6ef2f71245")
    <T extends RaisedException> List<T> getThrown(java.lang.Class<T> filterClass);

    @objid ("723bccd3-2bd5-47b5-a435-d91e9e7038dd")
    EList<BpmnReceiveTask> getCallerReceiveTask();

    @objid ("4405be9c-5857-4e04-8978-15e2a2cbd60f")
    <T extends BpmnReceiveTask> List<T> getCallerReceiveTask(java.lang.Class<T> filterClass);

    @objid ("2d033603-2101-471b-addc-4ed87b5fdb00")
    EList<Operation> getRedefinition();

    @objid ("10e1a8cb-5a20-4948-bdc9-fc90eb8772c5")
    <T extends Operation> List<T> getRedefinition(java.lang.Class<T> filterClass);

    @objid ("6e159403-2248-4050-ab14-f2d9d6d27cce")
    EList<Collaboration> getExample();

    @objid ("304c246a-960d-4b57-a95d-8105dee9d080")
    <T extends Collaboration> List<T> getExample(java.lang.Class<T> filterClass);

    @objid ("b93c6e37-445b-407a-855c-6d6de57e9708")
    EList<Signal> getSRepresentation();

    @objid ("fc3795ac-03f1-4544-be75-6f24346c7f85")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    @objid ("a74ab94e-1c97-42b3-a754-22636d4a3cfc")
    EList<Behavior> getOwnedBehavior();

    @objid ("dc3f1155-a46d-4c97-b718-fe0c53f990bb")
    <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass);

    @objid ("188bc767-5505-4876-a6ee-93b2125d5612")
    EList<BpmnOperation> getBpmnOperationRef();

    @objid ("d3ce0c53-7f95-436f-ac2f-3a5b7807671f")
    <T extends BpmnOperation> List<T> getBpmnOperationRef(java.lang.Class<T> filterClass);

    @objid ("e4e3a6ba-b28f-4905-904c-61a3fad38815")
    EList<BpmnSendTask> getCallerSendTask();

    @objid ("99f4bce3-1d68-4b62-8c98-c2aec69b7340")
    <T extends BpmnSendTask> List<T> getCallerSendTask(java.lang.Class<T> filterClass);

    @objid ("0f00ed5f-2e14-4cc1-a6df-351cc79619f0")
    EList<Parameter> getIO();

    @objid ("02a5901c-67f7-4217-8792-9feb554e1a66")
    <T extends Parameter> List<T> getIO(java.lang.Class<T> filterClass);

    @objid ("7400a377-a1c3-405b-baee-ec2fd90e5ebc")
    EList<TemplateBinding> getTemplateInstanciation();

    @objid ("4dab8bec-ac1f-405e-ba7b-da1fe97bc326")
    <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass);

    @objid ("12fb5e78-e323-426d-bb35-4a935aeaff5f")
    Classifier getOwner();

    @objid ("1581d55e-2478-479b-9fd1-7347f3632b3b")
    void setOwner(Classifier value);

    @objid ("2292fd1f-f2c4-4314-a9c1-13ef2dd1b4ea")
    EList<PackageImport> getOwnedPackageImport();

    @objid ("ed9c70b9-9d97-439c-a62e-ff028286bfdd")
    <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass);

    @objid ("3ba6a000-ac76-42ff-ae7c-dc6033e63754")
    Parameter getReturn();

    @objid ("7b145075-fafe-4afd-8587-2c24dcca1e61")
    void setReturn(Parameter value);

    @objid ("1ef4be59-1210-4802-b048-c0afda2e457c")
    EList<TemplateBinding> getInstanciatingBinding();

    @objid ("8f355ece-9899-48b5-ba60-29022b26561d")
    <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass);

    @objid ("0067af44-d59c-416f-b6a1-df5404069be6")
    EList<Message> getUsage();

    @objid ("bf008d69-f3f7-4410-8b54-500e9ab49e85")
    <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass);

    @objid ("45292771-bc93-4085-8191-91474541df4a")
    EList<TemplateParameter> getTemplate();

    @objid ("37403864-96e5-4955-84e8-cec2e053c4ad")
    <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass);

    @objid ("1d5c8d44-e789-4fac-91c7-bb3699baa544")
    EList<BpmnServiceTask> getCallerServiceTask();

    @objid ("3946a0fb-e56a-458e-9a67-1fb8d697c2ce")
    <T extends BpmnServiceTask> List<T> getCallerServiceTask(java.lang.Class<T> filterClass);

    @objid ("a4562e33-4188-4b6c-8f21-70d6f3339ff0")
    EList<Event> getOccurence();

    @objid ("40fc38de-5e67-419f-bf90-52b9b222e506")
    <T extends Event> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("c52e9818-22d7-44bf-a44e-31b8c5d328d2")
    EList<Transition> getInvoker();

    @objid ("dad72ff0-554e-4965-a707-5e529efd2af6")
    <T extends Transition> List<T> getInvoker(java.lang.Class<T> filterClass);

    @objid ("1c9fd257-3ab5-4352-b398-8e0745cdf139")
    EList<CommunicationMessage> getCommunicationUsage();

    @objid ("674c03bb-85c3-4e27-b214-c2f11e781d15")
    <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass);

    @objid ("bd0a98f8-0a90-4e1d-bb8d-93eccf1c1991")
    EList<CollaborationUse> getOwnedCollaborationUse();

    @objid ("4647245e-2608-4fa5-8f63-fc7cdfa6e18a")
    <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass);

    @objid ("880be32c-8488-403e-98dd-8ac59561f00a")
    Operation getRedefines();

    @objid ("11797ffa-e293-4653-8763-526e4064c29a")
    void setRedefines(Operation value);

    @objid ("bd5f2e34-56f1-45de-80df-6ce7100867bb")
    EList<BpmnCallActivity> getCaller();

    @objid ("cdfd2575-9110-47b2-b2e0-831e4af3bd6c")
    <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("59372597-6657-46f2-86fb-b26c0fce0bd4")
    EList<CallOperationAction> getCallingAction();

    @objid ("bf902f5e-67da-47e8-821c-444cf5ccb70e")
    <T extends CallOperationAction> List<T> getCallingAction(java.lang.Class<T> filterClass);

    @objid ("7e8b55cb-9499-4d4e-935a-39c0cea1714a")
    EList<AcceptCallEventAction> getEntryPointAction();

    @objid ("abd938c5-76ca-4d21-baa2-8521efd4df3a")
    <T extends AcceptCallEventAction> List<T> getEntryPointAction(java.lang.Class<T> filterClass);

}
