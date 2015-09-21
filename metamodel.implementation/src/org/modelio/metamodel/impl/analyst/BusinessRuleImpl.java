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
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.impl.analyst.BusinessRuleData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("ae140aec-516f-4136-b9e7-def1d1a327ec")
public class BusinessRuleImpl extends AnalystElementImpl implements BusinessRule {
    @objid ("c345cb1d-864f-4e35-ad5a-082c13c66c0c")
    @Override
    public AnalystElement getLastVersion() {
        return getLastRuleVersion();
    }

    @objid ("639b83a4-95b1-465c-a5db-de9b091c1dee")
    @Override
    public EList<? extends AnalystElement> getArchivedVersions() {
        return getArchivedRuleVersion();
    }

    @objid ("4ffa5596-2801-4546-bf9d-aa4afe2b2d51")
    @Override
    public EList<BusinessRule> getSubRule() {
        return new SmList<>(this, ((BusinessRuleSmClass)getClassOf()).getSubRuleDep());
    }

    @objid ("d4772f49-f077-47fc-a673-57ced7de497d")
    @Override
    public <T extends BusinessRule> List<T> getSubRule(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BusinessRule element : getSubRule()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c28068a6-02c2-4551-9229-8bb76391c8a0")
    @Override
    public BusinessRuleContainer getOwnerContainer() {
        Object obj = getDepVal(((BusinessRuleSmClass)getClassOf()).getOwnerContainerDep());
        return (obj instanceof BusinessRuleContainer)? (BusinessRuleContainer)obj : null;
    }

    @objid ("794b1cd9-b4b6-4acf-ab35-bae752f644f2")
    @Override
    public void setOwnerContainer(BusinessRuleContainer value) {
        appendDepVal(((BusinessRuleSmClass)getClassOf()).getOwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("796d7a63-dfb1-4ae6-83d4-e15a256550a2")
    @Override
    public BusinessRule getParentRule() {
        Object obj = getDepVal(((BusinessRuleSmClass)getClassOf()).getParentRuleDep());
        return (obj instanceof BusinessRule)? (BusinessRule)obj : null;
    }

    @objid ("2a9b2f47-535c-457c-8992-bf8e9e8f5569")
    @Override
    public void setParentRule(BusinessRule value) {
        appendDepVal(((BusinessRuleSmClass)getClassOf()).getParentRuleDep(), (SmObjectImpl)value);
    }

    @objid ("10215222-d212-4a6f-8e4f-e346467b8a03")
    @Override
    public BusinessRule getLastRuleVersion() {
        Object obj = getDepVal(((BusinessRuleSmClass)getClassOf()).getLastRuleVersionDep());
        return (obj instanceof BusinessRule)? (BusinessRule)obj : null;
    }

    @objid ("cca60892-4469-47be-a8bf-c9e17eaad1df")
    @Override
    public void setLastRuleVersion(BusinessRule value) {
        appendDepVal(((BusinessRuleSmClass)getClassOf()).getLastRuleVersionDep(), (SmObjectImpl)value);
    }

    @objid ("9f3b26ee-38d6-44a3-aecd-6579edcf00da")
    @Override
    public EList<BusinessRule> getArchivedRuleVersion() {
        return new SmList<>(this, ((BusinessRuleSmClass)getClassOf()).getArchivedRuleVersionDep());
    }

    @objid ("85213bc4-7f82-4aa7-8c77-e14f652b55cd")
    @Override
    public <T extends BusinessRule> List<T> getArchivedRuleVersion(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BusinessRule element : getArchivedRuleVersion()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cd37ac86-2e02-45ac-91bd-eebde25a03c4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerContainer
        obj = (SmObjectImpl)this.getDepVal(((BusinessRuleSmClass)getClassOf()).getOwnerContainerDep());
        if (obj != null)
          return obj;
        // ParentRule
        obj = (SmObjectImpl)this.getDepVal(((BusinessRuleSmClass)getClassOf()).getParentRuleDep());
        if (obj != null)
          return obj;
        // LastRuleVersion
        obj = (SmObjectImpl)this.getDepVal(((BusinessRuleSmClass)getClassOf()).getLastRuleVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("fac1af4e-40a2-439f-96ab-9705d7b4507b")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerContainer
        dep = ((BusinessRuleSmClass)getClassOf()).getOwnerContainerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // ParentRule
        dep = ((BusinessRuleSmClass)getClassOf()).getParentRuleDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // LastRuleVersion
        dep = ((BusinessRuleSmClass)getClassOf()).getLastRuleVersionDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("3dfb7ba5-5f59-4145-be37-c17ccd56f843")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBusinessRule(this);
        else
          return null;
    }

}
