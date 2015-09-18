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
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateMachineData;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.KindOfStateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
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

@objid ("00543116-c4bf-1fd8-97fe-001ec947cd2a")
public class StateMachineImpl extends BehaviorImpl implements StateMachine {
    @objid ("f8787510-0e0e-4b15-95a8-71ba84c695f2")
    @Override
    public KindOfStateMachine getKind() {
        return (KindOfStateMachine) getAttVal(StateMachineData.Metadata.KindAtt());
    }

    @objid ("57a129b7-7347-44ba-b1de-49e1cbab7b37")
    @Override
    public void setKind(KindOfStateMachine value) {
        setAttVal(StateMachineData.Metadata.KindAtt(), value);
    }

    @objid ("320e4681-a247-4c49-bf6c-0c30c7ea6c8b")
    @Override
    public Region getTop() {
        return (Region) getDepVal(StateMachineData.Metadata.TopDep());
    }

    @objid ("a1859558-8099-4f9b-93e5-15f32011fda1")
    @Override
    public void setTop(Region value) {
        appendDepVal(StateMachineData.Metadata.TopDep(), (SmObjectImpl)value);
    }

    @objid ("d2e20c09-94db-495d-b664-f21a1a002aea")
    @Override
    public EList<State> getSubmachineState() {
        return new SmList<>(this, StateMachineData.Metadata.SubmachineStateDep());
    }

    @objid ("ab2f077e-ebc7-4fc4-a871-755ad032e3eb")
    @Override
    public <T extends State> List<T> getSubmachineState(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final State element : getSubmachineState()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9679ae0f-66ef-4644-bf27-8adbe308d4f7")
    @Override
    public EList<EntryPointPseudoState> getEntryPoint() {
        return new SmList<>(this, StateMachineData.Metadata.EntryPointDep());
    }

    @objid ("4023d937-5fb4-4d89-81a4-af71f9538c9f")
    @Override
    public <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final EntryPointPseudoState element : getEntryPoint()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2d61430f-5df5-4bf6-a5c9-b66c8f220cfa")
    @Override
    public EList<ExitPointPseudoState> getExitPoint() {
        return new SmList<>(this, StateMachineData.Metadata.ExitPointDep());
    }

    @objid ("d54c8390-7e1c-4607-888a-fdbe16c9201e")
    @Override
    public <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ExitPointPseudoState element : getExitPoint()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("65f2334b-b0d6-4f59-b08f-c31ed1a1c382")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("b4c31675-a5a1-4af5-bea0-b7f9f4090a65")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("e0a4642a-79bf-490d-b205-d7dba9213e5d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStateMachine(this);
        else
          return null;
    }

}
