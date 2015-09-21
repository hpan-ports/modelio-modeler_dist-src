/* 
 * Copyright 2013-2015 Modeliosoft
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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.uml.statik;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.activities.BpmnCallActivitySmClass;
import org.modelio.metamodel.impl.bpmn.activities.BpmnReceiveTaskSmClass;
import org.modelio.metamodel.impl.bpmn.activities.BpmnSendTaskSmClass;
import org.modelio.metamodel.impl.bpmn.activities.BpmnServiceTaskSmClass;
import org.modelio.metamodel.impl.bpmn.bpmnService.BpmnOperationSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.AcceptCallEventActionSmClass;
import org.modelio.metamodel.impl.uml.behavior.activityModel.CallOperationActionSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.EventSmClass;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.SignalSmClass;
import org.modelio.metamodel.impl.uml.behavior.communicationModel.CommunicationMessageSmClass;
import org.modelio.metamodel.impl.uml.behavior.interactionModel.MessageSmClass;
import org.modelio.metamodel.impl.uml.behavior.stateMachineModel.TransitionSmClass;
import org.modelio.metamodel.impl.uml.statik.BehavioralFeatureSmClass;
import org.modelio.metamodel.impl.uml.statik.ClassifierSmClass;
import org.modelio.metamodel.impl.uml.statik.CollaborationSmClass;
import org.modelio.metamodel.impl.uml.statik.CollaborationUseSmClass;
import org.modelio.metamodel.impl.uml.statik.ElementImportSmClass;
import org.modelio.metamodel.impl.uml.statik.OperationSmClass;
import org.modelio.metamodel.impl.uml.statik.PackageImportSmClass;
import org.modelio.metamodel.impl.uml.statik.ParameterSmClass;
import org.modelio.metamodel.impl.uml.statik.RaisedExceptionSmClass;
import org.modelio.metamodel.impl.uml.statik.TemplateBindingSmClass;
import org.modelio.metamodel.impl.uml.statik.TemplateParameterSmClass;
import org.modelio.metamodel.uml.statik.MethodPassingMode;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.vbasic.version.Version;
import org.modelio.vcore.smkernel.ISmObjectData;
import org.modelio.vcore.smkernel.ISmObjectFactory;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;
import org.modelio.vcore.smkernel.meta.ISmMetamodelFragment;
import org.modelio.vcore.smkernel.meta.SmAttribute;
import org.modelio.vcore.smkernel.meta.SmDependency;
import org.modelio.vcore.smkernel.meta.SmMetamodel;
import org.modelio.vcore.smkernel.meta.SmMultipleDependency;
import org.modelio.vcore.smkernel.meta.SmSingleDependency;
import org.modelio.vcore.smkernel.meta.smannotations.SmDirective;

@objid ("77952079-f367-4e69-ac13-e2a961f78214")
public class OperationSmClass extends BehavioralFeatureSmClass {
    @objid ("e746d0cd-a3b7-44f4-96ad-88a79faecbee")
    private SmAttribute concurrencyAtt;

    @objid ("c4441943-0815-473e-bc3f-a5d6d8b1a249")
    private SmAttribute finalAtt;

    @objid ("f970a373-720d-4867-a68a-89e81c1be42d")
    private SmAttribute passingAtt;

    @objid ("fc40d696-d91a-4b4f-9d99-a566d21251a4")
    private SmDependency ownedImportDep;

    @objid ("4f1bfd16-59f9-4dcc-8f6e-cbba94954872")
    private SmDependency thrownDep;

    @objid ("821dab2c-22db-4686-9dce-7b594afc60a3")
    private SmDependency callerReceiveTaskDep;

    @objid ("a67f86eb-a566-40a6-8a96-2cebb96a88c6")
    private SmDependency redefinitionDep;

    @objid ("9cf2a7c1-d2a8-4142-b4b2-83dd8078acd6")
    private SmDependency exampleDep;

    @objid ("ec1aedff-edc7-4ca9-b901-b48f8015ac3d")
    private SmDependency sRepresentationDep;

    @objid ("94aaef31-3e60-4527-956c-433426d2686f")
    private SmDependency ownedBehaviorDep;

    @objid ("45347003-0775-471c-a050-130d97c13c05")
    private SmDependency bpmnOperationRefDep;

    @objid ("e73b063f-e89c-4b14-9e88-bf34833814fa")
    private SmDependency callerSendTaskDep;

    @objid ("faca4568-28c5-49f6-ac18-bf7d83c0e235")
    private SmDependency iODep;

    @objid ("15c51778-4a91-408a-839f-7ffede918a6d")
    private SmDependency templateInstanciationDep;

    @objid ("03c3f658-61a3-40dd-b5a8-789c79fa60ba")
    private SmDependency ownerDep;

    @objid ("198a01ba-dbc5-473b-b232-1aa507f2f708")
    private SmDependency ownedPackageImportDep;

    @objid ("85b82eb8-2dd9-4a24-b25c-bfc10a0c6a28")
    private SmDependency returnDep;

    @objid ("7a1f7f49-0dee-4e25-8234-9907e7dac0f0")
    private SmDependency instanciatingBindingDep;

    @objid ("80eb1e0a-c529-43dc-b76f-c5f2ac4294de")
    private SmDependency usageDep;

    @objid ("f8516fe6-d2fd-42f1-a412-f64a30144deb")
    private SmDependency templateDep;

    @objid ("8af66506-18ac-4a1d-99af-223caeb94afd")
    private SmDependency callerServiceTaskDep;

    @objid ("16c47f1b-29de-417b-836d-c893c4932f8f")
    private SmDependency occurenceDep;

    @objid ("4c116f27-053c-44bf-9df8-a66521554a3a")
    private SmDependency invokerDep;

    @objid ("9ca4a52a-0fc8-4d54-89ff-bfb57addf33a")
    private SmDependency communicationUsageDep;

    @objid ("f4182b7c-702b-4edd-a5cf-2626b9005a7e")
    private SmDependency ownedCollaborationUseDep;

    @objid ("25e72f9b-267e-434a-9264-d42a7d96d447")
    private SmDependency redefinesDep;

    @objid ("ecad1520-b145-4fec-a2c7-320acf6594a6")
    private SmDependency callerDep;

    @objid ("f52c5edc-2afd-433b-aa27-fc9b699500f0")
    private SmDependency callingActionDep;

    @objid ("bc60f9ec-0ca2-41cc-a5eb-a5f8ce42226d")
    private SmDependency entryPointActionDep;

    @objid ("57827958-0c42-41c2-8073-bb12e3953ee4")
    public OperationSmClass(ISmMetamodelFragment origin) {
        super(origin);
    }

    @objid ("193587d5-2512-40c4-92ec-b1f27d86ad44")
    @Override
    public String getName() {
        return "Operation";
    }

    @objid ("84d65411-3b47-4456-bab2-361f8ef9a5fe")
    @Override
    public Version getVersion() {
        return new Version("0.0.9054");
    }

    @objid ("ee9df3ca-6d23-420d-b429-4c42bf5638ea")
    @Override
    public java.lang.Class<? extends MObject> getJavaInterface() {
        return Operation.class;
    }

    @objid ("836b1387-373e-4db3-a7d1-b7e812b257c1")
    @Override
    public boolean isCmsNode() {
        return false;
    }

    @objid ("eec88eb5-633f-4a00-980a-34680d1d2a6c")
    @Override
    public boolean isAbstract() {
        return false;
    }

    @objid ("b598a48c-6286-4ee4-b2dc-3bc1948c4731")
    @Override
    public void load(SmMetamodel metamodel) {
        this.parentClass = metamodel.getMClass("BehavioralFeature");
        this.registerFactory(new OperationObjectFactory(this));
        
        
        // Initialize and register the SmAttribute
        this.concurrencyAtt = new ConcurrencySmAttribute();
        this.concurrencyAtt.init("Concurrency", this, Boolean.class );
        registerAttribute(this.concurrencyAtt);
        
        this.finalAtt = new FinalSmAttribute();
        this.finalAtt.init("Final", this, Boolean.class );
        registerAttribute(this.finalAtt);
        
        this.passingAtt = new PassingSmAttribute();
        this.passingAtt.init("Passing", this, MethodPassingMode.class );
        registerAttribute(this.passingAtt);
        
        
        // Initialize and register the SmDependency
        this.ownedImportDep = new OwnedImportSmDependency();
        this.ownedImportDep.init("OwnedImport", this, metamodel.getMClass("ElementImport"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedImportDep);
        
        this.thrownDep = new ThrownSmDependency();
        this.thrownDep.init("Thrown", this, metamodel.getMClass("RaisedException"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.thrownDep);
        
        this.callerReceiveTaskDep = new CallerReceiveTaskSmDependency();
        this.callerReceiveTaskDep.init("CallerReceiveTask", this, metamodel.getMClass("BpmnReceiveTask"), 0, -1 );
        registerDependency(this.callerReceiveTaskDep);
        
        this.redefinitionDep = new RedefinitionSmDependency();
        this.redefinitionDep.init("Redefinition", this, metamodel.getMClass("Operation"), 0, -1 );
        registerDependency(this.redefinitionDep);
        
        this.exampleDep = new ExampleSmDependency();
        this.exampleDep.init("Example", this, metamodel.getMClass("Collaboration"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.exampleDep);
        
        this.sRepresentationDep = new SRepresentationSmDependency();
        this.sRepresentationDep.init("SRepresentation", this, metamodel.getMClass("Signal"), 0, -1 );
        registerDependency(this.sRepresentationDep);
        
        this.ownedBehaviorDep = new OwnedBehaviorSmDependency();
        this.ownedBehaviorDep.init("OwnedBehavior", this, metamodel.getMClass("Behavior"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedBehaviorDep);
        
        this.bpmnOperationRefDep = new BpmnOperationRefSmDependency();
        this.bpmnOperationRefDep.init("BpmnOperationRef", this, metamodel.getMClass("BpmnOperation"), 0, -1 );
        registerDependency(this.bpmnOperationRefDep);
        
        this.callerSendTaskDep = new CallerSendTaskSmDependency();
        this.callerSendTaskDep.init("CallerSendTask", this, metamodel.getMClass("BpmnSendTask"), 0, -1 );
        registerDependency(this.callerSendTaskDep);
        
        this.iODep = new IOSmDependency();
        this.iODep.init("IO", this, metamodel.getMClass("Parameter"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.iODep);
        
        this.templateInstanciationDep = new TemplateInstanciationSmDependency();
        this.templateInstanciationDep.init("TemplateInstanciation", this, metamodel.getMClass("TemplateBinding"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.templateInstanciationDep);
        
        this.ownerDep = new OwnerSmDependency();
        this.ownerDep.init("Owner", this, metamodel.getMClass("Classifier"), 1, 1 );
        registerDependency(this.ownerDep);
        
        this.ownedPackageImportDep = new OwnedPackageImportSmDependency();
        this.ownedPackageImportDep.init("OwnedPackageImport", this, metamodel.getMClass("PackageImport"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedPackageImportDep);
        
        this.returnDep = new ReturnSmDependency();
        this.returnDep.init("Return", this, metamodel.getMClass("Parameter"), 0, 1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.returnDep);
        
        this.instanciatingBindingDep = new InstanciatingBindingSmDependency();
        this.instanciatingBindingDep.init("InstanciatingBinding", this, metamodel.getMClass("TemplateBinding"), 0, -1 );
        registerDependency(this.instanciatingBindingDep);
        
        this.usageDep = new UsageSmDependency();
        this.usageDep.init("Usage", this, metamodel.getMClass("Message"), 0, -1 );
        registerDependency(this.usageDep);
        
        this.templateDep = new TemplateSmDependency();
        this.templateDep.init("Template", this, metamodel.getMClass("TemplateParameter"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.templateDep);
        
        this.callerServiceTaskDep = new CallerServiceTaskSmDependency();
        this.callerServiceTaskDep.init("CallerServiceTask", this, metamodel.getMClass("BpmnServiceTask"), 0, -1 );
        registerDependency(this.callerServiceTaskDep);
        
        this.occurenceDep = new OccurenceSmDependency();
        this.occurenceDep.init("Occurence", this, metamodel.getMClass("Event"), 0, -1 );
        registerDependency(this.occurenceDep);
        
        this.invokerDep = new InvokerSmDependency();
        this.invokerDep.init("Invoker", this, metamodel.getMClass("Transition"), 0, -1 );
        registerDependency(this.invokerDep);
        
        this.communicationUsageDep = new CommunicationUsageSmDependency();
        this.communicationUsageDep.init("CommunicationUsage", this, metamodel.getMClass("CommunicationMessage"), 0, -1 );
        registerDependency(this.communicationUsageDep);
        
        this.ownedCollaborationUseDep = new OwnedCollaborationUseSmDependency();
        this.ownedCollaborationUseDep.init("OwnedCollaborationUse", this, metamodel.getMClass("CollaborationUse"), 0, -1 , SmDirective.SMCDCOMPONENT);
        registerDependency(this.ownedCollaborationUseDep);
        
        this.redefinesDep = new RedefinesSmDependency();
        this.redefinesDep.init("Redefines", this, metamodel.getMClass("Operation"), 0, 1 , SmDirective.SMCDPARTOF);
        registerDependency(this.redefinesDep);
        
        this.callerDep = new CallerSmDependency();
        this.callerDep.init("Caller", this, metamodel.getMClass("BpmnCallActivity"), 0, -1 );
        registerDependency(this.callerDep);
        
        this.callingActionDep = new CallingActionSmDependency();
        this.callingActionDep.init("CallingAction", this, metamodel.getMClass("CallOperationAction"), 0, -1 );
        registerDependency(this.callingActionDep);
        
        this.entryPointActionDep = new EntryPointActionSmDependency();
        this.entryPointActionDep.init("EntryPointAction", this, metamodel.getMClass("AcceptCallEventAction"), 0, -1 );
        registerDependency(this.entryPointActionDep);
    }

    @objid ("2b479960-9ae6-4f92-9ed3-71c06f237c9d")
    public SmAttribute getConcurrencyAtt() {
        if (this.concurrencyAtt == null) {
        	this.concurrencyAtt = this.getAttributeDef("Concurrency");
        }
        return this.concurrencyAtt;
    }

    @objid ("953555ce-dd73-4169-8b1a-076ac10cf91e")
    public SmAttribute getFinalAtt() {
        if (this.finalAtt == null) {
        	this.finalAtt = this.getAttributeDef("Final");
        }
        return this.finalAtt;
    }

    @objid ("13fe03f7-8f76-4a72-a0e2-8a56592d5f25")
    public SmAttribute getPassingAtt() {
        if (this.passingAtt == null) {
        	this.passingAtt = this.getAttributeDef("Passing");
        }
        return this.passingAtt;
    }

    @objid ("580d21ee-3ce9-4cc5-95df-3a284f97010f")
    public SmDependency getOwnedImportDep() {
        if (this.ownedImportDep == null) {
        	this.ownedImportDep = this.getDependencyDef("OwnedImport");
        }
        return this.ownedImportDep;
    }

    @objid ("df4c0b78-d8dc-4194-9a1e-f828c670e86c")
    public SmDependency getThrownDep() {
        if (this.thrownDep == null) {
        	this.thrownDep = this.getDependencyDef("Thrown");
        }
        return this.thrownDep;
    }

    @objid ("72cef9b4-6a32-4aa9-8be2-c30d3089e0f0")
    public SmDependency getCallerReceiveTaskDep() {
        if (this.callerReceiveTaskDep == null) {
        	this.callerReceiveTaskDep = this.getDependencyDef("CallerReceiveTask");
        }
        return this.callerReceiveTaskDep;
    }

    @objid ("734f7691-85f4-4990-a06e-e99a6445dcb1")
    public SmDependency getRedefinitionDep() {
        if (this.redefinitionDep == null) {
        	this.redefinitionDep = this.getDependencyDef("Redefinition");
        }
        return this.redefinitionDep;
    }

    @objid ("b0750d98-efe8-4eb3-b89f-9652ade226f8")
    public SmDependency getExampleDep() {
        if (this.exampleDep == null) {
        	this.exampleDep = this.getDependencyDef("Example");
        }
        return this.exampleDep;
    }

    @objid ("ef6432be-f839-4ba4-8714-934e5a76d3ed")
    public SmDependency getSRepresentationDep() {
        if (this.sRepresentationDep == null) {
        	this.sRepresentationDep = this.getDependencyDef("SRepresentation");
        }
        return this.sRepresentationDep;
    }

    @objid ("2bdb237c-39d6-4e68-99cb-63881055c6a1")
    public SmDependency getOwnedBehaviorDep() {
        if (this.ownedBehaviorDep == null) {
        	this.ownedBehaviorDep = this.getDependencyDef("OwnedBehavior");
        }
        return this.ownedBehaviorDep;
    }

    @objid ("4dd08449-acf6-409f-94a5-813d4dc3f9a0")
    public SmDependency getBpmnOperationRefDep() {
        if (this.bpmnOperationRefDep == null) {
        	this.bpmnOperationRefDep = this.getDependencyDef("BpmnOperationRef");
        }
        return this.bpmnOperationRefDep;
    }

    @objid ("94ef38ba-67af-415b-b0cb-217a63863a25")
    public SmDependency getCallerSendTaskDep() {
        if (this.callerSendTaskDep == null) {
        	this.callerSendTaskDep = this.getDependencyDef("CallerSendTask");
        }
        return this.callerSendTaskDep;
    }

    @objid ("22a05aed-3cfd-46af-a5d1-5701d696c68f")
    public SmDependency getIODep() {
        if (this.iODep == null) {
        	this.iODep = this.getDependencyDef("IO");
        }
        return this.iODep;
    }

    @objid ("1041f523-fc97-4c33-a372-cc742403cfd1")
    public SmDependency getTemplateInstanciationDep() {
        if (this.templateInstanciationDep == null) {
        	this.templateInstanciationDep = this.getDependencyDef("TemplateInstanciation");
        }
        return this.templateInstanciationDep;
    }

    @objid ("17832e8e-a9f1-4349-8496-16ae09e74c74")
    public SmDependency getOwnerDep() {
        if (this.ownerDep == null) {
        	this.ownerDep = this.getDependencyDef("Owner");
        }
        return this.ownerDep;
    }

    @objid ("9cf7afe8-6f49-4bf1-81d7-0864687a92fc")
    public SmDependency getOwnedPackageImportDep() {
        if (this.ownedPackageImportDep == null) {
        	this.ownedPackageImportDep = this.getDependencyDef("OwnedPackageImport");
        }
        return this.ownedPackageImportDep;
    }

    @objid ("a5ee8d9b-e847-496a-9713-c00296bdcae7")
    public SmDependency getReturnDep() {
        if (this.returnDep == null) {
        	this.returnDep = this.getDependencyDef("Return");
        }
        return this.returnDep;
    }

    @objid ("acee2d88-28af-4dde-9aa9-8e29994b9672")
    public SmDependency getInstanciatingBindingDep() {
        if (this.instanciatingBindingDep == null) {
        	this.instanciatingBindingDep = this.getDependencyDef("InstanciatingBinding");
        }
        return this.instanciatingBindingDep;
    }

    @objid ("b7af5cf1-bcf1-44d8-80f3-789636cfdf46")
    public SmDependency getUsageDep() {
        if (this.usageDep == null) {
        	this.usageDep = this.getDependencyDef("Usage");
        }
        return this.usageDep;
    }

    @objid ("8ff4699e-1ffe-4b86-9a38-c0e8aa84103b")
    public SmDependency getTemplateDep() {
        if (this.templateDep == null) {
        	this.templateDep = this.getDependencyDef("Template");
        }
        return this.templateDep;
    }

    @objid ("d7b8c690-6d40-478e-9baf-9b1dbf1c4f62")
    public SmDependency getCallerServiceTaskDep() {
        if (this.callerServiceTaskDep == null) {
        	this.callerServiceTaskDep = this.getDependencyDef("CallerServiceTask");
        }
        return this.callerServiceTaskDep;
    }

    @objid ("5e9bbaca-2111-441c-aa7f-0c1f78aeff5e")
    public SmDependency getOccurenceDep() {
        if (this.occurenceDep == null) {
        	this.occurenceDep = this.getDependencyDef("Occurence");
        }
        return this.occurenceDep;
    }

    @objid ("7adc2e6e-a1c9-4d5e-b808-f46e2618244e")
    public SmDependency getInvokerDep() {
        if (this.invokerDep == null) {
        	this.invokerDep = this.getDependencyDef("Invoker");
        }
        return this.invokerDep;
    }

    @objid ("e25c3bf4-7331-4a57-b4e3-e6eb788b4794")
    public SmDependency getCommunicationUsageDep() {
        if (this.communicationUsageDep == null) {
        	this.communicationUsageDep = this.getDependencyDef("CommunicationUsage");
        }
        return this.communicationUsageDep;
    }

    @objid ("bac1bf5d-9514-409d-8189-e4717602c486")
    public SmDependency getOwnedCollaborationUseDep() {
        if (this.ownedCollaborationUseDep == null) {
        	this.ownedCollaborationUseDep = this.getDependencyDef("OwnedCollaborationUse");
        }
        return this.ownedCollaborationUseDep;
    }

    @objid ("cd1f9d20-6604-4496-aedf-0df70cd18c56")
    public SmDependency getRedefinesDep() {
        if (this.redefinesDep == null) {
        	this.redefinesDep = this.getDependencyDef("Redefines");
        }
        return this.redefinesDep;
    }

    @objid ("d8cc93c9-2235-4814-afdb-91ef4969a058")
    public SmDependency getCallerDep() {
        if (this.callerDep == null) {
        	this.callerDep = this.getDependencyDef("Caller");
        }
        return this.callerDep;
    }

    @objid ("64bc93b4-d98d-42f5-bd86-444cee67653f")
    public SmDependency getCallingActionDep() {
        if (this.callingActionDep == null) {
        	this.callingActionDep = this.getDependencyDef("CallingAction");
        }
        return this.callingActionDep;
    }

    @objid ("2bdc1970-619d-4d6e-9e71-a1e6dc5f442e")
    public SmDependency getEntryPointActionDep() {
        if (this.entryPointActionDep == null) {
        	this.entryPointActionDep = this.getDependencyDef("EntryPointAction");
        }
        return this.entryPointActionDep;
    }

    @objid ("c10be9c9-1b42-486d-b97b-ab17ed6135f2")
    private static class OperationObjectFactory implements ISmObjectFactory {
        @objid ("c016afb3-5f3b-413e-bc3b-421704664b91")
        private OperationSmClass smClass;

        @objid ("cc1d396e-542a-4889-8b46-7d2debce7dfe")
        public OperationObjectFactory(OperationSmClass smClass) {
            this.smClass = smClass;
        }

        @objid ("c4c37784-c7a8-466f-9c4d-2ca780e32018")
        @Override
        public ISmObjectData createData() {
            return new OperationData(this.smClass);
        }

        @objid ("211a09a1-d40c-4e4b-916d-29d09098485f")
        @Override
        public SmObjectImpl createImpl() {
            return new OperationImpl();
        }

    }

    @objid ("1ea36b27-954e-4d97-802b-ed6d972633f8")
    public static class ConcurrencySmAttribute extends SmAttribute {
        @objid ("2430fda5-2ac7-4b76-9f21-b3a6ca909903")
        public Object getValue(ISmObjectData data) {
            return ((OperationData) data).mConcurrency;
        }

        @objid ("7ba8eb98-5da8-4d16-8116-926b35bf44f3")
        public void setValue(ISmObjectData data, Object value) {
            ((OperationData) data).mConcurrency = value;
        }

    }

    @objid ("1b66b0ae-af91-425f-bda5-ea41e60e26ab")
    public static class FinalSmAttribute extends SmAttribute {
        @objid ("d37dc6cc-dc45-4c5c-afc9-976a44e99100")
        public Object getValue(ISmObjectData data) {
            return ((OperationData) data).mFinal;
        }

        @objid ("f88c93c8-dab4-4e61-8669-ee345f30b859")
        public void setValue(ISmObjectData data, Object value) {
            ((OperationData) data).mFinal = value;
        }

    }

    @objid ("1645b06b-67f5-4a49-92c3-624fcc15e518")
    public static class PassingSmAttribute extends SmAttribute {
        @objid ("496ba274-cff5-4639-835c-e8a92e376a79")
        public Object getValue(ISmObjectData data) {
            return ((OperationData) data).mPassing;
        }

        @objid ("39047315-cde4-4d5d-bc2a-6a0c8e915ad2")
        public void setValue(ISmObjectData data, Object value) {
            ((OperationData) data).mPassing = value;
        }

    }

    @objid ("f33e16dd-a836-4f72-afcf-96e4b0fbde24")
    public static class OwnedImportSmDependency extends SmMultipleDependency {
        @objid ("3465f5a4-c085-4e91-80c7-800d3871d3b1")
        private SmDependency symetricDep;

        @objid ("0afd2dfb-fa97-4b76-bebb-7ef274530398")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mOwnedImport != null)? ((OperationData)data).mOwnedImport:SmMultipleDependency.EMPTY;
        }

        @objid ("2049b841-ff1b-4c90-813e-59ac13128587")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mOwnedImport = values;
        }

        @objid ("9fd6be15-b691-4aa7-9f9d-0a114d6b0999")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ElementImportSmClass)this.getTarget()).getImportingOperationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9419d885-03f1-4cde-bc53-ea96a843fa04")
    public static class ThrownSmDependency extends SmMultipleDependency {
        @objid ("7d2d98c9-58ab-422e-86a7-76a4c1993880")
        private SmDependency symetricDep;

        @objid ("f8190e91-c32b-4535-b007-c572b83b9918")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mThrown != null)? ((OperationData)data).mThrown:SmMultipleDependency.EMPTY;
        }

        @objid ("83639fcd-d77d-4f18-bf9c-49c829544ff4")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mThrown = values;
        }

        @objid ("eb3708ac-1c65-489c-8525-8fe2b5ac0b84")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((RaisedExceptionSmClass)this.getTarget()).getThrowerDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("be287877-2d0e-4565-9594-e38ff189b65e")
    public static class CallerReceiveTaskSmDependency extends SmMultipleDependency {
        @objid ("3fe34e4e-2c34-4683-81af-d21e4351672e")
        private SmDependency symetricDep;

        @objid ("95a3888f-cb3b-4273-ba06-e5c4ef0f03b2")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mCallerReceiveTask != null)? ((OperationData)data).mCallerReceiveTask:SmMultipleDependency.EMPTY;
        }

        @objid ("fb634e21-506c-4650-9402-510807b8c782")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mCallerReceiveTask = values;
        }

        @objid ("308e82a0-cf91-44f8-acf8-e5d231ae934b")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnReceiveTaskSmClass)this.getTarget()).getCalledOperationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1e95a6f9-090f-45c9-afc6-6e17732d93a6")
    public static class RedefinitionSmDependency extends SmMultipleDependency {
        @objid ("1a41ee13-de2e-442c-826e-0523fd74e20c")
        private SmDependency symetricDep;

        @objid ("114a6855-24ba-47f2-a233-80d74647e99c")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mRedefinition != null)? ((OperationData)data).mRedefinition:SmMultipleDependency.EMPTY;
        }

        @objid ("67f0fcd7-7664-44aa-bb73-b3c86f9fc3c3")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mRedefinition = values;
        }

        @objid ("8072a786-edcf-42f9-bb73-e8c63f9a90b9")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getRedefinesDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("e680981a-b5d3-4258-98a8-b646608555dd")
    public static class ExampleSmDependency extends SmMultipleDependency {
        @objid ("55c17ac0-fd90-4c74-8d73-3aeb9a473a77")
        private SmDependency symetricDep;

        @objid ("c8b6d51a-7223-4e3a-a76c-5647eb966e0f")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mExample != null)? ((OperationData)data).mExample:SmMultipleDependency.EMPTY;
        }

        @objid ("400f2511-6ea6-43a1-adbe-5b4219bcdbe1")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mExample = values;
        }

        @objid ("fe29bad7-2b4f-4b5e-8692-b608a300f879")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CollaborationSmClass)this.getTarget()).getORepresentedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("9d4e9e1a-eeba-4334-9b44-9439ebfef095")
    public static class SRepresentationSmDependency extends SmMultipleDependency {
        @objid ("603fa8db-3cc0-4920-8610-e63dee322dbc")
        private SmDependency symetricDep;

        @objid ("e8e0f4fb-bf54-49bd-afde-8d7caf3960b9")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mSRepresentation != null)? ((OperationData)data).mSRepresentation:SmMultipleDependency.EMPTY;
        }

        @objid ("0740a89d-9316-44a9-87ac-3f50e30749c9")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mSRepresentation = values;
        }

        @objid ("41ae48ee-4986-46b4-aae5-d317b04cdf50")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((SignalSmClass)this.getTarget()).getOBaseDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("f0854c5b-a6f1-46f8-8948-32791918e764")
    public static class OwnedBehaviorSmDependency extends SmMultipleDependency {
        @objid ("0b75f586-adea-4a1e-bdcc-dc79fb021278")
        private SmDependency symetricDep;

        @objid ("0bee1c36-181c-4b93-ab10-7817b6366c66")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mOwnedBehavior != null)? ((OperationData)data).mOwnedBehavior:SmMultipleDependency.EMPTY;
        }

        @objid ("122cfe05-bee3-4090-b243-00f52da2736d")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mOwnedBehavior = values;
        }

        @objid ("a8bcfb30-d094-4011-8b6c-4bca7a824e13")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BehaviorSmClass)this.getTarget()).getOwnerOperationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("195bfd0c-3b77-4e46-acc4-d13bc356659f")
    public static class BpmnOperationRefSmDependency extends SmMultipleDependency {
        @objid ("7f8313c5-bf7f-4262-8ab7-49ee39181408")
        private SmDependency symetricDep;

        @objid ("6ccf23cf-bebf-4d87-b903-966176eb46e1")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mBpmnOperationRef != null)? ((OperationData)data).mBpmnOperationRef:SmMultipleDependency.EMPTY;
        }

        @objid ("dd78ac82-6d8e-4d39-9c9e-04523c1415c1")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mBpmnOperationRef = values;
        }

        @objid ("ff474c93-5e0f-4c56-a2f2-4ee8702065e2")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnOperationSmClass)this.getTarget()).getImplementationRefDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1fbec19a-be84-4249-a061-ced91853ab44")
    public static class CallerSendTaskSmDependency extends SmMultipleDependency {
        @objid ("2587b2b1-b113-4ec7-9d14-3b24bd34faea")
        private SmDependency symetricDep;

        @objid ("2c1f9386-0895-44b8-a58d-623ee24122fd")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mCallerSendTask != null)? ((OperationData)data).mCallerSendTask:SmMultipleDependency.EMPTY;
        }

        @objid ("a36f9e75-ea58-4525-adcd-3ea985d2b754")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mCallerSendTask = values;
        }

        @objid ("fd8959db-f8d6-4ae5-83a2-b489a2665c87")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnSendTaskSmClass)this.getTarget()).getCalledOperationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("3fe038b4-b993-45c6-8816-e38271a64b5f")
    public static class IOSmDependency extends SmMultipleDependency {
        @objid ("91d93a5b-f914-434e-beaf-2b908b0917a6")
        private SmDependency symetricDep;

        @objid ("6a43304e-eb7d-4a77-991a-dd1e317a3fb9")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mIO != null)? ((OperationData)data).mIO:SmMultipleDependency.EMPTY;
        }

        @objid ("c62cd8ab-80c2-4938-9d9a-4595bdd669ca")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mIO = values;
        }

        @objid ("13894666-33ac-43e0-b8d5-463e9d12f371")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ParameterSmClass)this.getTarget()).getComposedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("5d421a10-5dad-42d3-b3f0-b92fa1872dcc")
    public static class TemplateInstanciationSmDependency extends SmMultipleDependency {
        @objid ("38ef6cbd-5ba7-4480-8866-2f2178f872c1")
        private SmDependency symetricDep;

        @objid ("0975d09a-be00-42a4-83ec-9ce08bee1cb3")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mTemplateInstanciation != null)? ((OperationData)data).mTemplateInstanciation:SmMultipleDependency.EMPTY;
        }

        @objid ("4a19f1f6-1cd5-45e5-bb10-86b3b763a042")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mTemplateInstanciation = values;
        }

        @objid ("a7b55688-adc2-41e6-98b8-088b4e323cfb")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TemplateBindingSmClass)this.getTarget()).getBoundOperationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("b68bcb57-91c3-4db4-89a5-6fddd5ec8449")
    public static class OwnerSmDependency extends SmSingleDependency {
        @objid ("9e5a9269-a4ed-4c3f-8bc3-91d5fe72c3cd")
        private SmDependency symetricDep;

        @objid ("997a493c-8d2b-4087-9de8-50303ac8c5b5")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((OperationData) data).mOwner;
        }

        @objid ("bb556c05-8db8-4f62-8df0-df21bebeb794")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((OperationData) data).mOwner = value;
        }

        @objid ("141ce704-3025-48be-9a22-e2683cfb6068")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ClassifierSmClass)this.getTarget()).getOwnedOperationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("7a21b1bd-f63d-4b5f-ac62-2ac23554c3d3")
    public static class OwnedPackageImportSmDependency extends SmMultipleDependency {
        @objid ("b7629b43-9e85-4a4f-8826-4adf3979af7c")
        private SmDependency symetricDep;

        @objid ("90d3a46f-eea7-4978-872d-0e52e300c412")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mOwnedPackageImport != null)? ((OperationData)data).mOwnedPackageImport:SmMultipleDependency.EMPTY;
        }

        @objid ("55b44701-3ca6-452f-8406-708c68727aeb")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mOwnedPackageImport = values;
        }

        @objid ("392f459f-c5fa-4e94-a150-af620049a646")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((PackageImportSmClass)this.getTarget()).getImportingOperationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("852e93b4-4170-4200-a27f-6f210fcc0da0")
    public static class ReturnSmDependency extends SmSingleDependency {
        @objid ("9730f56e-75dd-4f88-8883-a239e17bba3b")
        private SmDependency symetricDep;

        @objid ("c9848902-44e4-4416-853a-0505503880ed")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((OperationData) data).mReturn;
        }

        @objid ("53e3c62e-bfc0-4044-816e-3702aca5cbe6")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((OperationData) data).mReturn = value;
        }

        @objid ("4172f262-4c8d-45d0-8e2c-1d345507d6ca")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((ParameterSmClass)this.getTarget()).getReturnedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1b238141-e628-47f3-bd80-5f82271fb955")
    public static class InstanciatingBindingSmDependency extends SmMultipleDependency {
        @objid ("caa3b7e3-67eb-4762-b3c8-7a41425d1ad2")
        private SmDependency symetricDep;

        @objid ("5a42a9de-f625-4345-b9f7-15dc8b54c3ad")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mInstanciatingBinding != null)? ((OperationData)data).mInstanciatingBinding:SmMultipleDependency.EMPTY;
        }

        @objid ("55a924cb-ac4e-45cb-b445-5fc46bbb3802")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mInstanciatingBinding = values;
        }

        @objid ("a9abdec8-f8a0-4f62-bf36-3211f4c27db0")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TemplateBindingSmClass)this.getTarget()).getInstanciatedTemplateOperationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("99fdc468-39b3-408b-b7dd-e7a0ebfd5ec4")
    public static class UsageSmDependency extends SmMultipleDependency {
        @objid ("9b82486b-a11f-419b-a8d3-7cee2b9a598b")
        private SmDependency symetricDep;

        @objid ("924e7f18-9b71-45c4-82b0-7947de488aac")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mUsage != null)? ((OperationData)data).mUsage:SmMultipleDependency.EMPTY;
        }

        @objid ("9f35f846-dde9-455f-bc08-8c9187550529")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mUsage = values;
        }

        @objid ("1681e142-31c7-4594-8733-6c5cfa1e552f")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((MessageSmClass)this.getTarget()).getInvokedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("ae337042-4960-4ca1-9f4e-cf9a3d862e7d")
    public static class TemplateSmDependency extends SmMultipleDependency {
        @objid ("ad5e609b-41bb-446a-ae4c-9d18a64c5e88")
        private SmDependency symetricDep;

        @objid ("9fe31122-4d64-4bed-a83a-597941034f74")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mTemplate != null)? ((OperationData)data).mTemplate:SmMultipleDependency.EMPTY;
        }

        @objid ("f88dc22b-6555-41ee-844e-cf42a7252716")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mTemplate = values;
        }

        @objid ("e3782689-ef53-4372-be91-e4f559d5f7c7")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TemplateParameterSmClass)this.getTarget()).getParameterizedOperationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("845df99d-9bc0-4b89-be8b-895dbc73e7b5")
    public static class CallerServiceTaskSmDependency extends SmMultipleDependency {
        @objid ("684be67b-8881-4134-9c28-15e6e924b25f")
        private SmDependency symetricDep;

        @objid ("196ae06e-9679-4436-9b45-0534301f30dd")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mCallerServiceTask != null)? ((OperationData)data).mCallerServiceTask:SmMultipleDependency.EMPTY;
        }

        @objid ("654935bc-1455-4206-b27b-e7e2ec058be6")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mCallerServiceTask = values;
        }

        @objid ("2d388694-af04-4f0b-ad36-96e5373f57dc")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnServiceTaskSmClass)this.getTarget()).getCalledOperationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("424b05c6-109f-440e-886b-49ba5f994a82")
    public static class OccurenceSmDependency extends SmMultipleDependency {
        @objid ("dc1a19fb-9858-405e-8d89-aff009e4b6b1")
        private SmDependency symetricDep;

        @objid ("36d737bf-8c40-49dc-b40d-e2a2c491a554")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mOccurence != null)? ((OperationData)data).mOccurence:SmMultipleDependency.EMPTY;
        }

        @objid ("9f0478f6-1ca6-4f80-84ea-23985034dcf2")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mOccurence = values;
        }

        @objid ("042b3bc9-0fa9-48f2-8c19-38359586e298")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((EventSmClass)this.getTarget()).getCalledDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("1933adf2-b554-43dd-85d9-d95ba6b5ca2f")
    public static class InvokerSmDependency extends SmMultipleDependency {
        @objid ("d0a51437-7bae-41ce-a11b-498b0ca59178")
        private SmDependency symetricDep;

        @objid ("cacde9de-dd0a-45a3-9313-23d77a5b76f2")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mInvoker != null)? ((OperationData)data).mInvoker:SmMultipleDependency.EMPTY;
        }

        @objid ("f4ad83cf-6708-4800-8730-12671251e803")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mInvoker = values;
        }

        @objid ("a90b162a-345a-413b-a451-939621c6dd7a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((TransitionSmClass)this.getTarget()).getProcessedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("d1e17140-40c9-409d-be11-764716f5d429")
    public static class CommunicationUsageSmDependency extends SmMultipleDependency {
        @objid ("46e46cc2-3518-480f-a13a-9ab9d38a3aa0")
        private SmDependency symetricDep;

        @objid ("a4d42b51-1fa1-482f-b98e-431a0bcfe68e")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mCommunicationUsage != null)? ((OperationData)data).mCommunicationUsage:SmMultipleDependency.EMPTY;
        }

        @objid ("58d410ee-d818-4c1c-8f23-6770328bd040")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mCommunicationUsage = values;
        }

        @objid ("59d44368-f95c-412c-b59e-d69e92926bb3")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CommunicationMessageSmClass)this.getTarget()).getInvokedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("36eda40a-9e05-4924-8013-841391fc99d6")
    public static class OwnedCollaborationUseSmDependency extends SmMultipleDependency {
        @objid ("1f5ea3d9-0e2e-4119-aff6-9b38c6ea5530")
        private SmDependency symetricDep;

        @objid ("4be00525-ebc5-4b32-95af-e12645e8505e")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mOwnedCollaborationUse != null)? ((OperationData)data).mOwnedCollaborationUse:SmMultipleDependency.EMPTY;
        }

        @objid ("9b34a378-07a3-4617-b6a3-cea13c37ceee")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mOwnedCollaborationUse = values;
        }

        @objid ("0f1681df-614e-4cca-bd8a-440a36a2e4ac")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CollaborationUseSmClass)this.getTarget()).getORepresentedDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("413f8407-8827-4a65-94b3-9032805a7f0d")
    public static class RedefinesSmDependency extends SmSingleDependency {
        @objid ("b3051978-9e99-4987-80f0-dd87af962124")
        private SmDependency symetricDep;

        @objid ("597c1a3e-34d7-479f-8143-4b179d915c8e")
        @Override
        public SmObjectImpl getValue(ISmObjectData data) {
            return ((OperationData) data).mRedefines;
        }

        @objid ("f36074c8-8c3c-4f8a-a89d-a8558a504c06")
        @Override
        public void setValue(ISmObjectData data, SmObjectImpl value) {
            ((OperationData) data).mRedefines = value;
        }

        @objid ("8fd17380-a3a4-4c2c-90ae-271ec89ad107")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((OperationSmClass)this.getTarget()).getRedefinitionDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("51836f53-7176-4e0f-824a-039811ca2aa9")
    public static class CallerSmDependency extends SmMultipleDependency {
        @objid ("c6333139-2bd3-4a4f-af62-fa35d841c551")
        private SmDependency symetricDep;

        @objid ("689ee020-7aa2-4568-b065-44c6c40ac088")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mCaller != null)? ((OperationData)data).mCaller:SmMultipleDependency.EMPTY;
        }

        @objid ("46b847a1-e769-4022-a493-94a590c06e84")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mCaller = values;
        }

        @objid ("b64b6372-41da-4cae-95bd-5d27fd57ae6a")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((BpmnCallActivitySmClass)this.getTarget()).getCalledOperationDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("0f387f1d-27e0-404b-816b-395cfe001847")
    public static class CallingActionSmDependency extends SmMultipleDependency {
        @objid ("4656b4c2-27b3-4f57-8ac7-a566acc736bb")
        private SmDependency symetricDep;

        @objid ("017fb234-5a64-4092-bd4b-ab6e26c8227d")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mCallingAction != null)? ((OperationData)data).mCallingAction:SmMultipleDependency.EMPTY;
        }

        @objid ("9433b33c-67f7-4522-b6c1-379e11a34f87")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mCallingAction = values;
        }

        @objid ("d43110cd-600c-4165-b5ee-25ac6a800172")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((CallOperationActionSmClass)this.getTarget()).getCalledDep();
            }
            return this.symetricDep;
        }

    }

    @objid ("792cfe79-f297-4dcf-b3cb-f363234f02d6")
    public static class EntryPointActionSmDependency extends SmMultipleDependency {
        @objid ("f03614b8-9db9-4863-906d-a7d5d1d621aa")
        private SmDependency symetricDep;

        @objid ("953a0876-74c3-44d0-8b6e-bced20dc3c16")
        @Override
        public List<SmObjectImpl> getValueList(ISmObjectData data) {
            return (((OperationData)data).mEntryPointAction != null)? ((OperationData)data).mEntryPointAction:SmMultipleDependency.EMPTY;
        }

        @objid ("98d0348e-5206-40c6-a1fe-584eb157ecfd")
        @Override
        protected void initValueList(ISmObjectData data, List<SmObjectImpl> values) {
            ((OperationData) data).mEntryPointAction = values;
        }

        @objid ("e210420a-f460-41ab-9c3e-23410a318b4d")
        @Override
        public SmDependency getSymetric() {
            if (this.symetricDep == null) {
            	this.symetricDep = ((AcceptCallEventActionSmClass)this.getTarget()).getCalledDep();
            }
            return this.symetricDep;
        }

    }

}
