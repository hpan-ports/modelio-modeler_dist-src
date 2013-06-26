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
    @objid ("be6b439d-190b-4adb-9bf2-103338b9e0d7")
    @Override
    public ExitPointPseudoState getExit() {
        return (ExitPointPseudoState) getDepVal(ConnectionPointReferenceData.Metadata.ExitDep());
    }

    @objid ("31e01ead-7152-492f-aa58-90f6f166f737")
    @Override
    public void setExit(ExitPointPseudoState value) {
        appendDepVal(ConnectionPointReferenceData.Metadata.ExitDep(), (SmObjectImpl)value);
    }

    @objid ("60c05fb4-bc57-47e5-ae85-99bebdc69302")
    @Override
    public EntryPointPseudoState getEntry() {
        return (EntryPointPseudoState) getDepVal(ConnectionPointReferenceData.Metadata.EntryDep());
    }

    @objid ("8232c789-3828-48bf-b106-85fedf6cc2b1")
    @Override
    public void setEntry(EntryPointPseudoState value) {
        appendDepVal(ConnectionPointReferenceData.Metadata.EntryDep(), (SmObjectImpl)value);
    }

    @objid ("0eb670c2-fcf1-40d6-b0f0-2331b9e041b1")
    @Override
    public State getOwnerState() {
        return (State) getDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep());
    }

    @objid ("cb0597c3-82e5-4fe9-8c7e-4a8961067ee7")
    @Override
    public void setOwnerState(State value) {
        appendDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep(), (SmObjectImpl)value);
    }

    @objid ("687be632-d247-498f-a3ab-e0073f94c8c0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("15ae3fdc-c5ea-463a-8a5f-56a9c1cc3353")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep());
        if (obj != null)
          return new SmDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("1566abb2-26ce-4f3d-b427-086f1b3448a8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConnectionPointReference(this);
        else
          return null;
    }

}
