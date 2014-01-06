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
    @objid ("92e02044-355b-4961-9b6e-93349c562d67")
    @Override
    public EList<BpmnSendTask> getSender() {
        return new SmList<>(this, BpmnOperationData.Metadata.SenderDep());
    }

    @objid ("2bb38034-cb33-4050-b9fd-db8cb0886327")
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

    @objid ("d7991801-25a4-4043-958f-00f9c05031b7")
    @Override
    public BpmnMessage getInMessageRef() {
        return (BpmnMessage) getDepVal(BpmnOperationData.Metadata.InMessageRefDep());
    }

    @objid ("1f76fcfc-0b19-4167-9e99-3e7748f91d68")
    @Override
    public void setInMessageRef(BpmnMessage value) {
        appendDepVal(BpmnOperationData.Metadata.InMessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("458cc255-8919-4fe5-9708-511a9d42b9e3")
    @Override
    public EList<BpmnServiceTask> getCaller() {
        return new SmList<>(this, BpmnOperationData.Metadata.CallerDep());
    }

    @objid ("dd73346f-6b42-4fd2-bd5c-9c9fd47a8fa5")
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

    @objid ("aef8300f-94b1-484d-a308-3ccaba420fce")
    @Override
    public BpmnMessage getOutMessageRef() {
        return (BpmnMessage) getDepVal(BpmnOperationData.Metadata.OutMessageRefDep());
    }

    @objid ("f0fd9e5d-dd4f-45d6-81a6-ce227220e03d")
    @Override
    public void setOutMessageRef(BpmnMessage value) {
        appendDepVal(BpmnOperationData.Metadata.OutMessageRefDep(), (SmObjectImpl)value);
    }

    @objid ("08f89ed4-141c-4ebd-811f-3b27262e3873")
    @Override
    public EList<BpmnMessageEventDefinition> getEventDefinition() {
        return new SmList<>(this, BpmnOperationData.Metadata.EventDefinitionDep());
    }

    @objid ("06672cee-63b2-423d-bce9-0cd30bef365f")
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

    @objid ("3ed620fd-97ec-41ad-81ed-d618a9b51feb")
    @Override
    public Operation getImplementationRef() {
        return (Operation) getDepVal(BpmnOperationData.Metadata.ImplementationRefDep());
    }

    @objid ("fc4e56c9-a5e3-479f-ab14-504a6d03f6e0")
    @Override
    public void setImplementationRef(Operation value) {
        appendDepVal(BpmnOperationData.Metadata.ImplementationRefDep(), (SmObjectImpl)value);
    }

    @objid ("987c72e7-5f3d-496c-b709-5bd93171c3c9")
    @Override
    public BpmnInterface getBpmnInterfaceRef() {
        return (BpmnInterface) getDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep());
    }

    @objid ("b96bfcd4-0e28-4bd1-9b01-7be535330988")
    @Override
    public void setBpmnInterfaceRef(BpmnInterface value) {
        appendDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep(), (SmObjectImpl)value);
    }

    @objid ("7f875e56-b1bf-4cab-a8c3-178af166512e")
    @Override
    public EList<BpmnReceiveTask> getReceiver() {
        return new SmList<>(this, BpmnOperationData.Metadata.ReceiverDep());
    }

    @objid ("76c53dd4-5908-437d-ad79-78ba400d2d05")
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

    @objid ("363769bb-ace9-493d-8962-e7f687a7760c")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("3bebc043-2c3c-4f9c-b2a1-4879e705cd3d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep());
        if (obj != null)
          return new SmDepVal(BpmnOperationData.Metadata.BpmnInterfaceRefDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("a5bee280-732d-46d2-bdf6-2dae00e78e0c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBpmnOperation(this);
        else
          return null;
    }

}
