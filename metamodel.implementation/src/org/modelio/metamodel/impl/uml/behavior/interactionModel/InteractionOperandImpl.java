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
    @objid ("aa5b5363-35a8-4a21-9320-830e8a6292d5")
    @Override
    public String getGuard() {
        return (String) getAttVal(InteractionOperandData.Metadata.GuardAtt());
    }

    @objid ("fe57e052-bde1-4adc-bc2c-a118ed8d1841")
    @Override
    public void setGuard(String value) {
        setAttVal(InteractionOperandData.Metadata.GuardAtt(), value);
    }

    @objid ("99b9ce35-8407-46f6-984e-2cca58a90255")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(InteractionOperandData.Metadata.EndLineNumberAtt());
    }

    @objid ("a3553b71-ee52-458a-ad43-9165f0894833")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(InteractionOperandData.Metadata.EndLineNumberAtt(), value);
    }

    @objid ("ee04927f-d959-4824-8d6d-e9a42581d43b")
    @Override
    public EList<InteractionFragment> getFragment() {
        return new SmList<>(this, InteractionOperandData.Metadata.FragmentDep());
    }

    @objid ("5c6cf6d2-3ae2-427c-b497-301963860317")
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

    @objid ("57cf65d0-e3a4-44fb-8373-ed9959c159a6")
    @Override
    public CombinedFragment getOwnerFragment() {
        return (CombinedFragment) getDepVal(InteractionOperandData.Metadata.OwnerFragmentDep());
    }

    @objid ("41c378d4-5d2d-418b-b988-6e60b0e76531")
    @Override
    public void setOwnerFragment(CombinedFragment value) {
        appendDepVal(InteractionOperandData.Metadata.OwnerFragmentDep(), (SmObjectImpl)value);
    }

    @objid ("21681a90-3a39-4a9a-9d77-d1029e965190")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InteractionOperandData.Metadata.OwnerFragmentDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("b633b673-8903-46ad-aa23-d926fe598a32")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InteractionOperandData.Metadata.OwnerFragmentDep());
        if (obj != null)
          return new SmDepVal(InteractionOperandData.Metadata.OwnerFragmentDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("3214aeec-86cf-405a-9a6f-2a1368c36c60")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionOperand(this);
        else
          return null;
    }

}
