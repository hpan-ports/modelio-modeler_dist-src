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
package org.modelio.metamodel.data.bpmn.events;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.impl.bpmn.events.BpmnMessageEventDefinitionImpl;
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

@objid ("00913f52-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnMessageEventDefinition.class, factory=BpmnMessageEventDefinitionData.Metadata.ObjectFactory.class)
public class BpmnMessageEventDefinitionData extends BpmnEventDefinitionData {
    @objid ("b48b1103-e2e2-4f5c-aa42-1101b39ea3fd")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("b84fefed-1ed1-432f-b317-8d3a81eb83e8")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("7de01269-53d6-45a5-bd1f-794348c85e7b")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00863472-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("a7627eb1-ade7-4471-978a-78e29f2776cd")
        private static SmClass smClass = null;

        @objid ("e2e596da-820a-4874-9443-4f48f5d7ec9c")
        private static SmDependency MessageRefDep = null;

        @objid ("5158e30d-f474-4d5e-9d24-9e685c6164ed")
        private static SmDependency OperationRefDep = null;

        @objid ("20568baf-b582-42d8-a11e-e9dd41f7c561")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMessageEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("a89d4079-c088-4856-a9fe-cc10373e9575")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("14107461-514b-4ebe-a295-ef812e9b9ade")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("f7edc8c7-6385-48e7-b112-6d838a9657a8")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("1995196c-d2de-4593-91d6-e707f8a315a6")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("12f284d1-8ede-4fa9-ba14-04705ad897d1")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("008677d4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("efa654b5-4737-46ad-8bd1-012dcdbed31b")
            public ISmObjectData createData() {
                return new BpmnMessageEventDefinitionData();
            }

            @objid ("549bc25e-6468-4242-bc42-e836c97fc4ba")
            public SmObjectImpl createImpl() {
                return new BpmnMessageEventDefinitionImpl();
            }

        }

        @objid ("0086d9e0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("49638fd4-d25a-4641-9347-71611475dd16")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageEventDefinitionData) data).mOperationRef;
            }

            @objid ("e17dcf64-e9c3-4104-9ca3-d5fe1df3bc6b")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageEventDefinitionData) data).mOperationRef = value;
            }

            @objid ("af97e4af-359d-493a-8d19-7cfd5a7cb96c")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.EventDefinitionDep();
            }

        }

        @objid ("00874ec0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("057a68a2-abf7-4664-9369-78be9d8b860a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageEventDefinitionData) data).mMessageRef;
            }

            @objid ("30390db3-a802-4ff6-a197-83db8ca629fc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageEventDefinitionData) data).mMessageRef = value;
            }

            @objid ("ccca7a02-a5ea-4e5f-9a26-0b891c18a78f")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.EventDefinitionDep();
            }

        }

    }

}
