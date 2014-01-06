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
    @objid ("2c88d5e6-6f79-4114-982b-cd21a46594fd")
    @SmaMetaAttribute(metaName="IsEvent", type=Boolean.class, smAttributeClass=Metadata.IsEventSmAttribute.class)
     Object mIsEvent = false;

    @objid ("8f5f1702-3b42-4101-befd-a40898d34fc3")
    @SmaMetaAttribute(metaName="IsException", type=Boolean.class, smAttributeClass=Metadata.IsExceptionSmAttribute.class)
     Object mIsException = false;

    @objid ("3a8dc254-b51b-4f7d-9c4d-2479f5383602")
    @SmaMetaAssociation(metaName="Sender", typeDataClass=SendSignalActionData.class, min=0, max=-1, smAssociationClass=Metadata.SenderSmDependency.class)
     List<SmObjectImpl> mSender = null;

    @objid ("d28f457b-cae9-497b-8a64-7c295fc9a37d")
    @SmaMetaAssociation(metaName="Usage", typeDataClass=MessageData.class, min=0, max=-1, smAssociationClass=Metadata.UsageSmDependency.class)
     List<SmObjectImpl> mUsage = null;

    @objid ("cf4f27c6-9a61-49af-98b9-615935592a57")
    @SmaMetaAssociation(metaName="Sends", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.SendsSmDependency.class)
     List<SmObjectImpl> mSends = null;

    @objid ("53ae22b0-796e-415b-a331-4fc4ec4fa786")
    @SmaMetaAssociation(metaName="PBase", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.PBaseSmDependency.class, partof = true)
     SmObjectImpl mPBase;

    @objid ("57caa70c-553c-4a1b-9157-d40e198ef1e6")
    @SmaMetaAssociation(metaName="OBase", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.OBaseSmDependency.class, partof = true)
     SmObjectImpl mOBase;

    @objid ("f9656c70-016e-491b-a5e6-6a350d151dc6")
    @SmaMetaAssociation(metaName="CommunicationUsage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.CommunicationUsageSmDependency.class)
     List<SmObjectImpl> mCommunicationUsage = null;

    @objid ("7fa0173d-8674-4c2b-9542-81f6c053fdd1")
    @SmaMetaAssociation(metaName="DOccurence", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.DOccurenceSmDependency.class)
     List<SmObjectImpl> mDOccurence = null;

    @objid ("92f2ee23-49ab-4dca-b0ac-954039a8b15b")
    @SmaMetaAssociation(metaName="EOccurence", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.EOccurenceSmDependency.class)
     List<SmObjectImpl> mEOccurence = null;

    @objid ("a7bd5ece-cdf6-44d1-a019-2b093f90a21d")
    @SmaMetaAssociation(metaName="Base", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.BaseSmDependency.class, partof = true)
     SmObjectImpl mBase;

    @objid ("a097a439-9c47-40db-81a6-fc0ff485b8da")
    @SmaMetaAssociation(metaName="Receiver", typeDataClass=AcceptSignalActionData.class, min=0, max=-1, smAssociationClass=Metadata.ReceiverSmDependency.class)
     List<SmObjectImpl> mReceiver = null;

    @objid ("f487ba3e-5ee2-4b68-9719-beff31abe695")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006db992-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d4793b99-464e-4fa8-a7ef-dce63b9699ad")
        private static SmClass smClass = null;

        @objid ("38c13a3a-a756-4f20-a18a-81614b7f9d14")
        private static SmAttribute IsEventAtt = null;

        @objid ("7da75018-b260-4a3d-aee0-cc81b91cdc2a")
        private static SmAttribute IsExceptionAtt = null;

        @objid ("07e811e5-eba2-4496-890b-21b4fa6cb7a0")
        private static SmDependency SenderDep = null;

        @objid ("7ff170dd-896d-4546-a21e-54ad5275fb80")
        private static SmDependency UsageDep = null;

        @objid ("4e8f65ab-6403-4afd-b11b-11f53fb9402a")
        private static SmDependency SendsDep = null;

        @objid ("abfe6be2-71f2-4aba-9d04-397a0d03e7b3")
        private static SmDependency PBaseDep = null;

        @objid ("b49c2ebc-6360-4645-969d-4828a091a793")
        private static SmDependency OBaseDep = null;

        @objid ("f55dc2bc-cd1d-450f-b303-a2d4641f3c18")
        private static SmDependency CommunicationUsageDep = null;

        @objid ("46ab98eb-cef3-4a8c-900a-25591673540f")
        private static SmDependency DOccurenceDep = null;

        @objid ("e2a4db0e-83ce-45c5-8114-df90a7306f25")
        private static SmDependency EOccurenceDep = null;

        @objid ("a38be948-87d5-413d-bf9b-ae0160495534")
        private static SmDependency BaseDep = null;

        @objid ("86e7e5ac-3238-4ddd-837f-7c178b74ad22")
        private static SmDependency ReceiverDep = null;

        @objid ("17e893c5-a670-434a-a174-761532e08c22")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SignalData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7d393147-d74b-4b7a-bee5-6ba705384410")
        public static SmAttribute IsEventAtt() {
            if (IsEventAtt == null) {
            	IsEventAtt = classof().getAttributeDef("IsEvent");
            }
            return IsEventAtt;
        }

        @objid ("eccdd6a8-c06a-4ebf-bf60-12093651df2e")
        public static SmAttribute IsExceptionAtt() {
            if (IsExceptionAtt == null) {
            	IsExceptionAtt = classof().getAttributeDef("IsException");
            }
            return IsExceptionAtt;
        }

        @objid ("a5e74a7b-23b0-4838-91f8-ae4a05a3af49")
        public static SmDependency SenderDep() {
            if (SenderDep == null) {
            	SenderDep = classof().getDependencyDef("Sender");
            }
            return SenderDep;
        }

        @objid ("88d24e26-35ef-430e-87f0-7e66fd2033df")
        public static SmDependency UsageDep() {
            if (UsageDep == null) {
            	UsageDep = classof().getDependencyDef("Usage");
            }
            return UsageDep;
        }

        @objid ("6d849962-1699-494b-bb8b-d394715f7e99")
        public static SmDependency SendsDep() {
            if (SendsDep == null) {
            	SendsDep = classof().getDependencyDef("Sends");
            }
            return SendsDep;
        }

        @objid ("9aa87504-66a2-44fc-918d-866443b56110")
        public static SmDependency PBaseDep() {
            if (PBaseDep == null) {
            	PBaseDep = classof().getDependencyDef("PBase");
            }
            return PBaseDep;
        }

        @objid ("14a7eef3-f966-4371-8fdc-2688cae4f5d6")
        public static SmDependency OBaseDep() {
            if (OBaseDep == null) {
            	OBaseDep = classof().getDependencyDef("OBase");
            }
            return OBaseDep;
        }

        @objid ("f3280b1a-08fa-4c51-8830-0d2668f7f2eb")
        public static SmDependency CommunicationUsageDep() {
            if (CommunicationUsageDep == null) {
            	CommunicationUsageDep = classof().getDependencyDef("CommunicationUsage");
            }
            return CommunicationUsageDep;
        }

        @objid ("b21e4efd-b587-4478-9371-347cf84a16c1")
        public static SmDependency DOccurenceDep() {
            if (DOccurenceDep == null) {
            	DOccurenceDep = classof().getDependencyDef("DOccurence");
            }
            return DOccurenceDep;
        }

        @objid ("add3eb03-1008-48ff-8376-6d2b452819d7")
        public static SmDependency EOccurenceDep() {
            if (EOccurenceDep == null) {
            	EOccurenceDep = classof().getDependencyDef("EOccurence");
            }
            return EOccurenceDep;
        }

        @objid ("35f30769-62a8-49ed-91a2-a8e082a780fd")
        public static SmDependency BaseDep() {
            if (BaseDep == null) {
            	BaseDep = classof().getDependencyDef("Base");
            }
            return BaseDep;
        }

        @objid ("31fc899e-87eb-49b5-a590-f19e99ca7450")
        public static SmDependency ReceiverDep() {
            if (ReceiverDep == null) {
            	ReceiverDep = classof().getDependencyDef("Receiver");
            }
            return ReceiverDep;
        }

        @objid ("ddfd821c-f211-4ece-8af6-16ad7c830e20")
        public static SmDependency getSenderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SenderDep;
        }

        @objid ("3ce2be5d-029c-47e2-a4dd-529432a08795")
        public static SmDependency getReceiverDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiverDep;
        }

        @objid ("5f5eed69-c473-43ef-b9d9-564c2cde8bab")
        public static SmDependency getPBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PBaseDep;
        }

        @objid ("fcc1f5bc-b643-4be4-b8b4-7639cf599c2f")
        public static SmDependency getDOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DOccurenceDep;
        }

        @objid ("ad8a533f-5f3d-4ebc-a8e0-a3d312199eaf")
        public static SmDependency getCommunicationUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CommunicationUsageDep;
        }

        @objid ("edbd1f82-6924-4dd3-b66b-d4106221c9a3")
        public static SmDependency getEOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EOccurenceDep;
        }

        @objid ("599876b9-4ac7-41d0-b0e8-36d53cd212e6")
        public static SmDependency getOBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OBaseDep;
        }

        @objid ("8f2fd2ec-6147-4ba3-9811-baf1dfce7c68")
        public static SmAttribute getIsEventAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsEventAtt;
        }

        @objid ("5722983c-6b44-4201-94e9-827ecf3c3694")
        public static SmDependency getUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsageDep;
        }

        @objid ("ced4f414-7b88-4f5e-93fd-3059eaf7baea")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1850e674-e79b-4808-8fce-6959524bb5d9")
        public static SmDependency getBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseDep;
        }

        @objid ("9d16bd04-fe4d-476a-9450-08ab2e551374")
        public static SmDependency getSendsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SendsDep;
        }

        @objid ("30bd1040-6199-4689-b460-724cde199191")
        public static SmAttribute getIsExceptionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExceptionAtt;
        }

        @objid ("006dfbdc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("6729961e-6042-4b15-89ab-769dd19468b1")
            public ISmObjectData createData() {
                return new SignalData();
            }

            @objid ("6d1bc6ca-ea70-4676-9ad3-dbc1dae2c6f4")
            public SmObjectImpl createImpl() {
                return new SignalImpl();
            }

        }

        @objid ("006e5dc0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsEventSmAttribute extends SmAttribute {
            @objid ("8fbb3bb4-297a-48c9-9be8-9757613a0a8b")
            public Object getValue(ISmObjectData data) {
                return ((SignalData) data).mIsEvent;
            }

            @objid ("3d388e78-1cb0-489c-b7c8-41cd32dafea9")
            public void setValue(ISmObjectData data, Object value) {
                ((SignalData) data).mIsEvent = value;
            }

        }

        @objid ("006ec0a8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsExceptionSmAttribute extends SmAttribute {
            @objid ("1559dc23-bffe-484c-a294-22a0704620f4")
            public Object getValue(ISmObjectData data) {
                return ((SignalData) data).mIsException;
            }

            @objid ("7cf4bd80-5488-4eb8-afd9-e86590f6149e")
            public void setValue(ISmObjectData data, Object value) {
                ((SignalData) data).mIsException = value;
            }

        }

        @objid ("006f26ba-c4c2-1fd8-97fe-001ec947cd2a")
        public static class EOccurenceSmDependency extends SmMultipleDependency {
            @objid ("74becc22-11a3-4ce4-80ad-126cc9a6f99e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mEOccurence != null)? ((SignalData)data).mEOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("2406210c-a84a-4e3e-befa-a29c93e081b3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mEOccurence = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mEOccurence;
            }

            @objid ("52d6ac28-05fd-46cf-b446-ec9a0feba173")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.ModelDep();
            }

        }

        @objid ("006f8b00-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SendsSmDependency extends SmMultipleDependency {
            @objid ("faafa38c-513d-4d55-82cd-06ba6133f44f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mSends != null)? ((SignalData)data).mSends:SmMultipleDependency.EMPTY;
            }

            @objid ("d665754c-d58c-4f00-ab68-8878c0a3de1c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mSends = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mSends;
            }

            @objid ("12c9338f-abb7-473c-b0fc-e90e289e3b56")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.EffectsDep();
            }

        }

        @objid ("006fefd2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class PBaseSmDependency extends SmSingleDependency {
            @objid ("8ea7ae03-ac9f-4a3e-a38c-0452c6bb6ff6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SignalData) data).mPBase;
            }

            @objid ("f372a4b9-c2c5-4dce-a8b9-413b787f61c6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SignalData) data).mPBase = value;
            }

            @objid ("8eedcc01-50ff-48a2-a2b7-b6dfbd754f16")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.SRepresentationDep();
            }

        }

        @objid ("00706714-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OBaseSmDependency extends SmSingleDependency {
            @objid ("788dd029-c2da-4d0d-ad65-6e891aa225a1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SignalData) data).mOBase;
            }

            @objid ("4a2cae09-b6fc-4e42-ab91-b7899435e746")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SignalData) data).mOBase = value;
            }

            @objid ("99cd62a6-545f-4980-9acd-ebbbba8735bc")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.SRepresentationDep();
            }

        }

        @objid ("0070de1a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class BaseSmDependency extends SmSingleDependency {
            @objid ("d3660b50-708c-4fe6-a3e2-639372f5886c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SignalData) data).mBase;
            }

            @objid ("ea97b806-c53b-4aef-a146-d18163481a32")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SignalData) data).mBase = value;
            }

            @objid ("a2933f6d-630a-440d-868c-942e5587507c")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.SRepresentationDep();
            }

        }

        @objid ("007156a6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DOccurenceSmDependency extends SmMultipleDependency {
            @objid ("12679361-bd3d-4de4-bb6c-37a1264d49e8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mDOccurence != null)? ((SignalData)data).mDOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("2bdc0639-dab4-477f-8bfd-a084dc493494")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mDOccurence = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mDOccurence;
            }

            @objid ("10080836-42d9-408d-925d-7d7db18846a8")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.SModelDep();
            }

        }

        @objid ("00723652-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SenderSmDependency extends SmMultipleDependency {
            @objid ("440b7318-d5d3-420e-a7fc-84f3fb52f089")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mSender != null)? ((SignalData)data).mSender:SmMultipleDependency.EMPTY;
            }

            @objid ("cb3cae93-a195-4db5-addd-e59f110242c3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mSender = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mSender;
            }

            @objid ("4d2ac436-8864-44c1-b864-f36d10d588dd")
            @Override
            public SmDependency getSymetric() {
                return SendSignalActionData.Metadata.SentDep();
            }

        }

        @objid ("00729e58-c4c2-1fd8-97fe-001ec947cd2a")
        public static class UsageSmDependency extends SmMultipleDependency {
            @objid ("dd698269-2bf9-4b8b-843a-87741b193399")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mUsage != null)? ((SignalData)data).mUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("cdcca934-c3e6-429c-ae02-10b79eb2add2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mUsage = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mUsage;
            }

            @objid ("2fdf88dc-cfee-4e99-bf8a-47b2e12a9e03")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.SignalSignatureDep();
            }

        }

        @objid ("007307e4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ReceiverSmDependency extends SmMultipleDependency {
            @objid ("c5b7674f-a1e1-460d-bdf0-e32a87c85e2c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mReceiver != null)? ((SignalData)data).mReceiver:SmMultipleDependency.EMPTY;
            }

            @objid ("c92c4449-2dfe-47ae-85f7-a1810916d512")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mReceiver = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mReceiver;
            }

            @objid ("d43cb505-f41a-412b-84f9-189cf2ce8fd1")
            @Override
            public SmDependency getSymetric() {
                return AcceptSignalActionData.Metadata.AcceptedDep();
            }

        }

        @objid ("00737198-c4c2-1fd8-97fe-001ec947cd2a")
        public static class CommunicationUsageSmDependency extends SmMultipleDependency {
            @objid ("7442600e-31da-42e7-b1e4-b49fac3fcd39")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mCommunicationUsage != null)? ((SignalData)data).mCommunicationUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("1195c2a0-1a37-4bbe-953a-e69066da2144")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mCommunicationUsage = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mCommunicationUsage;
            }

            @objid ("9b6c5c1c-1957-443a-ae0c-8fe3502688ba")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.SignalSignatureDep();
            }

        }

    }

}
