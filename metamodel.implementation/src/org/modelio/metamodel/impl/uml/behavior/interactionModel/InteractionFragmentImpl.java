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
    @objid ("3888f235-f0f6-488d-9899-2e330adfeedd")
    @Override
    public int getLineNumber() {
        return (Integer) getAttVal(InteractionFragmentData.Metadata.LineNumberAtt());
    }

    @objid ("e19a52b3-2596-4afc-b356-ed48729ce2c1")
    @Override
    public void setLineNumber(int value) {
        setAttVal(InteractionFragmentData.Metadata.LineNumberAtt(), value);
    }

    @objid ("00303067-dd05-43f1-bcd8-864c0070ddc2")
    @Override
    public InteractionOperand getEnclosingOperand() {
        return (InteractionOperand) getDepVal(InteractionFragmentData.Metadata.EnclosingOperandDep());
    }

    @objid ("807b1b77-b778-4b0a-82d8-04175481e8d6")
    @Override
    public void setEnclosingOperand(InteractionOperand value) {
        appendDepVal(InteractionFragmentData.Metadata.EnclosingOperandDep(), (SmObjectImpl)value);
    }

    @objid ("be6b53ef-4a97-4a99-84b6-6b21f2b92bb9")
    @Override
    public Interaction getEnclosingInteraction() {
        return (Interaction) getDepVal(InteractionFragmentData.Metadata.EnclosingInteractionDep());
    }

    @objid ("0105af0f-764b-4cbe-9d3b-c8d01ab9e7b0")
    @Override
    public void setEnclosingInteraction(Interaction value) {
        appendDepVal(InteractionFragmentData.Metadata.EnclosingInteractionDep(), (SmObjectImpl)value);
    }

    @objid ("0c669130-74ff-4a01-9ec2-e8259ff6f63d")
    @Override
    public EList<Lifeline> getCovered() {
        return new SmList<>(this, InteractionFragmentData.Metadata.CoveredDep());
    }

    @objid ("b9fa2b0e-e1dd-4851-bd66-03e204419d99")
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

    @objid ("3cfcab7f-0a84-449e-b2c3-b99539c5fb12")
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

    @objid ("86344ed8-3e99-478a-a9ab-dfdc49d79a7d")
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

    @objid ("44f7082c-6e89-4c5b-a3e1-caae81439d1f")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionFragment(this);
        else
          return null;
    }

}
