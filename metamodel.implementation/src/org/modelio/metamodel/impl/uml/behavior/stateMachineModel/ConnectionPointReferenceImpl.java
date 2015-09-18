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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.ConnectionPointReferenceData;
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

@objid ("004e6c5e-c4bf-1fd8-97fe-001ec947cd2a")
public class ConnectionPointReferenceImpl extends StateVertexImpl implements ConnectionPointReference {
    @objid ("2a86c711-2ebd-4629-bbfd-51381a482ab5")
    @Override
    public ExitPointPseudoState getExit() {
        return (ExitPointPseudoState) getDepVal(ConnectionPointReferenceData.Metadata.ExitDep());
    }

    @objid ("0ce43035-46a7-4f64-afb6-115369c7c6cb")
    @Override
    public void setExit(ExitPointPseudoState value) {
        appendDepVal(ConnectionPointReferenceData.Metadata.ExitDep(), (SmObjectImpl)value);
    }

    @objid ("d4e80a8e-df24-47fb-9281-789eae42d8d3")
    @Override
    public EntryPointPseudoState getEntry() {
        return (EntryPointPseudoState) getDepVal(ConnectionPointReferenceData.Metadata.EntryDep());
    }

    @objid ("345994c7-84e4-4735-9447-60922bea9227")
    @Override
    public void setEntry(EntryPointPseudoState value) {
        appendDepVal(ConnectionPointReferenceData.Metadata.EntryDep(), (SmObjectImpl)value);
    }

    @objid ("c6c9dc4c-d230-4727-9b34-de8fd14f2a51")
    @Override
    public State getOwnerState() {
        return (State) getDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep());
    }

    @objid ("ac63b3f5-7488-4f07-9231-647651a17633")
    @Override
    public void setOwnerState(State value) {
        appendDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep(), (SmObjectImpl)value);
    }

    @objid ("3b067770-c651-40fe-9ca2-8cf3cb80d498")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e74352fe-a945-4ca6-8ffc-80432fb12d38")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep());
        if (obj != null)
          return new SmDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("a557622c-9f3f-4229-bc06-43044242c635")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConnectionPointReference(this);
        else
          return null;
    }

}
