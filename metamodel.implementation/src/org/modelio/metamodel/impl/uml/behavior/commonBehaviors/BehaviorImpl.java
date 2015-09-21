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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0040c504-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BehaviorImpl extends ModelElementImpl implements Behavior {
    @objid ("55c196ae-f7a8-403d-9d21-53da111f46ec")
    @Override
    public boolean isIsReentrant() {
        return (Boolean) getAttVal(((BehaviorSmClass)getClassOf()).getIsReentrantAtt());
    }

    @objid ("ff84758c-bcb1-414e-b766-4163c11c0e75")
    @Override
    public void setIsReentrant(boolean value) {
        setAttVal(((BehaviorSmClass)getClassOf()).getIsReentrantAtt(), value);
    }

    @objid ("f20cf213-b4f9-454f-83dd-a75277ba792b")
    @Override
    public EList<BpmnCallActivity> getBpmnCaller() {
        return new SmList<>(this, ((BehaviorSmClass)getClassOf()).getBpmnCallerDep());
    }

    @objid ("6767a0df-d96b-418a-8a10-b5fbb92ad9ca")
    @Override
    public <T extends BpmnCallActivity> List<T> getBpmnCaller(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BpmnCallActivity element : getBpmnCaller()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("23ef6f92-960f-4c2d-8df4-153b8b13ad79")
    @Override
    public NameSpace getOwner() {
        Object obj = getDepVal(((BehaviorSmClass)getClassOf()).getOwnerDep());
        return (obj instanceof NameSpace)? (NameSpace)obj : null;
    }

    @objid ("aa282bcd-5313-453e-9841-e1a724f583ce")
    @Override
    public void setOwner(NameSpace value) {
        appendDepVal(((BehaviorSmClass)getClassOf()).getOwnerDep(), (SmObjectImpl)value);
    }

    @objid ("e98f65fa-d58a-4c93-87ea-1190b5c41e65")
    @Override
    public EList<BehaviorParameter> getParameter() {
        return new SmList<>(this, ((BehaviorSmClass)getClassOf()).getParameterDep());
    }

    @objid ("bfe8747b-9ad1-4d3e-b5d7-1dd22895f635")
    @Override
    public <T extends BehaviorParameter> List<T> getParameter(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BehaviorParameter element : getParameter()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0dd09fd7-95c4-450a-8d54-b6e94d0a2069")
    @Override
    public Operation getOwnerOperation() {
        Object obj = getDepVal(((BehaviorSmClass)getClassOf()).getOwnerOperationDep());
        return (obj instanceof Operation)? (Operation)obj : null;
    }

    @objid ("35da29b2-d960-4c68-aa08-4d5fae0dc510")
    @Override
    public void setOwnerOperation(Operation value) {
        appendDepVal(((BehaviorSmClass)getClassOf()).getOwnerOperationDep(), (SmObjectImpl)value);
    }

    @objid ("80d12dbe-1135-4ed7-bd0a-947a9228d699")
    @Override
    public EList<Collaboration> getOwnedCollaboration() {
        return new SmList<>(this, ((BehaviorSmClass)getClassOf()).getOwnedCollaborationDep());
    }

    @objid ("c3019f00-98ba-406a-b9d6-78ff8ccaab2d")
    @Override
    public <T extends Collaboration> List<T> getOwnedCollaboration(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Collaboration element : getOwnedCollaboration()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c86a1c02-11a8-42ed-8245-4d56f7995dd9")
    @Override
    public EList<CallBehaviorAction> getCaller() {
        return new SmList<>(this, ((BehaviorSmClass)getClassOf()).getCallerDep());
    }

    @objid ("4ce1111f-43c4-4502-922f-fc71fbb38453")
    @Override
    public <T extends CallBehaviorAction> List<T> getCaller(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final CallBehaviorAction element : getCaller()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e6d0606e-8fed-4078-ac62-207dfd6fe003")
    @Override
    public EList<Event> getEComponent() {
        return new SmList<>(this, ((BehaviorSmClass)getClassOf()).getEComponentDep());
    }

    @objid ("2a262a84-d981-4ba0-81fb-cdfad65bf86e")
    @Override
    public <T extends Event> List<T> getEComponent(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Event element : getEComponent()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("dfbd7ba6-9ead-41e5-a65f-1f1824398d4b")
    @Override
    public EList<Transition> getEffectOf() {
        return new SmList<>(this, ((BehaviorSmClass)getClassOf()).getEffectOfDep());
    }

    @objid ("40051fb1-e2be-4f49-a0c0-3308c08571f2")
    @Override
    public <T extends Transition> List<T> getEffectOf(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Transition element : getEffectOf()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("32676124-03df-473d-bb3d-d1b3d4e9090d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Owner
        obj = (SmObjectImpl)this.getDepVal(((BehaviorSmClass)getClassOf()).getOwnerDep());
        if (obj != null)
          return obj;
        // OwnerOperation
        obj = (SmObjectImpl)this.getDepVal(((BehaviorSmClass)getClassOf()).getOwnerOperationDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("f133416f-a180-4598-8d63-51407313c0ee")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Owner
        dep = ((BehaviorSmClass)getClassOf()).getOwnerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerOperation
        dep = ((BehaviorSmClass)getClassOf()).getOwnerOperationDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("ca5c7535-0092-4b98-9a8d-234336bc3a6d")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBehavior(this);
        else
          return null;
    }

}
