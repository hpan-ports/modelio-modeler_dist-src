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
    @objid ("f98130b1-c90d-4e84-9011-3b202413f6bf")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("625d8ba2-d39d-44ef-ba84-9422501b7edf")
    @SmaMetaAssociation(metaName="OutputMessage", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.OutputMessageSmDependency.class)
     List<SmObjectImpl> mOutputMessage = null;

    @objid ("3eb78942-5e9a-4362-b995-3639bf5c9db4")
    @SmaMetaAssociation(metaName="ItemRef", typeDataClass=BpmnItemDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.ItemRefSmDependency.class, partof = true)
     SmObjectImpl mItemRef;

    @objid ("6c165055-0c6b-4af5-8436-56ea26c2b511")
    @SmaMetaAssociation(metaName="InState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.InStateSmDependency.class, partof = true)
     SmObjectImpl mInState;

    @objid ("326cb473-7249-4c98-ba82-7b4439399696")
    @SmaMetaAssociation(metaName="EventDefinition", typeDataClass=BpmnMessageEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.EventDefinitionSmDependency.class)
     List<SmObjectImpl> mEventDefinition = null;

    @objid ("07cfd297-8a5e-4fbf-879d-e4288a70d293")
    @SmaMetaAssociation(metaName="Sender", typeDataClass=BpmnSendTaskData.class, min=0, max=-1, smAssociationClass=Metadata.SenderSmDependency.class)
     List<SmObjectImpl> mSender = null;

    @objid ("6ac454b9-c835-42ab-a4a5-040b0e41733c")
    @SmaMetaAssociation(metaName="InputMessage", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.InputMessageSmDependency.class)
     List<SmObjectImpl> mInputMessage = null;

    @objid ("e561ace7-5ff3-4dee-ba3d-dd22decc5838")
    @SmaMetaAssociation(metaName="Receiver", typeDataClass=BpmnReceiveTaskData.class, min=0, max=-1, smAssociationClass=Metadata.ReceiverSmDependency.class)
     List<SmObjectImpl> mReceiver = null;

    @objid ("0c85cd0e-7cc6-4565-9078-9fa2a462b948")
    @SmaMetaAssociation(metaName="MessageFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.MessageFlowSmDependency.class)
     List<SmObjectImpl> mMessageFlow = null;

    @objid ("737c40a1-234b-48b1-a687-30eeac23fa9c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001e4ca4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9dbb048c-9032-40c2-95e6-90acc3c9d2d3")
        private static SmClass smClass = null;

        @objid ("4c2b3328-659d-4040-8740-046c3b12f26f")
        private static SmDependency TypeDep = null;

        @objid ("fc427142-115c-4c82-b82c-481d849ee3bd")
        private static SmDependency OutputMessageDep = null;

        @objid ("5af1d67a-a269-40fe-86ab-1cc6685760cf")
        private static SmDependency ItemRefDep = null;

        @objid ("557c0dd6-7dd9-4da9-8702-1ff740c6adaa")
        private static SmDependency InStateDep = null;

        @objid ("d36793b7-6b0f-4887-a067-15f55b1e3630")
        private static SmDependency EventDefinitionDep = null;

        @objid ("4b0e0184-f116-4dfc-9526-dd5dd09afe94")
        private static SmDependency SenderDep = null;

        @objid ("6363ba10-ecbc-4adf-b562-f222deffb56a")
        private static SmDependency InputMessageDep = null;

        @objid ("64352d34-1287-43a4-ae5a-ed46994ff445")
        private static SmDependency ReceiverDep = null;

        @objid ("652c8540-42ab-414e-ae9e-81df1cedf1d9")
        private static SmDependency MessageFlowDep = null;

        @objid ("e4b252eb-4e3f-4858-bae4-bbdb42879433")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMessageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("042fae1d-3319-4e96-bdf6-e88d17b1d59f")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("0cbead7a-871f-4e8d-a4b1-f57ad57ddafa")
        public static SmDependency OutputMessageDep() {
            if (OutputMessageDep == null) {
            	OutputMessageDep = classof().getDependencyDef("OutputMessage");
            }
            return OutputMessageDep;
        }

        @objid ("4ef3648f-12aa-49dd-bb47-18cc01e2cfba")
        public static SmDependency ItemRefDep() {
            if (ItemRefDep == null) {
            	ItemRefDep = classof().getDependencyDef("ItemRef");
            }
            return ItemRefDep;
        }

        @objid ("80fb87b8-ecd9-48a3-857a-924ad025e1c3")
        public static SmDependency InStateDep() {
            if (InStateDep == null) {
            	InStateDep = classof().getDependencyDef("InState");
            }
            return InStateDep;
        }

        @objid ("2a333c8d-666e-4e4c-b78c-5476f42fdb78")
        public static SmDependency EventDefinitionDep() {
            if (EventDefinitionDep == null) {
            	EventDefinitionDep = classof().getDependencyDef("EventDefinition");
            }
            return EventDefinitionDep;
        }

        @objid ("4c042f33-eab1-4d99-bd7d-38cc58cb1ecf")
        public static SmDependency SenderDep() {
            if (SenderDep == null) {
            	SenderDep = classof().getDependencyDef("Sender");
            }
            return SenderDep;
        }

        @objid ("b7ce22b1-23e7-4571-8997-c945275fb782")
        public static SmDependency InputMessageDep() {
            if (InputMessageDep == null) {
            	InputMessageDep = classof().getDependencyDef("InputMessage");
            }
            return InputMessageDep;
        }

        @objid ("c5c196dc-532f-4974-a053-2acbd2c5fce2")
        public static SmDependency ReceiverDep() {
            if (ReceiverDep == null) {
            	ReceiverDep = classof().getDependencyDef("Receiver");
            }
            return ReceiverDep;
        }

        @objid ("8c6be733-8f94-49eb-a4a5-e969f8408f83")
        public static SmDependency MessageFlowDep() {
            if (MessageFlowDep == null) {
            	MessageFlowDep = classof().getDependencyDef("MessageFlow");
            }
            return MessageFlowDep;
        }

        @objid ("1c3c2c2f-0722-4d97-9039-1d99e3f00695")
        public static SmDependency getReceiverDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiverDep;
        }

        @objid ("d8284740-d89d-4792-a3e5-e8b16f242179")
        public static SmDependency getEventDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDefinitionDep;
        }

        @objid ("a8eb5459-667b-49b1-aaba-d70c3c4fb323")
        public static SmDependency getSenderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SenderDep;
        }

        @objid ("54f7b841-3f4a-44cb-b1b4-717bfa41087f")
        public static SmDependency getMessageFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageFlowDep;
        }

        @objid ("a83220fb-8915-420e-ae66-b7e92bab47d8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("63164e2f-da1b-4cf2-ae8b-3bfa9edf65a1")
        public static SmDependency getInputMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputMessageDep;
        }

        @objid ("f03b56f2-33ac-4e10-8911-2cca2680c7a8")
        public static SmDependency getItemRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemRefDep;
        }

        @objid ("b8fa2f43-83a5-4143-a7d1-d073f12456c2")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("957cc8e8-3b3a-4976-9294-880ddb28fb56")
        public static SmDependency getOutputMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputMessageDep;
        }

        @objid ("4e289ff5-1d64-4598-9da4-89a939f2ec4f")
        public static SmDependency getInStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InStateDep;
        }

        @objid ("001e8de0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0affec65-4940-434a-ba36-4dabf4a20c62")
            public ISmObjectData createData() {
                return new BpmnMessageData();
            }

            @objid ("4d7246a9-1644-4a12-9105-04348cf24431")
            public SmObjectImpl createImpl() {
                return new BpmnMessageImpl();
            }

        }

        @objid ("001ef140-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ItemRefSmDependency extends SmSingleDependency {
            @objid ("33ec3c44-82be-4254-a9c3-27a1e85dde8f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageData) data).mItemRef;
            }

            @objid ("9fbfa0e2-71e1-451a-8c0f-589daf78fc76")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageData) data).mItemRef = value;
            }

            @objid ("f3af9fe8-0f90-4fd2-b55a-78e9b4efe2f6")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.TypedMessageDep();
            }

        }

        @objid ("001f659e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SenderSmDependency extends SmMultipleDependency {
            @objid ("69c5ccde-9f6e-4761-b60e-68840b5405ad")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mSender != null)? ((BpmnMessageData)data).mSender:SmMultipleDependency.EMPTY;
            }

            @objid ("34ea4a64-2b4b-4805-a54e-3c5301424007")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mSender = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mSender;
            }

            @objid ("621d71d7-acee-45a3-a31f-de089e6a91df")
            @Override
            public SmDependency getSymetric() {
                return BpmnSendTaskData.Metadata.MessageRefDep();
            }

        }

        @objid ("001fd376-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceiverSmDependency extends SmMultipleDependency {
            @objid ("688cbce3-1bc3-4a15-9d94-164f848370b3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mReceiver != null)? ((BpmnMessageData)data).mReceiver:SmMultipleDependency.EMPTY;
            }

            @objid ("7f94480f-7bfe-4a4c-8a7d-2172809a3736")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mReceiver = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mReceiver;
            }

            @objid ("47436d32-f111-4f39-a137-b852e3e5da55")
            @Override
            public SmDependency getSymetric() {
                return BpmnReceiveTaskData.Metadata.MessageRefDep();
            }

        }

        @objid ("002038ca-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EventDefinitionSmDependency extends SmMultipleDependency {
            @objid ("e118188e-4be6-43da-822d-dd1d554a239a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mEventDefinition != null)? ((BpmnMessageData)data).mEventDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("2f138fb3-b83c-4fc5-9514-28da1a49abfd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mEventDefinition = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mEventDefinition;
            }

            @objid ("d51a74a0-5a17-453c-8a59-3090fb9ddbb5")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageEventDefinitionData.Metadata.MessageRefDep();
            }

        }

        @objid ("00209d56-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MessageFlowSmDependency extends SmMultipleDependency {
            @objid ("70652395-3543-42f5-96cd-054643c0f155")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mMessageFlow != null)? ((BpmnMessageData)data).mMessageFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("25d89a64-e225-4599-9486-ab8a64c31fcc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mMessageFlow = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mMessageFlow;
            }

            @objid ("632fa40f-6bdb-4d8a-8ca2-28e5c003065f")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.MessageRefDep();
            }

        }

        @objid ("0021089a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InputMessageSmDependency extends SmMultipleDependency {
            @objid ("a8ebfd92-5d76-4d0c-b890-88bbad44febd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mInputMessage != null)? ((BpmnMessageData)data).mInputMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("6d2743af-4628-4dcd-8982-562d56766855")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mInputMessage = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mInputMessage;
            }

            @objid ("bb11ecac-bcd9-4188-bdc8-cad59d030058")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.InMessageRefDep();
            }

        }

        @objid ("00216f1a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutputMessageSmDependency extends SmMultipleDependency {
            @objid ("159d7580-3c4c-4061-b1aa-a47ff26a6969")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mOutputMessage != null)? ((BpmnMessageData)data).mOutputMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("d33c7caf-e622-4248-bf88-de75d6bb6574")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mOutputMessage = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mOutputMessage;
            }

            @objid ("c62e6a00-15ee-409e-84ff-3eee787d9526")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.OutMessageRefDep();
            }

        }

        @objid ("0021d52c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("a4248e3c-b4c0-43c5-8499-76a9dffcab56")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageData) data).mType;
            }

            @objid ("fede3a49-f978-4bf4-8f4d-3301c81205e5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageData) data).mType = value;
            }

            @objid ("a566531f-c9e6-4c08-9ccc-d77f7c2ac545")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnMessageRefsDep();
            }

        }

        @objid ("00225056-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InStateSmDependency extends SmSingleDependency {
            @objid ("58902f4f-9763-47f9-a9c6-94874a0bc92b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageData) data).mInState;
            }

            @objid ("c724b636-6aad-4b05-b3df-2729212ef9be")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageData) data).mInState = value;
            }

            @objid ("18ab6c28-6302-4ca2-a6e1-0997d5de0ac9")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.RequiredStateOfBpmnMessageDep();
            }

        }

    }

}
