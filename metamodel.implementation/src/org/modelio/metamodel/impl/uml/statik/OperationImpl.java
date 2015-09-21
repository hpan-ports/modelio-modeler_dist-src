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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
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
import org.modelio.metamodel.impl.uml.statik.OperationData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0014913c-c4bf-1fd8-97fe-001ec947cd2a")
public class OperationImpl extends BehavioralFeatureImpl implements Operation {
    @objid ("e79b829a-dec4-42e2-ba52-0a081759c34d")
    @Override
    public boolean isConcurrency() {
        return (Boolean) getAttVal(((OperationSmClass)getClassOf()).getConcurrencyAtt());
    }

    @objid ("0366c910-6da8-4ee3-a589-cabc75a7eb91")
    @Override
    public void setConcurrency(boolean value) {
        setAttVal(((OperationSmClass)getClassOf()).getConcurrencyAtt(), value);
    }

    @objid ("42811a43-c722-40f6-8cb9-8dde55ae8e3d")
    @Override
    public boolean isFinal() {
        return (Boolean) getAttVal(((OperationSmClass)getClassOf()).getFinalAtt());
    }

    @objid ("39f97483-02cd-4b8f-a72d-44bafbd484ac")
    @Override
    public void setFinal(boolean value) {
        setAttVal(((OperationSmClass)getClassOf()).getFinalAtt(), value);
    }

    @objid ("37dcf63e-a70b-4c8f-8245-5e2d202edf53")
    @Override
    public MethodPassingMode getPassing() {
        return (MethodPassingMode) getAttVal(((OperationSmClass)getClassOf()).getPassingAtt());
    }

    @objid ("cbfad949-0b02-429b-9666-4769019bdc7a")
    @Override
    public void setPassing(MethodPassingMode value) {
        setAttVal(((OperationSmClass)getClassOf()).getPassingAtt(), value);
    }

