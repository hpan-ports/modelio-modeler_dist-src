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
    @objid ("dae4d192-cbd1-4ebc-947c-e76a79b6572e")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("a5a6f128-e0f1-422f-bf42-80a37745ae07")
    @SmaMetaAssociation(metaName="OperationRef", typeDataClass=BpmnOperationData.class, min=0, max=1, smAssociationClass=Metadata.OperationRefSmDependency.class, partof = true)
     SmObjectImpl mOperationRef;

    @objid ("3753029f-2e93-4f03-b9fa-80aa41189c20")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00863472-c4c2-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fc9e1f90-8448-423f-96c3-c7b4862ab9f3")
        private static SmClass smClass = null;

        @objid ("121b60c9-89d3-430d-9bdc-bd14e50143cf")
        private static SmDependency MessageRefDep = null;

        @objid ("581ee4d3-b3a4-43a3-8812-075263aaef75")
        private static SmDependency OperationRefDep = null;

        @objid ("a4af2482-7bf9-4c38-bbf6-0647297a10b9")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMessageEventDefinitionData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("06891dda-b271-455d-9ab6-a2e900e9b48e")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("94422185-2797-4839-8c7d-794ed4958f24")
        public static SmDependency OperationRefDep() {
            if (OperationRefDep == null) {
            	OperationRefDep = classof().getDependencyDef("OperationRef");
            }
            return OperationRefDep;
        }

        @objid ("685a1603-14c1-4761-89c8-c1d83d0fe5c6")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("131efc42-25c9-4b28-ae2e-745508a8dbfd")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("bdf608d5-cc7e-4347-b746-d4900fe66eb3")
        public static SmDependency getOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OperationRefDep;
        }

        @objid ("008677d4-c4c2-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("85616741-d02c-440b-beda-869d38592425")
            public ISmObjectData createData() {
                return new BpmnMessageEventDefinitionData();
            }

            @objid ("9915e011-a96d-469e-b728-7a20b32db120")
            public SmObjectImpl createImpl() {
                return new BpmnMessageEventDefinitionImpl();
            }

        }

        @objid ("0086d9e0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class OperationRefSmDependency extends SmSingleDependency {
            @objid ("509d89b9-24d7-4069-b651-37ad2731a5a0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageEventDefinitionData) data).mOperationRef;
            }

            @objid ("44e07712-1d62-4aea-9e36-fb44a63b9dac")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageEventDefinitionData) data).mOperationRef = value;
            }

            @objid ("4a4cdd4b-89ee-46d0-9a00-70f715cde3ed")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.EventDefinitionDep();
            }

        }

        @objid ("00874ec0-c4c2-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("8c87cbf2-7c5a-4ed6-848f-08d0077f4066")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageEventDefinitionData) data).mMessageRef;
            }

            @objid ("dc12f727-e3b9-4300-84ae-6afc58bc5d69")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageEventDefinitionData) data).mMessageRef = value;
            }

            @objid ("3c63f1cb-32ed-447c-819f-af2b5230199f")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.EventDefinitionDep();
            }

        }

    }

}
