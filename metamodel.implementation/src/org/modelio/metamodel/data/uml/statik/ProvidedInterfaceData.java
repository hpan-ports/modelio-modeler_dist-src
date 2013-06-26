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
    @objid ("0cf331f2-08dc-4657-b312-784030ba86bf")
    @SmaMetaAssociation(metaName="ProvidedElement", typeDataClass=InterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.ProvidedElementSmDependency.class, partof = true)
     List<SmObjectImpl> mProvidedElement = null;

    @objid ("64db72b0-20b7-4846-acb6-1cc2a4ce3acd")
    @SmaMetaAssociation(metaName="Providing", typeDataClass=PortData.class, min=1, max=1, smAssociationClass=Metadata.ProvidingSmDependency.class)
     SmObjectImpl mProviding;

    @objid ("25683ed4-0144-484f-870c-0479f05432db")
    @SmaMetaAssociation(metaName="Consumer", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.ConsumerSmDependency.class, istodelete = true)
     List<SmObjectImpl> mConsumer = null;

    @objid ("d7510c07-9a73-4332-ba26-830d6c42de52")
    @SmaMetaAssociation(metaName="NaryConsumer", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryConsumerSmDependency.class, istodelete = true)
     List<SmObjectImpl> mNaryConsumer = null;

    @objid ("598089ab-0546-4e96-9e6d-68a31b5b56f0")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003b9138-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8b921f52-3b7c-470b-8e8c-df4d8bf21e4a")
        private static SmClass smClass = null;

        @objid ("f152f796-dfa3-460a-b373-ac1aea39948b")
        private static SmDependency ProvidedElementDep = null;

        @objid ("18668b3c-2f2d-4105-9ff8-67583788a004")
        private static SmDependency ProvidingDep = null;

        @objid ("a9eb9379-e341-4ce2-bc91-c7209d86e7ca")
        private static SmDependency ConsumerDep = null;

        @objid ("22ce502d-eb50-42f6-8efe-49712df37570")
        private static SmDependency NaryConsumerDep = null;

        @objid ("c0548e65-2ad4-40c1-988b-96eeb59d4d7a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ProvidedInterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("656f3962-accd-4378-bd64-3c4e42aecd27")
        public static SmDependency ProvidedElementDep() {
            if (ProvidedElementDep == null) {
            	ProvidedElementDep = classof().getDependencyDef("ProvidedElement");
            }
            return ProvidedElementDep;
        }

        @objid ("d10b8d67-50ad-4770-a35c-2236c473412f")
        public static SmDependency ProvidingDep() {
            if (ProvidingDep == null) {
            	ProvidingDep = classof().getDependencyDef("Providing");
            }
            return ProvidingDep;
        }

        @objid ("82ce4bc7-e35e-463c-8e4a-2aa08d27708a")
        public static SmDependency ConsumerDep() {
            if (ConsumerDep == null) {
            	ConsumerDep = classof().getDependencyDef("Consumer");
            }
            return ConsumerDep;
        }

        @objid ("3151eb7c-27c8-40a1-8ceb-af9a02a7fecc")
        public static SmDependency NaryConsumerDep() {
            if (NaryConsumerDep == null) {
            	NaryConsumerDep = classof().getDependencyDef("NaryConsumer");
            }
            return NaryConsumerDep;
        }

        @objid ("d7042bd3-6196-43d1-8b5f-00659c2a3e9e")
        public static SmDependency getNaryConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryConsumerDep;
        }

        @objid ("1220ae58-11b0-4160-a5e6-ee4424f07a65")
        public static SmDependency getProvidedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidedElementDep;
        }

        @objid ("b3d09733-5539-4912-8350-ed92451f7f89")
        public static SmDependency getConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConsumerDep;
        }

        @objid ("75b604d1-a3e1-4918-9ac8-1bd25aced088")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4669c825-bb6c-440c-adf8-49cff1c0bb87")
        public static SmDependency getProvidingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidingDep;
        }

        @objid ("003bd198-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("cceb5100-d89f-4e9b-aba1-e021e2e952ad")
            public ISmObjectData createData() {
                return new ProvidedInterfaceData();
            }

            @objid ("9ba3a94a-b193-4f5e-a5e6-42791d0c3410")
            public SmObjectImpl createImpl() {
                return new ProvidedInterfaceImpl();
            }

        }

        @objid ("003c32d2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProvidedElementSmDependency extends SmMultipleDependency {
            @objid ("b4395579-f4ee-476f-bb79-6fc8cdd2f644")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProvidedInterfaceData)data).mProvidedElement != null)? ((ProvidedInterfaceData)data).mProvidedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("6a9a954d-5201-43da-9cb3-55322d99ea8d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProvidedInterfaceData) data).mProvidedElement = new ArrayList<>(initialCapacity);
                return ((ProvidedInterfaceData) data).mProvidedElement;
            }

            @objid ("fafd4d22-9f95-4128-b65e-ed06546d9770")
            @Override
            public SmDependency getSymetric() {
                return InterfaceData.Metadata.ProvidingDep();
            }

        }

        @objid ("003c9434-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProvidingSmDependency extends SmSingleDependency {
            @objid ("684cf5ff-5690-41ce-b2e1-30142fb842a7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProvidedInterfaceData) data).mProviding;
            }

            @objid ("b5b6c93f-95fb-47aa-b48e-82aa4aa686d6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProvidedInterfaceData) data).mProviding = value;
            }

            @objid ("0693b3c6-c59b-4169-a996-2326f8d4bd52")
            @Override
            public SmDependency getSymetric() {
                return PortData.Metadata.ProvidedDep();
            }

        }

        @objid ("003d073e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConsumerSmDependency extends SmMultipleDependency {
            @objid ("c4e066eb-aff5-403f-8fe4-13b41bf5699f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProvidedInterfaceData)data).mConsumer != null)? ((ProvidedInterfaceData)data).mConsumer:SmMultipleDependency.EMPTY;
            }

            @objid ("0ff4aed4-f1c4-4858-87f8-2396f8e5faa2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProvidedInterfaceData) data).mConsumer = new ArrayList<>(initialCapacity);
                return ((ProvidedInterfaceData) data).mConsumer;
            }

            @objid ("33473d54-6ddc-47ce-b66a-e239471b8425")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.ProviderDep();
            }

        }

        @objid ("002be698-17f3-10a1-88a0-001ec947cd2a")
        public static class NaryConsumerSmDependency extends SmMultipleDependency {
            @objid ("621f00e5-da16-47ac-ad68-d56fa6e22591")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProvidedInterfaceData)data).mNaryConsumer != null)? ((ProvidedInterfaceData)data).mNaryConsumer:SmMultipleDependency.EMPTY;
            }

            @objid ("77c5377f-9444-42ff-9a8c-4f39f487b382")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProvidedInterfaceData) data).mNaryConsumer = new ArrayList<>(initialCapacity);
                return ((ProvidedInterfaceData) data).mNaryConsumer;
            }

            @objid ("e21d55c6-6670-4ed4-a995-ba19446406e7")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.ProviderDep();
            }

        }

    }

}
