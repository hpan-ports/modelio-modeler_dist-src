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
import org.modelio.metamodel.impl.uml.statik.ProvidedInterfaceData;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("0019d6a6-c4bf-1fd8-97fe-001ec947cd2a")
public class ProvidedInterfaceImpl extends ModelElementImpl implements ProvidedInterface {
    @objid ("e2a9a15b-8e18-40ab-8da4-d6fa8a700287")
    @Override
    public EList<Interface> getProvidedElement() {
        return new SmList<>(this, ((ProvidedInterfaceSmClass)getClassOf()).getProvidedElementDep());
    }

    @objid ("b5dd0a9e-8cf5-45da-888d-721be115a30d")
    @Override
    public <T extends Interface> List<T> getProvidedElement(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Interface element : getProvidedElement()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f6eca37c-2b94-4584-ac08-7e0fb9e9ca04")
    @Override
    public Port getProviding() {
        Object obj = getDepVal(((ProvidedInterfaceSmClass)getClassOf()).getProvidingDep());
        return (obj instanceof Port)? (Port)obj : null;
    }

    @objid ("9b703e75-5b24-46e9-83dd-247ee6335741")
    @Override
    public void setProviding(Port value) {
        appendDepVal(((ProvidedInterfaceSmClass)getClassOf()).getProvidingDep(), (SmObjectImpl)value);
    }

    @objid ("b65c35a8-1e09-44bd-a3d2-448ae87694c3")
    @Override
    public EList<LinkEnd> getConsumer() {
        return new SmList<>(this, ((ProvidedInterfaceSmClass)getClassOf()).getConsumerDep());
    }

    @objid ("447e17ec-f801-49aa-a8e1-3de83b11f6f9")
    @Override
    public <T extends LinkEnd> List<T> getConsumer(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final LinkEnd element : getConsumer()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("edee6eca-66a2-4f8c-ac66-390c48c1ca39")
    @Override
    public EList<NaryLinkEnd> getNaryConsumer() {
        return new SmList<>(this, ((ProvidedInterfaceSmClass)getClassOf()).getNaryConsumerDep());
    }

    @objid ("9e84aba3-bcb1-46b0-9911-1361598ff13c")
    @Override
    public <T extends NaryLinkEnd> List<T> getNaryConsumer(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final NaryLinkEnd element : getNaryConsumer()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("18460d52-8416-4307-8e2f-f156ac9941da")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        // Providing
        obj = (SmObjectImpl)this.getDepVal(((ProvidedInterfaceSmClass)getClassOf()).getProvidingDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("10e52923-b656-43e6-adf9-dc4e79ff71a6")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        // Providing
        dep = ((ProvidedInterfaceSmClass)getClassOf()).getProvidingDep();
        obj = (SmObjectImpl)this.getDepVal(dep);
        if (obj != null) return new SmDepVal(dep, obj);
        
        return super.getCompositionRelation();
    }

    @objid ("fbc9d891-e829-41ca-b173-ae4b470e173f")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProvidedInterface(this);
        else
          return null;
    }

}
