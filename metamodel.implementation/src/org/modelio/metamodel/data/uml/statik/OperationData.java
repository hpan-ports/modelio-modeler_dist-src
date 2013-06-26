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
    @objid ("4a826b5d-a8ba-4727-94a6-8824eb219b61")
    @SmaMetaAttribute(metaName="Concurrency", type=Boolean.class, smAttributeClass=Metadata.ConcurrencySmAttribute.class)
     Object mConcurrency = false;

    @objid ("3e94d484-bd60-4111-8f2a-3f54f257ab53")
    @SmaMetaAttribute(metaName="Final", type=Boolean.class, smAttributeClass=Metadata.FinalSmAttribute.class)
     Object mFinal = false;

    @objid ("72fd8830-c1ae-4a98-a6cf-605bf659b7ee")
    @SmaMetaAttribute(metaName="Passing", type=MethodPassingMode.class, smAttributeClass=Metadata.PassingSmAttribute.class)
     Object mPassing = MethodPassingMode.METHODOUT;

    @objid ("8753a04d-1cb7-4441-aa29-1e7922c06bea")
    @SmaMetaAssociation(metaName="OwnedImport", typeDataClass=ElementImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedImport = null;

    @objid ("541cd369-6770-48bf-bd7d-f270a170822f")
    @SmaMetaAssociation(metaName="Thrown", typeDataClass=RaisedExceptionData.class, min=0, max=-1, smAssociationClass=Metadata.ThrownSmDependency.class, component = true)
     List<SmObjectImpl> mThrown = null;

    @objid ("c17210ec-162f-4f5c-a49d-b713747688b8")
    @SmaMetaAssociation(metaName="CallerReceiveTask", typeDataClass=BpmnReceiveTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerReceiveTaskSmDependency.class)
     List<SmObjectImpl> mCallerReceiveTask = null;

    @objid ("bf11130f-49c4-4993-bdc5-5c52b2b12b73")
    @SmaMetaAssociation(metaName="Redefinition", typeDataClass=OperationData.class, min=0, max=-1, smAssociationClass=Metadata.RedefinitionSmDependency.class)
     List<SmObjectImpl> mRedefinition = null;

    @objid ("f92acd6d-6e01-44a9-8034-619125a90015")
    @SmaMetaAssociation(metaName="Example", typeDataClass=CollaborationData.class, min=0, max=-1, smAssociationClass=Metadata.ExampleSmDependency.class, component = true)
     List<SmObjectImpl> mExample = null;

    @objid ("f4027769-11ec-48e2-84c5-82056e933d70")
    @SmaMetaAssociation(metaName="SRepresentation", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.SRepresentationSmDependency.class)
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("ee68c69a-5ee1-4027-9a02-d087341dbf84")
    @SmaMetaAssociation(metaName="OwnedBehavior", typeDataClass=BehaviorData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedBehaviorSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedBehavior = null;

    @objid ("73067b68-35dd-41e6-a890-9779ca59aded")
    @SmaMetaAssociation(metaName="BpmnOperationRef", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnOperationRefSmDependency.class)
     List<SmObjectImpl> mBpmnOperationRef = null;

    @objid ("404713d8-35be-4ba2-b045-3d61477430bc")
    @SmaMetaAssociation(metaName="CallerSendTask", typeDataClass=BpmnSendTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSendTaskSmDependency.class)
     List<SmObjectImpl> mCallerSendTask = null;

    @objid ("50d51467-e597-4030-9163-3612bea9c9f3")
    @SmaMetaAssociation(metaName="IO", typeDataClass=ParameterData.class, min=0, max=-1, smAssociationClass=Metadata.IOSmDependency.class, component = true)
     List<SmObjectImpl> mIO = null;

    @objid ("f64a4577-9906-4676-aa14-11a792d1a417")
    @SmaMetaAssociation(metaName="TemplateInstanciation", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateInstanciationSmDependency.class, component = true)
     List<SmObjectImpl> mTemplateInstanciation = null;

    @objid ("7b14599b-4cb3-4545-89fb-4fe76ef37db4")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ClassifierData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("d1031a90-bf49-459b-870c-5797bda56bcb")
    @SmaMetaAssociation(metaName="OwnedPackageImport", typeDataClass=PackageImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedPackageImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedPackageImport = null;

    @objid ("2090c780-fd1c-4574-8b1f-704e1671e23e")
    @SmaMetaAssociation(metaName="Return", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.ReturnSmDependency.class, component = true)
     SmObjectImpl mReturn;

    @objid ("b3e878be-59ff-4176-aca2-f347b83310f7")
    @SmaMetaAssociation(metaName="InstanciatingBinding", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.InstanciatingBindingSmDependency.class)
     List<SmObjectImpl> mInstanciatingBinding = null;

    @objid ("5e876afe-aa17-4d07-bb62-ab3988466904")
    @SmaMetaAssociation(metaName="Usage", typeDataClass=MessageData.class, min=0, max=-1, smAssociationClass=Metadata.UsageSmDependency.class)
     List<SmObjectImpl> mUsage = null;

    @objid ("7903031e-0bfa-4623-8016-debfdf445451")
    @SmaMetaAssociation(metaName="Template", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateSmDependency.class, component = true)
     List<SmObjectImpl> mTemplate = null;

    @objid ("2ff000de-6737-40c1-8c55-2dbe43789301")
    @SmaMetaAssociation(metaName="CallerServiceTask", typeDataClass=BpmnServiceTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerServiceTaskSmDependency.class)
     List<SmObjectImpl> mCallerServiceTask = null;

    @objid ("3bb43090-e4fd-4ba9-bf35-9ceb70b322b5")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("2a108517-d5b1-417b-afec-4180b5498481")
    @SmaMetaAssociation(metaName="Invoker", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.InvokerSmDependency.class)
     List<SmObjectImpl> mInvoker = null;

    @objid ("34309af4-ddd2-466b-861e-c3d400aaffc4")
    @SmaMetaAssociation(metaName="CommunicationUsage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.CommunicationUsageSmDependency.class)
     List<SmObjectImpl> mCommunicationUsage = null;

    @objid ("f1ca6d68-1338-470b-9966-87d89dc8a038")
    @SmaMetaAssociation(metaName="OwnedCollaborationUse", typeDataClass=CollaborationUseData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedCollaborationUseSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedCollaborationUse = null;

    @objid ("fe97dd70-08b4-4282-a30f-859ec1bc1650")
    @SmaMetaAssociation(metaName="Redefines", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.RedefinesSmDependency.class, partof = true)
     SmObjectImpl mRedefines;

    @objid ("db354a37-db20-474f-9c8d-235ff8ee8d67")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("c6def724-2e60-42b1-a601-b4fe8915e9b2")
    @SmaMetaAssociation(metaName="CallingAction", typeDataClass=CallOperationActionData.class, min=0, max=-1, smAssociationClass=Metadata.CallingActionSmDependency.class)
     List<SmObjectImpl> mCallingAction = null;

    @objid ("4bd7b1a7-9bc3-44dc-9d4e-7bf63ac70fa5")
    @SmaMetaAssociation(metaName="EntryPointAction", typeDataClass=AcceptCallEventActionData.class, min=0, max=-1, smAssociationClass=Metadata.EntryPointActionSmDependency.class)
     List<SmObjectImpl> mEntryPointAction = null;

    @objid ("4efd6625-5960-469b-810a-5b893de3730e")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00087172-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("4c92fcdb-30b6-4cb3-9a4b-1a681137619d")
        private static SmClass smClass = null;

        @objid ("1da353fc-c0bb-446b-9457-64d57b6b4457")
        private static SmAttribute ConcurrencyAtt = null;

        @objid ("d996b28e-441b-4edb-af69-9a7776affaac")
        private static SmAttribute FinalAtt = null;

        @objid ("d41a5fca-6eb9-44d9-9de9-55cc54d5effc")
        private static SmAttribute PassingAtt = null;

        @objid ("d02bd2eb-e045-4e46-955f-1f5bf82dd885")
        private static SmDependency OwnedImportDep = null;

        @objid ("e0f75760-d15a-40e0-8cb3-7ebe7e6a1dfa")
        private static SmDependency ThrownDep = null;

        @objid ("1dba6baf-6ed0-4b69-8c68-cd3e00a33946")
        private static SmDependency CallerReceiveTaskDep = null;

        @objid ("65d663e0-e35a-45a0-992b-e795e9cdfcae")
        private static SmDependency RedefinitionDep = null;

        @objid ("c8d0f98c-e3d9-4fa7-a52a-bbdffd41bb31")
        private static SmDependency ExampleDep = null;

        @objid ("65ee3ebd-b606-4f5b-8f74-dac89ff40d42")
        private static SmDependency SRepresentationDep = null;

        @objid ("31c892e0-d275-4164-88fb-6e633a1780ab")
        private static SmDependency OwnedBehaviorDep = null;

        @objid ("f835771d-00bd-4c04-b7a0-d53eb3e99099")
        private static SmDependency BpmnOperationRefDep = null;

        @objid ("94cbbd6b-e3cb-4bf6-a2f7-80d7563d4065")
        private static SmDependency CallerSendTaskDep = null;

        @objid ("16c70dcd-379e-42e4-af8c-7cfd78b28886")
        private static SmDependency IODep = null;

        @objid ("8c7cb3a9-8971-41e9-a55b-8122780fb837")
        private static SmDependency TemplateInstanciationDep = null;

        @objid ("78c33562-bb2f-47b1-ad31-14fdede2132d")
        private static SmDependency OwnerDep = null;

        @objid ("b434920e-1c4a-4d65-a825-cec23c3d4445")
        private static SmDependency OwnedPackageImportDep = null;

        @objid ("fbf325ee-2ccc-4614-a74f-55daefdd9f89")
        private static SmDependency ReturnDep = null;

        @objid ("79b02948-7a9d-42ff-97e7-4c8f58b56e6c")
        private static SmDependency InstanciatingBindingDep = null;

        @objid ("28d30d19-57df-459e-9a18-1a210200105c")
        private static SmDependency UsageDep = null;

        @objid ("7a722f45-f3d2-41ef-a31b-fb8f5ff1c004")
        private static SmDependency TemplateDep = null;

        @objid ("bdae47c8-f44c-47a9-8e5b-40c1138bc101")
        private static SmDependency CallerServiceTaskDep = null;

        @objid ("87505463-5be1-4b8d-a984-ec59dcccfa94")
        private static SmDependency OccurenceDep = null;

        @objid ("f4a6a01b-cde4-47c3-a080-a4bd6d1c3a61")
        private static SmDependency InvokerDep = null;

        @objid ("538036b7-9abb-48c5-996c-8125cf8d3113")
        private static SmDependency CommunicationUsageDep = null;

        @objid ("6c907703-52d3-4aec-b4f4-478b6fc9f138")
        private static SmDependency OwnedCollaborationUseDep = null;

        @objid ("48119e49-7950-4853-9292-4ab0ecf485a4")
        private static SmDependency RedefinesDep = null;

        @objid ("ff253cb7-590e-4142-916b-9f788743b852")
        private static SmDependency CallerDep = null;

        @objid ("9cde8a29-4cfc-4405-a80f-74f8b03fdc5f")
        private static SmDependency CallingActionDep = null;

        @objid ("1fbf6fd7-5a2a-4310-8880-301f34a0b874")
        private static SmDependency EntryPointActionDep = null;

        @objid ("d5338ada-52ad-41d0-b934-0b698e150258")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OperationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("d6e6ddb9-2656-4623-ab25-5e07257f5032")
        public static SmAttribute ConcurrencyAtt() {
            if (ConcurrencyAtt == null) {
            	ConcurrencyAtt = classof().getAttributeDef("Concurrency");
            }
            return ConcurrencyAtt;
        }

        @objid ("8ee45a0a-dd51-4b35-8229-0758b634d51b")
        public static SmAttribute FinalAtt() {
            if (FinalAtt == null) {
            	FinalAtt = classof().getAttributeDef("Final");
            }
            return FinalAtt;
        }

        @objid ("cf724828-f08b-49c2-a2fe-c65afee48286")
        public static SmAttribute PassingAtt() {
            if (PassingAtt == null) {
            	PassingAtt = classof().getAttributeDef("Passing");
            }
            return PassingAtt;
        }

        @objid ("f7d9bea1-8c3b-4fab-b615-b318df9c7fd7")
        public static SmDependency OwnedImportDep() {
            if (OwnedImportDep == null) {
            	OwnedImportDep = classof().getDependencyDef("OwnedImport");
            }
            return OwnedImportDep;
        }

        @objid ("734045d0-6bef-4fb2-8228-d6f91732fb0e")
        public static SmDependency ThrownDep() {
            if (ThrownDep == null) {
            	ThrownDep = classof().getDependencyDef("Thrown");
            }
            return ThrownDep;
        }

        @objid ("ec859026-9747-45e8-965e-9d1dd2908f79")
        public static SmDependency CallerReceiveTaskDep() {
            if (CallerReceiveTaskDep == null) {
            	CallerReceiveTaskDep = classof().getDependencyDef("CallerReceiveTask");
            }
            return CallerReceiveTaskDep;
        }

        @objid ("50436a10-3e9a-431c-b584-ca910d86b294")
        public static SmDependency RedefinitionDep() {
            if (RedefinitionDep == null) {
            	RedefinitionDep = classof().getDependencyDef("Redefinition");
            }
            return RedefinitionDep;
        }

        @objid ("c49d2594-7783-41fa-b75e-7002b7bd93f2")
        public static SmDependency ExampleDep() {
            if (ExampleDep == null) {
            	ExampleDep = classof().getDependencyDef("Example");
            }
            return ExampleDep;
        }

        @objid ("b8a108cf-b3ed-42ff-8b61-7b1863294737")
        public static SmDependency SRepresentationDep() {
            if (SRepresentationDep == null) {
            	SRepresentationDep = classof().getDependencyDef("SRepresentation");
            }
            return SRepresentationDep;
        }

        @objid ("9a412ba7-e39a-4b0f-bc1d-3c8315e49bfe")
        public static SmDependency OwnedBehaviorDep() {
            if (OwnedBehaviorDep == null) {
            	OwnedBehaviorDep = classof().getDependencyDef("OwnedBehavior");
            }
            return OwnedBehaviorDep;
        }

        @objid ("49b83ddc-f98d-4747-9cc9-cc6a516b42e9")
        public static SmDependency BpmnOperationRefDep() {
            if (BpmnOperationRefDep == null) {
            	BpmnOperationRefDep = classof().getDependencyDef("BpmnOperationRef");
            }
            return BpmnOperationRefDep;
        }

        @objid ("24dab4e1-1208-4aa2-908b-b8fab21f1ee3")
        public static SmDependency CallerSendTaskDep() {
            if (CallerSendTaskDep == null) {
            	CallerSendTaskDep = classof().getDependencyDef("CallerSendTask");
            }
            return CallerSendTaskDep;
        }

        @objid ("1616ca3c-b8aa-479b-bc70-42b452c6e40e")
        public static SmDependency IODep() {
            if (IODep == null) {
            	IODep = classof().getDependencyDef("IO");
            }
            return IODep;
        }

        @objid ("b0c09894-4f06-4467-b63e-439ed3c204f0")
        public static SmDependency TemplateInstanciationDep() {
            if (TemplateInstanciationDep == null) {
            	TemplateInstanciationDep = classof().getDependencyDef("TemplateInstanciation");
            }
            return TemplateInstanciationDep;
        }

        @objid ("a4ee68f6-64a0-4439-9d29-d3e67003ac0f")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("f3f036cf-57c4-48e8-9fae-76fe3ec7356e")
        public static SmDependency OwnedPackageImportDep() {
            if (OwnedPackageImportDep == null) {
            	OwnedPackageImportDep = classof().getDependencyDef("OwnedPackageImport");
            }
            return OwnedPackageImportDep;
        }

        @objid ("7b7e3642-19d5-41df-9246-0528c81e4cce")
        public static SmDependency ReturnDep() {
            if (ReturnDep == null) {
            	ReturnDep = classof().getDependencyDef("Return");
            }
            return ReturnDep;
        }

        @objid ("53f47503-785d-4025-829b-2aaa86181eb8")
        public static SmDependency InstanciatingBindingDep() {
            if (InstanciatingBindingDep == null) {
            	InstanciatingBindingDep = classof().getDependencyDef("InstanciatingBinding");
            }
            return InstanciatingBindingDep;
        }

        @objid ("a439be88-d34d-4edd-a5a0-f9b296b038e0")
        public static SmDependency UsageDep() {
            if (UsageDep == null) {
            	UsageDep = classof().getDependencyDef("Usage");
            }
            return UsageDep;
        }

        @objid ("0597eeb0-12ee-4b8f-b533-70a44ebd04e4")
        public static SmDependency TemplateDep() {
            if (TemplateDep == null) {
            	TemplateDep = classof().getDependencyDef("Template");
            }
            return TemplateDep;
        }

        @objid ("f801a1a1-c00c-4f86-b982-f4dfdd9ba81b")
        public static SmDependency CallerServiceTaskDep() {
            if (CallerServiceTaskDep == null) {
            	CallerServiceTaskDep = classof().getDependencyDef("CallerServiceTask");
            }
            return CallerServiceTaskDep;
        }

        @objid ("0684b0d8-0115-4d1c-bca2-78fcae34fc9f")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("123c634d-432a-41ba-9ed7-9dfe1b6b8887")
        public static SmDependency InvokerDep() {
            if (InvokerDep == null) {
            	InvokerDep = classof().getDependencyDef("Invoker");
            }
            return InvokerDep;
        }

        @objid ("7b8d2aff-5b1d-4c58-aa4e-7dbbbc1828eb")
        public static SmDependency CommunicationUsageDep() {
            if (CommunicationUsageDep == null) {
            	CommunicationUsageDep = classof().getDependencyDef("CommunicationUsage");
            }
            return CommunicationUsageDep;
        }

        @objid ("a77e35e0-f3b1-4567-8a1c-867440e572dc")
        public static SmDependency OwnedCollaborationUseDep() {
            if (OwnedCollaborationUseDep == null) {
            	OwnedCollaborationUseDep = classof().getDependencyDef("OwnedCollaborationUse");
            }
            return OwnedCollaborationUseDep;
        }

        @objid ("6f16c73d-5f22-4d83-9710-a12c94c04729")
        public static SmDependency RedefinesDep() {
            if (RedefinesDep == null) {
            	RedefinesDep = classof().getDependencyDef("Redefines");
            }
            return RedefinesDep;
        }

        @objid ("92e82e4b-43c3-4368-ba78-cf54da71a618")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("89f069b9-eb36-4c7e-aa35-d83b62b00c19")
        public static SmDependency CallingActionDep() {
            if (CallingActionDep == null) {
            	CallingActionDep = classof().getDependencyDef("CallingAction");
            }
            return CallingActionDep;
        }

        @objid ("4099f646-ebcf-4963-a584-5dff29b118cf")
        public static SmDependency EntryPointActionDep() {
            if (EntryPointActionDep == null) {
            	EntryPointActionDep = classof().getDependencyDef("EntryPointAction");
            }
            return EntryPointActionDep;
        }

        @objid ("1c5d88f7-ea06-4169-a296-e7bb6363b8b2")
        public static SmDependency getEntryPointActionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryPointActionDep;
        }

        @objid ("4154fd00-af52-496a-ab71-6a686b75d194")
        public static SmDependency getReturnDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReturnDep;
        }

        @objid ("7a2f0b8c-c15c-4275-899f-732126530458")
        public static SmDependency getTemplateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateDep;
        }

        @objid ("a0a4ff0b-334c-4b17-843a-f191a72e6b82")
        public static SmDependency getOwnedBehaviorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedBehaviorDep;
        }

        @objid ("b2ee7f1b-0eae-4a25-baca-6ac88a262b80")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("14220e29-4575-424e-91c3-05ea97ab1338")
        public static SmDependency getSRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SRepresentationDep;
        }

        @objid ("0a874e74-8a69-4a52-9e4f-a8a344e5db10")
        public static SmDependency getUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsageDep;
        }

        @objid ("90edbaf6-2d07-4a97-a17e-94dbaf624850")
        public static SmDependency getOwnedCollaborationUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedCollaborationUseDep;
        }

        @objid ("ea733397-868f-4450-8ee8-7790dce61ffb")
        public static SmDependency getCallerSendTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerSendTaskDep;
        }

        @objid ("8d5701dc-89ef-4683-81bd-1ac55a84f3e8")
        public static SmDependency getCallingActionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallingActionDep;
        }

        @objid ("2e177b5e-b6d1-41cf-9a25-c59d6e72dab0")
        public static SmDependency getRedefinesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RedefinesDep;
        }

        @objid ("2b95c7af-a237-4b2b-bb38-a9243c5d827b")
        public static SmDependency getRedefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RedefinitionDep;
        }

        @objid ("ecd3c129-a64c-4b9d-a3ed-2e7e869833bf")
        public static SmDependency getThrownDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrownDep;
        }

        @objid ("53d576dc-2766-49b4-8d27-1b20854642c1")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("b713f06b-754a-4b47-b9a9-236b496452d1")
        public static SmDependency getBpmnOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnOperationRefDep;
        }

        @objid ("e79a71c2-a797-4b65-9ce4-34dba880c76c")
        public static SmDependency getCallerReceiveTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerReceiveTaskDep;
        }

        @objid ("2688b72c-c834-4b10-a6cc-b3d01803dce6")
        public static SmDependency getExampleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExampleDep;
        }

        @objid ("0b8de1ec-d509-4746-aaf9-3befb8eba5a2")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("ed8d861c-4355-442b-9245-2128218ca939")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("d5cd8191-8cd7-44af-941f-53ab7952a7fd")
        public static SmDependency getTemplateInstanciationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateInstanciationDep;
        }

        @objid ("204e3302-b669-47ff-a0f8-71677cf500f1")
        public static SmDependency getInvokerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvokerDep;
        }

        @objid ("c602d898-83f9-4946-9d08-9a646e4fcdfb")
        public static SmAttribute getPassingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PassingAtt;
        }

        @objid ("6fec6908-c9f0-479e-82c1-e2f9f3155a92")
        public static SmAttribute getConcurrencyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConcurrencyAtt;
        }

        @objid ("6c52f6ab-bf69-4760-b2a7-f3f05d220d34")
        public static SmDependency getIODep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IODep;
        }

        @objid ("7046d16b-0da5-417b-b3fa-2da189cf532b")
        public static SmDependency getCommunicationUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CommunicationUsageDep;
        }

        @objid ("647d4b11-c2b9-4143-b352-221738c7491c")
        public static SmDependency getOwnedPackageImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedPackageImportDep;
        }

        @objid ("fb194175-1753-49cb-8226-76fe30c4eb86")
        public static SmAttribute getFinalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FinalAtt;
        }

        @objid ("bb42051c-a33e-404c-b3a8-ee5f920c90a8")
        public static SmDependency getCallerServiceTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerServiceTaskDep;
        }

        @objid ("a429c4a6-cd9a-46a6-a707-e8e0607fc291")
        public static SmDependency getInstanciatingBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatingBindingDep;
        }

        @objid ("e76aeee9-da64-493a-a258-0ab4b83c1e1d")
        public static SmDependency getOwnedImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedImportDep;
        }

        @objid ("0008b808-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("c61d2b7a-d20a-4d0d-a676-1ba74bd227ff")
            public ISmObjectData createData() {
                return new OperationData();
            }

            @objid ("1888908b-319c-44b0-85d1-f0ac1808518a")
            public SmObjectImpl createImpl() {
                return new OperationImpl();
            }

        }

        @objid ("0009192e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConcurrencySmAttribute extends SmAttribute {
            @objid ("dd6c8052-43e7-437e-a0e5-2ab981988f11")
            public Object getValue(ISmObjectData data) {
                return ((OperationData) data).mConcurrency;
            }

            @objid ("a06141f8-d02d-4e34-83e0-4bab22e7a1ad")
            public void setValue(ISmObjectData data, Object value) {
                ((OperationData) data).mConcurrency = value;
            }

        }

        @objid ("00097a18-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FinalSmAttribute extends SmAttribute {
            @objid ("7cb09ce4-f704-401e-a0ba-28af9176a5c9")
            public Object getValue(ISmObjectData data) {
                return ((OperationData) data).mFinal;
            }

            @objid ("e53717e9-91e6-47b4-af7e-d421de8259d2")
            public void setValue(ISmObjectData data, Object value) {
                ((OperationData) data).mFinal = value;
            }

        }

        @objid ("0009dbca-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PassingSmAttribute extends SmAttribute {
            @objid ("511eb9d2-4acf-4a4e-9aca-441f640ed2cd")
            public Object getValue(ISmObjectData data) {
                return ((OperationData) data).mPassing;
            }

            @objid ("3dd5f1f9-b71c-42f8-9282-c7f8b928174b")
            public void setValue(ISmObjectData data, Object value) {
                ((OperationData) data).mPassing = value;
            }

        }

        @objid ("000a5262-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExampleSmDependency extends SmMultipleDependency {
            @objid ("d075bd44-f363-44d5-b20f-96d50fe842a1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mExample != null)? ((OperationData)data).mExample:SmMultipleDependency.EMPTY;
            }

            @objid ("edb59a4b-883a-453e-802d-66401a4e14c1")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mExample = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mExample;
            }

            @objid ("0fe62e67-cbe5-40ff-a8c4-11d1150b46d9")
            @Override
            public SmDependency getSymetric() {
                return CollaborationData.Metadata.ORepresentedDep();
            }

        }

        @objid ("000abdba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IOSmDependency extends SmMultipleDependency {
            @objid ("5dc034d4-dc7c-4c25-b003-dc0ba123d9c0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mIO != null)? ((OperationData)data).mIO:SmMultipleDependency.EMPTY;
            }

            @objid ("696d32c2-a9aa-44d6-be80-dafbf8d16134")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mIO = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mIO;
            }

            @objid ("14cec17a-5ee6-45b7-a93d-ce9b503636d4")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.ComposedDep();
            }

        }

        @objid ("000b24b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InstanciatingBindingSmDependency extends SmMultipleDependency {
            @objid ("c721fd39-1f80-4a3a-bbe5-cb46db9cd959")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mInstanciatingBinding != null)? ((OperationData)data).mInstanciatingBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("29ded54d-267a-47c3-b73a-93576932b5a3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mInstanciatingBinding = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mInstanciatingBinding;
            }

            @objid ("add7dfbb-efe9-4cbd-8538-8ea84fa8def1")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.InstanciatedTemplateOperationDep();
            }

        }

        @objid ("000b89f2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InvokerSmDependency extends SmMultipleDependency {
            @objid ("e833fe75-aa15-4fab-822d-c04c9d36f6e0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mInvoker != null)? ((OperationData)data).mInvoker:SmMultipleDependency.EMPTY;
            }

            @objid ("942b87d6-f4d9-4f39-8e9e-9ebd304ab198")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mInvoker = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mInvoker;
            }

            @objid ("472a3a2b-0349-4487-afb0-88c4743cfa7c")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.ProcessedDep();
            }

        }

        @objid ("000bef3c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("11d47163-a61d-41ee-a082-8e7ada5ccb37")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOccurence != null)? ((OperationData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("a80400b5-8040-40f0-8034-43d516a9ead6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOccurence;
            }

            @objid ("6ad05043-0a78-41bf-a2b0-5c0046d91ecf")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.CalledDep();
            }

        }

        @objid ("000c62c8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedBehaviorSmDependency extends SmMultipleDependency {
            @objid ("5937aa0a-c7f8-4f2b-95b9-82504db7d776")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedBehavior != null)? ((OperationData)data).mOwnedBehavior:SmMultipleDependency.EMPTY;
            }

            @objid ("631b300f-4ec4-463e-ab68-1570ff86005a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedBehavior = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedBehavior;
            }

            @objid ("e510d924-ab34-4626-9956-3836cba2ce47")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.OwnerOperationDep();
            }

        }

        @objid ("000cd4ba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedCollaborationUseSmDependency extends SmMultipleDependency {
            @objid ("df283408-ed17-4034-a9e1-4533cb450263")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedCollaborationUse != null)? ((OperationData)data).mOwnedCollaborationUse:SmMultipleDependency.EMPTY;
            }

            @objid ("002a3bde-855e-4db8-9975-93d7cd03ebfc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedCollaborationUse = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedCollaborationUse;
            }

            @objid ("548af980-c95c-42d3-bbbf-01165bc3cf13")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.ORepresentedDep();
            }

        }

        @objid ("000d3bd0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedImportSmDependency extends SmMultipleDependency {
            @objid ("dafb6951-a46f-4bef-8b87-d2c1e9fce01d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedImport != null)? ((OperationData)data).mOwnedImport:SmMultipleDependency.EMPTY;
            }

            @objid ("7a804dc9-2de4-4013-90f5-d8a2acaa1cc5")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedImport = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedImport;
            }

            @objid ("afb8c93c-5c9e-4e51-99f1-0db07599391d")
            @Override
            public SmDependency getSymetric() {
                return ElementImportData.Metadata.ImportingOperationDep();
            }

        }

        @objid ("000da8fe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedPackageImportSmDependency extends SmMultipleDependency {
            @objid ("b61b0ceb-c495-4589-81e3-d9fb3069648c")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedPackageImport != null)? ((OperationData)data).mOwnedPackageImport:SmMultipleDependency.EMPTY;
            }

            @objid ("ffaa58c8-33a3-4506-aba6-44173eda7bea")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedPackageImport = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedPackageImport;
            }

            @objid ("df5efe8f-2233-4360-ae1a-cdf41adb60ed")
            @Override
            public SmDependency getSymetric() {
                return PackageImportData.Metadata.ImportingOperationDep();
            }

        }

        @objid ("000e11ea-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RedefinesSmDependency extends SmSingleDependency {
            @objid ("f1dc7a96-1cbc-4bf8-b756-60512a5e5b20")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OperationData) data).mRedefines;
            }

            @objid ("bdab34d3-50e6-4275-83a6-432c4be6b89f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OperationData) data).mRedefines = value;
            }

            @objid ("c28664d3-2966-4f18-9165-d33e53c35c1f")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.RedefinitionDep();
            }

        }

        @objid ("000e98fe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RedefinitionSmDependency extends SmMultipleDependency {
            @objid ("e8a2ca29-01c3-4502-b30b-c15e826dc635")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mRedefinition != null)? ((OperationData)data).mRedefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("7b1bc216-489e-4c60-83f7-88cb548239e4")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mRedefinition = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mRedefinition;
            }

            @objid ("8b4cc773-7854-4ce6-b877-ddb77cee4dfa")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.RedefinesDep();
            }

        }

        @objid ("000f0dde-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReturnSmDependency extends SmSingleDependency {
            @objid ("b6c1320e-dbd2-4a41-b355-495ad5810c00")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OperationData) data).mReturn;
            }

            @objid ("c3503863-411a-4ef1-bea1-f27925b83ed9")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OperationData) data).mReturn = value;
            }

            @objid ("24c15333-2270-4e76-ac1e-cfb328b5fa0e")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.ReturnedDep();
            }

        }

        @objid ("000f8bce-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SRepresentationSmDependency extends SmMultipleDependency {
            @objid ("2faa4221-7001-4261-aebb-99fa58de70ac")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mSRepresentation != null)? ((OperationData)data).mSRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("afbe5363-b5eb-475f-8fef-f4dbe6bc5bb8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mSRepresentation = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mSRepresentation;
            }

            @objid ("f6ed663b-651b-4ef9-bdda-bc336e58067e")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.OBaseDep();
            }

        }

        @objid ("000ffbea-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TemplateSmDependency extends SmMultipleDependency {
            @objid ("31770c71-0cb8-48fd-a59e-1411b728a807")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mTemplate != null)? ((OperationData)data).mTemplate:SmMultipleDependency.EMPTY;
            }

            @objid ("ca9af7c2-2442-42e7-b87c-c0916a680572")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mTemplate = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mTemplate;
            }

            @objid ("79127291-72dc-4e16-bea0-f43a61048f8a")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.ParameterizedOperationDep();
            }

        }

        @objid ("00106882-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TemplateInstanciationSmDependency extends SmMultipleDependency {
            @objid ("ea3c3303-b4e4-49ca-b1a0-4f9cbaae30a2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mTemplateInstanciation != null)? ((OperationData)data).mTemplateInstanciation:SmMultipleDependency.EMPTY;
            }

            @objid ("3922ba39-c9f2-4a94-8a64-a1cbacce4f6a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mTemplateInstanciation = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mTemplateInstanciation;
            }

            @objid ("209caf04-c222-4fff-b339-4aa0e08e4871")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.BoundOperationDep();
            }

        }

        @objid ("0010dfd8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ThrownSmDependency extends SmMultipleDependency {
            @objid ("961a634b-96de-4f6e-b4b3-3f5e4eb57371")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mThrown != null)? ((OperationData)data).mThrown:SmMultipleDependency.EMPTY;
            }

            @objid ("a51a3530-d075-4d1e-be54-61b65e39dc75")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mThrown = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mThrown;
            }

            @objid ("06dcb791-b1ce-46d8-afc4-18cd3b2a2fa6")
            @Override
            public SmDependency getSymetric() {
                return RaisedExceptionData.Metadata.ThrowerDep();
            }

        }

        @objid ("0011639a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class UsageSmDependency extends SmMultipleDependency {
            @objid ("682fb3cd-5520-4d3f-9ed0-13395ea9ae47")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mUsage != null)? ((OperationData)data).mUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("4f0825be-d92a-4cb5-99fc-94910ff837fc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mUsage = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mUsage;
            }

            @objid ("abd8ee88-d4a0-417a-ba11-96d7d7011098")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.InvokedDep();
            }

        }

        @objid ("0011d492-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryPointActionSmDependency extends SmMultipleDependency {
            @objid ("35eaec4b-02f1-4855-a55a-7cfd7428d0f6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mEntryPointAction != null)? ((OperationData)data).mEntryPointAction:SmMultipleDependency.EMPTY;
            }

            @objid ("763c361c-2ac5-4c4b-a60a-5cc25c4fbba3")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mEntryPointAction = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mEntryPointAction;
            }

            @objid ("600dbeb5-4032-46d3-bd87-ebfd07d3cc84")
            @Override
            public SmDependency getSymetric() {
                return AcceptCallEventActionData.Metadata.CalledDep();
            }

        }

        @objid ("0012424c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CommunicationUsageSmDependency extends SmMultipleDependency {
            @objid ("61593ad0-04f5-4adf-9de1-1a3946403176")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCommunicationUsage != null)? ((OperationData)data).mCommunicationUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("324a3211-96cb-49d6-ac01-5517da1e3d3d")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCommunicationUsage = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCommunicationUsage;
            }

            @objid ("7207ea82-021e-4be8-8148-a76277cceb92")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.InvokedDep();
            }

        }

        @objid ("0012b5ec-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallingActionSmDependency extends SmMultipleDependency {
            @objid ("e820b737-6b0b-42d4-af76-91c173acc8f5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallingAction != null)? ((OperationData)data).mCallingAction:SmMultipleDependency.EMPTY;
            }

            @objid ("d7dcd042-07f6-4ec3-8b5d-89d88bc5456b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallingAction = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallingAction;
            }

            @objid ("911ed9f5-e4d8-4566-b1d5-6cc3348b8672")
            @Override
            public SmDependency getSymetric() {
                return CallOperationActionData.Metadata.CalledDep();
            }

        }

        @objid ("00132540-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("1cbf9c61-f846-4ee8-b2c5-92a18d33c4da")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCaller != null)? ((OperationData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("fea59bc6-442f-42a3-9e71-e5a91918f8e6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCaller;
            }

            @objid ("bc440aab-27c6-431c-84b1-79dd00df3d4a")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledOperationDep();
            }

        }

        @objid ("0013a97a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BpmnOperationRefSmDependency extends SmMultipleDependency {
            @objid ("0255a4d3-2810-4642-8267-1b6984a6a2d7")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mBpmnOperationRef != null)? ((OperationData)data).mBpmnOperationRef:SmMultipleDependency.EMPTY;
            }

            @objid ("c5caacd3-abb2-4a6a-8d03-54665355276b")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mBpmnOperationRef = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mBpmnOperationRef;
            }

            @objid ("c3695a2d-dd47-4ca3-9b00-ff353dd67ddf")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.ImplementationRefDep();
            }

        }

        @objid ("00142602-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerSendTaskSmDependency extends SmMultipleDependency {
            @objid ("0202140f-bc4b-4d12-bc4c-9db8101141c3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallerSendTask != null)? ((OperationData)data).mCallerSendTask:SmMultipleDependency.EMPTY;
            }

            @objid ("e0080b32-5e1a-4fa8-9251-7ad05a218388")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallerSendTask = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallerSendTask;
            }

            @objid ("81481ab5-90c8-461f-b7c4-6b3fb059a860")
            @Override
            public SmDependency getSymetric() {
                return BpmnSendTaskData.Metadata.CalledOperationDep();
            }

        }

        @objid ("001497c2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerReceiveTaskSmDependency extends SmMultipleDependency {
            @objid ("3b8c5641-386c-44a0-ab99-408660ce0575")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallerReceiveTask != null)? ((OperationData)data).mCallerReceiveTask:SmMultipleDependency.EMPTY;
            }

            @objid ("68a50cc7-f85f-4a46-ac59-bf760f5e6386")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallerReceiveTask = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallerReceiveTask;
            }

            @objid ("3e0eb931-d2ac-4bcf-9e3b-a9b9077f846f")
            @Override
            public SmDependency getSymetric() {
                return BpmnReceiveTaskData.Metadata.CalledOperationDep();
            }

        }

        @objid ("00150e96-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerServiceTaskSmDependency extends SmMultipleDependency {
            @objid ("3f4e466b-afcd-4334-b864-882f645f7e15")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallerServiceTask != null)? ((OperationData)data).mCallerServiceTask:SmMultipleDependency.EMPTY;
            }

            @objid ("30c4dc61-61fc-435b-862f-7f68e56c2278")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallerServiceTask = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallerServiceTask;
            }

            @objid ("dbe6e99a-b823-4e66-8fec-e30c9ea4f3ae")
            @Override
            public SmDependency getSymetric() {
                return BpmnServiceTaskData.Metadata.CalledOperationDep();
            }

        }

        @objid ("00158074-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("604de9cd-e73e-4b9a-aa41-79a9ebf0b119")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OperationData) data).mOwner;
            }

            @objid ("e7ef8acb-7061-4a11-8d8f-cab72ebdd736")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OperationData) data).mOwner = value;
            }

            @objid ("03575ba5-f92e-467c-a30e-da8ded79a94a")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedOperationDep();
            }

        }

    }

}
