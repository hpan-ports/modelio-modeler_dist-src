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
    @objid ("cb08f881-c973-4753-866e-d5488a5ba79d")
    @Override
    public EList<BpmnSendTask> getSender() {
        return new SmList<>(this, BpmnOperationData.Metadata.SenderDep());
    }

    @objid ("aa991cf5-e8f1-46e6-8f88-35570b8060d3")
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

    @objid ("d2c68af4-38c3-4bab-8250-78aceabeb798")
    @Override
    public BpmnMessage getInMessageRef() {
        return (BpmnMessage) getDepVal(BpmnOperationData.Metadata.InMessageRefDep());
    }

    @objid ("4c2e7b83-e726-414a-ada8-af6976e7cb64")
    @Override
    public void setInMessageRef(BpmnMessage value) {
        appendDepVal(BpmnOperationData.Metadata.InMessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("87a06419-4959-43ed-85cb-25e4166cec4c")
    @Override
    public EList<BpmnServiceTask> getCaller() {
        return new SmList<>(this, BpmnOperationData.Metadata.CallerDep());
    }

    @objid ("0af28bf1-dcda-4d21-914a-580d471d546c")
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

    @objid ("87456d1c-5c7b-4cd6-90b5-a16da5e13822")
    @Override
    public BpmnMessage getOutMessageRef() {
        return (BpmnMessage) getDepVal(BpmnOperationData.Metadata.OutMessageRefDep());
    }

    @objid ("06c3187c-d493-4763-90a8-1551d3887f5b")
    @Override
    public void setOutMessageRef(BpmnMessage value) {
        appendDepVal(BpmnOperationData.Metadata.OutMessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("5f2b6993-24a6-4183-a0aa-28dbdff69fef")
    @Override
    public EList<BpmnMessageEventDefinition> getEventDefinition() {
        return new SmList<>(this, BpmnOperationData.Metadata.EventDefinitionDep());
    }

    @objid ("801822db-2716-4ba0-9ed4-55365073b5f5")
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

    @objid ("04ec076f-9816-474d-b91e-0be0c111b2c6")
    @Override
    public Operation getImplementationRef() {
        return (Operation) getDepVal(BpmnOperationData.Metadata.ImplementationRefDep());
    }

    @objid ("520c518d-678a-4a34-aee6-95f59da187b0")
    @Override
    public void setImplementationRef(Operation value) {
        appendDepVal(BpmnOperationData.Metadata.ImplementationRefDep(), (SmObjectImpl)value);
    }

    @objid ("aae579af-0ad2-4227-9317-dbecea6234b5")
    @Override
    public BpmnInterface getBpmnInterfaceRef() {
        return (BpmnInterface) getDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep());
    }

    @objid ("fc12bc6b-9844-4dea-8f37-2bbd46744418")
    @Override
    public void setBpmnInterfaceRef(BpmnInterface value) {
        appendDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep(), (SmObjectImpl)value);
    }

    @objid ("7745b5c9-3150-4ff0-9b16-087287522c2f")
    @Override
    public EList<BpmnReceiveTask> getReceiver() {
        return new SmList<>(this, BpmnOperationData.Metadata.ReceiverDep());
    }

    @objid ("35c39d64-3c59-4757-b097-cde293c4c5b8")
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

    @objid ("8215abf9-b9d4-4752-99b6-b8e06b780a96")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("05e3d0f9-83fe-4878-9d86-c3cff5eabb22")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep());
        if (obj != null)
          return new SmDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("732b9e92-086f-4f0c-ae71-a5d0c6a285b7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnOperation(this);
        else
          return null;
    }

}
