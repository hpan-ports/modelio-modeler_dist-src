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
    @objid ("51a70c2b-cecc-4a4d-b8a0-2bb1bdc6bcc9")
    @SmaMetaAttribute(metaName="SetName", type=String.class, smAttributeClass=Metadata.SetNameSmAttribute.class)
     Object mSetName = "";

    @objid ("763d9b69-baad-45bf-aa21-1ac54fba412a")
    @SmaMetaAttribute(metaName="AssociatedType", type=ModuleParameterType.class, smAttributeClass=Metadata.AssociatedTypeSmAttribute.class)
     Object mAssociatedType = ModuleParameterType.TYPE_PARAM_STRING;

    @objid ("98020c8a-6c76-4660-a262-08b2bde3f461")
    @SmaMetaAttribute(metaName="IsUserRead", type=Boolean.class, smAttributeClass=Metadata.IsUserReadSmAttribute.class, einoexternalize=true)
     Object mIsUserRead = true;

    @objid ("45c924f4-7746-4f65-882d-98c49571646c")
    @SmaMetaAttribute(metaName="IsUserWrite", type=Boolean.class, smAttributeClass=Metadata.IsUserWriteSmAttribute.class, einoexternalize=true)
     Object mIsUserWrite = true;

    @objid ("4bcee0d0-fb9e-4295-8ce3-26cd07aa07b3")
    @SmaMetaAttribute(metaName="IsApiRead", type=Boolean.class, smAttributeClass=Metadata.IsApiReadSmAttribute.class, einoexternalize=true)
     Object mIsApiRead = true;

    @objid ("c6b350c6-7d9f-4923-a90e-5beee85e288e")
    @SmaMetaAttribute(metaName="IsApiWrite", type=Boolean.class, smAttributeClass=Metadata.IsApiWriteSmAttribute.class, einoexternalize=true)
     Object mIsApiWrite = true;

    @objid ("efd25d47-1b53-4f25-b8bd-13f657e49f88")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("9e385033-3f6f-4469-9ba8-75d41eb2ec79")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModuleComponentData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("45734571-c294-4e39-8453-b094077c920e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0047be2c-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("526000e0-9e37-41c7-a2a5-506de0b5caac")
        private static SmClass smClass = null;

        @objid ("66e92ab7-ea20-44cd-aa4d-e38dbe030ef9")
        private static SmAttribute SetNameAtt = null;

        @objid ("49e406fd-8991-4c22-9a08-635c5712543e")
        private static SmAttribute AssociatedTypeAtt = null;

        @objid ("3017aab3-bd6e-4fa1-8c69-5ddb1bd33e47")
        private static SmAttribute IsUserReadAtt = null;

        @objid ("39f9e815-d9af-4daf-bc6e-fcc790a297bb")
        private static SmAttribute IsUserWriteAtt = null;

        @objid ("ded27158-ff4b-4e0e-ba8d-1cfa0340f2c6")
        private static SmAttribute IsApiReadAtt = null;

        @objid ("116471df-9fc1-4a0c-96d7-64228814d5d7")
        private static SmAttribute IsApiWriteAtt = null;

        @objid ("d571ec0d-8f14-42b7-8b24-507ea84087f8")
        private static SmDependency TypeDep = null;

        @objid ("d04fc993-0031-4ab4-ac80-293ee9f0888c")
        private static SmDependency OwnerDep = null;

        @objid ("39911506-8682-4c79-950e-de5eb2ae88a1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModuleParameterData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("997262e9-f12d-4ef5-b327-f3217bfe30af")
        public static SmAttribute SetNameAtt() {
            if (SetNameAtt == null) {
            	SetNameAtt = classof().getAttributeDef("SetName");
            }
            return SetNameAtt;
        }

        @objid ("a67e4032-b178-42e6-bbe7-c659feab017c")
        public static SmAttribute AssociatedTypeAtt() {
            if (AssociatedTypeAtt == null) {
            	AssociatedTypeAtt = classof().getAttributeDef("AssociatedType");
            }
            return AssociatedTypeAtt;
        }

        @objid ("360119c6-b85a-489b-90ea-d7d463bd29e7")
        public static SmAttribute IsUserReadAtt() {
            if (IsUserReadAtt == null) {
            	IsUserReadAtt = classof().getAttributeDef("IsUserRead");
            }
            return IsUserReadAtt;
        }

        @objid ("ab858256-af4b-4cab-8d09-8deb612896b6")
        public static SmAttribute IsUserWriteAtt() {
            if (IsUserWriteAtt == null) {
            	IsUserWriteAtt = classof().getAttributeDef("IsUserWrite");
            }
            return IsUserWriteAtt;
        }

        @objid ("875bdcbf-6b42-44fe-a757-ca0734650844")
        public static SmAttribute IsApiReadAtt() {
            if (IsApiReadAtt == null) {
            	IsApiReadAtt = classof().getAttributeDef("IsApiRead");
            }
            return IsApiReadAtt;
        }

        @objid ("0a7ec77f-4f16-47da-98d8-6fcb43ccf7f3")
        public static SmAttribute IsApiWriteAtt() {
            if (IsApiWriteAtt == null) {
            	IsApiWriteAtt = classof().getAttributeDef("IsApiWrite");
            }
            return IsApiWriteAtt;
        }

        @objid ("d0f9af67-118f-4bad-ae04-b95d4e3c28d9")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("36458865-c7c6-4dd7-a858-5e89bacfea4b")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("63ff5443-76bc-4eb9-bae9-20fcb8d2ab7c")
        public static SmAttribute getIsApiWriteAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsApiWriteAtt;
        }

        @objid ("3ce37a40-31bf-46bc-964d-1ac4a1f43b01")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("de853adb-68a9-4825-b190-a12824760df7")
        public static SmAttribute getAssociatedTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociatedTypeAtt;
        }

        @objid ("5b19b5bd-74d5-4329-b533-6bcb668653b9")
        public static SmAttribute getSetNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SetNameAtt;
        }

        @objid ("f7a078bc-ded9-423d-a402-873a7c071b68")
        public static SmAttribute getIsUserReadAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUserReadAtt;
        }

        @objid ("e2c9d36f-91bc-4a15-ad23-afbd3259d666")
        public static SmAttribute getIsApiReadAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsApiReadAtt;
        }

        @objid ("5b20c1bf-264f-49be-9df1-397a43f20961")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1f92174b-8ef4-41b4-9692-8fd28cb60cbb")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("f0df9eec-a312-4e45-9235-9263f0ef56d0")
        public static SmAttribute getIsUserWriteAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsUserWriteAtt;
        }

        @objid ("0047fe1e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("156bb7e3-5302-4418-995a-064a148b966f")
            public ISmObjectData createData() {
                return new ModuleParameterData();
            }

            @objid ("c3fa6c85-0b9e-4a2e-80b2-a69f7b4ff4e2")
            public SmObjectImpl createImpl() {
                return new ModuleParameterImpl();
            }

        }

        @objid ("00485ecc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SetNameSmAttribute extends SmAttribute {
            @objid ("0564a042-9929-4fec-b64b-34c69dafdc97")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mSetName;
            }

            @objid ("4622728a-21b7-46b3-b43e-68490be76d83")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mSetName = value;
            }

        }

        @objid ("0048be62-c4c2-1fd8-97fe-001ec947cd2a")
        public static class AssociatedTypeSmAttribute extends SmAttribute {
            @objid ("d99b922f-4329-4fca-9e2c-e82772ee339e")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mAssociatedType;
            }

            @objid ("823b0e26-f8b3-4bfe-8a08-1b6fc4907df7")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mAssociatedType = value;
            }

        }

        @objid ("004a603c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("551b9fe7-3c74-4b11-8e9e-b4deebbfe137")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mOwner;
            }

            @objid ("36ed1a8a-bc2a-47b1-8212-6559427c6fa7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModuleParameterData) data).mOwner = value;
            }

            @objid ("09da2c6f-e1ce-492c-8900-7a702769be8d")
            @Override
            public SmDependency getSymetric() {
                return ModuleComponentData.Metadata.ModuleParameterDep();
            }

        }

        @objid ("004aeb92-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("d9fb595a-d856-490d-9f1e-8ebdde154aea")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mType;
            }

            @objid ("cd9306da-9002-40a9-b8a0-82c16a6f9f30")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModuleParameterData) data).mType = value;
            }

            @objid ("b2a6dda3-df8d-45ee-b5cc-dd9b37f5f482")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.OccurenceConfigParamDep();
            }

        }

        @objid ("cf091b60-f120-11e1-b078-001ec947ccaf")
        public static class IsUserReadSmAttribute extends SmAttribute {
            @objid ("0aae4142-a2bd-4d70-b8e2-731bc5032f6c")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsUserRead;
            }

            @objid ("64e63682-d1e7-4ee6-9295-a73ad55d189d")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsUserRead = value;
            }

        }

        @objid ("cf2a7c08-f120-11e1-b078-001ec947ccaf")
        public static class IsUserWriteSmAttribute extends SmAttribute {
            @objid ("0b65b230-8395-4bd8-9bfa-d0b6a566436d")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsUserWrite;
            }

            @objid ("ffcf5142-2506-4f74-b2e6-0486bcac03e8")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsUserWrite = value;
            }

        }

        @objid ("cf2a7c18-f120-11e1-b078-001ec947ccaf")
        public static class IsApiReadSmAttribute extends SmAttribute {
            @objid ("f52cecc6-7a3b-4b8c-86f9-e103f65afe79")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsApiRead;
            }

            @objid ("e829a2cf-d7d0-4698-86a1-7380ca52d349")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsApiRead = value;
            }

        }

        @objid ("cf2a7c28-f120-11e1-b078-001ec947ccaf")
        public static class IsApiWriteSmAttribute extends SmAttribute {
            @objid ("8dfed026-954e-4a21-b7ba-94d066e6d74f")
            public Object getValue(ISmObjectData data) {
                return ((ModuleParameterData) data).mIsApiWrite;
            }

            @objid ("7fb0666c-d6e2-4891-8cda-cd8f725735d8")
            public void setValue(ISmObjectData data, Object value) {
                ((ModuleParameterData) data).mIsApiWrite = value;
            }

        }

    }

}
