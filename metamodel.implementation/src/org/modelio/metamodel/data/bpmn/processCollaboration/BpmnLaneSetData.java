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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.data.bpmn.activities.BpmnSubProcessData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnProcessData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.processCollaboration.BpmnLaneSetImpl;
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

@objid ("00754d60-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnLaneSet.class, factory=BpmnLaneSetData.Metadata.ObjectFactory.class)
public class BpmnLaneSetData extends BpmnBaseElementData {
    @objid ("935a899d-f0fa-4d2d-83fc-f11a1157a925")
    @SmaMetaAssociation(metaName="Lane", typeDataClass=BpmnLaneData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSmDependency.class, component = true)
     List<SmObjectImpl> mLane = null;

    @objid ("7ff8e5d4-2329-4789-8af5-35e55b37c0ae")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class)
     SmObjectImpl mProcess;

    @objid ("17f68508-b516-4585-a5b9-1701ed4f00f7")
    @SmaMetaAssociation(metaName="ParentLane", typeDataClass=BpmnLaneData.class, min=0, max=1, smAssociationClass=Metadata.ParentLaneSmDependency.class)
     SmObjectImpl mParentLane;

    @objid ("6b2939cb-d024-458f-a8b8-939ad8878865")
    @SmaMetaAssociation(metaName="SubProcess", typeDataClass=BpmnSubProcessData.class, min=0, max=1, smAssociationClass=Metadata.SubProcessSmDependency.class)
     SmObjectImpl mSubProcess;

    @objid ("4205470b-629a-402c-a308-f4aa5fdfdbfa")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002eed70-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a4173221-45ce-4da7-9557-ea3913749c7f")
        private static SmClass smClass = null;

        @objid ("01a48855-cfc9-4376-af99-6a2e654362d2")
        private static SmDependency LaneDep = null;

        @objid ("d1e8d6dc-2120-4381-86af-184bdbc0de98")
        private static SmDependency ProcessDep = null;

        @objid ("22bb2aa5-6bc7-4db4-a241-1fe1d359ed5e")
        private static SmDependency ParentLaneDep = null;

        @objid ("6fdf6571-9c2a-4dc8-82cf-f86aadbb7500")
        private static SmDependency SubProcessDep = null;

        @objid ("f5532312-fd72-49fc-98f7-b97dc0ff2b60")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLaneSetData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d2125837-faf4-4dd0-9d3f-cba64ec5c3a2")
        public static SmDependency LaneDep() {
            if (LaneDep == null) {
            	LaneDep = classof().getDependencyDef("Lane");
            }
            return LaneDep;
        }

        @objid ("9103cdd1-32f9-4e8c-a3ff-2945a5adfcdc")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("3ea8457f-c5ee-40c1-b7cf-e35a3b54cbd8")
        public static SmDependency ParentLaneDep() {
            if (ParentLaneDep == null) {
            	ParentLaneDep = classof().getDependencyDef("ParentLane");
            }
            return ParentLaneDep;
        }

        @objid ("8845ed46-611a-4fd0-acc5-e0fc2f0d9b10")
        public static SmDependency SubProcessDep() {
            if (SubProcessDep == null) {
            	SubProcessDep = classof().getDependencyDef("SubProcess");
            }
            return SubProcessDep;
        }

        @objid ("8f177bd2-5b06-47b5-ad67-82dca24cdcc7")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("07339942-0153-4f22-b835-1114944d4d65")
        public static SmDependency getLaneDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneDep;
        }

        @objid ("2c28ff5a-aae1-4d6a-b259-e344a504c267")
        public static SmDependency getParentLaneDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentLaneDep;
        }

        @objid ("74cdd9be-e584-451d-9b98-d1320a0f2f94")
        public static SmDependency getSubProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubProcessDep;
        }

        @objid ("b0098e1d-d069-413c-bb4b-ee186a65e525")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("002f4270-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2add37ae-b377-436e-8bce-fc6dfa4a3e27")
            public ISmObjectData createData() {
                return new BpmnLaneSetData();
            }

            @objid ("e72a606b-c45b-4762-849d-f96ea1217c4d")
            public SmObjectImpl createImpl() {
                return new BpmnLaneSetImpl();
            }

        }

        @objid ("002fbb24-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LaneSmDependency extends SmMultipleDependency {
            @objid ("249fbf13-e9f9-417a-9e6e-e435847a8f02")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnLaneSetData)data).mLane != null)? ((BpmnLaneSetData)data).mLane:SmMultipleDependency.EMPTY;
            }

            @objid ("cd588518-b62e-4a8c-ad63-3249a879a8da")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnLaneSetData) data).mLane = new ArrayList<>(initialCapacity);
                return ((BpmnLaneSetData) data).mLane;
            }

            @objid ("685d3cc5-5024-41df-84b3-5910b1db097d")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.LaneSetDep();
            }

        }

        @objid ("00302f32-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("a6e67c73-71ce-4ce3-8a6f-be921fefd847")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneSetData) data).mProcess;
            }

            @objid ("19b551c0-875b-4d1c-85ee-69957b6298b9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneSetData) data).mProcess = value;
            }

            @objid ("6d425b3c-798c-4b81-9320-8c28ca1f3d52")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.LaneSetDep();
            }

        }

        @objid ("0030b09c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParentLaneSmDependency extends SmSingleDependency {
            @objid ("f63a5ad9-11cf-4710-ab56-4f87f300d5cf")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneSetData) data).mParentLane;
            }

            @objid ("37f956cf-a244-4420-b7c1-e79e02f4f28e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneSetData) data).mParentLane = value;
            }

            @objid ("c1c1f36b-1ec2-4a66-b612-8fedea54b10a")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.ChildLaneSetDep();
            }

        }

        @objid ("00313526-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SubProcessSmDependency extends SmSingleDependency {
            @objid ("7e4fb51f-4b24-4055-aa31-2f09ab9342ae")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneSetData) data).mSubProcess;
            }

            @objid ("cecc8401-b9f3-48e9-ab70-6c04dfe5218f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneSetData) data).mSubProcess = value;
            }

            @objid ("77935fb4-d56d-4a66-8e77-0bcafd2f1d77")
            @Override
            public SmDependency getSymetric() {
                return BpmnSubProcessData.Metadata.LaneSetDep();
            }

        }

    }

}
