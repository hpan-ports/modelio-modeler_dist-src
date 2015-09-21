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
package org.modelio.metamodel.impl.bpmn.activities;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.MultiInstanceBehavior;
import org.modelio.metamodel.impl.bpmn.activities.BpmnComplexBehaviorDefinitionSmClass;
import org.modelio.metamodel.impl.bpmn.activities.BpmnLoopCharacteristicsSmClass;
import org.modelio.metamodel.impl.bpmn.events.BpmnEventDefinitionSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataInputSmClass;
import org.modelio.metamodel.impl.bpmn.objects.BpmnDataOutputSmClass;
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

@objid ("728eb919-46e7-481f-99ed-6fb053421570")
public class BpmnMultiInstanceLoopCharacteristicsSmClass extends BpmnLoopCharacteristicsSmClass {
    @objid ("c1fdd5f3-efd8-47f7-a94b-541644ee6af7")
    private SmAttribute isSequencialAtt;

    @objid ("7562eb80-75b2-46c7-b21a-56eef6c10a92")
    private SmAttribute behaviorAtt;

    @objid ("8965d3c5-9642-49b9-8a59-c6d552d9b806")
    private SmAttribute loopCardinalityAtt;

    @objid ("c8c399a7-1e4c-48b4-bd87-c774e7343d5b")
    private SmAttribute completionConditionAtt;

    @objid ("0bf3c8f5-9280-4aa7-99e0-06418762ad83")
    private SmDependency loopDataInputDep;

    @objid ("fdf556b4-0524-4621-a2b2-ade181c457be")
    private SmDependency loopDataOutputRefDep;

    @objid ("7ecfc4be-5a69-4bd9-ad15-07315fae191d")
    private SmDependency completionEventRefDep;

    @objid ("b1e93117-2a88-4f9d-98e5-4b72c6f58376")
    private SmDependency complexBehaviorDefinitionDep;

    @objid ("8258c120-7db6-4bfd-948b-be8d1b4bf382")
    public BpmnMultiInstanceLoopCharacteristicsSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("5fe7c910-489f-40e2-811e-cf617cdebbb2")
    @Override
    public String getName() {
        return "BpmnMultiInstanceLoopCharacteristics";
    }

