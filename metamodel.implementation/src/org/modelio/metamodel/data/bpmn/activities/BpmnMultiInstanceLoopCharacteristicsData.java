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
    @objid ("54e15730-4bc9-4804-b614-9ff3439104b6")
    @SmaMetaAttribute(metaName="IsSequencial", type=Boolean.class, smAttributeClass=Metadata.IsSequencialSmAttribute.class)
     Object mIsSequencial = false;

    @objid ("a3287419-937b-4bc5-a7f9-e84aefc873d6")
    @SmaMetaAttribute(metaName="Behavior", type=MultiInstanceBehavior.class, smAttributeClass=Metadata.BehaviorSmAttribute.class)
     Object mBehavior = MultiInstanceBehavior.ALLBEHAVIOR;

    @objid ("2c279a7d-adaa-488f-adb4-1605ec84238c")
    @SmaMetaAttribute(metaName="LoopCardinality", type=String.class, smAttributeClass=Metadata.LoopCardinalitySmAttribute.class)
     Object mLoopCardinality = "";

    @objid ("029aa973-09db-45de-968d-2b7cade0e93b")
    @SmaMetaAttribute(metaName="CompletionCondition", type=String.class, smAttributeClass=Metadata.CompletionConditionSmAttribute.class)
     Object mCompletionCondition = "";

    @objid ("0c88a65f-3155-4a3d-84cc-1e89660d941b")
    @SmaMetaAssociation(metaName="LoopDataInput", typeDataClass=BpmnDataInputData.class, min=0, max=1, smAssociationClass=Metadata.LoopDataInputSmDependency.class, component = true)
     SmObjectImpl mLoopDataInput;

    @objid ("7d01a4f8-8966-47ce-b5a5-03bbd833d0b2")
    @SmaMetaAssociation(metaName="LoopDataOutputRef", typeDataClass=BpmnDataOutputData.class, min=0, max=1, smAssociationClass=Metadata.LoopDataOutputRefSmDependency.class, component = true)
     SmObjectImpl mLoopDataOutputRef;

    @objid ("35f660fa-fc82-4e83-8613-18f27e5437e7")
    @SmaMetaAssociation(metaName="CompletionEventRef", typeDataClass=BpmnEventDefinitionData.class, min=0, max=1, smAssociationClass=Metadata.CompletionEventRefSmDependency.class, partof = true)
     SmObjectImpl mCompletionEventRef;

    @objid ("368848b0-658a-42a5-bd75-b96eea5faeae")
    @SmaMetaAssociation(metaName="ComplexBehaviorDefinition", typeDataClass=BpmnComplexBehaviorDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.ComplexBehaviorDefinitionSmDependency.class, component = true)
     List<SmObjectImpl> mComplexBehaviorDefinition = null;

    @objid ("4afee61e-dd98-4e56-b1d1-bf59de36e2bd")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00403210-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("05cf4a43-16f1-466f-87b2-527743dd76e3")
        private static SmClass smClass = null;

        @objid ("4a717ddc-ce4e-4654-acf2-cbdd01ebf125")
        private static SmAttribute IsSequencialAtt = null;

        @objid ("0d28ca01-df6a-4fb4-94ee-7cf26caff158")
        private static SmAttribute BehaviorAtt = null;

        @objid ("73d1314b-983a-44bf-9be5-84e44d134e5c")
        private static SmAttribute LoopCardinalityAtt = null;

        @objid ("fe87f80d-322c-44ca-94a0-6ffb30771f62")
        private static SmAttribute CompletionConditionAtt = null;

        @objid ("cd6229cf-75b3-468f-8b99-c8df2ee3bc20")
        private static SmDependency LoopDataInputDep = null;

        @objid ("f77dc49d-3f0a-4ea1-b7db-927864bc237e")
        private static SmDependency LoopDataOutputRefDep = null;

        @objid ("f294f06f-12be-457c-8c94-03be9aca3912")
        private static SmDependency CompletionEventRefDep = null;

        @objid ("5aaa0a63-8412-43b4-840f-062ec8005d6a")
        private static SmDependency ComplexBehaviorDefinitionDep = null;

        @objid ("fa72dfb7-8947-4616-ac81-770bd1fdcd87")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMultiInstanceLoopCharacteristicsData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9f67de88-7641-489c-b6e4-54679b28fcb3")
        public static SmAttribute IsSequencialAtt() {
            if (IsSequencialAtt == null) {
            	IsSequencialAtt = classof().getAttributeDef("IsSequencial");
            }
            return IsSequencialAtt;
        }

        @objid ("e8f19c8c-bc35-467a-8500-9193bfcdb6cf")
        public static SmAttribute BehaviorAtt() {
            if (BehaviorAtt == null) {
            	BehaviorAtt = classof().getAttributeDef("Behavior");
            }
            return BehaviorAtt;
        }

        @objid ("3e0a04ee-645c-4e44-b1ad-b1edb40a84c6")
        public static SmAttribute LoopCardinalityAtt() {
            if (LoopCardinalityAtt == null) {
            	LoopCardinalityAtt = classof().getAttributeDef("LoopCardinality");
            }
            return LoopCardinalityAtt;
        }

        @objid ("cbf99bd4-2172-46a1-864e-3c8d7304c05a")
        public static SmAttribute CompletionConditionAtt() {
            if (CompletionConditionAtt == null) {
            	CompletionConditionAtt = classof().getAttributeDef("CompletionCondition");
            }
            return CompletionConditionAtt;
        }

        @objid ("dd8239e0-f06f-4714-be8e-d11fb4a9c81b")
        public static SmDependency LoopDataInputDep() {
            if (LoopDataInputDep == null) {
            	LoopDataInputDep = classof().getDependencyDef("LoopDataInput");
            }
            return LoopDataInputDep;
        }

        @objid ("f4153fc1-4e03-4650-b0d6-42d97a47cc23")
        public static SmDependency LoopDataOutputRefDep() {
            if (LoopDataOutputRefDep == null) {
            	LoopDataOutputRefDep = classof().getDependencyDef("LoopDataOutputRef");
            }
            return LoopDataOutputRefDep;
        }

        @objid ("7deb25a3-a0c2-4970-ad35-9acbfc5a2da3")
        public static SmDependency CompletionEventRefDep() {
            if (CompletionEventRefDep == null) {
            	CompletionEventRefDep = classof().getDependencyDef("CompletionEventRef");
            }
            return CompletionEventRefDep;
        }

        @objid ("e0243f2e-68de-4a93-bcf2-828bc7fc7892")
        public static SmDependency ComplexBehaviorDefinitionDep() {
            if (ComplexBehaviorDefinitionDep == null) {
            	ComplexBehaviorDefinitionDep = classof().getDependencyDef("ComplexBehaviorDefinition");
            }
            return ComplexBehaviorDefinitionDep;
        }

        @objid ("846b3f4b-6b8f-4e80-9838-fd7a0c3e9e96")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d647291c-07df-4123-8188-8645c93bbdd6")
        public static SmAttribute getCompletionConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionConditionAtt;
        }

        @objid ("360beb87-5d9b-4749-bbfa-ccc4c31459f0")
        public static SmDependency getComplexBehaviorDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ComplexBehaviorDefinitionDep;
        }

        @objid ("8cba57dc-16ab-48a8-9cc2-5a72bb408ecf")
        public static SmDependency getLoopDataInputDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopDataInputDep;
        }

        @objid ("8bc05521-edfd-4ebd-ad3d-e2ac134e126b")
        public static SmAttribute getIsSequencialAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsSequencialAtt;
        }

        @objid ("e2db72f1-047c-4b57-9105-ca17f6343805")
        public static SmDependency getCompletionEventRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionEventRefDep;
        }

        @objid ("c26d5049-305e-4087-96d8-df90dd85f3a7")
        public static SmAttribute getBehaviorAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BehaviorAtt;
        }

        @objid ("4af73732-a8d3-471d-8bad-1803a3703668")
        public static SmDependency getLoopDataOutputRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopDataOutputRefDep;
        }

        @objid ("eeecd9f5-ce05-40c2-b18c-7658f1cffc3a")
        public static SmAttribute getLoopCardinalityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopCardinalityAtt;
        }

        @objid ("004071ee-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("dcee9280-024a-4697-b44f-73d1cfec53cd")
            public ISmObjectData createData() {
                return new BpmnMultiInstanceLoopCharacteristicsData();
            }

            @objid ("8cd21888-6a67-4362-a6c4-dc63a84aaf49")
            public SmObjectImpl createImpl() {
                return new BpmnMultiInstanceLoopCharacteristicsImpl();
            }

        }

        @objid ("0040d2ba-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IsSequencialSmAttribute extends SmAttribute {
            @objid ("be0adfb0-a286-4a7a-8f7b-552265df4269")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mIsSequencial;
            }

            @objid ("f169bcc9-0623-4c2e-adf6-cfc49db79600")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mIsSequencial = value;
            }

        }

        @objid ("00413250-c4c4-1fd8-97fe-001ec947cd2a")
        public static class BehaviorSmAttribute extends SmAttribute {
            @objid ("0f64a4a9-6d11-4b35-8bd8-e406ac0ee7a2")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mBehavior;
            }

            @objid ("a5b2b5df-59d1-4aa7-b0ab-0f860eb9c76f")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mBehavior = value;
            }

        }

        @objid ("00419272-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopCardinalitySmAttribute extends SmAttribute {
            @objid ("b4c815bf-d958-43ab-a9cb-f627f597e9fe")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopCardinality;
            }

            @objid ("8b8cd3d8-9206-4eec-8dae-ca8b5541d680")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopCardinality = value;
            }

        }

        @objid ("0041f442-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CompletionConditionSmAttribute extends SmAttribute {
            @objid ("e57c22b8-7a28-4bbb-847e-d710fb35f7af")
            public Object getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionCondition;
            }

            @objid ("ffced72c-e41f-4956-874b-c17446494c3e")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionCondition = value;
            }

        }

        @objid ("0042591e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopDataInputSmDependency extends SmSingleDependency {
            @objid ("917b8e22-a559-4b9d-abae-f3e79bbe4497")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataInput;
            }

            @objid ("21670ccc-a5a4-4191-b444-ef82e96eace2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataInput = value;
            }

            @objid ("9d266476-b65c-49bc-b068-06c1017fed1d")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.OwnerLoopCharacteristicsDep();
            }

        }

        @objid ("0042d182-c4c4-1fd8-97fe-001ec947cd2a")
        public static class LoopDataOutputRefSmDependency extends SmSingleDependency {
            @objid ("8dd4a14b-edfb-48f8-bbf3-be7c50add01e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataOutputRef;
            }

            @objid ("4aa259e5-bf58-4f57-8d5a-b031df11c702")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataOutputRef = value;
            }

            @objid ("eb98337f-b666-4a7d-aaa0-3a86e937c455")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.OwnerLoopCharacteristicsDep();
            }

        }

        @objid ("004347de-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CompletionEventRefSmDependency extends SmSingleDependency {
            @objid ("92d6ba06-c295-48a7-92ea-9d2da53fad89")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionEventRef;
            }

            @objid ("8c387c5c-7c8b-40d1-bb87-4255f2d681a0")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionEventRef = value;
            }

            @objid ("b8583175-7669-42cf-a69c-aec95b937a05")
            @Override
            public SmDependency getSymetric() {
                return BpmnEventDefinitionData.Metadata.LoopRefDep();
            }

        }

        @objid ("0043be9e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ComplexBehaviorDefinitionSmDependency extends SmMultipleDependency {
            @objid ("6e801209-778f-419a-b3b9-db9bfbbe3c48")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnMultiInstanceLoopCharacteristicsData)data).mComplexBehaviorDefinition != null)? ((BpmnMultiInstanceLoopCharacteristicsData)data).mComplexBehaviorDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("d0c43aa2-858b-4f51-be41-019f8e5b7815")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnMultiInstanceLoopCharacteristicsData) data).mComplexBehaviorDefinition = new ArrayList<>(initialCapacity);
                return ((BpmnMultiInstanceLoopCharacteristicsData) data).mComplexBehaviorDefinition;
            }

            @objid ("7b126af2-4654-4aeb-88b5-0d6bd3bb5cf7")
            @Override
            public SmDependency getSymetric() {
                return BpmnComplexBehaviorDefinitionData.Metadata.OwnerDep();
            }

        }

    }

}
