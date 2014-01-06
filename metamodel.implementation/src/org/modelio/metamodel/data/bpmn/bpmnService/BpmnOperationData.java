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
package org.modelio.metamodel.data.bpmn.bpmnService;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.data.bpmn.activities.BpmnReceiveTaskData;
import org.modelio.metamodel.data.bpmn.activities.BpmnSendTaskData;
import org.modelio.metamodel.data.bpmn.activities.BpmnServiceTaskData;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnInterfaceData;
import org.modelio.metamodel.data.bpmn.events.BpmnMessageEventDefinitionData;
import org.modelio.metamodel.data.bpmn.flows.BpmnMessageData;
import org.modelio.metamodel.data.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.metamodel.data.uml.statik.OperationData;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnOperationImpl;
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

@objid ("000daf70-c4c0-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=BpmnOperation.class, factory=BpmnOperationData.Metadata.ObjectFactory.class)
public class BpmnOperationData extends BpmnBaseElementData {
    @objid ("883e76ae-c507-4c22-a183-91cf25a26262")
    @SmaMetaAssociation(metaName="Sender", typeDataClass=BpmnSendTaskData.class, min=0, max=-1, smAssociationClass=Metadata.SenderSmDependency.class)
     List<SmObjectImpl> mSender = null;

    @objid ("0d11b933-66e5-4254-bf58-9fa508fc7a97")
    @SmaMetaAssociation(metaName="InMessageRef", typeDataClass=BpmnMessageData.class, min=1, max=1, smAssociationClass=Metadata.InMessageRefSmDependency.class, partof = true)
     SmObjectImpl mInMessageRef;

    @objid ("4ea8af20-dd45-4884-8d14-0b1f29e374c5")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnServiceTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("d550a75f-d907-445f-9ba3-5e80fbc2a677")
    @SmaMetaAssociation(metaName="OutMessageRef", typeDataClass=BpmnMessageData.class, min=0, max=1, smAssociationClass=Metadata.OutMessageRefSmDependency.class, partof = true)
     SmObjectImpl mOutMessageRef;

    @objid ("1fb0f92a-98a3-494c-b0ad-36036d1422d1")
    @SmaMetaAssociation(metaName="EventDefinition", typeDataClass=BpmnMessageEventDefinitionData.class, min=0, max=-1, smAssociationClass=Metadata.EventDefinitionSmDependency.class)
     List<SmObjectImpl> mEventDefinition = null;

    @objid ("17e0456f-68c3-4510-b5bf-cd71b6be2af7")
    @SmaMetaAssociation(metaName="ImplementationRef", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.ImplementationRefSmDependency.class, partof = true)
     SmObjectImpl mImplementationRef;

    @objid ("2b51f4e0-42b4-481c-b4fa-b9a6c0641baa")
    @SmaMetaAssociation(metaName="BpmnInterfaceRef", typeDataClass=BpmnInterfaceData.class, min=1, max=1, smAssociationClass=Metadata.BpmnInterfaceRefSmDependency.class)
     SmObjectImpl mBpmnInterfaceRef;

    @objid ("8bcee606-13f6-4217-b45b-c725dea0f546")
    @SmaMetaAssociation(metaName="Receiver", typeDataClass=BpmnReceiveTaskData.class, min=0, max=-1, smAssociationClass=Metadata.ReceiverSmDependency.class)
     List<SmObjectImpl> mReceiver = null;

    @objid ("e3c148dc-4b4c-4336-b718-b1cd24bedd00")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00831efe-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("7c5f5de2-aa3c-40a1-9f35-ab37813e075c")
        private static SmClass smClass = null;

        @objid ("b963ed36-1166-4d00-ae12-0c31ae6f8cd6")
        private static SmDependency SenderDep = null;

        @objid ("88d4d72d-e524-4ebd-9c12-64983f87f950")
        private static SmDependency InMessageRefDep = null;

        @objid ("7e1831b7-708d-46f4-8e45-722b540a435c")
        private static SmDependency CallerDep = null;

        @objid ("5beb85d2-e755-4512-86ac-dfd95ab94ccb")
        private static SmDependency OutMessageRefDep = null;

        @objid ("4d3ab6f4-6680-48c5-89a0-8795b72a37a2")
        private static SmDependency EventDefinitionDep = null;

        @objid ("6e43d64e-373e-495c-b333-b7fe3e386b0d")
        private static SmDependency ImplementationRefDep = null;

        @objid ("8c90538f-9227-4c3c-a0a0-87df284eb364")
        private static SmDependency BpmnInterfaceRefDep = null;

        @objid ("04530d52-4f68-42ea-9765-02a8132ef5fb")
        private static SmDependency ReceiverDep = null;

        @objid ("669708e3-752b-4797-bd86-f4629690b9a7")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(BpmnOperationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("ea15522a-846f-4fce-b827-acd5b7533014")
        public static SmDependency SenderDep() {
            if (SenderDep == null) {
            	SenderDep = classof().getDependencyDef("Sender");
            }
            return SenderDep;
        }

        @objid ("b1eeaac7-5ffe-4e9b-a67c-7421c040c50d")
        public static SmDependency InMessageRefDep() {
            if (InMessageRefDep == null) {
            	InMessageRefDep = classof().getDependencyDef("InMessageRef");
            }
            return InMessageRefDep;
        }

        @objid ("aed1ea2f-270a-4ec2-bcda-a5153f40b3f7")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("6b1aef00-dbba-4001-9c4d-bf3b0254772d")
        public static SmDependency OutMessageRefDep() {
            if (OutMessageRefDep == null) {
            	OutMessageRefDep = classof().getDependencyDef("OutMessageRef");
            }
            return OutMessageRefDep;
        }

        @objid ("d1d9c0ad-550d-40c6-a808-01142582f553")
        public static SmDependency EventDefinitionDep() {
            if (EventDefinitionDep == null) {
            	EventDefinitionDep = classof().getDependencyDef("EventDefinition");
            }
            return EventDefinitionDep;
        }

        @objid ("7c4c1a79-1f6c-4e90-8c6e-688f7c2a8e35")
        public static SmDependency ImplementationRefDep() {
            if (ImplementationRefDep == null) {
            	ImplementationRefDep = classof().getDependencyDef("ImplementationRef");
            }
            return ImplementationRefDep;
        }

        @objid ("7149ceba-d667-4ca0-aa57-257f479c7aa6")
        public static SmDependency BpmnInterfaceRefDep() {
            if (BpmnInterfaceRefDep == null) {
            	BpmnInterfaceRefDep = classof().getDependencyDef("BpmnInterfaceRef");
            }
            return BpmnInterfaceRefDep;
        }

        @objid ("cd1f8ee6-c323-4e69-b4c1-87c75ccbdb3b")
        public static SmDependency ReceiverDep() {
            if (ReceiverDep == null) {
            	ReceiverDep = classof().getDependencyDef("Receiver");
            }
            return ReceiverDep;
        }

        @objid ("750cb920-62eb-4eff-9684-505ab30b3cde")
        public static SmDependency getReceiverDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReceiverDep;
        }

        @objid ("e2da02d6-8321-4956-9ebb-d2695034fc9a")
        public static SmDependency getImplementationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ImplementationRefDep;
        }

        @objid ("1c70febf-0b40-4192-9285-ed4d86e6fdf2")
        public static SmDependency getEventDefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EventDefinitionDep;
        }

        @objid ("0b602316-d6b3-4126-948d-4d28912840e1")
        public static SmDependency getSenderDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SenderDep;
        }

        @objid ("9d3e2328-8232-4a4d-b161-66cedf2b9e11")
        public static SmDependency getInMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InMessageRefDep;
        }

        @objid ("68cf802b-2fe5-411f-8995-d2698fbdd273")
        public static SmDependency getOutMessageRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OutMessageRefDep;
        }

        @objid ("42be81ca-b1c2-4b1a-81c4-c4b923a9919a")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("2ff44838-363d-490c-b1a1-087e8024e63b")
        public static SmDependency getBpmnInterfaceRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnInterfaceRefDep;
        }

        @objid ("7a43b25e-d1f1-43cc-9564-127617efedf8")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("00837048-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("065333eb-75b9-4ae7-ba67-6edf56926757")
            public ISmObjectData createData() {
                return new BpmnOperationData();
            }

            @objid ("6a1eee33-a1a0-41f1-936c-59d647a3b0d4")
            public SmObjectImpl createImpl() {
                return new BpmnOperationImpl();
            }

        }

        @objid ("0083e3c0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InMessageRefSmDependency extends SmSingleDependency {
            @objid ("1976a404-7143-4eab-b6da-1351727029e3")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mInMessageRef;
            }

            @objid ("4d93350d-dd96-4d5a-a71a-9828f9b2023d")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mInMessageRef = value;
            }

            @objid ("b25bea97-9ee3-4a5a-980d-4067a1cbcab0")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.InputMessageDep();
            }

        }

        @objid ("0084d53c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OutMessageRefSmDependency extends SmSingleDependency {
            @objid ("fafec8c0-34b2-41cd-b839-00694f1da90c")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mOutMessageRef;
            }

            @objid ("7252394a-086b-4eee-b346-7bbad19bb2d4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mOutMessageRef = value;
            }

            @objid ("dc335f7e-1516-406a-ab21-92c2f815cc53")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageData.Metadata.OutputMessageDep();
            }

        }

        @objid ("00856308-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ImplementationRefSmDependency extends SmSingleDependency {
            @objid ("20dc3fae-c10a-4325-af96-9cb571c2e3f5")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mImplementationRef;
            }

            @objid ("69fe8eaf-32a3-474e-8826-785dba4d3951")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mImplementationRef = value;
            }

            @objid ("afbec034-99c7-4737-96a2-3f6dcf167972")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.BpmnOperationRefDep();
            }

        }

        @objid ("0085ecce-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReceiverSmDependency extends SmMultipleDependency {
            @objid ("6ba0e7bc-d4d5-457a-bf98-5e57f6ce1dd9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mReceiver != null)? ((BpmnOperationData)data).mReceiver:SmMultipleDependency.EMPTY;
            }

            @objid ("e3fc0fe4-2bfa-4e7b-9875-eb8c22f8aed8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mReceiver = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mReceiver;
            }

            @objid ("538136c1-8ea3-4b92-9890-00e348029cc5")
            @Override
            public SmDependency getSymetric() {
                return BpmnReceiveTaskData.Metadata.OperationRefDep();
            }

        }

        @objid ("00866474-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("f7144115-40a9-4352-b37b-0c22037eeb92")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mCaller != null)? ((BpmnOperationData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("1edeb788-5c85-4e73-aad7-2d7362fa09ce")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mCaller;
            }

            @objid ("20de7603-e0b3-4a2d-a2e0-4e4cebcd17b4")
            @Override
            public SmDependency getSymetric() {
                return BpmnServiceTaskData.Metadata.OperationRefDep();
            }

        }

        @objid ("0086dabc-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BpmnInterfaceRefSmDependency extends SmSingleDependency {
            @objid ("935709df-fdb5-4a25-9d53-13d0feec9b81")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((BpmnOperationData) data).mBpmnInterfaceRef;
            }

            @objid ("3bbbe5d9-1fec-46e7-b810-04795a65458f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((BpmnOperationData) data).mBpmnInterfaceRef = value;
            }

            @objid ("e2197fad-581f-4634-9bcc-a5bad61f17a5")
            @Override
            public SmDependency getSymetric() {
                return BpmnInterfaceData.Metadata.OperationDep();
            }

        }

        @objid ("008769f0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EventDefinitionSmDependency extends SmMultipleDependency {
            @objid ("b92c246b-c30f-49dc-a25f-58521e78f030")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mEventDefinition != null)? ((BpmnOperationData)data).mEventDefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("d0c2eb3c-f81c-49df-b0a1-bc7385a7e5b3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mEventDefinition = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mEventDefinition;
            }

            @objid ("aca78b69-f274-438c-837e-386ab9abc6a4")
            @Override
            public SmDependency getSymetric() {
                return BpmnMessageEventDefinitionData.Metadata.OperationRefDep();
            }

        }

        @objid ("008807ca-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SenderSmDependency extends SmMultipleDependency {
            @objid ("8b515251-2e97-4b2b-9ff0-af6bf1852977")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((BpmnOperationData)data).mSender != null)? ((BpmnOperationData)data).mSender:SmMultipleDependency.EMPTY;
            }

            @objid ("715641c5-9e57-4801-8ad6-b00f01c0bff3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((BpmnOperationData) data).mSender = new ArrayList<>(initialCapacity);
                return ((BpmnOperationData) data).mSender;
            }

            @objid ("a59b614a-3bd9-4d99-8924-ca4198dc45ba")
            @Override
            public SmDependency getSymetric() {
                return BpmnSendTaskData.Metadata.OperationRefDep();
            }

        }

    }

}
