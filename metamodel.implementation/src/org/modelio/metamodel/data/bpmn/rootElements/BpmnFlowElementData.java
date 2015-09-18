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
package org.modelio.metamodel.data.bpmn.rootElements;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.data.bpmn.activities.BpmnSubProcessData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnLaneData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnProcessData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnGroupData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementImpl;
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

@objid ("007984ac-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnFlowElement.class, factory=BpmnFlowElementData.Metadata.ObjectFactory.class)
public abstract class BpmnFlowElementData extends BpmnBaseElementData {
    @objid ("37effd2b-6708-4e27-9b4b-d9c0c8b50e2f")
    @SmaMetaAssociation(metaName="Groups", typeDataClass=BpmnGroupData.class, min=0, max=-1, smAssociationClass=Metadata.GroupsSmDependency.class)
     List<SmObjectImpl> mGroups = null;

    @objid ("56778e37-23ff-4dd2-b193-2017ec556bf5")
    @SmaMetaAssociation(metaName="SubProcess", typeDataClass=BpmnSubProcessData.class, min=0, max=1, smAssociationClass=Metadata.SubProcessSmDependency.class)
     SmObjectImpl mSubProcess;

    @objid ("6bcf69be-350a-48dd-9615-d476893c237b")
    @SmaMetaAssociation(metaName="Lane", typeDataClass=BpmnLaneData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSmDependency.class)
     List<SmObjectImpl> mLane = null;

    @objid ("b526a355-331f-459c-a53e-a4d18e56571e")
    @SmaMetaAssociation(metaName="Container", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ContainerSmDependency.class)
     SmObjectImpl mContainer;

    @objid ("d18b4389-3af7-4cd0-a510-987af385568b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001878c4-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b2d6f2bc-9a1f-4177-aaa5-5bcbdc744c93")
        private static SmClass smClass = null;

        @objid ("ceb74746-4cd4-4e75-aa92-d93da1cb2483")
        private static SmDependency GroupsDep = null;

        @objid ("3ca09612-a780-4486-bcbc-1fb5f5c729c2")
        private static SmDependency SubProcessDep = null;

        @objid ("2da62783-45e6-44a0-ba78-36a2a142530f")
        private static SmDependency LaneDep = null;

        @objid ("daa8cc27-d681-4826-895a-bdb318aaf9c0")
        private static SmDependency ContainerDep = null;

        @objid ("95792ce1-515f-4866-9ff7-2d23538cc637")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnFlowElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("b5fe04f9-9be3-43e8-a943-03b6d5595367")
        public static SmDependency GroupsDep() {
            if (GroupsDep == null) {
            	GroupsDep = classof().getDependencyDef("Groups");
            }
            return GroupsDep;
        }

        @objid ("e83212d3-8857-476f-bdf1-59a3f8c5e602")
        public static SmDependency SubProcessDep() {
            if (SubProcessDep == null) {
            	SubProcessDep = classof().getDependencyDef("SubProcess");
            }
            return SubProcessDep;
        }

        @objid ("d35e03fb-0143-4d89-ae0d-ab52bcedbc61")
        public static SmDependency LaneDep() {
            if (LaneDep == null) {
            	LaneDep = classof().getDependencyDef("Lane");
            }
            return LaneDep;
        }

        @objid ("1ef60d0e-756c-439c-a2c5-3b9298f16e19")
        public static SmDependency ContainerDep() {
            if (ContainerDep == null) {
            	ContainerDep = classof().getDependencyDef("Container");
            }
            return ContainerDep;
        }

        @objid ("daea1631-ef9b-47c8-a23f-6abd95da49f1")
        public static SmDependency getLaneDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneDep;
        }

        @objid ("801d886f-a039-4cf6-952c-2bf30227b464")
        public static SmDependency getSubProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubProcessDep;
        }

        @objid ("f1ee1bd3-acd1-4e3e-91c5-2f3ba6cfe53c")
        public static SmDependency getContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContainerDep;
        }

        @objid ("413c651c-7812-4661-8957-afaa8c56f296")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("853798c4-4fd9-4ec7-877e-68203e856dbb")
        public static SmDependency getGroupsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GroupsDep;
        }

        @objid ("0018c004-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8a14f039-14ca-421c-a7b3-3c9afd346e92")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("603b9d1b-c9d2-40e4-aae2-c4b032a3db46")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00192396-c4c5-1fd8-97fe-001ec947cd2a")
        public static class GroupsSmDependency extends SmMultipleDependency {
            @objid ("1a4e0738-e5d8-4bc3-a66f-9f23737b6095")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowElementData)data).mGroups != null)? ((BpmnFlowElementData)data).mGroups:SmMultipleDependency.EMPTY;
            }

            @objid ("afda9bfc-bfe1-4479-8119-20f12a6b9cbf")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowElementData) data).mGroups = new ArrayList<>(initialCapacity);
                return ((BpmnFlowElementData) data).mGroups;
            }

            @objid ("380a88f6-2d33-432c-af7c-0d033bf6d9d7")
            @Override
            public SmDependency getSymetric() {
                return BpmnGroupData.Metadata.CategorizedDep();
            }

        }

        @objid ("001984c6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubProcessSmDependency extends SmSingleDependency {
            @objid ("ff9c599c-78fa-4430-bb43-251375f8f6a6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnFlowElementData) data).mSubProcess;
            }

            @objid ("b2c683fe-a0a3-42c8-9496-3542bc0635d8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnFlowElementData) data).mSubProcess = value;
            }

            @objid ("b39d54de-8c37-47d8-8fb2-6858ca26e7fb")
            @Override
            public SmDependency getSymetric() {
                return BpmnSubProcessData.Metadata.FlowElementDep();
            }

        }

        @objid ("0019ff96-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LaneSmDependency extends SmMultipleDependency {
            @objid ("c142f6f5-9ca6-42e2-a44e-919f1d63ea52")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowElementData)data).mLane != null)? ((BpmnFlowElementData)data).mLane:SmMultipleDependency.EMPTY;
            }

            @objid ("3500e563-0fce-4301-9312-e66e5f347d79")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowElementData) data).mLane = new ArrayList<>(initialCapacity);
                return ((BpmnFlowElementData) data).mLane;
            }

            @objid ("e20e90fa-5d7f-4d05-b731-0348993a3708")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.FlowElementRefDep();
            }

        }

        @objid ("001a6238-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ContainerSmDependency extends SmSingleDependency {
            @objid ("4e71eaf9-20b8-488c-b368-f8b0a62be0b9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnFlowElementData) data).mContainer;
            }

            @objid ("e1c2ce9c-cafa-4eb2-80bc-474bacddf8af")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnFlowElementData) data).mContainer = value;
            }

            @objid ("6e0c85eb-cdd9-42d0-ae82-77906d8ebfd5")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.FlowElementDep();
            }

        }

    }

}
