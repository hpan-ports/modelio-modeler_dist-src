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
package org.modelio.metamodel.data.uml.behavior.communicationModel;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationChannelData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationMessageImpl;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
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

@objid ("005b5928-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=CommunicationMessage.class, factory=CommunicationMessageData.Metadata.ObjectFactory.class)
public class CommunicationMessageData extends ModelElementData {
    @objid ("35af16c7-1eda-4bc5-b7c2-7bde66d43af1")
    @SmaMetaAttribute(metaName="Argument", type=String.class, smAttributeClass=Metadata.ArgumentSmAttribute.class)
     Object mArgument = "";

    @objid ("43a578f5-c559-409f-a170-28c18d01d5e2")
    @SmaMetaAttribute(metaName="Sequence", type=String.class, smAttributeClass=Metadata.SequenceSmAttribute.class)
     Object mSequence = "";

    @objid ("5770c82f-13de-44a8-8543-99f731c913ce")
    @SmaMetaAttribute(metaName="SortOfMessage", type=MessageSort.class, smAttributeClass=Metadata.SortOfMessageSmAttribute.class)
     Object mSortOfMessage = MessageSort.SYNCCALL;

    @objid ("a7d11b85-42ce-4842-a13e-b29c35bfea9f")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("e3e516f3-419c-46e8-bf6e-e61fde40d052")
    @SmaMetaAssociation(metaName="Channel", typeDataClass=CommunicationChannelData.class, min=0, max=1, smAssociationClass=Metadata.ChannelSmDependency.class)
     SmObjectImpl mChannel;

    @objid ("7b16029b-3441-484a-ac4f-b60f9b8c53b9")
    @SmaMetaAssociation(metaName="InvertedChannel", typeDataClass=CommunicationChannelData.class, min=0, max=1, smAssociationClass=Metadata.InvertedChannelSmDependency.class)
     SmObjectImpl mInvertedChannel;

    @objid ("f26c4707-ab50-43c7-ac87-d49b184c4c20")
    @SmaMetaAssociation(metaName="Invoked", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.InvokedSmDependency.class, partof = true)
     SmObjectImpl mInvoked;

    @objid ("0b3422d1-c789-4a38-a286-3f23cac7c999")
    @SmaMetaAssociation(metaName="SignalSignature", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SignalSignatureSmDependency.class, partof = true)
     SmObjectImpl mSignalSignature;

    @objid ("989359dd-8bb4-454b-b5ad-4c27febc0829")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0011ffa8-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e18256ab-c247-4a15-a529-79e32efff6ce")
        private static SmClass smClass = null;

        @objid ("15f4384d-daab-4911-acd6-265fb81ba92c")
        private static SmAttribute ArgumentAtt = null;

        @objid ("1286590e-aed1-493c-a333-c815ae5bc837")
        private static SmAttribute SequenceAtt = null;

        @objid ("bcb02297-3ce4-43d1-a1ad-ead131a35d1f")
        private static SmAttribute SortOfMessageAtt = null;

        @objid ("522db663-84ff-4ac2-8bee-3e8f5330ee54")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("a1e0a89d-2f97-4340-a9f0-d2c74f56e127")
        private static SmDependency ChannelDep = null;

        @objid ("d55133f4-e455-460a-83c3-9d7b0395b2f8")
        private static SmDependency InvertedChannelDep = null;

        @objid ("a6cfea7a-8d33-4882-86dc-af78e12c0314")
        private static SmDependency InvokedDep = null;

        @objid ("2892d9a1-9843-4dd8-8bc4-3964915d9d72")
        private static SmDependency SignalSignatureDep = null;

        @objid ("580f10e1-f434-4b95-821f-bbeac32aabec")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationMessageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("31d5b72b-07eb-4907-aa1f-2413c168f22b")
        public static SmAttribute ArgumentAtt() {
            if (ArgumentAtt == null) {
            	ArgumentAtt = classof().getAttributeDef("Argument");
            }
            return ArgumentAtt;
        }

        @objid ("cdf377d9-63b6-419a-91da-6d459f8fee67")
        public static SmAttribute SequenceAtt() {
            if (SequenceAtt == null) {
            	SequenceAtt = classof().getAttributeDef("Sequence");
            }
            return SequenceAtt;
        }

        @objid ("999bde28-9151-4c08-a51b-2e6f63ca62cd")
        public static SmAttribute SortOfMessageAtt() {
            if (SortOfMessageAtt == null) {
            	SortOfMessageAtt = classof().getAttributeDef("SortOfMessage");
            }
            return SortOfMessageAtt;
        }

        @objid ("6e5dfca9-d8bd-4648-a8f1-76e22fb871bb")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("d32dba23-143d-4f57-9e62-cb0fa7d289b1")
        public static SmDependency ChannelDep() {
            if (ChannelDep == null) {
            	ChannelDep = classof().getDependencyDef("Channel");
            }
            return ChannelDep;
        }

        @objid ("f22b1a11-0d3d-4406-b9cb-4fd1a70af066")
        public static SmDependency InvertedChannelDep() {
            if (InvertedChannelDep == null) {
            	InvertedChannelDep = classof().getDependencyDef("InvertedChannel");
            }
            return InvertedChannelDep;
        }

        @objid ("9febac7b-e5fa-4e00-aeb3-547f947969b4")
        public static SmDependency InvokedDep() {
            if (InvokedDep == null) {
            	InvokedDep = classof().getDependencyDef("Invoked");
            }
            return InvokedDep;
        }

        @objid ("4fabf1d3-33cf-43ef-9c05-feb02a0194d1")
        public static SmDependency SignalSignatureDep() {
            if (SignalSignatureDep == null) {
            	SignalSignatureDep = classof().getDependencyDef("SignalSignature");
            }
            return SignalSignatureDep;
        }

        @objid ("f186e5b2-14f7-4ebd-a93b-cae031916d00")
        public static SmAttribute getArgumentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArgumentAtt;
        }

        @objid ("ee06bb76-149b-4347-b089-40762529292b")
        public static SmAttribute getSequenceAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SequenceAtt;
        }

        @objid ("2f9bb483-09fe-4d16-97a7-196bdacf04b7")
        public static SmDependency getInvertedChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvertedChannelDep;
        }

        @objid ("4e9a138a-0a52-49d1-8905-1ea278457705")
        public static SmDependency getSignalSignatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SignalSignatureDep;
        }

        @objid ("56978f9c-0a16-4222-b913-6120369f06eb")
        public static SmDependency getInvokedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvokedDep;
        }

        @objid ("aa5c2ef7-3c5a-4ac0-85a4-e6bed0b947a5")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("1e70afa5-c4ca-49a7-aacd-a6fce26798f7")
        public static SmDependency getChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChannelDep;
        }

        @objid ("182790cf-f09c-4fd2-ac77-b36d841a07bd")
        public static SmAttribute getSortOfMessageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SortOfMessageAtt;
        }

        @objid ("4d55c1e8-322f-47d0-8ffe-65bb78a208b9")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00124170-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d135893d-cb0e-424b-a10a-3495338ebd2d")
            public ISmObjectData createData() {
                return new CommunicationMessageData();
            }

            @objid ("dab6cc0f-8224-4584-8978-bb6a2fb16a87")
            public SmObjectImpl createImpl() {
                return new CommunicationMessageImpl();
            }

        }

        @objid ("0012a41c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ArgumentSmAttribute extends SmAttribute {
            @objid ("0fbfb5a8-038b-4186-83b9-77e0e57fc754")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mArgument;
            }

            @objid ("4c2513aa-51a6-4e45-9204-e89ac62e8e57")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationMessageData) data).mArgument = value;
            }

        }

        @objid ("001306d2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SequenceSmAttribute extends SmAttribute {
            @objid ("1859014d-8210-48d4-8be0-60d3810fe749")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mSequence;
            }

            @objid ("6969c6ac-b930-4a63-8afc-a8740717a9bc")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationMessageData) data).mSequence = value;
            }

        }

        @objid ("00144146-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SortOfMessageSmAttribute extends SmAttribute {
            @objid ("71b7a501-9261-46a1-8417-90ded85f8a86")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mSortOfMessage;
            }

            @objid ("fcc386a4-0229-43f0-99b1-15ec76fc751f")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationMessageData) data).mSortOfMessage = value;
            }

        }

        @objid ("0014abae-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InvokedSmDependency extends SmSingleDependency {
            @objid ("79b47d47-9c10-4cf5-a614-b74dbe118639")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mInvoked;
            }

            @objid ("310582db-157f-4901-9933-8930112b9060")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mInvoked = value;
            }

            @objid ("3251e8d4-3029-421d-87cc-4a3a6b6c15eb")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CommunicationUsageDep();
            }

        }

        @objid ("0015248a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("16d8365d-cd30-4b74-80b3-f54435585d18")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationMessageData)data).mRealizedInformationFlow != null)? ((CommunicationMessageData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("c7d85c12-01ac-4657-b7b7-3e6f2a0389e4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationMessageData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((CommunicationMessageData) data).mRealizedInformationFlow;
            }

            @objid ("04f17646-cebd-4d00-90c7-6ed639a3bb91")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingCommunicationMessageDep();
            }

        }

        @objid ("00158b0a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SignalSignatureSmDependency extends SmSingleDependency {
            @objid ("950dc487-0ebd-4a42-8e39-6dbfa1b138e3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mSignalSignature;
            }

            @objid ("f7d44de4-2219-4445-86ca-566b0f3fa24e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mSignalSignature = value;
            }

            @objid ("bb78e124-9562-4676-8be7-b209f7046f17")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.CommunicationUsageDep();
            }

        }

        @objid ("001605b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ChannelSmDependency extends SmSingleDependency {
            @objid ("d1a05dbf-c88a-42b8-b8e2-92c12da3d314")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mChannel;
            }

            @objid ("32ce5eb1-4b2e-4a75-a0ee-c2336356054d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mChannel = value;
            }

            @objid ("ca75d40a-ddce-43e1-bf42-32749cad8e1a")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.StartToEndMessageDep();
            }

        }

        @objid ("d06c71b1-eb32-478d-992a-d0b53482df76")
        public static class InvertedChannelSmDependency extends SmSingleDependency {
            @objid ("7fac7f4d-3a29-4e56-ad59-4ce1091713a7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mInvertedChannel;
            }

            @objid ("a1676866-91ce-49b1-82fe-181d4e5a0648")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mInvertedChannel = value;
            }

            @objid ("12b16d95-3fc4-4b03-80ef-070cc8e654cf")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.EndToStartMessageDep();
            }

        }

    }

}
