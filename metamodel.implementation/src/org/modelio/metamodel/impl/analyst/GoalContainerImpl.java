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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.data.analyst.GoalContainerData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("3ab0ab80-0c60-4e6c-83f2-d2694ce30165")
public class GoalContainerImpl extends AnalystContainerImpl implements GoalContainer {
    @objid ("979b1199-cab7-40cf-a3a3-4cbbf62b035e")
    @Override
    public EList<Goal> getOwnedGoal() {
        return new SmList<>(this, GoalContainerData.Metadata.OwnedGoalDep());
    }

    @objid ("f4645350-c3c0-45b8-aad4-4deaac2af520")
    @Override
    public <T extends Goal> List<T> getOwnedGoal(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Goal element : getOwnedGoal()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("b8393bb6-55a0-47c7-adcd-e86731c25c78")
    @Override
    public GoalContainer getOwnerContainer() {
        return (GoalContainer) getDepVal(GoalContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("34517232-b511-4d40-83de-83e3a1c9dba1")
    @Override
    public void setOwnerContainer(GoalContainer value) {
        appendDepVal(GoalContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("60259b23-d198-407e-81bc-faa7ec3a139c")
    @Override
    public EList<GoalContainer> getOwnedContainer() {
        return new SmList<>(this, GoalContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("729ffbce-6021-4dec-bc73-b1300b404f8e")
    @Override
    public <T extends GoalContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GoalContainer element : getOwnedContainer()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("fb3e0de7-b340-47a1-9914-866da222dd88")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(GoalContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("605474f7-e08e-400f-819b-8cd7bea2c91a")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(GoalContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("8b6d38e3-e8b9-4afa-87b7-f2c24055d3c6")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GoalContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GoalContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d529add4-85e5-4286-8f7c-de361b6a26d1")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GoalContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(GoalContainerData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GoalContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return new SmDepVal(GoalContainerData.Metadata.OwnerProjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("a6461926-1f5b-4363-81a6-b57df1a9ac87")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGoalContainer(this);
        else
          return null;
    }

}
