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
package org.modelio.metamodel.data.analyst;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.data.analyst.AnalystProjectData;
import org.modelio.metamodel.data.analyst.GenericAnalystElementData;
import org.modelio.metamodel.impl.analyst.GenericAnalystContainerImpl;
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

@objid ("43cf5c62-f20f-4e47-9153-5f4bd63429ba")
@SmaMetaClass(mmClass=GenericAnalystContainer.class, factory=GenericAnalystContainerData.Metadata.ObjectFactory.class, cmsnode=true)
public class GenericAnalystContainerData extends AnalystContainerData {
    @objid ("b4ea82f1-7ace-4126-8cfa-a9d56f1c8486")
    @SmaMetaAssociation(metaName="OwnedElement", typeDataClass=GenericAnalystElementData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedElementSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedElement = null;

    @objid ("5198317b-691d-42a7-8b99-fa00a701ec5e")
    @SmaMetaAssociation(metaName="OwnerContainer", typeDataClass=GenericAnalystContainerData.class, min=0, max=1, smAssociationClass=Metadata.OwnerContainerSmDependency.class)
     SmObjectImpl mOwnerContainer;

    @objid ("5d63f78c-76bd-48df-ae9e-e8873be0b521")
    @SmaMetaAssociation(metaName="OwnedContainer", typeDataClass=GenericAnalystContainerData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedContainerSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedContainer = null;

    @objid ("3f99858b-8726-433a-ac0c-84006ed7f571")
    @SmaMetaAssociation(metaName="OwnerProject", typeDataClass=AnalystProjectData.class, min=0, max=1, smAssociationClass=Metadata.OwnerProjectSmDependency.class)
     SmObjectImpl mOwnerProject;

    @objid ("8fa04462-cb5b-4a5e-b50d-6dd6898db562")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("3f50658d-b4c2-4005-a892-25d992f61952")
    public static class Metadata {
        @objid ("9d5fa8b4-ebdd-4c11-87ab-fe776517502a")
        private static SmClass smClass = null;

        @objid ("c5a0163f-7e4e-4509-9ec3-f502d1321260")
        private static SmDependency OwnedElementDep = null;

        @objid ("1a3ba26e-8f61-4139-b97a-a24faee2c819")
        private static SmDependency OwnerContainerDep = null;

        @objid ("b3a4e1a3-4300-4383-a154-2afd6b02100c")
        private static SmDependency OwnedContainerDep = null;

        @objid ("499cea50-8a26-4cab-9c96-540a2df206b5")
        private static SmDependency OwnerProjectDep = null;

        @objid ("b31d913d-54c7-40ad-80fc-cc34bc95c6ec")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(GenericAnalystContainerData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("2a92d508-9ce9-4019-9ec4-1c594a5d095e")
        public static SmDependency OwnedElementDep() {
            if (OwnedElementDep == null) {
            	OwnedElementDep = classof().getDependencyDef("OwnedElement");
            }
            return OwnedElementDep;
        }

        @objid ("1e805b5d-11fd-461d-abc1-e5ac7fd2e87b")
        public static SmDependency OwnerContainerDep() {
            if (OwnerContainerDep == null) {
            	OwnerContainerDep = classof().getDependencyDef("OwnerContainer");
            }
            return OwnerContainerDep;
        }

        @objid ("3e4389ff-4d80-4f32-b527-af8d74018e9e")
        public static SmDependency OwnedContainerDep() {
            if (OwnedContainerDep == null) {
            	OwnedContainerDep = classof().getDependencyDef("OwnedContainer");
            }
            return OwnedContainerDep;
        }

        @objid ("8fe9957a-1788-49e6-ad2a-5849e4d99182")
        public static SmDependency OwnerProjectDep() {
            if (OwnerProjectDep == null) {
            	OwnerProjectDep = classof().getDependencyDef("OwnerProject");
            }
            return OwnerProjectDep;
        }

        @objid ("014ce920-278f-4148-9002-4bb59d53dba7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ae5beca5-ccc0-4940-b953-4b87ef68e216")
        public static SmDependency getOwnedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedElementDep;
        }

        @objid ("301a7672-3f6b-4657-a8d7-763cbe1d5bd1")
        public static SmDependency getOwnerContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerContainerDep;
        }

        @objid ("7e4f6947-8516-4f9b-bafa-05200f880b0f")
        public static SmDependency getOwnerProjectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerProjectDep;
        }

        @objid ("083ad1ef-0ac8-4dde-bb85-2533ffd94d7f")
        public static SmDependency getOwnedContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedContainerDep;
        }

