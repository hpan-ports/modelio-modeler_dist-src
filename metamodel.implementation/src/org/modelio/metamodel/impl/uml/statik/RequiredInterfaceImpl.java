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
    @objid ("dd6ef3b4-b01e-4408-9bba-059c16b75e93")
    @Override
    public EList<Interface> getRequiredElement() {
        return new SmList<>(this, RequiredInterfaceData.Metadata.RequiredElementDep());
    }

    @objid ("8afc794e-ce98-4948-9cdd-88489324b3ef")
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

    @objid ("4c16a510-75b4-450c-b156-51cb52bd0a3c")
    @Override
    public EList<LinkEnd> getProvider() {
        return new SmList<>(this, RequiredInterfaceData.Metadata.ProviderDep());
    }

    @objid ("51c7c58a-0ff9-4536-851c-5e45bc2c127b")
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

    @objid ("e7112e67-f9f7-4260-a819-b441f4d7987b")
    @Override
    public Port getRequiring() {
        return (Port) getDepVal(RequiredInterfaceData.Metadata.RequiringDep());
    }

    @objid ("67a2c989-a8b0-4714-b0ad-b6d8fc57f9a3")
    @Override
    public void setRequiring(Port value) {
        appendDepVal(RequiredInterfaceData.Metadata.RequiringDep(), (SmObjectImpl)value);
    }

    @objid ("f0ed3398-8b9b-4aaf-beb2-f2abe6f95f6a")
    @Override
    public EList<NaryLinkEnd> getNaryProvider() {
        return new SmList<>(this, RequiredInterfaceData.Metadata.NaryProviderDep());
    }

    @objid ("4ff7012b-077c-454b-963a-7250e99623a7")
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

    @objid ("b9470512-b2e2-4edf-878c-e85c940f368f")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequiredInterfaceData.Metadata.RequiringDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("e463d64f-c18e-4beb-8cdf-40bcd42051a3")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(RequiredInterfaceData.Metadata.RequiringDep());
        if (obj != null)
          return new SmDepVal(RequiredInterfaceData.Metadata.RequiringDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("c670cbe2-23a6-4e75-a1ab-c7edb1d7628c")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitRequiredInterface(this);
        else
          return null;
    }

}
