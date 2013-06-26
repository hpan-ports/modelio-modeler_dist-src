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
package org.modelio.metamodel.data.uml.behavior.communicationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationMessageData;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationNodeData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.LinkData;
import org.modelio.metamodel.data.uml.statik.NaryLinkData;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationChannelImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
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

@objid ("67558b34-b4c9-476e-939c-3da1dcc447df")
@SmaMetaClass(mmClass=CommunicationChannel.class, factory=CommunicationChannelData.Metadata.ObjectFactory.class)
public class CommunicationChannelData extends ModelElementData {
    @objid ("72c8d2e6-4fb2-437b-8727-04b416f59967")
    @SmaMetaAssociation(metaName="StartToEndMessage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.StartToEndMessageSmDependency.class, component = true)
     List<SmObjectImpl> mStartToEndMessage = null;

    @objid ("e34d2eb1-84fb-4a2b-9ac4-f1671f5a2f05")
    @SmaMetaAssociation(metaName="Channel", typeDataClass=LinkData.class, min=0, max=1, smAssociationClass=Metadata.ChannelSmDependency.class, partof = true)
     SmObjectImpl mChannel;

    @objid ("c53cbf32-3438-44fe-83c4-be23542a9414")
    @SmaMetaAssociation(metaName="Start", typeDataClass=CommunicationNodeData.class, min=0, max=1, smAssociationClass=Metadata.StartSmDependency.class)
     SmObjectImpl mStart;

    @objid ("af10eb09-55f5-4bc7-ba56-934ff15f86a4")
    @SmaMetaAssociation(metaName="NaryChannel", typeDataClass=NaryLinkData.class, min=0, max=1, smAssociationClass=Metadata.NaryChannelSmDependency.class, partof = true)
     SmObjectImpl mNaryChannel;

    @objid ("99eee533-ee08-43a3-83ce-1de224c3bbf5")
    @SmaMetaAssociation(metaName="EndToStartMessage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.EndToStartMessageSmDependency.class, component = true)
     List<SmObjectImpl> mEndToStartMessage = null;

    @objid ("524ff81c-7194-4e13-85fb-619c3e9e08a0")
    @SmaMetaAssociation(metaName="End", typeDataClass=CommunicationNodeData.class, min=0, max=1, smAssociationClass=Metadata.EndSmDependency.class, partof = true)
     SmObjectImpl mEnd;

    @objid ("c806734a-68dd-413f-918d-bc4d3993dada")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0bcffcc0-9f6e-4a96-b0c1-227e45e2b687")
    public static class Metadata {
        @objid ("ab74ce4c-101e-4fda-b398-68b9329ba4f4")
        private static SmClass smClass = null;

        @objid ("5d8831c1-d58f-4d80-aa68-ead628b35e57")
        private static SmDependency StartToEndMessageDep = null;

        @objid ("1de670f0-768e-48f8-b893-f0d59efbdac5")
        private static SmDependency ChannelDep = null;

        @objid ("840e0054-e8ac-4b5b-9833-b24991edab03")
        private static SmDependency StartDep = null;

        @objid ("952a8a26-62cd-4acd-8ecc-d5c5bc6f35de")
        private static SmDependency NaryChannelDep = null;

        @objid ("d91af7ce-05bb-4f27-a88f-84cae5bd1fbb")
        private static SmDependency EndToStartMessageDep = null;

        @objid ("a2bd0636-5aba-424f-852c-8b05115643cb")
        private static SmDependency EndDep = null;

        @objid ("05e84514-bf53-4384-904f-a043cd51bd12")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationChannelData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("68251dbd-40e1-4cdf-bc9a-f70d8dfa8a1e")
        public static SmDependency StartToEndMessageDep() {
            if (StartToEndMessageDep == null) {
            	StartToEndMessageDep = classof().getDependencyDef("StartToEndMessage");
            }
            return StartToEndMessageDep;
        }

        @objid ("df18af34-fff7-4356-b423-177b43ec085f")
        public static SmDependency ChannelDep() {
            if (ChannelDep == null) {
            	ChannelDep = classof().getDependencyDef("Channel");
            }
            return ChannelDep;
        }

        @objid ("3977efb1-c3ec-4229-a2f6-7be86670d0cb")
        public static SmDependency StartDep() {
            if (StartDep == null) {
            	StartDep = classof().getDependencyDef("Start");
            }
            return StartDep;
        }

        @objid ("45136e44-3153-4a60-8919-d34038d1fd10")
        public static SmDependency NaryChannelDep() {
            if (NaryChannelDep == null) {
            	NaryChannelDep = classof().getDependencyDef("NaryChannel");
            }
            return NaryChannelDep;
        }

        @objid ("de9914b9-bd8e-43c1-8a2d-b47c0f3b52cd")
        public static SmDependency EndToStartMessageDep() {
            if (EndToStartMessageDep == null) {
            	EndToStartMessageDep = classof().getDependencyDef("EndToStartMessage");
            }
            return EndToStartMessageDep;
        }

        @objid ("93c289fb-5745-4052-ac0e-e0e77ee19b00")
        public static SmDependency EndDep() {
            if (EndDep == null) {
            	EndDep = classof().getDependencyDef("End");
            }
            return EndDep;
        }

        @objid ("835d20d2-360f-4177-acd9-3bf42f5ec6a0")
        public static SmDependency getEndToStartMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndToStartMessageDep;
        }

        @objid ("d187dd1e-251d-49e1-92d5-f157e20d04c9")
        public static SmDependency getChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChannelDep;
        }

        @objid ("474ce178-7d2e-41e8-b938-6477fdff55d8")
        public static SmDependency getNaryChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryChannelDep;
        }

