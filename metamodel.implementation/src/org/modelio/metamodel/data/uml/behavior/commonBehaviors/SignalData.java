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
package org.modelio.metamodel.data.uml.behavior.commonBehaviors;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.AcceptSignalActionData;
import org.modelio.metamodel.data.uml.behavior.activityModel.SendSignalActionData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.EventData;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationMessageData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.MessageData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.TransitionData;
import org.modelio.metamodel.data.uml.informationFlow.DataFlowData;
import org.modelio.metamodel.data.uml.statik.GeneralClassData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.SignalImpl;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
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

@objid ("0042606c-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Signal.class, factory=SignalData.Metadata.ObjectFactory.class, cmsnode=true)
public class SignalData extends GeneralClassData {
    @objid ("3d64e355-4897-45e0-b4b8-4418a8081310")
    @SmaMetaAttribute(metaName="IsEvent", type=Boolean.class, smAttributeClass=Metadata.IsEventSmAttribute.class)
     Object mIsEvent = false;

    @objid ("85580a8e-00b2-48e5-beaf-97e13dfd2f11")
    @SmaMetaAttribute(metaName="IsException", type=Boolean.class, smAttributeClass=Metadata.IsExceptionSmAttribute.class)
     Object mIsException = false;

    @objid ("fc74cf63-3e34-4d5d-8f61-12c554e6611b")
    @SmaMetaAssociation(metaName="Sender", typeDataClass=SendSignalActionData.class, min=0, max=-1, smAssociationClass=Metadata.SenderSmDependency.class)
     List<SmObjectImpl> mSender = null;

    @objid ("04b179ac-ca26-4de1-8b05-56a4a6c29ba0")
    @SmaMetaAssociation(metaName="Usage", typeDataClass=MessageData.class, min=0, max=-1, smAssociationClass=Metadata.UsageSmDependency.class)
     List<SmObjectImpl> mUsage = null;

    @objid ("599986cf-2a31-4139-a807-82dd6b23bf50")
    @SmaMetaAssociation(metaName="Sends", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.SendsSmDependency.class)
     List<SmObjectImpl> mSends = null;

    @objid ("6931639e-1782-4328-b02d-924a2449f88a")
    @SmaMetaAssociation(metaName="PBase", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.PBaseSmDependency.class, partof = true)
     SmObjectImpl mPBase;

    @objid ("06cac175-7910-4944-aa38-e2ed9e1a3b9b")
    @SmaMetaAssociation(metaName="OBase", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.OBaseSmDependency.class, partof = true)
     SmObjectImpl mOBase;

    @objid ("fa2d4c73-1fe3-438c-9b3a-13f1d4e552f0")
    @SmaMetaAssociation(metaName="CommunicationUsage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.CommunicationUsageSmDependency.class)
     List<SmObjectImpl> mCommunicationUsage = null;

    @objid ("aed2e037-60a9-4bd9-ae81-c75bade82a5a")
    @SmaMetaAssociation(metaName="DOccurence", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.DOccurenceSmDependency.class)
     List<SmObjectImpl> mDOccurence = null;

    @objid ("2307f7c5-af37-4286-b646-18ca0bfc8361")
    @SmaMetaAssociation(metaName="EOccurence", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.EOccurenceSmDependency.class)
     List<SmObjectImpl> mEOccurence = null;

    @objid ("e9a5bd9f-d258-430d-9559-06c0d53fed07")
    @SmaMetaAssociation(metaName="Base", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.BaseSmDependency.class, partof = true)
     SmObjectImpl mBase;

    @objid ("eafcf350-aee5-4b25-a0a8-0be3c725c48c")
    @SmaMetaAssociation(metaName="Receiver", typeDataClass=AcceptSignalActionData.class, min=0, max=-1, smAssociationClass=Metadata.ReceiverSmDependency.class)
     List<SmObjectImpl> mReceiver = null;

    @objid ("05ec5b71-f96b-4236-9968-dd8dc3773423")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006db992-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2fb479d8-9b30-4577-9385-38c589f50171")
        private static SmClass smClass = null;

        @objid ("99ba36a8-0076-4117-9980-b60049afb0e3")
        private static SmAttribute IsEventAtt = null;

        @objid ("cdb2d4c2-74ad-4016-aba0-bad44520f86a")
        private static SmAttribute IsExceptionAtt = null;

        @objid ("d2e1508f-ff56-408b-9352-6707d6f30316")
        private static SmDependency SenderDep = null;

        @objid ("b67d73a4-07c8-4d81-9ea1-8c8c5ca0bd08")
        private static SmDependency UsageDep = null;

        @objid ("9cafda44-f17e-4aa3-a196-d0eb4342cbec")
        private static SmDependency SendsDep = null;

        @objid ("e1ce04a5-5dbd-422a-9280-8da67d59e858")
        private static SmDependency PBaseDep = null;

        @objid ("6f110dcc-ede9-417c-8952-003d5006f6d8")
        private static SmDependency OBaseDep = null;

        @objid ("9e484804-47be-4e5e-8b60-2ec617f14d92")
        private static SmDependency CommunicationUsageDep = null;

        @objid ("c506c218-b9d0-45eb-9263-318c0b8315e7")
        private static SmDependency DOccurenceDep = null;

        @objid ("6b71b5a6-2729-4427-9553-33f2766f439f")
        private static SmDependency EOccurenceDep = null;

        @objid ("9adda56a-7161-4718-8a35-52d3a2df6271")
        private static SmDependency BaseDep = null;

        @objid ("774397fe-db62-4dc2-97df-99d710c5cfdf")
        private static SmDependency ReceiverDep = null;

        @objid ("03b46e50-a1f2-4e92-8753-a3b58681b4b2")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SignalData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d402c2e6-e614-4fd9-a8f4-719afeef2ff1")
        public static SmAttribute IsEventAtt() {
            if (IsEventAtt == null) {
            	IsEventAtt = classof().getAttributeDef("IsEvent");
            }
            return IsEventAtt;
        }

        @objid ("70a67905-fb06-4030-a675-4aaaaa505458")
        public static SmAttribute IsExceptionAtt() {
            if (IsExceptionAtt == null) {
            	IsExceptionAtt = classof().getAttributeDef("IsException");
            }
            return IsExceptionAtt;
        }

        @objid ("4b56f949-f28a-454c-87e9-5d30e15790b2")
        public static SmDependency SenderDep() {
            if (SenderDep == null) {
            	SenderDep = classof().getDependencyDef("Sender");
            }
            return SenderDep;
        }

        @objid ("9c619753-af39-4158-911c-a8e7989a0de7")
        public static SmDependency UsageDep() {
            if (UsageDep == null) {
            	UsageDep = classof().getDependencyDef("Usage");
            }
            return UsageDep;
        }

        @objid ("2790646c-3816-4a5b-8b11-5e21264365a3")
        public static SmDependency SendsDep() {
            if (SendsDep == null) {
            	SendsDep = classof().getDependencyDef("Sends");
            }
            return SendsDep;
        }

        @objid ("13ad05de-19d9-4c21-bd5a-463d8cbde48e")
        public static SmDependency PBaseDep() {
            if (PBaseDep == null) {
            	PBaseDep = classof().getDependencyDef("PBase");
            }
            return PBaseDep;
        }

        @objid ("90c69b30-761e-43e5-94fd-df688ecc88f9")
        public static SmDependency OBaseDep() {
            if (OBaseDep == null) {
            	OBaseDep = classof().getDependencyDef("OBase");
            }
            return OBaseDep;
        }

        @objid ("885ea640-44d6-4a08-beed-514be9ae8ac2")
        public static SmDependency CommunicationUsageDep() {
            if (CommunicationUsageDep == null) {
            	CommunicationUsageDep = classof().getDependencyDef("CommunicationUsage");
            }
            return CommunicationUsageDep;
        }

        @objid ("878caf6e-4d93-4a60-83b8-062c2203eb8e")
        public static SmDependency DOccurenceDep() {
            if (DOccurenceDep == null) {
            	DOccurenceDep = classof().getDependencyDef("DOccurence");
            }
            return DOccurenceDep;
        }

        @objid ("95206c80-afa9-404e-ad9a-a0b842e5cdef")
        public static SmDependency EOccurenceDep() {
            if (EOccurenceDep == null) {
            	EOccurenceDep = classof().getDependencyDef("EOccurence");
            }
            return EOccurenceDep;
        }

        @objid ("5896ac74-3de8-4a21-a1de-8e430f9fd928")
        public static SmDependency BaseDep() {
            if (BaseDep == null) {
            	BaseDep = classof().getDependencyDef("Base");
            }
            return BaseDep;
        }

        @objid ("f372a52f-7ae5-4951-af87-3ab02864ec26")
        public static SmDependency ReceiverDep() {
            if (ReceiverDep == null) {
            	ReceiverDep = classof().getDependencyDef("Receiver");
            }
            return ReceiverDep;
        }

        @objid ("63cd0b7c-4963-4e73-8d22-c97209ee2f52")
        public static SmDependency getDOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DOccurenceDep;
        }

        @objid ("9030a42e-a729-472a-9e9a-937687cca05c")
        public static SmDependency getCommunicationUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CommunicationUsageDep;
        }

        @objid ("dec0ecbb-aff4-4507-90b9-e98cac02df81")
        public static SmDependency getSenderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SenderDep;
        }

        @objid ("5f7dea6c-c932-4a5d-9893-87d4b1537ee5")
        public static SmDependency getEOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EOccurenceDep;
        }

        @objid ("652e12db-2cdf-4971-81a5-603f07d51f43")
        public static SmDependency getUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsageDep;
        }

        @objid ("dc4e8146-8098-49b2-b216-26187fcbcce4")
        public static SmDependency getReceiverDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiverDep;
        }

        @objid ("b6071f5e-1442-4318-8f40-e916858cf6e9")
        public static SmAttribute getIsExceptionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExceptionAtt;
        }

        @objid ("1d2cb26a-7609-4d5e-b92f-92fd128d853c")
        public static SmDependency getSendsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SendsDep;
        }

        @objid ("bfb70b31-0e08-4c31-a3cb-aa6fac981ecb")
        public static SmDependency getOBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OBaseDep;
        }

        @objid ("573eb702-f79e-416a-8f05-a59c6e51adbd")
        public static SmDependency getPBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PBaseDep;
        }

        @objid ("8430c698-0860-41f9-9163-72cc87168561")
        public static SmAttribute getIsEventAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsEventAtt;
        }

        @objid ("5a95a8bd-0a93-4012-bacb-c5513113db5f")
        public static SmDependency getBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseDep;
        }

        @objid ("15eb3806-6450-4e1e-b04b-fceacadcdbaf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("006dfbdc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f0659121-d767-4319-bf9e-05e2f29951c1")
            public ISmObjectData createData() {
                return new SignalData();
            }

            @objid ("adc5532d-be56-4c55-a5f3-382257f681ea")
            public SmObjectImpl createImpl() {
                return new SignalImpl();
            }

        }

        @objid ("006e5dc0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsEventSmAttribute extends SmAttribute {
            @objid ("2ddb2cf9-7b70-46f4-a43f-9d0c6f1e7d98")
            public Object getValue(ISmObjectData data) {
                return ((SignalData) data).mIsEvent;
            }

            @objid ("812eab62-bfb8-4bb6-bc38-cad09ff0ce94")
            public void setValue(ISmObjectData data, Object value) {
                ((SignalData) data).mIsEvent = value;
            }

        }

        @objid ("006ec0a8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsExceptionSmAttribute extends SmAttribute {
            @objid ("95fd073e-3992-44fb-84fb-692d790602c3")
            public Object getValue(ISmObjectData data) {
                return ((SignalData) data).mIsException;
            }

            @objid ("32888bac-8b50-4a3c-bdc9-ed16b89a1f01")
            public void setValue(ISmObjectData data, Object value) {
                ((SignalData) data).mIsException = value;
            }

        }

        @objid ("006f26ba-c4c2-1fd8-97fe-001ec947cd2a")
        public static class EOccurenceSmDependency extends SmMultipleDependency {
            @objid ("5e263b2f-cd52-4617-838f-2589ba17f3e3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mEOccurence != null)? ((SignalData)data).mEOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("fb934683-610c-4b93-aad9-c44a6c13c792")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mEOccurence = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mEOccurence;
            }

            @objid ("fb91f4e7-5e65-459e-9363-bb613263fb90")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.ModelDep();
            }

        }

        @objid ("006f8b00-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SendsSmDependency extends SmMultipleDependency {
            @objid ("2389190c-3f33-4e18-b182-815b78436dbe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mSends != null)? ((SignalData)data).mSends:SmMultipleDependency.EMPTY;
            }

            @objid ("4e5ffe59-156f-4f3b-a2d1-50be78966167")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mSends = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mSends;
            }

            @objid ("1ca75536-ad43-48d5-a74f-09065df90030")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.EffectsDep();
            }

        }

        @objid ("006fefd2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class PBaseSmDependency extends SmSingleDependency {
            @objid ("f257ed47-ed6d-4136-9a85-17a00ee40fa4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SignalData) data).mPBase;
            }

            @objid ("00c7985f-d7bb-48c7-a74d-22dfee12b053")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SignalData) data).mPBase = value;
            }

            @objid ("0359e9cf-07b5-4bd7-af1b-aee2f5e79c75")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.SRepresentationDep();
            }

        }

        @objid ("00706714-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OBaseSmDependency extends SmSingleDependency {
            @objid ("82e8ed75-9dcd-4226-8f04-8173d28d164f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SignalData) data).mOBase;
            }

            @objid ("e79adf6e-e29e-4c12-abd3-88a3a5110b86")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SignalData) data).mOBase = value;
            }

            @objid ("661973f9-1d71-4071-a4d8-8999c55e7a86")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.SRepresentationDep();
            }

        }

        @objid ("0070de1a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class BaseSmDependency extends SmSingleDependency {
            @objid ("6d19f043-425f-4842-bb85-72aa19cb5f2a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SignalData) data).mBase;
            }

            @objid ("df36c5d8-4e83-4807-bc92-9aaebbac5365")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SignalData) data).mBase = value;
            }

            @objid ("51858dd7-f355-4d6f-b6f0-862fe38d93e3")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.SRepresentationDep();
            }

        }

        @objid ("007156a6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DOccurenceSmDependency extends SmMultipleDependency {
            @objid ("6378f58c-0a86-4232-8b29-bd47bc5862e7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mDOccurence != null)? ((SignalData)data).mDOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("e72a2e59-a357-44ff-861b-f34e884998e4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mDOccurence = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mDOccurence;
            }

            @objid ("1738e2ea-87b0-472b-bd76-0228788ecf3c")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.SModelDep();
            }

        }

        @objid ("00723652-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SenderSmDependency extends SmMultipleDependency {
            @objid ("d90b385d-0319-4166-8dae-90d90b741943")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mSender != null)? ((SignalData)data).mSender:SmMultipleDependency.EMPTY;
            }

            @objid ("1293b94a-d8b4-49e2-bc91-7ef61342be05")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mSender = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mSender;
            }

            @objid ("0503080f-084e-437d-aff7-4cd1be1e0a93")
            @Override
            public SmDependency getSymetric() {
                return SendSignalActionData.Metadata.SentDep();
            }

        }

        @objid ("00729e58-c4c2-1fd8-97fe-001ec947cd2a")
        public static class UsageSmDependency extends SmMultipleDependency {
            @objid ("2714693f-34c3-4f13-ab9a-262707b60bbc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mUsage != null)? ((SignalData)data).mUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("04ad565f-1935-4a52-a091-b6f39dc80afb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mUsage = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mUsage;
            }

            @objid ("e8ced6af-c229-41cd-9df3-7190c56d1b87")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.SignalSignatureDep();
            }

        }

        @objid ("007307e4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ReceiverSmDependency extends SmMultipleDependency {
            @objid ("094d5acc-cb0a-4672-ab51-2269c98cc73d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mReceiver != null)? ((SignalData)data).mReceiver:SmMultipleDependency.EMPTY;
            }

            @objid ("7aa0a193-0acf-47c2-a086-2cb1fdcbf9df")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mReceiver = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mReceiver;
            }

            @objid ("577f6d8e-1fab-47e3-b6e1-3a58cd787f99")
            @Override
            public SmDependency getSymetric() {
                return AcceptSignalActionData.Metadata.AcceptedDep();
            }

        }

        @objid ("00737198-c4c2-1fd8-97fe-001ec947cd2a")
        public static class CommunicationUsageSmDependency extends SmMultipleDependency {
            @objid ("dfdcf399-e1ec-465b-bff1-1f56bdcdb632")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mCommunicationUsage != null)? ((SignalData)data).mCommunicationUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("42b47b56-2770-46a6-9ba7-fa1e10a49702")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mCommunicationUsage = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mCommunicationUsage;
            }

            @objid ("50ef1ed1-9d94-458c-bcf1-39082c37f3d2")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.SignalSignatureDep();
            }

        }

    }

}
