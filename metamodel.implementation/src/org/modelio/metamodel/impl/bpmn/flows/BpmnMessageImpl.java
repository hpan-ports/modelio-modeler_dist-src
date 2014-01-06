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
    @objid ("ac487533-99bd-4cb7-adb7-29f924eb086a")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(BpmnMessageData.Metadata.TypeDep());
    }

    @objid ("a58aacec-f080-40f7-ae39-c20f1e833f7d")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(BpmnMessageData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("0321f2c3-73eb-4f6a-afd0-4f50202382c8")
    @Override
    public EList<BpmnOperation> getOutputMessage() {
        return new SmList<>(this, BpmnMessageData.Metadata.OutputMessageDep());
    }

    @objid ("d61ad813-7310-415d-b232-fea59c16f89f")
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

    @objid ("3673351d-d13a-4602-b9e5-2e32539de5ff")
    @Override
    public BpmnItemDefinition getItemRef() {
        return (BpmnItemDefinition) getDepVal(BpmnMessageData.Metadata.ItemRefDep());
    }

    @objid ("bae540e0-e81f-4e83-8a1a-4b5669bdcb79")
    @Override
    public void setItemRef(BpmnItemDefinition value) {
        appendDepVal(BpmnMessageData.Metadata.ItemRefDep(), (SmObjectImpl)value);
    }

    @objid ("9f86f429-7d37-4c11-a907-88a86361375f")
    @Override
    public State getInState() {
        return (State) getDepVal(BpmnMessageData.Metadata.InStateDep());
    }

    @objid ("12643579-f228-437c-938e-734ccd356f32")
    @Override
    public void setInState(State value) {
        appendDepVal(BpmnMessageData.Metadata.InStateDep(), (SmObjectImpl)value);
    }

    @objid ("b40892fb-5c29-4eaa-99ce-a5f14f8490e8")
    @Override
    public EList<BpmnMessageEventDefinition> getEventDefinition() {
        return new SmList<>(this, BpmnMessageData.Metadata.EventDefinitionDep());
    }

    @objid ("f01815d2-6f99-4ae5-bfa9-c64fc8ce2f8b")
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

    @objid ("498e5a97-88c9-47f8-981c-a2de2bef410f")
    @Override
    public EList<BpmnSendTask> getSender() {
        return new SmList<>(this, BpmnMessageData.Metadata.SenderDep());
    }

    @objid ("f77aebdf-a684-4d7d-88e1-d7e7dfff4c64")
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

    @objid ("cb8b118b-d0dd-436f-b657-36a689c7d3ce")
    @Override
    public EList<BpmnOperation> getInputMessage() {
        return new SmList<>(this, BpmnMessageData.Metadata.InputMessageDep());
    }

    @objid ("fe275066-375a-4cc5-b87d-00d3d5183151")
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

    @objid ("ecdfc636-c457-4223-a10d-6ab059b3417a")
    @Override
    public EList<BpmnReceiveTask> getReceiver() {
        return new SmList<>(this, BpmnMessageData.Metadata.ReceiverDep());
    }

    @objid ("abbc8236-26f1-477c-81c6-c203fbdb9338")
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

    @objid ("55918082-e7b6-4bc2-9744-f5e696456e10")
    @Override
    public EList<BpmnMessageFlow> getMessageFlow() {
        return new SmList<>(this, BpmnMessageData.Metadata.MessageFlowDep());
    }

    @objid ("0c586135-9a81-497c-ae39-74f81ea3f391")
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

    @objid ("ee163f9d-e2d5-4c49-8d83-e7f3428baef6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("eb71bc52-f9d6-44dc-8b74-eadbd429722c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("32c436a0-9b57-4ddf-aed9-88f95aca9551")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMessage(this);
        else
          return null;
    }

}
