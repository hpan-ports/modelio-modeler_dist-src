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
    @objid ("c0daeda1-10e2-472a-b6b4-78a76f1536f0")
    @Override
    public EList<Interface> getProvidedElement() {
        return new SmList<>(this, ProvidedInterfaceData.Metadata.ProvidedElementDep());
    }

    @objid ("7495e3bd-d712-4d14-a44b-4ab025274de0")
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

    @objid ("7713afe6-d3b7-46d1-bb74-823b0db3a5a0")
    @Override
    public Port getProviding() {
        return (Port) getDepVal(ProvidedInterfaceData.Metadata.ProvidingDep());
    }

    @objid ("0cf05409-1ac0-422f-bc75-b1b5184cdea5")
    @Override
    public void setProviding(Port value) {
        appendDepVal(ProvidedInterfaceData.Metadata.ProvidingDep(), (SmObjectImpl)value);
    }

    @objid ("058b6a60-9b21-4b86-bc76-a2b453469d69")
    @Override
    public EList<LinkEnd> getConsumer() {
        return new SmList<>(this, ProvidedInterfaceData.Metadata.ConsumerDep());
    }

    @objid ("af5656c7-d786-4255-bf01-c1323a71d61c")
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

    @objid ("0f863390-4464-42b7-9d7f-67640bc7513f")
    @Override
    public EList<NaryLinkEnd> getNaryConsumer() {
        return new SmList<>(this, ProvidedInterfaceData.Metadata.NaryConsumerDep());
    }

    @objid ("da44e6af-ec14-4cd2-b874-387bfe6b79db")
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

    @objid ("f363aeff-994f-43a6-9de0-bfa5040f1e76")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProvidedInterfaceData.Metadata.ProvidingDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("36610f21-f5f9-46b5-b44b-161cf15874a9")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProvidedInterfaceData.Metadata.ProvidingDep());
        if (obj != null)
          return new SmDepVal(ProvidedInterfaceData.Metadata.ProvidingDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("d7e7a227-d2c8-46a8-b605-88c4fa089b14")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProvidedInterface(this);
        else
          return null;
    }

}
