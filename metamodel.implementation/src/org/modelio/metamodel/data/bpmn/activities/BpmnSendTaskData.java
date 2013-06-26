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
    @objid ("c74d7f5a-7683-4e26-bf20-aec10f41a504")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("942e63d2-9238-4d57-a0a2-ca009ad0b472")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("685ee965-04be-41ff-99ac-9c795dafb01b")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("84076db2-6c22-46f7-8121-bef1ce215388")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("eb8c0959-690f-4700-ad91-47ae7826ade9")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008c7490-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("309f9ebd-85c4-4424-a96f-f8ebf53a1438")
        private static SmClass smClass = null;

        @objid ("03a510ea-39b7-4353-87ba-de8679ebdf4a")
        private static SmAttribute ImplementationAtt = null;

        @objid ("89c1fe53-554b-448d-beb1-4168766361cb")
        private static SmDependency MessageRefDep = null;

        @objid ("5a8e3790-6706-48ad-a92d-4d24c079e493")
        private static SmDependency OperationRefDep = null;

        @objid ("11f8e040-ca83-408a-8a4a-7d893d853d0d")
        private static SmDependency CalledOperationDep = null;

        @objid ("0af353b2-0f83-4307-be23-429d5606f3e1")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSendTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d7e5ba5d-3684-4ea4-9d79-1cba8c1e967b")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("94eb5340-c82d-4459-9a27-46cbe0c9098b")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("fd004f9d-c438-4752-9654-660ec7fbd6e8")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("a49e73fd-aeb8-41bf-8465-7a88f4064edc")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("a44f89bb-dabb-4042-b87a-fc5acb010f23")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("2a883277-8228-4110-9970-ccfddb192bb3")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("48ca670c-c770-4cce-afbb-21845493fffd")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("5af4aa25-3a8d-48da-a68d-dd839d0ad7b3")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("c706adf7-07ef-4314-8cb3-842914622b95")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008cb6a8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5e7d6bec-3f9e-439e-bb37-c35d20676f0b")
            public ISmObjectData createData() {
                return new BpmnSendTaskData();
            }

            @objid ("41a6ea3c-4710-4b1e-b29a-9d880d105b74")
            public SmObjectImpl createImpl() {
                return new BpmnSendTaskImpl();
            }

        }

        @objid ("008d1850-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("e37bbb54-e04d-457e-ae9f-92ca50a92392")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mImplementation;
            }

            @objid ("1723d685-cb48-41a0-b37e-121e83b62da3")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSendTaskData) data).mImplementation = value;
            }

        }

        @objid ("008d7b1a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("8981efde-7b07-43f0-8038-80e50a14be32")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mOperationRef;
            }

            @objid ("756e49fd-6ef1-4695-b1e2-ebe5f54b53a6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSendTaskData) data).mOperationRef = value;
            }

            @objid ("b3f2725e-4b00-478f-9449-313e7b770c6a")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.SenderDep();
            }

        }

        @objid ("008df78e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("bfc0124d-cff3-4139-8bed-1a586c899af0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mMessageRef;
            }

            @objid ("69ee43e9-f23a-47b0-86c7-0e0b83ba1c25")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSendTaskData) data).mMessageRef = value;
            }

            @objid ("af8dd32e-415a-4305-8e50-103765161098")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.SenderDep();
            }

        }

        @objid ("008e6ea8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("ac8be7b6-1b66-4371-9baf-307f38fe9bed")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mCalledOperation;
            }

            @objid ("73849182-9357-4a4c-bedf-ff5465385887")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSendTaskData) data).mCalledOperation = value;
            }

            @objid ("80e92d1a-3472-4f57-8f3d-ba2640473ff6")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerSendTaskDep();
            }

        }

    }

}
