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
    @objid ("5b124ac3-0faa-40d4-87e6-dc8a2a67527b")
    @Override
    public EList<Goal> getSubGoal() {
        return new SmList<>(this, GoalData.Metadata.SubGoalDep());
    }

    @objid ("4fef6d02-50b4-4abd-b671-41196e0737e9")
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

    @objid ("32a14be6-049c-4e11-841a-109e1373911d")
    @Override
    public GoalContainer getOwnerContainer() {
        return (GoalContainer) getDepVal(GoalData.Metadata.OwnerContainerDep());
    }

    @objid ("feb5e667-fe6f-46d4-8dd6-41aa4d07d223")
    @Override
    public void setOwnerContainer(GoalContainer value) {
        appendDepVal(GoalData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("f48c9c30-a906-42f6-8ca8-e3c5168a72fb")
    @Override
    public Goal getParentGoal() {
        return (Goal) getDepVal(GoalData.Metadata.ParentGoalDep());
    }

    @objid ("3e19f512-2188-408d-b610-77ae8c18bc4e")
    @Override
    public void setParentGoal(Goal value) {
        appendDepVal(GoalData.Metadata.ParentGoalDep(), (SmObjectImpl)value);
    }

    @objid ("ce5e3d95-d58b-4a1c-90cd-a1064ddb2bac")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.ParentGoalDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("444eeca0-ba0a-4fc8-a619-ab03263a05be")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(GoalData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GoalData.Metadata.ParentGoalDep());
        if (obj != null)
          return new SmDepVal(GoalData.Metadata.ParentGoalDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("feb98b76-f212-4c15-bcd1-3954679664d2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGoal(this);
        else
          return null;
    }

}
