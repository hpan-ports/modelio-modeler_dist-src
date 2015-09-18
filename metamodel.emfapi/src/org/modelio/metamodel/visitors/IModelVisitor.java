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
import org.modelio.vcore.smkernel.mapi.MVisitor;

@objid ("000a4862-4f2c-1032-829a-001ec947cd2a")
public interface IModelVisitor extends MVisitor {
    @objid ("b8ee741b-c510-4291-8e2a-36aed33d7447")
    Object visitAbstraction(Abstraction obj);

    @objid ("e7412e9f-46b4-4911-bd73-ad3714fa9682")
    Object visitConstraint(Constraint obj);

    @objid ("5bb61eae-7f51-4da6-9e86-61dc133639ce")
    Object visitDependency(Dependency obj);

    @objid ("2a4dd5d3-85bf-4ce0-a28f-7b5752817a09")
    Object visitElement(Element obj);

    @objid ("604c9f2f-c250-4d03-8556-e0ce185e0799")
    Object visitModelElement(ModelElement obj);

    @objid ("90a98569-5ee4-4d5d-80e2-0821b701ed7f")
    Object visitModelTree(ModelTree obj);

    @objid ("b5af7899-9c00-4eff-95da-08015b66dd2a")
    Object visitNote(Note obj);

    @objid ("000641e2-5161-4b82-a71f-e218d3ecb586")
    Object visitNoteType(NoteType obj);

    @objid ("576ce087-a9a3-424f-86ad-3ad0dd9c9841")
    Object visitProfile(Profile obj);

    @objid ("8874a4c7-4417-4ecb-a65a-5adb962c5b99")
    Object visitStereotype(Stereotype obj);

    @objid ("827f71dc-3477-415b-8ab2-4144647d0dbb")
    Object visitSubstitution(Substitution obj);

    @objid ("bc0a1884-a8ec-4e1d-b5ce-84113fe944a7")
    Object visitTagParameter(TagParameter obj);

    @objid ("01dbc7fd-dbe4-47bd-998f-645c81fd8f61")
    Object visitTagType(TagType obj);

    @objid ("326e4b2f-3aba-483b-a723-c761d18a4e3f")
    Object visitTaggedValue(TaggedValue obj);

    @objid ("63102f05-1fa2-4760-95ec-f499b2133c21")
    Object visitUsage(Usage obj);

    @objid ("45c27b1b-f916-4bea-9cf7-2eab84dbe908")
    Object visitMetaclassReference(MetaclassReference obj);

    @objid ("06c70a55-7e16-4af7-a2bd-7210e68706ed")
    Object visitExternDocument(ExternDocument obj);

    @objid ("63151f70-3df1-4a43-9520-2098c5c59170")
    Object visitExternDocumentType(ExternDocumentType obj);

    @objid ("d77e3178-98c9-409b-8f14-1fa2c5de1f6a")
    Object visitEnumeratedPropertyType(EnumeratedPropertyType obj);

    @objid ("92ec3a22-24c3-43eb-85db-0b63d954675e")
    Object visitLocalPropertyTable(LocalPropertyTable obj);

    @objid ("e0816813-7133-44d7-b622-33c987cdffe6")
    Object visitPropertyDefinition(PropertyDefinition obj);

