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
package org.modelio.metamodel.data.bpmn.activities;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnReceiveTaskImpl;
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

@objid ("0081d3c8-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnReceiveTask.class, factory=BpmnReceiveTaskData.Metadata.ObjectFactory.class)
public class BpmnReceiveTaskData extends BpmnTaskData {
    @objid ("0ff3df4f-697e-4f5f-a981-298598571c95")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("9bd6a3af-8b05-4f32-a128-1c923de0f9ac")
    @SmaMetaAttribute(metaName="Instanciate", type=Boolean.class, smAttributeClass=Metadata.InstanciateSmAttribute.class)
     Object mInstanciate = false;

    @objid ("38b07d91-f8b7-450c-83c7-a6001d5e9e26")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("8a0f6093-02a0-4696-a1e7-403c92cdfc68")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("f715e426-8509-43af-bc33-497187b304e6")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("05d841e2-c61e-4c55-bdde-d16fc28ea031")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0061ef4a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("09cc3afe-48d5-47ca-bb60-159c2ddf4db0")
        private static SmClass smClass = null;

        @objid ("286d05d5-159f-4ea6-a095-51c279d59d0e")
        private static SmAttribute ImplementationAtt = null;

        @objid ("11021a28-f25b-43d4-acfd-01589e4d5ef5")
        private static SmAttribute InstanciateAtt = null;

        @objid ("e2966e59-9f6b-4ff2-bb4a-8be6d7af3251")
        private static SmDependency MessageRefDep = null;

        @objid ("455186b8-d205-4c95-8f1e-f4b1fd24d827")
        private static SmDependency OperationRefDep = null;

        @objid ("573d4eff-0fdf-45cb-a708-927868c9004e")
        private static SmDependency CalledOperationDep = null;

        @objid ("eceb6999-3c87-4e34-9441-e215442dfe48")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnReceiveTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("5a5b9096-93a5-4002-9a52-399e16698fd5")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("c7a1b086-6ad8-416e-88b2-7e7fc792cc5c")
        public static SmAttribute InstanciateAtt() {
            if (InstanciateAtt == null) {
            	InstanciateAtt = classof().getAttributeDef("Instanciate");
            }
            return InstanciateAtt;
        }

        @objid ("27ff8a97-e51d-4e3b-af4f-d56f6a81cf6e")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("e23595b0-dc6c-4adc-b27c-8edbd601c252")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("286812e0-66ae-4d46-a1e4-60eec0241594")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("1f9cb398-0e05-4648-8c4d-a811586b4d92")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("3c79158b-909f-4212-adcf-68984b206ee0")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("721f5a6d-10a5-46cc-960d-507cc8e05c10")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("b1c7dc3c-6db2-4b0c-aa33-54cb662c06e2")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("eeade503-aba4-414a-9b8c-092aad183d69")
        public static SmAttribute getInstanciateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciateAtt;
        }

        @objid ("cf75cf6d-5310-4009-ab52-13cf68f75fa2")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("00622e92-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("114a4605-4e54-4c56-9e7e-158f27e8abba")
            public ISmObjectData createData() {
                return new BpmnReceiveTaskData();
            }

            @objid ("c8ad6564-f86d-48a9-b356-9435ee301a67")
            public SmObjectImpl createImpl() {
                return new BpmnReceiveTaskImpl();
            }

        }

        @objid ("00628f54-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("d1bfb7eb-8acd-4149-b182-7e4e82327ae4")
            public Object getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mImplementation;
            }

            @objid ("b3bcfc16-f821-416b-849f-5ba35057c9e4")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnReceiveTaskData) data).mImplementation = value;
            }

        }

        @objid ("0062f96c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciateSmAttribute extends SmAttribute {
            @objid ("cb74658b-50a1-4ee2-a395-e3b23c745632")
            public Object getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mInstanciate;
            }

            @objid ("16466b99-ac50-4103-8d5f-270908ee99fc")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnReceiveTaskData) data).mInstanciate = value;
            }

        }

        @objid ("00635d4e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("61a7f364-c506-40ee-90cb-8ca4ca18db71")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mOperationRef;
            }

            @objid ("70912f6d-aaaa-4c3e-9f9b-1b512a76633d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnReceiveTaskData) data).mOperationRef = value;
            }

            @objid ("b9b818d2-1a9c-4e73-a5be-1aefec30da74")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.ReceiverDep();
            }

        }

        @objid ("0063d206-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("2d543fa8-d3d0-4e55-b06b-52576506d3e9")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mMessageRef;
            }

            @objid ("ac5601b6-e811-46d9-9020-9daefd3a0bd8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnReceiveTaskData) data).mMessageRef = value;
            }

            @objid ("6e372335-9d9b-4e24-97e4-c1bca835f00b")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.ReceiverDep();
            }

        }

        @objid ("0064475e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("9c05349d-4f2e-4912-9dca-e74a5d7b0894")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mCalledOperation;
            }

            @objid ("357e418e-52d1-4478-8b10-ea3a65a4b823")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnReceiveTaskData) data).mCalledOperation = value;
            }

            @objid ("5523149f-1bab-4614-98d5-82a040cc07bf")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerReceiveTaskDep();
            }

        }

    }

}
