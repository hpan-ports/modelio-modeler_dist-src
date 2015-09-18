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
    @objid ("e8d9e291-182d-42e9-b18e-12d4a879a249")
    @SmaMetaAssociation(metaName="OutgoingAssoc", typeDataClass=BpmnAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingAssocSmDependency.class)
     List<SmObjectImpl> mOutgoingAssoc = null;

    @objid ("706ca694-547e-451b-b178-e90619e1d590")
    @SmaMetaAssociation(metaName="IncomingAssoc", typeDataClass=BpmnAssociationData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingAssocSmDependency.class)
     List<SmObjectImpl> mIncomingAssoc = null;

    @objid ("6422ac59-cce2-4840-8ac9-9fb02aecb103")
    @SmaMetaAssociation(metaName="IncomingFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.IncomingFlowSmDependency.class)
     List<SmObjectImpl> mIncomingFlow = null;

    @objid ("f1268c87-3f64-4ad9-ab2d-ea89787d8166")
    @SmaMetaAssociation(metaName="OutgoingFlow", typeDataClass=BpmnMessageFlowData.class, min=0, max=-1, smAssociationClass=Metadata.OutgoingFlowSmDependency.class)
     List<SmObjectImpl> mOutgoingFlow = null;

    @objid ("ccc6b7f1-4f39-43ff-894d-e51a44923aaa")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("004c525c-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("bab47413-bfeb-496c-a402-fa6987f4c0ab")
        private static SmClass smClass = null;

        @objid ("b43dae3c-4977-49b7-8cb4-7d8b473db925")
        private static SmDependency OutgoingAssocDep = null;

        @objid ("e0fccfd8-400f-4ca1-80c7-4bfc4e8e3550")
        private static SmDependency IncomingAssocDep = null;

        @objid ("6ad5d7a7-df70-485b-afba-d13bd63c5d28")
        private static SmDependency IncomingFlowDep = null;

        @objid ("2d4b01c0-3091-4185-9c30-c5484de1c0ed")
        private static SmDependency OutgoingFlowDep = null;

        @objid ("17e7d6eb-257b-4528-9936-36683c2a9c66")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnBaseElementData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bef65771-ef5c-4d49-907c-ea2ff33e1e28")
        public static SmDependency OutgoingAssocDep() {
            if (OutgoingAssocDep == null) {
            	OutgoingAssocDep = classof().getDependencyDef("OutgoingAssoc");
            }
            return OutgoingAssocDep;
        }

        @objid ("13ced989-a6b8-493f-b2f3-1e6332e25188")
        public static SmDependency IncomingAssocDep() {
            if (IncomingAssocDep == null) {
            	IncomingAssocDep = classof().getDependencyDef("IncomingAssoc");
            }
            return IncomingAssocDep;
        }

        @objid ("e845e706-5530-4370-bc3e-248a72af8859")
        public static SmDependency IncomingFlowDep() {
            if (IncomingFlowDep == null) {
            	IncomingFlowDep = classof().getDependencyDef("IncomingFlow");
            }
            return IncomingFlowDep;
        }

        @objid ("98f123ad-defc-42fc-97b1-14d82bf5b4af")
        public static SmDependency OutgoingFlowDep() {
            if (OutgoingFlowDep == null) {
            	OutgoingFlowDep = classof().getDependencyDef("OutgoingFlow");
            }
            return OutgoingFlowDep;
        }

        @objid ("8d3a01be-89c5-4ff5-ac0b-e436f6b803e2")
        public static SmDependency getIncomingAssocDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingAssocDep;
        }

        @objid ("374c5a5e-225c-4dd5-8022-a08be015f50d")
        public static SmDependency getIncomingFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IncomingFlowDep;
        }

        @objid ("08dca75e-58ba-4298-8e43-d3a51dfc1134")
        public static SmDependency getOutgoingFlowDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingFlowDep;
        }

        @objid ("1377aa56-c62c-4b1c-8dc9-264a617234a1")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("095a80bc-2abf-483d-8ea0-9289b4480a46")
        public static SmDependency getOutgoingAssocDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutgoingAssocDep;
        }

        @objid ("004c926c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9b15ca3a-f2b2-475b-97dd-a8f8854b497e")
            public ISmObjectData createData() {
                throw new UnsupportedOperationException();
            }

            @objid ("e04e6509-ea26-4bc7-a7c7-65884d956f1e")
            public SmObjectImpl createImpl() {
                throw new UnsupportedOperationException();
            }

        }

        @objid ("004cf446-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutgoingAssocSmDependency extends SmMultipleDependency {
            @objid ("08cb72ae-8260-4a94-b007-324fe16dc6c9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mOutgoingAssoc != null)? ((BpmnBaseElementData)data).mOutgoingAssoc:SmMultipleDependency.EMPTY;
            }

            @objid ("8f4ba933-3f53-43b7-93b7-6e515d259116")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mOutgoingAssoc = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mOutgoingAssoc;
            }

            @objid ("fe28aa43-fb23-4882-ad35-ec8a56a5d66f")
            @Override
            public SmDependency getSymetric() {
                return BpmnAssociationData.Metadata.SourceRefDep();
            }

        }

        @objid ("004d5530-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IncomingAssocSmDependency extends SmMultipleDependency {
            @objid ("56fafefb-c8f4-4892-80be-5c41154c0647")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mIncomingAssoc != null)? ((BpmnBaseElementData)data).mIncomingAssoc:SmMultipleDependency.EMPTY;
            }

            @objid ("e8a751c6-b3b8-4bf1-ba87-72d2a22a2916")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mIncomingAssoc = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mIncomingAssoc;
            }

            @objid ("dfacb7f9-661d-413e-8a0f-df990f4d13de")
            @Override
            public SmDependency getSymetric() {
                return BpmnAssociationData.Metadata.TargetRefDep();
            }

        }

        @objid ("004db6ec-c4c4-1fd8-97fe-001ec947cd2a")
        public static class IncomingFlowSmDependency extends SmMultipleDependency {
            @objid ("a260a477-538e-4a81-bbdd-dae528f5a344")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mIncomingFlow != null)? ((BpmnBaseElementData)data).mIncomingFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("850fb2db-085f-474f-a60a-e49223297a42")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mIncomingFlow = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mIncomingFlow;
            }

            @objid ("cd2048c0-e3b9-4b47-b598-a88139443545")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.TargetRefDep();
            }

        }

        @objid ("004e2366-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OutgoingFlowSmDependency extends SmMultipleDependency {
            @objid ("26570bae-da65-4ab9-8bbf-72e22a9f867a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnBaseElementData)data).mOutgoingFlow != null)? ((BpmnBaseElementData)data).mOutgoingFlow:SmMultipleDependency.EMPTY;
            }

            @objid ("ec83be64-111e-45d9-8653-95eae35e6f9e")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnBaseElementData) data).mOutgoingFlow = new ArrayList<>(initialCapacity);
                return ((BpmnBaseElementData) data).mOutgoingFlow;
            }

            @objid ("397b3256-c803-44e9-b9db-4089ae3428b4")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageFlowData.Metadata.SourceRefDep();
            }

        }

    }

}
