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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.bpmn.objects.BpmnItemAwareElementData;
import org.modelio.metamodel.data.uml.behavior.activityModel.ObjectNodeData;
import org.modelio.metamodel.data.uml.informationFlow.InformationFlowData;
import org.modelio.metamodel.data.uml.statik.AssociationData;
import org.modelio.metamodel.data.uml.statik.AttributeData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.LinkEndData;
import org.modelio.metamodel.impl.uml.statik.AssociationEndImpl;
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.metamodel.uml.statik.AssociationEnd;
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

@objid ("0097b0da-c4be-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=AssociationEnd.class, factory=AssociationEndData.Metadata.ObjectFactory.class)
public class AssociationEndData extends StructuralFeatureData {
    @objid ("ef318bc1-fe2b-4882-ad2f-6aea186c5bb5")
    @SmaMetaAttribute(metaName="Aggregation", type=AggregationKind.class, smAttributeClass=Metadata.AggregationSmAttribute.class)
     Object mAggregation = AggregationKind.KINDISASSOCIATION;

    @objid ("b71a47ac-6568-4d18-ae48-7b085d558b3c")
    @SmaMetaAttribute(metaName="IsChangeable", type=Boolean.class, smAttributeClass=Metadata.IsChangeableSmAttribute.class)
     Object mIsChangeable = true;

    @objid ("3e69aa27-5902-4fd3-8a06-21e1552ca316")
    @SmaMetaAssociation(metaName="Target", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("18c5caac-b5c3-48e9-acfa-cebff9704fdd")
    @SmaMetaAssociation(metaName="OppositeOwner", typeDataClass=AssociationEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeOwnerSmDependency.class)
     SmObjectImpl mOppositeOwner;

    @objid ("bd7b8d02-9de4-40be-a4ea-6441aace2911")
    @SmaMetaAssociation(metaName="Source", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.SourceSmDependency.class, partof = true)
     SmObjectImpl mSource;

    @objid ("832d6584-0b47-4774-ab8d-5d26fc8d00e6")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("ce58f8b6-3c15-45ff-9b16-b33f654d1ff6")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.SentSmDependency.class)
     List<SmObjectImpl> mSent = null;

    @objid ("454c6f6c-964e-4c82-b59c-2d9117a1eb05")
    @SmaMetaAssociation(metaName="Qualifier", typeDataClass=AttributeData.class, min=0, max=-1, smAssociationClass=Metadata.QualifierSmDependency.class, component = true)
     List<SmObjectImpl> mQualifier = null;

    @objid ("98c5e7fb-60c3-43fd-9748-b96edda7cf5a")
    @SmaMetaAssociation(metaName="Opposite", typeDataClass=AssociationEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeSmDependency.class, sharedComponent = true, partof = true)
     SmObjectImpl mOpposite;

    @objid ("5919420c-d31d-4fe4-a0c7-3c79dc86c5f9")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("424dfeb1-a88e-492e-a685-3bc90dc80705")
    @SmaMetaAssociation(metaName="Association", typeDataClass=AssociationData.class, min=0, max=1, smAssociationClass=Metadata.AssociationSmDependency.class, sharedComponent = true)
     SmObjectImpl mAssociation;

    @objid ("80609710-bf2a-495c-b720-6629cc96ebae")
    @SmaMetaAssociation(metaName="RepresentingItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingItemSmDependency.class)
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("dbba7682-45ec-41e1-8194-09b7fecfe637")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002868d8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("20a89456-6337-41f3-9f8d-d8f4a8be273d")
        private static SmClass smClass = null;

        @objid ("b0bee09c-beff-4fea-981c-7e7d150d5df5")
        private static SmAttribute AggregationAtt = null;

        @objid ("42359385-6461-4968-9308-fa6c8ce64a7c")
        private static SmAttribute IsChangeableAtt = null;

        @objid ("edecf716-be4a-451d-bce7-6cfb80e32050")
        private static SmDependency TargetDep = null;

        @objid ("6b13b26f-db3e-43ac-83ef-e5d0ea468c8e")
        private static SmDependency OppositeOwnerDep = null;

        @objid ("36ffa8c5-ecff-4cfd-a7c6-775082a170da")
        private static SmDependency SourceDep = null;

        @objid ("5e2e2a4f-ca54-4ff0-abc9-52c76f794b6b")
        private static SmDependency OccurenceDep = null;

        @objid ("5a8a968c-4267-4ddc-a863-89a52fd628ac")
        private static SmDependency SentDep = null;

        @objid ("2e9e0fbf-f3d7-42e4-999d-b7245f9e8a75")
        private static SmDependency QualifierDep = null;

        @objid ("a130ebba-35f3-4069-94b3-fcc4fd2280f1")
        private static SmDependency OppositeDep = null;

        @objid ("be4350ca-89c9-4adb-9c17-a835f256d20a")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("271c0b06-c29a-4ae4-8260-a480b07f40b0")
        private static SmDependency AssociationDep = null;

        @objid ("7f301648-0790-4893-89e2-9f6bd661a0df")
        private static SmDependency RepresentingItemDep = null;

        @objid ("b467610b-d5d9-43f6-9e9c-e1c38a603987")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AssociationEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("79f0030c-715b-41ac-9d8a-0a4c2c12cbda")
        public static SmAttribute AggregationAtt() {
            if (AggregationAtt == null) {
            	AggregationAtt = classof().getAttributeDef("Aggregation");
            }
            return AggregationAtt;
        }

        @objid ("b7c36242-3e72-4584-af61-14d61fc60729")
        public static SmAttribute IsChangeableAtt() {
            if (IsChangeableAtt == null) {
            	IsChangeableAtt = classof().getAttributeDef("IsChangeable");
            }
            return IsChangeableAtt;
        }

        @objid ("82575eea-20ef-4012-b34c-c1c1dbaec1b4")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("1a5efeb8-91d2-45ba-b338-c573f837cd68")
        public static SmDependency OppositeOwnerDep() {
            if (OppositeOwnerDep == null) {
            	OppositeOwnerDep = classof().getDependencyDef("OppositeOwner");
            }
            return OppositeOwnerDep;
        }

        @objid ("0f9c2599-3d6b-468b-be3e-c37ac2a10a90")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("d95604eb-101c-477b-9e40-3e84b997751d")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("ca6d67d0-bde8-49a3-867e-b08b0642974f")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("5eae20d7-764a-43fc-8bfe-2145066e6bf3")
        public static SmDependency QualifierDep() {
            if (QualifierDep == null) {
            	QualifierDep = classof().getDependencyDef("Qualifier");
            }
            return QualifierDep;
        }

        @objid ("61146af5-ebf1-4f3b-9d99-e43917b82544")
        public static SmDependency OppositeDep() {
            if (OppositeDep == null) {
            	OppositeDep = classof().getDependencyDef("Opposite");
            }
            return OppositeDep;
        }

        @objid ("356fe6f3-34fa-4acc-9648-75b018de3dcf")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("3c718937-575a-4e6b-be4b-739abc7b00af")
        public static SmDependency AssociationDep() {
            if (AssociationDep == null) {
            	AssociationDep = classof().getDependencyDef("Association");
            }
            return AssociationDep;
        }

        @objid ("b376e403-da7e-47c2-a891-5c867938697f")
        public static SmDependency RepresentingItemDep() {
            if (RepresentingItemDep == null) {
            	RepresentingItemDep = classof().getDependencyDef("RepresentingItem");
            }
            return RepresentingItemDep;
        }

        @objid ("2a99ba9a-80a1-487a-ab84-46d4fcb6aa8f")
        public static SmDependency getAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociationDep;
        }

        @objid ("239a5d94-b1c1-4510-b1fd-1e4a707aa318")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("21d81ae7-9508-487b-afca-787f20ec1aaa")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("54a0c493-c486-4f25-8df5-e5627273f300")
        public static SmAttribute getAggregationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AggregationAtt;
        }

        @objid ("b6e6bfb8-bb76-4e16-9113-b6e27aabcd62")
        public static SmDependency getRepresentingItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingItemDep;
        }

        @objid ("d767bc62-aec2-4491-bcbb-e8943529959f")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("9d08efe2-5001-468c-bc17-2a24a6d0db32")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("817501f3-e999-4c2c-b72a-62db36b4ce15")
        public static SmDependency getOppositeOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeOwnerDep;
        }

        @objid ("b0f9b9cd-17b2-41f5-870c-88e05dd81091")
        public static SmAttribute getIsChangeableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsChangeableAtt;
        }

        @objid ("0d6affc1-9cd1-4e58-9d96-375953d183c1")
        public static SmDependency getQualifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifierDep;
        }

        @objid ("df2ab421-e3da-4cb1-8758-2ddf2f6ef62f")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("0c3b64aa-9e59-426f-a1be-0aa6041745ee")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("77e34d3e-bdf7-47dc-b01c-2d3e722b4c33")
        public static SmDependency getOppositeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeDep;
        }

        @objid ("0028b0b8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("63975f79-f7b8-4197-ac61-70ae06d33785")
            public ISmObjectData createData() {
                return new AssociationEndData();
            }

            @objid ("c4d4ddf1-50d4-440f-8ce0-4fb377d2a6a7")
            public SmObjectImpl createImpl() {
                return new AssociationEndImpl();
            }

        }

        @objid ("00291350-c4c5-1fd8-97fe-001ec947cd2a")
        public static class AggregationSmAttribute extends SmAttribute {
            @objid ("ab705300-10b6-43ad-82ae-f1ab2e587bca")
            public Object getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mAggregation;
            }

            @objid ("379fbfb3-89d9-4654-a5a9-f4448475d525")
            public void setValue(ISmObjectData data, Object value) {
                ((AssociationEndData) data).mAggregation = value;
            }

        }

        @objid ("002a38d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("3156e361-9860-4fe4-b257-19229f3b6ffc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mOccurence != null)? ((AssociationEndData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("8dbfe038-dd99-47f6-ad20-7a464f8e3ec6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mOccurence;
            }

            @objid ("b6a1ccd5-b8a1-44ab-8a7d-532edff9c972")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.ModelDep();
            }

        }

        @objid ("002a9c16-c4c5-1fd8-97fe-001ec947cd2a")
        public static class QualifierSmDependency extends SmMultipleDependency {
            @objid ("6e82f69b-5311-43d7-8842-4414f654222d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mQualifier != null)? ((AssociationEndData)data).mQualifier:SmMultipleDependency.EMPTY;
            }

            @objid ("54865866-15f4-4aa7-883a-9bdb5cafcfc5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mQualifier = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mQualifier;
            }

            @objid ("7e29b3f5-e6fa-44b0-bc99-e10981490b08")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.QualifiedDep();
            }

        }

        @objid ("002aff80-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("6d0ac117-823f-4d6d-ad39-9a2ef259b150")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mRepresentingObjectNode != null)? ((AssociationEndData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("ba6bc154-dd76-4eb6-99c2-9174384785c6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mRepresentingObjectNode;
            }

            @objid ("73a3a986-d2e6-42c2-95ae-064159977d30")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedRoleDep();
            }

        }

        @objid ("002b63bc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingItemSmDependency extends SmMultipleDependency {
            @objid ("7714b665-6e40-469f-b7d0-035288c9ec2f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mRepresentingItem != null)? ((AssociationEndData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
            }

            @objid ("95729c76-8e73-482c-adaa-8aaa42534909")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mRepresentingItem = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mRepresentingItem;
            }

            @objid ("d0331d00-5984-4b43-b63f-a765b3615167")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.RepresentedAssociationEndDep();
            }

        }

        @objid ("002c3f26-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OppositeSmDependency extends SmSingleDependency {
            @objid ("2f03cd2a-03af-4e26-b7a2-a6ddacc47446")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mOpposite;
            }

            @objid ("b448dcee-9007-43ed-b73c-a3094eaaf4a1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mOpposite = value;
            }

            @objid ("6e18b402-6e35-4a5c-ae5c-26d71a39e05f")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.OppositeOwnerDep();
            }

        }

        @objid ("002cb5d2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SentSmDependency extends SmMultipleDependency {
            @objid ("881c2e3a-d5ea-4a02-a7a7-8671ae57c0bb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mSent != null)? ((AssociationEndData)data).mSent:SmMultipleDependency.EMPTY;
            }

            @objid ("faf9c54a-debf-4b13-bcff-dffc7333534e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mSent = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mSent;
            }

            @objid ("e7ab933d-4124-4981-9f6a-919c542265d2")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.ChannelDep();
            }

        }

        @objid ("002d1c7a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("44a8b0f4-67a1-4c93-b89b-9ce59bdc6945")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mTarget;
            }

            @objid ("30bba015-ab25-4688-bb6d-6af2071b773a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mTarget = value;
            }

            @objid ("10032eaf-8c57-4dd5-8ebe-26baa9f2feb8")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.TargetingEndDep();
            }

        }

        @objid ("00706ed0-18c8-1080-943a-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("7d699de2-8402-4a26-bdfa-97ab7baf1f0e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mSource;
            }

            @objid ("08cbf815-0895-4a85-a9fa-464bc57cc540")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mSource = value;
            }

            @objid ("697eaf69-49e6-467d-b2b5-db557a2467aa")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedEndDep();
            }

        }

        @objid ("004d5f44-5fb6-1085-8e91-001ec947cd2a")
        public static class OppositeOwnerSmDependency extends SmSingleDependency {
            @objid ("08a12b59-ea30-4101-8d62-300cd539e7a3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mOppositeOwner;
            }

            @objid ("e6852c5d-91ed-46d4-a131-34f0bf8ea590")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mOppositeOwner = value;
            }

            @objid ("cae924fe-d55e-4af6-810a-d8524e1ae8eb")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.OppositeDep();
            }

        }

        @objid ("c3f652d3-33d8-11e2-b9f1-002564c97630")
        public static class IsChangeableSmAttribute extends SmAttribute {
            @objid ("4ae54bc8-3237-4cec-bb89-335f056dce67")
            public Object getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mIsChangeable;
            }

            @objid ("a465c5e1-da6a-4338-918b-6ca9d340454f")
            public void setValue(ISmObjectData data, Object value) {
                ((AssociationEndData) data).mIsChangeable = value;
            }

        }

        @objid ("aa940df3-73a7-4e1c-b015-2e219c2646d3")
        public static class AssociationSmDependency extends SmSingleDependency {
            @objid ("1f2ec115-bad2-46f1-9d0f-1d6358f61513")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mAssociation;
            }

            @objid ("5757ee62-4c87-4d2c-bd7e-59bb12e54329")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mAssociation = value;
            }

            @objid ("f549d7f6-465b-4ad0-8cfe-0b7fc3ab85f2")
            @Override
            public SmDependency getSymetric() {
                return AssociationData.Metadata.EndDep();
            }

        }

    }

}
