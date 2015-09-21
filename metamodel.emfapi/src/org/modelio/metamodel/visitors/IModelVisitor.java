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
import org.modelio.metamodel.analyst.Risk;
import org.modelio.metamodel.analyst.RiskContainer;
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
import org.modelio.vcore.smkernel.mapi.MVisitor;

@objid ("000a4862-4f2c-1032-829a-001ec947cd2a")
public interface IModelVisitor extends MVisitor {
    @objid ("f6872a67-ab25-4655-958d-9c353d95639b")
    Object visitAbstractDiagram(AbstractDiagram obj);

    @objid ("607f3305-9236-48b7-81f3-8b4fa48894c2")
    Object visitAbstractPseudoState(AbstractPseudoState obj);

    @objid ("47539130-0405-40aa-b423-036eca222a04")
    Object visitAbstraction(Abstraction obj);

    @objid ("e1a46ead-16e9-429c-9498-d2baade69a36")
    Object visitAcceptCallEventAction(AcceptCallEventAction obj);

    @objid ("6268c4cc-b5f9-4f5f-85dd-059d7931f63e")
    Object visitAcceptChangeEventAction(AcceptChangeEventAction obj);

    @objid ("0d828087-5f29-4536-b1b4-997a0ee191e3")
    Object visitAcceptSignalAction(AcceptSignalAction obj);

    @objid ("ade93096-5817-4679-8296-7da436996181")
    Object visitAcceptTimeEventAction(AcceptTimeEventAction obj);

    @objid ("2538173b-9c59-424b-b2cc-5aa11a029f2c")
    Object visitActivity(Activity obj);

    @objid ("efbf4b5d-d68a-4bf9-8eb4-5e8676d995bd")
    Object visitActivityAction(ActivityAction obj);

    @objid ("22562e8d-0ea4-4585-a141-ba35ff44926a")
    Object visitActivityDiagram(ActivityDiagram obj);

    @objid ("f67bbc6e-4ed9-434a-b397-ff3923bc02df")
    Object visitActivityEdge(ActivityEdge obj);

    @objid ("78987f23-3a9a-405e-8ae3-c51e77112364")
    Object visitActivityFinalNode(ActivityFinalNode obj);

    @objid ("de1ef62c-cd5a-452d-a3a7-8cf41e733b23")
    Object visitActivityGroup(ActivityGroup obj);

    @objid ("e9b9f66d-506f-44fd-88cb-e851eb646694")
    Object visitActivityNode(ActivityNode obj);

    @objid ("95b766dd-af6d-488a-833a-93701fac088d")
    Object visitActivityParameterNode(ActivityParameterNode obj);

    @objid ("523ea1f0-55e3-4ae1-ada5-090ab70b703b")
    Object visitActivityPartition(ActivityPartition obj);

    @objid ("036e9a20-1c3f-4629-95e4-cddec8aea1d0")
    Object visitActor(Actor obj);

    @objid ("b321efaf-8606-4d54-8fcc-3af144ef5534")
    Object visitAnalystContainer(AnalystContainer obj);

    @objid ("8b0974e1-752e-490a-93c3-2d0e2c3fcb4b")
    Object visitAnalystElement(AnalystElement obj);

    @objid ("7117c3ac-4a5f-4cee-a9e4-c84842973f03")
    Object visitAnalystItem(AnalystItem obj);

    @objid ("641912f6-4226-4a46-8d5e-614f0400e82f")
    Object visitAnalystProject(AnalystProject obj);

    @objid ("d6848b72-5e11-436f-8fe1-ef966d424601")
    Object visitAnalystPropertyTable(AnalystPropertyTable obj);

    @objid ("1ed0a4dc-8122-40da-9fdb-67b62cf38c17")
    Object visitArtifact(Artifact obj);

    @objid ("c0878a45-b48e-41b6-aec2-74c9ccd86870")
    Object visitAssociation(Association obj);

    @objid ("27fb2211-c9a5-4ca2-a4d1-a824cee68bbf")
    Object visitAssociationEnd(AssociationEnd obj);

    @objid ("7894ec89-dcd5-45f0-8292-488419a023d2")
    Object visitAttribute(Attribute obj);

    @objid ("4a55b059-da11-4483-be78-6389f6c29e21")
    Object visitAttributeLink(AttributeLink obj);

    @objid ("06476d48-7f42-4aef-b656-a1608eae5b59")
    Object visitBehavior(Behavior obj);

    @objid ("d7b10064-d5a5-4a5f-bdef-db42999465a4")
    Object visitBehaviorDiagram(BehaviorDiagram obj);

    @objid ("a61f7058-2f95-4ec7-90c7-6dc0e16b3397")
    Object visitBehaviorParameter(BehaviorParameter obj);

    @objid ("9a293518-5ea6-4ff0-85d6-79b05af131d2")
    Object visitBehavioralFeature(BehavioralFeature obj);

    @objid ("947fde77-3e7c-457c-9ab5-a3ecc1c029c7")
    Object visitBindableInstance(BindableInstance obj);

