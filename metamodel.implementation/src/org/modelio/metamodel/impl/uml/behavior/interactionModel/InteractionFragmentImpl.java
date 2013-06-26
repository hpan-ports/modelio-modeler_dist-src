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
    @objid ("652780d3-b74a-4d45-bba5-46a07c10ce9d")
    @Override
    public int getLineNumber() {
        return (Integer) getAttVal(InteractionFragmentData.Metadata.LineNumberAtt());
    }

    @objid ("00e8171e-0653-472a-bff9-e5d108a35995")
    @Override
    public void setLineNumber(int value) {
        setAttVal(InteractionFragmentData.Metadata.LineNumberAtt(), value);
    }

    @objid ("4275fd5f-d02e-4c1a-8386-9d75ff33524e")
    @Override
    public InteractionOperand getEnclosingOperand() {
        return (InteractionOperand) getDepVal(InteractionFragmentData.Metadata.EnclosingOperandDep());
    }

    @objid ("e2aaac77-6177-4909-abe7-1385c452f29f")
    @Override
    public void setEnclosingOperand(InteractionOperand value) {
        appendDepVal(InteractionFragmentData.Metadata.EnclosingOperandDep(), (SmObjectImpl)value);
    }

    @objid ("4f4471f9-7b61-4670-baae-c874832240f8")
    @Override
    public Interaction getEnclosingInteraction() {
        return (Interaction) getDepVal(InteractionFragmentData.Metadata.EnclosingInteractionDep());
    }

    @objid ("52efee91-e90e-4fba-9039-bbc28075a8b0")
    @Override
    public void setEnclosingInteraction(Interaction value) {
        appendDepVal(InteractionFragmentData.Metadata.EnclosingInteractionDep(), (SmObjectImpl)value);
    }

    @objid ("0ab9c2d3-f73a-442b-b7fb-41007641737f")
    @Override
    public EList<Lifeline> getCovered() {
        return new SmList<>(this, InteractionFragmentData.Metadata.CoveredDep());
    }

    @objid ("dbb3a7ce-5219-425f-831f-ef3848a0ad0c")
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

    @objid ("60405cae-43c1-4578-ba66-2beee685fb49")
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

    @objid ("9e11f3dc-7079-453b-a7f2-6350d1e1767f")
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

    @objid ("65e2f632-78a9-4461-888a-a334dd66d24e")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionFragment(this);
        else
          return null;
    }

}
