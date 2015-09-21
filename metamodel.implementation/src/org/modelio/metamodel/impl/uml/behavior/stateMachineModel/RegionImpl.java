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
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.RegionData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0057164c-c4bf-1fd8-97fe-001ec947cd2a")
public class RegionImpl extends ModelElementImpl implements Region {
    @objid ("5d3236d4-0a24-4d37-b3e8-72c864f945ef")
    @Override
    public State getParent() {
        Object obj = getDepVal(((RegionSmClass)getClassOf()).getParentDep());
        return (obj instanceof State)? (State)obj : null;
    }

    @objid ("4ff508e9-eab7-471b-9c31-21adc4d15896")
    @Override
    public void setParent(State value) {
        appendDepVal(((RegionSmClass)getClassOf()).getParentDep(), (SmObjectImpl)value);
    }

    @objid ("babd1ca0-90d5-49fa-b9ac-1848849efa39")
    @Override
    public StateMachine getRepresented() {
        Object obj = getDepVal(((RegionSmClass)getClassOf()).getRepresentedDep());
        return (obj instanceof StateMachine)? (StateMachine)obj : null;
    }

    @objid ("405e459a-127a-4361-a864-9652e6a1d213")
    @Override
    public void setRepresented(StateMachine value) {
        appendDepVal(((RegionSmClass)getClassOf()).getRepresentedDep(), (SmObjectImpl)value);
    }

    @objid ("6e242e0e-013e-4ae1-adb2-10fcf3d2314b")
    @Override
    public EList<StateVertex> getSub() {
        return new SmList<>(this, ((RegionSmClass)getClassOf()).getSubDep());
    }

    @objid ("2f596197-b2ec-47fc-a354-2828e52179fe")
    @Override
    public <T extends StateVertex> List<T> getSub(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final StateVertex element : getSub()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c8577ad9-d176-4694-b93d-6c4061eaafd5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Parent
        obj = (SmObjectImpl)this.getDepVal(((RegionSmClass)getClassOf()).getParentDep());
        if (obj != null)
          return obj;
        // Represented
        obj = (SmObjectImpl)this.getDepVal(((RegionSmClass)getClassOf()).getRepresentedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("05663d5a-44bc-407f-8670-b3009c3d5cb7")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Parent
        dep = ((RegionSmClass)getClassOf()).getParentDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // Represented
        dep = ((RegionSmClass)getClassOf()).getRepresentedDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("9b98e30e-c6cd-4c52-946d-bc194f0bbecf")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRegion(this);
        else
          return null;
    }

}
