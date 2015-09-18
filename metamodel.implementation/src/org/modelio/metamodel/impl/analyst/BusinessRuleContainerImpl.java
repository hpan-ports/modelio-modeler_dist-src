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
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.data.analyst.BusinessRuleContainerData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("c569fea9-fad8-4e72-ac57-6326c88e45b6")
public class BusinessRuleContainerImpl extends AnalystContainerImpl implements BusinessRuleContainer {
    @objid ("d8fc658d-47ca-401f-bb38-ed99ef7f3757")
    @Override
    public EList<BusinessRule> getOwnedRule() {
        return new SmList<>(this, BusinessRuleContainerData.Metadata.OwnedRuleDep());
    }

    @objid ("d6792db2-6415-4e50-a228-da9ff11cf168")
    @Override
    public <T extends BusinessRule> List<T> getOwnedRule(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BusinessRule element : getOwnedRule()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("747e4ec7-ac3f-47f4-82ea-6baf03eae28f")
    @Override
    public BusinessRuleContainer getOwnerContainer() {
        return (BusinessRuleContainer) getDepVal(BusinessRuleContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("109aae44-46d2-43ad-bbd9-5ea1085fd75a")
    @Override
    public void setOwnerContainer(BusinessRuleContainer value) {
        appendDepVal(BusinessRuleContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("1d2c665d-1208-49df-a0f1-7ecbe2b40ade")
    @Override
    public EList<BusinessRuleContainer> getOwnedContainer() {
        return new SmList<>(this, BusinessRuleContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("025613e3-4140-4c63-88a2-1e0a50b28e79")
    @Override
    public <T extends BusinessRuleContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BusinessRuleContainer element : getOwnedContainer()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("5500608a-c423-4be4-b384-529fe6afdb1d")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(BusinessRuleContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("564eaf6a-693a-48d6-9b50-b29c6d1aedaf")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(BusinessRuleContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("78027517-9411-4fe0-aa0e-9138b14b69a1")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("a99b91ac-fd7f-4b65-9dd1-de9ee3751f52")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(BusinessRuleContainerData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return new SmDepVal(BusinessRuleContainerData.Metadata.OwnerProjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("523c352f-259e-4cee-99d2-778722852392")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBusinessRuleContainer(this);
        else
          return null;
    }

}
