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
package org.modelio.metamodel.data.bpmn.bpmnService;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.data.bpmn.activities.BpmnReceiveTaskData;
import org.modelio.metamodel.data.bpmn.activities.BpmnSendTaskData;
import org.modelio.metamodel.data.bpmn.activities.BpmnServiceTaskData;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnInterfaceData;
import org.modelio.metamodel.data.bpmn.events.BpmnMessageEventDefinitionData;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnOperationImpl;
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

@objid ("000daf70-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnOperation.class, factory=BpmnOperationData.Metadata.ObjectFactory.class)
public class BpmnOperationData extends BpmnBaseElementData {
    @objid ("bd4a2787-bfaf-41d7-a09a-7e3ec69dcab2")
    @SmaMetaAssociation(metaName="Sender", typeDataClass=BpmnSendTaskData.class, min=0, max=-1, smAssociationClass=Metadata.SenderSmDependency.class)
     List<SmObjectImpl> mSender = null;

    @objid ("aa0fd135-3a10-450d-95aa-7c712d24424b")
    @SmaMetaAssociation(metaName="InMessageRef", typeDataClass=BpmnMessageData.class, min=1, max=1, smAssociationClass=Metadata.InMessageRefSmDependency.class, partof = true)
     SmObjectImpl mInMessageRef;

    @objid ("1e30f1d6-2dde-46d9-b9c3-541a0eb959a6")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnServiceTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("533fbbad-a2ed-4731-b149-d012248cfe48")
    @SmaMetaAssociation(metaName="OutMessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.OutMessageRefSmDependency.class, partof = true)
     SmObjectImpl mOutMessageRef;

    @objid ("b2cf1647-7190-4283-b3f4-08a24b138930")
    @SmaMetaAssociation(metaName="EventDefinition", typeDataClass=BpmnMessageEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.EventDefinitionSmDependency.class)
     List<SmObjectImpl> mEventDefinition = null;

    @objid ("6a036f9f-8b4b-4060-a6eb-53f73b4cd602")
    @SmaMetaAssociation(metaName="ImplementationRef", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ImplementationRefSmDependency.class, partof = true)
     SmObjectImpl mImplementationRef;

    @objid ("9e5f0ddb-5321-4100-8537-6d9049ac1a91")
    @SmaMetaAssociation(metaName="BpmnInterfaceRef", typeDataClass=BpmnInterfaceData.class, min=1, max=1, smAssociationClass=Metadata.BpmnInterfaceRefSmDependency.class)
     SmObjectImpl mBpmnInterfaceRef;

    @objid ("a9415a48-4556-4e2e-9f15-6baafdcbbe78")
    @SmaMetaAssociation(metaName="Receiver", typeDataClass=BpmnReceiveTaskData.class, min=0, max=-1, smAssociationClass=Metadata.ReceiverSmDependency.class)
     List<SmObjectImpl> mReceiver = null;

    @objid ("0587373a-fc9f-4e3b-919d-13e7e3ec42d4")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00831efe-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7a274e71-daa4-4f58-be25-25ae26ad91b5")
        private static SmClass smClass = null;

        @objid ("a60a7f6a-3379-4b7c-8600-cbdc190cf0e7")
        private static SmDependency SenderDep = null;

        @objid ("c8dda7de-5ed6-4bc3-be4a-f9fcc5e36eae")
        private static SmDependency InMessageRefDep = null;

        @objid ("0dae2b16-9a4a-4ef4-a517-f264a96f1d33")
        private static SmDependency CallerDep = null;

        @objid ("21b604d3-daa5-49ee-8aa0-0cb3e8d1c1f1")
        private static SmDependency OutMessageRefDep = null;

        @objid ("065e8425-41ab-4864-888a-927efb16ed8b")
        private static SmDependency EventDefinitionDep = null;

        @objid ("5115bf7a-fbb5-4902-85e2-e4908358e832")
        private static SmDependency ImplementationRefDep = null;

        @objid ("875d3a21-d956-47ce-bb55-f3fe92e95bf0")
        private static SmDependency BpmnInterfaceRefDep = null;

        @objid ("058244e3-8e88-44ae-b09a-27b6c6172435")
        private static SmDependency ReceiverDep = null;

        @objid ("6992fef3-2946-4c95-a4f5-b837fc7f841c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnOperationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("08b55068-d415-4ac1-b70a-7049c4f617a7")
        public static SmDependency SenderDep() {
            if (SenderDep == null) {
            	SenderDep = classof().getDependencyDef("Sender");
            }
            return SenderDep;
        }

        @objid ("8fe20276-71ad-4a20-b931-ed56c573b838")
        public static SmDependency InMessageRefDep() {
            if (InMessageRefDep == null) {
            	InMessageRefDep = classof().getDependencyDef("InMessageRef");
            }
            return InMessageRefDep;
        }

        @objid ("0cb43535-5013-4380-ad34-e91d9b18c449")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("c6d945ad-f74e-4040-a7a5-82bca46bc638")
        public static SmDependency OutMessageRefDep() {
            if (OutMessageRefDep == null) {
            	OutMessageRefDep = classof().getDependencyDef("OutMessageRef");
            }
            return OutMessageRefDep;
        }

        @objid ("7e9d9627-61b7-4f15-947a-3e2cf0b2f4e7")
        public static SmDependency EventDefinitionDep() {
            if (EventDefinitionDep == null) {
            	EventDefinitionDep = classof().getDependencyDef("EventDefinition");
            }
            return EventDefinitionDep;
        }

        @objid ("5f69f80e-1926-4b3b-a8bd-36b414b378dc")
        public static SmDependency ImplementationRefDep() {
            if (ImplementationRefDep == null) {
            	ImplementationRefDep = classof().getDependencyDef("ImplementationRef");
            }
            return ImplementationRefDep;
        }

        @objid ("a373ae91-cb34-4814-a43e-85a0a30e10e3")
        public static SmDependency BpmnInterfaceRefDep() {
            if (BpmnInterfaceRefDep == null) {
            	BpmnInterfaceRefDep = classof().getDependencyDef("BpmnInterfaceRef");
            }
            return BpmnInterfaceRefDep;
        }

        @objid ("ea718ccb-96ab-423e-af3d-11afabc41468")
        public static SmDependency ReceiverDep() {
            if (ReceiverDep == null) {
            	ReceiverDep = classof().getDependencyDef("Receiver");
            }
            return ReceiverDep;
        }

        @objid ("e9c9f473-8ca7-446f-b5c2-9b34c3d93541")
        public static SmDependency getBpmnInterfaceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnInterfaceRefDep;
        }

        @objid ("61e5a954-f08d-48d8-be07-ee35b2ab0a0e")
        public static SmDependency getOutMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutMessageRefDep;
        }

        @objid ("dd41ee53-890c-4289-ac1a-182c504b4c1a")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("593164cb-7ba4-42df-b2c4-d3b8446c15c4")
        public static SmDependency getSenderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SenderDep;
        }

        @objid ("68ef91ee-b9fd-48aa-ba45-2337a2ff0c51")
        public static SmDependency getImplementationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationRefDep;
        }

        @objid ("479c7ab7-02b0-4946-872c-10869f4cbfdd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("373b1350-c6c6-4a8b-b1e4-e5e0636569ec")
        public static SmDependency getReceiverDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiverDep;
        }

        @objid ("572fb4dd-4149-4608-a7cb-157a0682896d")
        public static SmDependency getEventDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDefinitionDep;
        }

        @objid ("93265271-0a37-4a31-bf17-c22a8300c52e")
        public static SmDependency getInMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InMessageRefDep;
        }

        @objid ("00837048-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("74350fb5-fc7f-4d9b-a5d2-7b3c9dcce62f")
            public ISmObjectData createData() {
                return new BpmnOperationData();
            }

            @objid ("0f420e99-44b6-4da8-be65-f61dd3ee9d07")
            public SmObjectImpl createImpl() {
                return new BpmnOperationImpl();
            }

        }

        @objid ("0083e3c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InMessageRefSmDependency extends SmSingleDependency {
            @objid ("2c240149-0e49-420a-ba2d-dc30ccfd01f8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mInMessageRef;
            }

            @objid ("8b24dd97-74d2-47ab-82d0-022792a47315")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mInMessageRef = value;
            }

            @objid ("9972998b-529a-4d32-a0a6-c7459625339e")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.InputMessageDep();
            }

        }

        @objid ("0084d53c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OutMessageRefSmDependency extends SmSingleDependency {
            @objid ("56011cf1-7132-4440-a59c-c058f76eca1f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mOutMessageRef;
            }

            @objid ("23991839-6363-4533-80c2-9df535b1f50e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mOutMessageRef = value;
            }

            @objid ("17be7112-9dee-4197-ad0e-84d6b3abf35f")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.OutputMessageDep();
            }

        }

        @objid ("00856308-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImplementationRefSmDependency extends SmSingleDependency {
            @objid ("54f5b736-2124-4b8d-bd68-7cc6d6333b68")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mImplementationRef;
            }

            @objid ("4e9cea69-8242-4018-bafc-9c07d09979d9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mImplementationRef = value;
            }

            @objid ("5255a9b8-7e05-453a-a057-18c423709a85")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.BpmnOperationRefDep();
            }

        }

        @objid ("0085ecce-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReceiverSmDependency extends SmMultipleDependency {
            @objid ("ad9618c0-8b19-4dc1-bf75-db8d5e627d34")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mReceiver != null)? ((BpmnOperationData)data).mReceiver:SmMultipleDependency.EMPTY;
            }

            @objid ("5778c5bd-ed0e-4e80-af93-ed423f3d61ec")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mReceiver = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mReceiver;
            }

            @objid ("2294990d-fbe4-441c-80b5-c00e4f0a1c7c")
            @Override
            public SmDependency getSymetric() {
                return BpmnReceiveTaskData.Metadata.OperationRefDep();
            }

        }

        @objid ("00866474-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("2985b5cd-779b-4ef3-abb6-0763bd42b0b3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mCaller != null)? ((BpmnOperationData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("cae4ee36-f9ed-4e2c-b87a-0d341e3eb64f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mCaller;
            }

            @objid ("1c0c00c7-5b43-47cc-94ed-5ef680b65800")
            @Override
            public SmDependency getSymetric() {
                return BpmnServiceTaskData.Metadata.OperationRefDep();
            }

        }

        @objid ("0086dabc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BpmnInterfaceRefSmDependency extends SmSingleDependency {
            @objid ("732048b8-1e04-4f81-ac3f-c6e222b1e6aa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mBpmnInterfaceRef;
            }

            @objid ("e7b7dd9e-2d8c-4786-8c61-406d9eef60fa")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mBpmnInterfaceRef = value;
            }

            @objid ("3dc6998c-ccdd-402a-9643-ef9bf1bc9a5a")
            @Override
            public SmDependency getSymetric() {
                return BpmnInterfaceData.Metadata.OperationDep();
            }

        }

        @objid ("008769f0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EventDefinitionSmDependency extends SmMultipleDependency {
            @objid ("a3881dac-6624-40dc-a898-24c7731685a6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mEventDefinition != null)? ((BpmnOperationData)data).mEventDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("f99dfd9e-4da3-4097-84c2-f4a0f58edf4d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mEventDefinition = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mEventDefinition;
            }

            @objid ("93317a81-9e86-46b9-bb34-2f1312108b65")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageEventDefinitionData.Metadata.OperationRefDep();
            }

        }

        @objid ("008807ca-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SenderSmDependency extends SmMultipleDependency {
            @objid ("c69138ad-b4eb-4759-8d7f-1b2a74c140f3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mSender != null)? ((BpmnOperationData)data).mSender:SmMultipleDependency.EMPTY;
            }

            @objid ("2bf75251-c833-465b-8101-eac2bc342d18")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mSender = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mSender;
            }

            @objid ("698d1dd9-9efb-43c6-aa7e-5502970cf788")
            @Override
            public SmDependency getSymetric() {
                return BpmnSendTaskData.Metadata.OperationRefDep();
            }

        }

    }

}
