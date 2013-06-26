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
    @objid ("f4aa0449-cd28-44cb-b7e8-f1e7278b193b")
    @SmaMetaAssociation(metaName="Sender", typeDataClass=BpmnSendTaskData.class, min=0, max=-1, smAssociationClass=Metadata.SenderSmDependency.class)
     List<SmObjectImpl> mSender = null;

    @objid ("76126774-0654-4da5-ad7b-4c5e60a6cfa6")
    @SmaMetaAssociation(metaName="InMessageRef", typeDataClass=BpmnMessageData.class, min=1, max=1, smAssociationClass=Metadata.InMessageRefSmDependency.class, partof = true)
     SmObjectImpl mInMessageRef;

    @objid ("11aa323a-f9ea-4113-817b-47a6c608ef36")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnServiceTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("bf9714b3-062c-4699-b48a-a62ae100e72b")
    @SmaMetaAssociation(metaName="OutMessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.OutMessageRefSmDependency.class, partof = true)
     SmObjectImpl mOutMessageRef;

    @objid ("d3a427cd-f92a-4b60-9abb-47450602e627")
    @SmaMetaAssociation(metaName="EventDefinition", typeDataClass=BpmnMessageEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.EventDefinitionSmDependency.class)
     List<SmObjectImpl> mEventDefinition = null;

    @objid ("f799ceab-eb7e-4114-953a-655aa5a8d384")
    @SmaMetaAssociation(metaName="ImplementationRef", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ImplementationRefSmDependency.class, partof = true)
     SmObjectImpl mImplementationRef;

    @objid ("9535a359-a2ef-4946-b327-10aefccdb71a")
    @SmaMetaAssociation(metaName="BpmnInterfaceRef", typeDataClass=BpmnInterfaceData.class, min=1, max=1, smAssociationClass=Metadata.BpmnInterfaceRefSmDependency.class)
     SmObjectImpl mBpmnInterfaceRef;

    @objid ("fbb71f77-ba7f-44f2-abbc-fc957f9372a6")
    @SmaMetaAssociation(metaName="Receiver", typeDataClass=BpmnReceiveTaskData.class, min=0, max=-1, smAssociationClass=Metadata.ReceiverSmDependency.class)
     List<SmObjectImpl> mReceiver = null;

    @objid ("3f78ee89-7106-4938-b4fe-2f7728470ccb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00831efe-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d04edfc4-7b20-4e63-8761-78d492a936b0")
        private static SmClass smClass = null;

        @objid ("ddd844d1-496b-4928-bdf1-f344bd8d6f7c")
        private static SmDependency SenderDep = null;

        @objid ("c171bf57-d50d-48bc-8995-c005c77f4b87")
        private static SmDependency InMessageRefDep = null;

        @objid ("0e92f746-a1fd-4a43-a7cf-1ccb866c67f2")
        private static SmDependency CallerDep = null;

        @objid ("e68527d9-f167-47fa-b318-975306e9d4da")
        private static SmDependency OutMessageRefDep = null;

        @objid ("dc18a2bc-50f4-40e4-b8df-5d0d92dd0c49")
        private static SmDependency EventDefinitionDep = null;

        @objid ("2990df51-7178-47b2-97d9-d3b14a6caf11")
        private static SmDependency ImplementationRefDep = null;

        @objid ("43a78c0b-a1ec-4024-9367-ceb05623e799")
        private static SmDependency BpmnInterfaceRefDep = null;

        @objid ("3074111c-b9f4-4afa-81c0-6a40c7a9c637")
        private static SmDependency ReceiverDep = null;

        @objid ("b2e2dbf0-efab-4a23-976a-81c0e75d9624")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnOperationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3e2f44fb-73ec-44ca-9afd-aa275d2b8212")
        public static SmDependency SenderDep() {
            if (SenderDep == null) {
            	SenderDep = classof().getDependencyDef("Sender");
            }
            return SenderDep;
        }

        @objid ("f3b8b9f6-63c4-42d9-b723-c9ce9db0fcf8")
        public static SmDependency InMessageRefDep() {
            if (InMessageRefDep == null) {
            	InMessageRefDep = classof().getDependencyDef("InMessageRef");
            }
            return InMessageRefDep;
        }

        @objid ("c13874db-6c38-4984-8a44-96d2ce0a462e")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("ef63b0bd-7310-4ab6-95c5-730ab3c9a5c9")
        public static SmDependency OutMessageRefDep() {
            if (OutMessageRefDep == null) {
            	OutMessageRefDep = classof().getDependencyDef("OutMessageRef");
            }
            return OutMessageRefDep;
        }

        @objid ("836160ae-492d-4d7f-9133-5e31d1e4e68a")
        public static SmDependency EventDefinitionDep() {
            if (EventDefinitionDep == null) {
            	EventDefinitionDep = classof().getDependencyDef("EventDefinition");
            }
            return EventDefinitionDep;
        }

        @objid ("6bb5e721-075b-4087-b9e7-ae54fa34fced")
        public static SmDependency ImplementationRefDep() {
            if (ImplementationRefDep == null) {
            	ImplementationRefDep = classof().getDependencyDef("ImplementationRef");
            }
            return ImplementationRefDep;
        }

        @objid ("14250c4e-a0f9-4461-8ded-8ae58900f95a")
        public static SmDependency BpmnInterfaceRefDep() {
            if (BpmnInterfaceRefDep == null) {
            	BpmnInterfaceRefDep = classof().getDependencyDef("BpmnInterfaceRef");
            }
            return BpmnInterfaceRefDep;
        }

        @objid ("c25adc5f-85b8-49fa-b192-7a77fa6fdc40")
        public static SmDependency ReceiverDep() {
            if (ReceiverDep == null) {
            	ReceiverDep = classof().getDependencyDef("Receiver");
            }
            return ReceiverDep;
        }

        @objid ("e6140e73-0d58-4eea-9084-3efff56e065a")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("f963a00e-f73b-4b6a-9b45-e5f7f6a82172")
        public static SmDependency getOutMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutMessageRefDep;
        }

        @objid ("e5b0295e-dc94-4b06-aeef-5bf1fe6fc6cf")
        public static SmDependency getReceiverDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiverDep;
        }

        @objid ("19eca4ad-016d-45b1-a527-74d442f2caa9")
        public static SmDependency getSenderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SenderDep;
        }

        @objid ("a45f5fd8-0bea-4a2c-8813-a38fd15133c1")
        public static SmDependency getEventDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDefinitionDep;
        }

        @objid ("76534eb5-04df-4f0e-a47c-9e12477e966e")
        public static SmDependency getImplementationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationRefDep;
        }

        @objid ("2cdb83a8-ae00-47c5-950c-441967f40d30")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("78514574-23d2-429b-8abc-8dc66b117cc8")
        public static SmDependency getInMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InMessageRefDep;
        }

        @objid ("56f2301f-8d39-4408-952d-e581e110df01")
        public static SmDependency getBpmnInterfaceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnInterfaceRefDep;
        }

        @objid ("00837048-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5af36181-1064-4538-a2ac-f1ff78f0f694")
            public ISmObjectData createData() {
                return new BpmnOperationData();
            }

            @objid ("6445ca06-4adf-4692-8302-f821d2b58013")
            public SmObjectImpl createImpl() {
                return new BpmnOperationImpl();
            }

        }

        @objid ("0083e3c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InMessageRefSmDependency extends SmSingleDependency {
            @objid ("c9e8c742-448a-4a19-a133-f304450e6ffa")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mInMessageRef;
            }

            @objid ("2ef508fc-eb58-419f-9216-aed1002db550")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mInMessageRef = value;
            }

            @objid ("ee0ffce5-5901-460c-8824-68bd6d8b6b70")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.InputMessageDep();
            }

        }

        @objid ("0084d53c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OutMessageRefSmDependency extends SmSingleDependency {
            @objid ("e9b21068-25cb-42ab-83de-57bfcb36b0b9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mOutMessageRef;
            }

            @objid ("6e7a4f53-bac8-41c6-b6e8-8316ad615728")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mOutMessageRef = value;
            }

            @objid ("39b0e0e2-2110-47c6-b59c-8b1f0c3d405d")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.OutputMessageDep();
            }

        }

        @objid ("00856308-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImplementationRefSmDependency extends SmSingleDependency {
            @objid ("a673cc1c-0b93-42f7-a9d0-a38823090313")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mImplementationRef;
            }

            @objid ("592f85b3-f2a5-4451-8469-630233488cd2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mImplementationRef = value;
            }

            @objid ("bc770299-456f-46cf-99fb-89f7fb5f6275")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.BpmnOperationRefDep();
            }

        }

        @objid ("0085ecce-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReceiverSmDependency extends SmMultipleDependency {
            @objid ("a4888ca5-4c9f-411e-9b5f-cf743046fdc5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mReceiver != null)? ((BpmnOperationData)data).mReceiver:SmMultipleDependency.EMPTY;
            }

            @objid ("c87afbad-b4c1-4faf-9531-74baa22865ff")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mReceiver = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mReceiver;
            }

            @objid ("65f9f7ae-983b-41ab-b2db-8b6655dfe137")
            @Override
            public SmDependency getSymetric() {
                return BpmnReceiveTaskData.Metadata.OperationRefDep();
            }

        }

        @objid ("00866474-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("282b8b12-96d2-4e05-b32b-40c2fcc60b46")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mCaller != null)? ((BpmnOperationData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("15755624-ea99-4385-8b4a-9c9935a26847")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mCaller;
            }

            @objid ("52418158-f5e7-4698-9dc4-60c72780bb29")
            @Override
            public SmDependency getSymetric() {
                return BpmnServiceTaskData.Metadata.OperationRefDep();
            }

        }

        @objid ("0086dabc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BpmnInterfaceRefSmDependency extends SmSingleDependency {
            @objid ("ac33276f-dfbf-4ee9-b7f9-8c7765714096")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mBpmnInterfaceRef;
            }

            @objid ("75c7d0f5-0fa1-4c4a-b933-b0a52ee92150")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mBpmnInterfaceRef = value;
            }

            @objid ("73bf6574-6793-4838-9f3b-4e709140e20b")
            @Override
            public SmDependency getSymetric() {
                return BpmnInterfaceData.Metadata.OperationDep();
            }

        }

        @objid ("008769f0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EventDefinitionSmDependency extends SmMultipleDependency {
            @objid ("270b7975-f1f3-4970-9778-90e35598a565")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mEventDefinition != null)? ((BpmnOperationData)data).mEventDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("884cf052-da22-4301-aace-5c137ad9dcf6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mEventDefinition = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mEventDefinition;
            }

            @objid ("cffa9515-28b9-400f-b90b-f7a323e734b2")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageEventDefinitionData.Metadata.OperationRefDep();
            }

        }

        @objid ("008807ca-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SenderSmDependency extends SmMultipleDependency {
            @objid ("ff51a8e4-5cf7-4de6-b7cc-c887338b0076")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mSender != null)? ((BpmnOperationData)data).mSender:SmMultipleDependency.EMPTY;
            }

            @objid ("db5bfe2b-33be-42e2-8667-e096415bc0db")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mSender = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mSender;
            }

            @objid ("db496007-687d-45b4-9f1a-cae452fdbb63")
            @Override
            public SmDependency getSymetric() {
                return BpmnSendTaskData.Metadata.OperationRefDep();
            }

        }

    }

}
