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
package org.modelio.metamodel.data.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.data.bpmn.activities.BpmnCallActivityData;
import org.modelio.metamodel.data.bpmn.activities.BpmnReceiveTaskData;
import org.modelio.metamodel.data.bpmn.activities.BpmnSendTaskData;
import org.modelio.metamodel.data.bpmn.activities.BpmnServiceTaskData;
import org.modelio.metamodel.data.bpmn.bpmnService.BpmnOperationData;
import org.modelio.metamodel.data.uml.behavior.activityModel.AcceptCallEventActionData;
import org.modelio.metamodel.data.uml.behavior.activityModel.CallOperationActionData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.EventData;
import org.modelio.metamodel.data.uml.behavior.commonBehaviors.SignalData;
import org.modelio.metamodel.data.uml.behavior.communicationModel.CommunicationMessageData;
import org.modelio.metamodel.data.uml.behavior.interactionModel.MessageData;
import org.modelio.metamodel.data.uml.behavior.stateMachineModel.TransitionData;
import org.modelio.metamodel.data.uml.statik.ClassifierData;
import org.modelio.metamodel.data.uml.statik.CollaborationData;
import org.modelio.metamodel.data.uml.statik.CollaborationUseData;
import org.modelio.metamodel.data.uml.statik.ElementImportData;
import org.modelio.metamodel.data.uml.statik.PackageImportData;
import org.modelio.metamodel.data.uml.statik.ParameterData;
import org.modelio.metamodel.data.uml.statik.RaisedExceptionData;
import org.modelio.metamodel.data.uml.statik.TemplateBindingData;
import org.modelio.metamodel.data.uml.statik.TemplateParameterData;
import org.modelio.metamodel.impl.uml.statik.OperationImpl;
import org.modelio.metamodel.uml.statik.MethodPassingMode;
import org.modelio.metamodel.uml.statik.Operation;
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

@objid ("0014d9d0-c4bf-1fd8-97fe-001ec947cd2a")
@SmaMetaClass(mmClass=Operation.class, factory=OperationData.Metadata.ObjectFactory.class)
public class OperationData extends BehavioralFeatureData {
    @objid ("741a9e06-5fa1-4ae3-ade7-08def778157c")
    @SmaMetaAttribute(metaName="Concurrency", type=Boolean.class, smAttributeClass=Metadata.ConcurrencySmAttribute.class)
     Object mConcurrency = false;

    @objid ("72adef18-7dd1-471f-bd70-d601142b3b04")
    @SmaMetaAttribute(metaName="Final", type=Boolean.class, smAttributeClass=Metadata.FinalSmAttribute.class)
     Object mFinal = false;

    @objid ("2d3c4fb5-c233-493a-a0b5-8d72c8acdfc7")
    @SmaMetaAttribute(metaName="Passing", type=MethodPassingMode.class, smAttributeClass=Metadata.PassingSmAttribute.class)
     Object mPassing = MethodPassingMode.METHODOUT;

