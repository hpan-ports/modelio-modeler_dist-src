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
import org.modelio.metamodel.data.uml.behavior.interactionModel.CombinedFragmentData;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperator;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00437f1a-c4bf-1fd8-97fe-001ec947cd2a")
public class CombinedFragmentImpl extends InteractionFragmentImpl implements CombinedFragment {
    @objid ("e0f0cc21-f0e9-44fe-82cd-fb9339defc34")
    @Override
    public InteractionOperator getOperator() {
        return (InteractionOperator) getAttVal(CombinedFragmentData.Metadata.OperatorAtt());
    }

    @objid ("e313607b-78f5-4c59-9ff0-80af215d3e67")
    @Override
    public void setOperator(InteractionOperator value) {
        setAttVal(CombinedFragmentData.Metadata.OperatorAtt(), value);
    }

    @objid ("ac02e4bd-efa7-497a-aa83-75b7a14ca776")
    @Override
    public EList<InteractionOperand> getOperand() {
        return new SmList<>(this, CombinedFragmentData.Metadata.OperandDep());
    }

    @objid ("eb720ac5-d26b-4c76-a37b-93f6ec5e7aff")
    @Override
    public <T extends InteractionOperand> List<T> getOperand(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InteractionOperand element : getOperand()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("439d5b40-0cfe-4340-99f7-284f7e7dee8e")
    @Override
    public EList<Gate> getFragmentGate() {
        return new SmList<>(this, CombinedFragmentData.Metadata.FragmentGateDep());
    }

    @objid ("3eb19463-25be-4311-8287-ef2903bf658d")
    @Override
    public <T extends Gate> List<T> getFragmentGate(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Gate element : getFragmentGate()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fe0203bf-0089-47e1-9832-97a961c706ff")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("f6c1299f-b70d-4a98-9c10-3d27009e1a93")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("13ea294d-cafc-4cb2-81ae-b93cf16bda09")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCombinedFragment(this);
        else
          return null;
    }

}
