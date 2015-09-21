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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
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

/**
 * Operation v0.0.9054
 * 
 * 
 * In Modelio, this metaclass defines both the Operation, and the method implementing it. 
 * 
 * An Operation belongs to its Classifier.
 */
@objid ("001449ac-c4bf-1fd8-97fe-001ec947cd2a")
public interface Operation extends BehavioralFeature {
    @objid ("683ad0ef-86a1-4510-bd65-9bb04301ebdc")
    public static final String MNAME = "Operation";

    /**
     * Getter for attribute 'Operation.Concurrency'
     * 
     * Metamodel description:
     * <i>Distinguishes the different invocation modes of an Operation. This typically specifies concurrent modes.</i>
     */
    @objid ("b62485d4-5c9c-4621-ae4a-c91be925de59")
    boolean isConcurrency();

    /**
     * Setter for attribute 'Operation.Concurrency'
     * 
     * Metamodel description:
     * <i>Distinguishes the different invocation modes of an Operation. This typically specifies concurrent modes.</i>
     */
    @objid ("c9dea730-0c5f-4c09-a2e4-df865f4c30ee")
    void setConcurrency(boolean value);

    /**
     * Getter for attribute 'Operation.Final'
     * 
     * Metamodel description:
     * <i>Final operations cannot be redefined. Some OO languages, such as Java, optimize final operations.</i>
     */
    @objid ("f7f983b2-d8a5-4a4e-91d7-a083dd5bb54c")
    boolean isFinal();

    /**
     * Setter for attribute 'Operation.Final'
     * 
     * Metamodel description:
     * <i>Final operations cannot be redefined. Some OO languages, such as Java, optimize final operations.</i>
     */
    @objid ("7cb53159-d44e-496a-bea7-efe2822b618e")
    void setFinal(boolean value);

    /**
     * Getter for attribute 'Operation.Passing'
     * 
     * Metamodel description:
     * <i>Method passing mode (in or inout). By default, this is inout. This mode determines whether the message receiver object is updated (inout) or not (in) when the method is invoked.</i>
     */
    @objid ("2ba32b4c-e057-47f2-984f-798858803857")
    MethodPassingMode getPassing();

    /**
     * Setter for attribute 'Operation.Passing'
     * 
     * Metamodel description:
     * <i>Method passing mode (in or inout). By default, this is inout. This mode determines whether the message receiver object is updated (inout) or not (in) when the method is invoked.</i>
     */
    @objid ("75d6542f-0b8f-4dae-924a-69964ac6366e")
    void setPassing(MethodPassingMode value);

    /**
     * Getter for relation 'Operation->OwnedImport'
     * 
     * Metamodel description:
     * <i>Elements imported by the Operation.</i>
     */
    @objid ("c43402a4-d781-4d3c-aa2e-7e52ba13bece")
    EList<ElementImport> getOwnedImport();

    /**
     * Filtered Getter for relation 'Operation->OwnedImport'
     * 
     * Metamodel description:
     * <i>Elements imported by the Operation.</i>
     */
    @objid ("12218f62-561b-4254-b058-e0b030b97a30")
    <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->Thrown'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6b9d23f2-87df-4d45-95c5-8af1756c4dd4")
    EList<RaisedException> getThrown();

    /**
     * Filtered Getter for relation 'Operation->Thrown'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("df4b6cd1-490a-486a-94b4-bec9c30001b9")
    <T extends RaisedException> List<T> getThrown(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->CallerReceiveTask'
     * 
     * Metamodel description:
     * <i>BPMN task calling this Operation.</i>
     */
    @objid ("f7f6fc23-862e-4f74-aec5-c3ab3ab30c49")
    EList<BpmnReceiveTask> getCallerReceiveTask();

