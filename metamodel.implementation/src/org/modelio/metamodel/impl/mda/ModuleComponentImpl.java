/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.mda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.impl.mda.ModuleComponentData;
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
import org.modelio.vcore.smkernel.meta.SmDependency;

@objid ("43f4fe7e-e0f5-4fc1-a14f-737f4dfc2ee6")
public class ModuleComponentImpl extends ComponentImpl implements ModuleComponent {
    @objid ("08cc80ad-5dc3-4a2f-8667-646cd5a71e43")
    @Override
    public int getLicenseKey() {
        return (Integer) getAttVal(((ModuleComponentSmClass)getClassOf()).getLicenseKeyAtt());
    }

    @objid ("1e6d6f69-c64e-4f72-9a9a-756888a5b1af")
    @Override
    public void setLicenseKey(int value) {
        setAttVal(((ModuleComponentSmClass)getClassOf()).getLicenseKeyAtt(), value);
    }

    @objid ("e1ab5f40-d828-41d8-b001-194a39d5f4bb")
    @Override
    public int getMajVersion() {
        return (Integer) getAttVal(((ModuleComponentSmClass)getClassOf()).getMajVersionAtt());
    }

    @objid ("be5f251c-92e7-43f3-8dc0-e253f94c3ef5")
    @Override
    public void setMajVersion(int value) {
        setAttVal(((ModuleComponentSmClass)getClassOf()).getMajVersionAtt(), value);
    }

    @objid ("805d5b71-2ba7-4ceb-999f-102d561c672b")
    @Override
    public int getMinVersion() {
        return (Integer) getAttVal(((ModuleComponentSmClass)getClassOf()).getMinVersionAtt());
    }

    @objid ("0ed74856-667f-4981-b558-d3d3bad87dda")
    @Override
    public void setMinVersion(int value) {
        setAttVal(((ModuleComponentSmClass)getClassOf()).getMinVersionAtt(), value);
    }

    @objid ("c4789dfa-9f4f-4446-a631-1f8cd6e01a59")
    @Override
    public String getMinMinVersion() {
        return (String) getAttVal(((ModuleComponentSmClass)getClassOf()).getMinMinVersionAtt());
    }

    @objid ("c5bc35d9-70f7-44e2-b9d3-fce63e89578b")
    @Override
    public void setMinMinVersion(String value) {
        setAttVal(((ModuleComponentSmClass)getClassOf()).getMinMinVersionAtt(), value);
    }

    @objid ("73140fe0-c1d6-442c-912e-77828f40f04c")
    @Override
    public String getMinBinVersionCompatibility() {
        return (String) getAttVal(((ModuleComponentSmClass)getClassOf()).getMinBinVersionCompatibilityAtt());
    }

    @objid ("c4aba1da-68aa-45d5-b55e-2cec8f3fca5d")
    @Override
    public void setMinBinVersionCompatibility(String value) {
        setAttVal(((ModuleComponentSmClass)getClassOf()).getMinBinVersionCompatibilityAtt(), value);
    }

    @objid ("c1776a34-93eb-45ea-8643-251162aa4186")
    @Override
    public String getJavaClassName() {
        return (String) getAttVal(((ModuleComponentSmClass)getClassOf()).getJavaClassNameAtt());
    }

    @objid ("c0a0d956-cada-4711-84d2-3dc06abae7e2")
    @Override
    public void setJavaClassName(String value) {
        setAttVal(((ModuleComponentSmClass)getClassOf()).getJavaClassNameAtt(), value);
    }

    @objid ("bb23d2ac-b7c0-4f03-a235-2b6b240ef640")
    @Override
    public ModuleState getState() {
        return (ModuleState) getAttVal(((ModuleComponentSmClass)getClassOf()).getStateAtt());
    }

    @objid ("925c7124-43dc-4280-9dd1-ddebd31487fa")
    @Override
    public void setState(ModuleState value) {
        setAttVal(((ModuleComponentSmClass)getClassOf()).getStateAtt(), value);
    }

    @objid ("653eea60-4386-420a-8138-09b144d7c0bb")
    @Override
    public EList<PropertyType> getDefinedPropertyType() {
        return new SmList<>(this, ((ModuleComponentSmClass)getClassOf()).getDefinedPropertyTypeDep());
    }

    @objid ("9b9f6a0d-4478-4670-b96a-1f5ee88bb00b")
    @Override
    public <T extends PropertyType> List<T> getDefinedPropertyType(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final PropertyType element : getDefinedPropertyType()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("3fdb582a-a8f6-4605-b2c9-41994479dfbe")
    @Override
    public EList<Profile> getOwnedProfile() {
        return new SmList<>(this, ((ModuleComponentSmClass)getClassOf()).getOwnedProfileDep());
    }

    @objid ("0ed323fd-a8d6-4f73-815a-774ce1838289")
    @Override
    public <T extends Profile> List<T> getOwnedProfile(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final Profile element : getOwnedProfile()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("f3834394-7dbd-4832-a2d5-70d77d549ea0")
    @Override
    public EList<ModuleParameter> getModuleParameter() {
        return new SmList<>(this, ((ModuleComponentSmClass)getClassOf()).getModuleParameterDep());
    }

    @objid ("ba4273ac-2bd2-4865-8fed-daff74c58760")
    @Override
    public <T extends ModuleParameter> List<T> getModuleParameter(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ModuleParameter element : getModuleParameter()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("4923c586-d034-4790-868b-a8def6b65bd4")
    @Override
    public EList<ModuleComponent> getDependsOn() {
        return new SmList<>(this, ((ModuleComponentSmClass)getClassOf()).getDependsOnDep());
    }

    @objid ("f5c75205-f009-4a42-8a00-a4b3d984f96e")
    @Override
    public <T extends ModuleComponent> List<T> getDependsOn(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ModuleComponent element : getDependsOn()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("41e84b43-fb74-4e87-8e99-bf35c4cfd811")
    @Override
    public EList<ModuleComponent> getImpacted() {
        return new SmList<>(this, ((ModuleComponentSmClass)getClassOf()).getImpactedDep());
    }

    @objid ("f5c54224-d28e-4dcd-975e-78527f28305a")
    @Override
    public <T extends ModuleComponent> List<T> getImpacted(java.lang.Class<T> filterClass) {
        if (filterClass == null) {
          throw new IllegalArgumentException();
        }
        final List<T> results = new ArrayList<>();
        for (final ModuleComponent element : getImpacted()) {
        	if (filterClass.isInstance(element)) {
        		results.add(filterClass.cast(element));
        	}
        }
        return Collections.unmodifiableList(results);
    }

    @objid ("66616873-95d9-46c4-87cc-06f336da5fda")
    @Override
    public SmObjectImpl getCompositionOwner() {
        // Generated implementation
        SmObjectImpl obj;
        return super.getCompositionOwner();
    }

    @objid ("82e5b4f3-f97d-4849-8b3a-80df7a187cad")
    @Override
    public SmDepVal getCompositionRelation() {
        // Generated implementation
        SmObjectImpl obj;
        SmDependency dep;
        
        return super.getCompositionRelation();
    }

    @objid ("a9051f63-af4f-4170-805e-91ee9bf3020c")
    @Override
    public Object accept(MVisitor v) {
        if (v instanceof IModelVisitor)
          return ((IModelVisitor)v).visitModuleComponent(this);
        else
          return null;
    }

}