        @objid ("b3ad03bd-c265-4035-940c-986d2cc05988")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ce2e8b11-bf00-4966-ba45-1ea321a782b8")
            public ISmObjectData createData() {
                return new GenericAnalystContainerData();
            }

            @objid ("63d6830e-9a74-4b45-b4bd-25a895d1c4fd")
            public SmObjectImpl createImpl() {
                return new GenericAnalystContainerImpl();
            }

        }

        @objid ("51eec192-d7f1-444b-993b-2abfdf9665b8")
        public static class OwnedElementSmDependency extends SmMultipleDependency {
            @objid ("f33b5b46-f7f0-4a37-8aff-d8dc9864698f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GenericAnalystContainerData)data).mOwnedElement != null)? ((GenericAnalystContainerData)data).mOwnedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("6bdac690-8d39-4ffe-a76c-ccfe85596bc6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GenericAnalystContainerData) data).mOwnedElement = new ArrayList<>(initialCapacity);
                return ((GenericAnalystContainerData) data).mOwnedElement;
            }

            @objid ("f9efdd7f-5eaf-4610-8bc2-b107aba7b8df")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystElementData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("4912e901-4e5e-40ee-b39a-02fd11638615")
        public static class OwnerContainerSmDependency extends SmSingleDependency {
            @objid ("93037601-78a7-49a3-9edf-100e78d6a6e9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystContainerData) data).mOwnerContainer;
            }

            @objid ("7d34edfa-2284-4590-a89b-5a53cfd29218")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystContainerData) data).mOwnerContainer = value;
            }

            @objid ("7701917a-1011-4678-9327-fa6c0f1a32e2")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystContainerData.Metadata.OwnedContainerDep();
            }

        }

        @objid ("aeece048-e7eb-4929-afa8-5365f90209f4")
        public static class OwnedContainerSmDependency extends SmMultipleDependency {
            @objid ("613f1044-507e-4247-9fb6-f157c8511db1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((GenericAnalystContainerData)data).mOwnedContainer != null)? ((GenericAnalystContainerData)data).mOwnedContainer:SmMultipleDependency.EMPTY;
            }

            @objid ("09d622e1-6677-4fb1-a58e-b2e268bf6c71")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((GenericAnalystContainerData) data).mOwnedContainer = new ArrayList<>(initialCapacity);
                return ((GenericAnalystContainerData) data).mOwnedContainer;
            }

            @objid ("3fc958a3-d619-4288-973c-f3c7c27d9232")
            @Override
            public SmDependency getSymetric() {
                return GenericAnalystContainerData.Metadata.OwnerContainerDep();
            }

        }

        @objid ("0932ae70-e3fd-4f73-94fb-ae6c1c77bf0a")
        public static class OwnerProjectSmDependency extends SmSingleDependency {
            @objid ("ef170429-2577-41e4-9671-fd8e383d9d46")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((GenericAnalystContainerData) data).mOwnerProject;
            }

            @objid ("c3de6dcd-3949-416e-bf7e-74115310d4eb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((GenericAnalystContainerData) data).mOwnerProject = value;
            }

            @objid ("84afc11c-f437-4540-a632-a74d8c0320ff")
            @Override
            public SmDependency getSymetric() {
                return AnalystProjectData.Metadata.GenericRootDep();
            }

        }

    }

}