    @objid ("9aa6def6-94f9-4a85-b5f8-7f4224e647a1")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("fc35d82c-03e2-49b4-adf1-672e2527478a")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return BpmnMultiInstanceLoopCharacteristics.class;
    }

    @objid ("a026e766-6d7b-45e2-b4d8-8a51199eb449")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("cde3ddcc-7086-400f-8e5e-60457cce24bd")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("45133d65-6c4d-41aa-a508-793c54a7ddbe")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BpmnLoopCharacteristics");
        this.registerFactory(new BpmnMultiInstanceLoopCharacteristicsObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.isSequencialAtt = new IsSequencialSmAttribute();
        this.isSequencialAtt.init("IsSequencial", this, Boolean.class );
        registerAttribute(this.isSequencialAtt);
        
        this.behaviorAtt = new BehaviorSmAttribute();
        this.behaviorAtt.init("Behavior", this, MultiInstanceBehavior.class );
        registerAttribute(this.behaviorAtt);
        
        this.loopCardinalityAtt = new LoopCardinalitySmAttribute();
        this.loopCardinalityAtt.init("LoopCardinality", this, String.class );
        registerAttribute(this.loopCardinalityAtt);
        
        this.completionConditionAtt = new CompletionConditionSmAttribute();
        this.completionConditionAtt.init("CompletionCondition", this, String.class );
        registerAttribute(this.completionConditionAtt);
        
        
        // Initialize and register the SmDependency
        this.loopDataInputDep = new LoopDataInputSmDependency();
        this.loopDataInputDep.init("LoopDataInput", this, metamodel.getMClass("BpmnDataInput"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.loopDataInputDep);
        
        this.loopDataOutputRefDep = new LoopDataOutputRefSmDependency();
        this.loopDataOutputRefDep.init("LoopDataOutputRef", this, metamodel.getMClass("BpmnDataOutput"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.loopDataOutputRefDep);
        
        this.completionEventRefDep = new CompletionEventRefSmDependency();
        this.completionEventRefDep.init("CompletionEventRef", this, metamodel.getMClass("BpmnEventDefinition"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.completionEventRefDep);
        
        this.complexBehaviorDefinitionDep = new ComplexBehaviorDefinitionSmDependency();
        this.complexBehaviorDefinitionDep.init("ComplexBehaviorDefinition", this, metamodel.getMClass("BpmnComplexBehaviorDefinition"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.complexBehaviorDefinitionDep);
    }

    @objid ("52c2fad3-c897-420f-9bcf-c7917a9e448f")
    public SmAttribute getIsSequencialAtt() {
        if (this.isSequencialAtt == null) {
        	this.isSequencialAtt = this.getAttributeDef("IsSequencial");
        }
        return this.isSequencialAtt;
    }

    @objid ("44bd2d4b-4f32-4e0c-980e-276872594e43")
    public SmAttribute getBehaviorAtt() {
        if (this.behaviorAtt == null) {
        	this.behaviorAtt = this.getAttributeDef("Behavior");
        }
        return this.behaviorAtt;
    }

    @objid ("3419b492-80d9-4d37-bda2-0bdaee60185a")
    public SmAttribute getLoopCardinalityAtt() {
        if (this.loopCardinalityAtt == null) {
        	this.loopCardinalityAtt = this.getAttributeDef("LoopCardinality");
        }
        return this.loopCardinalityAtt;
    }

    @objid ("0e0549e1-65c5-4f97-b856-22ee8936abb2")
    public SmAttribute getCompletionConditionAtt() {
        if (this.completionConditionAtt == null) {
        	this.completionConditionAtt = this.getAttributeDef("CompletionCondition");
        }
        return this.completionConditionAtt;
    }

    @objid ("b719efa2-0be3-4f00-aca1-a85822f24653")
    public SmDependency getLoopDataInputDep() {
        if (this.loopDataInputDep == null) {
        	this.loopDataInputDep = this.getDependencyDef("LoopDataInput");
        }
        return this.loopDataInputDep;
    }

    @objid ("14f05efa-1f74-46df-b61c-73f06459a72f")
    public SmDependency getLoopDataOutputRefDep() {
        if (this.loopDataOutputRefDep == null) {
        	this.loopDataOutputRefDep = this.getDependencyDef("LoopDataOutputRef");
        }
        return this.loopDataOutputRefDep;
    }

    @objid ("fc962cb4-cfc1-4025-9d65-b0eaa922ddb5")
    public SmDependency getCompletionEventRefDep() {
        if (this.completionEventRefDep == null) {
        	this.completionEventRefDep = this.getDependencyDef("CompletionEventRef");
        }
        return this.completionEventRefDep;
    }

    @objid ("8dae9024-155a-44a3-b6bb-0bb832a96088")
    public SmDependency getComplexBehaviorDefinitionDep() {
        if (this.complexBehaviorDefinitionDep == null) {
        	this.complexBehaviorDefinitionDep = this.getDependencyDef("ComplexBehaviorDefinition");
        }
        return this.complexBehaviorDefinitionDep;
    }

    @objid ("823791fd-e3b5-4be6-b320-654667efa924")
    private static class BpmnMultiInstanceLoopCharacteristicsObjectFactory implements ISmObjectFactory {
        @objid ("a731f0d8-5586-45ce-a320-0e7ac1cf6152")
        private BpmnMultiInstanceLoopCharacteristicsSmClass smClass;

        @objid ("504f5a02-e0dc-422c-9f18-ff5e19eedc2b")
        public BpmnMultiInstanceLoopCharacteristicsObjectFactory(BpmnMultiInstanceLoopCharacteristicsSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("ad505e70-5b64-4272-a001-54b294d41093")
        @Override
        public ISmObjectData createData() {
            return new BpmnMultiInstanceLoopCharacteristicsData(this.smClass);
        }

        @objid ("5f42dc37-684e-4851-9c5e-37cc736b8193")
        @Override
        public SmObjectImpl createImpl() {
            return new BpmnMultiInstanceLoopCharacteristicsImpl();
        }

    }

    @objid ("0b2f280f-52a2-40d4-bc66-6c9d4c0325ae")
    public static class IsSequencialSmAttribute extends SmAttribute {
        @objid ("9c29abad-fca3-41eb-924b-d65bbbf9932d")
        public Object getValue(ISmObjectData data) {
            return ((BpmnMultiInstanceLoopCharacteristicsData) data).mIsSequencial;
        }

        @objid ("62d133a8-8cbb-4cf8-bcf7-c853a26ad846")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnMultiInstanceLoopCharacteristicsData) data).mIsSequencial = value;
        }

    }

    @objid ("26d834d1-9f9b-4663-bb24-246213acfefc")
    public static class BehaviorSmAttribute extends SmAttribute {
        @objid ("36d47e21-ccb7-49f8-bf75-49be687929b4")
        public Object getValue(ISmObjectData data) {
            return ((BpmnMultiInstanceLoopCharacteristicsData) data).mBehavior;
        }

        @objid ("84c7497a-16e3-443f-979f-e8f2565e81cd")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnMultiInstanceLoopCharacteristicsData) data).mBehavior = value;
        }

    }

    @objid ("14046780-b400-42f8-905a-36ad449cb96d")
    public static class LoopCardinalitySmAttribute extends SmAttribute {
        @objid ("7e177d6b-bb53-4f85-8e18-64d25c4505d6")
        public Object getValue(ISmObjectData data) {
            return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopCardinality;
        }

        @objid ("c9a92b12-b872-4241-800f-55f7ca6ef813")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopCardinality = value;
        }

    }

    @objid ("7145e943-a476-49c4-9d0b-a24dc89c4a13")
    public static class CompletionConditionSmAttribute extends SmAttribute {
        @objid ("03caab62-c978-4bfc-ac39-a8b86e4b760b")
        public Object getValue(ISmObjectData data) {
            return ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionCondition;
        }

        @objid ("c470210e-d1c3-4bea-bac0-7a9b1b233d57")
        public void setValue(ISmObjectData data, Object value) {
            ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionCondition = value;
        }

    }

    @objid ("f94c52ee-4eb8-4eb4-8105-9e6737d14b74")
    public static class LoopDataInputSmDependency extends SmSingleDependency {
        @objid ("4c1bf098-d000-4d7e-b82a-abbd5adb5769")
        private SmDependency symetricDep;

        @objid ("c3e4cb38-1db7-4a01-a348-33a7b4c4cad8")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataInput;
        }

        @objid ("07dc3d5f-0bb7-47cc-b9b6-fa1b6c917f08")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataInput = value;
        }

        @objid ("4878f896-4b48-49d4-ad8c-628c50ae2809")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataInputSmClass)this.getTarget()).getOwnerLoopCharacteristicsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5cff9582-96ca-4857-ad4c-bfa565e40b9c")
    public static class LoopDataOutputRefSmDependency extends SmSingleDependency {
        @objid ("10da1e6a-3c99-4f52-b16f-292ef83e68af")
        private SmDependency symetricDep;

        @objid ("726ceeb6-ac62-469e-920c-93a94a859cb2")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataOutputRef;
        }

        @objid ("e27454a3-0434-4c41-b17f-f05e8736c1a0")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnMultiInstanceLoopCharacteristicsData) data).mLoopDataOutputRef = value;
        }

        @objid ("1e9454bd-5d89-4e1c-996b-dd26e5df33e6")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnDataOutputSmClass)this.getTarget()).getOwnerLoopCharacteristicsDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("c14c80b1-26ad-48d5-a75f-48ef122c5fee")
    public static class CompletionEventRefSmDependency extends SmSingleDependency {
        @objid ("e266dcf5-ee5d-4d60-9822-d5459a7e826f")
        private SmDependency symetricDep;

        @objid ("5b7b94c5-c926-4fd9-9cbe-e86bbc67cc94")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionEventRef;
        }

        @objid ("1cc0e636-38cd-420d-b435-83a7d835ff1f")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((BpmnMultiInstanceLoopCharacteristicsData) data).mCompletionEventRef = value;
        }

        @objid ("89091df4-b6cc-4dfa-b6d5-77a6b02a76de")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnEventDefinitionSmClass)this.getTarget()).getLoopRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d57e5d0d-95b9-4038-a956-778221d24d69")
    public static class ComplexBehaviorDefinitionSmDependency extends SmMultipleDependency {
        @objid ("740631e2-29b3-46cf-9dac-777f56d16894")
        private SmDependency symetricDep;

        @objid ("e77b2c82-7b74-4e59-9e10-da00630a5069")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((BpmnMultiInstanceLoopCharacteristicsData)data).mComplexBehaviorDefinition != null)? ((BpmnMultiInstanceLoopCharacteristicsData)data).mComplexBehaviorDefinition:SmMultipleDependency.EMPTY;
        }

        @objid ("316dd26f-8c7c-4095-8af0-88988787b8f4")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((BpmnMultiInstanceLoopCharacteristicsData) data).mComplexBehaviorDefinition = values;
        }

        @objid ("31d8e325-16c4-4ab5-ac79-4e9240322a5f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnComplexBehaviorDefinitionSmClass)this.getTarget()).getOwnerDep();
            }
            return this.symetricDep;
        }

    }

}
