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
    @objid ("47c592a5-81b0-4e2c-b8b9-84955a2e9cf1")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("8c136493-8545-4705-a13b-affdf9cd6627")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("b775f7c4-1e4e-4362-93d8-8aa448c0cbf5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00863472-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("f23f150b-0e21-4806-bf6d-d3e1aeddffd5")
        private static SmClass smClass = null;

        @objid ("e64be5e3-9961-4fd1-a898-099b276e1ab1")
        private static SmDependency MessageRefDep = null;

        @objid ("f741bb54-bdaf-447d-8072-7c099f8f986c")
        private static SmDependency OperationRefDep = null;

        @objid ("d14c0a2e-20ed-4133-9411-302b99f57b57")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMessageEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("744fafcb-b9ea-40fa-a062-ff3ba8bc70e1")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("b54356ff-8613-4d24-af8a-b29af6908652")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("2e7c967c-4c6f-4713-a795-91c5564cd968")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("ce42e9b6-6f20-4128-86fa-566dc03ff335")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("e086d319-c54a-47e3-aafa-99ab716e99cc")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("008677d4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("3c940c1a-a3ed-4a7f-8b07-e2e3e321eba7")
            public ISmObjectData createData() {
                return new BpmnMessageEventDefinitionData();
            }

            @objid ("4b2016fd-a2c1-423a-93fe-81138b349de4")
            public SmObjectImpl createImpl() {
                return new BpmnMessageEventDefinitionImpl();
            }

        }

        @objid ("0086d9e0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("447b2421-eb5e-4c58-befd-9984a47d23df")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageEventDefinitionData) data).mOperationRef;
            }

            @objid ("a2d8fd82-ccfd-4d0c-92c5-a5192da8cd32")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageEventDefinitionData) data).mOperationRef = value;
            }

            @objid ("b28af911-20f7-4a10-9541-f1109b4f2b9d")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.EventDefinitionDep();
            }

        }

        @objid ("00874ec0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("f733bdbb-70dc-46e8-a9f4-405991d1744f")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageEventDefinitionData) data).mMessageRef;
            }

            @objid ("ab7ddcf8-c611-40e0-8b92-787a36d2dd55")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageEventDefinitionData) data).mMessageRef = value;
            }

            @objid ("af7d6170-a7b3-498a-ae77-8818a08f3b41")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.EventDefinitionDep();
            }

        }

    }

}
