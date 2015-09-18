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
    @objid ("11b392a5-3f0d-46b0-a47b-035e56a9068e")
    boolean isConcurrency();

    @objid ("656c7c05-af1d-451e-9201-02d3157c8069")
    void setConcurrency(boolean value);

    @objid ("643c3c89-2c3b-4672-b94c-59f9d10de4f6")
    boolean isFinal();

    @objid ("60931686-8bd9-450e-856f-4168eaa2e215")
    void setFinal(boolean value);

    @objid ("a51816f9-6faf-48f4-89e8-973462318f30")
    MethodPassingMode getPassing();

    @objid ("b1077f5a-9a9e-40d9-b0c8-564063954fd8")
    void setPassing(MethodPassingMode value);

    @objid ("7638c034-6812-4367-8470-8c2c62b1ab53")
    EList<ElementImport> getOwnedImport();

    @objid ("fad78ad1-3a99-4992-ada6-af596611805e")
    <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass);

    @objid ("c952fc7f-45fa-4edb-9911-82a43e303619")
    EList<RaisedException> getThrown();

    @objid ("ca90a5f8-f93b-4c0b-b366-238d8e160fee")
    <T extends RaisedException> List<T> getThrown(java.lang.Class<T> filterClass);

    @objid ("c016e0d6-6c77-422d-b8bb-5e9febca1596")
    EList<BpmnReceiveTask> getCallerReceiveTask();

    @objid ("f5fb114b-b5d4-425b-b4a7-7bb6839dd2d8")
    <T extends BpmnReceiveTask> List<T> getCallerReceiveTask(java.lang.Class<T> filterClass);

    @objid ("5bb16aa3-0b86-4b0a-86be-df3cc3c1909e")
    EList<Operation> getRedefinition();

    @objid ("5415b446-87f4-42c1-b054-ee87bf4ef38b")
    <T extends Operation> List<T> getRedefinition(java.lang.Class<T> filterClass);

    @objid ("bffd5dca-9f30-4db2-a4d2-40fb4b3c6f93")
    EList<Collaboration> getExample();

    @objid ("e74adb8c-2d5e-4047-acc7-be8425e5a136")
    <T extends Collaboration> List<T> getExample(java.lang.Class<T> filterClass);

    @objid ("875c020c-f67e-48fd-9bd6-80fdd8f239b7")
    EList<Signal> getSRepresentation();

    @objid ("5561625d-b7f3-4b8f-ae4d-97c49e8a6c19")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    @objid ("19a21f51-72f0-4a30-8227-84bd9f19afd0")
    EList<Behavior> getOwnedBehavior();

    @objid ("4bcd625f-81b5-47c4-8325-6db064ac15ad")
    <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass);

    @objid ("744e01e5-3aa5-4f0c-8696-845220510d53")
    EList<BpmnOperation> getBpmnOperationRef();

    @objid ("44830794-3782-4c69-8657-d7991594fcde")
    <T extends BpmnOperation> List<T> getBpmnOperationRef(java.lang.Class<T> filterClass);

    @objid ("09eabde7-3895-418e-bed4-a9f9bf7adb2e")
    EList<BpmnSendTask> getCallerSendTask();

    @objid ("4db97b55-2709-4995-b4b1-d29ca8e99180")
    <T extends BpmnSendTask> List<T> getCallerSendTask(java.lang.Class<T> filterClass);

    @objid ("03da7420-9ead-4928-85a3-a6643ece1a00")
    EList<Parameter> getIO();

    @objid ("8b07aaf7-8976-4062-be88-4a3357476d26")
    <T extends Parameter> List<T> getIO(java.lang.Class<T> filterClass);

    @objid ("c069018e-e686-4b2e-8cba-417dcaa98349")
    EList<TemplateBinding> getTemplateInstanciation();

    @objid ("d7f7c121-4698-46d6-9875-8df74b3d8bb3")
    <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass);

    @objid ("c10d22cb-c8ff-4920-98ae-07be8dd7803a")
    Classifier getOwner();

    @objid ("438c3bf7-fe50-486b-92c6-cfede541ba8d")
    void setOwner(Classifier value);

    @objid ("25588ddf-2b5e-42b7-8a06-7d41420d19c5")
    EList<PackageImport> getOwnedPackageImport();

    @objid ("ddbd2482-8795-4017-98c3-f2cb9a942bdc")
    <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass);

    @objid ("34bb5814-3f3f-451c-91a8-4398f7744bca")
    Parameter getReturn();

    @objid ("e4c2b89b-ea2c-439a-8eb4-5d992e560f87")
    void setReturn(Parameter value);

    @objid ("a35152fe-76d1-4c06-b669-e39d0ea92ef4")
    EList<TemplateBinding> getInstanciatingBinding();

    @objid ("1bcc7419-f7a8-49b0-9a96-3683b6e79cfe")
    <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass);

    @objid ("25fba431-4751-4fea-9412-6763087b0ae5")
    EList<Message> getUsage();

    @objid ("997a90f7-26e3-4bec-a38d-d8942b33b799")
    <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass);

    @objid ("01b517b5-6ef5-4a9d-afd0-2ea1785608d2")
    EList<TemplateParameter> getTemplate();

    @objid ("313e0a66-1542-4777-9d2c-4fb8840823b8")
    <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass);

    @objid ("96975e4d-e358-4e74-b534-0a247659385c")
    EList<BpmnServiceTask> getCallerServiceTask();

    @objid ("85242272-7105-4819-bff6-24bed0a0b8cb")
    <T extends BpmnServiceTask> List<T> getCallerServiceTask(java.lang.Class<T> filterClass);

    @objid ("c61bb25e-5231-4c29-ae90-a39b4bd3504b")
    EList<Event> getOccurence();

    @objid ("df841459-4a66-4cb2-9fcc-88b159e8c598")
    <T extends Event> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("2bb4a1a3-1b20-4650-8a1f-a6ed9bfc9b20")
    EList<Transition> getInvoker();

    @objid ("e878dcc9-3ba9-43bd-b7b3-5a50949c3bbd")
    <T extends Transition> List<T> getInvoker(java.lang.Class<T> filterClass);

    @objid ("aa086137-ee8f-48b0-8a35-db034422478e")
    EList<CommunicationMessage> getCommunicationUsage();

    @objid ("790d05fb-f0f7-472f-96fc-61b7f78ddf5a")
    <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass);

    @objid ("2b964595-53ac-4492-ad9f-06709d6cbe60")
    EList<CollaborationUse> getOwnedCollaborationUse();

    @objid ("9bea62ae-5411-4718-b951-e3fc7510f640")
    <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass);

    @objid ("7106090e-a37c-4979-a11d-4d570b7413f4")
    Operation getRedefines();

    @objid ("9b2dd95a-e33c-46d7-af7b-5d66bd96b0b4")
    void setRedefines(Operation value);

    @objid ("9d832f2d-9253-4cd7-8360-04faffd31802")
    EList<BpmnCallActivity> getCaller();

    @objid ("4ab6ac1d-baa6-45f8-81d6-54a4560ca115")
    <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("09436e33-c9e9-489a-ad79-792fd66d8f2b")
    EList<CallOperationAction> getCallingAction();

    @objid ("65b823dc-a292-4e27-8230-fff03f3be2f7")
    <T extends CallOperationAction> List<T> getCallingAction(java.lang.Class<T> filterClass);

    @objid ("6f109130-0ef5-42c6-9d1b-4200812695ba")
    EList<AcceptCallEventAction> getEntryPointAction();

    @objid ("0bd38014-20a4-48f4-9072-df081a132b8a")
    <T extends AcceptCallEventAction> List<T> getEntryPointAction(java.lang.Class<T> filterClass);

}
