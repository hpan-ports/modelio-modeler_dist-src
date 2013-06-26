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
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.data.bpmn.activities.BpmnLoopCharacteristicsData;
import org.modelio.metamodel.data.bpmn.events.BpmnBoundaryEventData;
import org.modelio.metamodel.data.bpmn.events.BpmnCompensateEventDefinitionData;
import org.modelio.metamodel.data.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataAssociationData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataInputData;
import org.modelio.metamodel.data.bpmn.objects.BpmnDataOutputData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowNodeData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnActivityImpl;
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

@objid ("007dc792-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnActivity.class, factory=BpmnActivityData.Metadata.ObjectFactory.class)
public class BpmnActivityData extends BpmnFlowNodeData {
    @objid ("02700a66-63ce-458d-a371-7c93bd5b5258")
    @SmaMetaAttribute(metaName="IsForCompensation", type=Boolean.class, smAttributeClass=Metadata.IsForCompensationSmAttribute.class)
     Object mIsForCompensation = false;

    @objid ("bd7ebe6e-7110-450b-b103-ffa24342aea3")
    @SmaMetaAttribute(metaName="StartQuantity", type=Integer.class, smAttributeClass=Metadata.StartQuantitySmAttribute.class)
     Object mStartQuantity = 1;

    @objid ("4e402616-88a4-4745-be28-6ac186ad7a5d")
    @SmaMetaAttribute(metaName="CompletionQuantity", type=Integer.class, smAttributeClass=Metadata.CompletionQuantitySmAttribute.class)
     Object mCompletionQuantity = 1;

    @objid ("4d98af6e-a460-42ba-bed7-c83234428ad6")
    @SmaMetaAssociation(metaName="CompensateEventDefinitions", typeDataClass=BpmnCompensateEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.CompensateEventDefinitionsSmDependency.class)
     List<SmObjectImpl> mCompensateEventDefinitions = null;

    @objid ("a03c4657-0c1d-4c58-9d0b-175189bd2adf")
    @SmaMetaAssociation(metaName="InputSpecification", typeDataClass=BpmnDataInputData.class, min=0, max=-1, smAssociationClass=Metadata.InputSpecificationSmDependency.class, component = true)
     List<SmObjectImpl> mInputSpecification = null;

    @objid ("df6d01d1-6ae3-466f-a5a7-3000494877e4")
    @SmaMetaAssociation(metaName="DataInputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataInputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataInputAssociation = null;

    @objid ("9a5a8e1a-00f0-46b8-a24e-407d673e3bbc")
    @SmaMetaAssociation(metaName="OutputSpecification", typeDataClass=BpmnDataOutputData.class, min=0, max=-1, smAssociationClass=Metadata.OutputSpecificationSmDependency.class, component = true)
     List<SmObjectImpl> mOutputSpecification = null;

    @objid ("f760c0d8-3eb9-42ed-ab0a-05b58cf12644")
    @SmaMetaAssociation(metaName="LoopCharacteristics", typeDataClass=BpmnLoopCharacteristicsData.class, min=0, max=1, smAssociationClass=Metadata.LoopCharacteristicsSmDependency.class, component = true)
     SmObjectImpl mLoopCharacteristics;

    @objid ("ad710923-87fe-44bc-9468-408dfbe1798c")
    @SmaMetaAssociation(metaName="BoundaryEventRef", typeDataClass=BpmnBoundaryEventData.class, min=0, max=-1, smAssociationClass=Metadata.BoundaryEventRefSmDependency.class, partof = true)
     List<SmObjectImpl> mBoundaryEventRef = null;

    @objid ("b12ffc41-9675-4c61-85bc-782d17d0e028")
    @SmaMetaAssociation(metaName="DataOutputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataOutputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataOutputAssociation = null;

    @objid ("b1a979ba-cf82-4119-a919-5044dd56cd7d")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("507b0134-4cb9-48c3-b98e-66688f81fd8f")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00214e9a-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("82c12900-7e3a-4f2f-bd42-a60ec82e2200")
        private static SmClass smClass = null;

        @objid ("1ae081e6-7eea-4856-b880-21ed33cb7a6c")
        private static SmAttribute IsForCompensationAtt = null;

        @objid ("514bb96b-1406-4c39-892d-63d90cbbf26b")
        private static SmAttribute StartQuantityAtt = null;

        @objid ("163f9af6-30e9-4268-aab3-732561ede83c")
        private static SmAttribute CompletionQuantityAtt = null;

        @objid ("48e64bdf-757e-49c9-8390-453ad1593707")
        private static SmDependency CompensateEventDefinitionsDep = null;

        @objid ("03139949-6815-4a5f-af0f-40f011f3e1b6")
        private static SmDependency InputSpecificationDep = null;

        @objid ("b4b9690f-fd59-4b8e-925f-8d0a4b1c1060")
        private static SmDependency DataInputAssociationDep = null;

        @objid ("c7a470d0-619b-4f3b-967e-bb68c8a179dc")
        private static SmDependency OutputSpecificationDep = null;

        @objid ("422b6e69-6561-4541-bc14-c28764da50e3")
        private static SmDependency LoopCharacteristicsDep = null;

        @objid ("246019b5-8eff-4d95-ab77-1c2cc1cb3109")
        private static SmDependency BoundaryEventRefDep = null;

        @objid ("278fb663-5e4a-4ba7-9f11-d65fa80377c8")
        private static SmDependency DataOutputAssociationDep = null;

        @objid ("bb86f8ce-1291-4ca2-884e-1a3e029ce5bf")
        private static SmDependency DefaultFlowDep = null;

        @objid ("90e3da22-a4c5-452a-bfd7-ab598bfd1308")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnActivityData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fba21216-5467-467b-af00-f6678442a6f6")
        public static SmAttribute IsForCompensationAtt() {
            if (IsForCompensationAtt == null) {
            	IsForCompensationAtt = classof().getAttributeDef("IsForCompensation");
            }
            return IsForCompensationAtt;
        }

        @objid ("3b957615-83d2-44da-a6b9-3e9f0fe9b045")
        public static SmAttribute StartQuantityAtt() {
            if (StartQuantityAtt == null) {
            	StartQuantityAtt = classof().getAttributeDef("StartQuantity");
            }
            return StartQuantityAtt;
        }

        @objid ("80256620-e7f0-4c53-ad74-fb29733ef69a")
        public static SmAttribute CompletionQuantityAtt() {
            if (CompletionQuantityAtt == null) {
            	CompletionQuantityAtt = classof().getAttributeDef("CompletionQuantity");
            }
            return CompletionQuantityAtt;
        }

        @objid ("dded99ca-4222-4a8d-9c1b-8afd4e97cb2a")
        public static SmDependency CompensateEventDefinitionsDep() {
            if (CompensateEventDefinitionsDep == null) {
            	CompensateEventDefinitionsDep = classof().getDependencyDef("CompensateEventDefinitions");
            }
            return CompensateEventDefinitionsDep;
        }

        @objid ("e69d8b40-f957-4ea4-8c32-be54085cdcdf")
        public static SmDependency InputSpecificationDep() {
            if (InputSpecificationDep == null) {
            	InputSpecificationDep = classof().getDependencyDef("InputSpecification");
            }
            return InputSpecificationDep;
        }

        @objid ("b7b8c328-c58b-4a61-8890-86e71ff0f63a")
        public static SmDependency DataInputAssociationDep() {
            if (DataInputAssociationDep == null) {
            	DataInputAssociationDep = classof().getDependencyDef("DataInputAssociation");
            }
            return DataInputAssociationDep;
        }

        @objid ("b1f36b33-8b45-4e15-90d4-3159c134b0fd")
        public static SmDependency OutputSpecificationDep() {
            if (OutputSpecificationDep == null) {
            	OutputSpecificationDep = classof().getDependencyDef("OutputSpecification");
            }
            return OutputSpecificationDep;
        }

        @objid ("225b1868-91cc-4caf-a952-218eb956ced4")
        public static SmDependency LoopCharacteristicsDep() {
            if (LoopCharacteristicsDep == null) {
            	LoopCharacteristicsDep = classof().getDependencyDef("LoopCharacteristics");
            }
            return LoopCharacteristicsDep;
        }

        @objid ("5ed49796-1d93-41c2-9589-5bb84f099575")
        public static SmDependency BoundaryEventRefDep() {
            if (BoundaryEventRefDep == null) {
            	BoundaryEventRefDep = classof().getDependencyDef("BoundaryEventRef");
            }
            return BoundaryEventRefDep;
        }

        @objid ("e4cec8c2-05e9-4ddd-8b89-695ffb456f80")
        public static SmDependency DataOutputAssociationDep() {
            if (DataOutputAssociationDep == null) {
            	DataOutputAssociationDep = classof().getDependencyDef("DataOutputAssociation");
            }
            return DataOutputAssociationDep;
        }

        @objid ("628be0a7-cdd0-487b-9c97-cac48879b01c")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("dc9582a3-232b-4608-99a3-335f0fd35b0d")
        public static SmAttribute getStartQuantityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartQuantityAtt;
        }

        @objid ("65a98942-2cb1-4228-af5b-68f75f0a0b63")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6c727a75-c7c3-4064-af97-6527ec6ee611")
        public static SmDependency getCompensateEventDefinitionsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompensateEventDefinitionsDep;
        }

        @objid ("d0972250-c705-4c62-8a08-803075eb754e")
        public static SmAttribute getCompletionQuantityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionQuantityAtt;
        }

        @objid ("9f78f5d9-c70c-40e7-82fb-893e5889d208")
        public static SmAttribute getIsForCompensationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsForCompensationAtt;
        }

        @objid ("e5419d35-e91c-4cb1-a3df-9514d5acdbfb")
        public static SmDependency getDataOutputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataOutputAssociationDep;
        }

        @objid ("5b298f9f-d73b-4a0b-bd3a-8d5baf5fdbb6")
        public static SmDependency getLoopCharacteristicsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopCharacteristicsDep;
        }

        @objid ("54baf6ca-dda1-44fd-b044-94420001e6d5")
        public static SmDependency getOutputSpecificationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputSpecificationDep;
        }

        @objid ("b27b9449-a6c5-4779-83a1-e37c04cf4330")
        public static SmDependency getBoundaryEventRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BoundaryEventRefDep;
        }

        @objid ("4203030a-7d75-4b04-9b3d-460a02483eaf")
        public static SmDependency getDataInputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataInputAssociationDep;
        }

        @objid ("637e8c74-8826-4373-8abe-430147652ac3")
        public static SmDependency getInputSpecificationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputSpecificationDep;
        }

        @objid ("54e78cd7-6d73-4a08-800e-fd4cda6a2fcf")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("00218eb4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("10832a7e-2d91-4041-820e-b17aca608613")
            public ISmObjectData createData() {
                return new BpmnActivityData();
            }

            @objid ("eda24b22-b459-4b97-916c-237490b682d6")
            public SmObjectImpl createImpl() {
                return new BpmnActivityImpl();
            }

        }

        @objid ("0021f002-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsForCompensationSmAttribute extends SmAttribute {
            @objid ("9db2fa5d-2e68-4b6d-8363-356ed943a9aa")
            public Object getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mIsForCompensation;
            }

            @objid ("d0916b36-a0bc-4fdf-96a1-4b0515e45c46")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnActivityData) data).mIsForCompensation = value;
            }

        }

        @objid ("00225150-c4c5-1fd8-97fe-001ec947cd2a")
        public static class StartQuantitySmAttribute extends SmAttribute {
            @objid ("877fe0d6-aff6-4c02-a3ff-3a477c949537")
            public Object getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mStartQuantity;
            }

            @objid ("218bedfe-2335-4e6a-bb28-85d014cbd9b1")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnActivityData) data).mStartQuantity = value;
            }

        }

        @objid ("0022b1f4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CompletionQuantitySmAttribute extends SmAttribute {
            @objid ("ccaee956-035d-4f81-b972-bfcec7b3380f")
            public Object getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mCompletionQuantity;
            }

            @objid ("f0f7f990-94d1-4de8-95a8-e7e4a6056aa6")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnActivityData) data).mCompletionQuantity = value;
            }

        }

        @objid ("002315e0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InputSpecificationSmDependency extends SmMultipleDependency {
            @objid ("ac478622-b766-42f9-9e63-4f1f9a7846fe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mInputSpecification != null)? ((BpmnActivityData)data).mInputSpecification:SmMultipleDependency.EMPTY;
            }

            @objid ("e973acb2-abc4-4397-b653-a387b9cd129a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mInputSpecification = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mInputSpecification;
            }

            @objid ("2738f602-82eb-4f3c-a06a-8a8463c15b0f")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.OwnerActivityDep();
            }

        }

        @objid ("00237af8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OutputSpecificationSmDependency extends SmMultipleDependency {
            @objid ("bbc52222-5380-4010-8f8c-52b4e004d819")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mOutputSpecification != null)? ((BpmnActivityData)data).mOutputSpecification:SmMultipleDependency.EMPTY;
            }

            @objid ("e38a112a-6ae8-4734-874c-7628b6b745e0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mOutputSpecification = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mOutputSpecification;
            }

            @objid ("f6771126-553c-4262-90fa-cc85320b109f")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.OwnerActivityDep();
            }

        }

        @objid ("0023df48-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BoundaryEventRefSmDependency extends SmMultipleDependency {
            @objid ("b55ce984-e9d0-42ef-99c0-eb4babae5867")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mBoundaryEventRef != null)? ((BpmnActivityData)data).mBoundaryEventRef:SmMultipleDependency.EMPTY;
            }

            @objid ("0b462437-fa7c-4e9a-828d-baeb54c16d7a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mBoundaryEventRef = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mBoundaryEventRef;
            }

            @objid ("c90c3400-ca67-4c4c-9ec1-319a27705c84")
            @Override
            public SmDependency getSymetric() {
                return BpmnBoundaryEventData.Metadata.AttachedToRefDep();
            }

        }

        @objid ("00244528-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("2d6f58b9-803b-4e3a-9b32-12dea88e9490")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mDefaultFlow;
            }

            @objid ("3e2a059b-c77e-40dc-a1e0-3d57ca5092c1")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnActivityData) data).mDefaultFlow = value;
            }

            @objid ("e0741410-ba61-4ee9-b941-0b1b37e2fccd")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultFromDep();
            }

        }

        @objid ("0024bdc8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DataInputAssociationSmDependency extends SmMultipleDependency {
            @objid ("d1ab0f9f-64dc-415e-bc62-f8e6c355a460")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mDataInputAssociation != null)? ((BpmnActivityData)data).mDataInputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("641ca576-9530-44d8-a5be-4c1dd700b19d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mDataInputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mDataInputAssociation;
            }

            @objid ("b018943d-e0cc-4fde-8d79-b158953522dc")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.StartingActivityDep();
            }

        }

        @objid ("0025242a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DataOutputAssociationSmDependency extends SmMultipleDependency {
            @objid ("117eb15a-24dd-4f7b-bf8f-25e82c1fcc94")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mDataOutputAssociation != null)? ((BpmnActivityData)data).mDataOutputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("87609e47-3e80-4039-b464-e3b7f3a5dcfe")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mDataOutputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mDataOutputAssociation;
            }

            @objid ("dccbcbbc-b50b-4e38-8cd1-de0d6b3e7741")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.EndingActivityDep();
            }

        }

        @objid ("00258a96-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LoopCharacteristicsSmDependency extends SmSingleDependency {
            @objid ("20bed9ce-3920-4394-ab21-374e44636ddb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mLoopCharacteristics;
            }

            @objid ("06f922a4-31ba-4d4d-8f94-e8149a1bff8e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnActivityData) data).mLoopCharacteristics = value;
            }

            @objid ("e6674f5c-2621-4e3e-b509-06b054989c87")
            @Override
            public SmDependency getSymetric() {
                return BpmnLoopCharacteristicsData.Metadata.OwnerActivityDep();
            }

        }

        @objid ("002605a2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CompensateEventDefinitionsSmDependency extends SmMultipleDependency {
            @objid ("07682370-3a2e-45e9-b09e-64e5a22d2a01")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mCompensateEventDefinitions != null)? ((BpmnActivityData)data).mCompensateEventDefinitions:SmMultipleDependency.EMPTY;
            }

            @objid ("8acb22f8-14f4-4585-a70c-b540fbc7740c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mCompensateEventDefinitions = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mCompensateEventDefinitions;
            }

            @objid ("a9dbe306-bd4c-4f6a-834e-704a151c6a14")
            @Override
            public SmDependency getSymetric() {
                return BpmnCompensateEventDefinitionData.Metadata.ActivityRefDep();
            }

        }

    }

}
