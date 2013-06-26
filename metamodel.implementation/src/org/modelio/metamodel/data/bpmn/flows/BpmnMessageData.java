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
package org.modelio.metamodel.data.bpmn.flows;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.data.bpmn.activities.BpmnReceiveTaskData;
import org.modelio.metamodel.data.bpmn.activities.BpmnSendTaskData;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.data.bpmn.events.BpmnMessageEventDefinitionData;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageFlowData;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemDefinitionData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageImpl;
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

@objid ("007c30f8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnMessage.class, factory=BpmnMessageData.Metadata.ObjectFactory.class)
public class BpmnMessageData extends BpmnRootElementData {
    @objid ("c05a0e96-a5fe-48a1-b278-25146e7a790c")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("ec73844c-3c49-41aa-bccf-a31b96000e9d")
    @SmaMetaAssociation(metaName="OutputMessage", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.OutputMessageSmDependency.class)
     List<SmObjectImpl> mOutputMessage = null;

    @objid ("0fdca368-0afb-41ac-a53d-ae64c35bb84a")
    @SmaMetaAssociation(metaName="ItemRef", typeDataClass=BpmnItemDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.ItemRefSmDependency.class, partof = true)
     SmObjectImpl mItemRef;

    @objid ("b5d0abb7-e5da-4390-85da-d16a15d2ef11")
    @SmaMetaAssociation(metaName="InState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.InStateSmDependency.class, partof = true)
     SmObjectImpl mInState;

    @objid ("8731ac0c-b3a6-4ed8-95d5-c8441f02b83e")
    @SmaMetaAssociation(metaName="EventDefinition", typeDataClass=BpmnMessageEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.EventDefinitionSmDependency.class)
     List<SmObjectImpl> mEventDefinition = null;

    @objid ("490d0b2f-5598-492f-b484-5e9c25982007")
    @SmaMetaAssociation(metaName="Sender", typeDataClass=BpmnSendTaskData.class, min=0, max=-1, smAssociationClass=Metadata.SenderSmDependency.class)
     List<SmObjectImpl> mSender = null;

    @objid ("3654d2aa-fb77-41da-b169-2e81e718d25c")
    @SmaMetaAssociation(metaName="InputMessage", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.InputMessageSmDependency.class)
     List<SmObjectImpl> mInputMessage = null;

    @objid ("c383b455-b970-4a79-b13b-c2f4ea9e2217")
    @SmaMetaAssociation(metaName="Receiver", typeDataClass=BpmnReceiveTaskData.class, min=0, max=-1, smAssociationClass=Metadata.ReceiverSmDependency.class)
     List<SmObjectImpl> mReceiver = null;

    @objid ("cdafd4d1-b8fe-499f-bb70-bd24145c47bc")
    @SmaMetaAssociation(metaName="MessageFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.MessageFlowSmDependency.class)
     List<SmObjectImpl> mMessageFlow = null;

    @objid ("c0511e8b-2a4f-4d51-8294-a70fcf2007eb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001e4ca4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2a4d4b80-4608-475c-bddb-44015d094380")
        private static SmClass smClass = null;

        @objid ("219f275b-e987-4d89-b8b9-7a1984ebef8e")
        private static SmDependency TypeDep = null;

        @objid ("d5c41a5f-f0a0-4d22-806e-6e2edaf64261")
        private static SmDependency OutputMessageDep = null;

        @objid ("bd89c509-9773-4c49-9e32-f9945ade834e")
        private static SmDependency ItemRefDep = null;

        @objid ("dcba5cb9-654e-4e7f-93c4-d74e6ee0c03b")
        private static SmDependency InStateDep = null;

        @objid ("63181b70-d8e9-4e2e-8bb3-b4798b607102")
        private static SmDependency EventDefinitionDep = null;

        @objid ("79c1b910-610d-4387-a69f-125ac769bd81")
        private static SmDependency SenderDep = null;

        @objid ("ea39645e-a092-460e-a9e4-bdb918a19613")
        private static SmDependency InputMessageDep = null;

        @objid ("1bc08fdb-6a35-4a1d-a179-13476a9bb580")
        private static SmDependency ReceiverDep = null;

        @objid ("0936f7d3-0f1c-4eaa-abd7-3e58acf53d65")
        private static SmDependency MessageFlowDep = null;

        @objid ("b49a45b3-3351-422c-b119-c62034b815e7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMessageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d46c3bb3-4c9b-43fd-9762-83fd863d8b51")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("d419eb75-458f-4046-b89b-8e971720ecea")
        public static SmDependency OutputMessageDep() {
            if (OutputMessageDep == null) {
            	OutputMessageDep = classof().getDependencyDef("OutputMessage");
            }
            return OutputMessageDep;
        }

        @objid ("400de2bc-54a3-4bd7-b7c4-67ef4018c8b3")
        public static SmDependency ItemRefDep() {
            if (ItemRefDep == null) {
            	ItemRefDep = classof().getDependencyDef("ItemRef");
            }
            return ItemRefDep;
        }

        @objid ("9a620673-9a93-4312-8853-d93160909168")
        public static SmDependency InStateDep() {
            if (InStateDep == null) {
            	InStateDep = classof().getDependencyDef("InState");
            }
            return InStateDep;
        }

        @objid ("27d44c74-562c-42bf-8597-661355209638")
        public static SmDependency EventDefinitionDep() {
            if (EventDefinitionDep == null) {
            	EventDefinitionDep = classof().getDependencyDef("EventDefinition");
            }
            return EventDefinitionDep;
        }

        @objid ("f52860f5-d35e-4c23-8833-bb7ccef73d40")
        public static SmDependency SenderDep() {
            if (SenderDep == null) {
            	SenderDep = classof().getDependencyDef("Sender");
            }
            return SenderDep;
        }

        @objid ("f9943479-5f7e-47ac-a78f-42b8f4c00b2a")
        public static SmDependency InputMessageDep() {
            if (InputMessageDep == null) {
            	InputMessageDep = classof().getDependencyDef("InputMessage");
            }
            return InputMessageDep;
        }

        @objid ("88c972b4-e97c-4070-ab74-a58b0c42fb1f")
        public static SmDependency ReceiverDep() {
            if (ReceiverDep == null) {
            	ReceiverDep = classof().getDependencyDef("Receiver");
            }
            return ReceiverDep;
        }

        @objid ("3da53f3c-eca4-4abf-b79b-3c1f4e1d15f3")
        public static SmDependency MessageFlowDep() {
            if (MessageFlowDep == null) {
            	MessageFlowDep = classof().getDependencyDef("MessageFlow");
            }
            return MessageFlowDep;
        }

        @objid ("a30d590f-ec9c-45c8-9a1c-08e5052921a2")
        public static SmDependency getInStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InStateDep;
        }

        @objid ("c2cb6a7e-a367-4cab-91a7-4966250bb348")
        public static SmDependency getEventDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDefinitionDep;
        }

        @objid ("d406cc2c-977e-4379-a035-1f6bfaf0a295")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("72d2d250-dc5d-4234-918b-5deab992e1dc")
        public static SmDependency getOutputMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputMessageDep;
        }

        @objid ("ce030d45-ce6a-4893-9315-5b278fde8dea")
        public static SmDependency getSenderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SenderDep;
        }

        @objid ("9fe56a86-5028-4683-b5f9-6ea7c7e042a5")
        public static SmDependency getReceiverDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiverDep;
        }

        @objid ("8cb01fc7-8e0f-4a9a-b5f1-5303e404a2ac")
        public static SmDependency getItemRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemRefDep;
        }

        @objid ("e7d0cd64-4552-4cb7-a7f5-4101a631127b")
        public static SmDependency getInputMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputMessageDep;
        }

        @objid ("59e80803-b8b4-483a-bcca-d52e5aaf15dc")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("915bb735-17a0-4065-b05b-55d141c5be09")
        public static SmDependency getMessageFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageFlowDep;
        }

        @objid ("001e8de0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7e3d6fe4-9b4a-4484-894f-3a6d9a65fefa")
            public ISmObjectData createData() {
                return new BpmnMessageData();
            }

            @objid ("395eda51-362c-425d-9730-5894287b5c96")
            public SmObjectImpl createImpl() {
                return new BpmnMessageImpl();
            }

        }

        @objid ("001ef140-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ItemRefSmDependency extends SmSingleDependency {
            @objid ("eb7476a2-573f-4eeb-a0be-8c667fd6dc75")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageData) data).mItemRef;
            }

            @objid ("385f8d41-68d9-46dd-8e84-706a84285a6e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageData) data).mItemRef = value;
            }

            @objid ("12b4d5d0-ff6d-4955-b000-94f820662825")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.TypedMessageDep();
            }

        }

        @objid ("001f659e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SenderSmDependency extends SmMultipleDependency {
            @objid ("a081c527-9313-4718-88e3-123df911a116")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mSender != null)? ((BpmnMessageData)data).mSender:SmMultipleDependency.EMPTY;
            }

            @objid ("e2b0ec2c-39cf-47a2-9b50-a62f2c6581a9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mSender = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mSender;
            }

            @objid ("1f5fe345-47f4-43ca-b43a-3387f014cace")
            @Override
            public SmDependency getSymetric() {
                return BpmnSendTaskData.Metadata.MessageRefDep();
            }

        }

        @objid ("001fd376-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceiverSmDependency extends SmMultipleDependency {
            @objid ("c6581c25-a718-491b-b102-eb76667c9314")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mReceiver != null)? ((BpmnMessageData)data).mReceiver:SmMultipleDependency.EMPTY;
            }

            @objid ("da1cd055-e393-4a46-acd5-0355e8a90419")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mReceiver = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mReceiver;
            }

            @objid ("1a260fe0-ad05-428e-9da7-4d4c3eeeca56")
            @Override
            public SmDependency getSymetric() {
                return BpmnReceiveTaskData.Metadata.MessageRefDep();
            }

        }

        @objid ("002038ca-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EventDefinitionSmDependency extends SmMultipleDependency {
            @objid ("2e4aa556-e199-426a-81ac-a525b5fb14ca")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mEventDefinition != null)? ((BpmnMessageData)data).mEventDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("65e875e4-5714-4d81-b5d9-3727fd6ddc2f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mEventDefinition = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mEventDefinition;
            }

            @objid ("93608db2-4477-4160-ade9-0fc8e78a8868")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageEventDefinitionData.Metadata.MessageRefDep();
            }

        }

        @objid ("00209d56-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MessageFlowSmDependency extends SmMultipleDependency {
            @objid ("0590b707-310d-4e62-8ab0-2b07d075dcc4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mMessageFlow != null)? ((BpmnMessageData)data).mMessageFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("71b4cc21-16ee-4d56-9e60-980190fdff9a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mMessageFlow = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mMessageFlow;
            }

            @objid ("524ff4f7-0030-42bf-9e3a-3041a1bd7ece")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.MessageRefDep();
            }

        }

        @objid ("0021089a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InputMessageSmDependency extends SmMultipleDependency {
            @objid ("ec8bc46d-9709-42d9-9d4f-f99f40f03f85")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mInputMessage != null)? ((BpmnMessageData)data).mInputMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("ba2034e4-bbad-4889-a96c-8e390d5a675c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mInputMessage = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mInputMessage;
            }

            @objid ("86071bd9-0eed-46c1-b4cc-f92b994440e8")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.InMessageRefDep();
            }

        }

        @objid ("00216f1a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutputMessageSmDependency extends SmMultipleDependency {
            @objid ("03d7624d-36bd-4ec3-bb57-d03b11c41030")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mOutputMessage != null)? ((BpmnMessageData)data).mOutputMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("46e316fe-c6b3-4959-8903-f27ae3375724")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mOutputMessage = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mOutputMessage;
            }

            @objid ("944e5009-b39c-49ba-9df3-22a71f94110d")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.OutMessageRefDep();
            }

        }

        @objid ("0021d52c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("49eea25f-9533-4d38-b751-bc8cfd50c210")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageData) data).mType;
            }

            @objid ("1824a6e0-0f27-499a-b35b-5359e66692b3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageData) data).mType = value;
            }

            @objid ("6b0463ca-4bf6-4ecf-aafa-a42782dff95c")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnMessageRefsDep();
            }

        }

        @objid ("00225056-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InStateSmDependency extends SmSingleDependency {
            @objid ("3debf6e3-4836-46f5-a89d-4d71a138639d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageData) data).mInState;
            }

            @objid ("702f1490-d8db-444f-b144-b99d5004fdc7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageData) data).mInState = value;
            }

            @objid ("4917f3e5-b254-46a4-90d5-62dde16052d5")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.RequiredStateOfBpmnMessageDep();
            }

        }

    }

}
