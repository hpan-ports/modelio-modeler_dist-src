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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.EntryPointPseudoStateData;
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

@objid ("004f6fc8-c4bf-1fd8-97fe-001ec947cd2a")
public class EntryPointPseudoStateImpl extends AbstractPseudoStateImpl implements EntryPointPseudoState {
    @objid ("2ff134c1-6dea-4f20-8fae-6abe1438177f")
    @Override
    public State getEntryOf() {
        return (State) getDepVal(EntryPointPseudoStateData.Metadata.EntryOfDep());
    }

    @objid ("2e7d55a0-adf3-47ed-b86a-37d148fa4347")
    @Override
    public void setEntryOf(State value) {
        appendDepVal(EntryPointPseudoStateData.Metadata.EntryOfDep(), (SmObjectImpl)value);
    }

    @objid ("e0c0bba2-1004-4c80-b010-ea56369fd217")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, EntryPointPseudoStateData.Metadata.ConnectionDep());
    }

    @objid ("29bc7b09-dcda-4b10-b7ed-64e9e453d30d")
    @Override
    public <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ConnectionPointReference element : getConnection()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("05bc4cb2-86aa-4d18-9b5c-b065f8ec4962")
    @Override
    public StateMachine getEntryOfMachine() {
        return (StateMachine) getDepVal(EntryPointPseudoStateData.Metadata.EntryOfMachineDep());
    }

    @objid ("27d77658-9b01-4948-9501-ac849728788f")
    @Override
    public void setEntryOfMachine(StateMachine value) {
        appendDepVal(EntryPointPseudoStateData.Metadata.EntryOfMachineDep(), (SmObjectImpl)value);
    }

    @objid ("5ef1b47a-b5d7-4394-8d9b-80b8f511f40d")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EntryPointPseudoStateData.Metadata.EntryOfDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(EntryPointPseudoStateData.Metadata.EntryOfMachineDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("990c6d80-6225-4e45-a351-d8dfc3094e44")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(EntryPointPseudoStateData.Metadata.EntryOfDep());
        if (obj != null)
          return new SmDepVal(EntryPointPseudoStateData.Metadata.EntryOfDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(EntryPointPseudoStateData.Metadata.EntryOfMachineDep());
        if (obj != null)
          return new SmDepVal(EntryPointPseudoStateData.Metadata.EntryOfMachineDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("eac980d2-72b3-4ce3-864a-9f892c2f30e5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEntryPointPseudoState(this);
        else
          return null;
    }

}
