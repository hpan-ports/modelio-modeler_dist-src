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
    @objid ("50e655c7-cfa2-4099-a26c-ffb931914ea9")
    @SmaMetaAttribute(metaName="Effect", type=String.class, smAttributeClass=Metadata.EffectSmAttribute.class)
     Object mEffect = "";

    @objid ("772927f9-400a-4f38-8b94-a461942371bd")
    @SmaMetaAttribute(metaName="ReceivedEvents", type=String.class, smAttributeClass=Metadata.ReceivedEventsSmAttribute.class)
     Object mReceivedEvents = "";

    @objid ("1741c5f7-3f68-4b4e-b6e4-a8cd7796dbc6")
    @SmaMetaAttribute(metaName="SentEvents", type=String.class, smAttributeClass=Metadata.SentEventsSmAttribute.class)
     Object mSentEvents = "";

    @objid ("b813ba3a-577e-4d16-8eaf-a9487f65e45f")
    @SmaMetaAttribute(metaName="Guard", type=String.class, smAttributeClass=Metadata.GuardSmAttribute.class)
     Object mGuard = "";

    @objid ("ef0221b9-4054-44c4-8cf9-3a6709cb9068")
    @SmaMetaAttribute(metaName="PostCondition", type=String.class, smAttributeClass=Metadata.PostConditionSmAttribute.class)
     Object mPostCondition = "";

    @objid ("d4ccc8b5-06c1-4549-bb2d-05bfbf3adc41")
    @SmaMetaAssociation(metaName="Processed", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ProcessedSmDependency.class, partof = true)
     SmObjectImpl mProcessed;

    @objid ("e3d39fa9-c61c-4718-af98-0746d5f1c2f3")
    @SmaMetaAssociation(metaName="Trigger", typeDataClass=EventData.class, min=0, max=1, smAssociationClass=Metadata.TriggerSmDependency.class, partof = true)
     SmObjectImpl mTrigger;

    @objid ("e8c73ced-9b08-45f6-bb8e-dbd907fee585")
    @SmaMetaAssociation(metaName="BehaviorEffect", typeDataClass=BehaviorData.class, min=0, max=1, smAssociationClass=Metadata.BehaviorEffectSmDependency.class, partof = true)
     SmObjectImpl mBehaviorEffect;

    @objid ("95f77512-f71f-4353-a924-6b2ddb400953")
    @SmaMetaAssociation(metaName="Target", typeDataClass=StateVertexData.class, min=0, max=1, smAssociationClass=Metadata.TargetSmDependency.class, partof = true)
     SmObjectImpl mTarget;

    @objid ("f96becef-c1db-438a-97b1-86c63eb842f2")
    @SmaMetaAssociation(metaName="Source", typeDataClass=StateVertexData.class, min=0, max=1, smAssociationClass=Metadata.SourceSmDependency.class)
     SmObjectImpl mSource;

    @objid ("851f9875-3857-4a78-8e34-bf69d11ea172")
    @SmaMetaAssociation(metaName="Effects", typeDataClass=SignalData.class, min=0, max=1, smAssociationClass=Metadata.EffectsSmDependency.class, partof = true)
     SmObjectImpl mEffects;

    @objid ("a5239156-458a-46e1-aa10-6b6f16136e89")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0060fff4-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("2f42dedf-2ab9-44ac-827c-9da9a8ab7d9d")
        private static SmClass smClass = null;

        @objid ("e4871bee-a0dc-4ab4-a3bc-efeaeaca192b")
        private static SmAttribute EffectAtt = null;

        @objid ("4d4cbb78-89fc-45d6-b695-406cc07bb641")
        private static SmAttribute ReceivedEventsAtt = null;

        @objid ("6ff27393-fd30-4b9d-a63c-acc8c764538e")
        private static SmAttribute SentEventsAtt = null;

        @objid ("eb43aca9-2e85-4a6c-930f-548655c36056")
        private static SmAttribute GuardAtt = null;

        @objid ("ce6bf036-f263-4a9d-82d2-f5cfcd837c77")
        private static SmAttribute PostConditionAtt = null;

        @objid ("9b884cee-4d28-4325-b226-70f09a4a7a4a")
        private static SmDependency ProcessedDep = null;

        @objid ("93702466-4ab1-4442-8298-2f73fbe47e15")
        private static SmDependency TriggerDep = null;

        @objid ("52811eba-cb13-432f-aa1f-d386e2fcb420")
        private static SmDependency BehaviorEffectDep = null;

        @objid ("e875417a-dcca-44d0-8009-a3ad7573d576")
        private static SmDependency TargetDep = null;

        @objid ("8bef845d-772c-46b9-98f3-046abe3dba14")
        private static SmDependency SourceDep = null;

        @objid ("b51068d5-3df7-465c-b3e5-26c701b839e8")
        private static SmDependency EffectsDep = null;

        @objid ("e539ea81-2d6c-46cd-8d4f-f3d4d160255f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(TransitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("659ded27-9364-4249-bc0f-3a9bd00d2c2d")
        public static SmAttribute EffectAtt() {
            if (EffectAtt == null) {
            	EffectAtt = classof().getAttributeDef("Effect");
            }
            return EffectAtt;
        }

        @objid ("f5c9e01d-313e-4672-8b3a-73e636b04b25")
        public static SmAttribute ReceivedEventsAtt() {
            if (ReceivedEventsAtt == null) {
            	ReceivedEventsAtt = classof().getAttributeDef("ReceivedEvents");
            }
            return ReceivedEventsAtt;
        }

        @objid ("85884d52-bf1e-4985-a71f-e49e542c18ef")
        public static SmAttribute SentEventsAtt() {
            if (SentEventsAtt == null) {
            	SentEventsAtt = classof().getAttributeDef("SentEvents");
            }
            return SentEventsAtt;
        }

        @objid ("789aa05d-b1da-4834-b7fc-84cb35f3a2b3")
        public static SmAttribute GuardAtt() {
            if (GuardAtt == null) {
            	GuardAtt = classof().getAttributeDef("Guard");
            }
            return GuardAtt;
        }

        @objid ("62c72290-3f2d-484c-ad60-4e630f5cf9a1")
        public static SmAttribute PostConditionAtt() {
            if (PostConditionAtt == null) {
            	PostConditionAtt = classof().getAttributeDef("PostCondition");
            }
            return PostConditionAtt;
        }

        @objid ("fc3e2367-dbd8-43a3-a42e-dc27515f965e")
        public static SmDependency ProcessedDep() {
            if (ProcessedDep == null) {
            	ProcessedDep = classof().getDependencyDef("Processed");
            }
            return ProcessedDep;
        }

        @objid ("68fa34e9-0f13-4143-af46-0a99ae16bfb4")
        public static SmDependency TriggerDep() {
            if (TriggerDep == null) {
            	TriggerDep = classof().getDependencyDef("Trigger");
            }
            return TriggerDep;
        }

        @objid ("f6d0d242-b435-43be-85e4-d1cf5725e941")
        public static SmDependency BehaviorEffectDep() {
            if (BehaviorEffectDep == null) {
            	BehaviorEffectDep = classof().getDependencyDef("BehaviorEffect");
            }
            return BehaviorEffectDep;
        }

        @objid ("990c539e-3f84-4179-abd4-19ada65c1a65")
        public static SmDependency TargetDep() {
            if (TargetDep == null) {
            	TargetDep = classof().getDependencyDef("Target");
            }
            return TargetDep;
        }

        @objid ("3c538c46-0bc8-4fb8-89a5-b5ef210f5d8d")
        public static SmDependency SourceDep() {
            if (SourceDep == null) {
            	SourceDep = classof().getDependencyDef("Source");
            }
            return SourceDep;
        }

        @objid ("e6e759aa-dded-4f23-9b0d-f1a98985a86e")
        public static SmDependency EffectsDep() {
            if (EffectsDep == null) {
            	EffectsDep = classof().getDependencyDef("Effects");
            }
            return EffectsDep;
        }

        @objid ("f3dd8c7a-638b-4cf7-a4e4-f4aa927b9d31")
        public static SmAttribute getReceivedEventsAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceivedEventsAtt;
        }

        @objid ("ee8671f0-7a16-43f2-9bc4-32ab898beab3")
        public static SmDependency getSourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceDep;
        }

        @objid ("8d773811-1ce9-48b8-8aca-38a5975b3d5b")
        public static SmDependency getTargetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetDep;
        }

        @objid ("a0b50eaf-d6e6-4b58-b46c-14d7878b8b71")
        public static SmAttribute getEffectAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectAtt;
        }

        @objid ("e35c85b5-5478-4aa3-b7a1-c5defb6336a6")
        public static SmDependency getProcessedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessedDep;
        }

        @objid ("e05c4341-d3e1-4322-bdda-49e12a6caf42")
        public static SmAttribute getPostConditionAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PostConditionAtt;
        }

        @objid ("7c1c1329-6e25-41bc-91e9-6edb89706b98")
        public static SmAttribute getSentEventsAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SentEventsAtt;
        }

        @objid ("3c9790fc-7f39-470d-9363-49c2683d7b6c")
        public static SmAttribute getGuardAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GuardAtt;
        }

        @objid ("b8aab15d-9d66-406b-b7ef-6323a826b7cd")
        public static SmDependency getBehaviorEffectDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BehaviorEffectDep;
        }

        @objid ("a9868f51-4cfc-4a65-9bda-5d15b062857d")
        public static SmDependency getEffectsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EffectsDep;
        }

        @objid ("dbbec6eb-24f5-4d46-93fa-20cae2da69f5")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d61c80d8-ed98-45ba-a6eb-353931743d26")
        public static SmDependency getTriggerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TriggerDep;
        }

        @objid ("006142c0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("90877a1a-0f51-4bec-b81b-a4754f52da46")
            public ISmObjectData createData() {
                return new TransitionData();
            }

            @objid ("e21b365b-c3bd-4967-99b4-3b2a0e60de92")
            public SmObjectImpl createImpl() {
                return new TransitionImpl();
            }

        }

        @objid ("0061a56c-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectSmAttribute extends SmAttribute {
            @objid ("40b89d0a-ef20-4147-87f5-f169e86b9880")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mEffect;
            }

            @objid ("a66c13c9-ac96-43fd-b34a-b02ca3b18272")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mEffect = value;
            }

        }

        @objid ("00620872-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ReceivedEventsSmAttribute extends SmAttribute {
            @objid ("c268843c-2303-403a-b2fd-ed7cb2765203")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mReceivedEvents;
            }

            @objid ("9ba0ddb9-9c48-4002-ba79-317fbc1fbf55")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mReceivedEvents = value;
            }

        }

        @objid ("00626b32-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SentEventsSmAttribute extends SmAttribute {
            @objid ("2fc7d9c5-7802-459b-8bc4-a953748caae9")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mSentEvents;
            }

            @objid ("35042511-7b90-46ee-a5bd-5051707a19fc")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mSentEvents = value;
            }

        }

        @objid ("0062ce56-c4c3-1fd8-97fe-001ec947cd2a")
        public static class GuardSmAttribute extends SmAttribute {
            @objid ("30a1cafb-c898-49d7-ba55-8e322468be4c")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mGuard;
            }

            @objid ("5e59ce8f-ce3a-4315-abdc-2b9b05b07ecf")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mGuard = value;
            }

        }

        @objid ("00633274-c4c3-1fd8-97fe-001ec947cd2a")
        public static class PostConditionSmAttribute extends SmAttribute {
            @objid ("fd195682-3d1f-4131-b57e-42eab4f5d4a8")
            public Object getValue(ISmObjectData data) {
                return ((TransitionData) data).mPostCondition;
            }

            @objid ("24361ca9-7f01-49cd-88d9-88b3a3a05f7e")
            public void setValue(ISmObjectData data, Object value) {
                ((TransitionData) data).mPostCondition = value;
            }

        }

        @objid ("00639a84-c4c3-1fd8-97fe-001ec947cd2a")
        public static class BehaviorEffectSmDependency extends SmSingleDependency {
            @objid ("be4c8d4c-cc4c-4d2c-bcde-bcd9a3dad8dc")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mBehaviorEffect;
            }

            @objid ("bb314342-a729-4c05-a11b-88015d3d9d8b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mBehaviorEffect = value;
            }

            @objid ("c43b8bcd-fc7e-4d10-9844-2c4d8e685923")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.EffectOfDep();
            }

        }

        @objid ("006413ec-c4c3-1fd8-97fe-001ec947cd2a")
        public static class EffectsSmDependency extends SmSingleDependency {
            @objid ("cb375a64-9a9e-48b0-a92c-bb0c77613db6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mEffects;
            }

            @objid ("ccab382e-0b5c-41e8-a1a0-259a471d755b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mEffects = value;
            }

            @objid ("55f9a9c8-8107-4fec-a446-8168d8042847")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.SendsDep();
            }

        }

        @objid ("00648d86-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ProcessedSmDependency extends SmSingleDependency {
            @objid ("32e16a57-6ca9-4b53-8327-5306ba285bcf")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mProcessed;
            }

            @objid ("838d86f4-0b7f-4a91-b48e-4ebded5d98b2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mProcessed = value;
            }

            @objid ("d60c2008-506e-4ef7-b5d0-f9351913151d")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.InvokerDep();
            }

        }

        @objid ("0065072a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class SourceSmDependency extends SmSingleDependency {
            @objid ("4e3cc328-854a-40d6-a4ef-ab39265925ed")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mSource;
            }

            @objid ("a5368865-c486-487b-ada7-b5cd4a9ee856")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mSource = value;
            }

            @objid ("39fef2ee-dc83-4f60-b439-9c3974fc4dc7")
            @Override
            public SmDependency getSymetric() {
                return StateVertexData.Metadata.OutGoingDep();
            }

        }

        @objid ("006581a0-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TargetSmDependency extends SmSingleDependency {
            @objid ("8f41cd66-2a0c-4df3-b069-a2c803fa4326")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mTarget;
            }

            @objid ("8be1fae2-b832-4ca1-84e6-2b54c5dbab47")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mTarget = value;
            }

            @objid ("3d3d6e47-082f-452a-806f-1fea05ab5ccc")
            @Override
            public SmDependency getSymetric() {
                return StateVertexData.Metadata.IncomingDep();
            }

        }

        @objid ("0065fc48-c4c3-1fd8-97fe-001ec947cd2a")
        public static class TriggerSmDependency extends SmSingleDependency {
            @objid ("80dd8007-568f-4e21-b842-5b64beb6939c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((TransitionData) data).mTrigger;
            }

            @objid ("31212466-49ad-4e81-9caa-4f40a3324a54")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((TransitionData) data).mTrigger = value;
            }

            @objid ("dc136502-5825-44f2-b439-d955e4c74a0e")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.TriggeredDep();
            }

        }

    }

}
