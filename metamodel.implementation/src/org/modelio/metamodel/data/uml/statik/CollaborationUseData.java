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
    @objid ("68fb9f1d-83a6-4a19-b5cd-470ef35d08aa")
    @SmaMetaAssociation(metaName="Type", typeDataClass=CollaborationData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("80224164-ec7f-4c1d-9af3-43893c758f4b")
    @SmaMetaAssociation(metaName="NRepresented", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.NRepresentedSmDependency.class)
     SmObjectImpl mNRepresented;

    @objid ("7ac64989-cf27-4387-beea-549df23c5f36")
    @SmaMetaAssociation(metaName="ORepresented", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ORepresentedSmDependency.class)
     SmObjectImpl mORepresented;

    @objid ("31d1fd9d-b4f8-4aef-85c5-0e5c88b2d161")
    @SmaMetaAssociation(metaName="RoleBinding", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RoleBindingSmDependency.class, component = true)
     List<SmObjectImpl> mRoleBinding = null;

    @objid ("07c71c36-725d-49f4-a925-399b127ab031")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00332b7e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a3a1f440-a0e8-4fac-a9c2-75907416379e")
        private static SmClass smClass = null;

        @objid ("82e4b509-d80e-4c8e-a0b6-f744b96f3a4d")
        private static SmDependency TypeDep = null;

        @objid ("aa628ed7-01d1-4027-96b9-4582e430c957")
        private static SmDependency NRepresentedDep = null;

        @objid ("26d2ed19-52bd-4c86-b537-fa8a087d1901")
        private static SmDependency ORepresentedDep = null;

        @objid ("f356aedd-c842-4c41-998b-d686f8d69c22")
        private static SmDependency RoleBindingDep = null;

        @objid ("d6928bd2-c3a8-4b9e-b434-de6dbbf2db30")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CollaborationUseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4a3ee546-3276-4df3-9c5f-f1597053a68d")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("5fcb14cb-c7ba-424e-8902-3e92d1a93621")
        public static SmDependency NRepresentedDep() {
            if (NRepresentedDep == null) {
            	NRepresentedDep = classof().getDependencyDef("NRepresented");
            }
            return NRepresentedDep;
        }

        @objid ("df104fa0-3fa1-4e6a-b952-bfed027bcd66")
        public static SmDependency ORepresentedDep() {
            if (ORepresentedDep == null) {
            	ORepresentedDep = classof().getDependencyDef("ORepresented");
            }
            return ORepresentedDep;
        }

        @objid ("d6ed8355-00a6-4bbb-8bb7-c057beb5e949")
        public static SmDependency RoleBindingDep() {
            if (RoleBindingDep == null) {
            	RoleBindingDep = classof().getDependencyDef("RoleBinding");
            }
            return RoleBindingDep;
        }

        @objid ("d14ae32e-e1ce-44a0-9a5d-4d97ed645c92")
        public static SmDependency getNRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NRepresentedDep;
        }

        @objid ("88df8ad6-00c7-4d89-927f-bda1cf10a6d2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("69678b05-da35-4b96-8ba5-4a65250e6415")
        public static SmDependency getRoleBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RoleBindingDep;
        }

        @objid ("1bf0b024-286c-4f1b-a2c8-7d47b63d1bcb")
        public static SmDependency getORepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ORepresentedDep;
        }

        @objid ("a09567d0-3ac1-4f77-842b-b69761fc717b")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("00336b16-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d838f0b7-cca8-49f4-9272-9a977fef8f34")
            public ISmObjectData createData() {
                return new CollaborationUseData();
            }

            @objid ("574f6148-af9e-485e-9179-5fd43c6d2ce2")
            public SmObjectImpl createImpl() {
                return new CollaborationUseImpl();
            }

        }

        @objid ("0033cca0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("fddd3665-ed0e-4cbe-ac23-3bb9940a2495")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationUseData) data).mType;
            }

            @objid ("46cc34ac-3aa5-4e71-9442-ed13df714dfd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationUseData) data).mType = value;
            }

            @objid ("d0766005-36ab-46e0-b64e-02e5ef8562c7")
            @Override
            public SmDependency getSymetric() {
                return CollaborationData.Metadata.OccurrenceDep();
            }

        }

        @objid ("00344004-c4c5-1fd8-97fe-001ec947cd2a")
        public static class NRepresentedSmDependency extends SmSingleDependency {
            @objid ("0462f1a1-e2aa-4e92-be30-f91b8cff2b34")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationUseData) data).mNRepresented;
            }

            @objid ("6972b46e-8ca4-4788-a907-6256f2bf5173")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationUseData) data).mNRepresented = value;
            }

            @objid ("f1669754-dc58-4432-8349-02624e6a5b15")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedCollaborationUseDep();
            }

        }

        @objid ("0034b6ba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ORepresentedSmDependency extends SmSingleDependency {
            @objid ("102671eb-a803-44e5-b74c-c418a441f413")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationUseData) data).mORepresented;
            }

            @objid ("e31f9d6a-486c-43c8-aec3-c809414efd37")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationUseData) data).mORepresented = value;
            }

            @objid ("b3b7dc77-4e4f-4711-8f8e-0ba630876c24")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedCollaborationUseDep();
            }

        }

        @objid ("00352c44-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RoleBindingSmDependency extends SmMultipleDependency {
            @objid ("fff7f342-fad7-42df-9e33-f77e9a0115b9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CollaborationUseData)data).mRoleBinding != null)? ((CollaborationUseData)data).mRoleBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("e5aae4f8-d60d-4ede-812b-265a27b2faa0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CollaborationUseData) data).mRoleBinding = new ArrayList<>(initialCapacity);
                return ((CollaborationUseData) data).mRoleBinding;
            }

            @objid ("27941d30-7503-4479-a653-510590d6af07")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.OwnerDep();
            }

        }

    }

}
