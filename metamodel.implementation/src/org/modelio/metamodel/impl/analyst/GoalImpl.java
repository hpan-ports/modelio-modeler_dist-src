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
    @objid ("5727721e-4667-4ac0-8337-2d135dd72496")
    @Override
    public int getVersion() {
        return (Integer) getAttVal(GoalData.Metadata.VersionAtt());
    }

    @objid ("1751c8da-4b33-49f6-a2b9-7717edc4a3c2")
    @Override
    public void setVersion(int value) {
        setAttVal(GoalData.Metadata.VersionAtt(), value);
    }

    @objid ("13ad3683-9763-446d-a1e5-c36278674048")
    @Override
    public EList<Goal> getSubGoal() {
        return new SmList<>(this, GoalData.Metadata.SubGoalDep());
    }

    @objid ("4bd504c0-bd38-4a89-9d7a-0453edcccf1d")
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

    @objid ("15aa8f7c-4b96-4fda-94c3-33643fac4472")
    @Override
    public GoalContainer getOwnerContainer() {
        return (GoalContainer) getDepVal(GoalData.Metadata.OwnerContainerDep());
    }

    @objid ("588eb3b5-abaf-4157-b9f5-76067f7f8d3d")
    @Override
    public void setOwnerContainer(GoalContainer value) {
        appendDepVal(GoalData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("f8ed6ffa-dd4b-48c1-8a50-4bbea3d95866")
    @Override
    public Goal getParentGoal() {
        return (Goal) getDepVal(GoalData.Metadata.ParentGoalDep());
    }

    @objid ("1d45f047-c32f-47b2-a60f-7a155b0d836e")
    @Override
    public void setParentGoal(Goal value) {
        appendDepVal(GoalData.Metadata.ParentGoalDep(), (SmObjectImpl)value);
    }

    @objid ("4503c390-3c94-4d5b-ab88-5a048b3f46a7")
    @Override
    public Goal getLastGoalVersion() {
        return (Goal) getDepVal(GoalData.Metadata.LastGoalVersionDep());
    }

    @objid ("cd3c6d6c-7a0f-43de-a728-b5c08720854e")
    @Override
    public void setLastGoalVersion(Goal value) {
        appendDepVal(GoalData.Metadata.LastGoalVersionDep(), (SmObjectImpl)value);
    }

    @objid ("3cb10004-fd27-41ee-9294-d224fda8d876")
    @Override
    public EList<Goal> getArchivedGoalVersion() {
        return new SmList<>(this, GoalData.Metadata.ArchivedGoalVersionDep());
    }

    @objid ("f50420c7-354a-4f2c-98f6-9c300619c81e")
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

    @objid ("0d5654c4-b19a-4c72-94da-ebf922d4c719")
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

    @objid ("f7124eb4-8462-49e4-90ea-1b39e67916f3")
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

    @objid ("d2e9e6c9-5328-4247-8b99-d8e4993fcf56")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGoal(this);
        else
          return null;
    }

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

}
