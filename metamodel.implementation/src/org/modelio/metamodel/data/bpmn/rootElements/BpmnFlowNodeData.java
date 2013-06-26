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
    @objid ("0097a409-acb4-439c-a477-24cb2af63691")
    @SmaMetaAssociation(metaName="Outgoing", typeDataClass=BpmnSequenceFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mOutgoing = null;

    @objid ("3169d041-7fdf-41ce-87e2-c4387ed0db7c")
    @SmaMetaAssociation(metaName="Resource", typeDataClass=BpmnResourceRoleData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceSmDependency.class, component = true)
     List<SmObjectImpl> mResource = null;

    @objid ("fbac2073-34cb-4a19-aa10-f1b55b6731eb")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=BpmnSequenceFlowData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mIncoming = null;

    @objid ("af9d20f3-8dbd-4741-bc83-2b58f8fcdf5c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0067c136-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("741e1dae-99d7-47cd-8bc3-f1ecd010faab")
        private static SmClass smClass = null;

        @objid ("f0508fa4-a958-4e60-b8dc-2c2ea1e27d12")
        private static SmDependency OutgoingDep = null;

        @objid ("c7cb5657-7ab6-41bd-8d30-4cf80c00758a")
        private static SmDependency ResourceDep = null;

        @objid ("b07eefbc-ab1b-44f6-8759-f1ad836df081")
        private static SmDependency IncomingDep = null;

        @objid ("c0a192d0-b2d6-4752-90d8-edcc8f405662")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnFlowNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("f980e8e0-4f28-4954-90a8-ffdb2b856ac9")
        public static SmDependency OutgoingDep() {
            if (OutgoingDep == null) {
            	OutgoingDep = classof().getDependencyDef("Outgoing");
            }
            return OutgoingDep;
        }

        @objid ("088c1a65-0a47-48f8-9ecf-da36fe01b75b")
        public static SmDependency ResourceDep() {
            if (ResourceDep == null) {
            	ResourceDep = classof().getDependencyDef("Resource");
            }
            return ResourceDep;
        }

        @objid ("88b48006-6c6e-470b-b8f5-fc061050f524")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("5a0116d8-6598-4fb8-ab91-b799b40aeec3")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("247e1efc-93ee-4da6-8535-20f96cd5344b")
        public static SmDependency getOutgoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingDep;
        }

        @objid ("647d0dd3-06fa-4862-92d0-ef9e97eec3c1")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("cfceee6f-2c23-4e76-b8e2-394753e91990")
        public static SmDependency getResourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceDep;
        }

        @objid ("00680240-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("8e2edcb1-dc8d-41f9-a0ab-12d3850aacb4")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("42467ab6-cadc-4ef0-a13b-3b97737ab3fb")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00686546-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ResourceSmDependency extends SmMultipleDependency {
            @objid ("56b8126d-3b5f-4426-b3b3-777499829a05")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowNodeData)data).mResource != null)? ((BpmnFlowNodeData)data).mResource:SmMultipleDependency.EMPTY;
            }

            @objid ("38760414-4138-477b-b280-dc570d5c87f6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowNodeData) data).mResource = new ArrayList<>(initialCapacity);
                return ((BpmnFlowNodeData) data).mResource;
            }

            @objid ("4295c2d1-57ad-4ff1-b202-20fe60893b18")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.AnnotatedDep();
            }

        }

        @objid ("0068c810-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutgoingSmDependency extends SmMultipleDependency {
            @objid ("60f431df-1f78-4642-aa49-ac2fa5a1079a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowNodeData)data).mOutgoing != null)? ((BpmnFlowNodeData)data).mOutgoing:SmMultipleDependency.EMPTY;
            }

            @objid ("7fd3cf11-97fd-4b8f-8101-126334b896d1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowNodeData) data).mOutgoing = new ArrayList<>(initialCapacity);
                return ((BpmnFlowNodeData) data).mOutgoing;
            }

            @objid ("f689fe7c-e329-4900-b2a6-6d3560aea91c")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.SourceRefDep();
            }

        }

        @objid ("00692ba2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("04bd42d8-540f-4fbd-b109-a8538d69dae8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowNodeData)data).mIncoming != null)? ((BpmnFlowNodeData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("d57218cc-6b15-4aa5-992e-30fe0cf6b69b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowNodeData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((BpmnFlowNodeData) data).mIncoming;
            }

            @objid ("9dfe6557-6d69-4377-8b35-469817c8b3d5")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.TargetRefDep();
            }

        }

    }

}
