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
    @objid ("bcad952f-829b-4a69-99e4-b0e8f3412f78")
    @SmaMetaAttribute(metaName="LicenseKey", type=Integer.class, smAttributeClass=Metadata.LicenseKeySmAttribute.class)
     Object mLicenseKey = 0;

    @objid ("51d458d5-1d00-4814-9158-49ae7a54bdce")
    @SmaMetaAttribute(metaName="MajVersion", type=Integer.class, smAttributeClass=Metadata.MajVersionSmAttribute.class)
     Object mMajVersion = 0;

    @objid ("d4499f2b-e055-4ea1-adce-595791eb80ac")
    @SmaMetaAttribute(metaName="MinVersion", type=Integer.class, smAttributeClass=Metadata.MinVersionSmAttribute.class)
     Object mMinVersion = 0;

    @objid ("4213f67a-2835-467c-a49e-5cb5a5e846e6")
    @SmaMetaAttribute(metaName="MinMinVersion", type=String.class, smAttributeClass=Metadata.MinMinVersionSmAttribute.class)
     Object mMinMinVersion = "";

    @objid ("6c752fbf-2654-4aeb-b891-5c13cbd71d6f")
    @SmaMetaAttribute(metaName="MinBinVersionCompatibility", type=String.class, smAttributeClass=Metadata.MinBinVersionCompatibilitySmAttribute.class)
     Object mMinBinVersionCompatibility = "";

    @objid ("7c13deb9-8f09-4be1-9dce-8e52e9459160")
    @SmaMetaAttribute(metaName="JavaClassName", type=String.class, smAttributeClass=Metadata.JavaClassNameSmAttribute.class)
     Object mJavaClassName = "";

    @objid ("026fb69e-6f68-42ae-bf80-c111171f5d12")
    @SmaMetaAttribute(metaName="State", type=ModuleState.class, smAttributeClass=Metadata.StateSmAttribute.class, einoexternalize=true)
     Object mState = ModuleState.SOMODULESTATEACTIVATED;

    @objid ("cc6d55fe-9a6a-4440-939a-f7e986fa8544")
    @SmaMetaAssociation(metaName="DefinedPropertyType", typeDataClass=PropertyTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedPropertyTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedPropertyType = null;

    @objid ("0894c909-60e9-48f0-89ae-77aebdc8b70d")
    @SmaMetaAssociation(metaName="OwnedProfile", typeDataClass=ProfileData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedProfileSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedProfile = null;

    @objid ("04ba2169-d04b-449a-a4fb-be14ab7f2bb3")
    @SmaMetaAssociation(metaName="ModuleParameter", typeDataClass=ModuleParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ModuleParameterSmDependency.class, component = true)
     List<SmObjectImpl> mModuleParameter = null;

    @objid ("8e7ca51e-cabb-45ed-8f17-cd04e4bb4f64")
    @SmaMetaAssociation(metaName="DependsOn", typeDataClass=ModuleComponentData.class, min=0, max=-1, smAssociationClass=Metadata.DependsOnSmDependency.class, partof = true)
     List<SmObjectImpl> mDependsOn = null;

    @objid ("6a3b322e-2936-432b-b471-0618b7fcbef2")
    @SmaMetaAssociation(metaName="Impacted", typeDataClass=ModuleComponentData.class, min=0, max=-1, smAssociationClass=Metadata.ImpactedSmDependency.class)
     List<SmObjectImpl> mImpacted = null;

    @objid ("39e843ec-cc6b-45c3-a954-e43f72ab7438")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00182518-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8639fd11-527a-4f78-bff4-bf8e7b40907c")
        private static SmClass smClass = null;

        @objid ("ad0b7e1b-59a4-44eb-8bfd-813c2193e22a")
        private static SmAttribute LicenseKeyAtt = null;

        @objid ("59fc0637-ed02-44ae-85ea-44bdd1db7176")
        private static SmAttribute MajVersionAtt = null;

        @objid ("3942a3da-98bf-441b-95f3-f4580f706903")
        private static SmAttribute MinVersionAtt = null;

        @objid ("108eb248-d8b3-4f75-84ef-93ffcc653834")
        private static SmAttribute MinMinVersionAtt = null;

        @objid ("1e7d8a64-664c-446a-b2d9-53a4c8d9a569")
        private static SmAttribute MinBinVersionCompatibilityAtt = null;

        @objid ("0981fded-bc23-4511-9d49-3411fdf3f8e9")
        private static SmAttribute JavaClassNameAtt = null;

        @objid ("28d21b02-be4a-48dd-9cd6-67a8af18832d")
        private static SmAttribute StateAtt = null;

        @objid ("07744167-ba60-429a-b19d-bc40f5cc9d06")
        private static SmDependency DefinedPropertyTypeDep = null;

        @objid ("2ba9da37-03cb-44fe-b7ed-e6eb9cf4dd23")
        private static SmDependency OwnedProfileDep = null;

        @objid ("00dd12b8-b0fa-4b20-ae8d-5abe5cb2db3d")
        private static SmDependency ModuleParameterDep = null;

        @objid ("015a914e-ad04-482b-8024-78557062d7a3")
        private static SmDependency DependsOnDep = null;

        @objid ("b024a778-22eb-47ae-85f1-562efaa0831d")
        private static SmDependency ImpactedDep = null;

        @objid ("2563020f-5163-4c43-8d16-576e7acd0bf3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModuleComponentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("727a2612-6b74-4c20-8dcc-fa18db568c00")
        public static SmAttribute LicenseKeyAtt() {
            if (LicenseKeyAtt == null) {
            	LicenseKeyAtt = classof().getAttributeDef("LicenseKey");
            }
            return LicenseKeyAtt;
        }

        @objid ("175d7a35-72f5-4322-b85a-d57ace57fe36")
        public static SmAttribute MajVersionAtt() {
            if (MajVersionAtt == null) {
            	MajVersionAtt = classof().getAttributeDef("MajVersion");
            }
            return MajVersionAtt;
        }

        @objid ("b6cb096c-c038-4213-aab0-0c36c874fdf6")
        public static SmAttribute MinVersionAtt() {
            if (MinVersionAtt == null) {
            	MinVersionAtt = classof().getAttributeDef("MinVersion");
            }
            return MinVersionAtt;
        }

        @objid ("b28e90a6-54fb-4e1c-baaa-5c4c60326072")
        public static SmAttribute MinMinVersionAtt() {
            if (MinMinVersionAtt == null) {
            	MinMinVersionAtt = classof().getAttributeDef("MinMinVersion");
            }
            return MinMinVersionAtt;
        }

        @objid ("d227f4ee-a36b-403d-946b-befea18e9af9")
        public static SmAttribute MinBinVersionCompatibilityAtt() {
            if (MinBinVersionCompatibilityAtt == null) {
            	MinBinVersionCompatibilityAtt = classof().getAttributeDef("MinBinVersionCompatibility");
            }
            return MinBinVersionCompatibilityAtt;
        }

        @objid ("7a00d3aa-5c68-4741-95b3-e14527260a1e")
        public static SmAttribute JavaClassNameAtt() {
            if (JavaClassNameAtt == null) {
            	JavaClassNameAtt = classof().getAttributeDef("JavaClassName");
            }
            return JavaClassNameAtt;
        }

        @objid ("3ddf4645-0bad-4fb9-89f7-b62e42f4a391")
        public static SmAttribute StateAtt() {
            if (StateAtt == null) {
            	StateAtt = classof().getAttributeDef("State");
            }
            return StateAtt;
        }

        @objid ("5a8d0e71-d2e5-40f7-8969-2aec584ee7ae")
        public static SmDependency DefinedPropertyTypeDep() {
            if (DefinedPropertyTypeDep == null) {
            	DefinedPropertyTypeDep = classof().getDependencyDef("DefinedPropertyType");
            }
            return DefinedPropertyTypeDep;
        }

        @objid ("92b74026-6f35-420d-b46e-4c18cbc0e9f9")
        public static SmDependency OwnedProfileDep() {
            if (OwnedProfileDep == null) {
            	OwnedProfileDep = classof().getDependencyDef("OwnedProfile");
            }
            return OwnedProfileDep;
        }

        @objid ("984afe05-0511-4c48-a89b-01f7332f1675")
        public static SmDependency ModuleParameterDep() {
            if (ModuleParameterDep == null) {
            	ModuleParameterDep = classof().getDependencyDef("ModuleParameter");
            }
            return ModuleParameterDep;
        }

        @objid ("19af281e-98be-411b-88dc-0faa3bd333a1")
        public static SmDependency DependsOnDep() {
            if (DependsOnDep == null) {
            	DependsOnDep = classof().getDependencyDef("DependsOn");
            }
            return DependsOnDep;
        }

        @objid ("f08c675f-5373-46b9-a4fc-ddca07242eb4")
        public static SmDependency ImpactedDep() {
            if (ImpactedDep == null) {
            	ImpactedDep = classof().getDependencyDef("Impacted");
            }
            return ImpactedDep;
        }

        @objid ("e798e3e6-abf3-4589-b708-e16eb13f4e97")
        public static SmDependency getModuleParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModuleParameterDep;
        }

        @objid ("82917b42-beb6-435b-a007-839b4eebf2a1")
        public static SmDependency getDependsOnDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnDep;
        }

        @objid ("2919ce84-b329-4d0a-a53b-ffd1c318b305")
        public static SmAttribute getJavaClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return JavaClassNameAtt;
        }

        @objid ("0c97063d-c4f5-44e6-921b-f46f71f7d6b5")
        public static SmAttribute getLicenseKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LicenseKeyAtt;
        }

        @objid ("a3dd1ea6-4074-4c5e-be3b-7dd68caef541")
        public static SmDependency getOwnedProfileDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedProfileDep;
        }

        @objid ("d0d82f64-96cf-4b91-bcc3-920fd6d6d2ee")
        public static SmAttribute getStateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StateAtt;
        }

        @objid ("485baf80-dab6-44f6-b4ee-ced0c13e961a")
        public static SmAttribute getMinBinVersionCompatibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MinBinVersionCompatibilityAtt;
        }

        @objid ("354b6b50-9a56-4f68-9bd3-e07721d71917")
        public static SmDependency getImpactedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImpactedDep;
        }

        @objid ("41adc40d-4efb-45f5-9302-5e80805f8b61")
        public static SmAttribute getMinMinVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MinMinVersionAtt;
        }

        @objid ("3e0f0a19-336e-47b4-8060-bd99f61e4f74")
        public static SmAttribute getMajVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MajVersionAtt;
        }

        @objid ("14cc5cc8-95cb-4ae2-841e-cbdbbb656644")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c0d717d6-abda-49f6-8770-4fa10e6040e8")
        public static SmDependency getDefinedPropertyTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedPropertyTypeDep;
        }

        @objid ("49f8b879-75a7-4c4b-8c98-4682c5eb6133")
        public static SmAttribute getMinVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MinVersionAtt;
        }

        @objid ("0018638e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5b33c793-39e5-4a7e-85b0-81498e5a6ebc")
            public ISmObjectData createData() {
                return new ModuleComponentData();
            }

            @objid ("4715a995-0f4b-41cc-b9b3-fd62be451e24")
            public SmObjectImpl createImpl() {
                return new ModuleComponentImpl();
            }

        }

        @objid ("0018c6e4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LicenseKeySmAttribute extends SmAttribute {
            @objid ("0187a59f-b26f-4277-81c1-bc7d7f48e665")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mLicenseKey;
            }

            @objid ("cfa626f3-60b1-43f7-b1a2-fc91d7670086")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mLicenseKey = value;
            }

        }

        @objid ("0019857a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MajVersionSmAttribute extends SmAttribute {
            @objid ("83ae3387-cffe-4ec4-a5f5-e039488681ee")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMajVersion;
            }

            @objid ("a8dfc7fd-013e-4eee-a003-a4f46588c9ae")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMajVersion = value;
            }

        }

        @objid ("0019e754-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MinVersionSmAttribute extends SmAttribute {
            @objid ("2853fff8-bb63-4d98-b0d4-72e9014ac0ad")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMinVersion;
            }

            @objid ("b041b1b2-5983-4e3c-aee6-21f77a739559")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMinVersion = value;
            }

        }

        @objid ("001a4802-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MinMinVersionSmAttribute extends SmAttribute {
            @objid ("4caedf2b-b1b4-486b-8e15-6215acf2fd0b")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMinMinVersion;
            }

            @objid ("686bb65e-6170-442a-a572-a277fca5180e")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMinMinVersion = value;
            }

        }

        @objid ("001aa928-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MinBinVersionCompatibilitySmAttribute extends SmAttribute {
            @objid ("f4c23fdb-8692-4162-8fbe-559d4f3e8daa")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMinBinVersionCompatibility;
            }

            @objid ("e1ee1c01-3f87-42b8-9b99-2ef986f5a511")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMinBinVersionCompatibility = value;
            }

        }

        @objid ("001b6e9e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class JavaClassNameSmAttribute extends SmAttribute {
            @objid ("fd264cfa-3f35-4a93-8515-a67041b30f5c")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mJavaClassName;
            }

            @objid ("aa253636-8131-46a6-8d39-8bf673763529")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mJavaClassName = value;
            }

        }

        @objid ("001bd10e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StateSmAttribute extends SmAttribute {
            @objid ("c93e4b87-a154-41da-b16a-707e2fdaf800")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mState;
            }

            @objid ("5eb69418-6dd2-4095-9f2f-ce9d1261a46a")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mState = value;
            }

        }

        @objid ("001d2824-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DependsOnSmDependency extends SmMultipleDependency {
            @objid ("e825d60a-512e-4f99-adf7-9f0392848743")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mDependsOn != null)? ((ModuleComponentData)data).mDependsOn:SmMultipleDependency.EMPTY;
            }

            @objid ("95c64ee8-e14d-4ebb-bd00-8952c3347b39")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mDependsOn = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mDependsOn;
            }

            @objid ("56f3c714-8b45-4957-a429-fd5b1f06516e")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.ImpactedDep();
            }

        }

        @objid ("001d9430-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImpactedSmDependency extends SmMultipleDependency {
            @objid ("76fda374-7476-474c-ac51-5759f2da798d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mImpacted != null)? ((ModuleComponentData)data).mImpacted:SmMultipleDependency.EMPTY;
            }

            @objid ("6f196296-a333-4e4d-a3cc-7ae05f47129a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mImpacted = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mImpacted;
            }

            @objid ("d21ba8f4-8007-49ce-a379-0fecb4ecd370")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.DependsOnDep();
            }

        }

        @objid ("001dfc7c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedProfileSmDependency extends SmMultipleDependency {
            @objid ("3e56ab90-223a-4e6d-91e9-64dd6fd14d0c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mOwnedProfile != null)? ((ModuleComponentData)data).mOwnedProfile:SmMultipleDependency.EMPTY;
            }

            @objid ("21a584da-4e3f-419a-9a24-e97f8f8d3cab")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mOwnedProfile = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mOwnedProfile;
            }

            @objid ("b2bacd55-fc11-4bff-8c66-29d23274aafe")
            @Override
            public SmDependency getSymetric() {
                return ProfileData.Metadata.OwnerModuleDep();
            }

        }

        @objid ("001e6432-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ModuleParameterSmDependency extends SmMultipleDependency {
            @objid ("e6d90d9a-99c4-4c86-9ef9-4cac789738f0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mModuleParameter != null)? ((ModuleComponentData)data).mModuleParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("fe386daf-c47d-4af6-9a29-db2d12e0391e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mModuleParameter = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mModuleParameter;
            }

            @objid ("557e9cfe-7468-4412-89d0-289645b94068")
            @Override
            public SmDependency getSymetric() {
                return ModuleParameterData.Metadata.OwnerDep();
            }

        }

        @objid ("0075f8c8-ec98-1098-b22e-001ec947cd2a")
        public static class DefinedPropertyTypeSmDependency extends SmMultipleDependency {
            @objid ("a7f77353-eb66-4f63-82ce-10ef92b359e0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mDefinedPropertyType != null)? ((ModuleComponentData)data).mDefinedPropertyType:SmMultipleDependency.EMPTY;
            }

            @objid ("f0e4ee8c-5749-4391-aff4-ba1919b66c55")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mDefinedPropertyType = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mDefinedPropertyType;
            }

            @objid ("98de6cb4-07b7-4a19-8e22-270b9c3ac0af")
            @Override
            public SmDependency getSymetric() {
                return PropertyTypeData.Metadata.ModuleOwnerDep();
            }

        }

    }

}
