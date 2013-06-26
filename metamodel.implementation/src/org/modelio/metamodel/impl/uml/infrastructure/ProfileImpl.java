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
    @objid ("06c9c20f-f60a-45a0-b379-41447166e357")
    @Override
    public String getJCode() {
        return (String) getAttVal(ProfileData.Metadata.JCodeAtt());
    }

    @objid ("c25497a3-8b01-4be7-a0f6-2513359d472a")
    @Override
    public void setJCode(String value) {
        setAttVal(ProfileData.Metadata.JCodeAtt(), value);
    }

    @objid ("95754c15-ba71-4b9a-be97-000e10c4a7b2")
    @Override
    public EList<Stereotype> getDefinedStereotype() {
        return new SmList<>(this, ProfileData.Metadata.DefinedStereotypeDep());
    }

    @objid ("20141590-1046-4896-ba48-d8e812c65747")
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

    @objid ("5c0ebc8f-34b5-4d36-8b01-280d51cde6d2")
    @Override
    public ModuleComponent getOwnerModule() {
        return (ModuleComponent) getDepVal(ProfileData.Metadata.OwnerModuleDep());
    }

    @objid ("f89cc7b2-49a2-4801-8574-7244d8c620d2")
    @Override
    public void setOwnerModule(ModuleComponent value) {
        appendDepVal(ProfileData.Metadata.OwnerModuleDep(), (SmObjectImpl)value);
    }

    @objid ("d46de187-0668-440e-afd6-0f97af48f88d")
    @Override
    public EList<MetaclassReference> getOwnedReference() {
        return new SmList<>(this, ProfileData.Metadata.OwnedReferenceDep());
    }

    @objid ("aa8589f7-8bb5-406a-acf1-bc8e3bb1a272")
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

    @objid ("01d8cc73-d868-4e5a-a67d-c12fd44bf1e4")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProfileData.Metadata.OwnerModuleDep());
        if (obj != null)
          return obj;
        return super.getCompositionOwner();
    }

    @objid ("d2316bf9-56d1-4176-9f97-723f67f579b9")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        obj = (SmObjectImpl)this.getDepVal(ProfileData.Metadata.OwnerModuleDep());
        if (obj != null)
          return new SmDepVal(ProfileData.Metadata.OwnerModuleDep(), obj);
        return super.getCompositionRelation();
    }

    @objid ("5f807c12-5da0-492b-972f-5feda46e1d89")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitProfile(this);
        else
          return null;
    }

}
