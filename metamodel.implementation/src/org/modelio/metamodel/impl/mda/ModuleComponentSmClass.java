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
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.mda;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.mda.ModuleComponentSmClass;
import org.modelio.metamodel.impl.mda.ModuleParameterSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ProfileSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.properties.PropertyTypeSmClass;
import org.modelio.metamodel.impl.uml.statik.ComponentSmClass;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleState;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("d6948b51-f527-415d-ba21-4a4ff4a1b229")
public class ModuleComponentSmClass extends ComponentSmClass {
    @objid ("cd04c3f6-ef79-4ad6-8fe2-aecfc9f7344a")
    private SmAttribute licenseKeyAtt;

    @objid ("6db22aac-e244-4430-8254-e30d9691c1d6")
    private SmAttribute majVersionAtt;

    @objid ("249d44b3-c963-411b-9caa-5741c13f8306")
    private SmAttribute minVersionAtt;

    @objid ("473ca35d-080f-408a-b3df-71153f44b376")
    private SmAttribute minMinVersionAtt;

    @objid ("17d89491-0abf-43d0-b257-f6ef1aa20fa3")
    private SmAttribute minBinVersionCompatibilityAtt;

    @objid ("b77f0502-cee7-476a-bdb6-86136b1bad60")
    private SmAttribute javaClassNameAtt;

    @objid ("5421f7c4-452b-4bc8-bb1c-a97813a2df0d")
    private SmAttribute stateAtt;

    @objid ("08f5a2b9-7110-41ab-a637-d472501fc89d")
    private SmDependency definedPropertyTypeDep;

    @objid ("b970c0d6-d4f5-4588-a949-a037d7e4816f")
    private SmDependency ownedProfileDep;

    @objid ("eefb9d74-1956-462c-a9da-be622a440569")
    private SmDependency moduleParameterDep;

    @objid ("22c9ed39-df95-45a5-bbd0-f0ea05efca73")
    private SmDependency dependsOnDep;

    @objid ("d913c64c-b803-4302-8cf1-8a9998509c83")
    private SmDependency impactedDep;

    @objid ("ff47c4e0-a358-4c53-904b-5c5a85bb7d5c")
    public ModuleComponentSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("517b9806-2489-4bd3-bda7-438842eb4bab")
    @Override
    public String getName() {
        return "ModuleComponent";
    }

