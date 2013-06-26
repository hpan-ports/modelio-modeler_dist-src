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
    @objid ("d9836953-b49d-40ea-bc59-d77c445432c5")
    @Override
    public EList<Gate> getFormalGate() {
        return new SmList<>(this, InteractionData.Metadata.FormalGateDep());
    }

    @objid ("c0491835-7b85-4bd1-9c2c-4fe8ac3ec480")
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

    @objid ("8de87522-ec08-4ecb-a493-c0aef99df292")
    @Override
    public EList<InteractionFragment> getFragment() {
        return new SmList<>(this, InteractionData.Metadata.FragmentDep());
    }

    @objid ("bdcef0ae-8da5-4cd8-9605-fe7749e823d6")
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

    @objid ("ef8f2a23-a65b-4638-9c72-d2d1a5c7cf60")
    @Override
    public EList<Lifeline> getOwnedLine() {
        return new SmList<>(this, InteractionData.Metadata.OwnedLineDep());
    }

    @objid ("95adfe92-81e3-469b-9e58-4cb3e9094e46")
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

    @objid ("fd3772c2-6966-4ae0-97f4-b9320fd8df67")
    @Override
    public EList<InteractionUse> getReferedUse() {
        return new SmList<>(this, InteractionData.Metadata.ReferedUseDep());
    }

    @objid ("eff427dc-52aa-4dab-8231-91a0ef7d4471")
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

    @objid ("bfdcd8b2-6b5f-4bab-af1e-f23f838e64c8")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3bf06fd1-ff6c-422b-a213-f7c1b2b7a8c2")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("bb0b0b8a-5d9a-4f7a-88f4-0d69158099db")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInteraction(this);
        else
          return null;
    }

}