    @objid ("0439197d-e9fd-4b0e-aff4-02a42a214886")
    Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj);

    @objid ("e954c2e1-fb7f-4b52-8c5b-d6807c11fced")
    Object visitPropertyTable(PropertyTable obj);

    @objid ("e3628f1d-ec95-406a-9750-2867e1e8840a")
    Object visitPropertyTableDefinition(PropertyTableDefinition obj);

    @objid ("60f03b5d-11b8-49a9-b538-870a1d5c5782")
    Object visitPropertyType(PropertyType obj);

    @objid ("b4668886-155f-40f5-b114-dc3e0a64a070")
    Object visitTypedPropertyTable(TypedPropertyTable obj);

    @objid ("1d57b0be-2705-4401-a8b1-c6b8e3bf5183")
    Object visitMatrixDefinition(MatrixDefinition obj);

    @objid ("94b01312-f71d-4c43-9abd-2a042a2df6c6")
    Object visitQueryDefinition(QueryDefinition obj);

    @objid ("450eb6b1-98d3-4edc-90dd-cb9e64dab137")
    Object visitMatrixValueDefinition(MatrixValueDefinition obj);

    @objid ("7f8640e2-eabb-4347-8224-b7a419db036f")
    Object visitExternProcessor(ExternProcessor obj);

    @objid ("737fba9d-3d7f-4040-b21a-9d659b5bf8dd")
    Object visitArtifact(Artifact obj);

    @objid ("b405b659-42bd-469f-a90f-a29be58e10ae")
    Object visitAssociation(Association obj);

    @objid ("e35d34e6-88e5-445e-81ec-17638b418b3a")
    Object visitAssociationEnd(AssociationEnd obj);

    @objid ("0331ed3d-4d2d-4ad6-a358-8904bf8efe5d")
    Object visitAttribute(Attribute obj);

    @objid ("d2bf696f-d440-429c-9a52-926f0c7eaa34")
    Object visitAttributeLink(AttributeLink obj);

    @objid ("07c0d686-1be7-4329-ba7c-5e3506198bb8")
    Object visitBehavioralFeature(BehavioralFeature obj);

    @objid ("5eda8c22-e904-48ba-a353-5f1d3bfa110c")
    Object visitBindableInstance(BindableInstance obj);

    @objid ("ccda3515-de65-42d6-8dc5-971048a4b314")
    Object visitBinding(Binding obj);

    @objid ("3851531c-5b56-401b-869a-b691e88200d4")
    Object visitClass(Class obj);

    @objid ("a09e1b2a-18d8-43d1-8394-31f17855065e")
    Object visitClassAssociation(ClassAssociation obj);

    @objid ("bc67819c-6774-43a3-bc0a-bc9306727bd4")
    Object visitClassifier(Classifier obj);

    @objid ("42d3f2a5-c970-4aed-a9b3-229357c028e9")
    Object visitCollaboration(Collaboration obj);

    @objid ("e097987a-3853-418a-9f55-d3a2def0b0a2")
    Object visitCollaborationUse(CollaborationUse obj);

    @objid ("ee09860e-16c4-4fd7-90a0-3f44dbf860ac")
    Object visitComponent(Component obj);

    @objid ("17617cf7-9510-4282-bbe3-b8f121ccbb6a")
    Object visitComponentRealization(ComponentRealization obj);

    @objid ("d91dd0e4-88c9-41e6-a156-430e29c15d6f")
    Object visitConnector(Connector obj);

    @objid ("468945d9-7039-41f3-90c5-248ad33e3055")
    Object visitConnectorEnd(ConnectorEnd obj);

    @objid ("f5e36aaf-71d4-4752-9000-34bed1a5e8ba")
    Object visitDataType(DataType obj);

    @objid ("2da3033e-6e49-45cb-b333-2fcd8185f714")
    Object visitElementImport(ElementImport obj);

    @objid ("296cdcdb-1c64-405a-a86d-c0cebc836315")
    Object visitElementRealization(ElementRealization obj);

    @objid ("4e2bfda1-0af9-442d-ae36-e8acb148a136")
    Object visitEnumeration(Enumeration obj);

    @objid ("da9d232a-78bb-451a-927b-e2ae7740ed5d")
    Object visitEnumerationLiteral(EnumerationLiteral obj);

    @objid ("1ed8df4f-7ba4-4f50-aa1d-718bb5dc4c77")
    Object visitFeature(Feature obj);

    @objid ("318f65a8-7a89-445b-bcdd-5d44a9d791db")
    Object visitGeneralClass(GeneralClass obj);

    @objid ("bb3908e5-255b-460a-852c-9c1e9c35565c")
    Object visitGeneralization(Generalization obj);

    @objid ("e2f0772e-c35f-4399-8255-3290af3b8f53")
    Object visitInstance(Instance obj);

    @objid ("cfb41a75-7cd7-4353-8ae4-7c440eedcc29")
    Object visitInterface(Interface obj);

    @objid ("b28ed0c4-d26a-4b18-8131-400a976801d6")
    Object visitInterfaceRealization(InterfaceRealization obj);

    @objid ("90771cea-9c3e-4cb2-80a6-4e9b842986a6")
    Object visitLink(Link obj);

    @objid ("463f7657-1fd8-45b2-be6a-66015d3825b6")
    Object visitLinkEnd(LinkEnd obj);

    @objid ("7660d380-82bb-49fd-aee3-69283c5064b9")
    Object visitManifestation(Manifestation obj);

    @objid ("494ee078-6b03-4922-802c-bfea742c863c")
    Object visitNameSpace(NameSpace obj);

    @objid ("be438af6-7636-45b7-9daf-4e8773bdd821")
    Object visitNamespaceUse(NamespaceUse obj);

    @objid ("96c6fd12-cd29-4888-8c9c-9d194e9ac17f")
    Object visitNaryAssociationEnd(NaryAssociationEnd obj);

    @objid ("73356d78-f071-4fe0-8351-6e321f4303f9")
    Object visitNaryAssociation(NaryAssociation obj);

    @objid ("6d41ee43-5312-4f63-a3f3-fe824ae3e4ec")
    Object visitNaryConnector(NaryConnector obj);

    @objid ("2188182a-809d-4f67-adf9-9c33f097f567")
    Object visitNaryConnectorEnd(NaryConnectorEnd obj);

    @objid ("ba8122e2-dfe1-44cf-9e34-40ecb7751fb7")
    Object visitNaryLink(NaryLink obj);

    @objid ("a074891a-7103-4bb5-9c49-e64569970fe2")
    Object visitNaryLinkEnd(NaryLinkEnd obj);

    @objid ("94701f5c-84c9-4135-8d80-aa9c69a6079c")
    Object visitNode(Node obj);

    @objid ("ef77fc27-2a61-44f9-bee8-dd58a6edba08")
    Object visitOperation(Operation obj);

    @objid ("d707d24a-04c4-47dc-933c-18bef9bf1136")
    Object visitPackage(Package obj);

    @objid ("8a9942bc-a433-4fcc-99fe-1de043246e0e")
    Object visitPackageImport(PackageImport obj);

    @objid ("ce40e4ec-2ede-4066-9c23-b917bd8512f9")
    Object visitPackageMerge(PackageMerge obj);

    @objid ("f3d40e99-7939-4450-bb8e-cc0c24f2cd38")
    Object visitParameter(Parameter obj);

    @objid ("1163664a-dcef-433e-9b20-e518e1f5cdea")
    Object visitPort(Port obj);

    @objid ("7b5cb13d-677a-42ef-8350-187a4027af96")
    Object visitProvidedInterface(ProvidedInterface obj);

    @objid ("d4553868-d2ac-49e0-a610-f96a5b95ae3d")
    Object visitRaisedException(RaisedException obj);

    @objid ("112bbe32-3424-41ae-9b85-c94876cde673")
    Object visitRequiredInterface(RequiredInterface obj);

    @objid ("91231c3c-061c-4868-9906-b2bb0189f9c2")
    Object visitStructuralFeature(StructuralFeature obj);

    @objid ("ae178d15-4337-4a84-9a68-f3f3bffbcb22")
    Object visitTemplateBinding(TemplateBinding obj);

    @objid ("4d75f08c-2c52-44c8-96ed-f344ee68a605")
    Object visitTemplateParameter(TemplateParameter obj);

    @objid ("2cb62900-d1fc-4872-b74a-e0e5ddbd6224")
    Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj);

    @objid ("781dc5ca-7b24-4e32-9fdc-02741e1e7808")
    Object visitAcceptCallEventAction(AcceptCallEventAction obj);

    @objid ("9e0880b6-d357-4d75-ad1f-a879779df07a")
    Object visitAcceptChangeEventAction(AcceptChangeEventAction obj);

    @objid ("131dae94-5217-450f-8057-1a6e8571822a")
    Object visitAcceptSignalAction(AcceptSignalAction obj);

    @objid ("1fe7700f-6d4a-494b-ba3e-90a83f610694")
    Object visitAcceptTimeEventAction(AcceptTimeEventAction obj);

    @objid ("dd5c28a7-164c-48f9-8263-4f227f12699f")
    Object visitActivity(Activity obj);

    @objid ("218442c6-144b-4d96-a1a4-0b3b4e5d9a08")
    Object visitActivityAction(ActivityAction obj);

    @objid ("7247e0e0-2456-4397-bb22-6941f3e6f3d7")
    Object visitActivityEdge(ActivityEdge obj);

    @objid ("a9985b99-d8ea-41f6-be7f-071ad7ea1e88")
    Object visitActivityFinalNode(ActivityFinalNode obj);

    @objid ("aa024e4f-7787-4b01-a2b9-0e4739716d41")
    Object visitActivityGroup(ActivityGroup obj);

    @objid ("c5f50780-ee1e-4fd1-b856-51b7293738c3")
    Object visitActivityNode(ActivityNode obj);

    @objid ("66ea709e-401e-49e7-b325-69c74876042a")
    Object visitActivityParameterNode(ActivityParameterNode obj);

    @objid ("760a8970-9b8a-4a6a-ad05-39fc910f612a")
    Object visitActivityPartition(ActivityPartition obj);

    @objid ("7bbfe975-799d-488e-a5d6-828755ca4562")
    Object visitCallAction(CallAction obj);

    @objid ("cf5efd71-1956-4194-9c66-c246e05d8896")
    Object visitCallBehaviorAction(CallBehaviorAction obj);

    @objid ("9bd18e14-e361-4b37-b45b-f893f4cd035d")
    Object visitCallOperationAction(CallOperationAction obj);

    @objid ("1e9a2e94-ecf9-407e-8fa9-a4cff2f2dabb")
    Object visitCentralBufferNode(CentralBufferNode obj);

    @objid ("da0de711-deda-4871-956b-01d36fdf96ba")
    Object visitClause(Clause obj);

    @objid ("4cefd3ec-a73c-44d0-945f-17ee7c49d909")
    Object visitConditionalNode(ConditionalNode obj);

    @objid ("10972ca3-a71c-4d59-b4a6-19ca9777eb38")
    Object visitControlFlow(ControlFlow obj);

    @objid ("8f40610f-da9d-48ce-9592-377f3142ccdf")
    Object visitControlNode(ControlNode obj);

    @objid ("f3d0ebb1-d2aa-4447-9a45-d06a6c128f37")
    Object visitDataStoreNode(DataStoreNode obj);

    @objid ("0a67cedc-862a-4531-9924-65eac8c7cb4a")
    Object visitDecisionMergeNode(DecisionMergeNode obj);

    @objid ("2228b0a8-04b4-4254-bd2d-08902cdad21c")
    Object visitExceptionHandler(ExceptionHandler obj);

    @objid ("9f3a7a29-daa9-4bf9-8862-c4f943fd7c4b")
    Object visitExpansionNode(ExpansionNode obj);

    @objid ("5a149e1b-101e-4c63-af86-a139f7203633")
    Object visitExpansionRegion(ExpansionRegion obj);

    @objid ("3f0d6a58-ae38-41a7-862b-37dace0b2c28")
    Object visitFinalNode(FinalNode obj);

    @objid ("11a94286-34f4-4453-ab84-019d0864f88e")
    Object visitFlowFinalNode(FlowFinalNode obj);

    @objid ("b5c04c12-47c9-473d-a707-4dab7e22a845")
    Object visitForkJoinNode(ForkJoinNode obj);

    @objid ("ae87cd35-6d9d-49d1-9a7a-3aa6f7d35969")
    Object visitInitialNode(InitialNode obj);

    @objid ("5a6a4337-5c8c-4ad1-b5ef-4a8347a60ab9")
    Object visitInputPin(InputPin obj);

    @objid ("0e0ad456-8a4b-4ebe-b788-714e9c1db8db")
    Object visitInstanceNode(InstanceNode obj);

    @objid ("3d40a40d-edee-475d-b381-ff0b8d546361")
    Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj);

    @objid ("dffb4ea9-8b57-4f9f-991b-abc2dcf4fd99")
    Object visitLoopNode(LoopNode obj);

    @objid ("651ce38f-4fab-4231-a142-05501728239c")
    Object visitMessageFlow(MessageFlow obj);

    @objid ("10f4e39e-d15f-4ad6-9721-45d439379a43")
    Object visitObjectFlow(ObjectFlow obj);

    @objid ("26b16a99-0826-4ac3-a7f1-e703b06a9bc9")
    Object visitObjectNode(ObjectNode obj);

    @objid ("c34f9c96-ee6a-4e16-b514-77eda857df79")
    Object visitOpaqueAction(OpaqueAction obj);

    @objid ("4f3a07f2-bd2e-437c-9b3f-54212e3d9838")
    Object visitOutputPin(OutputPin obj);

    @objid ("79142d0d-6b7e-426c-b42e-56e4c76bbab3")
    Object visitPin(Pin obj);

    @objid ("5174672a-2800-47b1-b4cc-49a0d9ff63e0")
    Object visitSendSignalAction(SendSignalAction obj);

    @objid ("75d23b93-7ed8-4b78-b0d9-eb91eb2e977c")
    Object visitStructuredActivityNode(StructuredActivityNode obj);

    @objid ("2d397831-fbb1-4a24-bee2-5f15a8571f60")
    Object visitValuePin(ValuePin obj);

    @objid ("d9fdff7e-3c11-4e60-919b-576fca58311c")
    Object visitBehavior(Behavior obj);

    @objid ("933bd5e9-83aa-4b40-968e-086acff317f7")
    Object visitBehaviorParameter(BehaviorParameter obj);

    @objid ("61b5da21-3769-458d-8864-a5ac25826e0e")
    Object visitOpaqueBehavior(OpaqueBehavior obj);

    @objid ("e1b00796-c215-42f1-96b8-f69461366ee8")
    Object visitSignal(Signal obj);

    @objid ("7259787f-1c61-49a9-8ae8-56f54e259427")
    Object visitEvent(Event obj);

    @objid ("51dac397-8de1-4600-a261-cba1f52db4d3")
    Object visitCombinedFragment(CombinedFragment obj);

    @objid ("3baced6e-a3a8-4aad-a769-0651f9cbd5c3")
    Object visitDurationConstraint(DurationConstraint obj);

    @objid ("f20e25cd-92d0-439e-b37d-46a715c022c4")
    Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj);

    @objid ("c99c260b-62c6-4e62-ba98-483611d9d391")
    Object visitExecutionSpecification(ExecutionSpecification obj);

    @objid ("994c7904-aa12-4bc0-b1c3-a11e1591379d")
    Object visitGate(Gate obj);

    @objid ("e7440306-3f44-49e4-8353-826913a3f799")
    Object visitGeneralOrdering(GeneralOrdering obj);

    @objid ("36509c9c-8c52-483a-834a-5d5c6664d0df")
    Object visitInteraction(Interaction obj);

    @objid ("48b71c3a-6366-44c1-aeed-99703d998098")
    Object visitInteractionFragment(InteractionFragment obj);

    @objid ("96631eb6-804a-44ac-9227-1cd831bf1c5e")
    Object visitInteractionOperand(InteractionOperand obj);

    @objid ("021cf73f-58a7-4222-b6d9-0fad22396ff1")
    Object visitInteractionUse(InteractionUse obj);

    @objid ("37f2fc5e-b19e-43ef-86be-75ae8b99512f")
    Object visitLifeline(Lifeline obj);

    @objid ("3ce3cde5-0276-406f-afd9-c378f7805fc5")
    Object visitMessage(Message obj);

    @objid ("7f3f67c2-6adb-41e4-ab6c-ce9bda5d9c7e")
    Object visitMessageEnd(MessageEnd obj);

    @objid ("dc1a4f8d-5bcd-4b91-9f83-421e4a51d8a9")
    Object visitOccurrenceSpecification(OccurrenceSpecification obj);

    @objid ("fe2ac4b5-6d18-470c-a29f-5f03bdf42ae6")
    Object visitPartDecomposition(PartDecomposition obj);

    @objid ("7d519472-dd1f-45f2-9d1c-50f526d4ea88")
    Object visitStateInvariant(StateInvariant obj);

    @objid ("4cc92d30-f5bc-4fe7-b6de-dd9ebb213f49")
    Object visitTerminateSpecification(TerminateSpecification obj);

    @objid ("e48071fb-6e1e-4f49-90f3-358ea7edba92")
    Object visitAbstractPseudoState(AbstractPseudoState obj);

    @objid ("00507750-586c-40cc-a806-5983ec7a443a")
    Object visitChoicePseudoState(ChoicePseudoState obj);

    @objid ("e837eb8a-0a91-4d38-a249-6cddeb33c8ea")
    Object visitConnectionPointReference(ConnectionPointReference obj);

    @objid ("8443b97b-f8ac-4c64-81b3-b8a79fa22ac3")
    Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj);

    @objid ("473b6b4e-761f-484c-ab79-9e4281cc82da")
    Object visitEntryPointPseudoState(EntryPointPseudoState obj);

    @objid ("816647ac-9bc9-4516-8e61-bc938e5ca326")
    Object visitExitPointPseudoState(ExitPointPseudoState obj);

    @objid ("150d5976-3f02-4946-a159-a256c95a67e9")
    Object visitForkPseudoState(ForkPseudoState obj);

    @objid ("33c837b0-be87-4b09-bbcf-ce602e588ac7")
    Object visitInitialPseudoState(InitialPseudoState obj);

    @objid ("b144d658-c014-436a-a9f4-f64a326e2240")
    Object visitInternalTransition(InternalTransition obj);

    @objid ("d2e9757c-f0bc-47de-b2a0-631ca7968947")
    Object visitJoinPseudoState(JoinPseudoState obj);

    @objid ("b32d5b33-6e9c-4802-a061-bcf92d4cfb26")
    Object visitJunctionPseudoState(JunctionPseudoState obj);

    @objid ("7fd8044f-30d7-4a43-bca4-f67eb757d730")
    Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj);

    @objid ("c797816b-e8c1-41ea-b607-8c1d8a0f377e")
    Object visitState(State obj);

    @objid ("28d5fb95-f93f-416d-aced-6c8a5fa2a603")
    Object visitStateMachine(StateMachine obj);

    @objid ("6a564674-8133-4cbf-8dfb-0033164142e5")
    Object visitStateVertex(StateVertex obj);

    @objid ("6606226a-82d0-44ce-8623-d06130c9a482")
    Object visitTerminatePseudoState(TerminatePseudoState obj);

    @objid ("c1009c78-39b1-49cd-8332-0dad6bedf281")
    Object visitTransition(Transition obj);

    @objid ("eaaecafe-2711-4bb8-8181-e18f67f4c7b1")
    Object visitFinalState(FinalState obj);

    @objid ("ae022212-bba9-4309-b050-8857ad241857")
    Object visitRegion(Region obj);

    @objid ("ddcfd483-59da-4830-b2b5-ea7844a9b6c0")
    Object visitActor(Actor obj);

    @objid ("5b868f64-37bc-407f-89a7-6993dedb4bb9")
    Object visitUseCase(UseCase obj);

    @objid ("c63461ab-2e25-483a-8955-d348ed0a9a09")
    Object visitUseCaseDependency(UseCaseDependency obj);

    @objid ("4aefc39c-ac52-41a7-ae23-5b45d7568e59")
    Object visitExtensionPoint(ExtensionPoint obj);

    @objid ("6030dc55-f1e2-406f-ac18-d722bf319332")
    Object visitAnalystItem(AnalystItem obj);

    @objid ("30e77ad9-2ae4-463f-b79f-0cc144ee1824")
    Object visitAnalystElement(AnalystElement obj);

    @objid ("8e7f62fe-021b-42fb-8946-b8117b211821")
    Object visitAnalystContainer(AnalystContainer obj);

    @objid ("c2b92a63-9629-4a7a-95d3-692da4f56b9d")
    Object visitAnalystProject(AnalystProject obj);

    @objid ("62c5cd64-e045-47b0-8dc8-90e289dceac5")
    Object visitAnalystPropertyTable(AnalystPropertyTable obj);

    @objid ("a07da479-17de-4761-bc73-96a6dc520298")
    Object visitBusinessRule(BusinessRule obj);

    @objid ("19f489c9-859a-4db5-8217-962cb37ec407")
    Object visitBusinessRuleContainer(BusinessRuleContainer obj);

    @objid ("95050fee-2b5f-4e8d-9d75-f8b3fad23511")
    Object visitDictionary(Dictionary obj);

    @objid ("2ef87f8e-4101-4bc8-be32-b2a937a03684")
    Object visitGoal(Goal obj);

    @objid ("966ccb0b-46ba-4233-b2a2-f0aafd7bb91e")
    Object visitGoalContainer(GoalContainer obj);

    @objid ("d758cfd9-be94-4947-a2be-fe3136e87552")
    Object visitPropertyContainer(PropertyContainer obj);

    @objid ("2b8a3fa5-8915-422a-9ff5-da4fb8b2609e")
    Object visitRequirement(Requirement obj);

    @objid ("7478f470-5376-4f28-8ede-64a1ecb6d6bd")
    Object visitRequirementContainer(RequirementContainer obj);

    @objid ("c2a7c6f8-5ade-4bc2-9f40-b0b1da485dde")
    Object visitTerm(Term obj);

    @objid ("dac700b8-0d95-4f28-8b74-ba84ea2ba762")
    Object visitGenericAnalystContainer(GenericAnalystContainer obj);

    @objid ("1ac34fec-37de-4dd6-a8ae-e67f04360304")
    Object visitGenericAnalystElement(GenericAnalystElement obj);

    @objid ("03fb893e-8813-4bf4-abd1-71718340b7cd")
    Object visitInformationFlow(InformationFlow obj);

    @objid ("36624f97-20fb-4f28-a1bd-e13916d1e9dc")
    Object visitInformationItem(InformationItem obj);

    @objid ("540fa822-2dc8-4dea-b059-5e562a3fe135")
    Object visitDataFlow(DataFlow obj);

    @objid ("8c769321-11d4-4aa2-b129-b87bd5812462")
    Object visitCommunicationInteraction(CommunicationInteraction obj);

    @objid ("3d84c45a-2b35-4e93-8f53-459a91bc9ec5")
    Object visitCommunicationNode(CommunicationNode obj);

    @objid ("e89f4d56-e4a3-4742-b75d-7f56cd54d5ec")
    Object visitCommunicationMessage(CommunicationMessage obj);

    @objid ("0d08fb10-762a-46fa-8c2c-5536bfeeb4ff")
    Object visitCommunicationChannel(CommunicationChannel obj);

    @objid ("53248bed-9b60-4fe3-ba31-69a495d91940")
    Object visitBpmnCollaboration(BpmnCollaboration obj);

    @objid ("a0791be5-59dc-4e91-b43d-c9b32b2643ef")
    Object visitBpmnLane(BpmnLane obj);

    @objid ("2766befc-c5fa-4b65-9304-e8e688f11f80")
    Object visitBpmnLaneSet(BpmnLaneSet obj);

    @objid ("32bd5329-d8da-4757-9708-91b89d31d291")
    Object visitBpmnParticipant(BpmnParticipant obj);

    @objid ("2dcc328e-35e6-4b88-97a2-e9e45ac2cf9e")
    Object visitBpmnProcess(BpmnProcess obj);

    @objid ("5921ae2e-79df-406c-ba14-6dee1bff95e8")
    Object visitBpmnAssociation(BpmnAssociation obj);

    @objid ("58ba9d8e-9469-4741-8e63-be6e3508f232")
    Object visitBpmnBaseElement(BpmnBaseElement obj);

    @objid ("22a083c2-6d1e-41e8-aba6-0eda33f9a18b")
    Object visitBpmnArtifact(BpmnArtifact obj);

    @objid ("4b82e87f-a589-47e5-a245-d6fe38beb41f")
    Object visitBpmnFlowElement(BpmnFlowElement obj);

    @objid ("52bc2dc8-b293-4939-900f-221222225c95")
    Object visitBpmnFlowNode(BpmnFlowNode obj);

    @objid ("a72392d8-8570-414e-b782-546b2c00e0a0")
    Object visitBpmnGroup(BpmnGroup obj);

    @objid ("1052a113-fd01-404a-b28b-392b0175ef9f")
    Object visitBpmnRootElement(BpmnRootElement obj);

    @objid ("7a0434a3-a86b-4223-848b-029ddb34105f")
    Object visitBpmnBehavior(BpmnBehavior obj);

    @objid ("b1cdea5a-ad08-4ee1-875a-692cc608ecd8")
    Object visitBpmnMessage(BpmnMessage obj);

    @objid ("30c1d381-1767-46c2-a397-02341d078d23")
    Object visitBpmnMessageFlow(BpmnMessageFlow obj);

    @objid ("9593623b-b17f-48b1-89f6-a6855508ac93")
    Object visitBpmnSequenceFlow(BpmnSequenceFlow obj);

    @objid ("3ccf2fb8-bfb4-4bde-b95e-92202975e32d")
    Object visitBpmnActivity(BpmnActivity obj);

    @objid ("f220d26c-b5de-495d-a66d-f7653b9ef4ae")
    Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj);

    @objid ("2c8d24f4-ec09-45f3-a0b9-9430f5bfcf81")
    Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj);

    @objid ("198c46a5-15f9-4a49-8286-6d3163b609dc")
    Object visitBpmnCallActivity(BpmnCallActivity obj);

    @objid ("0df930d5-fe00-45d4-9ecc-2e3e1b1a9dcc")
    Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj);

    @objid ("e98482dd-a0ea-4c15-9728-46e25e16ab37")
    Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj);

    @objid ("bbd4b94a-0625-48ae-934a-01819f4231d1")
    Object visitBpmnManualTask(BpmnManualTask obj);

    @objid ("1dcd16ef-b926-4bb7-9e61-cfdd5a76a262")
    Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj);

    @objid ("17277201-0228-4f77-ad8a-b180af86e6bf")
    Object visitBpmnReceiveTask(BpmnReceiveTask obj);

    @objid ("14323fb4-af77-410d-91af-c668d51cd0c3")
    Object visitBpmnScriptTask(BpmnScriptTask obj);

    @objid ("725c48df-3398-4381-b219-4393ce03c65e")
    Object visitBpmnSendTask(BpmnSendTask obj);

    @objid ("bb9db407-2415-4f29-a687-35ba0a1f2277")
    Object visitBpmnServiceTask(BpmnServiceTask obj);

    @objid ("ad5f6e75-1f32-4e4a-9b55-2998b6b0c61d")
    Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj);

    @objid ("4300145f-4537-4e93-b9f3-99d3b6fd72ed")
    Object visitBpmnSubProcess(BpmnSubProcess obj);

    @objid ("88217769-d8f7-4982-a473-4274663d5eab")
    Object visitBpmnTask(BpmnTask obj);

    @objid ("bd3364d5-a3bf-4db0-ba5c-d50a46b7522a")
    Object visitBpmnTransaction(BpmnTransaction obj);

    @objid ("03945ecd-4f63-4718-a08a-41f93b8d4e0a")
    Object visitBpmnUserTask(BpmnUserTask obj);

    @objid ("ac8e5ad6-e67a-4a8c-82ce-469887ba2908")
    Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj);

    @objid ("45713ba6-e9c8-4332-a82a-588601ed7e44")
    Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj);

    @objid ("e9a363d7-2714-47f3-97c0-26efae06bd80")
    Object visitBpmnCatchEvent(BpmnCatchEvent obj);

    @objid ("f7c6ad66-47fd-4a9a-91e5-bbf6ae5a6075")
    Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj);

    @objid ("68a92f2d-c613-422f-8dc6-a86cd1ecf86e")
    Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj);

    @objid ("87d716b4-d153-4ea7-939d-56a6d3d36f87")
    Object visitBpmnEndEvent(BpmnEndEvent obj);

    @objid ("01ec2f69-96de-428e-a00a-6f27e5b5eda0")
    Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj);

    @objid ("8371d8e3-f101-4f5e-a566-4f06876787d7")
    Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj);

    @objid ("a2d7fec7-b738-491a-95c5-5e9ada6d1636")
    Object visitBpmnEvent(BpmnEvent obj);

    @objid ("aae64436-0316-478f-99c6-c8f3c150b312")
    Object visitBpmnEventDefinition(BpmnEventDefinition obj);

    @objid ("1a9181ff-42a6-4726-9b4b-426426cc7c60")
    Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj);

    @objid ("a9eb4ed4-90b4-4686-9806-d50b9c46206b")
    Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj);

    @objid ("ef5e89cf-5890-41b4-9fab-9db266b4025d")
    Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj);

    @objid ("cedc9f12-930e-4adf-9077-2d12dcf6638d")
    Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj);

    @objid ("3b51cd5c-14e7-4cc1-a8be-527655fbfb2e")
    Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj);

    @objid ("6965c8e7-ab44-4971-9c04-87446621888a")
    Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj);

    @objid ("6b38c090-d204-4892-a1f1-37463b7ff3de")
    Object visitBpmnStartEvent(BpmnStartEvent obj);

    @objid ("4242fc4f-7f10-4bae-bfad-6c14e5c51052")
    Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj);

    @objid ("c5be5d8c-88e8-443f-b9b6-3ceeb215b809")
    Object visitBpmnThrowEvent(BpmnThrowEvent obj);

    @objid ("b184f837-d638-473a-b820-7f78bde7b2ac")
    Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj);

    @objid ("4fd1d7df-9817-4a29-83d1-ca669cdce66c")
    Object visitBpmnComplexGateway(BpmnComplexGateway obj);

    @objid ("ff6b9820-e60b-44f2-99e1-de3a2b63cf37")
    Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj);

    @objid ("5a42436d-bc54-48a0-9a2b-2494fe64edae")
    Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj);

    @objid ("8471cd2d-775b-41fd-954a-fa95a0c682d1")
    Object visitBpmnGateway(BpmnGateway obj);

    @objid ("ac7b0e28-5f09-4c8c-a0e5-5b023b960023")
    Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj);

    @objid ("75e19ef4-0c45-41d7-8d7e-faf4c9121f60")
    Object visitBpmnParallelGateway(BpmnParallelGateway obj);

    @objid ("a0b0f5d3-c138-4192-bafa-71277ab1ca24")
    Object visitBpmnDataObject(BpmnDataObject obj);

    @objid ("2083e9bf-9e09-477f-a9d9-f75799676ded")
    Object visitBpmnDataStore(BpmnDataStore obj);

    @objid ("12b9660d-94b0-4b5a-a123-eca8beebc269")
    Object visitBpmnDataAssociation(BpmnDataAssociation obj);

    @objid ("42bded20-9b90-4051-892a-ec2c30fb78d4")
    Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj);

    @objid ("49a69fb5-8cd7-43ed-a7e7-e9beba35edbe")
    Object visitBpmnDataOutput(BpmnDataOutput obj);

    @objid ("81606a69-f3ef-4903-9e26-a805ce09f8a3")
    Object visitBpmnDataInput(BpmnDataInput obj);

    @objid ("cc1c7e31-ff11-4c7c-94f9-99c57391cfbb")
    Object visitBpmnItemAwareElement(BpmnItemAwareElement obj);

    @objid ("c7937ab4-2c99-46f4-a335-b2c6defd7959")
    Object visitBpmnItemDefinition(BpmnItemDefinition obj);

    @objid ("50dfbdd1-8427-4aed-8400-038365924a89")
    Object visitBpmnDataState(BpmnDataState obj);

    @objid ("c9fea97f-8eaa-4a9b-8c8e-af2415271610")
    Object visitBpmnResource(BpmnResource obj);

    @objid ("138b5c94-f7e7-4efe-82e4-077b0246fc36")
    Object visitBpmnResourceParameter(BpmnResourceParameter obj);

    @objid ("b9e92601-a10c-4cd0-a10a-91c20d27b9ff")
    Object visitBpmnResourceRole(BpmnResourceRole obj);

    @objid ("f69f41f2-c6c2-4cea-bedf-13992ad1e093")
    Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj);

    @objid ("4f8a1f90-c6c6-4563-bb51-c9989251610c")
    Object visitBpmnOperation(BpmnOperation obj);

    @objid ("2d61db0f-7757-4d5a-b0f2-a86db8503bae")
    Object visitBpmnInterface(BpmnInterface obj);

    @objid ("91947f50-ca89-40d4-b597-d56e27f1ef2b")
    Object visitBpmnEndPoint(BpmnEndPoint obj);

    @objid ("9b5bd340-ff3a-4b08-9843-b88332b70386")
    Object visitAbstractDiagram(AbstractDiagram obj);

    @objid ("d26a17ef-b49a-485f-b1af-1da9fa2b2f61")
    Object visitActivityDiagram(ActivityDiagram obj);

    @objid ("505bff45-fbb4-41fe-a91c-f08e79394f0a")
    Object visitBehaviorDiagram(BehaviorDiagram obj);

    @objid ("9df9df8d-2887-40c7-a303-77affaaed0d7")
    Object visitClassDiagram(ClassDiagram obj);

    @objid ("ef965a45-4e17-486f-afc1-e7673d963102")
    Object visitCommunicationDiagram(CommunicationDiagram obj);

    @objid ("2d456ea9-1bdc-4ea1-9ea5-eb3ae14a09f7")
    Object visitDeploymentDiagram(DeploymentDiagram obj);

    @objid ("d311a268-60c3-47ae-a391-e43fee89ac85")
    Object visitDiagramSet(DiagramSet obj);

    @objid ("9756a10c-39f1-4dfb-bdc4-5939751b771e")
    Object visitSequenceDiagram(SequenceDiagram obj);

    @objid ("82a20d22-1ae2-46bf-97c1-1e156e642cde")
    Object visitStateMachineDiagram(StateMachineDiagram obj);

    @objid ("300d060c-d790-4a80-a61f-f1cb9e7070b7")
    Object visitStaticDiagram(StaticDiagram obj);

    @objid ("8988c192-7b5f-4e07-b22b-71555dcc1459")
    Object visitUseCaseDiagram(UseCaseDiagram obj);

    @objid ("b951af51-b4fa-4957-a873-9ca6db1c8140")
    Object visitObjectDiagram(ObjectDiagram obj);

    @objid ("d62a6ab0-1bee-42dc-a103-eb8e7b22fb89")
    Object visitCompositeStructureDiagram(CompositeStructureDiagram obj);

    @objid ("6db711e7-e0a3-4d60-a8ce-9ce50993ff8c")
    Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj);

    @objid ("f5163c6a-fe97-4ba4-b77c-eda37517b91b")
    Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj);

    @objid ("1b148aca-a0a9-497a-bdc3-0b283e8e6617")
    Object visitModuleParameter(ModuleParameter obj);

    @objid ("ff2a8e71-2ad9-4854-8608-819f1b3f02fc")
    Object visitModuleComponent(ModuleComponent obj);

    @objid ("af1d3758-e29d-4fb1-a6b9-336d6188f73d")
    Object visitProject(Project obj);

}
