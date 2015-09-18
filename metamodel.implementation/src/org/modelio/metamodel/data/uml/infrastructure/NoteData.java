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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.infrastructure.NoteTypeData;
import org.modelio.metamodel.impl.uml.infrastructure.NoteImpl;
import org.modelio.metamodel.uml.infrastructure.Note;
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

@objid ("008a4260-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Note.class, factory=NoteData.Metadata.ObjectFactory.class)
public class NoteData extends ModelElementData {
    @objid ("620eacdf-438a-41db-9c57-34700835ce68")
    @SmaMetaAttribute(metaName="Content", type=String.class, smAttributeClass=Metadata.ContentSmAttribute.class)
     Object mContent = "";

    @objid ("1f523ebd-064c-4b20-b28d-c6aa018ffc78")
    @SmaMetaAttribute(metaName="MimeType", type=String.class, smAttributeClass=Metadata.MimeTypeSmAttribute.class)
     Object mMimeType = "";

    @objid ("a6d8c8ec-690c-4c37-91af-0f3d938e48b3")
    @SmaMetaAssociation(metaName="Model", typeDataClass=NoteTypeData.class, min=1, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("73665325-755f-42e9-8fad-8f2d3721bed3")
    @SmaMetaAssociation(metaName="Subject", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.SubjectSmDependency.class)
     SmObjectImpl mSubject;

    @objid ("981d60e2-9d1d-49a4-b4db-1244b9cb484f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00185db2-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b68cd341-31b0-4b58-b176-c6af2ee19a9a")
        private static SmClass smClass = null;

        @objid ("0cf43a85-2706-4bfc-9ed9-2e4872af32f8")
        private static SmAttribute ContentAtt = null;

        @objid ("e4f8c281-8f8d-43d2-b537-dd6e362a3484")
        private static SmAttribute MimeTypeAtt = null;

        @objid ("87519f23-d9cc-4cec-bf35-ebd6d7b141c7")
        private static SmDependency ModelDep = null;

        @objid ("e489c464-bfc5-42ba-90f5-70adbbd1a338")
        private static SmDependency SubjectDep = null;

        @objid ("5c8a2196-c744-4867-a0dd-33c933c20857")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NoteData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1c2bd0d5-6c3e-430b-966e-e711dd4755e7")
        public static SmAttribute ContentAtt() {
            if (ContentAtt == null) {
            	ContentAtt = classof().getAttributeDef("Content");
            }
            return ContentAtt;
        }

        @objid ("3a0a844b-379f-4ee6-b44d-8dccba7093c3")
        public static SmAttribute MimeTypeAtt() {
            if (MimeTypeAtt == null) {
            	MimeTypeAtt = classof().getAttributeDef("MimeType");
            }
            return MimeTypeAtt;
        }

        @objid ("5e70fac2-c1fc-424d-94ee-806d94ac3550")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("75b4c0cb-8f91-40f1-b032-85339931ee5f")
        public static SmDependency SubjectDep() {
            if (SubjectDep == null) {
            	SubjectDep = classof().getDependencyDef("Subject");
            }
            return SubjectDep;
        }

        @objid ("febfa57b-8e48-4577-84cb-10a4436f235c")
        public static SmDependency getSubjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubjectDep;
        }

        @objid ("9fa24ac5-bd47-4cc8-8d12-8e4aa8701e68")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("a9b853c4-946c-435e-9d4a-7aa28364dcf3")
        public static SmAttribute getContentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContentAtt;
        }

        @objid ("7d399f25-91ee-463c-8b8e-9ce4f9628954")
        public static SmAttribute getMimeTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MimeTypeAtt;
        }

        @objid ("9d0f68c1-b582-4ded-b779-65805cf78e9a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0018a15a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("97a114a1-5cd9-4d61-bf86-bc7835cda0f0")
            public ISmObjectData createData() {
                return new NoteData();
            }

            @objid ("ae3858bd-23c2-4727-a33b-328debbe1c34")
            public SmObjectImpl createImpl() {
                return new NoteImpl();
            }

        }

        @objid ("0019030c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ContentSmAttribute extends SmAttribute {
            @objid ("092cf266-8bdf-4a3d-8ada-66a928bbaf09")
            public Object getValue(ISmObjectData data) {
                return ((NoteData) data).mContent;
            }

            @objid ("3fab047e-faf8-4f8c-89c2-856cb1ec19f9")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteData) data).mContent = value;
            }

        }

        @objid ("00196612-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubjectSmDependency extends SmSingleDependency {
            @objid ("1a704b23-42a1-4737-a252-e3320d169292")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteData) data).mSubject;
            }

            @objid ("0443fa6c-10bc-4919-8bcf-dfe666b66ae5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteData) data).mSubject = value;
            }

            @objid ("beb05656-e2f8-460c-b3b0-f44bdf561ea1")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DescriptorDep();
            }

        }

        @objid ("0019dd7c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("20b71b69-a383-4940-a4da-9cf165f01085")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteData) data).mModel;
            }

            @objid ("c0aa9c0d-bc29-49c7-a270-9c7577ca1769")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteData) data).mModel = value;
            }

            @objid ("a1c2cf83-1099-4c6d-b73d-e0cd16da339d")
            @Override
            public SmDependency getSymetric() {
                return NoteTypeData.Metadata.ElementDep();
            }

        }

        @objid ("189c592f-f757-4eb9-99dc-d59af1629f82")
        public static class MimeTypeSmAttribute extends SmAttribute {
            @objid ("ed60a60e-7a4d-4210-99ea-7871258cef25")
            public Object getValue(ISmObjectData data) {
                return ((NoteData) data).mMimeType;
            }

            @objid ("73964009-a77c-42e6-95eb-0b80c91f751d")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteData) data).mMimeType = value;
            }

        }

    }

}
