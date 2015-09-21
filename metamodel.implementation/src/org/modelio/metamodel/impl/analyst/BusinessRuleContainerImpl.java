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
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.impl.analyst.BusinessRuleContainerData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("c569fea9-fad8-4e72-ac57-6326c88e45b6")
public class BusinessRuleContainerImpl extends AnalystContainerImpl implements BusinessRuleContainer {
    @objid ("d569f1c2-d91e-497c-aba1-c2ec18fc9e28")
    @Override
    public EList<BusinessRule> getOwnedRule() {
        return new SmList<>(this, ((BusinessRuleContainerSmClass)getClassOf()).getOwnedRuleDep());
    }

    @objid ("edc29215-0711-48f2-93a4-076af35947ce")
    @Override
    public <T extends BusinessRule> List<T> getOwnedRule(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BusinessRule element : getOwnedRule()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("46d23ec0-0b76-4659-a63e-49b6f2b20ea6")
    @Override
    public BusinessRuleContainer getOwnerContainer() {
        Object obj = getDepVal(((BusinessRuleContainerSmClass)getClassOf()).getOwnerContainerDep());
        return (obj instanceof BusinessRuleContainer)? (BusinessRuleContainer)obj : null;
    }

    @objid ("921450e4-1c27-416b-8f63-b6bc8882c46d")
    @Override
    public void setOwnerContainer(BusinessRuleContainer value) {
        appendDepVal(((BusinessRuleContainerSmClass)getClassOf()).getOwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("5f8940bb-0d21-4235-84cf-c417e94c5f51")
    @Override
    public EList<BusinessRuleContainer> getOwnedContainer() {
        return new SmList<>(this, ((BusinessRuleContainerSmClass)getClassOf()).getOwnedContainerDep());
    }

    @objid ("dd3a531b-8981-4df1-9028-9811eda17640")
    @Override
    public <T extends BusinessRuleContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BusinessRuleContainer element : getOwnedContainer()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("030aaae0-4314-468f-a70e-af285a1d45b8")
    @Override
    public AnalystProject getOwnerProject() {
        Object obj = getDepVal(((BusinessRuleContainerSmClass)getClassOf()).getOwnerProjectDep());
        return (obj instanceof AnalystProject)? (AnalystProject)obj : null;
    }

    @objid ("9cda3ae5-8ef4-46db-b7aa-295dde29e034")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(((BusinessRuleContainerSmClass)getClassOf()).getOwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("e947b7f5-b5bf-4568-ad76-9a1c20543d40")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerContainer
        obj = (SmObjectImpl)this.getDepVal(((BusinessRuleContainerSmClass)getClassOf()).getOwnerContainerDep());
        if (obj != null)
          return obj;
        // OwnerProject
        obj = (SmObjectImpl)this.getDepVal(((BusinessRuleContainerSmClass)getClassOf()).getOwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("8388e404-3339-47be-93a0-f5ee0a8fe808")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerContainer
        dep = ((BusinessRuleContainerSmClass)getClassOf()).getOwnerContainerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerProject
        dep = ((BusinessRuleContainerSmClass)getClassOf()).getOwnerProjectDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("4c2eef39-b821-4b93-80fe-a86500c81f93")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBusinessRuleContainer(this);
        else
          return null;
    }

}