    @objid ("5220f6b0-b832-4cbc-8e5b-f6fe1c4274c1")
    @SmaMetaAssociation(metaName="OwnedImport", typeDataClass=ElementImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedImport = null;

    @objid ("3d59c8ba-c99c-4449-8a4b-f09cf59c73f9")
    @SmaMetaAssociation(metaName="Thrown", typeDataClass=RaisedExceptionData.class, min=0, max=-1, smAssociationClass=Metadata.ThrownSmDependency.class, component = true)
     List<SmObjectImpl> mThrown = null;

    @objid ("9679f377-7649-4502-81bc-a0bc8098145d")
    @SmaMetaAssociation(metaName="CallerReceiveTask", typeDataClass=BpmnReceiveTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerReceiveTaskSmDependency.class)
     List<SmObjectImpl> mCallerReceiveTask = null;

    @objid ("fbd4ef5b-2cef-450a-8724-74e0c319c71c")
    @SmaMetaAssociation(metaName="Redefinition", typeDataClass=OperationData.class, min=0, max=-1, smAssociationClass=Metadata.RedefinitionSmDependency.class)
     List<SmObjectImpl> mRedefinition = null;

    @objid ("c0b983fa-f6e5-4906-88d7-96e3a3c1311f")
    @SmaMetaAssociation(metaName="Example", typeDataClass=CollaborationData.class, min=0, max=-1, smAssociationClass=Metadata.ExampleSmDependency.class, component = true)
     List<SmObjectImpl> mExample = null;

    @objid ("fdabf218-abe1-4c64-872a-eafa18e17dbd")
    @SmaMetaAssociation(metaName="SRepresentation", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.SRepresentationSmDependency.class)
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("81bc915e-175a-4bd5-a915-8444af74138f")
    @SmaMetaAssociation(metaName="OwnedBehavior", typeDataClass=BehaviorData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedBehaviorSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedBehavior = null;

    @objid ("56c15725-b709-4e64-9875-09cb8a9122cb")
    @SmaMetaAssociation(metaName="BpmnOperationRef", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnOperationRefSmDependency.class)
     List<SmObjectImpl> mBpmnOperationRef = null;

    @objid ("ca3e468e-7000-4f39-8fbf-18fd6be4f7f7")
    @SmaMetaAssociation(metaName="CallerSendTask", typeDataClass=BpmnSendTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSendTaskSmDependency.class)
     List<SmObjectImpl> mCallerSendTask = null;

    @objid ("7969f3c5-e78e-42a9-a37b-266a92cc4207")
    @SmaMetaAssociation(metaName="IO", typeDataClass=ParameterData.class, min=0, max=-1, smAssociationClass=Metadata.IOSmDependency.class, component = true)
     List<SmObjectImpl> mIO = null;

    @objid ("40019835-19ff-4120-a958-c7e6f3e8b30b")
    @SmaMetaAssociation(metaName="TemplateInstanciation", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateInstanciationSmDependency.class, component = true)
     List<SmObjectImpl> mTemplateInstanciation = null;

    @objid ("bf7ec6f2-1112-4a64-a19d-ca0eeae187b9")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ClassifierData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("3d7573e9-16b9-4245-9655-1ea00d22f01d")
    @SmaMetaAssociation(metaName="OwnedPackageImport", typeDataClass=PackageImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedPackageImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedPackageImport = null;

    @objid ("de4ad19c-b0c8-4628-a004-900357c4c5f3")
    @SmaMetaAssociation(metaName="Return", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.ReturnSmDependency.class, component = true)
     SmObjectImpl mReturn;

    @objid ("437de7d4-5416-4de3-9026-6f7e6d54ea2c")
    @SmaMetaAssociation(metaName="InstanciatingBinding", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.InstanciatingBindingSmDependency.class)
     List<SmObjectImpl> mInstanciatingBinding = null;

    @objid ("1b39b6b0-43fd-4e95-a4af-909aea26649d")
    @SmaMetaAssociation(metaName="Usage", typeDataClass=MessageData.class, min=0, max=-1, smAssociationClass=Metadata.UsageSmDependency.class)
     List<SmObjectImpl> mUsage = null;

    @objid ("07390fa6-344a-4f20-b17c-ddfe09ab385f")
    @SmaMetaAssociation(metaName="Template", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateSmDependency.class, component = true)
     List<SmObjectImpl> mTemplate = null;

    @objid ("7e3b6b97-d0c3-467c-a8f9-2ace025a31b6")
    @SmaMetaAssociation(metaName="CallerServiceTask", typeDataClass=BpmnServiceTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerServiceTaskSmDependency.class)
     List<SmObjectImpl> mCallerServiceTask = null;

    @objid ("04cfc31c-77c3-4e15-b692-1a35dc27574b")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("4c5cf97d-2979-4281-8f51-bb67ea576796")
    @SmaMetaAssociation(metaName="Invoker", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.InvokerSmDependency.class)
     List<SmObjectImpl> mInvoker = null;

    @objid ("6efd3c8f-9b50-4db9-b756-0bfa77d3a28b")
    @SmaMetaAssociation(metaName="CommunicationUsage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.CommunicationUsageSmDependency.class)
     List<SmObjectImpl> mCommunicationUsage = null;

    @objid ("2bf51a0a-8647-40d1-b7fc-26bdefe3e2e0")
    @SmaMetaAssociation(metaName="OwnedCollaborationUse", typeDataClass=CollaborationUseData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedCollaborationUseSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedCollaborationUse = null;

    @objid ("046f944f-a124-4707-b7c9-b2d3b9475328")
    @SmaMetaAssociation(metaName="Redefines", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.RedefinesSmDependency.class, partof = true)
     SmObjectImpl mRedefines;

    @objid ("747fc076-3bb7-4387-a9ab-34685bd402b2")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("96c1e7ce-b406-45ec-9e4e-b279f7f5e520")
    @SmaMetaAssociation(metaName="CallingAction", typeDataClass=CallOperationActionData.class, min=0, max=-1, smAssociationClass=Metadata.CallingActionSmDependency.class)
     List<SmObjectImpl> mCallingAction = null;

    @objid ("06363ef5-d129-4dec-8cf3-e0a5470e9919")
    @SmaMetaAssociation(metaName="EntryPointAction", typeDataClass=AcceptCallEventActionData.class, min=0, max=-1, smAssociationClass=Metadata.EntryPointActionSmDependency.class)
     List<SmObjectImpl> mEntryPointAction = null;

    @objid ("8cd3599d-952c-468b-94b9-ccaef8a0c8f8")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00087172-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("fc8e3b8a-c7f7-4a53-976a-46c7556faa1b")
        private static SmClass smClass = null;

        @objid ("6f4458dd-9bb6-4049-9323-de5f17cd536c")
        private static SmAttribute ConcurrencyAtt = null;

        @objid ("1e9c2a92-fa1b-479e-a503-589dd35367fa")
        private static SmAttribute FinalAtt = null;

        @objid ("f9c15c44-d2fe-40a3-951c-9782edadcee7")
        private static SmAttribute PassingAtt = null;

        @objid ("a2383382-3fd5-41dd-b6e3-c87e31474cca")
        private static SmDependency OwnedImportDep = null;

        @objid ("95d75b55-9366-410d-9a25-5d2b8887f480")
        private static SmDependency ThrownDep = null;

        @objid ("06b42f10-3900-4368-a6a7-cf002f4f7c34")
        private static SmDependency CallerReceiveTaskDep = null;

        @objid ("80b57ebe-3535-41fd-b81f-460cba572ddb")
        private static SmDependency RedefinitionDep = null;

        @objid ("8fff5c49-0b1c-48ba-9dcb-6ebebe1c75e0")
        private static SmDependency ExampleDep = null;

        @objid ("54234497-6757-4ee0-b6a0-8a5f1a5ce9d4")
        private static SmDependency SRepresentationDep = null;

        @objid ("ba81a698-4162-4b63-8d2b-2c08740fab57")
        private static SmDependency OwnedBehaviorDep = null;

        @objid ("959ffecd-ef92-44df-8c3a-840017d21eaa")
        private static SmDependency BpmnOperationRefDep = null;

        @objid ("434e9095-33ce-43fd-9491-f27235324f86")
        private static SmDependency CallerSendTaskDep = null;

        @objid ("18b664b2-a173-4965-af75-ff159133cab6")
        private static SmDependency IODep = null;

        @objid ("61cf6f30-a02a-4e89-b181-57c27ed542ae")
        private static SmDependency TemplateInstanciationDep = null;

        @objid ("3cfdd7e0-f5e4-4937-8915-bf7f23d381ce")
        private static SmDependency OwnerDep = null;

        @objid ("84bf4c87-4cc4-40a8-879e-bf4db72b2b32")
        private static SmDependency OwnedPackageImportDep = null;

        @objid ("e14648cc-6f15-4e93-aafe-1a9e0e6f310d")
        private static SmDependency ReturnDep = null;

        @objid ("2bf2f60a-4590-46e6-990c-1c9ae85f3411")
        private static SmDependency InstanciatingBindingDep = null;

        @objid ("c29f0932-ec71-4a13-a394-58770d4d93a9")
        private static SmDependency UsageDep = null;

        @objid ("5cba2535-f9b9-4df4-a91b-265785d3ec34")
        private static SmDependency TemplateDep = null;

        @objid ("d88f1bf2-10af-454d-ae8c-a48773159818")
        private static SmDependency CallerServiceTaskDep = null;

        @objid ("a8741f15-8d83-456f-a279-d9181eb1d689")
        private static SmDependency OccurenceDep = null;

        @objid ("3e003c6c-340e-48a9-bd86-74238b6d1849")
        private static SmDependency InvokerDep = null;

        @objid ("697d1206-b052-48a1-8a4c-e57455d35739")
        private static SmDependency CommunicationUsageDep = null;

        @objid ("cf8948be-c2dc-4f9d-8a23-a8155a4b49a0")
        private static SmDependency OwnedCollaborationUseDep = null;

        @objid ("ba998f1d-b8a2-4bf5-943b-8668e8b0932b")
        private static SmDependency RedefinesDep = null;

        @objid ("e02df224-f2d3-4a22-b68a-de57d4f8886f")
        private static SmDependency CallerDep = null;

        @objid ("cb121ac3-aabe-4f6a-ba7c-087a9f155683")
        private static SmDependency CallingActionDep = null;

        @objid ("8e2c6e51-aa2f-425b-9902-f9cb5860f4a5")
        private static SmDependency EntryPointActionDep = null;

        @objid ("f1ea89ac-80cd-44df-a7b6-e8d0eb3ca3df")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OperationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("0181015e-06eb-4f6e-9542-7c350809b71c")
        public static SmAttribute ConcurrencyAtt() {
            if (ConcurrencyAtt == null) {
            	ConcurrencyAtt = classof().getAttributeDef("Concurrency");
            }
            return ConcurrencyAtt;
        }

        @objid ("b569f789-a519-4525-9f21-50a9fe4b0914")
        public static SmAttribute FinalAtt() {
            if (FinalAtt == null) {
            	FinalAtt = classof().getAttributeDef("Final");
            }
            return FinalAtt;
        }

        @objid ("ce934e88-14d7-4c10-8856-da8a31a11411")
        public static SmAttribute PassingAtt() {
            if (PassingAtt == null) {
            	PassingAtt = classof().getAttributeDef("Passing");
            }
            return PassingAtt;
        }

        @objid ("d7fcd4d1-26a7-416c-b25a-55f76adaa6a5")
        public static SmDependency OwnedImportDep() {
            if (OwnedImportDep == null) {
            	OwnedImportDep = classof().getDependencyDef("OwnedImport");
            }
            return OwnedImportDep;
        }

        @objid ("9ca31e54-2e93-4088-8be5-09a36136a259")
        public static SmDependency ThrownDep() {
            if (ThrownDep == null) {
            	ThrownDep = classof().getDependencyDef("Thrown");
            }
            return ThrownDep;
        }

        @objid ("a20a4ea3-132a-4bb3-abad-512adc5bbe96")
        public static SmDependency CallerReceiveTaskDep() {
            if (CallerReceiveTaskDep == null) {
            	CallerReceiveTaskDep = classof().getDependencyDef("CallerReceiveTask");
            }
            return CallerReceiveTaskDep;
        }

        @objid ("b0735823-e9ab-4467-8783-af4637bc464c")
        public static SmDependency RedefinitionDep() {
            if (RedefinitionDep == null) {
            	RedefinitionDep = classof().getDependencyDef("Redefinition");
            }
            return RedefinitionDep;
        }

        @objid ("299b87fb-5a3d-4005-8ba5-5c4064de89ec")
        public static SmDependency ExampleDep() {
            if (ExampleDep == null) {
            	ExampleDep = classof().getDependencyDef("Example");
            }
            return ExampleDep;
        }

        @objid ("8a154346-eb1d-4f82-aa94-f88607a3001f")
        public static SmDependency SRepresentationDep() {
            if (SRepresentationDep == null) {
            	SRepresentationDep = classof().getDependencyDef("SRepresentation");
            }
            return SRepresentationDep;
        }

        @objid ("cdfc0d9a-5554-4d2a-afda-95aa5ca18461")
        public static SmDependency OwnedBehaviorDep() {
            if (OwnedBehaviorDep == null) {
            	OwnedBehaviorDep = classof().getDependencyDef("OwnedBehavior");
            }
            return OwnedBehaviorDep;
        }

        @objid ("58714195-a5d0-46ae-8903-1ef1c26f0a97")
        public static SmDependency BpmnOperationRefDep() {
            if (BpmnOperationRefDep == null) {
            	BpmnOperationRefDep = classof().getDependencyDef("BpmnOperationRef");
            }
            return BpmnOperationRefDep;
        }

        @objid ("d446ccbb-545d-4554-b033-4bc89fe53650")
        public static SmDependency CallerSendTaskDep() {
            if (CallerSendTaskDep == null) {
            	CallerSendTaskDep = classof().getDependencyDef("CallerSendTask");
            }
            return CallerSendTaskDep;
        }

        @objid ("a339d0ec-ac52-44f2-a286-1790524649a8")
        public static SmDependency IODep() {
            if (IODep == null) {
            	IODep = classof().getDependencyDef("IO");
            }
            return IODep;
        }

        @objid ("6f299c4e-08b4-4c53-bfe2-e913626d2a20")
        public static SmDependency TemplateInstanciationDep() {
            if (TemplateInstanciationDep == null) {
            	TemplateInstanciationDep = classof().getDependencyDef("TemplateInstanciation");
            }
            return TemplateInstanciationDep;
        }

        @objid ("a73da5c5-0329-4b86-9e45-5598d6f25eff")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("996bc646-59c8-499c-ac70-541001d5281d")
        public static SmDependency OwnedPackageImportDep() {
            if (OwnedPackageImportDep == null) {
            	OwnedPackageImportDep = classof().getDependencyDef("OwnedPackageImport");
            }
            return OwnedPackageImportDep;
        }

        @objid ("49d9a37b-900b-40c7-9f96-1691c0605893")
        public static SmDependency ReturnDep() {
            if (ReturnDep == null) {
            	ReturnDep = classof().getDependencyDef("Return");
            }
            return ReturnDep;
        }

        @objid ("c67b7d86-e497-4776-8db4-774ebe7c5c7b")
        public static SmDependency InstanciatingBindingDep() {
            if (InstanciatingBindingDep == null) {
            	InstanciatingBindingDep = classof().getDependencyDef("InstanciatingBinding");
            }
            return InstanciatingBindingDep;
        }

        @objid ("66bb43e8-a84f-4928-aece-30ef7c25699c")
        public static SmDependency UsageDep() {
            if (UsageDep == null) {
            	UsageDep = classof().getDependencyDef("Usage");
            }
            return UsageDep;
        }

        @objid ("4b38f2b4-e3f2-40eb-a9ee-654aa232e5cd")
        public static SmDependency TemplateDep() {
            if (TemplateDep == null) {
            	TemplateDep = classof().getDependencyDef("Template");
            }
            return TemplateDep;
        }

        @objid ("2cc8a6b7-637f-44e1-b9c6-853b64c85898")
        public static SmDependency CallerServiceTaskDep() {
            if (CallerServiceTaskDep == null) {
            	CallerServiceTaskDep = classof().getDependencyDef("CallerServiceTask");
            }
            return CallerServiceTaskDep;
        }

        @objid ("b45f2dbe-adf8-40d9-b058-dc59d740a7d0")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("68940e68-9ef0-4a0d-8c29-73bf06182f1b")
        public static SmDependency InvokerDep() {
            if (InvokerDep == null) {
            	InvokerDep = classof().getDependencyDef("Invoker");
            }
            return InvokerDep;
        }

        @objid ("3c504f32-8134-4e18-a639-682579d2f426")
        public static SmDependency CommunicationUsageDep() {
            if (CommunicationUsageDep == null) {
            	CommunicationUsageDep = classof().getDependencyDef("CommunicationUsage");
            }
            return CommunicationUsageDep;
        }

        @objid ("b08544f0-680a-4bbd-9809-d4b53d08f4f4")
        public static SmDependency OwnedCollaborationUseDep() {
            if (OwnedCollaborationUseDep == null) {
            	OwnedCollaborationUseDep = classof().getDependencyDef("OwnedCollaborationUse");
            }
            return OwnedCollaborationUseDep;
        }

        @objid ("3c520913-8d03-4f2d-a692-3bfca79da808")
        public static SmDependency RedefinesDep() {
            if (RedefinesDep == null) {
            	RedefinesDep = classof().getDependencyDef("Redefines");
            }
            return RedefinesDep;
        }

        @objid ("619131cf-9e9c-4b7f-a4c3-bfc881fe44e2")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("ee0cb069-0bf0-4cdc-98ef-60cabce0eacc")
        public static SmDependency CallingActionDep() {
            if (CallingActionDep == null) {
            	CallingActionDep = classof().getDependencyDef("CallingAction");
            }
            return CallingActionDep;
        }

        @objid ("2724d65f-693e-4061-b49e-266415e393e2")
        public static SmDependency EntryPointActionDep() {
            if (EntryPointActionDep == null) {
            	EntryPointActionDep = classof().getDependencyDef("EntryPointAction");
            }
            return EntryPointActionDep;
        }

        @objid ("b9403d83-df63-44bf-9dad-f9938f4ebed7")
        public static SmDependency getInstanciatingBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatingBindingDep;
        }

        @objid ("bf22caf1-45bd-4afe-831c-cbd5c68b17f7")
        public static SmDependency getReturnDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReturnDep;
        }

        @objid ("182bdc0f-5ccc-4a7c-9875-aec70c3cce77")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("d4f462f9-f349-4173-9bca-8360aafdb6c5")
        public static SmAttribute getConcurrencyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConcurrencyAtt;
        }

        @objid ("02439fc0-b244-4d19-8d18-11796b606e19")
        public static SmDependency getRedefinesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RedefinesDep;
        }

        @objid ("839cddbc-35b0-4696-8d4a-0ac52804cec5")
        public static SmDependency getCallerReceiveTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerReceiveTaskDep;
        }

