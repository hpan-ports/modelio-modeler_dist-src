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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.data.uml.statik.OperationData;
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
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0014913c-c4bf-1fd8-97fe-001ec947cd2a")
public class OperationImpl extends BehavioralFeatureImpl implements Operation {
    @objid ("8ac1a7bc-103c-4b53-98e2-a452a5dff127")
    @Override
    public boolean isConcurrency() {
        return (Boolean) getAttVal(OperationData.Metadata.ConcurrencyAtt());
    }

    @objid ("878721ea-f3bd-451a-8c0b-e772687ee900")
    @Override
    public void setConcurrency(boolean value) {
        setAttVal(OperationData.Metadata.ConcurrencyAtt(), value);
    }

    @objid ("6ea974a6-12ef-42d3-a274-3f545c0034e5")
    @Override
    public boolean isFinal() {
        return (Boolean) getAttVal(OperationData.Metadata.FinalAtt());
    }

    @objid ("0d36b899-c51d-4db0-9d7d-cfe0be32b2b1")
    @Override
    public void setFinal(boolean value) {
        setAttVal(OperationData.Metadata.FinalAtt(), value);
    }

    @objid ("e195200f-b38d-48bb-8d92-80e81eec51ec")
    @Override
    public MethodPassingMode getPassing() {
        return (MethodPassingMode) getAttVal(OperationData.Metadata.PassingAtt());
    }

    @objid ("6b1a5cf1-d6cf-454d-b3ff-91cae30955a1")
    @Override
    public void setPassing(MethodPassingMode value) {
        setAttVal(OperationData.Metadata.PassingAtt(), value);
    }

    @objid ("e565faeb-614c-4a95-838b-ecb5b7592ebb")
    @Override
    public EList<ElementImport> getOwnedImport() {
        return new SmList<>(this, OperationData.Metadata.OwnedImportDep());
    }

    @objid ("8b2d214e-4cbc-4919-8c2b-0d564ff24e3a")
    @Override
    public <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ElementImport element : getOwnedImport()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f184554d-d8a8-4ace-8b5b-93ebbc428b51")
    @Override
    public EList<RaisedException> getThrown() {
        return new SmList<>(this, OperationData.Metadata.ThrownDep());
    }

