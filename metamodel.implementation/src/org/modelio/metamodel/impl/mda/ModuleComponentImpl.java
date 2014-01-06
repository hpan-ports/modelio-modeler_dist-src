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
    @objid ("2e75ada2-f540-486b-96a0-ebac42e34338")
    @Override
    public int getLicenseKey() {
        return (Integer) getAttVal(ModuleComponentData.Metadata.LicenseKeyAtt());
    }

    @objid ("3568ac9d-db4b-4823-88be-9545ccf41360")
    @Override
    public void setLicenseKey(int value) {
        setAttVal(ModuleComponentData.Metadata.LicenseKeyAtt(), value);
    }

    @objid ("5356f367-a08c-435b-9ed0-22ace3d9646b")
    @Override
    public int getMajVersion() {
        return (Integer) getAttVal(ModuleComponentData.Metadata.MajVersionAtt());
    }

    @objid ("5ae8fd91-9c87-4a6e-a119-fb3a53f8fe57")
    @Override
    public void setMajVersion(int value) {
        setAttVal(ModuleComponentData.Metadata.MajVersionAtt(), value);
    }

    @objid ("7ee46439-1270-4076-98de-b5f78acd99bf")
    @Override
    public int getMinVersion() {
        return (Integer) getAttVal(ModuleComponentData.Metadata.MinVersionAtt());
    }

    @objid ("88501828-59e4-4f6b-908c-ee614cf83d6c")
    @Override
    public void setMinVersion(int value) {
        setAttVal(ModuleComponentData.Metadata.MinVersionAtt(), value);
    }

    @objid ("e2c875a0-0f06-46ae-b6c5-ed235e9dede1")
    @Override
    public String getMinMinVersion() {
        return (String) getAttVal(ModuleComponentData.Metadata.MinMinVersionAtt());
    }

    @objid ("2240a252-2cd0-460f-b486-62ea33c4f4f5")
    @Override
    public void setMinMinVersion(String value) {
        setAttVal(ModuleComponentData.Metadata.MinMinVersionAtt(), value);
    }

    @objid ("1a682c98-902a-4558-89ab-78ccdb93e4e2")
    @Override
    public String getMinBinVersionCompatibility() {
        return (String) getAttVal(ModuleComponentData.Metadata.MinBinVersionCompatibilityAtt());
    }

    @objid ("fd882519-9b55-4584-889b-83a699ef51a9")
    @Override
    public void setMinBinVersionCompatibility(String value) {
        setAttVal(ModuleComponentData.Metadata.MinBinVersionCompatibilityAtt(), value);
    }

    @objid ("9a23ecec-bcc2-493f-9fd1-a838dc27305a")
    @Override
    public String getJavaClassName() {
        return (String) getAttVal(ModuleComponentData.Metadata.JavaClassNameAtt());
    }

    @objid ("bda69bfb-af37-4719-8e1b-8af8c23ac6c7")
    @Override
    public void setJavaClassName(String value) {
        setAttVal(ModuleComponentData.Metadata.JavaClassNameAtt(), value);
    }

    @objid ("5f4b613d-482b-44a8-8e7c-eefdd31187cc")
    @Override
    public ModuleState getState() {
        return (ModuleState) getAttVal(ModuleComponentData.Metadata.StateAtt());
    }

    @objid ("05d99e7d-be7c-4ec6-9132-5bbe8f8bf4bb")
    @Override
    public void setState(ModuleState value) {
        setAttVal(ModuleComponentData.Metadata.StateAtt(), value);
    }

    @objid ("106f8bb2-e230-4264-9668-397af02ef312")
    @Override
    public EList<PropertyType> getDefinedPropertyType() {
        return new SmList<>(this, ModuleComponentData.Metadata.DefinedPropertyTypeDep());
    }

    @objid ("0dd5cd37-e58c-41a1-8624-08e661496e41")
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

    @objid ("25210ede-dbd6-4938-bdab-693448ccb7d2")
    @Override
    public EList<Profile> getOwnedProfile() {
        return new SmList<>(this, ModuleComponentData.Metadata.OwnedProfileDep());
    }

    @objid ("142c4b56-c9c5-4c20-a299-01bacf479d73")
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

    @objid ("59dcc76f-5e78-498f-b6d2-dee9400faaea")
    @Override
    public EList<ModuleParameter> getModuleParameter() {
        return new SmList<>(this, ModuleComponentData.Metadata.ModuleParameterDep());
    }

    @objid ("3b6834d7-7ff5-443d-a664-5c07e509b4cc")
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

    @objid ("85fa2a53-358c-400f-94ed-203a980cdd75")
    @Override
    public EList<ModuleComponent> getDependsOn() {
        return new SmList<>(this, ModuleComponentData.Metadata.DependsOnDep());
    }

    @objid ("be610e21-a0a8-4c5b-8d7d-07f0d64dac66")
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

    @objid ("34a16238-3d9c-4633-a93b-1eb3d911cd3e")
    @Override
    public EList<ModuleComponent> getImpacted() {
        return new SmList<>(this, ModuleComponentData.Metadata.ImpactedDep());
    }

    @objid ("db94c738-6214-4ef9-9b02-02dbd8dd66e1")
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

    @objid ("8f32aa82-dcfc-4adc-a24e-2ff2aeb4e7eb")
    @Override
    public SmObjectImpl getCompositionOwner() {
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("2fc0e840-6ba7-435c-b5a6-1c39fa5dbe2b")
    @Override
    public SmDepVal getCompositionRelation() {
        SmObjectImpl obj;
        return super.getCompositionRelation();
    }

    @objid ("315787f0-c543-4b2c-992e-320c99230adf")
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModuleComponent(this);
        else
          return null;
    }

}
