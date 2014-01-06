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
import org.modelio.metamodel.data.uml.infrastructure.NoteTypeData;
import org.modelio.metamodel.data.uml.infrastructure.ProfileData;
import org.modelio.metamodel.data.uml.infrastructure.TagTypeData;
import org.modelio.metamodel.data.uml.infrastructure.properties.PropertyTableDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.MetaclassReferenceImpl;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
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

@objid ("0091fc9e-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=MetaclassReference.class, factory=MetaclassReferenceData.Metadata.ObjectFactory.class, cmsnode=true)
public class MetaclassReferenceData extends ElementData {
    @objid ("ff90ceba-e9ae-482c-83d1-9fada6c1c16b")
    @SmaMetaAttribute(metaName="ReferencedClassName", type=String.class, smAttributeClass=Metadata.ReferencedClassNameSmAttribute.class)
     Object mReferencedClassName = "";

    @objid ("2c50fec6-4177-4760-b0f3-de059aeaef86")
    @SmaMetaAssociation(metaName="DefinedTable", typeDataClass=PropertyTableDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.DefinedTableSmDependency.class, component = true)
     SmObjectImpl mDefinedTable;

    @objid ("5faa70fe-ff3e-42d2-a865-d97a99733c91")
    @SmaMetaAssociation(metaName="DefinedNoteType", typeDataClass=NoteTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedNoteTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedNoteType = null;

    @objid ("b1e47bdf-da4f-4ffe-9da2-a6a46655ccfd")
    @SmaMetaAssociation(metaName="DefinedExternDocumentType", typeDataClass=ExternDocumentTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedExternDocumentTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedExternDocumentType = null;

    @objid ("0f077aee-64bb-401b-a0ba-b07828a227ca")
    @SmaMetaAssociation(metaName="OwnerProfile", typeDataClass=ProfileData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProfileSmDependency.class)
     SmObjectImpl mOwnerProfile;

    @objid ("9d939a22-3474-4a84-9922-b438fa7ac0d8")
    @SmaMetaAssociation(metaName="DefinedTagType", typeDataClass=TagTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTagTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedTagType = null;

    @objid ("8f574205-773e-435c-adb0-7d8a775d1b98")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00637770-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b1ff4ff6-ab11-4e53-a30f-152372575824")
        private static SmClass smClass = null;

        @objid ("51b67aa0-b1b7-46de-b408-8a3829949084")
        private static SmAttribute ReferencedClassNameAtt = null;

        @objid ("1539c53e-3533-4621-87dd-33bd693f3754")
        private static SmDependency DefinedTableDep = null;

        @objid ("ee21264d-cdff-4154-8a89-cccb9695807c")
        private static SmDependency DefinedNoteTypeDep = null;

        @objid ("7fa3e57d-afe9-40aa-b28a-fb69a65c0eb0")
        private static SmDependency DefinedExternDocumentTypeDep = null;

        @objid ("853ce871-4e94-4c1b-aa43-72e1addf68e1")
        private static SmDependency OwnerProfileDep = null;

        @objid ("c0961a07-59a0-4800-9312-2ae3d5e39ec8")
        private static SmDependency DefinedTagTypeDep = null;

        @objid ("d30c7c5c-8db4-4c4a-a6ce-b745e21cf81e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MetaclassReferenceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ad01ccd8-14b0-4e94-8aba-f2d1602e01e8")
        public static SmAttribute ReferencedClassNameAtt() {
            if (ReferencedClassNameAtt == null) {
            	ReferencedClassNameAtt = classof().getAttributeDef("ReferencedClassName");
            }
            return ReferencedClassNameAtt;
        }

        @objid ("5ebce438-dbb3-4bbd-b127-7fd5ae10236f")
        public static SmDependency DefinedTableDep() {
            if (DefinedTableDep == null) {
            	DefinedTableDep = classof().getDependencyDef("DefinedTable");
            }
            return DefinedTableDep;
        }

        @objid ("3968f2a0-8a62-4e10-a0b5-a11a67725454")
        public static SmDependency DefinedNoteTypeDep() {
            if (DefinedNoteTypeDep == null) {
            	DefinedNoteTypeDep = classof().getDependencyDef("DefinedNoteType");
            }
            return DefinedNoteTypeDep;
        }

        @objid ("1e018648-6d18-4a20-afea-7aaf04189276")
        public static SmDependency DefinedExternDocumentTypeDep() {
            if (DefinedExternDocumentTypeDep == null) {
            	DefinedExternDocumentTypeDep = classof().getDependencyDef("DefinedExternDocumentType");
            }
            return DefinedExternDocumentTypeDep;
        }

        @objid ("0ec1b101-bffb-49d2-aa23-2ea4c2f5b747")
        public static SmDependency OwnerProfileDep() {
            if (OwnerProfileDep == null) {
            	OwnerProfileDep = classof().getDependencyDef("OwnerProfile");
            }
            return OwnerProfileDep;
        }

        @objid ("22fe66c9-ac5f-4414-b321-71c445819cac")
        public static SmDependency DefinedTagTypeDep() {
            if (DefinedTagTypeDep == null) {
            	DefinedTagTypeDep = classof().getDependencyDef("DefinedTagType");
            }
            return DefinedTagTypeDep;
        }

        @objid ("2389ce55-658c-4648-a446-cbaec8ee133e")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("fcacade9-2deb-4cfb-9377-3f2c99fc2a49")
        public static SmDependency getDefinedExternDocumentTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedExternDocumentTypeDep;
        }

        @objid ("df801ce8-47ee-41e2-bee9-7a3360c2e331")
        public static SmAttribute getReferencedClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferencedClassNameAtt;
        }

        @objid ("8f37adc7-636a-46e9-bb40-7765a4cb47ae")
        public static SmDependency getDefinedNoteTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedNoteTypeDep;
        }

        @objid ("3430a7ca-67d9-4854-a1a3-df70bdc1c5f8")
        public static SmDependency getDefinedTagTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTagTypeDep;
        }

        @objid ("aeb66f93-8e4d-4bb2-8a7f-0f3ef691a532")
        public static SmDependency getOwnerProfileDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProfileDep;
        }

        @objid ("17549b9d-0928-4d35-a8ab-16dc08eb6185")
        public static SmDependency getDefinedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTableDep;
        }

        @objid ("0063b88e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("61544c9a-1475-48cf-87b2-9cea500d0bf3")
            public ISmObjectData createData() {
                return new MetaclassReferenceData();
            }

            @objid ("cddb2659-a236-47be-9572-0aadeacc887b")
            public SmObjectImpl createImpl() {
                return new MetaclassReferenceImpl();
            }

        }

        @objid ("0064254e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ReferencedClassNameSmAttribute extends SmAttribute {
            @objid ("3bc127dd-4dc0-4b45-8375-d2e9f90d95a4")
            public Object getValue(ISmObjectData data) {
                return ((MetaclassReferenceData) data).mReferencedClassName;
            }

            @objid ("65eca901-e272-415d-a804-eaa05bcdc831")
            public void setValue(ISmObjectData data, Object value) {
                ((MetaclassReferenceData) data).mReferencedClassName = value;
            }

        }

        @objid ("00648926-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerProfileSmDependency extends SmSingleDependency {
            @objid ("102e125f-c22d-4c3a-8840-6aadc8cc5a81")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MetaclassReferenceData) data).mOwnerProfile;
            }

            @objid ("80b01a4c-6c96-4312-96c7-c7279c815569")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MetaclassReferenceData) data).mOwnerProfile = value;
            }

            @objid ("13fc6e35-3646-4305-87de-09c61159b04d")
            @Override
            public SmDependency getSymetric() {
                return ProfileData.Metadata.OwnedReferenceDep();
            }

        }

        @objid ("0064fdca-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedTagTypeSmDependency extends SmMultipleDependency {
            @objid ("cbfeaa2e-fc74-4973-aa4c-6375f29154fe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MetaclassReferenceData)data).mDefinedTagType != null)? ((MetaclassReferenceData)data).mDefinedTagType:SmMultipleDependency.EMPTY;
            }

            @objid ("df579b7f-f241-4fbe-b9d5-e1640cfabee7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MetaclassReferenceData) data).mDefinedTagType = new ArrayList<>(initialCapacity);
                return ((MetaclassReferenceData) data).mDefinedTagType;
            }

            @objid ("f174e5be-25d2-4326-a829-ace9d298be92")
            @Override
            public SmDependency getSymetric() {
                return TagTypeData.Metadata.OwnerReferenceDep();
            }

        }

        @objid ("00656256-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedNoteTypeSmDependency extends SmMultipleDependency {
            @objid ("2b1889c9-bb86-472c-a8db-880e6300ce8e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MetaclassReferenceData)data).mDefinedNoteType != null)? ((MetaclassReferenceData)data).mDefinedNoteType:SmMultipleDependency.EMPTY;
            }

            @objid ("fc8eec5d-56e0-4cff-b149-5e81e3c71feb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MetaclassReferenceData) data).mDefinedNoteType = new ArrayList<>(initialCapacity);
                return ((MetaclassReferenceData) data).mDefinedNoteType;
            }

            @objid ("1b611a77-a539-4826-b902-f7d29dbe7181")
            @Override
            public SmDependency getSymetric() {
                return NoteTypeData.Metadata.OwnerReferenceDep();
            }

        }

        @objid ("0065c67e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedExternDocumentTypeSmDependency extends SmMultipleDependency {
            @objid ("1ef9d467-b0b8-402f-b0b2-df23357b40b7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MetaclassReferenceData)data).mDefinedExternDocumentType != null)? ((MetaclassReferenceData)data).mDefinedExternDocumentType:SmMultipleDependency.EMPTY;
            }

            @objid ("4b58f99b-3ba9-45e5-8fc2-bfdc591205fb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MetaclassReferenceData) data).mDefinedExternDocumentType = new ArrayList<>(initialCapacity);
                return ((MetaclassReferenceData) data).mDefinedExternDocumentType;
            }

            @objid ("9670e128-d0be-419f-b9bc-4bbd2242a236")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentTypeData.Metadata.OwnerReferenceDep();
            }

        }

        @objid ("00968c5a-ec96-1098-b22e-001ec947cd2a")
        public static class DefinedTableSmDependency extends SmSingleDependency {
            @objid ("b9d62e5f-ac2e-432d-8111-ee662f3141f6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MetaclassReferenceData) data).mDefinedTable;
            }

            @objid ("5d988731-65f8-46d2-b2a6-370571b203bd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MetaclassReferenceData) data).mDefinedTable = value;
            }

            @objid ("3ff7cc05-8b81-4e06-95a0-66bbca9a4996")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnerReferenceDep();
            }

        }

    }

}
