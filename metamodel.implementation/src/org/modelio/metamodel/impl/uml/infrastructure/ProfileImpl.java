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
    @objid ("8f7deb8f-f951-4d3d-bc99-4222d8a86ccd")
    @Override
    public String getJCode() {
        return (String) getAttVal(ProfileData.Metadata.JCodeAtt());
    }

    @objid ("d22f47d1-c46d-4d19-b4bb-8c24b20e7e0a")
    @Override
    public void setJCode(String value) {
        setAttVal(ProfileData.Metadata.JCodeAtt(), value);
    }

    @objid ("383c81ac-fcf0-41a1-8041-d15f29d7611b")
    @Override
    public EList<Stereotype> getDefinedStereotype() {
        return new SmList<>(this, ProfileData.Metadata.DefinedStereotypeDep());
    }

    @objid ("719566c2-0900-4480-ae10-499dc15bf8e5")
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

    @objid ("b94abba8-d2bf-4b7e-b1bf-961fc43f3215")
    @Override
    public ModuleComponent getOwnerModule() {
        return (ModuleComponent) getDepVal(ProfileData.Metadata.OwnerModuleDep());
    }

    @objid ("2b4a478d-38ae-4a82-9376-f7954996c222")
    @Override
    public void setOwnerModule(ModuleComponent value) {
        appendDepVal(ProfileData.Metadata.OwnerModuleDep(), (SmObjectImpl)value);
    }

    @objid ("ba67ebd3-faa8-4e64-a885-8a74334854d5")
    @Override
    public EList<MetaclassReference> getOwnedReference() {
        return new SmList<>(this, ProfileData.Metadata.OwnedReferenceDep());
    }

    @objid ("04d00cdc-c7b5-4baf-8865-90fdaeb4bca8")
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

    @objid ("b177656a-0276-42d1-b9bc-fbe4edd00089")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProfileData.Metadata.OwnerModuleDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("5ce01972-fac6-474d-bbf3-7dc8daa4069b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProfileData.Metadata.OwnerModuleDep());
        if (obj != null)
          return new SmDepVal(ProfileData.Metadata.OwnerModuleDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("b9c7f4de-35c0-4109-9e57-9220263840f2")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProfile(this);
        else
          return null;
    }

}
