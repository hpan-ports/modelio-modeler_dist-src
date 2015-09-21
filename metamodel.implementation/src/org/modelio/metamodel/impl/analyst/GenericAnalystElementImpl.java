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
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GenericAnalystElement;
import org.modelio.metamodel.impl.analyst.GenericAnalystElementData;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("72a02698-fa7a-4f9d-af4c-5e7338f0ba44")
public class GenericAnalystElementImpl extends AnalystElementImpl implements GenericAnalystElement {
    @objid ("d233d1f6-7195-4412-ad3e-d9943a5acefb")
    @Override
    public EList<? extends AnalystElement> getArchivedVersions() {
        return getArchivedElementVersion();
    }

    @objid ("5b2c6227-f20f-4231-9d1e-d63fa8394ee4")
    @Override
    public AnalystElement getLastVersion() {
        return getLastElementVersion();
    }

    @objid ("8c1acf98-a76e-4846-8f64-6f1018a1d4c3")
    @Override
    public EList<GenericAnalystElement> getSubElement() {
        return new SmList<>(this, ((GenericAnalystElementSmClass)getClassOf()).getSubElementDep());
    }

    @objid ("f6b9aad7-a416-406a-b977-0695ec3ca8b2")
    @Override
    public <T extends GenericAnalystElement> List<T> getSubElement(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final GenericAnalystElement element : getSubElement()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c1586a2c-ef68-45e5-a2e3-bc61ca904710")
    @Override
    public GenericAnalystContainer getOwnerContainer() {
        Object obj = getDepVal(((GenericAnalystElementSmClass)getClassOf()).getOwnerContainerDep());
        return (obj instanceof GenericAnalystContainer)? (GenericAnalystContainer)obj : null;
    }

    @objid ("e72f0d39-9c1d-4a86-bf86-a40944093ad3")
    @Override
    public void setOwnerContainer(GenericAnalystContainer value) {
        appendDepVal(((GenericAnalystElementSmClass)getClassOf()).getOwnerContainerDep(), (SmObjectImpl)value);
    }

    @objid ("3af07d24-12e5-4f2c-8c7e-fc70be6b9bd1")
    @Override
    public GenericAnalystElement getParentElement() {
        Object obj = getDepVal(((GenericAnalystElementSmClass)getClassOf()).getParentElementDep());
        return (obj instanceof GenericAnalystElement)? (GenericAnalystElement)obj : null;
    }

    @objid ("765de7eb-e140-4b27-b8d7-695343e25284")
    @Override
    public void setParentElement(GenericAnalystElement value) {
        appendDepVal(((GenericAnalystElementSmClass)getClassOf()).getParentElementDep(), (SmObjectImpl)value);
    }

    @objid ("8c89067c-73d5-4531-83e9-5dc33a912720")
    @Override
    public GenericAnalystElement getLastElementVersion() {
        Object obj = getDepVal(((GenericAnalystElementSmClass)getClassOf()).getLastElementVersionDep());
        return (obj instanceof GenericAnalystElement)? (GenericAnalystElement)obj : null;
    }

    @objid ("af600d98-e68d-4f25-a1e3-05d84142071c")
    @Override
    public void setLastElementVersion(GenericAnalystElement value) {
        appendDepVal(((GenericAnalystElementSmClass)getClassOf()).getLastElementVersionDep(), (SmObjectImpl)value);
    }

    @objid ("7452e5a9-b126-4a74-bb6c-ea0d665411a3")
    @Override
    public EList<GenericAnalystElement> getArchivedElementVersion() {
        return new SmList<>(this, ((GenericAnalystElementSmClass)getClassOf()).getArchivedElementVersionDep());
    }

    @objid ("00420a7d-a73c-42f8-a2be-dfd41427338e")
    @Override
    public <T extends GenericAnalystElement> List<T> getArchivedElementVersion(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final GenericAnalystElement element : getArchivedElementVersion()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4739fb23-959b-46c3-b217-c1f8558107b9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // OwnerContainer
        obj = (SmObjectImpl)this.getDepVal(((GenericAnalystElementSmClass)getClassOf()).getOwnerContainerDep());
        if (obj != null)
          return obj;
        // ParentElement
        obj = (SmObjectImpl)this.getDepVal(((GenericAnalystElementSmClass)getClassOf()).getParentElementDep());
        if (obj != null)
          return obj;
        // LastElementVersion
        obj = (SmObjectImpl)this.getDepVal(((GenericAnalystElementSmClass)getClassOf()).getLastElementVersionDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("152a9c1f-5ef6-4016-a248-dc85f0c3918d")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // OwnerContainer
        dep = ((GenericAnalystElementSmClass)getClassOf()).getOwnerContainerDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // ParentElement
        dep = ((GenericAnalystElementSmClass)getClassOf()).getParentElementDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        // LastElementVersion
        dep = ((GenericAnalystElementSmClass)getClassOf()).getLastElementVersionDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("ac6a01d8-492f-4df8-b56d-fc4f7995fbb1")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitGenericAnalystElement(this);
        else
          return null;
    }

}
