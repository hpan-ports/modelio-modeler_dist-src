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
    @objid ("98f87c19-8f2d-40c7-95a4-77be5f7d1e71")
    @Override
    public int getLicenseKey() {
        return (Integer) getAttVal(ModuleComponentData.Metadata.LicenseKeyAtt());
    }

    @objid ("94bac68e-48b1-456c-8591-f3fec5032f63")
    @Override
    public void setLicenseKey(int value) {
        setAttVal(ModuleComponentData.Metadata.LicenseKeyAtt(), value);
    }

    @objid ("0794b3b7-d52d-4ba6-9220-683a0108f2d8")
    @Override
    public int getMajVersion() {
        return (Integer) getAttVal(ModuleComponentData.Metadata.MajVersionAtt());
    }

    @objid ("731bdfca-4ed1-4a83-83c9-5ee90f87a9a3")
    @Override
    public void setMajVersion(int value) {
        setAttVal(ModuleComponentData.Metadata.MajVersionAtt(), value);
    }

    @objid ("16aadf52-a4da-46af-803f-af74b93e3284")
    @Override
    public int getMinVersion() {
        return (Integer) getAttVal(ModuleComponentData.Metadata.MinVersionAtt());
    }

    @objid ("14c0e24b-7bea-4528-90f0-7ce3072d33aa")
    @Override
    public void setMinVersion(int value) {
        setAttVal(ModuleComponentData.Metadata.MinVersionAtt(), value);
    }

    @objid ("de0f4e46-c9ea-4212-b060-12374da127a6")
    @Override
    public String getMinMinVersion() {
        return (String) getAttVal(ModuleComponentData.Metadata.MinMinVersionAtt());
    }

    @objid ("f6d3b179-1098-476f-a948-c6487f95aa4d")
    @Override
    public void setMinMinVersion(String value) {
        setAttVal(ModuleComponentData.Metadata.MinMinVersionAtt(), value);
    }

    @objid ("ab9040a0-fe26-4ffd-bb64-43b65c704f73")
    @Override
    public String getMinBinVersionCompatibility() {
        return (String) getAttVal(ModuleComponentData.Metadata.MinBinVersionCompatibilityAtt());
    }

    @objid ("4272ff7d-55c6-4806-b174-f7fabb4c9255")
    @Override
    public void setMinBinVersionCompatibility(String value) {
        setAttVal(ModuleComponentData.Metadata.MinBinVersionCompatibilityAtt(), value);
    }

    @objid ("39e29b49-c7b2-41af-a20c-469ad7815ea0")
    @Override
    public String getJavaClassName() {
        return (String) getAttVal(ModuleComponentData.Metadata.JavaClassNameAtt());
    }

    @objid ("4e0d2e8b-afc3-4367-9726-4a00b7a8e971")
    @Override
    public void setJavaClassName(String value) {
        setAttVal(ModuleComponentData.Metadata.JavaClassNameAtt(), value);
    }

    @objid ("adcc5280-40c0-402e-9161-da6152aded9d")
    @Override
    public ModuleState getState() {
        return (ModuleState) getAttVal(ModuleComponentData.Metadata.StateAtt());
    }

    @objid ("f7cab3b4-8b8b-4ade-8d45-c52112b1d139")
    @Override
    public void setState(ModuleState value) {
        setAttVal(ModuleComponentData.Metadata.StateAtt(), value);
    }

    @objid ("06c60839-da3b-4490-8b37-85ee247f724c")
    @Override
    public EList<PropertyType> getDefinedPropertyType() {
        return new SmList<>(this, ModuleComponentData.Metadata.DefinedPropertyTypeDep());
    }

    @objid ("ac84b649-6e67-4208-81eb-99d49e85a442")
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

    @objid ("f15214ab-9f8c-4674-908b-c1d826dea5cd")
    @Override
    public EList<Profile> getOwnedProfile() {
        return new SmList<>(this, ModuleComponentData.Metadata.OwnedProfileDep());
    }

    @objid ("536ee516-235b-4696-a28d-fdbf402bfd67")
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

    @objid ("04efb9cb-4098-4840-a2b5-5fda8a9dc468")
    @Override
    public EList<ModuleParameter> getModuleParameter() {
        return new SmList<>(this, ModuleComponentData.Metadata.ModuleParameterDep());
    }

    @objid ("e91ec75c-6d03-4f86-8707-b1d39f9d9353")
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

    @objid ("ad91a0ff-619a-4574-aae2-635f38e0a9d4")
    @Override
    public EList<ModuleComponent> getDependsOn() {
        return new SmList<>(this, ModuleComponentData.Metadata.DependsOnDep());
    }

    @objid ("41675769-863b-4696-abc7-5859b3edc942")
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

    @objid ("b66502e8-118d-47ef-a2f8-e9ec2fa754d9")
    @Override
    public EList<ModuleComponent> getImpacted() {
        return new SmList<>(this, ModuleComponentData.Metadata.ImpactedDep());
    }

    @objid ("9e27cddc-e744-4104-b606-8b1aec90de04")
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

    @objid ("ca6e1c7a-a5f4-4c28-90e4-4b3ba1907d34")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("ed9f61ef-2914-47ca-956d-9c8624a0dfa0")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("36ac3423-145b-4bed-acf2-bce1871167e3")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModuleComponent(this);
        else
          return null;
    }

}
