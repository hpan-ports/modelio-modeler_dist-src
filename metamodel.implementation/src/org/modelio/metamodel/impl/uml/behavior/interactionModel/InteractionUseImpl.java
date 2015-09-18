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
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionUseData;
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

@objid ("00485742-c4bf-1fd8-97fe-001ec947cd2a")
public class InteractionUseImpl extends InteractionFragmentImpl implements InteractionUse {
    @objid ("c1a2dad6-7cf1-47e4-9a0f-791c0b3ae505")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(InteractionUseData.Metadata.EndLineNumberAtt());
    }

    @objid ("b0aa9e36-68c9-4b34-a203-bdbac93fbb7c")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(InteractionUseData.Metadata.EndLineNumberAtt(), value);
    }

    @objid ("e5cf2db4-5375-4c8c-9613-4cae02af946c")
    @Override
    public EList<Gate> getActualGate() {
        return new SmList<>(this, InteractionUseData.Metadata.ActualGateDep());
    }

    @objid ("a1102e77-2c70-406b-8458-17f5bf200932")
    @Override
    public <T extends Gate> List<T> getActualGate(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Gate element : getActualGate()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("747346af-ab5a-4be8-a154-4a4f16ea9b72")
    @Override
    public Interaction getRefersTo() {
        return (Interaction) getDepVal(InteractionUseData.Metadata.RefersToDep());
    }

    @objid ("660945f7-c231-406c-abc7-13ecd83897cd")
    @Override
    public void setRefersTo(Interaction value) {
        appendDepVal(InteractionUseData.Metadata.RefersToDep(), (SmObjectImpl)value);
    }

    @objid ("ab01d09f-48de-41b5-9392-cba538fe03bc")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("b0f874e4-19f2-4086-ba58-ddc05a2a9de3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("da3f1718-dcdd-4132-8e63-2f9b37201d20")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionUse(this);
        else
          return null;
    }

}
