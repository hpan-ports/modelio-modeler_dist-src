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
    @objid ("ce0f15da-c1e8-4852-9f5d-2387f6b22410")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("8ac1af2f-7bf6-4abc-ba71-6bf0d3b21db9")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("f70d6d6e-ee7c-460b-b921-e7459dca5028")
    @SmaMetaAttribute(metaName="Icon", type=String.class, smAttributeClass=Metadata.IconSmAttribute.class)
     Object mIcon = "";

    @objid ("6faef421-2531-4c7b-965f-8707ec0e41e3")
    @SmaMetaAttribute(metaName="Image", type=String.class, smAttributeClass=Metadata.ImageSmAttribute.class)
     Object mImage = "";

    @objid ("f7cb7883-1880-4814-adc8-8237af45f8ae")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("798b80e5-a1bb-4fd9-844b-ba8c5ef4b323")
    @SmaMetaAssociation(metaName="TypedDoc", typeDataClass=ExternDocumentData.class, min=0, max=-1, smAssociationClass=Metadata.TypedDocSmDependency.class, performanceRisk = true, istodelete = true)
     List<SmObjectImpl> mTypedDoc = null;

    @objid ("6e5e4335-5c4a-4bbf-b7ec-91c067b71845")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("40dd744a-2b5b-4865-bcf4-7aa95ff3a1f4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0096f2da-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("96fdf184-f9ac-4d02-b02e-c60deafba28f")
        private static SmClass smClass = null;

        @objid ("afa135c6-348b-4e50-b1bf-7dd7332094cb")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("cad48f02-d950-41ce-afe3-2320a278eed9")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("9eba1195-ee72-4c74-9a30-62f878c23d17")
        private static SmAttribute IconAtt = null;

        @objid ("db304d5f-bcdb-46b9-95ca-f4456531335b")
        private static SmAttribute ImageAtt = null;

        @objid ("245ef638-a10f-4cbf-95d8-3e9837249893")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("79cad2a3-dcb3-43d6-bb6b-d3b3c22e4df5")
        private static SmDependency TypedDocDep = null;

        @objid ("cf6d02ac-be3b-408f-8849-afde2e12fd7a")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("9e10d96a-dc79-4ff1-b8d4-3ad3e3530634")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExternDocumentTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9e00c13a-2bc2-47b1-bedc-716a35c39492")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("08374d54-7285-4851-b1ad-9bc953a385ef")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("70f2e843-ecf2-4b48-9fc4-e406c67ad9a9")
        public static SmAttribute IconAtt() {
            if (IconAtt == null) {
            	IconAtt = classof().getAttributeDef("Icon");
            }
            return IconAtt;
        }

        @objid ("1658094f-96fc-4f8f-be6e-93ef6fb870ff")
        public static SmAttribute ImageAtt() {
            if (ImageAtt == null) {
            	ImageAtt = classof().getAttributeDef("Image");
            }
            return ImageAtt;
        }

        @objid ("d3ce9780-91c4-4c90-a000-34ea2b91d2b0")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("a4bd86bb-6929-491e-84be-924c924678bc")
        public static SmDependency TypedDocDep() {
            if (TypedDocDep == null) {
            	TypedDocDep = classof().getDependencyDef("TypedDoc");
            }
            return TypedDocDep;
        }

        @objid ("f1f14eb8-465e-45ae-b2a8-d496870053ad")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("8d5c70c2-e1d3-4d34-aafa-fa5f32acbaa3")
        public static SmAttribute getImageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImageAtt;
        }

        @objid ("c19bdda0-a5cb-4ebb-b961-2826c497b75f")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("efad2dee-9125-4289-b933-1e2ea06aadb3")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("caa066b4-d8de-4805-af34-7e3df4fcb4b5")
        public static SmAttribute getIconAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IconAtt;
        }

        @objid ("0f208ce4-4518-49a4-b097-81ce25a6a099")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("10563f90-03e4-4026-9ea0-7d5975c65795")
        public static SmDependency getTypedDocDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedDocDep;
        }

        @objid ("af47f775-c54c-4a1c-a7a1-1d15923cc95d")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("523bd708-f8ad-4f31-9780-c78e9ea5c500")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("009733f8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("22fabbf7-f40b-4c96-87f0-f02b8aef7019")
            public ISmObjectData createData() {
                return new ExternDocumentTypeData();
            }

            @objid ("1acff26f-bfbf-4626-9548-5b59f418875c")
            public SmObjectImpl createImpl() {
                return new ExternDocumentTypeImpl();
            }

        }

        @objid ("00979992-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("d3f74455-4ac0-47f2-a14f-8a562444db70")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mIsHidden;
            }

            @objid ("fafb45bc-d7d6-42ea-8ea9-6f90c2a2495c")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mIsHidden = value;
            }

        }

        @objid ("00985dfa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IconSmAttribute extends SmAttribute {
            @objid ("71caf32c-4395-4e21-b722-0fe04447c1ab")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mIcon;
            }

            @objid ("a5fd3f61-d549-4239-9286-8d6bf373bf7d")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mIcon = value;
            }

        }

        @objid ("00002bca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImageSmAttribute extends SmAttribute {
            @objid ("c48a7d81-86f7-45bb-a5f6-fec7a79835ea")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mImage;
            }

            @objid ("b4aae69d-a1bf-429f-8c7a-dc9024faf791")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mImage = value;
            }

        }

        @objid ("000091d2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TypedDocSmDependency extends SmMultipleDependency {
            @objid ("0a0a0e56-2f04-422d-92c2-bd4ee2b04bfd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExternDocumentTypeData)data).mTypedDoc != null)? ((ExternDocumentTypeData)data).mTypedDoc:SmMultipleDependency.EMPTY;
            }

            @objid ("67887a55-476c-4fb5-ba6b-cd0f12b83206")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExternDocumentTypeData) data).mTypedDoc = new ArrayList<>(initialCapacity);
                return ((ExternDocumentTypeData) data).mTypedDoc;
            }

            @objid ("c4b2cf1c-5df6-402f-b8d4-009c87808e8a")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentData.Metadata.TypeDep();
            }

        }

        @objid ("00010004-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("ae83c3f8-915d-40b2-9d4d-110ced2d36a7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mOwnerStereotype;
            }

            @objid ("18d19f8b-ba04-4687-8f84-fd838b4115ef")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentTypeData) data).mOwnerStereotype = value;
            }

            @objid ("523942da-0f88-47f3-b850-ccdda70d6f12")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedExternDocumentTypeDep();
            }

        }

        @objid ("000180a6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("1ba2fa1c-beb3-407e-bd42-383629778d01")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mOwnerReference;
            }

            @objid ("301cdc01-1a89-4c79-ada1-bf1cd34ae4da")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentTypeData) data).mOwnerReference = value;
            }

            @objid ("0f79e896-07ef-4e2f-99ae-9ba2f063ccd6")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedExternDocumentTypeDep();
            }

        }

        @objid ("c5b47be4-961c-46e8-8bc0-b65eb132295f")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("aab69514-2255-493b-a4f1-77a894d05ee4")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mLabelKey;
            }

            @objid ("7aafcfd6-bacc-48d1-b3e7-3a6fed606690")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mLabelKey = value;
            }

        }

    }

}
