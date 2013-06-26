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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.MultiInstanceBehavior;
import org.modelio.metamodel.data.bpmn.activities.BpmnComplexBehaviorDefinitionData;
import org.modelio.metamodel.data.bpmn.events.BpmnEventDefinitionData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataInputData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataOutputData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnMultiInstanceLoopCharacteristicsImpl;
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

@objid ("00814890-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnMultiInstanceLoopCharacteristics.class, factory=BpmnMultiInstanceLoopCharacteristicsData.Metadata.ObjectFactory.class)
public class BpmnMultiInstanceLoopCharacteristicsData extends BpmnLoopCharacteristicsData {
    @objid ("26019dba-598a-4077-9783-5c3ed6bfe701")
    @SmaMetaAttribute(metaName="IsSequencial", type=Boolean.class, smAttributeClass=Metadata.IsSequencialSmAttribute.class)
     Object mIsSequencial = false;

    @objid ("100d95a7-0f76-46fc-8e77-7be418ff1a65")
    @SmaMetaAttribute(metaName="Behavior", type=MultiInstanceBehavior.class, smAttributeClass=Metadata.BehaviorSmAttribute.class)
     Object mBehavior = MultiInstanceBehavior.ALLBEHAVIOR;

    @objid ("7043af7a-dfc1-433c-be01-d4cad426248d")
    @SmaMetaAttribute(metaName="LoopCardinality", type=String.class, smAttributeClass=Metadata.LoopCardinalitySmAttribute.class)
     Object mLoopCardinality = "";

    @objid ("1d87a870-5093-4e85-b8fe-967dce0a89c6")
    @SmaMetaAttribute(metaName="CompletionCondition", type=String.class, smAttributeClass=Metadata.CompletionConditionSmAttribute.class)
     Object mCompletionCondition = "";

    @objid ("7a81324b-b21e-4913-9aab-7c97dd6dc3eb")
    @SmaMetaAssociation(metaName="LoopDataInput", typeDataClass=BpmnDataInputData.class, min=0, max=1, smAssociationClass=Metadata.LoopDataInputSmDependency.class, component = true)
     SmObjectImpl mLoopDataInput;

    @objid ("d52ea30c-f850-4181-8d5e-5a0a4677cb1c")
    @SmaMetaAssociation(metaName="LoopDataOutputRef", typeDataClass=BpmnDataOutputData.class, min=0, max=1, smAssociationClass=Metadata.LoopDataOutputRefSmDependency.class, component = true)
     SmObjectImpl mLoopDataOutputRef;

    @objid ("7581a2d5-c8b9-4c51-946c-8cff7de5bb46")
    @SmaMetaAssociation(metaName="CompletionEventRef", typeDataClass=BpmnEventDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.CompletionEventRefSmDependency.class, partof = true)
     SmObjectImpl mCompletionEventRef;

    @objid ("a14d0528-cd73-4468-8b67-9ef1f8ef4102")
    @SmaMetaAssociation(metaName="ComplexBehaviorDefinition", typeDataClass=BpmnComplexBehaviorDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.ComplexBehaviorDefinitionSmDependency.class, component = true)
     List<SmObjectImpl> mComplexBehaviorDefinition = null;

    @objid ("7601cb28-a36b-4253-9b7d-04314a22f133")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00403210-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("05e27d36-a175-4040-96d5-8e1bb342b6b3")
        private static SmClass smClass = null;

        @objid ("80bc3eeb-41b7-444d-8e51-f2984453b440")
        private static SmAttribute IsSequencialAtt = null;

        @objid ("94eab6a1-90dd-4619-aabf-8563680e350c")
        private static SmAttribute BehaviorAtt = null;

        @objid ("0549ba50-f5bb-48ad-8418-a7906df41303")
        private static SmAttribute LoopCardinalityAtt = null;

        @objid ("1396d4fd-d86b-4b44-b29e-cdab91cb9b0a")
        private static SmAttribute CompletionConditionAtt = null;

        @objid ("005197a7-727c-46f1-8714-163737aa743e")
        private static SmDependency LoopDataInputDep = null;

        @objid ("0f819a7c-c67d-4334-a679-134807741463")
        private static SmDependency LoopDataOutputRefDep = null;

        @objid ("e31a69d9-9c8b-4174-a614-7a4ce9dfa510")
        private static SmDependency CompletionEventRefDep = null;

        @objid ("7142847e-efbe-4436-8237-12b11e40a195")
        private static SmDependency ComplexBehaviorDefinitionDep = null;

        @objid ("5e903bb4-367f-42ea-b7ce-2764e9ed236b")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMultiInstanceLoopCharacteristicsData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7476ba24-9d00-4624-80a2-668ec39415ad")
        public static SmAttribute IsSequencialAtt() {
            if (IsSequencialAtt == null) {
            	IsSequencialAtt = classof().getAttributeDef("IsSequencial");
            }
            return IsSequencialAtt;
        }

        @objid ("a9ef6787-1393-45c3-be9d-b455f2fcdf9f")
        public static SmAttribute BehaviorAtt() {
            if (BehaviorAtt == null) {
            	BehaviorAtt = classof().getAttributeDef("Behavior");
            }
            return BehaviorAtt;
        }

        @objid ("77628241-e1cb-408b-8ab3-b4b254fed857")
        public static SmAttribute LoopCardinalityAtt() {
            if (LoopCardinalityAtt == null) {
            	LoopCardinalityAtt = classof().getAttributeDef("LoopCardinality");
            }
            return LoopCardinalityAtt;
        }

        @objid ("a3c347dc-8cff-4e16-a5de-3c15fd882809")
        public static SmAttribute CompletionConditionAtt() {
            if (CompletionConditionAtt == null) {
            	CompletionConditionAtt = classof().getAttributeDef("CompletionCondition");
            }
            return CompletionConditionAtt;
        }

        @objid ("04688b09-bd59-4f94-a076-28e22cfd8c18")
        public static SmDependency LoopDataInputDep() {
            if (LoopDataInputDep == null) {
            	LoopDataInputDep = classof().getDependencyDef("LoopDataInput");
            }
            return LoopDataInputDep;
        }

        @objid ("0f3e8d67-ccb2-4398-9692-1efc6a27fe4c")
        public static SmDependency LoopDataOutputRefDep() {
            if (LoopDataOutputRefDep == null) {
            	LoopDataOutputRefDep = classof().getDependencyDef("LoopDataOutputRef");
            }
            return LoopDataOutputRefDep;
        }

        @objid ("b404330c-5122-4af9-aff5-a8c37e0c46fa")
        public static SmDependency CompletionEventRefDep() {
            if (CompletionEventRefDep == null) {
            	CompletionEventRefDep = classof().getDependencyDef("CompletionEventRef");
            }
            return CompletionEventRefDep;
        }

        @objid ("99cddbb7-793e-4873-9df1-eb5c90f8afea")
        public static SmDependency ComplexBehaviorDefinitionDep() {
            if (ComplexBehaviorDefinitionDep == null) {
            	ComplexBehaviorDefinitionDep = classof().getDependencyDef("ComplexBehaviorDefinition");
            }
            return ComplexBehaviorDefinitionDep;
        }

        @objid ("26b57678-9b6a-416a-8031-ddeef8e7a809")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("f7f287e7-dd33-4977-a7bd-31e29dd25e07")
        public static SmAttribute getBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BehaviorAtt;
        }

        @objid ("5480d8e4-d3ee-4e37-9d98-75684fd7907a")
        public static SmAttribute getCompletionConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionConditionAtt;
        }

        @objid ("79ad3564-8283-4817-ab62-8c76c79bbedb")
        public static SmAttribute getIsSequencialAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSequencialAtt;
        }

        @objid ("24ce710f-cc01-47c1-bd43-e07e14127810")
        public static SmDependency getCompletionEventRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionEventRefDep;
        }

        @objid ("5d0dbdfe-8f5e-456f-ba8f-6061b3abb585")
        public static SmAttribute getLoopCardinalityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopCardinalityAtt;
        }

        @objid ("10d1fdfd-c102-4180-8ada-f877e04b059f")
        public static SmDependency getLoopDataInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopDataInputDep;
        }

        @objid ("efc62c40-f17c-4475-8dd3-bce2093d3036")
        public static SmDependency getComplexBehaviorDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ComplexBehaviorDefinitionDep;
        }

        @objid ("abbfccb2-036a-45c4-91e6-d5d14f2895d3")
        public static SmDependency getLoopDataOutputRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopDataOutputRefDep;
        }

        @objid ("004071ee-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("74c5e335-7fb0-4ac1-ac00-0a58fe81a2d9")
            public ISmObjectData createData() {
                return new BpmnMultiInstanceLoopCharacteristicsData();
            }

            @objid ("89ab9625-f44e-40e6-8218-fbc2c6ed6370")
            public SmObjectImpl createImpl() {
                return new BpmnMultiInstanceLoopCharacteristicsImpl();
            }

        }

        @objid ("0040d2ba-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsSequencialSmAttribute extends SmAttribute {
            @objid ("f493442f-3b7f-48fc-9f07-d7a02ebf9253")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mIsSequencial;
            }

            @objid ("2c64b152-90b6-4b25-bcef-902e9b090730")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mIsSequencial = value;
            }

        }

        @objid ("00413250-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BehaviorSmAttribute extends SmAttribute {
            @objid ("231a2637-d604-4295-b495-fdda8f3d9ce0")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mBehavior;
            }

            @objid ("e47eb04a-23da-4ec9-b884-a2ae20668962")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mBehavior = value;
            }

        }

        @objid ("00419272-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopCardinalitySmAttribute extends SmAttribute {
            @objid ("ce5faa2a-8e70-480a-a9a9-233f90841292")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopCardinality;
            }

            @objid ("d2340d6b-5c4f-48fd-a2de-c0ef827d5561")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopCardinality = value;
            }

        }

        @objid ("0041f442-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CompletionConditionSmAttribute extends SmAttribute {
            @objid ("610e3128-a8d9-4563-9a6d-6730223e2559")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionCondition;
            }

            @objid ("d650b481-3e41-4675-b900-0744cac0b941")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionCondition = value;
            }

        }

        @objid ("0042591e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopDataInputSmDependency extends SmSingleDependency {
            @objid ("41839cd6-9501-48a4-93b8-83ed79a138a3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataInput;
            }

            @objid ("4100032d-201d-4b7f-8f62-9e61537fef00")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataInput = value;
            }

            @objid ("206f6494-c50f-447c-9312-c3a0b516fc6e")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep();
            }

        }

        @objid ("0042d182-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopDataOutputRefSmDependency extends SmSingleDependency {
            @objid ("0d91cefa-8944-411c-9036-84ec1eaf6539")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataOutputRef;
            }

            @objid ("51f32a2a-ce7b-4c67-857a-abe15fd4d19e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataOutputRef = value;
            }

            @objid ("b3c59e72-8e8a-4def-be0f-5176f9e60127")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep();
            }

        }

        @objid ("004347de-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CompletionEventRefSmDependency extends SmSingleDependency {
            @objid ("169d433a-de96-45ba-94ff-da36ff9898ad")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionEventRef;
            }

            @objid ("48a9fbae-9953-4fc4-a5c7-ab5e5f2a8aec")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionEventRef = value;
            }

            @objid ("e33c4449-9eab-4bd9-901b-3a12cc43b848")
            @Override
            public SmDependency getSymetric() {
                return BpmnEventDefinitionData.Metadata.LoopRefDep();
            }

        }

        @objid ("0043be9e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ComplexBehaviorDefinitionSmDependency extends SmMultipleDependency {
            @objid ("65707243-535c-42dd-ae75-b6bd31540be1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMultiInstanceLoopCharacteristicsData)data).mComplexBehaviorDefinition != null)? ((BpmnMultiInstanceLoopCharacteristicsData)data).mComplexBehaviorDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("321bca47-c0e0-48db-b56a-ece359cb335a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mComplexBehaviorDefinition = new ArrayList<>(initialCapacity);
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mComplexBehaviorDefinition;
            }

            @objid ("4fa60ea4-2a15-41d0-ad03-bcc25f682407")
            @Override
            public SmDependency getSymetric() {
                return BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep();
            }

        }

    }

}
