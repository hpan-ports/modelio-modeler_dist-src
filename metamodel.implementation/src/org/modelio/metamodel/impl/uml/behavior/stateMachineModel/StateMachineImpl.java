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
    @objid ("f3ad362e-d5b1-47bc-8c4f-6d20978309a9")
    @Override
    public KindOfStateMachine getKind() {
        return (KindOfStateMachine) getAttVal(StateMachineData.Metadata.KindAtt());
    }

    @objid ("9ca9fbf0-7371-4fd4-a10f-83f91bbfceb1")
    @Override
    public void setKind(KindOfStateMachine value) {
        setAttVal(StateMachineData.Metadata.KindAtt(), value);
    }

    @objid ("702640d9-3890-4932-b81b-8695ca3704c4")
    @Override
    public Region getTop() {
        return (Region) getDepVal(StateMachineData.Metadata.TopDep());
    }

    @objid ("9a966e60-a40d-4c12-8d5c-e2b32abc3659")
    @Override
    public void setTop(Region value) {
        appendDepVal(StateMachineData.Metadata.TopDep(), (SmObjectImpl)value);
    }

    @objid ("71648d21-ff08-496f-8262-bb992e099a5a")
    @Override
    public EList<State> getSubmachineState() {
        return new SmList<>(this, StateMachineData.Metadata.SubmachineStateDep());
    }

    @objid ("3e5dc791-eb1f-4801-8b88-f11481df391e")
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

    @objid ("7bb935dc-ad8b-4c36-8ff0-0c35468ef876")
    @Override
    public EList<EntryPointPseudoState> getEntryPoint() {
        return new SmList<>(this, StateMachineData.Metadata.EntryPointDep());
    }

    @objid ("40d19c57-8fa7-48d6-8f9b-ec44b394e0b7")
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

    @objid ("82047121-989c-44e8-a309-1b6339ae7604")
    @Override
    public EList<ExitPointPseudoState> getExitPoint() {
        return new SmList<>(this, StateMachineData.Metadata.ExitPointDep());
    }

    @objid ("75791c88-d6f1-4321-80de-12be2ed49bf2")
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

    @objid ("bdfbc25c-5069-414e-94a1-82faf3f4068b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("d083475c-5321-4e5a-89ed-54e27a3d7f86")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("414659a5-c9f2-407f-8093-d598b76dbf9c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStateMachine(this);
        else
          return null;
    }

}
