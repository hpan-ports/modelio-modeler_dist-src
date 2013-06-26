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
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionOperandData;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0047c124-c4bf-1fd8-97fe-001ec947cd2a")
public class InteractionOperandImpl extends InteractionFragmentImpl implements InteractionOperand {
    @objid ("88704d5f-9d39-4a76-bc67-21e726f30450")
    @Override
    public String getGuard() {
        return (String) getAttVal(InteractionOperandData.Metadata.GuardAtt());
    }

    @objid ("f44d8110-7c4d-4270-aa14-ff571ea32f7b")
    @Override
    public void setGuard(String value) {
        setAttVal(InteractionOperandData.Metadata.GuardAtt(), value);
    }

    @objid ("eb6de846-dd44-4d52-b964-45970fc52499")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(InteractionOperandData.Metadata.EndLineNumberAtt());
    }

    @objid ("54c4e2d6-4efc-41a7-85fe-b78e1fce7f18")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(InteractionOperandData.Metadata.EndLineNumberAtt(), value);
    }

    @objid ("c42398d1-0864-4373-9cf3-f0c22d6e013b")
    @Override
    public EList<InteractionFragment> getFragment() {
        return new SmList<>(this, InteractionOperandData.Metadata.FragmentDep());
    }

    @objid ("afaa6e72-bdf1-4299-919a-a37f60cdfc35")
    @Override
    public <T extends InteractionFragment> List<T> getFragment(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InteractionFragment element : getFragment()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("32242e5c-22ed-4d7c-b212-8f06a2416d31")
    @Override
    public CombinedFragment getOwnerFragment() {
        return (CombinedFragment) getDepVal(InteractionOperandData.Metadata.OwnerFragmentDep());
    }

    @objid ("ee04c0eb-a42a-41da-b4b7-c1e96bacc40b")
    @Override
    public void setOwnerFragment(CombinedFragment value) {
        appendDepVal(InteractionOperandData.Metadata.OwnerFragmentDep(), (SmObjectImpl)value);
    }

    @objid ("3574a1b3-cf6d-4617-8e89-7f14ffaa1bb0")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InteractionOperandData.Metadata.OwnerFragmentDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("117306e2-63b2-4b76-bf35-6e9adbe706c9")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InteractionOperandData.Metadata.OwnerFragmentDep());
        if (obj != null)
          return new SmDepVal(InteractionOperandData.Metadata.OwnerFragmentDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("7cce8446-be48-4994-b76d-75362c1501da")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionOperand(this);
        else
          return null;
    }

}
