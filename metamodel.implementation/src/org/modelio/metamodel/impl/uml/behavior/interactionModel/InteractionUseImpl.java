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
    @objid ("c1909445-bdd7-410e-8205-4559008a3781")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(InteractionUseData.Metadata.EndLineNumberAtt());
    }

    @objid ("6c6433ce-02d3-4a1f-8129-04319303e4cd")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(InteractionUseData.Metadata.EndLineNumberAtt(), value);
    }

    @objid ("8b41a291-c5f3-4b90-9cc3-b7404d94120e")
    @Override
    public EList<Gate> getActualGate() {
        return new SmList<>(this, InteractionUseData.Metadata.ActualGateDep());
    }

    @objid ("0e933836-b411-452e-a26c-8d64058d9b23")
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

    @objid ("197c9cb6-2487-4636-8c91-6d30209eb420")
    @Override
    public Interaction getRefersTo() {
        return (Interaction) getDepVal(InteractionUseData.Metadata.RefersToDep());
    }

    @objid ("54ff27ef-f798-4ce6-8c82-d58bffeae96e")
    @Override
    public void setRefersTo(Interaction value) {
        appendDepVal(InteractionUseData.Metadata.RefersToDep(), (SmObjectImpl)value);
    }

    @objid ("e0313671-964a-46ab-9273-05c8fc2be634")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("c50f0d76-eb11-406e-861e-e6d370ee5a07")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("36d4611a-cc1c-419e-9611-a36330f09795")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionUse(this);
        else
          return null;
    }

}
