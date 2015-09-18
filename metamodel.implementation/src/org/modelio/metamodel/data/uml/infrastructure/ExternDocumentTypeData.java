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
import org.modelio.metamodel.data.uml.infrastructure.ExternDocumentData;
import org.modelio.metamodel.data.uml.infrastructure.MetaclassReferenceData;
import org.modelio.metamodel.data.uml.infrastructure.StereotypeData;
import org.modelio.metamodel.impl.uml.infrastructure.ExternDocumentTypeImpl;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
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

@objid ("00937678-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExternDocumentType.class, factory=ExternDocumentTypeData.Metadata.ObjectFactory.class)
public class ExternDocumentTypeData extends ModelElementData {
    @objid ("c57c89d2-4aad-496a-a828-3bb0b94593a0")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("bd6fadee-893e-4da7-b728-151e7d5a47ff")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("77ad37ea-2187-469b-a089-f2bb899e1b10")
    @SmaMetaAttribute(metaName="Icon", type=String.class, smAttributeClass=Metadata.IconSmAttribute.class)
     Object mIcon = "";

    @objid ("9516ba4b-e80b-461c-b976-a7d06bc2bab1")
    @SmaMetaAttribute(metaName="Image", type=String.class, smAttributeClass=Metadata.ImageSmAttribute.class)
     Object mImage = "";

    @objid ("fe5326d7-bc6d-4546-a017-1650976b1c66")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("454cc438-6559-43be-bc80-c2b84dd679e9")
    @SmaMetaAssociation(metaName="TypedDoc", typeDataClass=ExternDocumentData.class, min=0, max=-1, smAssociationClass=Metadata.TypedDocSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mTypedDoc = null;

    @objid ("dcd93d97-2e2c-43fa-bd88-dbeb051e1b59")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("5bbabd95-2715-4f54-bf95-b7422fab91b0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0096f2da-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("231bee0b-1dde-493b-a421-7be26699bf4a")
        private static SmClass smClass = null;

        @objid ("c35f9975-8819-41b1-9155-dfc84277b9b9")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("d642b212-2bd8-43b0-a1bd-8d11314d8821")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("eace7de2-05e5-48c5-8bba-87b0d4bcfe00")
        private static SmAttribute IconAtt = null;

        @objid ("dd221c42-b673-4aaa-8ecc-daf76e0aaecc")
        private static SmAttribute ImageAtt = null;

        @objid ("64ad419e-cb5f-4bf7-8e16-637686d6973a")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("a9dc1d24-a12a-4805-922a-70c1d1f0dee1")
        private static SmDependency TypedDocDep = null;

        @objid ("6e58fb5a-e43a-4d07-b614-60fc87e07ab2")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("6ae40afe-1099-4e66-a33c-ba6e220c9c55")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExternDocumentTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6acc2112-08d9-4fb2-a3be-9c51fbdf0819")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("ad99d400-53a1-4315-92d3-447338a7c0b7")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("1cf46ecb-5d7d-4313-b319-a3c85d3722fc")
        public static SmAttribute IconAtt() {
            if (IconAtt == null) {
            	IconAtt = classof().getAttributeDef("Icon");
            }
            return IconAtt;
        }

        @objid ("8f218d95-51c3-4cdb-a54f-1b1b286ec967")
        public static SmAttribute ImageAtt() {
            if (ImageAtt == null) {
            	ImageAtt = classof().getAttributeDef("Image");
            }
            return ImageAtt;
        }

        @objid ("cdd3d6a7-5217-4db4-b296-0d947c27cafc")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("11fbd048-cdc4-44f8-bc85-79fd8a374276")
        public static SmDependency TypedDocDep() {
            if (TypedDocDep == null) {
            	TypedDocDep = classof().getDependencyDef("TypedDoc");
            }
            return TypedDocDep;
        }

        @objid ("f717fa28-694b-4e9c-8e75-7546a5b7f353")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("6f7b54cf-206a-4e4a-a0c6-201ee301e6be")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("df239bee-855f-48cf-af8b-de7a23738eba")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1364b628-b880-4c95-8ab6-e74b1de8591f")
        public static SmDependency getTypedDocDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedDocDep;
        }

        @objid ("0c2f4a30-b4b1-44a3-bcc4-acaa4a906fa9")
        public static SmAttribute getIconAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IconAtt;
        }

        @objid ("cc0ea8cd-e77a-4a90-aaa1-19bea05e3965")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("9d5b1a2d-9c55-41bc-a79a-73f2f7031761")
        public static SmAttribute getImageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImageAtt;
        }

        @objid ("b6165c1f-2853-47d8-aa76-93f7b69ec87e")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("1ad3541e-019a-4236-bbac-fe6dab641479")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("009733f8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2f71071f-a405-4625-b694-4a430956258b")
            public ISmObjectData createData() {
                return new ExternDocumentTypeData();
            }

            @objid ("8f9ad042-480f-416c-8306-fb7dd1c14b42")
            public SmObjectImpl createImpl() {
                return new ExternDocumentTypeImpl();
            }

        }

        @objid ("00979992-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("860dd928-89bd-4a8a-9c33-0eed99005b0b")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mIsHidden;
            }

            @objid ("507db45f-13d2-43d2-8c3c-a6eee62f05d9")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mIsHidden = value;
            }

        }

        @objid ("00985dfa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IconSmAttribute extends SmAttribute {
            @objid ("7bbbd2f8-7d80-40cb-b47e-b8d376466c1f")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mIcon;
            }

            @objid ("fecda228-3b08-4b56-b78e-a5cc0084ce31")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mIcon = value;
            }

        }

        @objid ("00002bca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImageSmAttribute extends SmAttribute {
            @objid ("a135c187-f6f9-427b-bf5c-800036bd83ec")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mImage;
            }

            @objid ("b319af61-2beb-4ca4-b020-e6a68d517335")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mImage = value;
            }

        }

        @objid ("000091d2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TypedDocSmDependency extends SmMultipleDependency {
            @objid ("024fde81-5605-4b56-ad86-e5e209d032f5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExternDocumentTypeData)data).mTypedDoc != null)? ((ExternDocumentTypeData)data).mTypedDoc:SmMultipleDependency.EMPTY;
            }

            @objid ("f5e96670-ede8-4f5a-8001-f3e2aa02d704")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExternDocumentTypeData) data).mTypedDoc = new ArrayList<>(initialCapacity);
                return ((ExternDocumentTypeData) data).mTypedDoc;
            }

            @objid ("5f95ffd9-e5e4-4ec0-aab5-9d6212b5c35f")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentData.Metadata.TypeDep();
            }

        }

        @objid ("00010004-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("1a507171-94ed-46bd-bdd6-6f0e68313bae")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mOwnerStereotype;
            }

            @objid ("7cdaf17c-371d-48c4-9cdd-19a626670e01")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentTypeData) data).mOwnerStereotype = value;
            }

            @objid ("ca60348a-fe26-4e5c-9a14-1d47f94bc104")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedExternDocumentTypeDep();
            }

        }

        @objid ("000180a6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("74cd0ac9-ce4f-4a93-8b66-8c04a062fe02")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mOwnerReference;
            }

            @objid ("25f4a3c1-5a41-4db1-bef7-acc6b3db877b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentTypeData) data).mOwnerReference = value;
            }

            @objid ("b2aca88f-110c-4c27-b3e6-66f0285557a9")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedExternDocumentTypeDep();
            }

        }

        @objid ("c5b47be4-961c-46e8-8bc0-b65eb132295f")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("c31f78f2-6675-4d25-8655-61f967803b21")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mLabelKey;
            }

            @objid ("038a7eab-27d9-4c71-83e9-56544edf52ea")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mLabelKey = value;
            }

        }

    }

}
