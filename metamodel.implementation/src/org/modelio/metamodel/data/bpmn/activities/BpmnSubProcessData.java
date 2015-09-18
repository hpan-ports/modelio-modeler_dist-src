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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneSetData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnArtifactData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnSubProcessImpl;
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

@objid ("008489ba-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnSubProcess.class, factory=BpmnSubProcessData.Metadata.ObjectFactory.class)
public class BpmnSubProcessData extends BpmnActivityData {
    @objid ("6cd77004-6434-42f7-892c-5c5050282e76")
    @SmaMetaAttribute(metaName="TriggeredByEvent", type=Boolean.class, smAttributeClass=Metadata.TriggeredByEventSmAttribute.class)
     Object mTriggeredByEvent = false;

    @objid ("41290c8d-14e1-4eb2-bf2f-338a3da6b381")
    @SmaMetaAssociation(metaName="Artifact", typeDataClass=BpmnArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ArtifactSmDependency.class, component = true)
     List<SmObjectImpl> mArtifact = null;

    @objid ("c06660d7-856d-4f67-ae58-d75d5aedcdd0")
    @SmaMetaAssociation(metaName="FlowElement", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.FlowElementSmDependency.class, component = true)
     List<SmObjectImpl> mFlowElement = null;

    @objid ("e7eae7ec-91ba-4e63-9c91-586a918d2b25")
    @SmaMetaAssociation(metaName="LaneSet", typeDataClass=BpmnLaneSetData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSetSmDependency.class, component = true)
     List<SmObjectImpl> mLaneSet = null;

    @objid ("98557702-f27f-401f-86ed-4a8b45590b62")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005454b6-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d6411c90-5889-46f0-b9dd-d33d155605b7")
        private static SmClass smClass = null;

        @objid ("7bb66b1c-8b72-4afb-9354-956180b8bea8")
        private static SmAttribute TriggeredByEventAtt = null;

        @objid ("e4f91582-e134-4167-b0ec-1f24be30f6ef")
        private static SmDependency ArtifactDep = null;

        @objid ("be8750be-4e58-473e-ab0e-6e332e7b494b")
        private static SmDependency FlowElementDep = null;

        @objid ("3f3d2b29-458a-45af-9629-298197955826")
        private static SmDependency LaneSetDep = null;

        @objid ("5b8ae571-f2de-4e3a-bc59-3bbeb12832e6")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSubProcessData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("fdb2d593-a1d3-4d88-9486-5467b4db83d8")
        public static SmAttribute TriggeredByEventAtt() {
            if (TriggeredByEventAtt == null) {
            	TriggeredByEventAtt = classof().getAttributeDef("TriggeredByEvent");
            }
            return TriggeredByEventAtt;
        }

        @objid ("e9139a09-1720-4c6e-a75f-9d2abfd1f2bf")
        public static SmDependency ArtifactDep() {
            if (ArtifactDep == null) {
            	ArtifactDep = classof().getDependencyDef("Artifact");
            }
            return ArtifactDep;
        }

        @objid ("7711be6d-02bb-4372-a8e8-6e08b60f81ec")
        public static SmDependency FlowElementDep() {
            if (FlowElementDep == null) {
            	FlowElementDep = classof().getDependencyDef("FlowElement");
            }
            return FlowElementDep;
        }

        @objid ("c38ae5c0-2d9d-411d-90ed-bafee95c3158")
        public static SmDependency LaneSetDep() {
            if (LaneSetDep == null) {
            	LaneSetDep = classof().getDependencyDef("LaneSet");
            }
            return LaneSetDep;
        }

        @objid ("2f09f1a2-a226-4f85-ba2e-efd5bbe495c3")
        public static SmDependency getLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneSetDep;
        }

        @objid ("c887d425-6ad7-47f9-ba65-15cff3a062bf")
        public static SmAttribute getTriggeredByEventAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TriggeredByEventAtt;
        }

        @objid ("65fdcffe-0395-4e4a-990c-8bde45e6844f")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6995fada-4cb2-40e3-9bd9-cac7353f4c82")
        public static SmDependency getArtifactDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArtifactDep;
        }

        @objid ("bba376ff-fddf-4768-a3d8-b85ff7714513")
        public static SmDependency getFlowElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FlowElementDep;
        }

        @objid ("005496e2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("291680cf-fa6c-4dfe-bf97-e37c86ded82f")
            public ISmObjectData createData() {
                return new BpmnSubProcessData();
            }

            @objid ("e12bf13a-ecc7-41a8-9d4d-3009b62052ae")
            public SmObjectImpl createImpl() {
                return new BpmnSubProcessImpl();
            }

        }

        @objid ("0054f862-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TriggeredByEventSmAttribute extends SmAttribute {
            @objid ("1ac4cc2b-7a44-4739-aee9-5c4fd0688d09")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSubProcessData) data).mTriggeredByEvent;
            }

            @objid ("f918df4e-9664-45fe-ba1d-efe1268bb552")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSubProcessData) data).mTriggeredByEvent = value;
            }

        }

        @objid ("00555ab4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class FlowElementSmDependency extends SmMultipleDependency {
            @objid ("24356fa6-ead0-4275-a463-cf97e7afe491")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSubProcessData)data).mFlowElement != null)? ((BpmnSubProcessData)data).mFlowElement:SmMultipleDependency.EMPTY;
            }

            @objid ("acfa07f7-c5da-4541-aacf-fd7b6f3f90cb")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSubProcessData) data).mFlowElement = new ArrayList<>(initialCapacity);
                return ((BpmnSubProcessData) data).mFlowElement;
            }

            @objid ("4a26275b-be45-4d42-ab0a-3d1364412764")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.SubProcessDep();
            }

        }

        @objid ("0055c292-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ArtifactSmDependency extends SmMultipleDependency {
            @objid ("6fb6cf2e-e9cf-41d7-a36c-d8998d8317ee")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSubProcessData)data).mArtifact != null)? ((BpmnSubProcessData)data).mArtifact:SmMultipleDependency.EMPTY;
            }

            @objid ("ef782f07-8fb2-443a-a886-9145888b3a0c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSubProcessData) data).mArtifact = new ArrayList<>(initialCapacity);
                return ((BpmnSubProcessData) data).mArtifact;
            }

            @objid ("b7f25496-1a49-4d56-8683-9f2faec87c5e")
            @Override
            public SmDependency getSymetric() {
                return BpmnArtifactData.Metadata.SubProcessDep();
            }

        }

        @objid ("00562660-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LaneSetSmDependency extends SmMultipleDependency {
            @objid ("18818142-5cda-46a9-9e3c-ceb43d48b45d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSubProcessData)data).mLaneSet != null)? ((BpmnSubProcessData)data).mLaneSet:SmMultipleDependency.EMPTY;
            }

            @objid ("77f8a2bc-9386-45ed-b215-d46d1140e89f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSubProcessData) data).mLaneSet = new ArrayList<>(initialCapacity);
                return ((BpmnSubProcessData) data).mLaneSet;
            }

            @objid ("48678618-b69d-4b2f-93fd-2b11333a9bd6")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.SubProcessDep();
            }

        }

    }

}
