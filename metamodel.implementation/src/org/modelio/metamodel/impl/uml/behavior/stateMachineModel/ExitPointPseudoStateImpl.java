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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ExitPointPseudoStateData;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
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

@objid ("004feeee-c4bf-1fd8-97fe-001ec947cd2a")
public class ExitPointPseudoStateImpl extends AbstractPseudoStateImpl implements ExitPointPseudoState {
    @objid ("f59f40bf-88fc-4cd9-ab9d-2e2a0c765f05")
    @Override
    public State getExitOf() {
        Object obj = getDepVal(((ExitPointPseudoStateSmClass)getClassOf()).getExitOfDep());
        return (obj instanceof State)? (State)obj : null;
    }

    @objid ("5224a939-6d1a-4e36-a672-56a5af6dbd10")
    @Override
    public void setExitOf(State value) {
        appendDepVal(((ExitPointPseudoStateSmClass)getClassOf()).getExitOfDep(), (SmObjectImpl)value);
    }

    @objid ("e57c6913-8d6f-46fe-b0a1-bcc3760446c0")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, ((ExitPointPseudoStateSmClass)getClassOf()).getConnectionDep());
    }

    @objid ("3f41a76d-785c-4176-96a2-259fc533b3f5")
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

    @objid ("b69728cd-c619-4aa5-b27e-2fa03082781b")
    @Override
    public StateMachine getExitOfMachine() {
        Object obj = getDepVal(((ExitPointPseudoStateSmClass)getClassOf()).getExitOfMachineDep());
        return (obj instanceof StateMachine)? (StateMachine)obj : null;
    }

    @objid ("1bb01f7f-e7a1-4008-b079-d8abe6cf063f")
    @Override
    public void setExitOfMachine(StateMachine value) {
        appendDepVal(((ExitPointPseudoStateSmClass)getClassOf()).getExitOfMachineDep(), (SmObjectImpl)value);
    }

    @objid ("193e179d-3089-45d7-b9de-9691976235b2")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // ExitOf
        obj = (SmObjectImpl)this.getDepVal(((ExitPointPseudoStateSmClass)getClassOf()).getExitOfDep());
        if (obj != null)
          return obj;
        // ExitOfMachine
        obj = (SmObjectImpl)this.getDepVal(((ExitPointPseudoStateSmClass)getClassOf()).getExitOfMachineDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("96ebf01e-65b4-4df6-bc3d-4d53346371b1")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // ExitOf
        dep = ((ExitPointPseudoStateSmClass)getClassOf()).getExitOfDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // ExitOfMachine
        dep = ((ExitPointPseudoStateSmClass)getClassOf()).getExitOfMachineDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("6ed364c1-7699-40b4-8f56-c1c70bb812b7")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExitPointPseudoState(this);
        else
          return null;
    }

}
