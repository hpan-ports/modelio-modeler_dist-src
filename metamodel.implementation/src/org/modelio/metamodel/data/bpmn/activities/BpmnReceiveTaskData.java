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
    @objid ("2968f6bc-1e2f-457f-b712-0416af6e6328")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("a30913a2-da6f-47b9-8cc9-0a017ae9c828")
    @SmaMetaAttribute(metaName="Instanciate", type=Boolean.class, smAttributeClass=Metadata.InstanciateSmAttribute.class)
     Object mInstanciate = false;

    @objid ("7a495f3a-90a6-4631-ba39-62d0b2a5d472")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("1fa81aed-3f54-4466-aded-a1d9d14c69f7")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("54290d35-57dc-4785-8c4d-48a30c141f24")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("a371e62b-18dd-478f-875d-f49e1df9f41e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0061ef4a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("958ff9b7-1288-46ef-bf35-fe709b0e791c")
        private static SmClass smClass = null;

        @objid ("1533f8ef-0885-436f-8b52-87991244e559")
        private static SmAttribute ImplementationAtt = null;

        @objid ("a56c3e0c-a954-4d5a-9c98-5f638190a92d")
        private static SmAttribute InstanciateAtt = null;

        @objid ("e9051c8b-c3b9-415d-ae64-d0000c3dcdc5")
        private static SmDependency MessageRefDep = null;

        @objid ("3c11ddad-b8ce-4e6e-b31f-68b6d0707ff3")
        private static SmDependency OperationRefDep = null;

        @objid ("6c032067-5273-417b-ae70-cb2d4b61d318")
        private static SmDependency CalledOperationDep = null;

        @objid ("5504ac78-23cd-47cf-830e-44be3eafc783")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnReceiveTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("11d0f379-e179-430f-b77d-d5cfdb20f6a7")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("ec79fcf4-dd19-4170-a5cd-8a56da1c68d6")
        public static SmAttribute InstanciateAtt() {
            if (InstanciateAtt == null) {
            	InstanciateAtt = classof().getAttributeDef("Instanciate");
            }
            return InstanciateAtt;
        }

        @objid ("5b6a3026-477b-461e-b79d-05255a097538")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("1f110e87-df1f-4eee-b58f-fc6b43a756ed")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("34698db2-86ac-4e07-b394-f2368e511b93")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("8567991b-cb4e-4582-8f5e-111ca8163397")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("bad6a9a6-91ba-4f0b-85e8-3706728d59be")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("9d1751cf-e1e4-44f7-86da-5ce8125d2bb1")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("a44a4fef-bc49-48c0-87c8-43c9186a67fd")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("0765cf19-3532-4d2c-9a0e-734d33808f10")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("518312da-a277-4548-a735-398d9e7583dd")
        public static SmAttribute getInstanciateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciateAtt;
        }

        @objid ("00622e92-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("9b4bb534-0916-4e7f-ac44-b46590dcc3f9")
            public ISmObjectData createData() {
                return new BpmnReceiveTaskData();
            }

            @objid ("1b9180e1-9ff8-4f96-acf8-b79f6b3ec336")
            public SmObjectImpl createImpl() {
                return new BpmnReceiveTaskImpl();
            }

        }

        @objid ("00628f54-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("bba671d7-fe86-4de0-a589-faeb097beca0")
            public Object getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mImplementation;
            }

            @objid ("d04efbe2-7864-4fb9-9894-52fd37ca8623")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnReceiveTaskData) data).mImplementation = value;
            }

        }

        @objid ("0062f96c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciateSmAttribute extends SmAttribute {
            @objid ("d5012360-42a4-4f02-98f9-e0472a8703cc")
            public Object getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mInstanciate;
            }

            @objid ("d2349e9f-ed4d-4367-8b43-aaf5636e7d17")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnReceiveTaskData) data).mInstanciate = value;
            }

        }

        @objid ("00635d4e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("d603cced-6564-40a9-a474-e0658ca0a1db")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mOperationRef;
            }

            @objid ("c5ce9cac-fc18-4da1-ab15-6b37e2b62fdb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnReceiveTaskData) data).mOperationRef = value;
            }

            @objid ("b3d268d2-f131-415c-80dc-e4959898e72e")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.ReceiverDep();
            }

        }

        @objid ("0063d206-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("3bebf22b-2392-4f4a-8880-bae9f2287295")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mMessageRef;
            }

            @objid ("7406f9ce-d58b-48fd-bc49-de6d69b8decb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnReceiveTaskData) data).mMessageRef = value;
            }

            @objid ("7da1304e-8983-47cb-9a3b-13e350e2e000")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.ReceiverDep();
            }

        }

        @objid ("0064475e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("2df21656-1f0a-4418-af8c-d84750efb91d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mCalledOperation;
            }

            @objid ("0336d0dc-9bd5-4dda-8d59-fd7388ae4eb5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnReceiveTaskData) data).mCalledOperation = value;
            }

            @objid ("ff7e057e-e1b9-4078-8a1b-a3bf7f6b930f")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerReceiveTaskDep();
            }

        }

    }

}
