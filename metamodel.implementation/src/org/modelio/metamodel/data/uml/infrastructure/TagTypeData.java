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
    @objid ("159c1f20-9dbb-4160-a808-40ec4c17aa79")
    @SmaMetaAttribute(metaName="ParamNumber", type=String.class, smAttributeClass=Metadata.ParamNumberSmAttribute.class)
     Object mParamNumber = "1";

    @objid ("4ea0ac01-ef13-40ac-bc5b-59fed03556b8")
    @SmaMetaAttribute(metaName="IsQualified", type=Boolean.class, smAttributeClass=Metadata.IsQualifiedSmAttribute.class)
     Object mIsQualified = false;

    @objid ("9ffe0443-d84d-4055-83a4-af0bd761fc6f")
    @SmaMetaAttribute(metaName="BelongToPrototype", type=Boolean.class, smAttributeClass=Metadata.BelongToPrototypeSmAttribute.class)
     Object mBelongToPrototype = false;

    @objid ("75589b9e-3402-410e-a478-f26b16a1ec71")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("a1b4c3e5-ac2f-4f47-b0e1-019e5d3a0985")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("6de685f9-5d7b-4d26-8ed2-2f10dd66f219")
    @SmaMetaAssociation(metaName="TagOccurence", typeDataClass=TaggedValueData.class, min=0, max=-1, smAssociationClass=Metadata.TagOccurenceSmDependency.class, istodelete = true, performanceRisk = true)
     List<SmObjectImpl> mTagOccurence = null;

    @objid ("960f8e53-72ab-4c27-bb67-cfba7cc8480a")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("93c62bfa-d033-45e1-ab59-47e4967f17c7")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("d3f0d574-9c9f-4863-96c1-3cc350c09b9d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("009058a8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("47e4c621-28ff-4e5b-a82b-d0f8d7332e7b")
        private static SmClass smClass = null;

        @objid ("04de19c4-dc4b-4762-bc83-893dab9ed6ab")
        private static SmAttribute ParamNumberAtt = null;

        @objid ("d0d45e35-fa64-46fa-bf24-d5219cd9528a")
        private static SmAttribute IsQualifiedAtt = null;

        @objid ("6703d910-1ed4-4ef4-86bc-fc9edea5bcd2")
        private static SmAttribute BelongToPrototypeAtt = null;

        @objid ("a710e748-0fdf-4ca7-9035-32c42443f57f")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("7e57dba5-337c-451c-a43a-467c88c1ae82")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("d10cae74-42b9-498b-b9da-eeb2f1f9fe6e")
        private static SmDependency TagOccurenceDep = null;

        @objid ("9d56dc2f-57dd-4ae0-be52-db6472efbe17")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("652c8fd8-b578-4096-a572-2a424f535b24")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("e19688d7-8a23-4294-b471-30034831d1eb")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TagTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4a519863-1727-4869-8d91-45ee6b33affe")
        public static SmAttribute ParamNumberAtt() {
            if (ParamNumberAtt == null) {
            	ParamNumberAtt = classof().getAttributeDef("ParamNumber");
            }
            return ParamNumberAtt;
        }

        @objid ("2e330306-7fd5-4d2e-84d5-cf6e1894084f")
        public static SmAttribute IsQualifiedAtt() {
            if (IsQualifiedAtt == null) {
            	IsQualifiedAtt = classof().getAttributeDef("IsQualified");
            }
            return IsQualifiedAtt;
        }

        @objid ("5190fcb8-4f23-4941-af4b-093488164793")
        public static SmAttribute BelongToPrototypeAtt() {
            if (BelongToPrototypeAtt == null) {
            	BelongToPrototypeAtt = classof().getAttributeDef("BelongToPrototype");
            }
            return BelongToPrototypeAtt;
        }

        @objid ("53dd85e9-d55d-4573-9574-9d9a07bd15b8")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("070daca9-8c5d-4f67-b345-7885f0e3729e")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("d940f52f-af35-4cf0-bbeb-7544b9d5399e")
        public static SmDependency TagOccurenceDep() {
            if (TagOccurenceDep == null) {
            	TagOccurenceDep = classof().getDependencyDef("TagOccurence");
            }
            return TagOccurenceDep;
        }

        @objid ("0a4cde21-b215-4615-a41b-699f4769a3ce")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("2de2a825-3593-4aca-a2eb-e887c48b8567")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("41b7c5e5-b417-4180-a6c4-7f4eb03b4470")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("9f438f61-67b1-42f2-bb14-c5643387afcd")
        public static SmAttribute getIsQualifiedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsQualifiedAtt;
        }

        @objid ("1cc2d1a4-5778-44eb-abb8-dae995faf753")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("90bb1822-ca9f-4253-8ce4-ca5274ca3de7")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("ace98786-6806-49fa-935f-43d06285d26d")
        public static SmAttribute getBelongToPrototypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BelongToPrototypeAtt;
        }

        @objid ("c9b952eb-8af9-4cf6-b4d5-b159192adcb1")
        public static SmAttribute getParamNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParamNumberAtt;
        }

        @objid ("7416220b-468d-4730-a07f-68b091b176ad")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("749d64a6-4201-45ba-8970-64224ce3e0d7")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("58b37e94-293e-4846-950a-2d77aabba1f2")
        public static SmDependency getTagOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TagOccurenceDep;
        }

        @objid ("00909872-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8111e55a-ae61-43ec-9085-1c0e1ba2d66d")
            public ISmObjectData createData() {
                return new TagTypeData();
            }

            @objid ("f3f80640-9619-4c57-9a9f-8cc91d213e9d")
            public SmObjectImpl createImpl() {
                return new TagTypeImpl();
            }

        }

        @objid ("0090f9a2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParamNumberSmAttribute extends SmAttribute {
            @objid ("46afb967-e1c2-410f-a3e9-06156c155c9d")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mParamNumber;
            }

            @objid ("906c82c8-b678-4bb9-8da5-56fb07b7fd30")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mParamNumber = value;
            }

        }

        @objid ("009159f6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsQualifiedSmAttribute extends SmAttribute {
            @objid ("82ca6dc8-c114-4999-a1b8-4296f28d261a")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mIsQualified;
            }

            @objid ("d2da1c72-cbd3-44e9-a235-4e6f97789c4f")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mIsQualified = value;
            }

        }

        @objid ("0091bb62-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BelongToPrototypeSmAttribute extends SmAttribute {
            @objid ("868b4fee-66b7-4cc3-970d-2f6733b4f1a0")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mBelongToPrototype;
            }

            @objid ("c4713b51-c0ef-403a-8db9-bb7e1b9d27f0")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mBelongToPrototype = value;
            }

        }

        @objid ("00921ce2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("231f5f8f-c358-46e6-8345-b66f1129da83")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mIsHidden;
            }

            @objid ("10d6bbff-f10a-4481-b165-346cc1ef0103")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mIsHidden = value;
            }

        }

        @objid ("0092e3b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TagOccurenceSmDependency extends SmMultipleDependency {
            @objid ("17faee1b-7f09-4b5c-acd9-5e38fc4087af")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TagTypeData)data).mTagOccurence != null)? ((TagTypeData)data).mTagOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("0f278cea-9065-4fd0-9c5e-5b41b7cf0012")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TagTypeData) data).mTagOccurence = new ArrayList<>(initialCapacity);
                return ((TagTypeData) data).mTagOccurence;
            }

            @objid ("09044de4-3bf8-4dd9-b2fc-be89654fd8fe")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.DefinitionDep();
            }

        }

        @objid ("0093ae54-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("d8f43e07-4626-4289-9eeb-92fba4f9eaf1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagTypeData) data).mOwnerStereotype;
            }

            @objid ("c5b523f9-f63e-4878-b5f3-1c37e937d242")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagTypeData) data).mOwnerStereotype = value;
            }

            @objid ("8375a0dd-139c-490d-85b8-46b68748f67a")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedTagTypeDep();
            }

        }

        @objid ("009425be-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("28485d0a-114e-43fd-81fc-253b8f91036e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagTypeData) data).mOwnerReference;
            }

            @objid ("6691e968-d494-4522-9b4d-410bb9bd0e34")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagTypeData) data).mOwnerReference = value;
            }

            @objid ("0658daaf-fa4c-4eb6-beb7-a6410764427c")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedTagTypeDep();
            }

        }

        @objid ("62574d27-779b-404c-8c05-c71e9541cb47")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("76dd47bc-5f74-4ee7-8bdb-55262b64d3dd")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mLabelKey;
            }

            @objid ("56f1f883-71cb-4c8b-b4f1-37cfe1fadaf6")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mLabelKey = value;
            }

        }

    }

}
