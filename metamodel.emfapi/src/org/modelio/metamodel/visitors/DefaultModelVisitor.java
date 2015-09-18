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
                                    

package org.modelio.metamodel.visitors;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystContainer;
import org.modelio.metamodel.analyst.AnalystElement;
import org.modelio.metamodel.analyst.AnalystItem;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.analyst.BusinessRule;
import org.modelio.metamodel.analyst.BusinessRuleContainer;
import org.modelio.metamodel.analyst.Dictionary;
import org.modelio.metamodel.analyst.GenericAnalystContainer;
import org.modelio.metamodel.analyst.GenericAnalystElement;
import org.modelio.metamodel.analyst.Goal;
import org.modelio.metamodel.analyst.GoalContainer;
import org.modelio.metamodel.analyst.PropertyContainer;
import org.modelio.metamodel.analyst.Requirement;
import org.modelio.metamodel.analyst.RequirementContainer;
import org.modelio.metamodel.analyst.Term;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnAdHocSubProcess;
import org.modelio.metamodel.bpmn.activities.BpmnBusinessRuleTask;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.BpmnManualTask;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.BpmnReceiveTask;
import org.modelio.metamodel.bpmn.activities.BpmnScriptTask;
import org.modelio.metamodel.bpmn.activities.BpmnSendTask;
import org.modelio.metamodel.bpmn.activities.BpmnServiceTask;
import org.modelio.metamodel.bpmn.activities.BpmnStandardLoopCharacteristics;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.bpmn.activities.BpmnTransaction;
import org.modelio.metamodel.bpmn.activities.BpmnUserTask;
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnProcessCollaborationDiagram;
import org.modelio.metamodel.bpmn.bpmnDiagrams.BpmnSubProcessDiagram;
import org.modelio.metamodel.bpmn.bpmnService.BpmnEndPoint;
import org.modelio.metamodel.bpmn.bpmnService.BpmnInterface;
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.bpmn.events.BpmnCancelEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnConditionalEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnEndEvent;
import org.modelio.metamodel.bpmn.events.BpmnErrorEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnEscalationEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.bpmn.events.BpmnEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.bpmn.events.BpmnIntermediateCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnIntermediateThrowEvent;
import org.modelio.metamodel.bpmn.events.BpmnLinkEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnMessageEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnSignalEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnStartEvent;
import org.modelio.metamodel.bpmn.events.BpmnTerminateEventDefinition;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.events.BpmnTimerEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnMessage;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.gateways.BpmnComplexGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnExclusiveGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnInclusiveGateway;
import org.modelio.metamodel.bpmn.gateways.BpmnParallelGateway;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataObject;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.bpmn.objects.BpmnDataState;
import org.modelio.metamodel.bpmn.objects.BpmnDataStore;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.objects.BpmnItemDefinition;
import org.modelio.metamodel.bpmn.objects.BpmnSequenceFlowDataAssociation;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.bpmn.resources.BpmnResource;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameter;
import org.modelio.metamodel.bpmn.resources.BpmnResourceParameterBinding;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociation;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnBehavior;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;
import org.modelio.metamodel.bpmn.rootElements.BpmnGroup;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;
import org.modelio.metamodel.diagrams.AbstractDiagram;
import org.modelio.metamodel.diagrams.ActivityDiagram;
import org.modelio.metamodel.diagrams.BehaviorDiagram;
import org.modelio.metamodel.diagrams.ClassDiagram;
import org.modelio.metamodel.diagrams.CommunicationDiagram;
import org.modelio.metamodel.diagrams.CompositeStructureDiagram;
import org.modelio.metamodel.diagrams.DeploymentDiagram;
import org.modelio.metamodel.diagrams.DiagramSet;
import org.modelio.metamodel.diagrams.ObjectDiagram;
import org.modelio.metamodel.diagrams.SequenceDiagram;
import org.modelio.metamodel.diagrams.StateMachineDiagram;
import org.modelio.metamodel.diagrams.StaticDiagram;
import org.modelio.metamodel.diagrams.UseCaseDiagram;
import org.modelio.metamodel.mda.ModuleComponent;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.mda.Project;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptCallEventAction;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptChangeEventAction;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptSignalAction;
import org.modelio.metamodel.uml.behavior.activityModel.AcceptTimeEventAction;
import org.modelio.metamodel.uml.behavior.activityModel.Activity;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityFinalNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityGroup;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityParameterNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;
import org.modelio.metamodel.uml.behavior.activityModel.CallAction;
import org.modelio.metamodel.uml.behavior.activityModel.CallBehaviorAction;
import org.modelio.metamodel.uml.behavior.activityModel.CallOperationAction;
import org.modelio.metamodel.uml.behavior.activityModel.CentralBufferNode;
import org.modelio.metamodel.uml.behavior.activityModel.Clause;
import org.modelio.metamodel.uml.behavior.activityModel.ConditionalNode;
import org.modelio.metamodel.uml.behavior.activityModel.ControlFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ControlNode;
import org.modelio.metamodel.uml.behavior.activityModel.DataStoreNode;
import org.modelio.metamodel.uml.behavior.activityModel.DecisionMergeNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;
import org.modelio.metamodel.uml.behavior.activityModel.FinalNode;
import org.modelio.metamodel.uml.behavior.activityModel.FlowFinalNode;
import org.modelio.metamodel.uml.behavior.activityModel.ForkJoinNode;
import org.modelio.metamodel.uml.behavior.activityModel.InitialNode;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.behavior.activityModel.InstanceNode;
import org.modelio.metamodel.uml.behavior.activityModel.InterruptibleActivityRegion;
import org.modelio.metamodel.uml.behavior.activityModel.LoopNode;
import org.modelio.metamodel.uml.behavior.activityModel.MessageFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNode;
import org.modelio.metamodel.uml.behavior.activityModel.OpaqueAction;
import org.modelio.metamodel.uml.behavior.activityModel.OutputPin;
import org.modelio.metamodel.uml.behavior.activityModel.Pin;
import org.modelio.metamodel.uml.behavior.activityModel.SendSignalAction;
import org.modelio.metamodel.uml.behavior.activityModel.StructuredActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ValuePin;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.BehaviorParameter;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Event;
import org.modelio.metamodel.uml.behavior.commonBehaviors.OpaqueBehavior;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Signal;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationInteraction;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationMessage;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.behavior.interactionModel.CombinedFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.DurationConstraint;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.behavior.interactionModel.OccurrenceSpecification;
import org.modelio.metamodel.uml.behavior.interactionModel.PartDecomposition;
import org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant;
import org.modelio.metamodel.uml.behavior.interactionModel.TerminateSpecification;
import org.modelio.metamodel.uml.behavior.stateMachineModel.AbstractPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ChoicePseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.DeepHistoryPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.FinalState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ForkPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InitialPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.InternalTransition;
import org.modelio.metamodel.uml.behavior.stateMachineModel.JoinPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.JunctionPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ShallowHistoryPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.TerminatePseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.ExtensionPoint;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.informationFlow.InformationItem;
import org.modelio.metamodel.uml.infrastructure.Abstraction;
import org.modelio.metamodel.uml.infrastructure.Constraint;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.ModelTree;
import org.modelio.metamodel.uml.infrastructure.Note;
import org.modelio.metamodel.uml.infrastructure.NoteType;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.infrastructure.TagParameter;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.TaggedValue;
import org.modelio.metamodel.uml.infrastructure.Usage;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.LocalPropertyTable;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;
import org.modelio.metamodel.uml.infrastructure.properties.TypedPropertyTable;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.AttributeLink;
import org.modelio.metamodel.uml.statik.BehavioralFeature;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Collaboration;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.ComponentRealization;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.DataType;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.ElementRealization;
import org.modelio.metamodel.uml.statik.Enumeration;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;
import org.modelio.metamodel.uml.statik.Feature;
import org.modelio.metamodel.uml.statik.GeneralClass;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.Link;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.NaryConnector;
import org.modelio.metamodel.uml.statik.NaryConnectorEnd;
import org.modelio.metamodel.uml.statik.NaryLink;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Node;
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.PackageMerge;
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.uml.statik.RequiredInterface;
import org.modelio.metamodel.uml.statik.StructuralFeature;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;

