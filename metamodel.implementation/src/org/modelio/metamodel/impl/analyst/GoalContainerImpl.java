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
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.impl.analyst.GoalContainerData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("3ab0ab80-0c60-4e6c-83f2-d2694ce30165")
public class GoalContainerImpl extends AnalystContainerImpl implements GoalContainer {
    @objid ("1209c92c-7129-4cf6-bb28-8df8ffc51527")
    @Override
    public EList<Goal> getOwnedGoal() {
        return new SmList<>(this, ((GoalContainerSmClass)getClassOf()).getOwnedGoalDep());
    }

    @objid ("9ded3ba8-81b5-454f-a0ad-927c43949a33")
    @Override
    public <T extends Goal> List<T> getOwnedGoal(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Goal element : getOwnedGoal()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e4789764-eab1-4aaa-8ad6-2028e757c986")
    @Override
    public GoalContainer getOwnerContainer() {
        Object obj = getDepVal(((GoalContainerSmClass)getClassOf()).getOwnerContainerDep());
        return (obj instanceof GoalContainer)? (GoalContainer)obj : null;
    }

    @objid ("e1222b40-b6f0-44f3-94f7-310226d98449")
    @Override
    public void setOwnerContainer(GoalContainer value) {
        appendDepVal(((GoalContainerSmClass)getClassOf()).getOwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("accae385-a3f4-4b67-a424-a21746f204f1")
    @Override
    public EList<GoalContainer> getOwnedContainer() {
        return new SmList<>(this, ((GoalContainerSmClass)getClassOf()).getOwnedContainerDep());
    }

    @objid ("b23b8614-c5d9-4369-af10-2090edd66bea")
    @Override
    public <T extends GoalContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final GoalContainer element : getOwnedContainer()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c681373f-2dcc-4d6f-859b-2c145fc00b43")
    @Override
    public AnalystProject getOwnerProject() {
        Object obj = getDepVal(((GoalContainerSmClass)getClassOf()).getOwnerProjectDep());
        return (obj instanceof AnalystProject)? (AnalystProject)obj : null;
    }

    @objid ("5687d822-2acd-49b1-981b-04930c1da04a")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(((GoalContainerSmClass)getClassOf()).getOwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("fa712669-1b77-4c53-89ec-7260cbd0d316")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerContainer
        obj = (SmObjectImpl)this.getDepVal(((GoalContainerSmClass)getClassOf()).getOwnerContainerDep());
        if (obj != null)
          return obj;
        // OwnerProject
        obj = (SmObjectImpl)this.getDepVal(((GoalContainerSmClass)getClassOf()).getOwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("c692ec3d-2bce-4d2b-a7ec-0846743d53bc")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerContainer
        dep = ((GoalContainerSmClass)getClassOf()).getOwnerContainerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerProject
        dep = ((GoalContainerSmClass)getClassOf()).getOwnerProjectDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("3338e477-0f85-4749-9edb-8064433fe83c")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGoalContainer(this);
        else
          return null;
    }

}
