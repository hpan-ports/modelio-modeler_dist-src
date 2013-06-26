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
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.data.analyst.RequirementData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("6beac79a-2be8-48f3-a776-0b680b64164a")
public class RequirementImpl extends AnalystElementImpl implements Requirement {
    @objid ("789cc62e-7dbd-4eb2-acdb-0b7eaf3b1a49")
    @Override
    public EList<Requirement> getSubRequirement() {
        return new SmList<>(this, RequirementData.Metadata.SubRequirementDep());
    }

    @objid ("f68ecf33-cb42-4b1c-b094-c70b670d1e22")
    @Override
    public <T extends Requirement> List<T> getSubRequirement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Requirement element : getSubRequirement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("8eacb827-82a3-41d8-9183-709079e87a57")
    @Override
    public RequirementContainer getOwnerContainer() {
        return (RequirementContainer) getDepVal(RequirementData.Metadata.OwnerContainerDep());
    }

    @objid ("ec51cace-c9ab-474d-a9ce-8ccd2d4dd2be")
    @Override
    public void setOwnerContainer(RequirementContainer value) {
        appendDepVal(RequirementData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("9386a19c-1e9a-450f-84c5-2d10b5bb6328")
    @Override
    public Requirement getParentRequirement() {
        return (Requirement) getDepVal(RequirementData.Metadata.ParentRequirementDep());
    }

    @objid ("be3c329e-db20-46af-80f7-53b732ef0c38")
    @Override
    public void setParentRequirement(Requirement value) {
        appendDepVal(RequirementData.Metadata.ParentRequirementDep(), (SmObjectImpl)value);
    }

    @objid ("564f5172-527b-472b-863f-594ff9eaa996")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.ParentRequirementDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("ca0e0242-e5c9-4b59-8ae0-975f75676f07")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(RequirementData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.ParentRequirementDep());
        if (obj != null)
          return new SmDepVal(RequirementData.Metadata.ParentRequirementDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("482782c0-152b-4d0b-bcb5-7e4b1927001d")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequirement(this);
        else
          return null;
    }

}
