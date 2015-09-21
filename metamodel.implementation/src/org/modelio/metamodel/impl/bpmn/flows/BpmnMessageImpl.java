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
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("007c0b32-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnMessageImpl extends BpmnRootElementImpl implements BpmnMessage {
    @objid ("0a911a51-7e10-4669-940c-ca2d54ffd71c")
    @Override
    public GeneralClass getType() {
        Object obj = getDepVal(((BpmnMessageSmClass)getClassOf()).getTypeDep());
        return (obj instanceof GeneralClass)? (GeneralClass)obj : null;
    }

    @objid ("e692b3e3-90aa-426c-9d75-af76d1da7e76")
    @Override
    public void setType(GeneralClass value) {
        appendDepVal(((BpmnMessageSmClass)getClassOf()).getTypeDep(), (SmObjectImpl)value);
    }

    @objid ("aff38fc0-c3d6-4bbb-8c27-39cd8d552178")
    @Override
    public EList<BpmnOperation> getOutputMessage() {
        return new SmList<>(this, ((BpmnMessageSmClass)getClassOf()).getOutputMessageDep());
    }

    @objid ("39c0ac0a-e2ab-493b-823b-7980d3a8bf9e")
    @Override
    public <T extends BpmnOperation> List<T> getOutputMessage(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnOperation element : getOutputMessage()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("43683010-68b0-4f77-bd28-8d477acc68d2")
    @Override
    public BpmnItemDefinition getItemRef() {
        Object obj = getDepVal(((BpmnMessageSmClass)getClassOf()).getItemRefDep());
        return (obj instanceof BpmnItemDefinition)? (BpmnItemDefinition)obj : null;
    }

    @objid ("06709358-bcf8-47c9-afbd-87402c587452")
    @Override
    public void setItemRef(BpmnItemDefinition value) {
        appendDepVal(((BpmnMessageSmClass)getClassOf()).getItemRefDep(), (SmObjectImpl)value);
    }

    @objid ("2d7fcb5d-d53a-421d-8cf5-c22f444d97d6")
    @Override
    public State getInState() {
        Object obj = getDepVal(((BpmnMessageSmClass)getClassOf()).getInStateDep());
        return (obj instanceof State)? (State)obj : null;
    }

    @objid ("593e9121-1d71-42ae-a1c6-37b5ef0b1105")
    @Override
    public void setInState(State value) {
        appendDepVal(((BpmnMessageSmClass)getClassOf()).getInStateDep(), (SmObjectImpl)value);
    }

    @objid ("215d062f-3997-4bad-a8a4-510edbcb656e")
    @Override
    public EList<BpmnMessageEventDefinition> getEventDefinition() {
        return new SmList<>(this, ((BpmnMessageSmClass)getClassOf()).getEventDefinitionDep());
    }

    @objid ("0565e9d6-0acc-4bb7-beea-568962cbc1ad")
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

    @objid ("821fa26b-2826-43da-a8ba-0e888691d77a")
    @Override
    public EList<BpmnSendTask> getSender() {
        return new SmList<>(this, ((BpmnMessageSmClass)getClassOf()).getSenderDep());
    }

    @objid ("f375080a-c16f-43b5-8214-71fe17c7a636")
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

    @objid ("d0382b8a-4837-438b-860d-b2403c0a081b")
    @Override
    public EList<BpmnOperation> getInputMessage() {
        return new SmList<>(this, ((BpmnMessageSmClass)getClassOf()).getInputMessageDep());
    }

    @objid ("f105f089-30f4-479f-b4aa-c8d739c13285")
    @Override
    public <T extends BpmnOperation> List<T> getInputMessage(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnOperation element : getInputMessage()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4768b475-1c95-4c80-8156-57e9a6311750")
    @Override
    public EList<BpmnReceiveTask> getReceiver() {
        return new SmList<>(this, ((BpmnMessageSmClass)getClassOf()).getReceiverDep());
    }

    @objid ("de9ad452-ee46-4a5b-a7b3-68c858b4f949")
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

    @objid ("23e1670c-63c7-4c75-87e2-6196c6300c63")
    @Override
    public EList<BpmnMessageFlow> getMessageFlow() {
        return new SmList<>(this, ((BpmnMessageSmClass)getClassOf()).getMessageFlowDep());
    }

    @objid ("2bfbb8f3-9c7e-435f-9b23-2d7279584652")
    @Override
    public <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnMessageFlow element : getMessageFlow()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("84bbf751-1090-4667-a9ec-7e4a727c68e0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("b4dfe5f0-7649-4897-95fb-c6584a89d235")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("62638271-87fd-4a69-8ae4-949893e86f67")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnMessage(this);
        else
          return null;
    }

}
