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
    @objid ("13637b7a-7805-4d9c-b66c-1e89e126fa50")
    @Override
    public State getEntryOf() {
        return (State) getDepVal(EntryPointPseudoStateData.Metadata.EntryOfDep());
    }

    @objid ("d9b3bec8-6f41-4a00-8da5-c812cdd99da9")
    @Override
    public void setEntryOf(State value) {
        appendDepVal(EntryPointPseudoStateData.Metadata.EntryOfDep(), (SmObjectImpl)value);
    }

    @objid ("891d21b7-eb24-4709-857a-8e2d0cabc444")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, EntryPointPseudoStateData.Metadata.ConnectionDep());
    }

    @objid ("f170d27c-f043-497e-bdbb-4ab666034e0e")
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

    @objid ("ff41dafd-34cf-4680-acbc-4816062b4312")
    @Override
    public StateMachine getEntryOfMachine() {
        return (StateMachine) getDepVal(EntryPointPseudoStateData.Metadata.EntryOfMachineDep());
    }

    @objid ("3a9c9f6f-b780-4ab8-a0ce-0ae8a453614b")
    @Override
    public void setEntryOfMachine(StateMachine value) {
        appendDepVal(EntryPointPseudoStateData.Metadata.EntryOfMachineDep(), (SmObjectImpl)value);
    }

    @objid ("357835ea-3c4f-4470-bb62-7c37da574625")
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

    @objid ("7e4a8165-11d2-4144-968f-1e5fbac0c8e9")
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

    @objid ("2405fc03-f826-4093-934a-bf9ceac51987")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEntryPointPseudoState(this);
        else
          return null;
    }

}
