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
package org.modelio.metamodel.data.uml.informationFlow;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.activityModel.ActivityEdgeData;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationMessageData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.MessageData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.AssociationEndData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.LinkEndData;
import org.modelio.metamodel.data.uml.statik.NameSpaceData;
import org.modelio.metamodel.data.uml.statik.NaryLinkData;
import org.modelio.metamodel.data.uml.statik.StructuralFeatureData;
import org.modelio.metamodel.impl.uml.informationFlow.InformationFlowImpl;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
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

@objid ("0063bfb4-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=InformationFlow.class, factory=InformationFlowData.Metadata.ObjectFactory.class)
public class InformationFlowData extends ModelElementData {
    @objid ("532ada2f-60ca-4052-b41b-11e4e38b2400")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("d4d7c98a-3f8f-4ddd-8608-e94bc5d3d135")
    @SmaMetaAssociation(metaName="InformationSource", typeDataClass=ModelElementData.class, min=1, max=-1, smAssociationClass=Metadata.InformationSourceSmDependency.class, partof = true)
     List<SmObjectImpl> mInformationSource = null;

    @objid ("61f13bc2-e4ce-4a77-bc56-24bab6e272f6")
    @SmaMetaAssociation(metaName="InformationTarget", typeDataClass=ModelElementData.class, min=1, max=-1, smAssociationClass=Metadata.InformationTargetSmDependency.class, partof = true)
     List<SmObjectImpl> mInformationTarget = null;

    @objid ("0fdbc667-0ba8-4bb0-b81e-302017be0008")
    @SmaMetaAssociation(metaName="RealizingActivityEdge", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingActivityEdgeSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingActivityEdge = null;

    @objid ("05e2cd1f-2db5-44eb-9f00-585ea760e077")
    @SmaMetaAssociation(metaName="RealizingCommunicationMessage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingCommunicationMessageSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingCommunicationMessage = null;

    @objid ("fcf6416a-87f7-4b4e-9bde-7ed231c85963")
    @SmaMetaAssociation(metaName="RealizingFeature", typeDataClass=StructuralFeatureData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingFeatureSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingFeature = null;

    @objid ("f11ec28c-520e-4838-9155-634593bd1596")
    @SmaMetaAssociation(metaName="RealizingLink", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingLinkSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingLink = null;

    @objid ("59acc51a-63c0-409c-bb54-0c615506fd84")
    @SmaMetaAssociation(metaName="RealizingMessage", typeDataClass=MessageData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingMessageSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingMessage = null;

    @objid ("e1250649-642f-49a2-b23d-78c700132ee7")
    @SmaMetaAssociation(metaName="RealizingNaryLink", typeDataClass=NaryLinkData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingNaryLinkSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingNaryLink = null;

    @objid ("974dfb20-7e5e-45db-978e-5b6a7f34e37b")
    @SmaMetaAssociation(metaName="Conveyed", typeDataClass=ClassifierData.class, min=1, max=-1, smAssociationClass=Metadata.ConveyedSmDependency.class, partof = true)
     List<SmObjectImpl> mConveyed = null;

    @objid ("6d26a8e4-8273-4f83-a9e5-0843e88044be")
    @SmaMetaAssociation(metaName="Channel", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.ChannelSmDependency.class, partof = true)
     SmObjectImpl mChannel;

    @objid ("a6877ac9-e54c-4ad8-8b1c-e8bb7ab64a70")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006afae0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("98c8d093-3692-4915-b168-5e12cccc285b")
        private static SmClass smClass = null;

        @objid ("fc7d311b-a27f-4ad1-b1d3-27d15c991e65")
        private static SmDependency OwnerDep = null;

        @objid ("08779daa-ab25-477b-8fdc-2665ecc07321")
        private static SmDependency InformationSourceDep = null;

        @objid ("d2b2291c-59ed-4ebf-bca9-5d52a350e57d")
        private static SmDependency InformationTargetDep = null;

        @objid ("791d5213-acf5-4770-a49a-1adfdede88f4")
        private static SmDependency RealizingActivityEdgeDep = null;

        @objid ("e957b921-96bd-430a-a291-d2ffd4c62ee1")
        private static SmDependency RealizingCommunicationMessageDep = null;

        @objid ("486a907f-6c4c-4bf0-9457-599586eb207b")
        private static SmDependency RealizingFeatureDep = null;

        @objid ("668d6fef-0b24-4014-8e46-b569dca6c56c")
        private static SmDependency RealizingLinkDep = null;

        @objid ("0b808454-778e-427d-8df5-fc64481faf7d")
        private static SmDependency RealizingMessageDep = null;

        @objid ("1d49486a-d55e-4537-82a0-fd0a8494af1a")
        private static SmDependency RealizingNaryLinkDep = null;

        @objid ("aff032bc-3349-41df-a5f4-bb63f24aaaff")
        private static SmDependency ConveyedDep = null;

        @objid ("ee89079a-9db8-45f7-b28f-5378d80a212f")
        private static SmDependency ChannelDep = null;

        @objid ("382fa7b5-b717-4ba9-8c22-7db057e1cf97")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InformationFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("c4afb408-0946-4995-af7d-a6a24b9c12f0")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("cda6a2b4-8bf2-4402-9fe2-6467cdf1d36d")
        public static SmDependency InformationSourceDep() {
            if (InformationSourceDep == null) {
            	InformationSourceDep = classof().getDependencyDef("InformationSource");
            }
            return InformationSourceDep;
        }

        @objid ("11e17e42-7d5c-40c8-b6ee-f24883e0629d")
        public static SmDependency InformationTargetDep() {
            if (InformationTargetDep == null) {
            	InformationTargetDep = classof().getDependencyDef("InformationTarget");
            }
            return InformationTargetDep;
        }

        @objid ("1ba42d3c-87ce-4183-af63-74a2d5a9e39e")
        public static SmDependency RealizingActivityEdgeDep() {
            if (RealizingActivityEdgeDep == null) {
            	RealizingActivityEdgeDep = classof().getDependencyDef("RealizingActivityEdge");
            }
            return RealizingActivityEdgeDep;
        }

        @objid ("c83a0bc1-8da6-4211-9591-6685c34ab440")
        public static SmDependency RealizingCommunicationMessageDep() {
            if (RealizingCommunicationMessageDep == null) {
            	RealizingCommunicationMessageDep = classof().getDependencyDef("RealizingCommunicationMessage");
            }
            return RealizingCommunicationMessageDep;
        }

        @objid ("acc86748-1216-4c27-bf16-7b297d4196ac")
        public static SmDependency RealizingFeatureDep() {
            if (RealizingFeatureDep == null) {
            	RealizingFeatureDep = classof().getDependencyDef("RealizingFeature");
            }
            return RealizingFeatureDep;
        }

        @objid ("35faaee8-9942-46dd-b0da-99c30bf78117")
        public static SmDependency RealizingLinkDep() {
            if (RealizingLinkDep == null) {
            	RealizingLinkDep = classof().getDependencyDef("RealizingLink");
            }
            return RealizingLinkDep;
        }

        @objid ("e12ed198-b2f1-4463-a761-9ddcc9f8d6f2")
        public static SmDependency RealizingMessageDep() {
            if (RealizingMessageDep == null) {
            	RealizingMessageDep = classof().getDependencyDef("RealizingMessage");
            }
            return RealizingMessageDep;
        }

        @objid ("a847bcbc-cd47-4974-b2b1-1dda8c0f9159")
        public static SmDependency RealizingNaryLinkDep() {
            if (RealizingNaryLinkDep == null) {
            	RealizingNaryLinkDep = classof().getDependencyDef("RealizingNaryLink");
            }
            return RealizingNaryLinkDep;
        }

        @objid ("54b086ad-ca38-4c6a-8768-1ecf577ccc0b")
        public static SmDependency ConveyedDep() {
            if (ConveyedDep == null) {
            	ConveyedDep = classof().getDependencyDef("Conveyed");
            }
            return ConveyedDep;
        }

        @objid ("9a8035a7-4bc7-4091-aefc-c78d63c5e630")
        public static SmDependency ChannelDep() {
            if (ChannelDep == null) {
            	ChannelDep = classof().getDependencyDef("Channel");
            }
            return ChannelDep;
        }

        @objid ("db2e8612-0a45-48f2-8fc7-c39303d2f703")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f7b7ab6d-51aa-40bf-be7c-15c57cd652f0")
        public static SmDependency getRealizingCommunicationMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingCommunicationMessageDep;
        }

        @objid ("65014705-7831-4a11-bc30-643c4a2653c1")
        public static SmDependency getInformationTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InformationTargetDep;
        }

        @objid ("c8ea482a-2396-4e53-b4a7-3f4d15bde8c1")
        public static SmDependency getInformationSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InformationSourceDep;
        }

        @objid ("f9c6f30d-65cc-4363-b4e1-5b07c1b0d515")
        public static SmDependency getRealizingMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingMessageDep;
        }

        @objid ("00d768c3-2cc1-4b39-8e3f-f8d5b6a07b8d")
        public static SmDependency getRealizingActivityEdgeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingActivityEdgeDep;
        }

        @objid ("b4c1587a-755c-4503-bb4b-89d884152dd3")
        public static SmDependency getRealizingNaryLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingNaryLinkDep;
        }

        @objid ("952bcfc5-ad5f-48b3-9603-c437c4a706d1")
        public static SmDependency getRealizingFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingFeatureDep;
        }

        @objid ("d32f66f1-8d95-4bec-8090-2f8facbff0ac")
        public static SmDependency getChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChannelDep;
        }

        @objid ("d41419fd-9bb6-4834-a115-b0394d8f5b45")
        public static SmDependency getConveyedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConveyedDep;
        }

        @objid ("906766c4-baa1-4938-aeef-d115ad73d02a")
        public static SmDependency getRealizingLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingLinkDep;
        }

        @objid ("9f2e4d12-ff4b-47f5-a1b8-cdbb108bafe7")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("006b3c30-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b6952b86-a86b-4d4f-90ee-d0fbd93fb91e")
            public ISmObjectData createData() {
                return new InformationFlowData();
            }

            @objid ("f49c4142-42b7-4e60-a0b9-a4930e39436e")
            public SmObjectImpl createImpl() {
                return new InformationFlowImpl();
            }

        }

        @objid ("006ba0c6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingLinkSmDependency extends SmMultipleDependency {
            @objid ("e1d1e712-a69b-468c-a224-dc0cefa60554")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingLink != null)? ((InformationFlowData)data).mRealizingLink:SmMultipleDependency.EMPTY;
            }

            @objid ("f8f002ae-3cb6-43b1-839e-8a96ad7d4d57")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingLink = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingLink;
            }

            @objid ("54d624e8-98c1-44ea-a588-0e3dc9095535")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006c0372-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingFeatureSmDependency extends SmMultipleDependency {
            @objid ("84c4a9ba-ae52-4785-9d4d-3dc2c8ba0bb2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingFeature != null)? ((InformationFlowData)data).mRealizingFeature:SmMultipleDependency.EMPTY;
            }

            @objid ("aad44a22-78cc-4645-bbe3-d0bc8cd9b918")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingFeature = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingFeature;
            }

            @objid ("78092339-ef08-499d-acd6-e21fc65adc8a")
            @Override
            public SmDependency getSymetric() {
                return StructuralFeatureData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006d4caa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingActivityEdgeSmDependency extends SmMultipleDependency {
            @objid ("9cfda172-6671-45c9-b2b6-474a30925b59")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingActivityEdge != null)? ((InformationFlowData)data).mRealizingActivityEdge:SmMultipleDependency.EMPTY;
            }

            @objid ("0524359d-eaf0-47d5-bffe-d9d35730e391")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingActivityEdge = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingActivityEdge;
            }

            @objid ("8f99cf9d-f091-4107-9d00-a925ed1d7c9e")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006dc00e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingMessageSmDependency extends SmMultipleDependency {
            @objid ("319e16ca-53b8-409c-8542-543234009d9a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingMessage != null)? ((InformationFlowData)data).mRealizingMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("6335d4c3-ca00-4fba-85a6-8653a0e1f565")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingMessage = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingMessage;
            }

            @objid ("efa41711-30e9-43a9-82fd-afdc998bb07b")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006e2ddc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ConveyedSmDependency extends SmMultipleDependency {
            @objid ("34242049-07a6-4a84-b192-630dac676979")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mConveyed != null)? ((InformationFlowData)data).mConveyed:SmMultipleDependency.EMPTY;
            }

            @objid ("318a2390-2264-4951-b6de-47bc3b9d79b2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mConveyed = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mConveyed;
            }

            @objid ("76ac7007-a3ad-4009-8f8e-ad8b4a01f0f2")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.ConveyerDep();
            }

        }

        @objid ("006e947a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InformationTargetSmDependency extends SmMultipleDependency {
            @objid ("5d86a120-31fe-4c4b-adda-a651170d03ac")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mInformationTarget != null)? ((InformationFlowData)data).mInformationTarget:SmMultipleDependency.EMPTY;
            }

            @objid ("c2c14c0a-752a-4c0e-aaa8-69dbdd227651")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mInformationTarget = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mInformationTarget;
            }

            @objid ("7290c052-9065-405e-9e88-0e3971dcd361")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ReceivedInfoDep();
            }

        }

        @objid ("006efa0a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InformationSourceSmDependency extends SmMultipleDependency {
            @objid ("a72e5d02-50f0-45ea-8dfc-e617b98d886d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mInformationSource != null)? ((InformationFlowData)data).mInformationSource:SmMultipleDependency.EMPTY;
            }

            @objid ("244e60ce-f573-4344-8bf0-f9046fb0a0bb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mInformationSource = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mInformationSource;
            }

            @objid ("24b7c0c1-6a72-4a32-aafd-9463311031e5")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.SentInfoDep();
            }

        }

        @objid ("006f676a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("1763eef4-b98b-4a22-b0ea-10735190605a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InformationFlowData) data).mOwner;
            }

            @objid ("5a0f4ffa-1af7-4108-9bf5-6904037e8a5f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InformationFlowData) data).mOwner = value;
            }

            @objid ("4683196a-0344-4325-a305-8e70f0fc66fa")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedInformationFlowDep();
            }

        }

        @objid ("006fe096-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingCommunicationMessageSmDependency extends SmMultipleDependency {
            @objid ("8c561048-09f0-4ed4-8b96-e6f7fc3170ce")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingCommunicationMessage != null)? ((InformationFlowData)data).mRealizingCommunicationMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("f1298500-2ab2-4558-a700-8a8eaaa41340")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingCommunicationMessage = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingCommunicationMessage;
            }

            @objid ("c2d030a7-9142-449d-993a-27108ad41379")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("00704798-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ChannelSmDependency extends SmSingleDependency {
            @objid ("33232996-43d9-44e6-9c27-3a11c55b6c61")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InformationFlowData) data).mChannel;
            }

            @objid ("31eb7724-b818-4308-a6fa-a08295b6e2f5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InformationFlowData) data).mChannel = value;
            }

            @objid ("16752cab-bc32-45fa-9c47-43c2e564ee78")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.SentDep();
            }

        }

        @objid ("0070139a-17f2-10a1-88a0-001ec947cd2a")
        public static class RealizingNaryLinkSmDependency extends SmMultipleDependency {
            @objid ("7529b56f-f0bd-477c-9994-2043fe12df5d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingNaryLink != null)? ((InformationFlowData)data).mRealizingNaryLink:SmMultipleDependency.EMPTY;
            }

            @objid ("8ed8c54d-300c-434c-9019-3de825dde1c0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingNaryLink = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingNaryLink;
            }

            @objid ("dff8bd4a-51f0-4207-bd74-e22383318398")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.RealizedInformationFlowDep();
            }

        }

    }

}
