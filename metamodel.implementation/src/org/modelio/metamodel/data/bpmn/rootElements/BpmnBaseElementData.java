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
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageFlowData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnAssociationData;
import org.modelio.metamodel.data.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementImpl;
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

@objid ("00783e94-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnBaseElement.class, factory=BpmnBaseElementData.Metadata.ObjectFactory.class)
public abstract class BpmnBaseElementData extends ModelElementData {
    @objid ("e33f8597-52f9-4a7d-86cc-24808b8d4c87")
    @SmaMetaAssociation(metaName="OutgoingAssoc", typeDataClass=BpmnAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingAssocSmDependency.class)
     List<SmObjectImpl> mOutgoingAssoc = null;

    @objid ("c3338ffd-ad5d-40a8-82e5-61e256e49f80")
    @SmaMetaAssociation(metaName="IncomingAssoc", typeDataClass=BpmnAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingAssocSmDependency.class)
     List<SmObjectImpl> mIncomingAssoc = null;

    @objid ("7112395c-47b9-4127-84fe-f22c8ae36f9b")
    @SmaMetaAssociation(metaName="IncomingFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingFlowSmDependency.class)
     List<SmObjectImpl> mIncomingFlow = null;

    @objid ("05a65196-85db-4752-83bb-1fbe0b187d36")
    @SmaMetaAssociation(metaName="OutgoingFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingFlowSmDependency.class)
     List<SmObjectImpl> mOutgoingFlow = null;

    @objid ("d37b70e2-60eb-48ce-864e-611427cdc29b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004c525c-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("89d2d300-6fc3-4a73-9243-68fb804ed39a")
        private static SmClass smClass = null;

        @objid ("a9fed8ac-3d34-484e-a525-28a056697aa6")
        private static SmDependency OutgoingAssocDep = null;

        @objid ("6ac02e68-cc3c-49b3-9c6b-27732f13ff7d")
        private static SmDependency IncomingAssocDep = null;

        @objid ("5b705993-f07f-4c2b-b31a-cdc65954d4ef")
        private static SmDependency IncomingFlowDep = null;

        @objid ("a4ba4682-f32f-4428-9cb7-d473e334ed5a")
        private static SmDependency OutgoingFlowDep = null;

        @objid ("aa48f227-6e29-4cd3-b735-a6f1f4b12d06")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBaseElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0b7744c5-547a-43e3-87d6-d2ef4dda8ae1")
        public static SmDependency OutgoingAssocDep() {
            if (OutgoingAssocDep == null) {
            	OutgoingAssocDep = classof().getDependencyDef("OutgoingAssoc");
            }
            return OutgoingAssocDep;
        }

        @objid ("bf07e49d-cae3-4b41-9431-d047889b8ab1")
        public static SmDependency IncomingAssocDep() {
            if (IncomingAssocDep == null) {
            	IncomingAssocDep = classof().getDependencyDef("IncomingAssoc");
            }
            return IncomingAssocDep;
        }

        @objid ("f195c5dc-7634-4c1c-9026-e723ef12cafb")
        public static SmDependency IncomingFlowDep() {
            if (IncomingFlowDep == null) {
            	IncomingFlowDep = classof().getDependencyDef("IncomingFlow");
            }
            return IncomingFlowDep;
        }

        @objid ("59495a81-3a9a-4b55-b734-c726c66fdb3b")
        public static SmDependency OutgoingFlowDep() {
            if (OutgoingFlowDep == null) {
            	OutgoingFlowDep = classof().getDependencyDef("OutgoingFlow");
            }
            return OutgoingFlowDep;
        }

        @objid ("52ce09ca-a31a-46b3-98aa-78a077b39a75")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("e1099878-a22d-40ad-a755-f03689c12ae5")
        public static SmDependency getOutgoingAssocDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingAssocDep;
        }

        @objid ("4a2b7985-f91d-4d93-b555-b500bc95e5cc")
        public static SmDependency getOutgoingFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingFlowDep;
        }

        @objid ("9837d449-4102-4c9c-911f-2ebabdca6017")
        public static SmDependency getIncomingAssocDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingAssocDep;
        }

        @objid ("07bc580d-cf74-4e3f-a958-f95708bd6cb0")
        public static SmDependency getIncomingFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingFlowDep;
        }

        @objid ("004c926c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("51e87ac2-6a6a-4f64-bcd9-cf6e666e7ae5")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("4959a724-842d-4672-aa26-ec528bcebd7e")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004cf446-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutgoingAssocSmDependency extends SmMultipleDependency {
            @objid ("14293d4f-dade-4b32-bc30-fe2ca32e6079")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mOutgoingAssoc != null)? ((BpmnBaseElementData)data).mOutgoingAssoc:SmMultipleDependency.EMPTY;
            }

            @objid ("2956bcb8-0f82-4c66-b53a-d80a3d473c09")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mOutgoingAssoc = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mOutgoingAssoc;
            }

            @objid ("08bf23ce-dff6-4a73-a992-a33cda737cc4")
            @Override
            public SmDependency getSymetric() {
                return BpmnAssociationData.Metadata.SourceRefDep();
            }

        }

        @objid ("004d5530-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IncomingAssocSmDependency extends SmMultipleDependency {
            @objid ("11ac5f40-2a7a-402e-a052-4e6b9be62bbe")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mIncomingAssoc != null)? ((BpmnBaseElementData)data).mIncomingAssoc:SmMultipleDependency.EMPTY;
            }

            @objid ("2949c77d-1662-4e10-9b7e-d79af44a9040")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mIncomingAssoc = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mIncomingAssoc;
            }

            @objid ("4804e91c-61e7-4252-8fb7-76737ed4db8f")
            @Override
            public SmDependency getSymetric() {
                return BpmnAssociationData.Metadata.TargetRefDep();
            }

        }

        @objid ("004db6ec-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IncomingFlowSmDependency extends SmMultipleDependency {
            @objid ("e5fd571c-5282-4a2f-a849-48b4ff8b7c67")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mIncomingFlow != null)? ((BpmnBaseElementData)data).mIncomingFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("b569298e-5a40-4419-88bf-e94f19b5c4bc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mIncomingFlow = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mIncomingFlow;
            }

            @objid ("63896ad3-ea39-49f1-8b46-a8ea2766dba8")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.TargetRefDep();
            }

        }

        @objid ("004e2366-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutgoingFlowSmDependency extends SmMultipleDependency {
            @objid ("9189ad9c-a580-4bca-bdf0-cf49e03a6486")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mOutgoingFlow != null)? ((BpmnBaseElementData)data).mOutgoingFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("27c1fec5-2484-4fb0-aa4f-2bbc5489e3fd")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mOutgoingFlow = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mOutgoingFlow;
            }

            @objid ("bad38776-964f-48f9-a824-d7ca11088561")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.SourceRefDep();
            }

        }

    }

}
