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
package org.modelio.metamodel.data.mda;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.mda.ModuleParameterData;
import org.modelio.metamodel.data.uml.infrastructure.ProfileData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTypeData;
import org.modelio.metamodel.data.uml.statik.ComponentData;
import org.modelio.metamodel.impl.mda.ModuleComponentImpl;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleState;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmClass;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAssociation;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaAttribute;
import org.modelio.vcore.smkernel.meta.smannotations.SmaMetaClass;

@objid ("0065c782-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ModuleComponent.class, factory=ModuleComponentData.Metadata.ObjectFactory.class, cmsnode=true)
public class ModuleComponentData extends ComponentData {
    @objid ("2fcbbd70-97b1-4f82-b58a-a4d129a28f35")
    @SmaMetaAttribute(metaName="LicenseKey", type=Integer.class, smAttributeClass=Metadata.LicenseKeySmAttribute.class)
     Object mLicenseKey = 0;

    @objid ("04b21b60-567c-4dd9-bc14-a3833f26f964")
    @SmaMetaAttribute(metaName="MajVersion", type=Integer.class, smAttributeClass=Metadata.MajVersionSmAttribute.class)
     Object mMajVersion = 0;

    @objid ("cae00beb-a46f-44cf-bde0-9adf79be7aa1")
    @SmaMetaAttribute(metaName="MinVersion", type=Integer.class, smAttributeClass=Metadata.MinVersionSmAttribute.class)
     Object mMinVersion = 0;

    @objid ("6c0a3461-904d-4e88-9bc4-0a0810719efe")
    @SmaMetaAttribute(metaName="MinMinVersion", type=String.class, smAttributeClass=Metadata.MinMinVersionSmAttribute.class)
     Object mMinMinVersion = "";

    @objid ("4f9e3b9c-1c07-4145-9452-8ad75812860a")
    @SmaMetaAttribute(metaName="MinBinVersionCompatibility", type=String.class, smAttributeClass=Metadata.MinBinVersionCompatibilitySmAttribute.class)
     Object mMinBinVersionCompatibility = "";

    @objid ("06ee8538-5793-4fa0-bdce-476e624013d1")
    @SmaMetaAttribute(metaName="JavaClassName", type=String.class, smAttributeClass=Metadata.JavaClassNameSmAttribute.class)
     Object mJavaClassName = "";

    @objid ("14f8b513-c9fc-4030-bc78-c81e29e4e622")
    @SmaMetaAttribute(metaName="State", type=ModuleState.class, smAttributeClass=Metadata.StateSmAttribute.class, einoexternalize=true)
     Object mState = ModuleState.SOMODULESTATEACTIVATED;

    @objid ("d94535a3-fef2-445a-a964-14565f6594b2")
    @SmaMetaAssociation(metaName="DefinedPropertyType", typeDataClass=PropertyTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedPropertyTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedPropertyType = null;

    @objid ("e1fb5366-6c4d-4668-8cd0-b8f26f560d62")
    @SmaMetaAssociation(metaName="OwnedProfile", typeDataClass=ProfileData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedProfileSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedProfile = null;

    @objid ("27af9e0e-b0cb-4ef2-b84e-ef062e223973")
    @SmaMetaAssociation(metaName="ModuleParameter", typeDataClass=ModuleParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ModuleParameterSmDependency.class, component = true)
     List<SmObjectImpl> mModuleParameter = null;

    @objid ("08e798f9-30a4-4f32-9b25-a77596ea00b3")
    @SmaMetaAssociation(metaName="DependsOn", typeDataClass=ModuleComponentData.class, min=0, max=-1, smAssociationClass=Metadata.DependsOnSmDependency.class, partof = true)
     List<SmObjectImpl> mDependsOn = null;

    @objid ("22a24157-a7f7-4892-a259-a8c4fb7b01a7")
    @SmaMetaAssociation(metaName="Impacted", typeDataClass=ModuleComponentData.class, min=0, max=-1, smAssociationClass=Metadata.ImpactedSmDependency.class)
     List<SmObjectImpl> mImpacted = null;

    @objid ("42e1d36c-3123-4483-a330-0aa83b500e14")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00182518-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("93ccf2da-8145-4cad-8ac0-f091381d5825")
        private static SmClass smClass = null;

        @objid ("63da7d56-73fe-45bd-bf86-733786e2788a")
        private static SmAttribute LicenseKeyAtt = null;

        @objid ("d0e52e75-cb71-46f0-bca9-9a0fc354c1dd")
        private static SmAttribute MajVersionAtt = null;

        @objid ("f02a5fda-4357-47f3-a401-bbc8968c2034")
        private static SmAttribute MinVersionAtt = null;

        @objid ("2068a47e-7450-4fe6-854d-7e19d486fedb")
        private static SmAttribute MinMinVersionAtt = null;

        @objid ("ed640a20-7e37-4567-af3c-ae2d240ad3b7")
        private static SmAttribute MinBinVersionCompatibilityAtt = null;

        @objid ("522640a5-844b-4f07-8c78-ea5ec0158552")
        private static SmAttribute JavaClassNameAtt = null;

        @objid ("5c723b0f-69b7-4625-a5da-74aac7296eb3")
        private static SmAttribute StateAtt = null;

        @objid ("fc8ddeb8-ebf9-44cc-ab88-96ee9ec9284e")
        private static SmDependency DefinedPropertyTypeDep = null;

        @objid ("23ca0c7c-80a0-4e9c-aead-7e118074a2c7")
        private static SmDependency OwnedProfileDep = null;

        @objid ("2c3e8d49-84d9-429b-b302-c8deebfb59af")
        private static SmDependency ModuleParameterDep = null;

        @objid ("98da5988-450d-42a6-9ed2-da6d912b620c")
        private static SmDependency DependsOnDep = null;

        @objid ("5e82cd85-701a-4ceb-97e6-b65b6976750e")
        private static SmDependency ImpactedDep = null;

        @objid ("f3ca66f0-dd7b-4fed-a0e4-6b430bbbf17a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModuleComponentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3d16d45f-aa43-4f80-a5c1-19b75601674d")
        public static SmAttribute LicenseKeyAtt() {
            if (LicenseKeyAtt == null) {
            	LicenseKeyAtt = classof().getAttributeDef("LicenseKey");
            }
            return LicenseKeyAtt;
        }

        @objid ("e14b3e91-e5cf-4275-87bb-36b09c3b28a6")
        public static SmAttribute MajVersionAtt() {
            if (MajVersionAtt == null) {
            	MajVersionAtt = classof().getAttributeDef("MajVersion");
            }
            return MajVersionAtt;
        }

        @objid ("b0748836-6d05-482d-b6c4-4266e9692f0b")
        public static SmAttribute MinVersionAtt() {
            if (MinVersionAtt == null) {
            	MinVersionAtt = classof().getAttributeDef("MinVersion");
            }
            return MinVersionAtt;
        }

        @objid ("978dc132-5ef5-4035-8d8a-2c33795d5d43")
        public static SmAttribute MinMinVersionAtt() {
            if (MinMinVersionAtt == null) {
            	MinMinVersionAtt = classof().getAttributeDef("MinMinVersion");
            }
            return MinMinVersionAtt;
        }

        @objid ("d2a5e048-c74d-4137-84e6-1ea2cd63152c")
        public static SmAttribute MinBinVersionCompatibilityAtt() {
            if (MinBinVersionCompatibilityAtt == null) {
            	MinBinVersionCompatibilityAtt = classof().getAttributeDef("MinBinVersionCompatibility");
            }
            return MinBinVersionCompatibilityAtt;
        }

        @objid ("00b52721-4427-429f-a460-1ca4fe90ef04")
        public static SmAttribute JavaClassNameAtt() {
            if (JavaClassNameAtt == null) {
            	JavaClassNameAtt = classof().getAttributeDef("JavaClassName");
            }
            return JavaClassNameAtt;
        }

        @objid ("c6a46732-a1e3-4dce-b970-6d359a5be3ed")
        public static SmAttribute StateAtt() {
            if (StateAtt == null) {
            	StateAtt = classof().getAttributeDef("State");
            }
            return StateAtt;
        }

        @objid ("40252347-a6d5-4292-b94d-2e71973c2238")
        public static SmDependency DefinedPropertyTypeDep() {
            if (DefinedPropertyTypeDep == null) {
            	DefinedPropertyTypeDep = classof().getDependencyDef("DefinedPropertyType");
            }
            return DefinedPropertyTypeDep;
        }

        @objid ("c5ffa9a3-d766-40e6-858b-41b27ca47c68")
        public static SmDependency OwnedProfileDep() {
            if (OwnedProfileDep == null) {
            	OwnedProfileDep = classof().getDependencyDef("OwnedProfile");
            }
            return OwnedProfileDep;
        }

        @objid ("3807ea7b-4561-4826-9332-76aa417f4790")
        public static SmDependency ModuleParameterDep() {
            if (ModuleParameterDep == null) {
            	ModuleParameterDep = classof().getDependencyDef("ModuleParameter");
            }
            return ModuleParameterDep;
        }

        @objid ("8b0b11aa-f642-4af2-b4e2-3b921228b2e7")
        public static SmDependency DependsOnDep() {
            if (DependsOnDep == null) {
            	DependsOnDep = classof().getDependencyDef("DependsOn");
            }
            return DependsOnDep;
        }

        @objid ("a7b73354-fc00-43ae-9e3c-35ed2eef9ad2")
        public static SmDependency ImpactedDep() {
            if (ImpactedDep == null) {
            	ImpactedDep = classof().getDependencyDef("Impacted");
            }
            return ImpactedDep;
        }

        @objid ("aca4eaf0-a7b3-4985-bb1f-1e845623cedb")
        public static SmAttribute getMajVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MajVersionAtt;
        }

        @objid ("00ee6403-728c-41f1-a896-f357d1544e63")
        public static SmDependency getImpactedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImpactedDep;
        }

        @objid ("301bb608-df9f-4508-8ac2-d475752bd694")
        public static SmDependency getDefinedPropertyTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedPropertyTypeDep;
        }

        @objid ("c6f07c8e-35f6-48bd-bfd6-fd94863658d6")
        public static SmAttribute getJavaClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return JavaClassNameAtt;
        }

        @objid ("e3e2d766-42f6-47a8-a98a-d8b7889eb0a1")
        public static SmDependency getModuleParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModuleParameterDep;
        }

        @objid ("8193d4aa-5fff-4caf-88ba-07d9d28d7ce4")
        public static SmAttribute getLicenseKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LicenseKeyAtt;
        }

        @objid ("ada75721-b2ad-4010-9219-ee983da52231")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a85b0f3b-3373-4ea6-b791-a64ad7a11980")
        public static SmAttribute getMinBinVersionCompatibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MinBinVersionCompatibilityAtt;
        }

        @objid ("8eae64f5-bf2d-4b27-bc98-51545ae9e56a")
        public static SmAttribute getMinMinVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MinMinVersionAtt;
        }

        @objid ("ab7f9a70-5e7b-42af-b4aa-80ad6e9d7f71")
        public static SmAttribute getStateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StateAtt;
        }

        @objid ("5ceb10d7-16b5-4e88-95ad-e623193523a4")
        public static SmDependency getOwnedProfileDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedProfileDep;
        }

        @objid ("9e34dc74-50bd-4b6d-ae44-9ca48f63965d")
        public static SmAttribute getMinVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MinVersionAtt;
        }

        @objid ("432f0203-3215-412f-b912-a4683c12527a")
        public static SmDependency getDependsOnDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnDep;
        }

        @objid ("0018638e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("76d59feb-128e-4883-9990-cc48d6706ec6")
            public ISmObjectData createData() {
                return new ModuleComponentData();
            }

            @objid ("8aec6bdf-fe04-410c-b825-701aa8213998")
            public SmObjectImpl createImpl() {
                return new ModuleComponentImpl();
            }

        }

        @objid ("0018c6e4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LicenseKeySmAttribute extends SmAttribute {
            @objid ("4496bce3-d614-48c7-93bd-a93c8e39e66d")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mLicenseKey;
            }

            @objid ("70dada0d-de0a-4a5e-84f0-49b5cab03c01")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mLicenseKey = value;
            }

        }

        @objid ("0019857a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MajVersionSmAttribute extends SmAttribute {
            @objid ("8a7ebcbb-f0fb-4aa6-9cee-e450f1d5fabb")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMajVersion;
            }

            @objid ("1f836efb-f04b-40f8-afc1-bec9d202eb3f")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMajVersion = value;
            }

        }

        @objid ("0019e754-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MinVersionSmAttribute extends SmAttribute {
            @objid ("b14062ea-74b6-4a8e-86a4-3f02b2e69b62")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMinVersion;
            }

            @objid ("88cee29a-2851-4560-9fb1-b0a3f51f2924")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMinVersion = value;
            }

        }

        @objid ("001a4802-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MinMinVersionSmAttribute extends SmAttribute {
            @objid ("c49d503b-2815-449e-a59b-5fdb182ac21e")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMinMinVersion;
            }

            @objid ("14e91f2d-d893-4522-8249-cc68347c73d6")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMinMinVersion = value;
            }

        }

        @objid ("001aa928-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MinBinVersionCompatibilitySmAttribute extends SmAttribute {
            @objid ("a25b280d-9f7d-42da-aaaa-13d91e02bf8f")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMinBinVersionCompatibility;
            }

            @objid ("1df97cc7-c1ae-4d5e-8e7d-29c138df1471")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMinBinVersionCompatibility = value;
            }

        }

        @objid ("001b6e9e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class JavaClassNameSmAttribute extends SmAttribute {
            @objid ("4d0672cd-c510-435c-94f8-33a7ddd4a5d5")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mJavaClassName;
            }

            @objid ("66b013e5-d7ed-48ae-b326-8917c3f5863b")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mJavaClassName = value;
            }

        }

        @objid ("001bd10e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StateSmAttribute extends SmAttribute {
            @objid ("14b0b9b6-8d45-49fb-970d-932ce613d0d6")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mState;
            }

            @objid ("da12437d-bf07-455c-ac47-b40f503ef9ad")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mState = value;
            }

        }

        @objid ("001d2824-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DependsOnSmDependency extends SmMultipleDependency {
            @objid ("938a82a6-5009-40b0-8f59-471d531a05b2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mDependsOn != null)? ((ModuleComponentData)data).mDependsOn:SmMultipleDependency.EMPTY;
            }

            @objid ("e4292df4-9d88-47b2-a0ee-bcd5ba1a9f54")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mDependsOn = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mDependsOn;
            }

            @objid ("e5194f86-3107-49c4-8db5-cad9a74b1217")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.ImpactedDep();
            }

        }

        @objid ("001d9430-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImpactedSmDependency extends SmMultipleDependency {
            @objid ("1dd046c6-aebe-442b-90f1-d5b8ca6dc35a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mImpacted != null)? ((ModuleComponentData)data).mImpacted:SmMultipleDependency.EMPTY;
            }

            @objid ("7ccbefbe-158a-45fd-a910-b596cd24bf5b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mImpacted = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mImpacted;
            }

            @objid ("098d9de6-39cd-4de1-864a-101151b4af24")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.DependsOnDep();
            }

        }

        @objid ("001dfc7c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedProfileSmDependency extends SmMultipleDependency {
            @objid ("17ffc7c3-b8ab-4c7b-866f-ef231216f166")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mOwnedProfile != null)? ((ModuleComponentData)data).mOwnedProfile:SmMultipleDependency.EMPTY;
            }

            @objid ("6ddd126f-24a3-47e9-8afb-03f21a923620")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mOwnedProfile = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mOwnedProfile;
            }

            @objid ("be942265-cfc4-49a4-bbd5-da4a23e6c652")
            @Override
            public SmDependency getSymetric() {
                return ProfileData.Metadata.OwnerModuleDep();
            }

        }

        @objid ("001e6432-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ModuleParameterSmDependency extends SmMultipleDependency {
            @objid ("09f822c7-12fc-4eef-839c-dc2351d13e4c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mModuleParameter != null)? ((ModuleComponentData)data).mModuleParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("2f676586-fd39-43db-a299-b2c2096927db")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mModuleParameter = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mModuleParameter;
            }

            @objid ("26e30ffa-1e41-457f-abee-9e86a412d3e9")
            @Override
            public SmDependency getSymetric() {
                return ModuleParameterData.Metadata.OwnerDep();
            }

        }

        @objid ("0075f8c8-ec98-1098-b22e-001ec947cd2a")
        public static class DefinedPropertyTypeSmDependency extends SmMultipleDependency {
            @objid ("ac1870b6-0975-49aa-86ca-b621a5cfe279")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mDefinedPropertyType != null)? ((ModuleComponentData)data).mDefinedPropertyType:SmMultipleDependency.EMPTY;
            }

            @objid ("aab4e9eb-d36e-4e85-bb7a-5ee86c733d82")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mDefinedPropertyType = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mDefinedPropertyType;
            }

            @objid ("51617388-6879-47ed-a7ab-47d368f8b554")
            @Override
            public SmDependency getSymetric() {
                return PropertyTypeData.Metadata.ModuleOwnerDep();
            }

        }

    }

}
