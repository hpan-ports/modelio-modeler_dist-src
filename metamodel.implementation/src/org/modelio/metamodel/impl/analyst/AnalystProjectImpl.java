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
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("0061e540-c4bf-1fd8-97fe-001ec947cd2a")
public class AnalystProjectImpl extends ModelElementImpl implements AnalystProject {
    @objid ("4d13c25c-2f3e-4581-8213-0b5eeb5edaaf")
    @Override
    public PropertyContainer getPropertyRoot() {
        return (PropertyContainer) getDepVal(AnalystProjectData.Metadata.PropertyRootDep());
    }

    @objid ("706ad2dd-c7ff-4c6a-8433-92c91dd629a1")
    @Override
    public void setPropertyRoot(PropertyContainer value) {
        appendDepVal(AnalystProjectData.Metadata.PropertyRootDep(), (SmObjectImpl)value);
    }

    @objid ("75aeed5e-ca1b-4aac-8f90-99e9aac3f737")
    @Override
    public EList<GoalContainer> getGoalRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.GoalRootDep());
    }

    @objid ("2dd9ecb4-a5f9-43dc-90c2-f65c2a0a5cd3")
    @Override
    public <T extends GoalContainer> List<T> getGoalRoot(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GoalContainer element : getGoalRoot()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("cfdb1a0f-849f-426d-ab60-a65404c6857d")
    @Override
    public EList<BusinessRuleContainer> getBusinessRuleRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.BusinessRuleRootDep());
    }

    @objid ("c9aa86ec-5a39-4d40-a559-42a692b9f716")
    @Override
    public <T extends BusinessRuleContainer> List<T> getBusinessRuleRoot(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BusinessRuleContainer element : getBusinessRuleRoot()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3e5bb5f6-72d7-4dbd-9ac9-5ff7a1ae725c")
    @Override
    public EList<Dictionary> getDictionaryRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.DictionaryRootDep());
    }

    @objid ("8626836a-28d5-467a-95e0-0a381b836198")
    @Override
    public <T extends Dictionary> List<T> getDictionaryRoot(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Dictionary element : getDictionaryRoot()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("50698f4a-0694-4430-b97c-28bf85bb171c")
    @Override
    public EList<RequirementContainer> getRequirementRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.RequirementRootDep());
    }

    @objid ("9f4fc21f-f7f1-4b13-b349-16e0d30f3557")
    @Override
    public <T extends RequirementContainer> List<T> getRequirementRoot(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final RequirementContainer element : getRequirementRoot()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4a1ec99f-dd97-499c-99dc-f58d76cee2fd")
    @Override
    public EList<GenericAnalystContainer> getGenericRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.GenericRootDep());
    }

    @objid ("04f21005-fb51-45c1-8217-2c95e485c51f")
    @Override
    public <T extends GenericAnalystContainer> List<T> getGenericRoot(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GenericAnalystContainer element : getGenericRoot()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("77103e06-692a-4ea0-b3b8-3bfdd00e9a38")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("b4df969a-4393-4ee2-b6fe-92ee76f81009")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("f091063e-91d5-47f5-9ec0-ea9abbd7ee10")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystProject(this);
        else
          return null;
    }

}
