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
    @objid ("eb2eaaeb-ec63-48e7-9342-033a24301b51")
    @SmaMetaAttribute(metaName="Content", type=String.class, smAttributeClass=Metadata.ContentSmAttribute.class)
     Object mContent = "";

    @objid ("99cde557-2764-4911-a8d3-fc69bd748966")
    @SmaMetaAssociation(metaName="Model", typeDataClass=NoteTypeData.class, min=1, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("e9a9de8e-f298-4210-a851-89a3eb19f9ed")
    @SmaMetaAssociation(metaName="Subject", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.SubjectSmDependency.class)
     SmObjectImpl mSubject;

    @objid ("66bbf216-212f-47a3-94d7-5aab7d131911")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00185db2-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7065aec1-e185-4a16-acfd-578bbd8c82bc")
        private static SmClass smClass = null;

        @objid ("531a2521-4cad-48ca-b443-7b85e864aad2")
        private static SmAttribute ContentAtt = null;

        @objid ("c16035a6-4373-479f-8472-48ef503c725d")
        private static SmDependency ModelDep = null;

        @objid ("f2f8f90d-5a06-46f3-92c1-c4eb3a0a15b2")
        private static SmDependency SubjectDep = null;

        @objid ("1623e7c1-6b52-44a7-80ee-ba1c31d5cbcc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(NoteData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e5e27048-a27d-454c-a100-23b78c4fe58b")
        public static SmAttribute ContentAtt() {
            if (ContentAtt == null) {
            	ContentAtt = classof().getAttributeDef("Content");
            }
            return ContentAtt;
        }

        @objid ("e6375951-72c0-49e0-8b46-abbd33848a01")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("24c155e2-2fc4-4b27-9ff8-50726abb6647")
        public static SmDependency SubjectDep() {
            if (SubjectDep == null) {
            	SubjectDep = classof().getDependencyDef("Subject");
            }
            return SubjectDep;
        }

        @objid ("059425c2-c771-45a5-9259-b03914c1ee56")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5c26efa9-6a42-457a-a87e-fcf041daa2f7")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("0878222d-8c6f-4cfe-952f-ee412da43c4e")
        public static SmAttribute getContentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContentAtt;
        }

        @objid ("be0efbb5-15bd-4da6-a87a-9dde222fd315")
        public static SmDependency getSubjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubjectDep;
        }

        @objid ("0018a15a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("01391141-e4c4-40ec-a45b-fe99efb9bc4f")
            public ISmObjectData createData() {
                return new NoteData();
            }

            @objid ("857e21d1-44ad-430d-8da1-cfb0d8ec3c68")
            public SmObjectImpl createImpl() {
                return new NoteImpl();
            }

        }

        @objid ("0019030c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ContentSmAttribute extends SmAttribute {
            @objid ("cc282115-28cb-4b22-be24-8bb103817be2")
            public Object getValue(ISmObjectData data) {
                return ((NoteData) data).mContent;
            }

            @objid ("4078aa5b-7e20-4f54-8c26-a8af224bb5c4")
            public void setValue(ISmObjectData data, Object value) {
                ((NoteData) data).mContent = value;
            }

        }

        @objid ("00196612-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SubjectSmDependency extends SmSingleDependency {
            @objid ("6fa7c0dc-d10f-4cc6-85f1-9a1e7e35f4d5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteData) data).mSubject;
            }

            @objid ("e5bbc7fd-47d8-4f38-8ab8-e6f1005d6385")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteData) data).mSubject = value;
            }

            @objid ("cd2830eb-9bdd-485c-a168-8cda2fd381ff")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.DescriptorDep();
            }

        }

        @objid ("0019dd7c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("13f3703d-1fb5-4d4a-9d8b-fdb63c56f757")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((NoteData) data).mModel;
            }

            @objid ("60345896-a315-457d-a813-2dfc3d850322")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((NoteData) data).mModel = value;
            }

            @objid ("3053d9bc-5961-46a8-b0fe-643ce0139bba")
            @Override
            public SmDependency getSymetric() {
                return NoteTypeData.Metadata.ElementDep();
            }

        }

    }

}
