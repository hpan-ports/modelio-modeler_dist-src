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
    @objid ("7f0f8ddb-7682-4ae3-a69c-3384c70a9b90")
    @Override
    public boolean isIsReentrant() {
        return (Boolean) getAttVal(BehaviorData.Metadata.IsReentrantAtt());
    }

    @objid ("d4242147-8de4-433b-8636-277d85e9ff0f")
    @Override
    public void setIsReentrant(boolean value) {
        setAttVal(BehaviorData.Metadata.IsReentrantAtt(), value);
    }

    @objid ("b759baea-3904-4e1c-afa8-a1e6db6a9ef7")
    @Override
    public EList<BpmnCallActivity> getBpmnCaller() {
        return new SmList<>(this, BehaviorData.Metadata.BpmnCallerDep());
    }

    @objid ("6e4d9792-e5ad-4ee5-8d7c-3d5b5a1701e9")
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

    @objid ("06f37c5a-5673-4cbc-9420-42ebd8f1f07f")
    @Override
    public NameSpace getOwner() {
        return (NameSpace) getDepVal(BehaviorData.Metadata.OwnerDep());
    }

    @objid ("79e32cab-efcc-4045-acd2-df9fc79d99c9")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(BehaviorData.Metadata.OwnerDep(), (SmObjectImpl)value);
    }

    @objid ("24648794-251d-4b05-8249-cf94031b77cd")
    @Override
    public EList<BehaviorParameter> getParameter() {
        return new SmList<>(this, BehaviorData.Metadata.ParameterDep());
    }

    @objid ("2dd2c93a-4c55-43c2-a6bd-2e5f194b4122")
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

    @objid ("3b252cbe-ef66-42d7-9202-0de744a7b7ca")
    @Override
    public Operation getOwnerOperation() {
        return (Operation) getDepVal(BehaviorData.Metadata.OwnerOperationDep());
    }

    @objid ("55df4640-2e47-48f4-87df-b95420b1c2f0")
    @Override
    public void setOwnerOperation(Operation value) {
        appendDepVal(BehaviorData.Metadata.OwnerOperationDep(), (SmObjectImpl)value);
    }

    @objid ("2be88a2e-d8a9-4af1-bfa2-20298b39d1f0")
    @Override
    public EList<Collaboration> getOwnedCollaboration() {
        return new SmList<>(this, BehaviorData.Metadata.OwnedCollaborationDep());
    }

    @objid ("93eb3f4a-d9e1-483c-a9b8-0d91081147b2")
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

    @objid ("b15f3899-a61d-48c5-bb48-0ecddb6e284f")
    @Override
    public EList<CallBehaviorAction> getCaller() {
        return new SmList<>(this, BehaviorData.Metadata.CallerDep());
    }

    @objid ("04e1b06c-7309-4458-a06c-5175084908a9")
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

    @objid ("ab69034b-c114-45ec-be40-a0039cd020bc")
    @Override
    public EList<Event> getEComponent() {
        return new SmList<>(this, BehaviorData.Metadata.EComponentDep());
    }

    @objid ("2c13d99d-c29c-4daa-8106-4606b78bbdaf")
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

    @objid ("5bb0cc95-b5a4-4071-ac47-e93036c2fa0d")
    @Override
    public EList<Transition> getEffectOf() {
        return new SmList<>(this, BehaviorData.Metadata.EffectOfDep());
    }

    @objid ("a23de73e-b5cb-49bc-9bda-d77b00b74956")
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

    @objid ("44e59a6d-9c46-4d2d-b387-8c732cc6cd80")
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

    @objid ("32179b1d-a396-4a3c-8ba9-c4a59d80b5a0")
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

    @objid ("b59818ad-9510-4a29-a737-f8bee98c898e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBehavior(this);
        else
          return null;
    }

}
