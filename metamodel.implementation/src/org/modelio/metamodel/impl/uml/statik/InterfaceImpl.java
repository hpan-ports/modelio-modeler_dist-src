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
    @objid ("cd6c0c17-a45f-4f46-85cf-75fd0724b0ef")
    @Override
    public EList<RequiredInterface> getRequiring() {
        return new SmList<>(this, InterfaceData.Metadata.RequiringDep());
    }

    @objid ("c3c7bf3d-3b10-481e-82d2-99ef3ebf9827")
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

    @objid ("1a850342-2d28-4e93-af34-1d2bd366d981")
    @Override
    public EList<InterfaceRealization> getImplementedLink() {
        return new SmList<>(this, InterfaceData.Metadata.ImplementedLinkDep());
    }

    @objid ("91c89d52-2261-43e0-83a0-9cfc3bb80672")
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

    @objid ("40cc6f67-70c1-459e-bfb3-204132ead227")
    @Override
    public EList<ProvidedInterface> getProviding() {
        return new SmList<>(this, InterfaceData.Metadata.ProvidingDep());
    }

    @objid ("f39ef1a8-b3cc-4ce5-a4df-a7561c196205")
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

    @objid ("1fa5a8b2-eb3d-404f-b9d1-cbb5e3b496f9")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("3389b42b-284d-4ad6-9812-ff24ce56983e")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("12582ec5-d8b2-48f2-af20-19f880582870")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitInterface(this);
        else
          return null;
    }

}
