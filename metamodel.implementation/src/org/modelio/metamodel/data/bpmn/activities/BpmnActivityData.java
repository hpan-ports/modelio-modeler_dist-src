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
    @objid ("96589cfc-b6a3-46e5-be4f-9cbbcbee870a")
    @SmaMetaAttribute(metaName="IsForCompensation", type=Boolean.class, smAttributeClass=Metadata.IsForCompensationSmAttribute.class)
     Object mIsForCompensation = false;

    @objid ("b118dba0-c4dc-4273-8f62-d395cd0bd7ad")
    @SmaMetaAttribute(metaName="StartQuantity", type=Integer.class, smAttributeClass=Metadata.StartQuantitySmAttribute.class)
     Object mStartQuantity = 1;

    @objid ("9c1bc104-2d77-44dd-8503-fca13946af64")
    @SmaMetaAttribute(metaName="CompletionQuantity", type=Integer.class, smAttributeClass=Metadata.CompletionQuantitySmAttribute.class)
     Object mCompletionQuantity = 1;

    @objid ("c4e470d6-6650-467a-a245-77a6a1d32739")
    @SmaMetaAssociation(metaName="CompensateEventDefinitions", typeDataClass=BpmnCompensateEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.CompensateEventDefinitionsSmDependency.class)
     List<SmObjectImpl> mCompensateEventDefinitions = null;

    @objid ("ff1f1008-bd1a-4f2c-8340-92f9c7360e0b")
    @SmaMetaAssociation(metaName="InputSpecification", typeDataClass=BpmnDataInputData.class, min=0, max=-1, smAssociationClass=Metadata.InputSpecificationSmDependency.class, component = true)
     List<SmObjectImpl> mInputSpecification = null;

    @objid ("7d310840-102a-4342-9a35-ab37b1dd2ff1")
    @SmaMetaAssociation(metaName="DataInputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataInputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataInputAssociation = null;

    @objid ("eb871e83-3201-4459-bdee-57da1cafa049")
    @SmaMetaAssociation(metaName="OutputSpecification", typeDataClass=BpmnDataOutputData.class, min=0, max=-1, smAssociationClass=Metadata.OutputSpecificationSmDependency.class, component = true)
     List<SmObjectImpl> mOutputSpecification = null;

    @objid ("dc6a6d0e-e462-4d32-94b4-e93f8253396c")
    @SmaMetaAssociation(metaName="LoopCharacteristics", typeDataClass=BpmnLoopCharacteristicsData.class, min=0, max=1, smAssociationClass=Metadata.LoopCharacteristicsSmDependency.class, component = true)
     SmObjectImpl mLoopCharacteristics;

    @objid ("0ad437ef-5e7e-401c-860e-6968403f29a1")
    @SmaMetaAssociation(metaName="BoundaryEventRef", typeDataClass=BpmnBoundaryEventData.class, min=0, max=-1, smAssociationClass=Metadata.BoundaryEventRefSmDependency.class, partof = true, istodelete = true)
     List<SmObjectImpl> mBoundaryEventRef = null;

    @objid ("6028d3a3-95be-4a8d-85e5-61e597c98c75")
    @SmaMetaAssociation(metaName="DataOutputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataOutputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataOutputAssociation = null;

    @objid ("b3dd3426-31f1-40e3-974d-360d07323732")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("c13c449c-381f-4ac8-b1a9-cae8549b1d03")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00214e9a-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("51ee504b-7db8-4384-924a-69b3f19db91b")
        private static SmClass smClass = null;

        @objid ("40400aef-9c27-41eb-b183-84833e9ae33c")
        private static SmAttribute IsForCompensationAtt = null;

        @objid ("bd81c39e-cc5f-44aa-9741-5e7e8748bee8")
        private static SmAttribute StartQuantityAtt = null;

        @objid ("3476bba8-a184-42f2-b73d-d6c202518a78")
        private static SmAttribute CompletionQuantityAtt = null;

        @objid ("3a41f2c5-ba5e-4537-b947-7cbea23a2f75")
        private static SmDependency CompensateEventDefinitionsDep = null;

        @objid ("222eb639-79fc-44ce-a84f-ad1476ce75f3")
        private static SmDependency InputSpecificationDep = null;

        @objid ("e27faddf-a11a-4dd7-a7cf-1f188cd3327d")
        private static SmDependency DataInputAssociationDep = null;

        @objid ("330ff147-21c6-4f7f-b097-68632b23b6b3")
        private static SmDependency OutputSpecificationDep = null;

        @objid ("a8606f0d-6acf-44cc-a55e-2d64db3f1f64")
        private static SmDependency LoopCharacteristicsDep = null;

        @objid ("ebe753bf-2c90-4f63-8f27-1aeb8bed6413")
        private static SmDependency BoundaryEventRefDep = null;

        @objid ("ef9c95a8-c8e7-449b-b3b5-923c6b477de3")
        private static SmDependency DataOutputAssociationDep = null;

        @objid ("749c850e-bd00-4b6f-8406-524b2a1a6d21")
        private static SmDependency DefaultFlowDep = null;

        @objid ("26122cdb-8b7b-42c7-a1ee-6c4c5b8f1efc")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnActivityData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("52790d54-e020-4375-8988-4682ade7a271")
        public static SmAttribute IsForCompensationAtt() {
            if (IsForCompensationAtt == null) {
            	IsForCompensationAtt = classof().getAttributeDef("IsForCompensation");
            }
            return IsForCompensationAtt;
        }

        @objid ("0b2e7fd3-4529-4e11-a432-95c94949cca6")
        public static SmAttribute StartQuantityAtt() {
            if (StartQuantityAtt == null) {
            	StartQuantityAtt = classof().getAttributeDef("StartQuantity");
            }
            return StartQuantityAtt;
        }

        @objid ("3cb4a316-b0c1-49a2-9355-93c97833c6a2")
        public static SmAttribute CompletionQuantityAtt() {
            if (CompletionQuantityAtt == null) {
            	CompletionQuantityAtt = classof().getAttributeDef("CompletionQuantity");
            }
            return CompletionQuantityAtt;
        }

        @objid ("93c40987-2c27-468b-807b-010d0953125d")
        public static SmDependency CompensateEventDefinitionsDep() {
            if (CompensateEventDefinitionsDep == null) {
            	CompensateEventDefinitionsDep = classof().getDependencyDef("CompensateEventDefinitions");
            }
            return CompensateEventDefinitionsDep;
        }

        @objid ("378068f7-555d-4033-8fb3-82a6c474c7ef")
        public static SmDependency InputSpecificationDep() {
            if (InputSpecificationDep == null) {
            	InputSpecificationDep = classof().getDependencyDef("InputSpecification");
            }
            return InputSpecificationDep;
        }

        @objid ("c9c0525e-0a49-4a0f-9916-512f9a61cc54")
        public static SmDependency DataInputAssociationDep() {
            if (DataInputAssociationDep == null) {
            	DataInputAssociationDep = classof().getDependencyDef("DataInputAssociation");
            }
            return DataInputAssociationDep;
        }

        @objid ("8ffdb3b3-9509-47e4-9983-62c31fd9bc24")
        public static SmDependency OutputSpecificationDep() {
            if (OutputSpecificationDep == null) {
            	OutputSpecificationDep = classof().getDependencyDef("OutputSpecification");
            }
            return OutputSpecificationDep;
        }

        @objid ("2ddb7d48-fb81-473f-9ff8-be8a5f764327")
        public static SmDependency LoopCharacteristicsDep() {
            if (LoopCharacteristicsDep == null) {
            	LoopCharacteristicsDep = classof().getDependencyDef("LoopCharacteristics");
            }
            return LoopCharacteristicsDep;
        }

        @objid ("12b6a443-4069-4501-b72e-d89ecb8e5022")
        public static SmDependency BoundaryEventRefDep() {
            if (BoundaryEventRefDep == null) {
            	BoundaryEventRefDep = classof().getDependencyDef("BoundaryEventRef");
            }
            return BoundaryEventRefDep;
        }

        @objid ("011f1a9c-f124-4952-8210-09eed0dc435c")
        public static SmDependency DataOutputAssociationDep() {
            if (DataOutputAssociationDep == null) {
            	DataOutputAssociationDep = classof().getDependencyDef("DataOutputAssociation");
            }
            return DataOutputAssociationDep;
        }

        @objid ("139e987a-08bf-417e-8d14-7a3fed1196bf")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("7f28e6fe-5e9b-424f-a650-3b0e7aa92eee")
        public static SmDependency getBoundaryEventRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BoundaryEventRefDep;
        }

        @objid ("cc6dac42-dac0-4553-a8ea-49e069f8592e")
        public static SmAttribute getIsForCompensationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsForCompensationAtt;
        }

        @objid ("99953517-64fd-469f-9fbe-4fd997f66808")
        public static SmDependency getCompensateEventDefinitionsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompensateEventDefinitionsDep;
        }

        @objid ("d38f448a-071e-4a77-9098-31f67f74db54")
        public static SmDependency getLoopCharacteristicsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopCharacteristicsDep;
        }

        @objid ("72309151-a182-4e79-b74a-d6ee91901bb4")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("a2fd6c8b-3124-4f62-9f59-12e7d23b47f0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1f868d0c-6b6d-4502-b5c6-e54593374876")
        public static SmAttribute getCompletionQuantityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionQuantityAtt;
        }

        @objid ("e9374882-2a74-4df0-a06a-5d70f5faec6c")
        public static SmDependency getDataInputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataInputAssociationDep;
        }

        @objid ("780e9e3d-b4e1-4c17-a651-7efccd7d7608")
        public static SmDependency getOutputSpecificationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputSpecificationDep;
        }

        @objid ("526328a2-6548-4a4a-a4f3-4b38873c0895")
        public static SmDependency getInputSpecificationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputSpecificationDep;
        }

        @objid ("5a4df22b-136a-4a7c-90da-a206729dbdb4")
        public static SmAttribute getStartQuantityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartQuantityAtt;
        }

        @objid ("c95e4038-96af-4ba9-90e2-16bc085573c9")
        public static SmDependency getDataOutputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataOutputAssociationDep;
        }

        @objid ("00218eb4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0f1aace8-ff6d-427d-89c0-e8683545eeb1")
            public ISmObjectData createData() {
                return new BpmnActivityData();
            }

            @objid ("9202e9c4-91f0-45c6-b0ef-4c53374dd9b0")
            public SmObjectImpl createImpl() {
                return new BpmnActivityImpl();
            }

        }

        @objid ("0021f002-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsForCompensationSmAttribute extends SmAttribute {
            @objid ("13d5275d-fca5-4a05-8d10-c59934512777")
            public Object getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mIsForCompensation;
            }

            @objid ("6e39b59c-d544-4569-bbb8-1c05733684e0")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnActivityData) data).mIsForCompensation = value;
            }

        }

        @objid ("00225150-c4c5-1fd8-97fe-001ec947cd2a")
        public static class StartQuantitySmAttribute extends SmAttribute {
            @objid ("ccb14fb6-4992-4fb1-b90b-e751afe3b3ac")
            public Object getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mStartQuantity;
            }

            @objid ("0e7a8de4-c8fa-4f42-9089-073411fec174")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnActivityData) data).mStartQuantity = value;
            }

        }

        @objid ("0022b1f4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CompletionQuantitySmAttribute extends SmAttribute {
            @objid ("66b8c6a7-1d40-4084-a70f-7918447aacad")
            public Object getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mCompletionQuantity;
            }

            @objid ("a54eb5bb-6b9d-4d58-8775-0239f816e618")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnActivityData) data).mCompletionQuantity = value;
            }

        }

        @objid ("002315e0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InputSpecificationSmDependency extends SmMultipleDependency {
            @objid ("0088e49b-162b-480d-b748-d2e32fb9656b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mInputSpecification != null)? ((BpmnActivityData)data).mInputSpecification:SmMultipleDependency.EMPTY;
            }

            @objid ("2b713c90-6ed0-4fed-9c5a-7d97f3367e19")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mInputSpecification = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mInputSpecification;
            }

            @objid ("988c4bdc-444d-4bfc-b7cb-04a76f7b4d11")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.OwnerActivityDep();
            }

        }

        @objid ("00237af8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OutputSpecificationSmDependency extends SmMultipleDependency {
            @objid ("7f0e6ef4-f7dc-4b79-99e6-b894bcb27e64")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mOutputSpecification != null)? ((BpmnActivityData)data).mOutputSpecification:SmMultipleDependency.EMPTY;
            }

            @objid ("f132d81d-a06e-472d-9915-6bc2ca97a0aa")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mOutputSpecification = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mOutputSpecification;
            }

            @objid ("cd88395b-67b7-4d93-8b1d-dc4754b806c6")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.OwnerActivityDep();
            }

        }

        @objid ("0023df48-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BoundaryEventRefSmDependency extends SmMultipleDependency {
            @objid ("8ccdf1e1-ea54-42b4-a70d-002716e3f380")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mBoundaryEventRef != null)? ((BpmnActivityData)data).mBoundaryEventRef:SmMultipleDependency.EMPTY;
            }

            @objid ("c638a8f9-51dd-4923-bd2b-538a87991b63")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mBoundaryEventRef = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mBoundaryEventRef;
            }

            @objid ("e74defb2-2bc2-4cdc-8ad6-a50d9cf91ff4")
            @Override
            public SmDependency getSymetric() {
                return BpmnBoundaryEventData.Metadata.AttachedToRefDep();
            }

        }

        @objid ("00244528-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("473ad36f-2fbc-4c87-ac11-8e138923629a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mDefaultFlow;
            }

            @objid ("c8625271-9786-482a-a9c4-b18749842979")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnActivityData) data).mDefaultFlow = value;
            }

            @objid ("1cfdbe0c-6891-45e6-a7e5-7e0ac6a0d281")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultFromDep();
            }

        }

        @objid ("0024bdc8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DataInputAssociationSmDependency extends SmMultipleDependency {
            @objid ("ebea440f-ddd7-422b-bbbd-3ff4f4141a49")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mDataInputAssociation != null)? ((BpmnActivityData)data).mDataInputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("d076e75a-64d0-47f8-8f62-17abcd4ada3f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mDataInputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mDataInputAssociation;
            }

            @objid ("5b55335b-a99f-4f3f-bdf6-518c94b593f4")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.StartingActivityDep();
            }

        }

        @objid ("0025242a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DataOutputAssociationSmDependency extends SmMultipleDependency {
            @objid ("7bd124fc-bee4-4d83-823f-e2bd859ae336")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mDataOutputAssociation != null)? ((BpmnActivityData)data).mDataOutputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("d6b32029-654c-415e-bcd5-76ebc1f86575")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mDataOutputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mDataOutputAssociation;
            }

            @objid ("ad411e92-52c8-4409-8c32-0b0561daa6e3")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.EndingActivityDep();
            }

        }

        @objid ("00258a96-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LoopCharacteristicsSmDependency extends SmSingleDependency {
            @objid ("35b7b061-49b0-41e3-baeb-cda11770e7e9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mLoopCharacteristics;
            }

            @objid ("f4eb8147-00d5-4215-95ed-580de4c0730b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnActivityData) data).mLoopCharacteristics = value;
            }

            @objid ("c75e6743-672d-40ae-8eb7-c2db605c98de")
            @Override
            public SmDependency getSymetric() {
                return BpmnLoopCharacteristicsData.Metadata.OwnerActivityDep();
            }

        }

        @objid ("002605a2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CompensateEventDefinitionsSmDependency extends SmMultipleDependency {
            @objid ("fb21579e-359c-47b8-ac55-5a6da2e00bb5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mCompensateEventDefinitions != null)? ((BpmnActivityData)data).mCompensateEventDefinitions:SmMultipleDependency.EMPTY;
            }

            @objid ("0de05bd7-6354-4117-9697-b706892afd59")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mCompensateEventDefinitions = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mCompensateEventDefinitions;
            }

            @objid ("4dd2de0b-a12f-4dcb-b087-d4550af2acc0")
            @Override
            public SmDependency getSymetric() {
                return BpmnCompensateEventDefinitionData.Metadata.ActivityRefDep();
            }

        }

    }

}
