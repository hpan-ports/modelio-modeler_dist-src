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
    @objid ("2e7276c0-8ffb-4658-8020-6d70cf5869b4")
    @SmaMetaAssociation(metaName="StartToEndMessage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.StartToEndMessageSmDependency.class, component = true)
     List<SmObjectImpl> mStartToEndMessage = null;

    @objid ("c9f9c742-7203-4722-a80e-9ddfdd5e3b2a")
    @SmaMetaAssociation(metaName="Channel", typeDataClass=LinkData.class, min=0, max=1, smAssociationClass=Metadata.ChannelSmDependency.class, partof = true)
     SmObjectImpl mChannel;

    @objid ("d805af5f-6935-4411-baf4-d3d501403b16")
    @SmaMetaAssociation(metaName="Start", typeDataClass=CommunicationNodeData.class, min=0, max=1, smAssociationClass=Metadata.StartSmDependency.class)
     SmObjectImpl mStart;

    @objid ("99f1f747-8818-40ff-837a-b9fe2679853a")
    @SmaMetaAssociation(metaName="NaryChannel", typeDataClass=NaryLinkData.class, min=0, max=1, smAssociationClass=Metadata.NaryChannelSmDependency.class, partof = true)
     SmObjectImpl mNaryChannel;

    @objid ("ad6ae904-fabf-44c1-a74e-c8281103b74a")
    @SmaMetaAssociation(metaName="EndToStartMessage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.EndToStartMessageSmDependency.class, component = true)
     List<SmObjectImpl> mEndToStartMessage = null;

    @objid ("f39253c1-0e0b-476d-84e2-7e3f551712dc")
    @SmaMetaAssociation(metaName="End", typeDataClass=CommunicationNodeData.class, min=0, max=1, smAssociationClass=Metadata.EndSmDependency.class, partof = true)
     SmObjectImpl mEnd;

    @objid ("b6ab9df3-7d14-4d52-a03d-2f18009a32be")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0bcffcc0-9f6e-4a96-b0c1-227e45e2b687")
    public static class Metadata {
        @objid ("5c82fa4a-3d20-4a3c-a40e-7a81db339af8")
        private static SmClass smClass = null;

        @objid ("0ccf9ee8-b775-4ab1-881f-658b920cbeab")
        private static SmDependency StartToEndMessageDep = null;

        @objid ("67745fa3-df54-4543-a7d7-c0a47b8030b4")
        private static SmDependency ChannelDep = null;

        @objid ("7907f68e-a237-45af-90cb-d1568e1bfae2")
        private static SmDependency StartDep = null;

        @objid ("1c562bc2-fd25-4aac-935d-0b31c26422ab")
        private static SmDependency NaryChannelDep = null;

        @objid ("54f42682-b081-4141-860a-7b92b389bffb")
        private static SmDependency EndToStartMessageDep = null;

        @objid ("0df908a5-5101-469b-978d-eddcd36874b4")
        private static SmDependency EndDep = null;

        @objid ("ffd66c39-6dca-4b3b-b52a-284f2d09049b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationChannelData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("e7fac115-c4a5-4257-a970-765212fc5bcc")
        public static SmDependency StartToEndMessageDep() {
            if (StartToEndMessageDep == null) {
            	StartToEndMessageDep = classof().getDependencyDef("StartToEndMessage");
            }
            return StartToEndMessageDep;
        }

        @objid ("5a8aa53e-aa58-495c-b953-a31c0f7792f0")
        public static SmDependency ChannelDep() {
            if (ChannelDep == null) {
            	ChannelDep = classof().getDependencyDef("Channel");
            }
            return ChannelDep;
        }

        @objid ("bb06d71a-5d55-4a77-91e3-b272e130a44b")
        public static SmDependency StartDep() {
            if (StartDep == null) {
            	StartDep = classof().getDependencyDef("Start");
            }
            return StartDep;
        }

        @objid ("fdd5f33a-b77c-4793-a7ce-18a5eac45bdf")
        public static SmDependency NaryChannelDep() {
            if (NaryChannelDep == null) {
            	NaryChannelDep = classof().getDependencyDef("NaryChannel");
            }
            return NaryChannelDep;
        }

        @objid ("f792f069-ce76-40fd-bc77-39fc965d9b86")
        public static SmDependency EndToStartMessageDep() {
            if (EndToStartMessageDep == null) {
            	EndToStartMessageDep = classof().getDependencyDef("EndToStartMessage");
            }
            return EndToStartMessageDep;
        }

        @objid ("c1178c0f-a6d0-42da-8781-e2a31d67b7e3")
        public static SmDependency EndDep() {
            if (EndDep == null) {
            	EndDep = classof().getDependencyDef("End");
            }
            return EndDep;
        }

        @objid ("8a968cb5-473a-4053-a1f8-8a0b4440f28c")
        public static SmDependency getChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChannelDep;
        }

        @objid ("9831ff86-8613-486c-877e-bb66ce1a03a0")
        public static SmDependency getStartToEndMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartToEndMessageDep;
        }

        @objid ("9c27e1df-e806-4566-a393-6a65fe0754f9")
        public static SmDependency getEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndDep;
        }

        @objid ("f7514887-ef75-423a-93b8-e044a2c9c963")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d50d009e-c47c-451d-9df0-03a7f44c9592")
        public static SmDependency getStartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartDep;
        }

        @objid ("69cd4ddf-1639-477c-99da-efe3a2f4d24d")
        public static SmDependency getNaryChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryChannelDep;
        }

        @objid ("f6228972-1e87-41ae-b112-07a61f1a478c")
        public static SmDependency getEndToStartMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndToStartMessageDep;
        }

        @objid ("6c6b1c22-2b19-477a-9ccf-5f7155f7b19a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("184323e6-5a67-417a-848b-8045867e1abc")
            public ISmObjectData createData() {
                return new CommunicationChannelData();
            }

            @objid ("f87af16a-6f67-4c7e-8ed5-ac050cb0eb56")
            public SmObjectImpl createImpl() {
                return new CommunicationChannelImpl();
            }

        }

        @objid ("fd848b1b-8395-4786-bc7c-3950420cdcb1")
        public static class ChannelSmDependency extends SmSingleDependency {
            @objid ("9ff5bd3a-c7ce-4379-963e-dccf45171a62")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mChannel;
            }

            @objid ("30112af6-e308-4ebb-a691-1f92bc048564")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mChannel = value;
            }

            @objid ("6007e50c-89ee-4818-8ffd-63707f120421")
            @Override
            public SmDependency getSymetric() {
                return LinkData.Metadata.SentDep();
            }

        }

        @objid ("8e157f6f-1fdc-40e6-b94e-ebdb55e2bddf")
        public static class StartSmDependency extends SmSingleDependency {
            @objid ("bd8ead17-ff14-4460-8613-510d091787e9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mStart;
            }

            @objid ("d86d90c2-d4ec-456c-8156-60f9a0c0a715")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mStart = value;
            }

            @objid ("f65d06df-f947-45bf-89b4-fe4af85baefe")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.StartedDep();
            }

        }

        @objid ("8d1e7fe8-18d7-472b-9ab3-592265af84c0")
        public static class EndSmDependency extends SmSingleDependency {
            @objid ("ea67006c-c181-4cd8-a87c-f4d9173ec6aa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mEnd;
            }

            @objid ("3df443ce-42d0-45ab-bdb6-0a16b4b384c1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mEnd = value;
            }

            @objid ("cc814f06-75b0-4f2c-b057-e5089c7553f1")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.EndedDep();
            }

        }

        @objid ("bd83a1cb-e193-4b4e-9ed9-51dafd3cd692")
        public static class StartToEndMessageSmDependency extends SmMultipleDependency {
            @objid ("c5a72a7c-ba00-4a4a-b699-3e0c24afe378")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationChannelData)data).mStartToEndMessage != null)? ((CommunicationChannelData)data).mStartToEndMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("9e0711a8-0c97-48f1-9018-66958c6f49e5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationChannelData) data).mStartToEndMessage = new ArrayList<>(initialCapacity);
                return ((CommunicationChannelData) data).mStartToEndMessage;
            }

            @objid ("5042687e-c253-4fb8-9d89-dfa558212338")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.ChannelDep();
            }

        }

        @objid ("88bc8eba-68f4-4994-ad72-7a2adfc15f37")
        public static class EndToStartMessageSmDependency extends SmMultipleDependency {
            @objid ("10cc0786-23b1-4915-b58a-305d767fcf29")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationChannelData)data).mEndToStartMessage != null)? ((CommunicationChannelData)data).mEndToStartMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("5241cebf-a88a-4d6f-a2c6-568a73a08406")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationChannelData) data).mEndToStartMessage = new ArrayList<>(initialCapacity);
                return ((CommunicationChannelData) data).mEndToStartMessage;
            }

            @objid ("a5ceefa0-91dc-4357-9115-73e84d973889")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.InvertedChannelDep();
            }

        }

        @objid ("aba7d0f8-de32-4739-96cf-24ff1f384181")
        public static class NaryChannelSmDependency extends SmSingleDependency {
            @objid ("34e7acc5-a1a2-44fc-badd-2a80de2cd261")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mNaryChannel;
            }

            @objid ("09115c50-a8d1-40a9-a712-b312eb06fe34")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mNaryChannel = value;
            }

            @objid ("fce1ebba-76cd-4f92-812a-8ed5115f1315")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.SentDep();
            }

        }

    }

}