    @objid ("e6c511cb-3d07-409a-8902-9e2b5f8a47ea")
    @Override
    public EList<ElementImport> getOwnedImport() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getOwnedImportDep());
    }

    @objid ("bf633ba7-36e3-42b2-ae86-a6ac742294e9")
    @Override
    public <T extends ElementImport> List<T> getOwnedImport(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ElementImport element : getOwnedImport()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ed7442d0-8829-40ac-8af8-be135e33d7e4")
    @Override
    public EList<RaisedException> getThrown() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getThrownDep());
    }

    @objid ("9f01b180-0ad0-48af-bfd8-eae98c8b013b")
    @Override
    public <T extends RaisedException> List<T> getThrown(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final RaisedException element : getThrown()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("12b82146-6be2-4cd2-ad2c-3d8bdd1696fc")
    @Override
    public EList<BpmnReceiveTask> getCallerReceiveTask() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getCallerReceiveTaskDep());
    }

    @objid ("bd5915e4-2d5a-49ed-9e66-434a8a4e558b")
    @Override
    public <T extends BpmnReceiveTask> List<T> getCallerReceiveTask(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnReceiveTask element : getCallerReceiveTask()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("83c2e612-d2c5-4ce8-99db-e7432940c4eb")
    @Override
    public EList<Operation> getRedefinition() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getRedefinitionDep());
    }

    @objid ("7b5a66c7-4861-4491-bbf8-7805d7336f6e")
    @Override
    public <T extends Operation> List<T> getRedefinition(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Operation element : getRedefinition()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2266555e-d558-4a21-b901-8e62b09877cb")
    @Override
    public EList<Collaboration> getExample() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getExampleDep());
    }

    @objid ("a6862dcc-adb6-4166-ad5d-3fb2cd506b17")
    @Override
    public <T extends Collaboration> List<T> getExample(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Collaboration element : getExample()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5d48978f-5a14-49d8-b23d-948a888d8ee8")
    @Override
    public EList<Signal> getSRepresentation() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getSRepresentationDep());
    }

    @objid ("42951613-39b9-4dbf-bc3e-2dd4eae32612")
    @Override
    public <T extends Signal> List<T> getSRepresentation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Signal element : getSRepresentation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fea5af99-794b-4104-9281-dfc6909b0b69")
    @Override
    public EList<Behavior> getOwnedBehavior() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getOwnedBehaviorDep());
    }

    @objid ("9fb20d57-700d-4bb3-8405-5b47cafc8578")
    @Override
    public <T extends Behavior> List<T> getOwnedBehavior(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Behavior element : getOwnedBehavior()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4856446f-0bf3-4cee-8dfa-a8bdf07a22dd")
    @Override
    public EList<BpmnOperation> getBpmnOperationRef() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getBpmnOperationRefDep());
    }

    @objid ("882fcb4a-6e62-4a46-9bab-b96fa31ba627")
    @Override
    public <T extends BpmnOperation> List<T> getBpmnOperationRef(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnOperation element : getBpmnOperationRef()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2bde8dc1-e28f-41f1-a986-49d48478c4bf")
    @Override
    public EList<BpmnSendTask> getCallerSendTask() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getCallerSendTaskDep());
    }

    @objid ("8e06973a-b902-46db-b66b-328045191ceb")
    @Override
    public <T extends BpmnSendTask> List<T> getCallerSendTask(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnSendTask element : getCallerSendTask()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c5ae5d7d-1fc4-4322-b946-b66560376a05")
    @Override
    public EList<Parameter> getIO() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getIODep());
    }

    @objid ("b5920b79-6cda-4cb6-874a-c35077d7cdae")
    @Override
    public <T extends Parameter> List<T> getIO(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Parameter element : getIO()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("43a9b014-de12-4cf9-91f3-520816892d60")
    @Override
    public EList<TemplateBinding> getTemplateInstanciation() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getTemplateInstanciationDep());
    }

    @objid ("03367907-3246-4350-b404-286cdcaa828d")
    @Override
    public <T extends TemplateBinding> List<T> getTemplateInstanciation(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TemplateBinding element : getTemplateInstanciation()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e4d8fdc3-e6b5-43fc-840d-11dc1e4f5a20")
    @Override
    public Classifier getOwner() {
        Object obj = getDepVal(((OperationSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof Classifier)? (Classifier)obj : null;
    }

    @objid ("600e4a2b-d533-47ee-b594-3093dfe561c5")
    @Override
    public void setOwner(Classifier value) {
        appendDepVal(((OperationSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("287b75a6-a8d6-423c-b3d7-4acdf64c4259")
    @Override
    public EList<PackageImport> getOwnedPackageImport() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getOwnedPackageImportDep());
    }

    @objid ("251dd7e2-1bf6-40a0-b90a-dfa7f1c03de3")
    @Override
    public <T extends PackageImport> List<T> getOwnedPackageImport(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final PackageImport element : getOwnedPackageImport()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4639f908-9bb4-4837-ab20-409dfae2e52f")
    @Override
    public Parameter getReturn() {
        Object obj = getDepVal(((OperationSmClass)getClassOf()).getReturnDep());
        return (obj instanceof Parameter)? (Parameter)obj : null;
    }

    @objid ("db762131-4411-4103-957a-f345c46dc52b")
    @Override
    public void setReturn(Parameter value) {
        appendDepVal(((OperationSmClass)getClassOf()).getReturnDep(), (SmObjectImpl)value);
    }

    @objid ("15fde295-efa2-4d1f-b8c7-f85d2c3f4ab0")
    @Override
    public EList<TemplateBinding> getInstanciatingBinding() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getInstanciatingBindingDep());
    }

    @objid ("74ae40a2-7dcc-4853-832e-a8d93676ce66")
    @Override
    public <T extends TemplateBinding> List<T> getInstanciatingBinding(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TemplateBinding element : getInstanciatingBinding()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e914045c-df68-4441-a305-aebbb81cd3e7")
    @Override
    public EList<Message> getUsage() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getUsageDep());
    }

    @objid ("312ace4e-31dc-4191-b097-09ff5cdbc24a")
    @Override
    public <T extends Message> List<T> getUsage(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Message element : getUsage()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9a4f0efe-66d2-4dbe-8389-5f0bfe6f568a")
    @Override
    public EList<TemplateParameter> getTemplate() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getTemplateDep());
    }

    @objid ("3592ca77-77fa-4e5c-923d-f8ebbb65ef12")
    @Override
    public <T extends TemplateParameter> List<T> getTemplate(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final TemplateParameter element : getTemplate()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ebfb30f2-e37e-4599-8b78-ef609f515732")
    @Override
    public EList<BpmnServiceTask> getCallerServiceTask() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getCallerServiceTaskDep());
    }

    @objid ("84c5afa7-3f8e-400e-9253-081b62beaae6")
    @Override
    public <T extends BpmnServiceTask> List<T> getCallerServiceTask(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnServiceTask element : getCallerServiceTask()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("60e87988-2129-41a2-b290-9cd5785563e5")
    @Override
    public EList<Event> getOccurence() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getOccurenceDep());
    }

    @objid ("02695cf3-6600-411d-81e7-0c07a596969a")
    @Override
    public <T extends Event> List<T> getOccurence(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Event element : getOccurence()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("19e02ecb-bf2a-4ca9-8e55-c0a4cb790c8f")
    @Override
    public EList<Transition> getInvoker() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getInvokerDep());
    }

    @objid ("3bc2bdbd-7dc0-40b8-b4c7-813141873b4c")
    @Override
    public <T extends Transition> List<T> getInvoker(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Transition element : getInvoker()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f406bb1f-6a0c-40d7-958d-d11429baa73a")
    @Override
    public EList<CommunicationMessage> getCommunicationUsage() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getCommunicationUsageDep());
    }

    @objid ("547cded0-801b-4a38-ab3e-ced4c3cb2303")
    @Override
    public <T extends CommunicationMessage> List<T> getCommunicationUsage(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final CommunicationMessage element : getCommunicationUsage()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("40255056-fcc8-474a-833b-9b8cdab17ea1")
    @Override
    public EList<CollaborationUse> getOwnedCollaborationUse() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getOwnedCollaborationUseDep());
    }

    @objid ("859ef2c5-3f15-4b10-875a-33d9e9082a9d")
    @Override
    public <T extends CollaborationUse> List<T> getOwnedCollaborationUse(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final CollaborationUse element : getOwnedCollaborationUse()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a8d45d45-e18e-4876-87c7-387789266ae1")
    @Override
    public Operation getRedefines() {
        Object obj = getDepVal(((OperationSmClass)getClassOf()).getRedefinesDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("25dd8508-3b2e-42a1-8d26-c6b8af72b0fb")
    @Override
    public void setRedefines(Operation value) {
        appendDepVal(((OperationSmClass)getClassOf()).getRedefinesDep(), (SmObjectImpl)value);
    }

    @objid ("e03ca01b-3918-454e-ad8a-67e10b4c9873")
    @Override
    public EList<BpmnCallActivity> getCaller() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getCallerDep());
    }

    @objid ("b7c876db-c9d4-4770-91cb-402ba0b93d48")
    @Override
    public <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnCallActivity element : getCaller()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("02dd5e66-f764-42a1-9dd7-50cf726071ff")
    @Override
    public EList<CallOperationAction> getCallingAction() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getCallingActionDep());
    }

    @objid ("f8630827-6e4e-4dda-a7ad-fa41995fafe6")
    @Override
    public <T extends CallOperationAction> List<T> getCallingAction(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final CallOperationAction element : getCallingAction()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cdc1111d-31e1-4e08-ba1e-eb4383d19d0b")
    @Override
    public EList<AcceptCallEventAction> getEntryPointAction() {
        return new SmList<>(this, ((OperationSmClass)getClassOf()).getEntryPointActionDep());
    }

    @objid ("39f7f633-8574-4b46-af82-369ef046ad43")
    @Override
    public <T extends AcceptCallEventAction> List<T> getEntryPointAction(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final AcceptCallEventAction element : getEntryPointAction()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4dfd80fd-523d-4578-a748-2cda4bb31f17")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((OperationSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("22e2b55b-72c2-4b04-930a-6794c0320971")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((OperationSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("4efea2b6-d53a-4ea9-8537-78a96a5225a1")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitOperation(this);
        else
          return null;
    }

}
