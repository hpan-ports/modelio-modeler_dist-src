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

@objid ("00106c06-4f2c-1032-829a-001ec947cd2a")
public class AbstractModelVisitor implements IModelVisitor {
    @objid ("340379bf-7eb1-483b-a2bd-12b8e38ecfe2")
    @Override
    public Object visitAbstraction(Abstraction obj) {
        	return null;
    }

    @objid ("3cdf4289-0fab-4915-8364-2abfad3eaf16")
    @Override
    public Object visitConstraint(Constraint obj) {
        	return null;
    }

    @objid ("0cb62177-9ff3-4bf4-af00-84534e540ea4")
    @Override
    public Object visitDependency(Dependency obj) {
        	return null;
    }

    @objid ("cf316fb0-0a28-4b7c-a149-8c3a30e6e1f3")
    @Override
    public Object visitElement(Element obj) {
        	return null;
    }

    @objid ("6aa9f73f-602a-4c55-a9dc-9d4051862967")
    @Override
    public Object visitModelElement(ModelElement obj) {
        	return null;
    }

    @objid ("477e43d2-c828-413e-b332-bc4516eac9a9")
    @Override
    public Object visitModelTree(ModelTree obj) {
        	return null;
    }

    @objid ("3e5e0987-f569-4851-8676-1f344f244db0")
    @Override
    public Object visitNote(Note obj) {
        	return null;
    }

    @objid ("82934f21-49f5-400c-a542-fca602a521ee")
    @Override
    public Object visitNoteType(NoteType obj) {
        	return null;
    }

    @objid ("b744af16-908a-4be5-8508-ae7f2645dd23")
    @Override
    public Object visitProfile(Profile obj) {
        	return null;
    }

    @objid ("984209c1-af7e-4ac0-a2d4-9276033ff888")
    @Override
    public Object visitStereotype(Stereotype obj) {
        	return null;
    }

    @objid ("bac92989-c336-42bf-97dd-5066a311f65a")
    @Override
    public Object visitSubstitution(Substitution obj) {
        	return null;
    }

    @objid ("72103886-0ce1-45a0-aa5c-8152dd1b29ee")
    @Override
    public Object visitTagParameter(TagParameter obj) {
        	return null;
    }

    @objid ("892b112a-ca2a-42f6-a89e-6bf581dad8c2")
    @Override
    public Object visitTagType(TagType obj) {
        	return null;
    }

    @objid ("85e6c6b6-259e-4d70-ad7f-9a6e77509111")
    @Override
    public Object visitTaggedValue(TaggedValue obj) {
        	return null;
    }

    @objid ("3bae5c0d-02a8-4f01-9cdf-a5fbb4a70424")
    @Override
    public Object visitUsage(Usage obj) {
        	return null;
    }

    @objid ("5dbbf834-a212-4b54-b96c-d44ba305e3a4")
    @Override
    public Object visitMetaclassReference(MetaclassReference obj) {
        	return null;
    }

    @objid ("37905d93-c1b5-41a6-b0a3-39d89ce4132b")
    @Override
    public Object visitExternDocument(ExternDocument obj) {
        	return null;
    }

    @objid ("dfb28dd8-15c2-486b-b979-994c3f9b9205")
    @Override
    public Object visitExternDocumentType(ExternDocumentType obj) {
        	return null;
    }

    @objid ("ed99ca4e-0d7c-4ee8-a32d-2d3fb75815b7")
    @Override
    public Object visitEnumeratedPropertyType(EnumeratedPropertyType obj) {
        	return null;
    }

    @objid ("ba4faf76-dd78-420b-9d8d-c8e8641a9942")
    @Override
    public Object visitLocalPropertyTable(LocalPropertyTable obj) {
        	return null;
    }

    @objid ("6389c6e1-a048-4058-9ecd-9e1dd857faf5")
    @Override
    public Object visitPropertyDefinition(PropertyDefinition obj) {
        	return null;
    }

