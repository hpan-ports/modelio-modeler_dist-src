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
    @objid ("67790352-05df-467e-b8c2-93fba15ecdc9")
    @SmaMetaAttribute(metaName="MimeType", type=String.class, smAttributeClass=Metadata.MimeTypeSmAttribute.class)
     Object mMimeType = "";

    @objid ("b1ba86fc-9cec-43be-9644-6e9ac534c268")
    @SmaMetaAttribute(metaName="Path", type=String.class, smAttributeClass=Metadata.PathSmAttribute.class)
     Object mPath = "";

    @objid ("a3f8ff5c-9059-4e8d-829c-3972ec65cf41")
    @SmaMetaAttribute(metaName="Abstract", type=String.class, smAttributeClass=Metadata.AbstractSmAttribute.class)
     Object mAbstract = "";

    @objid ("2d917f67-e438-46cd-ba64-4cd4701a5bd0")
    @SmaMetaAssociation(metaName="Type", typeDataClass=ExternDocumentTypeData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("30bd3617-ea1e-40ac-bba2-b27e5d1d860f")
    @SmaMetaAssociation(metaName="Subject", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.SubjectSmDependency.class)
     SmObjectImpl mSubject;

    @objid ("41cabdc0-2cbf-4776-9e68-33704d165985")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006c87a2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d997460d-a009-4bd5-8df4-65575babba6f")
        private static SmClass smClass = null;

        @objid ("04f06fa9-2e45-4591-89bf-17df60a5383e")
        private static SmAttribute MimeTypeAtt = null;

        @objid ("aa1e7acd-3aea-4c65-adf4-d3f00a3cf2ff")
        private static SmAttribute PathAtt = null;

        @objid ("1c14d585-2626-4586-b98f-c81a6825c212")
        private static SmAttribute AbstractAtt = null;

        @objid ("0d02db24-da9c-4ccd-81a7-f72341e5cce8")
        private static SmDependency TypeDep = null;

        @objid ("3da376a0-1264-4815-ada9-03ef8277150b")
        private static SmDependency SubjectDep = null;

        @objid ("c9aded0b-39d0-4abb-b0bf-72536ff10785")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExternDocumentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8be7ba2e-ff58-48b1-a9a6-8f4489694136")
        public static SmAttribute MimeTypeAtt() {
            if (MimeTypeAtt == null) {
            	MimeTypeAtt = classof().getAttributeDef("MimeType");
            }
            return MimeTypeAtt;
        }

        @objid ("46869528-fa29-4606-b93c-67bbe2239569")
        public static SmAttribute PathAtt() {
            if (PathAtt == null) {
            	PathAtt = classof().getAttributeDef("Path");
            }
            return PathAtt;
        }

        @objid ("8dbcf599-fcde-4bc8-b051-cc0624fa2b16")
        public static SmAttribute AbstractAtt() {
            if (AbstractAtt == null) {
            	AbstractAtt = classof().getAttributeDef("Abstract");
            }
            return AbstractAtt;
        }

        @objid ("dee5b871-e419-4880-ab26-f990ad42c853")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("e8049148-da35-4700-a49c-a6e1784278b3")
        public static SmDependency SubjectDep() {
            if (SubjectDep == null) {
            	SubjectDep = classof().getDependencyDef("Subject");
            }
            return SubjectDep;
        }

        @objid ("cbf09122-f449-4017-a417-45d9d66bf8a9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("44867f42-bf1f-4354-b881-978b20384b3b")
        public static SmAttribute getAbstractAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AbstractAtt;
        }

        @objid ("fc73fef1-5282-4e4f-8623-c7d3e49faca7")
        public static SmAttribute getMimeTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MimeTypeAtt;
        }

        @objid ("03b93a1d-0977-4ac4-94da-cf9c8ae7a92f")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("515915c9-f00e-46ce-b133-168c63c27636")
        public static SmDependency getSubjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubjectDep;
        }

        @objid ("2022ff42-e0f3-41c4-aacb-88be7eca4cdd")
        public static SmAttribute getPathAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PathAtt;
        }

        @objid ("006cc762-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("67c72455-edc9-4ee4-8c9f-5fb8e0134aa5")
            public ISmObjectData createData() {
                return new ExternDocumentData();
            }

            @objid ("2e0b1556-c2dd-47ec-822f-fc330cef1788")
            public SmObjectImpl createImpl() {
                return new ExternDocumentImpl();
            }

        }

        @objid ("006d27a2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MimeTypeSmAttribute extends SmAttribute {
            @objid ("9cbe2800-298e-4aa9-abb0-b6871a4bb19d")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mMimeType;
            }

            @objid ("626b1633-ec2d-4272-a4de-2f4c0456ced4")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentData) data).mMimeType = value;
            }

        }

        @objid ("006dc1bc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PathSmAttribute extends SmAttribute {
            @objid ("82985465-8024-404e-8ab0-08f96f316ecc")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mPath;
            }

            @objid ("9d39b4de-b483-4311-af78-f13e67763b38")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentData) data).mPath = value;
            }

        }

        @objid ("006e3994-c4c5-1fd8-97fe-001ec947cd2a")
        public static class AbstractSmAttribute extends SmAttribute {
            @objid ("78c6cad3-d5a2-4188-b438-52f55c679fcf")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mAbstract;
            }

            @objid ("c0d13807-3709-4ee8-840d-7ddefe7359a3")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentData) data).mAbstract = value;
            }

        }

        @objid ("006eae92-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubjectSmDependency extends SmSingleDependency {
            @objid ("068e9b4e-ab49-43cd-b29d-80886f320dd4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mSubject;
            }

            @objid ("f339c8ba-9ab4-4934-900c-f0b3cb937f91")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentData) data).mSubject = value;
            }

            @objid ("47b07295-8681-4c3a-8c0e-52e02755da8c")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DocumentDep();
            }

        }

        @objid ("006f3812-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("d7ece78a-bc2f-42fc-902a-833f6a921336")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mType;
            }

            @objid ("48a789d0-cff7-4c43-a7ab-d92eaf12a830")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentData) data).mType = value;
            }

            @objid ("6c837fd2-fd0d-4d0c-9381-9567dc36a19c")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentTypeData.Metadata.TypedDocDep();
            }

        }

    }

}
