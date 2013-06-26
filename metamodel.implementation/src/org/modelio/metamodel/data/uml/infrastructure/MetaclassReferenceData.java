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
    @objid ("b1c34f7b-c593-4baf-877b-d3df91e7fcf5")
    @SmaMetaAttribute(metaName="ReferencedClassName", type=String.class, smAttributeClass=Metadata.ReferencedClassNameSmAttribute.class)
     Object mReferencedClassName = "";

    @objid ("5028d8ab-6773-4f1c-a030-5b222819cc48")
    @SmaMetaAssociation(metaName="DefinedTable", typeDataClass=PropertyTableDefinitionData.class, min=1, max=1, smAssociationClass=Metadata.DefinedTableSmDependency.class, component = true)
     SmObjectImpl mDefinedTable;

    @objid ("7949b707-dffc-4762-b920-16b10acfefe3")
    @SmaMetaAssociation(metaName="DefinedNoteType", typeDataClass=NoteTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedNoteTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedNoteType = null;

    @objid ("431626f8-0063-4a17-96f8-955b6c25b91a")
    @SmaMetaAssociation(metaName="DefinedExternDocumentType", typeDataClass=ExternDocumentTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedExternDocumentTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedExternDocumentType = null;

    @objid ("1a7dc66a-5b9b-4ff9-84ce-89f23076cfb6")
    @SmaMetaAssociation(metaName="OwnerProfile", typeDataClass=ProfileData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProfileSmDependency.class)
     SmObjectImpl mOwnerProfile;

    @objid ("3da3e3c2-00e6-429e-b488-34cc58095880")
    @SmaMetaAssociation(metaName="DefinedTagType", typeDataClass=TagTypeData.class, min=0, max=-1, smAssociationClass=Metadata.DefinedTagTypeSmDependency.class, component = true)
     List<SmObjectImpl> mDefinedTagType = null;

    @objid ("e6e6beac-4999-49f5-8013-cab7e4e2fb72")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00637770-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("0d1765de-0aa9-4752-b052-93c0d74c5955")
        private static SmClass smClass = null;

        @objid ("9b5d799d-64b4-4d7f-a95f-dcc5ec7f0760")
        private static SmAttribute ReferencedClassNameAtt = null;

        @objid ("44b06939-f250-4875-beb3-935bb9f4e61b")
        private static SmDependency DefinedTableDep = null;

        @objid ("66b864d0-3ff1-40ff-9a08-8d3dfc19fc6d")
        private static SmDependency DefinedNoteTypeDep = null;

        @objid ("53c54556-1b7b-4804-ad28-0185f5d78077")
        private static SmDependency DefinedExternDocumentTypeDep = null;

        @objid ("cfc735cd-f98f-4b7e-a1cd-68a991a072bf")
        private static SmDependency OwnerProfileDep = null;

        @objid ("d5927ccf-9e09-4996-b4c3-eff0530eb57b")
        private static SmDependency DefinedTagTypeDep = null;

        @objid ("36a619eb-34ce-44d2-9310-e13205c1ae10")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MetaclassReferenceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e2f809f9-ab82-4ae3-8572-f1e2655dd50c")
        public static SmAttribute ReferencedClassNameAtt() {
            if (ReferencedClassNameAtt == null) {
            	ReferencedClassNameAtt = classof().getAttributeDef("ReferencedClassName");
            }
            return ReferencedClassNameAtt;
        }

        @objid ("ee972309-bd13-4efe-9bbd-5516e85e3bd9")
        public static SmDependency DefinedTableDep() {
            if (DefinedTableDep == null) {
            	DefinedTableDep = classof().getDependencyDef("DefinedTable");
            }
            return DefinedTableDep;
        }

        @objid ("9cd3c389-3ecf-4eef-8ba1-afc150d22937")
        public static SmDependency DefinedNoteTypeDep() {
            if (DefinedNoteTypeDep == null) {
            	DefinedNoteTypeDep = classof().getDependencyDef("DefinedNoteType");
            }
            return DefinedNoteTypeDep;
        }

        @objid ("0201dc43-c5e3-4f08-ae70-73b64d0b1927")
        public static SmDependency DefinedExternDocumentTypeDep() {
            if (DefinedExternDocumentTypeDep == null) {
            	DefinedExternDocumentTypeDep = classof().getDependencyDef("DefinedExternDocumentType");
            }
            return DefinedExternDocumentTypeDep;
        }

        @objid ("0324c225-9c06-439b-b508-9d608e75c005")
        public static SmDependency OwnerProfileDep() {
            if (OwnerProfileDep == null) {
            	OwnerProfileDep = classof().getDependencyDef("OwnerProfile");
            }
            return OwnerProfileDep;
        }

        @objid ("904ea1e0-3c0b-4a2c-8eb1-2887453fcf3a")
        public static SmDependency DefinedTagTypeDep() {
            if (DefinedTagTypeDep == null) {
            	DefinedTagTypeDep = classof().getDependencyDef("DefinedTagType");
            }
            return DefinedTagTypeDep;
        }

        @objid ("f3d0ef43-89bf-4c81-9fcf-3f77310d8771")
        public static SmAttribute getReferencedClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReferencedClassNameAtt;
        }

        @objid ("6dd19945-a329-42b3-9792-bd3ac06683a9")
        public static SmDependency getDefinedTableDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTableDep;
        }

        @objid ("79980e63-3a4c-41e8-8cba-60875654e6c2")
        public static SmDependency getDefinedNoteTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedNoteTypeDep;
        }

        @objid ("88e97195-5556-42ab-b8ca-3ebc1e807191")
        public static SmDependency getDefinedTagTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedTagTypeDep;
        }

        @objid ("08a86328-2307-458f-b4c8-1b0604512423")
        public static SmDependency getOwnerProfileDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProfileDep;
        }

        @objid ("8bf1245f-034a-4794-9d19-4503f24517f1")
        public static SmDependency getDefinedExternDocumentTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefinedExternDocumentTypeDep;
        }

        @objid ("c78adb20-4788-4dfd-9a37-8374552ce882")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0063b88e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2b741a4f-88ed-49d9-8e01-2ce86d830387")
            public ISmObjectData createData() {
                return new MetaclassReferenceData();
            }

            @objid ("a3ca3ebe-7dca-4eac-a55d-ddac7cf0e5e0")
            public SmObjectImpl createImpl() {
                return new MetaclassReferenceImpl();
            }

        }

        @objid ("0064254e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ReferencedClassNameSmAttribute extends SmAttribute {
            @objid ("618f8034-47ad-4396-a94b-b2e82382e63d")
            public Object getValue(ISmObjectData data) {
                return ((MetaclassReferenceData) data).mReferencedClassName;
            }

            @objid ("aae134c1-8ad8-4d56-a5e1-e1101d0e9bee")
            public void setValue(ISmObjectData data, Object value) {
                ((MetaclassReferenceData) data).mReferencedClassName = value;
            }

        }

        @objid ("00648926-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OwnerProfileSmDependency extends SmSingleDependency {
            @objid ("820d86cb-2132-450b-b522-c83edfeb3308")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MetaclassReferenceData) data).mOwnerProfile;
            }

            @objid ("409e1849-e9b8-4a1b-9be0-03b8befcd077")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MetaclassReferenceData) data).mOwnerProfile = value;
            }

            @objid ("0f64f360-eb5d-440d-8564-68d16d4147ce")
            @Override
            public SmDependency getSymetric() {
                return ProfileData.Metadata.OwnedReferenceDep();
            }

        }

        @objid ("0064fdca-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedTagTypeSmDependency extends SmMultipleDependency {
            @objid ("09d34a3e-48b7-434e-8665-eb6450ae4293")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MetaclassReferenceData)data).mDefinedTagType != null)? ((MetaclassReferenceData)data).mDefinedTagType:SmMultipleDependency.EMPTY;
            }

            @objid ("c73cc312-a0da-4545-bc66-b26502c467a6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MetaclassReferenceData) data).mDefinedTagType = new ArrayList<>(initialCapacity);
                return ((MetaclassReferenceData) data).mDefinedTagType;
            }

            @objid ("5d021578-8511-40e4-abc4-dc94369cbfa2")
            @Override
            public SmDependency getSymetric() {
                return TagTypeData.Metadata.OwnerReferenceDep();
            }

        }

        @objid ("00656256-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedNoteTypeSmDependency extends SmMultipleDependency {
            @objid ("db520355-9f1a-4eea-bfc0-26d43ed4e31f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MetaclassReferenceData)data).mDefinedNoteType != null)? ((MetaclassReferenceData)data).mDefinedNoteType:SmMultipleDependency.EMPTY;
            }

            @objid ("a1374483-7361-40a6-a501-eb8edf4f0db9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MetaclassReferenceData) data).mDefinedNoteType = new ArrayList<>(initialCapacity);
                return ((MetaclassReferenceData) data).mDefinedNoteType;
            }

            @objid ("322d9d1a-0932-40ae-baa8-212a09e8b172")
            @Override
            public SmDependency getSymetric() {
                return NoteTypeData.Metadata.OwnerReferenceDep();
            }

        }

        @objid ("0065c67e-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DefinedExternDocumentTypeSmDependency extends SmMultipleDependency {
            @objid ("c3bf9e71-c8d3-4096-9646-79b50e8db243")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MetaclassReferenceData)data).mDefinedExternDocumentType != null)? ((MetaclassReferenceData)data).mDefinedExternDocumentType:SmMultipleDependency.EMPTY;
            }

            @objid ("037d8122-716b-4aaa-847c-9391161ef533")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MetaclassReferenceData) data).mDefinedExternDocumentType = new ArrayList<>(initialCapacity);
                return ((MetaclassReferenceData) data).mDefinedExternDocumentType;
            }

            @objid ("467e587b-a505-40bb-b281-87e7148b1755")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentTypeData.Metadata.OwnerReferenceDep();
            }

        }

        @objid ("00968c5a-ec96-1098-b22e-001ec947cd2a")
        public static class DefinedTableSmDependency extends SmSingleDependency {
            @objid ("28638bbd-de8c-4aae-9861-86f6b84e10a2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MetaclassReferenceData) data).mDefinedTable;
            }

            @objid ("c5f9e423-8fe8-41e2-b3ba-5f78f9943ea7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MetaclassReferenceData) data).mDefinedTable = value;
            }

            @objid ("1c9486d1-4a5f-4c57-b038-8d109690d3f0")
            @Override
            public SmDependency getSymetric() {
                return PropertyTableDefinitionData.Metadata.OwnerReferenceDep();
            }

        }

    }

}
