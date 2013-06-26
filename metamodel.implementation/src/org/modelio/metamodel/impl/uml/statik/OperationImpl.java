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
    @objid ("12d14f63-a1e7-44a0-9f97-18274252ae71")
    @Override
    public boolean isConcurrency() {
        return (Boolean) getAttVal(OperationData.Metadata.ConcurrencyAtt());
    }

    @objid ("31f9e2ca-fce2-4033-bdd7-9ce291442bfd")
    @Override
    public void setConcurrency(boolean value) {
        setAttVal(OperationData.Metadata.ConcurrencyAtt(), value);
    }

    @objid ("489eea56-7f58-4bcc-9d48-9cab024a82fb")
    @Override
    public boolean isFinal() {
        return (Boolean) getAttVal(OperationData.Metadata.FinalAtt());
    }

    @objid ("307bab61-63b8-43cc-a396-354d7e0f866d")
    @Override
    public void setFinal(boolean value) {
        setAttVal(OperationData.Metadata.FinalAtt(), value);
    }

    @objid ("65fc73f0-8c92-4f14-8ef2-b73826f9fd4d")
    @Override
    public MethodPassingMode getPassing() {
        return (MethodPassingMode) getAttVal(OperationData.Metadata.PassingAtt());
    }

    @objid ("2f25c7eb-3631-4c9e-98cd-9e34ff992dd0")
    @Override
    public void setPassing(MethodPassingMode value) {
        setAttVal(OperationData.Metadata.PassingAtt(), value);
    }

    @objid ("ead1712e-267d-4450-a26f-55f99ef541a0")
    @Override
    public EList<ElementImport> getOwnedImport() {
        return new SmList<>(this, OperationData.Metadata.OwnedImportDep());
    }

    @objid ("84ceb388-0a5b-4c6e-9e81-c6b600bd262b")
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

    @objid ("4ced060a-3e09-4680-92d1-fc0cf5ff32f2")
    @Override
    public EList<RaisedException> getThrown() {
        return new SmList<>(this, OperationData.Metadata.ThrownDep());
    }

    @objid ("73d7635a-7475-416b-adbf-3e4a099b99ed")
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

    @objid ("a5bff199-d3c3-46cd-99b9-44db47d4846d")
    @Override
    public EList<BpmnReceiveTask> getCallerReceiveTask() {
        return new SmList<>(this, OperationData.Metadata.CallerReceiveTaskDep());
    }

    @objid ("b94726e9-0d25-4d5e-9779-16d3645120eb")
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

    @objid ("1fc25448-99cc-4067-8680-c5310996c147")
    @Override
    public EList<Operation> getRedefinition() {
        return new SmList<>(this, OperationData.Metadata.RedefinitionDep());
    }

    @objid ("e0d5988c-82af-4858-b9f9-cc0c68bbc820")
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

    @objid ("391a1486-8c23-4d5b-a1db-0f4c530f8c7c")
    @Override
    public EList<Collaboration> getExample() {
        return new SmList<>(this, OperationData.Metadata.ExampleDep());
    }

    @objid ("066cf8a0-88b6-474a-985a-1767c8f6b318")
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

    @objid ("705cddfa-60e1-476a-aae5-171f8089e09d")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, OperationData.Metadata.SRepresentationDep());
    }

    @objid ("2c12449d-54ad-44e8-8fc2-8d8c8d00de60")
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

    @objid ("01f765c8-0a50-447f-8a19-208be1fccccd")
    @Override
    public EList<Behavior> getOwnedBehavior() {
        return new SmList<>(this, OperationData.Metadata.OwnedBehaviorDep());
    }

    @objid ("82d881c3-19a7-4c90-8a55-123636e123c6")
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

    @objid ("fa8a0bfb-5169-410f-b7e1-3f01b2d835d3")
    @Override
    public EList<BpmnOperation> getBpmnOperationRef() {
        return new SmList<>(this, OperationData.Metadata.BpmnOperationRefDep());
    }

    @objid ("a3b93582-d5ce-4293-87c3-fe31dd507b94")
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

    @objid ("289b2c71-460e-44e6-a1e9-efd2e784d4a6")
    @Override
    public EList<BpmnSendTask> getCallerSendTask() {
        return new SmList<>(this, OperationData.Metadata.CallerSendTaskDep());
    }

    @objid ("cca521f9-0b8b-4841-a773-734ce80dd024")
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

    @objid ("c46e8090-906c-4494-b80a-ff8d67c195ab")
    @Override
    public EList<Parameter> getIO() {
        return new SmList<>(this, OperationData.Metadata.IODep());
    }

    @objid ("2ae54634-c6b6-4160-b57a-d2ba5acc9a5d")
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

    @objid ("22d2b4df-529a-4f93-bae5-73216814e7f4")
    @Override
    public EList<TemplateBinding> getTemplateInstanciation() {
        return new SmList<>(this, OperationData.Metadata.TemplateInstanciationDep());
    }

    @objid ("b642e5d6-6cdf-4cf7-bd87-90b4b0fbda6b")
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

    @objid ("51bf1ff4-d6f4-4ef6-84d0-0b76585ecc89")
    @Override
    public Classifier getOwner() {
        return (Classifier) getDepVal(OperationData.Metadata.OwnerDep());
    }

    @objid ("c75da10e-4afb-48ae-93e1-57c8417d40fa")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(OperationData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("0dacf953-0680-476d-812e-0921f8da8c52")
    @Override
    public EList<PackageImport> getOwnedPackageImport() {
        return new SmList<>(this, OperationData.Metadata.OwnedPackageImportDep());
    }

    @objid ("c3c8ecef-259c-4f0c-b259-b2825c695268")
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

    @objid ("4f815fc1-9fb6-407e-aec2-18945036cd1c")
    @Override
    public Parameter getReturn() {
        return (Parameter) getDepVal(OperationData.Metadata.ReturnDep());
    }

    @objid ("398d2d82-21eb-4243-88fc-278e1aab6695")
    @Override
    public void setReturn(Parameter value) {
        appendDepVal(OperationData.Metadata.ReturnDep(), (SmObjectImpl)value);
    }

    @objid ("ec966910-2fe8-43cf-993e-91537beb44ff")
    @Override
    public EList<TemplateBinding> getInstanciatingBinding() {
        return new SmList<>(this, OperationData.Metadata.InstanciatingBindingDep());
    }

    @objid ("02316923-aead-4ade-8de0-708472942a7d")
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

    @objid ("95ecf328-ebb5-442a-ad61-fd6af5fe06a9")
    @Override
    public EList<Message> getUsage() {
        return new SmList<>(this, OperationData.Metadata.UsageDep());
    }

    @objid ("76c5a67c-c1d0-4e3a-8d69-4bfc6e61281e")
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

    @objid ("7ae1aeb2-0fdc-485d-bf6d-8257d771b295")
    @Override
    public EList<TemplateParameter> getTemplate() {
        return new SmList<>(this, OperationData.Metadata.TemplateDep());
    }

    @objid ("bddb277e-0d0d-4b43-b576-a6cce90be0c7")
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

    @objid ("f45cfaab-a258-4bab-b719-bfe13579e106")
    @Override
    public EList<BpmnServiceTask> getCallerServiceTask() {
        return new SmList<>(this, OperationData.Metadata.CallerServiceTaskDep());
    }

    @objid ("47fed04d-a230-42a2-8864-9e77b8bedbab")
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

    @objid ("50d98866-ddab-4a49-b23c-66519aab3f3e")
    @Override
    public EList<Event> getOccurence() {
        return new SmList<>(this, OperationData.Metadata.OccurenceDep());
    }

    @objid ("ff486ef1-bd5c-4046-8a78-07ed06dadc5f")
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

    @objid ("2c752932-2923-463c-a394-d04a45a9f694")
    @Override
    public EList<Transition> getInvoker() {
        return new SmList<>(this, OperationData.Metadata.InvokerDep());
    }

    @objid ("b0354193-a165-44f8-8548-db47b8a63426")
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

    @objid ("5b098add-6687-4a2b-a478-7bee5df3ab42")
    @Override
    public EList<CommunicationMessage> getCommunicationUsage() {
        return new SmList<>(this, OperationData.Metadata.CommunicationUsageDep());
    }

    @objid ("7e4adc56-6667-4a5c-9d90-ee418305f8f7")
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

    @objid ("34169e0a-93d7-41c6-9147-aa4da9bb2c6a")
    @Override
    public EList<CollaborationUse> getOwnedCollaborationUse() {
        return new SmList<>(this, OperationData.Metadata.OwnedCollaborationUseDep());
    }

    @objid ("d1cb8ab3-b9fc-427c-905f-5696c0879f7a")
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

    @objid ("caa0490b-da62-4019-ba17-fb9486eb43ac")
    @Override
    public Operation getRedefines() {
        return (Operation) getDepVal(OperationData.Metadata.RedefinesDep());
    }

    @objid ("2c9bee22-6688-4725-8ee3-2097fabaa54c")
    @Override
    public void setRedefines(Operation value) {
        appendDepVal(OperationData.Metadata.RedefinesDep(), (SmObjectImpl)value);
    }

    @objid ("947c9e13-9725-47c9-8ad3-d5910de5846b")
    @Override
    public EList<BpmnCallActivity> getCaller() {
        return new SmList<>(this, OperationData.Metadata.CallerDep());
    }

    @objid ("a63579e1-bb9f-4566-97e3-dcdd128dab4f")
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

    @objid ("b86ee361-38e5-4f13-afef-a86ce2dbd9a7")
    @Override
    public EList<CallOperationAction> getCallingAction() {
        return new SmList<>(this, OperationData.Metadata.CallingActionDep());
    }

    @objid ("5fe938b7-2330-4c87-99ea-d40db9f417c1")
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

    @objid ("8ae9984c-2da6-4f63-80dc-189d07747829")
    @Override
    public EList<AcceptCallEventAction> getEntryPointAction() {
        return new SmList<>(this, OperationData.Metadata.EntryPointActionDep());
    }

    @objid ("9e21fbed-3591-4777-bc0d-16b25670c47b")
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

    @objid ("994be3dd-0259-4464-9a49-6e6dc72a6f65")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(OperationData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("cadbdce5-83b7-464f-b257-2232eac04848")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(OperationData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(OperationData.Metadata.OwnerDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c9ac2894-79d8-4467-8c6c-9758ddca6266")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitOperation(this);
        else
          return null;
    }

}
