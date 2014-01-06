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
    @objid ("9b9f47bd-ec08-45e3-872c-031b728cd8de")
    @SmaMetaAttribute(metaName="ParamNumber", type=String.class, smAttributeClass=Metadata.ParamNumberSmAttribute.class)
     Object mParamNumber = "1";

    @objid ("4c45ea4a-a189-427d-b227-d12b8274b67d")
    @SmaMetaAttribute(metaName="IsQualified", type=Boolean.class, smAttributeClass=Metadata.IsQualifiedSmAttribute.class)
     Object mIsQualified = false;

    @objid ("9e9d0e69-4454-41ad-a50b-613ff0b725e7")
    @SmaMetaAttribute(metaName="BelongToPrototype", type=Boolean.class, smAttributeClass=Metadata.BelongToPrototypeSmAttribute.class)
     Object mBelongToPrototype = false;

    @objid ("690892f8-d3e4-43c4-be78-48433f67ebdc")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("a69d7150-9ca1-4dd4-a261-64f42b08b3bc")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("9549ec2f-945f-4dc2-b8c2-54b7bb8fcafa")
    @SmaMetaAssociation(metaName="TagOccurence", typeDataClass=TaggedValueData.class, min=0, max=-1, smAssociationClass=Metadata.TagOccurenceSmDependency.class, istodelete = true, performanceRisk = true)
     List<SmObjectImpl> mTagOccurence = null;

    @objid ("6b8bbd99-6cca-4448-967b-dc6cf6d68812")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("0d2cd61e-357c-4e6e-8f02-8f27c3b9b9ec")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("6c788a13-cdd9-449c-982b-401160ef0cdf")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("009058a8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3790774c-56d3-4d75-8929-aa2fbf82ba80")
        private static SmClass smClass = null;

        @objid ("516796f3-4b62-4a97-b6c5-e12886dcb544")
        private static SmAttribute ParamNumberAtt = null;

        @objid ("7f643697-11df-40b2-a94a-70df4175590f")
        private static SmAttribute IsQualifiedAtt = null;

        @objid ("27ba72ea-95dd-424c-b34b-ff67ba3f13f1")
        private static SmAttribute BelongToPrototypeAtt = null;

        @objid ("56a7fb8a-8f1e-4ba1-ba42-b982bdbc97bc")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("719a079a-b28e-4113-8f6c-15e0a3163034")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("92d66e4c-1a24-4ef6-85f0-c8252501d227")
        private static SmDependency TagOccurenceDep = null;

        @objid ("eccd06c4-5e7b-4fd1-b92f-e7e749089933")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("1887afab-5628-4eae-99b6-a0744cba2629")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("3c67c606-046c-44d9-9d37-e396ada4bb8d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TagTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("db83991a-6251-4489-8c9a-42a4b59e2f4a")
        public static SmAttribute ParamNumberAtt() {
            if (ParamNumberAtt == null) {
            	ParamNumberAtt = classof().getAttributeDef("ParamNumber");
            }
            return ParamNumberAtt;
        }

        @objid ("faa52602-aebd-45ea-8ba1-34da8dae0271")
        public static SmAttribute IsQualifiedAtt() {
            if (IsQualifiedAtt == null) {
            	IsQualifiedAtt = classof().getAttributeDef("IsQualified");
            }
            return IsQualifiedAtt;
        }

        @objid ("e36a1c36-4297-4164-a938-8c196809cb84")
        public static SmAttribute BelongToPrototypeAtt() {
            if (BelongToPrototypeAtt == null) {
            	BelongToPrototypeAtt = classof().getAttributeDef("BelongToPrototype");
            }
            return BelongToPrototypeAtt;
        }

        @objid ("abe48e51-3859-422b-a433-45d98435bb66")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("c5c47bab-70db-43be-9f8d-bd295f073d77")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("c15281e7-55bf-4793-be0f-0eea97e954eb")
        public static SmDependency TagOccurenceDep() {
            if (TagOccurenceDep == null) {
            	TagOccurenceDep = classof().getDependencyDef("TagOccurence");
            }
            return TagOccurenceDep;
        }

        @objid ("9e5dc27c-2697-4a5c-8edc-28b3fd1c57db")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("8c5d0fd0-590e-46ff-88ec-0171544b30ab")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("3e7b765d-c8b1-4e6c-8230-a0868c71334f")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("78b3cf3a-4afa-4027-a705-3fc02ae9fb6b")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("fe7ca0b3-8e7e-44b6-ac8c-f98467c45bef")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("321b6eb2-e49a-43b1-bf26-aee4fd0915f9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("608c249a-507f-4605-a9d0-ff8695fa650c")
        public static SmAttribute getBelongToPrototypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BelongToPrototypeAtt;
        }

        @objid ("0ef7278f-92dc-4297-850c-086d95b42bac")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("eb937506-30fb-4ede-a42d-9f65df29d571")
        public static SmDependency getTagOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TagOccurenceDep;
        }

        @objid ("157bc29d-28b5-4812-b4b6-517895069864")
        public static SmAttribute getIsQualifiedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsQualifiedAtt;
        }

        @objid ("bd685a00-ed23-4854-97c9-c7fb5c9fe12e")
        public static SmAttribute getParamNumberAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParamNumberAtt;
        }

        @objid ("00909872-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("426588f2-1805-402a-bb02-b1193e4d74bd")
            public ISmObjectData createData() {
                return new TagTypeData();
            }

            @objid ("8a30149a-7626-4113-bea1-2b491a441d69")
            public SmObjectImpl createImpl() {
                return new TagTypeImpl();
            }

        }

        @objid ("0090f9a2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ParamNumberSmAttribute extends SmAttribute {
            @objid ("1511deb0-2db5-4703-9271-2ddbc8d0342e")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mParamNumber;
            }

            @objid ("8b017b98-b554-41de-b7f6-9d8dcbd9f882")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mParamNumber = value;
            }

        }

        @objid ("009159f6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsQualifiedSmAttribute extends SmAttribute {
            @objid ("93d4779c-5d46-457c-ab51-85a92c339c69")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mIsQualified;
            }

            @objid ("8a9f4a6c-ec7e-4873-9f6c-aed9d98a4e6d")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mIsQualified = value;
            }

        }

        @objid ("0091bb62-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BelongToPrototypeSmAttribute extends SmAttribute {
            @objid ("8a6547df-c068-4063-8b03-9b2f86266f14")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mBelongToPrototype;
            }

            @objid ("d05ccd7b-a144-48bc-a924-fa63de9833f5")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mBelongToPrototype = value;
            }

        }

        @objid ("00921ce2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("9417dc41-53bb-4fdc-9e87-da87243a54ac")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mIsHidden;
            }

            @objid ("bc56ad07-1e00-4fdb-83d2-3eb3556efaf3")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mIsHidden = value;
            }

        }

        @objid ("0092e3b6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TagOccurenceSmDependency extends SmMultipleDependency {
            @objid ("70c74209-1b50-44ad-a73f-0061ba24c9e9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((TagTypeData)data).mTagOccurence != null)? ((TagTypeData)data).mTagOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("f462ffac-d5d9-4599-ae45-3971e868307c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((TagTypeData) data).mTagOccurence = new ArrayList<>(initialCapacity);
                return ((TagTypeData) data).mTagOccurence;
            }

            @objid ("a78858f9-aca6-4323-8218-cc2cd74c2874")
            @Override
            public SmDependency getSymetric() {
                return TaggedValueData.Metadata.DefinitionDep();
            }

        }

        @objid ("0093ae54-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("aae9b5ca-f55f-4cb7-94f8-da172ecc9a1c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagTypeData) data).mOwnerStereotype;
            }

            @objid ("7900619b-26ef-4166-8071-806402feaf97")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagTypeData) data).mOwnerStereotype = value;
            }

            @objid ("fbfb1ee9-bcde-421c-9c46-12b67512bc45")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedTagTypeDep();
            }

        }

        @objid ("009425be-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("06ffac82-d65c-4142-9c2d-9883b9c61fc9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TagTypeData) data).mOwnerReference;
            }

            @objid ("1dd8d3fb-e933-4f5c-b130-81a18ec8e103")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TagTypeData) data).mOwnerReference = value;
            }

            @objid ("6bec5969-0359-42b5-873a-3d0831223234")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedTagTypeDep();
            }

        }

        @objid ("62574d27-779b-404c-8c05-c71e9541cb47")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("f26832ed-ca86-4fb6-9c45-93308b222583")
            public Object getValue(ISmObjectData data) {
                return ((TagTypeData) data).mLabelKey;
            }

            @objid ("4784cd15-4a41-4ff5-bfbd-11565787104b")
            public void setValue(ISmObjectData data, Object value) {
                ((TagTypeData) data).mLabelKey = value;
            }

        }

    }

}
