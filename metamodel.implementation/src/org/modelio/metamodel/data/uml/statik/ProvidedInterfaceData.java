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
    @objid ("83bf99c9-bf96-4f80-9edc-80bc36685e65")
    @SmaMetaAssociation(metaName="ProvidedElement", typeDataClass=InterfaceData.class, min=0, max=-1, smAssociationClass=Metadata.ProvidedElementSmDependency.class, partof = true)
     List<SmObjectImpl> mProvidedElement = null;

    @objid ("00835074-9ca1-44f1-9894-2e51f7995a41")
    @SmaMetaAssociation(metaName="Providing", typeDataClass=PortData.class, min=1, max=1, smAssociationClass=Metadata.ProvidingSmDependency.class)
     SmObjectImpl mProviding;

    @objid ("2b83c6ee-7199-4bb0-afdb-8e344bc6fb4b")
    @SmaMetaAssociation(metaName="Consumer", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.ConsumerSmDependency.class, istodelete = true)
     List<SmObjectImpl> mConsumer = null;

    @objid ("b9b9e7f5-065e-44d3-b213-e184409e1d11")
    @SmaMetaAssociation(metaName="NaryConsumer", typeDataClass=NaryLinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.NaryConsumerSmDependency.class, istodelete = true)
     List<SmObjectImpl> mNaryConsumer = null;

    @objid ("64fe8424-8573-4b75-989d-eab848a5ff9a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003b9138-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b501968a-0006-4b3b-9722-d018e2179ffa")
        private static SmClass smClass = null;

        @objid ("6a3c339c-98f1-4e53-9b41-802d488dc9ec")
        private static SmDependency ProvidedElementDep = null;

        @objid ("6fb5979d-8d91-4d8f-80ae-0bdfc288a97a")
        private static SmDependency ProvidingDep = null;

        @objid ("93fda9c3-7ea8-4fa1-86eb-2d5299c29387")
        private static SmDependency ConsumerDep = null;

        @objid ("3eab0e4a-608f-4693-9441-0a8985355156")
        private static SmDependency NaryConsumerDep = null;

        @objid ("ad9b4373-3dcb-4d33-9ee0-4b680d71fcc0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(ProvidedInterfaceData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a1c6b585-5a47-4d9d-9ad8-68cb1497ead1")
        public static SmDependency ProvidedElementDep() {
            if (ProvidedElementDep == null) {
            	ProvidedElementDep = classof().getDependencyDef("ProvidedElement");
            }
            return ProvidedElementDep;
        }

        @objid ("19165362-791c-4783-b550-8f8a7a879e90")
        public static SmDependency ProvidingDep() {
            if (ProvidingDep == null) {
            	ProvidingDep = classof().getDependencyDef("Providing");
            }
            return ProvidingDep;
        }

        @objid ("8e0ae0c1-93de-4e80-a8b4-b6d0725f65f0")
        public static SmDependency ConsumerDep() {
            if (ConsumerDep == null) {
            	ConsumerDep = classof().getDependencyDef("Consumer");
            }
            return ConsumerDep;
        }

        @objid ("b538f77d-1a49-4ad9-8473-240e3254b1f9")
        public static SmDependency NaryConsumerDep() {
            if (NaryConsumerDep == null) {
            	NaryConsumerDep = classof().getDependencyDef("NaryConsumer");
            }
            return NaryConsumerDep;
        }

        @objid ("fbfd941e-edbb-4f66-8089-7d7cc26c8268")
        public static SmDependency getProvidingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidingDep;
        }

        @objid ("e01bf703-8da4-4c46-a27a-ed677c9878f6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("703151f5-4cee-4805-8b8b-7f0649e2b30c")
        public static SmDependency getNaryConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryConsumerDep;
        }

        @objid ("a4899c95-1ccb-4460-84b9-bbbef1aeaedf")
        public static SmDependency getProvidedElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProvidedElementDep;
        }

        @objid ("a6ac7f18-f98b-4a97-aec7-d005709621ba")
        public static SmDependency getConsumerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConsumerDep;
        }

        @objid ("003bd198-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("033eae1e-e1c7-4bb1-91aa-c5bceeae1aad")
            public ISmObjectData createData() {
                return new ProvidedInterfaceData();
            }

            @objid ("7bc52e61-9208-4c74-8020-0e588757c23e")
            public SmObjectImpl createImpl() {
                return new ProvidedInterfaceImpl();
            }

        }

        @objid ("003c32d2-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProvidedElementSmDependency extends SmMultipleDependency {
            @objid ("3dd67d8a-3a5c-406d-9bd2-43e8dfa7b9c4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProvidedInterfaceData)data).mProvidedElement != null)? ((ProvidedInterfaceData)data).mProvidedElement:SmMultipleDependency.EMPTY;
            }

            @objid ("04ff84ab-d18b-4299-8feb-a3466e7649d6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProvidedInterfaceData) data).mProvidedElement = new ArrayList<>(initialCapacity);
                return ((ProvidedInterfaceData) data).mProvidedElement;
            }

            @objid ("ad6bdbda-50e7-4c7a-a28d-c2bf8fa2f708")
            @Override
            public SmDependency getSymetric() {
                return InterfaceData.Metadata.ProvidingDep();
            }

        }

        @objid ("003c9434-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ProvidingSmDependency extends SmSingleDependency {
            @objid ("68c18862-9aad-4bb2-bdcc-84298e963514")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((ProvidedInterfaceData) data).mProviding;
            }

            @objid ("23b31ae9-4545-44e4-b879-d5a9d54cef85")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((ProvidedInterfaceData) data).mProviding = value;
            }

            @objid ("c75211d3-5cbd-4fd4-b057-49e82c40e058")
            @Override
            public SmDependency getSymetric() {
                return PortData.Metadata.ProvidedDep();
            }

        }

        @objid ("003d073e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ConsumerSmDependency extends SmMultipleDependency {
            @objid ("40a27e9b-79ee-416c-b67d-5b328169808b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProvidedInterfaceData)data).mConsumer != null)? ((ProvidedInterfaceData)data).mConsumer:SmMultipleDependency.EMPTY;
            }

            @objid ("3a13f18f-9075-4b32-9c76-3531f3ee4459")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProvidedInterfaceData) data).mConsumer = new ArrayList<>(initialCapacity);
                return ((ProvidedInterfaceData) data).mConsumer;
            }

            @objid ("cc65bdee-4a14-46c5-9c22-65c8a70543b1")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.ProviderDep();
            }

        }

        @objid ("002be698-17f3-10a1-88a0-001ec947cd2a")
        public static class NaryConsumerSmDependency extends SmMultipleDependency {
            @objid ("f822c76c-8aa5-412e-91f4-52ed77c8888a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((ProvidedInterfaceData)data).mNaryConsumer != null)? ((ProvidedInterfaceData)data).mNaryConsumer:SmMultipleDependency.EMPTY;
            }

            @objid ("e5268533-1b4d-453a-8be5-58f99a5d9b6f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((ProvidedInterfaceData) data).mNaryConsumer = new ArrayList<>(initialCapacity);
                return ((ProvidedInterfaceData) data).mNaryConsumer;
            }

            @objid ("df7b3202-1fe2-4d8c-bcb5-09ac2a2ff205")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkEndData.Metadata.ProviderDep();
            }

        }

    }

}
