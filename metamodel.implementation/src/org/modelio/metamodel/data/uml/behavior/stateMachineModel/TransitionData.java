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
    @objid ("b22a78ae-8d96-49e0-aa7a-f92c3ca897e9")
    @SmaMetaAttribute(metaName="Effect", type=String.class, smAttributeClass=Metadata.EffectSmAttribute.class)
     Object mEffect = "";

    @objid ("d58bb90d-6acd-4750-b117-3c539df5c4f1")
    @SmaMetaAttribute(metaName="ReceivedEvents", type=String.class, smAttributeClass=Metadata.ReceivedEventsSmAttribute.class)
     Object mReceivedEvents = "";

    @objid ("2175afaf-13c1-4334-8153-94725bb3bd68")
    @SmaMetaAttribute(metaName="SentEvents", type=String.class, smAttributeClass=Metadata.SentEventsSmAttribute.class)
     Object mSentEvents = "";

    @objid ("a757de56-bb48-43c7-a2d7-f170d8e7bf01")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("5e7b266c-35b0-484f-8655-5dd1445590ce")
    @SmaMetaAttribute(metaName="PostCondition", type=String.class, smAttributeClass=Metadata.PostConditionSmAttribute.class)
     Object mPostCondition = "";

    @objid ("a817bbed-f5cc-423b-bd1a-0cbfbb10d404")
    @SmaMetaAssociation(metaName="Processed", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ProcessedSmDependency.class, partof = true)
     SmObjectImpl mProcessed;

    @objid ("734417e1-acbd-4ac2-8659-c19682b6a267")
    @SmaMetaAssociation(metaName="Trigger", typeDataClass=EventData.class, min=0, max=1, smAssociationClass=Metadata.TriggerSmDependency.class, partof = true)
     SmObjectImpl mTrigger;

    @objid ("90ddeb11-10d5-4fc0-8079-38ee4ea3a50c")
    @SmaMetaAssociation(metaName="BehaviorEffect", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.BehaviorEffectSmDependency.class, partof = true)
     SmObjectImpl mBehaviorEffect;

    @objid ("96cf49cb-cd54-443c-a515-e0dca4a2b3ad")
    @SmaMetaAssociation(metaName="Target", typeDataClass=StateVertexData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("831e44a7-af70-4172-b389-4cc38dfe2339")
    @SmaMetaAssociation(metaName="Source", typeDataClass=StateVertexData.class, min=0, max=1, smAssociationClass=Metadata.SourceSmDependency.class)
     SmObjectImpl mSource;

    @objid ("d382fd51-8dbe-4c75-9a59-1e129d253a1b")
    @SmaMetaAssociation(metaName="Effects", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.EffectsSmDependency.class, partof = true)
     SmObjectImpl mEffects;

    @objid ("61fb8d52-ecc7-4c6d-91b9-3339ec1e9a14")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0060fff4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8d5dcb9a-2a80-427f-9193-bcd5f3705a4e")
        private static SmClass smClass = null;

        @objid ("97687a9c-53c3-48b2-aba5-a087b05a78b0")
        private static SmAttribute EffectAtt = null;

        @objid ("af17b057-d059-482f-8980-b2e668baaf17")
        private static SmAttribute ReceivedEventsAtt = null;

        @objid ("25296603-27ab-42f1-b195-cbbf0b7531da")
        private static SmAttribute SentEventsAtt = null;

        @objid ("5518cb1f-246b-4b37-9c44-a5f30d2d6802")
        private static SmAttribute GuardAtt = null;

        @objid ("3370269f-0f83-4f69-ae3b-e2c6034a789b")
        private static SmAttribute PostConditionAtt = null;

        @objid ("d1ad0407-4554-40e5-afff-cae7e4adb61f")
        private static SmDependency ProcessedDep = null;

        @objid ("c7034878-1bc1-4633-b432-ebe6e3e3fb86")
        private static SmDependency TriggerDep = null;

        @objid ("0023f461-6b65-4e6b-9b9f-b55b29b68f7d")
        private static SmDependency BehaviorEffectDep = null;

        @objid ("12053bb8-6f2b-42c2-8bd5-901c1852bc2d")
        private static SmDependency TargetDep = null;

        @objid ("6a5e940c-59e6-4d25-b510-70f6fcb8b371")
        private static SmDependency SourceDep = null;

        @objid ("e35c0c47-91cb-464e-af0c-c30597d4b76b")
        private static SmDependency EffectsDep = null;

        @objid ("6175a5a5-7fdf-40ce-ae46-66c2db3e4694")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TransitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("022219f8-936a-4d8f-aef3-37d23476e817")
        public static SmAttribute EffectAtt() {
            if (EffectAtt == null) {
            	EffectAtt = classof().getAttributeDef("Effect");
            }
            return EffectAtt;
        }

        @objid ("b8357799-eb4d-4b50-8e2b-c7d8d18434ea")
        public static SmAttribute ReceivedEventsAtt() {
            if (ReceivedEventsAtt == null) {
            	ReceivedEventsAtt = classof().getAttributeDef("ReceivedEvents");
            }
            return ReceivedEventsAtt;
        }

        @objid ("248ef06a-52d5-4264-a414-1330eb235871")
        public static SmAttribute SentEventsAtt() {
            if (SentEventsAtt == null) {
            	SentEventsAtt = classof().getAttributeDef("SentEvents");
            }
            return SentEventsAtt;
        }

        @objid ("984eb5d2-57e2-4879-aa63-b8b2bd716389")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("f08a10c0-bf02-43aa-9e7e-8cc741c4c664")
        public static SmAttribute PostConditionAtt() {
            if (PostConditionAtt == null) {
            	PostConditionAtt = classof().getAttributeDef("PostCondition");
            }
            return PostConditionAtt;
        }

        @objid ("cc98a6fd-f78a-4d02-a283-eb9914f26bb5")
        public static SmDependency ProcessedDep() {
            if (ProcessedDep == null) {
            	ProcessedDep = classof().getDependencyDef("Processed");
            }
            return ProcessedDep;
        }

        @objid ("1098866d-f626-491c-9bc8-3112c5cd35be")
        public static SmDependency TriggerDep() {
            if (TriggerDep == null) {
            	TriggerDep = classof().getDependencyDef("Trigger");
            }
            return TriggerDep;
        }

        @objid ("c97dd3fa-0d8e-4155-8557-321122857467")
        public static SmDependency BehaviorEffectDep() {
            if (BehaviorEffectDep == null) {
            	BehaviorEffectDep = classof().getDependencyDef("BehaviorEffect");
            }
            return BehaviorEffectDep;
        }

        @objid ("b72688b1-2c38-4761-93f9-33b9b2670083")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("5f091ca5-28bc-4ff6-84de-82d9641d028e")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("158a4345-9314-42b3-89d8-891b052b31e4")
        public static SmDependency EffectsDep() {
            if (EffectsDep == null) {
            	EffectsDep = classof().getDependencyDef("Effects");
            }
            return EffectsDep;
        }

        @objid ("c2293b29-89d6-4122-8a51-3b718912f226")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("cfc7bf84-6b0a-4905-8350-2ac5679cb998")
        public static SmDependency getEffectsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectsDep;
        }

        @objid ("9919f48d-b4de-4d52-8c35-34e52c0b06b7")
        public static SmAttribute getSentEventsAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentEventsAtt;
        }

        @objid ("f755fd71-4632-4d95-84db-812f4f6ae725")
        public static SmAttribute getReceivedEventsAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedEventsAtt;
        }

        @objid ("986ee6bc-4b81-4806-9f0c-291aa3304863")
        public static SmDependency getBehaviorEffectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BehaviorEffectDep;
        }

        @objid ("566d30ac-8d14-4780-ba87-ef6654a344d8")
        public static SmDependency getTriggerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TriggerDep;
        }

        @objid ("81f743f7-e477-46be-9961-e05224e08c87")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("099ad18f-276c-4b05-95dc-038d6b63dd9d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("7202a509-42ad-4642-9144-87e303c8dbb9")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("05887ed7-0ab3-4719-92ad-0d6da5194056")
        public static SmAttribute getPostConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PostConditionAtt;
        }

        @objid ("0b22771b-4c8a-4b9e-bb71-7e979e63f7e3")
        public static SmAttribute getEffectAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectAtt;
        }

        @objid ("d806d0f8-e236-4b4c-b294-b950b75bd5b3")
        public static SmDependency getProcessedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessedDep;
        }

        @objid ("006142c0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c968cf90-2c57-4163-b0a4-09656b07c0d7")
            public ISmObjectData createData() {
                return new TransitionData();
            }

            @objid ("3821debc-d801-47d9-8526-2b7ad5cece55")
            public SmObjectImpl createImpl() {
                return new TransitionImpl();
            }

        }

        @objid ("0061a56c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectSmAttribute extends SmAttribute {
            @objid ("ed6c7b47-ecd4-4769-a788-cfc1092251ba")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mEffect;
            }

            @objid ("0f671225-8394-406b-a058-393662818a60")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mEffect = value;
            }

        }

        @objid ("00620872-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceivedEventsSmAttribute extends SmAttribute {
            @objid ("72aafbb5-4f4e-4d78-94b6-a6ac5381bc07")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mReceivedEvents;
            }

            @objid ("08f0b37a-468a-43b9-91a2-0d1ffae4cbb4")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mReceivedEvents = value;
            }

        }

        @objid ("00626b32-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SentEventsSmAttribute extends SmAttribute {
            @objid ("497533aa-d55f-432a-81e9-7e59c8fd160e")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mSentEvents;
            }

            @objid ("253e63e5-1bb8-45cf-a22d-e87cb976b2c0")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mSentEvents = value;
            }

        }

        @objid ("0062ce56-c4c3-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("953cea24-ec51-46c2-94bd-3c8a02a83f27")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mGuard;
            }

            @objid ("d570490d-922d-47f5-8588-3dbebcebe747")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mGuard = value;
            }

        }

        @objid ("00633274-c4c3-1fd8-97fe-001ec947cd2a")
        public static class PostConditionSmAttribute extends SmAttribute {
            @objid ("cf8e5e91-2cbe-4558-8566-25391ab8ce55")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mPostCondition;
            }

            @objid ("e4ef3c8f-587c-415e-9918-53b2c6257c2d")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mPostCondition = value;
            }

        }

        @objid ("00639a84-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BehaviorEffectSmDependency extends SmSingleDependency {
            @objid ("a2fcd9eb-d002-486f-a368-09788ba8e6a7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mBehaviorEffect;
            }

            @objid ("3f888028-9a05-43c4-a1f1-5f4224fb6f03")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mBehaviorEffect = value;
            }

            @objid ("38e72a9a-ee93-4465-91c0-ddbf628b81d8")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.EffectOfDep();
            }

        }

        @objid ("006413ec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectsSmDependency extends SmSingleDependency {
            @objid ("1c2b21a4-17ba-4de0-ac0b-e596c5ed86b5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mEffects;
            }

            @objid ("83c910b5-5675-4aad-b205-8e11148309f2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mEffects = value;
            }

            @objid ("d30ad02f-e82c-410e-b94b-41ebd6051b27")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.SendsDep();
            }

        }

        @objid ("00648d86-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProcessedSmDependency extends SmSingleDependency {
            @objid ("0b0a3299-585f-489f-9fbd-08c8b400a2e1")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mProcessed;
            }

            @objid ("f0344cdb-6598-4529-a2e6-b0e0aae6f7da")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mProcessed = value;
            }

            @objid ("478ace61-fb07-40ff-8000-a6e95a8397e3")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.InvokerDep();
            }

        }

        @objid ("0065072a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("78703970-291f-43bc-bb1f-9aa6eec8ce89")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mSource;
            }

            @objid ("70effc18-d192-4aa3-90d3-8eea6049ba1c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mSource = value;
            }

            @objid ("4440cc49-ee78-41d0-b29b-e178bc16e102")
            @Override
            public SmDependency getSymetric() {
                return StateVertexData.Metadata.OutGoingDep();
            }

        }

        @objid ("006581a0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("c22a73ef-d0fd-4364-87ed-481ce71c6662")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mTarget;
            }

            @objid ("3bf688d7-46b1-4833-9b95-40e073c6b42c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mTarget = value;
            }

            @objid ("8d4ab72d-716c-46f3-a43f-83b6927c5773")
            @Override
            public SmDependency getSymetric() {
                return StateVertexData.Metadata.IncomingDep();
            }

        }

        @objid ("0065fc48-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TriggerSmDependency extends SmSingleDependency {
            @objid ("290706b5-3cde-4e8c-875e-285bc0f78e11")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mTrigger;
            }

            @objid ("8729e66d-5ff6-453c-9dd7-a6f74e853e91")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mTrigger = value;
            }

            @objid ("b323f3d5-e321-48d6-b3c0-63a9624cc30e")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.TriggeredDep();
            }

        }

    }

}
