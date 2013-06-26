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
import org.modelio.metamodel.data.uml.statik.InterfaceData;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("000e545c-c4bf-1fd8-97fe-001ec947cd2a")
public class InterfaceImpl extends GeneralClassImpl implements Interface {
    @objid ("94baef55-dc1d-4c20-80e2-4498e959b97c")
    @Override
    public EList<RequiredInterface> getRequiring() {
        return new SmList<>(this, InterfaceData.Metadata.RequiringDep());
    }

    @objid ("e2963d79-b63f-4d4f-84be-5462348dd57a")
    @Override
    public <T extends RequiredInterface> List<T> getRequiring(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final RequiredInterface element : getRequiring()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c705ee86-c1b8-4951-b4c6-4c02c52c0a50")
    @Override
    public EList<InterfaceRealization> getImplementedLink() {
        return new SmList<>(this, InterfaceData.Metadata.ImplementedLinkDep());
    }

    @objid ("5eb0cf62-3fce-477a-bdf9-448c0d292e45")
    @Override
    public <T extends InterfaceRealization> List<T> getImplementedLink(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final InterfaceRealization element : getImplementedLink()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("c1580adf-24c0-47a9-b73b-9bf45c8f9a82")
    @Override
    public EList<ProvidedInterface> getProviding() {
        return new SmList<>(this, InterfaceData.Metadata.ProvidingDep());
    }

    @objid ("14aa8714-48d6-4bee-84d8-62f9f45fb762")
    @Override
    public <T extends ProvidedInterface> List<T> getProviding(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ProvidedInterface element : getProviding()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("af61a9b3-28af-430b-9b19-f86e0fe12fea")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3924a063-5a2d-42ce-a138-fd352c7e60db")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("08abdf14-0b5d-4217-8861-bd847bdf7e84")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInterface(this);
        else
          return null;
    }

}
