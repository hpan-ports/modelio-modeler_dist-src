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
    @objid ("ebd7100f-66e8-44ff-ac1b-b88b3bb176d8")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=NameSpaceData.class, min=0, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("9d3349be-a338-4db4-8221-434ce03f1e3b")
    @SmaMetaAssociation(metaName="InformationSource", typeDataClass=ModelElementData.class, min=1, max=-1, smAssociationClass=Metadata.InformationSourceSmDependency.class, partof = true)
     List<SmObjectImpl> mInformationSource = null;

    @objid ("508b0f81-a782-483f-a7fd-696a809ab667")
    @SmaMetaAssociation(metaName="InformationTarget", typeDataClass=ModelElementData.class, min=1, max=-1, smAssociationClass=Metadata.InformationTargetSmDependency.class, partof = true)
     List<SmObjectImpl> mInformationTarget = null;

    @objid ("1eb793c3-a52c-4c4b-bbbf-0395d6c45233")
    @SmaMetaAssociation(metaName="RealizingActivityEdge", typeDataClass=ActivityEdgeData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingActivityEdgeSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingActivityEdge = null;

    @objid ("73951d3d-48aa-4f6a-a0e1-9c7e413704ce")
    @SmaMetaAssociation(metaName="RealizingCommunicationMessage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingCommunicationMessageSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingCommunicationMessage = null;

    @objid ("78366006-98fd-4106-8a96-7c666f565148")
    @SmaMetaAssociation(metaName="RealizingFeature", typeDataClass=StructuralFeatureData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingFeatureSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingFeature = null;

    @objid ("511cb3f0-7f50-4565-bcc6-c8356ea5c72d")
    @SmaMetaAssociation(metaName="RealizingLink", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingLinkSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingLink = null;

    @objid ("c74e5972-b71b-41b5-a1f5-48cd30542298")
    @SmaMetaAssociation(metaName="RealizingMessage", typeDataClass=MessageData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingMessageSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingMessage = null;

    @objid ("8decaf41-7b4c-42cb-b738-f26e16cbdab6")
    @SmaMetaAssociation(metaName="RealizingNaryLink", typeDataClass=NaryLinkData.class, min=0, max=-1, smAssociationClass=Metadata.RealizingNaryLinkSmDependency.class, partof = true)
     List<SmObjectImpl> mRealizingNaryLink = null;

    @objid ("f110e8a2-f6b3-41a6-a6a7-ee4ee699521f")
    @SmaMetaAssociation(metaName="Conveyed", typeDataClass=ClassifierData.class, min=1, max=-1, smAssociationClass=Metadata.ConveyedSmDependency.class, partof = true)
     List<SmObjectImpl> mConveyed = null;

    @objid ("9061c292-ecf8-4a2e-858f-a2ce3c6ca1e8")
    @SmaMetaAssociation(metaName="Channel", typeDataClass=AssociationEndData.class, min=0, max=1, smAssociationClass=Metadata.ChannelSmDependency.class, partof = true)
     SmObjectImpl mChannel;

    @objid ("593cc12f-f197-441b-b8f6-7a4f851d2425")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("006afae0-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e12a45a1-46b5-4a97-ae40-306c21054bd6")
        private static SmClass smClass = null;

        @objid ("67753277-1427-4fdc-beeb-155cb8e64bbb")
        private static SmDependency OwnerDep = null;

        @objid ("aab4a0fa-94c8-419a-9ba0-333cf19f9311")
        private static SmDependency InformationSourceDep = null;

        @objid ("31abd6e2-3df7-4e03-9216-853c9ec28749")
        private static SmDependency InformationTargetDep = null;

        @objid ("7f70b167-f043-4e99-89a4-9b40500f5c69")
        private static SmDependency RealizingActivityEdgeDep = null;

        @objid ("db3fd05f-4ceb-49d8-862a-b27b998d248c")
        private static SmDependency RealizingCommunicationMessageDep = null;

        @objid ("f2459d7e-50bb-49ee-b874-2f191546d755")
        private static SmDependency RealizingFeatureDep = null;

        @objid ("bc919a2f-ba0c-4280-974f-e380a807b394")
        private static SmDependency RealizingLinkDep = null;

        @objid ("f6f1a04e-d4bd-409d-b6eb-545caa5973aa")
        private static SmDependency RealizingMessageDep = null;

        @objid ("0c89a44f-9d1f-471f-93b3-8ba81d6baff9")
        private static SmDependency RealizingNaryLinkDep = null;

        @objid ("34879a08-d136-472d-a5e9-5dac11ecda80")
        private static SmDependency ConveyedDep = null;

        @objid ("6e64b9c2-c348-4c10-9f5f-37cc4bf30914")
        private static SmDependency ChannelDep = null;

        @objid ("177fe20b-3c08-4445-81c7-ea4ae6be8ed7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(InformationFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5e670cf0-b269-4d2b-a6ec-392760418316")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("173ccc3c-003a-46da-944c-6ceca91a5916")
        public static SmDependency InformationSourceDep() {
            if (InformationSourceDep == null) {
            	InformationSourceDep = classof().getDependencyDef("InformationSource");
            }
            return InformationSourceDep;
        }

        @objid ("e48d3ccb-03bd-4fc7-be49-72229b53fe72")
        public static SmDependency InformationTargetDep() {
            if (InformationTargetDep == null) {
            	InformationTargetDep = classof().getDependencyDef("InformationTarget");
            }
            return InformationTargetDep;
        }

        @objid ("09b8a17c-39a9-4570-9738-80b452105049")
        public static SmDependency RealizingActivityEdgeDep() {
            if (RealizingActivityEdgeDep == null) {
            	RealizingActivityEdgeDep = classof().getDependencyDef("RealizingActivityEdge");
            }
            return RealizingActivityEdgeDep;
        }

        @objid ("1bca933f-67f0-4b28-9d91-b1a3175b86f8")
        public static SmDependency RealizingCommunicationMessageDep() {
            if (RealizingCommunicationMessageDep == null) {
            	RealizingCommunicationMessageDep = classof().getDependencyDef("RealizingCommunicationMessage");
            }
            return RealizingCommunicationMessageDep;
        }

        @objid ("24130df1-d0f4-4cab-9fac-7c6ebf685171")
        public static SmDependency RealizingFeatureDep() {
            if (RealizingFeatureDep == null) {
            	RealizingFeatureDep = classof().getDependencyDef("RealizingFeature");
            }
            return RealizingFeatureDep;
        }

        @objid ("68d709da-764e-4623-84d4-557327c7f6ab")
        public static SmDependency RealizingLinkDep() {
            if (RealizingLinkDep == null) {
            	RealizingLinkDep = classof().getDependencyDef("RealizingLink");
            }
            return RealizingLinkDep;
        }

        @objid ("2bf0de97-47c7-4917-a129-71bae64c4412")
        public static SmDependency RealizingMessageDep() {
            if (RealizingMessageDep == null) {
            	RealizingMessageDep = classof().getDependencyDef("RealizingMessage");
            }
            return RealizingMessageDep;
        }

        @objid ("6479a922-a4d4-4ddf-b49e-9587d2764db5")
        public static SmDependency RealizingNaryLinkDep() {
            if (RealizingNaryLinkDep == null) {
            	RealizingNaryLinkDep = classof().getDependencyDef("RealizingNaryLink");
            }
            return RealizingNaryLinkDep;
        }

        @objid ("8c5eb22a-21cc-4b11-99cc-4e29f55108ac")
        public static SmDependency ConveyedDep() {
            if (ConveyedDep == null) {
            	ConveyedDep = classof().getDependencyDef("Conveyed");
            }
            return ConveyedDep;
        }

        @objid ("c825b502-d9fb-4691-8634-a762edf41692")
        public static SmDependency ChannelDep() {
            if (ChannelDep == null) {
            	ChannelDep = classof().getDependencyDef("Channel");
            }
            return ChannelDep;
        }

        @objid ("c0d67847-3ff4-4f2c-bb56-a067e72f1656")
        public static SmDependency getRealizingMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingMessageDep;
        }

        @objid ("c5fa623b-640f-4fa6-9239-79121fd1e2a9")
        public static SmDependency getRealizingLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingLinkDep;
        }

        @objid ("0851a125-3003-4d53-8988-8f96b7299342")
        public static SmDependency getRealizingFeatureDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingFeatureDep;
        }

        @objid ("c26c1f3d-c39d-4a84-8518-cf4544431d42")
        public static SmDependency getRealizingCommunicationMessageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingCommunicationMessageDep;
        }

        @objid ("9fb9fc78-aba0-4e71-95ae-8d8a23acaa26")
        public static SmDependency getRealizingActivityEdgeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingActivityEdgeDep;
        }

        @objid ("e0432853-e6fa-4089-bf61-da439e6918c8")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("14a00f1b-f603-4adc-8d02-0c9992bbc3f4")
        public static SmDependency getInformationSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InformationSourceDep;
        }

        @objid ("a47cbfc3-9985-458e-8fd9-cbcbb4c657b9")
        public static SmDependency getInformationTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InformationTargetDep;
        }

        @objid ("661468e4-e2e5-4a6d-ac5a-153dc15bc29a")
        public static SmDependency getChannelDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChannelDep;
        }

        @objid ("b69255b2-de3b-4e1a-80e3-d0dc14943bdf")
        public static SmDependency getRealizingNaryLinkDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RealizingNaryLinkDep;
        }

        @objid ("f2ccb473-2da1-4ddb-b308-846daddce07e")
        public static SmDependency getConveyedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConveyedDep;
        }

        @objid ("d5334821-97cb-4512-8044-086322bc3dfa")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("006b3c30-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8e8378fe-3588-46f3-913c-bfa64e81a995")
            public ISmObjectData createData() {
                return new InformationFlowData();
            }

            @objid ("ae86ebfa-d5da-48b1-bb3f-03af40bf18a6")
            public SmObjectImpl createImpl() {
                return new InformationFlowImpl();
            }

        }

        @objid ("006ba0c6-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingLinkSmDependency extends SmMultipleDependency {
            @objid ("1d6be004-7684-488e-bfc5-08da86cfe363")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingLink != null)? ((InformationFlowData)data).mRealizingLink:SmMultipleDependency.EMPTY;
            }

            @objid ("2b2b4f7c-3d9e-4de9-8ff8-74ff857c61d3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingLink = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingLink;
            }

            @objid ("b5b64af3-6084-4428-bf60-49129ba16040")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006c0372-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingFeatureSmDependency extends SmMultipleDependency {
            @objid ("773dbc27-f22f-4406-8055-3f5765ae6b5a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingFeature != null)? ((InformationFlowData)data).mRealizingFeature:SmMultipleDependency.EMPTY;
            }

            @objid ("b99a5f45-50a9-4c66-9406-bdd70c8a0829")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingFeature = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingFeature;
            }

            @objid ("71bd6fec-dfef-4d8b-9144-fb642b7c41e7")
            @Override
            public SmDependency getSymetric() {
                return StructuralFeatureData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006d4caa-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingActivityEdgeSmDependency extends SmMultipleDependency {
            @objid ("fed52c5c-f3f3-4f34-9c9d-4b178d2b66c7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingActivityEdge != null)? ((InformationFlowData)data).mRealizingActivityEdge:SmMultipleDependency.EMPTY;
            }

            @objid ("844c53a4-8d8c-4530-a6b9-478c95a3e29f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingActivityEdge = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingActivityEdge;
            }

            @objid ("2ca70449-0f0b-4753-a29b-bacb83cfd90e")
            @Override
            public SmDependency getSymetric() {
                return ActivityEdgeData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006dc00e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingMessageSmDependency extends SmMultipleDependency {
            @objid ("2c71ec43-a639-47e4-b195-594656962809")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingMessage != null)? ((InformationFlowData)data).mRealizingMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("1bb6cf9e-9e0a-4ba3-ac48-79b5fa79bfa3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingMessage = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingMessage;
            }

            @objid ("eaf400f1-e51c-4e9d-9005-c3431089e778")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("006e2ddc-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ConveyedSmDependency extends SmMultipleDependency {
            @objid ("b6f4112f-1ac2-4942-95a4-693ed23eeae4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mConveyed != null)? ((InformationFlowData)data).mConveyed:SmMultipleDependency.EMPTY;
            }

            @objid ("f345536e-7468-476f-b093-652de1c8c14d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mConveyed = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mConveyed;
            }

            @objid ("3779bd7b-85ce-4de7-a627-5cc201db59eb")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.ConveyerDep();
            }

        }

        @objid ("006e947a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InformationTargetSmDependency extends SmMultipleDependency {
            @objid ("edbf9183-29cd-4cea-a6f1-16a52c5cc8fe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mInformationTarget != null)? ((InformationFlowData)data).mInformationTarget:SmMultipleDependency.EMPTY;
            }

            @objid ("513d532b-d85c-41cf-92c3-d2cdb4b43c96")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mInformationTarget = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mInformationTarget;
            }

            @objid ("f9b199e2-f887-4338-885b-935328c4da97")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.ReceivedInfoDep();
            }

        }

        @objid ("006efa0a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class InformationSourceSmDependency extends SmMultipleDependency {
            @objid ("df3836ba-df44-430b-b3f8-cc5f44fad3b2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mInformationSource != null)? ((InformationFlowData)data).mInformationSource:SmMultipleDependency.EMPTY;
            }

            @objid ("d36afdf9-2791-4e24-b10c-3eb740dba97b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mInformationSource = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mInformationSource;
            }

            @objid ("62ba84a1-8d86-4b7b-9bca-5509669cc89d")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.SentInfoDep();
            }

        }

        @objid ("006f676a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("d94c0a76-6a3d-4929-b572-f7bfc751ffa9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InformationFlowData) data).mOwner;
            }

            @objid ("53da3e17-2bab-4935-941d-d5751d6e9a27")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InformationFlowData) data).mOwner = value;
            }

            @objid ("1bdf1cd3-507d-4cb6-af06-8b70a027e645")
            @Override
            public SmDependency getSymetric() {
                return NameSpaceData.Metadata.OwnedInformationFlowDep();
            }

        }

        @objid ("006fe096-c4c3-1fd8-97fe-001ec947cd2a")
        public static class RealizingCommunicationMessageSmDependency extends SmMultipleDependency {
            @objid ("f9ce4757-5a01-421e-860b-a826d3c85bee")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingCommunicationMessage != null)? ((InformationFlowData)data).mRealizingCommunicationMessage:SmMultipleDependency.EMPTY;
            }

            @objid ("dbdb4096-c3e1-499d-8298-de910fc4182c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingCommunicationMessage = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingCommunicationMessage;
            }

            @objid ("040d136c-089b-4e52-8cf7-bffa59bc34a8")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.RealizedInformationFlowDep();
            }

        }

        @objid ("00704798-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ChannelSmDependency extends SmSingleDependency {
            @objid ("6e3c0d29-c4e8-460a-827e-9329a12c1544")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((InformationFlowData) data).mChannel;
            }

            @objid ("1700ae83-9f30-45de-9c93-aa149b80aa7d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((InformationFlowData) data).mChannel = value;
            }

            @objid ("2dbdd558-e707-4c23-b2c8-c8ac114f9072")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.SentDep();
            }

        }

        @objid ("0070139a-17f2-10a1-88a0-001ec947cd2a")
        public static class RealizingNaryLinkSmDependency extends SmMultipleDependency {
            @objid ("6b8ce463-380e-413d-8522-bf2268663c3b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((InformationFlowData)data).mRealizingNaryLink != null)? ((InformationFlowData)data).mRealizingNaryLink:SmMultipleDependency.EMPTY;
            }

            @objid ("9b7eef13-90de-43ce-88fa-2af20e6da1ca")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((InformationFlowData) data).mRealizingNaryLink = new ArrayList<>(initialCapacity);
                return ((InformationFlowData) data).mRealizingNaryLink;
            }

            @objid ("32bb5368-806c-42e7-a28a-fd1a1de663a5")
            @Override
            public SmDependency getSymetric() {
                return NaryLinkData.Metadata.RealizedInformationFlowDep();
            }

        }

    }

}
