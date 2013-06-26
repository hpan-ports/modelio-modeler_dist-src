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
    @objid ("4410033c-cb13-4b16-8ed7-ce8bf061215c")
    @SmaMetaAttribute(metaName="Image", type=String.class, smAttributeClass=Metadata.ImageSmAttribute.class)
     Object mImage = "";

    @objid ("e80cc519-6917-4421-9ef6-e93ad83f19db")
    @SmaMetaAttribute(metaName="Icon", type=String.class, smAttributeClass=Metadata.IconSmAttribute.class)
     Object mIcon = "";

    @objid ("c0e7d15a-0efa-4e2d-910b-1b72915a095e")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("7d6471e0-0adc-4c6b-9a9b-3aa5555e4004")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("adb4d59f-405e-4431-8822-7e4c8d9306f9")
    @SmaMetaAttribute(metaName="BaseClassName", type=String.class, smAttributeClass=Metadata.BaseClassNameSmAttribute.class)
     Object mBaseClassName = "";

    @objid ("5b89e534-92a1-463a-b9ec-35547a3c08fb")
    @SmaMetaAssociation(metaName="DefinedTable", typeDataClass=PropertyTableDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.DefinedTableSmDependency.class, component = true)
     SmObjectImpl mDefinedTable;

    @objid ("5c69faef-058d-4163-acdb-1eda5930c2c6")
    @SmaMetaAssociation(metaName="ExtendedElement", typeDataClass=ModelElementData.class, min=0, max=-1, smAssociationClass=Metadata.ExtendedElementSmDependency.class)
     List<SmObjectImpl> mExtendedElement = null;

    @objid ("aa184940-35c8-4dd4-81be-9d51d8015a34")
    @SmaMetaAssociation(metaName="DefinedExternDocumentType", typeDataClass=ExternDocumentTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedExternDocumentTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedExternDocumentType = null;

    @objid ("aa976970-6c3d-4f5b-a402-d66b84022f71")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ProfileData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("c9126a36-752b-4caf-9912-950d109fa6fb")
    @SmaMetaAssociation(metaName="Parent", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.ParentSmDependency.class, partof = true)
     SmObjectImpl mParent;

    @objid ("9fcdb8d4-4239-4b71-bc7f-5f6a03a13fa0")
    @SmaMetaAssociation(metaName="DefinedTagType", typeDataClass=TagTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTagTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedTagType = null;

    @objid ("13c7d9ba-b48e-4b1d-8bc8-cec1e964f6dd")
    @SmaMetaAssociation(metaName="Child", typeDataClass=StereotypeData.class, min=0, max=-1, smAssociationClass=Metadata.ChildSmDependency.class)
     List<SmObjectImpl> mChild = null;

    @objid ("8271c800-95ca-4506-98fa-dcb469b7924e")
    @SmaMetaAssociation(metaName="DefinedNoteType", typeDataClass=NoteTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedNoteTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedNoteType = null;

    @objid ("ca327f5e-3f38-400c-9a10-be62979ccaf9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0065bb2a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0ddd7a20-cf65-4a90-aaea-c6bc90e09f9d")
        private static SmClass smClass = null;

        @objid ("e0270104-fd62-4c2b-b5e6-5f021343a731")
        private static SmAttribute ImageAtt = null;

        @objid ("b1b4c47e-df34-427f-a098-10e5c433501e")
        private static SmAttribute IconAtt = null;

        @objid ("26b711de-b5b2-4281-abd0-2993366f35c7")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("ef4620f8-facf-416f-a696-2e4c78b5e071")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("2a0e4d1f-e1f0-47b5-b951-c12797576450")
        private static SmAttribute BaseClassNameAtt = null;

        @objid ("10786aca-7890-4b6f-95e5-42cbe4bf3cd8")
        private static SmDependency DefinedTableDep = null;

        @objid ("5de5ba05-8335-459c-ab9b-a66075037c8d")
        private static SmDependency ExtendedElementDep = null;

        @objid ("a97d40c6-5617-4f67-9c87-263794a041f6")
        private static SmDependency DefinedExternDocumentTypeDep = null;

        @objid ("9f84a1d0-d2eb-4a77-9954-cb63bcc942b8")
        private static SmDependency OwnerDep = null;

        @objid ("87c9ab50-6770-4b51-b18b-c28c7ea982a8")
        private static SmDependency ParentDep = null;

        @objid ("8c04e16d-4bde-4ed6-accd-e800792d75ce")
        private static SmDependency DefinedTagTypeDep = null;

        @objid ("263407c1-530e-4617-b392-d2b34fb8c3c4")
        private static SmDependency ChildDep = null;

        @objid ("df8f6eff-e824-4688-97b1-ee0ce38f8b8e")
        private static SmDependency DefinedNoteTypeDep = null;

        @objid ("510b3408-be0e-486a-a515-47a63331c183")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(StereotypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2ccc1255-01e9-4cf2-9b7f-d1eabf7bacde")
        public static SmAttribute ImageAtt() {
            if (ImageAtt == null) {
            	ImageAtt = classof().getAttributeDef("Image");
            }
            return ImageAtt;
        }

        @objid ("f5ada38c-a1ee-4d19-9a6b-34b696af141a")
        public static SmAttribute IconAtt() {
            if (IconAtt == null) {
            	IconAtt = classof().getAttributeDef("Icon");
            }
            return IconAtt;
        }

        @objid ("38a894c4-377c-4752-8331-8f7e0930f8bb")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("da562fae-5289-4b9f-8fb4-a8cc49d9bec8")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("2e55e141-dd1e-4d19-8131-d3e62059ae09")
        public static SmAttribute BaseClassNameAtt() {
            if (BaseClassNameAtt == null) {
            	BaseClassNameAtt = classof().getAttributeDef("BaseClassName");
            }
            return BaseClassNameAtt;
        }

        @objid ("e7469171-eab3-4578-b142-50471c7dc9a0")
        public static SmDependency DefinedTableDep() {
            if (DefinedTableDep == null) {
            	DefinedTableDep = classof().getDependencyDef("DefinedTable");
            }
            return DefinedTableDep;
        }

        @objid ("b954a7a3-d1e1-4a5b-9444-5595cd90d739")
        public static SmDependency ExtendedElementDep() {
            if (ExtendedElementDep == null) {
            	ExtendedElementDep = classof().getDependencyDef("ExtendedElement");
            }
            return ExtendedElementDep;
        }

        @objid ("8df54534-3e40-4c64-9667-2177ec19734f")
        public static SmDependency DefinedExternDocumentTypeDep() {
            if (DefinedExternDocumentTypeDep == null) {
            	DefinedExternDocumentTypeDep = classof().getDependencyDef("DefinedExternDocumentType");
            }
            return DefinedExternDocumentTypeDep;
        }

        @objid ("dad87c0b-f198-448f-9cf1-c9acec97f01c")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("6d255668-f84c-41d5-b057-5648943a0138")
        public static SmDependency ParentDep() {
            if (ParentDep == null) {
            	ParentDep = classof().getDependencyDef("Parent");
            }
            return ParentDep;
        }

        @objid ("ecc065c6-bf0c-4129-9520-1c446e348f09")
        public static SmDependency DefinedTagTypeDep() {
            if (DefinedTagTypeDep == null) {
            	DefinedTagTypeDep = classof().getDependencyDef("DefinedTagType");
            }
            return DefinedTagTypeDep;
        }

        @objid ("68f61325-63b8-4a66-a96b-1ba995a71c46")
        public static SmDependency ChildDep() {
            if (ChildDep == null) {
            	ChildDep = classof().getDependencyDef("Child");
            }
            return ChildDep;
        }

        @objid ("ea52c5f8-bcd4-4b4a-8e19-3048f30197c1")
        public static SmDependency DefinedNoteTypeDep() {
            if (DefinedNoteTypeDep == null) {
            	DefinedNoteTypeDep = classof().getDependencyDef("DefinedNoteType");
            }
            return DefinedNoteTypeDep;
        }

        @objid ("2e33eaa4-d503-4898-9b69-703441848169")
        public static SmDependency getDefinedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTableDep;
        }

        @objid ("cc76f296-8ae0-4b37-a666-b4ac62c7fcad")
        public static SmAttribute getImageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImageAtt;
        }

        @objid ("916c42d4-dbca-4523-b775-298d5daea015")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("35b88b1d-c1f3-4f4a-ab46-9e6471026f20")
        public static SmAttribute getIconAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IconAtt;
        }

        @objid ("e7c06d90-072e-49e0-b809-a229be9b40e5")
        public static SmDependency getDefinedTagTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTagTypeDep;
        }

        @objid ("d9c15efb-c333-498c-8914-3c68e96cfcb3")
        public static SmDependency getDefinedExternDocumentTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedExternDocumentTypeDep;
        }

        @objid ("7d89c2c8-92ee-4f1d-9b91-b540e0b2206e")
        public static SmDependency getExtendedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExtendedElementDep;
        }

        @objid ("ff1d4e9e-3584-4e7c-9c28-71d93008b4a7")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("fa00ad42-de04-48cf-aa6a-ab45984440ef")
        public static SmDependency getParentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentDep;
        }

        @objid ("4fdbdc43-83a2-4d39-9790-4bc5a731f558")
        public static SmDependency getChildDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChildDep;
        }

        @objid ("a5ce630c-bd1b-4601-9384-e58c33fd3019")
        public static SmAttribute getBaseClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseClassNameAtt;
        }

        @objid ("462d5cb5-9a00-440c-a155-4f3a6aba0b5d")
        public static SmDependency getDefinedNoteTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedNoteTypeDep;
        }

        @objid ("af4f3e00-c091-4a5f-8ca0-fd884036e4d3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c6a6445c-d95b-469e-8ac4-c32bc72ec2de")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("0065fb3a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6e1499f7-d15e-48e5-981f-f0f91670154e")
            public ISmObjectData createData() {
                return new StereotypeData();
            }

            @objid ("ac140f7b-db71-4b00-88bd-4b1148cd9433")
            public SmObjectImpl createImpl() {
                return new StereotypeImpl();
            }

        }

        @objid ("00665bf2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IconSmAttribute extends SmAttribute {
            @objid ("4d430bc5-8e94-4bf8-8bcb-4ae59cff103b")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mIcon;
            }

            @objid ("1f6d2e5a-0b10-41b4-b203-84fe4c679510")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mIcon = value;
            }

        }

        @objid ("00671e02-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("71e3128f-5844-447d-b6e0-03cc2d716df5")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mIsHidden;
            }

            @objid ("70c80833-0e5c-4aa4-8d2e-583f6891e181")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mIsHidden = value;
            }

        }

        @objid ("0067e152-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BaseClassNameSmAttribute extends SmAttribute {
            @objid ("d460a899-08cd-46c7-a8ae-87066710bf80")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mBaseClassName;
            }

            @objid ("2cdcd9bf-21ca-489f-a1ee-a751e54a19df")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mBaseClassName = value;
            }

        }

        @objid ("00684660-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ExtendedElementSmDependency extends SmMultipleDependency {
            @objid ("b13c6b24-fb31-4552-b484-29536f189c04")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mExtendedElement != null)? ((StereotypeData)data).mExtendedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("9b223f10-ed79-4ec3-b0a1-0dc388adc934")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mExtendedElement = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mExtendedElement;
            }

            @objid ("14ff3f83-c597-4d15-ae4b-ef1f881c300c")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ExtensionDep();
            }

        }

        @objid ("0068ab32-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("413ad5c9-6355-4214-98c2-023acdd0a60e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StereotypeData) data).mOwner;
            }

            @objid ("2a983141-13b4-4b54-8457-79f4fb721f07")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StereotypeData) data).mOwner = value;
            }

            @objid ("c054639b-3c45-4b47-9127-e4c2123321d9")
            @Override
            public SmDependency getSymetric() {
                return ProfileData.Metadata.DefinedStereotypeDep();
            }

        }

        @objid ("006921b6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedTagTypeSmDependency extends SmMultipleDependency {
            @objid ("58331891-d609-49a5-9b25-d196f436ff7d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mDefinedTagType != null)? ((StereotypeData)data).mDefinedTagType:SmMultipleDependency.EMPTY;
            }

            @objid ("62139fe3-d423-4295-820f-e84325e8749c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mDefinedTagType = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mDefinedTagType;
            }

            @objid ("17c594d4-e529-432d-8a42-ffb7aeceba7c")
            @Override
            public SmDependency getSymetric() {
                return TagTypeData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("006b13fe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedNoteTypeSmDependency extends SmMultipleDependency {
            @objid ("97ad9f10-055c-4126-805f-1a4e5b435f2f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mDefinedNoteType != null)? ((StereotypeData)data).mDefinedNoteType:SmMultipleDependency.EMPTY;
            }

            @objid ("59730fa0-5d0f-4dfc-b1d8-2244517fb647")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mDefinedNoteType = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mDefinedNoteType;
            }

            @objid ("aea4ee16-3a6c-4a23-bd47-4d96ea7a3681")
            @Override
            public SmDependency getSymetric() {
                return NoteTypeData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("006b8816-c4c4-1fd8-97fe-001ec947cd2a")
        public static class DefinedExternDocumentTypeSmDependency extends SmMultipleDependency {
            @objid ("8857ff10-de7a-462a-a77b-93e9bbe42e3d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mDefinedExternDocumentType != null)? ((StereotypeData)data).mDefinedExternDocumentType:SmMultipleDependency.EMPTY;
            }

            @objid ("abc29a36-540f-4ddc-9048-6c05b5ae86af")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mDefinedExternDocumentType = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mDefinedExternDocumentType;
            }

            @objid ("77206e47-654b-430c-bafc-0078eebd4849")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentTypeData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("006c679a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ChildSmDependency extends SmMultipleDependency {
            @objid ("e0bbc812-5b59-4bb5-bb40-8db367767031")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((StereotypeData)data).mChild != null)? ((StereotypeData)data).mChild:SmMultipleDependency.EMPTY;
            }

            @objid ("7c9520fb-e81b-473d-ace8-6cd750647360")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((StereotypeData) data).mChild = new ArrayList<>(initialCapacity);
                return ((StereotypeData) data).mChild;
            }

            @objid ("2fc35bb8-1e44-4274-b844-7deca3f2116d")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.ParentDep();
            }

        }

        @objid ("006cd48c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ParentSmDependency extends SmSingleDependency {
            @objid ("cd8fd5ca-9095-4548-bb5e-e591fd530bf9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StereotypeData) data).mParent;
            }

            @objid ("a4d538a8-dd56-4d87-bb9e-91676444a420")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StereotypeData) data).mParent = value;
            }

            @objid ("4f9e8842-26e4-4bee-b023-c9949fb0f0f4")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.ChildDep();
            }

        }

        @objid ("00826b26-2f94-107d-a05b-001ec947cd2a")
        public static class ImageSmAttribute extends SmAttribute {
            @objid ("0ca967c3-14ea-46f4-b53a-e1be8c6ada13")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mImage;
            }

            @objid ("39577f1d-e4e8-4eca-83aa-8883dd3202b0")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mImage = value;
            }

        }

        @objid ("00118848-ec99-1098-b22e-001ec947cd2a")
        public static class DefinedTableSmDependency extends SmSingleDependency {
            @objid ("939d26a7-2d59-468c-b346-a25d2c7d7cc6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((StereotypeData) data).mDefinedTable;
            }

            @objid ("c5adb178-c5d8-47df-8429-1e5d9a1341cb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((StereotypeData) data).mDefinedTable = value;
            }

            @objid ("5de4201f-bb18-4e85-86f1-04cdf7829d27")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnerStereotypeDep();
            }

        }

        @objid ("27ea5633-e9af-4176-a8da-80014b3d98e6")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("2a2f5fa1-facd-4b19-8f8a-e0a6562473e6")
            public Object getValue(ISmObjectData data) {
                return ((StereotypeData) data).mLabelKey;
            }

            @objid ("cc1a3128-25a9-4dab-827a-ec092427c763")
            public void setValue(ISmObjectData data, Object value) {
                ((StereotypeData) data).mLabelKey = value;
            }

        }

    }

}