@objid ("00280eec-4f2c-1032-829a-001ec947cd2a")
public class DefaultModelVisitor implements IModelVisitor {
    @objid ("15d4cb60-b7c3-4ba1-9ede-5b425bf26b6d")
    @Override
    public Object visitAbstraction(Abstraction obj) {
        	return visitDependency(obj);
    }

    @objid ("1f4dc38e-13cb-489e-8f0e-d0f6cc0d4476")
    @Override
    public Object visitConstraint(Constraint obj) {
        	return visitModelElement(obj);
    }

    @objid ("116c0409-0a4c-4f16-93f6-a224f273718c")
    @Override
    public Object visitDependency(Dependency obj) {
        	return visitModelElement(obj);
    }

    @objid ("83a5810f-b37f-483d-b3f4-837b079f7df8")
    @Override
    public Object visitElement(Element obj) {
        	return null;
    }

    @objid ("b0f5bdc4-a716-407c-a3d4-25c35d072341")
    @Override
    public Object visitModelElement(ModelElement obj) {
        	return visitElement(obj);
    }

    @objid ("81824125-e711-4740-a8d2-abf06298c757")
    @Override
    public Object visitModelTree(ModelTree obj) {
        	return visitModelElement(obj);
    }

    @objid ("4cf51bac-7ff7-4de3-a342-fc184e3323fa")
    @Override
    public Object visitNote(Note obj) {
        	return visitModelElement(obj);
    }

    @objid ("bf5d0231-e974-4d5f-9405-f3e80b9d2e86")
    @Override
    public Object visitNoteType(NoteType obj) {
        	return visitModelElement(obj);
    }

    @objid ("479f48c9-f9d4-444d-aa6e-004c35885eb4")
    @Override
    public Object visitProfile(Profile obj) {
        	return visitPackage(obj);
    }

    @objid ("9c696773-0386-44af-a488-6148969fbaa6")
    @Override
    public Object visitStereotype(Stereotype obj) {
        	return visitModelElement(obj);
    }

    @objid ("ef9205bf-a781-4394-9c6d-c6cfd759bf97")
    @Override
    public Object visitSubstitution(Substitution obj) {
        	return visitModelElement(obj);
    }

    @objid ("cd690392-4483-482f-b76d-154664f1f483")
    @Override
    public Object visitTagParameter(TagParameter obj) {
        	return visitElement(obj);
    }

    @objid ("517caabd-48b7-48fd-a795-270c131725ea")
    @Override
    public Object visitTagType(TagType obj) {
        	return visitModelElement(obj);
    }

    @objid ("4f8c311f-a9f7-4bf6-9cba-767f2d460887")
    @Override
    public Object visitTaggedValue(TaggedValue obj) {
        	return visitModelElement(obj);
    }

    @objid ("28ca97ab-3d84-48af-bdf7-086bdcaad3aa")
    @Override
    public Object visitUsage(Usage obj) {
        	return visitDependency(obj);
    }

    @objid ("3576bec4-c963-4c58-be3e-8492d420c0dd")
    @Override
    public Object visitMetaclassReference(MetaclassReference obj) {
        	return visitElement(obj);
    }

    @objid ("6f80015c-e0d6-4305-aeff-2ba79e2ea403")
    @Override
    public Object visitExternDocument(ExternDocument obj) {
        	return visitModelElement(obj);
    }

    @objid ("ec37efba-bbd8-4d47-8b42-3cfc7cf2312e")
    @Override
    public Object visitExternDocumentType(ExternDocumentType obj) {
        	return visitModelElement(obj);
    }

    @objid ("8862a3cc-88a4-4283-ae43-1a0c1d7842ff")
    @Override
    public Object visitEnumeratedPropertyType(EnumeratedPropertyType obj) {
        	return visitPropertyType(obj);
    }

    @objid ("3ae3f168-ae71-44ab-bf26-b01907246522")
    @Override
    public Object visitLocalPropertyTable(LocalPropertyTable obj) {
        	return visitPropertyTable(obj);
    }

    @objid ("aa245691-2cfe-4f6e-b5bf-d7041ae29295")
    @Override
    public Object visitPropertyDefinition(PropertyDefinition obj) {
        	return visitModelElement(obj);
    }

