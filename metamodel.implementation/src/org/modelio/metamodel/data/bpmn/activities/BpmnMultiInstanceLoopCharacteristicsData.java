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
    @objid ("abf598bb-775c-4264-8e5f-6b75e95dee0a")
    @SmaMetaAttribute(metaName="IsSequencial", type=Boolean.class, smAttributeClass=Metadata.IsSequencialSmAttribute.class)
     Object mIsSequencial = false;

    @objid ("5f93c2dc-bbde-4f1a-84b8-5538131ac35a")
    @SmaMetaAttribute(metaName="Behavior", type=MultiInstanceBehavior.class, smAttributeClass=Metadata.BehaviorSmAttribute.class)
     Object mBehavior = MultiInstanceBehavior.ALLBEHAVIOR;

    @objid ("b87bd927-b751-4b00-baef-0a0421b3ec42")
    @SmaMetaAttribute(metaName="LoopCardinality", type=String.class, smAttributeClass=Metadata.LoopCardinalitySmAttribute.class)
     Object mLoopCardinality = "";

    @objid ("e0458139-302c-48b6-b52e-09468efba44a")
    @SmaMetaAttribute(metaName="CompletionCondition", type=String.class, smAttributeClass=Metadata.CompletionConditionSmAttribute.class)
     Object mCompletionCondition = "";

    @objid ("b2d4df43-7f82-436d-aa81-a5f6738ebe4a")
    @SmaMetaAssociation(metaName="LoopDataInput", typeDataClass=BpmnDataInputData.class, min=0, max=1, smAssociationClass=Metadata.LoopDataInputSmDependency.class, component = true)
     SmObjectImpl mLoopDataInput;

    @objid ("962e69f2-302c-489d-877e-a70ca4a57357")
    @SmaMetaAssociation(metaName="LoopDataOutputRef", typeDataClass=BpmnDataOutputData.class, min=0, max=1, smAssociationClass=Metadata.LoopDataOutputRefSmDependency.class, component = true)
     SmObjectImpl mLoopDataOutputRef;

    @objid ("f3e7af98-05f9-43dd-9c00-04469077e292")
    @SmaMetaAssociation(metaName="CompletionEventRef", typeDataClass=BpmnEventDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.CompletionEventRefSmDependency.class, partof = true)
     SmObjectImpl mCompletionEventRef;

    @objid ("215a34d9-da6f-41a9-98f5-d02661d5a22f")
    @SmaMetaAssociation(metaName="ComplexBehaviorDefinition", typeDataClass=BpmnComplexBehaviorDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.ComplexBehaviorDefinitionSmDependency.class, component = true)
     List<SmObjectImpl> mComplexBehaviorDefinition = null;

    @objid ("482d7faf-a7a2-42c4-af55-3f76f6fb858c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00403210-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("620d6851-386b-4cc8-bf46-af1307a4067c")
        private static SmClass smClass = null;

        @objid ("456e1adc-0d94-426f-b2ad-29b53e8222db")
        private static SmAttribute IsSequencialAtt = null;

        @objid ("a17b558e-d0f6-424d-bb44-b25006028a8c")
        private static SmAttribute BehaviorAtt = null;

        @objid ("bfa1f437-26b9-45c4-8653-0443b7ff65fd")
        private static SmAttribute LoopCardinalityAtt = null;

        @objid ("9b76be6d-1411-4064-94ff-b0679c7c4588")
        private static SmAttribute CompletionConditionAtt = null;

        @objid ("f07f2d98-7625-4f7b-929a-e880039bdbeb")
        private static SmDependency LoopDataInputDep = null;

        @objid ("ea156d78-0b3a-4713-a819-c9b24c8fc9f3")
        private static SmDependency LoopDataOutputRefDep = null;

        @objid ("fa4d120b-bf1e-43eb-8746-f885543ae375")
        private static SmDependency CompletionEventRefDep = null;

        @objid ("eec01b47-3b18-493e-ab4d-6a5b6c225563")
        private static SmDependency ComplexBehaviorDefinitionDep = null;

        @objid ("0eaadcbf-6bd6-4c18-9f33-dff639ed2f13")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMultiInstanceLoopCharacteristicsData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7ced8ae6-0c34-40af-b892-7c06de5e2968")
        public static SmAttribute IsSequencialAtt() {
            if (IsSequencialAtt == null) {
            	IsSequencialAtt = classof().getAttributeDef("IsSequencial");
            }
            return IsSequencialAtt;
        }

        @objid ("30ec00b0-bfb6-4f11-b76f-704b2b76135b")
        public static SmAttribute BehaviorAtt() {
            if (BehaviorAtt == null) {
            	BehaviorAtt = classof().getAttributeDef("Behavior");
            }
            return BehaviorAtt;
        }

        @objid ("a5dd46da-7bfc-49f8-bf4f-f6ee7c0a0eee")
        public static SmAttribute LoopCardinalityAtt() {
            if (LoopCardinalityAtt == null) {
            	LoopCardinalityAtt = classof().getAttributeDef("LoopCardinality");
            }
            return LoopCardinalityAtt;
        }

        @objid ("4be9f7cb-fac7-4a58-8abf-4516278b1203")
        public static SmAttribute CompletionConditionAtt() {
            if (CompletionConditionAtt == null) {
            	CompletionConditionAtt = classof().getAttributeDef("CompletionCondition");
            }
            return CompletionConditionAtt;
        }

        @objid ("57d44978-7ce5-4b7c-ae97-edb1de8e191e")
        public static SmDependency LoopDataInputDep() {
            if (LoopDataInputDep == null) {
            	LoopDataInputDep = classof().getDependencyDef("LoopDataInput");
            }
            return LoopDataInputDep;
        }

        @objid ("ea9cd5d6-7b00-4153-9460-31b9dca9c7d2")
        public static SmDependency LoopDataOutputRefDep() {
            if (LoopDataOutputRefDep == null) {
            	LoopDataOutputRefDep = classof().getDependencyDef("LoopDataOutputRef");
            }
            return LoopDataOutputRefDep;
        }

        @objid ("a3f7fc6d-d567-4e04-949c-30f8b1d864e6")
        public static SmDependency CompletionEventRefDep() {
            if (CompletionEventRefDep == null) {
            	CompletionEventRefDep = classof().getDependencyDef("CompletionEventRef");
            }
            return CompletionEventRefDep;
        }

        @objid ("e5d9a018-660f-49b9-9e21-1b1e0c19042d")
        public static SmDependency ComplexBehaviorDefinitionDep() {
            if (ComplexBehaviorDefinitionDep == null) {
            	ComplexBehaviorDefinitionDep = classof().getDependencyDef("ComplexBehaviorDefinition");
            }
            return ComplexBehaviorDefinitionDep;
        }

        @objid ("ac2aa844-6ceb-4b1f-9e4e-d50acbbe2b9c")
        public static SmAttribute getBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BehaviorAtt;
        }

        @objid ("6179de49-2b2a-4be2-bddf-c3dbc8e985a7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("06e59eb1-5562-46dc-baa4-3adca61ffcdc")
        public static SmAttribute getIsSequencialAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSequencialAtt;
        }

        @objid ("c2de5ded-fc26-47b5-86f5-5ab5ca3ebd4a")
        public static SmDependency getComplexBehaviorDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ComplexBehaviorDefinitionDep;
        }

        @objid ("347a3302-aed4-432e-b14b-51f8103b9e47")
        public static SmAttribute getCompletionConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionConditionAtt;
        }

        @objid ("5bc5f146-2beb-4fa6-8c9f-e42b19cf0de9")
        public static SmDependency getLoopDataInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopDataInputDep;
        }

        @objid ("b088562a-d180-4a19-958d-672a92e274df")
        public static SmDependency getLoopDataOutputRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopDataOutputRefDep;
        }

        @objid ("087e2d8a-9422-4bb3-973e-7dc3041c40d7")
        public static SmAttribute getLoopCardinalityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopCardinalityAtt;
        }

        @objid ("12b0f97c-582f-46e2-aa0a-f2df8e0fd7ca")
        public static SmDependency getCompletionEventRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionEventRefDep;
        }

        @objid ("004071ee-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b4805e1a-9668-4e80-8b7e-800e230d3f65")
            public ISmObjectData createData() {
                return new BpmnMultiInstanceLoopCharacteristicsData();
            }

            @objid ("80d033cf-98a9-4493-8a79-c7cb1995e088")
            public SmObjectImpl createImpl() {
                return new BpmnMultiInstanceLoopCharacteristicsImpl();
            }

        }

        @objid ("0040d2ba-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsSequencialSmAttribute extends SmAttribute {
            @objid ("7952b8a8-51fe-41a4-8b58-db8baef24e14")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mIsSequencial;
            }

            @objid ("5b4bfc06-b2b3-4eec-96c2-cb8033ca0397")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mIsSequencial = value;
            }

        }

        @objid ("00413250-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BehaviorSmAttribute extends SmAttribute {
            @objid ("83ace8b6-3251-491b-9f62-5bfb0186025b")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mBehavior;
            }

            @objid ("de496ff1-3e83-42a2-83e0-42b9f34bb4ef")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mBehavior = value;
            }

        }

        @objid ("00419272-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopCardinalitySmAttribute extends SmAttribute {
            @objid ("d98753b3-ec61-4a8f-8c1f-562bcda66c2b")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopCardinality;
            }

            @objid ("26228ac5-a464-427a-9ab3-87c7bf687c8a")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopCardinality = value;
            }

        }

        @objid ("0041f442-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CompletionConditionSmAttribute extends SmAttribute {
            @objid ("decb724f-edc2-423a-96e2-106a214971df")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionCondition;
            }

            @objid ("c650112e-4d2f-452e-9808-f0617b2272ec")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionCondition = value;
            }

        }

        @objid ("0042591e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopDataInputSmDependency extends SmSingleDependency {
            @objid ("1e04c165-5051-4cac-bf3e-41c06a8afd1b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataInput;
            }

            @objid ("35a708e5-6d00-496f-9344-17ccab618ab0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataInput = value;
            }

            @objid ("2ab93d84-8cb1-43bf-8312-6d4e692ff3df")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep();
            }

        }

        @objid ("0042d182-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopDataOutputRefSmDependency extends SmSingleDependency {
            @objid ("d8c6df61-9006-4035-86a1-ac847638d181")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataOutputRef;
            }

            @objid ("d1990c0d-2aa0-415f-91bb-a1cf74f9ed52")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataOutputRef = value;
            }

            @objid ("d30a0251-8f18-45c4-98e3-f09d4fb86163")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep();
            }

        }

        @objid ("004347de-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CompletionEventRefSmDependency extends SmSingleDependency {
            @objid ("2ca7072c-7e84-47b7-9853-dad9c267a227")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionEventRef;
            }

            @objid ("c223a58b-58c2-4718-969d-9a7b15a293a8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionEventRef = value;
            }

            @objid ("53e6617f-7359-403a-af37-d386ce1941b2")
            @Override
            public SmDependency getSymetric() {
                return BpmnEventDefinitionData.Metadata.LoopRefDep();
            }

        }

        @objid ("0043be9e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ComplexBehaviorDefinitionSmDependency extends SmMultipleDependency {
            @objid ("50a8b892-af5e-409c-bf5e-5c3efd9fd127")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMultiInstanceLoopCharacteristicsData)data).mComplexBehaviorDefinition != null)? ((BpmnMultiInstanceLoopCharacteristicsData)data).mComplexBehaviorDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("ddb35fce-7ace-413a-91b3-3a603c6939bd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mComplexBehaviorDefinition = new ArrayList<>(initialCapacity);
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mComplexBehaviorDefinition;
            }

            @objid ("19bb41e7-8645-42b4-bda5-6c847454c84f")
            @Override
            public SmDependency getSymetric() {
                return BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep();
            }

        }

    }

}
