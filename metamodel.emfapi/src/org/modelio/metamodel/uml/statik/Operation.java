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
    @objid ("8ad28277-1e3d-4646-9960-64dad83d6f7d")
    boolean isConcurrency();

    @objid ("2b9ec27e-9097-4d39-a107-90d37fb312de")
    void setConcurrency(boolean value);

    @objid ("f3a20eb1-3b54-4a80-b67f-9a74c9ada397")
    boolean isFinal();

    @objid ("12c8005c-aded-4afe-a8a5-228bdba9a586")
    void setFinal(boolean value);

    @objid ("34a6c89c-28ed-48ba-bcf7-8b883764b126")
    MethodPassingMode getPassing();

    @objid ("1b2f94ad-1600-41d1-b7f1-0321be450f02")
    void setPassing(MethodPassingMode value);

    @objid ("20a9e851-12f4-4aca-9801-bff8b858074d")
    EList<ElementImport> getOwnedImport();

    @objid ("0d75aec8-a82a-4f05-8de4-12772a229191")
    <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass);

    @objid ("d7fc1602-d894-4392-8ef2-74a3d4ea9ac2")
    EList<RaisedException> getThrown();

    @objid ("02f6f434-e15b-429c-94e7-39cd549f8685")
    <T extends RaisedException> List<T> getThrown(java.lang.Class<T> filterClass);

    @objid ("318b39c8-6bfb-412d-92d4-88b2c7432ca6")
    EList<BpmnReceiveTask> getCallerReceiveTask();

    @objid ("4848e541-2342-4439-8800-a6123d826b98")
    <T extends BpmnReceiveTask> List<T> getCallerReceiveTask(java.lang.Class<T> filterClass);

    @objid ("45658363-c187-4539-8dd4-97269c034d00")
    EList<Operation> getRedefinition();

    @objid ("ec3bf82a-d844-420b-8ced-ada7ed2eac90")
    <T extends Operation> List<T> getRedefinition(java.lang.Class<T> filterClass);

    @objid ("44581660-41b5-4bac-8a99-24f7fed5f349")
    EList<Collaboration> getExample();

    @objid ("c073b8fe-6029-4358-9a60-3c628875c8d9")
    <T extends Collaboration> List<T> getExample(java.lang.Class<T> filterClass);

    @objid ("c6035c33-d836-4880-a307-dd67a80250b2")
    EList<Signal> getSRepresentation();

    @objid ("5ddaee05-f415-4530-ab94-6f65719b2955")
    <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass);

    @objid ("d73d4a1d-01fc-4dc4-a359-3deec083fe39")
    EList<Behavior> getOwnedBehavior();

    @objid ("2a434a69-e93a-41fe-b41c-5eea8df9783d")
    <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass);

    @objid ("dc0168d5-4060-4c60-9181-828723afd8a8")
    EList<BpmnOperation> getBpmnOperationRef();

    @objid ("259269f6-0fa4-4ac3-97af-4ba25023ba81")
    <T extends BpmnOperation> List<T> getBpmnOperationRef(java.lang.Class<T> filterClass);

    @objid ("f11f86ac-a27c-4ba3-9bae-2519f877c583")
    EList<BpmnSendTask> getCallerSendTask();

    @objid ("9c276dc6-4c13-49be-82ad-456bb6658cbb")
    <T extends BpmnSendTask> List<T> getCallerSendTask(java.lang.Class<T> filterClass);

    @objid ("4db00e40-0bb3-4896-a446-d1e942d53c1d")
    EList<Parameter> getIO();

    @objid ("1d073228-29a3-43ea-a2e3-5b756135812a")
    <T extends Parameter> List<T> getIO(java.lang.Class<T> filterClass);

    @objid ("32559336-9bf3-4505-8392-6e8a739d52df")
    EList<TemplateBinding> getTemplateInstanciation();

    @objid ("f9049393-8b73-4320-92f6-192ba9e7c8c8")
    <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass);

    @objid ("1dc8db8b-887e-4295-9210-12b924c2ee81")
    Classifier getOwner();

    @objid ("18ed8df5-f25c-4f24-bd05-7d960b7ba21d")
    void setOwner(Classifier value);

    @objid ("1f14630b-8cdc-423d-bd26-341a2c96b02d")
    EList<PackageImport> getOwnedPackageImport();

    @objid ("1d406e89-ee4f-4835-91c8-04e44fb9f957")
    <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass);

    @objid ("34ba2222-07fe-418f-96bc-43e3e9c17792")
    Parameter getReturn();

    @objid ("f170d440-2e30-4520-bd02-f4ac86f19ea4")
    void setReturn(Parameter value);

    @objid ("e7a30433-bbe7-46f3-9fda-8e147bc48c95")
    EList<TemplateBinding> getInstanciatingBinding();

    @objid ("94216ba4-aef3-4a10-882d-14fef83ea13a")
    <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass);

    @objid ("cd93c556-c9ec-4dc2-aa16-57cc2f7d3daa")
    EList<Message> getUsage();

    @objid ("3f534077-ebe9-4d1a-864f-f95b0d7b4e4d")
    <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass);

    @objid ("45801671-9778-4594-ab44-03d8bd7a55e2")
    EList<TemplateParameter> getTemplate();

    @objid ("4a695410-5590-4df5-892c-b7e2d6562029")
    <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass);

    @objid ("c604f8f1-f31e-405e-8cdb-c1cfe3fa41a1")
    EList<BpmnServiceTask> getCallerServiceTask();

    @objid ("4c4d0a70-6965-4d30-aa73-bf69ef963423")
    <T extends BpmnServiceTask> List<T> getCallerServiceTask(java.lang.Class<T> filterClass);

    @objid ("453b7318-8ff3-4a6d-b3d5-4257eaccf98d")
    EList<Event> getOccurence();

    @objid ("6f7e6c12-ae7f-4ba9-9114-4be24b1eacec")
    <T extends Event> List<T> getOccurence(java.lang.Class<T> filterClass);

    @objid ("c444d461-e26a-4d93-8e2c-afdb1ccd94b2")
    EList<Transition> getInvoker();

    @objid ("69f7fb4d-ba30-4da4-8347-6ae08ff46562")
    <T extends Transition> List<T> getInvoker(java.lang.Class<T> filterClass);

    @objid ("41265f22-70d9-424c-a9b5-12b68f2f6997")
    EList<CommunicationMessage> getCommunicationUsage();

    @objid ("a13e3d36-6b7b-4087-bd7f-c0bd9b41999e")
    <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass);

    @objid ("ff1a8067-2923-4662-9aaa-3db91cc9f5c4")
    EList<CollaborationUse> getOwnedCollaborationUse();

    @objid ("fd87430e-d3c7-4752-994d-13eccee7ec41")
    <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass);

    @objid ("17b5957e-2a58-441b-b476-02cc569aab40")
    Operation getRedefines();

    @objid ("3a0b48a0-db91-46af-8804-23563e087262")
    void setRedefines(Operation value);

    @objid ("0e3f3f8a-d8f3-42ed-a075-2a4182b03b90")
    EList<BpmnCallActivity> getCaller();

    @objid ("8f4bb52f-603d-4fa3-94b9-10e7b8992840")
    <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass);

    @objid ("58570e97-25b3-4def-8a6a-718f7f9961b5")
    EList<CallOperationAction> getCallingAction();

    @objid ("9cced6bd-9dde-4b92-9a8d-15abfd1ce6c7")
    <T extends CallOperationAction> List<T> getCallingAction(java.lang.Class<T> filterClass);

    @objid ("a5877ceb-b13e-4296-bbbf-f34527005680")
    EList<AcceptCallEventAction> getEntryPointAction();

    @objid ("b073b0a4-6487-4578-b240-46b1c3cc7b0e")
    <T extends AcceptCallEventAction> List<T> getEntryPointAction(java.lang.Class<T> filterClass);

}