    @objid ("3269be7f-083e-4278-b3da-2e53e4338f96")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("7e9844e7-cc86-4cce-82c8-3aaef21ec00e")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return ModuleComponent.class;
    }

    @objid ("79ddbfd0-b816-41c8-8bd4-78fba04f39b2")
    @Override
    public boolean isCmsNode() {
        return true;
    }

    @objid ("5e9a4687-b160-4253-b1af-e10643ecc5a7")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("5c19c0da-7223-4598-af73-810712d7513d")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("Component");
        this.registerFactory(new ModuleComponentObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.licenseKeyAtt = new LicenseKeySmAttribute();
        this.licenseKeyAtt.init("LicenseKey", this, Integer.class );
        registerAttribute(this.licenseKeyAtt);
        
        this.majVersionAtt = new MajVersionSmAttribute();
        this.majVersionAtt.init("MajVersion", this, Integer.class );
        registerAttribute(this.majVersionAtt);
        
        this.minVersionAtt = new MinVersionSmAttribute();
        this.minVersionAtt.init("MinVersion", this, Integer.class );
        registerAttribute(this.minVersionAtt);
        
        this.minMinVersionAtt = new MinMinVersionSmAttribute();
        this.minMinVersionAtt.init("MinMinVersion", this, String.class );
        registerAttribute(this.minMinVersionAtt);
        
        this.minBinVersionCompatibilityAtt = new MinBinVersionCompatibilitySmAttribute();
        this.minBinVersionCompatibilityAtt.init("MinBinVersionCompatibility", this, String.class );
        registerAttribute(this.minBinVersionCompatibilityAtt);
        
        this.javaClassNameAtt = new JavaClassNameSmAttribute();
        this.javaClassNameAtt.init("JavaClassName", this, String.class );
        registerAttribute(this.javaClassNameAtt);
        
        this.stateAtt = new StateSmAttribute();
        this.stateAtt.init("State", this, ModuleState.class );
        registerAttribute(this.stateAtt);
        
        
        // Initialize and register the SmDependency
        this.definedPropertyTypeDep = new DefinedPropertyTypeSmDependency();
        this.definedPropertyTypeDep.init("DefinedPropertyType", this, metamodel.getMClass("PropertyType"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.definedPropertyTypeDep);
        
        this.ownedProfileDep = new OwnedProfileSmDependency();
        this.ownedProfileDep.init("OwnedProfile", this, metamodel.getMClass("Profile"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedProfileDep);
        
        this.moduleParameterDep = new ModuleParameterSmDependency();
        this.moduleParameterDep.init("ModuleParameter", this, metamodel.getMClass("ModuleParameter"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.moduleParameterDep);
        
        this.dependsOnDep = new DependsOnSmDependency();
        this.dependsOnDep.init("DependsOn", this, metamodel.getMClass("ModuleComponent"), 0, -1 , SmDirective.SMCDPARTOF);
        registerDependency(this.dependsOnDep);
        
        this.impactedDep = new ImpactedSmDependency();
        this.impactedDep.init("Impacted", this, metamodel.getMClass("ModuleComponent"), 0, -1 );
        registerDependency(this.impactedDep);
    }

    @objid ("f7c212bc-3406-493a-af04-a62f2d5d9a1b")
    public SmAttribute getLicenseKeyAtt() {
        if (this.licenseKeyAtt == null) {
        	this.licenseKeyAtt = this.getAttributeDef("LicenseKey");
        }
        return this.licenseKeyAtt;
    }

    @objid ("bc79741b-c0d3-487e-9101-0f76c253ae76")
    public SmAttribute getMajVersionAtt() {
        if (this.majVersionAtt == null) {
        	this.majVersionAtt = this.getAttributeDef("MajVersion");
        }
        return this.majVersionAtt;
    }

    @objid ("10b9a3d2-0df3-41bc-8563-e7fa619bfd92")
    public SmAttribute getMinVersionAtt() {
        if (this.minVersionAtt == null) {
        	this.minVersionAtt = this.getAttributeDef("MinVersion");
        }
        return this.minVersionAtt;
    }

    @objid ("ae7e544e-7620-48f3-8062-e3c2c9e3c62b")
    public SmAttribute getMinMinVersionAtt() {
        if (this.minMinVersionAtt == null) {
        	this.minMinVersionAtt = this.getAttributeDef("MinMinVersion");
        }
        return this.minMinVersionAtt;
    }

    @objid ("6415d315-d197-4420-8a27-2f926f1da499")
    public SmAttribute getMinBinVersionCompatibilityAtt() {
        if (this.minBinVersionCompatibilityAtt == null) {
        	this.minBinVersionCompatibilityAtt = this.getAttributeDef("MinBinVersionCompatibility");
        }
        return this.minBinVersionCompatibilityAtt;
    }

    @objid ("51fad423-759f-454a-a643-401d1c272e1c")
    public SmAttribute getJavaClassNameAtt() {
        if (this.javaClassNameAtt == null) {
        	this.javaClassNameAtt = this.getAttributeDef("JavaClassName");
        }
        return this.javaClassNameAtt;
    }

    @objid ("857f8617-3696-4738-a709-e4d92c81157b")
    public SmAttribute getStateAtt() {
        if (this.stateAtt == null) {
        	this.stateAtt = this.getAttributeDef("State");
        }
        return this.stateAtt;
    }

    @objid ("5ef1d41e-0bf1-4ecd-bc09-0f3df26c6eb1")
    public SmDependency getDefinedPropertyTypeDep() {
        if (this.definedPropertyTypeDep == null) {
        	this.definedPropertyTypeDep = this.getDependencyDef("DefinedPropertyType");
        }
        return this.definedPropertyTypeDep;
    }

    @objid ("14986d33-89c7-4b1c-b560-15b8682c08b3")
    public SmDependency getOwnedProfileDep() {
        if (this.ownedProfileDep == null) {
        	this.ownedProfileDep = this.getDependencyDef("OwnedProfile");
        }
        return this.ownedProfileDep;
    }

    @objid ("5f405af2-8b0f-4864-a449-28d274ea7753")
    public SmDependency getModuleParameterDep() {
        if (this.moduleParameterDep == null) {
        	this.moduleParameterDep = this.getDependencyDef("ModuleParameter");
        }
        return this.moduleParameterDep;
    }

    @objid ("b9cf053e-de3b-468c-9440-a3be858a03a9")
    public SmDependency getDependsOnDep() {
        if (this.dependsOnDep == null) {
        	this.dependsOnDep = this.getDependencyDef("DependsOn");
        }
        return this.dependsOnDep;
    }

    @objid ("67610616-57c7-42eb-be9a-677da41cc529")
    public SmDependency getImpactedDep() {
        if (this.impactedDep == null) {
        	this.impactedDep = this.getDependencyDef("Impacted");
        }
        return this.impactedDep;
    }

    @objid ("1e35f4ed-4fbc-4d7a-bdfe-ea10d7d4f19e")
    private static class ModuleComponentObjectFactory implements ISmObjectFactory {
        @objid ("d22ea639-33ea-4ded-a103-15b23074123d")
        private ModuleComponentSmClass smClass;

        @objid ("bdf36e48-709d-4bcb-b85d-4f3ebee952cc")
        public ModuleComponentObjectFactory(ModuleComponentSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("bb593086-7c9e-486c-8458-46d0fef0efe9")
        @Override
        public ISmObjectData createData() {
            return new ModuleComponentData(this.smClass);
        }

        @objid ("f796a803-81f9-40ad-9961-6b62c01e641c")
        @Override
        public SmObjectImpl createImpl() {
            return new ModuleComponentImpl();
        }

    }

    @objid ("ef1026de-70d7-4e0d-bba2-e57ff06b800f")
    public static class LicenseKeySmAttribute extends SmAttribute {
        @objid ("45f18cf7-7e56-4649-879f-f0ec6b5516c5")
        public Object getValue(ISmObjectData data) {
            return ((ModuleComponentData) data).mLicenseKey;
        }

        @objid ("7ed60f76-12a3-46eb-9f9f-4a52cd98ce1d")
        public void setValue(ISmObjectData data, Object value) {
            ((ModuleComponentData) data).mLicenseKey = value;
        }

    }

    @objid ("61247055-ccbc-4db0-b866-0d02b70f9d98")
    public static class MajVersionSmAttribute extends SmAttribute {
        @objid ("62008dfd-3824-424b-8636-4c7f864abbfb")
        public Object getValue(ISmObjectData data) {
            return ((ModuleComponentData) data).mMajVersion;
        }

        @objid ("f7057f90-7158-40d0-a07a-1812b5c4d81f")
        public void setValue(ISmObjectData data, Object value) {
            ((ModuleComponentData) data).mMajVersion = value;
        }

    }

    @objid ("abf0a9a8-fcd8-414c-9d94-ea3ca36d05b2")
    public static class MinVersionSmAttribute extends SmAttribute {
        @objid ("04e2f1b4-5ed6-4add-861a-8387d8596e90")
        public Object getValue(ISmObjectData data) {
            return ((ModuleComponentData) data).mMinVersion;
        }

        @objid ("275fdc4a-0398-48fa-bfd7-5001942db0cb")
        public void setValue(ISmObjectData data, Object value) {
            ((ModuleComponentData) data).mMinVersion = value;
        }

    }

    @objid ("513f1c1e-ce38-4c31-8e17-4ce397f40b13")
    public static class MinMinVersionSmAttribute extends SmAttribute {
        @objid ("5e41fb1f-11d9-4535-ad18-a5d93b0455c4")
        public Object getValue(ISmObjectData data) {
            return ((ModuleComponentData) data).mMinMinVersion;
        }

        @objid ("8d0287f4-47c1-42f1-8106-7bf86f1b9bea")
        public void setValue(ISmObjectData data, Object value) {
            ((ModuleComponentData) data).mMinMinVersion = value;
        }

    }

    @objid ("feb3965b-6276-4024-b787-44cb4cb6401a")
    public static class MinBinVersionCompatibilitySmAttribute extends SmAttribute {
        @objid ("8a985337-e0f1-455d-8878-75db25c40ceb")
        public Object getValue(ISmObjectData data) {
            return ((ModuleComponentData) data).mMinBinVersionCompatibility;
        }

        @objid ("7f8fb4e7-1a45-4528-abdb-3e3ad0731e73")
        public void setValue(ISmObjectData data, Object value) {
            ((ModuleComponentData) data).mMinBinVersionCompatibility = value;
        }

    }

    @objid ("3bb6d6c7-d969-4e05-873b-66955b8874d5")
    public static class JavaClassNameSmAttribute extends SmAttribute {
        @objid ("a198cc4b-b56c-4d18-afff-26b800b21684")
        public Object getValue(ISmObjectData data) {
            return ((ModuleComponentData) data).mJavaClassName;
        }

        @objid ("f423cba8-0190-4701-9175-a713b1bd98e4")
        public void setValue(ISmObjectData data, Object value) {
            ((ModuleComponentData) data).mJavaClassName = value;
        }

    }

    @objid ("ec1507d4-29a5-4df1-ade9-74fd776746a7")
    public static class StateSmAttribute extends SmAttribute {
        @objid ("a028a73a-e13a-4e9b-a928-ee03a472ceb9")
        public Object getValue(ISmObjectData data) {
            return ((ModuleComponentData) data).mState;
        }

        @objid ("f7a071d6-e44f-41fa-8087-8edcdd750b9b")
        public void setValue(ISmObjectData data, Object value) {
            ((ModuleComponentData) data).mState = value;
        }

    }

    @objid ("c67b0b2e-f963-47f0-8769-faa5ea56d76c")
    public static class DefinedPropertyTypeSmDependency extends SmMultipleDependency {
        @objid ("6f637c39-2609-44a0-bd6d-1425bf8fe14a")
        private SmDependency symetricDep;

        @objid ("2209683b-a1b7-494d-97b2-86b77000a504")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModuleComponentData)data).mDefinedPropertyType != null)? ((ModuleComponentData)data).mDefinedPropertyType:SmMultipleDependency.EMPTY;
        }

        @objid ("bcea83bd-bd7d-4bf3-899c-8310c1ea0346")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModuleComponentData) data).mDefinedPropertyType = values;
        }

        @objid ("3efed2a0-2aaf-419f-a1e5-1720eb2c0664")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PropertyTypeSmClass)this.getTarget()).getModuleOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ced46ae6-2551-4b39-a146-dc076205374b")
    public static class OwnedProfileSmDependency extends SmMultipleDependency {
        @objid ("5b350467-e73d-4213-96a9-6463100e9ed3")
        private SmDependency symetricDep;

        @objid ("826a6035-75eb-40c7-a568-26366fcbc086")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModuleComponentData)data).mOwnedProfile != null)? ((ModuleComponentData)data).mOwnedProfile:SmMultipleDependency.EMPTY;
        }

        @objid ("42e1270b-84ca-4cd7-909b-614e7b8baefc")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModuleComponentData) data).mOwnedProfile = values;
        }

        @objid ("53718641-ad07-492d-aac1-0801250f7dd9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ProfileSmClass)this.getTarget()).getOwnerModuleDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3817efbf-4eef-491c-92c9-a3f285026e86")
    public static class ModuleParameterSmDependency extends SmMultipleDependency {
        @objid ("ac180e15-5602-4162-b15a-226003ff2b94")
        private SmDependency symetricDep;

        @objid ("38ff978b-988a-4618-91c9-0a5fac9c7a66")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModuleComponentData)data).mModuleParameter != null)? ((ModuleComponentData)data).mModuleParameter:SmMultipleDependency.EMPTY;
        }

        @objid ("e9bec27e-edf5-46d0-a846-cb33081dfcf7")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModuleComponentData) data).mModuleParameter = values;
        }

        @objid ("b45462ec-6a36-4240-b58e-7db12afe954a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModuleParameterSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a0a3a834-84d0-45c4-9475-5fe70c9105b6")
    public static class DependsOnSmDependency extends SmMultipleDependency {
        @objid ("a330c1e7-79ef-4b7b-a498-c41760fc03b1")
        private SmDependency symetricDep;

        @objid ("38e44517-4b44-4a2d-b971-276dbae7c41f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModuleComponentData)data).mDependsOn != null)? ((ModuleComponentData)data).mDependsOn:SmMultipleDependency.EMPTY;
        }

        @objid ("357fce9e-c49f-4308-b5cf-5a2e25a412da")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModuleComponentData) data).mDependsOn = values;
        }

        @objid ("eae72765-48da-4f92-becc-f3b14c812ba7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModuleComponentSmClass)this.getTarget()).getImpactedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("af795d37-0af7-4d67-9d65-6045a9558ea7")
    public static class ImpactedSmDependency extends SmMultipleDependency {
        @objid ("ff0cfc6d-8a21-48f0-a7c0-f7b853979512")
        private SmDependency symetricDep;

        @objid ("7a78d9bf-7b9b-438e-a9ff-740aa87c5c9d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((ModuleComponentData)data).mImpacted != null)? ((ModuleComponentData)data).mImpacted:SmMultipleDependency.EMPTY;
        }

        @objid ("9cc9a18e-aebb-4f16-8915-8d608e526a60")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((ModuleComponentData) data).mImpacted = values;
        }

        @objid ("90bfc7ea-d02b-4c06-a3f7-eb28898aec5c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ModuleComponentSmClass)this.getTarget()).getDependsOnDep();
            }
            return this.symetricDep;
        }

    }

}
