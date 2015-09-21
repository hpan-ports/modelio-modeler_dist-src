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
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnOperationData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("000d7c30-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnOperationImpl extends BpmnBaseElementImpl implements BpmnOperation {
    @objid ("43bda7de-b7b4-4832-8135-7de979acf5b2")
    @Override
    public EList<BpmnSendTask> getSender() {
        return new SmList<>(this, ((BpmnOperationSmClass)getClassOf()).getSenderDep());
    }

    @objid ("f5e85183-7479-4999-8fca-26d606d4af33")
    @Override
    public <T extends BpmnSendTask> List<T> getSender(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnSendTask element : getSender()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("23d9c1e2-c619-4114-9ec8-a88ecba90922")
    @Override
    public BpmnMessage getInMessageRef() {
        Object obj = getDepVal(((BpmnOperationSmClass)getClassOf()).getInMessageRefDep());
        return (obj instanceof BpmnMessage)? (BpmnMessage)obj : null;
    }

    @objid ("9d53b65c-6452-412c-aa3f-fc28f0df52aa")
    @Override
    public void setInMessageRef(BpmnMessage value) {
        appendDepVal(((BpmnOperationSmClass)getClassOf()).getInMessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("5488f506-4adc-4753-b5d5-125791baea83")
    @Override
    public EList<BpmnServiceTask> getCaller() {
        return new SmList<>(this, ((BpmnOperationSmClass)getClassOf()).getCallerDep());
    }

    @objid ("be14dec9-1077-4714-831b-2528b7d9ec2a")
    @Override
    public <T extends BpmnServiceTask> List<T> getCaller(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnServiceTask element : getCaller()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f66e0cdc-8462-4200-9028-f2e534c69a62")
    @Override
    public BpmnMessage getOutMessageRef() {
        Object obj = getDepVal(((BpmnOperationSmClass)getClassOf()).getOutMessageRefDep());
        return (obj instanceof BpmnMessage)? (BpmnMessage)obj : null;
    }

    @objid ("e1cb9e6b-81bc-4737-8ee9-faafa5f1e587")
    @Override
    public void setOutMessageRef(BpmnMessage value) {
        appendDepVal(((BpmnOperationSmClass)getClassOf()).getOutMessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("209036b0-8b69-4604-91a4-790241e8f61a")
    @Override
    public EList<BpmnMessageEventDefinition> getEventDefinition() {
        return new SmList<>(this, ((BpmnOperationSmClass)getClassOf()).getEventDefinitionDep());
    }

    @objid ("3214ba2e-97fa-472d-a46d-1f22fa60e90e")
    @Override
    public <T extends BpmnMessageEventDefinition> List<T> getEventDefinition(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnMessageEventDefinition element : getEventDefinition()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f73d4967-0602-450b-a006-5e4c1eeec7aa")
    @Override
    public Operation getImplementationRef() {
        Object obj = getDepVal(((BpmnOperationSmClass)getClassOf()).getImplementationRefDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("2f2637f3-54af-470e-8748-5024248b3892")
    @Override
    public void setImplementationRef(Operation value) {
        appendDepVal(((BpmnOperationSmClass)getClassOf()).getImplementationRefDep(), (SmObjectImpl)value);
    }

    @objid ("a3f388fd-2cfc-4e35-8db0-4938e1ec8b06")
    @Override
    public BpmnInterface getBpmnInterfaceRef() {
        Object obj = getDepVal(((BpmnOperationSmClass)getClassOf()).getBpmnInterfaceRefDep());
        return (obj instanceof BpmnInterface)? (BpmnInterface)obj : null;
    }

    @objid ("5fa897d2-0cbb-480e-8f5c-91ee013a751c")
    @Override
    public void setBpmnInterfaceRef(BpmnInterface value) {
        appendDepVal(((BpmnOperationSmClass)getClassOf()).getBpmnInterfaceRefDep(), (SmObjectImpl)value);
    }

    @objid ("fdea2da1-d47e-425d-b2a0-7a2014600f78")
    @Override
    public EList<BpmnReceiveTask> getReceiver() {
        return new SmList<>(this, ((BpmnOperationSmClass)getClassOf()).getReceiverDep());
    }

    @objid ("c0d8aa3d-75e7-49f4-9755-13ac16004275")
    @Override
    public <T extends BpmnReceiveTask> List<T> getReceiver(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnReceiveTask element : getReceiver()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("60fd9fc4-5961-43cd-9746-49059b1d0174")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // BpmnInterfaceRef
        obj = (SmObjectImpl)this.getDepVal(((BpmnOperationSmClass)getClassOf()).getBpmnInterfaceRefDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("67b7c567-dcc2-4128-b9d5-7ca8f3b10f70")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // BpmnInterfaceRef
        dep = ((BpmnOperationSmClass)getClassOf()).getBpmnInterfaceRefDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("45cd353a-0bb6-44ad-aca0-a9887f6f89e9")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnOperation(this);
        else
          return null;
    }

}
