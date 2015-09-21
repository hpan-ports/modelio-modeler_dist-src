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
 Metamodel: Standard, version 0.0.9025, by Modeliosoft
 Generator version: 3.2.10.9023
 Generated on: May 06, 2015
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
import org.modelio.metamodel.analyst.Risk;
import org.modelio.metamodel.analyst.RiskContainer;
import org.modelio.metamodel.impl.analyst.RiskContainerData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("ee950935-ff8b-42bf-b48f-fc73e29f2adf")
public class RiskContainerImpl extends AnalystContainerImpl implements RiskContainer {
    @objid ("be8d9782-afd0-4da7-b09d-024cc5bb53ad")
    @Override
    public EList<Risk> getOwnedRisk() {
        return new SmList<>(this, ((RiskContainerSmClass)getClassOf()).getOwnedRiskDep());
    }

    @objid ("79558804-0cc7-482e-a3fa-f0e307d86fe2")
    @Override
    public <T extends Risk> List<T> getOwnedRisk(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Risk element : getOwnedRisk()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8c52fd77-0970-472f-b420-000ec759af59")
    @Override
    public RiskContainer getOwnerContainer() {
        Object obj = getDepVal(((RiskContainerSmClass)getClassOf()).getOwnerContainerDep());
        return (obj instanceof RiskContainer)? (RiskContainer)obj : null;
    }

    @objid ("f0587607-b5b1-4d91-bba8-e596466759bf")
    @Override
    public void setOwnerContainer(RiskContainer value) {
        appendDepVal(((RiskContainerSmClass)getClassOf()).getOwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("be919cba-b927-4e34-ac7a-d9fcccce908f")
    @Override
    public EList<RiskContainer> getOwnedContainer() {
        return new SmList<>(this, ((RiskContainerSmClass)getClassOf()).getOwnedContainerDep());
    }

    @objid ("30b86518-089e-44c3-a064-e075aa4ed787")
    @Override
    public <T extends RiskContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final RiskContainer element : getOwnedContainer()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("55e499af-fefe-4f85-be64-209390e5f11a")
    @Override
    public AnalystProject getOwnerProject() {
        Object obj = getDepVal(((RiskContainerSmClass)getClassOf()).getOwnerProjectDep());
        return (obj instanceof AnalystProject)? (AnalystProject)obj : null;
    }

    @objid ("e593bada-fb21-49b5-a54e-2578e7d9b05a")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(((RiskContainerSmClass)getClassOf()).getOwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("3e360d47-fd1d-466a-a8b0-597d81d4c47a")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerContainer
        obj = (SmObjectImpl)this.getDepVal(((RiskContainerSmClass)getClassOf()).getOwnerContainerDep());
        if (obj != null)
          return obj;
        // OwnerProject
        obj = (SmObjectImpl)this.getDepVal(((RiskContainerSmClass)getClassOf()).getOwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9898916a-d2c5-43a6-a261-451a002d60bb")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerContainer
        dep = ((RiskContainerSmClass)getClassOf()).getOwnerContainerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerProject
        dep = ((RiskContainerSmClass)getClassOf()).getOwnerProjectDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("29f8d876-8c0c-4f77-865c-d29461eecc5a")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRiskContainer(this);
        else
          return null;
    }

}
