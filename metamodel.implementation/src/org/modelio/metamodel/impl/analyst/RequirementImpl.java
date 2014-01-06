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
    @objid ("c2e6d834-62f5-4a56-9810-0c9fc841f9ee")
    @Override
    public EList<Requirement> getSubRequirement() {
        return new SmList<>(this, RequirementData.Metadata.SubRequirementDep());
    }

    @objid ("4ef3cb60-96df-4e9b-b097-2878c3ef21fd")
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

    @objid ("6121a4fe-4f95-480f-ba4c-ddba8e8f36fb")
    @Override
    public RequirementContainer getOwnerContainer() {
        return (RequirementContainer) getDepVal(RequirementData.Metadata.OwnerContainerDep());
    }

    @objid ("2b6470cf-adff-47dc-aef2-c192daddf382")
    @Override
    public void setOwnerContainer(RequirementContainer value) {
        appendDepVal(RequirementData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("10751dff-4643-4d7d-8f65-0dd07e045cb5")
    @Override
    public Requirement getParentRequirement() {
        return (Requirement) getDepVal(RequirementData.Metadata.ParentRequirementDep());
    }

    @objid ("52271a33-a29c-4e76-9713-1dde5af7f226")
    @Override
    public void setParentRequirement(Requirement value) {
        appendDepVal(RequirementData.Metadata.ParentRequirementDep(), (SmObjectImpl)value);
    }

    @objid ("c4c73a36-c8b6-4c70-b3e6-229108950d7a")
    @Override
    public EList<Requirement> getArchivedRequirementVersion() {
        return new SmList<>(this, RequirementData.Metadata.ArchivedRequirementVersionDep());
    }

    @objid ("7b65c27f-71d1-409d-8616-1b2f51a80920")
    @Override
    public <T extends Requirement> List<T> getArchivedRequirementVersion(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Requirement element : getArchivedRequirementVersion()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("a7d1b2b4-098b-488e-8ce1-44b8887d902b")
    @Override
    public Requirement getLastRequirementVersion() {
        return (Requirement) getDepVal(RequirementData.Metadata.LastRequirementVersionDep());
    }

    @objid ("f4261d93-b387-477c-9d85-b5a2bf245a22")
    @Override
    public void setLastRequirementVersion(Requirement value) {
        appendDepVal(RequirementData.Metadata.LastRequirementVersionDep(), (SmObjectImpl)value);
    }

    @objid ("53f1eeb0-38f6-4ae2-9010-604d3808d8be")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.ParentRequirementDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.LastRequirementVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("188e25b0-849e-4849-a45e-93145da19983")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(RequirementData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.ParentRequirementDep());
        if (obj != null)
          return new SmDepVal(RequirementData.Metadata.ParentRequirementDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(RequirementData.Metadata.LastRequirementVersionDep());
        if (obj != null)
          return new SmDepVal(RequirementData.Metadata.LastRequirementVersionDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("bfc8fa71-4f29-4148-a630-de979ddb7756")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequirement(this);
        else
          return null;
    }

    @objid ("d11678c4-158c-4606-9ef8-055602d0384b")
    @Override
    public AnalystElement getLastVersion() {
        return getLastRequirementVersion();
    }

    @objid ("e0d0f56f-6b6c-4906-877e-ae083c7e16b7")
    @Override
    public EList<? extends AnalystElement> getArchivedVersions() {
        return getArchivedRequirementVersion();
    }

}
