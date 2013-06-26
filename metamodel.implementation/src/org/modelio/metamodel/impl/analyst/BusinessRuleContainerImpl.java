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
    @objid ("5d4555e9-b5d2-4c85-948c-db120e3d6859")
    @Override
    public EList<BusinessRule> getOwnedRule() {
        return new SmList<>(this, BusinessRuleContainerData.Metadata.OwnedRuleDep());
    }

    @objid ("417a4ce9-9227-4fa9-8652-cf92fba5095e")
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

    @objid ("8fb222b6-7ec5-44db-935c-e8abfca709c4")
    @Override
    public BusinessRuleContainer getOwnerContainer() {
        return (BusinessRuleContainer) getDepVal(BusinessRuleContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("f10f8f69-da32-4df7-b6ae-6a55232b560c")
    @Override
    public void setOwnerContainer(BusinessRuleContainer value) {
        appendDepVal(BusinessRuleContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("084445a2-acd0-42f6-bbdf-56538ebd59d7")
    @Override
    public EList<BusinessRuleContainer> getOwnedContainer() {
        return new SmList<>(this, BusinessRuleContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("10e712fc-76bc-4a5e-b2de-fa9aeee843f1")
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

    @objid ("7ca28bf2-4829-46fe-ab5f-acab2142057e")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(BusinessRuleContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("9434e4e8-4bc1-4cc3-a27f-31cabfe7b5e0")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(BusinessRuleContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("f17ad672-ea3e-4c53-aa17-04df87494e62")
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

    @objid ("127efb44-0369-42ed-b25c-efa92c736fa5")
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

    @objid ("7f3b0758-e66e-4363-a884-f095d3ad2fbd")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBusinessRuleContainer(this);
        else
          return null;
    }

}
