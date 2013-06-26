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
    @objid ("9a2739df-727d-4e2b-8e8c-86b773bfa81a")
    @Override
    public InteractionOperator getOperator() {
        return (InteractionOperator) getAttVal(CombinedFragmentData.Metadata.OperatorAtt());
    }

    @objid ("589a1975-92f1-482f-8acc-b92e08fe435d")
    @Override
    public void setOperator(InteractionOperator value) {
        setAttVal(CombinedFragmentData.Metadata.OperatorAtt(), value);
    }

    @objid ("ca5bc2ef-7188-4ebc-94cd-6e51c9875580")
    @Override
    public EList<InteractionOperand> getOperand() {
        return new SmList<>(this, CombinedFragmentData.Metadata.OperandDep());
    }

    @objid ("832b4df2-74ff-4d60-a7ea-180675b4b6ad")
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

    @objid ("0aceeabc-57eb-4fb7-983b-9df57477f430")
    @Override
    public EList<Gate> getFragmentGate() {
        return new SmList<>(this, CombinedFragmentData.Metadata.FragmentGateDep());
    }

    @objid ("dc704aa2-8219-444f-890a-d4fe43b61a1b")
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

    @objid ("6e5c449f-66f9-4da4-9e46-504aea3cd9a4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("5fdf1c86-7d7b-4339-84fe-1baa7548c0a6")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("f1a5d0ca-f1a6-4859-b204-4567fb3ef0e3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitCombinedFragment(this);
        else
          return null;
    }

}
