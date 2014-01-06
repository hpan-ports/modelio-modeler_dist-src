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
    @objid ("80b443ce-9922-498c-9425-78fa1bb763b1")
    @Override
    public EList<BusinessRule> getOwnedRule() {
        return new SmList<>(this, BusinessRuleContainerData.Metadata.OwnedRuleDep());
    }

    @objid ("040069f1-bccd-4213-b19d-d66ba2a40ff5")
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

    @objid ("688d572e-3a55-4f82-837e-3c6ae403befd")
    @Override
    public BusinessRuleContainer getOwnerContainer() {
        return (BusinessRuleContainer) getDepVal(BusinessRuleContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("361d02b8-02b2-4d65-8b33-9f714a375926")
    @Override
    public void setOwnerContainer(BusinessRuleContainer value) {
        appendDepVal(BusinessRuleContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("fe004023-e2bd-4fb0-bb76-d4991e91214f")
    @Override
    public EList<BusinessRuleContainer> getOwnedContainer() {
        return new SmList<>(this, BusinessRuleContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("5d931b81-85df-4c42-83f3-c93958933840")
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

    @objid ("03b7e20f-1622-493b-b4d3-a0d6a660cb27")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(BusinessRuleContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("f90baccb-ff89-4915-b361-8f012a5b72c0")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(BusinessRuleContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("f1e43e69-eb30-4570-8423-f46b03c69c51")
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

    @objid ("dabd0d90-42be-4478-9adf-f33c49535030")
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

    @objid ("05e0d033-9777-4cb3-836b-132936321f1c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBusinessRuleContainer(this);
        else
          return null;
    }

}
