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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.mda.ModuleComponentData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.mda.ModuleParameterImpl;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.ModuleParameterType;
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

@objid ("00653042-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ModuleParameter.class, factory=ModuleParameterData.Metadata.ObjectFactory.class)
public class ModuleParameterData extends ModelElementData {
    @objid ("066051b7-ebc7-4892-8d8b-6941063d0d97")
    @SmaMetaAttribute(metaName="SetName", type=String.class, smAttributeClass=Metadata.SetNameSmAttribute.class)
     Object mSetName = "";

    @objid ("ecc7816f-c1cb-4b8a-bbb2-c29be12b928d")
    @SmaMetaAttribute(metaName="AssociatedType", type=ModuleParameterType.class, smAttributeClass=Metadata.AssociatedTypeSmAttribute.class)
     Object mAssociatedType = ModuleParameterType.TYPE_PARAM_STRING;

    @objid ("5a89e717-9157-4d78-a3f3-9f08454ca191")
    @SmaMetaAttribute(metaName="IsUserRead", type=Boolean.class, smAttributeClass=Metadata.IsUserReadSmAttribute.class, einoexternalize=true)
     Object mIsUserRead = true;

    @objid ("90db0d4b-fa7c-4b73-b8b5-2381fe8e2a7a")
    @SmaMetaAttribute(metaName="IsUserWrite", type=Boolean.class, smAttributeClass=Metadata.IsUserWriteSmAttribute.class, einoexternalize=true)
     Object mIsUserWrite = true;

    @objid ("b33ed565-f832-417a-a41e-8ba482974bcf")
    @SmaMetaAttribute(metaName="IsApiRead", type=Boolean.class, smAttributeClass=Metadata.IsApiReadSmAttribute.class, einoexternalize=true)
     Object mIsApiRead = true;

    @objid ("4b4687e7-fa8d-4bad-b657-70867500c326")
    @SmaMetaAttribute(metaName="IsApiWrite", type=Boolean.class, smAttributeClass=Metadata.IsApiWriteSmAttribute.class, einoexternalize=true)
     Object mIsApiWrite = true;

    @objid ("b6533554-5d7b-4135-aadb-3d99b3a55f21")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("1c637888-5321-4fee-b9c4-48f7e84b3155")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModuleComponentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("7d33b9fb-74a1-4574-87bb-ffa562941764")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0047be2c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2292f4f8-4286-423a-baae-12c9bfd1aa4e")
        private static SmClass smClass = null;

        @objid ("3655070b-54fe-45b5-9acc-f5fc39197562")
        private static SmAttribute SetNameAtt = null;

        @objid ("58d8465d-aff9-4c2b-b863-0c03bb57f479")
        private static SmAttribute AssociatedTypeAtt = null;

        @objid ("1586e401-8ffe-493d-8f24-a9d01c8483f8")
        private static SmAttribute IsUserReadAtt = null;

        @objid ("21e7c04b-6b8b-4051-be6e-296cb315bf0e")
        private static SmAttribute IsUserWriteAtt = null;

        @objid ("b2a70f0e-4f1d-4e14-acd2-60f83b7d5132")
        private static SmAttribute IsApiReadAtt = null;

        @objid ("4a357f9c-f984-413f-a8ba-1136836e72e5")
        private static SmAttribute IsApiWriteAtt = null;

        @objid ("ecaf8481-a337-4837-96ff-04595bdc9fc7")
        private static SmDependency TypeDep = null;

        @objid ("26ce9974-84f0-48a8-b864-9fd0794e0022")
        private static SmDependency OwnerDep = null;

        @objid ("fd4bb074-bae6-4a02-81f5-5f1f942db070")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModuleParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("be6acd39-e242-4d8d-aedc-9de92700700e")
        public static SmAttribute SetNameAtt() {
            if (SetNameAtt == null) {
            	SetNameAtt = classof().getAttributeDef("SetName");
            }
            return SetNameAtt;
        }

        @objid ("683ab7e6-61ac-4abb-8fc9-1e628178b96f")
        public static SmAttribute AssociatedTypeAtt() {
            if (AssociatedTypeAtt == null) {
            	AssociatedTypeAtt = classof().getAttributeDef("AssociatedType");
            }
            return AssociatedTypeAtt;
        }

        @objid ("c0ad09bb-ac6c-4c7b-8bb2-5b6da25c4602")
        public static SmAttribute IsUserReadAtt() {
            if (IsUserReadAtt == null) {
            	IsUserReadAtt = classof().getAttributeDef("IsUserRead");
            }
            return IsUserReadAtt;
        }

        @objid ("a813da6a-c52c-49fc-84a3-352d369a01b0")
        public static SmAttribute IsUserWriteAtt() {
            if (IsUserWriteAtt == null) {
            	IsUserWriteAtt = classof().getAttributeDef("IsUserWrite");
            }
            return IsUserWriteAtt;
        }

        @objid ("59c1f1b2-ae47-4800-88e2-3899680a995d")
        public static SmAttribute IsApiReadAtt() {
            if (IsApiReadAtt == null) {
            	IsApiReadAtt = classof().getAttributeDef("IsApiRead");
            }
            return IsApiReadAtt;
        }

        @objid ("4336f561-68b5-4add-80c5-a00f9c57bdee")
        public static SmAttribute IsApiWriteAtt() {
            if (IsApiWriteAtt == null) {
            	IsApiWriteAtt = classof().getAttributeDef("IsApiWrite");
            }
            return IsApiWriteAtt;
        }

        @objid ("869be1a3-1cc6-4ff5-90e8-4345ca829668")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("c93a6e2c-cc1b-4500-a2dd-370fb9169b4b")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("86c5c559-1609-46a9-a46c-879375c42874")
        public static SmAttribute getSetNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SetNameAtt;
        }

        @objid ("3781dff9-a16b-44e6-a8a1-662628e81964")
        public static SmAttribute getAssociatedTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociatedTypeAtt;
        }

        @objid ("7b6d4b44-889b-4d57-ad0a-ee465498081d")
        public static SmAttribute getIsUserReadAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUserReadAtt;
        }

        @objid ("02f1f7a9-28ad-44a0-a932-45f3a57d36d5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("dfbb5cb0-8585-4791-bc2a-49c32736971b")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("649c13f8-d4bf-4226-bafb-4c96edce709d")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("5f799b14-eb33-41b0-b8fc-0a781592acbc")
        public static SmAttribute getIsUserWriteAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUserWriteAtt;
        }

        @objid ("6bb466aa-1f56-4494-99b5-4df373b494af")
        public static SmAttribute getIsApiWriteAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsApiWriteAtt;
        }

        @objid ("feccfdd7-5a5d-4266-b26a-ef4a4e4db7e9")
        public static SmAttribute getIsApiReadAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsApiReadAtt;
        }

        @objid ("0047fe1e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b04fdf26-c5a8-42ac-a04a-411edd670a02")
            public ISmObjectData createData() {
                return new ModuleParameterData();
            }

            @objid ("93650c65-ed93-4c31-bfb5-cbe5da51bf57")
            public SmObjectImpl createImpl() {
                return new ModuleParameterImpl();
            }

        }

        @objid ("00485ecc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SetNameSmAttribute extends SmAttribute {
            @objid ("135e8d41-f5ad-4e8c-acbd-a8c751ebe4cc")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mSetName;
            }

            @objid ("41b13145-b5df-4901-9bc7-fcaa017797f6")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mSetName = value;
            }

        }

        @objid ("0048be62-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AssociatedTypeSmAttribute extends SmAttribute {
            @objid ("75cbae33-1962-4248-a5c8-28a1b284e870")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mAssociatedType;
            }

            @objid ("37e55e91-20c3-4359-bcb6-d83fbcf2162a")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mAssociatedType = value;
            }

        }

        @objid ("004a603c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("0f59dc80-1fdd-4506-af34-7f4903261d3b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mOwner;
            }

            @objid ("8a8573f2-94c3-432e-afa2-e461e08c9da0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModuleParameterData) data).mOwner = value;
            }

            @objid ("e841983f-2fb7-4cb4-bb6f-d9f452b995a4")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.ModuleParameterDep();
            }

        }

        @objid ("004aeb92-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("88bfd4d8-8db8-4055-8275-6b0e0c21a3b7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mType;
            }

            @objid ("64cfc205-c3cc-4b31-aaf7-cecf7bb39b59")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModuleParameterData) data).mType = value;
            }

            @objid ("8294cf25-c58b-4a5f-b967-6cd2cd1e580a")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.OccurenceConfigParamDep();
            }

        }

        @objid ("cf091b60-f120-11e1-b078-001ec947ccaf")
        public static class IsUserReadSmAttribute extends SmAttribute {
            @objid ("f425ce91-9bab-4086-9ead-e2d7a1d658f1")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsUserRead;
            }

            @objid ("ba761de9-3c1e-49da-950d-d845f93d6110")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsUserRead = value;
            }

        }

        @objid ("cf2a7c08-f120-11e1-b078-001ec947ccaf")
        public static class IsUserWriteSmAttribute extends SmAttribute {
            @objid ("4d7af714-cf89-4ad1-b5bc-a3e391519de8")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsUserWrite;
            }

            @objid ("1865a77f-5114-4dc5-9cf1-eb92efa35016")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsUserWrite = value;
            }

        }

        @objid ("cf2a7c18-f120-11e1-b078-001ec947ccaf")
        public static class IsApiReadSmAttribute extends SmAttribute {
            @objid ("242e35ed-a1cd-4232-8540-849de76277eb")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsApiRead;
            }

            @objid ("3484288c-0b2c-4b2c-8d65-890e5970cdbe")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsApiRead = value;
            }

        }

        @objid ("cf2a7c28-f120-11e1-b078-001ec947ccaf")
        public static class IsApiWriteSmAttribute extends SmAttribute {
            @objid ("a094374c-fce7-45ec-9988-1bb115d7bd03")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsApiWrite;
            }

            @objid ("405aef72-8555-4822-90a9-ee6876a3a59b")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsApiWrite = value;
            }

        }

    }

}
