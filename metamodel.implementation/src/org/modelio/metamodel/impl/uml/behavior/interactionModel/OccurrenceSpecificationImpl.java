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
import org.modelio.metamodel.data.uml.behavior.interactionModel.OccurrenceSpecificationData;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;
import org.modelio.metamodel.uml.behavior.interactionModel.OccurrenceSpecification;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("004a871a-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class OccurrenceSpecificationImpl extends InteractionFragmentImpl implements OccurrenceSpecification {
    @objid ("b314cabf-ca65-4aeb-b4f3-0f8712148d7c")
    @Override
    public EList<GeneralOrdering> getToAfter() {
        return new SmList<>(this, OccurrenceSpecificationData.Metadata.ToAfterDep());
    }

    @objid ("03e8e847-b43d-4ec2-a132-8119e64c7cd7")
    @Override
    public <T extends GeneralOrdering> List<T> getToAfter(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GeneralOrdering element : getToAfter()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a9462a55-93b2-4dab-b267-c4c236a99cc1")
    @Override
    public EList<GeneralOrdering> getToBefore() {
        return new SmList<>(this, OccurrenceSpecificationData.Metadata.ToBeforeDep());
    }

    @objid ("8c570592-57f7-463d-9253-7cdf5750e44b")
    @Override
    public <T extends GeneralOrdering> List<T> getToBefore(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GeneralOrdering element : getToBefore()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("755cd0e6-ffc6-477b-a62f-77f0464756fc")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("6069ddab-f791-465e-b22e-14ee3c625e1d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("9c894161-cb25-4393-805b-6baaa8735f4d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitOccurrenceSpecification(this);
        else
          return null;
    }

}
