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
    @objid ("19b96552-7378-4be2-b938-fd2faaa15856")
    @SmaMetaAttribute(metaName="Concurrency", type=Boolean.class, smAttributeClass=Metadata.ConcurrencySmAttribute.class)
     Object mConcurrency = false;

    @objid ("4c74c5a3-10f3-404f-84f2-5b36f23011ef")
    @SmaMetaAttribute(metaName="Final", type=Boolean.class, smAttributeClass=Metadata.FinalSmAttribute.class)
     Object mFinal = false;

    @objid ("1fa8d0e5-c4b8-48a3-aa25-96e3adb7bc49")
    @SmaMetaAttribute(metaName="Passing", type=MethodPassingMode.class, smAttributeClass=Metadata.PassingSmAttribute.class)
     Object mPassing = MethodPassingMode.METHODOUT;

    @objid ("26a51efb-f437-45bd-9c7d-e56edd132dd8")
    @SmaMetaAssociation(metaName="OwnedImport", typeDataClass=ElementImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedImport = null;

    @objid ("42b91f8d-f1e8-41b4-818d-e376ee7def3b")
    @SmaMetaAssociation(metaName="Thrown", typeDataClass=RaisedExceptionData.class, min=0, max=-1, smAssociationClass=Metadata.ThrownSmDependency.class, component = true)
     List<SmObjectImpl> mThrown = null;

    @objid ("df7c9fc0-db82-4de3-804d-b0f9e0cd8a72")
    @SmaMetaAssociation(metaName="CallerReceiveTask", typeDataClass=BpmnReceiveTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerReceiveTaskSmDependency.class)
     List<SmObjectImpl> mCallerReceiveTask = null;

    @objid ("ba9b7643-8ba8-47b4-b414-6fd4c7852f11")
    @SmaMetaAssociation(metaName="Redefinition", typeDataClass=OperationData.class, min=0, max=-1, smAssociationClass=Metadata.RedefinitionSmDependency.class)
     List<SmObjectImpl> mRedefinition = null;

    @objid ("e1b5907a-4477-4a93-8ca0-dcfa59d48981")
    @SmaMetaAssociation(metaName="Example", typeDataClass=CollaborationData.class, min=0, max=-1, smAssociationClass=Metadata.ExampleSmDependency.class, component = true)
     List<SmObjectImpl> mExample = null;

    @objid ("988d39ee-8725-49cb-bed8-1960e8853e2c")
    @SmaMetaAssociation(metaName="SRepresentation", typeDataClass=SignalData.class, min=0, max=-1, smAssociationClass=Metadata.SRepresentationSmDependency.class)
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("9b7275d5-6ce3-4663-96f7-9a5fd70f144b")
    @SmaMetaAssociation(metaName="OwnedBehavior", typeDataClass=BehaviorData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedBehaviorSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedBehavior = null;

    @objid ("a484be2a-f7fd-41e4-a918-689ea722e47a")
    @SmaMetaAssociation(metaName="BpmnOperationRef", typeDataClass=BpmnOperationData.class, min=0, max=-1, smAssociationClass=Metadata.BpmnOperationRefSmDependency.class)
     List<SmObjectImpl> mBpmnOperationRef = null;

    @objid ("60b1ff8b-e51f-450c-88e7-9de0ac9975a1")
    @SmaMetaAssociation(metaName="CallerSendTask", typeDataClass=BpmnSendTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSendTaskSmDependency.class)
     List<SmObjectImpl> mCallerSendTask = null;

    @objid ("efcb2863-82d3-47a1-b290-2b6541dc60fa")
    @SmaMetaAssociation(metaName="IO", typeDataClass=ParameterData.class, min=0, max=-1, smAssociationClass=Metadata.IOSmDependency.class, component = true)
     List<SmObjectImpl> mIO = null;

    @objid ("42bd5334-279e-44db-9c05-fe8aae551d8f")
    @SmaMetaAssociation(metaName="TemplateInstanciation", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateInstanciationSmDependency.class, component = true)
     List<SmObjectImpl> mTemplateInstanciation = null;

    @objid ("eb284f18-861a-4ee5-90ff-1e90511254cd")
    @SmaMetaAssociation(metaName="Owner", typeDataClass=ClassifierData.class, min=1, max=1, smAssociationClass=Metadata.OwnerSmDependency.class)
     SmObjectImpl mOwner;

    @objid ("00e0ac3e-f34e-4cd6-b3d7-70a6eff92822")
    @SmaMetaAssociation(metaName="OwnedPackageImport", typeDataClass=PackageImportData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedPackageImportSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedPackageImport = null;

    @objid ("0b86f2c9-ec53-4b52-b8c2-c429d9df84e4")
    @SmaMetaAssociation(metaName="Return", typeDataClass=ParameterData.class, min=0, max=1, smAssociationClass=Metadata.ReturnSmDependency.class, component = true)
     SmObjectImpl mReturn;

    @objid ("31ac183d-5b17-4cd3-b259-9e399c6fd8b4")
    @SmaMetaAssociation(metaName="InstanciatingBinding", typeDataClass=TemplateBindingData.class, min=0, max=-1, smAssociationClass=Metadata.InstanciatingBindingSmDependency.class)
     List<SmObjectImpl> mInstanciatingBinding = null;

    @objid ("c81df5c3-d304-4cda-80e4-c9d5666507ef")
    @SmaMetaAssociation(metaName="Usage", typeDataClass=MessageData.class, min=0, max=-1, smAssociationClass=Metadata.UsageSmDependency.class)
     List<SmObjectImpl> mUsage = null;

    @objid ("c62cd3d1-0516-4ad0-b8d3-0715a842bbb2")
    @SmaMetaAssociation(metaName="Template", typeDataClass=TemplateParameterData.class, min=0, max=-1, smAssociationClass=Metadata.TemplateSmDependency.class, component = true)
     List<SmObjectImpl> mTemplate = null;

    @objid ("5063e0ab-8276-4440-a3d4-307ef9187aa2")
    @SmaMetaAssociation(metaName="CallerServiceTask", typeDataClass=BpmnServiceTaskData.class, min=0, max=-1, smAssociationClass=Metadata.CallerServiceTaskSmDependency.class)
     List<SmObjectImpl> mCallerServiceTask = null;

    @objid ("cd4a4fb9-3385-40dc-92a6-14cd0b1b5479")
    @SmaMetaAssociation(metaName="Occurence", typeDataClass=EventData.class, min=0, max=-1, smAssociationClass=Metadata.OccurenceSmDependency.class)
     List<SmObjectImpl> mOccurence = null;

    @objid ("9216fd24-62f3-4f8a-b00b-cf819f53ed66")
    @SmaMetaAssociation(metaName="Invoker", typeDataClass=TransitionData.class, min=0, max=-1, smAssociationClass=Metadata.InvokerSmDependency.class)
     List<SmObjectImpl> mInvoker = null;

    @objid ("1df89870-8b38-4e76-869c-c3ccf02cd44e")
    @SmaMetaAssociation(metaName="CommunicationUsage", typeDataClass=CommunicationMessageData.class, min=0, max=-1, smAssociationClass=Metadata.CommunicationUsageSmDependency.class)
     List<SmObjectImpl> mCommunicationUsage = null;

    @objid ("c623932c-238d-4d93-9318-1df67e7bd8c5")
    @SmaMetaAssociation(metaName="OwnedCollaborationUse", typeDataClass=CollaborationUseData.class, min=0, max=-1, smAssociationClass=Metadata.OwnedCollaborationUseSmDependency.class, component = true)
     List<SmObjectImpl> mOwnedCollaborationUse = null;

    @objid ("b81e883a-85ea-497c-8fa5-8c99a23b6b30")
    @SmaMetaAssociation(metaName="Redefines", typeDataClass=OperationData.class, min=0, max=1, smAssociationClass=Metadata.RedefinesSmDependency.class, partof = true)
     SmObjectImpl mRedefines;

    @objid ("0a265193-86be-470c-aab6-7276825297fd")
    @SmaMetaAssociation(metaName="Caller", typeDataClass=BpmnCallActivityData.class, min=0, max=-1, smAssociationClass=Metadata.CallerSmDependency.class)
     List<SmObjectImpl> mCaller = null;

    @objid ("bed0c472-416a-4f28-ab36-40810a34e6c7")
    @SmaMetaAssociation(metaName="CallingAction", typeDataClass=CallOperationActionData.class, min=0, max=-1, smAssociationClass=Metadata.CallingActionSmDependency.class)
     List<SmObjectImpl> mCallingAction = null;

    @objid ("c4e7b1f2-1c09-461b-92a7-71114b1603f7")
    @SmaMetaAssociation(metaName="EntryPointAction", typeDataClass=AcceptCallEventActionData.class, min=0, max=-1, smAssociationClass=Metadata.EntryPointActionSmDependency.class)
     List<SmObjectImpl> mEntryPointAction = null;

    @objid ("d54463e5-af68-4ec8-92e3-7ab6527b4a4c")
    public SmClass getClassOf() {
        return Metadata.classof();
    }

    @objid ("00087172-c4c5-1fd8-97fe-001ec947cd2a")
    public static class Metadata {
        @objid ("b6b2d08d-601f-4514-87a5-0560b6824613")
        private static SmClass smClass = null;

        @objid ("f462b902-b2b5-4be2-a662-e7a3d1a4ef32")
        private static SmAttribute ConcurrencyAtt = null;

        @objid ("2bedc838-8391-4e32-8f62-8b9fe981fc8a")
        private static SmAttribute FinalAtt = null;

        @objid ("c51eda31-2766-4b86-89e3-407d655e1191")
        private static SmAttribute PassingAtt = null;

        @objid ("f4833be5-826a-4429-8498-afaf4a5fa2f7")
        private static SmDependency OwnedImportDep = null;

        @objid ("f96e5f2f-bdc5-46e5-8cd4-eb411344e4e1")
        private static SmDependency ThrownDep = null;

        @objid ("e72a6ca7-41b3-4527-aa71-8b02045a6632")
        private static SmDependency CallerReceiveTaskDep = null;

        @objid ("b8c33cd0-0d00-49e6-9f96-316ee3e0a082")
        private static SmDependency RedefinitionDep = null;

        @objid ("e042214f-67ce-421d-a834-6dc3489de6f9")
        private static SmDependency ExampleDep = null;

        @objid ("4e533bb5-cbe4-489f-a0f7-550c0bbe6126")
        private static SmDependency SRepresentationDep = null;

        @objid ("adecb4dc-98eb-43bb-b882-88fff44ebeac")
        private static SmDependency OwnedBehaviorDep = null;

        @objid ("6b672484-6f7b-4eae-b943-73fe48cd50a4")
        private static SmDependency BpmnOperationRefDep = null;

        @objid ("d0ae6c7f-b3a7-4801-a54f-bc13182c3d9c")
        private static SmDependency CallerSendTaskDep = null;

        @objid ("99c7ee30-03fe-4c18-9075-c5f50e03ebc0")
        private static SmDependency IODep = null;

        @objid ("cb2b9a45-1621-4c21-b883-d524d8a89bac")
        private static SmDependency TemplateInstanciationDep = null;

        @objid ("a726eb1d-ab4f-4745-9046-fe752d4a111e")
        private static SmDependency OwnerDep = null;

        @objid ("e82b9362-920d-4fc4-9cf3-7b5aee0bef5b")
        private static SmDependency OwnedPackageImportDep = null;

        @objid ("9af990dd-d245-4839-94b4-76879cee2952")
        private static SmDependency ReturnDep = null;

        @objid ("18780df0-f263-4bdd-9f39-2749e825b269")
        private static SmDependency InstanciatingBindingDep = null;

        @objid ("196a2419-2e49-458c-9b58-6505475cf99a")
        private static SmDependency UsageDep = null;

        @objid ("cf5e744d-d403-4389-b567-22603cb7b769")
        private static SmDependency TemplateDep = null;

        @objid ("c127e169-7a99-4668-8dd4-219f50251865")
        private static SmDependency CallerServiceTaskDep = null;

        @objid ("79914b24-094a-4af6-b5f9-fd4e501266a0")
        private static SmDependency OccurenceDep = null;

        @objid ("3f387f03-cfef-482f-be97-567a72bbfccf")
        private static SmDependency InvokerDep = null;

        @objid ("f544115a-4785-4ecd-b09a-194e5bd3d3b3")
        private static SmDependency CommunicationUsageDep = null;

        @objid ("2070644b-9cdf-498a-b147-0b1d0128be0a")
        private static SmDependency OwnedCollaborationUseDep = null;

        @objid ("5bdb4fb8-2f72-468b-9458-01fafe96308a")
        private static SmDependency RedefinesDep = null;

        @objid ("c30fc02e-fa79-4339-8bda-139a55ac940f")
        private static SmDependency CallerDep = null;

        @objid ("a4b6e195-8d8c-4d23-9760-64cfd4a09fc5")
        private static SmDependency CallingActionDep = null;

        @objid ("336f2378-fe26-4b43-a3f7-ca04d0f35626")
        private static SmDependency EntryPointActionDep = null;

        @objid ("d2441456-a163-4544-b6dc-383dd63e6b58")
        public static SmClass classof() {
            try { if (smClass == null) { smClass = SmClass.getSmClassFor(OperationData.class);}return smClass;} catch (IllegalArgumentException e) {throw new Error(e);}
        }

        @objid ("8e0f55b4-ef7a-4b62-8cfe-1e05fcc83cae")
        public static SmAttribute ConcurrencyAtt() {
            if (ConcurrencyAtt == null) {
            	ConcurrencyAtt = classof().getAttributeDef("Concurrency");
            }
            return ConcurrencyAtt;
        }

        @objid ("4715e1e1-26bf-4dd5-99bb-f70f16d58669")
        public static SmAttribute FinalAtt() {
            if (FinalAtt == null) {
            	FinalAtt = classof().getAttributeDef("Final");
            }
            return FinalAtt;
        }

        @objid ("7552bbe8-2c70-4cf3-bcdc-f327d95483b2")
        public static SmAttribute PassingAtt() {
            if (PassingAtt == null) {
            	PassingAtt = classof().getAttributeDef("Passing");
            }
            return PassingAtt;
        }

        @objid ("218732bd-9848-45bb-8f58-7215bd697987")
        public static SmDependency OwnedImportDep() {
            if (OwnedImportDep == null) {
            	OwnedImportDep = classof().getDependencyDef("OwnedImport");
            }
            return OwnedImportDep;
        }

        @objid ("0c2d87e4-c55d-4cc8-8599-78e75ccbe03a")
        public static SmDependency ThrownDep() {
            if (ThrownDep == null) {
            	ThrownDep = classof().getDependencyDef("Thrown");
            }
            return ThrownDep;
        }

        @objid ("ba492d2e-6653-448a-82d0-6e935856f2fc")
        public static SmDependency CallerReceiveTaskDep() {
            if (CallerReceiveTaskDep == null) {
            	CallerReceiveTaskDep = classof().getDependencyDef("CallerReceiveTask");
            }
            return CallerReceiveTaskDep;
        }

        @objid ("8b972463-c4c9-40b2-a0cd-303858e473e3")
        public static SmDependency RedefinitionDep() {
            if (RedefinitionDep == null) {
            	RedefinitionDep = classof().getDependencyDef("Redefinition");
            }
            return RedefinitionDep;
        }

        @objid ("3b380396-1eba-4b25-bdc3-361bd293fd3f")
        public static SmDependency ExampleDep() {
            if (ExampleDep == null) {
            	ExampleDep = classof().getDependencyDef("Example");
            }
            return ExampleDep;
        }

        @objid ("9a0fdca5-dd3d-4466-af21-9cb18c309f3c")
        public static SmDependency SRepresentationDep() {
            if (SRepresentationDep == null) {
            	SRepresentationDep = classof().getDependencyDef("SRepresentation");
            }
            return SRepresentationDep;
        }

        @objid ("0562fa5e-c805-418d-8c9e-e6ef871b57de")
        public static SmDependency OwnedBehaviorDep() {
            if (OwnedBehaviorDep == null) {
            	OwnedBehaviorDep = classof().getDependencyDef("OwnedBehavior");
            }
            return OwnedBehaviorDep;
        }

        @objid ("a74c0c41-f278-44cc-8630-99ba7ae5571b")
        public static SmDependency BpmnOperationRefDep() {
            if (BpmnOperationRefDep == null) {
            	BpmnOperationRefDep = classof().getDependencyDef("BpmnOperationRef");
            }
            return BpmnOperationRefDep;
        }

        @objid ("52d63a9f-8088-4b4f-8b97-4c9ec6eeb28b")
        public static SmDependency CallerSendTaskDep() {
            if (CallerSendTaskDep == null) {
            	CallerSendTaskDep = classof().getDependencyDef("CallerSendTask");
            }
            return CallerSendTaskDep;
        }

        @objid ("506b9e42-aa71-4b85-99b0-64c25203e8ec")
        public static SmDependency IODep() {
            if (IODep == null) {
            	IODep = classof().getDependencyDef("IO");
            }
            return IODep;
        }

        @objid ("f7276727-5bea-42c8-b799-0ae91d8fa46d")
        public static SmDependency TemplateInstanciationDep() {
            if (TemplateInstanciationDep == null) {
            	TemplateInstanciationDep = classof().getDependencyDef("TemplateInstanciation");
            }
            return TemplateInstanciationDep;
        }

        @objid ("d8fc9793-2506-4b6d-9c47-7788feb7c689")
        public static SmDependency OwnerDep() {
            if (OwnerDep == null) {
            	OwnerDep = classof().getDependencyDef("Owner");
            }
            return OwnerDep;
        }

        @objid ("4688665f-d813-4b10-988c-4abbf7c3903c")
        public static SmDependency OwnedPackageImportDep() {
            if (OwnedPackageImportDep == null) {
            	OwnedPackageImportDep = classof().getDependencyDef("OwnedPackageImport");
            }
            return OwnedPackageImportDep;
        }

        @objid ("86f340a6-0292-40d8-9e41-3a38e46fd97b")
        public static SmDependency ReturnDep() {
            if (ReturnDep == null) {
            	ReturnDep = classof().getDependencyDef("Return");
            }
            return ReturnDep;
        }

        @objid ("80b8583c-2155-4130-bfe6-dd985652b625")
        public static SmDependency InstanciatingBindingDep() {
            if (InstanciatingBindingDep == null) {
            	InstanciatingBindingDep = classof().getDependencyDef("InstanciatingBinding");
            }
            return InstanciatingBindingDep;
        }

        @objid ("0fb47415-ba31-47d6-a4dd-531024d0f89d")
        public static SmDependency UsageDep() {
            if (UsageDep == null) {
            	UsageDep = classof().getDependencyDef("Usage");
            }
            return UsageDep;
        }

        @objid ("e37fa54c-7ddf-495a-a256-c10fac9ba918")
        public static SmDependency TemplateDep() {
            if (TemplateDep == null) {
            	TemplateDep = classof().getDependencyDef("Template");
            }
            return TemplateDep;
        }

        @objid ("841d93e9-cce1-4448-beac-5f74e34fdfcc")
        public static SmDependency CallerServiceTaskDep() {
            if (CallerServiceTaskDep == null) {
            	CallerServiceTaskDep = classof().getDependencyDef("CallerServiceTask");
            }
            return CallerServiceTaskDep;
        }

        @objid ("977cd8fe-e8d3-4efa-8200-40c45005075b")
        public static SmDependency OccurenceDep() {
            if (OccurenceDep == null) {
            	OccurenceDep = classof().getDependencyDef("Occurence");
            }
            return OccurenceDep;
        }

        @objid ("83891434-eb10-4181-bfb8-c546f9d8b253")
        public static SmDependency InvokerDep() {
            if (InvokerDep == null) {
            	InvokerDep = classof().getDependencyDef("Invoker");
            }
            return InvokerDep;
        }

        @objid ("f0ccc982-33ea-4e8a-a0f5-f8a564aaa878")
        public static SmDependency CommunicationUsageDep() {
            if (CommunicationUsageDep == null) {
            	CommunicationUsageDep = classof().getDependencyDef("CommunicationUsage");
            }
            return CommunicationUsageDep;
        }

        @objid ("db02cca3-bc5f-41ea-b380-7067839cf0fe")
        public static SmDependency OwnedCollaborationUseDep() {
            if (OwnedCollaborationUseDep == null) {
            	OwnedCollaborationUseDep = classof().getDependencyDef("OwnedCollaborationUse");
            }
            return OwnedCollaborationUseDep;
        }

        @objid ("472aa360-150d-480b-b26e-fc907d28faeb")
        public static SmDependency RedefinesDep() {
            if (RedefinesDep == null) {
            	RedefinesDep = classof().getDependencyDef("Redefines");
            }
            return RedefinesDep;
        }

        @objid ("54d71e9a-1d01-4687-9e80-faee9a23ea36")
        public static SmDependency CallerDep() {
            if (CallerDep == null) {
            	CallerDep = classof().getDependencyDef("Caller");
            }
            return CallerDep;
        }

        @objid ("3eb073a4-ffe0-44cd-bc1d-78e3f0f0828c")
        public static SmDependency CallingActionDep() {
            if (CallingActionDep == null) {
            	CallingActionDep = classof().getDependencyDef("CallingAction");
            }
            return CallingActionDep;
        }

        @objid ("49105fec-a2c4-452b-a26e-5fe116dc3120")
        public static SmDependency EntryPointActionDep() {
            if (EntryPointActionDep == null) {
            	EntryPointActionDep = classof().getDependencyDef("EntryPointAction");
            }
            return EntryPointActionDep;
        }

        @objid ("e7fa4955-e8d2-47ad-a155-7686802d2d20")
        public static SmDependency getCallerReceiveTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerReceiveTaskDep;
        }

        @objid ("12c2ebf6-74d1-4260-beeb-62a3f1648840")
        public static SmDependency getOwnedImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedImportDep;
        }

        @objid ("e9489d91-df9e-4f30-8222-cecb3d8b7a45")
        public static SmDependency getOccurenceDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OccurenceDep;
        }

        @objid ("c603c495-aced-43e4-a037-decb41a3f923")
        public static SmDependency getCallerServiceTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerServiceTaskDep;
        }

        @objid ("5a02dc90-a90f-4e4a-a4c2-f6bbd9c722a5")
        public static SmDependency getExampleDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ExampleDep;
        }

        @objid ("9b3d9393-d688-491d-b9b1-ad1128c5c4db")
        public static SmDependency getInstanciatingBindingDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InstanciatingBindingDep;
        }

        @objid ("d11ee93c-bfd8-4603-9efd-cf85d5eae8ca")
        public static SmDependency getEntryPointActionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return EntryPointActionDep;
        }

        @objid ("151a9420-3829-444a-a7f1-ac4d7114ad71")
        public static SmAttribute getConcurrencyAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ConcurrencyAtt;
        }

        @objid ("11b56c2a-1848-4cd8-b529-9967c50f4ed4")
        public static SmDependency getOwnerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnerDep;
        }

        @objid ("86e05d76-7e9b-40cd-adca-8d438a867a63")
        public static SmDependency getIODep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return IODep;
        }

        @objid ("b82e5bcb-043f-4c11-a61e-6bf3a39342a4")
        public static SmDependency getReturnDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ReturnDep;
        }

        @objid ("c994cf81-5fb8-4638-b4c4-66a37d8e87b3")
        public static SmDependency getOwnedBehaviorDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedBehaviorDep;
        }

        @objid ("1b708234-75a4-4663-80a9-a6e42eddbcdd")
        public static SmAttribute getFinalAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return FinalAtt;
        }

        @objid ("377a2fcc-274a-4ed3-afa4-d503d0fd629e")
        public static SmDependency getInvokerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return InvokerDep;
        }

        @objid ("d05ed4ba-08ee-4b38-874d-6a66e250c784")
        public static SmDependency getCallerDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerDep;
        }

        @objid ("70577858-1b75-431c-91f0-24ef17a11c86")
        public static SmDependency getUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return UsageDep;
        }

        @objid ("34a5b7a0-f6db-4455-9c30-65609b4387f4")
        public static SmDependency getOwnedPackageImportDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedPackageImportDep;
        }

        @objid ("fe761f19-80c3-48ab-ad86-4a49da9b365f")
        public static SmDependency getSRepresentationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return SRepresentationDep;
        }

        @objid ("cbe79bda-d3a4-4720-a314-708337589b92")
        public static SmDependency getTemplateInstanciationDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateInstanciationDep;
        }

        @objid ("8b8ec7e7-0a8d-4dca-a3b5-587abd939915")
        public static SmDependency getRedefinitionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RedefinitionDep;
        }

        @objid ("c2a23379-5473-412f-8e95-4d1636526927")
        public static SmDependency getBpmnOperationRefDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return BpmnOperationRefDep;
        }

        @objid ("026309b4-12de-4df8-acab-c09e369066c0")
        public static SmClass getSmClass() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return smClass;
        }

        @objid ("957d3678-55df-4fe4-b438-2f344da69141")
        public static SmAttribute getPassingAtt() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return PassingAtt;
        }

        @objid ("15d0fb7c-2763-47fe-bfe2-8c7e8d507b65")
        public static SmDependency getCommunicationUsageDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CommunicationUsageDep;
        }

        @objid ("84da2795-79a9-4d92-b5d1-42171beb3984")
        public static SmDependency getOwnedCollaborationUseDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return OwnedCollaborationUseDep;
        }

        @objid ("7f713447-a97a-4203-84aa-139235daa5e6")
        public static SmDependency getTemplateDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return TemplateDep;
        }

        @objid ("41c77480-8df2-44c8-a557-a4d46e13d16e")
        public static SmDependency getThrownDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return ThrownDep;
        }

        @objid ("b3a91880-cf98-4488-9fe4-1c2ee39ea873")
        public static SmDependency getCallerSendTaskDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallerSendTaskDep;
        }

        @objid ("a9820e84-3862-4ce8-84d8-12e0fdf44330")
        public static SmDependency getCallingActionDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return CallingActionDep;
        }

        @objid ("fa01408f-e1ef-4907-bcdb-e723ae4df79f")
        public static SmDependency getRedefinesDep() {
            // Automatically generated method. Please delete this comment before entering specific code.
            return RedefinesDep;
        }

        @objid ("0008b808-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ObjectFactory implements ISmObjectFactory {
            @objid ("2ef748cc-52c0-40b0-affb-f75de9cb56d9")
            public ISmObjectData createData() {
                return new OperationData();
            }

            @objid ("99821352-2cc7-4582-839c-ac1c58d213bc")
            public SmObjectImpl createImpl() {
                return new OperationImpl();
            }

        }

        @objid ("0009192e-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ConcurrencySmAttribute extends SmAttribute {
            @objid ("0cf2215e-9c46-480b-b5ca-d0a2d277c17e")
            public Object getValue(ISmObjectData data) {
                return ((OperationData) data).mConcurrency;
            }

            @objid ("c07f1fd8-6366-4a3a-8802-c730359173f8")
            public void setValue(ISmObjectData data, Object value) {
                ((OperationData) data).mConcurrency = value;
            }

        }

        @objid ("00097a18-c4c5-1fd8-97fe-001ec947cd2a")
        public static class FinalSmAttribute extends SmAttribute {
            @objid ("de0d3f4d-0d2c-4779-846a-0a59d017bbab")
            public Object getValue(ISmObjectData data) {
                return ((OperationData) data).mFinal;
            }

            @objid ("7474d5a6-4774-4738-8388-f408071825bf")
            public void setValue(ISmObjectData data, Object value) {
                ((OperationData) data).mFinal = value;
            }

        }

        @objid ("0009dbca-c4c5-1fd8-97fe-001ec947cd2a")
        public static class PassingSmAttribute extends SmAttribute {
            @objid ("98571c65-9ae8-4dad-953f-a4721d65ca13")
            public Object getValue(ISmObjectData data) {
                return ((OperationData) data).mPassing;
            }

            @objid ("8509379c-032e-48b9-a080-fe45b263437a")
            public void setValue(ISmObjectData data, Object value) {
                ((OperationData) data).mPassing = value;
            }

        }

        @objid ("000a5262-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ExampleSmDependency extends SmMultipleDependency {
            @objid ("a874d99a-e55a-4a9d-920c-dbf8146fc253")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mExample != null)? ((OperationData)data).mExample:SmMultipleDependency.EMPTY;
            }

            @objid ("84270602-eb86-4a7e-a585-b035d0904871")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mExample = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mExample;
            }

            @objid ("5411d05b-474c-4c98-9dc2-395b9df0cf00")
            @Override
            public SmDependency getSymetric() {
                return CollaborationData.Metadata.ORepresentedDep();
            }

        }

        @objid ("000abdba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class IOSmDependency extends SmMultipleDependency {
            @objid ("a0580e71-defa-4d3f-9f8f-dd440303a42f")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mIO != null)? ((OperationData)data).mIO:SmMultipleDependency.EMPTY;
            }

            @objid ("621853c8-e9be-4a51-a4ee-b6dee413845f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mIO = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mIO;
            }

            @objid ("3b9db72f-9159-464d-90ff-d44e9eea3d13")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.ComposedDep();
            }

        }

        @objid ("000b24b2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InstanciatingBindingSmDependency extends SmMultipleDependency {
            @objid ("fa5f3f71-2839-4e31-8f65-051eab14a4e0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mInstanciatingBinding != null)? ((OperationData)data).mInstanciatingBinding:SmMultipleDependency.EMPTY;
            }

            @objid ("582f4e61-8b72-4bb0-83e4-68293eff6369")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mInstanciatingBinding = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mInstanciatingBinding;
            }

            @objid ("7c056b82-4024-4f6a-a8c3-1460710ba03d")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.InstanciatedTemplateOperationDep();
            }

        }

        @objid ("000b89f2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class InvokerSmDependency extends SmMultipleDependency {
            @objid ("7c3aa536-b0a4-4937-94ec-e21a99c3c14e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mInvoker != null)? ((OperationData)data).mInvoker:SmMultipleDependency.EMPTY;
            }

            @objid ("188ac24b-60f0-4d61-a383-93abf6ee6518")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mInvoker = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mInvoker;
            }

            @objid ("f138210e-e0b4-4af8-8f44-cbca9bedd7c8")
            @Override
            public SmDependency getSymetric() {
                return TransitionData.Metadata.ProcessedDep();
            }

        }

        @objid ("000bef3c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OccurenceSmDependency extends SmMultipleDependency {
            @objid ("d5a621e8-0b0e-40ec-8c16-2fe51dc75927")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOccurence != null)? ((OperationData)data).mOccurence:SmMultipleDependency.EMPTY;
            }

            @objid ("9be0e6f5-0c75-4f77-af76-fdc1af8d6f24")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOccurence = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOccurence;
            }

            @objid ("aba003de-f854-46ac-b8c6-ba694f3cfac5")
            @Override
            public SmDependency getSymetric() {
                return EventData.Metadata.CalledDep();
            }

        }

        @objid ("000c62c8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedBehaviorSmDependency extends SmMultipleDependency {
            @objid ("bb85978e-f8ad-4962-b3a0-ba36cb6a276e")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedBehavior != null)? ((OperationData)data).mOwnedBehavior:SmMultipleDependency.EMPTY;
            }

            @objid ("d01fd04c-5ede-47b2-aef4-445fa80feccc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedBehavior = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedBehavior;
            }

            @objid ("37155f44-8196-4627-bd61-e9a815ebc7eb")
            @Override
            public SmDependency getSymetric() {
                return BehaviorData.Metadata.OwnerOperationDep();
            }

        }

        @objid ("000cd4ba-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedCollaborationUseSmDependency extends SmMultipleDependency {
            @objid ("1e2cbe28-cb25-4bb1-a624-b33fc2069e22")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedCollaborationUse != null)? ((OperationData)data).mOwnedCollaborationUse:SmMultipleDependency.EMPTY;
            }

            @objid ("f6e8bd14-3561-4e17-b794-c65901dc6af6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedCollaborationUse = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedCollaborationUse;
            }

            @objid ("669aedbc-b2fa-4896-af19-295daa9dc41d")
            @Override
            public SmDependency getSymetric() {
                return CollaborationUseData.Metadata.ORepresentedDep();
            }

        }

        @objid ("000d3bd0-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedImportSmDependency extends SmMultipleDependency {
            @objid ("5587e9a4-8ca3-4ec9-a954-b239018eabad")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedImport != null)? ((OperationData)data).mOwnedImport:SmMultipleDependency.EMPTY;
            }

            @objid ("a392e919-b1e0-4d46-8097-37636d740158")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedImport = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedImport;
            }

            @objid ("bc20cb6a-853c-4d56-8d1b-d412490fbd8b")
            @Override
            public SmDependency getSymetric() {
                return ElementImportData.Metadata.ImportingOperationDep();
            }

        }

        @objid ("000da8fe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnedPackageImportSmDependency extends SmMultipleDependency {
            @objid ("e77e34e6-57c7-464f-84cf-037e42304796")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mOwnedPackageImport != null)? ((OperationData)data).mOwnedPackageImport:SmMultipleDependency.EMPTY;
            }

            @objid ("ca0f094d-4682-4f7b-beeb-db859b51aae0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mOwnedPackageImport = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mOwnedPackageImport;
            }

            @objid ("bedc77ec-63e4-4ee1-87a3-6b7bbb6dda07")
            @Override
            public SmDependency getSymetric() {
                return PackageImportData.Metadata.ImportingOperationDep();
            }

        }

        @objid ("000e11ea-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RedefinesSmDependency extends SmSingleDependency {
            @objid ("c4f3fd78-5e0a-409c-bd50-9b5df4798bad")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OperationData) data).mRedefines;
            }

            @objid ("b70c08a0-cf0a-431d-8818-ac871b98abc6")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OperationData) data).mRedefines = value;
            }

            @objid ("d21217ed-5e7d-45a4-a5f6-aacc6865f042")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.RedefinitionDep();
            }

        }

        @objid ("000e98fe-c4c5-1fd8-97fe-001ec947cd2a")
        public static class RedefinitionSmDependency extends SmMultipleDependency {
            @objid ("a337f8ea-2f26-466c-a3ae-18e06380e4b9")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mRedefinition != null)? ((OperationData)data).mRedefinition:SmMultipleDependency.EMPTY;
            }

            @objid ("7d61e744-ce10-4e2a-b9ab-a9019ccf35bc")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mRedefinition = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mRedefinition;
            }

            @objid ("f696f0f4-1b32-4301-9b05-a4b839abc9f9")
            @Override
            public SmDependency getSymetric() {
                return OperationData.Metadata.RedefinesDep();
            }

        }

        @objid ("000f0dde-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ReturnSmDependency extends SmSingleDependency {
            @objid ("4485810b-1562-4e4f-ab01-53134ec4ca3e")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OperationData) data).mReturn;
            }

            @objid ("0f901c81-c9ca-4b77-a828-7486f800f74f")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OperationData) data).mReturn = value;
            }

            @objid ("1001394f-3d50-4db6-b643-b2affd2f9444")
            @Override
            public SmDependency getSymetric() {
                return ParameterData.Metadata.ReturnedDep();
            }

        }

        @objid ("000f8bce-c4c5-1fd8-97fe-001ec947cd2a")
        public static class SRepresentationSmDependency extends SmMultipleDependency {
            @objid ("5fe066bc-1ce5-444e-819a-0ce54ca332f5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mSRepresentation != null)? ((OperationData)data).mSRepresentation:SmMultipleDependency.EMPTY;
            }

            @objid ("408a4c39-49a1-4385-a32c-52413e643053")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mSRepresentation = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mSRepresentation;
            }

            @objid ("6932b372-3de5-46c0-bb2d-2750b9af5688")
            @Override
            public SmDependency getSymetric() {
                return SignalData.Metadata.OBaseDep();
            }

        }

        @objid ("000ffbea-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TemplateSmDependency extends SmMultipleDependency {
            @objid ("14ddf278-8808-4311-bc05-e8d13632a3a6")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mTemplate != null)? ((OperationData)data).mTemplate:SmMultipleDependency.EMPTY;
            }

            @objid ("195ee646-d71a-4113-8bba-d52bda58ab93")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mTemplate = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mTemplate;
            }

            @objid ("811a1442-17b6-48e8-8f13-5a670feb10e1")
            @Override
            public SmDependency getSymetric() {
                return TemplateParameterData.Metadata.ParameterizedOperationDep();
            }

        }

        @objid ("00106882-c4c5-1fd8-97fe-001ec947cd2a")
        public static class TemplateInstanciationSmDependency extends SmMultipleDependency {
            @objid ("e519e472-451f-4a77-8fd3-f291827ddc84")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mTemplateInstanciation != null)? ((OperationData)data).mTemplateInstanciation:SmMultipleDependency.EMPTY;
            }

            @objid ("39229da5-be54-4896-aaa0-39e033ba61c6")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mTemplateInstanciation = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mTemplateInstanciation;
            }

            @objid ("b8a1fc85-bac4-491d-ad39-0aa1e960e913")
            @Override
            public SmDependency getSymetric() {
                return TemplateBindingData.Metadata.BoundOperationDep();
            }

        }

        @objid ("0010dfd8-c4c5-1fd8-97fe-001ec947cd2a")
        public static class ThrownSmDependency extends SmMultipleDependency {
            @objid ("163ef1c2-504e-4231-bd56-a3c0f2897ea3")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mThrown != null)? ((OperationData)data).mThrown:SmMultipleDependency.EMPTY;
            }

            @objid ("a79fd8e7-45c4-42ff-9ef2-72bef0d3d7b8")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mThrown = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mThrown;
            }

            @objid ("80b178c1-266a-4806-9f49-e94e4b55e2e3")
            @Override
            public SmDependency getSymetric() {
                return RaisedExceptionData.Metadata.ThrowerDep();
            }

        }

        @objid ("0011639a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class UsageSmDependency extends SmMultipleDependency {
            @objid ("5fd47fc3-ede9-4b99-ba26-ee312c9ee6d1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mUsage != null)? ((OperationData)data).mUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("ba9a9fe1-400a-4244-afaf-c89c41664b04")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mUsage = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mUsage;
            }

            @objid ("dbb31386-0bba-4f3f-9a92-a37ce0baa38c")
            @Override
            public SmDependency getSymetric() {
                return MessageData.Metadata.InvokedDep();
            }

        }

        @objid ("0011d492-c4c5-1fd8-97fe-001ec947cd2a")
        public static class EntryPointActionSmDependency extends SmMultipleDependency {
            @objid ("b1579540-d05a-437a-8ed2-0d5d4ca73007")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mEntryPointAction != null)? ((OperationData)data).mEntryPointAction:SmMultipleDependency.EMPTY;
            }

            @objid ("f38adf2a-515f-4a66-828a-ffdd1e618288")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mEntryPointAction = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mEntryPointAction;
            }

            @objid ("8659956a-1069-4584-bfcd-06b629c79430")
            @Override
            public SmDependency getSymetric() {
                return AcceptCallEventActionData.Metadata.CalledDep();
            }

        }

        @objid ("0012424c-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CommunicationUsageSmDependency extends SmMultipleDependency {
            @objid ("359b11f9-5e75-45c7-b13f-7438a5b3e2a5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCommunicationUsage != null)? ((OperationData)data).mCommunicationUsage:SmMultipleDependency.EMPTY;
            }

            @objid ("4ca1ee21-e817-4df5-918f-cf3276ba308c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCommunicationUsage = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCommunicationUsage;
            }

            @objid ("9cade1de-32df-48ba-9a9e-c989e49cdac3")
            @Override
            public SmDependency getSymetric() {
                return CommunicationMessageData.Metadata.InvokedDep();
            }

        }

        @objid ("0012b5ec-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallingActionSmDependency extends SmMultipleDependency {
            @objid ("36c37f1f-c8bd-4f2a-ba10-92787a136442")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallingAction != null)? ((OperationData)data).mCallingAction:SmMultipleDependency.EMPTY;
            }

            @objid ("4d4ff4a3-ffd9-4064-aa1b-1047727c286f")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallingAction = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallingAction;
            }

            @objid ("998e6333-4568-4108-9873-874ca36e32ff")
            @Override
            public SmDependency getSymetric() {
                return CallOperationActionData.Metadata.CalledDep();
            }

        }

        @objid ("00132540-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerSmDependency extends SmMultipleDependency {
            @objid ("0248b54f-3e3e-4871-bece-64559d00bf0d")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCaller != null)? ((OperationData)data).mCaller:SmMultipleDependency.EMPTY;
            }

            @objid ("9e8b7e4b-702f-4772-95e6-293cb3db382a")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCaller = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCaller;
            }

            @objid ("64dde1b8-b8cd-4b87-8190-5b5fbe13ad9f")
            @Override
            public SmDependency getSymetric() {
                return BpmnCallActivityData.Metadata.CalledOperationDep();
            }

        }

        @objid ("0013a97a-c4c5-1fd8-97fe-001ec947cd2a")
        public static class BpmnOperationRefSmDependency extends SmMultipleDependency {
            @objid ("77c89cc6-ff1b-492a-8704-9ac6725092c1")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mBpmnOperationRef != null)? ((OperationData)data).mBpmnOperationRef:SmMultipleDependency.EMPTY;
            }

            @objid ("c8c24f7c-0736-496c-ab8e-1972fd532443")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mBpmnOperationRef = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mBpmnOperationRef;
            }

            @objid ("70d611f0-87b9-41f1-9d08-0cef004b366e")
            @Override
            public SmDependency getSymetric() {
                return BpmnOperationData.Metadata.ImplementationRefDep();
            }

        }

        @objid ("00142602-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerSendTaskSmDependency extends SmMultipleDependency {
            @objid ("95163303-ea70-45b5-84b0-9f02408d58a2")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallerSendTask != null)? ((OperationData)data).mCallerSendTask:SmMultipleDependency.EMPTY;
            }

            @objid ("3dd142c5-cd88-4282-8ef2-937d5165920c")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallerSendTask = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallerSendTask;
            }

            @objid ("238b18dd-5867-4edd-9210-4ab68a7a89fb")
            @Override
            public SmDependency getSymetric() {
                return BpmnSendTaskData.Metadata.CalledOperationDep();
            }

        }

        @objid ("001497c2-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerReceiveTaskSmDependency extends SmMultipleDependency {
            @objid ("b2a5c1de-2d04-4f10-9cca-32d0b42bfbd5")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallerReceiveTask != null)? ((OperationData)data).mCallerReceiveTask:SmMultipleDependency.EMPTY;
            }

            @objid ("799bf7f0-c6f7-49f0-bda8-817f0e739c89")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallerReceiveTask = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallerReceiveTask;
            }

            @objid ("a2dad3af-cb97-4b81-9d68-cff8c62833e0")
            @Override
            public SmDependency getSymetric() {
                return BpmnReceiveTaskData.Metadata.CalledOperationDep();
            }

        }

        @objid ("00150e96-c4c5-1fd8-97fe-001ec947cd2a")
        public static class CallerServiceTaskSmDependency extends SmMultipleDependency {
            @objid ("2b84054e-6790-4f89-9227-d347fda0d6d0")
            @Override
            public List<SmObjectImpl> getValueList(ISmObjectData data) {
                return (((OperationData)data).mCallerServiceTask != null)? ((OperationData)data).mCallerServiceTask:SmMultipleDependency.EMPTY;
            }

            @objid ("5ac53723-f2a9-4415-8b86-96a09a38e5f0")
            @Override
            protected List<SmObjectImpl> allocateValueList(ISmObjectData data, int initialCapacity) {
                ((OperationData) data).mCallerServiceTask = new ArrayList<>(initialCapacity);
                return ((OperationData) data).mCallerServiceTask;
            }

            @objid ("d38739c9-e58c-4a2c-9d71-01442e789518")
            @Override
            public SmDependency getSymetric() {
                return BpmnServiceTaskData.Metadata.CalledOperationDep();
            }

        }

        @objid ("00158074-c4c5-1fd8-97fe-001ec947cd2a")
        public static class OwnerSmDependency extends SmSingleDependency {
            @objid ("daa4b2da-8b3d-4749-a750-51a24255949b")
            @Override
            public SmObjectImpl getValue(ISmObjectData data) {
                return ((OperationData) data).mOwner;
            }

            @objid ("aeff2a20-3927-4980-98a1-aa2d860818b8")
            public void setValue(ISmObjectData data, SmObjectImpl value) {
                ((OperationData) data).mOwner = value;
            }

            @objid ("a4c9b7e4-d58c-433a-a169-7ae1a0c1d2ff")
            @Override
            public SmDependency getSymetric() {
                return ClassifierData.Metadata.OwnedOperationDep();
            }

        }

    }

}
