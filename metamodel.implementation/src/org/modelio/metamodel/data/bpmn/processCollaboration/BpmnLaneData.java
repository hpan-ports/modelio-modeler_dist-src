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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneSetData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnLaneImpl;
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

@objid ("0074d240-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnLane.class, factory=BpmnLaneData.Metadata.ObjectFactory.class)
public class BpmnLaneData extends BpmnBaseElementData {
    @objid ("f1ed41ae-f0cc-4301-83a4-9d2c190bd791")
    @SmaMetaAssociation(metaName="ChildLaneSet", typeDataClass=BpmnLaneSetData.class, min=0, max=1, smAssociationClass=Metadata.ChildLaneSetSmDependency.class, component = true)
     SmObjectImpl mChildLaneSet;

    @objid ("f72f87bf-e4ba-4d59-9c2c-a92fdfcf73cc")
    @SmaMetaAssociation(metaName="PartitionElement", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.PartitionElementSmDependency.class, partof = true)
     SmObjectImpl mPartitionElement;

    @objid ("5719cacf-b93f-420c-88da-9b968651d872")
    @SmaMetaAssociation(metaName="FlowElementRef", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.FlowElementRefSmDependency.class, partof = true, istodelete = true)
     List<SmObjectImpl> mFlowElementRef = null;

    @objid ("20caf941-fd79-4a1e-af42-4220beef2e36")
    @SmaMetaAssociation(metaName="LaneSet", typeDataClass=BpmnLaneSetData.class, min=1, max=1, smAssociationClass=Metadata.LaneSetSmDependency.class)
     SmObjectImpl mLaneSet;

    @objid ("a5fcc395-fb26-41bb-8181-5bd84403fb4b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004af650-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("6461c647-a9c0-4e66-8e2b-6c748e610aac")
        private static SmClass smClass = null;

        @objid ("1555d494-001a-4e00-9466-66263e2af340")
        private static SmDependency ChildLaneSetDep = null;

        @objid ("44100516-a7b3-4fe7-b84f-a7812be0b688")
        private static SmDependency PartitionElementDep = null;

        @objid ("84c01640-8d59-4975-b4b9-e61ccae4a253")
        private static SmDependency FlowElementRefDep = null;

        @objid ("5f758cbc-1a00-46a8-8cbe-6914f9912594")
        private static SmDependency LaneSetDep = null;

        @objid ("d38bd3bb-1324-4d42-8c21-23dda9aa69f4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLaneData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("eb6cd3af-2404-4a56-a27c-2a55614cb0b7")
        public static SmDependency ChildLaneSetDep() {
            if (ChildLaneSetDep == null) {
            	ChildLaneSetDep = classof().getDependencyDef("ChildLaneSet");
            }
            return ChildLaneSetDep;
        }

        @objid ("b4dfe9e3-c806-465c-b54d-e9a5d00cd973")
        public static SmDependency PartitionElementDep() {
            if (PartitionElementDep == null) {
            	PartitionElementDep = classof().getDependencyDef("PartitionElement");
            }
            return PartitionElementDep;
        }

        @objid ("7aabc4eb-5e48-4368-a594-a181af41004c")
        public static SmDependency FlowElementRefDep() {
            if (FlowElementRefDep == null) {
            	FlowElementRefDep = classof().getDependencyDef("FlowElementRef");
            }
            return FlowElementRefDep;
        }

        @objid ("907dabed-3857-4c68-a9f6-ac559df378df")
        public static SmDependency LaneSetDep() {
            if (LaneSetDep == null) {
            	LaneSetDep = classof().getDependencyDef("LaneSet");
            }
            return LaneSetDep;
        }

        @objid ("9a438779-11f9-4d6b-9380-d6624ebc371a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c7ecc2d5-a333-42a8-9cfb-1396c0ca8d3a")
        public static SmDependency getChildLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChildLaneSetDep;
        }

        @objid ("f337b627-4e79-4e2a-a95f-27d382c1e196")
        public static SmDependency getLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneSetDep;
        }

        @objid ("686d3dcc-3f17-4d61-9d79-f8e96fff7a87")
        public static SmDependency getPartitionElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PartitionElementDep;
        }

        @objid ("af519c2b-1a53-496d-aed5-7b410bbb830f")
        public static SmDependency getFlowElementRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FlowElementRefDep;
        }

        @objid ("004b3688-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("f4333ba8-da18-4c25-baab-f63f517363ed")
            public ISmObjectData createData() {
                return new BpmnLaneData();
            }

            @objid ("b66f1c52-79a1-4fdf-8342-17adb7e0f7b0")
            public SmObjectImpl createImpl() {
                return new BpmnLaneImpl();
            }

        }

        @objid ("004b97d6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ChildLaneSetSmDependency extends SmSingleDependency {
            @objid ("dbea4195-2b70-4ae6-b1b0-5e71773f20cb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneData) data).mChildLaneSet;
            }

            @objid ("d220ca75-b727-43ea-98d8-e9cb5cef862f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneData) data).mChildLaneSet = value;
            }

            @objid ("7e730617-2e1a-471c-828d-fe935d1c67a2")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.ParentLaneDep();
            }

        }

        @objid ("004c0b30-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PartitionElementSmDependency extends SmSingleDependency {
            @objid ("b2870169-f69c-4d6c-b03c-656e59688215")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneData) data).mPartitionElement;
            }

            @objid ("4de50a6b-77ad-4f96-bbca-43311a15c14c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneData) data).mPartitionElement = value;
            }

            @objid ("ccf7ce4e-cfb9-4424-8323-756bf36677e6")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.BpmnLaneRefsDep();
            }

        }

        @objid ("004c7f0c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FlowElementRefSmDependency extends SmMultipleDependency {
            @objid ("9c30ddcf-e1e0-4353-9ab3-d372003ebf16")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnLaneData)data).mFlowElementRef != null)? ((BpmnLaneData)data).mFlowElementRef:SmMultipleDependency.EMPTY;
            }

            @objid ("5048e22f-fa51-4bb9-b024-7b570af1737a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnLaneData) data).mFlowElementRef = new ArrayList<>(initialCapacity);
                return ((BpmnLaneData) data).mFlowElementRef;
            }

            @objid ("a5a0c9e9-ab02-4c67-81b1-8b3203606f82")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.LaneDep();
            }

        }

        @objid ("004cf220-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LaneSetSmDependency extends SmSingleDependency {
            @objid ("b6f607f1-e82c-4597-af70-6d278819c26d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneData) data).mLaneSet;
            }

            @objid ("a2f0d69e-e665-49c8-8bc0-9501443f9cc9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneData) data).mLaneSet = value;
            }

            @objid ("118d3b27-dee2-43ae-b200-b789da889071")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.LaneDep();
            }

        }

    }

}
