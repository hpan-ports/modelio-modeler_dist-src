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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.Collections;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.InternalTransitionData;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00517a98-c4bf-1fd8-97fe-001ec947cd2a")
public class InternalTransitionImpl extends TransitionImpl implements InternalTransition {
    @objid ("9b2c2e07-63d6-49d3-aff5-aa4499ce4f0b")
    @Override
    public State getSComposed() {
        return (State) getDepVal(InternalTransitionData.Metadata.SComposedDep());
    }

    @objid ("66f154fc-8573-4493-bc44-4e457341474b")
    @Override
    public void setSComposed(State value) {
        appendDepVal(InternalTransitionData.Metadata.SComposedDep(), (SmObjectImpl)value);
    }

    @objid ("e7455a9d-781b-4bf5-8bc8-0ee85def75f1")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InternalTransitionData.Metadata.SComposedDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("6326636e-3211-4989-a9c3-16271395900e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InternalTransitionData.Metadata.SComposedDep());
        if (obj != null)
          return new SmDepVal(InternalTransitionData.Metadata.SComposedDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("8b33b952-e935-4bf4-ad15-0cb24442092c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInternalTransition(this);
        else
          return null;
    }

}
