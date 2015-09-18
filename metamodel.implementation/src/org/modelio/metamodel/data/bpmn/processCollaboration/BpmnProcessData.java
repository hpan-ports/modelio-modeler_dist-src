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
    @objid ("c3c19549-8863-448a-9ef4-b07a7f131b5f")
    @SmaMetaAttribute(metaName="ProcessType", type=BpmnProcessType.class, smAttributeClass=Metadata.ProcessTypeSmAttribute.class)
     Object mProcessType = BpmnProcessType.NONEPROCESS;

    @objid ("0874658c-8b8c-4b0b-8dc3-c985d502fd36")
    @SmaMetaAttribute(metaName="IsClosed", type=Boolean.class, smAttributeClass=Metadata.IsClosedSmAttribute.class)
     Object mIsClosed = false;

    @objid ("c5d76ef7-761e-4902-b34b-ff0f0242b010")
    @SmaMetaAttribute(metaName="IsExecutable", type=OptionalBoolean.class, smAttributeClass=Metadata.IsExecutableSmAttribute.class)
     Object mIsExecutable = OptionalBoolean.OUNDEFINED;

    @objid ("531ba4b3-e9ff-4dfe-a1dc-491f84c0e7c1")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("004db5a2-5dd9-4481-8239-cfa4fd22ccdb")
    @SmaMetaAssociation(metaName="Supports", typeDataClass=BpmnProcessData.class, min=0, max=-1, smAssociationClass=Metadata.SupportsSmDependency.class, partof = true)
     List<SmObjectImpl> mSupports = null;

    @objid ("bdc05430-378a-4a75-9b16-a0603526a726")
    @SmaMetaAssociation(metaName="Artifact", typeDataClass=BpmnArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ArtifactSmDependency.class, component = true)
     List<SmObjectImpl> mArtifact = null;

    @objid ("0ee3ec4c-e09e-4666-b4cd-629f1e35c4ee")
    @SmaMetaAssociation(metaName="LaneSet", typeDataClass=BpmnLaneSetData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSetSmDependency.class, component = true)
     List<SmObjectImpl> mLaneSet = null;

    @objid ("a92d6294-63cb-4d73-8354-90f6302227bd")
    @SmaMetaAssociation(metaName="Supported", typeDataClass=BpmnProcessData.class, min=0, max=-1, smAssociationClass=Metadata.SupportedSmDependency.class)
     List<SmObjectImpl> mSupported = null;

    @objid ("2705d558-3255-45fd-84c9-35fdce456af2")
    @SmaMetaAssociation(metaName="Participant", typeDataClass=BpmnParticipantData.class, min=0, max=1, smAssociationClass=Metadata.ParticipantSmDependency.class, partof = true)
     SmObjectImpl mParticipant;

    @objid ("1beec78a-0900-4385-9614-2e980e0d9630")
    @SmaMetaAssociation(metaName="FlowElement", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.FlowElementSmDependency.class, component = true)
     List<SmObjectImpl> mFlowElement = null;

    @objid ("5d8bebf1-1330-47d0-875d-374e4beedbea")
    @SmaMetaAssociation(metaName="Resource", typeDataClass=BpmnResourceRoleData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceSmDependency.class, component = true)
     List<SmObjectImpl> mResource = null;

    @objid ("c3a85ade-6f90-4df6-b085-82c5b2bc9f59")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0031a808-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("60ab63d0-e691-44f7-a1b5-577583acf686")
        private static SmClass smClass = null;

        @objid ("bc4f370e-2f90-462a-b9b5-2af10c33e85b")
        private static SmAttribute ProcessTypeAtt = null;

        @objid ("bcae0976-f197-4d92-b732-68eb6646433c")
        private static SmAttribute IsClosedAtt = null;

        @objid ("8b67b88a-1a10-4bb4-b35b-f587fb7d085d")
        private static SmAttribute IsExecutableAtt = null;

        @objid ("32f31b8a-6f40-4422-b2b9-a095ccc17099")
        private static SmDependency CallerDep = null;

        @objid ("d518e200-b47a-4543-872c-3251b8d48c6a")
        private static SmDependency SupportsDep = null;

        @objid ("ccf8d865-8ec2-48bb-ad3e-bfa4faa03226")
        private static SmDependency ArtifactDep = null;

        @objid ("998e5807-1ec6-4f96-ab04-3f7ee8238530")
        private static SmDependency LaneSetDep = null;

        @objid ("a22029e6-acbf-4055-904a-169963141ae4")
        private static SmDependency SupportedDep = null;

        @objid ("52f012fb-db48-4f9e-9a79-67527f23dafe")
        private static SmDependency ParticipantDep = null;

        @objid ("76ef3871-5a8f-45dd-a33d-a5bad8d740ad")
        private static SmDependency FlowElementDep = null;

        @objid ("0820e3ee-f955-4447-b7f9-cc42427fcce4")
        private static SmDependency ResourceDep = null;

        @objid ("47170126-92c0-47cb-ba79-4d13aaaff5a4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnProcessData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("14caf344-0ce0-4231-9864-90db726fbe2f")
        public static SmAttribute ProcessTypeAtt() {
            if (ProcessTypeAtt == null) {
            	ProcessTypeAtt = classof().getAttributeDef("ProcessType");
            }
            return ProcessTypeAtt;
        }

        @objid ("fabe0124-fb2d-4162-83aa-d890069be7c1")
        public static SmAttribute IsClosedAtt() {
            if (IsClosedAtt == null) {
            	IsClosedAtt = classof().getAttributeDef("IsClosed");
            }
            return IsClosedAtt;
        }

        @objid ("2bc31bac-d096-4304-ab69-782dd63a9d33")
        public static SmAttribute IsExecutableAtt() {
            if (IsExecutableAtt == null) {
            	IsExecutableAtt = classof().getAttributeDef("IsExecutable");
            }
            return IsExecutableAtt;
        }

        @objid ("e1a16d68-a046-443a-aec0-61f74d5f1ee5")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("9dac272e-d1ac-40ba-a08e-032c84dee7c7")
        public static SmDependency SupportsDep() {
            if (SupportsDep == null) {
            	SupportsDep = classof().getDependencyDef("Supports");
            }
            return SupportsDep;
        }

        @objid ("10597679-5fbd-4652-9fce-5730dc539eff")
        public static SmDependency ArtifactDep() {
            if (ArtifactDep == null) {
            	ArtifactDep = classof().getDependencyDef("Artifact");
            }
            return ArtifactDep;
        }

        @objid ("b8b4897f-6d7c-4636-818d-377ec2aa12d4")
        public static SmDependency LaneSetDep() {
            if (LaneSetDep == null) {
            	LaneSetDep = classof().getDependencyDef("LaneSet");
            }
            return LaneSetDep;
        }

        @objid ("5c30e501-594a-4999-a106-94ea4892a629")
        public static SmDependency SupportedDep() {
            if (SupportedDep == null) {
            	SupportedDep = classof().getDependencyDef("Supported");
            }
            return SupportedDep;
        }

        @objid ("5fc55caf-8188-43ba-8760-2f01a059e9eb")
        public static SmDependency ParticipantDep() {
            if (ParticipantDep == null) {
            	ParticipantDep = classof().getDependencyDef("Participant");
            }
            return ParticipantDep;
        }

        @objid ("c64c8f9e-cae3-44c3-88c5-54e3160b794f")
        public static SmDependency FlowElementDep() {
            if (FlowElementDep == null) {
            	FlowElementDep = classof().getDependencyDef("FlowElement");
            }
            return FlowElementDep;
        }

        @objid ("0b4efcc0-3335-40f1-8245-862141ce0bb2")
        public static SmDependency ResourceDep() {
            if (ResourceDep == null) {
            	ResourceDep = classof().getDependencyDef("Resource");
            }
            return ResourceDep;
        }

        @objid ("58c71aa6-596c-4f7b-b455-4283d06093ba")
        public static SmDependency getSupportsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SupportsDep;
        }

        @objid ("ebd8a7ab-b907-4e74-b100-bb1c5963ba37")
        public static SmDependency getResourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceDep;
        }

        @objid ("e80eace2-2c52-48bc-a28f-1ab9a3241dc3")
        public static SmDependency getFlowElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FlowElementDep;
        }

        @objid ("ae60e7c3-72e4-46ae-8c0f-7d12a5a49283")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0cc96dc6-634f-4caf-8615-9cb1bdf15cfe")
        public static SmDependency getArtifactDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArtifactDep;
        }

        @objid ("8559f683-07f2-4c2c-9c8b-5c7e9ebf06d5")
        public static SmAttribute getProcessTypeAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessTypeAtt;
        }

        @objid ("699d225c-b175-4c2c-acd2-b3761d1b843b")
        public static SmDependency getParticipantDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantDep;
        }

        @objid ("699a9f7d-35d5-45e6-9090-43b4da3fa146")
        public static SmDependency getLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneSetDep;
        }

        @objid ("892ca6ca-852a-41ce-8059-fa84bafc2289")
        public static SmAttribute getIsClosedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsClosedAtt;
        }

        @objid ("05a3b146-ad84-4437-87e5-e09ea984f3fd")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("f75a0930-8660-4e20-aff8-620af301f942")
        public static SmDependency getSupportedDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SupportedDep;
        }

        @objid ("e881b335-489e-4473-b624-e080b3e36e25")
        public static SmAttribute getIsExecutableAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsExecutableAtt;
        }

        @objid ("0031f3d0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f1242255-beb4-4f8f-9368-bb50c9672a63")
            public ISmObjectData createData() {
                return new BpmnProcessData();
            }

            @objid ("b8c078cd-c9b6-4b52-9a8c-27003af6ee52")
            public SmObjectImpl createImpl() {
                return new BpmnProcessImpl();
            }

        }

        @objid ("0032648c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProcessTypeSmAttribute extends SmAttribute {
            @objid ("720446bd-783f-4206-a0a5-e121c613c8c8")
            public Object getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mProcessType;
            }

            @objid ("e7694331-1b96-4af2-b95e-5d2a41dbc386")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnProcessData) data).mProcessType = value;
            }

        }

        @objid ("0032d55c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsClosedSmAttribute extends SmAttribute {
            @objid ("4e63f1e1-9b30-4915-882b-6b07d52320a1")
            public Object getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mIsClosed;
            }

            @objid ("c6e1815b-ebc9-4ac0-b647-cfad3eefcbf0")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnProcessData) data).mIsClosed = value;
            }

        }

        @objid ("003344ec-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsExecutableSmAttribute extends SmAttribute {
            @objid ("1d9cda9a-d0bc-45bb-a882-a4077c05d09b")
            public Object getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mIsExecutable;
            }

            @objid ("877a6a37-9a98-4a73-aba7-7af6d6b704d3")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnProcessData) data).mIsExecutable = value;
            }

        }

        @objid ("0033b756-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SupportsSmDependency extends SmMultipleDependency {
            @objid ("cfd6fd9c-a9e8-4dec-a562-c2bc3446c2ec")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mSupports != null)? ((BpmnProcessData)data).mSupports:SmMultipleDependency.EMPTY;
            }

            @objid ("ce779238-2266-49fc-87f4-30be6daa88a3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mSupports = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mSupports;
            }

            @objid ("b7bc5495-ae03-4a1f-888b-aaf574b86621")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.SupportedDep();
            }

        }

        @objid ("003427f4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LaneSetSmDependency extends SmMultipleDependency {
            @objid ("b79f5d13-6993-4d63-8846-875d0fb1bf7c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mLaneSet != null)? ((BpmnProcessData)data).mLaneSet:SmMultipleDependency.EMPTY;
            }

            @objid ("35cb98b5-f9cc-455d-8393-112400b9f08b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mLaneSet = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mLaneSet;
            }

            @objid ("6eaf50a4-22b4-4bd8-86c8-88aa0dec365b")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.ProcessDep();
            }

        }

        @objid ("0034981a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParticipantSmDependency extends SmSingleDependency {
            @objid ("01d8cd99-cb86-4011-a9dc-adc559a6f985")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnProcessData) data).mParticipant;
            }

            @objid ("18d8110e-7a07-4cc6-ab37-7129663440c6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnProcessData) data).mParticipant = value;
            }

            @objid ("61722ddf-4f5e-4d2f-92c9-0693de7fdbff")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.ProcessDep();
            }

        }

        @objid ("00351fe2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ResourceSmDependency extends SmMultipleDependency {
            @objid ("4af0fc8e-d061-40ec-bbe0-3346e294aa02")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mResource != null)? ((BpmnProcessData)data).mResource:SmMultipleDependency.EMPTY;
            }

            @objid ("bf487f54-f28a-4c7b-9745-e3aad93c3871")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mResource = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mResource;
            }

            @objid ("93bf4572-2096-4ab8-b1b9-6f1f8966a6e7")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.ProcessDep();
            }

        }

        @objid ("003590bc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ArtifactSmDependency extends SmMultipleDependency {
            @objid ("4611f1b4-cfcb-4c80-854f-61aaad7c22f1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mArtifact != null)? ((BpmnProcessData)data).mArtifact:SmMultipleDependency.EMPTY;
            }

            @objid ("73059847-0a4c-48ab-a3db-4ac84b48e1f7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mArtifact = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mArtifact;
            }

            @objid ("80cdde82-cce7-447f-adb7-62cd9aa025eb")
            @Override
            public SmDependency getSymetric() {
                return BpmnArtifactData.Metadata.ProcessDep();
            }

        }

        @objid ("0036038a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class FlowElementSmDependency extends SmMultipleDependency {
            @objid ("e495a4a6-6cfa-4e9a-90a6-f12e735bddca")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mFlowElement != null)? ((BpmnProcessData)data).mFlowElement:SmMultipleDependency.EMPTY;
            }

            @objid ("48321b98-a1c8-4d4f-a92a-e58f1d2b2b6f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mFlowElement = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mFlowElement;
            }

            @objid ("c7b086a8-486e-478b-8129-a1c75b546e01")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.ContainerDep();
            }

        }

        @objid ("00367644-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SupportedSmDependency extends SmMultipleDependency {
            @objid ("0e969992-4e75-4530-9d69-491940445012")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mSupported != null)? ((BpmnProcessData)data).mSupported:SmMultipleDependency.EMPTY;
            }

            @objid ("943f78be-257d-4798-a291-c959bad55000")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mSupported = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mSupported;
            }

            @objid ("e3fda008-1af2-487d-bab4-4ec64435ecb6")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.SupportsDep();
            }

        }

        @objid ("0036e962-c4c2-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("12a81bf0-db3a-469a-9179-c16023d167a9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnProcessData)data).mCaller != null)? ((BpmnProcessData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("98287dcf-3299-4e55-bd4b-018156cbfef4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnProcessData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BpmnProcessData) data).mCaller;
            }

            @objid ("f1af5fc2-6178-4831-a75d-1bd88a98260c")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledProcessDep();
            }

        }

    }

}
