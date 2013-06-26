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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageFlowData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnParticipantData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnArtifactData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnRootElementData;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnCollaborationImpl;
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

@objid ("00742fca-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnCollaboration.class, factory=BpmnCollaborationData.Metadata.ObjectFactory.class)
public class BpmnCollaborationData extends BpmnRootElementData {
    @objid ("a7bf3705-777a-4e94-bdfd-77bd5f4c963f")
    @SmaMetaAttribute(metaName="IsClosed", type=Boolean.class, smAttributeClass=Metadata.IsClosedSmAttribute.class)
     Object mIsClosed = false;

    @objid ("6b12ee97-14c3-4c61-9695-b9871552fc24")
    @SmaMetaAssociation(metaName="Artifact", typeDataClass=BpmnArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ArtifactSmDependency.class, component = true)
     List<SmObjectImpl> mArtifact = null;

    @objid ("b3d24257-50ea-4417-b54c-0c3192901580")
    @SmaMetaAssociation(metaName="MessageFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.MessageFlowSmDependency.class, component = true)
     List<SmObjectImpl> mMessageFlow = null;

    @objid ("d4873b54-75c3-48d7-9a80-beae1aa4a10b")
    @SmaMetaAssociation(metaName="Participants", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.ParticipantsSmDependency.class, component = true)
     List<SmObjectImpl> mParticipants = null;

    @objid ("58388d36-219a-490e-a643-fc79b8db2539")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ef3d2-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e6eadcbf-28db-4eb4-9207-dbd6aa8b7cbc")
        private static SmClass smClass = null;

        @objid ("d39d183b-7e0d-4fdc-a071-687eb7e6adc7")
        private static SmAttribute IsClosedAtt = null;

        @objid ("1cc7b3f7-c050-4136-8c50-ca8e98a014ef")
        private static SmDependency ArtifactDep = null;

        @objid ("a796e270-3873-485a-8650-83d84e807325")
        private static SmDependency MessageFlowDep = null;

        @objid ("96a1da67-ffd5-4811-9216-ac48ca7780d7")
        private static SmDependency ParticipantsDep = null;

        @objid ("1c16eb8e-e001-426b-94db-b0248e135c52")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCollaborationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("03ba39c6-dfa3-43ee-8805-013e6ca6a2f2")
        public static SmAttribute IsClosedAtt() {
            if (IsClosedAtt == null) {
            	IsClosedAtt = classof().getAttributeDef("IsClosed");
            }
            return IsClosedAtt;
        }

        @objid ("23ea26b8-c8ce-417e-929b-01edcfe09a05")
        public static SmDependency ArtifactDep() {
            if (ArtifactDep == null) {
            	ArtifactDep = classof().getDependencyDef("Artifact");
            }
            return ArtifactDep;
        }

        @objid ("536608b1-3081-42ef-a231-48b8e768d5ba")
        public static SmDependency MessageFlowDep() {
            if (MessageFlowDep == null) {
            	MessageFlowDep = classof().getDependencyDef("MessageFlow");
            }
            return MessageFlowDep;
        }

        @objid ("24158b10-1241-48fc-9b4a-8e76532dea59")
        public static SmDependency ParticipantsDep() {
            if (ParticipantsDep == null) {
            	ParticipantsDep = classof().getDependencyDef("Participants");
            }
            return ParticipantsDep;
        }

        @objid ("215468e8-d444-4523-95c5-f1a5c4c00c89")
        public static SmDependency getArtifactDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArtifactDep;
        }

        @objid ("d6c73b58-1299-4d0c-89ca-fd8d2d171b1f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("242da3c3-9ccf-4fca-95a4-dd9a25729827")
        public static SmDependency getMessageFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageFlowDep;
        }

        @objid ("b8c01b04-0b2c-4d95-831e-43e67e92e20f")
        public static SmDependency getParticipantsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantsDep;
        }

        @objid ("80752d35-8370-4f66-a9bf-f625aff41908")
        public static SmAttribute getIsClosedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsClosedAtt;
        }

        @objid ("003f3f9a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("28aeb264-5023-4fef-a89c-4ed458fa4108")
            public ISmObjectData createData() {
                return new BpmnCollaborationData();
            }

            @objid ("7c3445b7-ab8f-44be-b26f-ccb96aca3c40")
            public SmObjectImpl createImpl() {
                return new BpmnCollaborationImpl();
            }

        }

        @objid ("003facf0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsClosedSmAttribute extends SmAttribute {
            @objid ("95782f32-0e38-4341-8359-a194ab430aac")
            public Object getValue(ISmObjectData data) {
                return ((BpmnCollaborationData) data).mIsClosed;
            }

            @objid ("a6fad645-7056-42ec-b97f-a55a7883a72c")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnCollaborationData) data).mIsClosed = value;
            }

        }

        @objid ("00401bcc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MessageFlowSmDependency extends SmMultipleDependency {
            @objid ("1f447890-78ca-4868-b287-47493f8b7e5b")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCollaborationData)data).mMessageFlow != null)? ((BpmnCollaborationData)data).mMessageFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("f380e3a1-9a28-4e60-9833-8cfae52cc19f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCollaborationData) data).mMessageFlow = new ArrayList<>(initialCapacity);
                return ((BpmnCollaborationData) data).mMessageFlow;
            }

            @objid ("2417a9cd-2dce-4318-88a6-177e1f812a56")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.CollaborationDep();
            }

        }

        @objid ("00408c10-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ArtifactSmDependency extends SmMultipleDependency {
            @objid ("c42bba48-51ad-493c-a805-36d8f2658ff7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCollaborationData)data).mArtifact != null)? ((BpmnCollaborationData)data).mArtifact:SmMultipleDependency.EMPTY;
            }

            @objid ("ac82f193-b32b-43df-b03d-2c63835ba40d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCollaborationData) data).mArtifact = new ArrayList<>(initialCapacity);
                return ((BpmnCollaborationData) data).mArtifact;
            }

            @objid ("1bbb02ff-f599-4e44-bdb0-b18307599011")
            @Override
            public SmDependency getSymetric() {
                return BpmnArtifactData.Metadata.CollaborationDep();
            }

        }

        @objid ("0040fb46-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParticipantsSmDependency extends SmMultipleDependency {
            @objid ("aa6670fb-075d-4f8c-84a2-a3ad357b9aa7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCollaborationData)data).mParticipants != null)? ((BpmnCollaborationData)data).mParticipants:SmMultipleDependency.EMPTY;
            }

            @objid ("2dae39f2-5b08-4c9d-b7a5-de5ea7fdde44")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCollaborationData) data).mParticipants = new ArrayList<>(initialCapacity);
                return ((BpmnCollaborationData) data).mParticipants;
            }

            @objid ("68a4e4f6-c336-4bab-9997-96474b84e681")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.ContainerDep();
            }

        }

    }

}
