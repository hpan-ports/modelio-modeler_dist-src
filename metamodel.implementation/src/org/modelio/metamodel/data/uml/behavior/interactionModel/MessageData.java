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
package org.modelio.metamodel.data.uml.behavior.interactionModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.MessageEndData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.MessageImpl;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageKind;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
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

@objid ("004999e0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Message.class, factory=MessageData.Metadata.ObjectFactory.class)
public class MessageData extends ModelElementData {
    @objid ("a84be986-60a6-4231-a26a-4a4cb8cb3063")
    @SmaMetaAttribute(metaName="Argument", type=String.class, smAttributeClass=Metadata.ArgumentSmAttribute.class)
     Object mArgument = "";

    @objid ("84e29af8-ca91-4a83-92e3-5bfa28ff3916")
    @SmaMetaAttribute(metaName="KindOfMessage", type=MessageKind.class, smAttributeClass=Metadata.KindOfMessageSmAttribute.class)
     Object mKindOfMessage = MessageKind.UNKNOWNKIND;

    @objid ("0a227067-610e-41ee-8618-87dd2bdde7b4")
    @SmaMetaAttribute(metaName="SortOfMessage", type=MessageSort.class, smAttributeClass=Metadata.SortOfMessageSmAttribute.class)
     Object mSortOfMessage = MessageSort.SYNCCALL;

    @objid ("d0363aaf-b3b1-4984-a719-39b6fa09cee2")
    @SmaMetaAssociation(metaName="SignalSignature", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SignalSignatureSmDependency.class, partof = true)
     SmObjectImpl mSignalSignature;

    @objid ("1e74c341-0859-4b90-b2a1-f157e5ddd33b")
    @SmaMetaAssociation(metaName="ReceiveEvent", typeDataClass=MessageEndData.class, min=0, max=1, smAssociationClass=Metadata.ReceiveEventSmDependency.class, partof = true)
     SmObjectImpl mReceiveEvent;

    @objid ("caf8217d-b2d9-43f6-8e2a-7c214642ee56")
    @SmaMetaAssociation(metaName="SendEvent", typeDataClass=MessageEndData.class, min=0, max=1, smAssociationClass=Metadata.SendEventSmDependency.class)
     SmObjectImpl mSendEvent;

    @objid ("9f32027f-6889-4c9f-ae60-47b1607df3a8")
    @SmaMetaAssociation(metaName="Invoked", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.InvokedSmDependency.class, partof = true)
     SmObjectImpl mInvoked;

    @objid ("46206c2d-d702-42ea-8f8b-2f5220618877")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("16fc3ff2-572e-4451-9a2f-d82887597db9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008865da-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("070581b9-3d55-448a-ae67-895bc3a2da0a")
        private static SmClass smClass = null;

        @objid ("e360045a-fda3-4528-ab9a-49feac4bd504")
        private static SmAttribute ArgumentAtt = null;

        @objid ("e42163d7-1823-424a-92e2-1530d9d8231d")
        private static SmAttribute KindOfMessageAtt = null;

        @objid ("8f665e73-02b1-4947-a291-9aa8b88a4efe")
        private static SmAttribute SortOfMessageAtt = null;

        @objid ("92832132-d0c9-4b0a-b1fc-88abf13eeaf1")
        private static SmDependency SignalSignatureDep = null;

        @objid ("d43b29a8-c84c-442f-ba9a-e064c41cf2d7")
        private static SmDependency ReceiveEventDep = null;

        @objid ("a610af0c-c8e6-4779-89f0-bdd131205449")
        private static SmDependency SendEventDep = null;

        @objid ("55fec562-ada8-49b9-819f-ade05a732304")
        private static SmDependency InvokedDep = null;

        @objid ("ce3ab829-92f3-44bf-8ea2-77b5245eb1cd")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("9f8b7df8-b10f-47f0-b53e-0226e2af456b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MessageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0f2f6da3-d55c-48f2-9fef-093d12c73ac1")
        public static SmAttribute ArgumentAtt() {
            if (ArgumentAtt == null) {
            	ArgumentAtt = classof().getAttributeDef("Argument");
            }
            return ArgumentAtt;
        }

        @objid ("5d7c95dc-6d96-401b-9417-1c7fd13e148b")
        public static SmAttribute KindOfMessageAtt() {
            if (KindOfMessageAtt == null) {
            	KindOfMessageAtt = classof().getAttributeDef("KindOfMessage");
            }
            return KindOfMessageAtt;
        }

        @objid ("b826a6c8-eb5d-4a90-87ff-2b274f553ac2")
        public static SmAttribute SortOfMessageAtt() {
            if (SortOfMessageAtt == null) {
            	SortOfMessageAtt = classof().getAttributeDef("SortOfMessage");
            }
            return SortOfMessageAtt;
        }

        @objid ("676cb8f8-d444-4c5f-b270-9ecd9dd904a5")
        public static SmDependency SignalSignatureDep() {
            if (SignalSignatureDep == null) {
            	SignalSignatureDep = classof().getDependencyDef("SignalSignature");
            }
            return SignalSignatureDep;
        }

        @objid ("669028f5-2d8b-444e-bea3-b0b331f6ea84")
        public static SmDependency ReceiveEventDep() {
            if (ReceiveEventDep == null) {
            	ReceiveEventDep = classof().getDependencyDef("ReceiveEvent");
            }
            return ReceiveEventDep;
        }

        @objid ("d67e0afe-19f6-4689-93c3-be09082c4dde")
        public static SmDependency SendEventDep() {
            if (SendEventDep == null) {
            	SendEventDep = classof().getDependencyDef("SendEvent");
            }
            return SendEventDep;
        }

        @objid ("98f3a7a1-32f2-4f63-9c26-7bffcbd3f145")
        public static SmDependency InvokedDep() {
            if (InvokedDep == null) {
            	InvokedDep = classof().getDependencyDef("Invoked");
            }
            return InvokedDep;
        }

        @objid ("f9ca67ca-23db-450b-af25-7926fb6973c3")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("bb4137df-8fe7-436b-a8cd-1bfaa09cfe00")
        public static SmAttribute getKindOfMessageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return KindOfMessageAtt;
        }

        @objid ("61f7e788-32e3-4df0-b991-3ad090656cf7")
        public static SmDependency getReceiveEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiveEventDep;
        }

        @objid ("64f0b23f-1db5-484d-a614-7cf0f16a863a")
        public static SmAttribute getArgumentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArgumentAtt;
        }

        @objid ("119c54e6-86d0-408a-8d55-3cb26e537f5c")
        public static SmAttribute getSortOfMessageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SortOfMessageAtt;
        }

        @objid ("71b6846e-7eb1-4bef-b106-f58262568cf7")
        public static SmDependency getSendEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SendEventDep;
        }

        @objid ("e062b34a-43ff-4594-8bea-ec47497026a0")
        public static SmDependency getSignalSignatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SignalSignatureDep;
        }

        @objid ("b52d3aed-e8ff-4028-96b8-dc34eb043fde")
        public static SmDependency getInvokedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvokedDep;
        }

        @objid ("1e82f922-03d7-4b12-aeda-084979695d1f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("dba2735c-9336-4a27-b6e5-6671c8dcfc53")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("0088a676-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("21b04f38-13d7-4ae0-a4ff-3b8143e1e358")
            public ISmObjectData createData() {
                return new MessageData();
            }

            @objid ("e28a74f4-710f-4828-83ae-38b2b50c962c")
            public SmObjectImpl createImpl() {
                return new MessageImpl();
            }

        }

        @objid ("00891ebc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ArgumentSmAttribute extends SmAttribute {
            @objid ("82ac8660-f934-47de-a97e-45bbb5ff254a")
            public Object getValue(ISmObjectData data) {
                return ((MessageData) data).mArgument;
            }

            @objid ("f54cc36f-fbc6-402a-b846-9be71d6f8739")
            public void setValue(ISmObjectData data, Object value) {
                ((MessageData) data).mArgument = value;
            }

        }

        @objid ("00899afe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class KindOfMessageSmAttribute extends SmAttribute {
            @objid ("82aecfba-efd4-4f1e-bc51-93b2db906df9")
            public Object getValue(ISmObjectData data) {
                return ((MessageData) data).mKindOfMessage;
            }

            @objid ("a24c9342-6da1-4fd9-b511-80733461ccef")
            public void setValue(ISmObjectData data, Object value) {
                ((MessageData) data).mKindOfMessage = value;
            }

        }

        @objid ("008a147a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SortOfMessageSmAttribute extends SmAttribute {
            @objid ("6e3789bf-e066-4e88-8279-3dab59945e07")
            public Object getValue(ISmObjectData data) {
                return ((MessageData) data).mSortOfMessage;
            }

            @objid ("3becfe28-b48b-49fb-8691-8465c930ba25")
            public void setValue(ISmObjectData data, Object value) {
                ((MessageData) data).mSortOfMessage = value;
            }

        }

        @objid ("008a92f6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InvokedSmDependency extends SmSingleDependency {
            @objid ("606e498f-78bd-4c91-8d90-72df27cd94c2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mInvoked;
            }

            @objid ("a55cb137-9d59-43f1-92ac-d3d474043696")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mInvoked = value;
            }

            @objid ("bd12a340-1a5a-450b-9ff9-2e4fae30139e")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.UsageDep();
            }

        }

        @objid ("008b236a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("eea89327-a503-4ffe-962d-d9bca224a81d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MessageData)data).mRealizedInformationFlow != null)? ((MessageData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("cfc9c5de-c8be-4d2c-9826-f7fda2a2a8fa")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MessageData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((MessageData) data).mRealizedInformationFlow;
            }

            @objid ("0e7fe735-95b6-49a9-a685-f1bb59c2a629")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingMessageDep();
            }

        }

        @objid ("008ba2ea-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReceiveEventSmDependency extends SmSingleDependency {
            @objid ("0bfd816a-2f18-45ec-a47e-b42a8b37d332")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mReceiveEvent;
            }

            @objid ("2eb186be-e5e4-4259-9f89-330a3e86cb63")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mReceiveEvent = value;
            }

            @objid ("df6cec22-df1e-4959-84fd-2869e29fc4e3")
            @Override
            public SmDependency getSymetric() {
                return MessageEndData.Metadata.ReceivedMessageDep();
            }

        }

        @objid ("008c343a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SendEventSmDependency extends SmSingleDependency {
            @objid ("38ebadf5-9141-4e44-ac35-4f9fc4a34b1a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mSendEvent;
            }

            @objid ("dc218a5b-1358-4329-b955-389ec81b6e33")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mSendEvent = value;
            }

            @objid ("20ff29db-b551-4101-b75d-0cf454017fd4")
            @Override
            public SmDependency getSymetric() {
                return MessageEndData.Metadata.SentMessageDep();
            }

        }

        @objid ("008cca9e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SignalSignatureSmDependency extends SmSingleDependency {
            @objid ("8a637b48-134a-467b-8b3d-d02d84381693")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mSignalSignature;
            }

            @objid ("94e9e675-db97-4864-bfbe-1972aa0522de")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mSignalSignature = value;
            }

            @objid ("52f0a9e8-927a-4188-afeb-8fbced6224b0")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.UsageDep();
            }

        }

    }

}
