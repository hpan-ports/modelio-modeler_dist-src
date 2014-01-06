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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.AssociationData;
import org.modelio.metamodel.data.uml.statik.ClassData;
import org.modelio.metamodel.data.uml.statik.NaryAssociationData;
import org.modelio.metamodel.impl.uml.statik.ClassAssociationImpl;
import org.modelio.metamodel.uml.statik.ClassAssociation;
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

@objid ("000325f0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ClassAssociation.class, factory=ClassAssociationData.Metadata.ObjectFactory.class)
public class ClassAssociationData extends ModelElementData {
    @objid ("c25aa57d-3592-443b-bea7-5d73aaf41648")
    @SmaMetaAssociation(metaName="NaryAssociationPart", typeDataClass=NaryAssociationData.class, min=0, max=1, smAssociationClass=Metadata.NaryAssociationPartSmDependency.class)
     SmObjectImpl mNaryAssociationPart;

    @objid ("c3af44f7-fcb1-44f5-92d8-c09c688fef4a")
    @SmaMetaAssociation(metaName="ClassPart", typeDataClass=ClassData.class, min=1, max=1, smAssociationClass=Metadata.ClassPartSmDependency.class, partof = true)
     SmObjectImpl mClassPart;

    @objid ("889ed980-10aa-4641-8f1b-3dd585ac266e")
    @SmaMetaAssociation(metaName="AssociationPart", typeDataClass=AssociationData.class, min=0, max=1, smAssociationClass=Metadata.AssociationPartSmDependency.class)
     SmObjectImpl mAssociationPart;

    @objid ("c7a0a46e-de52-4986-a858-897ebe0492ac")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00420cde-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3324c024-4fbe-48bf-988a-bb6d8edefab9")
        private static SmClass smClass = null;

        @objid ("dd067eb5-a2a6-4938-aade-33f853ddd3c3")
        private static SmDependency NaryAssociationPartDep = null;

        @objid ("01b64d5d-27b0-404d-ac21-ca65d831eb32")
        private static SmDependency ClassPartDep = null;

        @objid ("f27a7555-bbbf-480c-b074-f32833b81221")
        private static SmDependency AssociationPartDep = null;

        @objid ("42d4ce1c-a28c-4a01-9046-225bd9f020dd")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("740c858b-08cd-4c0a-875f-c34365d4dffd")
        public static SmDependency NaryAssociationPartDep() {
            if (NaryAssociationPartDep == null) {
            	NaryAssociationPartDep = classof().getDependencyDef("NaryAssociationPart");
            }
            return NaryAssociationPartDep;
        }

        @objid ("21d3db6d-dd6b-4249-aa5c-20ae0567a51f")
        public static SmDependency ClassPartDep() {
            if (ClassPartDep == null) {
            	ClassPartDep = classof().getDependencyDef("ClassPart");
            }
            return ClassPartDep;
        }

        @objid ("a41a7ce3-8c34-4361-bb30-f50f5781bdde")
        public static SmDependency AssociationPartDep() {
            if (AssociationPartDep == null) {
            	AssociationPartDep = classof().getDependencyDef("AssociationPart");
            }
            return AssociationPartDep;
        }

        @objid ("72f53749-85a3-4f59-a908-09cf4cb97246")
        public static SmDependency getNaryAssociationPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryAssociationPartDep;
        }

        @objid ("70455648-45c8-4626-93cf-233e90bb9baa")
        public static SmDependency getClassPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ClassPartDep;
        }

        @objid ("e23d5ee2-9032-474d-9622-ffde4695181d")
        public static SmDependency getAssociationPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociationPartDep;
        }

        @objid ("5966a116-3da5-444e-baee-bbd3d725dff4")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00425194-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e59ae949-8978-4564-aadb-bc10e849e4f4")
            public ISmObjectData createData() {
                return new ClassAssociationData();
            }

            @objid ("988c0805-c552-4d77-9877-7a3798049374")
            public SmObjectImpl createImpl() {
                return new ClassAssociationImpl();
            }

        }

        @objid ("0042b580-c4c3-1fd8-97fe-001ec947cd2a")
        public static class AssociationPartSmDependency extends SmSingleDependency {
            @objid ("dc2881db-8cc4-4f74-8973-62e66651b977")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassAssociationData) data).mAssociationPart;
            }

            @objid ("07ec961a-a976-40f1-be0b-ab287986e2b5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassAssociationData) data).mAssociationPart = value;
            }

            @objid ("252c4077-0d62-42f7-b902-df88f6b46ade")
            @Override
            public SmDependency getSymetric() {
                return AssociationData.Metadata.LinkToClassDep();
            }

        }

        @objid ("004318ea-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ClassPartSmDependency extends SmSingleDependency {
            @objid ("16ee7c9e-fc24-4614-8d3b-256d0f14b67f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassAssociationData) data).mClassPart;
            }

            @objid ("a8602726-3fde-421e-b0c5-a5e02d7d79e4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassAssociationData) data).mClassPart = value;
            }

            @objid ("e3441d9b-8586-41c2-8a4c-44110d377164")
            @Override
            public SmDependency getSymetric() {
                return ClassData.Metadata.LinkToAssociationDep();
            }

        }

        @objid ("004391bc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class NaryAssociationPartSmDependency extends SmSingleDependency {
            @objid ("930ec6b8-3b7d-442b-8896-ee5de04ab262")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassAssociationData) data).mNaryAssociationPart;
            }

            @objid ("3e73d9d3-164c-43a7-8bc4-41246efc1717")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassAssociationData) data).mNaryAssociationPart = value;
            }

            @objid ("cd54558f-1ce7-4f59-8dfe-4fb86fb9b342")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationData.Metadata.LinkToClassDep();
            }

        }

    }

}
