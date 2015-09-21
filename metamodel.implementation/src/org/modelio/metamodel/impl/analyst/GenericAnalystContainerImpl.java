/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.analyst;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GenericAnalystElement;
import org.modelio.metamodel.impl.analyst.GenericAnalystContainerData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("2dcbabc7-1ffe-4eae-a040-8300156dfdc3")
public class GenericAnalystContainerImpl extends AnalystContainerImpl implements GenericAnalystContainer {
    @objid ("fb9304db-aa55-4e8a-be5a-a32ac7743271")
    @Override
    public EList<GenericAnalystElement> getOwnedElement() {
        return new SmList<>(this, ((GenericAnalystContainerSmClass)getClassOf()).getOwnedElementDep());
    }

    @objid ("087e642c-6e10-4ff5-bcdd-abec6252f372")
    @Override
    public <T extends GenericAnalystElement> List<T> getOwnedElement(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final GenericAnalystElement element : getOwnedElement()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("56cc19cd-760d-4562-8d12-0d3f61c30282")
    @Override
    public GenericAnalystContainer getOwnerContainer() {
        Object obj = getDepVal(((GenericAnalystContainerSmClass)getClassOf()).getOwnerContainerDep());
        return (obj instanceof GenericAnalystContainer)? (GenericAnalystContainer)obj : null;
    }

    @objid ("00ef1836-cc33-44a2-ad69-8335c0a3a8f0")
    @Override
    public void setOwnerContainer(GenericAnalystContainer value) {
        appendDepVal(((GenericAnalystContainerSmClass)getClassOf()).getOwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("088fbb7e-79fd-4238-ae0c-05522cf10c4c")
    @Override
    public EList<GenericAnalystContainer> getOwnedContainer() {
        return new SmList<>(this, ((GenericAnalystContainerSmClass)getClassOf()).getOwnedContainerDep());
    }

    @objid ("5314d3e0-2844-4868-a7df-7f73e7e648fb")
    @Override
    public <T extends GenericAnalystContainer> List<T> getOwnedContainer(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final GenericAnalystContainer element : getOwnedContainer()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f2706a7a-815c-454a-b6ce-e64f615f587c")
    @Override
    public AnalystProject getOwnerProject() {
        Object obj = getDepVal(((GenericAnalystContainerSmClass)getClassOf()).getOwnerProjectDep());
        return (obj instanceof AnalystProject)? (AnalystProject)obj : null;
    }

    @objid ("ff592cb6-ffe6-4055-92e4-b0ade7d18007")
    @Override
    public void setOwnerProject(AnalystProject value) {
        appendDepVal(((GenericAnalystContainerSmClass)getClassOf()).getOwnerProjectDep(), (SmObjectImpl)value);
    }

    @objid ("61bac717-c4c4-40cd-a617-116cf8e72b9e")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerContainer
        obj = (SmObjectImpl)this.getDepVal(((GenericAnalystContainerSmClass)getClassOf()).getOwnerContainerDep());
        if (obj != null)
          return obj;
        // OwnerProject
        obj = (SmObjectImpl)this.getDepVal(((GenericAnalystContainerSmClass)getClassOf()).getOwnerProjectDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e846c14a-5574-440d-af15-d36a700506f3")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerContainer
        dep = ((GenericAnalystContainerSmClass)getClassOf()).getOwnerContainerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // OwnerProject
        dep = ((GenericAnalystContainerSmClass)getClassOf()).getOwnerProjectDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("c1cf1238-83ff-470b-b25a-afb6a37e3ceb")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGenericAnalystContainer(this);
        else
          return null;
    }

}
