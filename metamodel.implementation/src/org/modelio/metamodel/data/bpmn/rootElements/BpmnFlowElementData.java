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
    @objid ("d9ab3c6e-e1e7-4859-9d16-d98fc6b1ddf8")
    @SmaMetaAssociation(metaName="Groups", typeDataClass=BpmnGroupData.class, min=0, max=-1, smAssociationClass=Metadata.GroupsSmDependency.class)
     List<SmObjectImpl> mGroups = null;

    @objid ("5d9a99cd-6be7-4789-8a38-3369407da0ff")
    @SmaMetaAssociation(metaName="SubProcess", typeDataClass=BpmnSubProcessData.class, min=0, max=1, smAssociationClass=Metadata.SubProcessSmDependency.class)
     SmObjectImpl mSubProcess;

    @objid ("50e34f59-286d-45e6-8bdf-e21e173fc44e")
    @SmaMetaAssociation(metaName="Lane", typeDataClass=BpmnLaneData.class, min=0, max=-1, smAssociationClass=Metadata.LaneSmDependency.class)
     List<SmObjectImpl> mLane = null;

    @objid ("bbcb7cfd-321a-4e3b-b385-521ed0cebe41")
    @SmaMetaAssociation(metaName="Container", typeDataClass=BpmnProcessData.class, min=0, max=1, smAssociationClass=Metadata.ContainerSmDependency.class)
     SmObjectImpl mContainer;

    @objid ("aa8d0e4a-77bc-4b4b-a8b6-cf90cf4ea8b8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("001878c4-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("57fa7698-40f0-4f25-9e09-2fca2fd5fcaf")
        private static SmClass smClass = null;

        @objid ("fbe5314f-2d70-4b07-bc1f-0a20301c64a0")
        private static SmDependency GroupsDep = null;

        @objid ("c0c42b43-17a4-4fe3-b721-e5c4963d714f")
        private static SmDependency SubProcessDep = null;

        @objid ("66f683ac-f026-4339-8cfd-49a5ba783895")
        private static SmDependency LaneDep = null;

        @objid ("a008b307-c881-4a7d-b369-29c8d4e84bed")
        private static SmDependency ContainerDep = null;

        @objid ("014cabaa-9ffc-4996-8c2e-d25cd2b9cab9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnFlowElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("6c55c503-ddc0-4da5-8e1e-9cc26341df9d")
        public static SmDependency GroupsDep() {
            if (GroupsDep == null) {
            	GroupsDep = classof().getDependencyDef("Groups");
            }
            return GroupsDep;
        }

        @objid ("559ab6b5-bb14-4799-9f85-7f9cb7c84321")
        public static SmDependency SubProcessDep() {
            if (SubProcessDep == null) {
            	SubProcessDep = classof().getDependencyDef("SubProcess");
            }
            return SubProcessDep;
        }

        @objid ("bab8180f-ed14-4e2a-873d-d4a5a9f18ede")
        public static SmDependency LaneDep() {
            if (LaneDep == null) {
            	LaneDep = classof().getDependencyDef("Lane");
            }
            return LaneDep;
        }

        @objid ("e4f06e4f-a365-410b-a791-b5479642451d")
        public static SmDependency ContainerDep() {
            if (ContainerDep == null) {
            	ContainerDep = classof().getDependencyDef("Container");
            }
            return ContainerDep;
        }

        @objid ("a42f7e6b-9b34-4bfc-a469-5b78c5c513b9")
        public static SmDependency getLaneDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return LaneDep;
        }

        @objid ("97bc05fb-9a7c-4649-9b2a-6167aa7ecc6a")
        public static SmDependency getGroupsDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return GroupsDep;
        }

        @objid ("f793c06c-29e9-4d11-9f23-a419954d4589")
        public static SmDependency getSubProcessDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SubProcessDep;
        }

        @objid ("4b1ed362-e966-48af-baf8-b5ab3e9a0371")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("95e611cb-a75b-4a4e-be30-15b1ef657fc9")
        public static SmDependency getContainerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ContainerDep;
        }

        @objid ("0018c004-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("1688ca0f-ebb2-487b-90ea-093afeb305dc")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("8067fd00-86af-44cf-b8da-1cbb11d36cc5")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00192396-c4c5-1fd8-97fe-001ec947cd2a")
        public static class GroupsSmDependency extends SmMultipleDependency {
            @objid ("aab0cbe6-f5a9-4aa2-85f5-5ee870e576dc")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowElementData)data).mGroups != null)? ((BpmnFlowElementData)data).mGroups:SmMultipleDependency.EMPTY;
            }

            @objid ("61c321c9-de9e-4730-929f-cf992ec914a1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowElementData) data).mGroups = new ArrayList<>(initialCapacity);
                return ((BpmnFlowElementData) data).mGroups;
            }

            @objid ("4289cc6b-07e6-46c8-b06b-0fef4c690d78")
            @Override
            public SmDependency getSymetric() {
                return BpmnGroupData.Metadata.CategorizedDep();
            }

        }

        @objid ("001984c6-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SubProcessSmDependency extends SmSingleDependency {
            @objid ("817fd370-f997-431f-b974-d58a852b05ad")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnFlowElementData) data).mSubProcess;
            }

            @objid ("36dbaca4-5b4b-499d-9eb3-2839f746798f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnFlowElementData) data).mSubProcess = value;
            }

            @objid ("c761adb7-b338-4fc3-9d85-49a110407b90")
            @Override
            public SmDependency getSymetric() {
                return BpmnSubProcessData.Metadata.FlowElementDep();
            }

        }

        @objid ("0019ff96-c4c5-1fd8-97fe-001ec947cd2a")
        public static class LaneSmDependency extends SmMultipleDependency {
            @objid ("ae93d488-469a-4cbd-9ea7-43bc37fb5491")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowElementData)data).mLane != null)? ((BpmnFlowElementData)data).mLane:SmMultipleDependency.EMPTY;
            }

            @objid ("336fd58b-72ab-421d-b436-e1abc5f1678a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowElementData) data).mLane = new ArrayList<>(initialCapacity);
                return ((BpmnFlowElementData) data).mLane;
            }

            @objid ("9d06a6cd-67ec-440a-baad-094c760e6293")
            @Override
            public SmDependency getSymetric() {
                return BpmnLaneData.Metadata.FlowElementRefDep();
            }

        }

        @objid ("001a6238-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ContainerSmDependency extends SmSingleDependency {
            @objid ("fdd4a608-b323-4c0c-8bf6-688fc9fef2a9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnFlowElementData) data).mContainer;
            }

            @objid ("aa7171bb-28a7-4202-b73d-ceeab41a3942")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnFlowElementData) data).mContainer = value;
            }

            @objid ("628209ce-2a0f-4264-9e5e-8c19ae2601e3")
            @Override
            public SmDependency getSymetric() {
                return BpmnProcessData.Metadata.FlowElementDep();
            }

        }

    }

}
