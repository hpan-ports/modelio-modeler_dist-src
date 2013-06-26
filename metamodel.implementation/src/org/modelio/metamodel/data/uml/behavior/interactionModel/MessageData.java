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
    @objid ("6be4155a-ee48-44c5-8fea-292de16ecbc5")
    @SmaMetaAttribute(metaName="Argument", type=String.class, smAttributeClass=Metadata.ArgumentSmAttribute.class)
     Object mArgument = "";

    @objid ("32104689-941f-4bc9-b3d6-de3800fc94d3")
    @SmaMetaAttribute(metaName="KindOfMessage", type=MessageKind.class, smAttributeClass=Metadata.KindOfMessageSmAttribute.class)
     Object mKindOfMessage = MessageKind.UNKNOWNKIND;

    @objid ("fbd9d16f-d6a0-422b-8988-e3da5fade4ec")
    @SmaMetaAttribute(metaName="SortOfMessage", type=MessageSort.class, smAttributeClass=Metadata.SortOfMessageSmAttribute.class)
     Object mSortOfMessage = MessageSort.SYNCCALL;

    @objid ("331a5071-5f8b-4402-8eb3-2574f8af3523")
    @SmaMetaAssociation(metaName="SignalSignature", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SignalSignatureSmDependency.class, partof = true)
     SmObjectImpl mSignalSignature;

    @objid ("b3c2cf9c-f2e8-4d29-b4c0-ed04d7f1e7b0")
    @SmaMetaAssociation(metaName="ReceiveEvent", typeDataClass=MessageEndData.class, min=0, max=1, smAssociationClass=Metadata.ReceiveEventSmDependency.class, partof = true)
     SmObjectImpl mReceiveEvent;

    @objid ("8f1a2c71-5bb3-4538-bc19-9885ff12e9e4")
    @SmaMetaAssociation(metaName="SendEvent", typeDataClass=MessageEndData.class, min=0, max=1, smAssociationClass=Metadata.SendEventSmDependency.class)
     SmObjectImpl mSendEvent;

    @objid ("2d7fbb43-0356-4f60-a9a3-7ead2ce665be")
    @SmaMetaAssociation(metaName="Invoked", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.InvokedSmDependency.class, partof = true)
     SmObjectImpl mInvoked;

    @objid ("48e37e95-e1a7-43cc-a7f9-2d2fe1e58098")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("8968e0e8-e388-426b-8f5a-6895438826ff")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008865da-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ffac079d-92fd-4c6c-b235-3067415a0260")
        private static SmClass smClass = null;

        @objid ("67793742-f3eb-4d7e-96f6-52467701ead0")
        private static SmAttribute ArgumentAtt = null;

        @objid ("b7d91817-67bc-4289-82c3-3047e0ea86ec")
        private static SmAttribute KindOfMessageAtt = null;

        @objid ("39fd42a1-9b28-49a6-9678-0d29a992f7a2")
        private static SmAttribute SortOfMessageAtt = null;

        @objid ("55c25a44-1819-4d47-bb71-c6acc9bfc0ee")
        private static SmDependency SignalSignatureDep = null;

        @objid ("601cb71f-d224-42bc-980d-7acc9bed68c9")
        private static SmDependency ReceiveEventDep = null;

        @objid ("585d388f-3ba1-4eff-a207-3b35bd083d7f")
        private static SmDependency SendEventDep = null;

        @objid ("e8fa91fe-5f43-4fdf-ab56-668f59724c44")
        private static SmDependency InvokedDep = null;

        @objid ("a03aa8c9-23a2-43de-818f-55e6a22bd053")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("c07a9a9b-6a2f-4de5-8d12-754813087ee7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MessageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c46d49ac-3383-4597-9563-d4902046f0c8")
        public static SmAttribute ArgumentAtt() {
            if (ArgumentAtt == null) {
            	ArgumentAtt = classof().getAttributeDef("Argument");
            }
            return ArgumentAtt;
        }

        @objid ("059c791e-8dd1-4af5-b65a-f54d46b53123")
        public static SmAttribute KindOfMessageAtt() {
            if (KindOfMessageAtt == null) {
            	KindOfMessageAtt = classof().getAttributeDef("KindOfMessage");
            }
            return KindOfMessageAtt;
        }

        @objid ("da487f5b-cc25-4a42-b445-d107573238a8")
        public static SmAttribute SortOfMessageAtt() {
            if (SortOfMessageAtt == null) {
            	SortOfMessageAtt = classof().getAttributeDef("SortOfMessage");
            }
            return SortOfMessageAtt;
        }

        @objid ("371eda39-6416-41fe-88c6-ffd7a65903cd")
        public static SmDependency SignalSignatureDep() {
            if (SignalSignatureDep == null) {
            	SignalSignatureDep = classof().getDependencyDef("SignalSignature");
            }
            return SignalSignatureDep;
        }

        @objid ("212e030a-7f00-49ba-a950-0ffb3cc3435a")
        public static SmDependency ReceiveEventDep() {
            if (ReceiveEventDep == null) {
            	ReceiveEventDep = classof().getDependencyDef("ReceiveEvent");
            }
            return ReceiveEventDep;
        }

        @objid ("846a52e1-84be-4b7a-a475-3ce0fcfdac18")
        public static SmDependency SendEventDep() {
            if (SendEventDep == null) {
            	SendEventDep = classof().getDependencyDef("SendEvent");
            }
            return SendEventDep;
        }

        @objid ("6a1b526f-ff85-4baa-8f2c-8a6edf0ef9f3")
        public static SmDependency InvokedDep() {
            if (InvokedDep == null) {
            	InvokedDep = classof().getDependencyDef("Invoked");
            }
            return InvokedDep;
        }

        @objid ("30ae52db-d882-4dd4-a717-30c5b914d427")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("4644fe51-0563-4ed5-8670-40a29c71f586")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("546e9c18-eb3c-4582-a3cb-f6f22710f36a")
        public static SmAttribute getKindOfMessageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return KindOfMessageAtt;
        }

        @objid ("1e403dec-9588-4529-8192-848a860f5498")
        public static SmDependency getReceiveEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiveEventDep;
        }

        @objid ("12b1e26f-cdf9-4e7c-9c72-39abf623daa4")
        public static SmAttribute getSortOfMessageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SortOfMessageAtt;
        }

        @objid ("71dbfd15-9f7c-4ff1-85ac-533fcf778781")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("83c9932f-5f41-4f9a-9d2e-b3f48320986e")
        public static SmDependency getSendEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SendEventDep;
        }

        @objid ("7ea9461a-9746-44d2-914c-d09a06c40936")
        public static SmAttribute getArgumentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArgumentAtt;
        }

        @objid ("c765de22-38fc-4d52-952a-d18749acf0ca")
        public static SmDependency getInvokedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvokedDep;
        }

        @objid ("d9c1a87f-c461-4973-aac3-5f51f5bbd567")
        public static SmDependency getSignalSignatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SignalSignatureDep;
        }

        @objid ("0088a676-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d4f296a1-c6c9-458c-95c6-061a4ef53e88")
            public ISmObjectData createData() {
                return new MessageData();
            }

            @objid ("80789547-4362-4610-872e-e1c7ffec4eda")
            public SmObjectImpl createImpl() {
                return new MessageImpl();
            }

        }

        @objid ("00891ebc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ArgumentSmAttribute extends SmAttribute {
            @objid ("ac7cbdaa-1897-47b2-9396-99505fb46ab7")
            public Object getValue(ISmObjectData data) {
                return ((MessageData) data).mArgument;
            }

            @objid ("fd7feae4-2436-41bf-8f30-cc250610b365")
            public void setValue(ISmObjectData data, Object value) {
                ((MessageData) data).mArgument = value;
            }

        }

        @objid ("00899afe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class KindOfMessageSmAttribute extends SmAttribute {
            @objid ("325950e0-4bbd-40b7-a419-ed7c3d6d5dc0")
            public Object getValue(ISmObjectData data) {
                return ((MessageData) data).mKindOfMessage;
            }

            @objid ("58572710-1af4-4df8-97ae-bc93e3be423e")
            public void setValue(ISmObjectData data, Object value) {
                ((MessageData) data).mKindOfMessage = value;
            }

        }

        @objid ("008a147a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SortOfMessageSmAttribute extends SmAttribute {
            @objid ("9182ebf2-00e4-4ade-aedc-eb95ce92d32f")
            public Object getValue(ISmObjectData data) {
                return ((MessageData) data).mSortOfMessage;
            }

            @objid ("9b2e92fe-f092-46bf-8b89-3bf859e8e5c3")
            public void setValue(ISmObjectData data, Object value) {
                ((MessageData) data).mSortOfMessage = value;
            }

        }

        @objid ("008a92f6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InvokedSmDependency extends SmSingleDependency {
            @objid ("94c10859-a0ae-4869-af33-241aafedf86e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mInvoked;
            }

            @objid ("221a9125-9bf4-422f-bc82-d00ee8582668")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mInvoked = value;
            }

            @objid ("0f3138e0-2bfe-4e53-a06a-1483da1eed5d")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.UsageDep();
            }

        }

        @objid ("008b236a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("411f5d4f-98e2-4901-b6fc-84f1425b7af7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MessageData)data).mRealizedInformationFlow != null)? ((MessageData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("e3dc4c09-a2a7-4d1a-919e-ce5738b761f0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MessageData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((MessageData) data).mRealizedInformationFlow;
            }

            @objid ("0c321401-3994-4312-9e46-b8bcbaa97a6b")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingMessageDep();
            }

        }

        @objid ("008ba2ea-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReceiveEventSmDependency extends SmSingleDependency {
            @objid ("6ffc437c-28fb-4c38-898f-997d0a12d304")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mReceiveEvent;
            }

            @objid ("41423449-8f18-40da-87d9-afd6635531f0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mReceiveEvent = value;
            }

            @objid ("728a6825-4909-44a7-b2f4-8a3a296a6f8d")
            @Override
            public SmDependency getSymetric() {
                return MessageEndData.Metadata.ReceivedMessageDep();
            }

        }

        @objid ("008c343a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SendEventSmDependency extends SmSingleDependency {
            @objid ("a547a0e2-2e2c-413f-afef-52e7193b59da")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mSendEvent;
            }

            @objid ("0daf7fab-fcc6-4abb-b036-72bb7eacf270")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mSendEvent = value;
            }

            @objid ("2f4e7e5a-68c8-4a80-baa5-caf787611a6d")
            @Override
            public SmDependency getSymetric() {
                return MessageEndData.Metadata.SentMessageDep();
            }

        }

        @objid ("008cca9e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SignalSignatureSmDependency extends SmSingleDependency {
            @objid ("0097dee4-cfa3-433d-9c17-d0ce06e345d9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mSignalSignature;
            }

            @objid ("b6cedc83-6006-4d67-9728-0899a94a8919")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mSignalSignature = value;
            }

            @objid ("29a34bcc-a753-4939-b9f1-054458ad90fd")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.UsageDep();
            }

        }

    }

}
