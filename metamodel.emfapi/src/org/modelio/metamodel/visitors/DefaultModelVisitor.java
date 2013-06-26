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
import org.modelio.metamodel.uml.infrastructure.LocalNote;
import org.modelio.metamodel.uml.infrastructure.LocalTaggedValue;
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
    @objid ("41364a39-6f5f-483d-8b93-957e1be2d9f8")
    @Override
    public Object visitAbstraction(Abstraction obj) {
        	return visitDependency(obj);
    }

    @objid ("20bed53e-6745-4719-9b4b-09ed7debec27")
    @Override
    public Object visitConstraint(Constraint obj) {
        	return visitModelElement(obj);
    }

    @objid ("b0d99f61-f051-461f-b11d-efa9873a5ef4")
    @Override
    public Object visitDependency(Dependency obj) {
        	return visitModelElement(obj);
    }

    @objid ("84663f4a-9c25-490e-953f-e456beccc47f")
    @Override
    public Object visitElement(Element obj) {
        	return null;
    }

    @objid ("2984fb38-cb6a-4a26-a539-e1e74fabd2cd")
    @Override
    public Object visitLocalNote(LocalNote obj) {
        	return visitElement(obj);
    }

    @objid ("f8d7e6bf-47a3-4776-b480-4bdf92240689")
    @Override
    public Object visitLocalTaggedValue(LocalTaggedValue obj) {
        	return visitModelElement(obj);
    }

    @objid ("39559ce8-752f-4740-9abd-88a5cacd7cff")
    @Override
    public Object visitModelElement(ModelElement obj) {
        	return visitElement(obj);
    }

    @objid ("827f3b1d-11a7-4e9e-b7df-530856996538")
    @Override
    public Object visitModelTree(ModelTree obj) {
        	return visitModelElement(obj);
    }

    @objid ("124fb532-fe0d-41e8-bea5-e6b7ecd2dd1b")
    @Override
    public Object visitNote(Note obj) {
        	return visitModelElement(obj);
    }

    @objid ("f8cf1539-3aa4-437d-8920-c42e0b85962b")
    @Override
    public Object visitNoteType(NoteType obj) {
        	return visitModelElement(obj);
    }

    @objid ("8874d3e9-8927-49b2-8a30-c617e93e922d")
    @Override
    public Object visitProfile(Profile obj) {
        	return visitPackage(obj);
    }

    @objid ("b0e05b23-8016-4571-9583-e5c3edc7619b")
    @Override
    public Object visitStereotype(Stereotype obj) {
        	return visitModelElement(obj);
    }

    @objid ("4330c8c2-d5e9-47d6-a56d-61ce679a3aef")
    @Override
    public Object visitSubstitution(Substitution obj) {
        	return visitModelElement(obj);
    }

    @objid ("730347de-0951-4da5-aa46-bc296a17c046")
    @Override
    public Object visitTagParameter(TagParameter obj) {
        	return visitElement(obj);
    }

    @objid ("16562154-c381-48d1-b07c-0f14b7935578")
    @Override
    public Object visitTagType(TagType obj) {
        	return visitModelElement(obj);
    }

    @objid ("0cd3767c-3645-47a2-a04a-d4fb5a9ce0c6")
    @Override
    public Object visitTaggedValue(TaggedValue obj) {
        	return visitModelElement(obj);
    }

    @objid ("5f616dab-012d-441c-b10e-1abc3b36a16c")
    @Override
    public Object visitUsage(Usage obj) {
        	return visitDependency(obj);
    }

    @objid ("93807e75-8a99-4d7f-b575-b8885106f24b")
    @Override
    public Object visitMetaclassReference(MetaclassReference obj) {
        	return visitElement(obj);
    }

    @objid ("6af71a7d-4f39-4a84-b584-e4aecaec8c39")
    @Override
    public Object visitExternDocument(ExternDocument obj) {
        	return visitModelElement(obj);
    }

    @objid ("627935fc-54e4-4203-980b-b726cb766fc6")
    @Override
    public Object visitExternDocumentType(ExternDocumentType obj) {
        	return visitModelElement(obj);
    }

    @objid ("1f93c349-820a-437f-b71d-0bf6cb9b0fce")
    @Override
    public Object visitEnumeratedPropertyType(EnumeratedPropertyType obj) {
        	return visitPropertyType(obj);
    }

    @objid ("e26c4837-6cd7-4559-bfb5-0766e96d2193")
    @Override
    public Object visitLocalPropertyTable(LocalPropertyTable obj) {
        	return visitPropertyTable(obj);
    }

    @objid ("a668e344-3f96-4870-a128-845180e3e718")
    @Override
    public Object visitPropertyDefinition(PropertyDefinition obj) {
        	return visitModelElement(obj);
    }

    @objid ("48852d8d-ca77-40ea-89de-71bdbc965d93")
    @Override
    public Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj) {
        	return visitModelElement(obj);
    }

    @objid ("1c2a3faa-f18f-43b0-9857-8d396681ae50")
    @Override
    public Object visitPropertyTable(PropertyTable obj) {
        	return visitElement(obj);
    }

    @objid ("4c45db24-fb20-457c-bf0a-ce46dd7918bb")
    @Override
    public Object visitPropertyTableDefinition(PropertyTableDefinition obj) {
        	return visitModelElement(obj);
    }

    @objid ("e3910b85-2d38-4738-8aae-8b87330d46f0")
    @Override
    public Object visitPropertyType(PropertyType obj) {
        	return visitModelElement(obj);
    }

    @objid ("5246fa8c-8c11-4d13-b1c3-e98a0e4e1192")
    @Override
    public Object visitTypedPropertyTable(TypedPropertyTable obj) {
        	return visitPropertyTable(obj);
    }

    @objid ("c1014b2f-da71-4ec8-9766-946b9c50f644")
    @Override
    public Object visitArtifact(Artifact obj) {
        	return visitClassifier(obj);
    }

    @objid ("8502043f-6e6e-4943-9e20-a93620affbe6")
    @Override
    public Object visitAssociationEnd(AssociationEnd obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("b37f96d6-c7b9-4812-942a-e5a2681ef5f9")
    @Override
    public Object visitAttribute(Attribute obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("20bfc923-1607-496c-8d7d-c2c41828804a")
    @Override
    public Object visitAttributeLink(AttributeLink obj) {
        	return visitModelElement(obj);
    }

    @objid ("df673d3c-294f-4664-b483-b9c42cdfc2a1")
    @Override
    public Object visitBindableInstance(BindableInstance obj) {
        	return visitInstance(obj);
    }

    @objid ("234cfe1a-0440-4539-a666-203d12a23b80")
    @Override
    public Object visitBinding(Binding obj) {
        	return visitModelElement(obj);
    }

    @objid ("264715d8-d87e-4e7b-9740-3f3d96bdf378")
    @Override
    public Object visitClass(Class obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("0d916a1c-2c19-4b84-bb31-95da50d6b60c")
    @Override
    public Object visitClassAssociation(ClassAssociation obj) {
        	return visitModelElement(obj);
    }

    @objid ("181f1c05-9669-4d8b-ada2-8edd5a540504")
    @Override
    public Object visitClassifier(Classifier obj) {
        	return visitNameSpace(obj);
    }

    @objid ("395cec9e-7bb0-412b-bb76-505b5d5a19fc")
    @Override
    public Object visitCollaboration(Collaboration obj) {
        	return visitNameSpace(obj);
    }

    @objid ("c2e0d15c-0be7-4e75-bc31-1f12db622149")
    @Override
    public Object visitCollaborationUse(CollaborationUse obj) {
        	return visitModelElement(obj);
    }

    @objid ("2326b501-90c5-464e-88d6-5e33093ab5a7")
    @Override
    public Object visitComponent(Component obj) {
        	return visitClass(obj);
    }

    @objid ("a5b9c4a5-b2b8-4307-b96c-904c64478a0e")
    @Override
    public Object visitNaryConnector(NaryConnector obj) {
        	return visitNaryLink(obj);
    }

    @objid ("aab5d65a-5661-49b0-b7df-0aa2510289e5")
    @Override
    public Object visitConnectorEnd(ConnectorEnd obj) {
        	return visitLinkEnd(obj);
    }

    @objid ("68c47c2b-4f15-42b7-bafa-10967350867d")
    @Override
    public Object visitDataType(DataType obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("c1d01382-68f1-4da9-91ed-e5af90328501")
    @Override
    public Object visitElementImport(ElementImport obj) {
        	return visitModelElement(obj);
    }

    @objid ("ea4e422c-3477-4a98-95dc-ee59e1e83db0")
    @Override
    public Object visitElementRealization(ElementRealization obj) {
        	return visitAbstraction(obj);
    }

    @objid ("b7df5a95-ca0c-46d2-99fb-2a33f815e5d4")
    @Override
    public Object visitEnumeration(Enumeration obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("65d6fe62-56dd-49a8-b1ce-5d20f4475a08")
    @Override
    public Object visitEnumerationLiteral(EnumerationLiteral obj) {
        	return visitModelElement(obj);
    }

    @objid ("4fbb7b3c-2f03-4db7-96dd-9ee3816edb41")
    @Override
    public Object visitFeature(Feature obj) {
        	return visitModelElement(obj);
    }

    @objid ("f363636a-4535-4570-a4d6-0a82c55f5ab4")
    @Override
    public Object visitGeneralClass(GeneralClass obj) {
        	return visitClassifier(obj);
    }

    @objid ("22fbe171-22a8-4ed3-b258-b1080917133d")
    @Override
    public Object visitGeneralization(Generalization obj) {
        	return visitModelElement(obj);
    }

    @objid ("56dff901-0ac8-4246-b933-48740db08c3c")
    @Override
    public Object visitInstance(Instance obj) {
        	return visitModelElement(obj);
    }

    @objid ("353898bc-acaf-4c6f-88f1-0d615ba1622c")
    @Override
    public Object visitInterface(Interface obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("cc953937-8cb4-4e56-8f0e-4cc165346f37")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization obj) {
        	return visitModelElement(obj);
    }

    @objid ("1f6733ae-1554-4dfd-9336-b9c4ebfc98c6")
    @Override
    public Object visitLinkEnd(LinkEnd obj) {
        	return visitModelElement(obj);
    }

    @objid ("dec81185-7158-4750-952e-23e265405d62")
    @Override
    public Object visitManifestation(Manifestation obj) {
        	return visitModelElement(obj);
    }

    @objid ("d7b8d510-012e-4633-9d3a-6db8386fd1fa")
    @Override
    public Object visitNameSpace(NameSpace obj) {
        	return visitModelTree(obj);
    }

    @objid ("4941ba3b-2a73-4b7e-9237-34322e93987c")
    @Override
    public Object visitNamespaceUse(NamespaceUse obj) {
        	return visitElement(obj);
    }

    @objid ("172cce12-dbef-4f12-beed-fa54ccd47537")
    @Override
    public Object visitNode(Node obj) {
        	return visitClassifier(obj);
    }

    @objid ("c05cd71e-557b-4f5b-9397-5c6ab8d22cff")
    @Override
    public Object visitOperation(Operation obj) {
        	return visitBehavioralFeature(obj);
    }

    @objid ("311a3853-34af-48fc-a375-27ef44e4fa60")
    @Override
    public Object visitPackage(Package obj) {
        	return visitNameSpace(obj);
    }

    @objid ("417f323f-6013-4c10-afa4-a469a8094b20")
    @Override
    public Object visitPackageImport(PackageImport obj) {
        	return visitModelElement(obj);
    }

    @objid ("a5ff20c4-d7d3-4240-834e-5e0fd2ad9b2b")
    @Override
    public Object visitPackageMerge(PackageMerge obj) {
        	return visitModelElement(obj);
    }

    @objid ("21ab512d-097a-4663-b81f-191c758378a5")
    @Override
    public Object visitParameter(Parameter obj) {
        	return visitModelElement(obj);
    }

    @objid ("413af90b-a4a3-4d90-8500-6d2d8252036a")
    @Override
    public Object visitPort(Port obj) {
        	return visitBindableInstance(obj);
    }

    @objid ("dd965bb9-04bd-4279-9ab3-8aaca43e8cdb")
    @Override
    public Object visitProvidedInterface(ProvidedInterface obj) {
        	return visitModelElement(obj);
    }

    @objid ("55397b20-d072-4064-8908-f36802d20f5f")
    @Override
    public Object visitRaisedException(RaisedException obj) {
        	return visitModelElement(obj);
    }

    @objid ("bf690b0a-9ee3-4662-8de5-6c9d6d183416")
    @Override
    public Object visitRequiredInterface(RequiredInterface obj) {
        	return visitModelElement(obj);
    }

    @objid ("f35d9a9b-820a-4426-82c8-713a7f5df957")
    @Override
    public Object visitTemplateBinding(TemplateBinding obj) {
        	return visitModelElement(obj);
    }

    @objid ("a1b5d860-7780-4a7c-8839-27631bfb88a9")
    @Override
    public Object visitTemplateParameter(TemplateParameter obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("36614c2b-68c5-4fe8-9201-4aa5097325d7")
    @Override
    public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj) {
        	return visitModelElement(obj);
    }

    @objid ("25be9464-b73f-433d-a857-6a23858602a8")
    @Override
    public Object visitStructuralFeature(StructuralFeature obj) {
        	return visitFeature(obj);
    }

    @objid ("b6a30b5b-43ab-4678-85d8-be37f680f04c")
    @Override
    public Object visitBehavioralFeature(BehavioralFeature obj) {
        	return visitFeature(obj);
    }

    @objid ("97f24d2c-fe54-41ab-aa8c-fca6763e302d")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("c946df88-2fa5-409f-b75e-6385e4d35dc5")
    @Override
    public Object visitNaryAssociation(NaryAssociation obj) {
        	return visitModelElement(obj);
    }

    @objid ("c2c79f76-9fba-4274-a9fd-aef028547d46")
    @Override
    public Object visitNaryLink(NaryLink obj) {
        	return visitModelElement(obj);
    }

    @objid ("35673ea9-abff-43f1-9754-8ceb16e3881e")
    @Override
    public Object visitNaryLinkEnd(NaryLinkEnd obj) {
        	return visitModelElement(obj);
    }

    @objid ("d0a18490-eebe-4977-bb0e-757a030879a4")
    @Override
    public Object visitNaryConnectorEnd(NaryConnectorEnd obj) {
        	return visitNaryLinkEnd(obj);
    }

    @objid ("79584f21-26d2-422f-af40-3b29b143d085")
    @Override
    public Object visitAssociation(Association obj) {
        	return visitModelElement(obj);
    }

    @objid ("83a8c8e0-eb93-466d-815b-a39d7798ebff")
    @Override
    public Object visitLink(Link obj) {
        	return visitModelElement(obj);
    }

    @objid ("8f84f19c-ff8f-49b5-a0d2-031ede83072c")
    @Override
    public Object visitConnector(Connector obj) {
        	return visitLink(obj);
    }

    @objid ("3259c89e-90c9-4b03-b5d7-c1d87a024ed5")
    @Override
    public Object visitAcceptCallEventAction(AcceptCallEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("de27ab6c-9aca-4ae9-8143-16aae3ae2c7d")
    @Override
    public Object visitAcceptChangeEventAction(AcceptChangeEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("edece459-e3e7-40c3-b858-aa11512635e9")
    @Override
    public Object visitAcceptSignalAction(AcceptSignalAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("fe54f15f-46fc-438e-94ca-f99064e30ffd")
    @Override
    public Object visitAcceptTimeEventAction(AcceptTimeEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("04c167ac-1068-4db3-af61-ed0d469c3c8f")
    @Override
    public Object visitActivity(Activity obj) {
        	return visitBehavior(obj);
    }

    @objid ("a0cf0e9f-2d2a-4367-934e-515b9d09f134")
    @Override
    public Object visitActivityAction(ActivityAction obj) {
        	return visitActivityNode(obj);
    }

    @objid ("2fb3557b-2d99-4742-a39f-acd1cf461c35")
    @Override
    public Object visitActivityEdge(ActivityEdge obj) {
        	return visitModelElement(obj);
    }

    @objid ("b3aac6c9-cd6a-486c-8d0a-7a3e64fcf667")
    @Override
    public Object visitActivityFinalNode(ActivityFinalNode obj) {
        	return visitFinalNode(obj);
    }

    @objid ("ffb01d39-d562-415c-b478-cc67990a415f")
    @Override
    public Object visitActivityGroup(ActivityGroup obj) {
        	return visitModelElement(obj);
    }

    @objid ("2ea726c4-8db2-4bee-a7ca-4bba3c6b5a66")
    @Override
    public Object visitActivityNode(ActivityNode obj) {
        	return visitModelElement(obj);
    }

    @objid ("711c909d-b70c-4ca1-b5a2-6ec6e33125b3")
    @Override
    public Object visitActivityParameterNode(ActivityParameterNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("e10234cb-13a2-40e6-9857-771a4891a451")
    @Override
    public Object visitActivityPartition(ActivityPartition obj) {
        	return visitActivityGroup(obj);
    }

    @objid ("cfb5fcef-15c6-4a37-ba95-d33f6ec71145")
    @Override
    public Object visitCallAction(CallAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("0504dd9a-bb8f-4052-b26e-ad60587da427")
    @Override
    public Object visitCallBehaviorAction(CallBehaviorAction obj) {
        	return visitCallAction(obj);
    }

    @objid ("b292facf-d60c-461d-a7dc-f79dbfe0c702")
    @Override
    public Object visitCallOperationAction(CallOperationAction obj) {
        	return visitCallAction(obj);
    }

    @objid ("e6ce6282-1404-4e34-9914-0e5dab9044a2")
    @Override
    public Object visitCentralBufferNode(CentralBufferNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("f47b3d98-523b-4932-9bfa-9932492ebd8a")
    @Override
    public Object visitClause(Clause obj) {
        	return visitModelElement(obj);
    }

    @objid ("d4908d36-5ce9-451d-9e5a-81809b95c301")
    @Override
    public Object visitConditionalNode(ConditionalNode obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("68e24a2f-b527-4f67-ae8a-3f6602607604")
    @Override
    public Object visitControlFlow(ControlFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("f2e310cc-c81c-44d8-bd7f-55259613fa38")
    @Override
    public Object visitControlNode(ControlNode obj) {
        	return visitActivityNode(obj);
    }

    @objid ("acff51b8-8096-4666-9a5c-39cb417f3d3d")
    @Override
    public Object visitDataStoreNode(DataStoreNode obj) {
        	return visitCentralBufferNode(obj);
    }

    @objid ("5a302390-9760-4688-8e3c-e89ac3054a39")
    @Override
    public Object visitDecisionMergeNode(DecisionMergeNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("35e27b61-9f7d-4687-9882-57672339ad47")
    @Override
    public Object visitExceptionHandler(ExceptionHandler obj) {
        	return visitModelElement(obj);
    }

    @objid ("19a2420c-f2ae-4f48-b019-0bd1a9ea43ca")
    @Override
    public Object visitExpansionNode(ExpansionNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("a1079470-4514-407d-99ff-82b825b1e8d9")
    @Override
    public Object visitExpansionRegion(ExpansionRegion obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("e6511971-8f04-4d6f-a8ef-a612275db697")
    @Override
    public Object visitFinalNode(FinalNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("b4129296-f4f3-4f70-be1e-17ebb549863e")
    @Override
    public Object visitFlowFinalNode(FlowFinalNode obj) {
        	return visitFinalNode(obj);
    }

    @objid ("76372626-1bb6-4837-8ad7-36caec2ea13f")
    @Override
    public Object visitForkJoinNode(ForkJoinNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("3f051db0-5452-4857-bdc3-df08d96443a9")
    @Override
    public Object visitInitialNode(InitialNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("d907fb6f-815b-4b0e-a625-3a9a44351530")
    @Override
    public Object visitInputPin(InputPin obj) {
        	return visitPin(obj);
    }

    @objid ("111ca49f-3c3f-4b34-8b0b-3f5d6cab0214")
    @Override
    public Object visitInstanceNode(InstanceNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("2d7b7fd2-bea9-4c5f-a770-a903c17ed5bb")
    @Override
    public Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj) {
        	return visitActivityGroup(obj);
    }

    @objid ("4db8ce5f-418c-4680-82a0-f37f21257fd9")
    @Override
    public Object visitLoopNode(LoopNode obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("66c6adf5-a6c5-4238-b160-99850b70b41a")
    @Override
    public Object visitMessageFlow(MessageFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("17275d80-f5c3-4a94-b799-5109c05f4899")
    @Override
    public Object visitObjectFlow(ObjectFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("390e691a-b9c2-409e-821e-cb3f4d8a5d8d")
    @Override
    public Object visitObjectNode(ObjectNode obj) {
        	return visitActivityNode(obj);
    }

    @objid ("e02d00f5-9c41-43bf-bb26-a54f5ff4ce48")
    @Override
    public Object visitOpaqueAction(OpaqueAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("a08c324a-c204-4c48-b729-2c47a7e79d30")
    @Override
    public Object visitOutputPin(OutputPin obj) {
        	return visitPin(obj);
    }

    @objid ("c89d8898-0836-4021-bcb4-f0cd777e44f4")
    @Override
    public Object visitPin(Pin obj) {
        	return visitObjectNode(obj);
    }

    @objid ("c763cd65-d3cc-4b07-8ca5-fbabde74ed85")
    @Override
    public Object visitSendSignalAction(SendSignalAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("0766faed-2ddf-4b21-a334-5e91f6f4f7b3")
    @Override
    public Object visitStructuredActivityNode(StructuredActivityNode obj) {
        	return visitActivityAction(obj);
    }

    @objid ("f58d6809-87a9-4451-ae00-b7596fa89bec")
    @Override
    public Object visitValuePin(ValuePin obj) {
        	return visitInputPin(obj);
    }

    @objid ("172b17b3-ef8c-4163-88ce-14f0cb408b8f")
    @Override
    public Object visitBehavior(Behavior obj) {
        	return visitModelElement(obj);
    }

    @objid ("a86db9f2-3609-4355-a5df-f3e8fed9e560")
    @Override
    public Object visitBehaviorParameter(BehaviorParameter obj) {
        	return visitParameter(obj);
    }

    @objid ("e1bbf63a-b0a1-4e52-b6cb-eab78f7f561e")
    @Override
    public Object visitOpaqueBehavior(OpaqueBehavior obj) {
        	return visitBehavior(obj);
    }

    @objid ("573ac725-bdf6-41f3-9b61-6cc774c33317")
    @Override
    public Object visitSignal(Signal obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("9dcd9ce6-7fc2-4e39-8e57-184c0f06a329")
    @Override
    public Object visitEvent(Event obj) {
        	return visitModelElement(obj);
    }

    @objid ("68865a52-ed20-4f51-9634-e095a9da32db")
    @Override
    public Object visitCombinedFragment(CombinedFragment obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("bf62a8f1-31a2-4cd8-add0-7a1d8765ce5e")
    @Override
    public Object visitDurationConstraint(DurationConstraint obj) {
        	return visitConstraint(obj);
    }

    @objid ("a28b520e-504b-42d7-9865-b6d3712d10dc")
    @Override
    public Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj) {
        	return visitMessageEnd(obj);
    }

    @objid ("b9905b87-fecf-46c1-8e47-71e3c82373f7")
    @Override
    public Object visitExecutionSpecification(ExecutionSpecification obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("59f49df9-3ae6-48a3-bcf0-7fcae72012bd")
    @Override
    public Object visitGate(Gate obj) {
        	return visitMessageEnd(obj);
    }

    @objid ("f07dc1f0-f264-43a6-ba98-3eaa9c9488dd")
    @Override
    public Object visitGeneralOrdering(GeneralOrdering obj) {
        	return visitElement(obj);
    }

    @objid ("ec4ca990-05ea-4947-9a61-cf9b99f0f67d")
    @Override
    public Object visitInteraction(Interaction obj) {
        	return visitBehavior(obj);
    }

    @objid ("79dd2355-f7f1-4444-8f93-fed6bf9fd925")
    @Override
    public Object visitInteractionFragment(InteractionFragment obj) {
        	return visitModelElement(obj);
    }

    @objid ("598ba671-0c1e-4a0d-888c-a1f487fdfe8b")
    @Override
    public Object visitInteractionOperand(InteractionOperand obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("cd06fbf9-de5f-421e-be1e-991a1c056f19")
    @Override
    public Object visitInteractionUse(InteractionUse obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("ce128e3d-ec78-4069-a471-0a0b35b569f5")
    @Override
    public Object visitLifeline(Lifeline obj) {
        	return visitModelElement(obj);
    }

    @objid ("06884344-5bbc-4358-98d8-3f199d493567")
    @Override
    public Object visitMessage(Message obj) {
        	return visitModelElement(obj);
    }

    @objid ("a4b23b79-bae9-4366-a99e-2e5fb321bfaf")
    @Override
    public Object visitMessageEnd(MessageEnd obj) {
        	return visitOccurrenceSpecification(obj);
    }

    @objid ("fc2f51f5-0c6c-42b2-b2f3-7ec577f8578a")
    @Override
    public Object visitOccurrenceSpecification(OccurrenceSpecification obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("be4af2a6-ee09-43af-b11b-8825da92adc1")
    @Override
    public Object visitPartDecomposition(PartDecomposition obj) {
        	return visitInteractionUse(obj);
    }

    @objid ("f1ec279b-9afe-4bfe-b8ae-bc5f222b4c73")
    @Override
    public Object visitStateInvariant(StateInvariant obj) {
        	return visitOccurrenceSpecification(obj);
    }

    @objid ("fb8bb582-9e67-4435-aca9-edbb8fa14915")
    @Override
    public Object visitTerminateSpecification(TerminateSpecification obj) {
        	return visitExecutionOccurenceSpecification(obj);
    }

    @objid ("632b26c2-d6dc-4cfe-9eac-3c8b17dca5d0")
    @Override
    public Object visitAbstractPseudoState(AbstractPseudoState obj) {
        	return visitStateVertex(obj);
    }

    @objid ("9ff44fcb-7355-4302-86fa-8211c4c6d0cf")
    @Override
    public Object visitChoicePseudoState(ChoicePseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("c8cc4795-a682-45a9-8bce-0408aede1c3b")
    @Override
    public Object visitConnectionPointReference(ConnectionPointReference obj) {
        	return visitStateVertex(obj);
    }

    @objid ("d8d7b2d0-d0a2-400f-b2d6-a023532516ef")
    @Override
    public Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("572f3a60-cb69-486f-b267-60a53ee61fb3")
    @Override
    public Object visitEntryPointPseudoState(EntryPointPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("18814558-b1c8-48e0-a4f1-ec9e1c7be5e0")
    @Override
    public Object visitExitPointPseudoState(ExitPointPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("6502f962-0141-4f3d-b1f7-68b8735ec9a4")
    @Override
    public Object visitForkPseudoState(ForkPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("d1f8423d-2e08-4df4-a5c0-3407170b1b58")
    @Override
    public Object visitInitialPseudoState(InitialPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("b528226d-f1c0-4427-9549-19317ebcc4ed")
    @Override
    public Object visitInternalTransition(InternalTransition obj) {
        	return visitTransition(obj);
    }

    @objid ("8a0b3c4c-770b-4e6d-9dd2-8b6b7dc5a734")
    @Override
    public Object visitJoinPseudoState(JoinPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("87e0e3eb-6187-4a59-b9f2-f962e1390fdc")
    @Override
    public Object visitJunctionPseudoState(JunctionPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("8a70110c-fa05-4f57-a8df-150b26f1579e")
    @Override
    public Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("bb866cd7-61e7-4576-8d5f-8ad6dda8cff2")
    @Override
    public Object visitState(State obj) {
        	return visitStateVertex(obj);
    }

    @objid ("40316b6f-a45e-4216-8e21-09809d04b50a")
    @Override
    public Object visitStateMachine(StateMachine obj) {
        	return visitBehavior(obj);
    }

    @objid ("7af45638-ddc5-4e81-9fa5-981fb6aa70e1")
    @Override
    public Object visitStateVertex(StateVertex obj) {
        	return visitModelElement(obj);
    }

    @objid ("9409b9b9-d320-4ef4-bad2-4a8843e4be2e")
    @Override
    public Object visitTerminatePseudoState(TerminatePseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("9b70fd6e-d537-4ad2-99fc-398354fcf622")
    @Override
    public Object visitTransition(Transition obj) {
        	return visitModelElement(obj);
    }

    @objid ("7be907ed-9259-4a3e-941c-0d49c124fbf8")
    @Override
    public Object visitFinalState(FinalState obj) {
        	return visitState(obj);
    }

    @objid ("618c9c19-3850-4665-ae55-c2ac544d3806")
    @Override
    public Object visitRegion(Region obj) {
        	return visitModelElement(obj);
    }

    @objid ("83121c98-62f5-4be9-aeeb-f65125536d78")
    @Override
    public Object visitActor(Actor obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("e6b24eb1-b7cc-452f-a255-e7fa8dadb7bf")
    @Override
    public Object visitUseCase(UseCase obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("587930ec-f219-4104-96b1-59d1ef949c6f")
    @Override
    public Object visitUseCaseDependency(UseCaseDependency obj) {
        	return visitModelElement(obj);
    }

    @objid ("5cee0a4b-e896-4300-a68e-0b9a838d4962")
    @Override
    public Object visitExtensionPoint(ExtensionPoint obj) {
        	return visitModelElement(obj);
    }

    @objid ("23dd349f-5b0b-4305-9471-093ad6df5d4d")
    @Override
    public Object visitAnalystItem(AnalystItem obj) {
        	return visitModelElement(obj);
    }

    @objid ("85c38b95-f0fc-43ba-80cb-d5b377947a0e")
    @Override
    public Object visitAnalystElement(AnalystElement obj) {
        	return visitAnalystItem(obj);
    }

    @objid ("88f8c406-4e25-4ba6-b82f-3f2433caa9ee")
    @Override
    public Object visitAnalystContainer(AnalystContainer obj) {
        	return visitAnalystItem(obj);
    }

    @objid ("2a2814aa-e8c7-41f1-aa6e-22a53d58b15a")
    @Override
    public Object visitAnalystProject(AnalystProject obj) {
        	return visitModelElement(obj);
    }

    @objid ("3af62377-148a-47de-9c11-e31a03096348")
    @Override
    public Object visitAnalystPropertyTable(AnalystPropertyTable obj) {
        	return visitTypedPropertyTable(obj);
    }

    @objid ("8cf35ffc-a0a9-4f52-aa3f-eb908504de90")
    @Override
    public Object visitBusinessRule(BusinessRule obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("da6a8a73-715d-4e10-a94e-4113ed12efc6")
    @Override
    public Object visitBusinessRuleContainer(BusinessRuleContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("6d274e5c-b6d9-42a0-8483-36ccc87ae801")
    @Override
    public Object visitDictionary(Dictionary obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("8083f463-835e-4252-8163-ac7c08dd84c4")
    @Override
    public Object visitGoal(Goal obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("4cf0c8af-f58f-4f24-a7f7-b880208991c9")
    @Override
    public Object visitGoalContainer(GoalContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("f0567df5-6348-46d5-8528-bb3d33c8903c")
    @Override
    public Object visitPropertyContainer(PropertyContainer obj) {
        	return visitModelElement(obj);
    }

    @objid ("34ad2a95-5719-4e86-88ab-62dcacadca4e")
    @Override
    public Object visitRequirement(Requirement obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("f1870caf-0293-4668-8e62-e1d9563e73b8")
    @Override
    public Object visitRequirementContainer(RequirementContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("a99a3217-1f43-4f47-8e89-e8b8292ffd61")
    @Override
    public Object visitTerm(Term obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("e6c76f47-3a09-4d3f-abfb-0ce0a0510ff7")
    @Override
    public Object visitInformationFlow(InformationFlow obj) {
        	return visitModelElement(obj);
    }

    @objid ("0511253c-b5aa-4b90-bac9-161f732578af")
    @Override
    public Object visitInformationItem(InformationItem obj) {
        	return visitClassifier(obj);
    }

    @objid ("701fc9d4-bad3-4d3f-bbce-31d427caf94c")
    @Override
    public Object visitDataFlow(DataFlow obj) {
        	return visitModelElement(obj);
    }

    @objid ("cd31f507-f446-4e8c-a621-3b47874be763")
    @Override
    public Object visitCommunicationInteraction(CommunicationInteraction obj) {
        	return visitBehavior(obj);
    }

    @objid ("43465220-15df-4482-b751-d2fd4796c5ef")
    @Override
    public Object visitCommunicationNode(CommunicationNode obj) {
        	return visitModelElement(obj);
    }

    @objid ("d398138b-aedc-4944-980e-37f1c818284a")
    @Override
    public Object visitCommunicationMessage(CommunicationMessage obj) {
        	return visitModelElement(obj);
    }

    @objid ("9be4e099-c399-45b3-a3cf-da4ba3084471")
    @Override
    public Object visitCommunicationChannel(CommunicationChannel obj) {
        	return visitModelElement(obj);
    }

    @objid ("a535a7b3-bb52-46af-8182-15af8990f762")
    @Override
    public Object visitBpmnCollaboration(BpmnCollaboration obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("a5140af4-2faa-475f-ae48-42cfb27d5213")
    @Override
    public Object visitBpmnLane(BpmnLane obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("1fb7fc4b-1c3e-4b7b-b356-420c31c8d743")
    @Override
    public Object visitBpmnLaneSet(BpmnLaneSet obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("27919a46-50c3-4011-b68f-b2ae9cf8ae8a")
    @Override
    public Object visitBpmnParticipant(BpmnParticipant obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("78790fbb-1688-4071-be5d-28038804c84a")
    @Override
    public Object visitBpmnProcess(BpmnProcess obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("eb8cfffa-078c-4147-a376-63971936d903")
    @Override
    public Object visitBpmnAssociation(BpmnAssociation obj) {
        	return visitBpmnArtifact(obj);
    }

    @objid ("282467d7-867a-401a-9c7c-eaa1efaa87cb")
    @Override
    public Object visitBpmnBaseElement(BpmnBaseElement obj) {
        	return visitModelElement(obj);
    }

    @objid ("ac8ebd8f-980f-4ca2-8b03-c0a680ad0f21")
    @Override
    public Object visitBpmnArtifact(BpmnArtifact obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("07637f03-e843-4a3a-b185-ebf3c8d2980b")
    @Override
    public Object visitBpmnFlowElement(BpmnFlowElement obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("7d76fb76-9c53-440c-bd4b-1b4efeb52613")
    @Override
    public Object visitBpmnFlowNode(BpmnFlowNode obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("11f2e5d6-3ff3-4604-b6ca-e62ca5683fee")
    @Override
    public Object visitBpmnGroup(BpmnGroup obj) {
        	return visitBpmnArtifact(obj);
    }

    @objid ("3e6f17a5-71b5-40d5-a466-5be21011083b")
    @Override
    public Object visitBpmnRootElement(BpmnRootElement obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("598a8ff1-dcdb-4f0a-ace1-e6e1d29f8204")
    @Override
    public Object visitBpmnBehavior(BpmnBehavior obj) {
        	return visitBehavior(obj);
    }

    @objid ("91c66283-01d8-4871-87c1-d34fd1e6d12b")
    @Override
    public Object visitBpmnMessage(BpmnMessage obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("4dd2fc59-d900-4ce9-ab35-e8872b1e0530")
    @Override
    public Object visitBpmnMessageFlow(BpmnMessageFlow obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("dc1c2ffd-88f4-4422-9343-e2be6c3570cd")
    @Override
    public Object visitBpmnSequenceFlow(BpmnSequenceFlow obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("dc6359a7-1f49-4d90-bf0f-fe0d157e1a3e")
    @Override
    public Object visitBpmnActivity(BpmnActivity obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("905ddd1c-cb56-48e3-908a-f1d9ada8c7b9")
    @Override
    public Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj) {
        	return visitBpmnSubProcess(obj);
    }

    @objid ("4e46167d-6542-40ff-a46e-37312c1d9b06")
    @Override
    public Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("075d2314-dbde-490d-970c-0140daa3ffa1")
    @Override
    public Object visitBpmnCallActivity(BpmnCallActivity obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("18a5c7a9-5fb4-4c6b-a48e-9df8dc46be68")
    @Override
    public Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("700d4c64-abae-4b15-9528-75dacb84ab27")
    @Override
    public Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("dbdcb3e4-110f-4fea-8121-57795a71ac95")
    @Override
    public Object visitBpmnManualTask(BpmnManualTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("c77df591-2d4b-4944-8562-8fadc12263bd")
    @Override
    public Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj) {
        	return visitBpmnLoopCharacteristics(obj);
    }

    @objid ("4f51bf21-776e-4bcc-8564-8575db462606")
    @Override
    public Object visitBpmnReceiveTask(BpmnReceiveTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("ae6fbc9d-6da7-4a17-aeee-b7213ddba6c6")
    @Override
    public Object visitBpmnScriptTask(BpmnScriptTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("8dad01b7-1d14-4e66-81be-f5ae4272fe6c")
    @Override
    public Object visitBpmnSendTask(BpmnSendTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("b98ddd6e-7a3c-4c1c-9740-b7f29f4ae042")
    @Override
    public Object visitBpmnServiceTask(BpmnServiceTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("e9d56a8d-f8f9-415e-a0bb-3dc56be5de82")
    @Override
    public Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj) {
        	return visitBpmnLoopCharacteristics(obj);
    }

    @objid ("286e02c0-e276-4019-a0c2-37e8b8c35e8b")
    @Override
    public Object visitBpmnSubProcess(BpmnSubProcess obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("0b687a96-9932-446b-9195-7ef1707cd962")
    @Override
    public Object visitBpmnTask(BpmnTask obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("eceba61b-e1e3-493e-99ec-65ebebc8d45c")
    @Override
    public Object visitBpmnTransaction(BpmnTransaction obj) {
        	return visitBpmnSubProcess(obj);
    }

    @objid ("0226ae4f-96c6-49ea-be47-59c55a976450")
    @Override
    public Object visitBpmnUserTask(BpmnUserTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("311acb56-187b-48b2-aaa8-e558d86e2635")
    @Override
    public Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("585d5b09-9fec-49dd-a52c-067faac5b016")
    @Override
    public Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("fdf83fdd-02d2-4ec4-9516-a40238b01cef")
    @Override
    public Object visitBpmnCatchEvent(BpmnCatchEvent obj) {
        	return visitBpmnEvent(obj);
    }

    @objid ("01103fca-27ee-4f94-8359-19bda8ff631a")
    @Override
    public Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("5914aee7-1dd6-4934-9c1e-56a65c73a12c")
    @Override
    public Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("5e0c4037-e302-4dde-bcd7-9d555bd45e9d")
    @Override
    public Object visitBpmnEndEvent(BpmnEndEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("95e52f0c-8613-4532-9a7a-7982ce4a3225")
    @Override
    public Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("06540c87-4c69-4b7f-a127-7ffa1d86e10f")
    @Override
    public Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("830b1495-2eca-4b7d-8d4d-108e39b89a5e")
    @Override
    public Object visitBpmnEvent(BpmnEvent obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("914e8b79-1f08-4e16-9874-8f85e404ba9d")
    @Override
    public Object visitBpmnEventDefinition(BpmnEventDefinition obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("349770cd-adaf-4c49-a324-0672455ee275")
    @Override
    public Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("ead22d14-f90e-49ef-8022-6cc00c5911ae")
    @Override
    public Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("c75c0bba-c4eb-415b-9178-2270906c353d")
    @Override
    public Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("a26e0e69-7db3-426b-b2e2-6ce4d49b0655")
    @Override
    public Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("db1ced10-1be3-4782-af39-bc904f49d74e")
    @Override
    public Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("b93c4075-692c-4132-b889-4d0561953cf6")
    @Override
    public Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("1eeeb918-8881-46f0-82d1-dce9ca4ce6e5")
    @Override
    public Object visitBpmnStartEvent(BpmnStartEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("b247063d-5106-4a1d-ba54-679fca90a925")
    @Override
    public Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("e4a1c481-18e6-4401-80a9-d910abfb6532")
    @Override
    public Object visitBpmnThrowEvent(BpmnThrowEvent obj) {
        	return visitBpmnEvent(obj);
    }

    @objid ("94077cf1-9a30-4f5d-9886-4a57896cb4f0")
    @Override
    public Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("3d2ecd8f-3587-45f9-9cbc-6cc26c2d5f74")
    @Override
    public Object visitBpmnComplexGateway(BpmnComplexGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("d5f71bff-e079-4dda-a0b0-2de2355d5dff")
    @Override
    public Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("8a6dc8da-a793-4745-b30e-19347fcbb706")
    @Override
    public Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("d1b486d5-4332-4487-af0c-2b22d7983756")
    @Override
    public Object visitBpmnGateway(BpmnGateway obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("2ef9ca89-adc2-472c-8922-f33937c06837")
    @Override
    public Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("5c0a5741-ec02-43b8-9e58-f7d9748fa589")
    @Override
    public Object visitBpmnParallelGateway(BpmnParallelGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("1245609b-dd4c-4ed2-9b4c-603e80a25860")
    @Override
    public Object visitBpmnDataObject(BpmnDataObject obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("43d583c8-3e0f-43e8-9600-0d0ce2ba06e2")
    @Override
    public Object visitBpmnDataStore(BpmnDataStore obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("44323cf3-a876-42cb-b3d3-5064b17277fc")
    @Override
    public Object visitBpmnDataAssociation(BpmnDataAssociation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("887f9e70-be7f-4c14-a9a5-080ddde5c0cf")
    @Override
    public Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("6c007ebc-6193-42b6-af16-3a0e97aa11ab")
    @Override
    public Object visitBpmnDataOutput(BpmnDataOutput obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("61470cb1-b1bc-4ca7-9d3d-33c5219bcf9f")
    @Override
    public Object visitBpmnDataInput(BpmnDataInput obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("589f49e7-326b-4ab8-ada7-a98b318b54b7")
    @Override
    public Object visitBpmnItemAwareElement(BpmnItemAwareElement obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("eb027408-dbc8-4cf1-b868-da64d6d84885")
    @Override
    public Object visitBpmnItemDefinition(BpmnItemDefinition obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("1a647b0f-e53d-4324-a01c-ac8ac2df060f")
    @Override
    public Object visitBpmnDataState(BpmnDataState obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("cf003270-fdcc-485c-9980-ba98f66675e0")
    @Override
    public Object visitBpmnResource(BpmnResource obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("f65bb722-52ce-46fd-acb9-d50a09e7c7ea")
    @Override
    public Object visitBpmnResourceParameter(BpmnResourceParameter obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("cb3ca630-759e-43be-b293-3de775ee42e9")
    @Override
    public Object visitBpmnResourceRole(BpmnResourceRole obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("3baf06ee-d460-470e-901b-a5017bb7f45c")
    @Override
    public Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("af204a26-0557-4dd8-af9f-21e98ff4dc4e")
    @Override
    public Object visitBpmnOperation(BpmnOperation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("c94c56c6-987b-4d9f-91b9-9c6ea1747484")
    @Override
    public Object visitBpmnInterface(BpmnInterface obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("1c6038e2-8964-4de3-b696-479a31bd07b2")
    @Override
    public Object visitBpmnEndPoint(BpmnEndPoint obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("1b69854e-94d1-4770-830f-1719a3090286")
    @Override
    public Object visitAbstractDiagram(AbstractDiagram obj) {
        	return visitModelElement(obj);
    }

    @objid ("29011f68-a65a-4e9d-aa57-abdf6c18cb13")
    @Override
    public Object visitActivityDiagram(ActivityDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("bba71ae8-5985-4a7e-83f4-d45785693b69")
    @Override
    public Object visitBehaviorDiagram(BehaviorDiagram obj) {
        	return visitAbstractDiagram(obj);
    }

    @objid ("db5e6138-4ef5-456a-9c5c-96820751f0ad")
    @Override
    public Object visitClassDiagram(ClassDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("69f0dae2-77e4-496e-8fd3-318e2d9214c4")
    @Override
    public Object visitCommunicationDiagram(CommunicationDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("27636172-2036-4087-ab56-7a48f959eaf6")
    @Override
    public Object visitDeploymentDiagram(DeploymentDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("f20f36e1-b24d-4224-8063-7cf1fbfc3c6c")
    @Override
    public Object visitDiagramSet(DiagramSet obj) {
        	return visitModelElement(obj);
    }

    @objid ("02827fed-59ba-43c8-a745-471f83424c40")
    @Override
    public Object visitSequenceDiagram(SequenceDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("95510e91-b9a5-446e-b860-d16fb5f887bb")
    @Override
    public Object visitStateMachineDiagram(StateMachineDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("1b16f627-db55-4a14-ab74-c3e91ad28d8e")
    @Override
    public Object visitStaticDiagram(StaticDiagram obj) {
        	return visitAbstractDiagram(obj);
    }

    @objid ("c7e6d540-ed26-486b-bddb-534ec87eb8f8")
    @Override
    public Object visitUseCaseDiagram(UseCaseDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("9e5d8296-432d-46a6-ae72-391526e8a678")
    @Override
    public Object visitObjectDiagram(ObjectDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("e557a911-a72c-423c-bfc8-a7460004203e")
    @Override
    public Object visitCompositeStructureDiagram(CompositeStructureDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("3cb94163-e1b8-424c-85a2-87553077b038")
    @Override
    public Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("1efe1585-5a62-4acb-8841-9208683092c1")
    @Override
    public Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("44b6f263-a8a1-4786-a815-103fc4d9dea6")
    @Override
    public Object visitModuleParameter(ModuleParameter obj) {
        	return visitModelElement(obj);
    }

    @objid ("fac41869-32c7-42c3-94c0-1acdce8c4c76")
    @Override
    public Object visitModuleComponent(ModuleComponent obj) {
        	return visitComponent(obj);
    }

    @objid ("ea1451dd-6a39-4b1a-80a2-7b364ea69b7a")
    @Override
    public Object visitProject(Project obj) {
        	return visitModelElement(obj);
    }

}
