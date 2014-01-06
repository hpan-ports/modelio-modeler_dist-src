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
    @objid ("c2be93c7-6f73-49e0-89d9-f40d5d670b1b")
    @SmaMetaAssociation(metaName="StartToEndMessage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.StartToEndMessageSmDependency.class, component = true)
     List<SmObjectImpl> mStartToEndMessage = null;

    @objid ("ab826c49-fd79-488f-80a0-6a704ce5dca8")
    @SmaMetaAssociation(metaName="Channel", typeDataClass=LinkData.class, min=0, max=1, smAssociationClass=Metadata.ChannelSmDependency.class, partof = true)
     SmObjectImpl mChannel;

    @objid ("3a7c5e25-6c83-4227-87c7-36dc2e669c00")
    @SmaMetaAssociation(metaName="Start", typeDataClass=CommunicationNodeData.class, min=0, max=1, smAssociationClass=Metadata.StartSmDependency.class)
     SmObjectImpl mStart;

    @objid ("9436ac84-cb8f-4e4a-8a56-4d632e93f678")
    @SmaMetaAssociation(metaName="NaryChannel", typeDataClass=NaryLinkData.class, min=0, max=1, smAssociationClass=Metadata.NaryChannelSmDependency.class, partof = true)
     SmObjectImpl mNaryChannel;

    @objid ("45da6370-d3a4-4878-8c4e-a2f328767cf3")
    @SmaMetaAssociation(metaName="EndToStartMessage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.EndToStartMessageSmDependency.class, component = true)
     List<SmObjectImpl> mEndToStartMessage = null;

    @objid ("208259c9-8b46-44de-8b45-56f7b1b9881f")
    @SmaMetaAssociation(metaName="End", typeDataClass=CommunicationNodeData.class, min=0, max=1, smAssociationClass=Metadata.EndSmDependency.class, partof = true)
     SmObjectImpl mEnd;

    @objid ("61fef05b-7236-4706-a94a-6886a32666a7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0bcffcc0-9f6e-4a96-b0c1-227e45e2b687")
    public static class Metadata {
        @objid ("59bf3c8b-e249-4e41-902c-7910661de552")
        private static SmClass smClass = null;

        @objid ("03182c4b-88b3-4856-932f-eeb2f4dbea5c")
        private static SmDependency StartToEndMessageDep = null;

        @objid ("c86b5339-032e-4a81-9b99-27c91e2467a7")
        private static SmDependency ChannelDep = null;

        @objid ("b043ab05-af1f-4422-8bae-1b81e588d542")
        private static SmDependency StartDep = null;

        @objid ("721ec24a-0043-4daf-b293-90decf13248c")
        private static SmDependency NaryChannelDep = null;

        @objid ("13fbf3e6-76c9-4ac4-90dc-d1c0a03cb9f7")
        private static SmDependency EndToStartMessageDep = null;

        @objid ("684f5e68-85c5-4276-8608-b192cc145ac0")
        private static SmDependency EndDep = null;

        @objid ("e775d892-56c7-4fb3-b999-0659d3a64da6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationChannelData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1bfe42e7-b7f9-49b9-bbe5-43b338a64432")
        public static SmDependency StartToEndMessageDep() {
            if (StartToEndMessageDep == null) {
            	StartToEndMessageDep = classof().getDependencyDef("StartToEndMessage");
            }
            return StartToEndMessageDep;
        }

        @objid ("13a1cbeb-eaa6-411b-b33d-e0f95dadafd5")
        public static SmDependency ChannelDep() {
            if (ChannelDep == null) {
            	ChannelDep = classof().getDependencyDef("Channel");
            }
            return ChannelDep;
        }

        @objid ("60a23e15-6cab-4a45-bd50-e1d9fe619473")
        public static SmDependency StartDep() {
            if (StartDep == null) {
            	StartDep = classof().getDependencyDef("Start");
            }
            return StartDep;
        }

        @objid ("1d2f278a-b018-4ce1-8e05-acb78a1af1bb")
        public static SmDependency NaryChannelDep() {
            if (NaryChannelDep == null) {
            	NaryChannelDep = classof().getDependencyDef("NaryChannel");
            }
            return NaryChannelDep;
        }

        @objid ("7600124b-c631-416c-a029-29d6f39c3af6")
        public static SmDependency EndToStartMessageDep() {
            if (EndToStartMessageDep == null) {
            	EndToStartMessageDep = classof().getDependencyDef("EndToStartMessage");
            }
            return EndToStartMessageDep;
        }

        @objid ("796f969f-92e7-4d27-843a-9cf153d77403")
        public static SmDependency EndDep() {
            if (EndDep == null) {
            	EndDep = classof().getDependencyDef("End");
            }
            return EndDep;
        }

        @objid ("0e4f6e6a-632d-44ec-a422-006438c085bd")
        public static SmDependency getStartDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartDep;
        }

        @objid ("00f2b053-ee15-4091-9717-461e7f62abd4")
        public static SmDependency getEndToStartMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndToStartMessageDep;
        }

        @objid ("b6d469a1-f369-48e6-9167-f0d2053bbef7")
        public static SmDependency getEndDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EndDep;
        }

        @objid ("448ce1cb-0db7-425b-932f-10da404ea2f1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c71dc085-a8d5-4372-ab1d-3da8b48c3ea6")
        public static SmDependency getStartToEndMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartToEndMessageDep;
        }

        @objid ("81eaa749-c818-41da-82d3-5bdf52e2dcbd")
        public static SmDependency getChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChannelDep;
        }

        @objid ("bf8bb2d9-66db-463e-83f4-ee8d85d07b6f")
        public static SmDependency getNaryChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return NaryChannelDep;
        }

        @objid ("6c6b1c22-2b19-477a-9ccf-5f7155f7b19a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("94a8812b-155c-41f7-97bf-745fb77b96db")
            public ISmObjectData createData() {
                return new CommunicationChannelData();
            }

            @objid ("2c2411e6-d01c-41cf-a6d6-f448719093be")
            public SmObjectImpl createImpl() {
                return new CommunicationChannelImpl();
            }

        }

        @objid ("fd848b1b-8395-4786-bc7c-3950420cdcb1")
        public static class ChannelSmDependency extends SmSingleDependency {
            @objid ("8bff71b0-ef0a-4a30-9d07-d0b034b3477f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mChannel;
            }

            @objid ("7f170087-98e6-439a-9f5e-91718cc72c36")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mChannel = value;
            }

            @objid ("c38fe467-66dc-4f29-a331-30736d3f0d53")
            @Override
            public SmDependency getSymetric() {
                return LinkData.Metadata.SentDep();
            }

        }

        @objid ("8e157f6f-1fdc-40e6-b94e-ebdb55e2bddf")
        public static class StartSmDependency extends SmSingleDependency {
            @objid ("b95078d6-b758-4eee-adec-aba8a539ee6f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mStart;
            }

            @objid ("f7fb3caa-5dcb-4610-8aee-3a61b7d4e108")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mStart = value;
            }

            @objid ("2713f4ce-4b3c-4362-9847-cc39c4fd93dd")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.StartedDep();
            }

        }

        @objid ("8d1e7fe8-18d7-472b-9ab3-592265af84c0")
        public static class EndSmDependency extends SmSingleDependency {
            @objid ("edaa825e-9f6b-46f0-89a6-33ea0b2b9f8f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mEnd;
            }

            @objid ("1e36b5bc-c0f0-42eb-9a06-60b0c559c525")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mEnd = value;
            }

            @objid ("e26086f7-367a-4e42-a130-b4b93b8046f5")
            @Override
            public SmDependency getSymetric() {
                return CommunicationNodeData.Metadata.EndedDep();
            }

        }

        @objid ("bd83a1cb-e193-4b4e-9ed9-51dafd3cd692")
        public static class StartToEndMessageSmDependency extends SmMultipleDependency {
            @objid ("48364722-63cb-4a0d-8644-fc0e4d425e98")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationChannelData)data).mStartToEndMessage != null)? ((CommunicationChannelData)data).mStartToEndMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("25be3ea4-2fbc-42ed-8c94-c22f44c02ccf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationChannelData) data).mStartToEndMessage = new ArrayList<>(initialCapacity);
                return ((CommunicationChannelData) data).mStartToEndMessage;
            }

            @objid ("277f516b-076b-466a-b3f4-c5a3897c4782")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.ChannelDep();
            }

        }

        @objid ("88bc8eba-68f4-4994-ad72-7a2adfc15f37")
        public static class EndToStartMessageSmDependency extends SmMultipleDependency {
            @objid ("6d1974a9-cd5c-4fb2-8fb6-5653f8d9d5d7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationChannelData)data).mEndToStartMessage != null)? ((CommunicationChannelData)data).mEndToStartMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("e7a7cf1e-403f-446e-b561-6b7702726d26")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationChannelData) data).mEndToStartMessage = new ArrayList<>(initialCapacity);
                return ((CommunicationChannelData) data).mEndToStartMessage;
            }

            @objid ("f0566dab-fc7d-42a3-8452-75eb6cef29f0")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.InvertedChannelDep();
            }

        }

        @objid ("aba7d0f8-de32-4739-96cf-24ff1f384181")
        public static class NaryChannelSmDependency extends SmSingleDependency {
            @objid ("582b43be-c386-40eb-9bd1-14fc467041ac")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationChannelData) data).mNaryChannel;
            }

            @objid ("8ae7440c-9016-4030-b929-abc46fa6eab2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationChannelData) data).mNaryChannel = value;
            }

            @objid ("488feb3a-5cbc-47ec-a153-36e98d6a847d")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.SentDep();
            }

        }

    }

}
