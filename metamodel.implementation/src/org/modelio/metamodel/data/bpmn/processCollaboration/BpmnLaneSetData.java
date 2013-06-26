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
    @objid ("9afdd074-d6d9-4ce5-8bd5-f967eda90352")
    @SmaMetaAssociation(metaName="Lane", typeDataClass=BpmnLaneData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSmDependency.class, component = true)
     List<SmObjectImpl> mLane = null;

    @objid ("2c3b33b0-828f-463f-8103-dba3e4b347f2")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class)
     SmObjectImpl mProcess;

    @objid ("e9351040-23ce-4513-b33e-f66359827d8e")
    @SmaMetaAssociation(metaName="ParentLane", typeDataClass=BpmnLaneData.class, min=0, max=1, smAssociationClass=Metadata.ParentLaneSmDependency.class)
     SmObjectImpl mParentLane;

    @objid ("e4d3ad40-e93a-4dc4-a0a7-b42e42d0497d")
    @SmaMetaAssociation(metaName="SubProcess", typeDataClass=BpmnSubProcessData.class, min=0, max=1, smAssociationClass=Metadata.SubProcessSmDependency.class)
     SmObjectImpl mSubProcess;

    @objid ("f07a679c-46a9-46e3-89ef-c3b68cb27f1b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002eed70-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f27d0191-2c7a-4f34-8e42-d6693a9bc8c5")
        private static SmClass smClass = null;

        @objid ("36cca8e8-8d0d-46a8-8e91-83023330ecb3")
        private static SmDependency LaneDep = null;

        @objid ("a19fd89a-486d-4409-8da8-88d846f00341")
        private static SmDependency ProcessDep = null;

        @objid ("8f4347b6-9d48-436f-a0a2-d40fe7c22376")
        private static SmDependency ParentLaneDep = null;

        @objid ("47b27aef-9912-403b-a279-38f7aa7994e2")
        private static SmDependency SubProcessDep = null;

        @objid ("f2767fea-5d0b-4f6c-bcf4-7a945d078dbe")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLaneSetData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("4e77b867-44c9-4c57-b72c-601486b1ca86")
        public static SmDependency LaneDep() {
            if (LaneDep == null) {
            	LaneDep = classof().getDependencyDef("Lane");
            }
            return LaneDep;
        }

        @objid ("4c8d9ccb-fab6-4167-ab69-7767946e34ab")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("70ea745c-6752-4f36-8a28-3114da083951")
        public static SmDependency ParentLaneDep() {
            if (ParentLaneDep == null) {
            	ParentLaneDep = classof().getDependencyDef("ParentLane");
            }
            return ParentLaneDep;
        }

        @objid ("1fd07cf4-bd3e-4c12-885f-3f193dbcd8f0")
        public static SmDependency SubProcessDep() {
            if (SubProcessDep == null) {
            	SubProcessDep = classof().getDependencyDef("SubProcess");
            }
            return SubProcessDep;
        }

        @objid ("902326a7-4fdc-427b-a499-605d62fc2895")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("1c1fe609-4f47-4535-83d7-4bfb18408834")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("4b67ec7d-7ba9-456e-8978-c63a66c517ea")
        public static SmDependency getParentLaneDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentLaneDep;
        }

        @objid ("a4c35399-2e06-4728-815d-df8d1d0c7703")
        public static SmDependency getSubProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubProcessDep;
        }

        @objid ("b59ecc16-2183-48ff-bd05-88b2156b224b")
        public static SmDependency getLaneDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneDep;
        }

        @objid ("002f4270-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c2ec2160-b2dd-4c9a-af27-8755b7f95dcd")
            public ISmObjectData createData() {
                return new BpmnLaneSetData();
            }

            @objid ("d18e7886-6117-4263-9c1f-ee23b53b8180")
            public SmObjectImpl createImpl() {
                return new BpmnLaneSetImpl();
            }

        }

        @objid ("002fbb24-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LaneSmDependency extends SmMultipleDependency {
            @objid ("7c053ec7-37d3-4ec2-a1f2-e71583a25525")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnLaneSetData)data).mLane != null)? ((BpmnLaneSetData)data).mLane:SmMultipleDependency.EMPTY;
            }

            @objid ("cac67368-1563-4ffd-8910-aacfd1d4489c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnLaneSetData) data).mLane = new ArrayList<>(initialCapacity);
                return ((BpmnLaneSetData) data).mLane;
            }

            @objid ("10e498a5-43cf-4a6f-9807-c6fd7cdae7e4")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.LaneSetDep();
            }

        }

        @objid ("00302f32-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("c0dfd359-bd66-41e2-bca0-349ed5b66800")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneSetData) data).mProcess;
            }

            @objid ("88ca1d72-e9bb-4729-a321-5615da1d1232")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneSetData) data).mProcess = value;
            }

            @objid ("0555ddd1-e7ab-4c5d-80aa-082c7872b19a")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.LaneSetDep();
            }

        }

        @objid ("0030b09c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParentLaneSmDependency extends SmSingleDependency {
            @objid ("5cf1074f-c1bb-4e2c-9e02-485af0d4f062")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneSetData) data).mParentLane;
            }

            @objid ("16f82f78-eef5-4b41-bfbe-fe04d61fdbdb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneSetData) data).mParentLane = value;
            }

            @objid ("d6f5815f-0921-40d8-b1a4-8c55f0147876")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.ChildLaneSetDep();
            }

        }

        @objid ("00313526-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SubProcessSmDependency extends SmSingleDependency {
            @objid ("44fb5add-1360-4b8a-beeb-ffb8aa4fb9c5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneSetData) data).mSubProcess;
            }

            @objid ("7e6c4f5b-969b-4a84-a415-2dc325ff1029")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneSetData) data).mSubProcess = value;
            }

            @objid ("5b92904b-fcba-4450-856a-0c26537c2bcf")
            @Override
            public SmDependency getSymetric() {
                return BpmnSubProcessData.Metadata.LaneSetDep();
            }

        }

    }

}
