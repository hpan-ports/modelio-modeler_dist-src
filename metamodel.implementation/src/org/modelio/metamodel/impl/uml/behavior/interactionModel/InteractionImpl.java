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
import org.modelio.metamodel.data.uml.behavior.interactionModel.InteractionData;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0046b70c-c4bf-1fd8-97fe-001ec947cd2a")
public class InteractionImpl extends BehaviorImpl implements Interaction {
    @objid ("b287d533-9c95-44bf-93dd-0ff528c15d54")
    @Override
    public EList<Gate> getFormalGate() {
        return new SmList<>(this, InteractionData.Metadata.FormalGateDep());
    }

    @objid ("7b375131-d059-4296-a399-341325558c8c")
    @Override
    public <T extends Gate> List<T> getFormalGate(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Gate element : getFormalGate()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("856ff5df-2657-47d6-8538-a0d1bf33b0e6")
    @Override
    public EList<InteractionFragment> getFragment() {
        return new SmList<>(this, InteractionData.Metadata.FragmentDep());
    }

    @objid ("80574315-29c2-4e68-aaf4-1a5057b62b33")
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

    @objid ("948cfeb3-38dc-4eea-aa28-adf68738afcc")
    @Override
    public EList<Lifeline> getOwnedLine() {
        return new SmList<>(this, InteractionData.Metadata.OwnedLineDep());
    }

    @objid ("4120af4d-fdc7-4d00-bcac-1fc9c481e432")
    @Override
    public <T extends Lifeline> List<T> getOwnedLine(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Lifeline element : getOwnedLine()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("dd6acd80-caa1-41ac-a018-0cd8ff809c69")
    @Override
    public EList<InteractionUse> getReferedUse() {
        return new SmList<>(this, InteractionData.Metadata.ReferedUseDep());
    }

    @objid ("c6159918-8260-44df-b5f4-ff51278cc6df")
    @Override
    public <T extends InteractionUse> List<T> getReferedUse(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InteractionUse element : getReferedUse()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("2b2a95b0-51f2-4db1-9478-320a6fdc912e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("9bf8ebfe-cb9a-4e9d-a15f-9238740ca25c")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("9ab3a900-c241-4ba1-8b48-f34569b45081")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteraction(this);
        else
          return null;
    }

}
