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
    @objid ("b5307b8e-7831-455c-a00c-daee728e4418")
    @Override
    public EList<GenericAnalystElement> getOwnedElement() {
        return new SmList<>(this, GenericAnalystContainerData.Metadata.OwnedElementDep());
    }

    @objid ("a98af9fd-58fa-4e69-8d8c-fb70228a8e73")
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

    @objid ("44f7e7a2-19f1-4a7c-bfeb-37b74a219d6e")
    @Override
    public GenericAnalystContainer getOwnerContainer() {
        return (GenericAnalystContainer) getDepVal(GenericAnalystContainerData.Metadata.OwnerContainerDep());
    }

    @objid ("4a6d07e0-3f66-47e8-b078-cae21165ba1a")
    @Override
    public void setOwnerContainer(GenericAnalystContainer value) {
        appendDepVal(GenericAnalystContainerData.Metadata.OwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("4ad89364-e687-46dd-9086-35ff8636976c")
    @Override
    public EList<GenericAnalystContainer> getOwnedContainer() {
        return new SmList<>(this, GenericAnalystContainerData.Metadata.OwnedContainerDep());
    }

    @objid ("ea7af386-40e2-422f-9bd4-4e6e55857728")
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

    @objid ("09a25128-3682-4b21-947b-abcef7660af4")
    @Override
    public AnalystProject getOwnerProject() {
        return (AnalystProject) getDepVal(GenericAnalystContainerData.Metadata.OwnerProjectDep());
    }

    @objid ("8efd8849-b573-431d-9e4f-0e33b29980f9")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(GenericAnalystContainerData.Metadata.OwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("bda845c6-f51b-45c0-98f1-458a1fc98b12")
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

    @objid ("64de3491-0000-4ccd-840e-63646915219f")
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

    @objid ("75832a6c-79c1-4e25-ae71-aa04a63c5a7a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGenericAnalystContainer(this);
        else
          return null;
    }

}
