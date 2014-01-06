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
    @objid ("0220d035-da30-4840-8935-381968a0e707")
    @Override
    public String getGuard() {
        return (String) getAttVal(InteractionOperandData.Metadata.GuardAtt());
    }

    @objid ("dbc9bb1d-6d77-4ca8-9673-a83893f23c8a")
    @Override
    public void setGuard(String value) {
        setAttVal(InteractionOperandData.Metadata.GuardAtt(), value);
    }

    @objid ("4fdb0c90-ec34-4c6e-a0ad-51c34922b01d")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(InteractionOperandData.Metadata.EndLineNumberAtt());
    }

    @objid ("b6df437f-e0bc-4e5c-9cc0-0bc83d889982")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(InteractionOperandData.Metadata.EndLineNumberAtt(), value);
    }

    @objid ("cdbb8c1c-0464-4a8d-b6f9-40660c328103")
    @Override
    public EList<InteractionFragment> getFragment() {
        return new SmList<>(this, InteractionOperandData.Metadata.FragmentDep());
    }

    @objid ("ba7f105b-dc1a-48b6-8ed3-da1829a89041")
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

    @objid ("cd9c48c7-e8c2-4c88-b441-b608356b45e5")
    @Override
    public CombinedFragment getOwnerFragment() {
        return (CombinedFragment) getDepVal(InteractionOperandData.Metadata.OwnerFragmentDep());
    }

    @objid ("0be2111f-8eda-4669-a66b-a14e595a95e4")
    @Override
    public void setOwnerFragment(CombinedFragment value) {
        appendDepVal(InteractionOperandData.Metadata.OwnerFragmentDep(), (SmObjectImpl)value);
    }

    @objid ("d3175354-c0e0-4c10-abcb-ba273eb92a70")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InteractionOperandData.Metadata.OwnerFragmentDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("373c0994-a4b7-4ae0-ba80-39121eafbd3b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InteractionOperandData.Metadata.OwnerFragmentDep());
        if (obj != null)
          return new SmDepVal(InteractionOperandData.Metadata.OwnerFragmentDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("518ceedc-cc52-4a91-a94c-a8257ac51117")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionOperand(this);
        else
          return null;
    }

}