    @objid ("5b465baf-a1db-4842-8395-98eda61d8c2c")
    Object visitBinding(Binding obj);

    @objid ("e0ba06b8-6a18-43b9-9e77-dad0be0f732b")
    Object visitBpmnActivity(BpmnActivity obj);

    @objid ("6366a87f-7dce-4743-97e1-42012d426edd")
    Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj);

    @objid ("2e3851f2-231a-4839-b711-3dafb4fcd8a5")
    Object visitBpmnArtifact(BpmnArtifact obj);

    @objid ("6b8c7bff-ac2b-442d-aa67-add6b4a52c2b")
    Object visitBpmnAssociation(BpmnAssociation obj);

    @objid ("316e5e43-f110-4840-846a-6e1823b32804")
    Object visitBpmnBaseElement(BpmnBaseElement obj);

    @objid ("7c1358af-1349-44f5-9094-d66c8b2c683e")
    Object visitBpmnBehavior(BpmnBehavior obj);

    @objid ("0f78d2d1-864c-4eeb-ac73-9a83ad203512")
    Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj);

    @objid ("d0d6b457-a61a-4d5e-910e-61416d099fd5")
    Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj);

    @objid ("0096199a-f9f6-4fcc-ad4e-8c130bc78416")
    Object visitBpmnCallActivity(BpmnCallActivity obj);

    @objid ("cc94ded8-9ca5-4da1-aeff-eb13ffb6ace9")
    Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj);

    @objid ("aeaed839-d684-425a-98f7-40b3c6a102e6")
    Object visitBpmnCatchEvent(BpmnCatchEvent obj);

    @objid ("7183b93a-bd06-45e0-833c-7cfa9157a770")
    Object visitBpmnCollaboration(BpmnCollaboration obj);

    @objid ("101da5dc-9ab7-4ef9-adb3-bb89401dd972")
    Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj);

    @objid ("01cfb4c3-d9dd-465a-9de1-de7c953e84d0")
    Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj);

    @objid ("f82875ed-5b27-44e2-ae74-39f222520d22")
    Object visitBpmnComplexGateway(BpmnComplexGateway obj);

    @objid ("c548d403-1ab1-4373-b645-130486d94548")
    Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj);

    @objid ("6829d85d-fb85-478f-9836-66ab220bb253")
    Object visitBpmnDataAssociation(BpmnDataAssociation obj);

    @objid ("0f4c5d69-3638-4e7e-b1c0-c3a03f10988e")
    Object visitBpmnDataInput(BpmnDataInput obj);

    @objid ("395ad9b5-b57c-4754-ae21-0a45c8408a17")
    Object visitBpmnDataObject(BpmnDataObject obj);

    @objid ("ec5e1dd0-c1bc-4ad3-84f4-d6eb58a3c915")
    Object visitBpmnDataOutput(BpmnDataOutput obj);

    @objid ("a27bcd3e-9935-4e34-ae60-75d648ce0a0e")
    Object visitBpmnDataState(BpmnDataState obj);

    @objid ("2038689a-3292-4935-b83c-a1d74ec56937")
    Object visitBpmnDataStore(BpmnDataStore obj);

    @objid ("16358ff6-9a84-4483-be6a-be7e34cc78d5")
    Object visitBpmnEndEvent(BpmnEndEvent obj);

    @objid ("00cf6db6-26f6-4997-bfc3-51ec29d7c222")
    Object visitBpmnEndPoint(BpmnEndPoint obj);

    @objid ("fe5b52c9-a9f5-40f0-9a3c-60b64b5c7f7b")
    Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj);

    @objid ("4ced7a8a-263d-4327-8c42-622f32056ce4")
    Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj);

    @objid ("cf309451-fedf-4162-a67d-d5c4cd63d1b3")
    Object visitBpmnEvent(BpmnEvent obj);

    @objid ("6b575a38-fffa-480f-afe0-ea7bef0336bd")
    Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj);

    @objid ("28d7385c-0aa3-46b0-9db6-079f6fdad19b")
    Object visitBpmnEventDefinition(BpmnEventDefinition obj);

    @objid ("d293b818-ba15-415a-8b12-1518aa3d365c")
    Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj);

    @objid ("24347c70-8fa2-44e0-8360-b6c63707d7ac")
    Object visitBpmnFlowElement(BpmnFlowElement obj);

    @objid ("d9fb93cc-9bd3-42a2-960b-17166f34f09d")
    Object visitBpmnFlowNode(BpmnFlowNode obj);

    @objid ("87c4eede-4c8c-40ae-b4dd-980ffd487288")
    Object visitBpmnGateway(BpmnGateway obj);

    @objid ("20fcdb5e-071f-45c7-9b25-dc53ab504606")
    Object visitBpmnGroup(BpmnGroup obj);

    @objid ("25354428-95b8-4ce1-9ace-9b131d8987b8")
    Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj);

    @objid ("829cb8d2-e004-4b54-a440-4cf1e30f8d4b")
    Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj);

    @objid ("14ae88c4-607c-464b-bda6-389c6c2ed026")
    Object visitBpmnInterface(BpmnInterface obj);

    @objid ("5c24f483-8633-4d51-bbd2-40b0a52854dd")
    Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj);

    @objid ("3cf409f3-070f-4e2e-9086-0a236de6b5e3")
    Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj);

    @objid ("6b44a4c5-d209-4782-8064-5020913e713f")
    Object visitBpmnItemAwareElement(BpmnItemAwareElement obj);

    @objid ("3196bec2-431e-4443-93c5-86b420eb4d9f")
    Object visitBpmnItemDefinition(BpmnItemDefinition obj);

    @objid ("3a1aac85-9c6a-4165-85d1-7830221179dc")
    Object visitBpmnLane(BpmnLane obj);

    @objid ("e919f402-9f88-4949-bb36-fdf52fdf4109")
    Object visitBpmnLaneSet(BpmnLaneSet obj);

    @objid ("bfe2d0aa-d090-42c9-9b10-bd5cca067a3b")
    Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj);

    @objid ("6349d2a9-6ac9-4843-a0d2-301cf6587265")
    Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj);

    @objid ("b9e58dfd-1ef3-4c25-ac56-6ec2001c69ac")
    Object visitBpmnManualTask(BpmnManualTask obj);

    @objid ("95cdc13d-ae6b-468f-bc44-5ad5dcf9a883")
    Object visitBpmnMessage(BpmnMessage obj);

    @objid ("bba0ff04-8d90-4408-a4fb-498b9f93080e")
    Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj);

    @objid ("8b98a9b6-90b4-4dcc-99c3-1e76ae8e5bca")
    Object visitBpmnMessageFlow(BpmnMessageFlow obj);

    @objid ("84cb2c36-5ba3-4727-94e4-9cf1251e4787")
    Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj);

    @objid ("d2b9c568-6888-4a2b-af0f-fa0d0f78f912")
    Object visitBpmnOperation(BpmnOperation obj);

    @objid ("dc394d8a-4f0d-4385-9773-4e332783b7f3")
    Object visitBpmnParallelGateway(BpmnParallelGateway obj);

    @objid ("eb44e374-f0b7-47de-b3a6-014c9ebcd92b")
    Object visitBpmnParticipant(BpmnParticipant obj);

    @objid ("70b16863-6de3-43ee-b0b6-b3d67c641df7")
    Object visitBpmnProcess(BpmnProcess obj);

    @objid ("570e775c-fb82-45aa-84f9-3aebc27311bc")
    Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj);

    @objid ("441ff07c-22c1-4400-8d1e-1df85ebd5f2b")
    Object visitBpmnReceiveTask(BpmnReceiveTask obj);

    @objid ("610866bc-e12a-4971-bbd9-6f0a7e7c849e")
    Object visitBpmnResource(BpmnResource obj);

    @objid ("57d7adc8-5c64-41eb-9644-98bfa46fb95f")
    Object visitBpmnResourceParameter(BpmnResourceParameter obj);

    @objid ("379069e5-2408-4732-b3f0-83c0158acfba")
    Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj);

    @objid ("55e15d29-704b-43b0-8519-6a0ea967e8d7")
    Object visitBpmnResourceRole(BpmnResourceRole obj);

    @objid ("5144b1d3-52ee-4ad9-97d2-f5f2f3b3fb17")
    Object visitBpmnRootElement(BpmnRootElement obj);

    @objid ("67124ea6-0c1c-492f-8df9-a81f42333b22")
    Object visitBpmnScriptTask(BpmnScriptTask obj);

    @objid ("61a375c9-6ee8-4317-bf54-2a1ed7fcacd8")
    Object visitBpmnSendTask(BpmnSendTask obj);

    @objid ("a16c5430-75f7-4e66-ab28-c6cd8a1b3716")
    Object visitBpmnSequenceFlow(BpmnSequenceFlow obj);

    @objid ("3baf551b-9bde-4524-9f63-6c476b739736")
    Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj);

    @objid ("5946102d-a400-4343-9f4c-3cead63561fb")
    Object visitBpmnServiceTask(BpmnServiceTask obj);

    @objid ("4e1e7e13-1261-4a7f-a7c2-52531a59ff8c")
    Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj);

    @objid ("2412635d-f11c-4f55-a99c-74ea68ec397a")
    Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj);

    @objid ("ab5f6dab-b5f8-46b6-b4c7-06a95845eb29")
    Object visitBpmnStartEvent(BpmnStartEvent obj);

    @objid ("dd588b01-68da-4458-b892-0698d010cc30")
    Object visitBpmnSubProcess(BpmnSubProcess obj);

    @objid ("c186a9cf-48c5-4a1d-bcf1-f24109a6bb70")
    Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj);

    @objid ("e53147e5-82bf-4514-89ce-44061df1119c")
    Object visitBpmnTask(BpmnTask obj);

    @objid ("7e43aec8-7fdf-4167-82f7-1e7b26d013fc")
    Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj);

    @objid ("1086c342-55c9-4a60-bba4-d4eb52c369dd")
    Object visitBpmnThrowEvent(BpmnThrowEvent obj);

    @objid ("abdbee04-4172-4040-9b91-7bedead1b521")
    Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj);

    @objid ("b7f7ed96-7fdf-4bf6-b72e-12217fe1afc2")
    Object visitBpmnTransaction(BpmnTransaction obj);

    @objid ("9c63e439-a157-4505-8383-d3df4b72b74b")
    Object visitBpmnUserTask(BpmnUserTask obj);

    @objid ("8604b46b-3fd1-44c9-b3d6-f8b7a3f3d4e2")
    Object visitBusinessRule(BusinessRule obj);

    @objid ("805a3cdd-c4f8-4e1d-8e05-642fc0a7e9fd")
    Object visitBusinessRuleContainer(BusinessRuleContainer obj);

    @objid ("0b423c4d-9eea-4583-9955-6913800f1930")
    Object visitCallAction(CallAction obj);

    @objid ("8fd453b6-28bf-434f-aedf-3ddddb9060b8")
    Object visitCallBehaviorAction(CallBehaviorAction obj);

    @objid ("9388d54f-6892-46cd-8a81-e3e97e0b5af0")
    Object visitCallOperationAction(CallOperationAction obj);

    @objid ("f9967b67-d9dc-45c2-b673-65fc5dea7813")
    Object visitCentralBufferNode(CentralBufferNode obj);

    @objid ("7664eebf-a952-4c2d-9f22-37ecfb629881")
    Object visitChoicePseudoState(ChoicePseudoState obj);

    @objid ("a3594ada-6a9d-438c-8780-f9cd23aa9dd3")
    Object visitClass(Class obj);

    @objid ("e1916b89-641b-483b-b5cd-b046a85d58f5")
    Object visitClassAssociation(ClassAssociation obj);

    @objid ("fb7b35c0-5790-49f5-af4e-7981c9efbd55")
    Object visitClassDiagram(ClassDiagram obj);

    @objid ("197fb0e1-f12e-444a-8d7e-47a7b65e276f")
    Object visitClassifier(Classifier obj);

    @objid ("e63cbdfb-87ae-43ca-8791-36c704f4d692")
    Object visitClause(Clause obj);

    @objid ("157d57c8-916d-43ac-ad63-d4efd48ad7ee")
    Object visitCollaboration(Collaboration obj);

    @objid ("99c936c8-5e82-4522-8b8a-1c6854a78c9f")
    Object visitCollaborationUse(CollaborationUse obj);

    @objid ("8e76a601-5315-4e21-b5c2-43ce285853eb")
    Object visitCombinedFragment(CombinedFragment obj);

    @objid ("1014d258-cc02-44a3-acc4-bcf70169547c")
    Object visitCommunicationChannel(CommunicationChannel obj);

    @objid ("75dcae5b-6896-42c1-a8a0-9ea7ec7a9bd4")
    Object visitCommunicationDiagram(CommunicationDiagram obj);

    @objid ("68e36c61-3942-4048-96a8-68bba02db907")
    Object visitCommunicationInteraction(CommunicationInteraction obj);

    @objid ("a033a2d2-f699-43be-9dbc-0e107e5d317e")
    Object visitCommunicationMessage(CommunicationMessage obj);

    @objid ("749f1f41-fb88-4bb4-b054-9fdf7084ba4c")
    Object visitCommunicationNode(CommunicationNode obj);

    @objid ("d8bddf62-e2dd-4aeb-902b-0b2df6c2476d")
    Object visitComponent(Component obj);

    @objid ("0acefab5-5b88-4937-ad98-761151b43614")
    Object visitComponentRealization(ComponentRealization obj);

    @objid ("6ae9384f-0e4c-4128-b861-f8e19a2152c0")
    Object visitCompositeStructureDiagram(CompositeStructureDiagram obj);

    @objid ("9972bb11-fbd1-4322-a6db-4e114d2124b8")
    Object visitConditionalNode(ConditionalNode obj);

    @objid ("a8285afa-ef98-4a53-9f18-2de12d4f05ee")
    Object visitConnectionPointReference(ConnectionPointReference obj);

    @objid ("d0e0b470-4120-4769-97d2-1965c30d7e16")
    Object visitConnector(Connector obj);

    @objid ("87d89954-eca4-4e98-8593-ec23f1ba1890")
    Object visitConnectorEnd(ConnectorEnd obj);

    @objid ("4a5e8500-7d51-4438-85d6-67094b7349a4")
    Object visitConstraint(Constraint obj);

    @objid ("c5bfb79c-8982-4ff7-b189-b9c82ca7c75c")
    Object visitControlFlow(ControlFlow obj);

    @objid ("57b7469f-9359-4574-84c6-73a19a4f9a77")
    Object visitControlNode(ControlNode obj);

    @objid ("8f9b348a-a7cd-4065-8cd1-8c458e5020e3")
    Object visitDataFlow(DataFlow obj);

    @objid ("ae5451ad-825f-4afb-92f4-beb670ac76f5")
    Object visitDataStoreNode(DataStoreNode obj);

    @objid ("6cc9a9bd-bceb-442d-b0a0-96813c9f2101")
    Object visitDataType(DataType obj);

    @objid ("770439b8-00e7-403d-a4fd-376da11a9bbf")
    Object visitDecisionMergeNode(DecisionMergeNode obj);

    @objid ("4de61bb0-6e03-455d-9792-0dbe9361c3c3")
    Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj);

    @objid ("b476638b-067f-4e47-bc82-638d89998e40")
    Object visitDependency(Dependency obj);

    @objid ("8530aedf-589f-43b4-83d3-f1ad6161c77c")
    Object visitDeploymentDiagram(DeploymentDiagram obj);

    @objid ("c8373e5e-ae95-42f5-81c7-6f60627b676c")
    Object visitDiagramSet(DiagramSet obj);

    @objid ("13b51c76-a91d-4609-ac16-ef1f32d5c72a")
    Object visitDictionary(Dictionary obj);

    @objid ("bb23e5f0-00f9-4070-9252-c049764b6cea")
    Object visitDurationConstraint(DurationConstraint obj);

    @objid ("218415b4-c06b-47e9-81f1-9bc54405c1cf")
    Object visitElement(Element obj);

    @objid ("f920463e-80c7-4bde-a7b1-4d906f07a57f")
    Object visitElementImport(ElementImport obj);

    @objid ("7537dcfc-6764-4e01-997a-2f11ecd9b2a1")
    Object visitElementRealization(ElementRealization obj);

    @objid ("61d5ef66-a046-4057-9836-93ce5b9a0cf2")
    Object visitEntryPointPseudoState(EntryPointPseudoState obj);

    @objid ("7d0d1343-36b6-4f7d-b5d0-501c8d006e1e")
    Object visitEnumeratedPropertyType(EnumeratedPropertyType obj);

    @objid ("27bfe9d8-61ae-406a-bdde-430525de41d2")
    Object visitEnumeration(Enumeration obj);

    @objid ("5b74ea3a-04d5-4e10-a4f6-3213a73d3918")
    Object visitEnumerationLiteral(EnumerationLiteral obj);

    @objid ("9106b0f7-fbc6-4aad-b894-4cfdb6c8236f")
    Object visitEvent(Event obj);

    @objid ("441fcb8d-db77-4940-ac86-73d757128058")
    Object visitExceptionHandler(ExceptionHandler obj);

    @objid ("5b4a583e-70c0-42a5-a212-222cc2a06c39")
    Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj);

    @objid ("aaeff1e9-3c4d-47b6-a2af-284dfa493d66")
    Object visitExecutionSpecification(ExecutionSpecification obj);

    @objid ("9145dc0c-6517-4044-90a1-0c98ff1f8468")
    Object visitExitPointPseudoState(ExitPointPseudoState obj);

    @objid ("85050015-bedf-4590-8540-328ed116e7c3")
    Object visitExpansionNode(ExpansionNode obj);

    @objid ("5c79b0e8-e822-4f38-b429-24648b495599")
    Object visitExpansionRegion(ExpansionRegion obj);

    @objid ("cc5f9d29-6100-4f29-ad01-2bcfd9769d1c")
    Object visitExtensionPoint(ExtensionPoint obj);

    @objid ("a2970886-382c-48a0-8a2c-8d33c1e61899")
    Object visitExternDocument(ExternDocument obj);

    @objid ("38a3aed9-6bf3-4681-bf08-9f62515d93f9")
    Object visitExternDocumentType(ExternDocumentType obj);

    @objid ("ff353e07-e3a6-4287-b5cf-e87160a747e0")
    Object visitExternProcessor(ExternProcessor obj);

    @objid ("49a4f9b4-f279-4d87-bb39-312399bc8b9d")
    Object visitFeature(Feature obj);

    @objid ("920e780e-cc6a-4f36-a4f0-48023974e855")
    Object visitFinalNode(FinalNode obj);

    @objid ("3806dede-c3a4-497f-93a3-56da1dbddba4")
    Object visitFinalState(FinalState obj);

    @objid ("e62c264c-c828-423e-a3fb-44738c24a1bf")
    Object visitFlowFinalNode(FlowFinalNode obj);

    @objid ("d21bf05f-3e4f-4a5a-a090-503291eca58d")
    Object visitForkJoinNode(ForkJoinNode obj);

    @objid ("3115fcbf-c12c-48d6-a779-15e3202311fa")
    Object visitForkPseudoState(ForkPseudoState obj);

    @objid ("ee3921da-d636-498c-bb83-7eec42574c4b")
    Object visitGate(Gate obj);

    @objid ("52ba9d31-b89e-4ff9-9b99-7ae4cfa29e0d")
    Object visitGeneralClass(GeneralClass obj);

    @objid ("3d6cbd95-ce74-4b80-8060-ae5a716dd0d3")
    Object visitGeneralOrdering(GeneralOrdering obj);

    @objid ("4568bc42-e59d-4322-a040-70b2c6552d35")
    Object visitGeneralization(Generalization obj);

    @objid ("495c9cc1-7a94-4302-ac50-9e08604f11cb")
    Object visitGenericAnalystContainer(GenericAnalystContainer obj);

    @objid ("ac0b18d1-16ec-4dba-9f80-b0c3f57c50e6")
    Object visitGenericAnalystElement(GenericAnalystElement obj);

    @objid ("25b52ffb-c09f-4932-ab8f-ab3823959772")
    Object visitGoal(Goal obj);

    @objid ("7897a9fd-d71a-43c7-95f6-e6a128dec5d0")
    Object visitGoalContainer(GoalContainer obj);

    @objid ("797db4a3-b78d-4be9-8741-51302793c63b")
    Object visitInformationFlow(InformationFlow obj);

    @objid ("e2b44258-af9e-441b-a08d-0c82a2580f24")
    Object visitInformationItem(InformationItem obj);

    @objid ("766e4c58-3fbb-4e70-bdf5-8a8b33ce08a5")
    Object visitInitialNode(InitialNode obj);

    @objid ("53a6ee05-303f-48cf-94e3-e9f28fbf95a4")
    Object visitInitialPseudoState(InitialPseudoState obj);

    @objid ("a7ef2775-4821-4910-af22-7cb95f873694")
    Object visitInputPin(InputPin obj);

    @objid ("b818ff5d-782c-4cdd-9045-c9be3945519c")
    Object visitInstance(Instance obj);

    @objid ("827a0cb0-d043-4c94-83fb-b2a5120e20c2")
    Object visitInstanceNode(InstanceNode obj);

    @objid ("0fc087d7-eb02-49ee-b11a-23349aada13c")
    Object visitInteraction(Interaction obj);

    @objid ("533dee1b-532d-4568-be47-05e919137bd7")
    Object visitInteractionFragment(InteractionFragment obj);

    @objid ("623bb7a0-32b1-4e5a-8ae3-3a8139c56e46")
    Object visitInteractionOperand(InteractionOperand obj);

    @objid ("59f9ed2c-6024-49e7-bb9d-cdbbcffb9f93")
    Object visitInteractionUse(InteractionUse obj);

    @objid ("20982900-76ba-4d7b-9966-01103393ff25")
    Object visitInterface(Interface obj);

    @objid ("8a67a242-f408-4f3d-b8f5-458c12a3008d")
    Object visitInterfaceRealization(InterfaceRealization obj);

    @objid ("f7e9b796-e541-4578-b229-0c0426a0d59c")
    Object visitInternalTransition(InternalTransition obj);

    @objid ("85e70670-51d7-4ac0-af58-e88634dced8c")
    Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj);

    @objid ("9866e5ab-5d0c-4131-9792-0ad4d8b2a4cd")
    Object visitJoinPseudoState(JoinPseudoState obj);

    @objid ("9e43d55d-60fd-47a1-9f35-a120a3402acb")
    Object visitJunctionPseudoState(JunctionPseudoState obj);

    @objid ("6fb84929-6f74-4b81-99f2-08fb31548c71")
    Object visitLifeline(Lifeline obj);

    @objid ("58ee78a2-c99a-4c90-8a0f-c9d85741206d")
    Object visitLink(Link obj);

    @objid ("824c2c5c-0c4f-474b-a8e2-d49ea4a8105b")
    Object visitLinkEnd(LinkEnd obj);

    @objid ("c1d1697a-1194-46fd-9c9e-44da72d01917")
    Object visitLocalPropertyTable(LocalPropertyTable obj);

    @objid ("0a1e69b1-76ec-4db3-8c63-65642b1c5896")
    Object visitLoopNode(LoopNode obj);

    @objid ("0efedbcd-c218-4924-8324-31a46eeb5a8b")
    Object visitManifestation(Manifestation obj);

    @objid ("50fb6a7b-e57c-4ef7-905c-a9b50ed9f7de")
    Object visitMatrixDefinition(MatrixDefinition obj);

    @objid ("29346e7b-4b8d-4290-9ee4-8b1fcdcd3406")
    Object visitMatrixValueDefinition(MatrixValueDefinition obj);

    @objid ("1aa1a078-69f1-419f-af0f-ed8f6e0821c6")
    Object visitMessage(Message obj);

    @objid ("e4fe27c3-7641-4008-9bf6-8243f67e574d")
    Object visitMessageEnd(MessageEnd obj);

    @objid ("660c31dd-a488-47c1-a381-fd0442e76b6b")
    Object visitMessageFlow(MessageFlow obj);

    @objid ("cf4d173f-1099-4783-9221-2bda0930b971")
    Object visitMetaclassReference(MetaclassReference obj);

    @objid ("4554f27c-d0fc-44e0-b122-b3f828871448")
    Object visitModelElement(ModelElement obj);

    @objid ("b25f35c3-1d32-4361-b03c-c4d9441b6093")
    Object visitModelTree(ModelTree obj);

    @objid ("998432dc-c56c-47b4-bcf6-6026e0b79145")
    Object visitModuleComponent(ModuleComponent obj);

    @objid ("26ad8178-46e3-4212-a576-f54f836d487e")
    Object visitModuleParameter(ModuleParameter obj);

    @objid ("9c9b25b7-bd3a-4235-8d36-0ac0d4cce6c6")
    Object visitNameSpace(NameSpace obj);

    @objid ("197a4af2-e553-4b55-b703-c7f634017bff")
    Object visitNamespaceUse(NamespaceUse obj);

    @objid ("b1c8a2b4-8b18-46b8-8d35-85c960c6ad0b")
    Object visitNaryAssociation(NaryAssociation obj);

    @objid ("93f085fa-dd48-49fc-ab3f-271ea4587165")
    Object visitNaryAssociationEnd(NaryAssociationEnd obj);

    @objid ("cab090f1-a00b-4799-b83b-f5f5287511ed")
    Object visitNaryConnector(NaryConnector obj);

    @objid ("f57830ee-1ebb-48f9-817f-a3a3b38adb3e")
    Object visitNaryConnectorEnd(NaryConnectorEnd obj);

    @objid ("943fe2c2-b8ad-4b30-910e-380ca0eb8e98")
    Object visitNaryLink(NaryLink obj);

    @objid ("aa32061d-fe61-4c7f-a3ac-682bbcd653ac")
    Object visitNaryLinkEnd(NaryLinkEnd obj);

    @objid ("af51b089-46e2-429d-8cf9-bb5daff4d5ae")
    Object visitNode(Node obj);

    @objid ("90d14185-ce2e-4687-9326-75921c6d3c15")
    Object visitNote(Note obj);

    @objid ("88d16b45-80fe-4f99-a73f-f712df8f6b16")
    Object visitNoteType(NoteType obj);

    @objid ("64e8dc5a-2059-4df3-bc5e-0675929d88fc")
    Object visitObjectDiagram(ObjectDiagram obj);

    @objid ("1d3d52ea-b369-47b8-8daa-705123f4d3e5")
    Object visitObjectFlow(ObjectFlow obj);

    @objid ("02e1008f-9e8e-4b7b-b83f-52e9128c9dc6")
    Object visitObjectNode(ObjectNode obj);

    @objid ("002507f4-b5fd-429e-80f3-9f5dea4d55d9")
    Object visitOccurrenceSpecification(OccurrenceSpecification obj);

    @objid ("cdedd105-97cd-4ce4-b501-91c46903e781")
    Object visitOpaqueAction(OpaqueAction obj);

    @objid ("3468e3e5-dc53-4ed3-ad31-4f79d39d627f")
    Object visitOpaqueBehavior(OpaqueBehavior obj);

    @objid ("91c050db-2006-467f-b487-346c3b41e5a4")
    Object visitOperation(Operation obj);

    @objid ("6fa5a826-2af4-4acc-b2f8-aa6c8c42b7c2")
    Object visitOutputPin(OutputPin obj);

    @objid ("46708feb-2a1f-4938-b4c0-2051d9552f69")
    Object visitPackage(Package obj);

    @objid ("6260d395-199e-4b33-aedd-31d9202c2df6")
    Object visitPackageImport(PackageImport obj);

    @objid ("d68eda8b-55b3-4f46-aa94-34fb540d0065")
    Object visitPackageMerge(PackageMerge obj);

    @objid ("62e9d14e-25bf-4337-a0c5-307da7515e9a")
    Object visitParameter(Parameter obj);

    @objid ("66ff0993-d5ed-450e-a8c5-cb1dde21a51f")
    Object visitPartDecomposition(PartDecomposition obj);

    @objid ("c1b29f34-943e-4f5f-9f63-7764d4f4fd91")
    Object visitPin(Pin obj);

    @objid ("1add8ff5-f8b3-4f84-b883-657b0f857bb8")
    Object visitPort(Port obj);

    @objid ("f0369b1d-4972-479f-81ae-bd5c6a618a6f")
    Object visitProfile(Profile obj);

    @objid ("0e8391b9-f48e-4d65-9081-35ca3967a53b")
    Object visitProject(Project obj);

    @objid ("e2610563-516a-4a3c-87fc-c2b6120333a3")
    Object visitPropertyContainer(PropertyContainer obj);

    @objid ("e3a94ff3-aee9-40b1-ba59-979ee3fdfded")
    Object visitPropertyDefinition(PropertyDefinition obj);

    @objid ("50f45bff-c2e3-440f-8cb5-17bb5e7a29e4")
    Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj);

    @objid ("67143ef8-bb8b-413a-8bc0-1ecdc60e84fa")
    Object visitPropertyTable(PropertyTable obj);

    @objid ("89ee132d-282e-4b90-a2d6-fb315e069f67")
    Object visitPropertyTableDefinition(PropertyTableDefinition obj);

    @objid ("4d79a3b7-ce17-4090-ae58-f4998f9b97b8")
    Object visitPropertyType(PropertyType obj);

    @objid ("998bfd6f-c12f-4dac-b792-2d0306a37876")
    Object visitProvidedInterface(ProvidedInterface obj);

    @objid ("c4bb3434-99d6-4255-96be-6327fd51ce94")
    Object visitQueryDefinition(QueryDefinition obj);

    @objid ("a5ef072c-03ea-4675-bb21-4b55f388c0b4")
    Object visitRaisedException(RaisedException obj);

    @objid ("2587ba6e-cb7c-46ec-82c8-77c6dc3b22d2")
    Object visitRegion(Region obj);

    @objid ("30e21ec2-862c-4983-89a8-96508f9bcd66")
    Object visitRequiredInterface(RequiredInterface obj);

    @objid ("e5c60546-eb44-4b2c-b0f3-5fbef5d085ce")
    Object visitRequirement(Requirement obj);

    @objid ("6528ed29-4ad7-4c00-bc41-e07683fc4732")
    Object visitRequirementContainer(RequirementContainer obj);

    @objid ("a597bf57-8faa-42e2-9781-23a4f2765c3f")
    Object visitRisk(Risk obj);

    @objid ("2a39e104-bd49-457c-b5d9-ae8f2f37a3d7")
    Object visitRiskContainer(RiskContainer obj);

    @objid ("59e0ba59-2291-45b4-9b11-ec61ee7386dd")
    Object visitSendSignalAction(SendSignalAction obj);

    @objid ("c8e70528-377d-41e5-a12b-05e1224f21ab")
    Object visitSequenceDiagram(SequenceDiagram obj);

    @objid ("b36091fa-7586-4790-a805-52c29891ec4f")
    Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj);

    @objid ("2a7a0490-6a34-4eea-ada1-dadf67e8aec1")
    Object visitSignal(Signal obj);

    @objid ("fac19d65-0d26-451d-b153-d2b524518d1a")
    Object visitState(State obj);

    @objid ("74df80ec-99c9-47a2-8b9a-b14a45b1451f")
    Object visitStateInvariant(StateInvariant obj);

    @objid ("73020d64-16de-462d-ae12-267f00215436")
    Object visitStateMachine(StateMachine obj);

    @objid ("027421bd-d06f-4c2f-9665-5f65cf243dc4")
    Object visitStateMachineDiagram(StateMachineDiagram obj);

    @objid ("3049930b-010d-479f-8380-5e8fb8ffdace")
    Object visitStateVertex(StateVertex obj);

    @objid ("6f1958b3-c812-4d1a-a3cd-9822d085f88c")
    Object visitStaticDiagram(StaticDiagram obj);

    @objid ("d58456fd-9ae1-4c64-8609-c92635795aea")
    Object visitStereotype(Stereotype obj);

    @objid ("60f0eb1e-c89f-4e2b-a933-f898276f561c")
    Object visitStructuralFeature(StructuralFeature obj);

    @objid ("c6969c64-c491-4082-9936-66c69088f5a8")
    Object visitStructuredActivityNode(StructuredActivityNode obj);

    @objid ("246c10ce-f131-44df-a972-06f7f6422c0b")
    Object visitSubstitution(Substitution obj);

    @objid ("006dc20b-fee5-473c-9a3b-b2f6e01afbc5")
    Object visitTagParameter(TagParameter obj);

    @objid ("ae38937a-44fe-48ed-b684-cb6ce29dad03")
    Object visitTagType(TagType obj);

    @objid ("f3480082-0fa5-4877-b8b6-8804d4f54607")
    Object visitTaggedValue(TaggedValue obj);

    @objid ("aab1c517-4fe2-4db6-a26c-3d412b7feeb7")
    Object visitTemplateBinding(TemplateBinding obj);

    @objid ("c7fc90fb-d774-46f6-b85a-e8f9eb41588f")
    Object visitTemplateParameter(TemplateParameter obj);

    @objid ("19ac486e-e8b7-49be-b3ac-a040116b2fda")
    Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj);

    @objid ("6ceaf17d-fb28-479a-8aa5-efa768ad6e3f")
    Object visitTerm(Term obj);

    @objid ("29daefb6-ef28-42ec-89a5-89e220c6686d")
    Object visitTerminatePseudoState(TerminatePseudoState obj);

    @objid ("9d26206b-4412-4d4e-b175-95375591db0b")
    Object visitTerminateSpecification(TerminateSpecification obj);

    @objid ("08f7d123-df89-4ad9-a774-ac551e8ed34b")
    Object visitTransition(Transition obj);

    @objid ("6f77c29c-5e84-4bbd-8774-a028a110f327")
    Object visitTypedPropertyTable(TypedPropertyTable obj);

    @objid ("20746e0e-210f-428a-b806-3384f9f58fb8")
    Object visitUsage(Usage obj);

    @objid ("e877fb34-c413-4654-836e-57f8a78459fe")
    Object visitUseCase(UseCase obj);

    @objid ("9874dbac-c41e-418b-b78e-0594b65381f0")
    Object visitUseCaseDependency(UseCaseDependency obj);

    @objid ("a791781e-696c-4898-a5f0-608bd07ca5eb")
    Object visitUseCaseDiagram(UseCaseDiagram obj);

    @objid ("4a1e90dd-af4d-4680-bccc-b003574b653f")
    Object visitValuePin(ValuePin obj);

}
