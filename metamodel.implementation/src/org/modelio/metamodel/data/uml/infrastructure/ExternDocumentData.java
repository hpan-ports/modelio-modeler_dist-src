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
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ExternDocumentTypeData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.uml.infrastructure.ExternDocumentImpl;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
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

@objid ("0092b9d6-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ExternDocument.class, factory=ExternDocumentData.Metadata.ObjectFactory.class, cmsnode=true)
public class ExternDocumentData extends ModelElementData {
    @objid ("0474cbb3-1882-4c26-a35f-bd61bc160e9d")
    @SmaMetaAttribute(metaName="MimeType", type=String.class, smAttributeClass=Metadata.MimeTypeSmAttribute.class)
     Object mMimeType = "";

    @objid ("4fc50f3d-1722-4a57-8b6a-34e416ad1478")
    @SmaMetaAttribute(metaName="Path", type=String.class, smAttributeClass=Metadata.PathSmAttribute.class)
     Object mPath = "";

    @objid ("60b2dd27-e9ca-4178-ae5b-0c496762c4c5")
    @SmaMetaAttribute(metaName="Abstract", type=String.class, smAttributeClass=Metadata.AbstractSmAttribute.class)
     Object mAbstract = "";

    @objid ("bcd12b13-3259-49ad-9ae6-c38266c95797")
    @SmaMetaAssociation(metaName="Type", typeDataClass=ExternDocumentTypeData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("248159e3-7789-4f0e-b247-8f37159da2a3")
    @SmaMetaAssociation(metaName="Subject", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.SubjectSmDependency.class)
     SmObjectImpl mSubject;

    @objid ("2b2a096d-bbc8-403e-97a8-58b816c9a207")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006c87a2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("37eef234-0daa-41af-9427-6cee957e8359")
        private static SmClass smClass = null;

        @objid ("adac9b3e-9eb3-4e19-ad0b-816c9a0bd107")
        private static SmAttribute MimeTypeAtt = null;

        @objid ("00fdc642-98ff-4e56-a869-4f150ed32da0")
        private static SmAttribute PathAtt = null;

        @objid ("2fab77b2-204c-4a7c-b0bc-d7b50b91af5d")
        private static SmAttribute AbstractAtt = null;

        @objid ("35c749c8-1558-4bb5-859a-af8ecaaa9c80")
        private static SmDependency TypeDep = null;

        @objid ("562a952e-daa1-4c22-9626-5207ebcf88ed")
        private static SmDependency SubjectDep = null;

        @objid ("cfb196df-ef28-49d0-9e5c-5fb904b6e95e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExternDocumentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9790b82d-3acf-47c3-94aa-00f51017529d")
        public static SmAttribute MimeTypeAtt() {
            if (MimeTypeAtt == null) {
            	MimeTypeAtt = classof().getAttributeDef("MimeType");
            }
            return MimeTypeAtt;
        }

        @objid ("a76cf6f4-7ca7-4d4f-9885-c58c0452a779")
        public static SmAttribute PathAtt() {
            if (PathAtt == null) {
            	PathAtt = classof().getAttributeDef("Path");
            }
            return PathAtt;
        }

        @objid ("c35517cb-7e52-47ac-919a-00596572f553")
        public static SmAttribute AbstractAtt() {
            if (AbstractAtt == null) {
            	AbstractAtt = classof().getAttributeDef("Abstract");
            }
            return AbstractAtt;
        }

        @objid ("3343884f-ea6a-47e8-8ae9-f88460bb91bf")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("8b7a4e91-6547-4504-9642-cdd0e4adb2f4")
        public static SmDependency SubjectDep() {
            if (SubjectDep == null) {
            	SubjectDep = classof().getDependencyDef("Subject");
            }
            return SubjectDep;
        }

        @objid ("e1eec088-c990-4dd7-bda2-c8f23c13bf6f")
        public static SmAttribute getPathAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PathAtt;
        }

        @objid ("2651deaa-6765-4720-83ae-54e76e8a98c8")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("4b4019de-fa14-4b73-87a0-6caa9d6e5877")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c93375ab-e247-4eac-a66c-381444aa0243")
        public static SmAttribute getMimeTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MimeTypeAtt;
        }

        @objid ("676fdd49-4153-4a74-a545-0a668c3564e8")
        public static SmDependency getSubjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubjectDep;
        }

        @objid ("06a670d8-6697-4535-a619-d886886916e7")
        public static SmAttribute getAbstractAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AbstractAtt;
        }

        @objid ("006cc762-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d58c034d-ddd5-44aa-aaa2-a66f1af86d4a")
            public ISmObjectData createData() {
                return new ExternDocumentData();
            }

            @objid ("9764bb65-2c8e-46ac-bed1-fe09d9579362")
            public SmObjectImpl createImpl() {
                return new ExternDocumentImpl();
            }

        }

        @objid ("006d27a2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MimeTypeSmAttribute extends SmAttribute {
            @objid ("c8ca3540-4c25-47b7-923b-476cb46178e2")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mMimeType;
            }

            @objid ("52aae389-fa47-4aa1-bb65-4659d8b8abe8")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentData) data).mMimeType = value;
            }

        }

        @objid ("006dc1bc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PathSmAttribute extends SmAttribute {
            @objid ("620b8fd8-58d9-4894-a698-4fa414894e6f")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mPath;
            }

            @objid ("da5f504a-678c-423b-959f-7f1d55e0c1e6")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentData) data).mPath = value;
            }

        }

        @objid ("006e3994-c4c5-1fd8-97fe-001ec947cd2a")
        public static class AbstractSmAttribute extends SmAttribute {
            @objid ("ef2fe900-f6c8-4172-84e6-51b066cc1acc")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mAbstract;
            }

            @objid ("89e648e2-dffc-4611-8bdb-03e14018856a")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentData) data).mAbstract = value;
            }

        }

        @objid ("006eae92-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubjectSmDependency extends SmSingleDependency {
            @objid ("e94a36c3-45fa-41b8-8d43-9319e66e98ba")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mSubject;
            }

            @objid ("b2ba7284-ff53-436b-b8ea-eac27935090f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentData) data).mSubject = value;
            }

            @objid ("a3189a64-ec69-45ab-ada5-9aa2dea787ff")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DocumentDep();
            }

        }

        @objid ("006f3812-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("19c6d397-6ecb-401a-8969-fc4457c9c573")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mType;
            }

            @objid ("f92ecbf2-db65-49f8-98ba-de6b6a194733")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentData) data).mType = value;
            }

            @objid ("e5bbaaf3-df75-4f31-9d5a-57d00f115cec")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentTypeData.Metadata.TypedDocDep();
            }

        }

    }

}
