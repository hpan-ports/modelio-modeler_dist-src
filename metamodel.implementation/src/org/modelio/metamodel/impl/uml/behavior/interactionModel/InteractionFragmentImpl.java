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
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionFragmentData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("00473c54-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class InteractionFragmentImpl extends ModelElementImpl implements InteractionFragment {
    @objid ("2bd3e6bf-06bf-4494-8461-dc2ef5c98429")
    @Override
    public int getLineNumber() {
        return (Integer) getAttVal(InteractionFragmentData.Metadata.LineNumberAtt());
    }

    @objid ("65b67d1b-1612-48b8-96b6-1d0c325f1fff")
    @Override
    public void setLineNumber(int value) {
        setAttVal(InteractionFragmentData.Metadata.LineNumberAtt(), value);
    }

    @objid ("afce0fa3-4a6e-448d-9280-fb8ff6d89d6b")
    @Override
    public InteractionOperand getEnclosingOperand() {
        return (InteractionOperand) getDepVal(InteractionFragmentData.Metadata.EnclosingOperandDep());
    }

    @objid ("f2656db8-717b-4646-a32c-4d6aa31abbda")
    @Override
    public void setEnclosingOperand(InteractionOperand value) {
        appendDepVal(InteractionFragmentData.Metadata.EnclosingOperandDep(), (SmObjectImpl)value);
    }

    @objid ("e9389123-58ed-4aec-8494-97728cd17c3e")
    @Override
    public Interaction getEnclosingInteraction() {
        return (Interaction) getDepVal(InteractionFragmentData.Metadata.EnclosingInteractionDep());
    }

    @objid ("b9851a69-a0a1-4e57-b582-da982e0a8a1c")
    @Override
    public void setEnclosingInteraction(Interaction value) {
        appendDepVal(InteractionFragmentData.Metadata.EnclosingInteractionDep(), (SmObjectImpl)value);
    }

    @objid ("7f308748-1754-47a0-8f2d-4110cd9520fc")
    @Override
    public EList<Lifeline> getCovered() {
        return new SmList<>(this, InteractionFragmentData.Metadata.CoveredDep());
    }

    @objid ("d5ccf31b-2873-4b41-860f-dd8805b6e21a")
    @Override
    public <T extends Lifeline> List<T> getCovered(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Lifeline element : getCovered()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7c0bff1c-8a9e-4e31-bc02-16e444dccbe9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InteractionFragmentData.Metadata.EnclosingOperandDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(InteractionFragmentData.Metadata.EnclosingInteractionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a75e2512-1ea0-43f7-8f47-e3036a13bd93")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(InteractionFragmentData.Metadata.EnclosingOperandDep());
        if (obj != null)
          return new SmDepVal(InteractionFragmentData.Metadata.EnclosingOperandDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(InteractionFragmentData.Metadata.EnclosingInteractionDep());
        if (obj != null)
          return new SmDepVal(InteractionFragmentData.Metadata.EnclosingInteractionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("bc3d3f75-b271-46b7-875f-289b7c1636f1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionFragment(this);
        else
          return null;
    }

}
