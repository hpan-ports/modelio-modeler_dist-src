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
    @objid ("bde4591d-5feb-4c5a-9031-61417d3df922")
    @SmaMetaAssociation(metaName="Type", typeDataClass=CollaborationData.class, min=1, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("4ef95744-2ee3-4454-af92-b8952795ba22")
    @SmaMetaAssociation(metaName="NRepresented", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.NRepresentedSmDependency.class)
     SmObjectImpl mNRepresented;

    @objid ("09434616-4e3c-4ad3-b1b3-cdf3db35f4d3")
    @SmaMetaAssociation(metaName="ORepresented", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ORepresentedSmDependency.class)
     SmObjectImpl mORepresented;

    @objid ("9a4fe452-d32a-4401-b00f-cbade41bb4e2")
    @SmaMetaAssociation(metaName="RoleBinding", typeDataClass=BindingData.class, min=0, max=-1, smAssociationClass=Metadata.RoleBindingSmDependency.class, component = true)
     List<SmObjectImpl> mRoleBinding = null;

    @objid ("e63296bd-c1db-499f-ad10-04edc7252a70")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00332b7e-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("90660eb3-7b0b-4117-a6e1-a31b871f36ed")
        private static SmClass smClass = null;

        @objid ("7141eefa-94d3-45bc-ac03-aa5483f59f6e")
        private static SmDependency TypeDep = null;

        @objid ("d4d10c45-1acd-466a-b351-fb7c1a1c18d2")
        private static SmDependency NRepresentedDep = null;

        @objid ("9e461c8f-aa04-4f5d-ba7b-bcc2fb9043d8")
        private static SmDependency ORepresentedDep = null;

        @objid ("5e9ae926-677e-4583-b878-4da92ecb9bc3")
        private static SmDependency RoleBindingDep = null;

        @objid ("f6362712-9821-41e5-8244-8b3098287897")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CollaborationUseData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3041f58f-3caa-4746-9fd2-64cdd7a202f2")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("fbfa7513-3671-4e53-a400-0e0f144228f5")
        public static SmDependency NRepresentedDep() {
            if (NRepresentedDep == null) {
            	NRepresentedDep = classof().getDependencyDef("NRepresented");
            }
            return NRepresentedDep;
        }

        @objid ("0a1c3e51-2dd4-423a-b18f-5ce55f743a28")
        public static SmDependency ORepresentedDep() {
            if (ORepresentedDep == null) {
            	ORepresentedDep = classof().getDependencyDef("ORepresented");
            }
            return ORepresentedDep;
        }

        @objid ("2ebeaa8c-cab7-4c52-abb9-45d2af75ebde")
        public static SmDependency RoleBindingDep() {
            if (RoleBindingDep == null) {
            	RoleBindingDep = classof().getDependencyDef("RoleBinding");
            }
            return RoleBindingDep;
        }

        @objid ("9a9758c9-cfde-47b6-bf87-ee7bec8d2f95")
        public static SmDependency getORepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ORepresentedDep;
        }

        @objid ("e8e737f8-c0de-452b-9009-9dafe4f50759")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("70610430-65f7-4fa6-816b-1cdfb506fb9b")
        public static SmDependency getNRepresentedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NRepresentedDep;
        }

        @objid ("5a8caee5-dec8-41fb-b3b8-0be019a2adcf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("23786065-ceb8-4595-a134-3e099d208a22")
        public static SmDependency getRoleBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RoleBindingDep;
        }

        @objid ("00336b16-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0d20b011-be16-4876-9897-d2a1093311bf")
            public ISmObjectData createData() {
                return new CollaborationUseData();
            }

            @objid ("53712689-7b5a-4b20-93f6-cedb774f7219")
            public SmObjectImpl createImpl() {
                return new CollaborationUseImpl();
            }

        }

        @objid ("0033cca0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("3db16372-f358-434a-a690-f6f63181c88f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationUseData) data).mType;
            }

            @objid ("7348595f-dc9d-4cbb-9c9c-42db229f24de")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationUseData) data).mType = value;
            }

            @objid ("769e978d-c414-49cf-9376-c7df03c5416a")
            @Override
            public SmDependency getSymetric() {
                return CollaborationData.Metadata.OccurrenceDep();
            }

        }

        @objid ("00344004-c4c5-1fd8-97fe-001ec947cd2a")
        public static class NRepresentedSmDependency extends SmSingleDependency {
            @objid ("48b6797c-9f6f-48e3-b170-bd7a3c41543f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationUseData) data).mNRepresented;
            }

            @objid ("b49cb640-60af-464c-81f9-b695d628693b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationUseData) data).mNRepresented = value;
            }

            @objid ("638fed6f-157f-44c3-8874-e6f4747d111c")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedCollaborationUseDep();
            }

        }

        @objid ("0034b6ba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ORepresentedSmDependency extends SmSingleDependency {
            @objid ("c5571d03-66c9-4911-bb1d-7cdbc0d6dcc1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CollaborationUseData) data).mORepresented;
            }

            @objid ("9c5a9e95-a559-4c11-87c0-cfb869075730")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CollaborationUseData) data).mORepresented = value;
            }

            @objid ("aa7c4a95-be5b-4cb9-8caf-5e1b6575f9ce")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.OwnedCollaborationUseDep();
            }

        }

        @objid ("00352c44-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RoleBindingSmDependency extends SmMultipleDependency {
            @objid ("fe1e662d-d9a8-482f-8e24-76b0fe9b29ce")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CollaborationUseData)data).mRoleBinding != null)? ((CollaborationUseData)data).mRoleBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("17092c76-11e4-4269-820b-f2de18c610de")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CollaborationUseData) data).mRoleBinding = new ArrayList<>(initialCapacity);
                return ((CollaborationUseData) data).mRoleBinding;
            }

            @objid ("61f35770-c839-4ce0-b34c-5910ee620ccc")
            @Override
            public SmDependency getSymetric() {
                return BindingData.Metadata.OwnerDep();
            }

        }

    }

}
