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
    @objid ("edbb18d7-2e16-426d-bf39-a057b2361c2e")
    @SmaMetaAttribute(metaName="Image", type=String.class, smAttributeClass=Metadata.ImageSmAttribute.class)
     Object mImage = "";

    @objid ("d8dea8af-8933-4ead-9c96-e794b1e343d6")
    @SmaMetaAttribute(metaName="Icon", type=String.class, smAttributeClass=Metadata.IconSmAttribute.class)
     Object mIcon = "";

    @objid ("b0a0918e-c781-4f15-8eb2-8ade605acefd")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("d51ada17-7b65-4f93-bb5b-296c5c6bd86b")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("ef70e580-fc1e-4d90-b74f-fbb0a37983ec")
    @SmaMetaAttribute(metaName="BaseClassName", type=String.class, smAttributeClass=Metadata.BaseClassNameSmAttribute.class)
     Object mBaseClassName = "";

    @objid ("f915f25b-6acf-4eb1-9e59-68b8e5201141")
    @SmaMetaAssociation(metaName="DefinedTable", typeDataClass=PropertyTableDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.DefinedTableSmDependency.class, component = true)
     SmObjectImpl mDefinedTable;

    @objid ("09c00069-2b54-4336-a5b9-6901d8cdc0c7")
    @SmaMetaAssociation(metaName="ExtendedElement", typeDataClass=ModelElementData.class, min=0, max=-1, smAssociationClass=Metadata.ExtendedElementSmDependency.class)
     List<SmObjectImpl> mExtendedElement = null;

    @objid ("37557708-2e88-4411-8fc3-782e786ba41e")
    @SmaMetaAssociation(metaName="DefinedExternDocumentType", typeDataClass=ExternDocumentTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedExternDocumentTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedExternDocumentType = null;

    @objid ("cadd6830-562c-4555-95d1-7c7c53230204")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ProfileData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("d18558ed-6322-431c-8fee-68989a16005c")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class, partof = true)
     SmObjectImpl mParent;

    @objid ("23becf42-ca71-4534-94ab-75d289950491")
    @SmaMetaAssociation(metaName="DefinedTagType", typeDataClass=TagTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTagTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedTagType = null;

    @objid ("b98bd62a-9182-4a7c-93fe-07349b8ac509")
    @SmaMetaAssociation(metaName="Child", typeDataClass=StereotypeData.class, min=0, max=-1, smAssociationClass=Metadata.ChildSmDependency.class)
     List<SmObjectImpl> mChild = null;

    @objid ("401fed91-ab40-47e2-a50d-02f9e623ded5")
    @SmaMetaAssociation(metaName="DefinedNoteType", typeDataClass=NoteTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedNoteTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedNoteType = null;

    @objid ("f7942ac0-454b-4408-82da-82db5d5f2e59")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0065bb2a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("53203d44-15b2-4d21-a6f5-85b765b76b7a")
        private static SmClass smClass = null;

        @objid ("292d6052-40a8-4173-90a2-5825b328d864")
        private static SmAttribute ImageAtt = null;

        @objid ("1346e7f0-6b7f-439d-817b-ed79da5c0c11")
        private static SmAttribute IconAtt = null;

        @objid ("f204b294-a8b4-43c5-956c-3522b5e57f2f")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("36cce3a8-0a96-4df2-9adb-0954e134a316")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("ec1a7224-356c-4555-b195-99626f204235")
        private static SmAttribute BaseClassNameAtt = null;

        @objid ("6183ec93-6828-4744-ae01-d6bde7b44246")
        private static SmDependency DefinedTableDep = null;

        @objid ("34d6a6ef-78e8-4240-bdc7-54f043f6d0c6")
        private static SmDependency ExtendedElementDep = null;

        @objid ("789fd345-1ea5-4190-86e4-2222cca88bcb")
        private static SmDependency DefinedExternDocumentTypeDep = null;

        @objid ("578afc36-f50d-4b55-bb32-84c435189fbe")
        private static SmDependency OwnerDep = null;

        @objid ("53f162d5-1f08-4ed3-8bfd-955ed7d9e8f3")
        private static SmDependency ParentDep = null;

        @objid ("8b3e907f-54d6-41d5-8c49-b5b15880808c")
        private static SmDependency DefinedTagTypeDep = null;

        @objid ("2a68e80b-ed1e-4ba5-bf13-d23823807a7e")
        private static SmDependency ChildDep = null;

        @objid ("aad8361d-16be-47c0-9338-cacb13c0781d")
        private static SmDependency DefinedNoteTypeDep = null;

        @objid ("b7b5c3b4-dac0-402f-b8d6-8fad371678dc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StereotypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("23262c5f-35e4-4220-83ac-e43dc27370af")
        public static SmAttribute ImageAtt() {
            if (ImageAtt == null) {
            	ImageAtt = classof().getAttributeDef("Image");
            }
            return ImageAtt;
        }

        @objid ("d89a224a-f1f8-4817-a83d-b0276f8d95cd")
        public static SmAttribute IconAtt() {
            if (IconAtt == null) {
            	IconAtt = classof().getAttributeDef("Icon");
            }
            return IconAtt;
        }

        @objid ("875ee113-7973-41ff-9bae-96beee953a17")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("a9be8008-91af-4378-be32-90a522412ac5")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("e1dbbe99-4c7d-41b2-8d69-4568e1601d1a")
        public static SmAttribute BaseClassNameAtt() {
            if (BaseClassNameAtt == null) {
            	BaseClassNameAtt = classof().getAttributeDef("BaseClassName");
            }
            return BaseClassNameAtt;
        }

        @objid ("cf20b124-9189-49f9-9b2f-42d3fb14c21b")
        public static SmDependency DefinedTableDep() {
            if (DefinedTableDep == null) {
            	DefinedTableDep = classof().getDependencyDef("DefinedTable");
            }
            return DefinedTableDep;
        }

        @objid ("51aa3d04-eedd-4cae-8fb0-beef71eb3c98")
        public static SmDependency ExtendedElementDep() {
            if (ExtendedElementDep == null) {
            	ExtendedElementDep = classof().getDependencyDef("ExtendedElement");
            }
            return ExtendedElementDep;
        }

        @objid ("18dba1a4-10c7-4b4b-a0d4-9b34602fe99e")
        public static SmDependency DefinedExternDocumentTypeDep() {
            if (DefinedExternDocumentTypeDep == null) {
            	DefinedExternDocumentTypeDep = classof().getDependencyDef("DefinedExternDocumentType");
            }
            return DefinedExternDocumentTypeDep;
        }

        @objid ("7db28f58-f0ff-4c4b-b050-4a4fe5b342bc")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("e3c74648-fad6-4644-a3b2-a0209a963180")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("3b42d13d-778d-402f-9caf-36bdab7b9b83")
        public static SmDependency DefinedTagTypeDep() {
            if (DefinedTagTypeDep == null) {
            	DefinedTagTypeDep = classof().getDependencyDef("DefinedTagType");
            }
            return DefinedTagTypeDep;
        }

        @objid ("ff7ec7b6-6a01-421d-9d51-524799f4029c")
        public static SmDependency ChildDep() {
            if (ChildDep == null) {
            	ChildDep = classof().getDependencyDef("Child");
            }
            return ChildDep;
        }

        @objid ("74a2a3c7-8bc1-47b1-b3ee-efd11d1f2cfc")
        public static SmDependency DefinedNoteTypeDep() {
            if (DefinedNoteTypeDep == null) {
            	DefinedNoteTypeDep = classof().getDependencyDef("DefinedNoteType");
            }
            return DefinedNoteTypeDep;
        }

        @objid ("82af5718-14b9-42af-a3c3-6d04a3d6ee74")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("9523d9ff-b102-46c9-932f-ba6f85b33bcb")
        public static SmDependency getDefinedExternDocumentTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedExternDocumentTypeDep;
        }

        @objid ("08b66743-720a-4a97-af2a-b8986778ab5c")
        public static SmDependency getDefinedTagTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTagTypeDep;
        }

        @objid ("d07985e2-d1d1-48a5-8894-d0722acb06f4")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("fbae33cd-cd13-4686-b64e-282b8823be26")
        public static SmDependency getChildDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChildDep;
        }

        @objid ("3e7d490a-1c98-4f38-9ebc-39f90ebba7a6")
        public static SmAttribute getImageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImageAtt;
        }

        @objid ("ba5f6477-9084-4f35-b977-3f2e8cfa8c80")
        public static SmAttribute getIconAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IconAtt;
        }

        @objid ("c0ec5f87-d2f3-4021-813b-71cde471c847")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("20b1f2bd-f208-490d-bb30-3184148215b1")
        public static SmAttribute getBaseClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseClassNameAtt;
        }

        @objid ("c18a0758-eed3-493a-ab08-9854a7a9b50e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7a74e8bc-359d-428c-ae92-610aec2b49f7")
        public static SmDependency getExtendedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtendedElementDep;
        }

        @objid ("80162f35-ca3f-44c2-ad0f-b7b8cdbe9d27")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("fa40643a-3f80-46b3-8777-2a7153a94960")
        public static SmDependency getDefinedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTableDep;
        }

        @objid ("63a3688e-ceb1-4420-b3ed-b1c8ba789f02")
        public static SmDependency getDefinedNoteTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedNoteTypeDep;
        }

        @objid ("0065fb3a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cd428289-0ce1-4361-b122-cedeb046c703")
            public ISmObjectData createData() {
                return new StereotypeData();
            }

            @objid ("785f1ab6-b5fb-420b-8285-e7b3a21318a3")
            public SmObjectImpl createImpl() {
                return new StereotypeImpl();
            }

        }

        @objid ("00665bf2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IconSmAttribute extends SmAttribute {
            @objid ("ff354207-fd10-4a8e-9dfa-418cc7f8b3ed")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mIcon;
            }

            @objid ("2264f629-f0b3-4d88-8345-0b78ba0f186c")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mIcon = value;
            }

        }

        @objid ("00671e02-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("66d4dd38-dc9f-4461-8b50-412ac3cf7893")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mIsHidden;
            }

            @objid ("e877257f-34fe-453e-907e-3cf851b82401")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mIsHidden = value;
            }

        }

        @objid ("0067e152-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BaseClassNameSmAttribute extends SmAttribute {
            @objid ("88b786d4-5e87-4cbb-a81e-80f2af1ec901")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mBaseClassName;
            }

            @objid ("3cc125ff-8764-4cc8-a0c7-ef8aa2786a94")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mBaseClassName = value;
            }

        }

        @objid ("00684660-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExtendedElementSmDependency extends SmMultipleDependency {
            @objid ("c24ed4a0-020c-4f25-b10f-7b4a869d1639")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mExtendedElement != null)? ((StereotypeData)data).mExtendedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("faf9811b-e9f0-45a3-95e3-4fadd84a2477")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mExtendedElement = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mExtendedElement;
            }

            @objid ("5f4f3048-296d-453c-a249-a9d1c98d3961")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ExtensionDep();
            }

        }

        @objid ("0068ab32-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("57cbcc85-28e0-48b1-920b-9d50ccfe3acb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StereotypeData) data).mOwner;
            }

            @objid ("b802dbb5-0db2-49cb-b0d3-69aef4cd81cc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StereotypeData) data).mOwner = value;
            }

            @objid ("fae38211-b5c2-414a-b42e-cc4bc08482c1")
            @Override
            public SmDependency getSymetric() {
                return ProfileData.Metadata.DefinedStereotypeDep();
            }

        }

        @objid ("006921b6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedTagTypeSmDependency extends SmMultipleDependency {
            @objid ("3eae8390-4145-429a-ba02-62a37f85f3ac")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mDefinedTagType != null)? ((StereotypeData)data).mDefinedTagType:SmMultipleDependency.EMPTY;
            }

            @objid ("2739c056-fa49-44e7-9738-6a102700ed82")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mDefinedTagType = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mDefinedTagType;
            }

            @objid ("6d3e6a6d-c075-4c32-9c4b-4b790828807c")
            @Override
            public SmDependency getSymetric() {
                return TagTypeData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("006b13fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedNoteTypeSmDependency extends SmMultipleDependency {
            @objid ("ba248484-32b5-4253-b6b3-653b75a6c0ae")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mDefinedNoteType != null)? ((StereotypeData)data).mDefinedNoteType:SmMultipleDependency.EMPTY;
            }

            @objid ("a634fadc-cf94-45b5-9829-7498fea03388")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mDefinedNoteType = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mDefinedNoteType;
            }

            @objid ("4f32f976-7d51-44b2-b8da-f53fa37fe144")
            @Override
            public SmDependency getSymetric() {
                return NoteTypeData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("006b8816-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedExternDocumentTypeSmDependency extends SmMultipleDependency {
            @objid ("022dd506-7788-4549-b2f2-79bc3fea655f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mDefinedExternDocumentType != null)? ((StereotypeData)data).mDefinedExternDocumentType:SmMultipleDependency.EMPTY;
            }

            @objid ("b3f3b01a-77e6-4921-8eb7-5b9dbb7a153c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mDefinedExternDocumentType = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mDefinedExternDocumentType;
            }

            @objid ("0e036fe9-fd5e-4673-a63a-78f76c5fcab2")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentTypeData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("006c679a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ChildSmDependency extends SmMultipleDependency {
            @objid ("1ae56e85-75ae-4566-8457-142d55ab1f53")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mChild != null)? ((StereotypeData)data).mChild:SmMultipleDependency.EMPTY;
            }

            @objid ("8c052f3f-5dba-48fe-8c05-78a6ce270984")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mChild = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mChild;
            }

            @objid ("1eee6540-0641-461a-bcdf-4707a03ca492")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.ParentDep();
            }

        }

        @objid ("006cd48c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("3e2505cf-a21b-40b2-b8db-459985923f4d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StereotypeData) data).mParent;
            }

            @objid ("4c68a1db-7557-4fd9-b007-7957a1467327")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StereotypeData) data).mParent = value;
            }

            @objid ("8d71fca0-ce7e-4fe0-ad3f-671e6cac3550")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.ChildDep();
            }

        }

        @objid ("00826b26-2f94-107d-a05b-001ec947cd2a")
        public static class ImageSmAttribute extends SmAttribute {
            @objid ("10087982-5ea1-4eb7-8867-fcbc8fed922c")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mImage;
            }

            @objid ("c3bede37-aea8-48ca-9361-3953f2ef26c1")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mImage = value;
            }

        }

        @objid ("00118848-ec99-1098-b22e-001ec947cd2a")
        public static class DefinedTableSmDependency extends SmSingleDependency {
            @objid ("5ce5dd32-6918-4643-bfd7-da3f71506233")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StereotypeData) data).mDefinedTable;
            }

            @objid ("99f717c4-cbc6-4a90-a83a-eefc098077ca")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StereotypeData) data).mDefinedTable = value;
            }

            @objid ("319f03ca-11ad-47d5-a472-771db8e0de1c")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("27ea5633-e9af-4176-a8da-80014b3d98e6")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("5a213e71-5b2c-45c1-bbe6-092d37992484")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mLabelKey;
            }

            @objid ("078547d9-9790-47ec-a040-79bc7700e798")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mLabelKey = value;
            }

        }

    }

}
