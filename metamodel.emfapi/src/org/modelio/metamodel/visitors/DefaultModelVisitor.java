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

@objid ("00280eec-4f2c-1032-829a-001ec947cd2a")
public class DefaultModelVisitor implements IModelVisitor {
    @objid ("6c125347-87d9-411e-bc96-2498eaef5e2a")
    @Override
    public Object visitAbstraction(Abstraction obj) {
        	return visitDependency(obj);
    }

    @objid ("bf84bfdc-f72a-4a60-8945-9404a05e20cc")
    @Override
    public Object visitConstraint(Constraint obj) {
        	return visitModelElement(obj);
    }

    @objid ("142c11e2-d66e-486d-9b99-6d2a3296752c")
    @Override
    public Object visitDependency(Dependency obj) {
        	return visitModelElement(obj);
    }

    @objid ("60a52aa2-57ae-401a-8262-cbf6cae4b1c7")
    @Override
    public Object visitElement(Element obj) {
        	return null;
    }

    @objid ("cfd2e65b-ab60-448b-bed1-bc6cc59264c8")
    @Override
    public Object visitModelElement(ModelElement obj) {
        	return visitElement(obj);
    }

    @objid ("ebe24f4a-12d1-42e5-aaf7-569a7d3c41d6")
    @Override
    public Object visitModelTree(ModelTree obj) {
        	return visitModelElement(obj);
    }

    @objid ("f283860a-2ab7-407c-abd9-eb7ac0f7b41d")
    @Override
    public Object visitNote(Note obj) {
        	return visitModelElement(obj);
    }

    @objid ("db49de7b-fbdf-411e-af80-b7e4e6ca40d7")
    @Override
    public Object visitNoteType(NoteType obj) {
        	return visitModelElement(obj);
    }

    @objid ("aae5537c-11a6-4837-b307-9bb563e45807")
    @Override
    public Object visitProfile(Profile obj) {
        	return visitPackage(obj);
    }

    @objid ("6da81e0e-7565-40d7-8402-74ac450ca13f")
    @Override
    public Object visitStereotype(Stereotype obj) {
        	return visitModelElement(obj);
    }

    @objid ("13832f34-78ac-4494-8a4e-34888672225c")
    @Override
    public Object visitSubstitution(Substitution obj) {
        	return visitModelElement(obj);
    }

    @objid ("f4c175b6-7d9a-4457-a50f-de9776f57496")
    @Override
    public Object visitTagParameter(TagParameter obj) {
        	return visitElement(obj);
    }

    @objid ("fe6cb3b5-d524-41f1-bff1-ac68d54f4fc7")
    @Override
    public Object visitTagType(TagType obj) {
        	return visitModelElement(obj);
    }

    @objid ("af574b13-f0b7-4e2f-9a12-ed326a96c8ff")
    @Override
    public Object visitTaggedValue(TaggedValue obj) {
        	return visitModelElement(obj);
    }

    @objid ("2cd76be1-912a-4bfa-9de4-94768e4f5973")
    @Override
    public Object visitUsage(Usage obj) {
        	return visitDependency(obj);
    }

    @objid ("3833e804-1309-4beb-a48f-aed2c8f7217a")
    @Override
    public Object visitMetaclassReference(MetaclassReference obj) {
        	return visitElement(obj);
    }

    @objid ("15885aa6-7c1f-43ec-aa4c-8025c692178e")
    @Override
    public Object visitExternDocument(ExternDocument obj) {
        	return visitModelElement(obj);
    }

    @objid ("1c68a2a0-eeea-4a76-bbf8-891172a87206")
    @Override
    public Object visitExternDocumentType(ExternDocumentType obj) {
        	return visitModelElement(obj);
    }

    @objid ("7cc5739f-7290-401c-a58a-3ba3f683e20c")
    @Override
    public Object visitEnumeratedPropertyType(EnumeratedPropertyType obj) {
        	return visitPropertyType(obj);
    }

    @objid ("c32b29d2-dfe4-42e7-b5e5-209a1346005c")
    @Override
    public Object visitLocalPropertyTable(LocalPropertyTable obj) {
        	return visitPropertyTable(obj);
    }

    @objid ("d657411a-1241-4409-8139-4108faeb70c6")
    @Override
    public Object visitPropertyDefinition(PropertyDefinition obj) {
        	return visitModelElement(obj);
    }

