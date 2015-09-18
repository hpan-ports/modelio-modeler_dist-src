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
    @objid ("6d612c61-9825-426a-9ea7-bd126c31c561")
    @SmaMetaAttribute(metaName="Aggregation", type=AggregationKind.class, smAttributeClass=Metadata.AggregationSmAttribute.class)
     Object mAggregation = AggregationKind.KINDISASSOCIATION;

    @objid ("604ed9dc-c129-43c7-abf2-7bc65d287fc0")
    @SmaMetaAttribute(metaName="IsChangeable", type=Boolean.class, smAttributeClass=Metadata.IsChangeableSmAttribute.class)
     Object mIsChangeable = true;

    @objid ("eabe7a70-f2b6-40a2-a142-71d053441d8a")
    @SmaMetaAssociation(metaName="Target", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("13e6b0cb-564e-489a-99ee-52654673210d")
    @SmaMetaAssociation(metaName="OppositeOwner", typeDataClass=AssociationEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeOwnerSmDependency.class)
     SmObjectImpl mOppositeOwner;

    @objid ("13236958-3790-4cdd-a2ad-d93c3fb52634")
    @SmaMetaAssociation(metaName="Source", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.SourceSmDependency.class, partof = true)
     SmObjectImpl mSource;

    @objid ("8be5e6cc-1952-4cb3-b62d-a762e7cab801")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("0b402394-df0e-4dbb-9414-e722b184c1e5")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.SentSmDependency.class)
     List<SmObjectImpl> mSent = null;

    @objid ("dcaafaa8-2aca-4a9a-86c3-193e417100d6")
    @SmaMetaAssociation(metaName="Qualifier", typeDataClass=AttributeData.class, min=0, max=-1, smAssociationClass=Metadata.QualifierSmDependency.class, component = true)
     List<SmObjectImpl> mQualifier = null;

    @objid ("819f82e0-55e8-4f0c-8ed7-744b848a607f")
    @SmaMetaAssociation(metaName="Opposite", typeDataClass=AssociationEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeSmDependency.class, sharedComponent = true, partof = true)
     SmObjectImpl mOpposite;

    @objid ("c3dde00f-0487-474c-9786-7db847a08021")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("6dd6f117-a614-43b9-87f4-e9fb1529d5a3")
    @SmaMetaAssociation(metaName="Association", typeDataClass=AssociationData.class, min=0, max=1, smAssociationClass=Metadata.AssociationSmDependency.class, sharedComponent = true)
     SmObjectImpl mAssociation;

    @objid ("2e68be01-1bc8-4690-b914-ce1421ea96c1")
    @SmaMetaAssociation(metaName="RepresentingItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingItemSmDependency.class)
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("07f123bc-2efe-4a4c-b522-fbfdc2419f46")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002868d8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d8d90367-9399-49c5-bd8d-0735e5d39aea")
        private static SmClass smClass = null;

        @objid ("088e12ab-b679-41f0-8ae5-d4031e4a24b3")
        private static SmAttribute AggregationAtt = null;

        @objid ("7ebfb1e3-6392-4ed6-b4c6-50dc606d5221")
        private static SmAttribute IsChangeableAtt = null;

        @objid ("0433e458-c5fa-418a-bf95-098187b51f5b")
        private static SmDependency TargetDep = null;

        @objid ("f70cfa0a-afac-4947-9381-53d8835cefad")
        private static SmDependency OppositeOwnerDep = null;

        @objid ("ac56dec2-61b4-4b2b-b870-3b67abaec042")
        private static SmDependency SourceDep = null;

        @objid ("f89cae8a-a127-47d3-ad6a-1e6887958a37")
        private static SmDependency OccurenceDep = null;

        @objid ("28724b0c-9818-44f7-9d01-1ceeded20527")
        private static SmDependency SentDep = null;

        @objid ("70f4a9ed-0dcb-4944-bb2f-e99b9d7af0d5")
        private static SmDependency QualifierDep = null;

        @objid ("10b1587a-ed1b-4238-940a-9ceeb3b3a342")
        private static SmDependency OppositeDep = null;

        @objid ("9c570de0-bf51-40e3-b6ef-ade5c0fd5e35")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("a503cab7-154e-449b-8a68-490a4e189c25")
        private static SmDependency AssociationDep = null;

        @objid ("c4ec3b66-a63f-42b3-a11d-cf7a31976da9")
        private static SmDependency RepresentingItemDep = null;

        @objid ("427e5213-ab04-442c-9587-ab7c01a53dd5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AssociationEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b48f2352-4945-42e2-b516-55c75afd705d")
        public static SmAttribute AggregationAtt() {
            if (AggregationAtt == null) {
            	AggregationAtt = classof().getAttributeDef("Aggregation");
            }
            return AggregationAtt;
        }

        @objid ("f6d42df7-c077-42f6-8d4e-c75fef8f65de")
        public static SmAttribute IsChangeableAtt() {
            if (IsChangeableAtt == null) {
            	IsChangeableAtt = classof().getAttributeDef("IsChangeable");
            }
            return IsChangeableAtt;
        }

        @objid ("3f4ffcb5-3498-419f-86f5-b0feaabc5999")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("660d14c4-e824-4d14-81c6-9176c9e9e641")
        public static SmDependency OppositeOwnerDep() {
            if (OppositeOwnerDep == null) {
            	OppositeOwnerDep = classof().getDependencyDef("OppositeOwner");
            }
            return OppositeOwnerDep;
        }

        @objid ("de32bc25-a9aa-41ab-aed1-17805226dda3")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("7e7138d5-e9d2-4315-92f9-1cebdaaf04ab")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("a5686fe2-ba20-4bb5-b5e7-e13fe1614fb1")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("f2396507-8cae-41af-a36b-d880626fea02")
        public static SmDependency QualifierDep() {
            if (QualifierDep == null) {
            	QualifierDep = classof().getDependencyDef("Qualifier");
            }
            return QualifierDep;
        }

        @objid ("917feec9-13b1-4992-ba91-b0182a665425")
        public static SmDependency OppositeDep() {
            if (OppositeDep == null) {
            	OppositeDep = classof().getDependencyDef("Opposite");
            }
            return OppositeDep;
        }

        @objid ("eae68f64-bf25-44c1-8906-2441499192ba")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("c975c7b4-6c29-4224-a793-39d26e29f31a")
        public static SmDependency AssociationDep() {
            if (AssociationDep == null) {
            	AssociationDep = classof().getDependencyDef("Association");
            }
            return AssociationDep;
        }

        @objid ("91b4c2f1-250c-4479-a8bc-f9ad458c5c03")
        public static SmDependency RepresentingItemDep() {
            if (RepresentingItemDep == null) {
            	RepresentingItemDep = classof().getDependencyDef("RepresentingItem");
            }
            return RepresentingItemDep;
        }

        @objid ("a9638c65-d85a-4bc5-bd00-6b81813516d3")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("99d15b3a-db4b-4e7f-8317-d75dfceb467c")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("b9b8092c-ecac-4e49-a4cc-73449cb768ba")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("25fabe00-8a98-404e-ac4f-9737d5937d8b")
        public static SmAttribute getAggregationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AggregationAtt;
        }

        @objid ("ac31dcf1-339b-413d-9906-b0cde1a0847a")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("8e808513-1e8e-4161-8ade-af014481296b")
        public static SmDependency getRepresentingItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingItemDep;
        }

        @objid ("d5b8251d-8324-470e-9db7-2f1ee50e39a7")
        public static SmDependency getOppositeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeDep;
        }

        @objid ("ca6f5e24-f71a-4ddd-a710-4713f9662ca7")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("66d05f0f-64ff-4d0a-ad64-abf1ea2578a5")
        public static SmAttribute getIsChangeableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsChangeableAtt;
        }

        @objid ("384afe73-65ca-4c0c-a155-4c63f88f67a3")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("df8a1f42-8cf4-40fd-8e58-556832de2c36")
        public static SmDependency getAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociationDep;
        }

        @objid ("53a861dc-f5e4-4d37-81ee-96e84e12a8cf")
        public static SmDependency getQualifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifierDep;
        }

        @objid ("eac5491e-8549-4c61-a62e-e86121f7baea")
        public static SmDependency getOppositeOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeOwnerDep;
        }

        @objid ("0028b0b8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1d7dd5fb-3d96-4e04-91bd-3b10d27144ea")
            public ISmObjectData createData() {
                return new AssociationEndData();
            }

            @objid ("d6bddf9a-915e-4557-a365-5da07a7c2a94")
            public SmObjectImpl createImpl() {
                return new AssociationEndImpl();
            }

        }

        @objid ("00291350-c4c5-1fd8-97fe-001ec947cd2a")
        public static class AggregationSmAttribute extends SmAttribute {
            @objid ("7624171d-3db3-46d8-a2c0-358604d391dc")
            public Object getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mAggregation;
            }

            @objid ("99eeb999-c988-42cb-8d3d-c9ac6658c5c0")
            public void setValue(ISmObjectData data, Object value) {
                ((AssociationEndData) data).mAggregation = value;
            }

        }

        @objid ("002a38d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("57fbe3cb-1c35-4c58-99bd-1af366a73319")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mOccurence != null)? ((AssociationEndData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("c555c993-8850-45d8-a9f0-1a1e32645bf0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mOccurence;
            }

            @objid ("59b15843-5d67-41b6-b413-b6cf0ee80fcd")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.ModelDep();
            }

        }

        @objid ("002a9c16-c4c5-1fd8-97fe-001ec947cd2a")
        public static class QualifierSmDependency extends SmMultipleDependency {
            @objid ("b20eec33-305b-4fa9-8ec5-247a9e7e644b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mQualifier != null)? ((AssociationEndData)data).mQualifier:SmMultipleDependency.EMPTY;
            }

            @objid ("954a6538-28ac-49b2-95d4-daa330593d1c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mQualifier = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mQualifier;
            }

            @objid ("6454ec62-0b62-4fe3-bb0a-e242b76710b0")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.QualifiedDep();
            }

        }

        @objid ("002aff80-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("f0aa3c75-416a-450f-8c60-e7de6030d4e1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mRepresentingObjectNode != null)? ((AssociationEndData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("ce66a296-64b6-4898-b19f-075069147c09")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mRepresentingObjectNode;
            }

            @objid ("6622316e-6ad9-43c9-a929-94912cc79355")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedRoleDep();
            }

        }

        @objid ("002b63bc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingItemSmDependency extends SmMultipleDependency {
            @objid ("27a7ba14-286e-455d-ad9d-80f269a92ed3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mRepresentingItem != null)? ((AssociationEndData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
            }

            @objid ("d8496a51-ce32-4aee-9e14-9691924ee4ab")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mRepresentingItem = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mRepresentingItem;
            }

            @objid ("26bd0794-1bf2-414f-b61a-72d7bbdf114f")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.RepresentedAssociationEndDep();
            }

        }

        @objid ("002c3f26-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OppositeSmDependency extends SmSingleDependency {
            @objid ("0dfa7687-849b-4f38-a04d-1126c03c7fab")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mOpposite;
            }

            @objid ("1d510378-6bba-43ea-89f2-cebfc43f5d1a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mOpposite = value;
            }

            @objid ("ef7ee880-bdbf-42ca-8c1b-8ee5730cb757")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.OppositeOwnerDep();
            }

        }

        @objid ("002cb5d2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SentSmDependency extends SmMultipleDependency {
            @objid ("3eb12ea8-2d9d-430b-9544-4ca63b9f356e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mSent != null)? ((AssociationEndData)data).mSent:SmMultipleDependency.EMPTY;
            }

            @objid ("7b1fc835-a169-46f9-98e7-52d08bebd077")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mSent = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mSent;
            }

            @objid ("58e0553f-1aae-474f-931e-8a5c974f4ff7")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.ChannelDep();
            }

        }

        @objid ("002d1c7a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("e2fc8697-8240-4ea9-8f0e-53fbc7c9e1f4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mTarget;
            }

            @objid ("7d4f7fca-9a63-41bb-ac9c-88048ccb09f5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mTarget = value;
            }

            @objid ("c519d936-fad6-4808-aca1-9d7c78b817f5")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.TargetingEndDep();
            }

        }

        @objid ("00706ed0-18c8-1080-943a-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("c5fee2bf-114b-4654-a1b4-d4cab14d6167")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mSource;
            }

            @objid ("3a73a159-5d27-4238-a9af-eae16b028198")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mSource = value;
            }

            @objid ("ccbf2335-ae75-4a10-baf2-b6987dd3a47f")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedEndDep();
            }

        }

        @objid ("004d5f44-5fb6-1085-8e91-001ec947cd2a")
        public static class OppositeOwnerSmDependency extends SmSingleDependency {
            @objid ("fb0c3f2d-10e1-4e11-bea2-61bb01d7b7c2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mOppositeOwner;
            }

            @objid ("56c5c1fa-e4c2-4e28-8819-011d7e02a7f9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mOppositeOwner = value;
            }

            @objid ("7ad8c624-7947-4fe3-b8b7-a3ed6ff07af8")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.OppositeDep();
            }

        }

        @objid ("c3f652d3-33d8-11e2-b9f1-002564c97630")
        public static class IsChangeableSmAttribute extends SmAttribute {
            @objid ("b31169b8-610f-411e-87a0-96e78e8515af")
            public Object getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mIsChangeable;
            }

            @objid ("63c50da6-e313-49d2-87a6-53db1a2f03a9")
            public void setValue(ISmObjectData data, Object value) {
                ((AssociationEndData) data).mIsChangeable = value;
            }

        }

        @objid ("aa940df3-73a7-4e1c-b015-2e219c2646d3")
        public static class AssociationSmDependency extends SmSingleDependency {
            @objid ("f4fc514f-7cf3-4543-aa38-8caf8beef896")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mAssociation;
            }

            @objid ("3a2adfa3-0730-4f2c-a79b-285035c4a56b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mAssociation = value;
            }

            @objid ("8b1aea6b-61b7-4194-bb55-cc205e334f78")
            @Override
            public SmDependency getSymetric() {
                return AssociationData.Metadata.EndDep();
            }

        }

    }

}
