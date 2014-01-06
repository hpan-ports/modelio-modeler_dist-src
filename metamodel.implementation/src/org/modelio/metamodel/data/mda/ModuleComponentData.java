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
    @objid ("71d6a989-a785-419a-95c8-019fd781e5e8")
    @SmaMetaAttribute(metaName="LicenseKey", type=Integer.class, smAttributeClass=Metadata.LicenseKeySmAttribute.class)
     Object mLicenseKey = 0;

    @objid ("40f24f1b-1622-4d00-af31-ed755f60ee6a")
    @SmaMetaAttribute(metaName="MajVersion", type=Integer.class, smAttributeClass=Metadata.MajVersionSmAttribute.class)
     Object mMajVersion = 0;

    @objid ("5da127ad-e372-45af-8579-d13636eeb5e2")
    @SmaMetaAttribute(metaName="MinVersion", type=Integer.class, smAttributeClass=Metadata.MinVersionSmAttribute.class)
     Object mMinVersion = 0;

    @objid ("754431f9-878a-46b0-ace8-0687933a709e")
    @SmaMetaAttribute(metaName="MinMinVersion", type=String.class, smAttributeClass=Metadata.MinMinVersionSmAttribute.class)
     Object mMinMinVersion = "";

    @objid ("9e6fff41-904a-48b3-b4a6-66be7d02628a")
    @SmaMetaAttribute(metaName="MinBinVersionCompatibility", type=String.class, smAttributeClass=Metadata.MinBinVersionCompatibilitySmAttribute.class)
     Object mMinBinVersionCompatibility = "";

    @objid ("15a39c9f-7de1-4f7f-94ea-8f4467cf410b")
    @SmaMetaAttribute(metaName="JavaClassName", type=String.class, smAttributeClass=Metadata.JavaClassNameSmAttribute.class)
     Object mJavaClassName = "";

    @objid ("c6abbfd6-f68c-4624-88d4-9698262edcb8")
    @SmaMetaAttribute(metaName="State", type=ModuleState.class, smAttributeClass=Metadata.StateSmAttribute.class, einoexternalize=true)
     Object mState = ModuleState.SOMODULESTATEACTIVATED;

    @objid ("3f642aee-e1d8-4408-97ea-166b774299b4")
    @SmaMetaAssociation(metaName="DefinedPropertyType", typeDataClass=PropertyTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedPropertyTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedPropertyType = null;

    @objid ("903746e6-e041-430c-b4bb-572fb6686375")
    @SmaMetaAssociation(metaName="OwnedProfile", typeDataClass=ProfileData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedProfileSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedProfile = null;

    @objid ("8718ada4-a200-41c2-b89e-1ef549a35238")
    @SmaMetaAssociation(metaName="ModuleParameter", typeDataClass=ModuleParameterData.class, min=0, max=-1, smAssociationClass=Metadata.ModuleParameterSmDependency.class, component = true)
     List<SmObjectImpl> mModuleParameter = null;

    @objid ("71aed06e-07fe-4084-928a-749ed3b64f69")
    @SmaMetaAssociation(metaName="DependsOn", typeDataClass=ModuleComponentData.class, min=0, max=-1, smAssociationClass=Metadata.DependsOnSmDependency.class, partof = true)
     List<SmObjectImpl> mDependsOn = null;

    @objid ("df65331e-8dfd-44ea-afa9-b5fbd60bc627")
    @SmaMetaAssociation(metaName="Impacted", typeDataClass=ModuleComponentData.class, min=0, max=-1, smAssociationClass=Metadata.ImpactedSmDependency.class)
     List<SmObjectImpl> mImpacted = null;

    @objid ("ca4fdec2-84e5-4c00-aca9-ef6f452d6ce8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00182518-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ffdf04a7-1ad5-45bd-8b5d-e08993ca01f1")
        private static SmClass smClass = null;

        @objid ("175e4ae5-842c-45a9-8501-f08bcf40c0bb")
        private static SmAttribute LicenseKeyAtt = null;

        @objid ("b5044c03-03c0-4f33-be0a-1f77631bac89")
        private static SmAttribute MajVersionAtt = null;

        @objid ("f33fba61-738e-4fe1-9dd5-b65fa3db09d0")
        private static SmAttribute MinVersionAtt = null;

        @objid ("5e4245ec-ad62-428f-b921-c08b70d14ee6")
        private static SmAttribute MinMinVersionAtt = null;

        @objid ("9d92763e-0521-4837-9400-b9f00aca4856")
        private static SmAttribute MinBinVersionCompatibilityAtt = null;

        @objid ("22db5b03-c385-4c02-a623-dd66dc4baa7e")
        private static SmAttribute JavaClassNameAtt = null;

        @objid ("0176784e-3878-4cb2-946f-83777c1821a2")
        private static SmAttribute StateAtt = null;

        @objid ("c7121b8c-5718-40d4-a3ca-80170d604e81")
        private static SmDependency DefinedPropertyTypeDep = null;

        @objid ("0f36447d-9fe0-44fe-bca8-0c4d7a5b3e9d")
        private static SmDependency OwnedProfileDep = null;

        @objid ("419185dc-645c-4f78-99e8-093e32cd7062")
        private static SmDependency ModuleParameterDep = null;

        @objid ("55cf38ec-9d60-4bd2-9a38-88c5d9cea6f5")
        private static SmDependency DependsOnDep = null;

        @objid ("1c649232-1981-4405-ae9f-625eec882ac6")
        private static SmDependency ImpactedDep = null;

        @objid ("9093ee8b-7058-48e5-93e4-bae19f8216aa")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModuleComponentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("40dae54a-469c-4fd1-aaa2-24d6d65a0e47")
        public static SmAttribute LicenseKeyAtt() {
            if (LicenseKeyAtt == null) {
            	LicenseKeyAtt = classof().getAttributeDef("LicenseKey");
            }
            return LicenseKeyAtt;
        }

        @objid ("1d5acb7f-5426-48f4-8638-6d4b6035939f")
        public static SmAttribute MajVersionAtt() {
            if (MajVersionAtt == null) {
            	MajVersionAtt = classof().getAttributeDef("MajVersion");
            }
            return MajVersionAtt;
        }

        @objid ("b73dfff0-84ff-498e-be13-d44fb00f9415")
        public static SmAttribute MinVersionAtt() {
            if (MinVersionAtt == null) {
            	MinVersionAtt = classof().getAttributeDef("MinVersion");
            }
            return MinVersionAtt;
        }

        @objid ("1a753686-aba1-4dac-a9ce-701c33250535")
        public static SmAttribute MinMinVersionAtt() {
            if (MinMinVersionAtt == null) {
            	MinMinVersionAtt = classof().getAttributeDef("MinMinVersion");
            }
            return MinMinVersionAtt;
        }

        @objid ("e8ebd436-054f-4595-99d7-c51f7d39579a")
        public static SmAttribute MinBinVersionCompatibilityAtt() {
            if (MinBinVersionCompatibilityAtt == null) {
            	MinBinVersionCompatibilityAtt = classof().getAttributeDef("MinBinVersionCompatibility");
            }
            return MinBinVersionCompatibilityAtt;
        }

        @objid ("d1fcbac2-9673-4f2c-9712-1f1a4897c4e1")
        public static SmAttribute JavaClassNameAtt() {
            if (JavaClassNameAtt == null) {
            	JavaClassNameAtt = classof().getAttributeDef("JavaClassName");
            }
            return JavaClassNameAtt;
        }

        @objid ("10177b3a-3459-4c5c-b229-e75b70dcbb71")
        public static SmAttribute StateAtt() {
            if (StateAtt == null) {
            	StateAtt = classof().getAttributeDef("State");
            }
            return StateAtt;
        }

        @objid ("0a3e8935-cb3c-42cb-92ad-4263f11a79f7")
        public static SmDependency DefinedPropertyTypeDep() {
            if (DefinedPropertyTypeDep == null) {
            	DefinedPropertyTypeDep = classof().getDependencyDef("DefinedPropertyType");
            }
            return DefinedPropertyTypeDep;
        }

        @objid ("c4509e92-58fb-42de-bac4-0b71e10218fc")
        public static SmDependency OwnedProfileDep() {
            if (OwnedProfileDep == null) {
            	OwnedProfileDep = classof().getDependencyDef("OwnedProfile");
            }
            return OwnedProfileDep;
        }

        @objid ("66085d59-5c81-48dd-bc4a-23b9409059b0")
        public static SmDependency ModuleParameterDep() {
            if (ModuleParameterDep == null) {
            	ModuleParameterDep = classof().getDependencyDef("ModuleParameter");
            }
            return ModuleParameterDep;
        }

        @objid ("ac56f06e-ebb6-4a99-b96e-a8d0bf350ef6")
        public static SmDependency DependsOnDep() {
            if (DependsOnDep == null) {
            	DependsOnDep = classof().getDependencyDef("DependsOn");
            }
            return DependsOnDep;
        }

        @objid ("6dd70dd2-620d-493b-98c0-1b704cb85cb6")
        public static SmDependency ImpactedDep() {
            if (ImpactedDep == null) {
            	ImpactedDep = classof().getDependencyDef("Impacted");
            }
            return ImpactedDep;
        }

        @objid ("9380e93d-5bf4-4fa4-8d32-231f2639d963")
        public static SmDependency getOwnedProfileDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedProfileDep;
        }

        @objid ("44abac43-30f6-4ff7-aef3-b7675a5df7b2")
        public static SmDependency getDefinedPropertyTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedPropertyTypeDep;
        }

        @objid ("c13c7520-8f6a-4e3e-967a-464dbab2b8fa")
        public static SmAttribute getStateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StateAtt;
        }

        @objid ("3270591b-d7b2-4c1a-ab1b-7dfc93040465")
        public static SmAttribute getLicenseKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LicenseKeyAtt;
        }

        @objid ("a9107f66-6dce-4012-b40f-a543570b38fa")
        public static SmAttribute getJavaClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return JavaClassNameAtt;
        }

        @objid ("b0f69a5b-9712-43e8-a1c5-ff3cf58bc0f9")
        public static SmDependency getImpactedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImpactedDep;
        }

        @objid ("ba049b09-bdcc-4ff1-a127-3b65459e591a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f1a85cd6-7ce5-4754-b151-09b9efd8d91e")
        public static SmDependency getDependsOnDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DependsOnDep;
        }

        @objid ("dae16395-2838-4b68-9943-71df115a8737")
        public static SmDependency getModuleParameterDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModuleParameterDep;
        }

        @objid ("ab581f5b-123b-4b98-bcfa-b3cd69332d1b")
        public static SmAttribute getMinVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MinVersionAtt;
        }

        @objid ("4f4612e9-332b-4b38-9223-26f7c136087b")
        public static SmAttribute getMajVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MajVersionAtt;
        }

        @objid ("02929f38-df56-4741-92c5-457fdcfabe08")
        public static SmAttribute getMinMinVersionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MinMinVersionAtt;
        }

        @objid ("3c2c7e38-e285-409b-ab35-716616b1885a")
        public static SmAttribute getMinBinVersionCompatibilityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MinBinVersionCompatibilityAtt;
        }

        @objid ("0018638e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b3259ea9-7945-4e00-8050-8af8807ed854")
            public ISmObjectData createData() {
                return new ModuleComponentData();
            }

            @objid ("6053c057-b0fb-4b8e-b0af-5e75ba6bf9ab")
            public SmObjectImpl createImpl() {
                return new ModuleComponentImpl();
            }

        }

        @objid ("0018c6e4-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LicenseKeySmAttribute extends SmAttribute {
            @objid ("31ffaec9-a3fc-4d29-9a89-878f2e071a52")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mLicenseKey;
            }

            @objid ("33e5527f-de69-4cb9-afd6-8ceea0364303")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mLicenseKey = value;
            }

        }

        @objid ("0019857a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MajVersionSmAttribute extends SmAttribute {
            @objid ("03560d58-e0e6-4715-94de-eb11822d9113")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMajVersion;
            }

            @objid ("7a530aff-3503-4e92-9692-0a4e04f96afc")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMajVersion = value;
            }

        }

        @objid ("0019e754-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MinVersionSmAttribute extends SmAttribute {
            @objid ("ac2e9656-f91a-465a-98ae-036a5fdccbca")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMinVersion;
            }

            @objid ("9e064b2d-9d93-4685-83eb-3cb851e5211f")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMinVersion = value;
            }

        }

        @objid ("001a4802-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MinMinVersionSmAttribute extends SmAttribute {
            @objid ("e90f05fa-aeeb-4ed7-91cd-8d8d112aa883")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMinMinVersion;
            }

            @objid ("2056cf77-005a-45b7-a763-ad437a3c681e")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMinMinVersion = value;
            }

        }

        @objid ("001aa928-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MinBinVersionCompatibilitySmAttribute extends SmAttribute {
            @objid ("80a5f77f-1253-4566-9e22-c38cbb570171")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mMinBinVersionCompatibility;
            }

            @objid ("c9f232c3-aff5-4a3e-b9b9-430899162bcd")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mMinBinVersionCompatibility = value;
            }

        }

        @objid ("001b6e9e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class JavaClassNameSmAttribute extends SmAttribute {
            @objid ("d71ca9ee-edd0-41d9-bf1e-c546b5cf7490")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mJavaClassName;
            }

            @objid ("99088b18-e9a7-40c4-8714-2da373300999")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mJavaClassName = value;
            }

        }

        @objid ("001bd10e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class StateSmAttribute extends SmAttribute {
            @objid ("cde576b9-bcf3-409e-954b-1df923419251")
            public Object getValue(ISmObjectData data) {
                return ((ModuleComponentData) data).mState;
            }

            @objid ("ee20c7e4-68b7-47ed-be1c-e23252c3ed52")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleComponentData) data).mState = value;
            }

        }

        @objid ("001d2824-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DependsOnSmDependency extends SmMultipleDependency {
            @objid ("cf1dcbdf-2087-4169-baae-226c02026318")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mDependsOn != null)? ((ModuleComponentData)data).mDependsOn:SmMultipleDependency.EMPTY;
            }

            @objid ("345352cc-d72a-42e5-b7de-f1ef8441569a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mDependsOn = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mDependsOn;
            }

            @objid ("dc8dc164-e466-4d39-9f96-235a25455980")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.ImpactedDep();
            }

        }

        @objid ("001d9430-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImpactedSmDependency extends SmMultipleDependency {
            @objid ("8167de58-ae7f-4a7b-8b81-54dc35c6adcd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mImpacted != null)? ((ModuleComponentData)data).mImpacted:SmMultipleDependency.EMPTY;
            }

            @objid ("6d034c36-a7d6-49e7-a688-36a4cecff639")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mImpacted = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mImpacted;
            }

            @objid ("1611fc63-55ff-41fb-b85c-5bd9bc528226")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.DependsOnDep();
            }

        }

        @objid ("001dfc7c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnedProfileSmDependency extends SmMultipleDependency {
            @objid ("f912c5fe-fae8-4d52-a0d7-5b180d2ad014")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mOwnedProfile != null)? ((ModuleComponentData)data).mOwnedProfile:SmMultipleDependency.EMPTY;
            }

            @objid ("6bc196b7-12c8-4c8a-ade8-67cdb324d734")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mOwnedProfile = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mOwnedProfile;
            }

            @objid ("22c46f48-e6a2-4af0-8962-d1399132fdc8")
            @Override
            public SmDependency getSymetric() {
                return ProfileData.Metadata.OwnerModuleDep();
            }

        }

        @objid ("001e6432-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ModuleParameterSmDependency extends SmMultipleDependency {
            @objid ("111ba556-e0d7-441a-9761-08494dacb815")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mModuleParameter != null)? ((ModuleComponentData)data).mModuleParameter:SmMultipleDependency.EMPTY;
            }

            @objid ("500b17e2-923f-46c4-a9fc-2d656c2714ab")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mModuleParameter = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mModuleParameter;
            }

            @objid ("bf2c5eb4-7e08-48c8-a273-2953bde42881")
            @Override
            public SmDependency getSymetric() {
                return ModuleParameterData.Metadata.OwnerDep();
            }

        }

        @objid ("0075f8c8-ec98-1098-b22e-001ec947cd2a")
        public static class DefinedPropertyTypeSmDependency extends SmMultipleDependency {
            @objid ("51ebd5a1-b065-408e-83fd-bafae7760600")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModuleComponentData)data).mDefinedPropertyType != null)? ((ModuleComponentData)data).mDefinedPropertyType:SmMultipleDependency.EMPTY;
            }

            @objid ("2632f587-3119-4b49-bf1b-58d87f957788")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModuleComponentData) data).mDefinedPropertyType = new ArrayList<>(initialCapacity);
                return ((ModuleComponentData) data).mDefinedPropertyType;
            }

            @objid ("b904079a-1b30-4910-a8f4-4e0310018215")
            @Override
            public SmDependency getSymetric() {
                return PropertyTypeData.Metadata.ModuleOwnerDep();
            }

        }

    }

}
