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
    @objid ("f133d827-2204-47c7-bc7c-f5d83bf3f306")
    @SmaMetaAssociation(metaName="Type", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.TypeSmDependency.class, partof = true)
     SmObjectImpl mType;

    @objid ("cde776f3-fea6-41bc-b71e-56e06cb2e78e")
    @SmaMetaAssociation(metaName="OutputMessage", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.OutputMessageSmDependency.class)
     List<SmObjectImpl> mOutputMessage = null;

    @objid ("45a42ff4-4755-4dbe-b3c0-fb6e11d9520e")
    @SmaMetaAssociation(metaName="ItemRef", typeDataClass=BpmnItemDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.ItemRefSmDependency.class, partof = true)
     SmObjectImpl mItemRef;

    @objid ("e089c8a6-1d19-474e-b7dd-3c0ca3c53ff7")
    @SmaMetaAssociation(metaName="InState", typeDataClass=StateData.class, min=0, max=1, smAssociationClass=Metadata.InStateSmDependency.class, partof = true)
     SmObjectImpl mInState;

    @objid ("9ef2afe1-b5a7-4ba1-a564-6b9e5ca31a52")
    @SmaMetaAssociation(metaName="EventDefinition", typeDataClass=BpmnMessageEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.EventDefinitionSmDependency.class)
     List<SmObjectImpl> mEventDefinition = null;

    @objid ("d806fc4d-6cfb-465f-9739-9ac536f121c3")
    @SmaMetaAssociation(metaName="Sender", typeDataClass=BpmnSendTaskData.class, min=0, max=-1, smAssociationClass=Metadata.SenderSmDependency.class)
     List<SmObjectImpl> mSender = null;

    @objid ("91435e34-34cd-492d-883f-ae59859aeadb")
    @SmaMetaAssociation(metaName="InputMessage", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.InputMessageSmDependency.class)
     List<SmObjectImpl> mInputMessage = null;

    @objid ("1bf8e7cf-12a0-495f-b672-f513a54e3213")
    @SmaMetaAssociation(metaName="Receiver", typeDataClass=BpmnReceiveTaskData.class, min=0, max=-1, smAssociationClass=Metadata.ReceiverSmDependency.class)
     List<SmObjectImpl> mReceiver = null;

    @objid ("5009ae2c-dca8-43b4-b6e7-03cf7a4d15da")
    @SmaMetaAssociation(metaName="MessageFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.MessageFlowSmDependency.class)
     List<SmObjectImpl> mMessageFlow = null;

    @objid ("66d742d0-4c22-442e-8b82-c2c4b17460cb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001e4ca4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c6fec278-4a90-4fce-acc6-337422c3900c")
        private static SmClass smClass = null;

        @objid ("d3a66167-5e51-48a7-bf54-16a13334cd38")
        private static SmDependency TypeDep = null;

        @objid ("c313d6a3-74ee-4f39-a1c3-046f1172c260")
        private static SmDependency OutputMessageDep = null;

        @objid ("6e60f46d-7125-475e-ab28-0e05dcc4d234")
        private static SmDependency ItemRefDep = null;

        @objid ("43eeffcd-00cb-4218-a85f-7e5dad70185c")
        private static SmDependency InStateDep = null;

        @objid ("03be96a7-56bd-422c-893b-69a1e9a37d70")
        private static SmDependency EventDefinitionDep = null;

        @objid ("a528ff5c-93bb-4cb3-ba87-21a8186b0df9")
        private static SmDependency SenderDep = null;

        @objid ("19938bdc-2a52-4d55-ae28-a63f673f6574")
        private static SmDependency InputMessageDep = null;

        @objid ("7dfff3d8-f5b5-4550-8d69-f646a74f2d25")
        private static SmDependency ReceiverDep = null;

        @objid ("be00f56e-884b-4999-8983-e02fbdfd5715")
        private static SmDependency MessageFlowDep = null;

        @objid ("4bf3afa4-3fcd-4010-bbb6-8d78e29a250a")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMessageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("736daea2-bb0f-4682-b6c0-ff83a0b5cbce")
        public static SmDependency TypeDep() {
            if (TypeDep == null) {
            	TypeDep = classof().getDependencyDef("Type");
            }
            return TypeDep;
        }

        @objid ("e6c1bfeb-9f8c-4bab-b0aa-01cfd98a8caa")
        public static SmDependency OutputMessageDep() {
            if (OutputMessageDep == null) {
            	OutputMessageDep = classof().getDependencyDef("OutputMessage");
            }
            return OutputMessageDep;
        }

        @objid ("6efc1e08-2b9d-4c66-a254-90c796598f5e")
        public static SmDependency ItemRefDep() {
            if (ItemRefDep == null) {
            	ItemRefDep = classof().getDependencyDef("ItemRef");
            }
            return ItemRefDep;
        }

        @objid ("c3b87413-95e3-42b5-ba17-650609cd5b78")
        public static SmDependency InStateDep() {
            if (InStateDep == null) {
            	InStateDep = classof().getDependencyDef("InState");
            }
            return InStateDep;
        }

        @objid ("2bc3f9fc-83b7-4d8f-85cb-bb9f33114520")
        public static SmDependency EventDefinitionDep() {
            if (EventDefinitionDep == null) {
            	EventDefinitionDep = classof().getDependencyDef("EventDefinition");
            }
            return EventDefinitionDep;
        }

        @objid ("27cd515d-59f1-4a45-940b-080e0d2a3c3f")
        public static SmDependency SenderDep() {
            if (SenderDep == null) {
            	SenderDep = classof().getDependencyDef("Sender");
            }
            return SenderDep;
        }

        @objid ("fac6bea7-164a-4f4c-a869-411a7e06ca7a")
        public static SmDependency InputMessageDep() {
            if (InputMessageDep == null) {
            	InputMessageDep = classof().getDependencyDef("InputMessage");
            }
            return InputMessageDep;
        }

        @objid ("31eb6861-ec59-4ef1-8f72-7ac9b0688fd7")
        public static SmDependency ReceiverDep() {
            if (ReceiverDep == null) {
            	ReceiverDep = classof().getDependencyDef("Receiver");
            }
            return ReceiverDep;
        }

        @objid ("bd3d4a85-63f0-401a-9fd4-954b89c01a73")
        public static SmDependency MessageFlowDep() {
            if (MessageFlowDep == null) {
            	MessageFlowDep = classof().getDependencyDef("MessageFlow");
            }
            return MessageFlowDep;
        }

        @objid ("4c10987e-b2d7-469a-b602-18b9795a7737")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("020594fd-1480-481f-ba20-e314e4c3606a")
        public static SmDependency getMessageFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageFlowDep;
        }

        @objid ("6f260ef0-55be-4b73-875c-0e069ce80c12")
        public static SmDependency getOutputMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputMessageDep;
        }

        @objid ("0350da51-829b-4ef6-b07a-30521ed8bed2")
        public static SmDependency getEventDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDefinitionDep;
        }

        @objid ("eab09c21-a910-4826-964f-17944a693b37")
        public static SmDependency getTypeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TypeDep;
        }

        @objid ("d2660662-b97e-4bbb-8601-e3f03844663c")
        public static SmDependency getItemRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ItemRefDep;
        }

        @objid ("3ea9b233-be34-4da6-bca4-2076ed35b8a9")
        public static SmDependency getInStateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InStateDep;
        }

        @objid ("6dc3c219-a8bb-4b0f-97a3-55058d544545")
        public static SmDependency getSenderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SenderDep;
        }

        @objid ("d5786309-2370-482f-af69-216d653e2092")
        public static SmDependency getInputMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputMessageDep;
        }

        @objid ("75779fce-dcfb-4ee7-a5db-33028d8bc9f9")
        public static SmDependency getReceiverDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiverDep;
        }

        @objid ("001e8de0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("063dbdf2-e8e9-4d73-b426-a0df091c36c4")
            public ISmObjectData createData() {
                return new BpmnMessageData();
            }

            @objid ("7e437189-aa8f-4f69-9bc4-f5244a120668")
            public SmObjectImpl createImpl() {
                return new BpmnMessageImpl();
            }

        }

        @objid ("001ef140-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ItemRefSmDependency extends SmSingleDependency {
            @objid ("136f2a42-ea4d-4f85-bdcf-7494ef8a189e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageData) data).mItemRef;
            }

            @objid ("5eb7a9a7-8641-492e-96a7-c6b6bb51140e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageData) data).mItemRef = value;
            }

            @objid ("71e627d2-9308-4c2b-ba86-37e7b3792a58")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemDefinitionData.Metadata.TypedMessageDep();
            }

        }

        @objid ("001f659e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SenderSmDependency extends SmMultipleDependency {
            @objid ("70c6d37e-ecec-480a-83fc-f90430c9789f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mSender != null)? ((BpmnMessageData)data).mSender:SmMultipleDependency.EMPTY;
            }

            @objid ("14431e6d-0693-47ab-b193-697f2120e4bd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mSender = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mSender;
            }

            @objid ("2799dd92-447c-4105-8bb8-a4c2b4189700")
            @Override
            public SmDependency getSymetric() {
                return BpmnSendTaskData.Metadata.MessageRefDep();
            }

        }

        @objid ("001fd376-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceiverSmDependency extends SmMultipleDependency {
            @objid ("bdf2261e-1acd-44bf-bfdd-9b97d2c5dcb6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mReceiver != null)? ((BpmnMessageData)data).mReceiver:SmMultipleDependency.EMPTY;
            }

            @objid ("cf6030c0-4d68-4143-8ee3-014e73c21577")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mReceiver = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mReceiver;
            }

            @objid ("ebc9084c-0d93-42ae-b921-a2a407585ad9")
            @Override
            public SmDependency getSymetric() {
                return BpmnReceiveTaskData.Metadata.MessageRefDep();
            }

        }

        @objid ("002038ca-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EventDefinitionSmDependency extends SmMultipleDependency {
            @objid ("b3f6576a-b5d8-4a27-bcf8-be9f09395e42")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mEventDefinition != null)? ((BpmnMessageData)data).mEventDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("cfdde7bf-d7c7-41c5-993a-0d5857bcc961")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mEventDefinition = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mEventDefinition;
            }

            @objid ("ecc438c4-87a4-4239-9446-b9d85ecfbf47")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageEventDefinitionData.Metadata.MessageRefDep();
            }

        }

        @objid ("00209d56-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MessageFlowSmDependency extends SmMultipleDependency {
            @objid ("fc75003f-88c5-46fa-a598-c763d23dc538")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mMessageFlow != null)? ((BpmnMessageData)data).mMessageFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("0601a324-74e0-4ee9-a128-fb89ac87a6ba")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mMessageFlow = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mMessageFlow;
            }

            @objid ("a94d5cba-2c9e-4303-a80b-1ffb2be3aded")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.MessageRefDep();
            }

        }

        @objid ("0021089a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InputMessageSmDependency extends SmMultipleDependency {
            @objid ("72db77d7-9515-4b8f-9a80-2866b99fb279")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mInputMessage != null)? ((BpmnMessageData)data).mInputMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("08755a09-fd21-44e8-91b2-e35bae4eb87c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mInputMessage = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mInputMessage;
            }

            @objid ("36310de6-327c-417c-88b9-5608b1e58a03")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.InMessageRefDep();
            }

        }

        @objid ("00216f1a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutputMessageSmDependency extends SmMultipleDependency {
            @objid ("94beb422-454f-4bd9-a40e-dc06363ec6f3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMessageData)data).mOutputMessage != null)? ((BpmnMessageData)data).mOutputMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("6d48c044-be14-41db-888b-603a29080da5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMessageData) data).mOutputMessage = new ArrayList<>(initialCapacity);
                return ((BpmnMessageData) data).mOutputMessage;
            }

            @objid ("30097c2e-580e-4fe1-a46b-8125e5cd8788")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.OutMessageRefDep();
            }

        }

        @objid ("0021d52c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TypeSmDependency extends SmSingleDependency {
            @objid ("fb954138-dee8-4ab5-b67d-e30a5292736c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageData) data).mType;
            }

            @objid ("bfb45475-010f-4994-b6db-d0f490aa0fee")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageData) data).mType = value;
            }

            @objid ("09bdfd94-614d-411f-ad1a-ac14be743c22")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.BpmnMessageRefsDep();
            }

        }

        @objid ("00225056-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InStateSmDependency extends SmSingleDependency {
            @objid ("5c7b1cbc-9940-4e35-b233-20be5532dcaa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageData) data).mInState;
            }

            @objid ("d859909a-22a8-4929-b244-64d392a0eebe")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageData) data).mInState = value;
            }

            @objid ("c521a2a3-28a0-4cee-a216-bcb603f0c7db")
            @Override
            public SmDependency getSymetric() {
                return StateData.Metadata.RequiredStateOfBpmnMessageDep();
            }

        }

    }

}
