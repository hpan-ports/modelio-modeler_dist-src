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
    @objid ("c758477e-8592-4e29-9744-c6ea4a3ad020")
    @Override
    public EList<Goal> getOwnedGoal() {
        return new SmList<>(this, GoalContainerData.Metadata.OwnedGoalDep());
    }

    @objid ("88a4ef46-c263-489d-af5b-ffcb206c3675")
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

    @objid ("84bacc42-8f21-4d91-a01d-436b68751d88")
    @Override
    public GoalContainer getOwnerContainer() {
        return (GoalContainer) getDepVal(GoalContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("b4a52bd0-2bb2-4887-a9f1-fe33d1038a62")
    @Override
    public void setOwnerContainer(GoalContainer value) {
        appendDepVal(GoalContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("4226e785-61eb-498a-8c70-d64072b20876")
    @Override
    public EList<GoalContainer> getOwnedContainer() {
        return new SmList<>(this, GoalContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("603d0d82-d189-4a60-bccf-28d41459f3ad")
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

    @objid ("b381cd1a-d7b2-4a80-8c74-e8ebe32f803c")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(GoalContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("ca989c66-c010-4644-bbfb-12b319e0a1fc")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(GoalContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("d1b5296a-0de6-4c1c-96ee-1715c142f5db")
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

    @objid ("4700730c-d1f9-4c15-87cb-58070a005e23")
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

    @objid ("59a4a883-696f-405d-bd27-cb7818468235")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGoalContainer(this);
        else
          return null;
    }

}
