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
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.data.analyst.BusinessRuleData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

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

    @objid ("4578efc5-dfdb-4abd-97cb-32a695d548c9")
    @Override
    public EList<BusinessRule> getSubRule() {
        return new SmList<>(this, BusinessRuleData.Metadata.SubRuleDep());
    }

    @objid ("ee76e524-1d2a-4737-92d6-7901dd728ba3")
    @Override
    public <T extends BusinessRule> List<T> getSubRule(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BusinessRule element : getSubRule()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("97fe18ce-284d-440e-a4ca-77e713f41b88")
    @Override
    public BusinessRuleContainer getOwnerContainer() {
        return (BusinessRuleContainer) getDepVal(BusinessRuleData.Metadata.OwnerContainerDep());
    }

    @objid ("53417367-e5e4-41c3-90f1-c39a2c6c9030")
    @Override
    public void setOwnerContainer(BusinessRuleContainer value) {
        appendDepVal(BusinessRuleData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("96eb8cb3-3091-4caa-90f6-06ca1015c800")
    @Override
    public BusinessRule getParentRule() {
        return (BusinessRule) getDepVal(BusinessRuleData.Metadata.ParentRuleDep());
    }

    @objid ("e5e1e253-e99d-4c01-9761-145567237bb5")
    @Override
    public void setParentRule(BusinessRule value) {
        appendDepVal(BusinessRuleData.Metadata.ParentRuleDep(), (SmObjectImpl)value);
    }

    @objid ("41648014-f406-4629-8c36-8cec8143f264")
    @Override
    public BusinessRule getLastRuleVersion() {
        return (BusinessRule) getDepVal(BusinessRuleData.Metadata.LastRuleVersionDep());
    }

    @objid ("b305888f-6d4f-4d9e-81a2-45b3ec1125d1")
    @Override
    public void setLastRuleVersion(BusinessRule value) {
        appendDepVal(BusinessRuleData.Metadata.LastRuleVersionDep(), (SmObjectImpl)value);
    }

    @objid ("d29fc69a-86ba-4a85-a4af-679250b9fbbf")
    @Override
    public EList<BusinessRule> getArchivedRuleVersion() {
        return new SmList<>(this, BusinessRuleData.Metadata.ArchivedRuleVersionDep());
    }

    @objid ("b0345edb-ffab-420c-849d-8912ace8385e")
    @Override
    public <T extends BusinessRule> List<T> getArchivedRuleVersion(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final BusinessRule element : getArchivedRuleVersion()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e61787b1-2de0-45d0-9a53-4e2bc1dc3340")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.ParentRuleDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.LastRuleVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("dd1b562d-12c5-4585-9271-fb3cd6a32c0d")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(BusinessRuleData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.ParentRuleDep());
        if (obj != null)
          return new SmDepVal(BusinessRuleData.Metadata.ParentRuleDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.LastRuleVersionDep());
        if (obj != null)
          return new SmDepVal(BusinessRuleData.Metadata.LastRuleVersionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("35a0ae85-a6db-48d8-abeb-196c604d39cd")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBusinessRule(this);
        else
          return null;
    }

}