    @objid ("2c96a0a3-a8e2-4746-92e5-eb0a1a8190ca")
    @Override
    public Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj) {
        	return visitModelElement(obj);
    }

    @objid ("10dec99b-f421-46c4-8656-c5e45662f4dd")
    @Override
    public Object visitPropertyTable(PropertyTable obj) {
        	return visitElement(obj);
    }

    @objid ("48196e9c-36ff-4ce4-a05a-0de51ff7356a")
    @Override
    public Object visitPropertyTableDefinition(PropertyTableDefinition obj) {
        	return visitModelElement(obj);
    }

    @objid ("29db04a8-7568-48da-8125-5d1b90db2601")
    @Override
    public Object visitPropertyType(PropertyType obj) {
        	return visitModelElement(obj);
    }

    @objid ("451ec2ef-d600-442d-909b-62eb73c803a4")
    @Override
    public Object visitTypedPropertyTable(TypedPropertyTable obj) {
        	return visitPropertyTable(obj);
    }

    @objid ("e2b291f6-ca1c-4691-9572-aed3ef600d3c")
    @Override
    public Object visitMatrixDefinition(MatrixDefinition obj) {
        	return visitModelElement(obj);
    }

    @objid ("745f2780-7465-45ba-b9c3-54db77a118f9")
    @Override
    public Object visitQueryDefinition(QueryDefinition obj) {
        	return visitElement(obj);
    }

    @objid ("05dbfc5d-4190-4d90-81dc-eb8c8d216b8a")
    @Override
    public Object visitMatrixValueDefinition(MatrixValueDefinition obj) {
        	return visitElement(obj);
    }

    @objid ("7e583822-1106-4620-abef-59529802356f")
    @Override
    public Object visitExternProcessor(ExternProcessor obj) {
        	return visitModelElement(obj);
    }

    @objid ("e9a7c964-848c-4cad-a58d-52bdb0d409f9")
    @Override
    public Object visitArtifact(Artifact obj) {
        	return visitClassifier(obj);
    }

    @objid ("347156ce-c310-406e-bf07-c4e4583317aa")
    @Override
    public Object visitAssociationEnd(AssociationEnd obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("8db5247b-96aa-4def-9bd4-4ca221193a35")
    @Override
    public Object visitAttribute(Attribute obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("714c4878-e08c-4c08-8a66-13766c13500c")
    @Override
    public Object visitAttributeLink(AttributeLink obj) {
        	return visitModelElement(obj);
    }

    @objid ("411c487a-0519-49fd-8706-4896621f0e4a")
    @Override
    public Object visitBindableInstance(BindableInstance obj) {
        	return visitInstance(obj);
    }

    @objid ("5f45b0f9-31fe-4691-a769-fa47d331819a")
    @Override
    public Object visitBinding(Binding obj) {
        	return visitModelElement(obj);
    }

    @objid ("e406d87e-4070-476e-8f15-76c72b1711cb")
    @Override
    public Object visitClass(Class obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("0271d30d-b786-4bda-a4c4-1ec277226474")
    @Override
    public Object visitClassAssociation(ClassAssociation obj) {
        	return visitModelElement(obj);
    }

    @objid ("6ea175fc-6c50-464e-b967-f8c2466fb0db")
    @Override
    public Object visitClassifier(Classifier obj) {
        	return visitNameSpace(obj);
    }

    @objid ("4d52e0e6-60f8-4dc9-a0c5-94cc0c9e4692")
    @Override
    public Object visitCollaboration(Collaboration obj) {
        	return visitNameSpace(obj);
    }

    @objid ("b363cb03-c24b-43c2-830b-0f5fe2fb78fe")
    @Override
    public Object visitCollaborationUse(CollaborationUse obj) {
        	return visitModelElement(obj);
    }

    @objid ("817385cd-abe9-485f-94c2-e52a80be6f35")
    @Override
    public Object visitComponent(Component obj) {
        	return visitClass(obj);
    }

    @objid ("09e008c3-6951-4ede-a14f-336c76311deb")
    @Override
    public Object visitNaryConnector(NaryConnector obj) {
        	return visitNaryLink(obj);
    }

    @objid ("2161892b-6fca-4b1e-a1ef-20ec62416847")
    @Override
    public Object visitConnectorEnd(ConnectorEnd obj) {
        	return visitLinkEnd(obj);
    }

    @objid ("24fb8c3d-3b78-4eb4-8483-35fc70090eac")
    @Override
    public Object visitDataType(DataType obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("fad9f9c7-77a0-4dbe-a1ca-26438e98b585")
    @Override
    public Object visitElementImport(ElementImport obj) {
        	return visitModelElement(obj);
    }

    @objid ("73a531c9-b43e-47df-8342-dc705c1d6fd1")
    @Override
    public Object visitElementRealization(ElementRealization obj) {
        	return visitAbstraction(obj);
    }

    @objid ("fd618e6e-cd7e-404d-b101-b75a8f12d43c")
    @Override
    public Object visitEnumeration(Enumeration obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("d797284f-0bbc-4175-9450-fbfc31a5f6d5")
    @Override
    public Object visitEnumerationLiteral(EnumerationLiteral obj) {
        	return visitModelElement(obj);
    }

    @objid ("92a9921e-ae1b-4105-93b1-0cb80a471eb0")
    @Override
    public Object visitFeature(Feature obj) {
        	return visitModelElement(obj);
    }

    @objid ("d57dad03-95c7-45ce-a7ea-fe61273240c3")
    @Override
    public Object visitGeneralClass(GeneralClass obj) {
        	return visitClassifier(obj);
    }

    @objid ("e347a9bc-7dcd-44fc-9368-841a6ce1166e")
    @Override
    public Object visitGeneralization(Generalization obj) {
        	return visitModelElement(obj);
    }

    @objid ("1972a10c-ef07-4727-9de4-f19a758de0c2")
    @Override
    public Object visitInstance(Instance obj) {
        	return visitModelElement(obj);
    }

    @objid ("2aa92c1e-4d4b-4e72-9539-0695e3867189")
    @Override
    public Object visitInterface(Interface obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("3d3acc99-3b30-4be4-b02d-6c7c7c41f7a7")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization obj) {
        	return visitModelElement(obj);
    }

    @objid ("171186c9-8b16-4257-9c9d-f77b211986f1")
    @Override
    public Object visitLinkEnd(LinkEnd obj) {
        	return visitModelElement(obj);
    }

    @objid ("a38cb9d4-3506-4c78-a009-299ec7ea4051")
    @Override
    public Object visitManifestation(Manifestation obj) {
        	return visitModelElement(obj);
    }

    @objid ("08b7c21a-fce3-4f6e-8059-28c01df4d8d9")
    @Override
    public Object visitNameSpace(NameSpace obj) {
        	return visitModelTree(obj);
    }

    @objid ("96d9aa46-aaa1-4777-bba2-39674577069a")
    @Override
    public Object visitNamespaceUse(NamespaceUse obj) {
        	return visitElement(obj);
    }

    @objid ("329c10ba-115c-4363-bbce-6f913bc96c65")
    @Override
    public Object visitNode(Node obj) {
        	return visitClassifier(obj);
    }

    @objid ("f9f2f7b3-e470-499f-8fd8-eac03af0bfad")
    @Override
    public Object visitOperation(Operation obj) {
        	return visitBehavioralFeature(obj);
    }

    @objid ("999549d3-74e5-495a-ad1d-05b3729df3dd")
    @Override
    public Object visitPackage(Package obj) {
        	return visitNameSpace(obj);
    }

    @objid ("60d4c298-2067-4de8-b63e-68bde2468d13")
    @Override
    public Object visitPackageImport(PackageImport obj) {
        	return visitModelElement(obj);
    }

    @objid ("2adb9980-5ba6-4fa4-ac2f-31203984d36a")
    @Override
    public Object visitPackageMerge(PackageMerge obj) {
        	return visitModelElement(obj);
    }

    @objid ("03524a29-8d59-4b0c-9c31-01f3e6f6af07")
    @Override
    public Object visitParameter(Parameter obj) {
        	return visitModelElement(obj);
    }

    @objid ("b57ac5a4-e5aa-41db-97cb-eaff36499d30")
    @Override
    public Object visitPort(Port obj) {
        	return visitBindableInstance(obj);
    }

    @objid ("59ce62bd-b57f-4104-839a-254e703717ea")
    @Override
    public Object visitProvidedInterface(ProvidedInterface obj) {
        	return visitModelElement(obj);
    }

    @objid ("84dde895-2ec4-457d-ba68-0435b7342141")
    @Override
    public Object visitRaisedException(RaisedException obj) {
        	return visitModelElement(obj);
    }

    @objid ("6d9e5872-e6a4-401e-8572-b1675c37dcdf")
    @Override
    public Object visitRequiredInterface(RequiredInterface obj) {
        	return visitModelElement(obj);
    }

    @objid ("f4c448ca-ada1-4162-856f-f57de3ae986f")
    @Override
    public Object visitTemplateBinding(TemplateBinding obj) {
        	return visitModelElement(obj);
    }

    @objid ("12a7a4b1-60b1-46d7-ad06-976e0a1cd6d3")
    @Override
    public Object visitTemplateParameter(TemplateParameter obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("1421334c-5488-456b-a6dd-3e071ff8218a")
    @Override
    public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj) {
        	return visitModelElement(obj);
    }

    @objid ("647dba4e-4bd4-4242-8abd-b198bbcdba15")
    @Override
    public Object visitStructuralFeature(StructuralFeature obj) {
        	return visitFeature(obj);
    }

    @objid ("85589c2c-d078-4451-958a-9dee03e80dff")
    @Override
    public Object visitBehavioralFeature(BehavioralFeature obj) {
        	return visitFeature(obj);
    }

    @objid ("cecf641a-3836-403d-9b59-451da98e4d8f")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("c0815e31-14ab-4d11-ae3b-1a8bbb57038f")
    @Override
    public Object visitNaryAssociation(NaryAssociation obj) {
        	return visitModelElement(obj);
    }

    @objid ("a9987b1d-951a-4cac-8fa6-16cd6f1eaff5")
    @Override
    public Object visitNaryLink(NaryLink obj) {
        	return visitModelElement(obj);
    }

    @objid ("7ef225a6-705f-49c4-aa3a-be0706ec07c7")
    @Override
    public Object visitNaryLinkEnd(NaryLinkEnd obj) {
        	return visitModelElement(obj);
    }

    @objid ("344eb357-d996-4104-b49f-4396f2561c97")
    @Override
    public Object visitNaryConnectorEnd(NaryConnectorEnd obj) {
        	return visitNaryLinkEnd(obj);
    }

    @objid ("0cc5cd11-d980-4d9f-903f-5f13c081b4e6")
    @Override
    public Object visitAssociation(Association obj) {
        	return visitModelElement(obj);
    }

    @objid ("412e3f96-6f5b-4cf2-b0bb-c62306cc25f9")
    @Override
    public Object visitLink(Link obj) {
        	return visitModelElement(obj);
    }

    @objid ("b0067ba9-619b-4d69-a159-119109395f10")
    @Override
    public Object visitConnector(Connector obj) {
        	return visitLink(obj);
    }

    @objid ("cb2bb846-fabf-4fdd-8d5c-cc0f0e7863f5")
    @Override
    public Object visitAcceptCallEventAction(AcceptCallEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("e6d132ea-9c6f-4616-852b-cd726bec4125")
    @Override
    public Object visitAcceptChangeEventAction(AcceptChangeEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("7e9eab6b-3c19-4cd4-b0bb-b936f6e941d5")
    @Override
    public Object visitAcceptSignalAction(AcceptSignalAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("7447fa8f-56d5-4303-bb9c-8ab2a356c963")
    @Override
    public Object visitAcceptTimeEventAction(AcceptTimeEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("71b8a8c2-cb08-4825-87de-95f5a5415c4b")
    @Override
    public Object visitActivity(Activity obj) {
        	return visitBehavior(obj);
    }

    @objid ("734aee11-2fc9-40aa-85dd-9a19ee4a92d1")
    @Override
    public Object visitActivityAction(ActivityAction obj) {
        	return visitActivityNode(obj);
    }

    @objid ("81df6a8d-82f6-4aa2-9bfe-c416e9156953")
    @Override
    public Object visitActivityEdge(ActivityEdge obj) {
        	return visitModelElement(obj);
    }

    @objid ("0c218e23-f989-4e98-ac7f-194d4603a826")
    @Override
    public Object visitActivityFinalNode(ActivityFinalNode obj) {
        	return visitFinalNode(obj);
    }

    @objid ("abecf135-8931-466b-a477-608cbde1925b")
    @Override
    public Object visitActivityGroup(ActivityGroup obj) {
        	return visitModelElement(obj);
    }

    @objid ("a8346f87-21ca-4365-b06a-934fdc928add")
    @Override
    public Object visitActivityNode(ActivityNode obj) {
        	return visitModelElement(obj);
    }

    @objid ("8aa0055d-cb3f-4862-86aa-0cc2d62483f8")
    @Override
    public Object visitActivityParameterNode(ActivityParameterNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("41a4f45b-dd02-4b76-9ad0-f4aa4622c4ef")
    @Override
    public Object visitActivityPartition(ActivityPartition obj) {
        	return visitActivityGroup(obj);
    }

    @objid ("28ff38f1-0a31-471e-99c0-97ed4554574f")
    @Override
    public Object visitCallAction(CallAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("0feb2e35-0251-438c-bd81-519b0fd40826")
    @Override
    public Object visitCallBehaviorAction(CallBehaviorAction obj) {
        	return visitCallAction(obj);
    }

    @objid ("5cf2bc02-2809-4ec1-8831-389cfb83827e")
    @Override
    public Object visitCallOperationAction(CallOperationAction obj) {
        	return visitCallAction(obj);
    }

    @objid ("4e36f698-a930-4e4a-bac2-b54ba95da7df")
    @Override
    public Object visitCentralBufferNode(CentralBufferNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("2a6e0009-6897-4c6e-9636-334d7c799cd5")
    @Override
    public Object visitClause(Clause obj) {
        	return visitModelElement(obj);
    }

    @objid ("255f1a29-601b-48f8-8cb6-9493a2662e0e")
    @Override
    public Object visitConditionalNode(ConditionalNode obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("23c4a5e1-ffc2-419d-b7a7-61223d95cbb3")
    @Override
    public Object visitControlFlow(ControlFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("3370b1d8-4a61-4102-8201-445a1e78ffb9")
    @Override
    public Object visitControlNode(ControlNode obj) {
        	return visitActivityNode(obj);
    }

    @objid ("2a61399a-e3ca-47a8-8415-49f2b4ad4695")
    @Override
    public Object visitDataStoreNode(DataStoreNode obj) {
        	return visitCentralBufferNode(obj);
    }

    @objid ("a5930fbf-0cd4-42e8-9806-eb093a2d56a5")
    @Override
    public Object visitDecisionMergeNode(DecisionMergeNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("e61da212-7fa2-4889-8582-918ac9dbabfa")
    @Override
    public Object visitExceptionHandler(ExceptionHandler obj) {
        	return visitModelElement(obj);
    }

    @objid ("b264b3ac-dcca-45d6-9f12-1a5b8e50cbef")
    @Override
    public Object visitExpansionNode(ExpansionNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("0bbe7740-c03a-4414-9e78-b9a4aeaa0f44")
    @Override
    public Object visitExpansionRegion(ExpansionRegion obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("6e796500-d91f-40f9-8114-aa639f6dbb98")
    @Override
    public Object visitFinalNode(FinalNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("776ef32c-5743-4bc8-b718-5d680e798821")
    @Override
    public Object visitFlowFinalNode(FlowFinalNode obj) {
        	return visitFinalNode(obj);
    }

    @objid ("0bad6d64-bb91-4d05-8b1a-e631da85942f")
    @Override
    public Object visitForkJoinNode(ForkJoinNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("e9c50508-bb62-4105-9714-40a27100e56b")
    @Override
    public Object visitInitialNode(InitialNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("933c2c59-cca7-464f-b051-19a4634845ab")
    @Override
    public Object visitInputPin(InputPin obj) {
        	return visitPin(obj);
    }

    @objid ("330d9877-ffa9-4dd2-8281-2db2e3c14407")
    @Override
    public Object visitInstanceNode(InstanceNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("7ac7d4ec-9dc1-4bc1-9d99-7934aa2e9bca")
    @Override
    public Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj) {
        	return visitActivityGroup(obj);
    }

    @objid ("e73efe6f-8ed3-456c-995c-162124c5048d")
    @Override
    public Object visitLoopNode(LoopNode obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("69b4bc0b-03ad-4d01-84c9-ab5eef00c9f2")
    @Override
    public Object visitMessageFlow(MessageFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("03ab023f-55ba-439d-97ab-d1e81f5a1372")
    @Override
    public Object visitObjectFlow(ObjectFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("bcc9d653-a3f4-4f0c-9f94-19cb0e120183")
    @Override
    public Object visitObjectNode(ObjectNode obj) {
        	return visitActivityNode(obj);
    }

    @objid ("923c2dc6-ee2e-495c-b8aa-35d0eea8f1bf")
    @Override
    public Object visitOpaqueAction(OpaqueAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("4b010145-cd8e-401e-a9c4-69f2e339cd26")
    @Override
    public Object visitOutputPin(OutputPin obj) {
        	return visitPin(obj);
    }

    @objid ("5c0d8e68-4209-42ec-9879-4f6025346a17")
    @Override
    public Object visitPin(Pin obj) {
        	return visitObjectNode(obj);
    }

    @objid ("7bd0a9d9-a2c3-440d-be43-ffd713e56300")
    @Override
    public Object visitSendSignalAction(SendSignalAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("9ec96add-4f22-4470-99f7-e745964c4628")
    @Override
    public Object visitStructuredActivityNode(StructuredActivityNode obj) {
        	return visitActivityAction(obj);
    }

    @objid ("0c74bbca-0c98-4771-9f5e-41583fae5605")
    @Override
    public Object visitValuePin(ValuePin obj) {
        	return visitInputPin(obj);
    }

    @objid ("d5d13d19-6c8a-4def-85f5-a782205bbf99")
    @Override
    public Object visitBehavior(Behavior obj) {
        	return visitModelElement(obj);
    }

    @objid ("c7c6ec54-a128-48c7-92af-76625de79532")
    @Override
    public Object visitBehaviorParameter(BehaviorParameter obj) {
        	return visitParameter(obj);
    }

    @objid ("c60c4df4-2d20-41a8-bd0d-b4570f93e97f")
    @Override
    public Object visitOpaqueBehavior(OpaqueBehavior obj) {
        	return visitBehavior(obj);
    }

    @objid ("bfeb5dae-b857-49f2-be1c-d737bc0cbbf3")
    @Override
    public Object visitSignal(Signal obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("aedf59e1-02cf-4888-80bb-91112f58beb9")
    @Override
    public Object visitEvent(Event obj) {
        	return visitModelElement(obj);
    }

    @objid ("b282f024-4727-4a6a-bfe3-c8aed5b3792d")
    @Override
    public Object visitCombinedFragment(CombinedFragment obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("5ca38ff7-b755-4b96-bbcd-fbb16c0d4548")
    @Override
    public Object visitDurationConstraint(DurationConstraint obj) {
        	return visitConstraint(obj);
    }

    @objid ("2baeee4e-1580-4b7c-a2c7-96220520bffe")
    @Override
    public Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj) {
        	return visitMessageEnd(obj);
    }

    @objid ("b2de9258-a8c7-4ede-8b13-5f754c2285f7")
    @Override
    public Object visitExecutionSpecification(ExecutionSpecification obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("b8bf54ce-86bf-4c25-bfcb-3d7744e168f4")
    @Override
    public Object visitGate(Gate obj) {
        	return visitMessageEnd(obj);
    }

    @objid ("35e23333-5408-4424-86ce-1f91cc2f154d")
    @Override
    public Object visitGeneralOrdering(GeneralOrdering obj) {
        	return visitElement(obj);
    }

    @objid ("27aa3f6b-6c90-4888-a4ec-00cd94776a79")
    @Override
    public Object visitInteraction(Interaction obj) {
        	return visitBehavior(obj);
    }

    @objid ("0a900ad2-33b0-4f1e-b6a6-a127e3979fa3")
    @Override
    public Object visitInteractionFragment(InteractionFragment obj) {
        	return visitModelElement(obj);
    }

    @objid ("6da507e9-d365-4d4f-9b14-23fd7889f8bd")
    @Override
    public Object visitInteractionOperand(InteractionOperand obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("d096a236-ba32-4a2e-abd2-082a9bea8ef1")
    @Override
    public Object visitInteractionUse(InteractionUse obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("f18deaa4-9142-4ae7-90f8-2e8a7b6fe987")
    @Override
    public Object visitLifeline(Lifeline obj) {
        	return visitModelElement(obj);
    }

    @objid ("6eaec06b-4d99-42d5-a098-d2ad3ba4c224")
    @Override
    public Object visitMessage(Message obj) {
        	return visitModelElement(obj);
    }

    @objid ("8e49591d-76bc-46f1-9de5-8ce95b2a50d0")
    @Override
    public Object visitMessageEnd(MessageEnd obj) {
        	return visitOccurrenceSpecification(obj);
    }

    @objid ("f3b83bec-ee3e-4316-9866-483aed8655c9")
    @Override
    public Object visitOccurrenceSpecification(OccurrenceSpecification obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("8d15b66a-c961-4f2f-b82c-c33a3e409b26")
    @Override
    public Object visitPartDecomposition(PartDecomposition obj) {
        	return visitInteractionUse(obj);
    }

    @objid ("037d31dd-b600-4a24-8542-c40ebdb75a45")
    @Override
    public Object visitStateInvariant(StateInvariant obj) {
        	return visitOccurrenceSpecification(obj);
    }

    @objid ("fdc0ccc4-b905-4595-96da-997944be0152")
    @Override
    public Object visitTerminateSpecification(TerminateSpecification obj) {
        	return visitExecutionOccurenceSpecification(obj);
    }

    @objid ("8b6e59ae-ebc1-4d41-b7a4-294ded59d13e")
    @Override
    public Object visitAbstractPseudoState(AbstractPseudoState obj) {
        	return visitStateVertex(obj);
    }

    @objid ("95ff041f-e380-4839-81e0-3fdb1756a901")
    @Override
    public Object visitChoicePseudoState(ChoicePseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("833b5a29-ca18-4991-b34c-1b8411152303")
    @Override
    public Object visitConnectionPointReference(ConnectionPointReference obj) {
        	return visitStateVertex(obj);
    }

    @objid ("37e32166-a928-4acf-a80e-a8bdff8ca983")
    @Override
    public Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("cdb803b0-c6cb-4996-a04b-0c042e8431c2")
    @Override
    public Object visitEntryPointPseudoState(EntryPointPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("d7e5c756-4a90-4a97-ae8b-539fb8dd9dbc")
    @Override
    public Object visitExitPointPseudoState(ExitPointPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("993e1d6d-6285-414a-927e-fd9b472b03aa")
    @Override
    public Object visitForkPseudoState(ForkPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("be99ce9b-4735-4ff9-8690-a0eb9b73cd5b")
    @Override
    public Object visitInitialPseudoState(InitialPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("a9eb1539-960e-4195-ac30-45aed5a6850e")
    @Override
    public Object visitInternalTransition(InternalTransition obj) {
        	return visitTransition(obj);
    }

    @objid ("16e68462-fab9-4aca-8994-c7acdf1076e8")
    @Override
    public Object visitJoinPseudoState(JoinPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("d7c06bc9-f2e8-47cd-b7b0-3ba44b421670")
    @Override
    public Object visitJunctionPseudoState(JunctionPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("2800fc34-b458-4de5-a871-3704fb52e738")
    @Override
    public Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("deee4421-1628-4c95-a8c6-529da1f8e82c")
    @Override
    public Object visitState(State obj) {
        	return visitStateVertex(obj);
    }

    @objid ("79fe2a53-6731-46ad-938d-48f15485aa95")
    @Override
    public Object visitStateMachine(StateMachine obj) {
        	return visitBehavior(obj);
    }

    @objid ("49bf2d65-c268-4d27-8c5a-80308717b638")
    @Override
    public Object visitStateVertex(StateVertex obj) {
        	return visitModelElement(obj);
    }

    @objid ("b73118ae-c6a0-4abe-a103-75a9ca0160f7")
    @Override
    public Object visitTerminatePseudoState(TerminatePseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("0cf4cf22-918f-41c5-99a7-53e97ca22648")
    @Override
    public Object visitTransition(Transition obj) {
        	return visitModelElement(obj);
    }

    @objid ("062711ac-6522-4947-ba83-2f0ca83ab057")
    @Override
    public Object visitFinalState(FinalState obj) {
        	return visitState(obj);
    }

    @objid ("9bbc359e-c161-4f09-be82-299944233965")
    @Override
    public Object visitRegion(Region obj) {
        	return visitModelElement(obj);
    }

    @objid ("9cffdee3-5287-419e-bc9f-abcf9effa81b")
    @Override
    public Object visitActor(Actor obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("c65c414d-23d1-43d0-bed8-d3460c5f3cb4")
    @Override
    public Object visitUseCase(UseCase obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("2b751071-7814-427a-ad57-c298bb79bae5")
    @Override
    public Object visitUseCaseDependency(UseCaseDependency obj) {
        	return visitModelElement(obj);
    }

    @objid ("30b94bb3-23f1-4a3a-8a10-37e5a94b24ba")
    @Override
    public Object visitExtensionPoint(ExtensionPoint obj) {
        	return visitModelElement(obj);
    }

    @objid ("a7b239d3-af49-4664-bfdb-18406bb8aadb")
    @Override
    public Object visitAnalystItem(AnalystItem obj) {
        	return visitModelElement(obj);
    }

    @objid ("ef671634-fd87-48a8-a928-f4b96b651291")
    @Override
    public Object visitAnalystElement(AnalystElement obj) {
        	return visitAnalystItem(obj);
    }

    @objid ("9de95d0e-6159-4df3-91cc-2313a9e3efb4")
    @Override
    public Object visitAnalystContainer(AnalystContainer obj) {
        	return visitAnalystItem(obj);
    }

    @objid ("a751690a-77c5-4fdf-9903-ece5788157a2")
    @Override
    public Object visitAnalystProject(AnalystProject obj) {
        	return visitModelElement(obj);
    }

    @objid ("479f2388-8b14-4526-879f-419042a077db")
    @Override
    public Object visitAnalystPropertyTable(AnalystPropertyTable obj) {
        	return visitTypedPropertyTable(obj);
    }

    @objid ("1748c31e-1f8e-45da-84b2-93d0670c86a9")
    @Override
    public Object visitBusinessRule(BusinessRule obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("0f257926-d6fe-4232-90bc-f89c92928658")
    @Override
    public Object visitBusinessRuleContainer(BusinessRuleContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("fed7c214-236f-4e0c-a6dd-d0c499b816b7")
    @Override
    public Object visitDictionary(Dictionary obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("878f8995-fd04-44dc-9689-8da15aabe6a1")
    @Override
    public Object visitGoal(Goal obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("9c1e2ba7-8613-4d51-bbdd-a94a93a684ee")
    @Override
    public Object visitGoalContainer(GoalContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("2dd83c4c-c71f-49c6-b60d-be7c7698c84e")
    @Override
    public Object visitPropertyContainer(PropertyContainer obj) {
        	return visitModelElement(obj);
    }

    @objid ("f8aaf716-ab10-4f2b-a0a3-464b66816301")
    @Override
    public Object visitRequirement(Requirement obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("693e73f0-1aed-448b-bde8-e3e9c23faba9")
    @Override
    public Object visitRequirementContainer(RequirementContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("c1205a2d-91bd-40cf-bca6-e0f048421877")
    @Override
    public Object visitTerm(Term obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("86b9ee00-a428-4040-90d8-dedff3bfc2cd")
    @Override
    public Object visitGenericAnalystContainer(GenericAnalystContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("f738b9dc-4695-49f3-b742-4f933756636d")
    @Override
    public Object visitGenericAnalystElement(GenericAnalystElement obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("2443ee6f-e5a3-469c-82d1-35b6bbc1c486")
    @Override
    public Object visitInformationFlow(InformationFlow obj) {
        	return visitModelElement(obj);
    }

    @objid ("dd547402-01bc-4403-a3e9-dc1de627e576")
    @Override
    public Object visitInformationItem(InformationItem obj) {
        	return visitClassifier(obj);
    }

    @objid ("747c1872-7bd2-481c-8ee6-2dbc41a6b37c")
    @Override
    public Object visitDataFlow(DataFlow obj) {
        	return visitModelElement(obj);
    }

    @objid ("c4ac2267-fe20-4026-a1e7-12224bd2d977")
    @Override
    public Object visitCommunicationInteraction(CommunicationInteraction obj) {
        	return visitBehavior(obj);
    }

    @objid ("0c784c91-0117-48eb-968c-caff7cfa178c")
    @Override
    public Object visitCommunicationNode(CommunicationNode obj) {
        	return visitModelElement(obj);
    }

    @objid ("dde8fc65-9069-4d93-9f78-bf4651d26392")
    @Override
    public Object visitCommunicationMessage(CommunicationMessage obj) {
        	return visitModelElement(obj);
    }

    @objid ("85d16982-7b11-4278-a12c-9ac2b72b0cca")
    @Override
    public Object visitCommunicationChannel(CommunicationChannel obj) {
        	return visitModelElement(obj);
    }

    @objid ("d993672f-84cc-4f14-9d93-d1c968336960")
    @Override
    public Object visitBpmnCollaboration(BpmnCollaboration obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("25cfb653-f068-438f-a820-40592979bfca")
    @Override
    public Object visitBpmnLane(BpmnLane obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("e4383e51-d740-4140-869a-aae439cef511")
    @Override
    public Object visitBpmnLaneSet(BpmnLaneSet obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("ad174fbd-4038-4a15-b4d9-27250d42ef49")
    @Override
    public Object visitBpmnParticipant(BpmnParticipant obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("87f1a4f0-d3bc-40be-8459-e15ce770cb05")
    @Override
    public Object visitBpmnProcess(BpmnProcess obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("9ca59087-4e41-41ef-b067-9d308aee8fe8")
    @Override
    public Object visitBpmnAssociation(BpmnAssociation obj) {
        	return visitBpmnArtifact(obj);
    }

    @objid ("70f71561-7955-442e-9fa0-fe44fd954ba8")
    @Override
    public Object visitBpmnBaseElement(BpmnBaseElement obj) {
        	return visitModelElement(obj);
    }

    @objid ("8a3599be-b386-4b0d-a6ff-f726727ffb37")
    @Override
    public Object visitBpmnArtifact(BpmnArtifact obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("a233aa05-4d60-4f7a-bc3e-247491976fd6")
    @Override
    public Object visitBpmnFlowElement(BpmnFlowElement obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("0dded6ba-7291-4045-93b7-bbb3f0766091")
    @Override
    public Object visitBpmnFlowNode(BpmnFlowNode obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("e0bbcaf0-386b-4be3-8462-1fbd0e40ab7c")
    @Override
    public Object visitBpmnGroup(BpmnGroup obj) {
        	return visitBpmnArtifact(obj);
    }

    @objid ("d86faae6-a442-4e82-9446-a0f494833b91")
    @Override
    public Object visitBpmnRootElement(BpmnRootElement obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("f3ca8dbc-d245-4f38-be48-59c1dc6ca2ce")
    @Override
    public Object visitBpmnBehavior(BpmnBehavior obj) {
        	return visitBehavior(obj);
    }

    @objid ("432a2e7e-ccb6-449d-90cf-a60034bdcdad")
    @Override
    public Object visitBpmnMessage(BpmnMessage obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("75ec7d2e-6644-4051-ab77-fb4a491bfc03")
    @Override
    public Object visitBpmnMessageFlow(BpmnMessageFlow obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("dd7bc928-1758-48bb-8490-ed4ae48a5cea")
    @Override
    public Object visitBpmnSequenceFlow(BpmnSequenceFlow obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("147c011d-0f66-4146-83af-d46ef8e86ade")
    @Override
    public Object visitBpmnActivity(BpmnActivity obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("cf9422b5-a61b-4430-b548-331dceb6a8fb")
    @Override
    public Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj) {
        	return visitBpmnSubProcess(obj);
    }

    @objid ("a31be09f-1812-47e3-9960-962fb48fd291")
    @Override
    public Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("1aa18212-2e04-45f6-9929-c1ffcbcae8ec")
    @Override
    public Object visitBpmnCallActivity(BpmnCallActivity obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("f6c3e899-af45-4a58-aa9a-ee0de8b29025")
    @Override
    public Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("4a16097f-06b6-4085-9815-82b256709772")
    @Override
    public Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("2f336bb7-d228-4931-bf23-0414da71c3f7")
    @Override
    public Object visitBpmnManualTask(BpmnManualTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("9aac810f-6546-4597-88a2-f61223d153d3")
    @Override
    public Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj) {
        	return visitBpmnLoopCharacteristics(obj);
    }

    @objid ("9199472e-a960-41be-b1fd-effb56606255")
    @Override
    public Object visitBpmnReceiveTask(BpmnReceiveTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("ec329fad-92cf-44d5-ad01-6e4ac99ac4d4")
    @Override
    public Object visitBpmnScriptTask(BpmnScriptTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("8488c168-3cf0-4904-b222-b86ebe9ab01c")
    @Override
    public Object visitBpmnSendTask(BpmnSendTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("a940fe7c-4c69-41a6-8a0e-92a17bf38590")
    @Override
    public Object visitBpmnServiceTask(BpmnServiceTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("5eca712a-a212-4f73-9aff-3f55fcf70407")
    @Override
    public Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj) {
        	return visitBpmnLoopCharacteristics(obj);
    }

    @objid ("e626dfd2-bc45-415b-a224-d68166d4e322")
    @Override
    public Object visitBpmnSubProcess(BpmnSubProcess obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("9a46f71a-e8bc-4136-ae84-08586bff7f6a")
    @Override
    public Object visitBpmnTask(BpmnTask obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("e4275db6-3778-4c8e-86a7-4746284c787a")
    @Override
    public Object visitBpmnTransaction(BpmnTransaction obj) {
        	return visitBpmnSubProcess(obj);
    }

    @objid ("8f70dd2b-a783-49e9-aec3-c0774176091c")
    @Override
    public Object visitBpmnUserTask(BpmnUserTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("a23d829d-7891-4d96-8297-5e3f3c01d894")
    @Override
    public Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("f2952903-4b4b-4b4f-8f39-71eacd6196bd")
    @Override
    public Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("f3883a01-be3f-440c-9835-4cf1f7005e19")
    @Override
    public Object visitBpmnCatchEvent(BpmnCatchEvent obj) {
        	return visitBpmnEvent(obj);
    }

    @objid ("890723f3-e7c7-49b6-b089-258a8e88d0e2")
    @Override
    public Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("458dd762-3c75-4c30-abcb-b57d1ba39f69")
    @Override
    public Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("858eeadb-b041-4e9c-9a9d-6859be4267ef")
    @Override
    public Object visitBpmnEndEvent(BpmnEndEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("1755e8a6-f70d-46b8-948d-69f4861354f4")
    @Override
    public Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("d6f6b00a-8015-43f5-8a0a-a3445a9b2f16")
    @Override
    public Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("61912d6e-3190-47d9-b527-a74ce22b8bf8")
    @Override
    public Object visitBpmnEvent(BpmnEvent obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("70da8507-1dbb-4531-9548-054d12eb0c60")
    @Override
    public Object visitBpmnEventDefinition(BpmnEventDefinition obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("f57bb0d1-346b-4156-bd2a-93fbe6316bbf")
    @Override
    public Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("ea170733-afb5-4ebe-a711-3ddf25d209d5")
    @Override
    public Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("d13965a8-e2f5-4d76-b626-80259e02533c")
    @Override
    public Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("d6b07780-a8b9-481e-aafd-91037c74c22f")
    @Override
    public Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("70d1e3d0-69cb-4502-864a-9e4cc9271231")
    @Override
    public Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("49973aea-aa0a-4cb3-97eb-320096c89e95")
    @Override
    public Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("ddf2d01a-c043-4a75-ac31-4833dbbe5e8d")
    @Override
    public Object visitBpmnStartEvent(BpmnStartEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("c1191f8a-5e7c-4219-b145-6b1272bed5b0")
    @Override
    public Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("05e7b36a-8893-4001-969c-b53b028ae841")
    @Override
    public Object visitBpmnThrowEvent(BpmnThrowEvent obj) {
        	return visitBpmnEvent(obj);
    }

    @objid ("b5e47c32-85b1-44cf-9e28-99b157196482")
    @Override
    public Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("6a694813-719a-460b-a214-9c28a933cdb3")
    @Override
    public Object visitBpmnComplexGateway(BpmnComplexGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("6429f0fd-a2de-4690-86cc-1009d192a509")
    @Override
    public Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("50958115-de9e-4cda-8466-402b64927ac4")
    @Override
    public Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("a48bacc9-daaf-4366-aaf4-e011b183f466")
    @Override
    public Object visitBpmnGateway(BpmnGateway obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("0b5aba18-c961-4375-beeb-7ff953286321")
    @Override
    public Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("7ef7bec5-5e28-4be8-892b-f85b0a231018")
    @Override
    public Object visitBpmnParallelGateway(BpmnParallelGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("e7f4ec7b-f3a8-4eaf-8a6f-6c9a79e3c314")
    @Override
    public Object visitBpmnDataObject(BpmnDataObject obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("eaede0e6-f7a2-41c6-941e-1efc45ccc2a6")
    @Override
    public Object visitBpmnDataStore(BpmnDataStore obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("9228465a-4325-4fb3-a253-4c2a2233d29a")
    @Override
    public Object visitBpmnDataAssociation(BpmnDataAssociation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("3dbb7abc-b796-4c93-bedb-ccf7a82c8b1a")
    @Override
    public Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("4a0118cf-8a52-4893-a216-0609f87939f5")
    @Override
    public Object visitBpmnDataOutput(BpmnDataOutput obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("1aa3cf70-36d6-4dc8-a0e9-86e5130ccea0")
    @Override
    public Object visitBpmnDataInput(BpmnDataInput obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("03939a73-dee4-45bc-86ba-7a1bc43d3a59")
    @Override
    public Object visitBpmnItemAwareElement(BpmnItemAwareElement obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("d449c2e0-d7d9-4f64-8282-83597d1ee2df")
    @Override
    public Object visitBpmnItemDefinition(BpmnItemDefinition obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("d12c6ef6-b3ba-4a38-8560-8f7ff8c3bf7a")
    @Override
    public Object visitBpmnDataState(BpmnDataState obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("f8a30a66-d762-4597-99f2-866a9372d3e3")
    @Override
    public Object visitBpmnResource(BpmnResource obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("982dba34-bc33-47f8-9256-e9cab27520e0")
    @Override
    public Object visitBpmnResourceParameter(BpmnResourceParameter obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("fe0a6357-1622-48da-a1d2-f86b2371131e")
    @Override
    public Object visitBpmnResourceRole(BpmnResourceRole obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("917f43c5-f54e-42ac-ac33-c83aebbcbf0f")
    @Override
    public Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("fc0dfc6a-1ce1-4fa8-9612-0f16fe5508e8")
    @Override
    public Object visitBpmnOperation(BpmnOperation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("8ccd7029-81bd-4dd1-bd9d-0d4dc5f014b6")
    @Override
    public Object visitBpmnInterface(BpmnInterface obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("d4cd4d0c-82e2-48a8-bcfa-b03966c1d83f")
    @Override
    public Object visitBpmnEndPoint(BpmnEndPoint obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("f909f194-6951-40e3-a757-788f7cf6faa0")
    @Override
    public Object visitAbstractDiagram(AbstractDiagram obj) {
        	return visitModelElement(obj);
    }

    @objid ("c4be717a-b1cd-4dcd-9fcb-88f419f0ef4b")
    @Override
    public Object visitActivityDiagram(ActivityDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("6cd2f525-c3d4-49ba-bc40-1eafb287ab6c")
    @Override
    public Object visitBehaviorDiagram(BehaviorDiagram obj) {
        	return visitAbstractDiagram(obj);
    }

    @objid ("211c7c3d-59d4-4b5d-b3ac-cda247fd0157")
    @Override
    public Object visitClassDiagram(ClassDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("afda7ec2-c15a-4f70-b829-131552a12cfb")
    @Override
    public Object visitCommunicationDiagram(CommunicationDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("f13f6c7e-24cf-4086-9ddf-b87f25b2e8d3")
    @Override
    public Object visitDeploymentDiagram(DeploymentDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("6ecb4dce-10f9-4929-840b-5359ffc835e6")
    @Override
    public Object visitDiagramSet(DiagramSet obj) {
        	return visitModelElement(obj);
    }

    @objid ("f4c53b71-b92c-4015-8799-0328bc77935b")
    @Override
    public Object visitSequenceDiagram(SequenceDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("a7eeda6e-03f8-4ee2-a4b7-a8b4cfafb58f")
    @Override
    public Object visitStateMachineDiagram(StateMachineDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("77061105-f26f-4ec4-b16c-f53b50dae0cf")
    @Override
    public Object visitStaticDiagram(StaticDiagram obj) {
        	return visitAbstractDiagram(obj);
    }

    @objid ("0c7e9909-1a7f-40af-82c7-56f17099ce1b")
    @Override
    public Object visitUseCaseDiagram(UseCaseDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("696e1d75-2d26-47a3-ae98-dd5e92d9fc5c")
    @Override
    public Object visitObjectDiagram(ObjectDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("f6f938e2-1014-49c9-9775-a9f5a2521e54")
    @Override
    public Object visitCompositeStructureDiagram(CompositeStructureDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("48fb187b-7a92-44e5-8a45-b3f05b66220b")
    @Override
    public Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("f392d210-c2a4-4eda-8435-8782b60fc576")
    @Override
    public Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("be01d58a-4245-4f9e-9dfb-a7054c33628b")
    @Override
    public Object visitModuleParameter(ModuleParameter obj) {
        	return visitModelElement(obj);
    }

    @objid ("0ceea7d2-20a9-48b4-a2f6-40cdd62f8a99")
    @Override
    public Object visitModuleComponent(ModuleComponent obj) {
        	return visitComponent(obj);
    }

    @objid ("8025399d-5f98-4488-b9bd-f2fc04d88a88")
    @Override
    public Object visitProject(Project obj) {
        	return visitModelElement(obj);
    }

}
