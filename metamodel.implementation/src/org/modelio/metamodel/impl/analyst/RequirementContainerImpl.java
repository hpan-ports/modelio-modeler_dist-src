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
    @objid ("968c8e79-6a48-49bf-9dba-09e7e6642759")
    @Override
    public EList<Requirement> getOwnedRequirement() {
        return new SmList<>(this, RequirementContainerData.Metadata.OwnedRequirementDep());
    }

    @objid ("8d144db0-2ab8-4e63-938d-1efa1c6ad972")
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

    @objid ("a4dbd561-6c8b-423b-a132-011804b4daf1")
    @Override
    public RequirementContainer getOwnerContainer() {
        return (RequirementContainer) getDepVal(RequirementContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("97a08dcd-d41c-4f7b-9a0f-c8a094a5f3b1")
    @Override
    public void setOwnerContainer(RequirementContainer value) {
        appendDepVal(RequirementContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("5d3f3d1f-587d-4bce-8f4c-5de2906e0691")
    @Override
    public EList<RequirementContainer> getOwnedContainer() {
        return new SmList<>(this, RequirementContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("2fe29bdf-2995-45ef-88b8-e1d48fe35b35")
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

    @objid ("9b8e9626-c06e-4c05-9d07-c53528234284")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(RequirementContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("65f61dfd-eaf9-4048-befa-781bb6dcc2dc")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(RequirementContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("7be71c96-0c0f-4464-bf10-49f3da86640e")
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

    @objid ("60449799-a825-4a4b-90a9-230aa3fcf1c1")
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

    @objid ("850de094-0a67-4f7a-b2d8-a3c006a20719")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequirementContainer(this);
        else
          return null;
    }

}
