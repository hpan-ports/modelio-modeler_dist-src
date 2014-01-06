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
    @objid ("6033ad16-75d8-4619-8de7-fb3a6540c295")
    @SmaMetaAttribute(metaName="MimeType", type=String.class, smAttributeClass=Metadata.MimeTypeSmAttribute.class)
     Object mMimeType = "";

    @objid ("37b92f40-c0fc-40f9-8644-72f3ef393743")
    @SmaMetaAttribute(metaName="Path", type=String.class, smAttributeClass=Metadata.PathSmAttribute.class)
     Object mPath = "";

    @objid ("06a1d837-b9ef-471c-b958-75d699d1d4e6")
    @SmaMetaAttribute(metaName="Abstract", type=String.class, smAttributeClass=Metadata.AbstractSmAttribute.class)
     Object mAbstract = "";

    @objid ("c7b037e0-ebb6-4118-accd-dbab661876d1")
    @SmaMetaAssociation(metaName="Type", typeDataClass=ExternDocumentTypeData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("86550ce8-5543-41ce-bf1e-d6349692d8a9")
    @SmaMetaAssociation(metaName="Subject", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.SubjectSmDependency.class)
     SmObjectImpl mSubject;

    @objid ("3636e7c2-de52-4159-84cc-9660a040e0e1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006c87a2-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4a165a94-7cf3-4460-8070-5963aabe1aea")
        private static SmClass smClass = null;

        @objid ("dc9b18f4-f69f-4e0e-87b9-ed411f521d7c")
        private static SmAttribute MimeTypeAtt = null;

        @objid ("807f5f5a-f036-4b22-a01f-a9b5359a7f5c")
        private static SmAttribute PathAtt = null;

        @objid ("f157459e-e329-4382-a781-bf8c5dfc2a41")
        private static SmAttribute AbstractAtt = null;

        @objid ("cf9e4db8-68d9-4a81-881b-68cd8217b078")
        private static SmDependency TypeDep = null;

        @objid ("7b4a9ab7-e905-4af9-bc1e-110e48feb942")
        private static SmDependency SubjectDep = null;

        @objid ("f13de2c0-fe58-4816-8c9f-4042f8a77587")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExternDocumentData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("96f9e352-f720-4487-9251-7d8dc9a63972")
        public static SmAttribute MimeTypeAtt() {
            if (MimeTypeAtt == null) {
            	MimeTypeAtt = classof().getAttributeDef("MimeType");
            }
            return MimeTypeAtt;
        }

        @objid ("f21e0cdd-775e-439c-b26d-a549fce71137")
        public static SmAttribute PathAtt() {
            if (PathAtt == null) {
            	PathAtt = classof().getAttributeDef("Path");
            }
            return PathAtt;
        }

        @objid ("070028be-97b5-4f2c-aa37-66b241ca4568")
        public static SmAttribute AbstractAtt() {
            if (AbstractAtt == null) {
            	AbstractAtt = classof().getAttributeDef("Abstract");
            }
            return AbstractAtt;
        }

        @objid ("a30be094-e67d-4e46-a85d-b850cfb4bcd8")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("933e6caf-0ac0-413b-8c52-c7598510a07b")
        public static SmDependency SubjectDep() {
            if (SubjectDep == null) {
            	SubjectDep = classof().getDependencyDef("Subject");
            }
            return SubjectDep;
        }

        @objid ("df40f1b9-0829-46f3-88ba-54a083a61ad0")
        public static SmAttribute getPathAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PathAtt;
        }

        @objid ("2d69b993-2d85-4733-950a-2fed74c02921")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("acd9d8c6-eaea-4ad6-99c0-07182435ef59")
        public static SmAttribute getAbstractAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AbstractAtt;
        }

        @objid ("645dde7b-5ea7-41cd-a90e-5505eb47c30a")
        public static SmAttribute getMimeTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MimeTypeAtt;
        }

        @objid ("5d2e9614-8183-4cf5-9d59-6efea7586844")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("6a41222b-12cb-4945-b28c-24b1353d6951")
        public static SmDependency getSubjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubjectDep;
        }

        @objid ("006cc762-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("06747db9-b53c-4a6b-8ea0-de96808ac4ec")
            public ISmObjectData createData() {
                return new ExternDocumentData();
            }

            @objid ("74ccb65d-f220-44a0-9c43-c8b590c6a5e4")
            public SmObjectImpl createImpl() {
                return new ExternDocumentImpl();
            }

        }

        @objid ("006d27a2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class MimeTypeSmAttribute extends SmAttribute {
            @objid ("d7f8a15a-263a-46b3-aae5-3c13171f5969")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mMimeType;
            }

            @objid ("8e79e0ce-5ae6-4239-8c98-e8877ece3ed7")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentData) data).mMimeType = value;
            }

        }

        @objid ("006dc1bc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PathSmAttribute extends SmAttribute {
            @objid ("a42cd332-29bb-4a61-baf2-577019e0a16b")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mPath;
            }

            @objid ("184373f4-f7c7-4b94-8333-f7645a299265")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentData) data).mPath = value;
            }

        }

        @objid ("006e3994-c4c5-1fd8-97fe-001ec947cd2a")
        public static class AbstractSmAttribute extends SmAttribute {
            @objid ("e2e40d82-b9cc-4de2-9b4c-68d987716462")
            public Object getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mAbstract;
            }

            @objid ("ba4a4c32-4232-4b0a-9ed7-c071251dc758")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternDocumentData) data).mAbstract = value;
            }

        }

        @objid ("006eae92-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubjectSmDependency extends SmSingleDependency {
            @objid ("45872bd2-a7ba-4d72-a600-2595cd72d06f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mSubject;
            }

            @objid ("570f43da-782b-45db-b769-487a4f989d46")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentData) data).mSubject = value;
            }

            @objid ("719648c2-7a76-45ec-bdda-7a0ad556876f")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DocumentDep();
            }

        }

        @objid ("006f3812-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("4c6ad1d5-ed72-4386-a36e-06a197047403")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternDocumentData) data).mType;
            }

            @objid ("5083208a-5efa-4a52-8a02-9ff55ee003ec")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternDocumentData) data).mType = value;
            }

            @objid ("b3e5a715-3769-48f2-9f6e-6f132713631e")
            @Override
            public SmDependency getSymetric() {
                return ExternDocumentTypeData.Metadata.TypedDocDep();
            }

        }

    }

}
