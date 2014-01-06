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
    @objid ("6b73f1cf-f7b6-42fd-a122-3b27365343e9")
    @SmaMetaAttribute(metaName="Argument", type=String.class, smAttributeClass=Metadata.ArgumentSmAttribute.class)
     Object mArgument = "";

    @objid ("ce73654f-5ef3-400f-bf00-ffc22ed6a666")
    @SmaMetaAttribute(metaName="KindOfMessage", type=MessageKind.class, smAttributeClass=Metadata.KindOfMessageSmAttribute.class)
     Object mKindOfMessage = MessageKind.UNKNOWNKIND;

    @objid ("5ff1d614-fd3b-49d7-9e63-59ac356f3348")
    @SmaMetaAttribute(metaName="SortOfMessage", type=MessageSort.class, smAttributeClass=Metadata.SortOfMessageSmAttribute.class)
     Object mSortOfMessage = MessageSort.SYNCCALL;

    @objid ("051ac9ec-c2ef-4035-a924-a7501036ec42")
    @SmaMetaAssociation(metaName="SignalSignature", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SignalSignatureSmDependency.class, partof = true)
     SmObjectImpl mSignalSignature;

    @objid ("1d608ef2-0012-4c6e-9459-b408078fe160")
    @SmaMetaAssociation(metaName="ReceiveEvent", typeDataClass=MessageEndData.class, min=0, max=1, smAssociationClass=Metadata.ReceiveEventSmDependency.class, partof = true)
     SmObjectImpl mReceiveEvent;

    @objid ("e671fa92-084a-464d-8e9a-564772f0119c")
    @SmaMetaAssociation(metaName="SendEvent", typeDataClass=MessageEndData.class, min=0, max=1, smAssociationClass=Metadata.SendEventSmDependency.class)
     SmObjectImpl mSendEvent;

    @objid ("4c1ff243-c0a0-46c1-ac38-314bb348a08a")
    @SmaMetaAssociation(metaName="Invoked", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.InvokedSmDependency.class, partof = true)
     SmObjectImpl mInvoked;

    @objid ("6f4d3f2c-30e9-4762-ad52-fadfb06d19d9")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("66c3d01f-f2ec-4e70-a25a-3b6fee8de4c9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008865da-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4b0e661c-14ce-4783-a771-444d76605962")
        private static SmClass smClass = null;

        @objid ("b7bb1e1b-1b14-4351-b66e-1524ab32b561")
        private static SmAttribute ArgumentAtt = null;

        @objid ("1f370bb4-5cba-4433-ae02-907f92fee230")
        private static SmAttribute KindOfMessageAtt = null;

        @objid ("36e2053e-7b77-4d3d-ade7-399dcb3c2f45")
        private static SmAttribute SortOfMessageAtt = null;

        @objid ("691096fb-ff72-4a38-a16a-37fb83f4bdf2")
        private static SmDependency SignalSignatureDep = null;

        @objid ("dd96bf52-2035-4530-b488-c3d4ff4034d9")
        private static SmDependency ReceiveEventDep = null;

        @objid ("9b185fc7-1d97-4bd8-b423-42ac7a977096")
        private static SmDependency SendEventDep = null;

        @objid ("1478ba0f-bece-4d2b-b2d5-52513772565c")
        private static SmDependency InvokedDep = null;

        @objid ("1a9ffa5c-e326-425a-aa6f-1cc45630e9b0")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("52ec9fbc-dee9-435c-9961-b6b038c0dc3c")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(MessageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0254ab7a-4bd5-4ced-b2e1-d4bf5c284127")
        public static SmAttribute ArgumentAtt() {
            if (ArgumentAtt == null) {
            	ArgumentAtt = classof().getAttributeDef("Argument");
            }
            return ArgumentAtt;
        }

        @objid ("bd77fd3a-277d-43eb-9372-eb9645a975c9")
        public static SmAttribute KindOfMessageAtt() {
            if (KindOfMessageAtt == null) {
            	KindOfMessageAtt = classof().getAttributeDef("KindOfMessage");
            }
            return KindOfMessageAtt;
        }

        @objid ("5fd8066c-f1c0-4011-9824-1fb211385799")
        public static SmAttribute SortOfMessageAtt() {
            if (SortOfMessageAtt == null) {
            	SortOfMessageAtt = classof().getAttributeDef("SortOfMessage");
            }
            return SortOfMessageAtt;
        }

        @objid ("58ca2b35-69ef-4441-bf01-74d6f5ebc4d0")
        public static SmDependency SignalSignatureDep() {
            if (SignalSignatureDep == null) {
            	SignalSignatureDep = classof().getDependencyDef("SignalSignature");
            }
            return SignalSignatureDep;
        }

        @objid ("be9767b6-67f1-4a39-90a6-8b79e69bf339")
        public static SmDependency ReceiveEventDep() {
            if (ReceiveEventDep == null) {
            	ReceiveEventDep = classof().getDependencyDef("ReceiveEvent");
            }
            return ReceiveEventDep;
        }

        @objid ("7fe15319-dbcf-4dff-bc20-9e4cfeb15630")
        public static SmDependency SendEventDep() {
            if (SendEventDep == null) {
            	SendEventDep = classof().getDependencyDef("SendEvent");
            }
            return SendEventDep;
        }

        @objid ("44fbbdac-2fb5-4697-83b1-3c19a26c3ee3")
        public static SmDependency InvokedDep() {
            if (InvokedDep == null) {
            	InvokedDep = classof().getDependencyDef("Invoked");
            }
            return InvokedDep;
        }

        @objid ("8de9f6ce-ecd9-42ba-bbbb-f8adb26dbd2f")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("bf480301-92b5-4a66-a738-78be0896e50c")
        public static SmAttribute getKindOfMessageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return KindOfMessageAtt;
        }

        @objid ("f3ee341f-eb55-47d6-90f4-2c1d17714c99")
        public static SmAttribute getArgumentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArgumentAtt;
        }

        @objid ("1a914b55-fca6-4d45-9f07-3290014bb1f2")
        public static SmDependency getInvokedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvokedDep;
        }

        @objid ("97433187-ba27-4f87-bc86-506ab2caef25")
        public static SmDependency getSendEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SendEventDep;
        }

        @objid ("cd885579-054b-44d3-a3ec-e8e6e5763055")
        public static SmAttribute getSortOfMessageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SortOfMessageAtt;
        }

        @objid ("d6a3af12-cf6d-44cd-a606-bd0207bb38d7")
        public static SmDependency getSignalSignatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SignalSignatureDep;
        }

        @objid ("1297392c-c273-4e1b-b9d3-458e194f4b9e")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("fa2846c0-5e03-4a20-aa57-3b9639385446")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b22b242f-1e11-47e3-a021-0c2848affe6f")
        public static SmDependency getReceiveEventDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiveEventDep;
        }

        @objid ("0088a676-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("7cf811de-63d5-49db-b3e4-66f1ac93c18e")
            public ISmObjectData createData() {
                return new MessageData();
            }

            @objid ("3d237a60-3625-443f-88d9-dcf9440513bd")
            public SmObjectImpl createImpl() {
                return new MessageImpl();
            }

        }

        @objid ("00891ebc-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ArgumentSmAttribute extends SmAttribute {
            @objid ("2a89e4e9-1756-4f4b-af57-6676426cf716")
            public Object getValue(ISmObjectData data) {
                return ((MessageData) data).mArgument;
            }

            @objid ("a2c56083-3cae-4ef3-a795-1ee2811574fd")
            public void setValue(ISmObjectData data, Object value) {
                ((MessageData) data).mArgument = value;
            }

        }

        @objid ("00899afe-c4c4-1fd8-97fe-001ec947cd2a")
        public static class KindOfMessageSmAttribute extends SmAttribute {
            @objid ("58b69588-67f9-4c9d-a3a5-ab54296beeb5")
            public Object getValue(ISmObjectData data) {
                return ((MessageData) data).mKindOfMessage;
            }

            @objid ("ef63a5a7-cd49-4f79-8f6c-3e28b3217d56")
            public void setValue(ISmObjectData data, Object value) {
                ((MessageData) data).mKindOfMessage = value;
            }

        }

        @objid ("008a147a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SortOfMessageSmAttribute extends SmAttribute {
            @objid ("bdc6ef0f-b4ac-4028-99cd-509ff7c34a6e")
            public Object getValue(ISmObjectData data) {
                return ((MessageData) data).mSortOfMessage;
            }

            @objid ("0d7e3682-05c3-4c85-8a76-b6bdd3074a25")
            public void setValue(ISmObjectData data, Object value) {
                ((MessageData) data).mSortOfMessage = value;
            }

        }

        @objid ("008a92f6-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InvokedSmDependency extends SmSingleDependency {
            @objid ("16640f10-b36c-41a7-83f3-d67116379b50")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mInvoked;
            }

            @objid ("864f4a03-82d2-4c80-9102-e1006ba70b3c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mInvoked = value;
            }

            @objid ("1d805845-b81f-4321-b9e9-2a0885ad1db7")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.UsageDep();
            }

        }

        @objid ("008b236a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("d7e4f753-f569-4787-bd2d-363962a32249")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((MessageData)data).mRealizedInformationFlow != null)? ((MessageData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("bd6fe901-b8a5-4344-bb1a-ccd1630f69eb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((MessageData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((MessageData) data).mRealizedInformationFlow;
            }

            @objid ("1e39b5c1-19bc-4bcb-83b9-d79e40aefc4a")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingMessageDep();
            }

        }

        @objid ("008ba2ea-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ReceiveEventSmDependency extends SmSingleDependency {
            @objid ("96d75a74-6102-4a09-b756-15ab13d99c06")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mReceiveEvent;
            }

            @objid ("a716c72e-461c-44e7-b69b-021d557b9949")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mReceiveEvent = value;
            }

            @objid ("cf413b15-3abd-4e2f-999c-b5fe8d75b378")
            @Override
            public SmDependency getSymetric() {
                return MessageEndData.Metadata.ReceivedMessageDep();
            }

        }

        @objid ("008c343a-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SendEventSmDependency extends SmSingleDependency {
            @objid ("daf304ba-cf38-4d08-89ab-9a88e3dc112b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mSendEvent;
            }

            @objid ("0cd3d478-f5c7-47bc-898d-f6a4b16a6bd2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mSendEvent = value;
            }

            @objid ("96bdc5ac-43df-48c7-af1d-b5c1ab5a0b69")
            @Override
            public SmDependency getSymetric() {
                return MessageEndData.Metadata.SentMessageDep();
            }

        }

        @objid ("008cca9e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class SignalSignatureSmDependency extends SmSingleDependency {
            @objid ("bae44bd7-1093-4645-b6a4-63cd8ef7e6da")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((MessageData) data).mSignalSignature;
            }

            @objid ("b5dc1edb-7694-49db-8d96-d447ca1de96f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((MessageData) data).mSignalSignature = value;
            }

            @objid ("ec2f805b-b014-4bc7-9607-cf281833212c")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.UsageDep();
            }

        }

    }

}
