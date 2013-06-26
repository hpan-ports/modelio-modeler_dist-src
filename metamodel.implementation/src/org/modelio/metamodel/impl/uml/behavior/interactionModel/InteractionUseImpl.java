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
    @objid ("69c6b860-8d91-4418-845c-bcbfc77e1b5b")
    @Override
    public int getEndLineNumber() {
        return (Integer) getAttVal(InteractionUseData.Metadata.EndLineNumberAtt());
    }

    @objid ("781c8572-43a3-4743-8873-09e523ec0248")
    @Override
    public void setEndLineNumber(int value) {
        setAttVal(InteractionUseData.Metadata.EndLineNumberAtt(), value);
    }

    @objid ("9a1e3099-7d1d-4c78-bbeb-f32047777c75")
    @Override
    public EList<Gate> getActualGate() {
        return new SmList<>(this, InteractionUseData.Metadata.ActualGateDep());
    }

    @objid ("7f9f7f6a-9c83-45a3-adb8-0a43b811b5e0")
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

    @objid ("55bcd633-ffc2-4f2c-8a6d-9e1bfc586d1e")
    @Override
    public Interaction getRefersTo() {
        return (Interaction) getDepVal(InteractionUseData.Metadata.RefersToDep());
    }

    @objid ("9fbdf360-018f-49c9-b344-0dbb78670322")
    @Override
    public void setRefersTo(Interaction value) {
        appendDepVal(InteractionUseData.Metadata.RefersToDep(), (SmObjectImpl)value);
    }

    @objid ("54cb19c8-6f85-485e-b40f-1dad4c5693c8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("052dc71e-d536-48ab-84ba-c2809ad3c5db")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("d5a11787-4962-41b3-bc7d-9b9b9ef5aef1")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteractionUse(this);
        else
          return null;
    }

}
