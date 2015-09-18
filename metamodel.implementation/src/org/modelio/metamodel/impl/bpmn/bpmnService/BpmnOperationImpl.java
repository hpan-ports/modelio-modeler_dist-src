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
package org.modelio.metamodel.impl.bpmn.bpmnService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000d7c30-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnOperationImpl extends BpmnBaseElementImpl implements BpmnOperation {
    @objid ("69d181bf-fa60-4c2e-b4ae-44b50b1e71c1")
    @Override
    public EList<BpmnSendTask> getSender() {
        return new SmList<>(this, BpmnOperationData.Metadata.SenderDep());
    }

    @objid ("4db0541b-b250-4c0a-a67f-07764af4cd13")
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

    @objid ("0c9c1026-df11-4857-a4d6-41e4d2c613b6")
    @Override
    public BpmnMessage getInMessageRef() {
        return (BpmnMessage) getDepVal(BpmnOperationData.Metadata.InMessageRefDep());
    }

    @objid ("6c391d5a-bb9a-4e5e-b98b-d88f5d69c1e0")
    @Override
    public void setInMessageRef(BpmnMessage value) {
        appendDepVal(BpmnOperationData.Metadata.InMessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("88a0263d-6033-4595-80ac-79b86a7e28a8")
    @Override
    public EList<BpmnServiceTask> getCaller() {
        return new SmList<>(this, BpmnOperationData.Metadata.CallerDep());
    }

    @objid ("6bbfc275-0b5d-4514-85a8-e3d787284e88")
    @Override
    public <T extends BpmnServiceTask> List<T> getCaller(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnServiceTask element : getCaller()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ba5c9274-3655-40bc-a779-0f38e7cd9745")
    @Override
    public BpmnMessage getOutMessageRef() {
        return (BpmnMessage) getDepVal(BpmnOperationData.Metadata.OutMessageRefDep());
    }

    @objid ("67ccd054-4b88-406c-bf14-2cef9c4ec1e3")
    @Override
    public void setOutMessageRef(BpmnMessage value) {
        appendDepVal(BpmnOperationData.Metadata.OutMessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("fd75492d-2e3f-4147-816f-7a98f57b023a")
    @Override
    public EList<BpmnMessageEventDefinition> getEventDefinition() {
        return new SmList<>(this, BpmnOperationData.Metadata.EventDefinitionDep());
    }

    @objid ("24cd2116-14bd-4a6a-a4b4-bc1f968af518")
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

    @objid ("6a4cd10b-f90a-4b3c-907f-e875c50d9a28")
    @Override
    public Operation getImplementationRef() {
        return (Operation) getDepVal(BpmnOperationData.Metadata.ImplementationRefDep());
    }

    @objid ("dfdef787-09a6-451c-bd18-2f9992338218")
    @Override
    public void setImplementationRef(Operation value) {
        appendDepVal(BpmnOperationData.Metadata.ImplementationRefDep(), (SmObjectImpl)value);
    }

    @objid ("349f27b3-3a2d-4bdd-8f84-94c01e371053")
    @Override
    public BpmnInterface getBpmnInterfaceRef() {
        return (BpmnInterface) getDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep());
    }

    @objid ("d2c5f984-b034-4178-a01c-e57cc6bcc423")
    @Override
    public void setBpmnInterfaceRef(BpmnInterface value) {
        appendDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep(), (SmObjectImpl)value);
    }

    @objid ("093eeb02-4703-46fd-9f36-2bb860061f40")
    @Override
    public EList<BpmnReceiveTask> getReceiver() {
        return new SmList<>(this, BpmnOperationData.Metadata.ReceiverDep());
    }

    @objid ("60837b63-473a-47fc-8544-6ad48bf6207a")
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

    @objid ("48512be6-5d34-4d2d-825a-e7816a7f71a5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("1f996c26-4354-4a0d-9466-00c6212b69b9")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep());
        if (obj != null)
          return new SmDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("4e38c4d0-8357-42c7-a686-88e0975bc1a1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnOperation(this);
        else
          return null;
    }

}
