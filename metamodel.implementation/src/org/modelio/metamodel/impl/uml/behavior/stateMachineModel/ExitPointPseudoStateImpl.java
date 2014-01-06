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
    @objid ("5e82503f-fe34-4d25-bc71-c52b10d08d02")
    @Override
    public State getExitOf() {
        return (State) getDepVal(ExitPointPseudoStateData.Metadata.ExitOfDep());
    }

    @objid ("6dc3dd54-3a69-4a1d-9c78-1def41ab2e1c")
    @Override
    public void setExitOf(State value) {
        appendDepVal(ExitPointPseudoStateData.Metadata.ExitOfDep(), (SmObjectImpl)value);
    }

    @objid ("88b28fba-c564-42d9-9b6a-c1ce034d8e87")
    @Override
    public EList<ConnectionPointReference> getConnection() {
        return new SmList<>(this, ExitPointPseudoStateData.Metadata.ConnectionDep());
    }

    @objid ("b9799ad4-f685-41f6-943f-9bb5dc41e97e")
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

    @objid ("1ecf8ed6-dbaf-49b9-ad08-dfa3a28fe543")
    @Override
    public StateMachine getExitOfMachine() {
        return (StateMachine) getDepVal(ExitPointPseudoStateData.Metadata.ExitOfMachineDep());
    }

    @objid ("08c9cbe0-169a-4155-95e6-90678b9b2e84")
    @Override
    public void setExitOfMachine(StateMachine value) {
        appendDepVal(ExitPointPseudoStateData.Metadata.ExitOfMachineDep(), (SmObjectImpl)value);
    }

    @objid ("a10142a3-c2bd-48ca-9116-2afc6b5fc140")
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

    @objid ("a284cb32-b632-4e1e-8240-f0d14c0c5133")
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

    @objid ("49eeddf3-da42-48ea-8470-f959924b5a68")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitExitPointPseudoState(this);
        else
          return null;
    }

}
