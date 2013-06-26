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
    @objid ("c07f4d04-dac1-4c6b-962b-cb11fab3d7ff")
    @Override
    public EList<BusinessRule> getSubRule() {
        return new SmList<>(this, BusinessRuleData.Metadata.SubRuleDep());
    }

    @objid ("521d19da-78f3-4143-8de2-f1a0e210edba")
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

    @objid ("29a518f7-fcc1-4611-9a7e-20de7031bf4d")
    @Override
    public BusinessRuleContainer getOwnerContainer() {
        return (BusinessRuleContainer) getDepVal(BusinessRuleData.Metadata.OwnerContainerDep());
    }

    @objid ("46999793-f03b-40f6-a2b5-77ba2a52131e")
    @Override
    public void setOwnerContainer(BusinessRuleContainer value) {
        appendDepVal(BusinessRuleData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("a56be67c-2642-4774-9b94-e02fc6b73d4f")
    @Override
    public BusinessRule getParentRule() {
        return (BusinessRule) getDepVal(BusinessRuleData.Metadata.ParentRuleDep());
    }

    @objid ("6daf918b-8037-4a8d-9ccd-a2a04d35b450")
    @Override
    public void setParentRule(BusinessRule value) {
        appendDepVal(BusinessRuleData.Metadata.ParentRuleDep(), (SmObjectImpl)value);
    }

    @objid ("9a0dd585-e032-4568-a9c9-3f89efa8d5f4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.ParentRuleDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("fe649633-ca41-4f9c-9080-e19a2833051e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(BusinessRuleData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(BusinessRuleData.Metadata.ParentRuleDep());
        if (obj != null)
          return new SmDepVal(BusinessRuleData.Metadata.ParentRuleDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("69124c52-e0a7-4ee3-9fef-3b2d4f5af748")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitBusinessRule(this);
        else
          return null;
    }

}
