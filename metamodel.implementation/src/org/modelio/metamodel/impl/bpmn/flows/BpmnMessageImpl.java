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
    @objid ("3e50b213-79fc-4635-a9da-dba63e3959ed")
    @Override
    public GeneralClass getType() {
        return (GeneralClass) getDepVal(BpmnMessageData.Metadata.TypeDep());
    }

    @objid ("f74f0de9-2d9a-446c-9b9e-e0b6e75068b7")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(BpmnMessageData.Metadata.TypeDep(), (SmObjectImpl)value);
    }

    @objid ("079c5be9-9dd7-408b-a638-e2823c058e49")
    @Override
    public EList<BpmnOperation> getOutputMessage() {
        return new SmList<>(this, BpmnMessageData.Metadata.OutputMessageDep());
    }

    @objid ("83aabae1-dd95-4018-9afa-fa30b36ebe4e")
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

    @objid ("4b3cb9c4-00ac-453a-a815-e5cb61a4011b")
    @Override
    public BpmnItemDefinition getItemRef() {
        return (BpmnItemDefinition) getDepVal(BpmnMessageData.Metadata.ItemRefDep());
    }

    @objid ("fa7a323e-deab-4cd1-a773-455677eae1d2")
    @Override
    public void setItemRef(BpmnItemDefinition value) {
        appendDepVal(BpmnMessageData.Metadata.ItemRefDep(), (SmObjectImpl)value);
    }

    @objid ("5e25bf4d-e54a-4eba-92d2-6bdfd0ed74ca")
    @Override
    public State getInState() {
        return (State) getDepVal(BpmnMessageData.Metadata.InStateDep());
    }

    @objid ("6618935d-f890-4086-a96e-9c82dd702af5")
    @Override
    public void setInState(State value) {
        appendDepVal(BpmnMessageData.Metadata.InStateDep(), (SmObjectImpl)value);
    }

    @objid ("2cc88440-d722-4449-bbf6-71fbc26293c7")
    @Override
    public EList<BpmnMessageEventDefinition> getEventDefinition() {
        return new SmList<>(this, BpmnMessageData.Metadata.EventDefinitionDep());
    }

    @objid ("903ecc48-8ae0-4fef-ab9f-1d364e82df9e")
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

    @objid ("cd3ad060-e34d-463d-b737-2b647e5a84ee")
    @Override
    public EList<BpmnSendTask> getSender() {
        return new SmList<>(this, BpmnMessageData.Metadata.SenderDep());
    }

    @objid ("270ff078-7366-4408-8ffe-f07c3badf9d1")
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

    @objid ("e4eb4e2d-893d-470a-899b-d1f7194df5ed")
    @Override
    public EList<BpmnOperation> getInputMessage() {
        return new SmList<>(this, BpmnMessageData.Metadata.InputMessageDep());
    }

    @objid ("94e69ed5-8c4c-47c2-a364-0895f0e41430")
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

    @objid ("86a6f01f-fa4c-4d4a-a270-d2e7b9151b0d")
    @Override
    public EList<BpmnReceiveTask> getReceiver() {
        return new SmList<>(this, BpmnMessageData.Metadata.ReceiverDep());
    }

    @objid ("41ae9c9c-4798-4b65-80b8-adc44532f3bf")
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

    @objid ("2a508674-f280-464a-8cdf-4d65ded17f4a")
    @Override
    public EList<BpmnMessageFlow> getMessageFlow() {
        return new SmList<>(this, BpmnMessageData.Metadata.MessageFlowDep());
    }

    @objid ("6837ebf0-29d0-4f1b-bfb0-e1457b3d7b86")
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

    @objid ("fe2f6baf-46b6-45d8-abf2-e0bca543e547")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("05883569-023f-4e03-a940-57a9294c2a96")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("23f28338-3f9f-466b-90ef-4ce1340ffa4b")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMessage(this);
        else
          return null;
    }

}
