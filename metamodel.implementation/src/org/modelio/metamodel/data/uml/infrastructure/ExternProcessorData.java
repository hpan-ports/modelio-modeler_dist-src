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
import org.modelio.metamodel.data.uml.infrastructure.matrix.MatrixValueDefinitionData;
import org.modelio.metamodel.data.uml.infrastructure.matrix.QueryDefinitionData;
import org.modelio.metamodel.impl.uml.infrastructure.ExternProcessorImpl;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
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

@objid ("9bf75d8b-a1fe-4551-b3ea-8285c1a28683")
@SmaMetaClass(mmClass=ExternProcessor.class, factory=ExternProcessorData.Metadata.ObjectFactory.class)
public class ExternProcessorData extends ModelElementData {
    @objid ("c840392c-0cf6-4c6b-952f-e5236bfb60ab")
    @SmaMetaAttribute(metaName="ClassName", type=String.class, smAttributeClass=Metadata.ClassNameSmAttribute.class)
     Object mClassName = "";

    @objid ("b3399320-41fa-45f9-9b28-11f60eb3be90")
    @SmaMetaAssociation(metaName="OwnerQuery", typeDataClass=QueryDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerQuerySmDependency.class)
     SmObjectImpl mOwnerQuery;

    @objid ("16706d79-e771-49c2-addb-45f36ceebcc6")
    @SmaMetaAssociation(metaName="OwnerValDef", typeDataClass=MatrixValueDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.OwnerValDefSmDependency.class)
     SmObjectImpl mOwnerValDef;

    @objid ("8b52d750-ab88-4e4a-b668-9b4d96942efe")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("87b8e284-b2bf-4b90-9639-d885c0fa7e79")
    public static class Metadata {
        @objid ("d50d9622-7899-45c5-953e-db799a5a824b")
        private static SmClass smClass = null;

        @objid ("234d8106-31a8-4726-8d4f-f0db802f4d7d")
        private static SmAttribute ClassNameAtt = null;

        @objid ("919b5f1a-ac1f-463e-a364-5e50194ccf76")
        private static SmDependency OwnerQueryDep = null;

        @objid ("7deb4809-33e6-418e-bd54-a1564867fe45")
        private static SmDependency OwnerValDefDep = null;

        @objid ("86f640c2-82e5-4fab-be78-66632cc37fa1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ExternProcessorData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ac7db944-8b38-44ea-9659-eaf14214ac31")
        public static SmAttribute ClassNameAtt() {
            if (ClassNameAtt == null) {
            	ClassNameAtt = classof().getAttributeDef("ClassName");
            }
            return ClassNameAtt;
        }

        @objid ("0bb278c5-17b9-47a6-ad9b-c8f0a19e367e")
        public static SmDependency OwnerQueryDep() {
            if (OwnerQueryDep == null) {
            	OwnerQueryDep = classof().getDependencyDef("OwnerQuery");
            }
            return OwnerQueryDep;
        }

        @objid ("e8ecbca2-9741-4cc5-9532-37d1cb7a5f76")
        public static SmDependency OwnerValDefDep() {
            if (OwnerValDefDep == null) {
            	OwnerValDefDep = classof().getDependencyDef("OwnerValDef");
            }
            return OwnerValDefDep;
        }

        @objid ("4acb5f4f-5af0-4716-a93f-68dd9f11a677")
        public static SmAttribute getClassNameAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ClassNameAtt;
        }

        @objid ("02732cc7-ea17-4a64-a941-42147e5a3473")
        public static SmDependency getOwnerQueryDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerQueryDep;
        }

        @objid ("21d41ec7-e319-4d9f-9fb4-f238c32a1b07")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a72ae988-a274-4c10-ad0a-ab9da92cd057")
        public static SmDependency getOwnerValDefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerValDefDep;
        }

        @objid ("39ab5dc2-26c9-44a6-a9c5-33fd5b5db60a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a15a2486-06e5-4179-bf4e-c61087f508d3")
            public ISmObjectData createData() {
                return new ExternProcessorData();
            }

            @objid ("22427ccb-df15-4acb-85f9-95f544ab32d1")
            public SmObjectImpl createImpl() {
                return new ExternProcessorImpl();
            }

        }

        @objid ("adb0b02e-fff8-4898-b495-aedcdd744710")
        public static class ClassNameSmAttribute extends SmAttribute {
            @objid ("042eb775-4fbf-4d00-9195-0a97fb1a99e8")
            public Object getValue(ISmObjectData data) {
                return ((ExternProcessorData) data).mClassName;
            }

            @objid ("92afad65-949e-4bb4-b781-2b9bdd6e204c")
            public void setValue(ISmObjectData data, Object value) {
                ((ExternProcessorData) data).mClassName = value;
            }

        }

        @objid ("d19c493d-5f55-4ba4-ae34-f0f778dedbb8")
        public static class OwnerQuerySmDependency extends SmSingleDependency {
            @objid ("8e98126d-8ff1-44a3-b4c1-2bea3fdda8a7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternProcessorData) data).mOwnerQuery;
            }

            @objid ("129aeadc-9c5d-4e85-bf13-12bc207f852e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternProcessorData) data).mOwnerQuery = value;
            }

            @objid ("582526b8-f695-4ed9-ad27-56ece226155a")
            @Override
            public SmDependency getSymetric() {
                return QueryDefinitionData.Metadata.ProcessorDep();
            }

        }

        @objid ("181612bc-0201-42f4-8b08-226bc4392f01")
        public static class OwnerValDefSmDependency extends SmSingleDependency {
            @objid ("0fd6b41c-8d1a-4208-9f2d-4cc1cb9e90dd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ExternProcessorData) data).mOwnerValDef;
            }

            @objid ("18f6fd15-11fb-4ed3-b70f-b19d95d2e9c6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ExternProcessorData) data).mOwnerValDef = value;
            }

            @objid ("fe3fde63-7ee3-489c-abc6-a40aa2b2b889")
            @Override
            public SmDependency getSymetric() {
                return MatrixValueDefinitionData.Metadata.ProcessorDep();
            }

        }

    }

}
