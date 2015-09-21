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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.EventSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.SignalSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.StateVertexSmClass;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("c656dbc6-a3e5-494e-a3e2-69a0638466d7")
public class TransitionSmClass extends ModelElementSmClass {
    @objid ("3beb5a5f-410e-43ba-89f1-880e9420961a")
    private SmAttribute effectAtt;

    @objid ("02d8f335-6f3c-4f97-99a4-96d93759510b")
    private SmAttribute receivedEventsAtt;

    @objid ("cc3ff589-1311-4fe2-a92d-7caff02bbeaa")
    private SmAttribute sentEventsAtt;

    @objid ("b6566989-bf67-49f5-b646-19ac80264b9a")
    private SmAttribute guardAtt;

    @objid ("087212c7-98c9-4b46-add9-22af18ba1af1")
    private SmAttribute postConditionAtt;

    @objid ("6f7c2b9f-c42f-4cc7-8ddf-682f8aae287d")
    private SmDependency processedDep;

    @objid ("7332d624-df74-4042-a0aa-fa9ec7fd07d1")
    private SmDependency triggerDep;

    @objid ("3f4ac647-6a69-4c5e-9058-579aba610664")
    private SmDependency behaviorEffectDep;

    @objid ("970a76f2-0f64-4a38-a819-92dc95fe8bdd")
    private SmDependency targetDep;

    @objid ("e1fd67b0-addd-4b46-9dfc-5714a8ed748c")
    private SmDependency sourceDep;

    @objid ("385f17e1-dc7a-4bf7-9c60-14c14e108b5e")
    private SmDependency effectsDep;

    @objid ("1a9309c3-ebf2-4ddc-9186-8a662a16f1f6")
    public TransitionSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("7f639934-9121-442a-84b0-2c0cbf7b2b95")
    @Override
    public String getName() {
        return "Transition";
    }