        @objid ("c48cac87-184b-4fa2-9223-edb183a7f4c3")
        public static SmDependency getOwnedBehaviorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedBehaviorDep;
        }

        @objid ("16336ad7-294a-4aec-b3ea-b3d6f6b33d51")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("b40ecbe9-d409-4c17-a0c3-83ea2f0fa676")
        public static SmDependency getBpmnOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnOperationRefDep;
        }

        @objid ("324c72b0-570b-4ae5-8480-2268192fb18e")
        public static SmDependency getEntryPointActionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryPointActionDep;
        }

        @objid ("b698e518-a8a5-4644-86c1-98627f7fbd6c")
        public static SmDependency getOwnedCollaborationUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedCollaborationUseDep;
        }

        @objid ("a5f800bb-331b-4b90-bd74-092e39384b89")
        public static SmDependency getInvokerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvokerDep;
        }

        @objid ("0b47c721-bcd3-4a14-9ed7-533548f319d6")
        public static SmDependency getThrownDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrownDep;
        }

        @objid ("a5876c2f-315c-484c-bae5-cbed5008f5cb")
        public static SmDependency getSRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SRepresentationDep;
        }

        @objid ("f7813ef3-7536-408f-8ebd-26be42bc6f51")
        public static SmDependency getRedefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RedefinitionDep;
        }

        @objid ("80cc4ee3-bc4a-45a5-867d-b34d311f66ab")
        public static SmDependency getIODep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IODep;
        }

        @objid ("e9166c68-0267-454a-bf77-8886a5dc398d")
        public static SmDependency getOwnedImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedImportDep;
        }

        @objid ("81eb5d1d-9423-4885-8564-26c1a0f7f845")
        public static SmDependency getTemplateInstanciationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateInstanciationDep;
        }

        @objid ("ff394973-1f10-4caf-9333-67ea829b0549")
        public static SmDependency getCallerSendTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerSendTaskDep;
        }

        @objid ("6e693c96-a698-491a-934f-eb459f87b1fd")
        public static SmDependency getOwnedPackageImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedPackageImportDep;
        }

        @objid ("8dd18199-40f2-49ad-9ae4-360566d1629c")
        public static SmAttribute getFinalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FinalAtt;
        }

        @objid ("352469cc-d0b5-4d87-937e-8cd4f1d49c49")
        public static SmAttribute getPassingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PassingAtt;
        }

        @objid ("7eaf61b2-5161-45ab-9082-d5b2ec46fa28")
        public static SmDependency getCommunicationUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CommunicationUsageDep;
        }

        @objid ("0e112cf7-b945-463c-bf7e-448b1593b5a3")
        public static SmDependency getExampleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExampleDep;
        }

        @objid ("aeab1450-910d-4f97-b5b4-56c61389ce56")
        public static SmDependency getUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsageDep;
        }

        @objid ("cc06c2a2-c043-4e82-b153-fb96778bed6a")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("ea1d00a4-66cf-4612-90e1-82bf81822ef5")
        public static SmDependency getTemplateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateDep;
        }

        @objid ("2bd76dff-7455-4854-b834-21af0edd0afe")
        public static SmDependency getCallerServiceTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerServiceTaskDep;
        }

        @objid ("311b966a-1f76-4204-abcb-2a244af97e1d")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("906decf8-4590-4216-9ab2-5362e8018943")
        public static SmDependency getCallingActionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallingActionDep;
        }

        @objid ("0008b808-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("321de747-4bc4-47c0-a90d-35bd604c8a4f")
            public ISmObjectData createData() {
                return new OperationData();
            }

            @objid ("391ca8b1-f606-4213-8681-f7265081429d")
            public SmObjectImpl createImpl() {
                return new OperationImpl();
            }

        }

        @objid ("0009192e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConcurrencySmAttribute extends SmAttribute {
            @objid ("6c402e2b-0c69-4464-976e-0a81feeba49a")
            public Object getValue(ISmObjectData data) {
                return ((OperationData) data).mConcurrency;
            }

            @objid ("f3575991-6199-475b-a85e-cc5e3f19eedc")
            public void setValue(ISmObjectData data, Object value) {
                ((OperationData) data).mConcurrency = value;
            }

        }

        @objid ("00097a18-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FinalSmAttribute extends SmAttribute {
            @objid ("c610fdf5-686b-4935-a9d2-b52a7f637fd1")
            public Object getValue(ISmObjectData data) {
                return ((OperationData) data).mFinal;
            }

            @objid ("53f06b86-8bf9-4fe4-9ab7-988f0f9a19a3")
            public void setValue(ISmObjectData data, Object value) {
                ((OperationData) data).mFinal = value;
            }

        }

        @objid ("0009dbca-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PassingSmAttribute extends SmAttribute {
            @objid ("04cd4f24-a001-4e0b-b1ee-510a009ca248")
            public Object getValue(ISmObjectData data) {
                return ((OperationData) data).mPassing;
            }

            @objid ("3dbc60a9-4a9e-41f0-a1d5-1458930d097e")
            public void setValue(ISmObjectData data, Object value) {
                ((OperationData) data).mPassing = value;
            }

        }

        @objid ("000a5262-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExampleSmDependency extends SmMultipleDependency {
            @objid ("ca757a7f-b26e-4af5-8458-e160f8d51351")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mExample != null)? ((OperationData)data).mExample:SmMultipleDependency.EMPTY;
            }

            @objid ("529df515-d370-4e46-81cd-2b66b50ee8e4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mExample = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mExample;
            }

            @objid ("df9211a5-0cd8-4931-ae71-d0df6049603f")
            @Override
            public SmDependency getSymetric() {
                return CollaborationData.Metadata.ORepresentedDep();
            }

        }

        @objid ("000abdba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IOSmDependency extends SmMultipleDependency {
            @objid ("ddd63151-348f-4df2-9666-0aa661198a42")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mIO != null)? ((OperationData)data).mIO:SmMultipleDependency.EMPTY;
            }

            @objid ("beb4f848-0aaf-49ca-b042-2fdee6f94fb0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mIO = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mIO;
            }

            @objid ("61369f12-4d4c-4c6b-b344-07946b9f41e9")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.ComposedDep();
            }

        }

        @objid ("000b24b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InstanciatingBindingSmDependency extends SmMultipleDependency {
            @objid ("b1bf5ffc-6d21-4cb7-b1f4-7a17ea68a478")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mInstanciatingBinding != null)? ((OperationData)data).mInstanciatingBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("d88ae514-5574-4496-94e0-1e5deed5ed26")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mInstanciatingBinding = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mInstanciatingBinding;
            }

            @objid ("59c20cd7-00a1-4e8c-ae88-4a710ee9b1ee")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.InstanciatedTemplateOperationDep();
            }

        }

        @objid ("000b89f2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InvokerSmDependency extends SmMultipleDependency {
            @objid ("9d5ea10b-79c7-44e4-9d26-09c8f07eb3de")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mInvoker != null)? ((OperationData)data).mInvoker:SmMultipleDependency.EMPTY;
            }

            @objid ("f29589f7-8a9e-4361-a8e6-2dfb3f749c50")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mInvoker = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mInvoker;
            }

            @objid ("954e6281-25d4-4de1-9fc2-3cec60e50861")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.ProcessedDep();
            }

        }

        @objid ("000bef3c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("8bca5ece-17ad-4ece-a936-3c41742fcd83")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOccurence != null)? ((OperationData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("128cc594-dcd2-4428-964f-f4971576e9b9")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOccurence;
            }

            @objid ("619f9fa8-423a-40e6-b7ec-8e915ffce92d")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.CalledDep();
            }

        }

        @objid ("000c62c8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedBehaviorSmDependency extends SmMultipleDependency {
            @objid ("f1697851-cbaa-415c-aab7-5cd28eeac798")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedBehavior != null)? ((OperationData)data).mOwnedBehavior:SmMultipleDependency.EMPTY;
            }

            @objid ("1cc517f5-1c5a-4e5b-a0ad-28dcf883e032")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedBehavior = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedBehavior;
            }

            @objid ("19c10687-ca2c-4cc2-b54e-5dd12b7199f2")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.OwnerOperationDep();
            }

        }

        @objid ("000cd4ba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedCollaborationUseSmDependency extends SmMultipleDependency {
            @objid ("f8d513d7-56e0-4e72-b737-cdfc4f656e12")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedCollaborationUse != null)? ((OperationData)data).mOwnedCollaborationUse:SmMultipleDependency.EMPTY;
            }

            @objid ("f4b94175-7fca-4ba2-8bd1-3b798aa890c0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedCollaborationUse = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedCollaborationUse;
            }

            @objid ("ad4c03be-fe94-418c-baac-721ba74c5ceb")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.ORepresentedDep();
            }

        }

        @objid ("000d3bd0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedImportSmDependency extends SmMultipleDependency {
            @objid ("16ca722d-6809-45d7-b86b-90e5a2fc8fda")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedImport != null)? ((OperationData)data).mOwnedImport:SmMultipleDependency.EMPTY;
            }

            @objid ("86b80b6e-a6c8-4ffc-a0d3-d19f7429cb46")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedImport = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedImport;
            }

            @objid ("b84fe2e6-1369-40ff-8aa4-8b70aa6795de")
            @Override
            public SmDependency getSymetric() {
                return ElementImportData.Metadata.ImportingOperationDep();
            }

        }

        @objid ("000da8fe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedPackageImportSmDependency extends SmMultipleDependency {
            @objid ("bdf68af7-55b8-4337-bd98-83eb7421a725")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedPackageImport != null)? ((OperationData)data).mOwnedPackageImport:SmMultipleDependency.EMPTY;
            }

            @objid ("34f98529-a9c9-476e-9ae8-efecde3f1f12")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedPackageImport = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedPackageImport;
            }

            @objid ("2b048b61-6a9a-44d3-91e9-4908ad035bd3")
            @Override
            public SmDependency getSymetric() {
                return PackageImportData.Metadata.ImportingOperationDep();
            }

        }

        @objid ("000e11ea-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RedefinesSmDependency extends SmSingleDependency {
            @objid ("314fe23b-ea1a-4e23-9bc3-2011af7a23c0")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OperationData) data).mRedefines;
            }

            @objid ("2bda7e0e-918f-43b8-a6bf-6f3741050987")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OperationData) data).mRedefines = value;
            }

            @objid ("cef60942-e944-478b-84fd-eec1da7bfa50")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.RedefinitionDep();
            }

        }

        @objid ("000e98fe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RedefinitionSmDependency extends SmMultipleDependency {
            @objid ("570176dc-77e2-4627-9df6-7483fe8b0264")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mRedefinition != null)? ((OperationData)data).mRedefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("9cf9a691-779b-448f-a8ea-b64482b03889")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mRedefinition = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mRedefinition;
            }

            @objid ("4fbbacc0-3e75-4160-86fb-630b8caa5888")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.RedefinesDep();
            }

        }

        @objid ("000f0dde-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReturnSmDependency extends SmSingleDependency {
            @objid ("f07427b2-7193-40e0-b50e-3e5f0d847c54")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OperationData) data).mReturn;
            }

            @objid ("b4e863c8-e337-4e15-910d-b337f870510c")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OperationData) data).mReturn = value;
            }

            @objid ("c8dd93fa-9856-41a3-bdeb-367c8a53828a")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.ReturnedDep();
            }

        }

        @objid ("000f8bce-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SRepresentationSmDependency extends SmMultipleDependency {
            @objid ("acbb8cca-4f2b-4b2f-9373-97913e81d65a")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mSRepresentation != null)? ((OperationData)data).mSRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("55cb5360-2b32-4e78-b56c-20a8dfdec689")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mSRepresentation = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mSRepresentation;
            }

            @objid ("b104a32b-5125-4c27-9e6f-52219fa8aa8e")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.OBaseDep();
            }

        }

        @objid ("000ffbea-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TemplateSmDependency extends SmMultipleDependency {
            @objid ("438c62c6-63e5-4a83-9c6f-fde0126722c4")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mTemplate != null)? ((OperationData)data).mTemplate:SmMultipleDependency.EMPTY;
            }

            @objid ("0eb9cafa-f3b8-4f4e-a8a3-f3175966999d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mTemplate = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mTemplate;
            }

            @objid ("3ee8ae57-fb82-437b-8da9-fab0906f1b1a")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.ParameterizedOperationDep();
            }

        }

        @objid ("00106882-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TemplateInstanciationSmDependency extends SmMultipleDependency {
            @objid ("9a6df0e9-929d-46e0-897a-2f875dbf5e53")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mTemplateInstanciation != null)? ((OperationData)data).mTemplateInstanciation:SmMultipleDependency.EMPTY;
            }

            @objid ("25421040-a8d4-48c9-becb-15511c012fac")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mTemplateInstanciation = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mTemplateInstanciation;
            }

            @objid ("b90e6cfd-5fe5-4797-adbd-cb840617e1ca")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.BoundOperationDep();
            }

        }

        @objid ("0010dfd8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ThrownSmDependency extends SmMultipleDependency {
            @objid ("36bf28ec-577d-4334-88e6-d202d9ca9b81")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mThrown != null)? ((OperationData)data).mThrown:SmMultipleDependency.EMPTY;
            }

            @objid ("15f97ef2-10ce-464a-81ca-435201e60378")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mThrown = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mThrown;
            }

            @objid ("75ba678f-8d78-47a7-82fa-757df51ebb13")
            @Override
            public SmDependency getSymetric() {
                return RaisedExceptionData.Metadata.ThrowerDep();
            }

        }

        @objid ("0011639a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class UsageSmDependency extends SmMultipleDependency {
            @objid ("0c5e875d-6d7d-4b01-8fce-bd56ebd54b44")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mUsage != null)? ((OperationData)data).mUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("ca1ccc3f-1140-4e7a-ba58-dbbe4a437baa")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mUsage = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mUsage;
            }

            @objid ("35423d62-b568-4bd4-ba8d-f3a5eef227f4")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.InvokedDep();
            }

        }

        @objid ("0011d492-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryPointActionSmDependency extends SmMultipleDependency {
            @objid ("a9d24be8-81e0-47a6-9fdc-a0f581716db8")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mEntryPointAction != null)? ((OperationData)data).mEntryPointAction:SmMultipleDependency.EMPTY;
            }

            @objid ("a905bba3-0bdf-4fd6-a6d5-d99121d53a36")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mEntryPointAction = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mEntryPointAction;
            }

            @objid ("b1ea826a-7cb0-4e5c-9510-496d10ee5c13")
            @Override
            public SmDependency getSymetric() {
                return AcceptCallEventActionData.Metadata.CalledDep();
            }

        }

        @objid ("0012424c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CommunicationUsageSmDependency extends SmMultipleDependency {
            @objid ("ec46b901-6100-47a0-ac4e-3c8343f0225c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCommunicationUsage != null)? ((OperationData)data).mCommunicationUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("83101ea6-34dc-4a55-ae7a-b198921ecfef")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCommunicationUsage = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCommunicationUsage;
            }

            @objid ("20e73aad-112c-4d6c-b25f-26edaeb87c8d")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.InvokedDep();
            }

        }

        @objid ("0012b5ec-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallingActionSmDependency extends SmMultipleDependency {
            @objid ("18aea470-acc3-43fb-8666-8093a9e6d9a5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallingAction != null)? ((OperationData)data).mCallingAction:SmMultipleDependency.EMPTY;
            }

            @objid ("129f140c-c1da-4852-87a1-eca1de640dc1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallingAction = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallingAction;
            }

            @objid ("89e7af8a-d21b-4a18-ab76-6759973bd186")
            @Override
            public SmDependency getSymetric() {
                return CallOperationActionData.Metadata.CalledDep();
            }

        }

        @objid ("00132540-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("4a6c15b6-3b2c-4438-b084-e058d1409780")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCaller != null)? ((OperationData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("86fe1fae-8db0-4fba-b9be-c03d759cd635")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCaller;
            }

            @objid ("1fe0ea57-200e-42e8-8a3c-d8a38a7b42e8")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledOperationDep();
            }

        }

        @objid ("0013a97a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BpmnOperationRefSmDependency extends SmMultipleDependency {
            @objid ("da31081e-eb4d-4aa4-9513-65cf976480bb")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mBpmnOperationRef != null)? ((OperationData)data).mBpmnOperationRef:SmMultipleDependency.EMPTY;
            }

            @objid ("e30d2c3f-3601-47f4-8c91-8f7249f3ccae")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mBpmnOperationRef = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mBpmnOperationRef;
            }

            @objid ("f7e1276e-fe48-4074-8e2d-5259613640e1")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.ImplementationRefDep();
            }

        }

        @objid ("00142602-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerSendTaskSmDependency extends SmMultipleDependency {
            @objid ("54b36a62-cf8f-4220-a10b-509577027437")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallerSendTask != null)? ((OperationData)data).mCallerSendTask:SmMultipleDependency.EMPTY;
            }

            @objid ("deb494ae-9629-4068-a9a1-a0989893c763")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallerSendTask = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallerSendTask;
            }

            @objid ("f26ea1c8-93b0-4a28-98e7-7a961cb44d57")
            @Override
            public SmDependency getSymetric() {
                return BpmnSendTaskData.Metadata.CalledOperationDep();
            }

        }

        @objid ("001497c2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerReceiveTaskSmDependency extends SmMultipleDependency {
            @objid ("45b4bdfa-6995-4945-a824-744494b0dda9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallerReceiveTask != null)? ((OperationData)data).mCallerReceiveTask:SmMultipleDependency.EMPTY;
            }

            @objid ("d9e0f61d-2eaa-4650-86a7-86c303cf8ccc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallerReceiveTask = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallerReceiveTask;
            }

            @objid ("a35757a8-a912-4f43-b953-a2e2a02bfd87")
            @Override
            public SmDependency getSymetric() {
                return BpmnReceiveTaskData.Metadata.CalledOperationDep();
            }

        }

        @objid ("00150e96-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerServiceTaskSmDependency extends SmMultipleDependency {
            @objid ("e1d2cd0f-d8a0-4892-bf40-854ea575bb05")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallerServiceTask != null)? ((OperationData)data).mCallerServiceTask:SmMultipleDependency.EMPTY;
            }

            @objid ("9f1bcf23-dc4e-45e6-bae1-d7d639f10014")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallerServiceTask = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallerServiceTask;
            }

            @objid ("f8da9ce4-5949-4f01-ba86-916b1695abed")
            @Override
            public SmDependency getSymetric() {
                return BpmnServiceTaskData.Metadata.CalledOperationDep();
            }

        }

        @objid ("00158074-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("0d49bcbc-d12c-4756-bd29-b91c9aaaabef")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OperationData) data).mOwner;
            }

            @objid ("04581ec2-a769-498f-abc9-d193f07dfda4")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OperationData) data).mOwner = value;
            }

            @objid ("03633522-ce60-4530-a769-02ab206834cf")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedOperationDep();
            }

        }

    }

}
