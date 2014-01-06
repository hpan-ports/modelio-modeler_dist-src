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
    @objid ("cb49d733-223d-4543-a70c-38e4d9b2895b")
    @SmaMetaAttribute(metaName="IsForCompensation", type=Boolean.class, smAttributeClass=Metadata.IsForCompensationSmAttribute.class)
     Object mIsForCompensation = false;

    @objid ("91ac45af-35b5-4603-8f84-716c390ed08c")
    @SmaMetaAttribute(metaName="StartQuantity", type=Integer.class, smAttributeClass=Metadata.StartQuantitySmAttribute.class)
     Object mStartQuantity = 1;

    @objid ("f7c318bd-3014-41b5-8b2e-2bc93f95af62")
    @SmaMetaAttribute(metaName="CompletionQuantity", type=Integer.class, smAttributeClass=Metadata.CompletionQuantitySmAttribute.class)
     Object mCompletionQuantity = 1;

    @objid ("0f970a60-1f0a-4287-8227-cc1ce861980f")
    @SmaMetaAssociation(metaName="CompensateEventDefinitions", typeDataClass=BpmnCompensateEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.CompensateEventDefinitionsSmDependency.class)
     List<SmObjectImpl> mCompensateEventDefinitions = null;

    @objid ("3907d7fe-d164-4447-b1dc-b94eb1fdbcd8")
    @SmaMetaAssociation(metaName="InputSpecification", typeDataClass=BpmnDataInputData.class, min=0, max=-1, smAssociationClass=Metadata.InputSpecificationSmDependency.class, component = true)
     List<SmObjectImpl> mInputSpecification = null;

    @objid ("e8126fcb-5e1e-464f-8729-394cc5704dfb")
    @SmaMetaAssociation(metaName="DataInputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataInputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataInputAssociation = null;

    @objid ("cc649f9c-237d-47d2-a58b-74c6d7c56692")
    @SmaMetaAssociation(metaName="OutputSpecification", typeDataClass=BpmnDataOutputData.class, min=0, max=-1, smAssociationClass=Metadata.OutputSpecificationSmDependency.class, component = true)
     List<SmObjectImpl> mOutputSpecification = null;

    @objid ("50d50a8e-5169-4efd-b2c8-8ae3f3439dbc")
    @SmaMetaAssociation(metaName="LoopCharacteristics", typeDataClass=BpmnLoopCharacteristicsData.class, min=0, max=1, smAssociationClass=Metadata.LoopCharacteristicsSmDependency.class, component = true)
     SmObjectImpl mLoopCharacteristics;

    @objid ("f5c3e7f2-7a67-4a75-a2e1-981920b3481d")
    @SmaMetaAssociation(metaName="BoundaryEventRef", typeDataClass=BpmnBoundaryEventData.class, min=0, max=-1, smAssociationClass=Metadata.BoundaryEventRefSmDependency.class, partof = true, istodelete = true)
     List<SmObjectImpl> mBoundaryEventRef = null;

    @objid ("8c0a7a56-4b10-4b67-b0cf-eaef26687e56")
    @SmaMetaAssociation(metaName="DataOutputAssociation", typeDataClass=BpmnDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.DataOutputAssociationSmDependency.class, component = true)
     List<SmObjectImpl> mDataOutputAssociation = null;

    @objid ("8347804c-5ebe-4644-861d-0a2bfa5338af")
    @SmaMetaAssociation(metaName="DefaultFlow", typeDataClass=BpmnSequenceFlowData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFlowSmDependency.class, partof = true)
     SmObjectImpl mDefaultFlow;

    @objid ("bfaab09c-42b6-4d1f-bcbf-4c37208f2bec")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00214e9a-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9c306cb3-abca-4ebf-9ae8-77628a0a7838")
        private static SmClass smClass = null;

        @objid ("292040c5-d493-4566-a05d-c07bce09c77a")
        private static SmAttribute IsForCompensationAtt = null;

        @objid ("09605b4d-7aac-49bd-850d-cf10afe7b96d")
        private static SmAttribute StartQuantityAtt = null;

        @objid ("6b320d93-9610-481b-a675-b1d6ac76641c")
        private static SmAttribute CompletionQuantityAtt = null;

        @objid ("de30859e-4cdf-4bed-9fcc-a733d65c6bae")
        private static SmDependency CompensateEventDefinitionsDep = null;

        @objid ("c01c5eda-0fad-4b93-9737-c4c816ab660f")
        private static SmDependency InputSpecificationDep = null;

        @objid ("cd854f19-382e-4f94-8eba-30293f81ee53")
        private static SmDependency DataInputAssociationDep = null;

        @objid ("a03ab320-652a-4fc4-98ba-e20b4bba5303")
        private static SmDependency OutputSpecificationDep = null;

        @objid ("19b8680f-4364-4f36-a770-81287ef9c857")
        private static SmDependency LoopCharacteristicsDep = null;

        @objid ("cd64ee1c-c85d-44c5-805b-db8a495558cd")
        private static SmDependency BoundaryEventRefDep = null;

        @objid ("01b8a014-4ab8-4038-866a-da6139c3f99c")
        private static SmDependency DataOutputAssociationDep = null;

        @objid ("236e0500-e772-4bdf-b7be-a76aa78a37e5")
        private static SmDependency DefaultFlowDep = null;

        @objid ("6be4feca-c591-4f1b-bcd8-a09234a62619")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnActivityData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ab3324bb-1530-44b7-b25b-9fab5f28485b")
        public static SmAttribute IsForCompensationAtt() {
            if (IsForCompensationAtt == null) {
            	IsForCompensationAtt = classof().getAttributeDef("IsForCompensation");
            }
            return IsForCompensationAtt;
        }

        @objid ("54cf8198-b24a-4399-a72f-4c1160ac67fd")
        public static SmAttribute StartQuantityAtt() {
            if (StartQuantityAtt == null) {
            	StartQuantityAtt = classof().getAttributeDef("StartQuantity");
            }
            return StartQuantityAtt;
        }

        @objid ("9aad7bd1-fd7f-4871-95c7-bcd3b8d5817b")
        public static SmAttribute CompletionQuantityAtt() {
            if (CompletionQuantityAtt == null) {
            	CompletionQuantityAtt = classof().getAttributeDef("CompletionQuantity");
            }
            return CompletionQuantityAtt;
        }

        @objid ("46e3c30b-5f3f-4fc0-8d20-3005f43d8d75")
        public static SmDependency CompensateEventDefinitionsDep() {
            if (CompensateEventDefinitionsDep == null) {
            	CompensateEventDefinitionsDep = classof().getDependencyDef("CompensateEventDefinitions");
            }
            return CompensateEventDefinitionsDep;
        }

        @objid ("b123eec1-64d2-422e-a88e-a745999f4e21")
        public static SmDependency InputSpecificationDep() {
            if (InputSpecificationDep == null) {
            	InputSpecificationDep = classof().getDependencyDef("InputSpecification");
            }
            return InputSpecificationDep;
        }

        @objid ("24ec038b-adfc-485c-bb54-ce1028926b44")
        public static SmDependency DataInputAssociationDep() {
            if (DataInputAssociationDep == null) {
            	DataInputAssociationDep = classof().getDependencyDef("DataInputAssociation");
            }
            return DataInputAssociationDep;
        }

        @objid ("ea0cf31f-41ae-4f75-a09c-a20f4632b5fe")
        public static SmDependency OutputSpecificationDep() {
            if (OutputSpecificationDep == null) {
            	OutputSpecificationDep = classof().getDependencyDef("OutputSpecification");
            }
            return OutputSpecificationDep;
        }

        @objid ("15690dbc-5b11-49c1-bf6c-068bff9b927b")
        public static SmDependency LoopCharacteristicsDep() {
            if (LoopCharacteristicsDep == null) {
            	LoopCharacteristicsDep = classof().getDependencyDef("LoopCharacteristics");
            }
            return LoopCharacteristicsDep;
        }

        @objid ("77c28ed1-31da-4dc4-8269-c2d299b907bc")
        public static SmDependency BoundaryEventRefDep() {
            if (BoundaryEventRefDep == null) {
            	BoundaryEventRefDep = classof().getDependencyDef("BoundaryEventRef");
            }
            return BoundaryEventRefDep;
        }

        @objid ("8c8ff28b-80e8-49e3-8a3f-3ad4f622ae16")
        public static SmDependency DataOutputAssociationDep() {
            if (DataOutputAssociationDep == null) {
            	DataOutputAssociationDep = classof().getDependencyDef("DataOutputAssociation");
            }
            return DataOutputAssociationDep;
        }

        @objid ("06904fd1-fa7d-4da0-9aa7-ba8693d2e13d")
        public static SmDependency DefaultFlowDep() {
            if (DefaultFlowDep == null) {
            	DefaultFlowDep = classof().getDependencyDef("DefaultFlow");
            }
            return DefaultFlowDep;
        }

        @objid ("94ab1bf9-654e-41af-b900-4f9ad6439daa")
        public static SmDependency getOutputSpecificationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutputSpecificationDep;
        }

        @objid ("84e24b28-3751-4d5d-b4af-80e644c9846e")
        public static SmDependency getLoopCharacteristicsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LoopCharacteristicsDep;
        }

        @objid ("e797b381-7bd1-4f10-be00-ff8bf811a997")
        public static SmAttribute getCompletionQuantityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompletionQuantityAtt;
        }

        @objid ("fdf71f2c-c2c0-429f-a706-812d207e957f")
        public static SmDependency getCompensateEventDefinitionsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CompensateEventDefinitionsDep;
        }

        @objid ("eb5c2b34-6315-4b5c-a51d-ceb7869e0dfd")
        public static SmAttribute getStartQuantityAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return StartQuantityAtt;
        }

        @objid ("12dfb8ea-52f7-4d06-a339-13123e35c562")
        public static SmDependency getDataOutputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataOutputAssociationDep;
        }

        @objid ("80d3aff6-1845-4290-98af-c54923d7d4da")
        public static SmDependency getDefaultFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFlowDep;
        }

        @objid ("1f2b2684-6030-4e1f-aec5-8e72ee6dc262")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("79950529-2e68-4185-9d95-5fc1cfab06fb")
        public static SmDependency getInputSpecificationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InputSpecificationDep;
        }

        @objid ("102703bd-e407-4188-bf6a-b303c1716a9c")
        public static SmDependency getDataInputAssociationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DataInputAssociationDep;
        }

        @objid ("a343f3e6-867d-4c9c-92b3-8d026da9cb34")
        public static SmDependency getBoundaryEventRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BoundaryEventRefDep;
        }

        @objid ("3efb2f43-83de-4d49-98de-5f922497d463")
        public static SmAttribute getIsForCompensationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsForCompensationAtt;
        }

        @objid ("00218eb4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b79d080c-f21d-4f89-9e57-4fb2535bb4d6")
            public ISmObjectData createData() {
                return new BpmnActivityData();
            }

            @objid ("eedbf8bf-f888-4884-bf81-02ac7f6b8597")
            public SmObjectImpl createImpl() {
                return new BpmnActivityImpl();
            }

        }

        @objid ("0021f002-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsForCompensationSmAttribute extends SmAttribute {
            @objid ("aae1b575-29ab-4557-bc2a-8d0e3151aeee")
            public Object getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mIsForCompensation;
            }

            @objid ("2e64b6e0-b9b6-4fe7-bdfe-473afc6392cc")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnActivityData) data).mIsForCompensation = value;
            }

        }

        @objid ("00225150-c4c5-1fd8-97fe-001ec947cd2a")
        public static class StartQuantitySmAttribute extends SmAttribute {
            @objid ("97b4fe93-0603-4c20-9402-fa2783d0f563")
            public Object getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mStartQuantity;
            }

            @objid ("4a56d366-a00b-44e5-8c68-fffec28e07cb")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnActivityData) data).mStartQuantity = value;
            }

        }

        @objid ("0022b1f4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CompletionQuantitySmAttribute extends SmAttribute {
            @objid ("251d7c36-089d-4756-ad8f-d858ae1d6adf")
            public Object getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mCompletionQuantity;
            }

            @objid ("b376f760-120f-4a5f-a418-84557c4ec7c7")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnActivityData) data).mCompletionQuantity = value;
            }

        }

        @objid ("002315e0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InputSpecificationSmDependency extends SmMultipleDependency {
            @objid ("9a919b2c-7acc-432d-b64b-7998c2c3c11f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mInputSpecification != null)? ((BpmnActivityData)data).mInputSpecification:SmMultipleDependency.EMPTY;
            }

            @objid ("3f38ed77-e189-43e6-a9d1-930d4354da3a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mInputSpecification = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mInputSpecification;
            }

            @objid ("250eb79f-e7fd-4c61-8bbd-ee580dcef471")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataInputData.Metadata.OwnerActivityDep();
            }

        }

        @objid ("00237af8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OutputSpecificationSmDependency extends SmMultipleDependency {
            @objid ("57585f13-d309-41e7-aaa5-c4bdca7d2573")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mOutputSpecification != null)? ((BpmnActivityData)data).mOutputSpecification:SmMultipleDependency.EMPTY;
            }

            @objid ("06595ba2-8f9c-4f1f-b99b-78a4525a8c6e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mOutputSpecification = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mOutputSpecification;
            }

            @objid ("5d528d40-ea46-41d1-bf1d-e5d334363512")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataOutputData.Metadata.OwnerActivityDep();
            }

        }

        @objid ("0023df48-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BoundaryEventRefSmDependency extends SmMultipleDependency {
            @objid ("52e7b38f-70a0-465f-9e20-236510cbca41")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mBoundaryEventRef != null)? ((BpmnActivityData)data).mBoundaryEventRef:SmMultipleDependency.EMPTY;
            }

            @objid ("9c3338c4-d0a6-40fa-ad03-91e0ed840053")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mBoundaryEventRef = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mBoundaryEventRef;
            }

            @objid ("7bf6c305-584a-4bb8-a7d7-fedd959870f8")
            @Override
            public SmDependency getSymetric() {
                return BpmnBoundaryEventData.Metadata.AttachedToRefDep();
            }

        }

        @objid ("00244528-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultFlowSmDependency extends SmSingleDependency {
            @objid ("8edef0ce-0c59-4346-9b6f-56d6ab62987d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mDefaultFlow;
            }

            @objid ("2071ed6f-f0eb-46ba-9a99-b82fd168939a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnActivityData) data).mDefaultFlow = value;
            }

            @objid ("aed1c332-11da-4cc4-b4bb-71facd74e054")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.DefaultFromDep();
            }

        }

        @objid ("0024bdc8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DataInputAssociationSmDependency extends SmMultipleDependency {
            @objid ("e2a1c9d6-5b0f-46a0-94a5-ccc1a99edf7e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mDataInputAssociation != null)? ((BpmnActivityData)data).mDataInputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("032987be-469c-40d6-83a0-3cacbb50c2dc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mDataInputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mDataInputAssociation;
            }

            @objid ("1ecdfbf3-df1b-4be4-8c99-6cedb16bf08d")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.StartingActivityDep();
            }

        }

        @objid ("0025242a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DataOutputAssociationSmDependency extends SmMultipleDependency {
            @objid ("4cb343a7-e6d8-41ac-8a17-0f9f7474027b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mDataOutputAssociation != null)? ((BpmnActivityData)data).mDataOutputAssociation:SmMultipleDependency.EMPTY;
            }

            @objid ("10ee13c4-efa6-4e3e-8ec8-ff145317b525")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mDataOutputAssociation = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mDataOutputAssociation;
            }

            @objid ("dc6d9ece-ca5a-40e9-b321-aa61a3f8f1b3")
            @Override
            public SmDependency getSymetric() {
                return BpmnDataAssociationData.Metadata.EndingActivityDep();
            }

        }

        @objid ("00258a96-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LoopCharacteristicsSmDependency extends SmSingleDependency {
            @objid ("da203f23-de8e-4cd0-bdd7-a16c74f2e6f9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnActivityData) data).mLoopCharacteristics;
            }

            @objid ("2e07242a-9eb7-44ce-a915-179d2f0d3d0b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnActivityData) data).mLoopCharacteristics = value;
            }

            @objid ("e8b15e83-ee29-446b-ba0c-8f3ca09c7eb6")
            @Override
            public SmDependency getSymetric() {
                return BpmnLoopCharacteristicsData.Metadata.OwnerActivityDep();
            }

        }

        @objid ("002605a2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CompensateEventDefinitionsSmDependency extends SmMultipleDependency {
            @objid ("8278a914-4cf5-4184-8232-3d74606caac0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnActivityData)data).mCompensateEventDefinitions != null)? ((BpmnActivityData)data).mCompensateEventDefinitions:SmMultipleDependency.EMPTY;
            }

            @objid ("f9e79b49-b8bf-4fb0-b349-75790d847350")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnActivityData) data).mCompensateEventDefinitions = new ArrayList<>(initialCapacity);
                return ((BpmnActivityData) data).mCompensateEventDefinitions;
            }

            @objid ("dce3a72a-e1e4-43d4-8be2-4f9311409f58")
            @Override
            public SmDependency getSymetric() {
                return BpmnCompensateEventDefinitionData.Metadata.ActivityRefDep();
            }

        }

    }

}