    @objid ("ddc23758-fc8c-46d9-922e-d235791da7ea")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("95964692-5fbb-41c2-9278-66289aabef17")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Transition.class;
    }

    @objid ("569a7ae5-59cc-4536-b267-23c6fe77b9a8")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("4091b2fa-08b9-4d92-b7e5-1f9d4f770d05")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("057f5802-17dc-46ea-9f56-24de52ccbd32")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("ModelElement");
        this.registerFactory(new TransitionObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.effectAtt = new EffectSmAttribute();
        this.effectAtt.init("Effect", this, String.class );
        registerAttribute(this.effectAtt);
        
        this.receivedEventsAtt = new ReceivedEventsSmAttribute();
        this.receivedEventsAtt.init("ReceivedEvents", this, String.class );
        registerAttribute(this.receivedEventsAtt);
        
        this.sentEventsAtt = new SentEventsSmAttribute();
        this.sentEventsAtt.init("SentEvents", this, String.class );
        registerAttribute(this.sentEventsAtt);
        
        this.guardAtt = new GuardSmAttribute();
        this.guardAtt.init("Guard", this, String.class );
        registerAttribute(this.guardAtt);
        
        this.postConditionAtt = new PostConditionSmAttribute();
        this.postConditionAtt.init("PostCondition", this, String.class );
        registerAttribute(this.postConditionAtt);
        
        
        // Initialize and register the SmDependency
        this.processedDep = new ProcessedSmDependency();
        this.processedDep.init("Processed", this, metamodel.getMClass("Operation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.processedDep);
        
        this.triggerDep = new TriggerSmDependency();
        this.triggerDep.init("Trigger", this, metamodel.getMClass("Event"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.triggerDep);
        
        this.behaviorEffectDep = new BehaviorEffectSmDependency();
        this.behaviorEffectDep.init("BehaviorEffect", this, metamodel.getMClass("Behavior"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.behaviorEffectDep);
        
        this.targetDep = new TargetSmDependency();
        this.targetDep.init("Target", this, metamodel.getMClass("StateVertex"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.targetDep);
        
        this.sourceDep = new SourceSmDependency();
        this.sourceDep.init("Source", this, metamodel.getMClass("StateVertex"), 0, 1 );
        registerDependency(this.sourceDep);
        
        this.effectsDep = new EffectsSmDependency();
        this.effectsDep.init("Effects", this, metamodel.getMClass("Signal"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.effectsDep);
    }

    @objid ("1edfdc85-607e-4e4c-97ed-b429bc1fcb9a")
    public SmAttribute getEffectAtt() {
        if (this.effectAtt == null) {
        	this.effectAtt = this.getAttributeDef("Effect");
        }
        return this.effectAtt;
    }

    @objid ("483e7919-efb2-4c42-b849-40f97379c7d2")
    public SmAttribute getReceivedEventsAtt() {
        if (this.receivedEventsAtt == null) {
        	this.receivedEventsAtt = this.getAttributeDef("ReceivedEvents");
        }
        return this.receivedEventsAtt;
    }

    @objid ("b2eea1ae-f326-4269-b2a9-7bb21e4b0d73")
    public SmAttribute getSentEventsAtt() {
        if (this.sentEventsAtt == null) {
        	this.sentEventsAtt = this.getAttributeDef("SentEvents");
        }
        return this.sentEventsAtt;
    }

    @objid ("e5fbef9d-cf5c-4662-b306-1e1310ad28ef")
    public SmAttribute getGuardAtt() {
        if (this.guardAtt == null) {
        	this.guardAtt = this.getAttributeDef("Guard");
        }
        return this.guardAtt;
    }

    @objid ("20d7d473-a273-462e-b877-3827a476d46b")
    public SmAttribute getPostConditionAtt() {
        if (this.postConditionAtt == null) {
        	this.postConditionAtt = this.getAttributeDef("PostCondition");
        }
        return this.postConditionAtt;
    }

    @objid ("04385b67-9681-4524-b5bf-e57dadaaefe9")
    public SmDependency getProcessedDep() {
        if (this.processedDep == null) {
        	this.processedDep = this.getDependencyDef("Processed");
        }
        return this.processedDep;
    }

    @objid ("b968c28d-6a57-4d7a-af75-a0c234205ee2")
    public SmDependency getTriggerDep() {
        if (this.triggerDep == null) {
        	this.triggerDep = this.getDependencyDef("Trigger");
        }
        return this.triggerDep;
    }

    @objid ("910052a2-3aa6-4a8d-814b-81a3e75bd6cf")
    public SmDependency getBehaviorEffectDep() {
        if (this.behaviorEffectDep == null) {
        	this.behaviorEffectDep = this.getDependencyDef("BehaviorEffect");
        }
        return this.behaviorEffectDep;
    }

    @objid ("787c7d59-6c2d-4ecb-bb1f-9b4a8d34f94d")
    public SmDependency getTargetDep() {
        if (this.targetDep == null) {
        	this.targetDep = this.getDependencyDef("Target");
        }
        return this.targetDep;
    }

    @objid ("0206360d-bc4e-4f1e-989b-bb98d8dada27")
    public SmDependency getSourceDep() {
        if (this.sourceDep == null) {
        	this.sourceDep = this.getDependencyDef("Source");
        }
        return this.sourceDep;
    }

    @objid ("0cd1d35d-eb8b-4f23-a157-e0cec5865d37")
    public SmDependency getEffectsDep() {
        if (this.effectsDep == null) {
        	this.effectsDep = this.getDependencyDef("Effects");
        }
        return this.effectsDep;
    }

    @objid ("7add3e2b-d5a4-467f-b3f9-e0d70c75867b")
    private static class TransitionObjectFactory implements ISmObjectFactory {
        @objid ("a937e9ca-3139-455b-ad69-14ce976b840c")
        private TransitionSmClass smClass;

        @objid ("f7f0dcbc-fb66-4fca-8e76-3ad8d981f20c")
        public TransitionObjectFactory(TransitionSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("da30dd89-0843-48d7-b783-d3506af444b7")
        @Override
        public ISmObjectData createData() {
            return new TransitionData(this.smClass);
        }

        @objid ("e85a2c7c-f17e-46af-b607-cfe8bd02e6be")
        @Override
        public SmObjectImpl createImpl() {
            return new TransitionImpl();
        }

    }

    @objid ("b2b9791d-bc4a-4bb7-a102-65fcb2e386ae")
    public static class EffectSmAttribute extends SmAttribute {
        @objid ("f26cd7d2-eaa5-4be8-bcb4-8ce8a0c900cb")
        public Object getValue(ISmObjectData data) {
            return ((TransitionData) data).mEffect;
        }

        @objid ("358e391e-88b9-4b46-9ee7-5339a71989c5")
        public void setValue(ISmObjectData data, Object value) {
            ((TransitionData) data).mEffect = value;
        }

    }

    @objid ("785df83a-27d6-4a13-8b3d-125703e25a09")
    public static class ReceivedEventsSmAttribute extends SmAttribute {
        @objid ("9b7d0bd5-7513-4ad3-9d92-98e46c01a1e0")
        public Object getValue(ISmObjectData data) {
            return ((TransitionData) data).mReceivedEvents;
        }

        @objid ("144f5c0c-bf9e-48be-bd78-c665b959e948")
        public void setValue(ISmObjectData data, Object value) {
            ((TransitionData) data).mReceivedEvents = value;
        }

    }

    @objid ("2d670af4-5ead-488f-8e7c-d649091b45bb")
    public static class SentEventsSmAttribute extends SmAttribute {
        @objid ("2753bd9b-20ea-4f13-ba36-714cf4b4ec50")
        public Object getValue(ISmObjectData data) {
            return ((TransitionData) data).mSentEvents;
        }

        @objid ("9ae9f90f-5a8f-465d-bd9d-9fd96d832765")
        public void setValue(ISmObjectData data, Object value) {
            ((TransitionData) data).mSentEvents = value;
        }

    }

    @objid ("cfd002f3-74f2-430e-9253-a1efab4a5861")
    public static class GuardSmAttribute extends SmAttribute {
        @objid ("ccff5a32-74ba-4d1f-8331-3d43c63d1bbb")
        public Object getValue(ISmObjectData data) {
            return ((TransitionData) data).mGuard;
        }

        @objid ("bcab5908-9d74-4f67-ba73-400baf19ed5a")
        public void setValue(ISmObjectData data, Object value) {
            ((TransitionData) data).mGuard = value;
        }

    }

    @objid ("819e077a-f5d6-4851-9d58-2ef8d74cdfb6")
    public static class PostConditionSmAttribute extends SmAttribute {
        @objid ("992c62cf-f521-4ded-ac28-78caaefe7302")
        public Object getValue(ISmObjectData data) {
            return ((TransitionData) data).mPostCondition;
        }

        @objid ("526157f7-30c5-40ae-97ba-829deda66fff")
        public void setValue(ISmObjectData data, Object value) {
            ((TransitionData) data).mPostCondition = value;
        }

    }

    @objid ("15fc5f5a-6fbf-4d3e-9fd1-f301afc8680a")
    public static class ProcessedSmDependency extends SmSingleDependency {
        @objid ("d919749b-134c-47ec-b4d2-66428a25e497")
        private SmDependency symetricDep;

        @objid ("2c5806dc-fdda-443f-9ae6-0750506033d5")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TransitionData) data).mProcessed;
        }

        @objid ("55e8b74f-2652-4d8f-b644-0973ba1b090e")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TransitionData) data).mProcessed = value;
        }

        @objid ("22501449-ac7d-4402-9de2-73a10a514c87")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getInvokerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("6c76ac9e-64dc-4f2c-98d0-54b3cbd97df6")
    public static class TriggerSmDependency extends SmSingleDependency {
        @objid ("f467f15d-1004-4db0-bcae-33cfa1dcc026")
        private SmDependency symetricDep;

        @objid ("7aa59a71-a96d-42da-a2be-e04b77448385")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TransitionData) data).mTrigger;
        }

        @objid ("491bf39d-c41e-4a3e-a065-fcc27c4dc787")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TransitionData) data).mTrigger = value;
        }

        @objid ("aa3352ae-837f-4941-b6eb-1404faa66593")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((EventSmClass)this.getTarget()).getTriggeredDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("45b5f41e-b767-4bdf-be1b-1e2aac4d1153")
    public static class BehaviorEffectSmDependency extends SmSingleDependency {
        @objid ("98f49e1c-4436-4893-96da-58199ee2d93b")
        private SmDependency symetricDep;

        @objid ("cfe65eb1-b092-4d26-a7de-64e08375ccde")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TransitionData) data).mBehaviorEffect;
        }

        @objid ("f1f4ae01-342d-45b2-bc79-bf14f438378a")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TransitionData) data).mBehaviorEffect = value;
        }

        @objid ("00526fe7-a44f-47b9-b178-6a5f2d9559a4")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BehaviorSmClass)this.getTarget()).getEffectOfDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f6d2af50-5bf5-4ed3-b3fb-30b52c73a114")
    public static class TargetSmDependency extends SmSingleDependency {
        @objid ("700b05b2-c957-4def-b59e-cc5b033dc139")
        private SmDependency symetricDep;

        @objid ("3bc4e1b7-16ee-4f15-a921-b989c62fbd93")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TransitionData) data).mTarget;
        }

        @objid ("07aa4b4c-9eef-40a1-a0ba-2a71d9e6f3bf")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TransitionData) data).mTarget = value;
        }

        @objid ("d946a714-1149-4ee5-b158-59f2412196fe")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateVertexSmClass)this.getTarget()).getIncomingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("95bfc0fc-a768-4ea2-87d3-0bd8d89b684f")
    public static class SourceSmDependency extends SmSingleDependency {
        @objid ("212b4f0e-8471-4f61-be2a-03b236b3b3b1")
        private SmDependency symetricDep;

        @objid ("3f254270-8827-4c65-8e77-cae5f357d7ee")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TransitionData) data).mSource;
        }

        @objid ("cf7a40c9-35d9-41cf-9ec1-f466c06a513e")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TransitionData) data).mSource = value;
        }

        @objid ("242562ae-f153-4c70-8e8f-1684e06e891d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((StateVertexSmClass)this.getTarget()).getOutGoingDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("8a35f60e-0f36-42b2-b541-1f7e74797026")
    public static class EffectsSmDependency extends SmSingleDependency {
        @objid ("0e8e14d5-e3b3-4033-b83a-a1c162cd43b9")
        private SmDependency symetricDep;

        @objid ("5fcd60e7-d6e9-4839-a53f-b145411a9156")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((TransitionData) data).mEffects;
        }

        @objid ("8f4b1f8b-50f0-4626-8d45-7df74200db77")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((TransitionData) data).mEffects = value;
        }

        @objid ("40cee9c5-58a1-4c80-9ccc-c56900cc2000")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((SignalSmClass)this.getTarget()).getSendsDep();
            }
            return this.symetricDep;
        }

    }

}
