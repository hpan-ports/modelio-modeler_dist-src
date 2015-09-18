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
    @objid ("d4287308-04ce-4b2a-af40-c82063e561c6")
    @Override
    public boolean isConcurrency() {
        return (Boolean) getAttVal(OperationData.Metadata.ConcurrencyAtt());
    }

    @objid ("ad457f60-4d05-44e7-89a5-be022e9b8e5b")
    @Override
    public void setConcurrency(boolean value) {
        setAttVal(OperationData.Metadata.ConcurrencyAtt(), value);
    }

    @objid ("f38cdf4d-eb21-48f0-b7e4-62c4f1565458")
    @Override
    public boolean isFinal() {
        return (Boolean) getAttVal(OperationData.Metadata.FinalAtt());
    }

    @objid ("b7668209-da11-4bac-b621-a62446c297b8")
    @Override
    public void setFinal(boolean value) {
        setAttVal(OperationData.Metadata.FinalAtt(), value);
    }

    @objid ("fe1af078-18d4-4451-9879-f3b68410a55d")
    @Override
    public MethodPassingMode getPassing() {
        return (MethodPassingMode) getAttVal(OperationData.Metadata.PassingAtt());
    }

    @objid ("d616e8b9-a6f3-4ef0-8e63-d1b7e7be4259")
    @Override
    public void setPassing(MethodPassingMode value) {
        setAttVal(OperationData.Metadata.PassingAtt(), value);
    }

    @objid ("dbb2b6db-9079-4833-982d-3f57b36f794a")
    @Override
    public EList<ElementImport> getOwnedImport() {
        return new SmList<>(this, OperationData.Metadata.OwnedImportDep());
    }

    @objid ("a4dcfac6-a04c-4243-ae90-52ce37170947")
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

    @objid ("6f87709e-2924-4a9d-b646-9eccaf848bf5")
    @Override
    public EList<RaisedException> getThrown() {
        return new SmList<>(this, OperationData.Metadata.ThrownDep());
    }

    @objid ("c74e9ab3-4a9c-4f8c-8181-e33a2e61a7f4")
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

    @objid ("680bcec0-4785-4953-8991-baad0be0c71c")
    @Override
    public EList<BpmnReceiveTask> getCallerReceiveTask() {
        return new SmList<>(this, OperationData.Metadata.CallerReceiveTaskDep());
    }

    @objid ("7006be10-e487-4b81-a4be-2a681f27f489")
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

    @objid ("3f0e1854-f37a-418e-945a-b12d86d5af16")
    @Override
    public EList<Operation> getRedefinition() {
        return new SmList<>(this, OperationData.Metadata.RedefinitionDep());
    }

    @objid ("ad292e7a-e055-4caf-8508-b9a6552ccf47")
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

    @objid ("f4a996eb-3032-4e73-b3f0-7c34d476e9bc")
    @Override
    public EList<Collaboration> getExample() {
        return new SmList<>(this, OperationData.Metadata.ExampleDep());
    }

    @objid ("6db50b1c-48c1-4577-96b4-b4e7a4224f6f")
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

    @objid ("616aa6fd-3c8f-452f-a03a-b695ddb9da88")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, OperationData.Metadata.SRepresentationDep());
    }

    @objid ("ba56f95d-54eb-45a9-bf62-83ab5ece0a3f")
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

    @objid ("ae04d9b8-2a11-436a-9f4f-4d8cd1fb88cf")
    @Override
    public EList<Behavior> getOwnedBehavior() {
        return new SmList<>(this, OperationData.Metadata.OwnedBehaviorDep());
    }

    @objid ("8707b8d7-25ee-448c-84a8-73a831d2ee51")
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

    @objid ("30f42116-db80-4a78-8361-8772c83f97f9")
    @Override
    public EList<BpmnOperation> getBpmnOperationRef() {
        return new SmList<>(this, OperationData.Metadata.BpmnOperationRefDep());
    }

    @objid ("f1f6083c-46df-44c3-8b10-e1acbcc4d0ca")
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

    @objid ("75fdd729-bc90-484f-9c42-c6e10320f38c")
    @Override
    public EList<BpmnSendTask> getCallerSendTask() {
        return new SmList<>(this, OperationData.Metadata.CallerSendTaskDep());
    }

    @objid ("a42a2d93-2445-4712-9fb1-ab4fdcec1740")
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

    @objid ("939b4307-2706-4de1-8d1f-9f177f1aafb0")
    @Override
    public EList<Parameter> getIO() {
        return new SmList<>(this, OperationData.Metadata.IODep());
    }

    @objid ("e186aff8-d7fa-432e-b197-801bc116dc12")
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

    @objid ("d2e93176-428c-4229-87a2-63978d0ad60c")
    @Override
    public EList<TemplateBinding> getTemplateInstanciation() {
        return new SmList<>(this, OperationData.Metadata.TemplateInstanciationDep());
    }

    @objid ("e6114829-e70f-4c5d-bab6-7a33a082e7d6")
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

    @objid ("b0cf54d0-a7d2-4776-b9b8-27a80217358a")
    @Override
    public Classifier getOwner() {
        return (Classifier) getDepVal(OperationData.Metadata.OwnerDep());
    }

    @objid ("5908f0e4-e59d-4cb9-97bd-abeeed8cf1b5")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(OperationData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("8a44ecc5-e089-4730-814b-cd0a52efadfd")
    @Override
    public EList<PackageImport> getOwnedPackageImport() {
        return new SmList<>(this, OperationData.Metadata.OwnedPackageImportDep());
    }

    @objid ("2a8ede90-b092-403e-a039-3763c2f7316a")
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

    @objid ("8d278793-4296-47c9-8287-b34fa0bb79f2")
    @Override
    public Parameter getReturn() {
        return (Parameter) getDepVal(OperationData.Metadata.ReturnDep());
    }

    @objid ("ed4e7e1e-00bb-40ab-adf1-9ae6032ccffe")
    @Override
    public void setReturn(Parameter value) {
        appendDepVal(OperationData.Metadata.ReturnDep(), (SmObjectImpl)value);
    }

    @objid ("4c8eec32-94ac-419e-a807-1c9246672ac6")
    @Override
    public EList<TemplateBinding> getInstanciatingBinding() {
        return new SmList<>(this, OperationData.Metadata.InstanciatingBindingDep());
    }

    @objid ("f6ba6583-ba6f-4802-853f-8b0b8bdbb5cd")
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

    @objid ("9381c2a4-70e2-45a3-83b3-82a6b3ee6533")
    @Override
    public EList<Message> getUsage() {
        return new SmList<>(this, OperationData.Metadata.UsageDep());
    }

    @objid ("4db9c523-6aa8-43f1-b1e3-20c9e8ec5754")
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

    @objid ("fe5297bb-b606-427f-88db-6df788880399")
    @Override
    public EList<TemplateParameter> getTemplate() {
        return new SmList<>(this, OperationData.Metadata.TemplateDep());
    }

    @objid ("74c69dac-6bd2-4050-a38e-51366203c950")
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

    @objid ("9b04181a-2f7f-457c-9375-e38ed6eefab7")
    @Override
    public EList<BpmnServiceTask> getCallerServiceTask() {
        return new SmList<>(this, OperationData.Metadata.CallerServiceTaskDep());
    }

    @objid ("9652b451-b146-474c-9213-a18e639082e7")
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

    @objid ("0e20e88f-6962-4832-af7d-7d14da7391dc")
    @Override
    public EList<Event> getOccurence() {
        return new SmList<>(this, OperationData.Metadata.OccurenceDep());
    }

    @objid ("252200e1-982c-4d53-b95f-a020e8e8ac3a")
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

    @objid ("031af3a9-2edb-4475-9c92-ff3e631d6d2f")
    @Override
    public EList<Transition> getInvoker() {
        return new SmList<>(this, OperationData.Metadata.InvokerDep());
    }

    @objid ("156d5f62-981c-4b52-a915-34cce4527add")
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

    @objid ("6276ae82-5de1-42f6-a87e-8c1fb65b7db7")
    @Override
    public EList<CommunicationMessage> getCommunicationUsage() {
        return new SmList<>(this, OperationData.Metadata.CommunicationUsageDep());
    }

    @objid ("7c5c28b1-34cd-4089-a378-7df64417e64e")
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

    @objid ("7d6ddd5c-e90e-4faf-9ab9-10f2b4f7cb97")
    @Override
    public EList<CollaborationUse> getOwnedCollaborationUse() {
        return new SmList<>(this, OperationData.Metadata.OwnedCollaborationUseDep());
    }

    @objid ("5380a258-2668-4660-8b7d-f1aea3e03ea6")
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

    @objid ("916c2b4a-60d0-4649-80bf-ffdc8196227b")
    @Override
    public Operation getRedefines() {
        return (Operation) getDepVal(OperationData.Metadata.RedefinesDep());
    }

    @objid ("d67e7210-323f-45d6-aab7-d939b43e4a46")
    @Override
    public void setRedefines(Operation value) {
        appendDepVal(OperationData.Metadata.RedefinesDep(), (SmObjectImpl)value);
    }

    @objid ("e662bb11-56f1-4803-a136-0ca51b80c9fe")
    @Override
    public EList<BpmnCallActivity> getCaller() {
        return new SmList<>(this, OperationData.Metadata.CallerDep());
    }

    @objid ("a98a62ec-4a39-4353-a868-c8866559f29a")
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

    @objid ("992cbfcd-a22b-4f8d-9efc-fe7ed96bf5c1")
    @Override
    public EList<CallOperationAction> getCallingAction() {
        return new SmList<>(this, OperationData.Metadata.CallingActionDep());
    }

    @objid ("0642d23d-2dad-4865-a55a-cc719daf95ad")
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

    @objid ("501ca557-4809-4ff6-9432-a3663e972718")
    @Override
    public EList<AcceptCallEventAction> getEntryPointAction() {
        return new SmList<>(this, OperationData.Metadata.EntryPointActionDep());
    }

    @objid ("f6ec409a-a368-4aff-9a00-d7bee8bc7f39")
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

    @objid ("aa0139ca-4b75-49cb-a7a6-3301a7fdc8dc")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(OperationData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e28498ad-6964-4361-ad66-d36ba381cc14")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(OperationData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(OperationData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("7dbac72c-22e5-44ee-aca1-854614b26767")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitOperation(this);
        else
          return null;
    }

}
