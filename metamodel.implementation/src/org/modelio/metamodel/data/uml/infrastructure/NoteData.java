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
    @objid ("27d88974-e694-4454-964e-8e1b524b61f4")
    @SmaMetaAttribute(metaName="Content", type=String.class, smAttributeClass=Metadata.ContentSmAttribute.class)
     Object mContent = "";

    @objid ("5952337d-341a-4ad2-9f34-17d973b2dc5f")
    @SmaMetaAssociation(metaName="Model", typeDataClass=NoteTypeData.class, min=1, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("d090bc9f-e693-496c-b0ef-3ee0468e0244")
    @SmaMetaAssociation(metaName="Subject", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.SubjectSmDependency.class)
     SmObjectImpl mSubject;

    @objid ("e6e1218f-8193-4e9a-8cd6-a6fc80640373")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00185db2-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5a23fef5-1608-40d9-a6b6-f25a7bcf2602")
        private static SmClass smClass = null;

        @objid ("69fe99c8-3b7f-42fa-87a1-070c5b007c44")
        private static SmAttribute ContentAtt = null;

        @objid ("be5cb364-0928-488a-b38a-7597bfd465e4")
        private static SmDependency ModelDep = null;

        @objid ("e7de75a9-dc4a-42e4-9396-3a049df9fd77")
        private static SmDependency SubjectDep = null;

        @objid ("7641eee2-f2b4-41c2-995b-5ba4a8e08f4d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NoteData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("869a9480-c750-4fa5-91fa-104e8133004f")
        public static SmAttribute ContentAtt() {
            if (ContentAtt == null) {
            	ContentAtt = classof().getAttributeDef("Content");
            }
            return ContentAtt;
        }

        @objid ("2ed9539a-62a7-4d99-8205-6e0ac921935a")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("ebce505e-f48f-4f4f-ab12-cd2470952ca7")
        public static SmDependency SubjectDep() {
            if (SubjectDep == null) {
            	SubjectDep = classof().getDependencyDef("Subject");
            }
            return SubjectDep;
        }

        @objid ("57b66ec8-45f3-4433-ab95-4750a064bf56")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("f5b64a54-0b14-4a2c-891a-ea12cefe489a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("dedcd703-e932-4cd2-b974-4ed5c9a20bbf")
        public static SmAttribute getContentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContentAtt;
        }

        @objid ("31c8f1fc-2969-4e06-973f-43ebd9e423ff")
        public static SmDependency getSubjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubjectDep;
        }

        @objid ("0018a15a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9968106f-3ad6-4501-b607-d926fd927116")
            public ISmObjectData createData() {
                return new NoteData();
            }

            @objid ("069c96b8-f1a4-4c85-a42c-499f33677aa4")
            public SmObjectImpl createImpl() {
                return new NoteImpl();
            }

        }

        @objid ("0019030c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ContentSmAttribute extends SmAttribute {
            @objid ("ced0a26a-ea4f-40ea-b8e1-74c8da703e60")
            public Object getValue(ISmObjectData data) {
                return ((NoteData) data).mContent;
            }

            @objid ("9c884af5-7f8e-488c-9e2d-3d5ee767bea6")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteData) data).mContent = value;
            }

        }

        @objid ("00196612-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubjectSmDependency extends SmSingleDependency {
            @objid ("51d2ef4b-eef3-412e-ac8e-db3712a726a3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteData) data).mSubject;
            }

            @objid ("6f60880c-cbc0-42f1-9152-7734c1705462")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteData) data).mSubject = value;
            }

            @objid ("f3d8e588-d1d9-4a61-85fc-a4d9c68fb4ad")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DescriptorDep();
            }

        }

        @objid ("0019dd7c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("7f87953d-12b1-4b27-ab67-ebdc3d5bc538")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteData) data).mModel;
            }

            @objid ("4d4a18b5-7cd2-4363-af67-566c4342a2ce")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteData) data).mModel = value;
            }

            @objid ("8096351a-7487-4c89-8867-858f401954e6")
            @Override
            public SmDependency getSymetric() {
                return NoteTypeData.Metadata.ElementDep();
            }

        }

    }

}
