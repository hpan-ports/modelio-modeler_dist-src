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
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.analyst.RiskContainer;
import org.modelio.metamodel.impl.analyst.AnalystProjectData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0061e540-c4bf-1fd8-97fe-001ec947cd2a")
public class AnalystProjectImpl extends ModelElementImpl implements AnalystProject {
    @objid ("a0187aa2-b7fb-4abc-ad25-0a1754130e5a")
    @Override
    public PropertyContainer getPropertyRoot() {
        Object obj = getDepVal(((AnalystProjectSmClass)getClassOf()).getPropertyRootDep());
        return (obj instanceof PropertyContainer)? (PropertyContainer)obj : null;
    }

    @objid ("00d7eea3-2b8d-447c-8721-6d124293812e")
    @Override
    public void setPropertyRoot(PropertyContainer value) {
        appendDepVal(((AnalystProjectSmClass)getClassOf()).getPropertyRootDep(), (SmObjectImpl)value);
    }

    @objid ("7b5abbf8-55d8-40b2-8316-28f0d5cab894")
    @Override
    public EList<GoalContainer> getGoalRoot() {
        return new SmList<>(this, ((AnalystProjectSmClass)getClassOf()).getGoalRootDep());
    }

    @objid ("167cd627-643c-4824-af6e-0514c8828099")
    @Override
    public <T extends GoalContainer> List<T> getGoalRoot(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final GoalContainer element : getGoalRoot()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("115bbd26-0d4a-4447-b45b-9678dcbd94e6")
    @Override
    public EList<BusinessRuleContainer> getBusinessRuleRoot() {
        return new SmList<>(this, ((AnalystProjectSmClass)getClassOf()).getBusinessRuleRootDep());
    }

    @objid ("4e3e4200-112b-4b2e-b769-b20946789448")
    @Override
    public <T extends BusinessRuleContainer> List<T> getBusinessRuleRoot(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final BusinessRuleContainer element : getBusinessRuleRoot()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4ea73b4f-6077-46cb-bd47-abc870dd52ea")
    @Override
    public EList<Dictionary> getDictionaryRoot() {
        return new SmList<>(this, ((AnalystProjectSmClass)getClassOf()).getDictionaryRootDep());
    }

    @objid ("1e50cd81-95a0-43b4-9480-94d82102ad0b")
    @Override
    public <T extends Dictionary> List<T> getDictionaryRoot(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Dictionary element : getDictionaryRoot()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("af1b6ee9-51c5-4a08-9483-8572db9e87ac")
    @Override
    public EList<RequirementContainer> getRequirementRoot() {
        return new SmList<>(this, ((AnalystProjectSmClass)getClassOf()).getRequirementRootDep());
    }

    @objid ("41967675-d50b-4518-909c-f613559e9b18")
    @Override
    public <T extends RequirementContainer> List<T> getRequirementRoot(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final RequirementContainer element : getRequirementRoot()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4fa8d454-9258-42ab-b1be-7bcdbf10d781")
    @Override
    public EList<GenericAnalystContainer> getGenericRoot() {
        return new SmList<>(this, ((AnalystProjectSmClass)getClassOf()).getGenericRootDep());
    }

    @objid ("39345c09-52a3-4e93-ab0f-58b676abb22f")
    @Override
    public <T extends GenericAnalystContainer> List<T> getGenericRoot(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final GenericAnalystContainer element : getGenericRoot()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("d807499f-11b6-4288-9033-97c3002dff07")
    @Override
    public EList<RiskContainer> getRiskRoot() {
        return new SmList<>(this, ((AnalystProjectSmClass)getClassOf()).getRiskRootDep());
    }

    @objid ("097b1e9c-22d8-4669-8143-ada3736415b3")
    @Override
    public <T extends RiskContainer> List<T> getRiskRoot(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final RiskContainer element : getRiskRoot()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("7be8d460-92bf-45e8-9172-a1ab2c7c1bc7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("a80bc5b7-8e78-42fd-a322-1a7267f5f6c2")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("b2adf481-d314-43b9-bb9b-1475fba1de10")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystProject(this);
        else
          return null;
    }

}
