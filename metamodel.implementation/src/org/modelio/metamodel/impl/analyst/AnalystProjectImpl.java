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
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.analyst.Dictionary;
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
    @objid ("e36d3178-c40d-4a02-908b-76e0ec27ce02")
    @Override
    public PropertyContainer getPropertyRoot() {
        return (PropertyContainer) getDepVal(AnalystProjectData.Metadata.PropertyRootDep());
    }

    @objid ("79bc4ed4-b25a-49a9-acf4-59a65bd3ac81")
    @Override
    public void setPropertyRoot(PropertyContainer value) {
        appendDepVal(AnalystProjectData.Metadata.PropertyRootDep(), (SmObjectImpl)value);
    }

    @objid ("8d745252-5957-46c2-9cb9-1aba96d951e6")
    @Override
    public EList<GoalContainer> getGoalRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.GoalRootDep());
    }

    @objid ("ff3bd2c0-25db-41fc-a0e9-48541be5e367")
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

    @objid ("f9d2e293-f8ce-4fd3-bc8a-ae4f054cf336")
    @Override
    public EList<BusinessRuleContainer> getBusinessRuleRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.BusinessRuleRootDep());
    }

    @objid ("35d96f69-de86-48bb-b428-d70d3a10019a")
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

    @objid ("cb6e5c52-dc73-4856-8a91-8e87c15fd873")
    @Override
    public EList<Dictionary> getDictionaryRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.DictionaryRootDep());
    }

    @objid ("d83aa0c0-aabe-41cb-b298-98141d43f341")
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

    @objid ("ffefc10e-5e93-4dce-acf0-00424c139862")
    @Override
    public EList<RequirementContainer> getRequirementRoot() {
        return new SmList<>(this, AnalystProjectData.Metadata.RequirementRootDep());
    }

    @objid ("46b790b1-f0c6-4d47-8339-80651f424742")
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

    @objid ("e1467b2e-4c96-47ab-96ee-1f337f996a97")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("48b75cf2-dbff-4dae-b0d3-f226588f8865")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("ce38dc54-7c25-4109-9e84-a07923ed67fd")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitAnalystProject(this);
        else
          return null;
    }

}
