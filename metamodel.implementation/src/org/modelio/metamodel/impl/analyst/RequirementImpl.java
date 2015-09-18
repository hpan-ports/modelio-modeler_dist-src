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

    @objid ("fb9238d2-d406-4701-a461-cba539d55727")
    @Override
    public EList<Requirement> getSubRequirement() {
        return new SmList<>(this, RequirementData.Metadata.SubRequirementDep());
    }

    @objid ("5bcfa8c3-aeb3-48c0-a680-e284fa28edbe")
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

    @objid ("a4d04d7b-9b96-48a3-8941-70d19cbfba2c")
    @Override
    public RequirementContainer getOwnerContainer() {
        return (RequirementContainer) getDepVal(RequirementData.Metadata.OwnerContainerDep());
    }

    @objid ("b3f44cdf-93bd-4b98-a8bc-1d296b82e95d")
    @Override
    public void setOwnerContainer(RequirementContainer value) {
        appendDepVal(RequirementData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("b34e22f1-8711-4570-8780-90f4484d68d6")
    @Override
    public Requirement getParentRequirement() {
        return (Requirement) getDepVal(RequirementData.Metadata.ParentRequirementDep());
    }

    @objid ("5e17da95-abc2-43fb-bbd0-80f9b823ab91")
    @Override
    public void setParentRequirement(Requirement value) {
        appendDepVal(RequirementData.Metadata.ParentRequirementDep(), (SmObjectImpl)value);
    }

    @objid ("2c982634-0c36-4039-9c27-9741b7acb982")
    @Override
    public EList<Requirement> getArchivedRequirementVersion() {
        return new SmList<>(this, RequirementData.Metadata.ArchivedRequirementVersionDep());
    }

    @objid ("b6e86aa0-0a03-4ce3-872f-fadcaae4c79e")
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

    @objid ("6385981f-9712-4b88-a635-207041fc2b70")
    @Override
    public Requirement getLastRequirementVersion() {
        return (Requirement) getDepVal(RequirementData.Metadata.LastRequirementVersionDep());
    }

    @objid ("38859d58-91a9-4309-9444-d88ad9a32bb2")
    @Override
    public void setLastRequirementVersion(Requirement value) {
        appendDepVal(RequirementData.Metadata.LastRequirementVersionDep(), (SmObjectImpl)value);
    }

    @objid ("3115d0eb-db43-46c3-adc8-ce55a20774ef")
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

    @objid ("d6574677-16a0-41e6-8901-f43d3be0d072")
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

    @objid ("e9ca3a21-3d1b-4e41-a142-83f5caaa3f09")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequirement(this);
        else
          return null;
    }

}