        @objid ("8664f4c4-42b4-466c-8dac-4ed1841335b2")
        public static SmDependency getStartToEndMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartToEndMessageDep;
        }

        @objid ("419f3143-4529-4309-ac10-f9c0f2add121")
        public static SmDependency getStartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartDep;
        }

        @objid ("f5bf10c5-0813-4b12-9b62-8e5a721a6268")
        public static SmDependency getEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndDep;
        }

        @objid ("3d536057-0154-4b0c-83a0-848052af3a6b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6c6b1c22-2b19-477a-9ccf-5f7155f7b19a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c388f2d4-18aa-4e85-860e-7f09288bfcf3")
            public ISmObjectData createData() {
                return new CommunicationChannelData();
            }

            @objid ("69114748-6318-463b-9228-8979bfea172b")
            public SmObjectImpl createImpl() {
                return new CommunicationChannelImpl();
            }

        }

        @objid ("fd848b1b-8395-4786-bc7c-3950420cdcb1")
        public static class ChannelSmDependency extends SmSingleDependency {
            @objid ("a6865e28-b760-4e4b-a455-6d39a2ea84c6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mChannel;
            }

            @objid ("02f20561-7dcd-4981-a014-43ea15f5f9d8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mChannel = value;
            }

            @objid ("a7a8eb7a-eeb7-43ac-8b86-34d9be439835")
            @Override
            public SmDependency getSymetric() {
                return LinkData.Metadata.SentDep();
            }

        }

        @objid ("8e157f6f-1fdc-40e6-b94e-ebdb55e2bddf")
        public static class StartSmDependency extends SmSingleDependency {
            @objid ("f0c306f5-64ba-46c0-9fc9-a0f8b2bffd47")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mStart;
            }

            @objid ("f7aae01c-ed27-4516-b807-1026b8347b1e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mStart = value;
            }

            @objid ("8af087d5-0825-4920-96da-96e14ebd9b2d")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.StartedDep();
            }

        }

        @objid ("8d1e7fe8-18d7-472b-9ab3-592265af84c0")
        public static class EndSmDependency extends SmSingleDependency {
            @objid ("7da44e8b-0042-49ea-8a17-17b13c1ebe8c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mEnd;
            }

            @objid ("243f6efe-15f2-45e8-887c-b59e736f49bf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mEnd = value;
            }

            @objid ("f528524b-6c14-4470-887c-676ecc60d02b")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.EndedDep();
            }

        }

        @objid ("bd83a1cb-e193-4b4e-9ed9-51dafd3cd692")
        public static class StartToEndMessageSmDependency extends SmMultipleDependency {
            @objid ("3b5d7962-177b-4c89-b813-8494833e288b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationChannelData)data).mStartToEndMessage != null)? ((CommunicationChannelData)data).mStartToEndMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("1e625a73-45d9-4852-a870-b297a8cea05d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationChannelData) data).mStartToEndMessage = new ArrayList<>(initialCapacity);
                return ((CommunicationChannelData) data).mStartToEndMessage;
            }

            @objid ("50627fc6-2171-4505-9331-78b95335026c")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.ChannelDep();
            }

        }

        @objid ("88bc8eba-68f4-4994-ad72-7a2adfc15f37")
        public static class EndToStartMessageSmDependency extends SmMultipleDependency {
            @objid ("bbf5e37e-b71a-41b7-8c78-8374f61b35ae")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationChannelData)data).mEndToStartMessage != null)? ((CommunicationChannelData)data).mEndToStartMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("9a9fe85a-0487-4993-9c12-7b68cc742b87")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationChannelData) data).mEndToStartMessage = new ArrayList<>(initialCapacity);
                return ((CommunicationChannelData) data).mEndToStartMessage;
            }

            @objid ("b4ba819f-de07-41aa-9b0f-41fc8f6489f0")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.InvertedChannelDep();
            }

        }

        @objid ("aba7d0f8-de32-4739-96cf-24ff1f384181")
        public static class NaryChannelSmDependency extends SmSingleDependency {
            @objid ("69a23822-a431-498e-9520-3d1276f4b54d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mNaryChannel;
            }

            @objid ("8e6c95b1-b3d0-41d5-8f9e-c551afb1a948")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mNaryChannel = value;
            }

            @objid ("0f9876c1-1e67-4419-827f-6cd86e35ddc6")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.SentDep();
            }

        }

    }

}