    @objid ("f89d1945-932f-4a8f-8be5-2138ef218ef6")
    @Override
    public Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj) {
        	return null;
    }

    @objid ("4bf39f67-ad05-4ce8-8e1e-2eb3be3744e2")
    @Override
    public Object visitPropertyTable(PropertyTable obj) {
        	return null;
    }

    @objid ("9b91a879-9a32-40be-93a7-71d9fd38b628")
    @Override
    public Object visitPropertyTableDefinition(PropertyTableDefinition obj) {
        	return null;
    }

    @objid ("7043024b-23a3-4078-8c40-c75099bdca2e")
    @Override
    public Object visitPropertyType(PropertyType obj) {
        	return null;
    }

    @objid ("4a817cca-9fc3-4d28-9919-ce24ecfbd9b6")
    @Override
    public Object visitTypedPropertyTable(TypedPropertyTable obj) {
        	return null;
    }

    @objid ("c204d41a-39ed-4714-9cfa-8fca428907b4")
    @Override
    public Object visitArtifact(Artifact obj) {
        	return null;
    }

    @objid ("92d33f18-5d98-481c-9418-add58631f9f5")
    @Override
    public Object visitAssociationEnd(AssociationEnd obj) {
        	return null;
    }

    @objid ("3b12b736-6e25-4fa4-9d02-36a960a6f980")
    @Override
    public Object visitAttribute(Attribute obj) {
        	return null;
    }

    @objid ("902f3dde-83a6-4330-aaa2-6f67f46218d6")
    @Override
    public Object visitAttributeLink(AttributeLink obj) {
        	return null;
    }

    @objid ("cce900e7-797e-4194-825e-9604cbe6dd0d")
    @Override
    public Object visitBindableInstance(BindableInstance obj) {
        	return null;
    }

    @objid ("e664b634-927a-4d1c-9c2e-83d0a1172a66")
    @Override
    public Object visitBinding(Binding obj) {
        	return null;
    }

    @objid ("117d0749-0ba3-403b-95ec-e12564f38276")
    @Override
    public Object visitClass(Class obj) {
        	return null;
    }

    @objid ("81194f7d-20b6-442f-abb6-f6dea47e6e3b")
    @Override
    public Object visitClassAssociation(ClassAssociation obj) {
        	return null;
    }

    @objid ("076608f9-97b4-403f-a5b9-d98d7f91233e")
    @Override
    public Object visitClassifier(Classifier obj) {
        	return null;
    }

    @objid ("48dfbc6c-8158-472d-954f-c082dc4ec78d")
    @Override
    public Object visitCollaboration(Collaboration obj) {
        	return null;
    }

    @objid ("69dfb9c9-db55-4a02-b63e-041c646d2d87")
    @Override
    public Object visitCollaborationUse(CollaborationUse obj) {
        	return null;
    }

    @objid ("e23700db-1cae-45b8-a68f-9bd27480acf6")
    @Override
    public Object visitComponent(Component obj) {
        	return null;
    }

    @objid ("43ffd1a6-27f9-4d5d-8cb2-b11a5d16437f")
    @Override
    public Object visitNaryConnector(NaryConnector obj) {
        	return null;
    }

    @objid ("44fbc74b-cab1-4b46-af38-edfd313f4849")
    @Override
    public Object visitConnectorEnd(ConnectorEnd obj) {
        	return null;
    }

    @objid ("30e53218-2524-4248-94f1-6bcd9cdee307")
    @Override
    public Object visitDataType(DataType obj) {
        	return null;
    }

    @objid ("2b021619-7cdd-43c5-97a1-1e2655f56576")
    @Override
    public Object visitElementImport(ElementImport obj) {
        	return null;
    }

    @objid ("5948338b-48f6-41ff-85fc-d94bff6db854")
    @Override
    public Object visitElementRealization(ElementRealization obj) {
        	return null;
    }

    @objid ("94d0bb3f-901e-4dde-a6e5-d872cf6cf35b")
    @Override
    public Object visitEnumeration(Enumeration obj) {
        	return null;
    }

    @objid ("f1541171-e0a5-4029-ad6e-db2531b77e76")
    @Override
    public Object visitEnumerationLiteral(EnumerationLiteral obj) {
        	return null;
    }

    @objid ("4c3208e6-bf43-4d8c-bc49-316f9fddf356")
    @Override
    public Object visitFeature(Feature obj) {
        	return null;
    }

    @objid ("42ed20a4-39fb-4073-a648-ae4eef3d032a")
    @Override
    public Object visitGeneralClass(GeneralClass obj) {
        	return null;
    }

    @objid ("4d21557e-9eef-4827-9915-973dd7e73321")
    @Override
    public Object visitGeneralization(Generalization obj) {
        	return null;
    }

    @objid ("86676613-9c01-4b2f-9462-68ed59c5cb6b")
    @Override
    public Object visitInstance(Instance obj) {
        	return null;
    }

    @objid ("491e9e2e-0a67-4c61-8b9e-b15aff8cb459")
    @Override
    public Object visitInterface(Interface obj) {
        	return null;
    }

    @objid ("8c12987e-45f7-48d8-ba4f-bb9ae7b711c8")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization obj) {
        	return null;
    }

    @objid ("9aec485f-4811-4dad-9ce4-7e1cbad1372b")
    @Override
    public Object visitLinkEnd(LinkEnd obj) {
        	return null;
    }

    @objid ("c92a4e97-f9b3-4154-af30-9db8a2cc7a24")
    @Override
    public Object visitManifestation(Manifestation obj) {
        	return null;
    }

    @objid ("589a5796-8f40-4a57-b330-3c18de249ec1")
    @Override
    public Object visitNameSpace(NameSpace obj) {
        	return null;
    }

    @objid ("49ab27fa-6692-4ea1-876c-f72bcbad138d")
    @Override
    public Object visitNamespaceUse(NamespaceUse obj) {
        	return null;
    }

    @objid ("a851e4d5-26ae-4af2-8e95-51f6f62003b8")
    @Override
    public Object visitNode(Node obj) {
        	return null;
    }

    @objid ("53305c3c-dbd7-4bc0-8129-a9f22e1f15ce")
    @Override
    public Object visitOperation(Operation obj) {
        	return null;
    }

    @objid ("338daa4c-58b3-4f60-b471-eb4c2f701a85")
    @Override
    public Object visitPackage(Package obj) {
        	return null;
    }

    @objid ("5daf7943-32f3-4e88-bf36-8cebb18a9b78")
    @Override
    public Object visitPackageImport(PackageImport obj) {
        	return null;
    }

    @objid ("5710b69e-b7f7-44ae-9001-e3e3dacd0c2f")
    @Override
    public Object visitPackageMerge(PackageMerge obj) {
        	return null;
    }

    @objid ("56d9aa81-0e0f-453a-aade-e8683ec901ed")
    @Override
    public Object visitParameter(Parameter obj) {
        	return null;
    }

    @objid ("c583ba21-3d61-46a0-b1a2-08713c8f9e9b")
    @Override
    public Object visitPort(Port obj) {
        	return null;
    }

    @objid ("d8aa2cdd-2345-469c-82dd-2aeb1c3a8e74")
    @Override
    public Object visitProvidedInterface(ProvidedInterface obj) {
        	return null;
    }

    @objid ("6fb9b9ea-15c8-4021-8dd1-8d884a0916e4")
    @Override
    public Object visitRaisedException(RaisedException obj) {
        	return null;
    }

    @objid ("4a808d80-1ce5-459e-a236-2b3165109757")
    @Override
    public Object visitRequiredInterface(RequiredInterface obj) {
        	return null;
    }

    @objid ("1bedfb50-eb14-4240-8589-4479d67f9acd")
    @Override
    public Object visitTemplateBinding(TemplateBinding obj) {
        	return null;
    }

    @objid ("ec2fc01f-4600-4599-8853-03942984d9ba")
    @Override
    public Object visitTemplateParameter(TemplateParameter obj) {
        	return null;
    }

    @objid ("56adaa97-f39a-43ec-a25b-7cabad86d1af")
    @Override
    public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj) {
        	return null;
    }

    @objid ("9325aa3f-d652-4f55-ab6b-f06a1ae45fc2")
    @Override
    public Object visitStructuralFeature(StructuralFeature obj) {
        	return null;
    }

    @objid ("637030f6-5dae-4531-848d-034b00720dbc")
    @Override
    public Object visitBehavioralFeature(BehavioralFeature obj) {
        	return null;
    }

    @objid ("63780b7d-066c-4106-9b97-c5916081e571")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd obj) {
        	return null;
    }

    @objid ("e983362e-3816-4567-976f-f76a6abd3c9a")
    @Override
    public Object visitNaryAssociation(NaryAssociation obj) {
        	return null;
    }

    @objid ("dfd721b8-00f2-4576-9f99-d1141adad5e5")
    @Override
    public Object visitNaryLink(NaryLink obj) {
        	return null;
    }

    @objid ("30892597-5ffb-4345-95b2-df72485c9264")
    @Override
    public Object visitNaryLinkEnd(NaryLinkEnd obj) {
        	return null;
    }

    @objid ("410d70eb-9c12-42b9-8ee8-221ddd36763e")
    @Override
    public Object visitNaryConnectorEnd(NaryConnectorEnd obj) {
        	return null;
    }

    @objid ("8b90d94f-4985-4412-ba5c-eb78371bc7de")
    @Override
    public Object visitAssociation(Association obj) {
        	return null;
    }

    @objid ("e8fe2556-9199-4c86-ba1a-f1dc02cb4093")
    @Override
    public Object visitLink(Link obj) {
        	return null;
    }

    @objid ("e48de625-1926-415d-95c8-43440994ea37")
    @Override
    public Object visitConnector(Connector obj) {
        	return null;
    }

    @objid ("3f107b4c-3b68-4d4e-8188-37c84eb95c0f")
    @Override
    public Object visitAcceptCallEventAction(AcceptCallEventAction obj) {
        	return null;
    }

    @objid ("8f13fb66-861a-457b-884b-5715b0daec7b")
    @Override
    public Object visitAcceptChangeEventAction(AcceptChangeEventAction obj) {
        	return null;
    }

    @objid ("7ca215d1-08d0-4991-abaa-5f103e4817dc")
    @Override
    public Object visitAcceptSignalAction(AcceptSignalAction obj) {
        	return null;
    }

    @objid ("51f9d650-f155-4a6e-a5de-b98535739b0f")
    @Override
    public Object visitAcceptTimeEventAction(AcceptTimeEventAction obj) {
        	return null;
    }

    @objid ("f7be63cd-9c78-449c-ac92-d25708a20b20")
    @Override
    public Object visitActivity(Activity obj) {
        	return null;
    }

    @objid ("5866c193-ed96-4b70-bdfc-5f5c9b96d768")
    @Override
    public Object visitActivityAction(ActivityAction obj) {
        	return null;
    }

    @objid ("debab03d-f494-4de2-af61-1e1fcea9f4e9")
    @Override
    public Object visitActivityEdge(ActivityEdge obj) {
        	return null;
    }

    @objid ("a03ed38b-ec59-40b1-bad6-c8fdc6b854fa")
    @Override
    public Object visitActivityFinalNode(ActivityFinalNode obj) {
        	return null;
    }

    @objid ("cfbed8d0-6e11-4df0-af2a-d56cb8e63fa2")
    @Override
    public Object visitActivityGroup(ActivityGroup obj) {
        	return null;
    }

    @objid ("af2498cd-7447-4526-922c-e59c0e432f5b")
    @Override
    public Object visitActivityNode(ActivityNode obj) {
        	return null;
    }

    @objid ("5e72b0c3-5504-499e-a128-8373615be78b")
    @Override
    public Object visitActivityParameterNode(ActivityParameterNode obj) {
        	return null;
    }

    @objid ("23869d47-7f94-4934-8677-700ca75eff8a")
    @Override
    public Object visitActivityPartition(ActivityPartition obj) {
        	return null;
    }

    @objid ("b816b88a-cff2-4097-8483-20986de11a95")
    @Override
    public Object visitCallAction(CallAction obj) {
        	return null;
    }

    @objid ("0d95250e-1b9c-40b4-aeb8-2afb603e2504")
    @Override
    public Object visitCallBehaviorAction(CallBehaviorAction obj) {
        	return null;
    }

    @objid ("0266bf7a-dd1f-4037-a814-1f94aef44a41")
    @Override
    public Object visitCallOperationAction(CallOperationAction obj) {
        	return null;
    }

    @objid ("c5d337c3-0c4f-43a5-ad0d-50f2409e678a")
    @Override
    public Object visitCentralBufferNode(CentralBufferNode obj) {
        	return null;
    }

    @objid ("8b499e14-e023-4c12-a480-dd34525ffcc7")
    @Override
    public Object visitClause(Clause obj) {
        	return null;
    }

    @objid ("24c3a84c-d6df-43bf-a301-a4c518c178f9")
    @Override
    public Object visitConditionalNode(ConditionalNode obj) {
        	return null;
    }

    @objid ("23d8fca4-e917-484c-8aee-78a12846ee61")
    @Override
    public Object visitControlFlow(ControlFlow obj) {
        	return null;
    }

    @objid ("7ee2f2c4-eeb5-497f-8936-ffe30d98438e")
    @Override
    public Object visitControlNode(ControlNode obj) {
        	return null;
    }

    @objid ("e3623ed0-c12b-40f4-968e-005feb3856f1")
    @Override
    public Object visitDataStoreNode(DataStoreNode obj) {
        	return null;
    }

    @objid ("61e59e73-e1cc-4925-871c-bee775ddea3c")
    @Override
    public Object visitDecisionMergeNode(DecisionMergeNode obj) {
        	return null;
    }

    @objid ("5ce95084-2727-4fd4-ba6b-d60d2487bd9d")
    @Override
    public Object visitExceptionHandler(ExceptionHandler obj) {
        	return null;
    }

    @objid ("8df8991a-d79e-4a64-8848-caaf56404477")
    @Override
    public Object visitExpansionNode(ExpansionNode obj) {
        	return null;
    }

    @objid ("bd2c0d95-8abf-4a28-a9c8-d7fabb025702")
    @Override
    public Object visitExpansionRegion(ExpansionRegion obj) {
        	return null;
    }

    @objid ("ce5a84f4-35ee-4ab4-bc6a-06e79a7c2365")
    @Override
    public Object visitFinalNode(FinalNode obj) {
        	return null;
    }

    @objid ("e6266c23-bd34-4991-a415-fda245eecf5f")
    @Override
    public Object visitFlowFinalNode(FlowFinalNode obj) {
        	return null;
    }

    @objid ("55c99d6c-fa77-4628-a764-10d373156c34")
    @Override
    public Object visitForkJoinNode(ForkJoinNode obj) {
        	return null;
    }

    @objid ("c0ad3922-0d25-48df-9049-b58aeba698fc")
    @Override
    public Object visitInitialNode(InitialNode obj) {
        	return null;
    }

    @objid ("4684a2a4-8299-49cf-9764-91e1a1b6d6e3")
    @Override
    public Object visitInputPin(InputPin obj) {
        	return null;
    }

    @objid ("f1af766d-7200-4280-98e2-e05ad3a0b9ea")
    @Override
    public Object visitInstanceNode(InstanceNode obj) {
        	return null;
    }

    @objid ("96542390-8bf8-4683-988f-1ee9232d05b0")
    @Override
    public Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj) {
        	return null;
    }

    @objid ("e87c9988-3905-428a-b1e2-fed644e4d56d")
    @Override
    public Object visitLoopNode(LoopNode obj) {
        	return null;
    }

    @objid ("c1670fb3-1ac8-4e86-a615-9192c02e7746")
    @Override
    public Object visitMessageFlow(MessageFlow obj) {
        	return null;
    }

    @objid ("e1fb2506-01c7-48d0-b425-70cdce15c9f0")
    @Override
    public Object visitObjectFlow(ObjectFlow obj) {
        	return null;
    }

    @objid ("42ecc06f-3d22-4f1d-a152-03225613efc8")
    @Override
    public Object visitObjectNode(ObjectNode obj) {
        	return null;
    }

    @objid ("c162d7de-a3bb-4ee9-aff8-02969cc2405d")
    @Override
    public Object visitOpaqueAction(OpaqueAction obj) {
        	return null;
    }

    @objid ("448a58dd-8dcf-4e45-9f9d-6cfa19fbb1bc")
    @Override
    public Object visitOutputPin(OutputPin obj) {
        	return null;
    }

    @objid ("d47407ed-3362-4bb7-b346-927d795bf3dc")
    @Override
    public Object visitPin(Pin obj) {
        	return null;
    }

    @objid ("104be1b8-7299-428d-b445-502413300a41")
    @Override
    public Object visitSendSignalAction(SendSignalAction obj) {
        	return null;
    }

    @objid ("f18d2065-97c1-4538-b515-8ef9a210c090")
    @Override
    public Object visitStructuredActivityNode(StructuredActivityNode obj) {
        	return null;
    }

    @objid ("3f96e1a2-ea46-4881-a24a-cc775388a3ec")
    @Override
    public Object visitValuePin(ValuePin obj) {
        	return null;
    }

    @objid ("c2e9e01d-50af-4a69-a57f-1b39a5e2a928")
    @Override
    public Object visitBehavior(Behavior obj) {
        	return null;
    }

    @objid ("bebbc62e-9eff-4b17-b6d2-af3ea1899014")
    @Override
    public Object visitBehaviorParameter(BehaviorParameter obj) {
        	return null;
    }

    @objid ("b6bee279-264e-45ea-86fe-c7975e2a4a5a")
    @Override
    public Object visitOpaqueBehavior(OpaqueBehavior obj) {
        	return null;
    }

    @objid ("bf9da785-6251-4abc-8611-3da316c11e28")
    @Override
    public Object visitSignal(Signal obj) {
        	return null;
    }

    @objid ("ba3f84f6-a2c8-43f4-ae19-13f853206eed")
    @Override
    public Object visitEvent(Event obj) {
        	return null;
    }

    @objid ("55fbdd27-e500-4a2e-ab93-432baf3cd2a7")
    @Override
    public Object visitCombinedFragment(CombinedFragment obj) {
        	return null;
    }

    @objid ("999120dd-e4f5-4b49-9956-50024515bded")
    @Override
    public Object visitDurationConstraint(DurationConstraint obj) {
        	return null;
    }

    @objid ("a48475d9-a9fc-4d55-ba2e-8233afe72332")
    @Override
    public Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj) {
        	return null;
    }

    @objid ("70b83385-7061-4286-85d6-77ae1261f18c")
    @Override
    public Object visitExecutionSpecification(ExecutionSpecification obj) {
        	return null;
    }

    @objid ("0447e560-085a-453c-a3c5-0c723d350b79")
    @Override
    public Object visitGate(Gate obj) {
        	return null;
    }

    @objid ("6253f744-081b-444f-b5ce-3ed214fb1f3c")
    @Override
    public Object visitGeneralOrdering(GeneralOrdering obj) {
        	return null;
    }

    @objid ("8b674822-2a8c-484f-ae9e-1585f7f597b7")
    @Override
    public Object visitInteraction(Interaction obj) {
        	return null;
    }

    @objid ("ed356aa7-af26-4a1e-92ed-242177ef92aa")
    @Override
    public Object visitInteractionFragment(InteractionFragment obj) {
        	return null;
    }

    @objid ("855af9e5-2a46-4810-8ddd-5a31de0bd0cb")
    @Override
    public Object visitInteractionOperand(InteractionOperand obj) {
        	return null;
    }

    @objid ("a3faca88-5cf1-4311-84cb-d09ba8f4d0e7")
    @Override
    public Object visitInteractionUse(InteractionUse obj) {
        	return null;
    }

    @objid ("008228c3-5c22-4561-b95c-0ffd852f9cb4")
    @Override
    public Object visitLifeline(Lifeline obj) {
        	return null;
    }

    @objid ("353de872-6602-4693-aac8-fb8ca18b6228")
    @Override
    public Object visitMessage(Message obj) {
        	return null;
    }

    @objid ("3b29d242-1fd4-4d1a-bf00-5082ab876a9b")
    @Override
    public Object visitMessageEnd(MessageEnd obj) {
        	return null;
    }

    @objid ("43b17d76-17ec-4023-935c-711d9c8182c6")
    @Override
    public Object visitOccurrenceSpecification(OccurrenceSpecification obj) {
        	return null;
    }

    @objid ("797517fb-96e4-404d-965a-c967b238c216")
    @Override
    public Object visitPartDecomposition(PartDecomposition obj) {
        	return null;
    }

    @objid ("038dce43-d1c3-4ced-9343-bf3578a3d90c")
    @Override
    public Object visitStateInvariant(StateInvariant obj) {
        	return null;
    }

    @objid ("d1b3e561-ca47-4455-aacd-c2cb39a2c2c5")
    @Override
    public Object visitTerminateSpecification(TerminateSpecification obj) {
        	return null;
    }

    @objid ("c65ed23e-4e1b-4e91-88fe-e4398b33879f")
    @Override
    public Object visitAbstractPseudoState(AbstractPseudoState obj) {
        	return null;
    }

    @objid ("7419862f-32ea-4116-a2e4-cf2ad305cf82")
    @Override
    public Object visitChoicePseudoState(ChoicePseudoState obj) {
        	return null;
    }

    @objid ("463c15d6-16d8-427d-a6e8-1c773aae7410")
    @Override
    public Object visitConnectionPointReference(ConnectionPointReference obj) {
        	return null;
    }

    @objid ("da0c84cd-dc4d-4c50-8a96-d4961751efbf")
    @Override
    public Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj) {
        	return null;
    }

    @objid ("49dc218b-1a27-4150-96db-7392a7888c84")
    @Override
    public Object visitEntryPointPseudoState(EntryPointPseudoState obj) {
        	return null;
    }

    @objid ("8d8f6363-9cbd-4968-86bd-5e1fff56e1ac")
    @Override
    public Object visitExitPointPseudoState(ExitPointPseudoState obj) {
        	return null;
    }

    @objid ("906f042e-8344-4f4d-9556-bc57a439a8fd")
    @Override
    public Object visitForkPseudoState(ForkPseudoState obj) {
        	return null;
    }

    @objid ("9739c384-04e6-444f-b690-837f47297bf1")
    @Override
    public Object visitInitialPseudoState(InitialPseudoState obj) {
        	return null;
    }

    @objid ("db85f648-c455-4980-a567-994a600add3d")
    @Override
    public Object visitInternalTransition(InternalTransition obj) {
        	return null;
    }

    @objid ("4b249a48-465e-413d-9686-a2fe7f402186")
    @Override
    public Object visitJoinPseudoState(JoinPseudoState obj) {
        	return null;
    }

    @objid ("c297db91-6233-4639-b3a3-deda9891d533")
    @Override
    public Object visitJunctionPseudoState(JunctionPseudoState obj) {
        	return null;
    }

    @objid ("d402ae36-4ca2-4c57-8890-aa726505e7cc")
    @Override
    public Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj) {
        	return null;
    }

    @objid ("22047c3a-e880-48c9-bbc6-27b84ad9e385")
    @Override
    public Object visitState(State obj) {
        	return null;
    }

    @objid ("7bba4acb-f92a-4145-9a6d-4c1b8b8de2cb")
    @Override
    public Object visitStateMachine(StateMachine obj) {
        	return null;
    }

    @objid ("a50d94ff-d758-4274-bc1f-87efb3a0b9fb")
    @Override
    public Object visitStateVertex(StateVertex obj) {
        	return null;
    }

    @objid ("c85d21fc-1f1a-485e-8107-b4af57ce880e")
    @Override
    public Object visitTerminatePseudoState(TerminatePseudoState obj) {
        	return null;
    }

    @objid ("e22e4ef0-88a0-4902-82da-c1ed4313adb4")
    @Override
    public Object visitTransition(Transition obj) {
        	return null;
    }

    @objid ("1cfb2dcd-2ca6-4ba2-a53d-d0b81afc527e")
    @Override
    public Object visitFinalState(FinalState obj) {
        	return null;
    }

    @objid ("1ee3a029-2f6b-4242-a916-9da858188fad")
    @Override
    public Object visitRegion(Region obj) {
        	return null;
    }

    @objid ("d173e854-4ed8-4576-86f2-7b51fc15f2e0")
    @Override
    public Object visitActor(Actor obj) {
        	return null;
    }

    @objid ("bbe098b2-1473-4e06-b996-c1487b0b7047")
    @Override
    public Object visitUseCase(UseCase obj) {
        	return null;
    }

    @objid ("8aa6f4e0-ad3a-4b9d-b74f-53b8eb98256a")
    @Override
    public Object visitUseCaseDependency(UseCaseDependency obj) {
        	return null;
    }

    @objid ("cf7237cc-a435-4865-af55-575bddd4185e")
    @Override
    public Object visitExtensionPoint(ExtensionPoint obj) {
        	return null;
    }

    @objid ("815d7ef7-90cb-4438-99c5-88d25083ff88")
    @Override
    public Object visitAnalystItem(AnalystItem obj) {
        	return null;
    }

    @objid ("42faa91f-ca17-498a-89ee-4fbd7c8c9471")
    @Override
    public Object visitAnalystElement(AnalystElement obj) {
        	return null;
    }

    @objid ("ec067315-177b-449d-a891-a30061b3e8ef")
    @Override
    public Object visitAnalystContainer(AnalystContainer obj) {
        	return null;
    }

    @objid ("cd32f789-0117-4f58-b3ac-e70c7d7dcbae")
    @Override
    public Object visitAnalystProject(AnalystProject obj) {
        	return null;
    }

    @objid ("7c16e074-bd46-4ad1-90ce-a3146000b9c7")
    @Override
    public Object visitAnalystPropertyTable(AnalystPropertyTable obj) {
        	return null;
    }

    @objid ("0cf0fb1c-1f32-4144-a337-c7a1e4a9e33c")
    @Override
    public Object visitBusinessRule(BusinessRule obj) {
        	return null;
    }

    @objid ("a6ef6bf3-fd7e-4a02-ac9d-1133efadbf59")
    @Override
    public Object visitBusinessRuleContainer(BusinessRuleContainer obj) {
        	return null;
    }

    @objid ("872f00a0-f848-4811-8953-981797960aba")
    @Override
    public Object visitDictionary(Dictionary obj) {
        	return null;
    }

    @objid ("d915d4e4-e5c3-4547-85f8-df97d4b10a36")
    @Override
    public Object visitGoal(Goal obj) {
        	return null;
    }

    @objid ("79a25be8-974d-4f94-9a0e-7abc8d16c550")
    @Override
    public Object visitGoalContainer(GoalContainer obj) {
        	return null;
    }

    @objid ("5a43e186-9d8b-4154-aa1b-2e69afdb6d11")
    @Override
    public Object visitPropertyContainer(PropertyContainer obj) {
        	return null;
    }

    @objid ("b9f2212a-b9cf-4977-b170-56ef22a7e22d")
    @Override
    public Object visitRequirement(Requirement obj) {
        	return null;
    }

    @objid ("edb9e960-133f-40de-8c86-76dd63a2b518")
    @Override
    public Object visitRequirementContainer(RequirementContainer obj) {
        	return null;
    }

    @objid ("48877422-6af0-4f7b-8320-3a68b7cdd353")
    @Override
    public Object visitTerm(Term obj) {
        	return null;
    }

    @objid ("bf34aa9d-065e-4765-9e8f-288c105b63e7")
    @Override
    public Object visitInformationFlow(InformationFlow obj) {
        	return null;
    }

    @objid ("18bf4473-0154-4e2f-ae6c-6775953155f0")
    @Override
    public Object visitInformationItem(InformationItem obj) {
        	return null;
    }

    @objid ("35025e55-d864-4782-994e-6dba56bcf0a1")
    @Override
    public Object visitDataFlow(DataFlow obj) {
        	return null;
    }

    @objid ("002bab5a-0bcf-42d2-aeb5-3396e4797d79")
    @Override
    public Object visitCommunicationInteraction(CommunicationInteraction obj) {
        	return null;
    }

    @objid ("5e170acc-1168-4122-83ff-589d9ca8caa9")
    @Override
    public Object visitCommunicationNode(CommunicationNode obj) {
        	return null;
    }

    @objid ("f7b18d5a-ac45-428c-8c06-6d8af00e06cb")
    @Override
    public Object visitCommunicationMessage(CommunicationMessage obj) {
        	return null;
    }

    @objid ("90382e03-15b8-4123-94dc-c6daebe61d18")
    @Override
    public Object visitCommunicationChannel(CommunicationChannel obj) {
        	return null;
    }

    @objid ("f4b9b20f-669d-4dc9-8e21-90142b0fd104")
    @Override
    public Object visitBpmnCollaboration(BpmnCollaboration obj) {
        	return null;
    }

    @objid ("783422f6-2275-460a-b592-ee2061133667")
    @Override
    public Object visitBpmnLane(BpmnLane obj) {
        	return null;
    }

    @objid ("c49d0e88-d618-4b83-841d-c4a419693ba9")
    @Override
    public Object visitBpmnLaneSet(BpmnLaneSet obj) {
        	return null;
    }

    @objid ("49516ce3-cc14-4865-8ff6-41716f1d78c0")
    @Override
    public Object visitBpmnParticipant(BpmnParticipant obj) {
        	return null;
    }

    @objid ("971c8d2c-362c-474a-b930-38628271267c")
    @Override
    public Object visitBpmnProcess(BpmnProcess obj) {
        	return null;
    }

    @objid ("fef59380-0c82-43fb-8206-dc8c9ca1acc3")
    @Override
    public Object visitBpmnAssociation(BpmnAssociation obj) {
        	return null;
    }

    @objid ("abd744e9-f9e0-4987-b491-56b0712e13fd")
    @Override
    public Object visitBpmnBaseElement(BpmnBaseElement obj) {
        	return null;
    }

    @objid ("cef334d1-ac14-4ced-8ce5-e46614146051")
    @Override
    public Object visitBpmnArtifact(BpmnArtifact obj) {
        	return null;
    }

    @objid ("68bbde58-f3d4-46dc-8225-08268ec9ca63")
    @Override
    public Object visitBpmnFlowElement(BpmnFlowElement obj) {
        	return null;
    }

    @objid ("f6994738-323a-4991-8f66-fecbe2e4f83c")
    @Override
    public Object visitBpmnFlowNode(BpmnFlowNode obj) {
        	return null;
    }

    @objid ("020d0692-797c-4b9b-ae4f-bb2c2dcf687d")
    @Override
    public Object visitBpmnGroup(BpmnGroup obj) {
        	return null;
    }

    @objid ("18bdb447-6212-479d-b36a-ecdc4682678b")
    @Override
    public Object visitBpmnRootElement(BpmnRootElement obj) {
        	return null;
    }

    @objid ("8f992a01-8d6d-4267-9c92-9a6e6dbef437")
    @Override
    public Object visitBpmnBehavior(BpmnBehavior obj) {
        	return null;
    }

    @objid ("d49a9845-cf91-44af-b62e-558f29c3a69d")
    @Override
    public Object visitBpmnMessage(BpmnMessage obj) {
        	return null;
    }

    @objid ("9c955146-429b-4735-afce-ad48e05dfbd0")
    @Override
    public Object visitBpmnMessageFlow(BpmnMessageFlow obj) {
        	return null;
    }

    @objid ("b432f60b-eb00-4514-8c76-ff2af620ace1")
    @Override
    public Object visitBpmnSequenceFlow(BpmnSequenceFlow obj) {
        	return null;
    }

    @objid ("d8ddaabe-1cfc-46e7-8268-306a8cd0fb51")
    @Override
    public Object visitBpmnActivity(BpmnActivity obj) {
        	return null;
    }

    @objid ("eb4f6162-ec32-439a-9da0-f17274e9aedd")
    @Override
    public Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj) {
        	return null;
    }

    @objid ("bfe20d28-69cf-47c3-9f30-8b8cb30555cc")
    @Override
    public Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj) {
        	return null;
    }

    @objid ("220d7557-6aed-48f0-9732-9436b6443b0a")
    @Override
    public Object visitBpmnCallActivity(BpmnCallActivity obj) {
        	return null;
    }

    @objid ("3b22482c-de0d-461d-963f-cc739b58eda9")
    @Override
    public Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj) {
        	return null;
    }

    @objid ("cf768d40-5cb9-449c-89cf-48c256fb44e2")
    @Override
    public Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj) {
        	return null;
    }

    @objid ("6d19cb94-0cb3-4938-9899-b7fd2b75fa09")
    @Override
    public Object visitBpmnManualTask(BpmnManualTask obj) {
        	return null;
    }

    @objid ("4f6e13ce-9b24-438b-81cd-00117e2072bc")
    @Override
    public Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj) {
        	return null;
    }

    @objid ("a261648d-13d1-42b8-8e28-38d53d3541a2")
    @Override
    public Object visitBpmnReceiveTask(BpmnReceiveTask obj) {
        	return null;
    }

    @objid ("b03fbed6-d003-47b1-a88d-96ce7d91971c")
    @Override
    public Object visitBpmnScriptTask(BpmnScriptTask obj) {
        	return null;
    }

    @objid ("f8ccceab-9e85-46d0-b67d-be4f0d5e41c9")
    @Override
    public Object visitBpmnSendTask(BpmnSendTask obj) {
        	return null;
    }

    @objid ("acdb6fc9-37d7-49c6-b2c1-6bdb6b9026eb")
    @Override
    public Object visitBpmnServiceTask(BpmnServiceTask obj) {
        	return null;
    }

    @objid ("378bab87-4fff-4be0-97df-fbcd7e7f1a8c")
    @Override
    public Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj) {
        	return null;
    }

    @objid ("b79e87a0-a5c4-4743-8b9e-5090250c8780")
    @Override
    public Object visitBpmnSubProcess(BpmnSubProcess obj) {
        	return null;
    }

    @objid ("8478b979-f4be-42ee-a255-811b6743e846")
    @Override
    public Object visitBpmnTask(BpmnTask obj) {
        	return null;
    }

    @objid ("bf491a97-b165-4b72-93d3-51a0b17f6f1a")
    @Override
    public Object visitBpmnTransaction(BpmnTransaction obj) {
        	return null;
    }

    @objid ("2c203b2c-77fb-4eaf-8064-2028ec703b6f")
    @Override
    public Object visitBpmnUserTask(BpmnUserTask obj) {
        	return null;
    }

    @objid ("3ef9d511-6633-49f0-9c80-92afe6f8c59e")
    @Override
    public Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj) {
        	return null;
    }

    @objid ("7119fdd8-cf78-4ce2-9780-97e12f9b84d6")
    @Override
    public Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj) {
        	return null;
    }

    @objid ("34fb1d5b-0779-4130-a317-2e1a0986410e")
    @Override
    public Object visitBpmnCatchEvent(BpmnCatchEvent obj) {
        	return null;
    }

    @objid ("fb7b8c67-ec93-4017-82d7-72a67f3c404e")
    @Override
    public Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj) {
        	return null;
    }

    @objid ("3fc0ac79-59a9-4aa5-aceb-712f824eb658")
    @Override
    public Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj) {
        	return null;
    }

    @objid ("fc3fe256-c2fa-46e4-bca1-6497fe78038d")
    @Override
    public Object visitBpmnEndEvent(BpmnEndEvent obj) {
        	return null;
    }

    @objid ("cc27dac5-35db-4daf-98a7-ab2b7c3dffc3")
    @Override
    public Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj) {
        	return null;
    }

    @objid ("e54db97b-44ba-41d3-99da-b237029cb125")
    @Override
    public Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj) {
        	return null;
    }

    @objid ("13b880e0-3d2a-4ee0-96b8-5c28ebe9c3c0")
    @Override
    public Object visitBpmnEvent(BpmnEvent obj) {
        	return null;
    }

    @objid ("adeb8b84-da13-4e1b-bd73-0effd494523c")
    @Override
    public Object visitBpmnEventDefinition(BpmnEventDefinition obj) {
        	return null;
    }

    @objid ("bcf556e3-8f7f-4c57-841c-052f77833845")
    @Override
    public Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj) {
        	return null;
    }

    @objid ("f3559298-91b3-4df8-b08d-3df129adf87b")
    @Override
    public Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj) {
        	return null;
    }

    @objid ("e5c20a6e-7083-448e-a69f-409f7ec1b001")
    @Override
    public Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj) {
        	return null;
    }

    @objid ("d87455d6-ff50-404e-8906-5052f966cfc7")
    @Override
    public Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj) {
        	return null;
    }

    @objid ("9040977e-5ccb-4b0d-9056-febeb6157965")
    @Override
    public Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj) {
        	return null;
    }

    @objid ("afc8d316-8397-4c1b-a438-24c42484f9d0")
    @Override
    public Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj) {
        	return null;
    }

    @objid ("eac25959-37ed-49f4-b79c-758da8cefc47")
    @Override
    public Object visitBpmnStartEvent(BpmnStartEvent obj) {
        	return null;
    }

    @objid ("bf1cd8af-bbcd-446c-99fb-971cb3047c03")
    @Override
    public Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj) {
        	return null;
    }

    @objid ("0b65b18d-2261-41a8-ba2f-f9a84230a5e5")
    @Override
    public Object visitBpmnThrowEvent(BpmnThrowEvent obj) {
        	return null;
    }

    @objid ("ad9fc70a-e5a1-4c31-8f84-88653edb0388")
    @Override
    public Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj) {
        	return null;
    }

    @objid ("5002e960-84f1-42bc-a1dc-21d5c3dcd9b4")
    @Override
    public Object visitBpmnComplexGateway(BpmnComplexGateway obj) {
        	return null;
    }

    @objid ("be9d2825-6a41-4859-9ad7-fa071aeb7e5d")
    @Override
    public Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj) {
        	return null;
    }

    @objid ("415cb32d-97b3-4e9a-8700-bdb4c130e9e6")
    @Override
    public Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj) {
        	return null;
    }

    @objid ("ad6c3c19-c9f7-4ab8-b2b5-9cde9be535e5")
    @Override
    public Object visitBpmnGateway(BpmnGateway obj) {
        	return null;
    }

    @objid ("6bdf5bee-e9db-42ff-9c37-88d4ca7419c0")
    @Override
    public Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj) {
        	return null;
    }

    @objid ("30d9809d-b170-48bf-a2d2-08bd2930a436")
    @Override
    public Object visitBpmnParallelGateway(BpmnParallelGateway obj) {
        	return null;
    }

    @objid ("74daa36c-2a72-42a5-8e38-3e317e454adc")
    @Override
    public Object visitBpmnDataObject(BpmnDataObject obj) {
        	return null;
    }

    @objid ("1011c46a-b88e-4004-9f55-d63ed9a91e23")
    @Override
    public Object visitBpmnDataStore(BpmnDataStore obj) {
        	return null;
    }

    @objid ("80165ec4-946c-4dbf-8016-c3edde923f9e")
    @Override
    public Object visitBpmnDataAssociation(BpmnDataAssociation obj) {
        	return null;
    }

    @objid ("6c043928-0ca8-40da-853b-21437785c1a6")
    @Override
    public Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj) {
        	return null;
    }

    @objid ("ed0c884b-efdb-497a-bbad-69dd57248a96")
    @Override
    public Object visitBpmnDataOutput(BpmnDataOutput obj) {
        	return null;
    }

    @objid ("4e11c640-7e6e-44a6-8e12-bc0372067aee")
    @Override
    public Object visitBpmnDataInput(BpmnDataInput obj) {
        	return null;
    }

    @objid ("2173d028-10f9-4a7a-89fd-73e2133aa31a")
    @Override
    public Object visitBpmnItemAwareElement(BpmnItemAwareElement obj) {
        	return null;
    }

    @objid ("789d1fc7-9893-48be-96cb-1130bf6867f7")
    @Override
    public Object visitBpmnItemDefinition(BpmnItemDefinition obj) {
        	return null;
    }

    @objid ("3bedd9d1-46ec-40d9-9860-dadbbc52b051")
    @Override
    public Object visitBpmnDataState(BpmnDataState obj) {
        	return null;
    }

    @objid ("2270b1d3-37bd-4432-84ce-41aed1b142d4")
    @Override
    public Object visitBpmnResource(BpmnResource obj) {
        	return null;
    }

    @objid ("fd27034d-2aae-4c48-ab60-3d15b62cbc78")
    @Override
    public Object visitBpmnResourceParameter(BpmnResourceParameter obj) {
        	return null;
    }

    @objid ("74dda720-5a63-4589-b8e2-ffd4587ce5b1")
    @Override
    public Object visitBpmnResourceRole(BpmnResourceRole obj) {
        	return null;
    }

    @objid ("0a66ba48-2154-4300-94b5-eddec1927e5e")
    @Override
    public Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj) {
        	return null;
    }

    @objid ("05023582-6c09-404d-8394-853fdfa1c5a4")
    @Override
    public Object visitBpmnOperation(BpmnOperation obj) {
        	return null;
    }

    @objid ("b4c08512-823f-49a4-85b5-e39c346ca4d6")
    @Override
    public Object visitBpmnInterface(BpmnInterface obj) {
        	return null;
    }

    @objid ("1236e44d-75bc-472b-80e9-83ff70aca47c")
    @Override
    public Object visitBpmnEndPoint(BpmnEndPoint obj) {
        	return null;
    }

    @objid ("4aae451a-99f0-4117-a3e2-d53a3014c032")
    @Override
    public Object visitAbstractDiagram(AbstractDiagram obj) {
        	return null;
    }

    @objid ("6804fb78-ebe2-4c0e-9ca8-74f4c917e957")
    @Override
    public Object visitActivityDiagram(ActivityDiagram obj) {
        	return null;
    }

    @objid ("2f79fd88-4389-45e8-a86d-902f42819338")
    @Override
    public Object visitBehaviorDiagram(BehaviorDiagram obj) {
        	return null;
    }

    @objid ("83a76b0f-71c7-4048-8d29-fa657c069268")
    @Override
    public Object visitClassDiagram(ClassDiagram obj) {
        	return null;
    }

    @objid ("a01072c8-a053-4199-8687-8114aa2088ef")
    @Override
    public Object visitCommunicationDiagram(CommunicationDiagram obj) {
        	return null;
    }

    @objid ("871bfe11-648f-4e0c-98f0-fe565a36baec")
    @Override
    public Object visitDeploymentDiagram(DeploymentDiagram obj) {
        	return null;
    }

    @objid ("ffb53c4f-fb6b-43bf-9189-41cc6ec93dec")
    @Override
    public Object visitDiagramSet(DiagramSet obj) {
        	return null;
    }

    @objid ("5bd61ef5-70a3-4070-a11f-9322db73ef15")
    @Override
    public Object visitSequenceDiagram(SequenceDiagram obj) {
        	return null;
    }

    @objid ("7d6c64b2-08c9-408d-aeac-ad8201f717a0")
    @Override
    public Object visitStateMachineDiagram(StateMachineDiagram obj) {
        	return null;
    }

    @objid ("133a18e7-bb7f-48fb-b954-e08bb99f4d38")
    @Override
    public Object visitStaticDiagram(StaticDiagram obj) {
        	return null;
    }

    @objid ("2949e539-2ae3-46a6-918a-9dc5e8a45e6d")
    @Override
    public Object visitUseCaseDiagram(UseCaseDiagram obj) {
        	return null;
    }

    @objid ("90f034f6-2b65-4148-9f2b-1e43c26bd539")
    @Override
    public Object visitObjectDiagram(ObjectDiagram obj) {
        	return null;
    }

    @objid ("7c630733-78f8-4409-b374-51991bd8419e")
    @Override
    public Object visitCompositeStructureDiagram(CompositeStructureDiagram obj) {
        	return null;
    }

    @objid ("251ca27e-65bc-479e-ae51-c7072db0743e")
    @Override
    public Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj) {
        	return null;
    }

    @objid ("a951b064-111b-464d-80c9-cf85124ac716")
    @Override
    public Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj) {
        	return null;
    }

    @objid ("398bede0-3eaf-48af-8b4d-ee358203cce8")
    @Override
    public Object visitModuleParameter(ModuleParameter obj) {
        	return null;
    }

    @objid ("29edfe4d-2566-40b0-b6b6-73f484148d16")
    @Override
    public Object visitModuleComponent(ModuleComponent obj) {
        	return null;
    }

    @objid ("c72aeae9-85c5-4ce3-b083-66249445e91f")
    @Override
    public Object visitProject(Project obj) {
        	return null;
    }

}