    @objid ("8e46fc54-05fd-4cbb-a3c4-003698f613fb")
    @Override
    public <T extends RaisedException> List<T> getThrown(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final RaisedException element : getThrown()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c34f9c83-ac04-45f4-bf9c-29ac10932338")
    @Override
    public EList<BpmnReceiveTask> getCallerReceiveTask() {
        return new SmList<>(this, OperationData.Metadata.CallerReceiveTaskDep());
    }

    @objid ("0b5639e8-e5ca-4af7-a0d1-a534e4b6f882")
    @Override
    public <T extends BpmnReceiveTask> List<T> getCallerReceiveTask(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnReceiveTask element : getCallerReceiveTask()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("701794fe-053f-4b88-9fe9-9ad9b7aec072")
    @Override
    public EList<Operation> getRedefinition() {
        return new SmList<>(this, OperationData.Metadata.RedefinitionDep());
    }

    @objid ("540e8580-252f-4b70-8492-330fc1c4bbbb")
    @Override
    public <T extends Operation> List<T> getRedefinition(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Operation element : getRedefinition()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cb55f5db-2593-4230-ada6-e401d048269d")
    @Override
    public EList<Collaboration> getExample() {
        return new SmList<>(this, OperationData.Metadata.ExampleDep());
    }

    @objid ("3efc1f55-f752-4214-9d7b-ff3a506c18b9")
    @Override
    public <T extends Collaboration> List<T> getExample(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Collaboration element : getExample()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8981c61d-440c-4167-b0f1-a5bb571ce089")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, OperationData.Metadata.SRepresentationDep());
    }

    @objid ("1d26e5fc-969c-41c1-8aae-ca2566b70d82")
    @Override
    public <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Signal element : getSRepresentation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8a96e7f6-4068-4c5c-bb21-9f20b9ad7820")
    @Override
    public EList<Behavior> getOwnedBehavior() {
        return new SmList<>(this, OperationData.Metadata.OwnedBehaviorDep());
    }

    @objid ("ad2eab61-f123-4832-b27b-82ab39493b24")
    @Override
    public <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Behavior element : getOwnedBehavior()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6679e12e-7d77-438f-a78a-9039cd8366e6")
    @Override
    public EList<BpmnOperation> getBpmnOperationRef() {
        return new SmList<>(this, OperationData.Metadata.BpmnOperationRefDep());
    }

    @objid ("068a8e3b-a74e-4747-94d6-8c394cf5a9d8")
    @Override
    public <T extends BpmnOperation> List<T> getBpmnOperationRef(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnOperation element : getBpmnOperationRef()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("985e14cd-138e-4b2a-9e78-65d17188c8f0")
    @Override
    public EList<BpmnSendTask> getCallerSendTask() {
        return new SmList<>(this, OperationData.Metadata.CallerSendTaskDep());
    }

    @objid ("6a49d677-c63a-48dd-89a2-c4e9f0837fda")
    @Override
    public <T extends BpmnSendTask> List<T> getCallerSendTask(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnSendTask element : getCallerSendTask()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5615baa4-b9ce-44d0-a140-e5afe2c4832d")
    @Override
    public EList<Parameter> getIO() {
        return new SmList<>(this, OperationData.Metadata.IODep());
    }

    @objid ("700872cf-9cf1-4ab3-8f0d-cf7ad3b822b3")
    @Override
    public <T extends Parameter> List<T> getIO(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Parameter element : getIO()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6114f255-f5e5-4c75-a734-7411c5b47266")
    @Override
    public EList<TemplateBinding> getTemplateInstanciation() {
        return new SmList<>(this, OperationData.Metadata.TemplateInstanciationDep());
    }

    @objid ("8c8eac2e-c788-4f7f-b1f3-c8529bd09424")
    @Override
    public <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateBinding element : getTemplateInstanciation()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a4b7cd84-a4ec-4008-9289-a467cba47bfd")
    @Override
    public Classifier getOwner() {
        return (Classifier) getDepVal(OperationData.Metadata.OwnerDep());
    }

    @objid ("ad278627-99c2-4de5-a5f1-00181a69028f")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(OperationData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("3c82c044-6d7b-4192-aba5-92ab51d22adf")
    @Override
    public EList<PackageImport> getOwnedPackageImport() {
        return new SmList<>(this, OperationData.Metadata.OwnedPackageImportDep());
    }

    @objid ("34f23c77-316b-44ca-b3a4-2e58399dc552")
    @Override
    public <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PackageImport element : getOwnedPackageImport()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("18ff9da2-85c8-4654-9bf6-8854be37f1ea")
    @Override
    public Parameter getReturn() {
        return (Parameter) getDepVal(OperationData.Metadata.ReturnDep());
    }

    @objid ("2ebb4202-8e0c-4030-b6c7-1cbadd2d6be2")
    @Override
    public void setReturn(Parameter value) {
        appendDepVal(OperationData.Metadata.ReturnDep(), (SmObjectImpl)value);
    }

    @objid ("e0d02eae-f711-489d-9920-9660d9ee1e67")
    @Override
    public EList<TemplateBinding> getInstanciatingBinding() {
        return new SmList<>(this, OperationData.Metadata.InstanciatingBindingDep());
    }

    @objid ("c430f366-ce6c-4f6f-b991-4ecd20baa526")
    @Override
    public <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateBinding element : getInstanciatingBinding()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("53e8f93e-36d7-4fdb-86c3-7f620a89b8fe")
    @Override
    public EList<Message> getUsage() {
        return new SmList<>(this, OperationData.Metadata.UsageDep());
    }

    @objid ("18657704-adc2-44a7-9c59-7825cf4c06ef")
    @Override
    public <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Message element : getUsage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("38b9d11c-47de-48a8-a1cc-5add21dd4454")
    @Override
    public EList<TemplateParameter> getTemplate() {
        return new SmList<>(this, OperationData.Metadata.TemplateDep());
    }

    @objid ("116da042-2f79-4243-9af1-6f8d3e96cd4c")
    @Override
    public <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final TemplateParameter element : getTemplate()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("508e6716-6bee-4b3e-a4c1-f6704e79c75e")
    @Override
    public EList<BpmnServiceTask> getCallerServiceTask() {
        return new SmList<>(this, OperationData.Metadata.CallerServiceTaskDep());
    }

    @objid ("52328500-d745-40d6-b8fc-764994d0e9d5")
    @Override
    public <T extends BpmnServiceTask> List<T> getCallerServiceTask(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnServiceTask element : getCallerServiceTask()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7e66c476-e039-4aa7-928e-56ad9f281ad1")
    @Override
    public EList<Event> getOccurence() {
        return new SmList<>(this, OperationData.Metadata.OccurenceDep());
    }

    @objid ("72430682-f20d-48ef-9310-c451b0a140ec")
    @Override
    public <T extends Event> List<T> getOccurence(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Event element : getOccurence()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3bc8143a-6de2-4d79-a769-d70cd2d63a0c")
    @Override
    public EList<Transition> getInvoker() {
        return new SmList<>(this, OperationData.Metadata.InvokerDep());
    }

    @objid ("c97cd354-387f-4a8c-9d74-2feebdfd9466")
    @Override
    public <T extends Transition> List<T> getInvoker(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Transition element : getInvoker()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c669f194-7f08-43f5-971c-00a5bef416b2")
    @Override
    public EList<CommunicationMessage> getCommunicationUsage() {
        return new SmList<>(this, OperationData.Metadata.CommunicationUsageDep());
    }

    @objid ("a31b36ce-fc8b-49b1-b165-3bce4459665e")
    @Override
    public <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CommunicationMessage element : getCommunicationUsage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("96cd6302-5d64-498c-ad9a-7042e20bfd31")
    @Override
    public EList<CollaborationUse> getOwnedCollaborationUse() {
        return new SmList<>(this, OperationData.Metadata.OwnedCollaborationUseDep());
    }

    @objid ("86982a89-9257-45ec-8876-a6c43b834b75")
    @Override
    public <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CollaborationUse element : getOwnedCollaborationUse()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("6206e8cf-fe2a-410e-9cf1-6492210894cf")
    @Override
    public Operation getRedefines() {
        return (Operation) getDepVal(OperationData.Metadata.RedefinesDep());
    }

    @objid ("1fa98c80-fef2-4b17-92dd-f7d34a3203b6")
    @Override
    public void setRedefines(Operation value) {
        appendDepVal(OperationData.Metadata.RedefinesDep(), (SmObjectImpl)value);
    }

    @objid ("bd75ff59-4507-4bbd-9a87-3a202b68e2e4")
    @Override
    public EList<BpmnCallActivity> getCaller() {
        return new SmList<>(this, OperationData.Metadata.CallerDep());
    }

    @objid ("e2690567-bc9f-4853-a903-f2cb84ba583a")
    @Override
    public <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnCallActivity element : getCaller()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c0d34d1c-6903-476d-99db-a3d08ef4d0dc")
    @Override
    public EList<CallOperationAction> getCallingAction() {
        return new SmList<>(this, OperationData.Metadata.CallingActionDep());
    }

    @objid ("d69e12b6-93db-45aa-ace5-1430e965751b")
    @Override
    public <T extends CallOperationAction> List<T> getCallingAction(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CallOperationAction element : getCallingAction()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a26232f7-3e41-4409-a44c-b96a45184d0b")
    @Override
    public EList<AcceptCallEventAction> getEntryPointAction() {
        return new SmList<>(this, OperationData.Metadata.EntryPointActionDep());
    }

    @objid ("ab25ed7b-e53f-424e-baaf-d74f757f3a13")
    @Override
    public <T extends AcceptCallEventAction> List<T> getEntryPointAction(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final AcceptCallEventAction element : getEntryPointAction()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("15e5a158-e9dd-449e-9ed4-814b585e2bfb")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(OperationData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9ef5e910-4184-4247-8bd7-1971cc9fc0f3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(OperationData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(OperationData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("51eaead4-a5bd-40d3-975e-b5467fd41df9")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitOperation(this);
        else
          return null;
    }

}
