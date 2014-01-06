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
    @objid ("3d6b4d8c-ece4-4cb5-8408-81b264cd26b2")
    @SmaMetaAttribute(metaName="Aggregation", type=AggregationKind.class, smAttributeClass=Metadata.AggregationSmAttribute.class)
     Object mAggregation = AggregationKind.KINDISASSOCIATION;

    @objid ("a0559337-4c88-4d29-8c28-7773ff8447b2")
    @SmaMetaAttribute(metaName="IsChangeable", type=Boolean.class, smAttributeClass=Metadata.IsChangeableSmAttribute.class)
     Object mIsChangeable = true;

    @objid ("f17d9ec1-9b3d-4b3b-b856-f30b91cd1761")
    @SmaMetaAssociation(metaName="Target", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("cbc75ecf-04f0-41a1-9cf7-33054cae24e1")
    @SmaMetaAssociation(metaName="OppositeOwner", typeDataClass=AssociationEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeOwnerSmDependency.class)
     SmObjectImpl mOppositeOwner;

    @objid ("dba13fa2-4bdf-495b-8af7-09c4a465a4b4")
    @SmaMetaAssociation(metaName="Source", typeDataClass=ClassifierData.class, min=0, max=1, smAssociationClass=Metadata.SourceSmDependency.class, partof = true)
     SmObjectImpl mSource;

    @objid ("797e5dd5-66e5-4fa4-87c9-46b7d087d7e9")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=LinkEndData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("66b84cc9-b3d1-4502-8315-7f377b950236")
    @SmaMetaAssociation(metaName="Sent", typeDataClass=InformationFlowData.class, min=0, max=-1, smAssociationClass=Metadata.SentSmDependency.class)
     List<SmObjectImpl> mSent = null;

    @objid ("31f3c136-e4aa-42d1-aa1a-87b52bddb70a")
    @SmaMetaAssociation(metaName="Qualifier", typeDataClass=AttributeData.class, min=0, max=-1, smAssociationClass=Metadata.QualifierSmDependency.class, component = true)
     List<SmObjectImpl> mQualifier = null;

    @objid ("c68139c8-5201-4972-a6c9-7c8626d9a386")
    @SmaMetaAssociation(metaName="Opposite", typeDataClass=AssociationEndData.class, min=1, max=1, smAssociationClass=Metadata.OppositeSmDependency.class, sharedComponent = true, partof = true)
     SmObjectImpl mOpposite;

    @objid ("1b50ea7c-c53a-4818-9cad-2431319119bf")
    @SmaMetaAssociation(metaName="RepresentingObjectNode", typeDataClass=ObjectNodeData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingObjectNodeSmDependency.class)
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("5c371687-da36-421e-a451-6e8714e27ff5")
    @SmaMetaAssociation(metaName="Association", typeDataClass=AssociationData.class, min=0, max=1, smAssociationClass=Metadata.AssociationSmDependency.class, sharedComponent = true)
     SmObjectImpl mAssociation;

    @objid ("12fbc101-f0e1-4451-9148-007fd41f14b4")
    @SmaMetaAssociation(metaName="RepresentingItem", typeDataClass=BpmnItemAwareElementData.class, min=0, max=-1, smAssociationClass=Metadata.RepresentingItemSmDependency.class)
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("64efe971-2f7d-44ed-82b4-ef649ed98087")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002868d8-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("85b8db09-edb9-40ad-b896-243d1218fdf8")
        private static SmClass smClass = null;

        @objid ("9c24baf8-d3ed-449f-a0e9-eb6bc3230554")
        private static SmAttribute AggregationAtt = null;

        @objid ("db5b62c1-ad9d-47c1-ac42-5888a0a743e3")
        private static SmAttribute IsChangeableAtt = null;

        @objid ("b378fc81-fd41-4aed-a3e1-3edd76fee61a")
        private static SmDependency TargetDep = null;

        @objid ("da0cbb26-d0bd-478d-8c1c-0d9622974f1a")
        private static SmDependency OppositeOwnerDep = null;

        @objid ("4e722dc9-cb2c-439e-bbd7-01df7536c0ea")
        private static SmDependency SourceDep = null;

        @objid ("101992db-95e7-4f19-b379-d4df052a7c22")
        private static SmDependency OccurenceDep = null;

        @objid ("2dfb2fd5-681c-4ac9-ba7d-2abe70770651")
        private static SmDependency SentDep = null;

        @objid ("0225c24a-bcda-4f09-9753-f37f716d6aef")
        private static SmDependency QualifierDep = null;

        @objid ("399241eb-f6f2-4a88-a54e-44229da3aa18")
        private static SmDependency OppositeDep = null;

        @objid ("c5981b53-4a43-4e22-b33d-fe7a07bc0b6b")
        private static SmDependency RepresentingObjectNodeDep = null;

        @objid ("f51098d6-e42b-4265-91c4-f2332534baa8")
        private static SmDependency AssociationDep = null;

        @objid ("4b9a8132-6828-426f-81a0-0e50a7e6eb46")
        private static SmDependency RepresentingItemDep = null;

        @objid ("bd2de83a-b89f-4b6c-aeb1-cb10f123af63")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(AssociationEndData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6e3cd943-d948-4ef7-b85d-d4d5969ed3dd")
        public static SmAttribute AggregationAtt() {
            if (AggregationAtt == null) {
            	AggregationAtt = classof().getAttributeDef("Aggregation");
            }
            return AggregationAtt;
        }

        @objid ("f0a196bf-db75-449c-816c-1ce6bc51c6e6")
        public static SmAttribute IsChangeableAtt() {
            if (IsChangeableAtt == null) {
            	IsChangeableAtt = classof().getAttributeDef("IsChangeable");
            }
            return IsChangeableAtt;
        }

        @objid ("54861aac-632a-46f4-99d4-4298c4c7f27f")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("d7d1c153-15bd-47b2-84d5-dc8bf3c3e973")
        public static SmDependency OppositeOwnerDep() {
            if (OppositeOwnerDep == null) {
            	OppositeOwnerDep = classof().getDependencyDef("OppositeOwner");
            }
            return OppositeOwnerDep;
        }

        @objid ("3a691ae3-79ef-49b5-8e33-6fa6f4039e20")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("611e1b85-bccf-4a8c-93cc-271192a0aa49")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("f4807a2f-e42d-4023-8a60-9bb87539ba40")
        public static SmDependency SentDep() {
            if (SentDep == null) {
            	SentDep = classof().getDependencyDef("Sent");
            }
            return SentDep;
        }

        @objid ("d9203d31-aba0-470f-9f67-30b7d845672b")
        public static SmDependency QualifierDep() {
            if (QualifierDep == null) {
            	QualifierDep = classof().getDependencyDef("Qualifier");
            }
            return QualifierDep;
        }

        @objid ("5308d19d-c2df-440d-8253-b70a86a7ecf4")
        public static SmDependency OppositeDep() {
            if (OppositeDep == null) {
            	OppositeDep = classof().getDependencyDef("Opposite");
            }
            return OppositeDep;
        }

        @objid ("53ab7ba2-46ab-4f8d-9fb6-562fd23a6629")
        public static SmDependency RepresentingObjectNodeDep() {
            if (RepresentingObjectNodeDep == null) {
            	RepresentingObjectNodeDep = classof().getDependencyDef("RepresentingObjectNode");
            }
            return RepresentingObjectNodeDep;
        }

        @objid ("3ca6d14a-6cd5-48c5-92c7-e0d43da5879c")
        public static SmDependency AssociationDep() {
            if (AssociationDep == null) {
            	AssociationDep = classof().getDependencyDef("Association");
            }
            return AssociationDep;
        }

        @objid ("d3742ccc-4de5-421b-99d9-61971b20a302")
        public static SmDependency RepresentingItemDep() {
            if (RepresentingItemDep == null) {
            	RepresentingItemDep = classof().getDependencyDef("RepresentingItem");
            }
            return RepresentingItemDep;
        }

        @objid ("c59d1eae-c683-4fee-ab33-4b22a07d36ac")
        public static SmDependency getSentDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentDep;
        }

        @objid ("cb20c298-b4ca-4f54-96be-4bc56a98170b")
        public static SmDependency getAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AssociationDep;
        }

        @objid ("54ac8e88-aedb-4764-882b-7ae5921c0a0b")
        public static SmDependency getRepresentingObjectNodeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingObjectNodeDep;
        }

        @objid ("e07b47e1-2394-442c-b376-7a8a756591f2")
        public static SmDependency getQualifierDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return QualifierDep;
        }

        @objid ("4ab1197a-0eee-42d8-a5d7-74f066a958b0")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("8372f45c-ecf9-45d2-8903-524472727e35")
        public static SmDependency getOppositeDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeDep;
        }

        @objid ("6082fad0-6a5c-47d5-9662-b5d7758762e0")
        public static SmAttribute getIsChangeableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsChangeableAtt;
        }

        @objid ("db262d28-5ad4-4ff4-b0eb-19ce3adf9c1f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c1303944-3cd7-45f7-af1a-0becc48b4177")
        public static SmAttribute getAggregationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return AggregationAtt;
        }

        @objid ("42c156ad-3b48-4dd1-991e-f32f8f01b03c")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("a1400083-36d1-4998-be8a-dd936a713342")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("6e58c6f0-0e71-4722-97a7-b012c9f7524d")
        public static SmDependency getRepresentingItemDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RepresentingItemDep;
        }

        @objid ("422f5220-b757-4182-b9c9-cfa5b513058f")
        public static SmDependency getOppositeOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OppositeOwnerDep;
        }

        @objid ("0028b0b8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ae531039-2d7a-4b29-8e76-23b75e44c53b")
            public ISmObjectData createData() {
                return new AssociationEndData();
            }

            @objid ("c711e29e-40b1-4d71-8a7f-34d7c947b08e")
            public SmObjectImpl createImpl() {
                return new AssociationEndImpl();
            }

        }

        @objid ("00291350-c4c5-1fd8-97fe-001ec947cd2a")
        public static class AggregationSmAttribute extends SmAttribute {
            @objid ("14680de1-cab4-43c9-92cf-24c69c6c65ba")
            public Object getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mAggregation;
            }

            @objid ("5ffddc78-054e-4a3d-ba1f-813b1e3ec778")
            public void setValue(ISmObjectData data, Object value) {
                ((AssociationEndData) data).mAggregation = value;
            }

        }

        @objid ("002a38d4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("03d60cf3-aa8c-46a0-91ae-bdee7ae04ca7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mOccurence != null)? ((AssociationEndData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("e6c2c1fc-438e-4a26-ab3a-bf95c4f64450")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mOccurence;
            }

            @objid ("dff814fd-16df-4f59-a961-3b4af1b3a5dc")
            @Override
            public SmDependency getSymetric() {
                return LinkEndData.Metadata.ModelDep();
            }

        }

        @objid ("002a9c16-c4c5-1fd8-97fe-001ec947cd2a")
        public static class QualifierSmDependency extends SmMultipleDependency {
            @objid ("1fce52a7-6267-4a3e-9b35-a1c8e4687400")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mQualifier != null)? ((AssociationEndData)data).mQualifier:SmMultipleDependency.EMPTY;
            }

            @objid ("aa308ee4-7b95-45f3-bcc7-11a41dc434d1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mQualifier = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mQualifier;
            }

            @objid ("81b0419d-ef1e-42c5-be2b-2eea246bd2a3")
            @Override
            public SmDependency getSymetric() {
                return AttributeData.Metadata.QualifiedDep();
            }

        }

        @objid ("002aff80-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingObjectNodeSmDependency extends SmMultipleDependency {
            @objid ("74b60a8f-8cf0-439c-987c-90540e593767")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mRepresentingObjectNode != null)? ((AssociationEndData)data).mRepresentingObjectNode:SmMultipleDependency.EMPTY;
            }

            @objid ("444896ee-64ca-4253-bf6e-9308e539a65c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mRepresentingObjectNode = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mRepresentingObjectNode;
            }

            @objid ("23aa52fb-de70-4c6e-8313-a813a13b2976")
            @Override
            public SmDependency getSymetric() {
                return ObjectNodeData.Metadata.RepresentedRoleDep();
            }

        }

        @objid ("002b63bc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RepresentingItemSmDependency extends SmMultipleDependency {
            @objid ("34cb8ab7-95fb-4d6f-8679-f9064eeb1854")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mRepresentingItem != null)? ((AssociationEndData)data).mRepresentingItem:SmMultipleDependency.EMPTY;
            }

            @objid ("3a084f1b-1c4c-4f38-9c8f-616ffb8e879f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mRepresentingItem = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mRepresentingItem;
            }

            @objid ("776a2b95-dffe-4229-9e4c-7e6d01e34e5a")
            @Override
            public SmDependency getSymetric() {
                return BpmnItemAwareElementData.Metadata.RepresentedAssociationEndDep();
            }

        }

        @objid ("002c3f26-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OppositeSmDependency extends SmSingleDependency {
            @objid ("c19eb7aa-07c4-4b41-960e-0086b2bd7ab5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mOpposite;
            }

            @objid ("3ce23c03-4756-462b-acdf-fdc1ee1c1ce6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mOpposite = value;
            }

            @objid ("04a00f35-e82a-4a6e-ad83-09448dc993f1")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.OppositeOwnerDep();
            }

        }

        @objid ("002cb5d2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SentSmDependency extends SmMultipleDependency {
            @objid ("a6e35db2-5cf2-4e72-8f83-9315d9d260ac")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((AssociationEndData)data).mSent != null)? ((AssociationEndData)data).mSent:SmMultipleDependency.EMPTY;
            }

            @objid ("40cfb535-ebc4-4954-9498-023baba9fb4f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((AssociationEndData) data).mSent = new ArrayList<>(initialCapacity);
                return ((AssociationEndData) data).mSent;
            }

            @objid ("85c6cef6-0f20-497b-9a50-d07d2227748a")
            @Override
            public SmDependency getSymetric() {
                return InformationFlowData.Metadata.ChannelDep();
            }

        }

        @objid ("002d1c7a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("49780822-33c2-401d-8813-62a5487e2917")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mTarget;
            }

            @objid ("f1048e37-bad3-42fe-9a54-88c91b58aa1a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mTarget = value;
            }

            @objid ("00c1fb5e-448a-4d3f-8b37-852a38b9639f")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.TargetingEndDep();
            }

        }

        @objid ("00706ed0-18c8-1080-943a-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("bd589baf-0c9d-4eca-91a5-9532271540db")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mSource;
            }

            @objid ("4e775e12-612c-4661-8b85-33f930fe42dd")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mSource = value;
            }

            @objid ("68aa83e2-b8da-42b2-b4f5-8bbd8940beec")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedEndDep();
            }

        }

        @objid ("004d5f44-5fb6-1085-8e91-001ec947cd2a")
        public static class OppositeOwnerSmDependency extends SmSingleDependency {
            @objid ("e8fcef94-7d51-4fbf-ae26-1b9f1141183f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mOppositeOwner;
            }

            @objid ("9c0501e2-0153-4d3c-8fd0-818dbdfd1b9b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mOppositeOwner = value;
            }

            @objid ("d9371727-9e86-48a9-9b35-2ce5722f762a")
            @Override
            public SmDependency getSymetric() {
                return AssociationEndData.Metadata.OppositeDep();
            }

        }

        @objid ("c3f652d3-33d8-11e2-b9f1-002564c97630")
        public static class IsChangeableSmAttribute extends SmAttribute {
            @objid ("8064f80e-46bf-4788-830f-530e45c0a61c")
            public Object getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mIsChangeable;
            }

            @objid ("35731cae-a90e-431d-a19e-2c4c289e5de6")
            public void setValue(ISmObjectData data, Object value) {
                ((AssociationEndData) data).mIsChangeable = value;
            }

        }

        @objid ("aa940df3-73a7-4e1c-b015-2e219c2646d3")
        public static class AssociationSmDependency extends SmSingleDependency {
            @objid ("c84ca4e1-f374-4710-9711-2f0bfb5ee61b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((AssociationEndData) data).mAssociation;
            }

            @objid ("033a7f73-3f79-4b9b-a3c5-1a8dcff28a3c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((AssociationEndData) data).mAssociation = value;
            }

            @objid ("1a397f61-933c-46a2-b9e2-d960299296fe")
            @Override
            public SmDependency getSymetric() {
                return AssociationData.Metadata.EndDep();
            }

        }

    }

}
