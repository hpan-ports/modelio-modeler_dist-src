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
    @objid ("b4fe71b7-2ca4-4ec9-9ce3-4c62faa131bc")
    @Override
    public EList<Goal> getOwnedGoal() {
        return new SmList<>(this, GoalContainerData.Metadata.OwnedGoalDep());
    }

    @objid ("745cf824-613c-439b-afca-7690ebb5e548")
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

    @objid ("4a26d6ba-3f8a-4c94-aa4d-6ae0c94f6cab")
    @Override
    public GoalContainer getOwnerContainer() {
        return (GoalContainer) getDepVal(GoalContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("d915dfc2-70c3-42d8-bbf8-538f059cb9f5")
    @Override
    public void setOwnerContainer(GoalContainer value) {
        appendDepVal(GoalContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("4c8a4804-b01e-4dec-a747-f096ebcf28c0")
    @Override
    public EList<GoalContainer> getOwnedContainer() {
        return new SmList<>(this, GoalContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("6639923d-f3f9-4475-84eb-55183e3259be")
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

    @objid ("e33cca27-d3cd-4003-b69a-ffa9c64d6f92")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(GoalContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("f9c46619-a398-4db4-be9d-1d570ab53789")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(GoalContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("ea3582b7-0207-4d78-a223-fd723e2033e2")
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

    @objid ("3d738329-78f8-4e88-8fe3-a87891368299")
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

    @objid ("cdb6d958-ca8b-4a1e-866a-15c94178dce5")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGoalContainer(this);
        else
          return null;
    }

}
