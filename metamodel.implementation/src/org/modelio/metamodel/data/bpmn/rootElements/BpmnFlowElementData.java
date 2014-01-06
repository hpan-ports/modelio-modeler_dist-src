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
    @objid ("03c5a653-204a-462d-a794-2e9c1345ada8")
    @SmaMetaAssociation(metaName="Groups", typeDataClass=BpmnGroupData.class, min=0, max=-1, smAssociationClass=Metadata.GroupsSmDependency.class)
     List<SmObjectImpl> mGroups = null;

    @objid ("9f609fa7-843b-4594-bd58-e3bad4a126c5")
    @SmaMetaAssociation(metaName="SubProcess", typeDataClass=BpmnSubProcessData.class, min=0, max=1, smAssociationClass=Metadata.SubProcessSmDependency.class)
     SmObjectImpl mSubProcess;

    @objid ("dda81832-d612-4d92-9620-9ef1a6d48eb2")
    @SmaMetaAssociation(metaName="Lane", typeDataClass=BpmnLaneData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSmDependency.class)
     List<SmObjectImpl> mLane = null;

    @objid ("fe5a2338-9944-4f00-94d5-b1c1472032fd")
    @SmaMetaAssociation(metaName="Container", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ContainerSmDependency.class)
     SmObjectImpl mContainer;

    @objid ("7e650a83-af8c-448c-ba66-059890519bc8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001878c4-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("5cda5ad6-9941-47c0-a1e7-7534f7c14fa2")
        private static SmClass smClass = null;

        @objid ("9aece9ce-f3cd-4727-85bc-0bf935c5ae61")
        private static SmDependency GroupsDep = null;

        @objid ("2f392f04-1953-48b9-841a-3c93f2831d07")
        private static SmDependency SubProcessDep = null;

        @objid ("82103ade-86f4-4516-b1b1-a49bab242c9f")
        private static SmDependency LaneDep = null;

        @objid ("9fae586a-e172-44e8-b618-ba48f50abcd7")
        private static SmDependency ContainerDep = null;

        @objid ("2327e0a0-4d9d-44a6-828a-bb7ad4535632")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnFlowElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1736bed2-f22f-44db-bf68-e15f8699696a")
        public static SmDependency GroupsDep() {
            if (GroupsDep == null) {
            	GroupsDep = classof().getDependencyDef("Groups");
            }
            return GroupsDep;
        }

        @objid ("1699ed8d-467e-4407-a29e-56c12259aab6")
        public static SmDependency SubProcessDep() {
            if (SubProcessDep == null) {
            	SubProcessDep = classof().getDependencyDef("SubProcess");
            }
            return SubProcessDep;
        }

        @objid ("9c00e35c-78a8-4f61-a25b-7b25b4ddc6a1")
        public static SmDependency LaneDep() {
            if (LaneDep == null) {
            	LaneDep = classof().getDependencyDef("Lane");
            }
            return LaneDep;
        }

        @objid ("7c83b278-bde7-4ee0-955d-d3a51a22bcab")
        public static SmDependency ContainerDep() {
            if (ContainerDep == null) {
            	ContainerDep = classof().getDependencyDef("Container");
            }
            return ContainerDep;
        }

        @objid ("3d21284a-e076-4ef2-a185-d6be01dce142")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("6eb40936-8cbd-41f8-9440-4f8a4f9d8abf")
        public static SmDependency getLaneDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneDep;
        }

        @objid ("322ff1dc-01fb-4aed-a39b-06ec75eab1fe")
        public static SmDependency getGroupsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GroupsDep;
        }

        @objid ("ec64a17a-576c-4c65-9865-181d4f217756")
        public static SmDependency getContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContainerDep;
        }

        @objid ("0debff01-0890-4cfe-b9e8-db1db4f73c6a")
        public static SmDependency getSubProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubProcessDep;
        }

        @objid ("0018c004-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("d314e9ac-4f16-4c03-ac89-7c1e8f3ec197")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("caab8129-37ef-44ee-ba55-3f6807236046")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00192396-c4c5-1fd8-97fe-001ec947cd2a")
        public static class GroupsSmDependency extends SmMultipleDependency {
            @objid ("87240c42-9ede-4f1c-b997-007a7bad51ee")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowElementData)data).mGroups != null)? ((BpmnFlowElementData)data).mGroups:SmMultipleDependency.EMPTY;
            }

            @objid ("92ea12bd-7300-4169-8026-e760a3509ed4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowElementData) data).mGroups = new ArrayList<>(initialCapacity);
                return ((BpmnFlowElementData) data).mGroups;
            }

            @objid ("5c67b09d-6cfd-43bf-8682-cc51240da52c")
            @Override
            public SmDependency getSymetric() {
                return BpmnGroupData.Metadata.CategorizedDep();
            }

        }

        @objid ("001984c6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubProcessSmDependency extends SmSingleDependency {
            @objid ("2149eb1f-4a4a-4499-ba38-01c16f585cf7")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnFlowElementData) data).mSubProcess;
            }

            @objid ("56e9db20-4178-4b0e-bb82-3716c88c0925")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnFlowElementData) data).mSubProcess = value;
            }

            @objid ("2b65899e-fd35-434b-955b-635018ed1080")
            @Override
            public SmDependency getSymetric() {
                return BpmnSubProcessData.Metadata.FlowElementDep();
            }

        }

        @objid ("0019ff96-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LaneSmDependency extends SmMultipleDependency {
            @objid ("568e8da8-ef74-43c4-aa35-ed0b817cfb9e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowElementData)data).mLane != null)? ((BpmnFlowElementData)data).mLane:SmMultipleDependency.EMPTY;
            }

            @objid ("59ad260c-6a7b-479b-89ca-1080bb692d2c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowElementData) data).mLane = new ArrayList<>(initialCapacity);
                return ((BpmnFlowElementData) data).mLane;
            }

            @objid ("0ec1cc91-6c5b-4247-9dd6-a92e1f408833")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.FlowElementRefDep();
            }

        }

        @objid ("001a6238-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ContainerSmDependency extends SmSingleDependency {
            @objid ("341bc50f-e408-424c-aced-a149482f72a6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnFlowElementData) data).mContainer;
            }

            @objid ("0895406a-f048-4031-9725-ca96a9b65a7c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnFlowElementData) data).mContainer = value;
            }

            @objid ("b371c637-62ea-4b33-a5c6-f7962d63202e")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.FlowElementDep();
            }

        }

    }

}
