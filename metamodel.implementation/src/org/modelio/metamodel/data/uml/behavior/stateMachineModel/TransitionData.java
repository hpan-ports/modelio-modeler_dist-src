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
package org.modelio.metamodel.data.uml.behavior.stateMachineModel;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.EventData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.StateVertexData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.TransitionImpl;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
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

@objid ("00561594-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Transition.class, factory=TransitionData.Metadata.ObjectFactory.class)
public class TransitionData extends ModelElementData {
    @objid ("f3b7fade-36b3-4619-ac07-49175f737149")
    @SmaMetaAttribute(metaName="Effect", type=String.class, smAttributeClass=Metadata.EffectSmAttribute.class)
     Object mEffect = "";

    @objid ("fab34d66-aa21-4aff-a230-753242c7d859")
    @SmaMetaAttribute(metaName="ReceivedEvents", type=String.class, smAttributeClass=Metadata.ReceivedEventsSmAttribute.class)
     Object mReceivedEvents = "";

    @objid ("3b94497e-ba3d-4bf2-abf5-84676b80d136")
    @SmaMetaAttribute(metaName="SentEvents", type=String.class, smAttributeClass=Metadata.SentEventsSmAttribute.class)
     Object mSentEvents = "";

    @objid ("f6ead2cb-a1b4-43a1-bf5f-4a2186b3bd95")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("e3593ed1-26cc-4fa3-903d-f140eb34487d")
    @SmaMetaAttribute(metaName="PostCondition", type=String.class, smAttributeClass=Metadata.PostConditionSmAttribute.class)
     Object mPostCondition = "";

    @objid ("2c847b0c-8272-460e-8fb4-757f46d722d2")
    @SmaMetaAssociation(metaName="Processed", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ProcessedSmDependency.class, partof = true)
     SmObjectImpl mProcessed;

    @objid ("fc62eb25-a21e-430d-8d5e-fa26a33acf18")
    @SmaMetaAssociation(metaName="Trigger", typeDataClass=EventData.class, min=0, max=1, smAssociationClass=Metadata.TriggerSmDependency.class, partof = true)
     SmObjectImpl mTrigger;

    @objid ("45cf816b-8701-4c97-8d63-bea55de2fbd1")
    @SmaMetaAssociation(metaName="BehaviorEffect", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.BehaviorEffectSmDependency.class, partof = true)
     SmObjectImpl mBehaviorEffect;

    @objid ("1f0a5328-e43a-4b3a-adfa-7c424dd45c86")
    @SmaMetaAssociation(metaName="Target", typeDataClass=StateVertexData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("607a4cd6-7125-4110-9b0a-095815c996a6")
    @SmaMetaAssociation(metaName="Source", typeDataClass=StateVertexData.class, min=0, max=1, smAssociationClass=Metadata.SourceSmDependency.class)
     SmObjectImpl mSource;

    @objid ("443fda50-fdc0-4940-b99e-758dc0144931")
    @SmaMetaAssociation(metaName="Effects", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.EffectsSmDependency.class, partof = true)
     SmObjectImpl mEffects;

    @objid ("5954904b-50e9-463b-81ae-c73f141745e7")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0060fff4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("44c6461e-881f-46e7-a223-57900f20e432")
        private static SmClass smClass = null;

        @objid ("af760fea-89a0-484b-8ad9-bd6499f83305")
        private static SmAttribute EffectAtt = null;

        @objid ("9f5bde71-04d0-4802-aba2-3666e87c6483")
        private static SmAttribute ReceivedEventsAtt = null;

        @objid ("04d79461-3d12-4a48-8dec-e39595c24ab1")
        private static SmAttribute SentEventsAtt = null;

        @objid ("548d3583-4c90-43e0-adcd-0ae49c7d311b")
        private static SmAttribute GuardAtt = null;

        @objid ("25cbdbe7-c69a-4b3b-b889-0b4dcacc1bf5")
        private static SmAttribute PostConditionAtt = null;

        @objid ("b1bee38b-69b8-4677-b4d8-b424e320247c")
        private static SmDependency ProcessedDep = null;

        @objid ("aa83e7f8-1a93-4d3e-9824-a95a8d48d775")
        private static SmDependency TriggerDep = null;

        @objid ("6813a37f-61ea-4024-92f2-1ffa1129be09")
        private static SmDependency BehaviorEffectDep = null;

        @objid ("caa9ca21-6854-46fb-979f-43203699c655")
        private static SmDependency TargetDep = null;

        @objid ("589b57e4-bf76-46ac-b736-4d8d47572d23")
        private static SmDependency SourceDep = null;

        @objid ("2b153c3b-daec-47bf-b8bd-2dc17ebe06b1")
        private static SmDependency EffectsDep = null;

        @objid ("64299ddc-76ed-4366-947a-2d263946746e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TransitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("43cc3fc1-6987-4aa2-8335-e67856d77ce8")
        public static SmAttribute EffectAtt() {
            if (EffectAtt == null) {
            	EffectAtt = classof().getAttributeDef("Effect");
            }
            return EffectAtt;
        }

        @objid ("e6684ed0-c164-4261-82cd-6f30e5fe59d4")
        public static SmAttribute ReceivedEventsAtt() {
            if (ReceivedEventsAtt == null) {
            	ReceivedEventsAtt = classof().getAttributeDef("ReceivedEvents");
            }
            return ReceivedEventsAtt;
        }

        @objid ("14fae8ab-9f69-43dd-a9dc-be62247bcf9e")
        public static SmAttribute SentEventsAtt() {
            if (SentEventsAtt == null) {
            	SentEventsAtt = classof().getAttributeDef("SentEvents");
            }
            return SentEventsAtt;
        }

        @objid ("b118c500-b8ed-4b34-8e04-3a34fdfd07b0")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("89feea49-ab99-4d06-a4d9-fcc6ab9f2f6e")
        public static SmAttribute PostConditionAtt() {
            if (PostConditionAtt == null) {
            	PostConditionAtt = classof().getAttributeDef("PostCondition");
            }
            return PostConditionAtt;
        }

        @objid ("fc3595aa-c259-47cb-9b68-47a8626a9aa7")
        public static SmDependency ProcessedDep() {
            if (ProcessedDep == null) {
            	ProcessedDep = classof().getDependencyDef("Processed");
            }
            return ProcessedDep;
        }

        @objid ("0b056602-235c-4844-a5d4-05dfbeb8b8d1")
        public static SmDependency TriggerDep() {
            if (TriggerDep == null) {
            	TriggerDep = classof().getDependencyDef("Trigger");
            }
            return TriggerDep;
        }

        @objid ("d264a0ac-e118-4103-90d1-4765cf8bf970")
        public static SmDependency BehaviorEffectDep() {
            if (BehaviorEffectDep == null) {
            	BehaviorEffectDep = classof().getDependencyDef("BehaviorEffect");
            }
            return BehaviorEffectDep;
        }

        @objid ("c2086b59-8e76-4a46-9989-5a208bdbb676")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("f71c29a6-30de-4b8a-9761-5792c698f2e7")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("e9eecdee-2e8c-4f40-8729-e7950bb614cd")
        public static SmDependency EffectsDep() {
            if (EffectsDep == null) {
            	EffectsDep = classof().getDependencyDef("Effects");
            }
            return EffectsDep;
        }

        @objid ("6aa410f4-1108-46aa-a18d-c1e3722747d3")
        public static SmDependency getBehaviorEffectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BehaviorEffectDep;
        }

        @objid ("ffd4aeb1-2887-4cac-990d-36d51a77ade2")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("ef903732-d757-4a03-869e-22a80e1cb3f1")
        public static SmDependency getTriggerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TriggerDep;
        }

        @objid ("1e1cfd14-52ee-4c3b-9e4e-2eaf13ac322b")
        public static SmDependency getProcessedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessedDep;
        }

        @objid ("fa2bbd64-1feb-4392-92e8-f499284673df")
        public static SmAttribute getReceivedEventsAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedEventsAtt;
        }

        @objid ("6ef2dd45-5cf9-4b85-bb35-6ccc09567731")
        public static SmDependency getEffectsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectsDep;
        }

        @objid ("36db1d53-32f5-495c-9f17-f7be38ed032e")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("be6ecc0a-c0e4-48ba-abd4-189bfa43e042")
        public static SmAttribute getPostConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PostConditionAtt;
        }

        @objid ("c585588e-ca76-4376-be92-4875195fe9e5")
        public static SmAttribute getSentEventsAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentEventsAtt;
        }

        @objid ("11f7fdb8-4604-4a28-8358-edc465903501")
        public static SmAttribute getEffectAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectAtt;
        }

        @objid ("41eaf3cd-5bf4-4bd0-8fe0-2977fe762b93")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("5f946a29-7fff-46b8-b1e4-986dd4835b21")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("006142c0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("ac4389e6-e9b9-4e50-9e07-c18ac6941526")
            public ISmObjectData createData() {
                return new TransitionData();
            }

            @objid ("0f3f5c33-61ce-4d99-8862-a7ce21c33827")
            public SmObjectImpl createImpl() {
                return new TransitionImpl();
            }

        }

        @objid ("0061a56c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectSmAttribute extends SmAttribute {
            @objid ("2d7c1bf3-ca51-4531-b8b2-4e8ce52d8e5b")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mEffect;
            }

            @objid ("b405fe34-99a8-48d9-acea-8c6ca4d9806f")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mEffect = value;
            }

        }

        @objid ("00620872-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceivedEventsSmAttribute extends SmAttribute {
            @objid ("b0cd03bb-664e-4b28-b734-4be7700de6ee")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mReceivedEvents;
            }

            @objid ("6037dc7d-cc60-4049-8250-98cd4eee5f1f")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mReceivedEvents = value;
            }

        }

        @objid ("00626b32-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SentEventsSmAttribute extends SmAttribute {
            @objid ("e06c8179-49a1-4d84-9af4-4532b0bf03f8")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mSentEvents;
            }

            @objid ("38774d58-5652-4cba-bee0-fb163f905483")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mSentEvents = value;
            }

        }

        @objid ("0062ce56-c4c3-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("bce2013b-6668-431a-a60b-5d0ddbf256ab")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mGuard;
            }

            @objid ("8bb1f59f-2912-4f95-b536-1c38ed6bb9ee")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mGuard = value;
            }

        }

        @objid ("00633274-c4c3-1fd8-97fe-001ec947cd2a")
        public static class PostConditionSmAttribute extends SmAttribute {
            @objid ("435c2b0a-111b-4d20-b495-ae92138829dc")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mPostCondition;
            }

            @objid ("7f04b718-d64e-4a67-a4a8-68fb8483d424")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mPostCondition = value;
            }

        }

        @objid ("00639a84-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BehaviorEffectSmDependency extends SmSingleDependency {
            @objid ("8da32c7f-5e6f-4d3c-aec6-e1ec819670e5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mBehaviorEffect;
            }

            @objid ("b0934f93-8d6d-45ee-9c1d-020dd20949c5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mBehaviorEffect = value;
            }

            @objid ("62a6dae6-894d-4c9d-93ca-cd860939cd4b")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.EffectOfDep();
            }

        }

        @objid ("006413ec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectsSmDependency extends SmSingleDependency {
            @objid ("7a22baf8-91c1-4e8d-8ff9-e4da80827211")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mEffects;
            }

            @objid ("aac2c9a8-3464-4d92-8531-e11616c4377b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mEffects = value;
            }

            @objid ("bedd090b-67b7-4d57-8371-264daeb4abcc")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.SendsDep();
            }

        }

        @objid ("00648d86-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProcessedSmDependency extends SmSingleDependency {
            @objid ("f61f3b25-692c-47eb-ad5d-fd7751feefdb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mProcessed;
            }

            @objid ("4657bfe9-edff-4c83-ae82-0f845c248acf")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mProcessed = value;
            }

            @objid ("4e186b32-65d6-41ed-b4bd-ad34cab4bf0f")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.InvokerDep();
            }

        }

        @objid ("0065072a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("5e80410d-a653-4ca9-ac21-abcbe758eb3b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mSource;
            }

            @objid ("0d1e2559-2577-43ab-9c7a-2807847313ec")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mSource = value;
            }

            @objid ("b84e05f8-3f2e-4ac2-bfe4-c646c23129d2")
            @Override
            public SmDependency getSymetric() {
                return StateVertexData.Metadata.OutGoingDep();
            }

        }

        @objid ("006581a0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("97a608b7-ca37-443d-9e07-d7931aa41c4d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mTarget;
            }

            @objid ("2085e8fc-3e2b-441f-bded-88974bd99c06")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mTarget = value;
            }

            @objid ("55b96091-c18e-49d1-b4e9-001445a320d0")
            @Override
            public SmDependency getSymetric() {
                return StateVertexData.Metadata.IncomingDep();
            }

        }

        @objid ("0065fc48-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TriggerSmDependency extends SmSingleDependency {
            @objid ("bd6e9adb-9420-43dc-bba0-50bf276bf2bc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mTrigger;
            }

            @objid ("8de5c5eb-782a-4c08-a19f-1cf2e19eef25")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mTrigger = value;
            }

            @objid ("c5d05c0a-1b89-426c-8892-6f6fe8659862")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.TriggeredDep();
            }

        }

    }

}
