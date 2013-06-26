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
    @objid ("f7f0f86d-a57e-4b1e-a961-4fd8b927e017")
    @Override
    public EList<Requirement> getOwnedRequirement() {
        return new SmList<>(this, RequirementContainerData.Metadata.OwnedRequirementDep());
    }

    @objid ("8ba90a70-cde9-4be1-8fdb-0ed3facbd333")
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

    @objid ("f29d41f8-a7a8-4451-bb74-aca4128a18e0")
    @Override
    public RequirementContainer getOwnerContainer() {
        return (RequirementContainer) getDepVal(RequirementContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("f7eaef7a-d969-4efd-9382-b60cf4d5762e")
    @Override
    public void setOwnerContainer(RequirementContainer value) {
        appendDepVal(RequirementContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("baf72ed9-e0cb-4e8b-a649-65954778176f")
    @Override
    public EList<RequirementContainer> getOwnedContainer() {
        return new SmList<>(this, RequirementContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("37559f22-96c0-45e8-8103-0239aebfc2b9")
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

    @objid ("9555cf0d-4c21-4d98-9802-1f2874d8eff5")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(RequirementContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("f085ed90-904c-470d-8191-d6081532978d")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(RequirementContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("32c544d4-e6bb-4417-a02f-f4e125eba1b4")
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

    @objid ("35974c62-ec8a-41f1-a8e2-a97ed7bbcf69")
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

    @objid ("0d5609a1-7724-4984-aa9d-48a1bcb7562a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequirementContainer(this);
        else
          return null;
    }

}
