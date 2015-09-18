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
    @objid ("a59e2adc-0f66-4e30-9cbf-42db8b7edafd")
    @Override
    public EList<GeneralOrdering> getToAfter() {
        return new SmList<>(this, OccurrenceSpecificationData.Metadata.ToAfterDep());
    }

    @objid ("7d2cb287-f9d8-4f2d-ab94-3d6415bb0bd0")
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

    @objid ("b381c157-6f8f-4e91-8151-a6f61848fc19")
    @Override
    public EList<GeneralOrdering> getToBefore() {
        return new SmList<>(this, OccurrenceSpecificationData.Metadata.ToBeforeDep());
    }

    @objid ("39f1e809-9321-4d3f-902d-eaa82bdb664c")
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

    @objid ("d352a5c4-afe8-434b-8b04-35e64b355145")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("e941a518-1e68-422e-ab4c-69f501f1e599")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("52353637-217f-479c-9e4a-45827f847bc8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitOccurrenceSpecification(this);
        else
          return null;
    }

}
