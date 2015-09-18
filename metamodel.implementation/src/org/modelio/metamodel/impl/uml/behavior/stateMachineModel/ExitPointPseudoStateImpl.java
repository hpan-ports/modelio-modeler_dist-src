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
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.ExitPointPseudoStateData;
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

@objid ("004feeee-c4bf-1fd8-97fe-001ec947cd2a")
public class ExitPointPseudoStateImpl extends AbstractPseudoStateImpl implements ExitPointPseudoState {
    @objid ("f172a9ad-e55f-4398-910a-04330ea597d6")
    @Override
    public State getExitOf() {
        return (State) getDepVal(ExitPointPseudoStateData.Metadata.ExitOfDep());
    }

    @objid ("9db0d659-5c1e-4d3f-a4a1-ecb073d4bebd")
    @Override
    public void setExitOf(State value) {
        appendDepVal(ExitPointPseudoStateData.Metadata.ExitOfDep(), (SmObjectImpl)value);
    }

    @objid ("541b1735-f459-4f6f-979b-09fce47c42fe")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, ExitPointPseudoStateData.Metadata.ConnectionDep());
    }

    @objid ("b936866e-54ea-43cc-af77-a173cfeedd99")
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

    @objid ("0fcfda03-5e1b-455a-8ee7-4aac03edb05d")
    @Override
    public StateMachine getExitOfMachine() {
        return (StateMachine) getDepVal(ExitPointPseudoStateData.Metadata.ExitOfMachineDep());
    }

    @objid ("6d14e4d4-ac76-451a-a33b-20028d9f4520")
    @Override
    public void setExitOfMachine(StateMachine value) {
        appendDepVal(ExitPointPseudoStateData.Metadata.ExitOfMachineDep(), (SmObjectImpl)value);
    }

    @objid ("63303cb9-4b6d-458c-b11f-8d97b9b06574")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExitPointPseudoStateData.Metadata.ExitOfDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(ExitPointPseudoStateData.Metadata.ExitOfMachineDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("6e6e7b83-9eac-47c2-8d4c-aa4bed8e5e17")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ExitPointPseudoStateData.Metadata.ExitOfDep());
        if (obj != null)
          return new SmDepVal(ExitPointPseudoStateData.Metadata.ExitOfDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(ExitPointPseudoStateData.Metadata.ExitOfMachineDep());
        if (obj != null)
          return new SmDepVal(ExitPointPseudoStateData.Metadata.ExitOfMachineDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("8b2abcc6-7dda-40a9-82ba-1012bab9bafd")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExitPointPseudoState(this);
        else
          return null;
    }

}
