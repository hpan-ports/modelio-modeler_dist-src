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
    @objid ("c905e9f3-6f54-4a83-8d12-1b3e697638a2")
    @Override
    public EList<Interface> getProvidedElement() {
        return new SmList<>(this, ProvidedInterfaceData.Metadata.ProvidedElementDep());
    }

    @objid ("069aa2a7-a9b0-4b27-adca-62d09f84e397")
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

    @objid ("b484f3bd-ea4c-4b9a-8c03-5aac95408ff1")
    @Override
    public Port getProviding() {
        return (Port) getDepVal(ProvidedInterfaceData.Metadata.ProvidingDep());
    }

    @objid ("87be7829-aade-4bcd-8f4e-2f420bc0e8bf")
    @Override
    public void setProviding(Port value) {
        appendDepVal(ProvidedInterfaceData.Metadata.ProvidingDep(), (SmObjectImpl)value);
    }

    @objid ("647f9106-db38-49b1-8d87-320dd03723e0")
    @Override
    public EList<LinkEnd> getConsumer() {
        return new SmList<>(this, ProvidedInterfaceData.Metadata.ConsumerDep());
    }

    @objid ("9589f1ac-c148-4c59-890f-aa0fa3c1f00c")
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

    @objid ("e0468657-4230-4156-adc4-90e7cb8db349")
    @Override
    public EList<NaryLinkEnd> getNaryConsumer() {
        return new SmList<>(this, ProvidedInterfaceData.Metadata.NaryConsumerDep());
    }

    @objid ("289e9892-eb0f-47b7-a8de-b15ba0997d41")
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

    @objid ("66cefaa0-0815-48b6-aeb2-aedcc4947f44")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProvidedInterfaceData.Metadata.ProvidingDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4fde4042-4dbb-461f-aaa9-90c5e6d4f6cd")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProvidedInterfaceData.Metadata.ProvidingDep());
        if (obj != null)
          return new SmDepVal(ProvidedInterfaceData.Metadata.ProvidingDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("05a92fd8-84ab-4997-bb5e-97201656350a")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProvidedInterface(this);
        else
          return null;
    }

}
