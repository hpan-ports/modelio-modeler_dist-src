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
package org.modelio.metamodel.impl.mda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.data.mda.ModuleComponentData;
import org.modelio.metamodel.impl.uml.statik.ComponentImpl;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.ModuleState;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.visitors.IModelVisitor;
import org.modelio.vcore.smkernel.SmConstrainedList;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmList;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MClass;
import org.modelio.vcore.smkernel.mapi.MVisitor;
import org.modelio.vcore.smkernel.meta.SmClass;

@objid ("43f4fe7e-e0f5-4fc1-a14f-737f4dfc2ee6")
public class ModuleComponentImpl extends ComponentImpl implements ModuleComponent {
    @objid ("2346cb8a-ad22-4a1f-b746-560fa58ca3cf")
    @Override
    public int getLicenseKey() {
        return (Integer) getAttVal(ModuleComponentData.Metadata.LicenseKeyAtt());
    }

    @objid ("8eb56662-9cde-4c6d-a2cf-6768641f128b")
    @Override
    public void setLicenseKey(int value) {
        setAttVal(ModuleComponentData.Metadata.LicenseKeyAtt(), value);
    }

    @objid ("5ba5223a-d7da-4337-819d-a8c182879f65")
    @Override
    public int getMajVersion() {
        return (Integer) getAttVal(ModuleComponentData.Metadata.MajVersionAtt());
    }

    @objid ("1e1d5f72-27b2-4d6c-b92d-9c117b371592")
    @Override
    public void setMajVersion(int value) {
        setAttVal(ModuleComponentData.Metadata.MajVersionAtt(), value);
    }

    @objid ("1792db6c-d121-4f0d-89cf-e6d25cca08e9")
    @Override
    public int getMinVersion() {
        return (Integer) getAttVal(ModuleComponentData.Metadata.MinVersionAtt());
    }

    @objid ("b7de8981-0cdb-49fd-936e-308f06c228aa")
    @Override
    public void setMinVersion(int value) {
        setAttVal(ModuleComponentData.Metadata.MinVersionAtt(), value);
    }

    @objid ("86336ab4-a47f-49f5-84cc-051846de6825")
    @Override
    public String getMinMinVersion() {
        return (String) getAttVal(ModuleComponentData.Metadata.MinMinVersionAtt());
    }

    @objid ("21257a85-eeb5-4d0d-b5b1-94828e470a24")
    @Override
    public void setMinMinVersion(String value) {
        setAttVal(ModuleComponentData.Metadata.MinMinVersionAtt(), value);
    }

    @objid ("30b6f03f-db22-451c-8cd6-753def58449e")
    @Override
    public String getMinBinVersionCompatibility() {
        return (String) getAttVal(ModuleComponentData.Metadata.MinBinVersionCompatibilityAtt());
    }

    @objid ("8e4672b6-c095-405c-8445-a6fa48c7c003")
    @Override
    public void setMinBinVersionCompatibility(String value) {
        setAttVal(ModuleComponentData.Metadata.MinBinVersionCompatibilityAtt(), value);
    }

    @objid ("d5c664a7-f093-4c91-bedf-2547f842de6d")
    @Override
    public String getJavaClassName() {
        return (String) getAttVal(ModuleComponentData.Metadata.JavaClassNameAtt());
    }

    @objid ("f06a473a-8db8-4628-86e6-40a78150a89c")
    @Override
    public void setJavaClassName(String value) {
        setAttVal(ModuleComponentData.Metadata.JavaClassNameAtt(), value);
    }

    @objid ("aa7e5052-3765-48ec-8165-d8c75f579419")
    @Override
    public ModuleState getState() {
        return (ModuleState) getAttVal(ModuleComponentData.Metadata.StateAtt());
    }

    @objid ("1fb0a2f6-a6e4-4c86-b230-05f2e8db288d")
    @Override
    public void setState(ModuleState value) {
        setAttVal(ModuleComponentData.Metadata.StateAtt(), value);
    }

    @objid ("5b6e89bd-9698-49da-90f6-460a967474eb")
    @Override
    public EList<PropertyType> getDefinedPropertyType() {
        return new SmList<>(this, ModuleComponentData.Metadata.DefinedPropertyTypeDep());
    }

    @objid ("291ff9e3-77bd-4b72-97f1-ffb8ce94b142")
    @Override
    public <T extends PropertyType> List<T> getDefinedPropertyType(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final PropertyType element : getDefinedPropertyType()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("72a8928c-7714-4414-8034-4098f8d2cd04")
    @Override
    public EList<Profile> getOwnedProfile() {
        return new SmList<>(this, ModuleComponentData.Metadata.OwnedProfileDep());
    }

    @objid ("e5bb6f57-7609-4975-86d6-032fd9188896")
    @Override
    public <T extends Profile> List<T> getOwnedProfile(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final Profile element : getOwnedProfile()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("50860f4e-e626-4ce9-88bf-2547429f0bae")
    @Override
    public EList<ModuleParameter> getModuleParameter() {
        return new SmList<>(this, ModuleComponentData.Metadata.ModuleParameterDep());
    }

    @objid ("d4d36a66-e2d1-4eb3-89f8-7251634095a1")
    @Override
    public <T extends ModuleParameter> List<T> getModuleParameter(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModuleParameter element : getModuleParameter()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f945a3e1-6e2a-470a-b4e4-a5f176779b44")
    @Override
    public EList<ModuleComponent> getDependsOn() {
        return new SmList<>(this, ModuleComponentData.Metadata.DependsOnDep());
    }

    @objid ("4a8fb3dc-e798-4405-b27e-4fd7e67bb9be")
    @Override
    public <T extends ModuleComponent> List<T> getDependsOn(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModuleComponent element : getDependsOn()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("78f52bdb-811f-43bf-a6c8-1890f21a6d39")
    @Override
    public EList<ModuleComponent> getImpacted() {
        return new SmList<>(this, ModuleComponentData.Metadata.ImpactedDep());
    }

    @objid ("f59e41a5-680c-411a-9fe7-50e9ebef3666")
    @Override
    public <T extends ModuleComponent> List<T> getImpacted(java.lang.Class<T> filterClass) {
        final List<T> results = new ArrayList<>();
        final MClass mClass = SmClass.getClass(filterClass);
        for (final ModuleComponent element : getImpacted()) {
          if (element.getMClass().hasBase(mClass)) {
            results.add(filterClass.cast(element));
          }
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("eda86851-7fd1-435f-aa45-f7d63a88f1de")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("da090c23-9395-4186-8c4c-535c307494df")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("0c5ee033-902c-4b8d-9931-7861783175f7")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModuleComponent(this);
        else
          return null;
    }

}
