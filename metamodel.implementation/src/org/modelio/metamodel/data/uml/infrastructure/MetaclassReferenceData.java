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
    @objid ("3ec881ab-159d-4d63-8844-f9320b82b2b9")
    @SmaMetaAttribute(metaName="ReferencedClassName", type=String.class, smAttributeClass=Metadata.ReferencedClassNameSmAttribute.class)
     Object mReferencedClassName = "";

    @objid ("e089ed97-c5ff-4ca8-8b33-87c3af7b0aca")
    @SmaMetaAssociation(metaName="DefinedTable", typeDataClass=PropertyTableDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.DefinedTableSmDependency.class, component = true)
     SmObjectImpl mDefinedTable;

    @objid ("017a83ec-c30e-462d-898e-4a5c5abe74c0")
    @SmaMetaAssociation(metaName="DefinedNoteType", typeDataClass=NoteTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedNoteTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedNoteType = null;

    @objid ("6f707e73-1351-4669-ac96-84398f3317b1")
    @SmaMetaAssociation(metaName="DefinedExternDocumentType", typeDataClass=ExternDocumentTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedExternDocumentTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedExternDocumentType = null;

    @objid ("6d306e46-5152-4e5d-bc2b-e88cb9d10b69")
    @SmaMetaAssociation(metaName="OwnerProfile", typeDataClass=ProfileData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProfileSmDependency.class)
     SmObjectImpl mOwnerProfile;

    @objid ("e7855a66-24e4-4b10-b983-3fe44694d190")
    @SmaMetaAssociation(metaName="DefinedTagType", typeDataClass=TagTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTagTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedTagType = null;

    @objid ("3dc4b5ea-0473-47a7-9848-fccd0c575b8d")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00637770-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2350d40d-1d7a-4d8b-94f7-806c8405825b")
        private static SmClass smClass = null;

        @objid ("baaa3dc6-233e-45c0-b751-9ee47a562a70")
        private static SmAttribute ReferencedClassNameAtt = null;

        @objid ("5eef8b8f-5f1d-4fa3-8eff-51a01c7e4351")
        private static SmDependency DefinedTableDep = null;

        @objid ("16b7d44e-1c48-4e43-b92d-47ef69a7116e")
        private static SmDependency DefinedNoteTypeDep = null;

        @objid ("aa24c662-5a52-4e2e-b361-575c92e83c8c")
        private static SmDependency DefinedExternDocumentTypeDep = null;

        @objid ("09fddc58-a07b-464c-a513-2de5c1222d68")
        private static SmDependency OwnerProfileDep = null;

        @objid ("b975741c-5a9a-46d1-95e0-6be70c4d3811")
        private static SmDependency DefinedTagTypeDep = null;

        @objid ("636d3303-c5d2-4b0c-bd29-2eb0982af63d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MetaclassReferenceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b0cca0e9-9f44-4768-a31b-8c6dd6eca812")
        public static SmAttribute ReferencedClassNameAtt() {
            if (ReferencedClassNameAtt == null) {
            	ReferencedClassNameAtt = classof().getAttributeDef("ReferencedClassName");
            }
            return ReferencedClassNameAtt;
        }

        @objid ("1921c888-db93-4127-ad0e-bd12ad2013f9")
        public static SmDependency DefinedTableDep() {
            if (DefinedTableDep == null) {
            	DefinedTableDep = classof().getDependencyDef("DefinedTable");
            }
            return DefinedTableDep;
        }

        @objid ("e9c0e19e-178f-4d3e-bf0c-8aa07db40200")
        public static SmDependency DefinedNoteTypeDep() {
            if (DefinedNoteTypeDep == null) {
            	DefinedNoteTypeDep = classof().getDependencyDef("DefinedNoteType");
            }
            return DefinedNoteTypeDep;
        }

        @objid ("c5984ea3-d19f-4f45-a470-1eaf24d6faef")
        public static SmDependency DefinedExternDocumentTypeDep() {
            if (DefinedExternDocumentTypeDep == null) {
            	DefinedExternDocumentTypeDep = classof().getDependencyDef("DefinedExternDocumentType");
            }
            return DefinedExternDocumentTypeDep;
        }

        @objid ("f7746c97-d36d-4a97-a595-ee15f5dae430")
        public static SmDependency OwnerProfileDep() {
            if (OwnerProfileDep == null) {
            	OwnerProfileDep = classof().getDependencyDef("OwnerProfile");
            }
            return OwnerProfileDep;
        }

        @objid ("09f62235-b2e3-46e9-9616-a05d4af41268")
        public static SmDependency DefinedTagTypeDep() {
            if (DefinedTagTypeDep == null) {
            	DefinedTagTypeDep = classof().getDependencyDef("DefinedTagType");
            }
            return DefinedTagTypeDep;
        }

        @objid ("b04ec8c0-1618-4080-af0b-d0cb8fd8eac6")
        public static SmDependency getDefinedNoteTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedNoteTypeDep;
        }

        @objid ("4f4c0486-389e-41b5-a5e2-d1bad99551ba")
        public static SmDependency getDefinedExternDocumentTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedExternDocumentTypeDep;
        }

        @objid ("91427a08-11fb-4180-bbb1-0b670aa0856d")
        public static SmDependency getDefinedTagTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTagTypeDep;
        }

        @objid ("420b8a80-23d2-45ba-92ea-0bcebab37fb5")
        public static SmDependency getOwnerProfileDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProfileDep;
        }

        @objid ("e955dcce-e280-40a7-a81d-1bed8c5ed19c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7c6b33ec-6b37-4567-bc1a-29682f4a939e")
        public static SmAttribute getReferencedClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferencedClassNameAtt;
        }

        @objid ("999841b9-d912-424f-a0aa-d60f97e27ede")
        public static SmDependency getDefinedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTableDep;
        }

        @objid ("0063b88e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b591d7eb-a547-4963-b9c8-6a4345f513d3")
            public ISmObjectData createData() {
                return new MetaclassReferenceData();
            }

            @objid ("811603d5-c1c4-434c-902d-38ad59af06f9")
            public SmObjectImpl createImpl() {
                return new MetaclassReferenceImpl();
            }

        }

        @objid ("0064254e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ReferencedClassNameSmAttribute extends SmAttribute {
            @objid ("a7cd7be4-3f2f-4c94-b47a-6ec93869af72")
            public Object getValue(ISmObjectData data) {
                return ((MetaclassReferenceData) data).mReferencedClassName;
            }

            @objid ("e8f5bf28-8e06-42d4-b801-6da76d6da7a7")
            public void setValue(ISmObjectData data, Object value) {
                ((MetaclassReferenceData) data).mReferencedClassName = value;
            }

        }

        @objid ("00648926-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerProfileSmDependency extends SmSingleDependency {
            @objid ("6a88fafa-f610-41b5-a88b-8e94e7e4e17e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MetaclassReferenceData) data).mOwnerProfile;
            }

            @objid ("5d0ee5c9-3f75-40a2-948a-0ff2fe9eade7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MetaclassReferenceData) data).mOwnerProfile = value;
            }

            @objid ("c6a168e6-0038-48b0-b4cc-cb9f9c94c367")
            @Override
            public SmDependency getSymetric() {
                return ProfileData.Metadata.OwnedReferenceDep();
            }

        }

        @objid ("0064fdca-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedTagTypeSmDependency extends SmMultipleDependency {
            @objid ("87ae430c-4e4f-4bbe-9c39-9723f45f18fc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MetaclassReferenceData)data).mDefinedTagType != null)? ((MetaclassReferenceData)data).mDefinedTagType:SmMultipleDependency.EMPTY;
            }

            @objid ("37d6be1a-1cc4-416f-bd62-c628c9c115e2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MetaclassReferenceData) data).mDefinedTagType = new ArrayList<>(initialCapacity);
                return ((MetaclassReferenceData) data).mDefinedTagType;
            }

            @objid ("7b9d82d1-0310-4973-83f0-787833ec5a1a")
            @Override
            public SmDependency getSymetric() {
                return TagTypeData.Metadata.OwnerReferenceDep();
            }

        }

        @objid ("00656256-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedNoteTypeSmDependency extends SmMultipleDependency {
            @objid ("2ed5488e-ce30-43ff-8402-7e96e0623b94")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MetaclassReferenceData)data).mDefinedNoteType != null)? ((MetaclassReferenceData)data).mDefinedNoteType:SmMultipleDependency.EMPTY;
            }

            @objid ("cfc39eec-721d-45b9-9e5e-0a0d06033f86")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MetaclassReferenceData) data).mDefinedNoteType = new ArrayList<>(initialCapacity);
                return ((MetaclassReferenceData) data).mDefinedNoteType;
            }

            @objid ("cc614a8c-bda5-40d1-9448-bb44057f92cd")
            @Override
            public SmDependency getSymetric() {
                return NoteTypeData.Metadata.OwnerReferenceDep();
            }

        }

        @objid ("0065c67e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedExternDocumentTypeSmDependency extends SmMultipleDependency {
            @objid ("66795ec3-c7b2-4e17-9b89-13a4433c9a7a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MetaclassReferenceData)data).mDefinedExternDocumentType != null)? ((MetaclassReferenceData)data).mDefinedExternDocumentType:SmMultipleDependency.EMPTY;
            }

            @objid ("e0d5ecf9-d58e-4a0e-a4d6-eaa04748b780")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MetaclassReferenceData) data).mDefinedExternDocumentType = new ArrayList<>(initialCapacity);
                return ((MetaclassReferenceData) data).mDefinedExternDocumentType;
            }

            @objid ("0c8ac91a-28cc-449e-b78e-659a5dabe2df")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentTypeData.Metadata.OwnerReferenceDep();
            }

        }

        @objid ("00968c5a-ec96-1098-b22e-001ec947cd2a")
        public static class DefinedTableSmDependency extends SmSingleDependency {
            @objid ("db8bbbde-7be3-4735-99b1-d6e25fb476bd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MetaclassReferenceData) data).mDefinedTable;
            }

            @objid ("a011238d-1a4c-44eb-ba96-ef6d69710b80")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MetaclassReferenceData) data).mDefinedTable = value;
            }

            @objid ("cccc31b5-28c0-452b-b63c-34ac55e4d6b8")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnerReferenceDep();
            }

        }

    }

}
