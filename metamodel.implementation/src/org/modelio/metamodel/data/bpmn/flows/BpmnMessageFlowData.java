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
    @objid ("a40c8ab3-f4fa-4569-bfec-8a3ced57f48e")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("c2340deb-5803-40ea-ad8c-b8b0a9c413bf")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     SmObjectImpl mSourceRef;

    @objid ("f44b3f98-5b7a-45b9-b0af-bcba1eaf1c2e")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("d90f66c4-fb71-482f-9117-bc17a12c6695")
    @SmaMetaAssociation(metaName="Collaboration", typeDataClass=BpmnCollaborationData.class, min=1, max=1, smAssociationClass=Metadata.CollaborationSmDependency.class)
     SmObjectImpl mCollaboration;

    @objid ("2a60cb2b-819c-4273-ba31-fd89d66d58f8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0006b17a-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("00fea81f-97fb-488c-8872-6411bb9984db")
        private static SmClass smClass = null;

        @objid ("78e275ff-8ad2-4bb2-ba61-6e4525ecc364")
        private static SmDependency MessageRefDep = null;

        @objid ("930685c2-608f-437e-9a0d-0e6990c75da7")
        private static SmDependency SourceRefDep = null;

        @objid ("6ae96d6a-ff68-48aa-a7d2-ee6d3da8c6e2")
        private static SmDependency TargetRefDep = null;

        @objid ("5036ce88-1b6f-4d9c-8354-1b8c22936a4d")
        private static SmDependency CollaborationDep = null;

        @objid ("4b8a214f-b480-440f-b8c8-c4d9cc2da4ba")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMessageFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("3e0f5f31-b4da-4383-b626-ae6b8dbf53d1")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("a003ec04-1276-483a-a897-5a562b307c62")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("2bc70ea4-38b7-4fd8-a5f8-fb625d32cf5d")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("1ac110cb-3ce7-485b-96cb-851cf2c9710d")
        public static SmDependency CollaborationDep() {
            if (CollaborationDep == null) {
            	CollaborationDep = classof().getDependencyDef("Collaboration");
            }
            return CollaborationDep;
        }

        @objid ("c41acaed-2de1-4f93-b0fb-3e8c8eb22463")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("2b7b6a66-df7b-4588-9ef0-5785fe94bd10")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("9c91d107-4299-4b93-b305-e06ca92d5019")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("02e0e646-965c-4b7a-8b15-4366fb998263")
        public static SmDependency getCollaborationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CollaborationDep;
        }

        @objid ("3cdf9c51-af0b-4383-aacb-de8c315c2ca2")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("0006f27a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("5bfede63-9de0-4ca9-93e6-2646cbba0a5f")
            public ISmObjectData createData() {
                return new BpmnMessageFlowData();
            }

            @objid ("a0539579-0da3-4b1d-9a13-3b3fe4e64140")
            public SmObjectImpl createImpl() {
                return new BpmnMessageFlowImpl();
            }

        }

        @objid ("000754e0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("c2a0dfc5-115d-4925-9429-d2e4fe6db9c6")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mMessageRef;
            }

            @objid ("048800cf-b988-4d31-845b-5eabb40e8e66")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mMessageRef = value;
            }

            @objid ("a92762be-f8a7-427c-9c97-06b3a23523a7")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.MessageFlowDep();
            }

        }

        @objid ("0007c902-c4c6-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmSingleDependency {
            @objid ("e30ccd52-55f0-4fd1-9481-cd57f42d6abd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mSourceRef;
            }

            @objid ("82eadf69-1c42-4dae-af44-9f80836a4b0e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mSourceRef = value;
            }

            @objid ("9c2802d7-4fc8-4dac-9ba0-6a488366dd49")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.OutgoingFlowDep();
            }

        }

        @objid ("00083d24-c4c6-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("26b3f42f-c6d2-4084-a55d-8a9acfe9addd")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mTargetRef;
            }

            @objid ("f7610b12-3af7-4ed9-a141-3ffa64f15b3e")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mTargetRef = value;
            }

            @objid ("11b6b43a-30f6-46fe-af31-5fa5626820d2")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.IncomingFlowDep();
            }

        }

        @objid ("0008b1aa-c4c6-1fd8-97fe-001ec947cd2a")
        public static class CollaborationSmDependency extends SmSingleDependency {
            @objid ("06fe9ecf-467b-4179-a6ed-21383b7de4ce")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mCollaboration;
            }

            @objid ("e210d461-8f87-47f0-9c62-eadb7cfdae15")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mCollaboration = value;
            }

            @objid ("ed723a5e-5e58-4666-a2f8-005d417db4b0")
            @Override
            public SmDependency getSymetric() {
                return BpmnCollaborationData.Metadata.MessageFlowDep();
            }

        }

    }

}
