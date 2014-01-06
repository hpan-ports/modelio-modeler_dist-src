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
    @objid ("4f22917d-444f-42dc-887a-e049dabbffc4")
    @SmaMetaAttribute(metaName="IsClosed", type=Boolean.class, smAttributeClass=Metadata.IsClosedSmAttribute.class)
     Object mIsClosed = false;

    @objid ("8d6c5507-4e0c-44df-8843-39a50e410d7a")
    @SmaMetaAssociation(metaName="Artifact", typeDataClass=BpmnArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ArtifactSmDependency.class, component = true)
     List<SmObjectImpl> mArtifact = null;

    @objid ("ac3faed6-7e48-42d1-93b3-e3f599e58f75")
    @SmaMetaAssociation(metaName="MessageFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.MessageFlowSmDependency.class, component = true)
     List<SmObjectImpl> mMessageFlow = null;

    @objid ("dbc30825-e34c-400b-a23d-e14903c6cfe1")
    @SmaMetaAssociation(metaName="Participants", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.ParticipantsSmDependency.class, component = true)
     List<SmObjectImpl> mParticipants = null;

    @objid ("0096a3d1-cf7a-4bea-8aa9-db68ee9099bc")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ef3d2-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("179589a5-10a7-4339-9f87-80ec47fb7055")
        private static SmClass smClass = null;

        @objid ("9ed8e534-566a-4ccb-8d79-c4ea3e531cea")
        private static SmAttribute IsClosedAtt = null;

        @objid ("fbc813b4-4c9e-4544-a283-62c37ddef61b")
        private static SmDependency ArtifactDep = null;

        @objid ("6daad74a-d974-43ad-9467-0a0aed93e561")
        private static SmDependency MessageFlowDep = null;

        @objid ("b3fa6191-bfb6-4f20-b326-12e2c1d3fec2")
        private static SmDependency ParticipantsDep = null;

        @objid ("a9d035c0-a9de-4aad-ae6c-ade85581909d")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCollaborationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("35cfd468-6054-4cef-8bdd-5259a2e23fb8")
        public static SmAttribute IsClosedAtt() {
            if (IsClosedAtt == null) {
            	IsClosedAtt = classof().getAttributeDef("IsClosed");
            }
            return IsClosedAtt;
        }

        @objid ("9b78223d-cdd0-4020-8138-19150c81d234")
        public static SmDependency ArtifactDep() {
            if (ArtifactDep == null) {
            	ArtifactDep = classof().getDependencyDef("Artifact");
            }
            return ArtifactDep;
        }

        @objid ("0fdfebfa-de05-400a-94ae-767a657c2fa3")
        public static SmDependency MessageFlowDep() {
            if (MessageFlowDep == null) {
            	MessageFlowDep = classof().getDependencyDef("MessageFlow");
            }
            return MessageFlowDep;
        }

        @objid ("dc9123c7-be6d-473a-8662-3a272e1787cf")
        public static SmDependency ParticipantsDep() {
            if (ParticipantsDep == null) {
            	ParticipantsDep = classof().getDependencyDef("Participants");
            }
            return ParticipantsDep;
        }

        @objid ("9b3168bc-5fdf-474d-95d0-7abf0e40c3c1")
        public static SmAttribute getIsClosedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsClosedAtt;
        }

        @objid ("13286997-88b4-4562-82d0-5c619f17f707")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ed6ae405-25c5-44f1-9545-fc4aad8ccc49")
        public static SmDependency getMessageFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageFlowDep;
        }

        @objid ("ea177a31-613d-4657-b134-48659846517e")
        public static SmDependency getParticipantsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantsDep;
        }

        @objid ("e4b840f1-2ce6-4020-a566-c0aa45a9ad00")
        public static SmDependency getArtifactDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArtifactDep;
        }

        @objid ("003f3f9a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1e14bbca-8a16-415f-a998-ffee8afe0fa5")
            public ISmObjectData createData() {
                return new BpmnCollaborationData();
            }

            @objid ("9c572b86-d7b9-4ef0-b8c7-fa57fbbbab71")
            public SmObjectImpl createImpl() {
                return new BpmnCollaborationImpl();
            }

        }

        @objid ("003facf0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsClosedSmAttribute extends SmAttribute {
            @objid ("26ff917b-75c4-402e-9deb-67b9db910869")
            public Object getValue(ISmObjectData data) {
                return ((BpmnCollaborationData) data).mIsClosed;
            }

            @objid ("e475a9a2-3d8b-4134-ad36-1a8ca65413d6")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnCollaborationData) data).mIsClosed = value;
            }

        }

        @objid ("00401bcc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MessageFlowSmDependency extends SmMultipleDependency {
            @objid ("c83cc4a3-1e71-4223-a2ff-3607051bf1ad")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCollaborationData)data).mMessageFlow != null)? ((BpmnCollaborationData)data).mMessageFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("ea2c62d3-5189-4108-9cc1-b241a52de004")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCollaborationData) data).mMessageFlow = new ArrayList<>(initialCapacity);
                return ((BpmnCollaborationData) data).mMessageFlow;
            }

            @objid ("95acf96e-90ec-47db-ab2d-2ca83071a639")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.CollaborationDep();
            }

        }

        @objid ("00408c10-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ArtifactSmDependency extends SmMultipleDependency {
            @objid ("4d4e15ea-b4a2-463e-a36c-1e04ce7c113f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCollaborationData)data).mArtifact != null)? ((BpmnCollaborationData)data).mArtifact:SmMultipleDependency.EMPTY;
            }

            @objid ("cdeb31d8-34ba-494a-861a-f7d1e78d43b4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCollaborationData) data).mArtifact = new ArrayList<>(initialCapacity);
                return ((BpmnCollaborationData) data).mArtifact;
            }

            @objid ("02674956-761e-4d2f-9329-0453f41ce865")
            @Override
            public SmDependency getSymetric() {
                return BpmnArtifactData.Metadata.CollaborationDep();
            }

        }

        @objid ("0040fb46-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParticipantsSmDependency extends SmMultipleDependency {
            @objid ("e58d59f3-627e-46b8-adcb-dd49e39c27d7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCollaborationData)data).mParticipants != null)? ((BpmnCollaborationData)data).mParticipants:SmMultipleDependency.EMPTY;
            }

            @objid ("3cbb767d-bcbb-42a9-84e3-7fd8e153c7d3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCollaborationData) data).mParticipants = new ArrayList<>(initialCapacity);
                return ((BpmnCollaborationData) data).mParticipants;
            }

            @objid ("445896a4-e731-43c7-9c82-610fcdc15f08")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.ContainerDep();
            }

        }

    }

}
