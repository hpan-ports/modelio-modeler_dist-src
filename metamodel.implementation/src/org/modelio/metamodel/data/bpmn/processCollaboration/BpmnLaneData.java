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
    @objid ("344e4c36-2dee-461a-b16e-444aa7a913d2")
    @SmaMetaAssociation(metaName="ChildLaneSet", typeDataClass=BpmnLaneSetData.class, min=0, max=1, smAssociationClass=Metadata.ChildLaneSetSmDependency.class, component = true)
     SmObjectImpl mChildLaneSet;

    @objid ("a9a71f54-22a7-4ce3-8192-7817a5801352")
    @SmaMetaAssociation(metaName="PartitionElement", typeDataClass=ModelElementData.class, min=0, max=1, smAssociationClass=Metadata.PartitionElementSmDependency.class, partof = true)
     SmObjectImpl mPartitionElement;

    @objid ("fb738eb6-bb03-464e-9363-5152e2930171")
    @SmaMetaAssociation(metaName="FlowElementRef", typeDataClass=BpmnFlowElementData.class, min=0, max=-1, smAssociationClass=Metadata.FlowElementRefSmDependency.class, partof = true, istodelete = true)
     List<SmObjectImpl> mFlowElementRef = null;

    @objid ("d1c46508-d6a5-4721-9a0d-479546a90b2c")
    @SmaMetaAssociation(metaName="LaneSet", typeDataClass=BpmnLaneSetData.class, min=1, max=1, smAssociationClass=Metadata.LaneSetSmDependency.class)
     SmObjectImpl mLaneSet;

    @objid ("475495d0-8263-447a-a72b-6d54b4d12dcb")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004af650-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("d075922b-318f-49a7-9aee-36f22a9435b4")
        private static SmClass smClass = null;

        @objid ("4afb843f-ddda-46c2-a509-74f746f1af25")
        private static SmDependency ChildLaneSetDep = null;

        @objid ("95ed4fbf-71f6-477b-8f5e-164d2bfe3ce1")
        private static SmDependency PartitionElementDep = null;

        @objid ("90ec3a71-bb19-4a0e-b984-ccaec6738c49")
        private static SmDependency FlowElementRefDep = null;

        @objid ("418d2465-e81c-4ad9-8cac-03d977589459")
        private static SmDependency LaneSetDep = null;

        @objid ("c7c27f02-ea65-49c0-b889-4ea92e26bbd1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLaneData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1a68387d-e6c2-47ed-abee-e53b02d29db9")
        public static SmDependency ChildLaneSetDep() {
            if (ChildLaneSetDep == null) {
            	ChildLaneSetDep = classof().getDependencyDef("ChildLaneSet");
            }
            return ChildLaneSetDep;
        }

        @objid ("e0cebc92-83ff-4ce7-8837-974440633468")
        public static SmDependency PartitionElementDep() {
            if (PartitionElementDep == null) {
            	PartitionElementDep = classof().getDependencyDef("PartitionElement");
            }
            return PartitionElementDep;
        }

        @objid ("91819167-64fd-4046-8de5-dd0b2ca17043")
        public static SmDependency FlowElementRefDep() {
            if (FlowElementRefDep == null) {
            	FlowElementRefDep = classof().getDependencyDef("FlowElementRef");
            }
            return FlowElementRefDep;
        }

        @objid ("6d9efb13-df9b-4d33-813b-e64edab706d4")
        public static SmDependency LaneSetDep() {
            if (LaneSetDep == null) {
            	LaneSetDep = classof().getDependencyDef("LaneSet");
            }
            return LaneSetDep;
        }

        @objid ("2d52d4f3-7204-41b9-b2c9-3fedb65c2761")
        public static SmDependency getChildLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ChildLaneSetDep;
        }

        @objid ("3ad77aed-0b57-4ca6-8ae9-726b50184b7c")
        public static SmDependency getFlowElementRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FlowElementRefDep;
        }

        @objid ("fde75832-dff2-44ae-8168-313876003518")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("4237a107-a5dc-46b3-b352-1f98b7646eb9")
        public static SmDependency getLaneSetDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneSetDep;
        }

        @objid ("7ad15d8d-2fe5-4cf0-bd8c-60a8a4d3fc3e")
        public static SmDependency getPartitionElementDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PartitionElementDep;
        }

        @objid ("004b3688-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0252fdcc-b7cd-4cdf-8313-a49cdf402d3e")
            public ISmObjectData createData() {
                return new BpmnLaneData();
            }

            @objid ("cabef829-a897-497c-961a-91294dc4f631")
            public SmObjectImpl createImpl() {
                return new BpmnLaneImpl();
            }

        }

        @objid ("004b97d6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ChildLaneSetSmDependency extends SmSingleDependency {
            @objid ("d2d9f409-b0fc-4de8-a3c5-73813ab74168")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneData) data).mChildLaneSet;
            }

            @objid ("023cefea-2312-468e-ad93-16f2cfb0f59d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneData) data).mChildLaneSet = value;
            }

            @objid ("f718473a-fe1d-4706-8986-984f54bcb4c1")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.ParentLaneDep();
            }

        }

        @objid ("004c0b30-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PartitionElementSmDependency extends SmSingleDependency {
            @objid ("d0e5ef46-c2b8-41b2-878d-c83ec52de509")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneData) data).mPartitionElement;
            }

            @objid ("2a4bc4c4-d235-4e76-a29d-1bfded73fef7")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneData) data).mPartitionElement = value;
            }

            @objid ("cd8bddbe-f29f-4511-9210-1795594095e8")
            @Override
            public SmDependency getSymetric() {
                return ModelElementData.Metadata.BpmnLaneRefsDep();
            }

        }

        @objid ("004c7f0c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FlowElementRefSmDependency extends SmMultipleDependency {
            @objid ("595a5043-aa3d-4174-a8d0-8ad10e0f5b83")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnLaneData)data).mFlowElementRef != null)? ((BpmnLaneData)data).mFlowElementRef:SmMultipleDependency.EMPTY;
            }

            @objid ("8bc60df9-6b7d-4cc1-8503-9187e092bd09")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnLaneData) data).mFlowElementRef = new ArrayList<>(initialCapacity);
                return ((BpmnLaneData) data).mFlowElementRef;
            }

            @objid ("bbaef370-f385-41f0-81cf-a88eaa43b10e")
            @Override
            public SmDependency getSymetric() {
                return BpmnFlowElementData.Metadata.LaneDep();
            }

        }

        @objid ("004cf220-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LaneSetSmDependency extends SmSingleDependency {
            @objid ("31f1f569-7648-4810-a843-6c4395c005f2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneData) data).mLaneSet;
            }

            @objid ("317ad70d-788b-4d51-ba17-b39953120a49")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneData) data).mLaneSet = value;
            }

            @objid ("457a7a82-622e-408b-9d9f-54a18453ff20")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneSetData.Metadata.LaneDep();
            }

        }

    }

}
