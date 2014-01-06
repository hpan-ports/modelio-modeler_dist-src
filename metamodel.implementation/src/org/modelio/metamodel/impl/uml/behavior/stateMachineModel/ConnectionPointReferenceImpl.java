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
    @objid ("b65d8b18-20e7-4ea0-b5c0-ab44cd567fc6")
    @Override
    public ExitPointPseudoState getExit() {
        return (ExitPointPseudoState) getDepVal(ConnectionPointReferenceData.Metadata.ExitDep());
    }

    @objid ("12654467-94b9-4489-a253-616bb1f67142")
    @Override
    public void setExit(ExitPointPseudoState value) {
        appendDepVal(ConnectionPointReferenceData.Metadata.ExitDep(), (SmObjectImpl)value);
    }

    @objid ("34f0330c-72c1-448a-b6b0-b4fbb9e3152b")
    @Override
    public EntryPointPseudoState getEntry() {
        return (EntryPointPseudoState) getDepVal(ConnectionPointReferenceData.Metadata.EntryDep());
    }

    @objid ("b636bf24-3599-4931-a19a-3566c257fc9e")
    @Override
    public void setEntry(EntryPointPseudoState value) {
        appendDepVal(ConnectionPointReferenceData.Metadata.EntryDep(), (SmObjectImpl)value);
    }

    @objid ("413ee7e0-6bde-4867-8a66-bee095a3753b")
    @Override
    public State getOwnerState() {
        return (State) getDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep());
    }

    @objid ("8063b06d-2207-4da1-abed-d49f0266e689")
    @Override
    public void setOwnerState(State value) {
        appendDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep(), (SmObjectImpl)value);
    }

    @objid ("61d84f9d-3fd2-4532-9010-ab32abadc3bc")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c849948a-855e-4793-8c5a-ae792dc337bc")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep());
        if (obj != null)
          return new SmDepVal(ConnectionPointReferenceData.Metadata.OwnerStateDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("af7cf0b5-d208-468b-9aa6-ba5aeb2869f1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitConnectionPointReference(this);
        else
          return null;
    }

}
