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
package org.modelio.metamodel.data.bpmn.processCollaboration;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcessType;
import org.modelio.metamodel.bpmn.processCollaboration.OptionalBoolean;
import org.modelio.metamodel.data.bpmn.activities.BpmnCallActivityData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneSetData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnParticipantData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceRoleData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnArtifactData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnProcessImpl;
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

@objid ("00768e50-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnProcess.class, factory=BpmnProcessData.Metadata.ObjectFactory.class)
public class BpmnProcessData extends BpmnRootElementData {
    @objid ("73f0afd8-3cd2-43be-af60-434a6744fd23")
    @SmaMetaAttribute(metaName="ProcessType", type=BpmnProcessType.class, smAttributeClass=Metadata.ProcessTypeSmAttribute.class)
     Object mProcessType = BpmnProcessType.NONEPROCESS;

    @objid ("00a8a9ec-11c5-4230-b4cf-e390f70ca6c2")
    @SmaMetaAttribute(metaName="IsClosed", type=Boolean.class, smAttributeClass=Metadata.IsClosedSmAttribute.class)
     Object mIsClosed = false;

    @objid ("a5c87744-9bc4-4ada-a592-690043f29e3b")
    @SmaMetaAttribute(metaName="IsExecutable", type=OptionalBoolean.class, smAttributeClass=Metadata.IsExecutableSmAttribute.class)
     Object mIsExecutable = OptionalBoolean.OUNDEFINED;

    @objid ("50fa8b2b-6c46-4473-aa16-6b62a3583dbe")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("91d48b27-0ff7-4604-aa74-8b1099167b69")
    @SmaMetaAssociation(metaName="Supports", typeDataClass=BpmnProcessData.class, min=0, max=-1, smAssociationClass=Metadata.SupportsSmDependency.class, partof = true)
     List<SmObjectImpl> mSupports = null;

    @objid ("7a6c3a7f-20fc-4428-9138-fcca285bd259")
    @SmaMetaAssociation(metaName="Artifact", typeDataClass=BpmnArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ArtifactSmDependency.class, component = true)
     List<SmObjectImpl> mArtifact = null;

    @objid ("39a91a69-fb06-48b7-9863-e8ac27267ccd")
    @SmaMetaAssociation(metaName="LaneSet", typeDataClass=BpmnLaneSetData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSetSmDependency.class, component = true)
     List<SmObjectImpl> mLaneSet = null;

    @objid ("88e14195-ff94-43c5-a03d-dd274dc21cac")
    @SmaMetaAssociation(metaName="Supported", typeDataClass=BpmnProcessData.class, min=0, max=-1, smAssociationClass=Metadata.SupportedSmDependency.class)
     List<SmObjectImpl> mSupported = null;

    @objid ("fc2b2775-78e3-44b9-8d34-2cfb54be96b1")
    @SmaMetaAssociation(metaName="Participant", typeDataClass=BpmnParticipantData.class, min=0, max=1, smAssociationClass=Metadata.ParticipantSmDependency.class, partof = true)
     SmObjectImpl mParticipant;

    @objid ("6b3a674c-b5d3-4a07-bcfc-cac559144067")
    @SmaMetaAssociation(metaName="FlowElement", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.FlowElementSmDependency.class, component = true)
     List<SmObjectImpl> mFlowElement = null;

    @objid ("4c9ac1a6-3721-4a17-bbb7-471611f7a18c")
    @SmaMetaAssociation(metaName="Resource", typeDataClass=BpmnResourceRoleData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceSmDependency.class, component = true)
     List<SmObjectImpl> mResource = null;

    @objid ("3d9446a2-f8e7-4564-b036-0c45eb3084d5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0031a808-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9c2d57b6-fe64-4c3d-85cc-fec2091d1504")
        private static SmClass smClass = null;

        @objid ("1a7d98b5-b920-45bc-bf09-bfe3cafc4217")
        private static SmAttribute ProcessTypeAtt = null;

        @objid ("dec1f406-7a29-4660-a290-bf13613fd65f")
        private static SmAttribute IsClosedAtt = null;

        @objid ("a6ea76e6-afd6-4cde-9e32-ddbfd0724982")
        private static SmAttribute IsExecutableAtt = null;

        @objid ("91fe3754-966d-4f10-a5c2-b136c9c58f4f")
        private static SmDependency CallerDep = null;

        @objid ("3e8ffb2f-4e54-4583-bc6e-1b6f63275a98")
        private static SmDependency SupportsDep = null;

        @objid ("4abffcc3-4070-4e73-a9b5-10b6c32a2b68")
        private static SmDependency ArtifactDep = null;

        @objid ("4845375e-66bb-4d9a-9c09-83b6eb7a4f78")
        private static SmDependency LaneSetDep = null;

        @objid ("2aa21c85-3d82-430f-a022-101da9fc91ce")
        private static SmDependency SupportedDep = null;

        @objid ("0d391e07-c48a-4f82-a7e4-3ea5f7e70947")
        private static SmDependency ParticipantDep = null;

        @objid ("48684deb-7530-46fe-916d-b08b6f584807")
        private static SmDependency FlowElementDep = null;

        @objid ("9fc77dca-20fc-40e1-8575-4a13196063d4")
        private static SmDependency ResourceDep = null;

        @objid ("7174097e-c637-4a6d-bab5-ec1c2bd3c40e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnProcessData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("509fa4fb-3355-4a66-9234-5704aeef59b6")
        public static SmAttribute ProcessTypeAtt() {
            if (ProcessTypeAtt == null) {
            	ProcessTypeAtt = classof().getAttributeDef("ProcessType");
            }
            return ProcessTypeAtt;
        }

        @objid ("11edac8e-d370-4283-b694-6aa03b084f87")
        public static SmAttribute IsClosedAtt() {
            if (IsClosedAtt == null) {
            	IsClosedAtt = classof().getAttributeDef("IsClosed");
            }
            return IsClosedAtt;
        }

        @objid ("c6caee6f-7e1c-4966-b759-5f3c9307b1e0")
        public static SmAttribute IsExecutableAtt() {
            if (IsExecutableAtt == null) {
            	IsExecutableAtt = classof().getAttributeDef("IsExecutable");
            }
            return IsExecutableAtt;
        }

        @objid ("9c08495e-754e-4c8d-b4bd-0b16136b41a7")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("12f2840e-4804-4d5d-87cc-292ea88fa26a")
        public static SmDependency SupportsDep() {
            if (SupportsDep == null) {
            	SupportsDep = classof().getDependencyDef("Supports");
            }
            return SupportsDep;
        }

        @objid ("2094c48f-7167-4c24-b98e-b95e8e1f1b00")
        public static SmDependency ArtifactDep() {
            if (ArtifactDep == null) {
            	ArtifactDep = classof().getDependencyDef("Artifact");
            }
            return ArtifactDep;
        }

        @objid ("8879b023-3f0d-4d83-a7aa-fe061d9a2181")
        public static SmDependency LaneSetDep() {
            if (LaneSetDep == null) {
            	LaneSetDep = classof().getDependencyDef("LaneSet");
            }
            return LaneSetDep;
        }

        @objid ("d0833b3a-436a-468e-a2c0-2fbe941504ed")
        public static SmDependency SupportedDep() {
            if (SupportedDep == null) {
            	SupportedDep = classof().getDependencyDef("Supported");
            }
            return SupportedDep;
        }

        @objid ("e115ac6f-f332-4cf7-bef4-c77404e011f9")
        public static SmDependency ParticipantDep() {
            if (ParticipantDep == null) {
            	ParticipantDep = classof().getDependencyDef("Participant");
            }
            return ParticipantDep;
        }

        @objid ("ae8d407b-b265-4eb4-94d4-c368418f4a19")
        public static SmDependency FlowElementDep() {
            if (FlowElementDep == null) {
            	FlowElementDep = classof().getDependencyDef("FlowElement");
            }
            return FlowElementDep;
        }

        @objid ("cb3a7f21-c6c8-4541-94a7-1733a3e03f58")
        public static SmDependency ResourceDep() {
            if (ResourceDep == null) {
            	ResourceDep = classof().getDependencyDef("Resource");
            }
            return ResourceDep;
        }

        @objid ("644c4d98-5e9e-40ec-ace5-4d6b7d82baf9")
        public static SmDependency getParticipantDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantDep;
        }

        @objid ("1738f6ff-9cd2-4e47-b360-827bb5fe59f4")
        public static SmDependency getResourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceDep;
        }

        @objid ("707c15fd-d5c0-4da9-bc06-da553d978370")
        public static SmDependency getSupportsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SupportsDep;
        }

        @objid ("ecf4bd2b-1ae8-4db2-a8a0-de9067d52d40")
        public static SmDependency getSupportedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SupportedDep;
        }

        @objid ("a6d07b8a-c0f6-4c93-bb52-9845dd9e3db7")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("6fb5bff6-551b-4044-9624-5f682c155a1a")
        public static SmAttribute getIsExecutableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExecutableAtt;
        }

        @objid ("b6c60908-e7dc-4195-900a-4ebcfc853f80")
        public static SmDependency getLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneSetDep;
        }

        @objid ("78fe67ef-6831-491d-8ddf-b5957b30871a")
        public static SmAttribute getIsClosedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsClosedAtt;
        }

        @objid ("37bbe610-9822-4b21-a567-604351ff1c85")
        public static SmAttribute getProcessTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessTypeAtt;
        }

        @objid ("6cbd3524-dcbf-4a00-840d-4faa9bfbbe1a")
        public static SmDependency getArtifactDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArtifactDep;
        }

        @objid ("73a5cee6-2739-4376-b7c4-48d5d3ef311c")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ab22e18a-26d5-48b1-9dbe-007d3de83520")
        public static SmDependency getFlowElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FlowElementDep;
        }

        @objid ("0031f3d0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c59e79ad-788e-4442-b6c8-5b2986e2ad6c")
            public ISmObjectData createData() {
                return new BpmnProcessData();
            }

            @objid ("1a595fb1-d439-4a9b-b9e6-6ff90b9e35c0")
            public SmObjectImpl createImpl() {
                return new BpmnProcessImpl();
            }

        }

        @objid ("0032648c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProcessTypeSmAttribute extends SmAttribute {
            @objid ("5e65f12d-3f9e-44f1-ac37-54663fd2a35d")
            public Object getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mProcessType;
            }

            @objid ("892919d9-17a1-4d06-a39d-e2c71520402a")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnProcessData) data).mProcessType = value;
            }

        }

        @objid ("0032d55c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsClosedSmAttribute extends SmAttribute {
            @objid ("5eb6de5c-8a33-4b2e-a9b7-cc26df3b22a1")
            public Object getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mIsClosed;
            }

            @objid ("8c4d9fa7-1032-4c32-97a4-5948f1850465")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnProcessData) data).mIsClosed = value;
            }

        }

        @objid ("003344ec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsExecutableSmAttribute extends SmAttribute {
            @objid ("58d15ac1-3158-498e-858b-ef2060ffaf67")
            public Object getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mIsExecutable;
            }

            @objid ("157b6bd6-3fe6-4fdc-a355-1f382ed485a7")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnProcessData) data).mIsExecutable = value;
            }

        }

        @objid ("0033b756-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SupportsSmDependency extends SmMultipleDependency {
            @objid ("22038b6e-5510-4bdc-84e8-b81bf0b4c8be")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mSupports != null)? ((BpmnProcessData)data).mSupports:SmMultipleDependency.EMPTY;
            }

            @objid ("4cee9b24-f70e-4a78-adfd-b6e38fabdc9e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mSupports = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mSupports;
            }

            @objid ("408f6f83-c5bc-444d-82db-f092e84b0970")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.SupportedDep();
            }

        }

        @objid ("003427f4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LaneSetSmDependency extends SmMultipleDependency {
            @objid ("1384aad7-5bf5-4930-b558-426967bf1f92")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mLaneSet != null)? ((BpmnProcessData)data).mLaneSet:SmMultipleDependency.EMPTY;
            }

            @objid ("72104d2b-39d7-490d-901b-4103749a8636")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mLaneSet = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mLaneSet;
            }

            @objid ("10895136-6c03-4823-9cf2-b50198c5e193")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.ProcessDep();
            }

        }

        @objid ("0034981a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParticipantSmDependency extends SmSingleDependency {
            @objid ("545afbb1-433c-49fb-a768-0e3a5bb15651")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mParticipant;
            }

            @objid ("1ed02c18-b459-48b0-ab89-7d45f386ca77")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnProcessData) data).mParticipant = value;
            }

            @objid ("9314a1d0-faff-46ff-bb46-9982197562dc")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.ProcessDep();
            }

        }

        @objid ("00351fe2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceSmDependency extends SmMultipleDependency {
            @objid ("7c52a82d-3898-40ef-8d66-193e0eb4a5ac")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mResource != null)? ((BpmnProcessData)data).mResource:SmMultipleDependency.EMPTY;
            }

            @objid ("e639f48b-63c5-49ed-9e6f-6a4dadfffe66")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mResource = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mResource;
            }

            @objid ("bfda6a5f-ec9c-4400-8aa8-bc97131a1f82")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.ProcessDep();
            }

        }

        @objid ("003590bc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ArtifactSmDependency extends SmMultipleDependency {
            @objid ("6b7c7d05-e420-4826-8250-a132d7341ed5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mArtifact != null)? ((BpmnProcessData)data).mArtifact:SmMultipleDependency.EMPTY;
            }

            @objid ("bff3ead9-87a0-4a79-9096-0521c4063ffc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mArtifact = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mArtifact;
            }

            @objid ("4011e39a-cc47-42c7-8e01-6c66add9e490")
            @Override
            public SmDependency getSymetric() {
                return BpmnArtifactData.Metadata.ProcessDep();
            }

        }

        @objid ("0036038a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class FlowElementSmDependency extends SmMultipleDependency {
            @objid ("541a236a-19be-45c5-ac5a-8acee6ac3002")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mFlowElement != null)? ((BpmnProcessData)data).mFlowElement:SmMultipleDependency.EMPTY;
            }

            @objid ("3c0a3c64-8a04-4ded-b196-3d827376e658")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mFlowElement = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mFlowElement;
            }

            @objid ("8224beda-203a-493c-a511-f674bce60e94")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.ContainerDep();
            }

        }

        @objid ("00367644-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SupportedSmDependency extends SmMultipleDependency {
            @objid ("54236b3f-bdbe-4f25-9b64-77c147b610d5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mSupported != null)? ((BpmnProcessData)data).mSupported:SmMultipleDependency.EMPTY;
            }

            @objid ("b841e7c7-cca0-48ce-a6f5-656e9a3c1d7b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mSupported = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mSupported;
            }

            @objid ("ddcb948f-0471-4506-939c-75775e0df162")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.SupportsDep();
            }

        }

        @objid ("0036e962-c4c2-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("9cdf0cfb-4f62-4e06-9cf2-b98ae537b002")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mCaller != null)? ((BpmnProcessData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("eda340ac-8d2e-4a1c-a9b3-5a362495576e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mCaller;
            }

            @objid ("b425aad2-55f6-40f0-8f0f-94a69e38d935")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledProcessDep();
            }

        }

    }

}
