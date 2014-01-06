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
    @objid ("f4665042-204e-40e2-98c6-241a36852f2c")
    @SmaMetaAttribute(metaName="IsImmediate", type=Boolean.class, smAttributeClass=Metadata.IsImmediateSmAttribute.class)
     Object mIsImmediate = false;

    @objid ("b91ee1d6-f6c9-4069-81eb-41d2a2cb7eec")
    @SmaMetaAttribute(metaName="ConditionExpression", type=String.class, smAttributeClass=Metadata.ConditionExpressionSmAttribute.class)
     Object mConditionExpression = "";

    @objid ("09ba39b4-7dc4-4062-ba3b-918adcdf1973")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnFlowNodeData.class, min=1, max=1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     SmObjectImpl mSourceRef;

    @objid ("9c6e11ea-eb8e-47ea-b824-bc99af610361")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnFlowNodeData.class, min=1, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("af8e230f-ff9d-42db-a0b0-674fc6c29a07")
    @SmaMetaAssociation(metaName="DefaultOfInclusive", typeDataClass=BpmnInclusiveGatewayData.class, min=0, max=1, smAssociationClass=Metadata.DefaultOfInclusiveSmDependency.class)
     SmObjectImpl mDefaultOfInclusive;

    @objid ("882c0bef-f076-4fe0-80b4-45e83369b942")
    @SmaMetaAssociation(metaName="DefaultFrom", typeDataClass=BpmnActivityData.class, min=0, max=1, smAssociationClass=Metadata.DefaultFromSmDependency.class)
     SmObjectImpl mDefaultFrom;

    @objid ("2a919e26-695d-4ec1-ba3a-8c1da8c70911")
    @SmaMetaAssociation(metaName="DefaultOfExclusive", typeDataClass=BpmnExclusiveGatewayData.class, min=0, max=1, smAssociationClass=Metadata.DefaultOfExclusiveSmDependency.class)
     SmObjectImpl mDefaultOfExclusive;

    @objid ("8b592854-435b-417e-b913-6a10bbbef82f")
    @SmaMetaAssociation(metaName="Connector", typeDataClass=BpmnSequenceFlowDataAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.ConnectorSmDependency.class, component = true)
     List<SmObjectImpl> mConnector = null;

    @objid ("bc8cffe1-8eb4-4dfe-a4ef-23f4857b588b")
    @SmaMetaAssociation(metaName="DefaultOfComplex", typeDataClass=BpmnComplexGatewayData.class, min=0, max=1, smAssociationClass=Metadata.DefaultOfComplexSmDependency.class)
     SmObjectImpl mDefaultOfComplex;

    @objid ("d475ff9b-0ed4-49aa-8687-cbc0678e8e1c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0078e0a6-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7cf1ddb8-d398-4f57-9305-b984e4e893a6")
        private static SmClass smClass = null;

        @objid ("32aa41a8-8cac-4e53-8894-972661bc8a23")
        private static SmAttribute IsImmediateAtt = null;

        @objid ("68048a83-0fd9-418d-8821-da87e0cff965")
        private static SmAttribute ConditionExpressionAtt = null;

        @objid ("eeb7142b-ccd3-419a-8897-a6acf725f5c0")
        private static SmDependency SourceRefDep = null;

        @objid ("f28cda76-168d-4422-bfb0-4c3bfe85507f")
        private static SmDependency TargetRefDep = null;

        @objid ("67dcbd7f-27c5-4542-988d-60d76b86ee41")
        private static SmDependency DefaultOfInclusiveDep = null;

        @objid ("e3858381-220f-4782-bc7d-c72ede1bf781")
        private static SmDependency DefaultFromDep = null;

        @objid ("4d1087a4-9515-499c-877d-9ffbb53eb9f7")
        private static SmDependency DefaultOfExclusiveDep = null;

        @objid ("ab3d8098-d908-491d-9353-a35f9380f0ff")
        private static SmDependency ConnectorDep = null;

        @objid ("fbe847d6-f9e3-4af6-8fde-39db273e1c08")
        private static SmDependency DefaultOfComplexDep = null;

        @objid ("be808afd-58f4-4a49-aee8-45ae34cd64ef")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSequenceFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a3a22323-5bc6-471e-b2fe-e22a9eb5b6e1")
        public static SmAttribute IsImmediateAtt() {
            if (IsImmediateAtt == null) {
            	IsImmediateAtt = classof().getAttributeDef("IsImmediate");
            }
            return IsImmediateAtt;
        }

        @objid ("5696aab8-07a3-47a8-aa2b-09420027f0d3")
        public static SmAttribute ConditionExpressionAtt() {
            if (ConditionExpressionAtt == null) {
            	ConditionExpressionAtt = classof().getAttributeDef("ConditionExpression");
            }
            return ConditionExpressionAtt;
        }

        @objid ("05f98865-b0a1-444f-b49e-bf77508be49d")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("216f3f8f-99b2-4880-8336-6b157cda90db")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("ab9ace1c-61c4-4471-988b-06407ed29312")
        public static SmDependency DefaultOfInclusiveDep() {
            if (DefaultOfInclusiveDep == null) {
            	DefaultOfInclusiveDep = classof().getDependencyDef("DefaultOfInclusive");
            }
            return DefaultOfInclusiveDep;
        }

        @objid ("90b4c7c5-bcef-448b-8128-ae156b4e9c08")
        public static SmDependency DefaultFromDep() {
            if (DefaultFromDep == null) {
            	DefaultFromDep = classof().getDependencyDef("DefaultFrom");
            }
            return DefaultFromDep;
        }

        @objid ("aab917d7-d48a-4a76-9293-28acdd7b8687")
        public static SmDependency DefaultOfExclusiveDep() {
            if (DefaultOfExclusiveDep == null) {
            	DefaultOfExclusiveDep = classof().getDependencyDef("DefaultOfExclusive");
            }
            return DefaultOfExclusiveDep;
        }

        @objid ("475dae43-0b10-43bc-9162-844aa261d8e8")
        public static SmDependency ConnectorDep() {
            if (ConnectorDep == null) {
            	ConnectorDep = classof().getDependencyDef("Connector");
            }
            return ConnectorDep;
        }

        @objid ("10cc5315-778a-419c-b752-b4923a4a670a")
        public static SmDependency DefaultOfComplexDep() {
            if (DefaultOfComplexDep == null) {
            	DefaultOfComplexDep = classof().getDependencyDef("DefaultOfComplex");
            }
            return DefaultOfComplexDep;
        }

        @objid ("2cb593e9-bed0-4cc8-8fc9-49b2f7cf6058")
        public static SmDependency getDefaultOfInclusiveDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultOfInclusiveDep;
        }

        @objid ("bd0fb45d-e0f4-4b3c-a1be-e1fff6414e08")
        public static SmAttribute getConditionExpressionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConditionExpressionAtt;
        }

        @objid ("3a856d54-9861-4c38-aad2-d702b9281e61")
        public static SmDependency getDefaultOfComplexDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultOfComplexDep;
        }

        @objid ("dd0ed922-481f-4ce1-9ffc-2a1c85d23d7b")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("0443294b-a8a8-4dcd-bbbb-89fb974403f3")
        public static SmDependency getConnectorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConnectorDep;
        }

        @objid ("3d3026d2-cad6-4aea-b464-6fd41b268cea")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("bc503c44-631e-4097-8270-a6070c264fad")
        public static SmDependency getDefaultOfExclusiveDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultOfExclusiveDep;
        }

        @objid ("939a5772-c0d2-443c-a10b-b2a777783962")
        public static SmDependency getDefaultFromDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return DefaultFromDep;
        }

        @objid ("b9935e5e-d11c-47f7-b89a-7e4e98be9c69")
        public static SmAttribute getIsImmediateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsImmediateAtt;
        }

        @objid ("e180504a-d437-40ec-bb54-13f2b41b63fb")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00793592-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("50ca9a09-4217-4e20-88e1-4c44405c695d")
            public ISmObjectData createData() {
                return new BpmnSequenceFlowData();
            }

            @objid ("d4c42ead-50c1-4996-aa21-14fead4f451b")
            public SmObjectImpl createImpl() {
                return new BpmnSequenceFlowImpl();
            }

        }

        @objid ("0079a8c4-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IsImmediateSmAttribute extends SmAttribute {
            @objid ("4c518bac-27bf-4454-8dcb-8b7527a14680")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mIsImmediate;
            }

            @objid ("5ae78ac8-303f-4a1c-bfc7-c5243175d25f")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSequenceFlowData) data).mIsImmediate = value;
            }

        }

        @objid ("007a1c0a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConditionExpressionSmAttribute extends SmAttribute {
            @objid ("cb494fb6-3937-4e0a-ac7c-8fe10591c1ee")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mConditionExpression;
            }

            @objid ("d5863d72-150c-4081-95ca-b528d5cc559f")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSequenceFlowData) data).mConditionExpression = value;
            }

        }

        @objid ("007a90ae-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmSingleDependency {
            @objid ("057ce045-70b0-4da7-95b6-888271a2a667")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mSourceRef;
            }

            @objid ("3c795355-3f8c-4d17-ba55-779ca5aa588c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mSourceRef = value;
            }

            @objid ("95a805ba-62d6-47f8-95fc-1c9cb7cba12a")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowNodeData.Metadata.OutgoingDep();
            }

        }

        @objid ("007b1ede-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("ea37776f-d7f0-4818-8a4f-3313fdc5c20f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mTargetRef;
            }

            @objid ("da6a1f2e-67fc-41cf-82d5-746451f59f84")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mTargetRef = value;
            }

            @objid ("771ddb48-d778-40be-9616-cd618a83bca8")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowNodeData.Metadata.IncomingDep();
            }

        }

        @objid ("007ba75a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConnectorSmDependency extends SmMultipleDependency {
            @objid ("dde9117a-2834-4d1c-8a8b-43709fe63da3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSequenceFlowData)data).mConnector != null)? ((BpmnSequenceFlowData)data).mConnector:SmMultipleDependency.EMPTY;
            }

            @objid ("99228d72-75fd-4dee-aab1-ea75ae9864bd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSequenceFlowData) data).mConnector = new ArrayList<>(initialCapacity);
                return ((BpmnSequenceFlowData) data).mConnector;
            }

            @objid ("2f3758dc-673f-4a36-a570-c4713a8bbdfd")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowDataAssociationData.Metadata.ConnectedDep();
            }

        }

        @objid ("007c1f28-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultFromSmDependency extends SmSingleDependency {
            @objid ("cc005eec-a9a6-4771-b14d-72eb146987c7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultFrom;
            }

            @objid ("ceea9d19-a8f5-43b0-a21c-03ffdc344236")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultFrom = value;
            }

            @objid ("4945391b-ce86-43c3-8728-8a8209343348")
            @Override
            public SmDependency getSymetric() {
                return BpmnActivityData.Metadata.DefaultFlowDep();
            }

        }

        @objid ("007ca9c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultOfExclusiveSmDependency extends SmSingleDependency {
            @objid ("c53f5c88-2b0d-46f9-8e21-4de669448476")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultOfExclusive;
            }

            @objid ("7c11f30b-b270-4d35-852d-8ab9c91bf561")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultOfExclusive = value;
            }

            @objid ("eda591c5-9cfa-4a65-85e2-6be00d5e48ff")
            @Override
            public SmDependency getSymetric() {
                return BpmnExclusiveGatewayData.Metadata.DefaultFlowDep();
            }

        }

        @objid ("007d3408-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultOfInclusiveSmDependency extends SmSingleDependency {
            @objid ("e34a3d0f-82e8-42c8-9756-c15e1d8ba477")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultOfInclusive;
            }

            @objid ("04a8866c-53e6-4e42-bab5-f0d416789c53")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultOfInclusive = value;
            }

            @objid ("6699ef15-00c8-488b-ba49-7e35f2501a17")
            @Override
            public SmDependency getSymetric() {
                return BpmnInclusiveGatewayData.Metadata.DefaultFlowDep();
            }

        }

        @objid ("007dbdd8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class DefaultOfComplexSmDependency extends SmSingleDependency {
            @objid ("38369c67-1463-4a85-98dd-44e81bdcdfa4")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSequenceFlowData) data).mDefaultOfComplex;
            }

            @objid ("e99ab655-fbf3-4830-a48e-f81163c62921")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSequenceFlowData) data).mDefaultOfComplex = value;
            }

            @objid ("e47d72a7-f81e-49f6-8251-172301ed393d")
            @Override
            public SmDependency getSymetric() {
                return BpmnComplexGatewayData.Metadata.DefaultFlowDep();
            }

        }

    }

}
