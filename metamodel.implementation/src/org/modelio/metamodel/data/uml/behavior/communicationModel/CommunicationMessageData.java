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
    @objid ("c89973d1-cac5-4ac6-80bc-7895a205704d")
    @SmaMetaAttribute(metaName="Argument", type=String.class, smAttributeClass=Metadata.ArgumentSmAttribute.class)
     Object mArgument = "";

    @objid ("0df3bd92-88df-423c-9623-636555d8ab75")
    @SmaMetaAttribute(metaName="Sequence", type=String.class, smAttributeClass=Metadata.SequenceSmAttribute.class)
     Object mSequence = "";

    @objid ("92800b77-10c3-4d51-8f09-81394f0f0136")
    @SmaMetaAttribute(metaName="SortOfMessage", type=MessageSort.class, smAttributeClass=Metadata.SortOfMessageSmAttribute.class)
     Object mSortOfMessage = MessageSort.SYNCCALL;

    @objid ("6cef73c1-83a4-43a2-ac49-838a750e97c4")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("5279c922-b6b0-45bf-a327-f0cf6387237d")
    @SmaMetaAssociation(metaName="Channel", typeDataClass=CommunicationChannelData.class, min=0, max=1, smAssociationClass=Metadata.ChannelSmDependency.class)
     SmObjectImpl mChannel;

    @objid ("8e0092b8-3088-4525-9ed4-0ed7f89c5b39")
    @SmaMetaAssociation(metaName="InvertedChannel", typeDataClass=CommunicationChannelData.class, min=0, max=1, smAssociationClass=Metadata.InvertedChannelSmDependency.class)
     SmObjectImpl mInvertedChannel;

    @objid ("d706deb3-9f94-47ec-aa97-09ef1d53a567")
    @SmaMetaAssociation(metaName="Invoked", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.InvokedSmDependency.class, partof = true)
     SmObjectImpl mInvoked;

    @objid ("435c3a24-6e08-44e8-862e-ecfa9a9e1565")
    @SmaMetaAssociation(metaName="SignalSignature", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SignalSignatureSmDependency.class, partof = true)
     SmObjectImpl mSignalSignature;

    @objid ("0a4a6465-93a7-4718-906f-4c9026945540")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0011ffa8-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("30675dd6-fdfb-4cbc-8fb2-66e215886d42")
        private static SmClass smClass = null;

        @objid ("b11bd02e-0f21-42cc-bbe5-1e87d1c5e3bf")
        private static SmAttribute ArgumentAtt = null;

        @objid ("e24c7cc1-a3cf-472f-85eb-3f77b3f3f7f5")
        private static SmAttribute SequenceAtt = null;

        @objid ("64a215f8-817b-4304-b9a1-3a5018e25d7c")
        private static SmAttribute SortOfMessageAtt = null;

        @objid ("140c412e-2d6b-4113-9cb2-1bc14c7a6587")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("6527e7b2-8e46-44f3-8a17-0573da1373ea")
        private static SmDependency ChannelDep = null;

        @objid ("a611848a-0ead-45e6-88fa-b94833c5f1d6")
        private static SmDependency InvertedChannelDep = null;

        @objid ("95b634e0-fd13-47a7-82dd-7b9766cf4a76")
        private static SmDependency InvokedDep = null;

        @objid ("31528aef-d2d5-43ab-ae4e-1b065b13689c")
        private static SmDependency SignalSignatureDep = null;

        @objid ("2858413f-c556-455d-a210-5aa6ac5c1779")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationMessageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("812cb692-2fa1-4538-96f1-b571af7199d3")
        public static SmAttribute ArgumentAtt() {
            if (ArgumentAtt == null) {
            	ArgumentAtt = classof().getAttributeDef("Argument");
            }
            return ArgumentAtt;
        }

        @objid ("3e47005c-82b9-448f-9c48-d49a193dfd81")
        public static SmAttribute SequenceAtt() {
            if (SequenceAtt == null) {
            	SequenceAtt = classof().getAttributeDef("Sequence");
            }
            return SequenceAtt;
        }

        @objid ("9209a591-1802-450d-a97a-32a1e06f14d3")
        public static SmAttribute SortOfMessageAtt() {
            if (SortOfMessageAtt == null) {
            	SortOfMessageAtt = classof().getAttributeDef("SortOfMessage");
            }
            return SortOfMessageAtt;
        }

        @objid ("9c18c2f8-7a8d-415a-ba1a-a78537d5aa11")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("f936ac6f-8c34-4459-95c6-3c4d311dfa09")
        public static SmDependency ChannelDep() {
            if (ChannelDep == null) {
            	ChannelDep = classof().getDependencyDef("Channel");
            }
            return ChannelDep;
        }

        @objid ("f9985101-a43c-44be-bffe-91312a477447")
        public static SmDependency InvertedChannelDep() {
            if (InvertedChannelDep == null) {
            	InvertedChannelDep = classof().getDependencyDef("InvertedChannel");
            }
            return InvertedChannelDep;
        }

        @objid ("7eaa9c77-67e3-4bdb-a54c-a058c2235b29")
        public static SmDependency InvokedDep() {
            if (InvokedDep == null) {
            	InvokedDep = classof().getDependencyDef("Invoked");
            }
            return InvokedDep;
        }

        @objid ("9e2ed79b-0193-49bb-8380-251b1b3a131a")
        public static SmDependency SignalSignatureDep() {
            if (SignalSignatureDep == null) {
            	SignalSignatureDep = classof().getDependencyDef("SignalSignature");
            }
            return SignalSignatureDep;
        }

        @objid ("5b337987-bbfa-4c5c-822f-cbbaf3c68f25")
        public static SmAttribute getSequenceAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SequenceAtt;
        }

        @objid ("909e646d-f62a-494b-a132-49a486cfc3b6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("8028dbf9-2898-4160-9a6f-417e334f25bb")
        public static SmDependency getChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChannelDep;
        }

        @objid ("c5e1c589-f7f1-4a15-a273-ab0ef590904f")
        public static SmAttribute getArgumentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArgumentAtt;
        }

        @objid ("5180c9d2-d621-4658-9cfc-bd97e0ec1bdb")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("3fb85b5f-1a99-4c78-95f7-76d13520b47c")
        public static SmDependency getSignalSignatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SignalSignatureDep;
        }

        @objid ("cf77b4dd-9145-42c4-a79a-7c97c360f78b")
        public static SmAttribute getSortOfMessageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SortOfMessageAtt;
        }

        @objid ("d2425ed6-7b02-4917-a9ab-a2e075813538")
        public static SmDependency getInvokedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvokedDep;
        }

        @objid ("afb21b35-6a0e-494d-b7db-0c51ae37dc29")
        public static SmDependency getInvertedChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvertedChannelDep;
        }

        @objid ("00124170-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("4ce06ad3-b3ce-4ab6-8e1e-b20a3b0308d0")
            public ISmObjectData createData() {
                return new CommunicationMessageData();
            }

            @objid ("d73a1699-d064-4b58-b323-dbaf6ddb278f")
            public SmObjectImpl createImpl() {
                return new CommunicationMessageImpl();
            }

        }

        @objid ("0012a41c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ArgumentSmAttribute extends SmAttribute {
            @objid ("5cf4717c-b212-4223-9c47-54c6b38a6120")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mArgument;
            }

            @objid ("3f290910-4ffe-4844-9101-e643ef877822")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationMessageData) data).mArgument = value;
            }

        }

        @objid ("001306d2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SequenceSmAttribute extends SmAttribute {
            @objid ("e3ba3fd1-bf57-478f-9244-dbe7fe459712")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mSequence;
            }

            @objid ("a7f28fa9-5c85-4386-b489-d27e524320ef")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationMessageData) data).mSequence = value;
            }

        }

        @objid ("00144146-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SortOfMessageSmAttribute extends SmAttribute {
            @objid ("16f9a6bf-37f9-4dda-abc0-cc662e26d5d2")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mSortOfMessage;
            }

            @objid ("7d757b39-3b65-4055-b154-0a6e0e9760e6")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationMessageData) data).mSortOfMessage = value;
            }

        }

        @objid ("0014abae-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InvokedSmDependency extends SmSingleDependency {
            @objid ("7dcc6c0f-c321-4f52-bd5c-60ea6a04e3a7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mInvoked;
            }

            @objid ("5e5fa9e0-5ce5-4a39-95fa-4cde182adb5b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mInvoked = value;
            }

            @objid ("a4a676bc-9e99-41f1-9288-ed3777a3e69d")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CommunicationUsageDep();
            }

        }

        @objid ("0015248a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("d9bea36c-b6a7-4d01-a627-0882d7c4052b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationMessageData)data).mRealizedInformationFlow != null)? ((CommunicationMessageData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("903bad8b-070f-4c6a-9fd6-b59c509439dc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationMessageData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((CommunicationMessageData) data).mRealizedInformationFlow;
            }

            @objid ("fdd1056f-c130-4154-94c7-2dd8e20331d7")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingCommunicationMessageDep();
            }

        }

        @objid ("00158b0a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SignalSignatureSmDependency extends SmSingleDependency {
            @objid ("155bfec0-0c5f-4017-9631-33ec53bf60d4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mSignalSignature;
            }

            @objid ("e1e8dcbb-f4ef-476b-b4b2-92ed55cda923")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mSignalSignature = value;
            }

            @objid ("c053b54f-cc59-4483-ba30-b03b0929a918")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.CommunicationUsageDep();
            }

        }

        @objid ("001605b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ChannelSmDependency extends SmSingleDependency {
            @objid ("3436f9ef-1106-4b5e-aff1-a21192be2600")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mChannel;
            }

            @objid ("cf61b4fe-f25b-4177-bed3-2382452b9e71")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mChannel = value;
            }

            @objid ("1873fb14-8c1e-473b-918f-e7f3f4cc651d")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.StartToEndMessageDep();
            }

        }

        @objid ("d06c71b1-eb32-478d-992a-d0b53482df76")
        public static class InvertedChannelSmDependency extends SmSingleDependency {
            @objid ("b00773ac-4feb-4102-95ca-e1c0c409016a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mInvertedChannel;
            }

            @objid ("bc371655-87ae-46f1-b715-e346512495f9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mInvertedChannel = value;
            }

            @objid ("aa2504d2-e687-4ede-874b-f15613ab328f")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.EndToStartMessageDep();
            }

        }

    }

}
