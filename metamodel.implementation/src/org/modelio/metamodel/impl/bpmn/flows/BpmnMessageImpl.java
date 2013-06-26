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
package org.modelio.metamodel.impl.bpmn.flows;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("007c0b32-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnMessageImpl extends BpmnRootElementImpl implements BpmnMessage {
    @objid ("bb8e90ad-2280-4bf4-8816-c1b6f7be6fa6")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(BpmnMessageData.Metadata.TypeDep());
    }

    @objid ("8abbfbfd-b2f3-4656-bedf-278ac4c30852")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(BpmnMessageData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("a94e82ca-7443-4644-8732-e5518690b8da")
    @Override
    public EList<BpmnOperation> getOutputMessage() {
        return new SmList<>(this, BpmnMessageData.Metadata.OutputMessageDep());
    }

    @objid ("a195dd10-9809-40f9-80a4-a19e04818abf")
    @Override
    public <T extends BpmnOperation> List<T> getOutputMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnOperation element : getOutputMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("67869b2d-6d65-4748-8683-bfb488772095")
    @Override
    public BpmnItemDefinition getItemRef() {
        return (BpmnItemDefinition) getDepVal(BpmnMessageData.Metadata.ItemRefDep());
    }

    @objid ("3c774e4e-d217-41ae-b6d6-0141e3c69928")
    @Override
    public void setItemRef(BpmnItemDefinition value) {
        appendDepVal(BpmnMessageData.Metadata.ItemRefDep(), (SmObjectImpl)value);
    }

    @objid ("5a9bcc43-35cb-44d2-9cdf-4164a3cdf273")
    @Override
    public State getInState() {
        return (State) getDepVal(BpmnMessageData.Metadata.InStateDep());
    }

    @objid ("25bee843-6036-46cf-a747-944981908dc4")
    @Override
    public void setInState(State value) {
        appendDepVal(BpmnMessageData.Metadata.InStateDep(), (SmObjectImpl)value);
    }

    @objid ("c2d86ef4-60d1-4ff9-b6d6-a8bee0de62f7")
    @Override
    public EList<BpmnMessageEventDefinition> getEventDefinition() {
        return new SmList<>(this, BpmnMessageData.Metadata.EventDefinitionDep());
    }

    @objid ("12d0ae43-994f-45b8-9593-4f4a6d82a97e")
    @Override
    public <T extends BpmnMessageEventDefinition> List<T> getEventDefinition(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnMessageEventDefinition element : getEventDefinition()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5acbfba1-5a77-40e9-8826-0a5ba6c14517")
    @Override
    public EList<BpmnSendTask> getSender() {
        return new SmList<>(this, BpmnMessageData.Metadata.SenderDep());
    }

    @objid ("916b2d7c-d5d9-4157-83ca-3fc2f1a5e77b")
    @Override
    public <T extends BpmnSendTask> List<T> getSender(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnSendTask element : getSender()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("dd9a97c3-31b5-4fe1-a0e6-1d909c048574")
    @Override
    public EList<BpmnOperation> getInputMessage() {
        return new SmList<>(this, BpmnMessageData.Metadata.InputMessageDep());
    }

    @objid ("3c7652a8-4cbb-4efc-b6c8-1fe2aaf7b0c5")
    @Override
    public <T extends BpmnOperation> List<T> getInputMessage(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnOperation element : getInputMessage()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5e998686-995d-4f30-9296-f60c23a30727")
    @Override
    public EList<BpmnReceiveTask> getReceiver() {
        return new SmList<>(this, BpmnMessageData.Metadata.ReceiverDep());
    }

    @objid ("3bec97d0-5657-4579-8a1f-6f2b22cf980d")
    @Override
    public <T extends BpmnReceiveTask> List<T> getReceiver(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnReceiveTask element : getReceiver()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("90299409-ae29-4e13-b7f5-538959c04406")
    @Override
    public EList<BpmnMessageFlow> getMessageFlow() {
        return new SmList<>(this, BpmnMessageData.Metadata.MessageFlowDep());
    }

    @objid ("edf3e63c-ec57-4ca7-b7f6-a2aaff3d0dd7")
    @Override
    public <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnMessageFlow element : getMessageFlow()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4d7262fe-bfa1-41ba-b2ed-f4668de33051")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("011b7843-c463-42a2-b7b1-e2275bd406b0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("4a3d86f1-67a1-4152-b152-77886f4750e1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMessage(this);
        else
          return null;
    }

}
