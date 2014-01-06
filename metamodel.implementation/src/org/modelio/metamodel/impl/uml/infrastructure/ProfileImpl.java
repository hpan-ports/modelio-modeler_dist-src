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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.uml.infrastructure.ProfileData;
import org.modelio.metamodel.impl.uml.statik.PackageImpl;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("008caa50-c4be-1fd8-97fe-001ec947cd2a")
public class ProfileImpl extends PackageImpl implements Profile {
    @objid ("147b29ae-a81e-4620-a20e-c6cfca174741")
    @Override
    public String getJCode() {
        return (String) getAttVal(ProfileData.Metadata.JCodeAtt());
    }

    @objid ("507dbac0-ac68-4cdd-a9ff-3179693e6363")
    @Override
    public void setJCode(String value) {
        setAttVal(ProfileData.Metadata.JCodeAtt(), value);
    }

    @objid ("1e5d1f0c-d565-4034-92cd-ffe31e0d639b")
    @Override
    public EList<Stereotype> getDefinedStereotype() {
        return new SmList<>(this, ProfileData.Metadata.DefinedStereotypeDep());
    }

    @objid ("03ccc3c1-ad66-402c-a285-a5f57fc4b88b")
    @Override
    public <T extends Stereotype> List<T> getDefinedStereotype(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Stereotype element : getDefinedStereotype()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("e7c5931e-e112-40fc-8908-ff8b75e7bbeb")
    @Override
    public ModuleComponent getOwnerModule() {
        return (ModuleComponent) getDepVal(ProfileData.Metadata.OwnerModuleDep());
    }

    @objid ("3792ae94-eef1-488f-b866-ef307a64b99d")
    @Override
    public void setOwnerModule(ModuleComponent value) {
        appendDepVal(ProfileData.Metadata.OwnerModuleDep(), (SmObjectImpl)value);
    }

    @objid ("5c033521-ae56-4089-b0fc-15a95d9518b8")
    @Override
    public EList<MetaclassReference> getOwnedReference() {
        return new SmList<>(this, ProfileData.Metadata.OwnedReferenceDep());
    }

    @objid ("f2c08bac-9d60-4d91-9297-0692fc6d14e7")
    @Override
    public <T extends MetaclassReference> List<T> getOwnedReference(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final MetaclassReference element : getOwnedReference()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f4ea58e6-e65f-441c-b53b-e0708d05fd50")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProfileData.Metadata.OwnerModuleDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("4b4e0ccc-7dbb-41fe-a055-96acc1443d01")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProfileData.Metadata.OwnerModuleDep());
        if (obj != null)
          return new SmDepVal(ProfileData.Metadata.OwnerModuleDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("0094e170-923b-4459-8ffa-63620e2221fd")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProfile(this);
        else
          return null;
    }

}
