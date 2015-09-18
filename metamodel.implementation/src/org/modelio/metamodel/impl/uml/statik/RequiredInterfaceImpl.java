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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.RequiredInterfaceData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
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

@objid ("001b9b4e-c4bf-1fd8-97fe-001ec947cd2a")
public class RequiredInterfaceImpl extends ModelElementImpl implements RequiredInterface {
    @objid ("ff25117b-84d1-4666-8ebc-c9ba82faaed3")
    @Override
    public EList<Interface> getRequiredElement() {
        return new SmList<>(this, RequiredInterfaceData.Metadata.RequiredElementDep());
    }

    @objid ("baee673a-ebaf-4545-a318-29e9f3e91b0c")
    @Override
    public <T extends Interface> List<T> getRequiredElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Interface element : getRequiredElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("040db0c3-3cd2-44dd-9a5b-9564027be0e2")
    @Override
    public EList<LinkEnd> getProvider() {
        return new SmList<>(this, RequiredInterfaceData.Metadata.ProviderDep());
    }

    @objid ("072e2aa7-17fd-4fd4-8946-e7e3729e168e")
    @Override
    public <T extends LinkEnd> List<T> getProvider(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LinkEnd element : getProvider()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("021f3ef1-288d-43b2-81de-429f913b7e85")
    @Override
    public Port getRequiring() {
        return (Port) getDepVal(RequiredInterfaceData.Metadata.RequiringDep());
    }

    @objid ("aa19d47d-14fd-47d6-8fc7-f07e79bd688d")
    @Override
    public void setRequiring(Port value) {
        appendDepVal(RequiredInterfaceData.Metadata.RequiringDep(), (SmObjectImpl)value);
    }

    @objid ("be17b976-2e49-48b3-a98d-e9636eec3621")
    @Override
    public EList<NaryLinkEnd> getNaryProvider() {
        return new SmList<>(this, RequiredInterfaceData.Metadata.NaryProviderDep());
    }

    @objid ("407b7fa3-823b-461e-94b0-c1474ba3c068")
    @Override
    public <T extends NaryLinkEnd> List<T> getNaryProvider(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryLinkEnd element : getNaryProvider()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("bed35291-e77e-4dc9-8d3f-0628b926c9cd")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequiredInterfaceData.Metadata.RequiringDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("9fc689ec-2e7c-477c-85d0-69424a4e7022")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequiredInterfaceData.Metadata.RequiringDep());
        if (obj != null)
          return new SmDepVal(RequiredInterfaceData.Metadata.RequiringDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("112e57e5-9e95-424d-aac9-2c61182369c8")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequiredInterface(this);
        else
          return null;
    }

}
