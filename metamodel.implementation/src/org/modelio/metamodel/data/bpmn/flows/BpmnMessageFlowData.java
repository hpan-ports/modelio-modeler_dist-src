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
    @objid ("4633ae85-7f71-4308-9f2c-ad8293e827f9")
    @SmaMetaAssociation(metaName="MessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.MessageRefSmDependency.class, partof = true)
     SmObjectImpl mMessageRef;

    @objid ("466a9c9e-4db7-4b08-8f06-c90c049cbd87")
    @SmaMetaAssociation(metaName="SourceRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.SourceRefSmDependency.class, partof = true)
     SmObjectImpl mSourceRef;

    @objid ("2f05e2bd-46c0-41cb-b88d-1d916895c922")
    @SmaMetaAssociation(metaName="TargetRef", typeDataClass=BpmnBaseElementData.class, min=1, max=1, smAssociationClass=Metadata.TargetRefSmDependency.class, partof = true)
     SmObjectImpl mTargetRef;

    @objid ("6e88b359-256c-4f4c-9c69-10ae31880399")
    @SmaMetaAssociation(metaName="Collaboration", typeDataClass=BpmnCollaborationData.class, min=1, max=1, smAssociationClass=Metadata.CollaborationSmDependency.class)
     SmObjectImpl mCollaboration;

    @objid ("b1cd8ac4-fcc7-4f78-bb76-429bb7ef6aa6")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("0006b17a-c4c6-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("90e9cb8a-6f8b-4dc2-9b89-8b1220bf8e67")
        private static SmClass smClass = null;

        @objid ("73da2509-78f4-45a2-840d-431898ca78a8")
        private static SmDependency MessageRefDep = null;

        @objid ("f8eb1828-4d32-4943-ab66-19087bf153b2")
        private static SmDependency SourceRefDep = null;

        @objid ("eae6cc44-6c1f-4f86-a26d-3ceb31c0ba65")
        private static SmDependency TargetRefDep = null;

        @objid ("175f1b20-17a4-4292-8b43-29a82c5536e0")
        private static SmDependency CollaborationDep = null;

        @objid ("6b3a3cf0-6959-4dfe-80b8-4bbae7ffad34")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnMessageFlowData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("69aa46e1-7d21-4b2f-88b5-cde11d6bbe76")
        public static SmDependency MessageRefDep() {
            if (MessageRefDep == null) {
            	MessageRefDep = classof().getDependencyDef("MessageRef");
            }
            return MessageRefDep;
        }

        @objid ("71bcb700-9ee2-4c28-9ecf-520a3d6cad6c")
        public static SmDependency SourceRefDep() {
            if (SourceRefDep == null) {
            	SourceRefDep = classof().getDependencyDef("SourceRef");
            }
            return SourceRefDep;
        }

        @objid ("854fef45-c646-4859-9ca4-423f687417af")
        public static SmDependency TargetRefDep() {
            if (TargetRefDep == null) {
            	TargetRefDep = classof().getDependencyDef("TargetRef");
            }
            return TargetRefDep;
        }

        @objid ("74ab585c-ac17-4479-abfb-09e16dc63b84")
        public static SmDependency CollaborationDep() {
            if (CollaborationDep == null) {
            	CollaborationDep = classof().getDependencyDef("Collaboration");
            }
            return CollaborationDep;
        }

        @objid ("91b531ca-7cdf-4a13-944d-0bdda74ddff6")
        public static SmDependency getSourceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SourceRefDep;
        }

        @objid ("c817488e-a1c1-499d-a9f9-f060189b0f39")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("103515d9-5458-4a5d-bc2a-0866dd181cb3")
        public static SmDependency getMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return MessageRefDep;
        }

        @objid ("00d8833e-dd10-44d4-8f5a-c432b10d107f")
        public static SmDependency getCollaborationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CollaborationDep;
        }

        @objid ("0557faee-a082-48e6-bc36-28efd22c4ac5")
        public static SmDependency getTargetRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TargetRefDep;
        }

        @objid ("0006f27a-c4c6-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("b18ff95f-84a5-4a74-a860-6cd9f017e340")
            public ISmObjectData createData() {
                return new BpmnMessageFlowData();
            }

            @objid ("45eb0112-6d3f-4be4-b3ba-44a242f10c83")
            public SmObjectImpl createImpl() {
                return new BpmnMessageFlowImpl();
            }

        }

        @objid ("000754e0-c4c6-1fd8-97fe-001ec947cd2a")
        public static class MessageRefSmDependency extends SmSingleDependency {
            @objid ("c7fd0744-566c-4f67-97c1-87884ea3da85")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mMessageRef;
            }

            @objid ("236de94f-671a-47ea-ba38-66904ab80385")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mMessageRef = value;
            }

            @objid ("0fe35563-2acd-44a5-9367-4125ddc9aa9d")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.MessageFlowDep();
            }

        }

        @objid ("0007c902-c4c6-1fd8-97fe-001ec947cd2a")
        public static class SourceRefSmDependency extends SmSingleDependency {
            @objid ("88c5c1e6-964b-4219-84cf-0a4f1d10134a")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mSourceRef;
            }

            @objid ("95130cef-d9ec-4257-8527-557a337e8e08")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mSourceRef = value;
            }

            @objid ("223002aa-fce2-42ee-a559-23fe1e7652bf")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.OutgoingFlowDep();
            }

        }

        @objid ("00083d24-c4c6-1fd8-97fe-001ec947cd2a")
        public static class TargetRefSmDependency extends SmSingleDependency {
            @objid ("38643263-1207-41e7-8aba-744eec15b653")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mTargetRef;
            }

            @objid ("920e45e8-5a55-42f2-9fbc-ad515969f408")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mTargetRef = value;
            }

            @objid ("009966fa-9abd-4169-b585-0d653964cd97")
            @Override
            public SmDependency getSymetric() {
                return BpmnBaseElementData.Metadata.IncomingFlowDep();
            }

        }

        @objid ("0008b1aa-c4c6-1fd8-97fe-001ec947cd2a")
        public static class CollaborationSmDependency extends SmSingleDependency {
            @objid ("391f5f80-0f25-4635-a5f4-72dca81a0ca2")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnMessageFlowData) data).mCollaboration;
            }

            @objid ("b7ba454e-91c0-4be9-b823-febf225fbeb9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnMessageFlowData) data).mCollaboration = value;
            }

            @objid ("a05fd6ff-826f-4940-ad7c-50e272625d0b")
            @Override
            public SmDependency getSymetric() {
                return BpmnCollaborationData.Metadata.MessageFlowDep();
            }

        }

    }

}
