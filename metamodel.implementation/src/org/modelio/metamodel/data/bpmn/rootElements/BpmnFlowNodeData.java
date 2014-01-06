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
    @objid ("b9f6003b-b720-435f-8eb0-c5e4f71ea605")
    @SmaMetaAssociation(metaName="Outgoing", typeDataClass=BpmnSequenceFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mOutgoing = null;

    @objid ("39c49963-0191-402c-918a-8d4c429bfd44")
    @SmaMetaAssociation(metaName="Resource", typeDataClass=BpmnResourceRoleData.class, min=0, max=-1, smAssociationClass=Metadata.ResourceSmDependency.class, component = true)
     List<SmObjectImpl> mResource = null;

    @objid ("b4399a7e-4a5e-47e1-bb5b-8e311a575c8a")
    @SmaMetaAssociation(metaName="Incoming", typeDataClass=BpmnSequenceFlowData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingSmDependency.class, istodelete = true)
     List<SmObjectImpl> mIncoming = null;

    @objid ("8f342c0d-a526-44f6-bf5f-ee02e17641b2")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0067c136-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("107a8a79-bbb3-4664-b69d-3c3fd1bec8f0")
        private static SmClass smClass = null;

        @objid ("af08bfeb-2bb4-41bd-a73b-5aeefa7f2e60")
        private static SmDependency OutgoingDep = null;

        @objid ("e5bcd863-2ba4-46ae-8290-8f75dcd4ca18")
        private static SmDependency ResourceDep = null;

        @objid ("99bed9e5-a53e-4eed-b0eb-7995b4afe82c")
        private static SmDependency IncomingDep = null;

        @objid ("1f66f32b-efe4-40bf-b098-f584f3ac718f")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnFlowNodeData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3803d8b1-f64e-45e8-8e22-11d910d31f6f")
        public static SmDependency OutgoingDep() {
            if (OutgoingDep == null) {
            	OutgoingDep = classof().getDependencyDef("Outgoing");
            }
            return OutgoingDep;
        }

        @objid ("ecb0bec1-e9b1-4be3-b5f3-68a1428e01c5")
        public static SmDependency ResourceDep() {
            if (ResourceDep == null) {
            	ResourceDep = classof().getDependencyDef("Resource");
            }
            return ResourceDep;
        }

        @objid ("347eb716-b41c-4cc4-9926-485675ef497d")
        public static SmDependency IncomingDep() {
            if (IncomingDep == null) {
            	IncomingDep = classof().getDependencyDef("Incoming");
            }
            return IncomingDep;
        }

        @objid ("9dae5b47-d31c-4ded-87ee-c49fef5d8b43")
        public static SmDependency getResourceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ResourceDep;
        }

        @objid ("2f764e69-94a6-42e1-86e9-7cfbc4a5a092")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("0af056a7-e2ce-4299-9169-ae45e9579535")
        public static SmDependency getIncomingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingDep;
        }

        @objid ("b5e66213-fb44-4a3b-bcf6-57a020bab7e1")
        public static SmDependency getOutgoingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingDep;
        }

        @objid ("00680240-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("bf15d2a0-aa00-409a-a418-238a4d22f72b")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("e1e05bad-e1c3-4fe8-b90c-0c0b9fe051d7")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("00686546-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ResourceSmDependency extends SmMultipleDependency {
            @objid ("9653875c-cbae-4f25-81ba-b241e61a83c8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowNodeData)data).mResource != null)? ((BpmnFlowNodeData)data).mResource:SmMultipleDependency.EMPTY;
            }

            @objid ("0828c3fc-69c0-4fe3-a704-1fe5d32d27d3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowNodeData) data).mResource = new ArrayList<>(initialCapacity);
                return ((BpmnFlowNodeData) data).mResource;
            }

            @objid ("2958a184-417f-4407-9a59-e83a58e51004")
            @Override
            public SmDependency getSymetric() {
                return BpmnResourceRoleData.Metadata.AnnotatedDep();
            }

        }

        @objid ("0068c810-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OutgoingSmDependency extends SmMultipleDependency {
            @objid ("7961e653-c363-4ac9-b948-f82c0aaefc22")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowNodeData)data).mOutgoing != null)? ((BpmnFlowNodeData)data).mOutgoing:SmMultipleDependency.EMPTY;
            }

            @objid ("06c37e26-e8d8-48b6-b0f2-feb909e5eb95")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowNodeData) data).mOutgoing = new ArrayList<>(initialCapacity);
                return ((BpmnFlowNodeData) data).mOutgoing;
            }

            @objid ("2b08a6b6-1cfc-4884-a75b-28e7b0243bc4")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.SourceRefDep();
            }

        }

        @objid ("00692ba2-c4c3-1fd8-97fe-001ec947cd2a")
        public static class IncomingSmDependency extends SmMultipleDependency {
            @objid ("63c1622c-432d-4079-ab86-498990691dfa")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnFlowNodeData)data).mIncoming != null)? ((BpmnFlowNodeData)data).mIncoming:SmMultipleDependency.EMPTY;
            }

            @objid ("b7525a32-36af-439f-948d-b343f1313f56")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnFlowNodeData) data).mIncoming = new ArrayList<>(initialCapacity);
                return ((BpmnFlowNodeData) data).mIncoming;
            }

            @objid ("be6d14c7-2454-4fdc-9a3f-e8bfd957bd56")
            @Override
            public SmDependency getSymetric() {
                return BpmnSequenceFlowData.Metadata.TargetRefDep();
            }

        }

    }

}
