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
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;
import org.modelio.metamodel.data.bpmn.flows.BpmnSequenceFlowData;
import org.modelio.metamodel.data.bpmn.resources.BpmnResourceRoleData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowNodeImpl;
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

@objid ("007a05d0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnFlowNode.class, factory=BpmnFlowNodeData.Metadata.ObjectFactory.class)
public abstract class BpmnFlowNodeData extends BpmnFlowElementData {
    @objid ("6f96099a-bee2-4f22-b2c9-d845c9aa21cc")
    @SmaMetaAssociation(metaName="Outgoing", typeDataClass=BpmnSequenceFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mOutgoing = null;

    @objid ("f2346f75-a22a-4a21-b0bd-60bc0c3ea1a4")
    @SmaMetaAssociation(metaName="Resource", typeDataClass=BpmnResourceRoleData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceSmDependency.class, component = true)
     List<SmObjectImpl> mResource = null;

    @objid ("57e160d2-27c5-4575-b408-84b02dd6f4cb")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=BpmnSequenceFlowData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mIncoming = null;

    @objid ("5991b929-5e0b-47aa-aa00-6c21f5afc378")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0067c136-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("ec8157cb-7422-4e42-bf66-4ffb97ad46ab")
        private static SmClass smClass = null;

        @objid ("f5655601-ae89-48d2-b78e-e944be37abb5")
        private static SmDependency OutgoingDep = null;

        @objid ("6593bec2-15eb-4529-92e0-b4d4ca291e50")
        private static SmDependency ResourceDep = null;

        @objid ("3d7918dd-6896-42be-8cbc-c08e5f315ec4")
        private static SmDependency IncomingDep = null;

        @objid ("1785e5de-d98a-46c9-b45d-4d6373077818")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnFlowNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("1e850199-6e86-4543-84e8-0d1c590dfd1f")
        public static SmDependency OutgoingDep() {
            if (OutgoingDep == null) {
            	OutgoingDep = classof().getDependencyDef("Outgoing");
            }
            return OutgoingDep;
        }

        @objid ("892a9a63-8c6f-4d9e-a549-77f87f48b5da")
        public static SmDependency ResourceDep() {
            if (ResourceDep == null) {
            	ResourceDep = classof().getDependencyDef("Resource");
            }
            return ResourceDep;
        }

        @objid ("2606fc1f-4cbb-4958-b124-49fdfb4876a5")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("a47f3268-f968-4cd6-b6ac-b7b731dc334f")
        public static SmDependency getResourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceDep;
        }

        @objid ("3d7276bd-a66c-49bf-880a-8cf60a077d59")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("c5ac5d0e-7233-47f5-a47e-30797a2f31ee")
        public static SmDependency getOutgoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingDep;
        }

        @objid ("0d99d58b-45c2-4ca7-aa5f-f3242e0bb880")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("00680240-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8a4af296-b21f-4b1b-b4bb-cf743c1fc08b")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("031f571c-bf88-474a-8c6a-4081df8eecf5")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00686546-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ResourceSmDependency extends SmMultipleDependency {
            @objid ("ca66a56f-d605-42e2-b2ab-289a3e6f50b2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowNodeData)data).mResource != null)? ((BpmnFlowNodeData)data).mResource:SmMultipleDependency.EMPTY;
            }

            @objid ("d37152cd-0e12-49a6-bf93-90f1cf6a0f98")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowNodeData) data).mResource = new ArrayList<>(initialCapacity);
                return ((BpmnFlowNodeData) data).mResource;
            }

            @objid ("1e228c96-ee38-4a92-9b76-e7de7a4dab10")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.AnnotatedDep();
            }

        }

        @objid ("0068c810-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutgoingSmDependency extends SmMultipleDependency {
            @objid ("34dcfa32-d580-4c73-8f8f-f354f00a4d86")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowNodeData)data).mOutgoing != null)? ((BpmnFlowNodeData)data).mOutgoing:SmMultipleDependency.EMPTY;
            }

            @objid ("d01b334f-e472-4eb5-bf7d-f824b7e91f3e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowNodeData) data).mOutgoing = new ArrayList<>(initialCapacity);
                return ((BpmnFlowNodeData) data).mOutgoing;
            }

            @objid ("2128ebec-4af5-4c00-b6e0-c9f560caa02f")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.SourceRefDep();
            }

        }

        @objid ("00692ba2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("6fab20b1-5052-4243-84f2-c363243a38b5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowNodeData)data).mIncoming != null)? ((BpmnFlowNodeData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("b857a2d6-d085-4e98-854c-80c76aee4d3d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowNodeData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((BpmnFlowNodeData) data).mIncoming;
            }

            @objid ("e3f804f6-a970-4a40-8f73-c8f534f1b29d")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.TargetRefDep();
            }

        }

    }

}
