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
    @objid ("9a0f3950-d368-420e-ac05-8f31f8791ee3")
    @Override
    public State getEntryOf() {
        return (State) getDepVal(EntryPointPseudoStateData.Metadata.EntryOfDep());
    }

    @objid ("e355d493-c504-49c3-8962-2a9bccbabed6")
    @Override
    public void setEntryOf(State value) {
        appendDepVal(EntryPointPseudoStateData.Metadata.EntryOfDep(), (SmObjectImpl)value);
    }

    @objid ("4f6573c1-0594-4715-ac32-e6b4c6e3d450")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, EntryPointPseudoStateData.Metadata.ConnectionDep());
    }

    @objid ("752b664d-3d55-42a1-878a-69a2bc5f05e5")
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

    @objid ("069dd059-39de-4005-8695-f8433aa40d0d")
    @Override
    public StateMachine getEntryOfMachine() {
        return (StateMachine) getDepVal(EntryPointPseudoStateData.Metadata.EntryOfMachineDep());
    }

    @objid ("d669e9f5-a458-4b63-9514-3ca48b23703a")
    @Override
    public void setEntryOfMachine(StateMachine value) {
        appendDepVal(EntryPointPseudoStateData.Metadata.EntryOfMachineDep(), (SmObjectImpl)value);
    }

    @objid ("ceef692b-8a35-4dcd-aafa-bf691a395924")
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

    @objid ("2ec1f084-4be7-4deb-ae49-935a24c27877")
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

    @objid ("6cf05337-0bab-4df8-aa08-8f0b465106a7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitEntryPointPseudoState(this);
        else
          return null;
    }

}
