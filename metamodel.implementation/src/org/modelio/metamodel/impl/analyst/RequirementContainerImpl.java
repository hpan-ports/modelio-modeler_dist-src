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
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.data.analyst.RequirementContainerData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("41b13368-1afd-46b7-a5b0-17463a4f640a")
public class RequirementContainerImpl extends AnalystContainerImpl implements RequirementContainer {
    @objid ("5fc69c70-3527-47e4-9095-266b7af76d14")
    @Override
    public EList<Requirement> getOwnedRequirement() {
        return new SmList<>(this, RequirementContainerData.Metadata.OwnedRequirementDep());
    }

    @objid ("d57d0ea0-0aec-412c-b457-ecfa78421ef8")
    @Override
    public <T extends Requirement> List<T> getOwnedRequirement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Requirement element : getOwnedRequirement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0ac97d62-fd44-4e8a-8f23-04b56077d22f")
    @Override
    public RequirementContainer getOwnerContainer() {
        return (RequirementContainer) getDepVal(RequirementContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("c630089b-d12d-4269-97b2-2893804b399d")
    @Override
    public void setOwnerContainer(RequirementContainer value) {
        appendDepVal(RequirementContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("6d13ede8-b7a2-4067-bd82-bcef9b9008d5")
    @Override
    public EList<RequirementContainer> getOwnedContainer() {
        return new SmList<>(this, RequirementContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("356a9d40-3ac9-45d6-a6b9-bfb913948bf4")
    @Override
    public <T extends RequirementContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final RequirementContainer element : getOwnedContainer()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("bdcb7fe0-7359-4871-80ac-e54e743771d3")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(RequirementContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("df1ad56d-b0ed-4f15-b7b5-9efcce993a2c")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(RequirementContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("f388d586-e007-44b8-86f4-16e9e832334e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("15726d7f-03d3-46c1-81d6-f77f09168f12")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(RequirementContainerData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(RequirementContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return new SmDepVal(RequirementContainerData.Metadata.OwnerProjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("7d2e42b8-d6b4-463a-9bfb-9f790608bf83")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequirementContainer(this);
        else
          return null;
    }

}
