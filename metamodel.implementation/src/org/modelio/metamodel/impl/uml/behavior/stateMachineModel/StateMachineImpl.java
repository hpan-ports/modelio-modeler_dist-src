/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorImpl;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateMachineData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("00543116-c4bf-1fd8-97fe-001ec947cd2a")
public class StateMachineImpl extends BehaviorImpl implements StateMachine {
    @objid ("06ea8244-8fbe-4b6b-a809-8efb552170be")
    @Override
    public KindOfStateMachine getKind() {
        return (KindOfStateMachine) getAttVal(((StateMachineSmClass)getClassOf()).getKindAtt());
    }

    @objid ("0ccbad43-212f-4f7e-8899-0fcd270018bf")
    @Override
    public void setKind(KindOfStateMachine value) {
        setAttVal(((StateMachineSmClass)getClassOf()).getKindAtt(), value);
    }

    @objid ("8bc37436-0f8e-4641-82c2-a28ae3b7d6bd")
    @Override
    public Region getTop() {
        Object obj = getDepVal(((StateMachineSmClass)getClassOf()).getTopDep());
        return (obj instanceof Region)? (Region)obj : null;
    }

    @objid ("5e1c48b7-760b-4977-9cf2-7c877f1db641")
    @Override
    public void setTop(Region value) {
        appendDepVal(((StateMachineSmClass)getClassOf()).getTopDep(), (SmObjectImpl)value);
    }

    @objid ("c3c1e90b-95f7-46ad-a0cb-62407788141f")
    @Override
    public EList<State> getSubmachineState() {
        return new SmList<>(this, ((StateMachineSmClass)getClassOf()).getSubmachineStateDep());
    }

    @objid ("ae836d1d-eff6-4ab2-9694-a91110d03e5b")
    @Override
    public <T extends State> List<T> getSubmachineState(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final State element : getSubmachineState()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5b5de14c-bde1-463f-8d1e-67ab61435da0")
    @Override
    public EList<EntryPointPseudoState> getEntryPoint() {
        return new SmList<>(this, ((StateMachineSmClass)getClassOf()).getEntryPointDep());
    }

    @objid ("994b601a-2a8c-40b1-92b5-5844db948fdf")
    @Override
    public <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final EntryPointPseudoState element : getEntryPoint()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4844a162-1eb9-4990-bb3b-e96151115de5")
    @Override
    public EList<ExitPointPseudoState> getExitPoint() {
        return new SmList<>(this, ((StateMachineSmClass)getClassOf()).getExitPointDep());
    }

    @objid ("0d87b30b-0363-4cda-bef5-193b92b3e412")
    @Override
    public <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ExitPointPseudoState element : getExitPoint()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2d66b39b-b170-43dc-90fa-2313f7ad0b34")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("fcb3d8ec-b81e-4e1d-bd4d-4d5173aa79b3")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("1adb5379-a631-4117-a3c3-bec595610e79")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitStateMachine(this);
        else
          return null;
    }

}
