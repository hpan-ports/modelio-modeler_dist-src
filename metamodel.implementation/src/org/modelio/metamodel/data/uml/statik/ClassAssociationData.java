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
    @objid ("5a4175cb-69fd-41d7-b34a-0f61c6095d51")
    @SmaMetaAssociation(metaName="NaryAssociationPart", typeDataClass=NaryAssociationData.class, min=0, max=1, smAssociationClass=Metadata.NaryAssociationPartSmDependency.class)
     SmObjectImpl mNaryAssociationPart;

    @objid ("bc8911e1-b477-4435-83a1-23da91a329c5")
    @SmaMetaAssociation(metaName="ClassPart", typeDataClass=ClassData.class, min=1, max=1, smAssociationClass=Metadata.ClassPartSmDependency.class, partof = true)
     SmObjectImpl mClassPart;

    @objid ("c75b9934-101c-400a-8176-b693cde98bf7")
    @SmaMetaAssociation(metaName="AssociationPart", typeDataClass=AssociationData.class, min=0, max=1, smAssociationClass=Metadata.AssociationPartSmDependency.class)
     SmObjectImpl mAssociationPart;

    @objid ("61800aac-9362-4e2c-91d5-9f5340e57afc")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00420cde-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("31061c99-bdb0-4732-97bc-5566a5cbe4e8")
        private static SmClass smClass = null;

        @objid ("5cca4bf8-6186-4f14-bb79-a2bf47f94e7b")
        private static SmDependency NaryAssociationPartDep = null;

        @objid ("9073add5-1a10-4205-ba3d-18b0c272e644")
        private static SmDependency ClassPartDep = null;

        @objid ("9856c0a0-2c04-40fe-8d9f-12128c8a60bf")
        private static SmDependency AssociationPartDep = null;

        @objid ("f132e094-a55a-4387-8e92-80d56291bce1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("31bb8bf9-ecd7-4469-921e-6d40112619d5")
        public static SmDependency NaryAssociationPartDep() {
            if (NaryAssociationPartDep == null) {
            	NaryAssociationPartDep = classof().getDependencyDef("NaryAssociationPart");
            }
            return NaryAssociationPartDep;
        }

        @objid ("c8b28f88-5c7e-407d-882a-22ed26e17058")
        public static SmDependency ClassPartDep() {
            if (ClassPartDep == null) {
            	ClassPartDep = classof().getDependencyDef("ClassPart");
            }
            return ClassPartDep;
        }

        @objid ("db7b9f2c-45d8-4033-914e-a3c547893dd1")
        public static SmDependency AssociationPartDep() {
            if (AssociationPartDep == null) {
            	AssociationPartDep = classof().getDependencyDef("AssociationPart");
            }
            return AssociationPartDep;
        }

        @objid ("03321504-56aa-4aa4-b449-e7dabf364a1c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d376774d-6b57-4683-9e0a-d0360267ebdd")
        public static SmDependency getNaryAssociationPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryAssociationPartDep;
        }

        @objid ("d72ac68f-d60b-4b22-8bd6-8c84ce1c4126")
        public static SmDependency getAssociationPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociationPartDep;
        }

        @objid ("da467eee-8b44-4316-94dc-0074e4bba655")
        public static SmDependency getClassPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ClassPartDep;
        }

        @objid ("00425194-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5fdf53b9-5c69-477f-aac1-8436cdfdd909")
            public ISmObjectData createData() {
                return new ClassAssociationData();
            }

            @objid ("8c062548-f246-4bf6-9d97-246a19b29234")
            public SmObjectImpl createImpl() {
                return new ClassAssociationImpl();
            }

        }

        @objid ("0042b580-c4c3-1fd8-97fe-001ec947cd2a")
        public static class AssociationPartSmDependency extends SmSingleDependency {
            @objid ("586ac2f8-bbe5-4528-8a5a-d495a2a90271")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassAssociationData) data).mAssociationPart;
            }

            @objid ("b7cc2525-28f9-48a0-8a09-5aba4c10d99b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassAssociationData) data).mAssociationPart = value;
            }

            @objid ("77596f6f-45b3-4610-aaaf-fdc628d5afcd")
            @Override
            public SmDependency getSymetric() {
                return AssociationData.Metadata.LinkToClassDep();
            }

        }

        @objid ("004318ea-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ClassPartSmDependency extends SmSingleDependency {
            @objid ("24f47e03-d37b-416e-bfde-96e85984c2ba")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassAssociationData) data).mClassPart;
            }

            @objid ("6bc78dd8-9ef0-4bc9-ae88-b65523bce5c3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassAssociationData) data).mClassPart = value;
            }

            @objid ("787b5472-4bc9-45ff-9246-df5a10e35849")
            @Override
            public SmDependency getSymetric() {
                return ClassData.Metadata.LinkToAssociationDep();
            }

        }

        @objid ("004391bc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class NaryAssociationPartSmDependency extends SmSingleDependency {
            @objid ("bc6cb7cd-d60f-41f9-bb79-32fd8ff8fe4e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassAssociationData) data).mNaryAssociationPart;
            }

            @objid ("844199f7-5e37-43ef-897f-65f21c38eacf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassAssociationData) data).mNaryAssociationPart = value;
            }

            @objid ("422d3897-7df8-4507-be1c-97ae486532a2")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationData.Metadata.LinkToClassDep();
            }

        }

    }

}
