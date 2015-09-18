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
    @objid ("e1bb8d47-915c-4512-a211-3d3ff3644a08")
    @SmaMetaAssociation(metaName="NaryAssociationPart", typeDataClass=NaryAssociationData.class, min=0, max=1, smAssociationClass=Metadata.NaryAssociationPartSmDependency.class)
     SmObjectImpl mNaryAssociationPart;

    @objid ("2bb71de5-7cf0-4667-a6a8-d537cbf67fa6")
    @SmaMetaAssociation(metaName="ClassPart", typeDataClass=ClassData.class, min=1, max=1, smAssociationClass=Metadata.ClassPartSmDependency.class, partof = true)
     SmObjectImpl mClassPart;

    @objid ("4e78c434-b307-4f16-9762-954c17eda1a0")
    @SmaMetaAssociation(metaName="AssociationPart", typeDataClass=AssociationData.class, min=0, max=1, smAssociationClass=Metadata.AssociationPartSmDependency.class)
     SmObjectImpl mAssociationPart;

    @objid ("3495f5af-c929-4797-b2af-a67b9b125d6b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00420cde-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f360c329-af91-45e0-a15e-855f66135791")
        private static SmClass smClass = null;

        @objid ("9411ba81-a789-4f8b-8963-0a29d7cf39ef")
        private static SmDependency NaryAssociationPartDep = null;

        @objid ("e6b7a43a-434a-4434-ac30-6310e05543c2")
        private static SmDependency ClassPartDep = null;

        @objid ("dd7ae6f1-1f06-4a73-9477-4b5986fd2eb1")
        private static SmDependency AssociationPartDep = null;

        @objid ("4301dc9a-420f-464c-aba0-189ca3fa2c34")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ClassAssociationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6fcdea96-cf50-49e5-95c1-45328e979813")
        public static SmDependency NaryAssociationPartDep() {
            if (NaryAssociationPartDep == null) {
            	NaryAssociationPartDep = classof().getDependencyDef("NaryAssociationPart");
            }
            return NaryAssociationPartDep;
        }

        @objid ("cf064d6b-0fea-41a0-9aee-e1c2619b5bac")
        public static SmDependency ClassPartDep() {
            if (ClassPartDep == null) {
            	ClassPartDep = classof().getDependencyDef("ClassPart");
            }
            return ClassPartDep;
        }

        @objid ("b877a084-d0f3-4458-bc83-c04bedf751b8")
        public static SmDependency AssociationPartDep() {
            if (AssociationPartDep == null) {
            	AssociationPartDep = classof().getDependencyDef("AssociationPart");
            }
            return AssociationPartDep;
        }

        @objid ("bcba09f6-e07d-4ee3-82bd-958f4cf38805")
        public static SmDependency getClassPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ClassPartDep;
        }

        @objid ("e1ae26bf-f76e-4c6a-8bb4-8acc4f5a1b9c")
        public static SmDependency getNaryAssociationPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryAssociationPartDep;
        }

        @objid ("5c7ce87c-070b-42b4-8270-5588a2d41714")
        public static SmDependency getAssociationPartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociationPartDep;
        }

        @objid ("74ef69d1-55a0-4d9a-80ac-e7c4d67938d9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00425194-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1c4226b9-8b9e-44e5-9aa2-bd6ce17ab39a")
            public ISmObjectData createData() {
                return new ClassAssociationData();
            }

            @objid ("a9fb3509-a810-4d9e-b626-a4d3e262181f")
            public SmObjectImpl createImpl() {
                return new ClassAssociationImpl();
            }

        }

        @objid ("0042b580-c4c3-1fd8-97fe-001ec947cd2a")
        public static class AssociationPartSmDependency extends SmSingleDependency {
            @objid ("3a89ba8e-40e1-42c2-a53f-0be408b07260")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassAssociationData) data).mAssociationPart;
            }

            @objid ("988da9ff-e35e-4102-b841-ed728b65bfeb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassAssociationData) data).mAssociationPart = value;
            }

            @objid ("da231db5-5693-4977-95e0-b5ee2cb8166f")
            @Override
            public SmDependency getSymetric() {
                return AssociationData.Metadata.LinkToClassDep();
            }

        }

        @objid ("004318ea-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ClassPartSmDependency extends SmSingleDependency {
            @objid ("b6f20258-c2ee-41c8-8045-afad738db03c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassAssociationData) data).mClassPart;
            }

            @objid ("b15dda93-48a4-4977-8a22-ebf22de01f6b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassAssociationData) data).mClassPart = value;
            }

            @objid ("579728b2-841b-45fc-8646-dfc2393cc0d0")
            @Override
            public SmDependency getSymetric() {
                return ClassData.Metadata.LinkToAssociationDep();
            }

        }

        @objid ("004391bc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class NaryAssociationPartSmDependency extends SmSingleDependency {
            @objid ("968ac57e-d1a0-4f81-bccc-5137db914b94")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ClassAssociationData) data).mNaryAssociationPart;
            }

            @objid ("2c78131e-5ba1-4dd2-ab3c-3d25af076227")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ClassAssociationData) data).mNaryAssociationPart = value;
            }

            @objid ("8705a345-aec2-4ec6-8e00-3f4a1811496f")
            @Override
            public SmDependency getSymetric() {
                return NaryAssociationData.Metadata.LinkToClassDep();
            }

        }

    }

}
