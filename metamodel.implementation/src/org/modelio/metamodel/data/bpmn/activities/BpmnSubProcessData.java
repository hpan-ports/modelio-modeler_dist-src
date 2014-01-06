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
    @objid ("d917cf22-83e6-4501-b3c6-acb1825cbcd6")
    @SmaMetaAttribute(metaName="TriggeredByEvent", type=Boolean.class, smAttributeClass=Metadata.TriggeredByEventSmAttribute.class)
     Object mTriggeredByEvent = false;

    @objid ("e02d2640-6aa3-43cb-97c8-3c467916e662")
    @SmaMetaAssociation(metaName="Artifact", typeDataClass=BpmnArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ArtifactSmDependency.class, component = true)
     List<SmObjectImpl> mArtifact = null;

    @objid ("88796e63-f16c-4c60-906d-18cfcd255afe")
    @SmaMetaAssociation(metaName="FlowElement", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.FlowElementSmDependency.class, component = true)
     List<SmObjectImpl> mFlowElement = null;

    @objid ("6eb85e48-40c8-4a59-81c7-ca6e737dc110")
    @SmaMetaAssociation(metaName="LaneSet", typeDataClass=BpmnLaneSetData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSetSmDependency.class, component = true)
     List<SmObjectImpl> mLaneSet = null;

    @objid ("942f17ee-be3d-46d7-b377-0de70a8a7a21")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005454b6-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("c2a1bccc-8952-48d1-9f58-c2b2f3340300")
        private static SmClass smClass = null;

        @objid ("bdb378ec-ecc3-4a43-8ee8-06861a69317a")
        private static SmAttribute TriggeredByEventAtt = null;

        @objid ("d6345620-a601-40a5-81c7-fac41c9f1201")
        private static SmDependency ArtifactDep = null;

        @objid ("f43dd915-81c3-458d-bbcc-e00bf1f7107a")
        private static SmDependency FlowElementDep = null;

        @objid ("86310969-58c9-4172-93b5-f968023b40ab")
        private static SmDependency LaneSetDep = null;

        @objid ("12c2d4fb-8553-418b-b443-ccdb1ab21d89")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSubProcessData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a75833d0-7d9e-4a2b-91bd-94db7d805e91")
        public static SmAttribute TriggeredByEventAtt() {
            if (TriggeredByEventAtt == null) {
            	TriggeredByEventAtt = classof().getAttributeDef("TriggeredByEvent");
            }
            return TriggeredByEventAtt;
        }

        @objid ("13eed0dd-3037-4c81-b8d8-c2043b42d811")
        public static SmDependency ArtifactDep() {
            if (ArtifactDep == null) {
            	ArtifactDep = classof().getDependencyDef("Artifact");
            }
            return ArtifactDep;
        }

        @objid ("4a8bfa5a-5c9e-414b-a501-fbbd70c7f70b")
        public static SmDependency FlowElementDep() {
            if (FlowElementDep == null) {
            	FlowElementDep = classof().getDependencyDef("FlowElement");
            }
            return FlowElementDep;
        }

        @objid ("6502c251-9898-448d-87b0-e173e3e5df8e")
        public static SmDependency LaneSetDep() {
            if (LaneSetDep == null) {
            	LaneSetDep = classof().getDependencyDef("LaneSet");
            }
            return LaneSetDep;
        }

        @objid ("787ee32c-177b-4708-8159-aac68aece36e")
        public static SmDependency getArtifactDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArtifactDep;
        }

        @objid ("44f6b4f2-a9d3-4ca1-8eab-686b9c9593dd")
        public static SmAttribute getTriggeredByEventAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TriggeredByEventAtt;
        }

        @objid ("7527c11d-4d71-4d4d-828b-7d118e43be30")
        public static SmDependency getFlowElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FlowElementDep;
        }

        @objid ("d9be2bcd-f490-4a0e-8b73-1e35254fadf7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e78716c8-5864-4cb7-9817-37b4ede15b26")
        public static SmDependency getLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneSetDep;
        }

        @objid ("005496e2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f32b5e39-2ba6-4a46-9202-be54f169f69a")
            public ISmObjectData createData() {
                return new BpmnSubProcessData();
            }

            @objid ("16dc502c-2611-4f09-99d5-822b64c20add")
            public SmObjectImpl createImpl() {
                return new BpmnSubProcessImpl();
            }

        }

        @objid ("0054f862-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TriggeredByEventSmAttribute extends SmAttribute {
            @objid ("26a26450-b344-41de-b087-0b94c5ed5c1e")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSubProcessData) data).mTriggeredByEvent;
            }

            @objid ("38ff1ab1-d600-4486-ab54-8994fe01e0a3")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSubProcessData) data).mTriggeredByEvent = value;
            }

        }

        @objid ("00555ab4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class FlowElementSmDependency extends SmMultipleDependency {
            @objid ("da62dead-b179-47c4-9f56-45bf3307e6c9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSubProcessData)data).mFlowElement != null)? ((BpmnSubProcessData)data).mFlowElement:SmMultipleDependency.EMPTY;
            }

            @objid ("d77b0589-d373-450b-8476-73c7a6253636")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSubProcessData) data).mFlowElement = new ArrayList<>(initialCapacity);
                return ((BpmnSubProcessData) data).mFlowElement;
            }

            @objid ("886830d5-2d0f-4176-9aee-fca1497a854f")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.SubProcessDep();
            }

        }

        @objid ("0055c292-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ArtifactSmDependency extends SmMultipleDependency {
            @objid ("7e295627-6081-4070-b099-3b3e5f4ccb49")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSubProcessData)data).mArtifact != null)? ((BpmnSubProcessData)data).mArtifact:SmMultipleDependency.EMPTY;
            }

            @objid ("c9d773d7-69ed-4fbb-b6f6-874b29b253dc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSubProcessData) data).mArtifact = new ArrayList<>(initialCapacity);
                return ((BpmnSubProcessData) data).mArtifact;
            }

            @objid ("73146a8b-74f5-4083-9520-026023a95a5c")
            @Override
            public SmDependency getSymetric() {
                return BpmnArtifactData.Metadata.SubProcessDep();
            }

        }

        @objid ("00562660-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LaneSetSmDependency extends SmMultipleDependency {
            @objid ("91cc3871-09a3-4ae2-aece-e4621b603c26")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSubProcessData)data).mLaneSet != null)? ((BpmnSubProcessData)data).mLaneSet:SmMultipleDependency.EMPTY;
            }

            @objid ("6821940a-6c6d-4039-9086-fbca0b4ae6a7")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSubProcessData) data).mLaneSet = new ArrayList<>(initialCapacity);
                return ((BpmnSubProcessData) data).mLaneSet;
            }

            @objid ("4b6ddd65-8491-48a6-ab94-6e171d6b6b0a")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.SubProcessDep();
            }

        }

    }

}