    /**
     * Filtered Getter for relation 'Operation->CallerReceiveTask'
     * 
     * Metamodel description:
     * <i>BPMN task calling this Operation.</i>
     */
    @objid ("28776ac0-d171-4cb9-94a3-39cd1b3bc640")
    <T extends BpmnReceiveTask> List<T> getCallerReceiveTask(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->Redefinition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2f4bb746-5d8f-4202-ba25-5d67c14e5c70")
    EList<Operation> getRedefinition();

    /**
     * Filtered Getter for relation 'Operation->Redefinition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("12bd4eb2-bb7a-4250-8b44-d70809ad95d1")
    <T extends Operation> List<T> getRedefinition(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->Example'
     * 
     * Metamodel description:
     * <i>Collaborations that illustrate the dynamic of the Operation. A Collaboration can be used to express the initial state of an Operation when it starts running.</i>
     */
    @objid ("877a2d85-5fe4-41f0-9a52-b6dbd77add9f")
    EList<Collaboration> getExample();

    /**
     * Filtered Getter for relation 'Operation->Example'
     * 
     * Metamodel description:
     * <i>Collaborations that illustrate the dynamic of the Operation. A Collaboration can be used to express the initial state of an Operation when it starts running.</i>
     */
    @objid ("74914542-d1aa-4c7b-aedd-d5723c62aa81")
    <T extends Collaboration> List<T> getExample(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->SRepresentation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4b98e464-9496-4d59-a09e-bda42d11082c")
    EList<Signal> getSRepresentation();

    /**
     * Filtered Getter for relation 'Operation->SRepresentation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e9d2ea93-6fb5-4058-a359-45863003095d")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->OwnedBehavior'
     * 
     * Metamodel description:
     * <i>A behavioral description that implements the behavioral feature. </i>
     */
    @objid ("db2b0117-43e7-41f8-8ad3-f92937879971")
    EList<Behavior> getOwnedBehavior();

    /**
     * Filtered Getter for relation 'Operation->OwnedBehavior'
     * 
     * Metamodel description:
     * <i>A behavioral description that implements the behavioral feature. </i>
     */
    @objid ("1e11bb32-711a-4a7c-994c-998dc13297e0")
    <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->BpmnOperationRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bd81babb-5838-445c-82dd-ebad1a2bf7b4")
    EList<BpmnOperation> getBpmnOperationRef();

    /**
     * Filtered Getter for relation 'Operation->BpmnOperationRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1e431378-7e5f-41b8-b6d0-e629ba1cee71")
    <T extends BpmnOperation> List<T> getBpmnOperationRef(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->CallerSendTask'
     * 
     * Metamodel description:
     * <i>BPMN task calling this Operation.</i>
     */
    @objid ("5a4b26bb-7cde-412e-9965-403f8bda68ef")
    EList<BpmnSendTask> getCallerSendTask();

    /**
     * Filtered Getter for relation 'Operation->CallerSendTask'
     * 
     * Metamodel description:
     * <i>BPMN task calling this Operation.</i>
     */
    @objid ("53f107dd-5129-41ff-a72b-6e6c11ae1cd6")
    <T extends BpmnSendTask> List<T> getCallerSendTask(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->IO'
     * 
     * Metamodel description:
     * <i>Defines the parameters making up the Operation.</i>
     */
    @objid ("e4efc90a-029a-42af-b456-081dd0922297")
    EList<Parameter> getIO();

    /**
     * Filtered Getter for relation 'Operation->IO'
     * 
     * Metamodel description:
     * <i>Defines the parameters making up the Operation.</i>
     */
    @objid ("2d849f5b-3318-41a3-a888-ad55dbd9db4a")
    <T extends Parameter> List<T> getIO(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->TemplateInstanciation'
     * 
     * Metamodel description:
     * <i>Binds the Operation to the template operation that it instanciates.</i>
     */
    @objid ("4d64a480-28df-4cf9-8f79-4654b34885a5")
    EList<TemplateBinding> getTemplateInstanciation();

    /**
     * Filtered Getter for relation 'Operation->TemplateInstanciation'
     * 
     * Metamodel description:
     * <i>Binds the Operation to the template operation that it instanciates.</i>
     */
    @objid ("454f53a9-fc3b-4d21-84f0-89a0b8618094")
    <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("afffba3c-b6e1-4c6b-b484-4563331831ab")
    Classifier getOwner();

    /**
     * Setter for relation 'Operation->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7f128895-81d8-42ba-a33c-2fba048f1061")
    void setOwner(Classifier value);

    /**
     * Getter for relation 'Operation->OwnedPackageImport'
     * 
     * Metamodel description:
     * <i>Packages imported by the Operation.</i>
     */
    @objid ("1473c8df-c636-455c-8799-2acf3370cb15")
    EList<PackageImport> getOwnedPackageImport();

    /**
     * Filtered Getter for relation 'Operation->OwnedPackageImport'
     * 
     * Metamodel description:
     * <i>Packages imported by the Operation.</i>
     */
    @objid ("280380ff-2b5d-4e62-9094-938d7883e64d")
    <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->Return'
     * 
     * Metamodel description:
     * <i>Link to the possible return parameter. The return parameter is only distinguished by this association, from the IOParameter.</i>
     */
    @objid ("208b8435-ce49-4e77-a85a-8829ceb1ddc3")
    Parameter getReturn();

    /**
     * Setter for relation 'Operation->Return'
     * 
     * Metamodel description:
     * <i>Link to the possible return parameter. The return parameter is only distinguished by this association, from the IOParameter.</i>
     */
    @objid ("d50b5440-ea21-4f80-920e-96291ee4c243")
    void setReturn(Parameter value);

    /**
     * Getter for relation 'Operation->InstanciatingBinding'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0b263c7a-db7a-4f67-92e0-b9cefa4c60dd")
    EList<TemplateBinding> getInstanciatingBinding();

    /**
     * Filtered Getter for relation 'Operation->InstanciatingBinding'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3ece8736-6d26-4233-b43a-ff6fbd07f509")
    <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->Usage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("251a72b4-e609-4ac3-b2c4-2fcb8e4b1e6c")
    EList<Message> getUsage();

    /**
     * Filtered Getter for relation 'Operation->Usage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("53b58667-1f89-4ba0-9f70-885e507da546")
    <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->Template'
     * 
     * Metamodel description:
     * <i>In case of template operations, this association defines its template parameters.</i>
     */
    @objid ("00d8d2d5-16d2-4743-af18-ca27435e5d30")
    EList<TemplateParameter> getTemplate();

    /**
     * Filtered Getter for relation 'Operation->Template'
     * 
     * Metamodel description:
     * <i>In case of template operations, this association defines its template parameters.</i>
     */
    @objid ("8a0d34db-e0a3-4828-9772-668bf1950c1b")
    <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->CallerServiceTask'
     * 
     * Metamodel description:
     * <i>BPMN task calling this Operation.</i>
     */
    @objid ("05eaa7a7-eef5-4d86-9e6f-8fc8830bc593")
    EList<BpmnServiceTask> getCallerServiceTask();

    /**
     * Filtered Getter for relation 'Operation->CallerServiceTask'
     * 
     * Metamodel description:
     * <i>BPMN task calling this Operation.</i>
     */
    @objid ("51ab950c-56d6-4579-8b22-7e64b08ebae8")
    <T extends BpmnServiceTask> List<T> getCallerServiceTask(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->Occurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c69cc5b1-6a19-4873-9e84-83e47bb23eb3")
    EList<Event> getOccurence();

    /**
     * Filtered Getter for relation 'Operation->Occurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ac27f8c9-f38b-4c69-acd4-2247c9e3de90")
    <T extends Event> List<T> getOccurence(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->Invoker'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a1142993-b543-47d2-ab51-e75013604609")
    EList<Transition> getInvoker();

    /**
     * Filtered Getter for relation 'Operation->Invoker'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("67930c1b-46f6-4a1f-bacd-8f2c98087825")
    <T extends Transition> List<T> getInvoker(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->CommunicationUsage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0058b02b-7107-4c76-8be0-2cb6ef581375")
    EList<CommunicationMessage> getCommunicationUsage();

    /**
     * Filtered Getter for relation 'Operation->CommunicationUsage'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ed25ad7e-f306-4ed0-b93d-d8d24fc61c14")
    <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->OwnedCollaborationUse'
     * 
     * Metamodel description:
     * <i>Collaboration occurrences owned by the Operation.</i>
     */
    @objid ("ccccb6ad-e2fd-449e-ae9c-57435b774916")
    EList<CollaborationUse> getOwnedCollaborationUse();

    /**
     * Filtered Getter for relation 'Operation->OwnedCollaborationUse'
     * 
     * Metamodel description:
     * <i>Collaboration occurrences owned by the Operation.</i>
     */
    @objid ("8df9affc-080e-4aee-850f-7942c16dbdfe")
    <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->Redefines'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("348e09bd-87cf-4ce2-a23c-a0e9618d99c7")
    Operation getRedefines();

    /**
     * Setter for relation 'Operation->Redefines'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6db51baa-3519-4281-be14-66f471b1153a")
    void setRedefines(Operation value);

    /**
     * Getter for relation 'Operation->Caller'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d911870d-fd3d-4e8a-9093-618c55a46bae")
    EList<BpmnCallActivity> getCaller();

    /**
     * Filtered Getter for relation 'Operation->Caller'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ad53aad8-6842-4464-ab6a-dcd81be5ef74")
    <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->CallingAction'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("25b50f80-3d8e-4030-bff7-21cf2e819886")
    EList<CallOperationAction> getCallingAction();

    /**
     * Filtered Getter for relation 'Operation->CallingAction'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("01e41f4d-fd5a-4034-b7c4-2b8a06ed1e34")
    <T extends CallOperationAction> List<T> getCallingAction(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Operation->EntryPointAction'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9b6180df-55eb-4b5d-9dfb-f5f22ba07027")
    EList<AcceptCallEventAction> getEntryPointAction();

    /**
     * Filtered Getter for relation 'Operation->EntryPointAction'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ea10d70d-ed02-45df-b0ec-1ce0677389cd")
    <T extends AcceptCallEventAction> List<T> getEntryPointAction(java.lang.Class<T> filterClass);

}
