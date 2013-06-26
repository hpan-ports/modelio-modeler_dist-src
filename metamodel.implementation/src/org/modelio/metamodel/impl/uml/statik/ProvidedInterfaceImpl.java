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
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.statik.ProvidedInterfaceData;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementImpl;
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

@objid ("0019d6a6-c4bf-1fd8-97fe-001ec947cd2a")
public class ProvidedInterfaceImpl extends ModelElementImpl implements ProvidedInterface {
    @objid ("c2ef0015-5384-4bab-8159-b38588e8a8ee")
    @Override
    public EList<Interface> getProvidedElement() {
        return new SmList<>(this, ProvidedInterfaceData.Metadata.ProvidedElementDep());
    }

    @objid ("6b831198-e018-4e48-bcda-3babbc09b479")
    @Override
    public <T extends Interface> List<T> getProvidedElement(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Interface element : getProvidedElement()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("9fcb6caa-37ff-4a10-89c4-11c23353b3df")
    @Override
    public Port getProviding() {
        return (Port) getDepVal(ProvidedInterfaceData.Metadata.ProvidingDep());
    }

    @objid ("a17529c6-2f00-4450-a583-8943d5df6668")
    @Override
    public void setProviding(Port value) {
        appendDepVal(ProvidedInterfaceData.Metadata.ProvidingDep(), (SmObjectImpl)value);
    }

    @objid ("41a15cc4-1c0d-4856-ae6b-48ce79645b10")
    @Override
    public EList<LinkEnd> getConsumer() {
        return new SmList<>(this, ProvidedInterfaceData.Metadata.ConsumerDep());
    }

    @objid ("8eb2f354-4295-441a-a244-9fcb04f8c7bf")
    @Override
    public <T extends LinkEnd> List<T> getConsumer(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final LinkEnd element : getConsumer()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e68ebf65-c6cc-4ed6-a527-de477f717f18")
    @Override
    public EList<NaryLinkEnd> getNaryConsumer() {
        return new SmList<>(this, ProvidedInterfaceData.Metadata.NaryConsumerDep());
    }

    @objid ("34d38964-afed-43ef-9a48-46dc04ffb3e0")
    @Override
    public <T extends NaryLinkEnd> List<T> getNaryConsumer(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final NaryLinkEnd element : getNaryConsumer()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("55197264-6353-487b-91d7-7a2c31c33030")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProvidedInterfaceData.Metadata.ProvidingDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("3032f6d6-34de-4104-9a13-c5bdc25a87f0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProvidedInterfaceData.Metadata.ProvidingDep());
        if (obj != null)
          return new SmDepVal(ProvidedInterfaceData.Metadata.ProvidingDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b630cd2a-12f7-4d99-bd42-bf0f40809146")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProvidedInterface(this);
        else
          return null;
    }

}
