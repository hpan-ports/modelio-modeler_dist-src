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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelTreeImpl;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
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

@objid ("00899130-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ModelTree.class, factory=ModelTreeData.Metadata.ObjectFactory.class)
public abstract class ModelTreeData extends ModelElementData {
    @objid ("c45046d4-1212-4b1d-ad5e-73a39cf01823")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ModelTreeData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("872cf0ef-e774-4bc4-9f90-fe5cac55d13b")
    @SmaMetaAssociation(metaName="OwnedElement", typeDataClass=ModelTreeData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedElementSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedElement = null;

    @objid ("f4fdd16d-1792-4b62-8908-a8e0f2199e9c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002aecb6-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6868a85a-8bb8-49c7-9cd2-81925c088053")
        private static SmClass smClass = null;

        @objid ("bdda3b58-e6d4-439e-8732-23a102168e4e")
        private static SmDependency OwnerDep = null;

        @objid ("fca67d48-0156-48d1-a4fa-725d0bfb79d9")
        private static SmDependency OwnedElementDep = null;

        @objid ("f98332e4-83f3-4606-8089-0f4340d76126")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ModelTreeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("daf3e7ac-5265-4ccf-87e9-915baa4ed3a0")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("ff6371dd-ca30-4997-8285-3e9afa7a2187")
        public static SmDependency OwnedElementDep() {
            if (OwnedElementDep == null) {
            	OwnedElementDep = classof().getDependencyDef("OwnedElement");
            }
            return OwnedElementDep;
        }

        @objid ("88aaad68-5552-49a2-a8a5-0cad87291fee")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("471c02ad-2052-48e5-bb1c-bf22e3725ff8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6a4fe4d2-aa1e-48c7-8c6d-8a57e09d127b")
        public static SmDependency getOwnedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedElementDep;
        }

        @objid ("002b2e74-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("79ef5c1f-587e-4f18-b584-83c44e65fb5f")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("877f3d76-c5d0-4e6e-bd2a-5bf710ce140c")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("002b9062-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnedElementSmDependency extends SmMultipleDependency {
            @objid ("8ac987f4-2187-4b2e-acdf-5727e8e6155a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ModelTreeData)data).mOwnedElement != null)? ((ModelTreeData)data).mOwnedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("4ae1df05-f23e-47d0-9027-b285c009c9c7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ModelTreeData) data).mOwnedElement = new ArrayList<>(initialCapacity);
                return ((ModelTreeData) data).mOwnedElement;
            }

            @objid ("5ce5f903-e3db-4384-8733-7f25ddcc5a04")
            @Override
            public SmDependency getSymetric() {
                return ModelTreeData.Metadata.OwnerDep();
            }

        }

        @objid ("002bff3e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("8904c77d-f827-45ab-bc57-f7ae77dab9e5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ModelTreeData) data).mOwner;
            }

            @objid ("0d8970e0-d151-4740-81d6-f9f6618c6441")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ModelTreeData) data).mOwner = value;
            }

            @objid ("daa79a4c-b2e6-41df-ba63-29551f7b4331")
            @Override
            public SmDependency getSymetric() {
                return ModelTreeData.Metadata.OwnedElementDep();
            }

        }

    }

}