    @objid ("9d735c2b-3eba-4428-bb15-4a58040d06c9")
    @Override
    public Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj) {
        	return visitModelElement(obj);
    }

    @objid ("738d06a8-9440-433e-bbbd-cc41b97f36b1")
    @Override
    public Object visitPropertyTable(PropertyTable obj) {
        	return visitElement(obj);
    }

    @objid ("a84daa1b-a14d-4d8e-a8a6-f22b0b10e4f7")
    @Override
    public Object visitPropertyTableDefinition(PropertyTableDefinition obj) {
        	return visitModelElement(obj);
    }

    @objid ("74477fd4-c403-4dfa-b553-5542d5031bb4")
    @Override
    public Object visitPropertyType(PropertyType obj) {
        	return visitModelElement(obj);
    }

    @objid ("f95ec731-5986-4f4c-853b-ce2082be5f2c")
    @Override
    public Object visitTypedPropertyTable(TypedPropertyTable obj) {
        	return visitPropertyTable(obj);
    }

    @objid ("ba4a2eab-5992-4348-8e65-1404608d6375")
    @Override
    public Object visitMatrixDefinition(MatrixDefinition obj) {
        	return visitModelElement(obj);
    }

    @objid ("42d120d7-3306-411b-9b88-912f1b486d35")
    @Override
    public Object visitQueryDefinition(QueryDefinition obj) {
        	return visitElement(obj);
    }

    @objid ("34a9f142-f985-4d7d-9176-f65534a89d14")
    @Override
    public Object visitMatrixValueDefinition(MatrixValueDefinition obj) {
        	return visitElement(obj);
    }

    @objid ("0465ae3c-3efa-49a5-85a2-93d9be4730b1")
    @Override
    public Object visitExternProcessor(ExternProcessor obj) {
        	return visitModelElement(obj);
    }

    @objid ("1ab7ec4b-8e55-4839-82b8-878eb0ce7c90")
    @Override
    public Object visitArtifact(Artifact obj) {
        	return visitClassifier(obj);
    }

    @objid ("195ea5cc-75aa-4458-8d31-f2cb0a88964e")
    @Override
    public Object visitAssociation(Association obj) {
        	return visitModelElement(obj);
    }

    @objid ("13aa3a1a-0511-49c5-964b-c6982cc30516")
    @Override
    public Object visitAssociationEnd(AssociationEnd obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("d5f30823-6936-4500-84cd-fefbb1660570")
    @Override
    public Object visitAttribute(Attribute obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("23b52f51-c26a-4b5b-ba98-0afd4880ab27")
    @Override
    public Object visitAttributeLink(AttributeLink obj) {
        	return visitModelElement(obj);
    }

    @objid ("7c6eab57-ab84-45e1-8ad8-283518b7c0c7")
    @Override
    public Object visitBehavioralFeature(BehavioralFeature obj) {
        	return visitFeature(obj);
    }

    @objid ("5ae53b04-35f0-4a22-9093-643d9d6e154f")
    @Override
    public Object visitBindableInstance(BindableInstance obj) {
        	return visitInstance(obj);
    }

    @objid ("072039a0-34c7-41ce-8f79-4e12a3af2c92")
    @Override
    public Object visitBinding(Binding obj) {
        	return visitModelElement(obj);
    }

    @objid ("68ad6c73-f98f-4e8b-b3a0-7397aa262acc")
    @Override
    public Object visitClass(Class obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("abedec74-d859-4295-8acb-44c137087d3f")
    @Override
    public Object visitClassAssociation(ClassAssociation obj) {
        	return visitModelElement(obj);
    }

    @objid ("c5d5a403-36ea-4a13-aeec-53a4b5eb1497")
    @Override
    public Object visitClassifier(Classifier obj) {
        	return visitNameSpace(obj);
    }

    @objid ("28ce51e6-3fff-4653-bdbd-f2deceed98fa")
    @Override
    public Object visitCollaboration(Collaboration obj) {
        	return visitNameSpace(obj);
    }

    @objid ("ce84f1d3-2e33-49e4-8ec7-e5778fe0d879")
    @Override
    public Object visitCollaborationUse(CollaborationUse obj) {
        	return visitModelElement(obj);
    }

    @objid ("18ed9ba1-a1f6-4f58-ac4e-91b786593c9e")
    @Override
    public Object visitComponent(Component obj) {
        	return visitClass(obj);
    }

    @objid ("d9f536a2-7343-46a6-80b7-ea860989560c")
    @Override
    public Object visitComponentRealization(ComponentRealization obj) {
        	return visitModelElement(obj);
    }

    @objid ("0ad6df5a-6652-449d-ba95-fdece5a0001e")
    @Override
    public Object visitConnector(Connector obj) {
        	return visitLink(obj);
    }

    @objid ("85b05d4b-f748-4046-afa4-1b9c7d2e9c37")
    @Override
    public Object visitConnectorEnd(ConnectorEnd obj) {
        	return visitLinkEnd(obj);
    }

    @objid ("fa74334c-70db-4e22-8312-516369a0bc30")
    @Override
    public Object visitDataType(DataType obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("d3829bae-ef22-41d8-9a04-06646f732f98")
    @Override
    public Object visitElementImport(ElementImport obj) {
        	return visitModelElement(obj);
    }

    @objid ("f1b253d6-f203-4a95-9b01-a0d99bcf3bdf")
    @Override
    public Object visitElementRealization(ElementRealization obj) {
        	return visitAbstraction(obj);
    }

    @objid ("7e59c566-a9c5-420b-9860-f2b677349829")
    @Override
    public Object visitEnumeration(Enumeration obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("f198cc4e-c583-4427-b367-14876112bd1e")
    @Override
    public Object visitEnumerationLiteral(EnumerationLiteral obj) {
        	return visitModelElement(obj);
    }

    @objid ("7cd2114a-f0d6-44f2-a6a1-58493c13f415")
    @Override
    public Object visitFeature(Feature obj) {
        	return visitModelElement(obj);
    }

    @objid ("0f411316-aa46-41a4-a8af-53781acf0061")
    @Override
    public Object visitGeneralClass(GeneralClass obj) {
        	return visitClassifier(obj);
    }

    @objid ("cb61ef46-33cb-4371-8511-4b92963a545d")
    @Override
    public Object visitGeneralization(Generalization obj) {
        	return visitModelElement(obj);
    }

    @objid ("ef27b11b-7b6c-4cdf-bb4f-0576e969e7f4")
    @Override
    public Object visitInstance(Instance obj) {
        	return visitModelElement(obj);
    }

    @objid ("b6acd8e4-2d0f-47d6-b7b9-c56d5c2d9182")
    @Override
    public Object visitInterface(Interface obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("05eec629-710b-421e-a3a2-dcd4df51e38d")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization obj) {
        	return visitModelElement(obj);
    }

    @objid ("8a6c6a38-f869-4277-ab93-a1c78b2a94a2")
    @Override
    public Object visitLink(Link obj) {
        	return visitModelElement(obj);
    }

    @objid ("84c7c097-d19f-4d10-a217-ad061704c740")
    @Override
    public Object visitLinkEnd(LinkEnd obj) {
        	return visitModelElement(obj);
    }

    @objid ("d19e4385-c8ed-4416-9350-2368947c6beb")
    @Override
    public Object visitManifestation(Manifestation obj) {
        	return visitModelElement(obj);
    }

    @objid ("30153ec0-da14-4f59-be5a-e6a11186dc90")
    @Override
    public Object visitNameSpace(NameSpace obj) {
        	return visitModelTree(obj);
    }

    @objid ("aea1d86a-ed22-4733-8f08-f7de5b5df3c8")
    @Override
    public Object visitNamespaceUse(NamespaceUse obj) {
        	return visitElement(obj);
    }

    @objid ("543d6088-f44c-4627-87df-7c46a88359e1")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("2ec002b4-dab7-48bc-921e-f80d98fe2e0c")
    @Override
    public Object visitNaryAssociation(NaryAssociation obj) {
        	return visitModelElement(obj);
    }

    @objid ("458d1e5d-d8d2-4455-bafe-5ce28d9a741d")
    @Override
    public Object visitNaryConnector(NaryConnector obj) {
        	return visitNaryLink(obj);
    }

    @objid ("9a9f3971-3fa7-4d87-b086-1fa34bfbb4c1")
    @Override
    public Object visitNaryConnectorEnd(NaryConnectorEnd obj) {
        	return visitNaryLinkEnd(obj);
    }

    @objid ("4e5c193a-ae59-4499-83d7-dc297c1e6b73")
    @Override
    public Object visitNaryLink(NaryLink obj) {
        	return visitModelElement(obj);
    }

    @objid ("da0488f5-de5b-46d0-a960-ccd54764bccc")
    @Override
    public Object visitNaryLinkEnd(NaryLinkEnd obj) {
        	return visitModelElement(obj);
    }

    @objid ("b0963518-5dc8-4650-84aa-304d6e431922")
    @Override
    public Object visitNode(Node obj) {
        	return visitClassifier(obj);
    }

    @objid ("ba6cac00-fd38-4c0c-84c4-6b7acecc428e")
    @Override
    public Object visitOperation(Operation obj) {
        	return visitBehavioralFeature(obj);
    }

    @objid ("bfdc49bf-2f2b-406f-8aff-6c66d0eccfe1")
    @Override
    public Object visitPackage(Package obj) {
        	return visitNameSpace(obj);
    }

    @objid ("66d6146d-4cc5-40ac-a233-b08cec2b3e2e")
    @Override
    public Object visitPackageImport(PackageImport obj) {
        	return visitModelElement(obj);
    }

    @objid ("7f582dcb-9f86-459c-ad9e-d6b74e00cae4")
    @Override
    public Object visitPackageMerge(PackageMerge obj) {
        	return visitModelElement(obj);
    }

    @objid ("45281bdc-3ce0-4b17-a34e-65144ad207fb")
    @Override
    public Object visitParameter(Parameter obj) {
        	return visitModelElement(obj);
    }

    @objid ("90edff74-e46a-4418-aab0-0ac186361643")
    @Override
    public Object visitPort(Port obj) {
        	return visitBindableInstance(obj);
    }

    @objid ("6bc565d6-4250-48e6-952a-0228f3af5345")
    @Override
    public Object visitProvidedInterface(ProvidedInterface obj) {
        	return visitModelElement(obj);
    }

    @objid ("5ecd5a22-ff94-4b9a-974e-18acdfe6ebe5")
    @Override
    public Object visitRaisedException(RaisedException obj) {
        	return visitModelElement(obj);
    }

    @objid ("0abe0eeb-2f4c-432a-8e9a-147db235ef28")
    @Override
    public Object visitRequiredInterface(RequiredInterface obj) {
        	return visitModelElement(obj);
    }

    @objid ("3cec90b0-ef20-4307-95ed-2bb041599cdb")
    @Override
    public Object visitStructuralFeature(StructuralFeature obj) {
        	return visitFeature(obj);
    }

    @objid ("73a3a572-8c94-4c3a-86dc-299c900414b4")
    @Override
    public Object visitTemplateBinding(TemplateBinding obj) {
        	return visitModelElement(obj);
    }

    @objid ("773e64f4-43f4-451e-85fa-6979d7911301")
    @Override
    public Object visitTemplateParameter(TemplateParameter obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("0e6459ff-0197-4957-b2ba-e7f0ff272358")
    @Override
    public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj) {
        	return visitModelElement(obj);
    }

    @objid ("0d51e87c-cbc4-4eeb-b614-7b3ca14ed18c")
    @Override
    public Object visitAcceptCallEventAction(AcceptCallEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("b40cd77a-58c5-49ac-b143-5069f831aa55")
    @Override
    public Object visitAcceptChangeEventAction(AcceptChangeEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("8d492705-b839-4cdc-8dc5-567905fca79b")
    @Override
    public Object visitAcceptSignalAction(AcceptSignalAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("00ed0fb1-5e9a-494e-85d9-a6fab65b52e9")
    @Override
    public Object visitAcceptTimeEventAction(AcceptTimeEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("f46e7e14-86ff-4e9d-9ccf-191d82dc7583")
    @Override
    public Object visitActivity(Activity obj) {
        	return visitBehavior(obj);
    }

    @objid ("306bf7ec-a43e-42a2-8a9f-fbfac42c629a")
    @Override
    public Object visitActivityAction(ActivityAction obj) {
        	return visitActivityNode(obj);
    }

    @objid ("09abae8d-1032-4e01-9a59-ced35aeb12c5")
    @Override
    public Object visitActivityEdge(ActivityEdge obj) {
        	return visitModelElement(obj);
    }

    @objid ("4e034f21-d1cb-4333-acd6-3340aedbd4ff")
    @Override
    public Object visitActivityFinalNode(ActivityFinalNode obj) {
        	return visitFinalNode(obj);
    }

    @objid ("45059670-f058-4493-8b32-f12d38987e88")
    @Override
    public Object visitActivityGroup(ActivityGroup obj) {
        	return visitModelElement(obj);
    }

    @objid ("5694aa3e-33cf-4b10-a504-9cec1d4a6a2f")
    @Override
    public Object visitActivityNode(ActivityNode obj) {
        	return visitModelElement(obj);
    }

    @objid ("3ca7c600-7d86-4c19-8ae9-a82285bb0f46")
    @Override
    public Object visitActivityParameterNode(ActivityParameterNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("85bd7a9f-fa13-4c6b-8019-1213e4288d8d")
    @Override
    public Object visitActivityPartition(ActivityPartition obj) {
        	return visitActivityGroup(obj);
    }

    @objid ("bccf4a9b-c4bb-4a26-a1d5-e3eafb528f6d")
    @Override
    public Object visitCallAction(CallAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("6959edf2-47b3-49b6-aad0-3dc3ac411ea3")
    @Override
    public Object visitCallBehaviorAction(CallBehaviorAction obj) {
        	return visitCallAction(obj);
    }

    @objid ("da96a343-2449-40ff-b05c-dc18ea2e5ea9")
    @Override
    public Object visitCallOperationAction(CallOperationAction obj) {
        	return visitCallAction(obj);
    }

    @objid ("f256e492-a93e-4ab2-bb0b-782fc0917174")
    @Override
    public Object visitCentralBufferNode(CentralBufferNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("60033739-c954-44a5-96cb-a4e8b11bdf13")
    @Override
    public Object visitClause(Clause obj) {
        	return visitModelElement(obj);
    }

    @objid ("ed1e29ef-6ea8-4923-946a-165cf96a1ff2")
    @Override
    public Object visitConditionalNode(ConditionalNode obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("9743c859-edec-4298-9707-63e82856c488")
    @Override
    public Object visitControlFlow(ControlFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("64ac30d2-6d79-4002-92c2-353d6b10b8f8")
    @Override
    public Object visitControlNode(ControlNode obj) {
        	return visitActivityNode(obj);
    }

    @objid ("42319963-e1d8-4c4b-aec3-e1618b97e449")
    @Override
    public Object visitDataStoreNode(DataStoreNode obj) {
        	return visitCentralBufferNode(obj);
    }

    @objid ("67591df1-da27-4053-aa5a-7e2c6885bb90")
    @Override
    public Object visitDecisionMergeNode(DecisionMergeNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("4d155532-33a4-4c4d-a0d2-364bb6f9c33b")
    @Override
    public Object visitExceptionHandler(ExceptionHandler obj) {
        	return visitModelElement(obj);
    }

    @objid ("90370128-9b29-455d-9ee2-4104b538bd71")
    @Override
    public Object visitExpansionNode(ExpansionNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("446aefad-1176-4821-9292-3d180a4e6e5c")
    @Override
    public Object visitExpansionRegion(ExpansionRegion obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("d5033dfe-9a0a-48d7-85bd-5db66db9981d")
    @Override
    public Object visitFinalNode(FinalNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("9b0ac80a-71d2-49a5-acd1-0b75ff1db53f")
    @Override
    public Object visitFlowFinalNode(FlowFinalNode obj) {
        	return visitFinalNode(obj);
    }

    @objid ("67cc298e-74fb-42f6-b94c-29f97eba2afe")
    @Override
    public Object visitForkJoinNode(ForkJoinNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("b80935f4-0c2e-44f5-83a0-c7a74bda4fe1")
    @Override
    public Object visitInitialNode(InitialNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("49ce3c9b-7104-49e6-ab60-15527c7ea1b7")
    @Override
    public Object visitInputPin(InputPin obj) {
        	return visitPin(obj);
    }

    @objid ("29d24681-cb8b-4496-905f-6a24938b7144")
    @Override
    public Object visitInstanceNode(InstanceNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("751b4e58-41ca-438d-a2a8-bbffdc1f745a")
    @Override
    public Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj) {
        	return visitActivityGroup(obj);
    }

    @objid ("7cadd4ed-9abc-47b4-86ab-a55af8cfe7f0")
    @Override
    public Object visitLoopNode(LoopNode obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("a0b6bf04-4976-488b-870a-ad00b114d283")
    @Override
    public Object visitMessageFlow(MessageFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("0c6baed5-4be0-4d19-a941-176874562f3c")
    @Override
    public Object visitObjectFlow(ObjectFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("17630ba3-4fe5-4a42-8673-d519606ca965")
    @Override
    public Object visitObjectNode(ObjectNode obj) {
        	return visitActivityNode(obj);
    }

    @objid ("4fca57ce-e6db-4f84-858a-168704b26589")
    @Override
    public Object visitOpaqueAction(OpaqueAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("771e8437-ae6d-4eb0-8bdb-c2503e7b8e9f")
    @Override
    public Object visitOutputPin(OutputPin obj) {
        	return visitPin(obj);
    }

    @objid ("d77a8c2e-4950-4042-ae5e-693e8ee66a6a")
    @Override
    public Object visitPin(Pin obj) {
        	return visitObjectNode(obj);
    }

    @objid ("fbbc61e6-263a-413b-94cd-76352f091ad7")
    @Override
    public Object visitSendSignalAction(SendSignalAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("1f3d1c77-70fc-4b65-8c3d-f0cf0031ceeb")
    @Override
    public Object visitStructuredActivityNode(StructuredActivityNode obj) {
        	return visitActivityAction(obj);
    }

    @objid ("71413b09-511a-416e-b710-c4a7b0f01082")
    @Override
    public Object visitValuePin(ValuePin obj) {
        	return visitInputPin(obj);
    }

    @objid ("c91c52aa-ab3d-4e83-8f82-f373ddab9133")
    @Override
    public Object visitBehavior(Behavior obj) {
        	return visitModelElement(obj);
    }

    @objid ("7ede599f-3f23-459a-badd-f7459d1c82b1")
    @Override
    public Object visitBehaviorParameter(BehaviorParameter obj) {
        	return visitParameter(obj);
    }

    @objid ("91075b79-179a-441b-973d-ce4dc04b8ecb")
    @Override
    public Object visitOpaqueBehavior(OpaqueBehavior obj) {
        	return visitBehavior(obj);
    }

    @objid ("6bb6aa31-8dbf-4b20-ac77-430bdfcbd37c")
    @Override
    public Object visitSignal(Signal obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("5fb70188-bd5b-43c1-ab63-0978953d1404")
    @Override
    public Object visitEvent(Event obj) {
        	return visitModelElement(obj);
    }

    @objid ("6bc6d8b3-887d-4800-b6c6-3cc53d3ce7f6")
    @Override
    public Object visitCombinedFragment(CombinedFragment obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("001929c8-3bbc-472c-a29e-1684bedd6766")
    @Override
    public Object visitDurationConstraint(DurationConstraint obj) {
        	return visitConstraint(obj);
    }

    @objid ("cd78ade4-8a96-4a67-996e-508198c931df")
    @Override
    public Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj) {
        	return visitMessageEnd(obj);
    }

    @objid ("92844507-6b37-4d99-b55d-37a533bb3907")
    @Override
    public Object visitExecutionSpecification(ExecutionSpecification obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("39ae8efd-6b98-4d68-93b0-eacb81ce9b07")
    @Override
    public Object visitGate(Gate obj) {
        	return visitMessageEnd(obj);
    }

    @objid ("d65c9880-7326-4f9c-8928-8bc89858a8ff")
    @Override
    public Object visitGeneralOrdering(GeneralOrdering obj) {
        	return visitElement(obj);
    }

    @objid ("e1f12692-275c-456c-aa81-ab2330e42d60")
    @Override
    public Object visitInteraction(Interaction obj) {
        	return visitBehavior(obj);
    }

    @objid ("0ed905ef-b216-44b9-8a27-3e46fe9bbcf1")
    @Override
    public Object visitInteractionFragment(InteractionFragment obj) {
        	return visitModelElement(obj);
    }

    @objid ("fcd3a9d7-6b2b-435a-a71c-310f5b727d5e")
    @Override
    public Object visitInteractionOperand(InteractionOperand obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("f8526d55-5496-4190-83e2-81dcf36df9de")
    @Override
    public Object visitInteractionUse(InteractionUse obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("9cbaf539-af53-43f5-a866-79e1e1ac9c58")
    @Override
    public Object visitLifeline(Lifeline obj) {
        	return visitModelElement(obj);
    }

    @objid ("46b6bc9f-a4ff-4980-897a-21f889a06ed8")
    @Override
    public Object visitMessage(Message obj) {
        	return visitModelElement(obj);
    }

    @objid ("141c5b01-751d-4006-9dc4-24429cb7bfc7")
    @Override
    public Object visitMessageEnd(MessageEnd obj) {
        	return visitOccurrenceSpecification(obj);
    }

    @objid ("690d18ba-a732-4a4d-a289-3574b5392475")
    @Override
    public Object visitOccurrenceSpecification(OccurrenceSpecification obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("0861c5d4-0eec-428b-9745-6df1d4b4d052")
    @Override
    public Object visitPartDecomposition(PartDecomposition obj) {
        	return visitInteractionUse(obj);
    }

    @objid ("611c7f17-d571-4a08-b496-33c13c9a8795")
    @Override
    public Object visitStateInvariant(StateInvariant obj) {
        	return visitOccurrenceSpecification(obj);
    }

    @objid ("b7be2804-471f-4cb8-a3a7-c454ef563246")
    @Override
    public Object visitTerminateSpecification(TerminateSpecification obj) {
        	return visitExecutionOccurenceSpecification(obj);
    }

    @objid ("86037fc5-b585-49f4-aa88-3cb7c4033033")
    @Override
    public Object visitAbstractPseudoState(AbstractPseudoState obj) {
        	return visitStateVertex(obj);
    }

    @objid ("c8265682-1acb-44b8-8f05-1bbbbed8302a")
    @Override
    public Object visitChoicePseudoState(ChoicePseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("b849d254-747d-4e5b-a1c2-5f989aa6af72")
    @Override
    public Object visitConnectionPointReference(ConnectionPointReference obj) {
        	return visitStateVertex(obj);
    }

    @objid ("a8afe734-e058-4166-a303-a91f4131dcde")
    @Override
    public Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("8fb89313-f6ca-493f-a741-555fc01bb43e")
    @Override
    public Object visitEntryPointPseudoState(EntryPointPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("0cd6c626-7539-4a01-bb42-8350ced0b14b")
    @Override
    public Object visitExitPointPseudoState(ExitPointPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("bf982cf8-01be-45b4-bb1a-3cdcd7b1ee00")
    @Override
    public Object visitForkPseudoState(ForkPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("4aa00bd9-b711-40e8-8890-f8b62438f80c")
    @Override
    public Object visitInitialPseudoState(InitialPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("0c0c8495-129c-4ab0-b32c-da12c89ee2ff")
    @Override
    public Object visitInternalTransition(InternalTransition obj) {
        	return visitTransition(obj);
    }

    @objid ("1f7d9f77-bca2-41d2-839f-59d8bbd5bd20")
    @Override
    public Object visitJoinPseudoState(JoinPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("9e4780de-d419-4371-81a7-1928f4758302")
    @Override
    public Object visitJunctionPseudoState(JunctionPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("e20fcdf9-33b3-43d3-bf86-54d9dbe1e9b7")
    @Override
    public Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("5630f789-4ea3-453b-8a49-f2bb26628db3")
    @Override
    public Object visitState(State obj) {
        	return visitStateVertex(obj);
    }

    @objid ("79be871c-9ddf-4820-98e5-5abca594f9a6")
    @Override
    public Object visitStateMachine(StateMachine obj) {
        	return visitBehavior(obj);
    }

    @objid ("08d262e7-e9a5-4be0-bea6-42077b7caf64")
    @Override
    public Object visitStateVertex(StateVertex obj) {
        	return visitModelElement(obj);
    }

    @objid ("a9383916-e44d-4c1c-a630-bde14b49426a")
    @Override
    public Object visitTerminatePseudoState(TerminatePseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("499ca394-6064-4d16-8cfd-cfd3f971f4d4")
    @Override
    public Object visitTransition(Transition obj) {
        	return visitModelElement(obj);
    }

    @objid ("5aab3029-b7d1-40c3-a036-db072e4a7628")
    @Override
    public Object visitFinalState(FinalState obj) {
        	return visitState(obj);
    }

    @objid ("5776a6b2-d650-4f06-a9c8-60b3494fb1b4")
    @Override
    public Object visitRegion(Region obj) {
        	return visitModelElement(obj);
    }

    @objid ("9c148829-062e-4fa9-8fd3-188a0bc6b261")
    @Override
    public Object visitActor(Actor obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("88745f4d-9648-438a-b975-2c47b1f96ebd")
    @Override
    public Object visitUseCase(UseCase obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("73599908-76b7-49c3-b042-cdc8150cc0dd")
    @Override
    public Object visitUseCaseDependency(UseCaseDependency obj) {
        	return visitModelElement(obj);
    }

    @objid ("17382fb6-78f1-4595-b77e-0e3816dd0e62")
    @Override
    public Object visitExtensionPoint(ExtensionPoint obj) {
        	return visitModelElement(obj);
    }

    @objid ("161a48ad-4e28-42d0-9eea-aece4b0967e7")
    @Override
    public Object visitAnalystItem(AnalystItem obj) {
        	return visitModelElement(obj);
    }

    @objid ("e8327a75-654a-486e-91aa-59bd3f707e67")
    @Override
    public Object visitAnalystElement(AnalystElement obj) {
        	return visitAnalystItem(obj);
    }

    @objid ("138dcf97-792d-47a8-be46-a69f1b18266f")
    @Override
    public Object visitAnalystContainer(AnalystContainer obj) {
        	return visitAnalystItem(obj);
    }

    @objid ("5cb8c0b9-7c56-4c00-ba44-cf94bdd911f0")
    @Override
    public Object visitAnalystProject(AnalystProject obj) {
        	return visitModelElement(obj);
    }

    @objid ("90fd8c42-4c44-4ac2-a363-8779c9d8d401")
    @Override
    public Object visitAnalystPropertyTable(AnalystPropertyTable obj) {
        	return visitTypedPropertyTable(obj);
    }

    @objid ("9c7b9f69-ca2f-4879-8c17-b7ebee743bb1")
    @Override
    public Object visitBusinessRule(BusinessRule obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("43a2a454-aac0-41e3-a922-b68b9eef4a3a")
    @Override
    public Object visitBusinessRuleContainer(BusinessRuleContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("64a72dc0-2d11-4451-b1dc-3cec0b46e042")
    @Override
    public Object visitDictionary(Dictionary obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("97ce170f-d267-43a0-a4b8-4ef8be551c35")
    @Override
    public Object visitGoal(Goal obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("e9b878ac-3db4-49c3-866c-296744651b73")
    @Override
    public Object visitGoalContainer(GoalContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("c8682c7e-0655-459d-b5ac-066dcb293727")
    @Override
    public Object visitPropertyContainer(PropertyContainer obj) {
        	return visitModelElement(obj);
    }

    @objid ("bfc1bd8d-0b92-4f30-a3ac-33396c051f4c")
    @Override
    public Object visitRequirement(Requirement obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("246fb089-939c-4150-8a68-dab74069cb5d")
    @Override
    public Object visitRequirementContainer(RequirementContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("2401ee96-12d6-447e-9370-58fdfab7aef7")
    @Override
    public Object visitTerm(Term obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("d66bb57a-e947-454c-a47e-73f3062282c7")
    @Override
    public Object visitGenericAnalystContainer(GenericAnalystContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("9eca13e0-751a-4426-95b8-5f08c5176deb")
    @Override
    public Object visitGenericAnalystElement(GenericAnalystElement obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("90a941f4-69ce-46a6-b6ea-5d2744e1df56")
    @Override
    public Object visitInformationFlow(InformationFlow obj) {
        	return visitModelElement(obj);
    }

    @objid ("269cee27-bbfe-42c9-b294-c35c6d5b9d20")
    @Override
    public Object visitInformationItem(InformationItem obj) {
        	return visitClassifier(obj);
    }

    @objid ("8e967f07-1616-4d3a-a988-49e3ad6cd80e")
    @Override
    public Object visitDataFlow(DataFlow obj) {
        	return visitModelElement(obj);
    }

    @objid ("1b76594f-cf52-4e02-bc31-d155858142f1")
    @Override
    public Object visitCommunicationInteraction(CommunicationInteraction obj) {
        	return visitBehavior(obj);
    }

    @objid ("045b097c-653c-4621-bf30-a8d61f5c5243")
    @Override
    public Object visitCommunicationNode(CommunicationNode obj) {
        	return visitModelElement(obj);
    }

    @objid ("16e23b54-fd12-48d3-9413-3445fe8ce322")
    @Override
    public Object visitCommunicationMessage(CommunicationMessage obj) {
        	return visitModelElement(obj);
    }

    @objid ("9a08cde7-1975-4d02-93e9-06e27d87b840")
    @Override
    public Object visitCommunicationChannel(CommunicationChannel obj) {
        	return visitModelElement(obj);
    }

    @objid ("75016bd3-a271-48a5-b531-aa1e8e944c2e")
    @Override
    public Object visitBpmnCollaboration(BpmnCollaboration obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("7d04dc00-5d1f-42b8-b93c-e6a2ee2875b5")
    @Override
    public Object visitBpmnLane(BpmnLane obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("b5f939a3-9a25-4118-aa19-6d25d1bfcff6")
    @Override
    public Object visitBpmnLaneSet(BpmnLaneSet obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("7ca666b9-331a-4bb8-bb49-defbd75b03eb")
    @Override
    public Object visitBpmnParticipant(BpmnParticipant obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("2ad816f2-2cf7-4577-a477-56d9349037b4")
    @Override
    public Object visitBpmnProcess(BpmnProcess obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("4ec42aa5-81bb-44ca-825a-d4075bb3972d")
    @Override
    public Object visitBpmnAssociation(BpmnAssociation obj) {
        	return visitBpmnArtifact(obj);
    }

    @objid ("6303924a-a752-439b-a37d-78904b3ab475")
    @Override
    public Object visitBpmnBaseElement(BpmnBaseElement obj) {
        	return visitModelElement(obj);
    }

    @objid ("7f02627d-a312-4299-8105-9b8b350f832e")
    @Override
    public Object visitBpmnArtifact(BpmnArtifact obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("f55bc417-2e40-4ad2-bf6c-c81fc9ae7807")
    @Override
    public Object visitBpmnFlowElement(BpmnFlowElement obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("bc81ee06-edc3-4f52-bf08-409e4db9bddb")
    @Override
    public Object visitBpmnFlowNode(BpmnFlowNode obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("1dcdae77-5b73-466a-9276-7ab7d8abd0b4")
    @Override
    public Object visitBpmnGroup(BpmnGroup obj) {
        	return visitBpmnArtifact(obj);
    }

    @objid ("7fc6ee24-6b16-4d5d-887e-e2df9990be63")
    @Override
    public Object visitBpmnRootElement(BpmnRootElement obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("fc6aa4df-cb13-4116-ba0a-ee297500b20c")
    @Override
    public Object visitBpmnBehavior(BpmnBehavior obj) {
        	return visitBehavior(obj);
    }

    @objid ("64351f79-1388-4f98-86ad-c87e6fc1affc")
    @Override
    public Object visitBpmnMessage(BpmnMessage obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("3c4eac48-b71a-494f-b5cd-8f14941c8fc0")
    @Override
    public Object visitBpmnMessageFlow(BpmnMessageFlow obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("4739af7f-96c6-471b-9a16-25973f257412")
    @Override
    public Object visitBpmnSequenceFlow(BpmnSequenceFlow obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("772b84d1-e86c-4941-b141-a167fbd57e73")
    @Override
    public Object visitBpmnActivity(BpmnActivity obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("d29f5f60-44ed-4eae-a373-e12c757c967a")
    @Override
    public Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj) {
        	return visitBpmnSubProcess(obj);
    }

    @objid ("610a89f7-3797-4b23-ba61-c0b1a9877711")
    @Override
    public Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("af11ba1d-43f8-4af6-8a63-d7d58729849a")
    @Override
    public Object visitBpmnCallActivity(BpmnCallActivity obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("6708e7d7-292c-410d-9bb0-dbbb46c5808e")
    @Override
    public Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("7f9d50ac-e4c6-40c8-8fdc-c1a1dd6e4563")
    @Override
    public Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("d1cb4229-6a71-4472-be55-13f49b1daa32")
    @Override
    public Object visitBpmnManualTask(BpmnManualTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("2db21960-bbad-4676-83c1-fb41f9407be3")
    @Override
    public Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj) {
        	return visitBpmnLoopCharacteristics(obj);
    }

    @objid ("b3820c83-01d1-4bbe-a514-315180329269")
    @Override
    public Object visitBpmnReceiveTask(BpmnReceiveTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("819aca59-b330-4ad7-9a9d-eb02c68e0c63")
    @Override
    public Object visitBpmnScriptTask(BpmnScriptTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("e21d806a-dfa6-4e02-9f84-f1d496a39e92")
    @Override
    public Object visitBpmnSendTask(BpmnSendTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("2fa56d99-3050-43df-a4d6-611751abafec")
    @Override
    public Object visitBpmnServiceTask(BpmnServiceTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("788f4668-379f-460f-a404-e1d27c08f1a2")
    @Override
    public Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj) {
        	return visitBpmnLoopCharacteristics(obj);
    }

    @objid ("885fe04f-e9f5-4d56-a299-ab8ddef5b1ec")
    @Override
    public Object visitBpmnSubProcess(BpmnSubProcess obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("c5be5079-45d0-4077-ab38-d965edb0ccaf")
    @Override
    public Object visitBpmnTask(BpmnTask obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("2da0edb3-73bf-4f61-b221-f396b5b73972")
    @Override
    public Object visitBpmnTransaction(BpmnTransaction obj) {
        	return visitBpmnSubProcess(obj);
    }

    @objid ("a6a1735c-9da2-4f52-b646-13710446fab8")
    @Override
    public Object visitBpmnUserTask(BpmnUserTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("06557f20-9662-4c1f-a0db-6bd9dcbdda6a")
    @Override
    public Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("ffd60124-3674-4bb2-a9f0-dec6ff37e5b4")
    @Override
    public Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("0128ec62-1803-4758-8048-79212e04277a")
    @Override
    public Object visitBpmnCatchEvent(BpmnCatchEvent obj) {
        	return visitBpmnEvent(obj);
    }

    @objid ("f26e3ade-da21-4a7c-8a9e-4bde70a0c395")
    @Override
    public Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("9805300c-229e-4fc6-b7b6-ed890b83dd30")
    @Override
    public Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("c5e76802-237f-4e11-8ffc-fde4dae40f1f")
    @Override
    public Object visitBpmnEndEvent(BpmnEndEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("0dd2b119-d80c-4e2e-a560-353a3639ea3f")
    @Override
    public Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("3b727527-b25d-4c2e-80d2-4a96000da740")
    @Override
    public Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("91be819c-9969-4bab-950c-746576440ef9")
    @Override
    public Object visitBpmnEvent(BpmnEvent obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("e9f70008-459b-42e6-9f04-7d28adc8ad50")
    @Override
    public Object visitBpmnEventDefinition(BpmnEventDefinition obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("8dadda3a-e7b3-4296-bfdf-b1cc8be9924b")
    @Override
    public Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("fb7d3a0c-dc60-4605-bb48-0e1cf2cc1ac5")
    @Override
    public Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("c6fef7cd-046a-4f7f-a798-4391700cdc84")
    @Override
    public Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("2787024c-0147-44e2-93d5-f261e7a6f467")
    @Override
    public Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("bc011d00-8214-4fdb-be58-61e21ec4dc20")
    @Override
    public Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("9f0a0927-d9c3-4163-b2cb-69e503b4863b")
    @Override
    public Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("0f830311-152e-46ac-a29d-e4b6c29a9aff")
    @Override
    public Object visitBpmnStartEvent(BpmnStartEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("9816d5c6-6c14-4788-b362-7b2ce8c64452")
    @Override
    public Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("36d6dd81-14c7-4f98-93e6-e7ff7ea31185")
    @Override
    public Object visitBpmnThrowEvent(BpmnThrowEvent obj) {
        	return visitBpmnEvent(obj);
    }

    @objid ("f5aba12a-1b24-4dd6-8405-4ce4275eb0f8")
    @Override
    public Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("8b8fdac4-72fb-45ad-8189-95694aaa40c1")
    @Override
    public Object visitBpmnComplexGateway(BpmnComplexGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("6177f09b-390f-43d8-afd8-c257c408575b")
    @Override
    public Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("31f414aa-07d6-4d46-bbf3-efc13529898e")
    @Override
    public Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("ab61cc9c-5512-4b48-9410-73ee05312b9c")
    @Override
    public Object visitBpmnGateway(BpmnGateway obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("ca847345-840a-4275-bbec-eb1de0a2c20f")
    @Override
    public Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("d18c95d7-4501-41d0-8b5a-55613bbffda3")
    @Override
    public Object visitBpmnParallelGateway(BpmnParallelGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("0c1d5195-9e95-456c-a2fc-f86d065a972c")
    @Override
    public Object visitBpmnDataObject(BpmnDataObject obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("cba68a4f-5866-4d50-86ac-5cbd5d855b7e")
    @Override
    public Object visitBpmnDataStore(BpmnDataStore obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("7c0e1d99-4e2e-46d5-a6e2-85a76d482acb")
    @Override
    public Object visitBpmnDataAssociation(BpmnDataAssociation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("dec71a43-a2c8-4c1d-ace4-e86e6e5d6e8c")
    @Override
    public Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("f0b1e866-a27d-4979-b98c-69d5ad2a893c")
    @Override
    public Object visitBpmnDataOutput(BpmnDataOutput obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("6fafec3c-a973-4b75-a8b0-ee69e6988c03")
    @Override
    public Object visitBpmnDataInput(BpmnDataInput obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("218e557f-2c76-42ec-a90e-e7e675a3c491")
    @Override
    public Object visitBpmnItemAwareElement(BpmnItemAwareElement obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("b857ebf3-3a7a-4932-a716-5407f369ba0e")
    @Override
    public Object visitBpmnItemDefinition(BpmnItemDefinition obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("abeb9e12-9253-45ae-a007-94a0799d011e")
    @Override
    public Object visitBpmnDataState(BpmnDataState obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("4c4899eb-ae7b-49bf-a795-4ae6c915a822")
    @Override
    public Object visitBpmnResource(BpmnResource obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("f287e22d-47b3-451b-a972-8be10fe79780")
    @Override
    public Object visitBpmnResourceParameter(BpmnResourceParameter obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("3b2dd1df-7120-4887-846b-9c7188d4b8b0")
    @Override
    public Object visitBpmnResourceRole(BpmnResourceRole obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("32ed9bbc-48e0-4caf-ab25-b0b1c00d5eab")
    @Override
    public Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("7802e346-592c-42de-9b13-4b27d8cc394d")
    @Override
    public Object visitBpmnOperation(BpmnOperation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("4f830353-3b62-4980-9ce2-daee3d8379ff")
    @Override
    public Object visitBpmnInterface(BpmnInterface obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("be784f5c-9527-42e8-a9be-071b9c05b11d")
    @Override
    public Object visitBpmnEndPoint(BpmnEndPoint obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("5d97c0f0-5736-41ea-a28d-cb1134bac5a0")
    @Override
    public Object visitAbstractDiagram(AbstractDiagram obj) {
        	return visitModelElement(obj);
    }

    @objid ("3a6711e5-0455-445b-99d7-48e66879c8bc")
    @Override
    public Object visitActivityDiagram(ActivityDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("e81a6ce4-e442-4fd5-a1fa-d23e10c42943")
    @Override
    public Object visitBehaviorDiagram(BehaviorDiagram obj) {
        	return visitAbstractDiagram(obj);
    }

    @objid ("74ea87ac-2353-48f6-9d5b-f04e3f466bd1")
    @Override
    public Object visitClassDiagram(ClassDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("0d55325a-5ecd-47d6-a875-adbd66b24aa2")
    @Override
    public Object visitCommunicationDiagram(CommunicationDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("dfbdbb02-a924-4b48-bb12-7ee955e62c11")
    @Override
    public Object visitDeploymentDiagram(DeploymentDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("9c5d72f8-e4f8-40bc-8f8a-fa8c287672a6")
    @Override
    public Object visitDiagramSet(DiagramSet obj) {
        	return visitModelElement(obj);
    }

    @objid ("e4563195-5ab5-419d-9711-631518775416")
    @Override
    public Object visitSequenceDiagram(SequenceDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("d8cc900c-3435-4e91-95fd-666f7fd453df")
    @Override
    public Object visitStateMachineDiagram(StateMachineDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("ff036857-81ae-4015-96c8-bfd2b072b05a")
    @Override
    public Object visitStaticDiagram(StaticDiagram obj) {
        	return visitAbstractDiagram(obj);
    }

    @objid ("a5476711-9d14-4bef-ae38-3c5ad9f8aa47")
    @Override
    public Object visitUseCaseDiagram(UseCaseDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("c363af2d-70c1-4dc0-963b-214c285ee18d")
    @Override
    public Object visitObjectDiagram(ObjectDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("7a6c5edd-be76-48a0-930d-058bf2b0a8a3")
    @Override
    public Object visitCompositeStructureDiagram(CompositeStructureDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("24b7f320-fa80-4d03-b7fe-617b190e5425")
    @Override
    public Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("05d7f495-6ee1-434e-9b57-9c6053027acf")
    @Override
    public Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("b96533ec-8095-4eeb-9a59-513bf3c6f92d")
    @Override
    public Object visitModuleParameter(ModuleParameter obj) {
        	return visitModelElement(obj);
    }

    @objid ("9d4366a0-54f2-429d-ae5f-6f7276159109")
    @Override
    public Object visitModuleComponent(ModuleComponent obj) {
        	return visitComponent(obj);
    }

    @objid ("462f5dbb-b236-461b-903b-08d790aaa9ca")
    @Override
    public Object visitProject(Project obj) {
        	return visitModelElement(obj);
    }

}
