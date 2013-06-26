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
    @objid ("55f06c00-ed50-4034-9a2c-c2dc0b2b5522")
    @Override
    public InteractionUse getOwnerUse() {
        return (InteractionUse) getDepVal(GateData.Metadata.OwnerUseDep());
    }

    @objid ("75ea9f20-76a2-431f-9a11-e4f242bedcf8")
    @Override
    public void setOwnerUse(InteractionUse value) {
        appendDepVal(GateData.Metadata.OwnerUseDep(), (SmObjectImpl)value);
    }

    @objid ("eae46473-3a9b-4f9a-a2a1-668dbd410a43")
    @Override
    public EList<Gate> getActual() {
        return new SmList<>(this, GateData.Metadata.ActualDep());
    }

    @objid ("8ab13518-bfe3-43bf-9762-fea0b6048d17")
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

    @objid ("b32a6c3c-1df6-4745-b925-aa92cca93a78")
    @Override
    public Interaction getOwnerInteraction() {
        return (Interaction) getDepVal(GateData.Metadata.OwnerInteractionDep());
    }

    @objid ("8343af5a-dba2-4b83-8001-4eacadc2f4f9")
    @Override
    public void setOwnerInteraction(Interaction value) {
        appendDepVal(GateData.Metadata.OwnerInteractionDep(), (SmObjectImpl)value);
    }

    @objid ("f3611b0d-f84f-4b7a-b1d9-141242767bee")
    @Override
    public CombinedFragment getOwnerFragment() {
        return (CombinedFragment) getDepVal(GateData.Metadata.OwnerFragmentDep());
    }

    @objid ("860d0406-376c-43a8-aa35-3ebc645c688f")
    @Override
    public void setOwnerFragment(CombinedFragment value) {
        appendDepVal(GateData.Metadata.OwnerFragmentDep(), (SmObjectImpl)value);
    }

    @objid ("da403e0f-9428-4a7e-b53d-bfa8c91a18bc")
    @Override
    public Gate getFormal() {
        return (Gate) getDepVal(GateData.Metadata.FormalDep());
    }

    @objid ("0ca53ca0-66ec-415d-bd25-80b760e5e3f2")
    @Override
    public void setFormal(Gate value) {
        appendDepVal(GateData.Metadata.FormalDep(), (SmObjectImpl)value);
    }

    @objid ("bc1e2e4b-701e-459c-a9f9-535139d0735d")
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

    @objid ("0abdb1f0-e0d6-4369-abef-258b9eb91416")
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

    @objid ("5811466d-ac13-482c-bcf4-53a1b59091bb")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGate(this);
        else
          return null;
    }

}
