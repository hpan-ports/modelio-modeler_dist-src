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
    @objid ("ed763500-fcf0-40f6-9838-2ca09e59d4e7")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("cdb84515-a1fb-4da0-af8c-5c327dbe8988")
    @SmaMetaAttribute(metaName="Instanciate", type=Boolean.class, smAttributeClass=Metadata.InstanciateSmAttribute.class)
     Object mInstanciate = false;

    @objid ("59ba82fe-e02e-4e81-ab09-d1b16094fd65")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("42dc41a5-7647-4fd9-b805-b6f8f623691a")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("cca220c1-350a-415c-ad64-a7ba9c701380")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("d7fc6279-5895-4fcf-ad2c-8832d25df0b6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0061ef4a-c4c4-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("89eb83af-00cf-4964-900f-b7ee66f469d1")
        private static SmClass smClass = null;

        @objid ("faaec257-4b36-4839-bc12-309a9c1f0307")
        private static SmAttribute ImplementationAtt = null;

        @objid ("774cee38-a9f5-44b2-8ea2-567b79bb86c0")
        private static SmAttribute InstanciateAtt = null;

        @objid ("edb16077-98ed-4475-a69f-ec8fba7a212e")
        private static SmDependency MessageRefDep = null;

        @objid ("4af4d0fb-a782-4552-86ba-a7319ce541f6")
        private static SmDependency OperationRefDep = null;

        @objid ("83392209-ec23-49c0-9eae-c866503e49fa")
        private static SmDependency CalledOperationDep = null;

        @objid ("463a46d1-d7e9-4003-9151-ddda3414d6c4")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnReceiveTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("bccd4e8f-831c-48a3-bbc7-7301928ce33a")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("4cc420e9-86eb-4d11-9784-61e3a697c2f9")
        public static SmAttribute InstanciateAtt() {
            if (InstanciateAtt == null) {
            	InstanciateAtt = classof().getAttributeDef("Instanciate");
            }
            return InstanciateAtt;
        }

        @objid ("0e4b5d9d-6cfb-480f-9ab5-68f525920401")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("9969cd63-974a-42da-a490-9ae951c7de75")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("f775f443-4a2b-40a4-94ac-def9b4da4438")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("7579fd44-6c69-49a8-ba4f-dc0262d53be2")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("d50b82d8-082d-4162-b878-c66fc93adf69")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("fe527a41-83dc-4fa8-9f01-6b71407c649d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("9689c692-bd7f-48c0-ae2d-ad887aadb58a")
        public static SmAttribute getInstanciateAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciateAtt;
        }

        @objid ("c95bde6e-84e3-437e-a2a0-f78569b1454b")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("f047ecf5-8266-43db-bd1c-6ba356f20d19")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("00622e92-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("04a65206-0c02-4616-8fca-fd5995cbd346")
            public ISmObjectData createData() {
                return new BpmnReceiveTaskData();
            }

            @objid ("53d84a07-d3e8-42d2-b278-7037d7e5aeae")
            public SmObjectImpl createImpl() {
                return new BpmnReceiveTaskImpl();
            }

        }

        @objid ("00628f54-c4c4-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("79b681de-1d86-47c3-8b68-250feab6dc35")
            public Object getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mImplementation;
            }

            @objid ("35b86fc6-bfec-464d-a532-0c023af2c96f")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnReceiveTaskData) data).mImplementation = value;
            }

        }

        @objid ("0062f96c-c4c4-1fd8-97fe-001ec947cd2a")
        public static class InstanciateSmAttribute extends SmAttribute {
            @objid ("04c7f56a-4014-4835-b058-59b1875c637d")
            public Object getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mInstanciate;
            }

            @objid ("362bd687-1fe4-49b5-8bd9-4b7fb48ed5e3")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnReceiveTaskData) data).mInstanciate = value;
            }

        }

        @objid ("00635d4e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("a8806745-da8e-4640-9443-f9cb341dde7a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mOperationRef;
            }

            @objid ("9aa4060d-306a-46ae-a368-1eebdb29ed1e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnReceiveTaskData) data).mOperationRef = value;
            }

            @objid ("81aad9e6-1fb5-40ad-8723-94152f11dc53")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.ReceiverDep();
            }

        }

        @objid ("0063d206-c4c4-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("c1210afb-bd48-47d7-a01f-8f16e2a4dab8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mMessageRef;
            }

            @objid ("e09d4fa8-6d7a-425e-8c7a-35d7b309bffe")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnReceiveTaskData) data).mMessageRef = value;
            }

            @objid ("b5861006-8a38-4a5b-98eb-49b217f57dfd")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.ReceiverDep();
            }

        }

        @objid ("0064475e-c4c4-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("d20021f5-1a4e-409b-afa7-ad22cb94b6c8")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnReceiveTaskData) data).mCalledOperation;
            }

            @objid ("6b635202-36d5-42b1-b23d-e2ef712fe13d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnReceiveTaskData) data).mCalledOperation = value;
            }

            @objid ("710a9613-cd27-44a3-a90a-b25b1becb833")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerReceiveTaskDep();
            }

        }

    }

}
