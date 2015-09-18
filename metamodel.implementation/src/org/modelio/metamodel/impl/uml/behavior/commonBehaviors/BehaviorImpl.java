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
    @objid ("00693b42-9b04-4064-a7e7-75f126955c00")
    @Override
    public boolean isIsReentrant() {
        return (Boolean) getAttVal(BehaviorData.Metadata.IsReentrantAtt());
    }

    @objid ("bf3924f5-3820-41b2-be38-e93204a6a0f3")
    @Override
    public void setIsReentrant(boolean value) {
        setAttVal(BehaviorData.Metadata.IsReentrantAtt(), value);
    }

    @objid ("52b3affd-be0f-4ff5-8d33-a88bcd888a8f")
    @Override
    public EList<BpmnCallActivity> getBpmnCaller() {
        return new SmList<>(this, BehaviorData.Metadata.BpmnCallerDep());
    }

    @objid ("f6522d5a-bbf5-4521-85db-0142cd4946d5")
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

    @objid ("dda1b5be-e2ef-49fc-b1e6-982f6fd01564")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(BehaviorData.Metadata.OwnerDep());
    }

    @objid ("af5064c0-d293-4573-9bef-88973c6434ba")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(BehaviorData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("31bf09b6-dd98-4577-9cda-abc8ba7da85a")
    @Override
    public EList<BehaviorParameter> getParameter() {
        return new SmList<>(this, BehaviorData.Metadata.ParameterDep());
    }

    @objid ("d745e869-d7a4-44bd-abb4-06792dead786")
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

    @objid ("efe8d33e-e8ab-4593-9c98-3939352ecf66")
    @Override
    public Operation getOwnerOperation() {
        return (Operation) getDepVal(BehaviorData.Metadata.OwnerOperationDep());
    }

    @objid ("2b01c647-ca88-4b23-8fec-77995bb1e98d")
    @Override
    public void setOwnerOperation(Operation value) {
        appendDepVal(BehaviorData.Metadata.OwnerOperationDep(), (SmObjectImpl)value);
    }

    @objid ("6ba1d727-3561-49d0-bb1c-4e530f3ca4af")
    @Override
    public EList<Collaboration> getOwnedCollaboration() {
        return new SmList<>(this, BehaviorData.Metadata.OwnedCollaborationDep());
    }

    @objid ("7ab73525-ca4e-4de4-80be-6c29117f36a8")
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

    @objid ("4aaf31fe-4613-46cd-84a1-374c6c7e37a5")
    @Override
    public EList<CallBehaviorAction> getCaller() {
        return new SmList<>(this, BehaviorData.Metadata.CallerDep());
    }

    @objid ("b8da07cd-f1b3-474d-8941-19df32c71d3d")
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

    @objid ("f869f75b-0fcf-4f99-abce-c906bccb1e0d")
    @Override
    public EList<Event> getEComponent() {
        return new SmList<>(this, BehaviorData.Metadata.EComponentDep());
    }

    @objid ("4f7a0e95-b8c1-4645-a349-974f51ffb465")
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

    @objid ("32864b7b-d259-4433-b10e-cd9517c8221c")
    @Override
    public EList<Transition> getEffectOf() {
        return new SmList<>(this, BehaviorData.Metadata.EffectOfDep());
    }

    @objid ("b18150f2-9ae0-4762-a65b-156bf0562428")
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

    @objid ("0b7d1fbb-a04f-4caa-8292-cb6b7bd19875")
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

    @objid ("71d98fb5-93f5-44b8-b0b3-e21f1866d0a5")
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

    @objid ("96edc182-e1c8-423e-8e8d-edee5ab88a3a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBehavior(this);
        else
          return null;
    }

}
