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
    @objid ("25cc812c-eab5-40e5-b30e-8601042df8d4")
    @SmaMetaAttribute(metaName="TriggeredByEvent", type=Boolean.class, smAttributeClass=Metadata.TriggeredByEventSmAttribute.class)
     Object mTriggeredByEvent = false;

    @objid ("a1ee43db-680c-41ba-b6b5-386f2a135da8")
    @SmaMetaAssociation(metaName="Artifact", typeDataClass=BpmnArtifactData.class, min=0, max=-1, smAssociationClass=Metadata.ArtifactSmDependency.class, component = true)
     List<SmObjectImpl> mArtifact = null;

    @objid ("e8d1eae4-b07d-429e-a97d-32c04ca17650")
    @SmaMetaAssociation(metaName="FlowElement", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.FlowElementSmDependency.class, component = true)
     List<SmObjectImpl> mFlowElement = null;

    @objid ("7dd91463-2182-41dc-98bd-e8ea34735932")
    @SmaMetaAssociation(metaName="LaneSet", typeDataClass=BpmnLaneSetData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSetSmDependency.class, component = true)
     List<SmObjectImpl> mLaneSet = null;

    @objid ("88429ef0-e90e-4ab0-9e8b-6a24b523d5ab")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("005454b6-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("82c634cd-d68c-4791-8e74-7d64c43e88ba")
        private static SmClass smClass = null;

        @objid ("811ddd26-6580-4c7a-8dee-44da1ae7e865")
        private static SmAttribute TriggeredByEventAtt = null;

        @objid ("aeee882c-6c3d-409b-813d-64ba708ef1ae")
        private static SmDependency ArtifactDep = null;

        @objid ("6d0282fb-bd72-4439-82c6-33e3799d739b")
        private static SmDependency FlowElementDep = null;

        @objid ("2f06207a-8eb7-4827-a8d5-856917ec1d7a")
        private static SmDependency LaneSetDep = null;

        @objid ("86479aae-6832-40d8-b32c-7157acddb3fb")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSubProcessData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("82b438aa-50a4-4d30-a6ee-7d96b35c6928")
        public static SmAttribute TriggeredByEventAtt() {
            if (TriggeredByEventAtt == null) {
            	TriggeredByEventAtt = classof().getAttributeDef("TriggeredByEvent");
            }
            return TriggeredByEventAtt;
        }

        @objid ("388815d1-35af-450f-99c9-01412ff8a0e4")
        public static SmDependency ArtifactDep() {
            if (ArtifactDep == null) {
            	ArtifactDep = classof().getDependencyDef("Artifact");
            }
            return ArtifactDep;
        }

        @objid ("fca94fe9-1055-431a-ab4a-f3ab7e31ebe1")
        public static SmDependency FlowElementDep() {
            if (FlowElementDep == null) {
            	FlowElementDep = classof().getDependencyDef("FlowElement");
            }
            return FlowElementDep;
        }

        @objid ("0d257c14-389e-4485-9517-6d2ccbb05043")
        public static SmDependency LaneSetDep() {
            if (LaneSetDep == null) {
            	LaneSetDep = classof().getDependencyDef("LaneSet");
            }
            return LaneSetDep;
        }

        @objid ("f4b6eb80-7876-46d5-b707-a280bb1adc96")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("9ab85739-33fb-4792-8b2c-54332586f422")
        public static SmDependency getFlowElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FlowElementDep;
        }

        @objid ("d235df3d-fdb3-440e-ac1a-f720536239b7")
        public static SmAttribute getTriggeredByEventAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TriggeredByEventAtt;
        }

        @objid ("62ceea5e-788e-4282-9070-973c24368de1")
        public static SmDependency getLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneSetDep;
        }

        @objid ("9e84c1be-5fa4-413e-abbb-53f96f630907")
        public static SmDependency getArtifactDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ArtifactDep;
        }

        @objid ("005496e2-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c8ad166f-2608-4958-9793-941184f34439")
            public ISmObjectData createData() {
                return new BpmnSubProcessData();
            }

            @objid ("d5355f2a-9528-4daf-8bbf-211f293c42a9")
            public SmObjectImpl createImpl() {
                return new BpmnSubProcessImpl();
            }

        }

        @objid ("0054f862-c4c2-1fd8-97fe-001ec947cd2a")
        public static class TriggeredByEventSmAttribute extends SmAttribute {
            @objid ("8bd1e727-e791-48bd-83df-30f0f6162cd5")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSubProcessData) data).mTriggeredByEvent;
            }

            @objid ("61b35496-8dbc-4644-a6cc-58463833c0a4")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSubProcessData) data).mTriggeredByEvent = value;
            }

        }

        @objid ("00555ab4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class FlowElementSmDependency extends SmMultipleDependency {
            @objid ("fbf5760a-5721-43f5-a3d6-19bd43d841fe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSubProcessData)data).mFlowElement != null)? ((BpmnSubProcessData)data).mFlowElement:SmMultipleDependency.EMPTY;
            }

            @objid ("4e38250a-10e4-4ed0-8b01-de3a986ead1d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSubProcessData) data).mFlowElement = new ArrayList<>(initialCapacity);
                return ((BpmnSubProcessData) data).mFlowElement;
            }

            @objid ("15fc0945-6eb9-4d93-b3d8-0546087c241a")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.SubProcessDep();
            }

        }

        @objid ("0055c292-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ArtifactSmDependency extends SmMultipleDependency {
            @objid ("e3bd1cd7-c5be-496b-86f9-605fea7036dd")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSubProcessData)data).mArtifact != null)? ((BpmnSubProcessData)data).mArtifact:SmMultipleDependency.EMPTY;
            }

            @objid ("67251882-eb70-46a8-9627-0a265bff8b03")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSubProcessData) data).mArtifact = new ArrayList<>(initialCapacity);
                return ((BpmnSubProcessData) data).mArtifact;
            }

            @objid ("2b3adc29-5122-465d-a2dd-636243cc5de1")
            @Override
            public SmDependency getSymetric() {
                return BpmnArtifactData.Metadata.SubProcessDep();
            }

        }

        @objid ("00562660-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LaneSetSmDependency extends SmMultipleDependency {
            @objid ("c4490dcf-0245-48bd-8a13-c4eaa8932935")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnSubProcessData)data).mLaneSet != null)? ((BpmnSubProcessData)data).mLaneSet:SmMultipleDependency.EMPTY;
            }

            @objid ("27d4e5f9-2939-4af7-ac64-aa994bf46967")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnSubProcessData) data).mLaneSet = new ArrayList<>(initialCapacity);
                return ((BpmnSubProcessData) data).mLaneSet;
            }

            @objid ("5f037e76-86ba-4ceb-beac-9a24f83dfb98")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.SubProcessDep();
            }

        }

    }

}
