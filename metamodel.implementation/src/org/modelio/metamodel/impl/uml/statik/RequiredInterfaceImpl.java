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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
import org.modelio.metamodel.impl.uml.statik.RequiredInterfaceData;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.RequiredInterface;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("001b9b4e-c4bf-1fd8-97fe-001ec947cd2a")
public class RequiredInterfaceImpl extends ModelElementImpl implements RequiredInterface {
    @objid ("3cfbbd63-e3a3-4d33-9965-6d0e34ea0276")
    @Override
    public EList<Interface> getRequiredElement() {
        return new SmList<>(this, ((RequiredInterfaceSmClass)getClassOf()).getRequiredElementDep());
    }

    @objid ("7fcf2b05-5af9-44be-98d2-c550b79dd1c9")
    @Override
    public <T extends Interface> List<T> getRequiredElement(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Interface element : getRequiredElement()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("0a829fab-e354-4d4d-bea5-fff93c51c476")
    @Override
    public EList<LinkEnd> getProvider() {
        return new SmList<>(this, ((RequiredInterfaceSmClass)getClassOf()).getProviderDep());
    }

    @objid ("4415efc9-6276-46ae-a6d9-c6739fbe2147")
    @Override
    public <T extends LinkEnd> List<T> getProvider(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final LinkEnd element : getProvider()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("46adb391-aad7-45ae-aec0-f2a1b2367eac")
    @Override
    public Port getRequiring() {
        Object obj = getDepVal(((RequiredInterfaceSmClass)getClassOf()).getRequiringDep());
        return (obj instanceof Port)? (Port)obj : null;
    }

    @objid ("fa88412b-60f8-4027-88fa-e694f0e7a079")
    @Override
    public void setRequiring(Port value) {
        appendDepVal(((RequiredInterfaceSmClass)getClassOf()).getRequiringDep(), (SmObjectImpl)value);
    }

    @objid ("57560f2d-6087-4f7f-8efb-56f1b5008a79")
    @Override
    public EList<NaryLinkEnd> getNaryProvider() {
        return new SmList<>(this, ((RequiredInterfaceSmClass)getClassOf()).getNaryProviderDep());
    }

    @objid ("cf1d981d-8071-46ea-b00c-4905deb739fa")
    @Override
    public <T extends NaryLinkEnd> List<T> getNaryProvider(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final NaryLinkEnd element : getNaryProvider()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("98de18b1-91ad-48b5-8c31-3dddd2dcaabb")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Requiring
        obj = (SmObjectImpl)this.getDepVal(((RequiredInterfaceSmClass)getClassOf()).getRequiringDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d1793cad-1d90-4358-8424-92fe733f687c")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Requiring
        dep = ((RequiredInterfaceSmClass)getClassOf()).getRequiringDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("a3d1237d-38ba-4e2d-9e01-8f30c321ba97")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequiredInterface(this);
        else
          return null;
    }

}
