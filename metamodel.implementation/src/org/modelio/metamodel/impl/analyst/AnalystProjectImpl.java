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
    @objid ("ad4813a5-13d7-4263-bbcb-3922f676128c")
    @Override
    public PropertyContainer getPropertyRoot() {
        return (PropertyContainer) getDepVal(AnalystProjectData.Metadata.PropertyRootDep());
    }

    @objid ("dfc580db-c222-4431-aa5d-9fb2cbf2f223")
    @Override
    public void setPropertyRoot(PropertyContainer value) {
        appendDepVal(AnalystProjectData.Metadata.PropertyRootDep(), (SmObjectImpl)value);
    }

    @objid ("9dba1bcc-39d5-487a-9ec0-9abe11a246b8")
    @Override
    public EList<GoalContainer> getGoalRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.GoalRootDep());
    }

    @objid ("915ea485-1f51-4f6b-ad72-ed9900a6c4f7")
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

    @objid ("a6e8052d-0434-40ab-baf6-eb392a3cb87c")
    @Override
    public EList<BusinessRuleContainer> getBusinessRuleRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.BusinessRuleRootDep());
    }

    @objid ("1bf151ad-a06e-42c0-a8c5-40ef78d6c74a")
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

    @objid ("cb8ef4b6-0015-4fb4-9195-c27b809911ee")
    @Override
    public EList<Dictionary> getDictionaryRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.DictionaryRootDep());
    }

    @objid ("55f4af1d-11c4-4699-a01b-64f0b3da0aa6")
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

    @objid ("420a4af9-d24a-49fc-b6bb-87eb53d5d8f0")
    @Override
    public EList<RequirementContainer> getRequirementRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.RequirementRootDep());
    }

    @objid ("2cb3bcec-408b-49b3-be07-cd47c262684c")
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

    @objid ("0385ec53-c8f5-45cb-9825-3f43c55dc3ac")
    @Override
    public EList<GenericAnalystContainer> getGenericRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.GenericRootDep());
    }

    @objid ("e2547ed0-fa50-4d46-ad4a-0c24927558b0")
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

    @objid ("8bb62124-c1de-4c2b-bb45-c473d8c723b7")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3c7755a6-0c62-48bc-a895-8364162884de")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("c627abd9-c81d-4f35-aa78-a1d90f4f1d5a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystProject(this);
        else
          return null;
    }

}
