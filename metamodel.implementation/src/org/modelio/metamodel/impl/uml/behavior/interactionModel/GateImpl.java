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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.behavior.interactionModel.GateData;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00456c76-c4bf-1fd8-97fe-001ec947cd2a")
public class GateImpl extends MessageEndImpl implements Gate {
    @objid ("c60d6606-f0c5-4513-a34d-9c3cbce56f91")
    @Override
    public InteractionUse getOwnerUse() {
        return (InteractionUse) getDepVal(GateData.Metadata.OwnerUseDep());
    }

    @objid ("f19a2fdb-39e7-4c90-ab7a-f06fedf2a01e")
    @Override
    public void setOwnerUse(InteractionUse value) {
        appendDepVal(GateData.Metadata.OwnerUseDep(), (SmObjectImpl)value);
    }

    @objid ("0b2c840b-90e3-463c-87b4-44b7882f322e")
    @Override
    public EList<Gate> getActual() {
        return new SmList<>(this, GateData.Metadata.ActualDep());
    }

    @objid ("a1f44990-c082-4c5e-92bc-299ce19df604")
    @Override
    public <T extends Gate> List<T> getActual(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Gate element : getActual()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("1e0ef20d-633e-480b-86b5-f6ee2041bcce")
    @Override
    public Interaction getOwnerInteraction() {
        return (Interaction) getDepVal(GateData.Metadata.OwnerInteractionDep());
    }

    @objid ("94343283-8232-4067-897e-7538dde5c129")
    @Override
    public void setOwnerInteraction(Interaction value) {
        appendDepVal(GateData.Metadata.OwnerInteractionDep(), (SmObjectImpl)value);
    }

    @objid ("9fe7fb57-fc6f-47f2-bfeb-62eae4dfa78f")
    @Override
    public CombinedFragment getOwnerFragment() {
        return (CombinedFragment) getDepVal(GateData.Metadata.OwnerFragmentDep());
    }

    @objid ("8382542f-f52f-410d-8240-0d936cd5facc")
    @Override
    public void setOwnerFragment(CombinedFragment value) {
        appendDepVal(GateData.Metadata.OwnerFragmentDep(), (SmObjectImpl)value);
    }

    @objid ("403dc1b2-cc07-43ff-824d-dc0983c17c6e")
    @Override
    public Gate getFormal() {
        return (Gate) getDepVal(GateData.Metadata.FormalDep());
    }

    @objid ("337aaa13-9135-4cba-9d64-1bb08e8a123e")
    @Override
    public void setFormal(Gate value) {
        appendDepVal(GateData.Metadata.FormalDep(), (SmObjectImpl)value);
    }

    @objid ("b95a30f3-4dbd-432c-a58d-4a59fec3665a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GateData.Metadata.OwnerUseDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GateData.Metadata.OwnerInteractionDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GateData.Metadata.OwnerFragmentDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("abc59cd7-feb8-4613-acea-b3edf4e77dbb")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GateData.Metadata.OwnerUseDep());
        if (obj != null)
          return new SmDepVal(GateData.Metadata.OwnerUseDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GateData.Metadata.OwnerInteractionDep());
        if (obj != null)
          return new SmDepVal(GateData.Metadata.OwnerInteractionDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GateData.Metadata.OwnerFragmentDep());
        if (obj != null)
          return new SmDepVal(GateData.Metadata.OwnerFragmentDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("2584a0b8-de70-4b17-973d-075aff2c08f1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGate(this);
        else
          return null;
    }

}
