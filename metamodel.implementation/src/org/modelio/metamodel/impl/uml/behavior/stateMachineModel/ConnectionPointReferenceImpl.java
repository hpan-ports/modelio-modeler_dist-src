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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.ConnectionPointReferenceData;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("004e6c5e-c4bf-1fd8-97fe-001ec947cd2a")
public class ConnectionPointReferenceImpl extends StateVertexImpl implements ConnectionPointReference {
    @objid ("ba0a642e-0b1a-4f9c-a385-688b9221a455")
    @Override
    public ExitPointPseudoState getExit() {
        Object obj = getDepVal(((ConnectionPointReferenceSmClass)getClassOf()).getExitDep());
        return (obj instanceof ExitPointPseudoState)? (ExitPointPseudoState)obj : null;
    }

    @objid ("c3860d62-4b82-49c4-8259-8c6b79341d43")
    @Override
    public void setExit(ExitPointPseudoState value) {
        appendDepVal(((ConnectionPointReferenceSmClass)getClassOf()).getExitDep(), (SmObjectImpl)value);
    }

    @objid ("86b4b076-94d7-4d08-9a75-a1774f8c3905")
    @Override
    public EntryPointPseudoState getEntry() {
        Object obj = getDepVal(((ConnectionPointReferenceSmClass)getClassOf()).getEntryDep());
        return (obj instanceof EntryPointPseudoState)? (EntryPointPseudoState)obj : null;
    }

    @objid ("b75797e1-435d-401b-8591-7b02b4e48721")
    @Override
    public void setEntry(EntryPointPseudoState value) {
        appendDepVal(((ConnectionPointReferenceSmClass)getClassOf()).getEntryDep(), (SmObjectImpl)value);
    }

    @objid ("98afc886-fedb-4b7a-b8f9-4cfe937ec6a4")
    @Override
    public State getOwnerState() {
        Object obj = getDepVal(((ConnectionPointReferenceSmClass)getClassOf()).getOwnerStateDep());
        return (obj instanceof State)? (State)obj : null;
    }

    @objid ("8d599bcc-3906-41c1-995a-f48dd5b1b2c0")
    @Override
    public void setOwnerState(State value) {
        appendDepVal(((ConnectionPointReferenceSmClass)getClassOf()).getOwnerStateDep(), (SmObjectImpl)value);
    }

    @objid ("f4f849bc-017a-4f73-818e-e23031ba7820")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerState
        obj = (SmObjectImpl)this.getDepVal(((ConnectionPointReferenceSmClass)getClassOf()).getOwnerStateDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a89b4188-5eea-4b67-9329-0316b907386a")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerState
        dep = ((ConnectionPointReferenceSmClass)getClassOf()).getOwnerStateDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("eb8a869e-d11c-4f30-ae19-5ee9ad94e00d")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConnectionPointReference(this);
        else
          return null;
    }

}
