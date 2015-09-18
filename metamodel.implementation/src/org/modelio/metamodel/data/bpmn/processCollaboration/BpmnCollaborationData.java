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
    @objid ("15e05e1d-9014-4ce3-a4b6-e0d7842421b1")
    @SmaMetaAttribute(metaName="IsClosed", type=Boolean.class, smAttributeClass=Metadata.IsClosedSmAttribute.class)
     Object mIsClosed = false;

    @objid ("d4ccb5fa-b3e5-493b-a35c-1c64dea2c119")
    @SmaMetaAssociation(metaName="Artifact", typeDataClass=BpmnArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ArtifactSmDependency.class, component = true)
     List<SmObjectImpl> mArtifact = null;

    @objid ("a6057256-52aa-4b56-aa74-60db1d6e36c8")
    @SmaMetaAssociation(metaName="MessageFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.MessageFlowSmDependency.class, component = true)
     List<SmObjectImpl> mMessageFlow = null;

    @objid ("b4f810f8-fd37-4d00-aa60-23224d1e40e3")
    @SmaMetaAssociation(metaName="Participants", typeDataClass=BpmnParticipantData.class, min=0, max=-1, smAssociationClass=Metadata.ParticipantsSmDependency.class, component = true)
     List<SmObjectImpl> mParticipants = null;

    @objid ("e17470c8-06ed-4da2-9e9a-bb8ec11f836c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("003ef3d2-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("9ae15b91-97b8-47de-81eb-c76dddfb5903")
        private static SmClass smClass = null;

        @objid ("f4fc8726-87b1-453d-bf08-f67bcab5aa77")
        private static SmAttribute IsClosedAtt = null;

        @objid ("81fed845-19b4-4cc4-a34d-5f2736aa9adf")
        private static SmDependency ArtifactDep = null;

        @objid ("8cc93ab9-599b-423d-8a4d-91e45bf912a5")
        private static SmDependency MessageFlowDep = null;

        @objid ("71ab19dd-d2f9-452b-bd18-89a12b7ef805")
        private static SmDependency ParticipantsDep = null;

        @objid ("fa2bf46f-ec3a-40a3-b5e8-e811ec5b0ce9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnCollaborationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("55050edf-cb53-4392-a061-40166ca94613")
        public static SmAttribute IsClosedAtt() {
            if (IsClosedAtt == null) {
            	IsClosedAtt = classof().getAttributeDef("IsClosed");
            }
            return IsClosedAtt;
        }

        @objid ("014708fe-28df-4117-8c87-28adecb68dd4")
        public static SmDependency ArtifactDep() {
            if (ArtifactDep == null) {
            	ArtifactDep = classof().getDependencyDef("Artifact");
            }
            return ArtifactDep;
        }

        @objid ("715cbd0f-424d-4972-ac15-97d8d0a8a9e3")
        public static SmDependency MessageFlowDep() {
            if (MessageFlowDep == null) {
            	MessageFlowDep = classof().getDependencyDef("MessageFlow");
            }
            return MessageFlowDep;
        }

        @objid ("be85377f-52b7-448d-aba8-12306ac31270")
        public static SmDependency ParticipantsDep() {
            if (ParticipantsDep == null) {
            	ParticipantsDep = classof().getDependencyDef("Participants");
            }
            return ParticipantsDep;
        }

        @objid ("77cb2ef5-f340-46ca-ae56-ee2f5c6f7707")
        public static SmDependency getArtifactDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArtifactDep;
        }

        @objid ("96579f33-b426-4995-bd1b-43733aca53ca")
        public static SmDependency getMessageFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageFlowDep;
        }

        @objid ("29b5b029-674b-4abb-a4f2-ec11424373e4")
        public static SmDependency getParticipantsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParticipantsDep;
        }

        @objid ("2eaed28c-02d1-4b4b-960b-a46daff0f782")
        public static SmAttribute getIsClosedAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IsClosedAtt;
        }

        @objid ("757a9d3e-20de-4194-8bdf-3986c5489a34")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("003f3f9a-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("efb9d13d-5aba-48d1-903d-01c5f5e561fd")
            public ISmObjectData createData() {
                return new BpmnCollaborationData();
            }

            @objid ("c85a523f-203d-425d-976b-5464f7a0325e")
            public SmObjectImpl createImpl() {
                return new BpmnCollaborationImpl();
            }

        }

        @objid ("003facf0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class IsClosedSmAttribute extends SmAttribute {
            @objid ("d9a919d7-265b-4bc3-b7f6-95a44e00a86d")
            public Object getValue(ISmObjectData data) {
                return ((BpmnCollaborationData) data).mIsClosed;
            }

            @objid ("1fc37385-e684-4cf9-8eff-3883f0f3f898")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnCollaborationData) data).mIsClosed = value;
            }

        }

        @objid ("00401bcc-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MessageFlowSmDependency extends SmMultipleDependency {
            @objid ("32855baf-fe6e-472e-9ccc-9f8221a2aa27")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCollaborationData)data).mMessageFlow != null)? ((BpmnCollaborationData)data).mMessageFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("53b19b8e-29ec-497f-9283-599347ff0ff0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCollaborationData) data).mMessageFlow = new ArrayList<>(initialCapacity);
                return ((BpmnCollaborationData) data).mMessageFlow;
            }

            @objid ("da8a588d-8232-421f-af67-2b7139ffc417")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.CollaborationDep();
            }

        }

        @objid ("00408c10-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ArtifactSmDependency extends SmMultipleDependency {
            @objid ("83461016-09c2-4912-967a-5abd5afc2f3d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCollaborationData)data).mArtifact != null)? ((BpmnCollaborationData)data).mArtifact:SmMultipleDependency.EMPTY;
            }

            @objid ("15d618a8-7af6-4cda-a65e-2db2fe26230c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCollaborationData) data).mArtifact = new ArrayList<>(initialCapacity);
                return ((BpmnCollaborationData) data).mArtifact;
            }

            @objid ("1263dd8e-cb83-4f14-91b1-850743e332db")
            @Override
            public SmDependency getSymetric() {
                return BpmnArtifactData.Metadata.CollaborationDep();
            }

        }

        @objid ("0040fb46-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParticipantsSmDependency extends SmMultipleDependency {
            @objid ("b099f81d-2ad5-4dca-a7e0-51b1503de8f2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnCollaborationData)data).mParticipants != null)? ((BpmnCollaborationData)data).mParticipants:SmMultipleDependency.EMPTY;
            }

            @objid ("1196eb6c-38b9-4558-b8f9-7eccf60f0b8d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnCollaborationData) data).mParticipants = new ArrayList<>(initialCapacity);
                return ((BpmnCollaborationData) data).mParticipants;
            }

            @objid ("774aabcf-ef04-41d0-abbe-ecc57eaf9ea8")
            @Override
            public SmDependency getSymetric() {
                return BpmnParticipantData.Metadata.ContainerDep();
            }

        }

    }

}
