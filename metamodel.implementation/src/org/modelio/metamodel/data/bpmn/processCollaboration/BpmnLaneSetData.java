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
    @objid ("0264f7ef-f9a1-4aae-a678-1c514f60e6fd")
    @SmaMetaAssociation(metaName="Lane", typeDataClass=BpmnLaneData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSmDependency.class, component = true)
     List<SmObjectImpl> mLane = null;

    @objid ("fa925a5a-245c-4d94-81c9-75c13d442676")
    @SmaMetaAssociation(metaName="Process", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ProcessSmDependency.class)
     SmObjectImpl mProcess;

    @objid ("95a596e6-e38b-490a-9cd8-dc0651689eab")
    @SmaMetaAssociation(metaName="ParentLane", typeDataClass=BpmnLaneData.class, min=0, max=1, smAssociationClass=Metadata.ParentLaneSmDependency.class)
     SmObjectImpl mParentLane;

    @objid ("532dcfb6-4da0-44cc-a024-7e7a8c8b9524")
    @SmaMetaAssociation(metaName="SubProcess", typeDataClass=BpmnSubProcessData.class, min=0, max=1, smAssociationClass=Metadata.SubProcessSmDependency.class)
     SmObjectImpl mSubProcess;

    @objid ("c9d306e7-176b-4dfe-b639-71ebb1c44894")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("002eed70-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("8bb2b86d-5fb6-473f-9bc1-a39b0685fe3b")
        private static SmClass smClass = null;

        @objid ("f257212f-3e75-4e93-86eb-21b6d645638d")
        private static SmDependency LaneDep = null;

        @objid ("d355012d-ae80-4b7e-a705-0795f12311f1")
        private static SmDependency ProcessDep = null;

        @objid ("6e6a17de-7411-4d9d-8f02-3657c119ad40")
        private static SmDependency ParentLaneDep = null;

        @objid ("9dad31bc-3fe0-4ea8-bdbe-83080a179dee")
        private static SmDependency SubProcessDep = null;

        @objid ("f797a26f-ef60-42f3-af37-d4d84cd36188")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnLaneSetData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5995c94b-116f-4529-b768-da417471e637")
        public static SmDependency LaneDep() {
            if (LaneDep == null) {
            	LaneDep = classof().getDependencyDef("Lane");
            }
            return LaneDep;
        }

        @objid ("5cfdc9f7-8898-437a-acfb-fcde7619638b")
        public static SmDependency ProcessDep() {
            if (ProcessDep == null) {
            	ProcessDep = classof().getDependencyDef("Process");
            }
            return ProcessDep;
        }

        @objid ("ffe6eca9-0a58-4663-82a0-81aa3826c071")
        public static SmDependency ParentLaneDep() {
            if (ParentLaneDep == null) {
            	ParentLaneDep = classof().getDependencyDef("ParentLane");
            }
            return ParentLaneDep;
        }

        @objid ("ae2a0f48-4fd2-4ee0-8dd3-23f2632ee8c4")
        public static SmDependency SubProcessDep() {
            if (SubProcessDep == null) {
            	SubProcessDep = classof().getDependencyDef("SubProcess");
            }
            return SubProcessDep;
        }

        @objid ("6971d06a-b960-4a67-987e-1db2df9a4afb")
        public static SmDependency getParentLaneDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ParentLaneDep;
        }

        @objid ("bc772008-d074-4a48-96d5-c9fca3d6aa52")
        public static SmDependency getProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ProcessDep;
        }

        @objid ("c803e96a-6e68-4692-a92a-d2f3e98d4704")
        public static SmDependency getSubProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubProcessDep;
        }

        @objid ("9e5e7dfa-a8a5-418d-8664-033086358616")
        public static SmDependency getLaneDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneDep;
        }

        @objid ("755b202b-960f-4457-aa94-2ffcc06e9e71")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("002f4270-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("12a3a054-c1e9-4cda-aef0-caf536e3bb28")
            public ISmObjectData createData() {
                return new BpmnLaneSetData();
            }

            @objid ("7b8b1e67-5f89-4662-98c2-6bd303e50cd1")
            public SmObjectImpl createImpl() {
                return new BpmnLaneSetImpl();
            }

        }

        @objid ("002fbb24-c4c2-1fd8-97fe-001ec947cd2a")
        public static class LaneSmDependency extends SmMultipleDependency {
            @objid ("7a1e03ba-3709-4227-ab56-a69668da0bf0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnLaneSetData)data).mLane != null)? ((BpmnLaneSetData)data).mLane:SmMultipleDependency.EMPTY;
            }

            @objid ("9975957e-1b0f-46ff-9e38-e68fed410a69")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnLaneSetData) data).mLane = new ArrayList<>(initialCapacity);
                return ((BpmnLaneSetData) data).mLane;
            }

            @objid ("291a0a22-2362-4c5c-a3cc-81076c30f74b")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.LaneSetDep();
            }

        }

        @objid ("00302f32-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ProcessSmDependency extends SmSingleDependency {
            @objid ("5885b738-4ae4-4310-b957-481f11abae7d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneSetData) data).mProcess;
            }

            @objid ("f117a8bc-bf8f-4be3-94cc-53246d50e967")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneSetData) data).mProcess = value;
            }

            @objid ("6fef7ddd-28f5-4893-b768-b921f9e9b4db")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.LaneSetDep();
            }

        }

        @objid ("0030b09c-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ParentLaneSmDependency extends SmSingleDependency {
            @objid ("3613ffa3-e8a4-45ab-afd9-f69eb83a4c41")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneSetData) data).mParentLane;
            }

            @objid ("6fec6c72-7d10-4cbd-8306-e0dbc6dd22ba")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneSetData) data).mParentLane = value;
            }

            @objid ("2f2dba80-7679-4bbc-8e82-b6bd09106ae6")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.ChildLaneSetDep();
            }

        }

        @objid ("00313526-c4c2-1fd8-97fe-001ec947cd2a")
        public static class SubProcessSmDependency extends SmSingleDependency {
            @objid ("832cc1d5-6ba8-4a99-8aa3-cb4f42e43efb")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnLaneSetData) data).mSubProcess;
            }

            @objid ("5c31fafb-de06-40a2-890d-7b32fe71ef92")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnLaneSetData) data).mSubProcess = value;
            }

            @objid ("b26627aa-d5b8-4abd-8aec-3fd5f0eb01a2")
            @Override
            public SmDependency getSymetric() {
                return BpmnSubProcessData.Metadata.LaneSetDep();
            }

        }

    }

}
