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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.GateData;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00456c76-c4bf-1fd8-97fe-001ec947cd2a")
public class GateImpl extends MessageEndImpl implements Gate {
    @objid ("50ddc9de-70cf-452e-85b4-9af56bfa6080")
    @Override
    public InteractionUse getOwnerUse() {
        Object obj = getDepVal(((GateSmClass)getClassOf()).getOwnerUseDep());
        return (obj instanceof InteractionUse)? (InteractionUse)obj : null;
    }

    @objid ("8309ba52-1d3b-42e3-98e1-c61eb2f9dc51")
    @Override
    public void setOwnerUse(InteractionUse value) {
        appendDepVal(((GateSmClass)getClassOf()).getOwnerUseDep(), (SmObjectImpl)value);
    }

    @objid ("357a3ace-f644-4d36-afd3-e34060270d5b")
    @Override
    public EList<Gate> getActual() {
        return new SmList<>(this, ((GateSmClass)getClassOf()).getActualDep());
    }

    @objid ("cfdd98f2-80fa-4389-bd0f-96bb35714ddc")
    @Override
    public <T extends Gate> List<T> getActual(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Gate element : getActual()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("247c3842-030a-40d4-b5d9-2641d8e29798")
    @Override
    public Interaction getOwnerInteraction() {
        Object obj = getDepVal(((GateSmClass)getClassOf()).getOwnerInteractionDep());
        return (obj instanceof Interaction)? (Interaction)obj : null;
    }

    @objid ("d4adfc51-507b-4014-901a-4aaabf6adf12")
    @Override
    public void setOwnerInteraction(Interaction value) {
        appendDepVal(((GateSmClass)getClassOf()).getOwnerInteractionDep(), (SmObjectImpl)value);
    }

    @objid ("18669427-7633-46a1-ad2d-0decf1d3ab21")
    @Override
    public CombinedFragment getOwnerFragment() {
        Object obj = getDepVal(((GateSmClass)getClassOf()).getOwnerFragmentDep());
        return (obj instanceof CombinedFragment)? (CombinedFragment)obj : null;
    }

    @objid ("293629e2-7473-4081-ac0d-fc248c6bfbe5")
    @Override
    public void setOwnerFragment(CombinedFragment value) {
        appendDepVal(((GateSmClass)getClassOf()).getOwnerFragmentDep(), (SmObjectImpl)value);
    }

    @objid ("43369b70-cb25-475e-89c7-d1ecb196767d")
    @Override
    public Gate getFormal() {
        Object obj = getDepVal(((GateSmClass)getClassOf()).getFormalDep());
        return (obj instanceof Gate)? (Gate)obj : null;
    }

    @objid ("5ef353e2-6634-4e79-ad19-2e7116df36b3")
    @Override
    public void setFormal(Gate value) {
        appendDepVal(((GateSmClass)getClassOf()).getFormalDep(), (SmObjectImpl)value);
    }

    @objid ("2b41216d-7654-4e89-bbfa-c1ed89cf52d5")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerUse
        obj = (SmObjectImpl)this.getDepVal(((GateSmClass)getClassOf()).getOwnerUseDep());
        if (obj != null)
          return obj;
        // OwnerInteraction
        obj = (SmObjectImpl)this.getDepVal(((GateSmClass)getClassOf()).getOwnerInteractionDep());
        if (obj != null)
          return obj;
        // OwnerFragment
        obj = (SmObjectImpl)this.getDepVal(((GateSmClass)getClassOf()).getOwnerFragmentDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("32c55844-9457-4c35-8384-3fa5070872df")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerUse
        dep = ((GateSmClass)getClassOf()).getOwnerUseDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerInteraction
        dep = ((GateSmClass)getClassOf()).getOwnerInteractionDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerFragment
        dep = ((GateSmClass)getClassOf()).getOwnerFragmentDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("c0129ae9-9c86-4eb0-9994-76182568ebdf")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGate(this);
        else
          return null;
    }

}
