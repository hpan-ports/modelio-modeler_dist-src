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
import org.modelio.metamodel.data.uml.statik.InterfaceData;
import org.modelio.metamodel.data.uml.statik.LinkEndData;
import org.modelio.metamodel.data.uml.statik.NaryLinkEndData;
import org.modelio.metamodel.data.uml.statik.PortData;
import org.modelio.metamodel.impl.uml.statik.ProvidedInterfaceImpl;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
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

@objid ("001a1ddc-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=ProvidedInterface.class, factory=ProvidedInterfaceData.Metadata.ObjectFactory.class)
public class ProvidedInterfaceData extends ModelElementData {
    @objid ("52ca3351-d879-4a77-95c9-3e03fac9b609")
    @SmaMetaAssociation(metaName="ProvidedElement", typeDataClass=InterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.ProvidedElementSmDependency.class, partof = true)
     List<SmObjectImpl> mProvidedElement = null;

    @objid ("730f6e22-bf51-4708-90ae-4fc92001b062")
    @SmaMetaAssociation(metaName="Providing", typeDataClass=PortData.class, min=1, max=1, smAssociationClass=Metadata.ProvidingSmDependency.class)
     SmObjectImpl mProviding;

    @objid ("67fe16d7-88c2-4ec4-8e5d-f77a89e4d726")
    @SmaMetaAssociation(metaName="Consumer", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.ConsumerSmDependency.class, istodelete = true)
     List<SmObjectImpl> mConsumer = null;

    @objid ("8ae5ffa5-f23b-4425-88e6-347e8fb610e9")
    @SmaMetaAssociation(metaName="NaryConsumer", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryConsumerSmDependency.class, istodelete = true)
     List<SmObjectImpl> mNaryConsumer = null;

    @objid ("38ad65b4-4568-44fa-9b6d-a0355cd7955b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003b9138-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ee53e9dd-cc9b-4e8d-9f80-318fe5e5dd27")
        private static SmClass smClass = null;

        @objid ("457b048f-6ba2-46d4-8a77-520de423dc64")
        private static SmDependency ProvidedElementDep = null;

        @objid ("7ecb9d03-f4dd-46cf-a3fb-3752c1d9fdc3")
        private static SmDependency ProvidingDep = null;

        @objid ("217b712e-a851-475b-8a85-9e1e698e3153")
        private static SmDependency ConsumerDep = null;

        @objid ("6d393270-4467-49d1-969f-a3c9a02bc659")
        private static SmDependency NaryConsumerDep = null;

        @objid ("74a03caa-7d1c-460b-a45c-d3a84e115aef")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ProvidedInterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("711e32b3-c4c7-42ac-91b5-e45eb6386a37")
        public static SmDependency ProvidedElementDep() {
            if (ProvidedElementDep == null) {
            	ProvidedElementDep = classof().getDependencyDef("ProvidedElement");
            }
            return ProvidedElementDep;
        }

        @objid ("0e9c97a7-8662-4057-99e2-ede07092c87a")
        public static SmDependency ProvidingDep() {
            if (ProvidingDep == null) {
            	ProvidingDep = classof().getDependencyDef("Providing");
            }
            return ProvidingDep;
        }

        @objid ("8b767519-1c97-4201-8d0d-719d18473062")
        public static SmDependency ConsumerDep() {
            if (ConsumerDep == null) {
            	ConsumerDep = classof().getDependencyDef("Consumer");
            }
            return ConsumerDep;
        }

        @objid ("b6c61a74-d95a-48db-bd95-bf10eb3a8f5b")
        public static SmDependency NaryConsumerDep() {
            if (NaryConsumerDep == null) {
            	NaryConsumerDep = classof().getDependencyDef("NaryConsumer");
            }
            return NaryConsumerDep;
        }

        @objid ("47b44d6f-c3d4-4179-a349-671cda8d2262")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("84c0ec67-f018-4ee3-831c-d2bfd930f004")
        public static SmDependency getConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConsumerDep;
        }

        @objid ("f7deeaad-5a17-4eb1-a781-c1fcb887768e")
        public static SmDependency getProvidedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidedElementDep;
        }

        @objid ("ca12a6c6-b7fa-4d2a-8e09-8da1bed50e35")
        public static SmDependency getProvidingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidingDep;
        }

        @objid ("a4001bb6-440a-451f-8964-f212be08e36b")
        public static SmDependency getNaryConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryConsumerDep;
        }

        @objid ("003bd198-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("a75dc0bd-8873-4a86-8188-5198452283ec")
            public ISmObjectData createData() {
                return new ProvidedInterfaceData();
            }

            @objid ("b0c31040-d1ab-4fa5-8bb1-71818b3275dd")
            public SmObjectImpl createImpl() {
                return new ProvidedInterfaceImpl();
            }

        }

        @objid ("003c32d2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProvidedElementSmDependency extends SmMultipleDependency {
            @objid ("1b5c3a66-cf2f-4a3c-9956-fe9f7154343f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProvidedInterfaceData)data).mProvidedElement != null)? ((ProvidedInterfaceData)data).mProvidedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("e1d23b51-c7d1-44c6-b2fd-381a5dba0e3b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProvidedInterfaceData) data).mProvidedElement = new ArrayList<>(initialCapacity);
                return ((ProvidedInterfaceData) data).mProvidedElement;
            }

            @objid ("44bbd01f-d007-4e4e-97c6-08dddd7e8587")
            @Override
            public SmDependency getSymetric() {
                return InterfaceData.Metadata.ProvidingDep();
            }

        }

        @objid ("003c9434-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProvidingSmDependency extends SmSingleDependency {
            @objid ("86a9f505-d16b-4b19-9912-98010be22866")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProvidedInterfaceData) data).mProviding;
            }

            @objid ("026001d8-77e5-402c-a102-7a7b1285123a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProvidedInterfaceData) data).mProviding = value;
            }

            @objid ("1bce19b3-b8a0-4597-b07a-7dd8656aa1ea")
            @Override
            public SmDependency getSymetric() {
                return PortData.Metadata.ProvidedDep();
            }

        }

        @objid ("003d073e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConsumerSmDependency extends SmMultipleDependency {
            @objid ("5732a339-b277-49a6-bc65-d519f1fd7995")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProvidedInterfaceData)data).mConsumer != null)? ((ProvidedInterfaceData)data).mConsumer:SmMultipleDependency.EMPTY;
            }

            @objid ("eee07100-e850-43f2-8fb0-782f17408265")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProvidedInterfaceData) data).mConsumer = new ArrayList<>(initialCapacity);
                return ((ProvidedInterfaceData) data).mConsumer;
            }

            @objid ("426f20d0-bb2a-4461-aef0-65f93e086a33")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.ProviderDep();
            }

        }

        @objid ("002be698-17f3-10a1-88a0-001ec947cd2a")
        public static class NaryConsumerSmDependency extends SmMultipleDependency {
            @objid ("2e2b9b79-9055-4a8d-ac96-4a3ea6172709")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProvidedInterfaceData)data).mNaryConsumer != null)? ((ProvidedInterfaceData)data).mNaryConsumer:SmMultipleDependency.EMPTY;
            }

            @objid ("152e17a5-2a1e-4382-95a8-5d049fe0c37e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProvidedInterfaceData) data).mNaryConsumer = new ArrayList<>(initialCapacity);
                return ((ProvidedInterfaceData) data).mNaryConsumer;
            }

            @objid ("3f321e9a-aad3-4a8f-8ff1-c98f7ad9b092")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.ProviderDep();
            }

        }

    }

}
