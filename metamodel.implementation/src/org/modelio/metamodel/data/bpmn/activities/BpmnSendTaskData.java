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
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.bpmn.activities.BpmnSendTaskImpl;
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

@objid ("0082e34e-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnSendTask.class, factory=BpmnSendTaskData.Metadata.ObjectFactory.class)
public class BpmnSendTaskData extends BpmnTaskData {
    @objid ("f13173cd-a56d-44e9-8e37-8972874a2c03")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("48e47829-16db-47b0-8d9c-7ff271f42cfe")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("703fdb79-82bb-45c4-afa5-2192651ce030")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("d285a7b0-65df-4175-971c-a1bbe2d93411")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("cc330e35-b731-4577-88f0-a842d394cda8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008c7490-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7dada3ff-b1f3-44b9-a37f-213c0f164dd7")
        private static SmClass smClass = null;

        @objid ("4a006bd8-ee9e-44e8-94ce-307e03566853")
        private static SmAttribute ImplementationAtt = null;

        @objid ("ad29c758-dfc9-428a-9005-81306646ebdf")
        private static SmDependency MessageRefDep = null;

        @objid ("6d70726f-1192-4ad7-8cf5-599265a9beae")
        private static SmDependency OperationRefDep = null;

        @objid ("49ecaa29-398a-4f15-b4ed-c751546e5949")
        private static SmDependency CalledOperationDep = null;

        @objid ("c9d686e6-f08b-4536-b289-d396dc28a3ce")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSendTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("756fed50-b856-4cdf-9246-6c5db57fd401")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("346b2abc-de39-4c3f-9bd5-23c430a482d0")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("cf10d993-9bde-409a-bca9-16d8e143d90e")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("95865e99-77eb-444d-9dc7-afe6f1a1cba9")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("33febdc1-55fb-47dc-8468-0beb2da4f526")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("52b55e84-94d8-48eb-9820-c5f71929a8d2")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("e03fe540-7fab-4783-8487-7392cefe7bcd")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("0cff9a49-fd20-44e4-8a08-007f732764e8")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("95eda5e2-4bc4-4b89-9fee-911a843fb78e")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("008cb6a8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("e5f643f9-1dd1-4f61-822a-bff7ec2490e3")
            public ISmObjectData createData() {
                return new BpmnSendTaskData();
            }

            @objid ("802d9ca6-a0fe-44a5-a335-4f7cece063d7")
            public SmObjectImpl createImpl() {
                return new BpmnSendTaskImpl();
            }

        }

        @objid ("008d1850-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("e69a215a-1a40-4e08-99a0-89dc72bbfae3")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mImplementation;
            }

            @objid ("98005fd1-af30-4e6b-930c-adae348a3846")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSendTaskData) data).mImplementation = value;
            }

        }

        @objid ("008d7b1a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("01c1942a-f5fb-4e88-83c3-5f8110de362b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mOperationRef;
            }

            @objid ("253506d7-5cf2-4c94-92cb-720ef28a1b95")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSendTaskData) data).mOperationRef = value;
            }

            @objid ("999f26b5-f0d3-464a-b15a-adeb73798887")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.SenderDep();
            }

        }

        @objid ("008df78e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("ec0c564d-4628-4029-b140-783014b6ee92")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mMessageRef;
            }

            @objid ("e24e0cfd-eda1-4ebb-a0e3-7c43e7783e79")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSendTaskData) data).mMessageRef = value;
            }

            @objid ("ab3acfa1-6126-4fbd-90d6-057bcfcbe2a0")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.SenderDep();
            }

        }

        @objid ("008e6ea8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("aea51d2f-ba4f-4409-9b16-5076d17ac9c6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mCalledOperation;
            }

            @objid ("3012ef17-ee24-4419-9bc7-022aeab633d6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSendTaskData) data).mCalledOperation = value;
            }

            @objid ("2c7d936e-388a-424a-aa76-f4b0ce529370")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerSendTaskDep();
            }

        }

    }

}
