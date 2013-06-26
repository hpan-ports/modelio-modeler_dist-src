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
    @objid ("defb8ec7-9f12-4b2e-a28e-3d66cd03acc4")
    @Override
    public EList<Interface> getRequiredElement() {
        return new SmList<>(this, RequiredInterfaceData.Metadata.RequiredElementDep());
    }

    @objid ("e47d1f0c-c341-4f44-829b-344f13448bd3")
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

    @objid ("ae5b8b63-53d0-46f3-9af1-ed61e25d8911")
    @Override
    public EList<LinkEnd> getProvider() {
        return new SmList<>(this, RequiredInterfaceData.Metadata.ProviderDep());
    }

    @objid ("8ef002d7-ae77-419d-93cc-0db58d5b4995")
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

    @objid ("0a698c23-d145-422e-a84b-710d8a8354c6")
    @Override
    public Port getRequiring() {
        return (Port) getDepVal(RequiredInterfaceData.Metadata.RequiringDep());
    }

    @objid ("41925e54-7276-4bcb-b3bb-644c3019e7d4")
    @Override
    public void setRequiring(Port value) {
        appendDepVal(RequiredInterfaceData.Metadata.RequiringDep(), (SmObjectImpl)value);
    }

    @objid ("e5959200-0307-4b29-aca0-db54647ef766")
    @Override
    public EList<NaryLinkEnd> getNaryProvider() {
        return new SmList<>(this, RequiredInterfaceData.Metadata.NaryProviderDep());
    }

    @objid ("64cbaef7-bb90-4879-94b8-10997b87ee28")
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

    @objid ("db2a986a-68d5-4ab9-b765-5e55da4d4912")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequiredInterfaceData.Metadata.RequiringDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("69953c4f-c0c0-4b40-a5a8-83a58687d6f6")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequiredInterfaceData.Metadata.RequiringDep());
        if (obj != null)
          return new SmDepVal(RequiredInterfaceData.Metadata.RequiringDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("036ba459-d5fd-44f3-a271-1392f37ac648")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequiredInterface(this);
        else
          return null;
    }

}
