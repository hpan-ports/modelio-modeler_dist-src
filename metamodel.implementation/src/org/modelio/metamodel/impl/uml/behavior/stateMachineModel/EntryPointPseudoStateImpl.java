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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.EntryPointPseudoStateData;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("004f6fc8-c4bf-1fd8-97fe-001ec947cd2a")
public class EntryPointPseudoStateImpl extends AbstractPseudoStateImpl implements EntryPointPseudoState {
    @objid ("341cf2a0-96ee-4d1a-9a7f-5293804c8a86")
    @Override
    public State getEntryOf() {
        Object obj = getDepVal(((EntryPointPseudoStateSmClass)getClassOf()).getEntryOfDep());
        return (obj instanceof State)? (State)obj : null;
    }

    @objid ("79d1af86-f156-44b2-b5e8-4e8574bdc479")
    @Override
    public void setEntryOf(State value) {
        appendDepVal(((EntryPointPseudoStateSmClass)getClassOf()).getEntryOfDep(), (SmObjectImpl)value);
    }

    @objid ("852534ab-a15b-498e-9f54-950daf7eb127")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, ((EntryPointPseudoStateSmClass)getClassOf()).getConnectionDep());
    }

    @objid ("57e37a48-b7f7-47d9-8258-8118037ae6a8")
    @Override
    public <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ConnectionPointReference element : getConnection()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fa758bc0-b113-43b2-bfbc-5e1b02367abd")
    @Override
    public StateMachine getEntryOfMachine() {
        Object obj = getDepVal(((EntryPointPseudoStateSmClass)getClassOf()).getEntryOfMachineDep());
        return (obj instanceof StateMachine)? (StateMachine)obj : null;
    }

    @objid ("ae3f2803-cc31-4b73-ae78-e0e96ace1f75")
    @Override
    public void setEntryOfMachine(StateMachine value) {
        appendDepVal(((EntryPointPseudoStateSmClass)getClassOf()).getEntryOfMachineDep(), (SmObjectImpl)value);
    }

    @objid ("912eeda1-7d7b-406c-bd97-662bfe51772d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // EntryOf
        obj = (SmObjectImpl)this.getDepVal(((EntryPointPseudoStateSmClass)getClassOf()).getEntryOfDep());
        if (obj != null)
          return obj;
        // EntryOfMachine
        obj = (SmObjectImpl)this.getDepVal(((EntryPointPseudoStateSmClass)getClassOf()).getEntryOfMachineDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c8f37e0d-2fc8-426d-bcd9-4f01b965c7d6")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // EntryOf
        dep = ((EntryPointPseudoStateSmClass)getClassOf()).getEntryOfDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // EntryOfMachine
        dep = ((EntryPointPseudoStateSmClass)getClassOf()).getEntryOfMachineDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("6335d800-fbef-4266-8a9c-37ab9a23b25d")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEntryPointPseudoState(this);
        else
          return null;
    }

}
