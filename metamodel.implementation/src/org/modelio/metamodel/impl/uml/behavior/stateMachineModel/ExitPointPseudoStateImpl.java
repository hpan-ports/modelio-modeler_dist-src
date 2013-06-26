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
    @objid ("0d7c73f5-8896-40a3-aa80-cb5df25b24c4")
    @Override
    public State getExitOf() {
        return (State) getDepVal(ExitPointPseudoStateData.Metadata.ExitOfDep());
    }

    @objid ("e6fc6d90-c5f8-42a4-8faa-f783ffb75903")
    @Override
    public void setExitOf(State value) {
        appendDepVal(ExitPointPseudoStateData.Metadata.ExitOfDep(), (SmObjectImpl)value);
    }

    @objid ("961b3674-b058-4725-a9e3-905081f545a7")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, ExitPointPseudoStateData.Metadata.ConnectionDep());
    }

    @objid ("206dce85-5e99-4274-90d8-66c437dd0b92")
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

    @objid ("7240a46a-17bc-42af-bd55-d03a61b70aed")
    @Override
    public StateMachine getExitOfMachine() {
        return (StateMachine) getDepVal(ExitPointPseudoStateData.Metadata.ExitOfMachineDep());
    }

    @objid ("9939bc9e-14d1-4f08-bb63-cbb2ccec004e")
    @Override
    public void setExitOfMachine(StateMachine value) {
        appendDepVal(ExitPointPseudoStateData.Metadata.ExitOfMachineDep(), (SmObjectImpl)value);
    }

    @objid ("15230368-aede-4eb3-a77a-0e4d0449382a")
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

    @objid ("446ea5fe-08e6-4572-9527-88db26506a42")
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

    @objid ("188a774e-caef-401a-b09a-f71744bb81fa")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExitPointPseudoState(this);
        else
          return null;
    }

}
