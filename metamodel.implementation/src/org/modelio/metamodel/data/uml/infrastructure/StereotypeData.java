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
import org.modelio.metamodel.data.uml.infrastructure.ExternDocumentTypeData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.NoteTypeData;
import org.modelio.metamodel.data.uml.infrastructure.ProfileData;
import org.modelio.metamodel.data.uml.infrastructure.TagTypeData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.StereotypeImpl;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
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

@objid ("008d9532-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Stereotype.class, factory=StereotypeData.Metadata.ObjectFactory.class, cmsnode=true)
public class StereotypeData extends ModelElementData {
    @objid ("33311662-0704-457f-a4d1-82d779f6479b")
    @SmaMetaAttribute(metaName="Image", type=String.class, smAttributeClass=Metadata.ImageSmAttribute.class)
     Object mImage = "";

    @objid ("8ad3813a-3cb1-4c35-a53c-d8c626a3788f")
    @SmaMetaAttribute(metaName="Icon", type=String.class, smAttributeClass=Metadata.IconSmAttribute.class)
     Object mIcon = "";

    @objid ("2381922f-ae80-4487-82fc-04f21c5c6b7c")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("067e27c1-10e4-495c-b5ed-51c4d6c6af91")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("ab96139b-459b-41b3-85d7-1f8eefb1f1a9")
    @SmaMetaAttribute(metaName="BaseClassName", type=String.class, smAttributeClass=Metadata.BaseClassNameSmAttribute.class)
     Object mBaseClassName = "";

    @objid ("23440446-8177-422a-aa09-13c80df40d69")
    @SmaMetaAssociation(metaName="DefinedTable", typeDataClass=PropertyTableDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.DefinedTableSmDependency.class, component = true)
     SmObjectImpl mDefinedTable;

    @objid ("a1940fb8-09d4-4f50-95ea-c09c20dcb2ca")
    @SmaMetaAssociation(metaName="ExtendedElement", typeDataClass=ModelElementData.class, min=0, max=-1, smAssociationClass=Metadata.ExtendedElementSmDependency.class)
     List<SmObjectImpl> mExtendedElement = null;

    @objid ("7b623e90-b4d4-4852-8c68-e7805fccff6b")
    @SmaMetaAssociation(metaName="DefinedExternDocumentType", typeDataClass=ExternDocumentTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedExternDocumentTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedExternDocumentType = null;

    @objid ("2126d63a-6649-472e-b819-a68daa4bb2a6")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ProfileData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("5556f6a6-3e7c-4c31-9fb4-a261cb791eff")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class, partof = true)
     SmObjectImpl mParent;

    @objid ("8be9bf80-c117-4ff0-9608-aeffa823c659")
    @SmaMetaAssociation(metaName="DefinedTagType", typeDataClass=TagTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTagTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedTagType = null;

    @objid ("f086dc44-f748-4038-83f5-59b96621c020")
    @SmaMetaAssociation(metaName="Child", typeDataClass=StereotypeData.class, min=0, max=-1, smAssociationClass=Metadata.ChildSmDependency.class)
     List<SmObjectImpl> mChild = null;

    @objid ("83e07f25-cf16-4bf4-b051-4dad447e9836")
    @SmaMetaAssociation(metaName="DefinedNoteType", typeDataClass=NoteTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedNoteTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedNoteType = null;

    @objid ("27078a29-1494-485f-9eb1-2db7b18d279f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0065bb2a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a96fa3d1-71af-40f0-81d4-6ee57bd23db7")
        private static SmClass smClass = null;

        @objid ("e41ad075-93cf-4bfd-bfb4-8453029888d4")
        private static SmAttribute ImageAtt = null;

        @objid ("ee6b6415-7438-4d67-8d9f-a4c7a01bbabd")
        private static SmAttribute IconAtt = null;

        @objid ("12613cf5-f47c-46d7-8582-f2244796a025")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("80833571-7c75-42b8-89c0-6bbfe27b4b23")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("d9edba0b-38d2-4eb9-9a9b-09cfd541a93c")
        private static SmAttribute BaseClassNameAtt = null;

        @objid ("c9128d57-91ed-40cd-b9af-8fea77baa5d0")
        private static SmDependency DefinedTableDep = null;

        @objid ("614e510e-9b72-45ad-b916-f474f416c211")
        private static SmDependency ExtendedElementDep = null;

        @objid ("f8680822-9c25-4f26-ace9-9c12c041f3d3")
        private static SmDependency DefinedExternDocumentTypeDep = null;

        @objid ("96eba30a-92dc-4ddf-8250-e7dc9c35ed6f")
        private static SmDependency OwnerDep = null;

        @objid ("1615ece3-8cc1-43d2-8d8e-0bff60298d32")
        private static SmDependency ParentDep = null;

        @objid ("12958163-89bc-4258-b3dc-6479e7cdd7fc")
        private static SmDependency DefinedTagTypeDep = null;

        @objid ("258c5eaf-1882-4537-87fa-b7a33a942523")
        private static SmDependency ChildDep = null;

        @objid ("d1e7a409-32f0-4aad-a96c-901a269ccfb0")
        private static SmDependency DefinedNoteTypeDep = null;

        @objid ("26fa4136-6c4d-4f99-a0af-93700af2e34f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StereotypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2dd180a4-6b7b-42a8-bd4c-fc402368912e")
        public static SmAttribute ImageAtt() {
            if (ImageAtt == null) {
            	ImageAtt = classof().getAttributeDef("Image");
            }
            return ImageAtt;
        }

        @objid ("e3272901-51b8-4437-b211-eff01124bc01")
        public static SmAttribute IconAtt() {
            if (IconAtt == null) {
            	IconAtt = classof().getAttributeDef("Icon");
            }
            return IconAtt;
        }

        @objid ("1d100b84-7088-47f8-834a-449babd3fa14")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("8c3a3035-9879-4234-98fa-5a8cc31402bc")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("2dc21c26-8334-414e-bb7e-34bcb5819454")
        public static SmAttribute BaseClassNameAtt() {
            if (BaseClassNameAtt == null) {
            	BaseClassNameAtt = classof().getAttributeDef("BaseClassName");
            }
            return BaseClassNameAtt;
        }

        @objid ("656599c5-ab2c-4655-a77d-802ac32cb53d")
        public static SmDependency DefinedTableDep() {
            if (DefinedTableDep == null) {
            	DefinedTableDep = classof().getDependencyDef("DefinedTable");
            }
            return DefinedTableDep;
        }

        @objid ("6d0ccdfa-995f-43db-b4c0-78726c9a1a4e")
        public static SmDependency ExtendedElementDep() {
            if (ExtendedElementDep == null) {
            	ExtendedElementDep = classof().getDependencyDef("ExtendedElement");
            }
            return ExtendedElementDep;
        }

        @objid ("28c32958-6d16-4a30-a4f1-b394c74dd3bc")
        public static SmDependency DefinedExternDocumentTypeDep() {
            if (DefinedExternDocumentTypeDep == null) {
            	DefinedExternDocumentTypeDep = classof().getDependencyDef("DefinedExternDocumentType");
            }
            return DefinedExternDocumentTypeDep;
        }

        @objid ("85dce740-0ab6-4380-8836-76e5dc38c467")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("d39be55e-74a6-4aa6-b953-aa853e24c511")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("ec923289-cfeb-491a-a3c5-1b60422ac730")
        public static SmDependency DefinedTagTypeDep() {
            if (DefinedTagTypeDep == null) {
            	DefinedTagTypeDep = classof().getDependencyDef("DefinedTagType");
            }
            return DefinedTagTypeDep;
        }

        @objid ("934f5016-62ff-4d5d-a591-d2e48404352f")
        public static SmDependency ChildDep() {
            if (ChildDep == null) {
            	ChildDep = classof().getDependencyDef("Child");
            }
            return ChildDep;
        }

        @objid ("58c3a9ed-d719-4092-acd7-328a3fe96bdf")
        public static SmDependency DefinedNoteTypeDep() {
            if (DefinedNoteTypeDep == null) {
            	DefinedNoteTypeDep = classof().getDependencyDef("DefinedNoteType");
            }
            return DefinedNoteTypeDep;
        }

        @objid ("47cee35e-2a56-4577-8543-e5458b1a56e2")
        public static SmDependency getDefinedExternDocumentTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedExternDocumentTypeDep;
        }

        @objid ("54ac2a42-2037-4a2d-9401-8af41cb98c3b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d3947c36-4049-45bf-a8b3-c6bca170c550")
        public static SmDependency getDefinedNoteTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedNoteTypeDep;
        }

        @objid ("85a48bf0-b074-4211-b605-307bbf047a48")
        public static SmDependency getExtendedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtendedElementDep;
        }

        @objid ("492cc438-98be-4445-ae5d-0bb239538cea")
        public static SmDependency getDefinedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTableDep;
        }

        @objid ("516c6a38-4789-4b5b-8287-53789f2ac41f")
        public static SmAttribute getImageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImageAtt;
        }

        @objid ("75197bbd-df0e-4a06-aeff-17eca9334f73")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("56cf460c-c37f-47db-809d-495d5855285f")
        public static SmAttribute getIconAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IconAtt;
        }

        @objid ("dc1126d0-ec75-4cee-8f38-2d580b90b5f5")
        public static SmAttribute getBaseClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseClassNameAtt;
        }

        @objid ("9eff05a6-dfcd-4714-9a1d-9d4d69114ba9")
        public static SmDependency getDefinedTagTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTagTypeDep;
        }

        @objid ("705eca77-707e-4f90-800a-5fcede5a7540")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("304f8676-c7f2-4a3b-9abc-dac31520ce86")
        public static SmDependency getChildDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChildDep;
        }

        @objid ("7d71ab02-6f1a-4e6e-a504-6f73e7c77744")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("e169936e-c5bd-4267-9eee-5f32fadc2adf")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("0065fb3a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2dfec19b-36bc-418d-abf3-0c15305ed783")
            public ISmObjectData createData() {
                return new StereotypeData();
            }

            @objid ("6123d655-78c2-4965-b1fb-fece2ab872ea")
            public SmObjectImpl createImpl() {
                return new StereotypeImpl();
            }

        }

        @objid ("00665bf2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IconSmAttribute extends SmAttribute {
            @objid ("25bbf477-197e-4614-918b-e2ad99666d89")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mIcon;
            }

            @objid ("34d377f5-474e-4f83-800d-4a49fbe0f90a")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mIcon = value;
            }

        }

        @objid ("00671e02-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("52545e52-bf84-4d62-b1bb-59b6f266fffe")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mIsHidden;
            }

            @objid ("7b19ae62-1002-4413-b553-a4d02ac85ba4")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mIsHidden = value;
            }

        }

        @objid ("0067e152-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BaseClassNameSmAttribute extends SmAttribute {
            @objid ("c713d753-772f-4015-a57b-4af96bc9a7e2")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mBaseClassName;
            }

            @objid ("037c9053-7154-470b-9e31-d34495558651")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mBaseClassName = value;
            }

        }

        @objid ("00684660-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExtendedElementSmDependency extends SmMultipleDependency {
            @objid ("6295acd2-5be1-46ff-8075-f5bd69873feb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mExtendedElement != null)? ((StereotypeData)data).mExtendedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("2f07da23-7d8b-4dee-bf9f-76df7aa6ed78")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mExtendedElement = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mExtendedElement;
            }

            @objid ("31cc2ffa-ef3a-4f09-8ab4-d782dfac26c9")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ExtensionDep();
            }

        }

        @objid ("0068ab32-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("8350d454-f617-409f-a5f1-bd0b27c7af1a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StereotypeData) data).mOwner;
            }

            @objid ("9bd9449d-2db9-42c3-95e3-edd0737dbce4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StereotypeData) data).mOwner = value;
            }

            @objid ("6501c7e7-335c-4b3c-a4bc-5e23ec6e6cb8")
            @Override
            public SmDependency getSymetric() {
                return ProfileData.Metadata.DefinedStereotypeDep();
            }

        }

        @objid ("006921b6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedTagTypeSmDependency extends SmMultipleDependency {
            @objid ("107037d6-8605-4e34-86e9-e822d65d7343")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mDefinedTagType != null)? ((StereotypeData)data).mDefinedTagType:SmMultipleDependency.EMPTY;
            }

            @objid ("1717b72c-6dfa-4c0b-8e23-9be307bf1183")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mDefinedTagType = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mDefinedTagType;
            }

            @objid ("7c80551e-7c72-4af1-80b3-6c4d501d4e5e")
            @Override
            public SmDependency getSymetric() {
                return TagTypeData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("006b13fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedNoteTypeSmDependency extends SmMultipleDependency {
            @objid ("d0de166b-dd1f-431c-8496-2560ce8200ad")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mDefinedNoteType != null)? ((StereotypeData)data).mDefinedNoteType:SmMultipleDependency.EMPTY;
            }

            @objid ("ba48ef17-0c5d-4b31-8076-cac7bc0c7e74")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mDefinedNoteType = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mDefinedNoteType;
            }

            @objid ("7da48592-dfbe-471c-a867-07255c013be2")
            @Override
            public SmDependency getSymetric() {
                return NoteTypeData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("006b8816-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedExternDocumentTypeSmDependency extends SmMultipleDependency {
            @objid ("354fa19f-4da1-4760-9625-bc0039d227d7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mDefinedExternDocumentType != null)? ((StereotypeData)data).mDefinedExternDocumentType:SmMultipleDependency.EMPTY;
            }

            @objid ("5b03c807-656e-4cf0-b752-5782159a35de")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mDefinedExternDocumentType = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mDefinedExternDocumentType;
            }

            @objid ("5eb36b85-7169-4c1c-883f-80d9f84de275")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentTypeData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("006c679a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ChildSmDependency extends SmMultipleDependency {
            @objid ("2a25be78-6d7d-4e0b-8c63-bef6d70a8769")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mChild != null)? ((StereotypeData)data).mChild:SmMultipleDependency.EMPTY;
            }

            @objid ("318515f5-1501-4b9d-855b-fbea8ef2b875")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mChild = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mChild;
            }

            @objid ("dbce8338-8b0c-494f-982f-98da8e962de2")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.ParentDep();
            }

        }

        @objid ("006cd48c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("ac840816-db34-4257-a1b9-7847ce721e7d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StereotypeData) data).mParent;
            }

            @objid ("cc53ea53-3864-485c-aa66-0ed7837e6173")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StereotypeData) data).mParent = value;
            }

            @objid ("9ed95130-7c01-477e-b0ce-c81d87376d19")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.ChildDep();
            }

        }

        @objid ("00826b26-2f94-107d-a05b-001ec947cd2a")
        public static class ImageSmAttribute extends SmAttribute {
            @objid ("ef895429-a31d-4741-a760-200ecacfe434")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mImage;
            }

            @objid ("b6a2b2d5-50a4-40bc-abbd-3f051c653c37")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mImage = value;
            }

        }

        @objid ("00118848-ec99-1098-b22e-001ec947cd2a")
        public static class DefinedTableSmDependency extends SmSingleDependency {
            @objid ("f28eb107-ed1d-4666-af1c-35972b36c662")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StereotypeData) data).mDefinedTable;
            }

            @objid ("c5b038e7-77f5-4d5f-a1b9-1988ac5e5e67")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StereotypeData) data).mDefinedTable = value;
            }

            @objid ("d106377e-7891-48ac-9f36-3939d1b6299e")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("27ea5633-e9af-4176-a8da-80014b3d98e6")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("fe29dd78-d7b9-40af-ae53-b5a5ba57fd90")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mLabelKey;
            }

            @objid ("0fd18158-10f3-40a2-b0b9-d5000433f4bc")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mLabelKey = value;
            }

        }

    }

}
