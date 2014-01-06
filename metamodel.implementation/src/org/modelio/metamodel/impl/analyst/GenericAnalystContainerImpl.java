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
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GenericAnalystElement;
import org.modelio.metamodel.data.analyst.GenericAnalystContainerData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("2dcbabc7-1ffe-4eae-a040-8300156dfdc3")
public class GenericAnalystContainerImpl extends AnalystContainerImpl implements GenericAnalystContainer {
    @objid ("5c4c6ee5-97d4-4a6c-95e2-13203a52bbcf")
    @Override
    public EList<GenericAnalystElement> getOwnedElement() {
        return new SmList<>(this, GenericAnalystContainerData.Metadata.OwnedElementDep());
    }

    @objid ("86caac10-4f1f-4b3a-b0e3-4db00aca0bba")
    @Override
    public <T extends GenericAnalystElement> List<T> getOwnedElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GenericAnalystElement element : getOwnedElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("66158350-5314-4d4e-8b55-8aa26fe5fd96")
    @Override
    public GenericAnalystContainer getOwnerContainer() {
        return (GenericAnalystContainer) getDepVal(GenericAnalystContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("0d6ba3af-e8eb-4a17-942d-93589d02f8e3")
    @Override
    public void setOwnerContainer(GenericAnalystContainer value) {
        appendDepVal(GenericAnalystContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("ae36fc5b-342a-4e71-8c81-e9c3874c0dae")
    @Override
    public EList<GenericAnalystContainer> getOwnedContainer() {
        return new SmList<>(this, GenericAnalystContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("79e1b988-bf8f-4aeb-9cd4-fbe3e02c1cfa")
    @Override
    public <T extends GenericAnalystContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final GenericAnalystContainer element : getOwnedContainer()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("857469ff-a546-4f37-a696-baa1df071902")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(GenericAnalystContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("b7d7fcfd-ab2c-4641-8da7-dafe9bc2f4a2")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(GenericAnalystContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("591e46c5-6861-4dd4-978d-a05f519e346b")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return obj;
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e1a6fadb-57a2-4b37-8f36-1eef3dd8ea45")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystContainerData.Metadata.OwnerContainerDep());
        if (obj != null)
          return new SmDepVal(GenericAnalystContainerData.Metadata.OwnerContainerDep(), obj);
        obj = (SmObjectImpl)this.getDepVal(GenericAnalystContainerData.Metadata.OwnerProjectDep());
        if (obj != null)
          return new SmDepVal(GenericAnalystContainerData.Metadata.OwnerProjectDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("8773bfec-0c2c-417e-8446-1d4db518d0c4")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGenericAnalystContainer(this);
        else
          return null;
    }

}
