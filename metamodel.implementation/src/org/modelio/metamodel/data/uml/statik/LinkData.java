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
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationChannelData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.AssociationData;
import org.modelio.metamodel.data.uml.statik.LinkEndData;
import org.modelio.metamodel.impl.uml.statik.LinkImpl;
import org.modelio.metamodel.uml.statik.Link;
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

@objid ("2eae30e5-5566-403a-a2fc-fb71b87360b4")
@SmaMetaClass(mmClass=Link.class, factory=LinkData.Metadata.ObjectFactory.class)
public class LinkData extends ModelElementData {
    @objid ("775f133c-70ac-41c3-a18b-a3fa15b37211")
    @SmaMetaAssociation(metaName="Model", typeDataClass=AssociationData.class, min=0, max=1, smAssociationClass=Metadata.ModelSmDependency.class, partof = true)
     SmObjectImpl mModel;

    @objid ("f8691992-a219-4f22-b946-8b3cdb22bebc")
    @SmaMetaAssociation(metaName="LinkEnd", typeDataClass=LinkEndData.class, min=2, max=2, smAssociationClass=Metadata.LinkEndSmDependency.class)
     List<SmObjectImpl> mLinkEnd = null;

    @objid ("072ce279-6df6-4925-a7d5-2598035ee101")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=CommunicationChannelData.class, min=0, max=1, smAssociationClass=Metadata.SentSmDependency.class)
     SmObjectImpl mSent;

    @objid ("9ad1c1e5-bea9-4f25-b9b5-f6c66a53b59c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("7094e4fd-2afb-4b93-8f27-ba8b04f50a93")
    public static class Metadata {
        @objid ("3b3965bf-44fe-40d8-b184-b28a9e7512e3")
        private static SmClass smClass = null;

        @objid ("350966fc-b169-4959-b8eb-687a3a95ac71")
        private static SmDependency ModelDep = null;

        @objid ("4ce5ceb1-f0d6-4412-9701-8224fc59e981")
        private static SmDependency LinkEndDep = null;

        @objid ("efc5c561-f3dc-4b1c-b02b-bdd928d6b7f9")
        private static SmDependency SentDep = null;

        @objid ("3c87c940-4b61-4744-aa58-7f66edc62daf")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(LinkData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d0520b48-8121-4555-92f0-465ea7218893")
        public static SmDependency ModelDep() {
            if (ModelDep == null) {
            	ModelDep = classof().getDependencyDef("Model");
            }
            return ModelDep;
        }

        @objid ("0c0c92c3-ab7e-49b9-9d7d-cc6f0d35119a")
        public static SmDependency LinkEndDep() {
            if (LinkEndDep == null) {
            	LinkEndDep = classof().getDependencyDef("LinkEnd");
            }
            return LinkEndDep;
        }

        @objid ("e796b28a-6909-4455-a29d-a100e42dbadd")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("3a7ba35f-bd60-4b3d-9882-805be9bf1480")
        public static SmDependency getLinkEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LinkEndDep;
        }

        @objid ("ad85af2f-bfd8-4419-9984-9cda35b77818")
        public static SmDependency getModelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ModelDep;
        }

        @objid ("3825880d-5e6b-4523-a738-3c80648d3888")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("81aeecf7-c9e4-4487-b2dd-160c76f1fcc7")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("8d98c367-8266-4168-b8a3-271093a7ee09")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("fbdd1697-de93-4947-bb4f-f0e46041170c")
            public ISmObjectData createData() {
                return new LinkData();
            }

            @objid ("b7319fd3-ffe2-4de3-993a-654f14af1b5f")
            public SmObjectImpl createImpl() {
                return new LinkImpl();
            }

        }

        @objid ("34799fbc-28e8-473c-8320-544cb526ece1")
        public static class LinkEndSmDependency extends SmMultipleDependency {
            @objid ("03bc3ad4-e7a3-45ee-b943-8c4c8b8a0e80")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((LinkData)data).mLinkEnd != null)? ((LinkData)data).mLinkEnd:SmMultipleDependency.EMPTY;
            }

            @objid ("a34b88b0-e696-4322-a60a-f9fea53e998b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((LinkData) data).mLinkEnd = new ArrayList<>(initialCapacity);
                return ((LinkData) data).mLinkEnd;
            }

            @objid ("b3c45d68-613c-46dc-bdb3-06f23774ad94")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.LinkDep();
            }

        }

        @objid ("6fb40a60-29f0-4ac4-9d99-e5cb1a3b3713")
        public static class ModelSmDependency extends SmSingleDependency {
            @objid ("596b0f2b-c628-4391-bb15-c6dbec48a35f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkData) data).mModel;
            }

            @objid ("6d7ea2c9-ee30-41dc-8c84-4bdb0c059e1c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkData) data).mModel = value;
            }

            @objid ("cafce4c1-0e4b-4445-a4b2-6117ffd475be")
            @Override
            public SmDependency getSymetric() {
                return AssociationData.Metadata.OccurenceDep();
            }

        }

        @objid ("4e086983-d159-4675-aa67-c691b60873d6")
        public static class SentSmDependency extends SmSingleDependency {
            @objid ("71f68d11-cd96-4c38-a643-8a963ac5b4d2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((LinkData) data).mSent;
            }

            @objid ("3c4b2e8e-ac02-4b03-bcd1-a7c3e6e8cdac")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((LinkData) data).mSent = value;
            }

            @objid ("6de7aa36-b0b8-4696-a6ff-0c12718e171d")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.ChannelDep();
            }

        }

    }

}
