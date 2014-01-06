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
    @objid ("0054a794-525a-4b1d-b9ed-e060765af3e5")
    @Override
    public int getVersion() {
        return (Integer) getAttVal(BusinessRuleData.Metadata.VersionAtt());
    }

    @objid ("f59560a7-fc7b-4ddb-98fb-87cb9daa559f")
    @Override
    public void setVersion(int value) {
        setAttVal(BusinessRuleData.Metadata.VersionAtt(), value);
    }

    @objid ("61357e21-3857-4d57-8052-c66f89605da9")
    @Override
    public EList<BusinessRule> getSubRule() {
        return new SmList<>(this, BusinessRuleData.Metadata.SubRuleDep());
    }

    @objid ("bf2a7ca0-df38-4b6b-b3e0-a92140532010")
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

    @objid ("6f266fab-5ec8-4f78-bc6a-d7e27f5d1f15")
    @Override
    public BusinessRuleContainer getOwnerContainer() {
        return (BusinessRuleContainer) getDepVal(BusinessRuleData.Metadata.OwnerContainerDep());
    }

    @objid ("8907b65e-c3ae-4531-95a7-183ba7bcaadb")
    @Override
    public void setOwnerContainer(BusinessRuleContainer value) {
        appendDepVal(BusinessRuleData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("6145d918-c44e-405f-bfb9-c534b5c3c12f")
    @Override
    public BusinessRule getParentRule() {
        return (BusinessRule) getDepVal(BusinessRuleData.Metadata.ParentRuleDep());
    }

    @objid ("4438831b-7718-4240-aeb8-db8c37b9f62e")
    @Override
    public void setParentRule(BusinessRule value) {
        appendDepVal(BusinessRuleData.Metadata.ParentRuleDep(), (SmObjectImpl)value);
    }

    @objid ("bd5e8814-41c1-4afa-8b0d-2f5539205981")
    @Override
    public BusinessRule getLastRuleVersion() {
        return (BusinessRule) getDepVal(BusinessRuleData.Metadata.LastRuleVersionDep());
    }

    @objid ("e1a1dec8-0e72-4615-a27a-6bb26faee4da")
    @Override
    public void setLastRuleVersion(BusinessRule value) {
        appendDepVal(BusinessRuleData.Metadata.LastRuleVersionDep(), (SmObjectImpl)value);
    }

    @objid ("f6ce4497-dfbd-4792-bbdb-f06d34f6e3d1")
    @Override
    public EList<BusinessRule> getArchivedRuleVersion() {
        return new SmList<>(this, BusinessRuleData.Metadata.ArchivedRuleVersionDep());
    }

    @objid ("c4c7227b-8278-4693-a0b6-eef2dc335c68")
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

    @objid ("41fcfff5-08fb-4ea2-8641-f25e88540f82")
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

    @objid ("a3c9fb48-a1ae-4d59-a503-a41a15307635")
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

    @objid ("d33ff22b-57b3-456a-82f0-284bac352029")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBusinessRule(this);
        else
          return null;
    }

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

}
