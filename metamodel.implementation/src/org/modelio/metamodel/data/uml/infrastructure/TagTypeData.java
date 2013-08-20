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
package org.modelio.metamodel.data.uml.infrastructure;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.MetaclassReferenceData;
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.data.uml.infrastructure.TaggedValueData;
import org.modelio.metamodel.impl.uml.infrastructure.TagTypeImpl;
import org.modelio.metamodel.uml.infrastructure.TagType;
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

@objid ("008fbe34-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=TagType.class, factory=TagTypeData.Metadata.ObjectFactory.class)
public class TagTypeData extends ModelElementData {
    @objid ("078baa04-3ed9-42a9-bcc8-01e2c7357074")
    @SmaMetaAssociation(metaName="TagOccurence", typeDataClass=TaggedValueData.class, min=0, max=-1, smAssociationClass=Metadata.TagOccurenceSmDependency.class, istodelete = true, performanceRisk = true)
     List<SmObjectImpl> mTagOccurence = null;

    @objid ("57a42ca0-8843-45f4-bff0-1c1c6305ae9e")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("f4a81ce9-a535-4e2c-9161-bdcf8a4e1245")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("7444b155-7e93-4e59-80ea-9123c3d708fc")
    @SmaMetaAttribute(metaName="ParamNumber", type=String.class, smAttributeClass=Metadata.ParamNumberSmAttribute.class)
     Object mParamNumber = "1";

    @objid ("d341258e-ba83-4b25-9e24-e13aec91b1d3")
    @SmaMetaAttribute(metaName="IsQualified", type=Boolean.class, smAttributeClass=Metadata.IsQualifiedSmAttribute.class)
     Object mIsQualified = false;

    @objid ("d7512c9d-e863-4b7f-a083-ad0118b540a2")
    @SmaMetaAttribute(metaName="BelongToPrototype", type=Boolean.class, smAttributeClass=Metadata.BelongToPrototypeSmAttribute.class)
     Object mBelongToPrototype = false;

    @objid ("11f1f85a-986d-4791-8fba-68c09a928c1b")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("79184644-18c1-46b5-99da-04662673eb29")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("522421df-0746-4d11-8788-947a44b06be3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("009058a8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("14ea5290-1574-44de-acff-75d77ed6fb7b")
        private static SmClass smClass = null;

        @objid ("a5b9c0cc-921e-4832-a4aa-8103f0012096")
        private static SmAttribute ParamNumberAtt = null;

        @objid ("23b187c8-1262-4718-adf1-ddf8382c7278")
        private static SmAttribute IsQualifiedAtt = null;

        @objid ("6d17c5e8-0932-4d6e-b65b-259c802a72e4")
        private static SmAttribute BelongToPrototypeAtt = null;

        @objid ("baed60cb-f757-4e92-9bbc-f44f4121ffb6")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("1c3c8cd1-8269-4d4b-b9b4-a71d40faa6af")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("c8df1af5-b40b-485c-948d-3375698d78a1")
        private static SmDependency TagOccurenceDep = null;

        @objid ("e44b5667-1d66-4001-9e3b-563990ffa7c7")
        private static SmDependency LocalTagOccurenceDep = null;

        @objid ("b116faad-975f-4ae7-9dda-9dd34f124265")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("f0acd04d-67d5-4497-ab59-9194870427a7")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("1369c75e-b197-418f-8eb2-4ac43d7d20c3")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TagTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("13602334-62e9-4e97-8ed6-7601448cc603")
        public static SmAttribute ParamNumberAtt() {
            if (ParamNumberAtt == null) {
                ParamNumberAtt = classof().getAttributeDef("ParamNumber");
            }
            return ParamNumberAtt;
        }

        @objid ("a9a33553-fe27-42b2-a571-37ecc702dc06")
        public static SmAttribute IsQualifiedAtt() {
            if (IsQualifiedAtt == null) {
                IsQualifiedAtt = classof().getAttributeDef("IsQualified");
            }
            return IsQualifiedAtt;
        }

        @objid ("cbc3b042-ccf5-4fba-9bf9-858771e6b019")
        public static SmAttribute BelongToPrototypeAtt() {
            if (BelongToPrototypeAtt == null) {
                BelongToPrototypeAtt = classof().getAttributeDef("BelongToPrototype");
            }
            return BelongToPrototypeAtt;
        }

        @objid ("d6370395-8656-48a9-90cf-160f298e5bf1")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
                IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("3dc95200-256a-4302-b042-2b5da68c2d09")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
                LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("40a1b8f4-b34a-40bd-993e-c9c5e2c6ece6")
        public static SmDependency TagOccurenceDep() {
            if (TagOccurenceDep == null) {
                TagOccurenceDep = classof().getDependencyDef("TagOccurence");
            }
            return TagOccurenceDep;
        }

        @objid ("a5ce3ca0-8cdb-4fea-9466-39f41004d1c2")
        public static SmDependency LocalTagOccurenceDep() {
            if (LocalTagOccurenceDep == null) {
                LocalTagOccurenceDep = classof().getDependencyDef("LocalTagOccurence");
            }
            return LocalTagOccurenceDep;
        }

        @objid ("27713009-ff07-4ce4-890e-f8b0bc38326f")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
                OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("0a56f79d-5d7d-4d21-853d-93ddd1e7d874")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
                OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("bf4c6f74-918a-4dee-9aa3-32a1666310bc")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("1b478f45-d348-4d51-81c7-c45d64605ac8")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("a23835e9-44b5-47de-8032-cbe0ff3d07c4")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("cd889e51-f6bd-476f-8af0-9293ff5c35da")
        public static SmAttribute getBelongToPrototypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BelongToPrototypeAtt;
        }

        @objid ("7a6a5604-85b1-4819-936f-1f60d8a46a50")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a0a2d5c5-c679-4bf7-b171-8cb0f6e46873")
        public static SmDependency getLocalTagOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LocalTagOccurenceDep;
        }

        @objid ("6318cf08-2ad9-46cf-b6ea-358c6943d8ac")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("e28f5f32-1773-4c55-adb4-985e4623b080")
        public static SmAttribute getParamNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParamNumberAtt;
        }

        @objid ("0a68f7e0-dece-42f5-916c-9ca003b538ec")
        public static SmAttribute getIsQualifiedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsQualifiedAtt;
        }

        @objid ("51a1f452-70bb-42ed-8971-7be99765443b")
        public static SmDependency getTagOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TagOccurenceDep;
        }

        @objid ("00909872-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b21133ca-3827-43c9-89ad-3234c588465a")
            public ISmObjectData createData() {
                return new TagTypeData();
            }

            @objid ("c7b22765-a9a2-4a63-a139-d3e765d1855a")
            public SmObjectImpl createImpl() {
                return new TagTypeImpl();
            }

        }

        @objid ("0090f9a2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParamNumberSmAttribute extends SmAttribute {
            @objid ("582754bd-03a8-4e1a-b674-425484c174d0")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mParamNumber;
            }

            @objid ("5e9e3984-e2d6-4b2f-8c46-c27aafd20544")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mParamNumber = value;
            }

        }

        @objid ("009159f6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsQualifiedSmAttribute extends SmAttribute {
            @objid ("39846d58-e08f-445a-8c28-1cd097a6c1af")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mIsQualified;
            }

            @objid ("513a64f7-e212-4405-8d39-37d431e4fabc")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mIsQualified = value;
            }

        }

        @objid ("0091bb62-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BelongToPrototypeSmAttribute extends SmAttribute {
            @objid ("d4cf3ca2-2de5-4b79-93b7-84e99a0679f3")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mBelongToPrototype;
            }

            @objid ("40d5e57c-eaf8-446d-aad5-f1b1771106d8")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mBelongToPrototype = value;
            }

        }

        @objid ("00921ce2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("9272be04-85c9-4ad9-bf83-18d35086d882")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mIsHidden;
            }

            @objid ("2fa8a5ee-5c6e-4160-a3bb-198630c00590")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mIsHidden = value;
            }

        }

        @objid ("0092e3b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TagOccurenceSmDependency extends SmMultipleDependency {
            @objid ("1902e748-641b-4ca9-8301-de882952b9f6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TagTypeData)data).mTagOccurence != null)? ((TagTypeData)data).mTagOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("54b3d399-1083-44cf-9452-d72950f743b1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TagTypeData) data).mTagOccurence = new ArrayList<>(initialCapacity);
                return ((TagTypeData) data).mTagOccurence;
            }

            @objid ("089a0b9c-f1f4-4a7a-9158-650fb3c08748")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.DefinitionDep();
            }

        }

        @objid ("0093ae54-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("733288f0-b1a8-48f3-a56e-5ff9f6a8f22f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagTypeData) data).mOwnerStereotype;
            }

            @objid ("35b2c388-a560-4a54-a4bb-2658bbcf2825")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagTypeData) data).mOwnerStereotype = value;
            }

            @objid ("dd7423c1-ac2b-4553-b6db-25b7a422d084")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedTagTypeDep();
            }

        }

        @objid ("009425be-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("23c02948-ab89-45ec-9ead-bd1657895054")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagTypeData) data).mOwnerReference;
            }

            @objid ("6f0faa9d-a32e-4e6f-b897-674e3a0a1a7e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagTypeData) data).mOwnerReference = value;
            }

            @objid ("0b0d9b76-6f1e-48d5-b6b0-19afa8edb0c1")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedTagTypeDep();
            }

        }

        @objid ("62574d27-779b-404c-8c05-c71e9541cb47")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("3ffc2172-1bdc-43e7-9333-098b649cf61f")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mLabelKey;
            }

            @objid ("6344add7-dd58-43a6-9741-23c0b93b9d71")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mLabelKey = value;
            }

        }

    }

}
