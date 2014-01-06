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
    @objid ("ede9a6ce-3d3a-4394-910f-186ec68c509e")
    Object visitAbstraction(Abstraction obj);

    @objid ("d628fae7-700a-4944-b221-681e412997f8")
    Object visitConstraint(Constraint obj);

    @objid ("124acf99-3ceb-40cb-b71c-2613daffb5ef")
    Object visitDependency(Dependency obj);

    @objid ("5b871610-5851-4c85-a1c6-69a5cc46d103")
    Object visitElement(Element obj);

    @objid ("2c12046d-89fb-4fab-9ee2-96f3d8ba5771")
    Object visitModelElement(ModelElement obj);

    @objid ("fad533ab-5579-400d-90a8-faa47a09f853")
    Object visitModelTree(ModelTree obj);

    @objid ("2821e0b2-7c2c-4d9e-8bb1-6e2cab3d780a")
    Object visitNote(Note obj);

    @objid ("076c68be-4576-4954-949e-c015cfa5b111")
    Object visitNoteType(NoteType obj);

    @objid ("63b2c97e-c6d1-4e74-a2a9-73bcf445b64f")
    Object visitProfile(Profile obj);

    @objid ("8209a4ee-fcdc-4ddf-b90d-0570ea88b991")
    Object visitStereotype(Stereotype obj);

    @objid ("c8cf6fbf-dc21-40df-8b94-8f8fada3cd7d")
    Object visitSubstitution(Substitution obj);

    @objid ("295e5803-dbe1-4373-afb3-55569e615a3b")
    Object visitTagParameter(TagParameter obj);

    @objid ("d459dd8b-e9b7-44f3-8d57-5afd20107369")
    Object visitTagType(TagType obj);

    @objid ("67714474-64d6-49c3-a6ef-53b9b5eeba6d")
    Object visitTaggedValue(TaggedValue obj);

    @objid ("315f3e52-0c60-4d42-b647-24ee01dee7ea")
    Object visitUsage(Usage obj);

    @objid ("9f7cbeb2-332b-4b30-b984-f2aa3643dbf3")
    Object visitMetaclassReference(MetaclassReference obj);

    @objid ("416c8086-dda8-4941-9679-f620414b93e4")
    Object visitExternDocument(ExternDocument obj);

    @objid ("0543b554-d227-4170-adfc-577fadd9a7d0")
    Object visitExternDocumentType(ExternDocumentType obj);

    @objid ("ea895b58-7890-4e30-9423-c42f7129b163")
    Object visitEnumeratedPropertyType(EnumeratedPropertyType obj);

    @objid ("e552a043-1f83-4ad3-8523-1372ba236299")
    Object visitLocalPropertyTable(LocalPropertyTable obj);

    @objid ("a6decb38-6382-4223-b5b0-e2699545a53e")
    Object visitPropertyDefinition(PropertyDefinition obj);

    @objid ("82aa082e-8e24-44fd-a24b-62434a73f879")
    Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj);

    @objid ("2e131288-37f6-48a1-8f54-88003705927a")
    Object visitPropertyTable(PropertyTable obj);

    @objid ("b50802c0-380f-4914-b93c-14beb2afcdf9")
    Object visitPropertyTableDefinition(PropertyTableDefinition obj);

    @objid ("874a8d67-cbb0-48b2-851b-3b8fc3e8e630")
    Object visitPropertyType(PropertyType obj);

    @objid ("9dc0f6e7-d549-425b-b2c9-fe543f4541f1")
    Object visitTypedPropertyTable(TypedPropertyTable obj);

    @objid ("11c7038b-e785-4d01-ae45-73649719443a")
    Object visitMatrixDefinition(MatrixDefinition obj);

    @objid ("426941d9-2d71-43e6-b967-3d81475ac675")
    Object visitQueryDefinition(QueryDefinition obj);

    @objid ("90578fce-37f0-457c-a957-4607a59769c7")
    Object visitMatrixValueDefinition(MatrixValueDefinition obj);

    @objid ("5e55ed85-06ba-48d0-a154-6ba7955adc79")
    Object visitExternProcessor(ExternProcessor obj);

    @objid ("c6751ce8-cd80-4dba-a43e-98da680fb88d")
    Object visitArtifact(Artifact obj);

    @objid ("5aa317a9-b0f3-45eb-9ce0-4433c6217b7e")
    Object visitAssociationEnd(AssociationEnd obj);

    @objid ("dfe66623-d63e-4ce8-b7f8-0c8bac8eb11c")
    Object visitAttribute(Attribute obj);

    @objid ("61e71229-045d-48e5-97cd-c7afa99badff")
    Object visitAttributeLink(AttributeLink obj);

    @objid ("c7370f00-950d-4d31-9cbd-b473b489f64d")
    Object visitBindableInstance(BindableInstance obj);

    @objid ("42536785-7f57-482a-a34a-8157a358fa94")
    Object visitBinding(Binding obj);

    @objid ("dbc53d9d-df1a-496d-853a-b8374892f94b")
    Object visitClass(Class obj);

    @objid ("a682ec2c-5528-4c66-a40b-ddc0aaa0b160")
    Object visitClassAssociation(ClassAssociation obj);

    @objid ("ac0c4800-e4ea-4022-83e6-cf19cfae087e")
    Object visitClassifier(Classifier obj);

    @objid ("a80b78de-8dc4-4ac3-9492-2e1e6d104bc2")
    Object visitCollaboration(Collaboration obj);

    @objid ("1a3f35d9-ff07-4653-839e-0f96b5064279")
    Object visitCollaborationUse(CollaborationUse obj);

    @objid ("cfe99fc4-b359-44ab-bae9-31da7f50a975")
    Object visitComponent(Component obj);

    @objid ("3a6a52e9-8f6e-4a16-a41b-bde60de0c7ec")
    Object visitNaryConnector(NaryConnector obj);

    @objid ("7662a761-74fd-4c51-8e9d-a3f74aad7c5d")
    Object visitConnectorEnd(ConnectorEnd obj);

    @objid ("b0b5ec76-2d2b-4731-8b46-35dbf863209d")
    Object visitDataType(DataType obj);

    @objid ("60c10335-eb88-4b45-8552-24374d06ee94")
    Object visitElementImport(ElementImport obj);

    @objid ("c88ba2ed-b74a-4bda-8f96-44e1fbca45d4")
    Object visitElementRealization(ElementRealization obj);

    @objid ("3ba933e6-b386-496c-9e4d-7ddbd5f4db59")
    Object visitEnumeration(Enumeration obj);

    @objid ("31391ed1-e319-43fe-b1fc-a185b38c6575")
    Object visitEnumerationLiteral(EnumerationLiteral obj);

    @objid ("05b3e194-8674-4f23-b270-734d91a7946f")
    Object visitFeature(Feature obj);

    @objid ("83acff73-713a-4c5d-abd8-dab87bf356f9")
    Object visitGeneralClass(GeneralClass obj);

    @objid ("4d554565-9ef2-4308-873f-94bd620d811b")
    Object visitGeneralization(Generalization obj);

    @objid ("a00f6062-1eb9-4d49-8539-cd6184f53c29")
    Object visitInstance(Instance obj);

    @objid ("93e8958c-ae68-4ed0-825d-4362a35c29cc")
    Object visitInterface(Interface obj);

    @objid ("a4431e24-e41e-4ac1-9ae5-4edf8f4fa8a3")
    Object visitInterfaceRealization(InterfaceRealization obj);

    @objid ("e53990ce-72ff-429d-8226-df930a48dc4d")
    Object visitLinkEnd(LinkEnd obj);

    @objid ("fc7e0534-3ef6-476e-8fd3-19d04111e64a")
    Object visitManifestation(Manifestation obj);

    @objid ("2e8765cf-c5f5-4bb7-9bb6-1f1bdb3ed615")
    Object visitNameSpace(NameSpace obj);

    @objid ("46b7da42-4060-442e-97e8-bae549d8e5f9")
    Object visitNamespaceUse(NamespaceUse obj);

    @objid ("e7f3ff5b-135c-4272-a254-0ec2189a0743")
    Object visitNode(Node obj);

    @objid ("c7dcd0ef-43fa-4f8a-804f-838a899c64fe")
    Object visitOperation(Operation obj);

    @objid ("d1692313-550a-4b38-8ec9-f04fe2a3a9d9")
    Object visitPackage(Package obj);

    @objid ("bac8bd58-3819-4c79-9213-d98fac4cd675")
    Object visitPackageImport(PackageImport obj);

    @objid ("facae6ac-3e68-4652-983b-3f15e1e8bf28")
    Object visitPackageMerge(PackageMerge obj);

    @objid ("27afe449-2115-4432-806a-6ae94f7627e9")
    Object visitParameter(Parameter obj);

    @objid ("cea5ed66-c690-4069-bfd5-379b3393ebb2")
    Object visitPort(Port obj);

    @objid ("30f2cc5b-15b6-4f5f-a890-fb01032a0a2d")
    Object visitProvidedInterface(ProvidedInterface obj);

    @objid ("7bbe3e39-d31a-4cca-912d-46782e9753ca")
    Object visitRaisedException(RaisedException obj);

    @objid ("944c21fa-9cbb-45dc-952b-a4290b76da83")
    Object visitRequiredInterface(RequiredInterface obj);

    @objid ("7b048792-b1f5-4cd2-9666-8524e7afb2d6")
    Object visitTemplateBinding(TemplateBinding obj);

    @objid ("094caa2b-54aa-41c6-835c-fa9d6b950c94")
    Object visitTemplateParameter(TemplateParameter obj);

    @objid ("db3b93df-b3db-4ddc-9a48-77b4e8bf8b07")
    Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj);

    @objid ("0e439c3f-1242-4b00-a007-a040660c171a")
    Object visitStructuralFeature(StructuralFeature obj);

    @objid ("4d5d9282-d5ce-443e-a816-1045fcf82d59")
    Object visitBehavioralFeature(BehavioralFeature obj);

    @objid ("9e3aad3a-ffef-4953-ad31-1d07e3445859")
    Object visitNaryAssociationEnd(NaryAssociationEnd obj);

    @objid ("49db9ad8-6094-440f-8921-4952469d9704")
    Object visitNaryAssociation(NaryAssociation obj);

    @objid ("d0e4443b-5817-47aa-9f0d-f4dd9209d97e")
    Object visitNaryLink(NaryLink obj);

    @objid ("17f65d92-a8c7-41ef-b53e-37d3eaa28601")
    Object visitNaryLinkEnd(NaryLinkEnd obj);

    @objid ("6c48f6d7-ab4a-46de-be0f-62c45dd1b21c")
    Object visitNaryConnectorEnd(NaryConnectorEnd obj);

    @objid ("d725c0a4-1869-4894-84e1-38cce63c7685")
    Object visitAssociation(Association obj);

    @objid ("df4c4c84-e40a-4146-9816-5c8da0defeef")
    Object visitLink(Link obj);

    @objid ("29515f0a-aad2-4fdf-9d8d-d7ae0925610a")
    Object visitConnector(Connector obj);

    @objid ("243bfc88-2ff5-4378-aefc-56b9ddb302ab")
    Object visitAcceptCallEventAction(AcceptCallEventAction obj);

    @objid ("75091f01-a6f5-4652-ae85-afe38d3777df")
    Object visitAcceptChangeEventAction(AcceptChangeEventAction obj);

    @objid ("59e24865-b2e0-4efa-a6e7-1cc084394f58")
    Object visitAcceptSignalAction(AcceptSignalAction obj);

    @objid ("db623e2f-27eb-480b-8ba1-3ff52c995ab8")
    Object visitAcceptTimeEventAction(AcceptTimeEventAction obj);

    @objid ("a39c8f55-cc96-4c51-a37b-d074a36c2df0")
    Object visitActivity(Activity obj);

    @objid ("07249108-8125-4384-bc7b-583601d48a72")
    Object visitActivityAction(ActivityAction obj);

    @objid ("804a1d3d-98fc-4334-8848-f0ad913dca18")
    Object visitActivityEdge(ActivityEdge obj);

    @objid ("338f7a6d-8626-4067-9791-254e4f3e882f")
    Object visitActivityFinalNode(ActivityFinalNode obj);

    @objid ("9f443e9d-3db6-4d5a-8112-dfc6e1ac12d7")
    Object visitActivityGroup(ActivityGroup obj);

    @objid ("3811ce52-81ae-4d19-86b8-cc129cfc181d")
    Object visitActivityNode(ActivityNode obj);

    @objid ("47b1e309-3d43-42e5-9bb8-6c1335874e38")
    Object visitActivityParameterNode(ActivityParameterNode obj);

    @objid ("aa1a7417-8692-4bdb-8ed6-508fb08740cd")
    Object visitActivityPartition(ActivityPartition obj);

    @objid ("5e3f3201-69e0-4cc7-abc7-d7faffbe65a8")
    Object visitCallAction(CallAction obj);

    @objid ("7062a9a8-da5d-457f-8a8a-a2a07d643f5b")
    Object visitCallBehaviorAction(CallBehaviorAction obj);

    @objid ("517e4216-132b-46fd-84ea-bcb00645a0cc")
    Object visitCallOperationAction(CallOperationAction obj);

    @objid ("ff8a05b4-1a25-4d1a-a701-9710baaa611b")
    Object visitCentralBufferNode(CentralBufferNode obj);

    @objid ("11a6384e-85f9-4be6-8dd7-6aec56e9ae2d")
    Object visitClause(Clause obj);

    @objid ("d4f44be9-94ef-48eb-ba46-fbfd9df68611")
    Object visitConditionalNode(ConditionalNode obj);

    @objid ("557cb8c0-b545-4729-9200-c7251638a78d")
    Object visitControlFlow(ControlFlow obj);

    @objid ("52012ba5-f8a2-415b-8784-faf08cdd1821")
    Object visitControlNode(ControlNode obj);

    @objid ("4cc3ba72-a382-4fda-9243-7f7a644395fd")
    Object visitDataStoreNode(DataStoreNode obj);

    @objid ("56fdd454-8805-4910-acec-3f2865ccdcc3")
    Object visitDecisionMergeNode(DecisionMergeNode obj);

    @objid ("0a53baeb-c6f5-484c-ac29-6c06f6e22f8d")
    Object visitExceptionHandler(ExceptionHandler obj);

    @objid ("b3f34a84-81fa-4ed1-beda-658525c57e77")
    Object visitExpansionNode(ExpansionNode obj);

    @objid ("3fe462a4-2a6a-4508-9b95-d326af57c551")
    Object visitExpansionRegion(ExpansionRegion obj);

    @objid ("2c507b35-f00d-488e-bf40-b34e87886038")
    Object visitFinalNode(FinalNode obj);

    @objid ("8762d1cf-1b57-45fb-a8a2-05830daf4630")
    Object visitFlowFinalNode(FlowFinalNode obj);

    @objid ("57d7c314-113e-4558-86f5-666deca492b2")
    Object visitForkJoinNode(ForkJoinNode obj);

    @objid ("5dcfe504-90a7-4821-9e4d-a7c3f10152ff")
    Object visitInitialNode(InitialNode obj);

    @objid ("76e1d01c-b0d5-48c1-a92b-24c52c95aca7")
    Object visitInputPin(InputPin obj);

    @objid ("1f1e73b0-eff9-46d0-8517-11ca54ad6976")
    Object visitInstanceNode(InstanceNode obj);

    @objid ("ba3508d1-ea18-48ce-817d-42a5cedf954b")
    Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj);

    @objid ("d4d3edad-434f-4767-9d02-b131a6e0dfe9")
    Object visitLoopNode(LoopNode obj);

    @objid ("18187a8f-538a-47d1-9043-49a51c10ef53")
    Object visitMessageFlow(MessageFlow obj);

    @objid ("99738a50-fd5d-45db-9677-62b47abc4eb9")
    Object visitObjectFlow(ObjectFlow obj);

    @objid ("4ce976d6-14c5-43b5-94d2-0b0565713497")
    Object visitObjectNode(ObjectNode obj);

    @objid ("6055f02f-5874-47b2-9a2e-4b9cdac4ee7c")
    Object visitOpaqueAction(OpaqueAction obj);

    @objid ("21baf70c-8760-4fee-ade7-dc1309f8e777")
    Object visitOutputPin(OutputPin obj);

    @objid ("0ab62a24-0c6a-40ee-9d1e-abe2f9f66852")
    Object visitPin(Pin obj);

    @objid ("2b7c9b9c-1647-4573-b1b7-ee635c9422ce")
    Object visitSendSignalAction(SendSignalAction obj);

    @objid ("ae1a3733-f547-4377-a272-b4e115a59e29")
    Object visitStructuredActivityNode(StructuredActivityNode obj);

    @objid ("ed329675-3f97-4d44-acc8-1a30677ad559")
    Object visitValuePin(ValuePin obj);

    @objid ("afb8becc-ad36-43e5-bbe2-cf00a7450ec3")
    Object visitBehavior(Behavior obj);

    @objid ("6f05345f-0081-44c4-8bda-a094ca5f0879")
    Object visitBehaviorParameter(BehaviorParameter obj);

    @objid ("d159cadb-404f-48cb-98df-158a437494c0")
    Object visitOpaqueBehavior(OpaqueBehavior obj);

    @objid ("f7e60677-ad7c-4e97-8124-a2b871ad8ef0")
    Object visitSignal(Signal obj);

    @objid ("05163be6-252a-415e-8f50-caa0f6d9e47e")
    Object visitEvent(Event obj);

    @objid ("88215f35-7bd3-41b7-b2e7-2ff745264d3e")
    Object visitCombinedFragment(CombinedFragment obj);

    @objid ("0efd9f10-d78e-4f1c-b83f-a38377f2326d")
    Object visitDurationConstraint(DurationConstraint obj);

    @objid ("5fb30626-4250-405b-a6ac-8de71a1ccb79")
    Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj);

    @objid ("867944d9-62fe-4fe1-a3e4-ec9d7fdd94f7")
    Object visitExecutionSpecification(ExecutionSpecification obj);

    @objid ("8336e540-7bd4-48ab-9d4c-9e9eef0b81be")
    Object visitGate(Gate obj);

    @objid ("4bef88d6-d83a-4125-bfd1-f946ee8a82fb")
    Object visitGeneralOrdering(GeneralOrdering obj);

    @objid ("e9d45378-d6a5-4707-b526-aecb3d3c68ab")
    Object visitInteraction(Interaction obj);

    @objid ("fab40157-1d8e-45ad-a98a-e9db2759c230")
    Object visitInteractionFragment(InteractionFragment obj);

    @objid ("2ffabd25-2a81-48d7-9b76-9cabea0c3146")
    Object visitInteractionOperand(InteractionOperand obj);

    @objid ("e522763b-0470-4b0c-a68f-988b8680fd67")
    Object visitInteractionUse(InteractionUse obj);

    @objid ("a5e4e197-d90c-496d-973a-c1b251277bfe")
    Object visitLifeline(Lifeline obj);

    @objid ("984adf2a-66c4-4f4d-9566-51f778dc991e")
    Object visitMessage(Message obj);

    @objid ("7db14a7f-f24a-4cec-88d0-bb0d32e8794b")
    Object visitMessageEnd(MessageEnd obj);

    @objid ("5e683458-5746-4c13-9e31-a918b8713746")
    Object visitOccurrenceSpecification(OccurrenceSpecification obj);

    @objid ("18498b61-22aa-4b7d-8a3e-4a3dec13984c")
    Object visitPartDecomposition(PartDecomposition obj);

    @objid ("22aef81c-1429-4125-b694-2d94356f9245")
    Object visitStateInvariant(StateInvariant obj);

    @objid ("afa8e6d9-6757-4173-8be9-ca21ee73973c")
    Object visitTerminateSpecification(TerminateSpecification obj);

    @objid ("726798fc-44b0-4b26-b2a9-3a9b5fb96da9")
    Object visitAbstractPseudoState(AbstractPseudoState obj);

    @objid ("8666b024-2260-4f30-9280-e5078bd8c568")
    Object visitChoicePseudoState(ChoicePseudoState obj);

    @objid ("fe5b52d7-724e-4e08-886d-f31c513bae24")
    Object visitConnectionPointReference(ConnectionPointReference obj);

    @objid ("da302099-f713-4810-9ca9-1a8dc7b8866c")
    Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj);

    @objid ("60faa809-ee34-4c0b-9282-6d79f496d252")
    Object visitEntryPointPseudoState(EntryPointPseudoState obj);

    @objid ("fe083b75-c653-4ec8-aa64-c35a69bb7e5a")
    Object visitExitPointPseudoState(ExitPointPseudoState obj);

    @objid ("5234f021-61db-4fb5-8ecf-30e353420e14")
    Object visitForkPseudoState(ForkPseudoState obj);

    @objid ("a36ce64e-e97a-4305-a1ca-eba8130bbe37")
    Object visitInitialPseudoState(InitialPseudoState obj);

    @objid ("bd8d278c-1a49-4e74-8665-1b83ba4f538f")
    Object visitInternalTransition(InternalTransition obj);

    @objid ("591e8693-63e5-4e84-a2a5-5587e4914002")
    Object visitJoinPseudoState(JoinPseudoState obj);

    @objid ("46058836-99e0-4e94-bba3-352b7a992c00")
    Object visitJunctionPseudoState(JunctionPseudoState obj);

    @objid ("ec20fdde-52da-4dc8-95e0-5a919c677654")
    Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj);

    @objid ("a147f930-94bd-45fb-bc12-f512e963e4d1")
    Object visitState(State obj);

    @objid ("353b3ba1-3508-40fd-b77a-3b5c688bfb0d")
    Object visitStateMachine(StateMachine obj);

    @objid ("e4e3d650-0b98-4935-8b33-0ac1f206f52a")
    Object visitStateVertex(StateVertex obj);

    @objid ("c8747892-d489-4c9c-be62-8ec48fe1b994")
    Object visitTerminatePseudoState(TerminatePseudoState obj);

    @objid ("580dc5c0-dae8-4f12-aed1-f35568dd1c28")
    Object visitTransition(Transition obj);

    @objid ("2c636074-1db5-41fd-9704-7d0d1c30ad57")
    Object visitFinalState(FinalState obj);

    @objid ("a8a19cbf-37a8-4cc2-9edc-811283a35cfa")
    Object visitRegion(Region obj);

    @objid ("a5f0f3e0-2e7c-4a4b-b835-d48d76d1fba1")
    Object visitActor(Actor obj);

    @objid ("d63007d4-b6ea-4c7a-89e4-02ddf29a53f6")
    Object visitUseCase(UseCase obj);

    @objid ("8717116d-14a6-49be-ac62-f47450ced7d6")
    Object visitUseCaseDependency(UseCaseDependency obj);

    @objid ("8e1c64d4-5341-4c22-8be5-bb27fe22ba4d")
    Object visitExtensionPoint(ExtensionPoint obj);

    @objid ("ba6accd1-6e9e-4458-ab37-f8f61cdb774f")
    Object visitAnalystItem(AnalystItem obj);

    @objid ("423dfd4e-8e10-44e0-961e-54d9eb1de0f2")
    Object visitAnalystElement(AnalystElement obj);

    @objid ("547a4858-98d2-4ee2-b40d-bf9f21a648d6")
    Object visitAnalystContainer(AnalystContainer obj);

    @objid ("baa5f059-2c38-4d50-b4ea-e282ca8cf089")
    Object visitAnalystProject(AnalystProject obj);

    @objid ("15464b4b-f86d-4146-bf04-df8f609d834a")
    Object visitAnalystPropertyTable(AnalystPropertyTable obj);

    @objid ("78161ae2-f34f-4faf-94a2-140f3929b960")
    Object visitBusinessRule(BusinessRule obj);

    @objid ("bc0ecc37-397b-437c-bb1e-fa4f8cad9d8d")
    Object visitBusinessRuleContainer(BusinessRuleContainer obj);

    @objid ("b9fa2b80-97cb-4c50-9821-343ff5ab713c")
    Object visitDictionary(Dictionary obj);

    @objid ("d5313ffe-4d9d-4ab2-9d78-f3e5b803657e")
    Object visitGoal(Goal obj);

    @objid ("7f5927e6-642a-4530-aa1f-45b56e902c23")
    Object visitGoalContainer(GoalContainer obj);

    @objid ("0099f813-120a-41ad-bb8e-be4722d9574c")
    Object visitPropertyContainer(PropertyContainer obj);

    @objid ("8878d229-4538-426a-8a61-69027d107c70")
    Object visitRequirement(Requirement obj);

    @objid ("2e48781d-1032-4483-a31f-031be967dc71")
    Object visitRequirementContainer(RequirementContainer obj);

    @objid ("4a03d2a6-411e-428c-9094-1ad55bfc1517")
    Object visitTerm(Term obj);

    @objid ("575cc2d6-39f9-4299-b525-4310b09eaee6")
    Object visitGenericAnalystContainer(GenericAnalystContainer obj);

    @objid ("f797a58a-cb29-4830-8bdb-69fc607aae77")
    Object visitGenericAnalystElement(GenericAnalystElement obj);

    @objid ("52f518bf-4d28-4571-b582-b929a11d809c")
    Object visitInformationFlow(InformationFlow obj);

    @objid ("85e22a59-e99a-41a0-821a-5578b5215561")
    Object visitInformationItem(InformationItem obj);

    @objid ("cb2dab5d-02df-41aa-b6e5-bc20ddfe35a7")
    Object visitDataFlow(DataFlow obj);

    @objid ("123b4586-22b0-4222-8566-a59304af130b")
    Object visitCommunicationInteraction(CommunicationInteraction obj);

    @objid ("2a714b6d-bb03-4e3c-9c1d-34535ea9a78d")
    Object visitCommunicationNode(CommunicationNode obj);

    @objid ("a12ebed9-22f8-45f1-bc95-70884b66a0b6")
    Object visitCommunicationMessage(CommunicationMessage obj);

    @objid ("a14f1486-701b-44ac-aa99-a22dbe0067e3")
    Object visitCommunicationChannel(CommunicationChannel obj);

    @objid ("45febd30-4db7-4d2b-820c-3e6e86691460")
    Object visitBpmnCollaboration(BpmnCollaboration obj);

    @objid ("4b9f580d-d241-40bb-aca8-e616d7449fa1")
    Object visitBpmnLane(BpmnLane obj);

    @objid ("68c2d8fc-9d2e-4bfb-95be-2abe6757399b")
    Object visitBpmnLaneSet(BpmnLaneSet obj);

    @objid ("63e9233f-45b0-4d3e-858f-ac036c03e23a")
    Object visitBpmnParticipant(BpmnParticipant obj);

    @objid ("883b0050-d2d7-4d99-a949-c0677dcfeb9b")
    Object visitBpmnProcess(BpmnProcess obj);

    @objid ("9df3b12e-3d1b-4ceb-8b56-7eb9963f4972")
    Object visitBpmnAssociation(BpmnAssociation obj);

    @objid ("a7aad94b-1f96-4f51-8406-09b9382a8a68")
    Object visitBpmnBaseElement(BpmnBaseElement obj);

    @objid ("3593dc1e-a791-43f1-9890-91ba0bb9ac98")
    Object visitBpmnArtifact(BpmnArtifact obj);

    @objid ("6b852d01-d25a-4358-a066-20ef8c08bba9")
    Object visitBpmnFlowElement(BpmnFlowElement obj);

    @objid ("506312cf-27bc-4f80-957b-09b0935157e9")
    Object visitBpmnFlowNode(BpmnFlowNode obj);

    @objid ("dcf6d6cf-4850-422d-bb80-f216a0ba1d24")
    Object visitBpmnGroup(BpmnGroup obj);

    @objid ("0d29d704-a4c5-4b74-8c44-205e13333b50")
    Object visitBpmnRootElement(BpmnRootElement obj);

    @objid ("12bec8e2-1df9-4ffa-b290-0d461a246803")
    Object visitBpmnBehavior(BpmnBehavior obj);

    @objid ("8b77dab0-0073-4041-bea4-0bf1672f999e")
    Object visitBpmnMessage(BpmnMessage obj);

    @objid ("86bd5ffa-8bbc-4ba4-9da4-fee5224c35ef")
    Object visitBpmnMessageFlow(BpmnMessageFlow obj);

    @objid ("e5a754f0-3df2-41e5-aa60-d5f40be3c85c")
    Object visitBpmnSequenceFlow(BpmnSequenceFlow obj);

    @objid ("720acf9d-7fe6-4b4d-89d4-cbe5dbe73105")
    Object visitBpmnActivity(BpmnActivity obj);

    @objid ("95562230-4a87-4446-8651-d53fa25f3ddb")
    Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj);

    @objid ("a32c4081-6ea3-406f-a5c6-16ca9a3d8fd7")
    Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj);

    @objid ("0983d1cd-c7b8-436b-9ffc-eaffcf23f67c")
    Object visitBpmnCallActivity(BpmnCallActivity obj);

    @objid ("fa4b0790-75a3-49ac-89af-0fcf4b8c5382")
    Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj);

    @objid ("8aa4279d-6eeb-4288-b681-54e52c002060")
    Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj);

    @objid ("70e35115-d149-499e-8a0d-93de885bbb55")
    Object visitBpmnManualTask(BpmnManualTask obj);

    @objid ("4c6bb4d7-1229-4032-9a93-dd47e6526335")
    Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj);

    @objid ("df9a3cca-28f2-4460-9627-5d3a1a373fd7")
    Object visitBpmnReceiveTask(BpmnReceiveTask obj);

    @objid ("fbf9a831-8176-4aa8-a6a1-c716dbab7aae")
    Object visitBpmnScriptTask(BpmnScriptTask obj);

    @objid ("ea0c83d7-87f5-453e-a858-ef87310f2fd2")
    Object visitBpmnSendTask(BpmnSendTask obj);

    @objid ("396d3cc3-1396-452c-be91-83f50544cb75")
    Object visitBpmnServiceTask(BpmnServiceTask obj);

    @objid ("ff7430ca-87e4-4dcc-a0a1-f7e38924fa35")
    Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj);

    @objid ("3576c6b7-e7df-4b3b-b730-75f3d1be4f32")
    Object visitBpmnSubProcess(BpmnSubProcess obj);

    @objid ("8990cc9d-91fe-4503-ae87-5e8bdc7b8f8a")
    Object visitBpmnTask(BpmnTask obj);

    @objid ("727b7f72-102a-481f-9ad7-f217eae7be76")
    Object visitBpmnTransaction(BpmnTransaction obj);

    @objid ("25869571-f7e8-4b85-9d59-72800b07265f")
    Object visitBpmnUserTask(BpmnUserTask obj);

    @objid ("f2abc8e8-0a53-4b80-8070-67ee7e21b8f6")
    Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj);

    @objid ("49572b69-2233-4e61-9cdd-0ac9e3857d5e")
    Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj);

    @objid ("17820d9e-ec83-47d5-a6b0-ba1f82874e6c")
    Object visitBpmnCatchEvent(BpmnCatchEvent obj);

    @objid ("f535e4b3-df7c-479c-a6d4-a21f39645844")
    Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj);

    @objid ("ae543cb9-c2c9-41de-b23c-2b55dde9421c")
    Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj);

    @objid ("20338d61-78eb-4fce-8db2-342ae77c392e")
    Object visitBpmnEndEvent(BpmnEndEvent obj);

    @objid ("74395215-2ef5-4fdf-b7c0-ed18c1cdcfdc")
    Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj);

    @objid ("0a6f5c5b-57f9-4373-8ce8-e25d0de200cc")
    Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj);

    @objid ("c91c6a95-0902-4b79-8838-a802359a57a3")
    Object visitBpmnEvent(BpmnEvent obj);

    @objid ("49c8c45b-f80d-4028-bf64-311a682a1a95")
    Object visitBpmnEventDefinition(BpmnEventDefinition obj);

    @objid ("3214d74f-cdd1-4ac3-ba59-119b1ff6b45e")
    Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj);

    @objid ("691f2c63-cc35-435e-a820-db527f2592af")
    Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj);

    @objid ("bbe19e98-b873-4bdf-b183-d4759fbf7978")
    Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj);

    @objid ("b3c8088b-0d7b-49d7-aa4c-942c39aa3886")
    Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj);

    @objid ("04139e8d-881e-477e-9c99-02646ba81066")
    Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj);

    @objid ("f5da1b45-9291-4b2a-af38-67617048a9a5")
    Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj);

    @objid ("66d4ecc0-3eaf-49bf-925b-ed8bb9e2ce55")
    Object visitBpmnStartEvent(BpmnStartEvent obj);

    @objid ("5d0bf586-6eb0-4da1-b0ac-086a84b5bac7")
    Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj);

    @objid ("82910af7-e34c-43be-ad71-b68e3e2a9792")
    Object visitBpmnThrowEvent(BpmnThrowEvent obj);

    @objid ("bef01a09-b353-47c1-9f88-ab08e2e15bec")
    Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj);

    @objid ("960a6134-d40f-4b8f-b20b-11c805a36ff8")
    Object visitBpmnComplexGateway(BpmnComplexGateway obj);

    @objid ("2fb48e48-d1fd-488d-9e1c-83131ce3af0f")
    Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj);

    @objid ("e1a02499-4680-426d-8781-1ef4b49a9687")
    Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj);

    @objid ("64116fb1-b75a-4f39-85ee-d7220807d6f1")
    Object visitBpmnGateway(BpmnGateway obj);

    @objid ("3a288dc6-431b-4cb5-b8e6-7e11008374f1")
    Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj);

    @objid ("7e470041-c6dc-4eca-ae3d-6e9d7dd17926")
    Object visitBpmnParallelGateway(BpmnParallelGateway obj);

    @objid ("07a3666c-33c9-436c-b566-33fc018a6edc")
    Object visitBpmnDataObject(BpmnDataObject obj);

    @objid ("3e45046d-2094-40a7-b7c8-5a3a5fad2907")
    Object visitBpmnDataStore(BpmnDataStore obj);

    @objid ("d4f05421-5a99-4994-91e0-3be438c19510")
    Object visitBpmnDataAssociation(BpmnDataAssociation obj);

    @objid ("523c70a8-5ea9-4bd2-8de6-9f19090031d6")
    Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj);

    @objid ("05d25dbd-6cd2-44a4-b84e-11b5d90673a5")
    Object visitBpmnDataOutput(BpmnDataOutput obj);

    @objid ("0b3f733c-dadd-45f4-a802-a011d9a8b754")
    Object visitBpmnDataInput(BpmnDataInput obj);

    @objid ("6aa7ff96-0fc5-4fa7-a92f-cba58f1af746")
    Object visitBpmnItemAwareElement(BpmnItemAwareElement obj);

    @objid ("a2f36994-2889-42d4-9c7a-a576313c7301")
    Object visitBpmnItemDefinition(BpmnItemDefinition obj);

    @objid ("a7e07366-25a6-4768-8d41-ffc9f1f1056c")
    Object visitBpmnDataState(BpmnDataState obj);

    @objid ("e90c68a3-d657-497a-9df1-90ac11781048")
    Object visitBpmnResource(BpmnResource obj);

    @objid ("8c5c90f4-23da-45fc-bb18-2528292f1d15")
    Object visitBpmnResourceParameter(BpmnResourceParameter obj);

    @objid ("dabadcc9-1d1e-4328-a872-0bb6ab3dc491")
    Object visitBpmnResourceRole(BpmnResourceRole obj);

    @objid ("5baeb06b-212f-43ba-bf36-d939d6473570")
    Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj);

    @objid ("f8515447-2319-44e6-939d-1c9da5026365")
    Object visitBpmnOperation(BpmnOperation obj);

    @objid ("896ecced-ad59-4944-a269-523ff4229da7")
    Object visitBpmnInterface(BpmnInterface obj);

    @objid ("a9cbd126-fb2b-441e-8b2a-622922e67031")
    Object visitBpmnEndPoint(BpmnEndPoint obj);

    @objid ("2dd8dc67-9aa3-4316-a4b5-45420aaf284d")
    Object visitAbstractDiagram(AbstractDiagram obj);

    @objid ("73a29d80-7dbb-442f-9464-411dfc6df58c")
    Object visitActivityDiagram(ActivityDiagram obj);

    @objid ("0dbf08e4-3fac-48e4-93fc-d0211c6eabb2")
    Object visitBehaviorDiagram(BehaviorDiagram obj);

    @objid ("0dfa6ad3-9e01-433d-ab41-c22e035ce5dd")
    Object visitClassDiagram(ClassDiagram obj);

    @objid ("5c61d1d0-ea58-4465-84c1-cf7d0be6640e")
    Object visitCommunicationDiagram(CommunicationDiagram obj);

    @objid ("dd83dbc2-b5c4-4789-b398-b1a234ef96de")
    Object visitDeploymentDiagram(DeploymentDiagram obj);

    @objid ("f435ec6d-92c3-4ee5-a590-f5ca5135826e")
    Object visitDiagramSet(DiagramSet obj);

    @objid ("03e44465-87e3-497a-8a34-0f15f858fba2")
    Object visitSequenceDiagram(SequenceDiagram obj);

    @objid ("757f1117-2603-4729-b745-9ebe750b34b5")
    Object visitStateMachineDiagram(StateMachineDiagram obj);

    @objid ("7733e52b-8acd-4b72-a85e-e80a0852a061")
    Object visitStaticDiagram(StaticDiagram obj);

    @objid ("601b719d-da93-4996-acd8-5fd95af98259")
    Object visitUseCaseDiagram(UseCaseDiagram obj);

    @objid ("520b0ad1-f101-4c07-a87e-bc688b09542a")
    Object visitObjectDiagram(ObjectDiagram obj);

    @objid ("cc0e7804-5b2c-4b5c-9641-b7cdcb7f1b0d")
    Object visitCompositeStructureDiagram(CompositeStructureDiagram obj);

    @objid ("efc6e0d9-d6fa-4ed5-ace2-4d66711c48fd")
    Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj);

    @objid ("809a1b9a-ed9a-47c3-bb73-0a56d99412ae")
    Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj);

    @objid ("120d2c58-2b59-4a99-aae9-d3b43dae8759")
    Object visitModuleParameter(ModuleParameter obj);

    @objid ("3322bf4a-d6bb-46dc-b8d5-7fd0e741ca3f")
    Object visitModuleComponent(ModuleComponent obj);

    @objid ("9b4ccec0-f753-44f5-ad12-f4d536aadcec")
    Object visitProject(Project obj);

}
