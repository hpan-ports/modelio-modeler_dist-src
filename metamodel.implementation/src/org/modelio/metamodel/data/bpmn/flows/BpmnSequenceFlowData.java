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
    @objid ("949b180b-7343-44e9-b337-732d0ec9c386")
    @SmaMetaAttribute(metaName="IsImmediate", type=Boolean.class, smAttributeClass=Metadata.IsImmediateSmAttribute.class)
     Object mIsImmediate = false;

    @objid ("bf00389b-6d6b-42b0-a116-662e08a16155")
    @SmaMetaAttribute(metaName="ConditionExpression", type=String.class, smAttributeClass=Metadata.ConditionExpressionSmAttribute.class)
     Object mConditionExpression = "";

    @objid ("546b5565-167b-4721-b5af-92004f09560f")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnFlowNodeData.class, min=1, max=1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     SmObjectImpl mSourceRef;

    @objid ("b71d3327-d766-4261-9612-5c36726ab1f2")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnFlowNodeData.class, min=1, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("15ce8140-78ec-4ca4-b2fd-fc72ce744f23")
    @SmaMetaAssociation(metaName="DefaultOfInclusive", typeDataClass=BpmnInclusiveGatewayData.class, min=0, max=1, smAssociationClass=Metadata.DefaultOfInclusiveSmDependency.class)
     SmObjectImpl mDefaultOfInclusive;

    @objid ("8f01ab19-e865-42a8-8a20-f7532fa78fcc")
    @SmaMetaAssociation(metaName="DefaultFrom", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFromSmDependency.class)
     SmObjectImpl mDefaultFrom;

    @objid ("a5f00301-a24d-4992-ad08-6e673e0f7cbc")
    @SmaMetaAssociation(metaName="DefaultOfExclusive", typeDataClass=BpmnExclusiveGatewayData.class, min=0, max=1, smAssociationClass=Metadata.DefaultOfExclusiveSmDependency.class)
     SmObjectImpl mDefaultOfExclusive;

    @objid ("a38d947d-ac77-4b83-8b0e-cba1528f136f")
    @SmaMetaAssociation(metaName="Connector", typeDataClass=BpmnSequenceFlowDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectorSmDependency.class, component = true)
     List<SmObjectImpl> mConnector = null;

    @objid ("fc981140-c0f7-4d2d-b6dd-b9d6dfaea777")
    @SmaMetaAssociation(metaName="DefaultOfComplex", typeDataClass=BpmnComplexGatewayData.class, min=0, max=1, smAssociationClass=Metadata.DefaultOfComplexSmDependency.class)
     SmObjectImpl mDefaultOfComplex;

    @objid ("72f9588c-cbbf-49ea-9f32-72271a2eb8d3")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0078e0a6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("14abc418-0c12-4639-a2f5-b2f50c8e992b")
        private static SmClass smClass = null;

        @objid ("2983ef27-9342-447b-939d-074d1d509b82")
        private static SmAttribute IsImmediateAtt = null;

        @objid ("cae4c445-60a3-4ab2-a4df-7bfc6ed1adf6")
        private static SmAttribute ConditionExpressionAtt = null;

        @objid ("fbb380f5-6444-4c21-a824-45520cd42e55")
        private static SmDependency SourceRefDep = null;

        @objid ("ff3ad528-05c6-4b22-8469-589f860e62c4")
        private static SmDependency TargetRefDep = null;

        @objid ("5af79c65-d20f-45b1-8e11-f9f9efb6911e")
        private static SmDependency DefaultOfInclusiveDep = null;

        @objid ("90e9b666-8913-4789-af4d-dc6729e690ae")
        private static SmDependency DefaultFromDep = null;

        @objid ("ef87dbf8-671f-40f7-a170-c6352b150012")
        private static SmDependency DefaultOfExclusiveDep = null;

        @objid ("53fd5ebc-f51c-4f8a-a654-ce2efdd6cf43")
        private static SmDependency ConnectorDep = null;

        @objid ("0e572c20-cad1-4450-947d-024a20c6c14c")
        private static SmDependency DefaultOfComplexDep = null;

        @objid ("0bb5b2aa-a070-43ea-be2d-d63b7f18fdc9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSequenceFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6833e655-0a2a-44e4-adc1-1553b85439af")
        public static SmAttribute IsImmediateAtt() {
            if (IsImmediateAtt == null) {
            	IsImmediateAtt = classof().getAttributeDef("IsImmediate");
            }
            return IsImmediateAtt;
        }

        @objid ("1dbb8ca7-a842-4915-a41a-6db2638106ed")
        public static SmAttribute ConditionExpressionAtt() {
            if (ConditionExpressionAtt == null) {
            	ConditionExpressionAtt = classof().getAttributeDef("ConditionExpression");
            }
            return ConditionExpressionAtt;
        }

        @objid ("61f95b6e-368d-4baa-9f4a-51b5207f2cf9")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("f2815be8-9033-4467-ad74-b3238449462c")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("8c188f88-5739-4327-8eb4-03768d0f77b0")
        public static SmDependency DefaultOfInclusiveDep() {
            if (DefaultOfInclusiveDep == null) {
            	DefaultOfInclusiveDep = classof().getDependencyDef("DefaultOfInclusive");
            }
            return DefaultOfInclusiveDep;
        }

        @objid ("8fe247f7-d6fd-4db3-8b93-4a7fcb47a481")
        public static SmDependency DefaultFromDep() {
            if (DefaultFromDep == null) {
            	DefaultFromDep = classof().getDependencyDef("DefaultFrom");
            }
            return DefaultFromDep;
        }

        @objid ("f91e35fb-a058-4150-a7ea-e864ff3d4942")
        public static SmDependency DefaultOfExclusiveDep() {
            if (DefaultOfExclusiveDep == null) {
            	DefaultOfExclusiveDep = classof().getDependencyDef("DefaultOfExclusive");
            }
            return DefaultOfExclusiveDep;
        }

        @objid ("d96a2334-1618-4853-9433-33a1a318a5b3")
        public static SmDependency ConnectorDep() {
            if (ConnectorDep == null) {
            	ConnectorDep = classof().getDependencyDef("Connector");
            }
            return ConnectorDep;
        }

        @objid ("1210c703-6601-4885-bd67-2d0a25d71421")
        public static SmDependency DefaultOfComplexDep() {
            if (DefaultOfComplexDep == null) {
            	DefaultOfComplexDep = classof().getDependencyDef("DefaultOfComplex");
            }
            return DefaultOfComplexDep;
        }

        @objid ("625b440a-43ae-4970-939f-3bd3cbfed58e")
        public static SmDependency getDefaultOfInclusiveDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultOfInclusiveDep;
        }

        @objid ("8b47b308-17c7-4cc9-81b8-744ea12539ba")
        public static SmDependency getConnectorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectorDep;
        }

        @objid ("9bfbaa95-fe2e-4448-80b6-3fd303c7517c")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("77e57196-c7b4-40c9-a55a-c402c334ceba")
        public static SmDependency getDefaultFromDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFromDep;
        }

        @objid ("43f07248-1b69-4866-a86f-52b37237a074")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("a78c4baf-7361-4072-ad7e-eda31273dce1")
        public static SmDependency getDefaultOfComplexDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultOfComplexDep;
        }

        @objid ("1b58e3d8-d3b0-4ad5-bb0c-9f86491c1312")
        public static SmAttribute getConditionExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConditionExpressionAtt;
        }

        @objid ("353fd6bc-a401-49bb-9ef5-17089c0a40f1")
        public static SmAttribute getIsImmediateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsImmediateAtt;
        }

        @objid ("c79e208e-63c1-47a6-a53f-ce516f963eab")
        public static SmDependency getDefaultOfExclusiveDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultOfExclusiveDep;
        }

        @objid ("ad7c6462-7c87-4969-a3dd-1ba5ac4ea56d")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("00793592-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("eb28c0ad-e1d0-46b8-9f34-abfb0e21f3c6")
            public ISmObjectData createData() {
                return new BpmnSequenceFlowData();
            }

            @objid ("2db866f6-416e-4d8d-ba4d-38a47569b59b")
            public SmObjectImpl createImpl() {
                return new BpmnSequenceFlowImpl();
            }

        }

        @objid ("0079a8c4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsImmediateSmAttribute extends SmAttribute {
            @objid ("a710ae03-d800-44d3-8138-ba93a7ddf766")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mIsImmediate;
            }

            @objid ("b9da70d5-7ddd-45a6-9888-a34b0410a444")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSequenceFlowData) data).mIsImmediate = value;
            }

        }

        @objid ("007a1c0a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConditionExpressionSmAttribute extends SmAttribute {
            @objid ("8dbd2216-82f0-4db4-99fe-420254da4c97")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mConditionExpression;
            }

            @objid ("7758aacc-6742-4056-9d78-e85ae84873fb")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSequenceFlowData) data).mConditionExpression = value;
            }

        }

        @objid ("007a90ae-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmSingleDependency {
            @objid ("dbd1d654-a874-4487-80d1-aeb1fa9721b5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mSourceRef;
            }

            @objid ("66d45621-63a3-43ed-a9a7-e422d8866f49")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mSourceRef = value;
            }

            @objid ("3a143e00-1ab5-442a-92d9-72a4f1eefff2")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowNodeData.Metadata.OutgoingDep();
            }

        }

        @objid ("007b1ede-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("8892d6e7-92cb-408e-b5a0-39ee74bf5697")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mTargetRef;
            }

            @objid ("bc8c01dd-74a0-4826-bb1b-22d026ce3278")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mTargetRef = value;
            }

            @objid ("5f63f48e-7857-41bc-a1d1-d7f3cc024d3b")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowNodeData.Metadata.IncomingDep();
            }

        }

        @objid ("007ba75a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConnectorSmDependency extends SmMultipleDependency {
            @objid ("d13b4b4e-47e1-4f10-8670-5b931cfae76f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSequenceFlowData)data).mConnector != null)? ((BpmnSequenceFlowData)data).mConnector:SmMultipleDependency.EMPTY;
            }

            @objid ("7433415e-9c3b-4fdf-a51e-49d3a4ff0ab9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSequenceFlowData) data).mConnector = new ArrayList<>(initialCapacity);
                return ((BpmnSequenceFlowData) data).mConnector;
            }

            @objid ("3c64aaf1-652e-403c-a98b-18f9c013b74f")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep();
            }

        }

        @objid ("007c1f28-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultFromSmDependency extends SmSingleDependency {
            @objid ("daaa8e33-dfe4-41d8-bf6b-da10b870550c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultFrom;
            }

            @objid ("4150e6f0-296a-4682-9b34-9c1595dd37ac")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultFrom = value;
            }

            @objid ("e0b188a4-8265-404a-a7fa-a76ec669d212")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.DefaultFlowDep();
            }

        }

        @objid ("007ca9c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultOfExclusiveSmDependency extends SmSingleDependency {
            @objid ("4e876d3d-5432-4d49-8135-83d021082ee4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultOfExclusive;
            }

            @objid ("58197002-8f42-4ab7-84ed-d43d2944678a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultOfExclusive = value;
            }

            @objid ("5eecd066-1113-4fc1-a750-c3513e491c53")
            @Override
            public SmDependency getSymetric() {
                return BpmnExclusiveGatewayData.Metadata.DefaultFlowDep();
            }

        }

        @objid ("007d3408-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultOfInclusiveSmDependency extends SmSingleDependency {
            @objid ("3f73da53-25e8-4b5b-9aa3-e7b37bc14d04")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultOfInclusive;
            }

            @objid ("45fb1270-6d32-440c-9d63-0b524fd11aaa")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultOfInclusive = value;
            }

            @objid ("7baebda3-1223-4068-8982-c1fa1df02d4c")
            @Override
            public SmDependency getSymetric() {
                return BpmnInclusiveGatewayData.Metadata.DefaultFlowDep();
            }

        }

        @objid ("007dbdd8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultOfComplexSmDependency extends SmSingleDependency {
            @objid ("8ca29359-373e-40d5-aa83-4e02f620755e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultOfComplex;
            }

            @objid ("14a5486a-c6c2-450d-85c5-5b853f3c54d5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultOfComplex = value;
            }

            @objid ("93eb7276-723a-462a-9609-07bad7468e9f")
            @Override
            public SmDependency getSymetric() {
                return BpmnComplexGatewayData.Metadata.DefaultFlowDep();
            }

        }

    }

}
