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
    @objid ("04cbde62-cff5-4d84-b036-b8b2811fc2a7")
    @SmaMetaAttribute(metaName="ProcessType", type=BpmnProcessType.class, smAttributeClass=Metadata.ProcessTypeSmAttribute.class)
     Object mProcessType = BpmnProcessType.NONEPROCESS;

    @objid ("bc2472ac-e87d-4550-89cd-9a73104e3bcf")
    @SmaMetaAttribute(metaName="IsClosed", type=Boolean.class, smAttributeClass=Metadata.IsClosedSmAttribute.class)
     Object mIsClosed = false;

    @objid ("677843ea-4d5f-4f76-ac99-005095e24ca6")
    @SmaMetaAttribute(metaName="IsExecutable", type=OptionalBoolean.class, smAttributeClass=Metadata.IsExecutableSmAttribute.class)
     Object mIsExecutable = OptionalBoolean.OUNDEFINED;

    @objid ("3c935b8f-fa3a-4e7c-a0c1-d069af254c62")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("a2f5eb63-3ab0-424a-b992-73d6c5ea282a")
    @SmaMetaAssociation(metaName="Supports", typeDataClass=BpmnProcessData.class, min=0, max=-1, smAssociationClass=Metadata.SupportsSmDependency.class, partof = true)
     List<SmObjectImpl> mSupports = null;

    @objid ("dfb48dfc-383b-4876-8500-2e14c6eee911")
    @SmaMetaAssociation(metaName="Artifact", typeDataClass=BpmnArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ArtifactSmDependency.class, component = true)
     List<SmObjectImpl> mArtifact = null;

    @objid ("6e3c26b7-ca2f-4d71-9b87-958ffdcd9a9a")
    @SmaMetaAssociation(metaName="LaneSet", typeDataClass=BpmnLaneSetData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSetSmDependency.class, component = true)
     List<SmObjectImpl> mLaneSet = null;

    @objid ("9610933d-07b8-4f6d-8b9a-a84c49bfbd1c")
    @SmaMetaAssociation(metaName="Supported", typeDataClass=BpmnProcessData.class, min=0, max=-1, smAssociationClass=Metadata.SupportedSmDependency.class)
     List<SmObjectImpl> mSupported = null;

    @objid ("2154c2b4-03a3-4c6b-9ae0-482497b102c9")
    @SmaMetaAssociation(metaName="Participant", typeDataClass=BpmnParticipantData.class, min=0, max=1, smAssociationClass=Metadata.ParticipantSmDependency.class, partof = true)
     SmObjectImpl mParticipant;

    @objid ("056e4afd-ca8f-4182-8923-f55a008f0a05")
    @SmaMetaAssociation(metaName="FlowElement", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.FlowElementSmDependency.class, component = true)
     List<SmObjectImpl> mFlowElement = null;

    @objid ("0093693d-00c5-445d-8c09-249815a8474c")
    @SmaMetaAssociation(metaName="Resource", typeDataClass=BpmnResourceRoleData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceSmDependency.class, component = true)
     List<SmObjectImpl> mResource = null;

    @objid ("a60a2b7e-ebe2-4f79-a9e5-8ac13b742b22")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0031a808-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bae36fc3-0efd-4d40-bbc8-05ff422ef0b1")
        private static SmClass smClass = null;

        @objid ("ba304e09-6c51-4794-acec-a7dadf2da1f1")
        private static SmAttribute ProcessTypeAtt = null;

        @objid ("b9940645-a4fc-4b5c-bf32-e08cebd714d7")
        private static SmAttribute IsClosedAtt = null;

        @objid ("fa618f8a-38a5-4de3-a998-fd9c44ca8b80")
        private static SmAttribute IsExecutableAtt = null;

        @objid ("f7a3f775-304c-4300-8ddf-de950ab66374")
        private static SmDependency CallerDep = null;

        @objid ("ce4597ea-aa43-476e-96cf-8ae912450b4d")
        private static SmDependency SupportsDep = null;

        @objid ("fedb262e-97d4-4158-885b-104594ef0763")
        private static SmDependency ArtifactDep = null;

        @objid ("4731bbcc-1eb1-4d66-9a19-0c2edbec3265")
        private static SmDependency LaneSetDep = null;

        @objid ("feedafc8-d7f4-45a6-b78b-2741221ae5ba")
        private static SmDependency SupportedDep = null;

        @objid ("d78eb379-c902-44a4-b9e8-61646dd21b45")
        private static SmDependency ParticipantDep = null;

        @objid ("5874a67b-6b78-432c-a47c-4befdfa3616a")
        private static SmDependency FlowElementDep = null;

        @objid ("82117824-a77a-440c-b933-f46a222e3eeb")
        private static SmDependency ResourceDep = null;

        @objid ("03f40e83-9479-4250-815d-dc4e22ad457e")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnProcessData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b758a10e-9aa1-4164-afd7-2bb98bec4950")
        public static SmAttribute ProcessTypeAtt() {
            if (ProcessTypeAtt == null) {
            	ProcessTypeAtt = classof().getAttributeDef("ProcessType");
            }
            return ProcessTypeAtt;
        }

        @objid ("73c33537-eb86-4782-84eb-98f777b0b1d2")
        public static SmAttribute IsClosedAtt() {
            if (IsClosedAtt == null) {
            	IsClosedAtt = classof().getAttributeDef("IsClosed");
            }
            return IsClosedAtt;
        }

        @objid ("fba6afb8-9702-44a5-8226-86357b7c5396")
        public static SmAttribute IsExecutableAtt() {
            if (IsExecutableAtt == null) {
            	IsExecutableAtt = classof().getAttributeDef("IsExecutable");
            }
            return IsExecutableAtt;
        }

        @objid ("eb64324c-d21b-4f35-8117-e970bb9e9231")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("b6402027-5d39-4f75-ae1a-8db7fa6c88c6")
        public static SmDependency SupportsDep() {
            if (SupportsDep == null) {
            	SupportsDep = classof().getDependencyDef("Supports");
            }
            return SupportsDep;
        }

        @objid ("333c0a35-abc8-4b4e-a40c-028b59ad5c06")
        public static SmDependency ArtifactDep() {
            if (ArtifactDep == null) {
            	ArtifactDep = classof().getDependencyDef("Artifact");
            }
            return ArtifactDep;
        }

        @objid ("33603ff0-b26a-4a7e-a71d-96cfa15553ba")
        public static SmDependency LaneSetDep() {
            if (LaneSetDep == null) {
            	LaneSetDep = classof().getDependencyDef("LaneSet");
            }
            return LaneSetDep;
        }

        @objid ("b0d74396-a2c5-4d5b-ac5a-6ebf3971d807")
        public static SmDependency SupportedDep() {
            if (SupportedDep == null) {
            	SupportedDep = classof().getDependencyDef("Supported");
            }
            return SupportedDep;
        }

        @objid ("f0f1c818-c6d9-4dc5-b036-87db530ecca6")
        public static SmDependency ParticipantDep() {
            if (ParticipantDep == null) {
            	ParticipantDep = classof().getDependencyDef("Participant");
            }
            return ParticipantDep;
        }

        @objid ("e2bb0072-9dcd-40b7-90a0-99eb0f60bd57")
        public static SmDependency FlowElementDep() {
            if (FlowElementDep == null) {
            	FlowElementDep = classof().getDependencyDef("FlowElement");
            }
            return FlowElementDep;
        }

        @objid ("1638c06f-9dfe-43e4-9c13-a2aa7f1218fd")
        public static SmDependency ResourceDep() {
            if (ResourceDep == null) {
            	ResourceDep = classof().getDependencyDef("Resource");
            }
            return ResourceDep;
        }

        @objid ("67ee4d55-b024-4151-bae9-8dacb66f47b6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ee48cdb6-9fae-43a8-9136-98f74fa68d2c")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("395fa9f5-085f-491c-8c1f-79e2668f4246")
        public static SmDependency getResourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceDep;
        }

        @objid ("56ca5c74-a8d3-41b7-80ba-ca61696deb19")
        public static SmAttribute getIsExecutableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExecutableAtt;
        }

        @objid ("4149e531-e3f4-4acd-9fdf-547fd279a1e8")
        public static SmDependency getSupportsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SupportsDep;
        }

        @objid ("314ab242-290a-4328-a9fe-c6ca5a1a3bf8")
        public static SmAttribute getProcessTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessTypeAtt;
        }

        @objid ("5349490c-9a15-4ddf-ac84-c5aff74817b6")
        public static SmDependency getLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneSetDep;
        }

        @objid ("1537900b-7527-40dc-a010-dc2ecb00e080")
        public static SmDependency getSupportedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SupportedDep;
        }

        @objid ("0f9da8a8-d071-42c0-9992-e5568ad642a6")
        public static SmDependency getArtifactDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArtifactDep;
        }

        @objid ("f53e16b5-4ccb-40a6-9d9b-4d577b574c0a")
        public static SmAttribute getIsClosedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsClosedAtt;
        }

        @objid ("147bcb27-ea9f-4ac4-a469-b0f64039f716")
        public static SmDependency getFlowElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FlowElementDep;
        }

        @objid ("91ce50de-f2c4-4e80-ba10-5f4054f94314")
        public static SmDependency getParticipantDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantDep;
        }

        @objid ("0031f3d0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("26f19222-8833-4fe2-ab3b-1fa709c61447")
            public ISmObjectData createData() {
                return new BpmnProcessData();
            }

            @objid ("5c4be28d-5cd8-474b-a327-e8fe118b9700")
            public SmObjectImpl createImpl() {
                return new BpmnProcessImpl();
            }

        }

        @objid ("0032648c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProcessTypeSmAttribute extends SmAttribute {
            @objid ("03847dce-4d26-47c7-a3d7-a4661f748360")
            public Object getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mProcessType;
            }

            @objid ("551dc2e0-8332-4a4c-86e9-a268a6c68d83")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnProcessData) data).mProcessType = value;
            }

        }

        @objid ("0032d55c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsClosedSmAttribute extends SmAttribute {
            @objid ("2ec34bbd-7e0a-4d7c-910b-a3eab5bcb7b0")
            public Object getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mIsClosed;
            }

            @objid ("956aa6be-654b-481a-8f0e-cfdfccaf8a7d")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnProcessData) data).mIsClosed = value;
            }

        }

        @objid ("003344ec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsExecutableSmAttribute extends SmAttribute {
            @objid ("c8fb033a-429d-458c-b6fa-3a49a393157d")
            public Object getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mIsExecutable;
            }

            @objid ("86142873-0860-4ee4-907a-2cfb4076ffbf")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnProcessData) data).mIsExecutable = value;
            }

        }

        @objid ("0033b756-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SupportsSmDependency extends SmMultipleDependency {
            @objid ("a086ee2d-665b-4c2e-8aa7-84c38c80e99b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mSupports != null)? ((BpmnProcessData)data).mSupports:SmMultipleDependency.EMPTY;
            }

            @objid ("99ad1d45-e55b-4b3b-b278-80422da62162")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mSupports = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mSupports;
            }

            @objid ("eef6faea-729d-4094-9ac0-88c466cd7058")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.SupportedDep();
            }

        }

        @objid ("003427f4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LaneSetSmDependency extends SmMultipleDependency {
            @objid ("716dd916-fd05-4f35-9c91-3952dbe8debf")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mLaneSet != null)? ((BpmnProcessData)data).mLaneSet:SmMultipleDependency.EMPTY;
            }

            @objid ("e7ae75d6-c879-4983-b95d-1e26663499bf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mLaneSet = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mLaneSet;
            }

            @objid ("fb1b0dec-7064-49d5-9737-3aba2c4f09a6")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.ProcessDep();
            }

        }

        @objid ("0034981a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParticipantSmDependency extends SmSingleDependency {
            @objid ("ff58da59-10f2-40c0-abc3-310e99e4145f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mParticipant;
            }

            @objid ("3c9eaf24-5ebb-4034-8da8-a6a3ca52fec2")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnProcessData) data).mParticipant = value;
            }

            @objid ("b3d69b9b-8321-459a-a7e4-812428ae9905")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.ProcessDep();
            }

        }

        @objid ("00351fe2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceSmDependency extends SmMultipleDependency {
            @objid ("86a2ffbc-0fda-4184-8865-67d7b831bbdd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mResource != null)? ((BpmnProcessData)data).mResource:SmMultipleDependency.EMPTY;
            }

            @objid ("76c596f6-744d-44d3-b371-ecbc8909501a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mResource = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mResource;
            }

            @objid ("d6fefa22-ebbf-4cce-9941-a74b4db4b3d7")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.ProcessDep();
            }

        }

        @objid ("003590bc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ArtifactSmDependency extends SmMultipleDependency {
            @objid ("f92cb238-2167-460c-93e8-9abdb9794908")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mArtifact != null)? ((BpmnProcessData)data).mArtifact:SmMultipleDependency.EMPTY;
            }

            @objid ("c255b10f-a545-4ad9-b028-253fb923d6e9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mArtifact = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mArtifact;
            }

            @objid ("f9199aa5-a635-4313-8475-025cc29c7aad")
            @Override
            public SmDependency getSymetric() {
                return BpmnArtifactData.Metadata.ProcessDep();
            }

        }

        @objid ("0036038a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class FlowElementSmDependency extends SmMultipleDependency {
            @objid ("9917fc0c-96a9-41b7-ae4c-68556299e8ba")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mFlowElement != null)? ((BpmnProcessData)data).mFlowElement:SmMultipleDependency.EMPTY;
            }

            @objid ("ba743ab7-701f-4a2d-a246-32ad87eeb008")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mFlowElement = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mFlowElement;
            }

            @objid ("f8f71aef-ee4f-4c3f-9b33-b6607cd2a3b0")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.ContainerDep();
            }

        }

        @objid ("00367644-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SupportedSmDependency extends SmMultipleDependency {
            @objid ("ba527116-9aa5-418f-b3af-2f96fb7ff313")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mSupported != null)? ((BpmnProcessData)data).mSupported:SmMultipleDependency.EMPTY;
            }

            @objid ("01b1c8db-b7d6-48fc-9555-5b12a434f39c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mSupported = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mSupported;
            }

            @objid ("6df9557a-7aec-4e7e-9b47-24e3e9da700c")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.SupportsDep();
            }

        }

        @objid ("0036e962-c4c2-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("76ac0120-75d7-40f2-93a9-0b5f639e1226")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mCaller != null)? ((BpmnProcessData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("138961cb-f347-4768-bfc0-4f2eb0497486")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mCaller;
            }

            @objid ("2cc1ca31-9272-45ca-bac8-84a61dfab049")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledProcessDep();
            }

        }

    }

}
