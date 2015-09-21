/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.bpmn.flows;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.impl.bpmn.activities.BpmnActivitySmClass;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnComplexGatewaySmClass;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnExclusiveGatewaySmClass;
import org.modelio.metamodel.impl.bpmn.gateways.BpmnInclusiveGatewaySmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnSequenceFlowDataAssociationSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementSmClass;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowNodeSmClass;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("eaa10c45-5666-4efc-ac31-887820f6c9d1")
public class BpmnSequenceFlowSmClass extends BpmnFlowElementSmClass {
    @objid ("2215c279-172a-4306-9f15-48c2d378b999")
    private SmAttribute isImmediateAtt;

    @objid ("b809dfad-cdb4-4fc4-ac47-2b1336a77fbc")
    private SmAttribute conditionExpressionAtt;

    @objid ("a93e1599-f1a5-4e64-bcbd-375732574a51")
    private SmDependency sourceRefDep;

    @objid ("1ca452e8-8017-4b07-afd0-f702fc513a70")
    private SmDependency targetRefDep;

    @objid ("bab3e726-75bf-44c8-80bf-225d4111dee8")
    private SmDependency defaultOfInclusiveDep;

    @objid ("19fcc13f-ee5c-4231-a193-a32138e21c27")
    private SmDependency defaultFromDep;

    @objid ("bd2b7231-2fbf-4305-89c8-ae700706b97e")
    private SmDependency defaultOfExclusiveDep;

    @objid ("c4ef31e2-32b0-4244-b8d3-a2245a79940c")
    private SmDependency connectorDep;

    @objid ("73b99a6b-862b-495b-87e0-ced4b74a49c4")
    private SmDependency defaultOfComplexDep;

    @objid ("b105187d-45ba-480c-a185-25182272e39d")
    public BpmnSequenceFlowSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("9d24d38b-ca36-4654-b1b1-640da47a06fa")
    @Override
    public String getName() {
        return "BpmnSequenceFlow";
    }

