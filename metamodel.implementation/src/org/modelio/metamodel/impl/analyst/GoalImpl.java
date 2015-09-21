/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.impl.analyst.GoalData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

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

    @objid ("76b0a260-409d-450f-bbb7-488774c12313")
    @Override
    public EList<Goal> getSubGoal() {
        return new SmList<>(this, ((GoalSmClass)getClassOf()).getSubGoalDep());
    }

    @objid ("6adb95dd-9e10-4535-8045-e2f026cd9792")
    @Override
    public <T extends Goal> List<T> getSubGoal(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Goal element : getSubGoal()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9fc4368c-920d-4bde-86b2-1589044c7940")
    @Override
    public GoalContainer getOwnerContainer() {
        Object obj = getDepVal(((GoalSmClass)getClassOf()).getOwnerContainerDep());
        return (obj instanceof GoalContainer)? (GoalContainer)obj : null;
    }

    @objid ("c6086cb5-35ca-4e04-bbd4-e9a6af386bef")
    @Override
    public void setOwnerContainer(GoalContainer value) {
        appendDepVal(((GoalSmClass)getClassOf()).getOwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("32a375bf-e140-4eda-b2f2-4d4ff239f9fd")
    @Override
    public Goal getParentGoal() {
        Object obj = getDepVal(((GoalSmClass)getClassOf()).getParentGoalDep());
        return (obj instanceof Goal)? (Goal)obj : null;
    }

    @objid ("70cfe9a0-a978-4be1-b531-2974e2f9d1f9")
    @Override
    public void setParentGoal(Goal value) {
        appendDepVal(((GoalSmClass)getClassOf()).getParentGoalDep(), (SmObjectImpl)value);
    }

    @objid ("6926477d-b854-46f5-aa45-a57495ef1074")
    @Override
    public Goal getLastGoalVersion() {
        Object obj = getDepVal(((GoalSmClass)getClassOf()).getLastGoalVersionDep());
        return (obj instanceof Goal)? (Goal)obj : null;
    }

    @objid ("78d839b6-1881-4a11-9a85-c96a4d80e3b1")
    @Override
    public void setLastGoalVersion(Goal value) {
        appendDepVal(((GoalSmClass)getClassOf()).getLastGoalVersionDep(), (SmObjectImpl)value);
    }

    @objid ("cb7ae501-bb58-4db9-814a-06322b7e7fc7")
    @Override
    public EList<Goal> getArchivedGoalVersion() {
        return new SmList<>(this, ((GoalSmClass)getClassOf()).getArchivedGoalVersionDep());
    }

    @objid ("8f31cd4e-a7c6-4360-b513-bb0143297c94")
    @Override
    public <T extends Goal> List<T> getArchivedGoalVersion(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Goal element : getArchivedGoalVersion()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("32a7a2f1-9c0b-420b-b6e1-bb0ea68c1b23")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerContainer
        obj = (SmObjectImpl)this.getDepVal(((GoalSmClass)getClassOf()).getOwnerContainerDep());
        if (obj != null)
          return obj;
        // ParentGoal
        obj = (SmObjectImpl)this.getDepVal(((GoalSmClass)getClassOf()).getParentGoalDep());
        if (obj != null)
          return obj;
        // LastGoalVersion
        obj = (SmObjectImpl)this.getDepVal(((GoalSmClass)getClassOf()).getLastGoalVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("0e353975-14f2-4d02-9ce5-f7210dc2e545")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerContainer
        dep = ((GoalSmClass)getClassOf()).getOwnerContainerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // ParentGoal
        dep = ((GoalSmClass)getClassOf()).getParentGoalDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // LastGoalVersion
        dep = ((GoalSmClass)getClassOf()).getLastGoalVersionDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("6bf8e414-2984-4dbc-932f-75fed05d6171")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGoal(this);
        else
          return null;
    }

}
