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
    @objid ("f73ddf6f-9bd6-4be1-b1c9-2b00eec46413")
    @Override
    public KindOfStateMachine getKind() {
        return (KindOfStateMachine) getAttVal(StateMachineData.Metadata.KindAtt());
    }

    @objid ("432f7731-e908-4318-9aea-f39f610b006f")
    @Override
    public void setKind(KindOfStateMachine value) {
        setAttVal(StateMachineData.Metadata.KindAtt(), value);
    }

    @objid ("1170f646-45f9-4751-9046-64d54f682fdf")
    @Override
    public Region getTop() {
        return (Region) getDepVal(StateMachineData.Metadata.TopDep());
    }

    @objid ("9391e705-29b6-4f2a-8d13-cfd83ab0ec16")
    @Override
    public void setTop(Region value) {
        appendDepVal(StateMachineData.Metadata.TopDep(), (SmObjectImpl)value);
    }

    @objid ("853c0219-a306-4cac-872b-0d9f9836c82b")
    @Override
    public EList<State> getSubmachineState() {
        return new SmList<>(this, StateMachineData.Metadata.SubmachineStateDep());
    }

    @objid ("1439c974-ca58-4a98-8b1d-4a00e4cba63b")
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

    @objid ("9d0df861-0500-4282-a553-b5d7391f5b83")
    @Override
    public EList<EntryPointPseudoState> getEntryPoint() {
        return new SmList<>(this, StateMachineData.Metadata.EntryPointDep());
    }

    @objid ("b39de87e-7bf5-4808-91fb-a3322aea213d")
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

    @objid ("ca9f375b-1055-4608-8959-bcbe982684c9")
    @Override
    public EList<ExitPointPseudoState> getExitPoint() {
        return new SmList<>(this, StateMachineData.Metadata.ExitPointDep());
    }

    @objid ("323fe481-2116-49d3-9a0f-2d8f8fd8fad9")
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

    @objid ("9f227a33-f211-42ef-aa3e-dbb115eb8839")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("cc5b30f5-c2d9-42e8-8c03-2208bb42efc0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("68ebf296-312b-4201-ad50-48f266b40424")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStateMachine(this);
        else
          return null;
    }

}
