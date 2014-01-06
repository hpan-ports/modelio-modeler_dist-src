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
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.BindingData;
import org.modelio.metamodel.data.uml.statik.CollaborationData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.statik.CollaborationUseImpl;
import org.modelio.metamodel.uml.statik.CollaborationUse;
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

@objid ("0004d404-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CollaborationUse.class, factory=CollaborationUseData.Metadata.ObjectFactory.class)
public class CollaborationUseData extends ModelElementData {
    @objid ("4f5abecc-282d-4461-91b2-dbd890425700")
    @SmaMetaAssociation(metaName="Type", typeDataClass=CollaborationData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("9b9eaddf-817b-4881-99d2-6127053fe5b2")
    @SmaMetaAssociation(metaName="NRepresented", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.NRepresentedSmDependency.class)
     SmObjectImpl mNRepresented;

    @objid ("43059e61-3684-4694-8af2-947774f678d0")
    @SmaMetaAssociation(metaName="ORepresented", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ORepresentedSmDependency.class)
     SmObjectImpl mORepresented;

    @objid ("c19fd158-2ce3-4c84-ba2f-b3b0c740a782")
    @SmaMetaAssociation(metaName="RoleBinding", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RoleBindingSmDependency.class, component = true)
     List<SmObjectImpl> mRoleBinding = null;

    @objid ("a07e5868-b031-4968-992e-ba874e56641c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00332b7e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a5f6e01c-b19a-4bb6-a840-dc6a8bdb1664")
        private static SmClass smClass = null;

        @objid ("5d81d26d-2913-4c65-af50-a80d230914f3")
        private static SmDependency TypeDep = null;

        @objid ("543272ac-c2b8-4bc4-bba1-4f8499bc74da")
        private static SmDependency NRepresentedDep = null;

        @objid ("4271c124-b3fc-43ec-89f6-3dd737afb152")
        private static SmDependency ORepresentedDep = null;

        @objid ("f66a32fa-17c1-4b3b-ac39-28adc923ca7c")
        private static SmDependency RoleBindingDep = null;

        @objid ("5f98d0e9-f393-450a-aebc-cff981296861")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CollaborationUseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5ae54aa8-7109-49f3-9d50-820f493bcff9")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("d0474ea0-18d8-4389-ba92-e6f76fbea623")
        public static SmDependency NRepresentedDep() {
            if (NRepresentedDep == null) {
            	NRepresentedDep = classof().getDependencyDef("NRepresented");
            }
            return NRepresentedDep;
        }

        @objid ("333a9dde-c079-4520-9c0a-6867e89dd43b")
        public static SmDependency ORepresentedDep() {
            if (ORepresentedDep == null) {
            	ORepresentedDep = classof().getDependencyDef("ORepresented");
            }
            return ORepresentedDep;
        }

        @objid ("879fc4c1-b3ff-4e52-9def-6a85712b9b77")
        public static SmDependency RoleBindingDep() {
            if (RoleBindingDep == null) {
            	RoleBindingDep = classof().getDependencyDef("RoleBinding");
            }
            return RoleBindingDep;
        }

        @objid ("5f4412fe-f798-42a4-9c50-41f376846786")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("2382a14d-4c48-461e-9453-a6344a92a722")
        public static SmDependency getRoleBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RoleBindingDep;
        }

        @objid ("d5e09e41-04b5-49d4-866d-c936943ae71a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("bb309d50-3702-41ea-831d-9a29edf71b37")
        public static SmDependency getNRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NRepresentedDep;
        }

        @objid ("a6d8bb51-1c9a-40fb-b1af-bab6ff213edc")
        public static SmDependency getORepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ORepresentedDep;
        }

        @objid ("00336b16-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0d5feb1e-7b19-481e-b796-3e8329122118")
            public ISmObjectData createData() {
                return new CollaborationUseData();
            }

            @objid ("c66a84b6-2b68-4e0c-8764-10422edb2def")
            public SmObjectImpl createImpl() {
                return new CollaborationUseImpl();
            }

        }

        @objid ("0033cca0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("9800df66-f11f-4521-ab95-04fb681651f8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationUseData) data).mType;
            }

            @objid ("fb35ea34-ce0c-49e9-88cb-4b262b2f999c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationUseData) data).mType = value;
            }

            @objid ("52605efe-445d-42d8-9ebb-45be81204941")
            @Override
            public SmDependency getSymetric() {
                return CollaborationData.Metadata.OccurrenceDep();
            }

        }

        @objid ("00344004-c4c5-1fd8-97fe-001ec947cd2a")
        public static class NRepresentedSmDependency extends SmSingleDependency {
            @objid ("e3b64962-471f-4527-8d98-cde279bbcb23")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationUseData) data).mNRepresented;
            }

            @objid ("5009f91e-d924-4bd2-bef6-3d81dbce24ed")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationUseData) data).mNRepresented = value;
            }

            @objid ("44b448eb-1cf1-4639-bf81-500fb28ca679")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedCollaborationUseDep();
            }

        }

        @objid ("0034b6ba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ORepresentedSmDependency extends SmSingleDependency {
            @objid ("c6985fa7-0d71-4f86-8c1e-16186c1bc2ff")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationUseData) data).mORepresented;
            }

            @objid ("ada4c2e8-9927-4ae7-a0c3-daec5a2be46b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationUseData) data).mORepresented = value;
            }

            @objid ("025407c6-82cc-4c95-bd87-1dfd0682c99a")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedCollaborationUseDep();
            }

        }

        @objid ("00352c44-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RoleBindingSmDependency extends SmMultipleDependency {
            @objid ("9f527394-fe91-4a90-bb7d-0809af6068d3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CollaborationUseData)data).mRoleBinding != null)? ((CollaborationUseData)data).mRoleBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("b4bb9f6a-583f-4ee8-820f-9046ceaaa407")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CollaborationUseData) data).mRoleBinding = new ArrayList<>(initialCapacity);
                return ((CollaborationUseData) data).mRoleBinding;
            }

            @objid ("876bfc6f-9d6e-4b60-8233-ad5cc273b8a3")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.OwnerDep();
            }

        }

    }

}
