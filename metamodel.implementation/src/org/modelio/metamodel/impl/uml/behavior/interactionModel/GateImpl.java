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
    @objid ("02360142-9209-454b-bd7a-dfbac72fa755")
    @Override
    public InteractionUse getOwnerUse() {
        return (InteractionUse) getDepVal(GateData.Metadata.OwnerUseDep());
    }

    @objid ("0d8969c1-cdd0-43e8-be43-2902c2839c09")
    @Override
    public void setOwnerUse(InteractionUse value) {
        appendDepVal(GateData.Metadata.OwnerUseDep(), (SmObjectImpl)value);
    }

    @objid ("1b408836-8ec6-4ee3-958f-16d7c39a6335")
    @Override
    public EList<Gate> getActual() {
        return new SmList<>(this, GateData.Metadata.ActualDep());
    }

    @objid ("2698a224-d0d5-4c64-bf64-64321cf775da")
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

    @objid ("0be3024b-6601-475f-9c33-ededf01ea40d")
    @Override
    public Interaction getOwnerInteraction() {
        return (Interaction) getDepVal(GateData.Metadata.OwnerInteractionDep());
    }

    @objid ("cad8252a-482e-4f70-b767-b185f1c4a00e")
    @Override
    public void setOwnerInteraction(Interaction value) {
        appendDepVal(GateData.Metadata.OwnerInteractionDep(), (SmObjectImpl)value);
    }

    @objid ("b8976979-d2af-4e2e-86ed-10bd1f167436")
    @Override
    public CombinedFragment getOwnerFragment() {
        return (CombinedFragment) getDepVal(GateData.Metadata.OwnerFragmentDep());
    }

    @objid ("06c3abaf-c00d-4ea3-be8b-ba10c238e78a")
    @Override
    public void setOwnerFragment(CombinedFragment value) {
        appendDepVal(GateData.Metadata.OwnerFragmentDep(), (SmObjectImpl)value);
    }

    @objid ("8ede00cc-efad-4211-8a73-9d09586511cd")
    @Override
    public Gate getFormal() {
        return (Gate) getDepVal(GateData.Metadata.FormalDep());
    }

    @objid ("52a83480-bdce-40ee-afdc-d19b7a249962")
    @Override
    public void setFormal(Gate value) {
        appendDepVal(GateData.Metadata.FormalDep(), (SmObjectImpl)value);
    }

    @objid ("8e9510b5-2939-47be-a157-cd131789da49")
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

    @objid ("049d7f46-439a-4bac-8f51-39360de5c863")
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

    @objid ("f6fcf01e-99cc-452c-b0f7-0a8490639de6")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGate(this);
        else
          return null;
    }

}
