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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.activityModel.CallBehaviorAction;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0040c504-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BehaviorImpl extends ModelElementImpl implements Behavior {
    @objid ("c816e2e2-b685-494b-86bf-19a3a7fd5637")
    @Override
    public boolean isIsReentrant() {
        return (Boolean) getAttVal(BehaviorData.Metadata.IsReentrantAtt());
    }

    @objid ("48d4e29b-2fe5-4e2a-9a44-b0e07470fb36")
    @Override
    public void setIsReentrant(boolean value) {
        setAttVal(BehaviorData.Metadata.IsReentrantAtt(), value);
    }

    @objid ("91186829-5d19-4118-959c-5d828930011f")
    @Override
    public EList<BpmnCallActivity> getBpmnCaller() {
        return new SmList<>(this, BehaviorData.Metadata.BpmnCallerDep());
    }

    @objid ("bdc4a1af-618d-4776-907e-3344ef3090f2")
    @Override
    public <T extends BpmnCallActivity> List<T> getBpmnCaller(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BpmnCallActivity element : getBpmnCaller()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2f0c4670-db58-43f9-bd92-f3a40874ce1a")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(BehaviorData.Metadata.OwnerDep());
    }

    @objid ("50e16c7d-4992-4f10-aa96-32f61c8729ca")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(BehaviorData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("bb3f0a5c-3aae-4cae-a3c1-45f626e41efa")
    @Override
    public EList<BehaviorParameter> getParameter() {
        return new SmList<>(this, BehaviorData.Metadata.ParameterDep());
    }

    @objid ("e1fab6bd-4d26-4fa3-bacc-0e7017110ee6")
    @Override
    public <T extends BehaviorParameter> List<T> getParameter(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BehaviorParameter element : getParameter()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("31b9e076-312d-4c9b-a5e1-5df22a1b09de")
    @Override
    public Operation getOwnerOperation() {
        return (Operation) getDepVal(BehaviorData.Metadata.OwnerOperationDep());
    }

    @objid ("13290dac-5f00-481f-a9ae-62be000aff56")
    @Override
    public void setOwnerOperation(Operation value) {
        appendDepVal(BehaviorData.Metadata.OwnerOperationDep(), (SmObjectImpl)value);
    }

    @objid ("da6a377d-fd5e-42aa-84c0-54cf8f050de9")
    @Override
    public EList<Collaboration> getOwnedCollaboration() {
        return new SmList<>(this, BehaviorData.Metadata.OwnedCollaborationDep());
    }

    @objid ("5a5a7e8e-a20f-4e68-9ae6-365617f87e73")
    @Override
    public <T extends Collaboration> List<T> getOwnedCollaboration(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Collaboration element : getOwnedCollaboration()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("106d7513-695e-4705-a45b-4bebb04605e5")
    @Override
    public EList<CallBehaviorAction> getCaller() {
        return new SmList<>(this, BehaviorData.Metadata.CallerDep());
    }

    @objid ("02c660f7-1fa0-4725-ad42-8c2c0421681b")
    @Override
    public <T extends CallBehaviorAction> List<T> getCaller(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final CallBehaviorAction element : getCaller()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f3fadd47-0299-4b9f-b8c8-bae93345be1c")
    @Override
    public EList<Event> getEComponent() {
        return new SmList<>(this, BehaviorData.Metadata.EComponentDep());
    }

    @objid ("b3616937-a8e4-4f9e-9ca1-39b18f15cce2")
    @Override
    public <T extends Event> List<T> getEComponent(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Event element : getEComponent()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("25d4a693-3cf1-4390-bb57-c6d342195867")
    @Override
    public EList<Transition> getEffectOf() {
        return new SmList<>(this, BehaviorData.Metadata.EffectOfDep());
    }

    @objid ("3ed93b18-a37b-4e39-8b77-7ebf8ec4814c")
    @Override
    public <T extends Transition> List<T> getEffectOf(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Transition element : getEffectOf()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("ef51bbcd-8f43-424d-bb0c-bf5fb804c5aa")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BehaviorData.Metadata.OwnerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BehaviorData.Metadata.OwnerOperationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("63ecd9c7-7ca9-45b9-91ab-8e79ac1a2a08")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BehaviorData.Metadata.OwnerDep());
        if (obj != null)
          return new SmDepVal(BehaviorData.Metadata.OwnerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BehaviorData.Metadata.OwnerOperationDep());
        if (obj != null)
          return new SmDepVal(BehaviorData.Metadata.OwnerOperationDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("3ea9e827-d5ec-4dc6-b728-4de05ec78e55")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBehavior(this);
        else
          return null;
    }

}
