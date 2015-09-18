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
package org.modelio.metamodel.data.bpmn.flows;

import java.util.ArrayList;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.bpmn.processCollaboration.BpmnCollaborationData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.impl.bpmn.flows.BpmnMessageFlowImpl;
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

@objid ("007cb096-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnMessageFlow.class, factory=BpmnMessageFlowData.Metadata.ObjectFactory.class)
public class BpmnMessageFlowData extends BpmnBaseElementData {
    @objid ("c8919348-d172-4cbe-a87c-a45811dd4652")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("2ee09de5-9b3a-41dc-8363-571d6ce0c2ef")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     SmObjectImpl mSourceRef;

    @objid ("bcfe04a3-943f-4465-a05e-98a25c50967b")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("75982c52-faa3-414b-a443-e1ad529df7cc")
    @SmaMetaAssociation(metaName="Collaboration", typeDataClass=BpmnCollaborationData.class, min=1, max=1, smAssociationClass=Metadata.CollaborationSmDependency.class)
     SmObjectImpl mCollaboration;

    @objid ("84f432e9-29e0-4055-8486-2b7ddcda2db5")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0006b17a-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("44d1a1fe-06ed-4dd6-ab16-0065eac4d91b")
        private static SmClass smClass = null;

        @objid ("69a64f23-e486-4ab9-8db4-d26fb2fea299")
        private static SmDependency MessageRefDep = null;

        @objid ("b727c107-6406-4546-a3b4-4a6b6fa691d1")
        private static SmDependency SourceRefDep = null;

        @objid ("7d765b70-daa1-442d-8028-9bf3d1861ad1")
        private static SmDependency TargetRefDep = null;

        @objid ("e030fe8e-68d9-4ea4-8ce5-d27b7965267b")
        private static SmDependency CollaborationDep = null;

        @objid ("a94077f7-5942-471b-b411-17cb440fa584")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMessageFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("7b34d614-ac58-44fb-927a-a0c7ab7f38d8")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("6d729a8f-81d8-4b04-9f1d-8b8606a73805")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("13cc6652-6fd1-43d7-a37f-6048b02d0238")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("f08386f0-75c6-4849-a2ae-b989536791e2")
        public static SmDependency CollaborationDep() {
            if (CollaborationDep == null) {
            	CollaborationDep = classof().getDependencyDef("Collaboration");
            }
            return CollaborationDep;
        }

        @objid ("c14a1c36-920a-4b0e-8d9d-7e83be9674df")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("b35ccbba-2248-406c-9cee-eb4792496f3c")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("34a6aac1-3bce-4eb1-9068-59ce3cde72df")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("25979eb4-2b16-4ed3-aeaf-5dfbdf977126")
        public static SmDependency getCollaborationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CollaborationDep;
        }

        @objid ("efd6c64b-bb67-4689-a310-8deba2c20b1c")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("0006f27a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("0bef7a01-e747-4ee7-9ff6-15ca0de19f40")
            public ISmObjectData createData() {
                return new BpmnMessageFlowData();
            }

            @objid ("2e1abe28-7ddd-4f78-9ec4-b04f27f78114")
            public SmObjectImpl createImpl() {
                return new BpmnMessageFlowImpl();
            }

        }

        @objid ("000754e0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("469a94c5-5e53-4b31-8296-ac293bf1f17b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mMessageRef;
            }

            @objid ("72e20d96-9014-4f85-a8d5-0be1acef82cc")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mMessageRef = value;
            }

            @objid ("6b704f58-db4b-4d61-a127-a5a80872eb3b")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.MessageFlowDep();
            }

        }

        @objid ("0007c902-c4c6-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmSingleDependency {
            @objid ("6d48425a-f637-4130-8bcf-9af883becc4e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mSourceRef;
            }

            @objid ("19dff57a-fbdc-48ae-aa73-0ba083a26379")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mSourceRef = value;
            }

            @objid ("9533ec63-df31-425a-b4c7-8f1caf1c2ff2")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.OutgoingFlowDep();
            }

        }

        @objid ("00083d24-c4c6-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("e89dbece-10c5-4639-8e1c-2e0ec373eb3c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mTargetRef;
            }

            @objid ("82ffc6eb-5592-4dbe-b075-b9618412aadb")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mTargetRef = value;
            }

            @objid ("97996bf3-b881-4dd9-baf2-f4a1dce29f69")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.IncomingFlowDep();
            }

        }

        @objid ("0008b1aa-c4c6-1fd8-97fe-001ec947cd2a")
        public static class CollaborationSmDependency extends SmSingleDependency {
            @objid ("e621c48c-138d-4de3-8884-7827dbd0786c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mCollaboration;
            }

            @objid ("5f17090c-00be-4235-95c0-8e11865a67d8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mCollaboration = value;
            }

            @objid ("301f8772-6760-41e8-9796-5ee4bc79da6a")
            @Override
            public SmDependency getSymetric() {
                return BpmnCollaborationData.Metadata.MessageFlowDep();
            }

        }

    }

}
