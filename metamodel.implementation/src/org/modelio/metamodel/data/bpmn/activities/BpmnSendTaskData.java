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
    @objid ("99ef1a87-c6b6-471d-9f89-e280310dbce7")
    @SmaMetaAttribute(metaName="Implementation", type=String.class, smAttributeClass=Metadata.ImplementationSmAttribute.class)
     Object mImplementation = "##WebService";

    @objid ("1eaa062b-75ad-49e8-948b-8a75f8c985e0")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("316d5335-5dc2-47ac-823a-75160b1cdfcd")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("2bfc6689-36c5-4923-a91c-fc260b92d013")
    @SmaMetaAssociation(metaName="CalledOperation", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.CalledOperationSmDependency.class, partof = true)
     SmObjectImpl mCalledOperation;

    @objid ("995955ee-e844-4b6d-a12c-e3ba467cbb1b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("008c7490-c4c3-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("e1784057-f092-48c4-b2f9-4f8e19be72b9")
        private static SmClass smClass = null;

        @objid ("1ac2fdbb-e878-4146-a6c1-ad5e074ea616")
        private static SmAttribute ImplementationAtt = null;

        @objid ("139a6a6a-113e-4a3e-aa69-bcf1a27b62ed")
        private static SmDependency MessageRefDep = null;

        @objid ("7a16e1c2-3266-403d-aa1f-106da27eaadd")
        private static SmDependency OperationRefDep = null;

        @objid ("1207986c-ff7d-41da-b0dc-78790a895a33")
        private static SmDependency CalledOperationDep = null;

        @objid ("241be778-02f3-45b3-b3dd-d5f77c9d0de5")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnSendTaskData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8c74d1aa-443d-487d-a9e0-eaa1298c2431")
        public static SmAttribute ImplementationAtt() {
            if (ImplementationAtt == null) {
            	ImplementationAtt = classof().getAttributeDef("Implementation");
            }
            return ImplementationAtt;
        }

        @objid ("3123c08d-4acf-49d2-913c-88550cbaad2c")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("3a5fb7eb-5dca-42eb-92ff-1ff73fbb38ac")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("cd8ebafc-efcc-4431-99f6-dd9e898aff69")
        public static SmDependency CalledOperationDep() {
            if (CalledOperationDep == null) {
            	CalledOperationDep = classof().getDependencyDef("CalledOperation");
            }
            return CalledOperationDep;
        }

        @objid ("91bc266f-f9a2-4030-86de-e0772b2c79a3")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("aa48878a-eb94-4fd9-8ee4-0ef6f8d66668")
        public static SmDependency getCalledOperationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CalledOperationDep;
        }

        @objid ("0fa61889-944c-420a-b9f7-6c052d636936")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("edced98d-f492-4e62-9853-efc50c931f20")
        public static SmAttribute getImplementationAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationAtt;
        }

        @objid ("5f25221a-772e-441d-a8b5-6a8cfa2aeecf")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("008cb6a8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("82c51793-9a2b-448f-ab07-6fb04fec76bc")
            public ISmObjectData createData() {
                return new BpmnSendTaskData();
            }

            @objid ("a22ac99b-322d-462c-a1f1-7089d65f3c95")
            public SmObjectImpl createImpl() {
                return new BpmnSendTaskImpl();
            }

        }

        @objid ("008d1850-c4c3-1fd8-97fe-001ec947cd2a")
        public static class ImplementationSmAttribute extends SmAttribute {
            @objid ("d26a8d30-c535-4eb8-968d-46524585ab35")
            public Object getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mImplementation;
            }

            @objid ("61ae4468-27c4-4b3e-bf4d-7d9236de42d4")
            public void setValue(ISmObjectData data, Object value) {
                ((BpmnSendTaskData) data).mImplementation = value;
            }

        }

        @objid ("008d7b1a-c4c3-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("bf8290e1-6ef7-40c9-93f7-5252491bf44d")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mOperationRef;
            }

            @objid ("40446e65-2c89-4e82-b9a5-6cda03a84b56")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSendTaskData) data).mOperationRef = value;
            }

            @objid ("ab2e6776-cd09-441f-9902-b30f1f4ad7ca")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.SenderDep();
            }

        }

        @objid ("008df78e-c4c3-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("310f7909-21d6-4b03-9796-3c90c17261db")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mMessageRef;
            }

            @objid ("71474fff-99c9-40cf-b912-a1c7890431e5")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSendTaskData) data).mMessageRef = value;
            }

            @objid ("e283dbda-63dd-4170-b454-3f8a50550889")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.SenderDep();
            }

        }

        @objid ("008e6ea8-c4c3-1fd8-97fe-001ec947cd2a")
        public static class CalledOperationSmDependency extends SmSingleDependency {
            @objid ("14a6efbd-e71b-413a-a841-61a670992925")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnSendTaskData) data).mCalledOperation;
            }

            @objid ("6975fd98-e594-4bbc-8182-e1c6c0c4b12a")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnSendTaskData) data).mCalledOperation = value;
            }

            @objid ("645d78e7-8410-43bf-b895-a50d9f59b13c")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.CallerSendTaskDep();
            }

        }

    }

}
