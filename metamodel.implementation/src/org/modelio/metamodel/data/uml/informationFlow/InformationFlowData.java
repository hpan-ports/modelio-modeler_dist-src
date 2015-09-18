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
    @objid ("8a767c5c-ba2f-4a3b-989f-6cd1f6c14653")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("f0392ad2-8b16-47f8-83e1-bdfe8e740a0c")
    @SmaMetaAssociation(metaName="InformationSource", typeDataClass=ModelElementData.class, min=1, max=-1, smAssociationClass=Metadata.InformationSourceSmDependency.class, partof = true)
     List<SmObjectImpl> mInformationSource = null;

    @objid ("37cec005-ea43-446c-9054-c042546edc84")
    @SmaMetaAssociation(metaName="InformationTarget", typeDataClass=ModelElementData.class, min=1, max=-1, smAssociationClass=Metadata.InformationTargetSmDependency.class, partof = true)
     List<SmObjectImpl> mInformationTarget = null;

    @objid ("5de2808f-71b6-4013-8e39-4c4f8220df48")
    @SmaMetaAssociation(metaName="RealizingActivityEdge", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingActivityEdgeSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingActivityEdge = null;

    @objid ("a1b09613-7ca2-4db1-9670-c2fe3ac68e9e")
    @SmaMetaAssociation(metaName="RealizingCommunicationMessage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingCommunicationMessageSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingCommunicationMessage = null;

    @objid ("f612ef5e-9d0b-40da-a566-450444d64ec8")
    @SmaMetaAssociation(metaName="RealizingFeature", typeDataClass=StructuralFeatureData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingFeatureSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingFeature = null;

    @objid ("48f2c986-39f6-441e-94af-e80083356ade")
    @SmaMetaAssociation(metaName="RealizingLink", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingLinkSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingLink = null;

    @objid ("3dee4e3d-5556-45f5-bc2d-92e65abc1133")
    @SmaMetaAssociation(metaName="RealizingMessage", typeDataClass=MessageData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingMessageSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingMessage = null;

    @objid ("da8d99a1-14c2-4738-b9d2-fbbceb563584")
    @SmaMetaAssociation(metaName="RealizingNaryLink", typeDataClass=NaryLinkData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingNaryLinkSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingNaryLink = null;

    @objid ("dfd995c0-4150-4364-81ba-8c6407ded14f")
    @SmaMetaAssociation(metaName="Conveyed", typeDataClass=ClassifierData.class, min=1, max=-1, smAssociationClass=Metadata.ConveyedSmDependency.class, partof = true)
     List<SmObjectImpl> mConveyed = null;

    @objid ("b110c712-ee21-4154-a636-9b5108b9bcda")
    @SmaMetaAssociation(metaName="Channel", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.ChannelSmDependency.class, partof = true)
     SmObjectImpl mChannel;

    @objid ("7103601a-8d9e-4b81-bdb8-a26ba513b27a")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006afae0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c305a63b-afc2-4326-b0c4-595909b2d73f")
        private static SmClass smClass = null;

        @objid ("577cb383-5e1f-41f7-8f4d-657648bfd840")
        private static SmDependency OwnerDep = null;

        @objid ("eea0e4a6-eb12-4660-a902-b8b1769fb2bf")
        private static SmDependency InformationSourceDep = null;

        @objid ("6efb3c1d-0ca5-4cd4-b3b8-880c282b70d9")
        private static SmDependency InformationTargetDep = null;

        @objid ("79e3a440-9cf2-4c5e-9c82-4eaf79830c38")
        private static SmDependency RealizingActivityEdgeDep = null;

        @objid ("af0735f0-3934-4471-9671-ed49396bc615")
        private static SmDependency RealizingCommunicationMessageDep = null;

        @objid ("6a1b0bfc-7546-42f5-a42d-effb39897a09")
        private static SmDependency RealizingFeatureDep = null;

        @objid ("d12564ab-0f64-49f2-80c1-b1bea1f235fe")
        private static SmDependency RealizingLinkDep = null;

        @objid ("8613c1f8-5ffb-4da7-847f-4949cb49e732")
        private static SmDependency RealizingMessageDep = null;

        @objid ("9a457fce-4b3b-4bfa-8aeb-2fe46c279484")
        private static SmDependency RealizingNaryLinkDep = null;

        @objid ("6a8c0013-3e24-460e-bee5-c8ba25a320c4")
        private static SmDependency ConveyedDep = null;

        @objid ("a8042fc1-aaa9-4d1b-b96f-4008f8bcc273")
        private static SmDependency ChannelDep = null;

        @objid ("c29b5f21-6ef8-4456-981e-e6b334e70a53")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InformationFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("facdf32c-b99f-4190-ad77-a50856906740")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("c4dfc489-910c-41ff-ad11-23cbaa38f923")
        public static SmDependency InformationSourceDep() {
            if (InformationSourceDep == null) {
            	InformationSourceDep = classof().getDependencyDef("InformationSource");
            }
            return InformationSourceDep;
        }

        @objid ("9692b543-da0d-4d20-a3ab-9b7d2c2d0991")
        public static SmDependency InformationTargetDep() {
            if (InformationTargetDep == null) {
            	InformationTargetDep = classof().getDependencyDef("InformationTarget");
            }
            return InformationTargetDep;
        }

        @objid ("fdc4069c-ab04-406f-8496-0b6bfb402436")
        public static SmDependency RealizingActivityEdgeDep() {
            if (RealizingActivityEdgeDep == null) {
            	RealizingActivityEdgeDep = classof().getDependencyDef("RealizingActivityEdge");
            }
            return RealizingActivityEdgeDep;
        }

        @objid ("6dd70f97-29f4-4ec6-8010-5e055417e909")
        public static SmDependency RealizingCommunicationMessageDep() {
            if (RealizingCommunicationMessageDep == null) {
            	RealizingCommunicationMessageDep = classof().getDependencyDef("RealizingCommunicationMessage");
            }
            return RealizingCommunicationMessageDep;
        }

        @objid ("f6b84a0e-463a-40cb-bd9a-338b72174892")
        public static SmDependency RealizingFeatureDep() {
            if (RealizingFeatureDep == null) {
            	RealizingFeatureDep = classof().getDependencyDef("RealizingFeature");
            }
            return RealizingFeatureDep;
        }

        @objid ("8f15935d-4bd3-4ea5-a0ca-514ef4d7f2c1")
        public static SmDependency RealizingLinkDep() {
            if (RealizingLinkDep == null) {
            	RealizingLinkDep = classof().getDependencyDef("RealizingLink");
            }
            return RealizingLinkDep;
        }

        @objid ("43b629b8-cf0f-4d61-8840-aafe68551eb4")
        public static SmDependency RealizingMessageDep() {
            if (RealizingMessageDep == null) {
            	RealizingMessageDep = classof().getDependencyDef("RealizingMessage");
            }
            return RealizingMessageDep;
        }

        @objid ("7ec2222c-7440-4ceb-819a-f92418ab3705")
        public static SmDependency RealizingNaryLinkDep() {
            if (RealizingNaryLinkDep == null) {
            	RealizingNaryLinkDep = classof().getDependencyDef("RealizingNaryLink");
            }
            return RealizingNaryLinkDep;
        }

        @objid ("f90df457-109e-424d-b0a6-2eaacc072996")
        public static SmDependency ConveyedDep() {
            if (ConveyedDep == null) {
            	ConveyedDep = classof().getDependencyDef("Conveyed");
            }
            return ConveyedDep;
        }

        @objid ("b08f2946-226d-4b3a-b2aa-df215dbdc3a5")
        public static SmDependency ChannelDep() {
            if (ChannelDep == null) {
            	ChannelDep = classof().getDependencyDef("Channel");
            }
            return ChannelDep;
        }

        @objid ("9d76337c-a9f5-411b-8a75-8c258c34caa5")
        public static SmDependency getRealizingLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingLinkDep;
        }

        @objid ("a377f1d3-e8ef-4729-9860-cecc202e5c3b")
        public static SmDependency getRealizingFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingFeatureDep;
        }

        @objid ("28806e7a-4e6f-4b38-a3c5-a97dbc5d1411")
        public static SmDependency getRealizingCommunicationMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingCommunicationMessageDep;
        }

        @objid ("e6d9d300-77ba-418c-871b-c98b0d42b94b")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("3ae5a2d9-3907-4db6-8438-2dffbebc9d76")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("39fe1986-22f8-4c9d-8b12-26c13a20acea")
        public static SmDependency getChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChannelDep;
        }

        @objid ("f6cd7dfc-19cb-43fc-aaf2-66a28d7790d0")
        public static SmDependency getRealizingMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingMessageDep;
        }

        @objid ("eaf894e0-ca08-4150-bf28-e43698c77dea")
        public static SmDependency getInformationTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InformationTargetDep;
        }

        @objid ("71f3a896-0b50-47dd-8e3b-139661ba2c40")
        public static SmDependency getRealizingNaryLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingNaryLinkDep;
        }

        @objid ("ddd4132d-c38a-45b8-8cb5-7c5ec2c61f9e")
        public static SmDependency getInformationSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InformationSourceDep;
        }

        @objid ("9227da10-0c58-4970-9c53-bf734c0a6be1")
        public static SmDependency getConveyedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConveyedDep;
        }

        @objid ("6502949a-3781-43d7-9b5e-fce34169fa75")
        public static SmDependency getRealizingActivityEdgeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingActivityEdgeDep;
        }

        @objid ("006b3c30-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("aa880477-9edf-4524-b881-d6fd8116e52d")
            public ISmObjectData createData() {
                return new InformationFlowData();
            }

            @objid ("003f97d8-b03f-4797-ab4a-9d828b88f519")
            public SmObjectImpl createImpl() {
                return new InformationFlowImpl();
            }

        }

        @objid ("006ba0c6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingLinkSmDependency extends SmMultipleDependency {
            @objid ("2501d7ab-4956-4bca-a83b-628e101c65fb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingLink != null)? ((InformationFlowData)data).mRealizingLink:SmMultipleDependency.EMPTY;
            }

            @objid ("01a97a85-ccbc-44b8-b137-a520d7137309")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingLink = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingLink;
            }

            @objid ("c6294cb6-a95d-41c4-9870-63f1cc8c4686")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006c0372-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingFeatureSmDependency extends SmMultipleDependency {
            @objid ("bbf87d29-4192-4080-97be-b37e320d0e43")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingFeature != null)? ((InformationFlowData)data).mRealizingFeature:SmMultipleDependency.EMPTY;
            }

            @objid ("2e9087d5-8e97-4a84-8170-ab01ab1a6a0b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingFeature = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingFeature;
            }

            @objid ("564861ee-03df-437e-a96a-61d27f678b97")
            @Override
            public SmDependency getSymetric() {
                return StructuralFeatureData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006d4caa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingActivityEdgeSmDependency extends SmMultipleDependency {
            @objid ("6e2971e9-204f-490e-ac81-aa1ca11bee60")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingActivityEdge != null)? ((InformationFlowData)data).mRealizingActivityEdge:SmMultipleDependency.EMPTY;
            }

            @objid ("7996333f-a662-4bcc-98ef-30aa28473594")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingActivityEdge = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingActivityEdge;
            }

            @objid ("2f35aaf2-2972-4bc2-acad-d6d1ee5d18a1")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006dc00e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingMessageSmDependency extends SmMultipleDependency {
            @objid ("2057b95f-2185-4ebb-b568-36248779e951")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingMessage != null)? ((InformationFlowData)data).mRealizingMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("3ce79004-50db-42af-8c48-88934aa7da1e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingMessage = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingMessage;
            }

            @objid ("9f454a7c-89c0-4df6-86de-ddbd17aef03c")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006e2ddc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ConveyedSmDependency extends SmMultipleDependency {
            @objid ("926d84a4-6756-4474-88a8-c1b8606d57b3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mConveyed != null)? ((InformationFlowData)data).mConveyed:SmMultipleDependency.EMPTY;
            }

            @objid ("d4f432b1-d8fa-4506-99f7-34bc7fc40033")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mConveyed = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mConveyed;
            }

            @objid ("47ec9194-b9cd-4cf7-a5bf-511908e65e33")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.ConveyerDep();
            }

        }

        @objid ("006e947a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InformationTargetSmDependency extends SmMultipleDependency {
            @objid ("ccf14501-12a4-4988-9bc1-ef7fb29ffbd4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mInformationTarget != null)? ((InformationFlowData)data).mInformationTarget:SmMultipleDependency.EMPTY;
            }

            @objid ("4ed392d0-941e-4e09-9d43-84f372792750")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mInformationTarget = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mInformationTarget;
            }

            @objid ("8ce62c21-9f1c-4560-a33d-c9bf2586c4c2")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ReceivedInfoDep();
            }

        }

        @objid ("006efa0a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InformationSourceSmDependency extends SmMultipleDependency {
            @objid ("08ec0db9-efce-4913-9e46-7287fb208a5d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mInformationSource != null)? ((InformationFlowData)data).mInformationSource:SmMultipleDependency.EMPTY;
            }

            @objid ("c9fa7722-03ed-442c-87ae-55a6da59eaa0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mInformationSource = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mInformationSource;
            }

            @objid ("2816241c-bd10-4469-bf7b-75e3617e1c51")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.SentInfoDep();
            }

        }

        @objid ("006f676a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("7ccd15cb-bdad-4979-ab7d-2fc5a98446c3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InformationFlowData) data).mOwner;
            }

            @objid ("3d855dd3-a6c4-452a-9a22-dea8ba85ea7b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InformationFlowData) data).mOwner = value;
            }

            @objid ("9278f7aa-009b-4ccb-898e-541858331a28")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedInformationFlowDep();
            }

        }

        @objid ("006fe096-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingCommunicationMessageSmDependency extends SmMultipleDependency {
            @objid ("9dd72fb3-2bd7-4450-b141-03eb6eefcc31")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingCommunicationMessage != null)? ((InformationFlowData)data).mRealizingCommunicationMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("ce51157e-a725-4977-98eb-17251596094e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingCommunicationMessage = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingCommunicationMessage;
            }

            @objid ("824e36e0-50e4-4717-9568-ec8d7b3c1255")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("00704798-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ChannelSmDependency extends SmSingleDependency {
            @objid ("035c31da-63af-4ea2-bfd8-29b51fcef867")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InformationFlowData) data).mChannel;
            }

            @objid ("63ee4cfa-0537-428d-ac27-f33ac5357225")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InformationFlowData) data).mChannel = value;
            }

            @objid ("750f2e33-ada7-48e6-90f7-2d03702b1958")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.SentDep();
            }

        }

        @objid ("0070139a-17f2-10a1-88a0-001ec947cd2a")
        public static class RealizingNaryLinkSmDependency extends SmMultipleDependency {
            @objid ("8afea02b-e01b-4931-9878-785929f934cc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingNaryLink != null)? ((InformationFlowData)data).mRealizingNaryLink:SmMultipleDependency.EMPTY;
            }

            @objid ("13a3e66c-b80e-479d-a2d9-7d1d4c03bba2")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingNaryLink = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingNaryLink;
            }

            @objid ("ad96afce-9922-4ae3-acb0-2010c845e209")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.RealizedInformationFlowDep();
            }

        }

    }

}
