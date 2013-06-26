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
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
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
    @objid ("8f9070c8-9cf1-4532-aeb8-a4d88b59db58")
    @SmaMetaAttribute(metaName="IsEvent", type=Boolean.class, smAttributeClass=Metadata.IsEventSmAttribute.class)
     Object mIsEvent = false;

    @objid ("98754c2d-d5f5-4816-b977-602a2c20fd61")
    @SmaMetaAttribute(metaName="IsException", type=Boolean.class, smAttributeClass=Metadata.IsExceptionSmAttribute.class)
     Object mIsException = false;

    @objid ("f4ea9068-4ff8-44c0-9d71-5408d779b7a5")
    @SmaMetaAssociation(metaName="Sender", typeDataClass=SendSignalActionData.class, min=0, max=-1, smAssociationClass=Metadata.SenderSmDependency.class)
     List<SmObjectImpl> mSender = null;

    @objid ("938314fc-012f-4ea0-b111-5bb209f57555")
    @SmaMetaAssociation(metaName="Usage", typeDataClass=MessageData.class, min=0, max=-1, smAssociationClass=Metadata.UsageSmDependency.class)
     List<SmObjectImpl> mUsage = null;

    @objid ("550c2a3b-ac6f-49ed-95ac-74aae0bf189d")
    @SmaMetaAssociation(metaName="Sends", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.SendsSmDependency.class)
     List<SmObjectImpl> mSends = null;

    @objid ("e684a0c4-ba41-48e0-8e63-c5a8376ce52c")
    @SmaMetaAssociation(metaName="PBase", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.PBaseSmDependency.class, partof = true)
     SmObjectImpl mPBase;

    @objid ("b4a4ba33-c562-4b0c-b78c-4cb87d7409bb")
    @SmaMetaAssociation(metaName="BrowseBase", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.BrowseBaseSmDependency.class, partof = true)
     SmObjectImpl mBrowseBase;

    @objid ("9797057a-eb0a-4fc5-ad44-faf0e2d146e3")
    @SmaMetaAssociation(metaName="OBase", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.OBaseSmDependency.class, partof = true)
     SmObjectImpl mOBase;

    @objid ("19972f52-23b5-4eb8-962d-b416db1204b3")
    @SmaMetaAssociation(metaName="CommunicationUsage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.CommunicationUsageSmDependency.class)
     List<SmObjectImpl> mCommunicationUsage = null;

    @objid ("9bc17a59-d12a-436a-9eae-fb481b6106b6")
    @SmaMetaAssociation(metaName="DOccurence", typeDataClass=DataFlowData.class, min=0, max=-1, smAssociationClass=Metadata.DOccurenceSmDependency.class)
     List<SmObjectImpl> mDOccurence = null;

    @objid ("aee870a5-113b-425e-9a15-eea76679a191")
    @SmaMetaAssociation(metaName="EOccurence", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.EOccurenceSmDependency.class)
     List<SmObjectImpl> mEOccurence = null;

    @objid ("f1081772-f8b3-4c47-88ae-789b084531cd")
    @SmaMetaAssociation(metaName="Base", typeDataClass=GeneralClassData.class, min=0, max=1, smAssociationClass=Metadata.BaseSmDependency.class, partof = true)
     SmObjectImpl mBase;

    @objid ("e25ccb3c-71fc-41b5-8a90-b9d95e87dd00")
    @SmaMetaAssociation(metaName="Receiver", typeDataClass=AcceptSignalActionData.class, min=0, max=-1, smAssociationClass=Metadata.ReceiverSmDependency.class)
     List<SmObjectImpl> mReceiver = null;

    @objid ("0904ddc5-5da6-4c44-b1f7-c2fbe87f3ea1")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006db992-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("3eb0e539-d006-49ee-829e-82bec67bfe43")
        private static SmClass smClass = null;

        @objid ("84836a05-d659-490c-b823-235fcb5cddaf")
        private static SmAttribute IsEventAtt = null;

        @objid ("edf29d5f-0c33-4cca-a460-52e9f1d4bdb6")
        private static SmAttribute IsExceptionAtt = null;

        @objid ("7e5db96e-1661-4918-90c2-6403d66c9204")
        private static SmDependency SenderDep = null;

        @objid ("8272829b-603a-4ccd-84c3-b97829987a3e")
        private static SmDependency UsageDep = null;

        @objid ("95631cc1-4d67-47b4-8f7b-570b13cc2e03")
        private static SmDependency SendsDep = null;

        @objid ("273d7846-aba1-4c2e-b199-21a83cbc69ad")
        private static SmDependency PBaseDep = null;

        @objid ("d183c6cc-28a4-4005-9ffe-64c0919d7cff")
        private static SmDependency BrowseBaseDep = null;

        @objid ("ecabbc2b-6d6e-4db5-bee5-ee0da3e3e2c6")
        private static SmDependency OBaseDep = null;

        @objid ("2dddcbb4-1cf7-45de-b55a-97bd5f04a0cb")
        private static SmDependency CommunicationUsageDep = null;

        @objid ("f7e17f82-1d0a-44f4-a798-391565b1d630")
        private static SmDependency DOccurenceDep = null;

        @objid ("9595108d-9159-4aea-ad48-772354c0879d")
        private static SmDependency EOccurenceDep = null;

        @objid ("f417e162-99f4-498e-a798-581ce2e2a24e")
        private static SmDependency BaseDep = null;

        @objid ("a5040d49-9998-45b0-bbb6-686e9fc8a983")
        private static SmDependency ReceiverDep = null;

        @objid ("45558e00-b2c1-4677-a0c9-6ad96e5540a0")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(SignalData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ecfaf003-12a8-47f7-934d-72d1a6417698")
        public static SmAttribute IsEventAtt() {
            if (IsEventAtt == null) {
            	IsEventAtt = classof().getAttributeDef("IsEvent");
            }
            return IsEventAtt;
        }

        @objid ("a4451d0e-41d7-4b1e-8c33-06df5086a97a")
        public static SmAttribute IsExceptionAtt() {
            if (IsExceptionAtt == null) {
            	IsExceptionAtt = classof().getAttributeDef("IsException");
            }
            return IsExceptionAtt;
        }

        @objid ("5e2f95b0-13e2-44bd-ac29-8f42e8b7bff5")
        public static SmDependency SenderDep() {
            if (SenderDep == null) {
            	SenderDep = classof().getDependencyDef("Sender");
            }
            return SenderDep;
        }

        @objid ("45a45c1d-b932-405d-be91-45a3698e2dc2")
        public static SmDependency UsageDep() {
            if (UsageDep == null) {
            	UsageDep = classof().getDependencyDef("Usage");
            }
            return UsageDep;
        }

        @objid ("577ed86d-bc70-43cb-b720-63b7947d01c1")
        public static SmDependency SendsDep() {
            if (SendsDep == null) {
            	SendsDep = classof().getDependencyDef("Sends");
            }
            return SendsDep;
        }

        @objid ("fdeef11d-ce12-4133-8413-7be80768c135")
        public static SmDependency PBaseDep() {
            if (PBaseDep == null) {
            	PBaseDep = classof().getDependencyDef("PBase");
            }
            return PBaseDep;
        }

        @objid ("a006e8dc-717b-4d34-b8d2-b178f88c4510")
        public static SmDependency BrowseBaseDep() {
            if (BrowseBaseDep == null) {
            	BrowseBaseDep = classof().getDependencyDef("BrowseBase");
            }
            return BrowseBaseDep;
        }

        @objid ("d0fb436e-9b8a-451f-87f9-59b7095ec67b")
        public static SmDependency OBaseDep() {
            if (OBaseDep == null) {
            	OBaseDep = classof().getDependencyDef("OBase");
            }
            return OBaseDep;
        }

        @objid ("1e5713de-5978-4155-942b-e434180a602a")
        public static SmDependency CommunicationUsageDep() {
            if (CommunicationUsageDep == null) {
            	CommunicationUsageDep = classof().getDependencyDef("CommunicationUsage");
            }
            return CommunicationUsageDep;
        }

        @objid ("95f9d4fd-ffbd-426d-81a1-3381c27a990e")
        public static SmDependency DOccurenceDep() {
            if (DOccurenceDep == null) {
            	DOccurenceDep = classof().getDependencyDef("DOccurence");
            }
            return DOccurenceDep;
        }

        @objid ("5cd95a22-1020-43fc-8edd-7cee4fbbd7fe")
        public static SmDependency EOccurenceDep() {
            if (EOccurenceDep == null) {
            	EOccurenceDep = classof().getDependencyDef("EOccurence");
            }
            return EOccurenceDep;
        }

        @objid ("6a8ceb51-0796-4ad1-a6fc-aa4d416d76cf")
        public static SmDependency BaseDep() {
            if (BaseDep == null) {
            	BaseDep = classof().getDependencyDef("Base");
            }
            return BaseDep;
        }

        @objid ("da789356-cf79-4151-ac4d-d5c4e40df14e")
        public static SmDependency ReceiverDep() {
            if (ReceiverDep == null) {
            	ReceiverDep = classof().getDependencyDef("Receiver");
            }
            return ReceiverDep;
        }

        @objid ("0a422e2a-28cd-4008-94a5-13fc27ace50c")
        public static SmDependency getPBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PBaseDep;
        }

        @objid ("d016482f-0260-4215-b78e-e9291c115a07")
        public static SmDependency getReceiverDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiverDep;
        }

        @objid ("cb33ef04-ca9c-4a92-b7c3-932de92f5180")
        public static SmDependency getBrowseBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BrowseBaseDep;
        }

        @objid ("fc83ef26-75f2-4c94-8229-84bf30740c9b")
        public static SmDependency getBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BaseDep;
        }

        @objid ("54af3df2-2091-40ff-b862-3d998562055b")
        public static SmDependency getEOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EOccurenceDep;
        }

        @objid ("afac24ce-a723-4388-9f3d-f575e6a7e6ce")
        public static SmAttribute getIsEventAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsEventAtt;
        }

        @objid ("1b1c8f3f-1696-4c9a-95ff-85c4cacb5212")
        public static SmDependency getOBaseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OBaseDep;
        }

        @objid ("99004d4d-3539-496d-b499-99b61125ba46")
        public static SmDependency getDOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DOccurenceDep;
        }

        @objid ("6f7150d4-49fc-48b0-92ff-6967faf9e07a")
        public static SmDependency getSenderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SenderDep;
        }

        @objid ("38ca02ae-cf5f-4004-accf-dfc06341bdda")
        public static SmDependency getCommunicationUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CommunicationUsageDep;
        }

        @objid ("a3cb1411-af2a-49b7-b437-e9b3d4fec86d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e5a82da5-020b-4546-a551-9012d3386646")
        public static SmDependency getUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsageDep;
        }

        @objid ("29a199fd-efc6-4501-8030-cd70c89ce90a")
        public static SmDependency getSendsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SendsDep;
        }

        @objid ("ac411265-b484-44f9-a39a-b3ad1a7229a1")
        public static SmAttribute getIsExceptionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExceptionAtt;
        }

        @objid ("006dfbdc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e8f2881a-6aeb-4de2-b462-5b881b272118")
            public ISmObjectData createData() {
                return new SignalData();
            }

            @objid ("0d590eee-da78-4b9f-872c-a7d4ecc0d9a7")
            public SmObjectImpl createImpl() {
                return new SignalImpl();
            }

        }

        @objid ("006e5dc0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsEventSmAttribute extends SmAttribute {
            @objid ("b3a7b3b8-4f3a-404c-8130-49a8a3a258e1")
            public Object getValue(ISmObjectData data) {
                return ((SignalData) data).mIsEvent;
            }

            @objid ("d309f965-8381-43c8-9bba-1c825529d1b4")
            public void setValue(ISmObjectData data, Object value) {
                ((SignalData) data).mIsEvent = value;
            }

        }

        @objid ("006ec0a8-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsExceptionSmAttribute extends SmAttribute {
            @objid ("6d25cb73-93f3-46c4-9a5b-47733246530f")
            public Object getValue(ISmObjectData data) {
                return ((SignalData) data).mIsException;
            }

            @objid ("7e9ba962-c571-44f0-bbb7-6ebf9bf61be4")
            public void setValue(ISmObjectData data, Object value) {
                ((SignalData) data).mIsException = value;
            }

        }

        @objid ("006f26ba-c4c2-1fd8-97fe-001ec947cd2a")
        public static class EOccurenceSmDependency extends SmMultipleDependency {
            @objid ("9c4ffebe-2414-4011-bd74-5a8f43ed44a7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mEOccurence != null)? ((SignalData)data).mEOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("77aba262-c056-4dd7-8357-f8f234b6f45a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mEOccurence = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mEOccurence;
            }

            @objid ("9a79bfdb-e211-4fa7-9ed8-f1b51f5c952c")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.ModelDep();
            }

        }

        @objid ("006f8b00-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SendsSmDependency extends SmMultipleDependency {
            @objid ("fe2c5f13-4283-44a2-99e3-096ce78fb165")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mSends != null)? ((SignalData)data).mSends:SmMultipleDependency.EMPTY;
            }

            @objid ("de241ea6-1449-4e1e-8369-2bac51d8b5d1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mSends = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mSends;
            }

            @objid ("f26a3bcd-f8f8-4f2b-9723-cc4213dc618c")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.EffectsDep();
            }

        }

        @objid ("006fefd2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class PBaseSmDependency extends SmSingleDependency {
            @objid ("d5a63705-84d2-4af9-afb6-bdb698625777")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SignalData) data).mPBase;
            }

            @objid ("41cfb601-fd45-433d-ae68-04dfd06e5804")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SignalData) data).mPBase = value;
            }

            @objid ("ce43d269-0832-41d5-826f-f06642e68e1a")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.SRepresentationDep();
            }

        }

        @objid ("00706714-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OBaseSmDependency extends SmSingleDependency {
            @objid ("09360399-718b-47f9-93c1-5f826a41185a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SignalData) data).mOBase;
            }

            @objid ("19fae289-5740-436d-9ee3-4b58e23bf329")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SignalData) data).mOBase = value;
            }

            @objid ("c33a7c5a-2b5a-4a1c-b27a-70e36ef1f97d")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.SRepresentationDep();
            }

        }

        @objid ("0070de1a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class BaseSmDependency extends SmSingleDependency {
            @objid ("c981a6d5-93c6-4792-b247-37ab83236b69")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SignalData) data).mBase;
            }

            @objid ("4bcde289-8667-4134-b496-a551b04b6918")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SignalData) data).mBase = value;
            }

            @objid ("b852b12d-da12-477b-b8a5-8489c92faac2")
            @Override
            public SmDependency getSymetric() {
                return GeneralClassData.Metadata.SRepresentationDep();
            }

        }

        @objid ("007156a6-c4c2-1fd8-97fe-001ec947cd2a")
        public static class DOccurenceSmDependency extends SmMultipleDependency {
            @objid ("1a9ba3c2-c9a6-4fc8-a5c4-26b695162985")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mDOccurence != null)? ((SignalData)data).mDOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("7c98b132-f1d1-4fce-bca7-8f0c8d1fcf83")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mDOccurence = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mDOccurence;
            }

            @objid ("111439c3-fd94-48e2-8ffe-996f11451500")
            @Override
            public SmDependency getSymetric() {
                return DataFlowData.Metadata.SModelDep();
            }

        }

        @objid ("0071bdd0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class BrowseBaseSmDependency extends SmSingleDependency {
            @objid ("67fef286-22b4-477d-ad06-76774bc1b705")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((SignalData) data).mBrowseBase;
            }

            @objid ("4ebc8603-f53a-4e18-a073-134736da8e7c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((SignalData) data).mBrowseBase = value;
            }

            @objid ("1033ffcf-7e39-4987-8a0d-df03823c71a4")
            @Override
            public SmDependency getSymetric() {
                return null;
            }

        }

        @objid ("00723652-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SenderSmDependency extends SmMultipleDependency {
            @objid ("3d7acd1b-2624-46c7-aa15-23cc01487fd4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mSender != null)? ((SignalData)data).mSender:SmMultipleDependency.EMPTY;
            }

            @objid ("a70d29d1-cd70-449f-9a86-dc9325241fd8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mSender = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mSender;
            }

            @objid ("3e6ea5ce-10dc-4200-a3a5-3e9ee016766b")
            @Override
            public SmDependency getSymetric() {
                return SendSignalActionData.Metadata.SentDep();
            }

        }

        @objid ("00729e58-c4c2-1fd8-97fe-001ec947cd2a")
        public static class UsageSmDependency extends SmMultipleDependency {
            @objid ("abd3d0cc-a445-47cb-b53c-68f2f2ffa0de")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mUsage != null)? ((SignalData)data).mUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("207cffc0-5c06-411e-accd-1240ea3b9283")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mUsage = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mUsage;
            }

            @objid ("2121388f-a668-4164-8a2d-a53b9ebd8676")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.SignalSignatureDep();
            }

        }

        @objid ("007307e4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ReceiverSmDependency extends SmMultipleDependency {
            @objid ("629854a1-f9c5-4a6b-84a0-ac3b9e877e52")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mReceiver != null)? ((SignalData)data).mReceiver:SmMultipleDependency.EMPTY;
            }

            @objid ("0d4e2cdb-f2ce-4f0d-96c4-c829ca6bc408")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mReceiver = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mReceiver;
            }

            @objid ("19bab43c-f5ce-4c51-9175-9e42de33cf1d")
            @Override
            public SmDependency getSymetric() {
                return AcceptSignalActionData.Metadata.AcceptedDep();
            }

        }

        @objid ("00737198-c4c2-1fd8-97fe-001ec947cd2a")
        public static class CommunicationUsageSmDependency extends SmMultipleDependency {
            @objid ("bcc16ccf-d149-4f42-bed7-50a1220c9a95")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((SignalData)data).mCommunicationUsage != null)? ((SignalData)data).mCommunicationUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("d7ec581b-6a87-499f-9cf2-a26e1a688d62")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((SignalData) data).mCommunicationUsage = new ArrayList<>(initialCapacity);
                return ((SignalData) data).mCommunicationUsage;
            }

            @objid ("3e868154-8948-4c67-af00-65db50134881")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.SignalSignatureDep();
            }

        }

    }

}