    @objid ("fb057ae1-1c69-407a-a0ea-bc7667289e3d")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("f9aca35b-c656-4bdd-abdf-99e387421fc0")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnSequenceFlow.class;
    }

    @objid ("37a0013d-6ac8-42dc-a324-9c51284cbe77")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("ac765f84-53d8-4646-b937-eb58f8d506fe")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("7488751c-7c2a-4f48-953d-9c0c6248be99")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnFlowElement");
        this.registerFactory(new BpmnSequenceFlowObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isImmediateAtt = new IsImmediateSmAttribute();
        this.isImmediateAtt.init("IsImmediate", this, Boolean.class );
        registerAttribute(this.isImmediateAtt);
        
        this.conditionExpressionAtt = new ConditionExpressionSmAttribute();
        this.conditionExpressionAtt.init("ConditionExpression", this, String.class );
        registerAttribute(this.conditionExpressionAtt);
        
        
        // Initialize and register the SmDependency
        this.sourceRefDep = new SourceRefSmDependency();
        this.sourceRefDep.init("SourceRef", this, metamodel.getMClass("BpmnFlowNode"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.sourceRefDep);
        
        this.targetRefDep = new TargetRefSmDependency();
        this.targetRefDep.init("TargetRef", this, metamodel.getMClass("BpmnFlowNode"), 1, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.targetRefDep);
        
        this.defaultOfInclusiveDep = new DefaultOfInclusiveSmDependency();
        this.defaultOfInclusiveDep.init("DefaultOfInclusive", this, metamodel.getMClass("BpmnInclusiveGateway"), 0, 1 );
        registerDependency(this.defaultOfInclusiveDep);
        
        this.defaultFromDep = new DefaultFromSmDependency();
        this.defaultFromDep.init("DefaultFrom", this, metamodel.getMClass("BpmnActivity"), 0, 1 );
        registerDependency(this.defaultFromDep);
        
        this.defaultOfExclusiveDep = new DefaultOfExclusiveSmDependency();
        this.defaultOfExclusiveDep.init("DefaultOfExclusive", this, metamodel.getMClass("BpmnExclusiveGateway"), 0, 1 );
        registerDependency(this.defaultOfExclusiveDep);
        
        this.connectorDep = new ConnectorSmDependency();
        this.connectorDep.init("Connector", this, metamodel.getMClass("BpmnSequenceFlowDataAssociation"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.connectorDep);
        
        this.defaultOfComplexDep = new DefaultOfComplexSmDependency();
        this.defaultOfComplexDep.init("DefaultOfComplex", this, metamodel.getMClass("BpmnComplexGateway"), 0, 1 );
        registerDependency(this.defaultOfComplexDep);
    }

    @objid ("bdccf89b-935b-4c32-9d6a-79b124c90e52")
    public SmAttribute getIsImmediateAtt() {
        if (this.isImmediateAtt == null) {
        	this.isImmediateAtt = this.getAttributeDef("IsImmediate");
        }
        return this.isImmediateAtt;
    }

    @objid ("7cf5d536-d47a-409b-af4b-ed98751d2af7")
    public SmAttribute getConditionExpressionAtt() {
        if (this.conditionExpressionAtt == null) {
        	this.conditionExpressionAtt = this.getAttributeDef("ConditionExpression");
        }
        return this.conditionExpressionAtt;
    }

    @objid ("41f9a44b-a59e-44e9-a3bc-66b2535ab2ba")
    public SmDependency getSourceRefDep() {
        if (this.sourceRefDep == null) {
        	this.sourceRefDep = this.getDependencyDef("SourceRef");
        }
        return this.sourceRefDep;
    }

    @objid ("81f0c02d-61eb-4310-bec8-598572793ec5")
    public SmDependency getTargetRefDep() {
        if (this.targetRefDep == null) {
        	this.targetRefDep = this.getDependencyDef("TargetRef");
        }
        return this.targetRefDep;
    }

    @objid ("714b4a5b-a295-40c4-8da0-5facd9cd503d")
    public SmDependency getDefaultOfInclusiveDep() {
        if (this.defaultOfInclusiveDep == null) {
        	this.defaultOfInclusiveDep = this.getDependencyDef("DefaultOfInclusive");
        }
        return this.defaultOfInclusiveDep;
    }

    @objid ("eabe1ca0-6cd7-435d-b0c6-8f5aca842e9a")
    public SmDependency getDefaultFromDep() {
        if (this.defaultFromDep == null) {
        	this.defaultFromDep = this.getDependencyDef("DefaultFrom");
        }
        return this.defaultFromDep;
    }

    @objid ("919370c8-1c3d-41ad-be35-50a79c946889")
    public SmDependency getDefaultOfExclusiveDep() {
        if (this.defaultOfExclusiveDep == null) {
        	this.defaultOfExclusiveDep = this.getDependencyDef("DefaultOfExclusive");
        }
        return this.defaultOfExclusiveDep;
    }

    @objid ("ba1f86a5-425c-4914-bcee-32ff0db9e92e")
    public SmDependency getConnectorDep() {
        if (this.connectorDep == null) {
        	this.connectorDep = this.getDependencyDef("Connector");
        }
        return this.connectorDep;
    }

    @objid ("eeedf377-42e8-4e64-83b0-e2cd2e21b9a5")
    public SmDependency getDefaultOfComplexDep() {
        if (this.defaultOfComplexDep == null) {
        	this.defaultOfComplexDep = this.getDependencyDef("DefaultOfComplex");
        }
        return this.defaultOfComplexDep;
    }

    @objid ("e5e608fc-e4f2-49aa-96c7-537f9c379559")
    private static class BpmnSequenceFlowObjectFactory implements ISmObjectFactory {
        @objid ("3db00f73-dbd3-4eed-8129-69018bd48097")
        private BpmnSequenceFlowSmClass smClass;

        @objid ("04e52079-76fd-4be0-9e55-7f0b9af7f6f4")
        public BpmnSequenceFlowObjectFactory(BpmnSequenceFlowSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("01635d1b-4144-4faa-a855-db70fcdde7ae")
        @Override
        public ISmObjectData createData() {
            return new BpmnSequenceFlowData(this.smClass);
        }

        @objid ("5f5126fd-d113-40b2-8535-d177038a48f1")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnSequenceFlowImpl();
        }

    }

    @objid ("b061b50b-9480-4a99-98dd-91e5413ea1a8")
    public static class IsImmediateSmAttribute extends SmAttribute {
        @objid ("0e099a8a-116f-4bba-b383-85304530bba4")
        public Object getValue(ISmObjectData data) {
            return ((BpmnSequenceFlowData) data).mIsImmediate;
        }

        @objid ("d100ff28-0e5c-4a97-9d62-b1335531396a")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnSequenceFlowData) data).mIsImmediate = value;
        }

    }

    @objid ("a1bdb97e-c7e5-45b9-bbf0-d8d163057661")
    public static class ConditionExpressionSmAttribute extends SmAttribute {
        @objid ("57aa6869-28dc-475b-85a8-9a00cf4c82fa")
        public Object getValue(ISmObjectData data) {
            return ((BpmnSequenceFlowData) data).mConditionExpression;
        }

        @objid ("7eab82e6-550b-457d-a30e-c6db3dd7f81f")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnSequenceFlowData) data).mConditionExpression = value;
        }

    }

    @objid ("6693e0b7-8f50-4f9f-bd1f-28b7cd1813ea")
    public static class SourceRefSmDependency extends SmSingleDependency {
        @objid ("9da65d43-2079-4174-a579-972b7f45dc8b")
        private SmDependency symetricDep;

        @objid ("6d7e0045-cb5c-4e80-84b4-3c200e77b24f")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnSequenceFlowData) data).mSourceRef;
        }

        @objid ("455b77df-5aac-4489-ba1f-e978138cddc8")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnSequenceFlowData) data).mSourceRef = value;
        }

        @objid ("c9b097be-b551-43d3-92d1-fdd7cbfa66c5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnFlowNodeSmClass)this.getTarget()).getOutgoingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d2b651ec-c74b-4d5c-9566-d51bbfc15a71")
    public static class TargetRefSmDependency extends SmSingleDependency {
        @objid ("92bd4557-52fb-4957-be32-ef1296e63fd4")
        private SmDependency symetricDep;

        @objid ("b5775a7e-34cc-44b8-b886-8c2e06de08a7")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnSequenceFlowData) data).mTargetRef;
        }

        @objid ("ae08ca5c-e230-4336-91ca-f15aca9fc336")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnSequenceFlowData) data).mTargetRef = value;
        }

        @objid ("a0bf3caa-2478-4a35-8b4d-43aa4c1998f8")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnFlowNodeSmClass)this.getTarget()).getIncomingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7288b23d-acde-455a-9e28-f850bf88f951")
    public static class DefaultOfInclusiveSmDependency extends SmSingleDependency {
        @objid ("1c6afb88-072b-453c-9ab6-ee02e8a8c62c")
        private SmDependency symetricDep;

        @objid ("47c207f1-5f2f-47f5-bb13-eaa030721e67")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnSequenceFlowData) data).mDefaultOfInclusive;
        }

        @objid ("579de383-bb0e-40fb-9886-900ef4488418")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnSequenceFlowData) data).mDefaultOfInclusive = value;
        }

        @objid ("9ed65d70-98b5-4650-b803-4e24a280260c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnInclusiveGatewaySmClass)this.getTarget()).getDefaultFlowDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("a31369d7-6a7c-4a24-a709-becb88df7532")
    public static class DefaultFromSmDependency extends SmSingleDependency {
        @objid ("fc664f56-13e1-40fc-8ded-dee72bba3b43")
        private SmDependency symetricDep;

        @objid ("69e83f9d-51a6-44aa-b30f-99572fb43770")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnSequenceFlowData) data).mDefaultFrom;
        }

        @objid ("466c27ee-299d-4d28-ab73-bde961f3c453")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnSequenceFlowData) data).mDefaultFrom = value;
        }

        @objid ("516a1ec4-14ab-433b-a85f-645ec540987d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnActivitySmClass)this.getTarget()).getDefaultFlowDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("fb1ec253-01ca-462c-8985-8a6e8326288a")
    public static class DefaultOfExclusiveSmDependency extends SmSingleDependency {
        @objid ("061da877-658e-4ecd-aec7-ffed2afeced8")
        private SmDependency symetricDep;

        @objid ("d2ca5a14-138b-4cb5-989b-06c8b1090239")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnSequenceFlowData) data).mDefaultOfExclusive;
        }

        @objid ("2d45be0b-a714-4bee-a44f-20c1116a0ccf")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnSequenceFlowData) data).mDefaultOfExclusive = value;
        }

        @objid ("fda3b642-b199-4398-9e14-9ec26778542c")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnExclusiveGatewaySmClass)this.getTarget()).getDefaultFlowDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6a932035-b234-4e9e-9e98-7886fd92baa5")
    public static class ConnectorSmDependency extends SmMultipleDependency {
        @objid ("c3c81d51-47e5-4a0f-ab96-9a0b443c5b45")
        private SmDependency symetricDep;

        @objid ("8d36a958-e733-4c3d-b84d-283f4bc7dfb3")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnSequenceFlowData)data).mConnector != null)? ((BpmnSequenceFlowData)data).mConnector:SmMultipleDependency.EMPTY;
        }

        @objid ("004a12e8-d0a4-48f4-be95-a683c864e7ba")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnSequenceFlowData) data).mConnector = values;
        }

        @objid ("22843947-6736-421b-b172-f9c6abbec0d5")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSequenceFlowDataAssociationSmClass)this.getTarget()).getConnectedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b425a105-29ea-411e-9c08-a51b3f4ced0f")
    public static class DefaultOfComplexSmDependency extends SmSingleDependency {
        @objid ("9b20ac61-85fb-43c8-875f-fa1e76df64b1")
        private SmDependency symetricDep;

        @objid ("fc2b53a2-f899-42d1-b80e-0260987c090e")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnSequenceFlowData) data).mDefaultOfComplex;
        }

        @objid ("86f78a51-4640-4418-b8a6-1e2b09b71b5d")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnSequenceFlowData) data).mDefaultOfComplex = value;
        }

        @objid ("5de47735-2bcf-4815-9d3e-66b20fbc1f47")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnComplexGatewaySmClass)this.getTarget()).getDefaultFlowDep();
            }
            return this.symetricDep;
        }

    }

}
