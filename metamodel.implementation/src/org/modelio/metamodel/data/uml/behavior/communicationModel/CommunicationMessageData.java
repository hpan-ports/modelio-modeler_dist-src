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
    @objid ("ccd5b4c7-944d-40f3-9c27-02408ef46e1b")
    @SmaMetaAttribute(metaName="Argument", type=String.class, smAttributeClass=Metadata.ArgumentSmAttribute.class)
     Object mArgument = "";

    @objid ("f053616d-6798-4b2d-8582-2f8bece921ce")
    @SmaMetaAttribute(metaName="Sequence", type=String.class, smAttributeClass=Metadata.SequenceSmAttribute.class)
     Object mSequence = "";

    @objid ("ab9d388f-d0cf-4eb8-b0b6-6963ff61cc55")
    @SmaMetaAttribute(metaName="SortOfMessage", type=MessageSort.class, smAttributeClass=Metadata.SortOfMessageSmAttribute.class)
     Object mSortOfMessage = MessageSort.SYNCCALL;

    @objid ("d660e586-f830-480c-af5e-e923eadde76e")
    @SmaMetaAssociation(metaName="RealizedInformationFlow", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.RealizedInformationFlowSmDependency.class)
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("84515c5d-dc48-4539-9bef-146bc7271e86")
    @SmaMetaAssociation(metaName="Channel", typeDataClass=CommunicationChannelData.class, min=0, max=1, smAssociationClass=Metadata.ChannelSmDependency.class)
     SmObjectImpl mChannel;

    @objid ("32d90e58-cc51-4410-8ba0-9a5f9cb2e468")
    @SmaMetaAssociation(metaName="InvertedChannel", typeDataClass=CommunicationChannelData.class, min=0, max=1, smAssociationClass=Metadata.InvertedChannelSmDependency.class)
     SmObjectImpl mInvertedChannel;

    @objid ("cfcc4adb-0ec9-4c27-9285-d07c3fd3cae5")
    @SmaMetaAssociation(metaName="Invoked", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.InvokedSmDependency.class, partof = true)
     SmObjectImpl mInvoked;

    @objid ("306959c0-76b0-4af1-bcaf-0dd59c3d66ea")
    @SmaMetaAssociation(metaName="SignalSignature", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.SignalSignatureSmDependency.class, partof = true)
     SmObjectImpl mSignalSignature;

    @objid ("27efc2b8-87e0-435d-896d-23e4e78937e5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0011ffa8-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("478cfd2f-ef66-4fec-8803-71e015173684")
        private static SmClass smClass = null;

        @objid ("ed7dd346-5baf-47e7-bbd2-8418988a647d")
        private static SmAttribute ArgumentAtt = null;

        @objid ("d22aae44-7bfd-448c-be78-4e8476a4d8c6")
        private static SmAttribute SequenceAtt = null;

        @objid ("21714df1-7e75-4f66-9ba0-57c31c912cb8")
        private static SmAttribute SortOfMessageAtt = null;

        @objid ("72f7912d-59da-4abe-acce-9e92ecd77aac")
        private static SmDependency RealizedInformationFlowDep = null;

        @objid ("33ac6f13-a92b-4b6b-b065-2ad4aef6da7d")
        private static SmDependency ChannelDep = null;

        @objid ("18174d6b-5ba2-4d15-a779-3b0636807133")
        private static SmDependency InvertedChannelDep = null;

        @objid ("fa8c58e8-3450-4bab-bf7b-f5990c548d51")
        private static SmDependency InvokedDep = null;

        @objid ("cde5f008-fbf1-45ef-89da-1ebbedc9c4c5")
        private static SmDependency SignalSignatureDep = null;

        @objid ("15f0fbf1-b0d1-44f4-9060-29c29e7fa283")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(CommunicationMessageData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8f25f5d7-c371-4640-b7ba-b93de80536e0")
        public static SmAttribute ArgumentAtt() {
            if (ArgumentAtt == null) {
            	ArgumentAtt = classof().getAttributeDef("Argument");
            }
            return ArgumentAtt;
        }

        @objid ("2f85fcd3-5c91-40b6-8c8a-110458d458b0")
        public static SmAttribute SequenceAtt() {
            if (SequenceAtt == null) {
            	SequenceAtt = classof().getAttributeDef("Sequence");
            }
            return SequenceAtt;
        }

        @objid ("57591262-9598-4c9f-a9a6-73992eba9b7b")
        public static SmAttribute SortOfMessageAtt() {
            if (SortOfMessageAtt == null) {
            	SortOfMessageAtt = classof().getAttributeDef("SortOfMessage");
            }
            return SortOfMessageAtt;
        }

        @objid ("855b5be8-1dfa-42f8-82cc-9b4ff29344e0")
        public static SmDependency RealizedInformationFlowDep() {
            if (RealizedInformationFlowDep == null) {
            	RealizedInformationFlowDep = classof().getDependencyDef("RealizedInformationFlow");
            }
            return RealizedInformationFlowDep;
        }

        @objid ("1174ae32-94e4-4978-86d2-3ff98adf974f")
        public static SmDependency ChannelDep() {
            if (ChannelDep == null) {
            	ChannelDep = classof().getDependencyDef("Channel");
            }
            return ChannelDep;
        }

        @objid ("49c4d74f-f9ed-488d-83f5-e0d5d4ed8fc2")
        public static SmDependency InvertedChannelDep() {
            if (InvertedChannelDep == null) {
            	InvertedChannelDep = classof().getDependencyDef("InvertedChannel");
            }
            return InvertedChannelDep;
        }

        @objid ("d30665d5-805e-4570-9256-b1127e51e73a")
        public static SmDependency InvokedDep() {
            if (InvokedDep == null) {
            	InvokedDep = classof().getDependencyDef("Invoked");
            }
            return InvokedDep;
        }

        @objid ("d8fec2e4-6562-4c3d-9e16-7e0234bfafa5")
        public static SmDependency SignalSignatureDep() {
            if (SignalSignatureDep == null) {
            	SignalSignatureDep = classof().getDependencyDef("SignalSignature");
            }
            return SignalSignatureDep;
        }

        @objid ("c7c2203e-47c6-4f17-999a-ab84a28ffdc5")
        public static SmAttribute getSortOfMessageAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SortOfMessageAtt;
        }

        @objid ("37802172-8e54-447b-8038-09538daba79c")
        public static SmDependency getRealizedInformationFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizedInformationFlowDep;
        }

        @objid ("344168f1-70db-4f2d-a49e-d899bb0af268")
        public static SmAttribute getSequenceAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SequenceAtt;
        }

        @objid ("804d6c6e-827e-4345-8779-59e29293af23")
        public static SmDependency getSignalSignatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SignalSignatureDep;
        }

        @objid ("508425ad-fcda-41b5-a658-6ee562c9fc38")
        public static SmAttribute getArgumentAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArgumentAtt;
        }

        @objid ("b888f5a9-7121-4f4b-8f4d-31c4eb7d1ddb")
        public static SmDependency getInvertedChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvertedChannelDep;
        }

        @objid ("eb0d09b9-3a40-4da1-8523-48a72b10021c")
        public static SmDependency getChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChannelDep;
        }

        @objid ("f12d2fa5-82e3-4fdf-8c63-29d9e1810508")
        public static SmDependency getInvokedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvokedDep;
        }

        @objid ("ccec2a45-7762-4452-b2a3-019878672912")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00124170-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("699f9804-165b-4068-a623-341fb410ff0e")
            public ISmObjectData createData() {
                return new CommunicationMessageData();
            }

            @objid ("e1f17b9e-41bb-4da2-84bd-ad9681bfc0af")
            public SmObjectImpl createImpl() {
                return new CommunicationMessageImpl();
            }

        }

        @objid ("0012a41c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ArgumentSmAttribute extends SmAttribute {
            @objid ("628d0617-a785-43e8-bf59-f06387f157a4")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mArgument;
            }

            @objid ("b1f59b78-46da-4f41-9f9a-2a130b034462")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationMessageData) data).mArgument = value;
            }

        }

        @objid ("001306d2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SequenceSmAttribute extends SmAttribute {
            @objid ("0c849dcd-f574-41f0-9c69-59bc5291c7f1")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mSequence;
            }

            @objid ("f8a23d83-1fb3-4b1f-9f98-ab67df53c4c0")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationMessageData) data).mSequence = value;
            }

        }

        @objid ("00144146-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SortOfMessageSmAttribute extends SmAttribute {
            @objid ("fb3c0625-60e1-4930-90ed-f1613309f9ab")
            public Object getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mSortOfMessage;
            }

            @objid ("0410b53f-fcd9-4e94-9953-cbaea8f62c75")
            public void setValue(ISmObjectData data, Object value) {
                ((CommunicationMessageData) data).mSortOfMessage = value;
            }

        }

        @objid ("0014abae-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InvokedSmDependency extends SmSingleDependency {
            @objid ("06ee80a4-a44a-4ec3-b54d-1e55c1f4e355")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mInvoked;
            }

            @objid ("c2e1efca-26f1-4bdb-8fcb-da6262e79741")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mInvoked = value;
            }

            @objid ("7e1aae8a-72d7-464c-98da-392a2db578f8")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CommunicationUsageDep();
            }

        }

        @objid ("0015248a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizedInformationFlowSmDependency extends SmMultipleDependency {
            @objid ("7bf182ad-a01c-437a-a425-6917933478bf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((CommunicationMessageData)data).mRealizedInformationFlow != null)? ((CommunicationMessageData)data).mRealizedInformationFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("1060ad43-f307-45b7-9eb2-4d61cae35640")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((CommunicationMessageData) data).mRealizedInformationFlow = new ArrayList<>(initialCapacity);
                return ((CommunicationMessageData) data).mRealizedInformationFlow;
            }

            @objid ("0738714a-59af-4500-bf99-4c7709fe265b")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.RealizingCommunicationMessageDep();
            }

        }

        @objid ("00158b0a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SignalSignatureSmDependency extends SmSingleDependency {
            @objid ("8bfc20f9-c0bb-4d75-9d7a-2f880663d14d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mSignalSignature;
            }

            @objid ("eafe77bc-6bf4-44b5-b3d7-e2a823edf1b3")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mSignalSignature = value;
            }

            @objid ("f0eb68fd-0437-4ad9-b984-727989c9e044")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.CommunicationUsageDep();
            }

        }

        @objid ("001605b2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ChannelSmDependency extends SmSingleDependency {
            @objid ("7a1f125a-8a61-469a-802b-8d6b68e2d043")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mChannel;
            }

            @objid ("284c05f8-28f7-4e44-b3db-08a6a3f793ad")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mChannel = value;
            }

            @objid ("e2be02fb-9e2a-4080-a6ef-92c3dd4bc5d3")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.StartToEndMessageDep();
            }

        }

        @objid ("d06c71b1-eb32-478d-992a-d0b53482df76")
        public static class InvertedChannelSmDependency extends SmSingleDependency {
            @objid ("28c0b8dc-06d7-401b-bb91-5cad1e71fa88")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((CommunicationMessageData) data).mInvertedChannel;
            }

            @objid ("8893fac2-db73-4743-9b1e-801e1c3a9bf6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((CommunicationMessageData) data).mInvertedChannel = value;
            }

            @objid ("ab90e47e-a88a-4c33-8474-3cc45af832c7")
            @Override
            public SmDependency getSymetric() {
                return CommunicationChannelData.Metadata.EndToStartMessageDep();
            }

        }

    }

}
