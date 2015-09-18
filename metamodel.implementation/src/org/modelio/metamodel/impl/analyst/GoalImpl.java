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
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.data.analyst.GoalData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("760d4fa8-abc5-460f-898b-68d0f7d37134")
public class GoalImpl extends AnalystElementImpl implements Goal {
    @objid ("b5e26f4b-cd2f-419a-a868-ec3e6a85fb77")
    @Override
    public EList<? extends AnalystElement> getArchivedVersions() {
        return getArchivedGoalVersion();
    }

    @objid ("02f9e32a-4617-429d-9174-c8b550a32032")
    @Override
    public AnalystElement getLastVersion() {
        return getLastGoalVersion();
    }

    @objid ("5ab9bc1e-c0b8-4a55-8e8d-6b0180979787")
    @Override
    public EList<Goal> getSubGoal() {
        return new SmList<>(this, GoalData.Metadata.SubGoalDep());
    }

    @objid ("ff2eb0a3-81fd-4423-b179-f8d1d4911eb0")
    @Override
    public <T extends Goal> List<T> getSubGoal(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Goal element : getSubGoal()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("65943c1c-d363-435d-9570-c83965ee9e32")
    @Override
    public GoalContainer getOwnerContainer() {
        return (GoalContainer) getDepVal(GoalData.Metadata.OwnerContainerDep());
    }

    @objid ("d2e10e19-477d-4db1-b99e-8568632295b3")
    @Override
    public void setOwnerContainer(GoalContainer value) {
        appendDepVal(GoalData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("ba771e35-b69f-44ca-9992-2ed89052f911")
    @Override
    public Goal getParentGoal() {
        return (Goal) getDepVal(GoalData.Metadata.ParentGoalDep());
    }

    @objid ("8d652a71-f1a7-4fa8-a9fb-09117920134f")
    @Override
    public void setParentGoal(Goal value) {
        appendDepVal(GoalData.Metadata.ParentGoalDep(), (SmObjectImpl)value);
    }

    @objid ("b3f2d564-29b5-47e2-9c67-7ff951376af3")
    @Override
    public Goal getLastGoalVersion() {
        return (Goal) getDepVal(GoalData.Metadata.LastGoalVersionDep());
    }

    @objid ("1b896555-052e-41a7-a3f1-0a67baed0d35")
    @Override
    public void setLastGoalVersion(Goal value) {
        appendDepVal(GoalData.Metadata.LastGoalVersionDep(), (SmObjectImpl)value);
    }

    @objid ("8e05c724-97bb-4c13-9853-79c97fe58520")
    @Override
    public EList<Goal> getArchivedGoalVersion() {
        return new SmList<>(this, GoalData.Metadata.ArchivedGoalVersionDep());
    }

    @objid ("abed004d-f3bc-4b78-8619-342fc6461e49")
    @Override
    public <T extends Goal> List<T> getArchivedGoalVersion(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Goal element : getArchivedGoalVersion()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a0f9a67d-65a7-4d7c-b4b4-d200ade1f9f4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.ParentGoalDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.LastGoalVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("8af7f4d9-dbce-4eec-bf6f-b090b946ee45")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(GoalData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.ParentGoalDep());
        if (obj != null)
          return new SmDepVal(GoalData.Metadata.ParentGoalDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.LastGoalVersionDep());
        if (obj != null)
          return new SmDepVal(GoalData.Metadata.LastGoalVersionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("51ebdaa0-ef69-4e63-bd36-a7b6750a3a74")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGoal(this);
        else
          return null;
    }

}
