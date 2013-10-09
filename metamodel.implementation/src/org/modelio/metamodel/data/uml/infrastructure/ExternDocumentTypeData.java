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
    @objid ("38aac099-41db-4d2b-873c-e3b703fcfda6")
    @SmaMetaAttribute(metaName="IsHidden", type=Boolean.class, smAttributeClass=Metadata.IsHiddenSmAttribute.class)
     Object mIsHidden = false;

    @objid ("ce776fe6-4f73-4ad9-aea9-cb9e85b1a580")
    @SmaMetaAttribute(metaName="LabelKey", type=String.class, smAttributeClass=Metadata.LabelKeySmAttribute.class)
     Object mLabelKey = "";

    @objid ("7b5d4099-63ce-4610-a3d3-02e6bec50b36")
    @SmaMetaAttribute(metaName="Icon", type=String.class, smAttributeClass=Metadata.IconSmAttribute.class)
     Object mIcon = "";

    @objid ("c4ccb04f-2321-4795-8849-cd3d58467b3e")
    @SmaMetaAttribute(metaName="Image", type=String.class, smAttributeClass=Metadata.ImageSmAttribute.class)
     Object mImage = "";

    @objid ("eb39effd-afe8-4bdf-af0d-97ff0df5dd25")
    @SmaMetaAssociation(metaName="OwnerStereotype", typeDataClass=StereotypeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerStereotypeSmDependency.class)
     SmObjectImpl mOwnerStereotype;

    @objid ("7ae3fd69-def0-4486-9458-7ad3250acf6c")
    @SmaMetaAssociation(metaName="TypedDoc", typeDataClass=ExternDocumentData.class, min=0, max=-1, smAssociationClass=Metadata.TypedDocSmDependency.class, istodelete = true, performanceRisk = true)
     List<SmObjectImpl> mTypedDoc = null;

    @objid ("5a366de8-eb14-4b06-857e-18866e336385")
    @SmaMetaAssociation(metaName="OwnerReference", typeDataClass=MetaclassReferenceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerReferenceSmDependency.class)
     SmObjectImpl mOwnerReference;

    @objid ("e9e24623-8d6f-4278-a46b-aacfce931124")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0096f2da-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("323b6b91-e722-4cda-92f3-d0a15c10da49")
        private static SmClass smClass = null;

        @objid ("a0f030c7-b580-4f8a-9c2e-b069024f732a")
        private static SmAttribute IsHiddenAtt = null;

        @objid ("84c04be9-caf4-4f6b-873d-9b3939944d40")
        private static SmAttribute LabelKeyAtt = null;

        @objid ("8653b268-bd83-4d7f-9ebe-b846e4a80f99")
        private static SmAttribute IconAtt = null;

        @objid ("2322d05b-6d88-4a13-8c17-a3de949a9b9d")
        private static SmAttribute ImageAtt = null;

        @objid ("e3a52aa2-b1a6-43dc-88ec-8e40a1bf4255")
        private static SmDependency OwnerStereotypeDep = null;

        @objid ("4f13781e-ff23-4068-8037-4cefcc2931a8")
        private static SmDependency TypedDocDep = null;

        @objid ("d873b7b6-2749-4d5c-9115-819908cd0b2c")
        private static SmDependency OwnerReferenceDep = null;

        @objid ("1f9525ae-f5e1-4883-97fe-561da49a513b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExternDocumentTypeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fa3b2c72-cd57-4ec0-8fde-c7eb42a1c990")
        public static SmAttribute IsHiddenAtt() {
            if (IsHiddenAtt == null) {
            	IsHiddenAtt = classof().getAttributeDef("IsHidden");
            }
            return IsHiddenAtt;
        }

        @objid ("7ad13baa-0da5-4672-ace2-83f603863d39")
        public static SmAttribute LabelKeyAtt() {
            if (LabelKeyAtt == null) {
            	LabelKeyAtt = classof().getAttributeDef("LabelKey");
            }
            return LabelKeyAtt;
        }

        @objid ("56bba0a9-0865-4747-aa8d-5608cac16c61")
        public static SmAttribute IconAtt() {
            if (IconAtt == null) {
            	IconAtt = classof().getAttributeDef("Icon");
            }
            return IconAtt;
        }

        @objid ("1b590f55-a956-4b5c-b1d5-3c5a8a02d7ff")
        public static SmAttribute ImageAtt() {
            if (ImageAtt == null) {
            	ImageAtt = classof().getAttributeDef("Image");
            }
            return ImageAtt;
        }

        @objid ("2884c803-e3c3-405c-90dc-e9b70100e1a1")
        public static SmDependency OwnerStereotypeDep() {
            if (OwnerStereotypeDep == null) {
            	OwnerStereotypeDep = classof().getDependencyDef("OwnerStereotype");
            }
            return OwnerStereotypeDep;
        }

        @objid ("4c216721-44d9-47a3-bee7-26fc82f0b775")
        public static SmDependency TypedDocDep() {
            if (TypedDocDep == null) {
            	TypedDocDep = classof().getDependencyDef("TypedDoc");
            }
            return TypedDocDep;
        }

        @objid ("a02714b6-2e87-4e0c-ab48-5cee5305cabc")
        public static SmDependency OwnerReferenceDep() {
            if (OwnerReferenceDep == null) {
            	OwnerReferenceDep = classof().getDependencyDef("OwnerReference");
            }
            return OwnerReferenceDep;
        }

        @objid ("741289ef-00d1-406d-8f4b-7ed5d330add8")
        public static SmAttribute getIsHiddenAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsHiddenAtt;
        }

        @objid ("4fa1bc29-3d3e-4b2f-9e5f-670d3bb11f54")
        public static SmDependency getOwnerStereotypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerStereotypeDep;
        }

        @objid ("271df7eb-253d-4c2f-b505-910a588f5e2c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("08532ec2-8733-4cf9-8b6e-92c079f8dc96")
        public static SmDependency getTypedDocDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypedDocDep;
        }

        @objid ("80ad6862-7fc6-43bf-b360-a0a224cdbead")
        public static SmAttribute getLabelKeyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LabelKeyAtt;
        }

        @objid ("732afbd4-5898-4612-9e7a-a0a179eaebd1")
        public static SmAttribute getImageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImageAtt;
        }

        @objid ("002aa780-5039-4706-98b0-1e7cb6877833")
        public static SmAttribute getIconAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IconAtt;
        }

        @objid ("9241fad0-e1c2-4d4b-b320-b5f6220fa041")
        public static SmDependency getOwnerReferenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerReferenceDep;
        }

        @objid ("009733f8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8a87de9e-ce73-4642-9819-48e87aec45c8")
            public ISmObjectData createData() {
                return new ExternDocumentTypeData();
            }

            @objid ("654093e9-9630-45ef-804e-fd5a2833e6ed")
            public SmObjectImpl createImpl() {
                return new ExternDocumentTypeImpl();
            }

        }

        @objid ("00979992-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IsHiddenSmAttribute extends SmAttribute {
            @objid ("69c4c665-7273-4a1c-a9ac-21d1d871d548")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mIsHidden;
            }

            @objid ("88e64ecd-6323-4e0e-bc90-4a36ca4882fb")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mIsHidden = value;
            }

        }

        @objid ("00985dfa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IconSmAttribute extends SmAttribute {
            @objid ("ef12c0eb-cd80-4dc9-b8a7-b4bbfbc13a85")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mIcon;
            }

            @objid ("18aec98d-3723-4267-b949-abf69b1c33dd")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mIcon = value;
            }

        }

        @objid ("00002bca-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImageSmAttribute extends SmAttribute {
            @objid ("2deddae8-c7dd-42dc-9272-4d0b11afcada")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mImage;
            }

            @objid ("1baa1d43-4e4d-4d44-926e-3d7f81763610")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mImage = value;
            }

        }

        @objid ("000091d2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class TypedDocSmDependency extends SmMultipleDependency {
            @objid ("923a98ef-a319-44b0-8df7-03dada16e417")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ExternDocumentTypeData)data).mTypedDoc != null)? ((ExternDocumentTypeData)data).mTypedDoc:SmMultipleDependency.EMPTY;
            }

            @objid ("6f631d35-6728-44b4-9c79-d3d41aaefb08")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ExternDocumentTypeData) data).mTypedDoc = new ArrayList<>(initialCapacity);
                return ((ExternDocumentTypeData) data).mTypedDoc;
            }

            @objid ("8699ce76-7a16-4574-827a-166b8ed31878")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentData.Metadata.TypeDep();
            }

        }

        @objid ("00010004-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerStereotypeSmDependency extends SmSingleDependency {
            @objid ("7f7a1a4e-8413-4fb2-8c3e-b267b3ba9754")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mOwnerStereotype;
            }

            @objid ("5e0661f7-9300-4d40-9fd0-97516d7cab6d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentTypeData) data).mOwnerStereotype = value;
            }

            @objid ("86f1c968-cfca-4446-82ed-62ebe8c6104e")
            @Override
            public SmDependency getSymetric() {
                return StereotypeData.Metadata.DefinedExternDocumentTypeDep();
            }

        }

        @objid ("000180a6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OwnerReferenceSmDependency extends SmSingleDependency {
            @objid ("50461a99-0c99-4a07-a5b5-ee1419898ca2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mOwnerReference;
            }

            @objid ("95059b5d-930b-4570-80e6-86e74eb9fb08")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentTypeData) data).mOwnerReference = value;
            }

            @objid ("efc9de56-e849-4bed-bd62-349fcadad640")
            @Override
            public SmDependency getSymetric() {
                return MetaclassReferenceData.Metadata.DefinedExternDocumentTypeDep();
            }

        }

        @objid ("c5b47be4-961c-46e8-8bc0-b65eb132295f")
        public static class LabelKeySmAttribute extends SmAttribute {
            @objid ("da14340d-f2e1-4d94-be4c-057a9c645c78")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentTypeData) data).mLabelKey;
            }

            @objid ("ab9d21e4-2c52-4560-a0af-1e610f2c83d7")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentTypeData) data).mLabelKey = value;
            }

        }

    }

}
