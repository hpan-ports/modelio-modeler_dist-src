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
package org.modelio.metamodel.data.bpmn.flows;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.data.bpmn.activities.BpmnActivityData;
import org.modelio.metamodel.data.bpmn.gateways.BpmnComplexGatewayData;
import org.modelio.metamodel.data.bpmn.gateways.BpmnExclusiveGatewayData;
import org.modelio.metamodel.data.bpmn.gateways.BpmnInclusiveGatewayData;
import org.modelio.metamodel.data.bpmn.objects.BpmnSequenceFlowDataAssociationData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowNodeData;
import org.modelio.metamodel.impl.bpmn.flows.BpmnSequenceFlowImpl;
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

@objid ("007d254e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnSequenceFlow.class, factory=BpmnSequenceFlowData.Metadata.ObjectFactory.class)
public class BpmnSequenceFlowData extends BpmnFlowElementData {
    @objid ("788879fb-3676-4cde-9d4d-bee62629c982")
    @SmaMetaAttribute(metaName="IsImmediate", type=Boolean.class, smAttributeClass=Metadata.IsImmediateSmAttribute.class)
     Object mIsImmediate = false;

    @objid ("cc2e757d-8b60-4ec6-b5b0-4ac02822435b")
    @SmaMetaAttribute(metaName="ConditionExpression", type=String.class, smAttributeClass=Metadata.ConditionExpressionSmAttribute.class)
     Object mConditionExpression = "";

    @objid ("95771bfe-c3a5-49a6-a203-172932d51004")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnFlowNodeData.class, min=1, max=1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     SmObjectImpl mSourceRef;

    @objid ("44c03157-d383-4cc6-b663-740785dec97c")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnFlowNodeData.class, min=1, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("93731f20-77d9-4253-ae05-158d62ae6e9a")
    @SmaMetaAssociation(metaName="DefaultOfInclusive", typeDataClass=BpmnInclusiveGatewayData.class, min=0, max=1, smAssociationClass=Metadata.DefaultOfInclusiveSmDependency.class)
     SmObjectImpl mDefaultOfInclusive;

    @objid ("a5e8cba4-f953-45e3-b5be-d29776ca35be")
    @SmaMetaAssociation(metaName="DefaultFrom", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFromSmDependency.class)
     SmObjectImpl mDefaultFrom;

    @objid ("22606bf7-6338-4569-932f-8bb148e5b965")
    @SmaMetaAssociation(metaName="DefaultOfExclusive", typeDataClass=BpmnExclusiveGatewayData.class, min=0, max=1, smAssociationClass=Metadata.DefaultOfExclusiveSmDependency.class)
     SmObjectImpl mDefaultOfExclusive;

    @objid ("7992d6a8-8f15-4105-aaee-3e632d866964")
    @SmaMetaAssociation(metaName="Connector", typeDataClass=BpmnSequenceFlowDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectorSmDependency.class, component = true)
     List<SmObjectImpl> mConnector = null;

    @objid ("d35ee98a-0643-49f1-8dc5-9d6850a0b7e5")
    @SmaMetaAssociation(metaName="DefaultOfComplex", typeDataClass=BpmnComplexGatewayData.class, min=0, max=1, smAssociationClass=Metadata.DefaultOfComplexSmDependency.class)
     SmObjectImpl mDefaultOfComplex;

    @objid ("2165dc41-6500-499e-95e5-260dc8d6a3a6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0078e0a6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("afb11c3e-f9d3-4a7e-b99f-7f406346f484")
        private static SmClass smClass = null;

        @objid ("463ee41c-984f-41df-9367-14662a5c6b09")
        private static SmAttribute IsImmediateAtt = null;

        @objid ("5547a830-1723-4b11-bb17-6d38a66190e4")
        private static SmAttribute ConditionExpressionAtt = null;

        @objid ("ac478744-c5ae-4577-b64e-36c4087550e9")
        private static SmDependency SourceRefDep = null;

        @objid ("30229051-98b5-4cff-afd9-147de0faa059")
        private static SmDependency TargetRefDep = null;

        @objid ("79dd54d4-6452-4224-90e2-af668c638a29")
        private static SmDependency DefaultOfInclusiveDep = null;

        @objid ("5217f59f-6518-4ae9-a806-f8f7af2a0245")
        private static SmDependency DefaultFromDep = null;

        @objid ("08832e3e-936a-4a4a-9320-e18ff4032238")
        private static SmDependency DefaultOfExclusiveDep = null;

        @objid ("50013a8d-cad0-4821-908a-728a0be0acb9")
        private static SmDependency ConnectorDep = null;

        @objid ("11edf242-c93c-4317-86c9-15d0496236ac")
        private static SmDependency DefaultOfComplexDep = null;

        @objid ("3322c211-6574-47d0-95e0-f99767f4e38f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSequenceFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("9d12d6bd-94f2-4fa2-bf2e-d168f97d7e6f")
        public static SmAttribute IsImmediateAtt() {
            if (IsImmediateAtt == null) {
            	IsImmediateAtt = classof().getAttributeDef("IsImmediate");
            }
            return IsImmediateAtt;
        }

        @objid ("c75a3b5b-7001-4714-a761-735880b22335")
        public static SmAttribute ConditionExpressionAtt() {
            if (ConditionExpressionAtt == null) {
            	ConditionExpressionAtt = classof().getAttributeDef("ConditionExpression");
            }
            return ConditionExpressionAtt;
        }

        @objid ("a3eff719-95ab-467e-ab58-df3683e23efe")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("a1d40bbf-7afc-482b-8aef-a5c5e2de0f19")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("c927a785-eee8-4478-acf1-fd5e998aeafb")
        public static SmDependency DefaultOfInclusiveDep() {
            if (DefaultOfInclusiveDep == null) {
            	DefaultOfInclusiveDep = classof().getDependencyDef("DefaultOfInclusive");
            }
            return DefaultOfInclusiveDep;
        }

        @objid ("f01be8b3-3046-4a46-92a6-03e1e964a4d9")
        public static SmDependency DefaultFromDep() {
            if (DefaultFromDep == null) {
            	DefaultFromDep = classof().getDependencyDef("DefaultFrom");
            }
            return DefaultFromDep;
        }

        @objid ("1856fc7e-9b06-471b-b601-cd7d20b48ef1")
        public static SmDependency DefaultOfExclusiveDep() {
            if (DefaultOfExclusiveDep == null) {
            	DefaultOfExclusiveDep = classof().getDependencyDef("DefaultOfExclusive");
            }
            return DefaultOfExclusiveDep;
        }

        @objid ("bd8eea0f-63fe-432a-89e8-0c5e7209a756")
        public static SmDependency ConnectorDep() {
            if (ConnectorDep == null) {
            	ConnectorDep = classof().getDependencyDef("Connector");
            }
            return ConnectorDep;
        }

        @objid ("b995089b-fac1-4ee9-8e62-1cebd98764f7")
        public static SmDependency DefaultOfComplexDep() {
            if (DefaultOfComplexDep == null) {
            	DefaultOfComplexDep = classof().getDependencyDef("DefaultOfComplex");
            }
            return DefaultOfComplexDep;
        }

        @objid ("c6320d73-867c-4e1f-89a9-515c1ccdb71a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("421946de-8441-42f1-ba38-3d9a59f57379")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("7256192a-b866-4ee0-8628-5ac87892c03b")
        public static SmDependency getDefaultFromDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFromDep;
        }

        @objid ("abeace34-705a-457e-8f28-ca2d3ddb8128")
        public static SmDependency getConnectorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectorDep;
        }

        @objid ("87ac9f4c-2b11-401e-9022-49ab30d02605")
        public static SmDependency getDefaultOfComplexDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultOfComplexDep;
        }

        @objid ("49233cf1-9aba-4dfa-8ab7-fc7e15a4bfdd")
        public static SmAttribute getConditionExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConditionExpressionAtt;
        }

        @objid ("3bb6b6fe-e21c-43b7-9216-ca3c77ab3f71")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("0aeee34c-2966-4445-8f38-3cf489aa0589")
        public static SmDependency getDefaultOfInclusiveDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultOfInclusiveDep;
        }

        @objid ("76a5163d-3605-40ed-80eb-8be80c00c3ce")
        public static SmAttribute getIsImmediateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsImmediateAtt;
        }

        @objid ("4037faf0-41de-454c-9e3e-821d67a48dd7")
        public static SmDependency getDefaultOfExclusiveDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultOfExclusiveDep;
        }

        @objid ("00793592-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("56fa0c0a-de05-4a23-bb8c-9a7394fdef42")
            public ISmObjectData createData() {
                return new BpmnSequenceFlowData();
            }

            @objid ("d59f52f0-67e2-48f4-bc1c-5ced2b406e89")
            public SmObjectImpl createImpl() {
                return new BpmnSequenceFlowImpl();
            }

        }

        @objid ("0079a8c4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsImmediateSmAttribute extends SmAttribute {
            @objid ("1659b5a5-cce4-4ee1-9108-3d8d7d931b0b")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mIsImmediate;
            }

            @objid ("2d4921b6-378e-4b26-8d1d-1ace5d98230c")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSequenceFlowData) data).mIsImmediate = value;
            }

        }

        @objid ("007a1c0a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConditionExpressionSmAttribute extends SmAttribute {
            @objid ("eaf16e23-fd73-4c7b-9705-32540a79ce79")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mConditionExpression;
            }

            @objid ("8f5d8d64-6874-4b7a-923d-2f05b334fdd7")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSequenceFlowData) data).mConditionExpression = value;
            }

        }

        @objid ("007a90ae-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmSingleDependency {
            @objid ("70113346-fbe1-4054-b318-8dd28b1c23d7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mSourceRef;
            }

            @objid ("711ca044-c53b-4372-914b-8bd63d32ac5c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mSourceRef = value;
            }

            @objid ("1ddc4f74-676c-420d-90cc-bf7cf339e757")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowNodeData.Metadata.OutgoingDep();
            }

        }

        @objid ("007b1ede-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("f78cd3f3-e100-4fcf-8224-54ba77932238")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mTargetRef;
            }

            @objid ("a26b1ec7-33b9-439d-935e-495b6e6148c7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mTargetRef = value;
            }

            @objid ("d3a9a6fc-0dd6-4a81-90cb-fae0a5f6ca86")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowNodeData.Metadata.IncomingDep();
            }

        }

        @objid ("007ba75a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConnectorSmDependency extends SmMultipleDependency {
            @objid ("a73c2dda-0a96-48a8-a1f0-5e8952bb3b0f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSequenceFlowData)data).mConnector != null)? ((BpmnSequenceFlowData)data).mConnector:SmMultipleDependency.EMPTY;
            }

            @objid ("e1115055-0bf3-4ed5-b307-dc37694d1ccd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSequenceFlowData) data).mConnector = new ArrayList<>(initialCapacity);
                return ((BpmnSequenceFlowData) data).mConnector;
            }

            @objid ("82577a5b-072f-466c-8998-fb13a082a56b")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep();
            }

        }

        @objid ("007c1f28-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultFromSmDependency extends SmSingleDependency {
            @objid ("9e4eeb62-87e0-415c-bc84-453cec955fbc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultFrom;
            }

            @objid ("f237472e-d506-4aaf-aa6b-3f718882f550")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultFrom = value;
            }

            @objid ("5ef544eb-157e-4dbc-8496-27f7360c9726")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.DefaultFlowDep();
            }

        }

        @objid ("007ca9c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultOfExclusiveSmDependency extends SmSingleDependency {
            @objid ("afcd87ef-629f-4ff1-be4e-323a051dac30")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultOfExclusive;
            }

            @objid ("89432475-ef93-4bf1-80a7-83962eb8d449")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultOfExclusive = value;
            }

            @objid ("ab9464a9-743c-4905-8773-007f1dfa6976")
            @Override
            public SmDependency getSymetric() {
                return BpmnExclusiveGatewayData.Metadata.DefaultFlowDep();
            }

        }

        @objid ("007d3408-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultOfInclusiveSmDependency extends SmSingleDependency {
            @objid ("7bdd187d-e1e0-4db4-b260-73321d271b6a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultOfInclusive;
            }

            @objid ("b83daf6c-47be-49c3-84fb-2da54a108ab2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultOfInclusive = value;
            }

            @objid ("eb69afd9-875d-47df-bfcf-dba4cda464ef")
            @Override
            public SmDependency getSymetric() {
                return BpmnInclusiveGatewayData.Metadata.DefaultFlowDep();
            }

        }

        @objid ("007dbdd8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultOfComplexSmDependency extends SmSingleDependency {
            @objid ("0547297c-86ba-4cc8-b9af-0bf5f63c61ea")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultOfComplex;
            }

            @objid ("b75b2bc9-8427-4fa1-8cf9-ebf03838b1d6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultOfComplex = value;
            }

            @objid ("d0e21415-ffae-4350-8daa-03e970d12216")
            @Override
            public SmDependency getSymetric() {
                return BpmnComplexGatewayData.Metadata.DefaultFlowDep();
            }

        }

    }

}
