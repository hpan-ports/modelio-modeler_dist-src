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
 Metamodel: Standard, version 9024, by Modeliosoft
 Generator version: 3.0.01.9022
 Generated on: 28 janv. 2015
 */
/* WARNING: GENERATED FILE -  DO NOT EDIT
 Metamodel: Standard, version 0.0.9024, by Modeliosoft
 Generator version: 3.2.10.9023
 Generated on: Mar 19, 2015
 */
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
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

/**
 * This class is an implementation of IModelVisitor whose default strategy consists in transmitting the visit call to the super class visit method.
 * This process ends up to the Element metaclass for which <code>null</code> is returned.
 */
@objid ("00280eec-4f2c-1032-829a-001ec947cd2a")
public class DefaultModelVisitor implements IModelVisitor {
    @objid ("f5b8db98-7d56-4a0c-9773-5b672cead061")
    @Override
    public Object visitAbstractDiagram(AbstractDiagram obj) {
        	return visitModelElement(obj);
    }

    @objid ("fc8b2510-5b60-488f-a38b-c766c95f4340")
    @Override
    public Object visitAbstractPseudoState(AbstractPseudoState obj) {
        	return visitStateVertex(obj);
    }

    @objid ("3d0c590b-0465-4d41-a15d-c6a28e351f1a")
    @Override
    public Object visitAbstraction(Abstraction obj) {
        	return visitDependency(obj);
    }

    @objid ("f2001e35-23dc-4fdd-9a3c-0ed8c2e8ae14")
    @Override
    public Object visitAcceptCallEventAction(AcceptCallEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("553c550c-a105-41f9-8430-525768656dd5")
    @Override
    public Object visitAcceptChangeEventAction(AcceptChangeEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("2f3bada0-0667-44c1-b7b4-4cd0de8817c8")
    @Override
    public Object visitAcceptSignalAction(AcceptSignalAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("09e53709-1ad0-439e-9539-39402831190c")
    @Override
    public Object visitAcceptTimeEventAction(AcceptTimeEventAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("f6071496-9187-48e5-8b90-330b40d60395")
    @Override
    public Object visitActivity(Activity obj) {
        	return visitBehavior(obj);
    }

    @objid ("68677d74-6e26-4456-afd9-3b359fed1e4b")
    @Override
    public Object visitActivityAction(ActivityAction obj) {
        	return visitActivityNode(obj);
    }

    @objid ("85b39e47-fcec-4d11-afeb-e12f7185eaf8")
    @Override
    public Object visitActivityDiagram(ActivityDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("2423f336-8297-414a-b428-4f287a097d85")
    @Override
    public Object visitActivityEdge(ActivityEdge obj) {
        	return visitModelElement(obj);
    }

    @objid ("bbf4fae1-3d7a-4f1f-a87e-8f44d70b9ef0")
    @Override
    public Object visitActivityFinalNode(ActivityFinalNode obj) {
        	return visitFinalNode(obj);
    }

    @objid ("c939b96f-0131-42fd-add5-dfb5f4b579e0")
    @Override
    public Object visitActivityGroup(ActivityGroup obj) {
        	return visitModelElement(obj);
    }

    @objid ("0ce8d409-252a-4567-8b61-839702a50c8a")
    @Override
    public Object visitActivityNode(ActivityNode obj) {
        	return visitModelElement(obj);
    }

    @objid ("9de40f4e-c9cd-4fd7-b730-34be4d1c79c2")
    @Override
    public Object visitActivityParameterNode(ActivityParameterNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("8ae68a77-8ada-45b7-b243-82c9d5ceaf4c")
    @Override
    public Object visitActivityPartition(ActivityPartition obj) {
        	return visitActivityGroup(obj);
    }

    @objid ("fa82f766-21fe-468f-9581-173b33c61408")
    @Override
    public Object visitActor(Actor obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("6e7496ff-c803-4ec7-b2b4-1f569fc9a655")
    @Override
    public Object visitAnalystContainer(AnalystContainer obj) {
        	return visitAnalystItem(obj);
    }

    @objid ("eacc1aa5-bd0f-49fd-9862-5d1344c9ef3d")
    @Override
    public Object visitAnalystElement(AnalystElement obj) {
        	return visitAnalystItem(obj);
    }

    @objid ("433aaffa-4878-4b90-8c47-d8f8654ac861")
    @Override
    public Object visitAnalystItem(AnalystItem obj) {
        	return visitModelElement(obj);
    }

    @objid ("9692ac2c-a54a-4e6a-80b9-2d45ab594102")
    @Override
    public Object visitAnalystProject(AnalystProject obj) {
        	return visitModelElement(obj);
    }

    @objid ("774cd2ef-a631-44c8-ae94-9778b8f2bbeb")
    @Override
    public Object visitAnalystPropertyTable(AnalystPropertyTable obj) {
        	return visitTypedPropertyTable(obj);
    }

    @objid ("ac519ec3-326d-40a4-887c-98332496a7b9")
    @Override
    public Object visitArtifact(Artifact obj) {
        	return visitClassifier(obj);
    }

    @objid ("dbae308b-ce5f-4c12-936a-ab7e11849783")
    @Override
    public Object visitAssociation(Association obj) {
        	return visitModelElement(obj);
    }

    @objid ("08cda1e4-f918-4846-87d9-72359b69bade")
    @Override
    public Object visitAssociationEnd(AssociationEnd obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("4de770dc-5f43-4b2a-969e-d779b304e28c")
    @Override
    public Object visitAttribute(Attribute obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("39a30359-3df3-408b-9622-68d61b48a499")
    @Override
    public Object visitAttributeLink(AttributeLink obj) {
        	return visitModelElement(obj);
    }

    @objid ("be3c1b0d-5189-453d-af4b-f8fc247e05c5")
    @Override
    public Object visitBehavior(Behavior obj) {
        	return visitModelElement(obj);
    }

    @objid ("d6377062-b205-43f0-873d-a97c7007e191")
    @Override
    public Object visitBehaviorDiagram(BehaviorDiagram obj) {
        	return visitAbstractDiagram(obj);
    }

    @objid ("5c4234e4-409f-4944-aadb-3fb8fc66f6e0")
    @Override
    public Object visitBehaviorParameter(BehaviorParameter obj) {
        	return visitParameter(obj);
    }

    @objid ("dbc7c4dc-90d7-414a-a3a3-bffb55bc33a0")
    @Override
    public Object visitBehavioralFeature(BehavioralFeature obj) {
        	return visitFeature(obj);
    }

    @objid ("26f22397-75f8-48f6-8839-1070d3fe05bf")
    @Override
    public Object visitBindableInstance(BindableInstance obj) {
        	return visitInstance(obj);
    }

    @objid ("0816a4c6-e4b4-4cfa-acc5-c7ac764defd1")
    @Override
    public Object visitBinding(Binding obj) {
        	return visitModelElement(obj);
    }

    @objid ("661ee322-c9a2-445d-836c-e76dbc3e5739")
    @Override
    public Object visitBpmnActivity(BpmnActivity obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("1bdb5c76-9664-4758-989b-08e8e5a9a7a8")
    @Override
    public Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj) {
        	return visitBpmnSubProcess(obj);
    }

    @objid ("c3dc6dba-f53e-460b-be5b-de62e38b7868")
    @Override
    public Object visitBpmnArtifact(BpmnArtifact obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("6f2cf411-2d0a-4c1e-8bf6-3ea39132ec2f")
    @Override
    public Object visitBpmnAssociation(BpmnAssociation obj) {
        	return visitBpmnArtifact(obj);
    }

    @objid ("e57a4e7d-ceb3-48de-9fd2-f90c05642076")
    @Override
    public Object visitBpmnBaseElement(BpmnBaseElement obj) {
        	return visitModelElement(obj);
    }

    @objid ("4f4b3ac5-987f-4fdb-9ef8-466d69d44d65")
    @Override
    public Object visitBpmnBehavior(BpmnBehavior obj) {
        	return visitBehavior(obj);
    }

    @objid ("b361a001-2fa0-4b43-931b-dfb048809599")
    @Override
    public Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("8daec716-c4a1-4129-a366-01603164f4dc")
    @Override
    public Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("71dfaa6b-21d5-44e3-a7fe-c10c75a84c8e")
    @Override
    public Object visitBpmnCallActivity(BpmnCallActivity obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("4ddea49d-ac2b-4334-8217-a09c85dd5ddf")
    @Override
    public Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("cc9d3c9a-a400-4e65-ae6d-dd81c56df607")
    @Override
    public Object visitBpmnCatchEvent(BpmnCatchEvent obj) {
        	return visitBpmnEvent(obj);
    }

    @objid ("62bac0fc-eaab-4eb1-896b-142f016b2bd0")
    @Override
    public Object visitBpmnCollaboration(BpmnCollaboration obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("821e465e-8cea-4aef-889c-2779eed89439")
    @Override
    public Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("3c23c53d-be98-45bd-89c8-0455864d4483")
    @Override
    public Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("e719aaf5-53c5-4b61-8c32-670b97a6c960")
    @Override
    public Object visitBpmnComplexGateway(BpmnComplexGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("026f6a5a-0897-466c-a8ab-2d066240bf53")
    @Override
    public Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("d564248e-a9ab-4dae-83c4-437335555339")
    @Override
    public Object visitBpmnDataAssociation(BpmnDataAssociation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("9b2cbc6c-586b-4c06-b0ed-0c473c6dbe4f")
    @Override
    public Object visitBpmnDataInput(BpmnDataInput obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("bfff0897-e974-4ee9-aaed-0d596125f0c5")
    @Override
    public Object visitBpmnDataObject(BpmnDataObject obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("d2eb7bc2-4a02-484b-a46b-35d1eb8c54be")
    @Override
    public Object visitBpmnDataOutput(BpmnDataOutput obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("2f43528e-b414-452a-aa53-1049f278b776")
    @Override
    public Object visitBpmnDataState(BpmnDataState obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("e494d739-93d8-445f-81e9-b168a8cf8507")
    @Override
    public Object visitBpmnDataStore(BpmnDataStore obj) {
        	return visitBpmnItemAwareElement(obj);
    }

    @objid ("08438428-5468-4b07-9936-7355db77fd10")
    @Override
    public Object visitBpmnEndEvent(BpmnEndEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("dd8f2d4a-2c31-4850-81c8-e0e39ed0af3b")
    @Override
    public Object visitBpmnEndPoint(BpmnEndPoint obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("1d24fddb-23b0-4db3-a10c-bd0fd0899a21")
    @Override
    public Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("1f79ecd7-f0e5-483e-beab-c4ab49597a36")
    @Override
    public Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("141519f6-a036-4aca-b345-01f702bf9afd")
    @Override
    public Object visitBpmnEvent(BpmnEvent obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("c9b31211-30b3-4e78-b269-978b3319a0db")
    @Override
    public Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("ba0395ef-55b2-4fad-b1ea-9f8b991f8a19")
    @Override
    public Object visitBpmnEventDefinition(BpmnEventDefinition obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("96c3dffb-c812-4a00-a9f1-3a9d2c98026c")
    @Override
    public Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("65b799c8-4494-454c-8fd8-a8af3d50f66b")
    @Override
    public Object visitBpmnFlowElement(BpmnFlowElement obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("a5413820-f261-4f6d-a5b3-0e4558f3134f")
    @Override
    public Object visitBpmnFlowNode(BpmnFlowNode obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("b437b596-53cb-4450-be2d-96b6f5b4ed32")
    @Override
    public Object visitBpmnGateway(BpmnGateway obj) {
        	return visitBpmnFlowNode(obj);
    }

    @objid ("701b5a2f-ae69-471a-ad14-1d2e341517b6")
    @Override
    public Object visitBpmnGroup(BpmnGroup obj) {
        	return visitBpmnArtifact(obj);
    }

    @objid ("05e7ddba-b638-42bc-8b18-24af7cc05a97")
    @Override
    public Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("4eabc282-f665-45fb-9f4b-bbccd591ec79")
    @Override
    public Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("04263649-dae1-4e73-b65a-b0f803de76b6")
    @Override
    public Object visitBpmnInterface(BpmnInterface obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("fb15e367-8287-4337-901e-3c56904ec592")
    @Override
    public Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("d3aa5419-b7be-4d3a-bd98-0d957e890594")
    @Override
    public Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj) {
        	return visitBpmnThrowEvent(obj);
    }

    @objid ("37a433ce-84c1-43ef-b5c8-34fa52d825ee")
    @Override
    public Object visitBpmnItemAwareElement(BpmnItemAwareElement obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("2221afe5-1fae-4996-8175-57ef1f87140f")
    @Override
    public Object visitBpmnItemDefinition(BpmnItemDefinition obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("ab41abd8-d89c-4de9-b0e4-a1b4f985cc74")
    @Override
    public Object visitBpmnLane(BpmnLane obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("096dd3f4-05cb-4815-8657-a79705693088")
    @Override
    public Object visitBpmnLaneSet(BpmnLaneSet obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("7a0916a6-8ce1-43d2-9b9a-0dca8ad02b6e")
    @Override
    public Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("8bb2b928-429b-4261-96a2-8d840110fa64")
    @Override
    public Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("a2f612f5-3a16-4dd6-bfa8-4a2be771cdef")
    @Override
    public Object visitBpmnManualTask(BpmnManualTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("9429ba00-a3d2-4674-8cb4-c8f6e8e7a58b")
    @Override
    public Object visitBpmnMessage(BpmnMessage obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("558e12fd-6f0b-40c8-a6db-2778a306412a")
    @Override
    public Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("8db74bfb-c5ae-4b9f-9e7a-63e646add0e8")
    @Override
    public Object visitBpmnMessageFlow(BpmnMessageFlow obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("95de49bd-35e0-44b9-aca8-233af7e4c419")
    @Override
    public Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj) {
        	return visitBpmnLoopCharacteristics(obj);
    }

    @objid ("6763ce94-429b-45db-b942-0882a9a9ab08")
    @Override
    public Object visitBpmnOperation(BpmnOperation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("3a39105e-953e-4e81-9e40-b887dcd3c670")
    @Override
    public Object visitBpmnParallelGateway(BpmnParallelGateway obj) {
        	return visitBpmnGateway(obj);
    }

    @objid ("c877a53f-3bfe-4a54-96d0-267f3f2b6187")
    @Override
    public Object visitBpmnParticipant(BpmnParticipant obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("c50f811a-24d4-4bc8-8315-384a89be3c51")
    @Override
    public Object visitBpmnProcess(BpmnProcess obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("d4cd3f2b-5969-4ef5-ac42-9fbd05eaf2de")
    @Override
    public Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("d37e52bb-2232-475a-a8e8-87118bfd9ad9")
    @Override
    public Object visitBpmnReceiveTask(BpmnReceiveTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("70df4115-49e8-4cc6-9294-cf9e40a470d6")
    @Override
    public Object visitBpmnResource(BpmnResource obj) {
        	return visitBpmnRootElement(obj);
    }

    @objid ("57a3ecfa-a482-47bd-82ab-7bb648d4a299")
    @Override
    public Object visitBpmnResourceParameter(BpmnResourceParameter obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("1341fa13-0b2c-4bdb-9df8-1d7639ba5ba2")
    @Override
    public Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("215a714d-81e3-4589-9229-4a2cd35848f4")
    @Override
    public Object visitBpmnResourceRole(BpmnResourceRole obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("d0882fda-75a9-4ec7-99df-0cd3ee25a1bc")
    @Override
    public Object visitBpmnRootElement(BpmnRootElement obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("b4fc1d25-c4c5-40b7-9f79-0e6f79ca6b78")
    @Override
    public Object visitBpmnScriptTask(BpmnScriptTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("d0752414-7d59-4265-a951-595f18f91c04")
    @Override
    public Object visitBpmnSendTask(BpmnSendTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("8a9a9bbd-aac2-4e08-b57a-49ca64eb1953")
    @Override
    public Object visitBpmnSequenceFlow(BpmnSequenceFlow obj) {
        	return visitBpmnFlowElement(obj);
    }

    @objid ("e4077db3-63ca-4aca-a872-e232b8651697")
    @Override
    public Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj) {
        	return visitBpmnBaseElement(obj);
    }

    @objid ("59d6ec5c-6b77-43b8-a119-3f3dbafd1484")
    @Override
    public Object visitBpmnServiceTask(BpmnServiceTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("4f4bed88-c5f5-4a95-a2f4-859fc89e09a8")
    @Override
    public Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("3c5ebc61-4b3a-4d7c-8841-9573ae86088e")
    @Override
    public Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj) {
        	return visitBpmnLoopCharacteristics(obj);
    }

    @objid ("8dec71c1-bbe7-4720-b3e4-b688a11eb000")
    @Override
    public Object visitBpmnStartEvent(BpmnStartEvent obj) {
        	return visitBpmnCatchEvent(obj);
    }

    @objid ("90d15d2f-172a-48f0-a531-ff95fd7f9da3")
    @Override
    public Object visitBpmnSubProcess(BpmnSubProcess obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("00862e2c-c770-4475-8ebb-60a4e73e93b4")
    @Override
    public Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("0e4bcbeb-4302-49f4-9950-dc0faf6ff10a")
    @Override
    public Object visitBpmnTask(BpmnTask obj) {
        	return visitBpmnActivity(obj);
    }

    @objid ("ff1b7555-f25c-4af1-b8f1-4d10da354208")
    @Override
    public Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("bda339e9-491f-4687-9919-4431e322b399")
    @Override
    public Object visitBpmnThrowEvent(BpmnThrowEvent obj) {
        	return visitBpmnEvent(obj);
    }

    @objid ("70c52e5c-7c60-4f9d-937c-5c0847b48c83")
    @Override
    public Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj) {
        	return visitBpmnEventDefinition(obj);
    }

    @objid ("36d5cfb2-d16f-4cdd-98ca-0841920b9792")
    @Override
    public Object visitBpmnTransaction(BpmnTransaction obj) {
        	return visitBpmnSubProcess(obj);
    }

    @objid ("b026b45c-f33c-45e9-af31-7a0392fe289d")
    @Override
    public Object visitBpmnUserTask(BpmnUserTask obj) {
        	return visitBpmnTask(obj);
    }

    @objid ("c99d3b73-598b-475f-a96a-dbbdf3f50da2")
    @Override
    public Object visitBusinessRule(BusinessRule obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("4837940a-49c3-417b-bf15-0714ba26dac4")
    @Override
    public Object visitBusinessRuleContainer(BusinessRuleContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("73a526fa-0d67-4d79-8d21-94ef68abc8ba")
    @Override
    public Object visitCallAction(CallAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("57a2db65-7f24-4eb2-a405-d9b4b36bb72c")
    @Override
    public Object visitCallBehaviorAction(CallBehaviorAction obj) {
        	return visitCallAction(obj);
    }

    @objid ("2a24e888-9bfd-4053-bf00-c4a85253bea9")
    @Override
    public Object visitCallOperationAction(CallOperationAction obj) {
        	return visitCallAction(obj);
    }

    @objid ("63c3c1ab-7e35-481b-abdc-1154da0e6317")
    @Override
    public Object visitCentralBufferNode(CentralBufferNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("c33c4b99-f76d-432a-9134-76eaac4f30d3")
    @Override
    public Object visitChoicePseudoState(ChoicePseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("589fa130-dbec-4e4e-9dad-2996539f1dfc")
    @Override
    public Object visitClass(Class obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("8c7a9190-f155-4a11-9772-8040a5b56896")
    @Override
    public Object visitClassAssociation(ClassAssociation obj) {
        	return visitModelElement(obj);
    }

    @objid ("ca0ab5f9-832e-47c8-9010-d8683246ea99")
    @Override
    public Object visitClassDiagram(ClassDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("e1dddcca-a425-4d42-99d9-427aec8e8d9b")
    @Override
    public Object visitClassifier(Classifier obj) {
        	return visitNameSpace(obj);
    }

    @objid ("cf530837-4b9e-4a7b-bbe4-6da5fbef7a57")
    @Override
    public Object visitClause(Clause obj) {
        	return visitModelElement(obj);
    }

    @objid ("ee5b3b0f-8e1a-4fc2-b1ff-07be6b966dbe")
    @Override
    public Object visitCollaboration(Collaboration obj) {
        	return visitNameSpace(obj);
    }

    @objid ("3431fa7a-1e7d-4c04-ae4f-8e5a2777f35f")
    @Override
    public Object visitCollaborationUse(CollaborationUse obj) {
        	return visitModelElement(obj);
    }

    @objid ("3bbccc24-ad6a-4301-b051-e7ceb241b927")
    @Override
    public Object visitCombinedFragment(CombinedFragment obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("7faadc70-28fd-4f17-b036-8cbc6415db83")
    @Override
    public Object visitCommunicationChannel(CommunicationChannel obj) {
        	return visitModelElement(obj);
    }

    @objid ("91b208f7-aee2-458d-93fa-98c67adf0932")
    @Override
    public Object visitCommunicationDiagram(CommunicationDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("a4918aaa-ada0-41db-8779-fa5c4e550664")
    @Override
    public Object visitCommunicationInteraction(CommunicationInteraction obj) {
        	return visitBehavior(obj);
    }

    @objid ("5d1e165a-c16b-4d4c-8921-2f5c0d0f47fc")
    @Override
    public Object visitCommunicationMessage(CommunicationMessage obj) {
        	return visitModelElement(obj);
    }

    @objid ("a0530b13-af09-4613-a10d-6911b7072808")
    @Override
    public Object visitCommunicationNode(CommunicationNode obj) {
        	return visitModelElement(obj);
    }

    @objid ("1ec47ac6-a826-4657-9bde-af2940657161")
    @Override
    public Object visitComponent(Component obj) {
        	return visitClass(obj);
    }

    @objid ("8061f8e7-de6e-4e32-b26c-b74514ef2ad5")
    @Override
    public Object visitComponentRealization(ComponentRealization obj) {
        	return visitModelElement(obj);
    }

    @objid ("06b902e5-309e-4de3-a6bc-2ffbd7a113a5")
    @Override
    public Object visitCompositeStructureDiagram(CompositeStructureDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("74a55f08-381e-4da8-9a0b-46ebac735c37")
    @Override
    public Object visitConditionalNode(ConditionalNode obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("f4be51a8-5d1e-43a7-8128-dbbf037b3fd1")
    @Override
    public Object visitConnectionPointReference(ConnectionPointReference obj) {
        	return visitStateVertex(obj);
    }

    @objid ("3fdc80a6-46eb-409a-adfe-866d86f81010")
    @Override
    public Object visitConnector(Connector obj) {
        	return visitLink(obj);
    }

    @objid ("f41a4da6-692c-4245-9fe0-6356307002b5")
    @Override
    public Object visitConnectorEnd(ConnectorEnd obj) {
        	return visitLinkEnd(obj);
    }

    @objid ("b59335e2-bc70-4a58-8da3-b164f260623d")
    @Override
    public Object visitConstraint(Constraint obj) {
        	return visitModelElement(obj);
    }

    @objid ("4b4e498c-d60d-4afd-9a2d-a34a9be14b52")
    @Override
    public Object visitControlFlow(ControlFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("b1a7699c-09e3-42eb-817a-53d1c75fe138")
    @Override
    public Object visitControlNode(ControlNode obj) {
        	return visitActivityNode(obj);
    }

    @objid ("933240bc-2199-4d7f-bf54-ea0fca6f9f21")
    @Override
    public Object visitDataFlow(DataFlow obj) {
        	return visitModelElement(obj);
    }

    @objid ("c480e88d-1107-46b2-bc35-af0be0736730")
    @Override
    public Object visitDataStoreNode(DataStoreNode obj) {
        	return visitCentralBufferNode(obj);
    }

    @objid ("9979fee1-b4bb-4fb5-9506-d684012bbb30")
    @Override
    public Object visitDataType(DataType obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("7cf423f3-220d-42fc-83c5-f08678812010")
    @Override
    public Object visitDecisionMergeNode(DecisionMergeNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("7ffd61d9-af08-42c9-9df0-f0de86df4857")
    @Override
    public Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("cb589403-bd29-4b4b-ae88-bb35a59fc972")
    @Override
    public Object visitDependency(Dependency obj) {
        	return visitModelElement(obj);
    }

    @objid ("787f4dd4-c2ee-4b65-9422-a7e895a549e0")
    @Override
    public Object visitDeploymentDiagram(DeploymentDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("aa9b8d8e-7778-460c-a023-433760d56913")
    @Override
    public Object visitDiagramSet(DiagramSet obj) {
        	return visitModelElement(obj);
    }

    @objid ("4c8b015d-dcbd-4971-aef4-4a6b3b0d009f")
    @Override
    public Object visitDictionary(Dictionary obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("8fab6fe0-4591-4c52-88af-f5b8fa7c023f")
    @Override
    public Object visitDurationConstraint(DurationConstraint obj) {
        	return visitConstraint(obj);
    }

    @objid ("e23bd99d-c360-4d86-ac82-be77057e0888")
    @Override
    public Object visitElement(Element obj) {
        	return null;
    }

    @objid ("ae359fa1-e0ac-4a43-a5a3-c3d7e13f1352")
    @Override
    public Object visitElementImport(ElementImport obj) {
        	return visitModelElement(obj);
    }

    @objid ("13bc0564-26ef-4a6c-bf03-6faf5f3e887f")
    @Override
    public Object visitElementRealization(ElementRealization obj) {
        	return visitAbstraction(obj);
    }

    @objid ("6125bc56-cc2a-43ae-abff-46e4ddbb3997")
    @Override
    public Object visitEntryPointPseudoState(EntryPointPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("dbaa84b7-57bb-4185-b374-974800001472")
    @Override
    public Object visitEnumeratedPropertyType(EnumeratedPropertyType obj) {
        	return visitPropertyType(obj);
    }

    @objid ("1acedc44-5b35-4e4b-ba53-394450c947b4")
    @Override
    public Object visitEnumeration(Enumeration obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("81afd75b-6da0-4207-b53a-2f8ab53628ce")
    @Override
    public Object visitEnumerationLiteral(EnumerationLiteral obj) {
        	return visitModelElement(obj);
    }

    @objid ("7a225686-dac3-4b18-8c31-77aff5a05e25")
    @Override
    public Object visitEvent(Event obj) {
        	return visitModelElement(obj);
    }

    @objid ("9e5f9b4e-ef89-4253-bf97-6c61656e9eea")
    @Override
    public Object visitExceptionHandler(ExceptionHandler obj) {
        	return visitModelElement(obj);
    }

    @objid ("515df280-ec76-4060-86fe-74e33820a861")
    @Override
    public Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj) {
        	return visitMessageEnd(obj);
    }

    @objid ("38f24f2f-dbb8-469a-90dc-6c573538b613")
    @Override
    public Object visitExecutionSpecification(ExecutionSpecification obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("80a44a1a-8cae-4ab2-9ab7-73342548258c")
    @Override
    public Object visitExitPointPseudoState(ExitPointPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("d9b9bc0c-77c4-4b84-93ef-b23cb01870ae")
    @Override
    public Object visitExpansionNode(ExpansionNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("dee3263a-18ae-4994-ad17-8c4a3307730b")
    @Override
    public Object visitExpansionRegion(ExpansionRegion obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("a86a1f04-e240-48b8-bbb7-c5f00c5eeae6")
    @Override
    public Object visitExtensionPoint(ExtensionPoint obj) {
        	return visitModelElement(obj);
    }

    @objid ("3b3be527-dba1-4671-b4ca-530327bda225")
    @Override
    public Object visitExternDocument(ExternDocument obj) {
        	return visitModelElement(obj);
    }

    @objid ("e64052ef-4477-4c6c-8d0e-4e0943e9e043")
    @Override
    public Object visitExternDocumentType(ExternDocumentType obj) {
        	return visitModelElement(obj);
    }

    @objid ("257ff0ed-8aa2-4248-8d64-6fa162fb0f08")
    @Override
    public Object visitExternProcessor(ExternProcessor obj) {
        	return visitModelElement(obj);
    }

    @objid ("746ff4e2-db3b-4dd8-9f4e-69a3da34f9ee")
    @Override
    public Object visitFeature(Feature obj) {
        	return visitModelElement(obj);
    }

    @objid ("aa9d9cd1-56d8-49a5-81b4-98f62e752353")
    @Override
    public Object visitFinalNode(FinalNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("5a346cbe-7f28-4734-9175-d8b5f6953eff")
    @Override
    public Object visitFinalState(FinalState obj) {
        	return visitState(obj);
    }

    @objid ("2a83e904-87e5-4993-af3f-fecc2b1eb1fd")
    @Override
    public Object visitFlowFinalNode(FlowFinalNode obj) {
        	return visitFinalNode(obj);
    }

    @objid ("f59045c2-61e1-4d75-a53f-997a18058f32")
    @Override
    public Object visitForkJoinNode(ForkJoinNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("8409c9c3-891a-4d82-8753-acb2be5d8e2c")
    @Override
    public Object visitForkPseudoState(ForkPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("977960ae-2505-4bbe-bbaf-a1ff5b8ec2a2")
    @Override
    public Object visitGate(Gate obj) {
        	return visitMessageEnd(obj);
    }

    @objid ("c9cb7985-98c0-48ad-9285-3a10646f75d9")
    @Override
    public Object visitGeneralClass(GeneralClass obj) {
        	return visitClassifier(obj);
    }

    @objid ("24041790-1368-4d7e-a63c-ca112c304458")
    @Override
    public Object visitGeneralOrdering(GeneralOrdering obj) {
        	return visitElement(obj);
    }

    @objid ("3504a6bd-fe76-421f-b626-6a2c93c559bf")
    @Override
    public Object visitGeneralization(Generalization obj) {
        	return visitModelElement(obj);
    }

    @objid ("8f556ef7-6b08-4994-9c7f-f516d29bcca1")
    @Override
    public Object visitGenericAnalystContainer(GenericAnalystContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("28528700-ac1e-45eb-a516-4d3bc9636d46")
    @Override
    public Object visitGenericAnalystElement(GenericAnalystElement obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("9525c21a-4860-42ee-ba1e-eb9909b1e598")
    @Override
    public Object visitGoal(Goal obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("865cb217-752a-44db-9065-772be1ca2081")
    @Override
    public Object visitGoalContainer(GoalContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("111074f2-2fb2-4e3a-b58f-b3024bb0a0c4")
    @Override
    public Object visitInformationFlow(InformationFlow obj) {
        	return visitModelElement(obj);
    }

    @objid ("f93811e3-18f1-4ea9-ade4-dd13b29061da")
    @Override
    public Object visitInformationItem(InformationItem obj) {
        	return visitClassifier(obj);
    }

    @objid ("af08eaba-3344-420e-b810-b6ef5961fb99")
    @Override
    public Object visitInitialNode(InitialNode obj) {
        	return visitControlNode(obj);
    }

    @objid ("c02878fe-f20b-45c3-a177-3442766429ca")
    @Override
    public Object visitInitialPseudoState(InitialPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("dc7dca27-9fdb-4572-b6f1-05c28d687581")
    @Override
    public Object visitInputPin(InputPin obj) {
        	return visitPin(obj);
    }

    @objid ("11d6fb3a-7b5e-4dd1-ad3e-9a62f54b39a7")
    @Override
    public Object visitInstance(Instance obj) {
        	return visitModelElement(obj);
    }

    @objid ("af3a24c8-df12-4c41-96c0-068c7ba1151e")
    @Override
    public Object visitInstanceNode(InstanceNode obj) {
        	return visitObjectNode(obj);
    }

    @objid ("1fc2c595-c17d-4b71-8d10-9f4f973b7015")
    @Override
    public Object visitInteraction(Interaction obj) {
        	return visitBehavior(obj);
    }

    @objid ("e658e18f-33d3-40fe-b005-62ac558d24c4")
    @Override
    public Object visitInteractionFragment(InteractionFragment obj) {
        	return visitModelElement(obj);
    }

    @objid ("7fa73072-f792-418e-9e11-cac5f9c0721b")
    @Override
    public Object visitInteractionOperand(InteractionOperand obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("1f82e933-53ee-44f5-86cc-56b5369c1256")
    @Override
    public Object visitInteractionUse(InteractionUse obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("db666c6b-dbdd-4c8a-8945-579bddb1e354")
    @Override
    public Object visitInterface(Interface obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("8bd36e4d-c563-4be5-b519-886e534ccb4f")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization obj) {
        	return visitModelElement(obj);
    }

    @objid ("10bc1f94-5268-413e-981e-e21f25b76ee6")
    @Override
    public Object visitInternalTransition(InternalTransition obj) {
        	return visitTransition(obj);
    }

    @objid ("66cb4595-534f-4f66-9860-bd2b961355ca")
    @Override
    public Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj) {
        	return visitActivityGroup(obj);
    }

    @objid ("509720a2-fe8e-41fe-93a1-53c01bdbd4cb")
    @Override
    public Object visitJoinPseudoState(JoinPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("549fdcc9-3c3b-4f4e-8120-5720650d627c")
    @Override
    public Object visitJunctionPseudoState(JunctionPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("5ae306b0-a817-4baa-a879-4851cdc9b106")
    @Override
    public Object visitLifeline(Lifeline obj) {
        	return visitModelElement(obj);
    }

    @objid ("5b8c2645-a561-4670-9864-c8d46484a733")
    @Override
    public Object visitLink(Link obj) {
        	return visitModelElement(obj);
    }

    @objid ("2357615a-8940-47a6-a517-4791bfaf085b")
    @Override
    public Object visitLinkEnd(LinkEnd obj) {
        	return visitModelElement(obj);
    }

    @objid ("7f0cfbab-fb95-4f3c-8357-523c91f4c3d8")
    @Override
    public Object visitLocalPropertyTable(LocalPropertyTable obj) {
        	return visitPropertyTable(obj);
    }

    @objid ("fc335d3a-bdc9-4951-8f3c-5ff09419fe7c")
    @Override
    public Object visitLoopNode(LoopNode obj) {
        	return visitStructuredActivityNode(obj);
    }

    @objid ("f3736d1b-4461-412c-8b59-988b5022c5e7")
    @Override
    public Object visitManifestation(Manifestation obj) {
        	return visitModelElement(obj);
    }

    @objid ("408ea062-d71a-4542-9d5d-d4272b2e9fef")
    @Override
    public Object visitMatrixDefinition(MatrixDefinition obj) {
        	return visitModelElement(obj);
    }

    @objid ("eaf2adec-78db-4701-a793-2e100ea9dc72")
    @Override
    public Object visitMatrixValueDefinition(MatrixValueDefinition obj) {
        	return visitElement(obj);
    }

    @objid ("fa181ec4-537a-41ad-a33c-e6d3296f0f1f")
    @Override
    public Object visitMessage(Message obj) {
        	return visitModelElement(obj);
    }

    @objid ("68ae0018-b759-43fb-9411-df37f0546dac")
    @Override
    public Object visitMessageEnd(MessageEnd obj) {
        	return visitOccurrenceSpecification(obj);
    }

    @objid ("f356ba90-dd59-46b6-9a70-99a0ccae8b21")
    @Override
    public Object visitMessageFlow(MessageFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("71897b4c-5a6f-4580-932f-76bcb6a7e25b")
    @Override
    public Object visitMetaclassReference(MetaclassReference obj) {
        	return visitElement(obj);
    }

    @objid ("0e307da9-f1e3-494b-8a64-905187b678cc")
    @Override
    public Object visitModelElement(ModelElement obj) {
        	return visitElement(obj);
    }

    @objid ("d39a40e3-68b4-422d-8626-59f95324150a")
    @Override
    public Object visitModelTree(ModelTree obj) {
        	return visitModelElement(obj);
    }

    @objid ("929b7cc7-f53d-4c63-8ca5-2167bf1ef62e")
    @Override
    public Object visitModuleComponent(ModuleComponent obj) {
        	return visitComponent(obj);
    }

    @objid ("2d4db62d-f42b-4922-81f9-e7cd2d7eae47")
    @Override
    public Object visitModuleParameter(ModuleParameter obj) {
        	return visitModelElement(obj);
    }

    @objid ("7402edb3-bc31-49b4-8559-d79fcee82170")
    @Override
    public Object visitNameSpace(NameSpace obj) {
        	return visitModelTree(obj);
    }

    @objid ("2ce4eae3-b90b-40db-b883-a72f3b196603")
    @Override
    public Object visitNamespaceUse(NamespaceUse obj) {
        	return visitElement(obj);
    }

    @objid ("ac3dfa63-043d-4feb-a62a-cc18cf2fef08")
    @Override
    public Object visitNaryAssociation(NaryAssociation obj) {
        	return visitModelElement(obj);
    }

    @objid ("24f6e033-c66e-48e6-983f-f98d62d2449d")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd obj) {
        	return visitStructuralFeature(obj);
    }

    @objid ("6bcc443a-2ecd-406b-aa86-841a483c3fe0")
    @Override
    public Object visitNaryConnector(NaryConnector obj) {
        	return visitNaryLink(obj);
    }

    @objid ("ab0fe340-4e25-448a-bb21-4e1a28750565")
    @Override
    public Object visitNaryConnectorEnd(NaryConnectorEnd obj) {
        	return visitNaryLinkEnd(obj);
    }

    @objid ("504d00a3-8e1f-44b3-81e0-3cbc6d5a6602")
    @Override
    public Object visitNaryLink(NaryLink obj) {
        	return visitModelElement(obj);
    }

    @objid ("63d86208-4760-4082-aa52-1d47b62db224")
    @Override
    public Object visitNaryLinkEnd(NaryLinkEnd obj) {
        	return visitModelElement(obj);
    }

    @objid ("32ad03c0-cf91-44a4-a8ff-627567c10c14")
    @Override
    public Object visitNode(Node obj) {
        	return visitClassifier(obj);
    }

    @objid ("0ea18d9c-89c6-42fb-8904-928067beb7d5")
    @Override
    public Object visitNote(Note obj) {
        	return visitModelElement(obj);
    }

    @objid ("70e33c3c-f8bd-424f-8c70-7ed6ba989160")
    @Override
    public Object visitNoteType(NoteType obj) {
        	return visitModelElement(obj);
    }

    @objid ("096532b6-6ab8-4943-a0d8-7314acd976d8")
    @Override
    public Object visitObjectDiagram(ObjectDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("ab53fbeb-52b7-42f4-8405-bbb5ee7a52de")
    @Override
    public Object visitObjectFlow(ObjectFlow obj) {
        	return visitActivityEdge(obj);
    }

    @objid ("d2bd1ca3-ef57-44b8-b245-93491f7efa30")
    @Override
    public Object visitObjectNode(ObjectNode obj) {
        	return visitActivityNode(obj);
    }

    @objid ("404a3c10-6834-481d-a6f8-ee6cb817ec46")
    @Override
    public Object visitOccurrenceSpecification(OccurrenceSpecification obj) {
        	return visitInteractionFragment(obj);
    }

    @objid ("2da0b5d4-cceb-48b5-8c76-635e556aac81")
    @Override
    public Object visitOpaqueAction(OpaqueAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("b86a0f22-7ef3-4004-92a6-93a29d22146f")
    @Override
    public Object visitOpaqueBehavior(OpaqueBehavior obj) {
        	return visitBehavior(obj);
    }

    @objid ("915cd061-d6f3-4672-98df-0e584be6775f")
    @Override
    public Object visitOperation(Operation obj) {
        	return visitBehavioralFeature(obj);
    }

    @objid ("eb374252-4306-48e9-b230-76dbbf912034")
    @Override
    public Object visitOutputPin(OutputPin obj) {
        	return visitPin(obj);
    }

    @objid ("fe61e833-41e4-4efb-9b59-a3a5ea25fdc9")
    @Override
    public Object visitPackage(Package obj) {
        	return visitNameSpace(obj);
    }

    @objid ("3711ba18-b095-4476-8023-ab570a7e4b08")
    @Override
    public Object visitPackageImport(PackageImport obj) {
        	return visitModelElement(obj);
    }

    @objid ("f43e1469-199e-43f0-9f42-96a80170789a")
    @Override
    public Object visitPackageMerge(PackageMerge obj) {
        	return visitModelElement(obj);
    }

    @objid ("667748c4-103b-4348-8f5d-d5baacc6799d")
    @Override
    public Object visitParameter(Parameter obj) {
        	return visitModelElement(obj);
    }

    @objid ("c5943cf2-6f3a-4445-82b3-8150ba8002b8")
    @Override
    public Object visitPartDecomposition(PartDecomposition obj) {
        	return visitInteractionUse(obj);
    }

    @objid ("1781d5aa-fd75-4079-98a1-457b887a6f34")
    @Override
    public Object visitPin(Pin obj) {
        	return visitObjectNode(obj);
    }

    @objid ("4dba9b04-b7e1-4003-9e04-20909e6d1c3e")
    @Override
    public Object visitPort(Port obj) {
        	return visitBindableInstance(obj);
    }

    @objid ("c10914ed-4c02-4635-9618-6a290ea54e2f")
    @Override
    public Object visitProfile(Profile obj) {
        	return visitPackage(obj);
    }

    @objid ("789a6dff-9d00-437f-9ca1-8c2f2f8f7d27")
    @Override
    public Object visitProject(Project obj) {
        	return visitModelElement(obj);
    }

    @objid ("7358ff3a-699d-4b3b-b08c-0c6e79039fb1")
    @Override
    public Object visitPropertyContainer(PropertyContainer obj) {
        	return visitModelElement(obj);
    }

    @objid ("af75368b-d8cd-42cb-b1c2-0c09894c9b71")
    @Override
    public Object visitPropertyDefinition(PropertyDefinition obj) {
        	return visitModelElement(obj);
    }

    @objid ("d63cfbdc-bfa8-46c1-a52c-08c5c6e7025a")
    @Override
    public Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj) {
        	return visitModelElement(obj);
    }

    @objid ("df61f314-7e13-414d-9e38-7a60eaf6cac2")
    @Override
    public Object visitPropertyTable(PropertyTable obj) {
        	return visitElement(obj);
    }

    @objid ("bcdbc7eb-dab2-4b3d-8ff3-19feb4c79194")
    @Override
    public Object visitPropertyTableDefinition(PropertyTableDefinition obj) {
        	return visitModelElement(obj);
    }

    @objid ("d0f5b9d6-6d10-4715-8c68-a8293eb3c607")
    @Override
    public Object visitPropertyType(PropertyType obj) {
        	return visitModelElement(obj);
    }

    @objid ("760c7918-d6fe-4036-ad05-ced333b4a311")
    @Override
    public Object visitProvidedInterface(ProvidedInterface obj) {
        	return visitModelElement(obj);
    }

    @objid ("ee81f693-39a7-4c6c-96cd-aad739d2675a")
    @Override
    public Object visitQueryDefinition(QueryDefinition obj) {
        	return visitElement(obj);
    }

    @objid ("b1045114-dae5-42e6-a40a-506dbf636d54")
    @Override
    public Object visitRaisedException(RaisedException obj) {
        	return visitModelElement(obj);
    }

    @objid ("731918e8-5035-46ef-8b2e-00a4ca2992c9")
    @Override
    public Object visitRegion(Region obj) {
        	return visitModelElement(obj);
    }

    @objid ("da9f454c-b285-4cae-b58d-91056345f477")
    @Override
    public Object visitRequiredInterface(RequiredInterface obj) {
        	return visitModelElement(obj);
    }

    @objid ("37e9dae3-902c-417d-a845-27346d1cb0c1")
    @Override
    public Object visitRequirement(Requirement obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("b94225f7-5015-4897-a43d-04d38b462c2b")
    @Override
    public Object visitRequirementContainer(RequirementContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("01e31a37-09da-490f-b549-1249df3e5140")
    @Override
    public Object visitRisk(Risk obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("fab2dab0-096e-4506-a4a0-88191baaf3be")
    @Override
    public Object visitRiskContainer(RiskContainer obj) {
        	return visitAnalystContainer(obj);
    }

    @objid ("e05bccb9-8dad-4ae1-b024-be8fcfba4c5d")
    @Override
    public Object visitSendSignalAction(SendSignalAction obj) {
        	return visitActivityAction(obj);
    }

    @objid ("678d57d9-5fb9-4dd9-a7d4-9af193255eba")
    @Override
    public Object visitSequenceDiagram(SequenceDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("465541b1-4420-4ebe-8654-1dcd52b71b4b")
    @Override
    public Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("9ab5eeb6-468c-4f92-a661-cd3d727eebc2")
    @Override
    public Object visitSignal(Signal obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("18aa36ba-fada-461d-b41f-280f1e259b58")
    @Override
    public Object visitState(State obj) {
        	return visitStateVertex(obj);
    }

    @objid ("ad982fb9-2461-4a81-8fbf-c02ad34ede0b")
    @Override
    public Object visitStateInvariant(StateInvariant obj) {
        	return visitOccurrenceSpecification(obj);
    }

    @objid ("37f0f250-1489-410b-8cdb-34d5f4c9eaed")
    @Override
    public Object visitStateMachine(StateMachine obj) {
        	return visitBehavior(obj);
    }

    @objid ("714e07ac-0d57-47b4-9798-57bfa3e38345")
    @Override
    public Object visitStateMachineDiagram(StateMachineDiagram obj) {
        	return visitBehaviorDiagram(obj);
    }

    @objid ("d86371c6-499d-4ae2-800c-1a7e7712d489")
    @Override
    public Object visitStateVertex(StateVertex obj) {
        	return visitModelElement(obj);
    }

    @objid ("3de2d130-740a-4183-953e-335d13a5a8f4")
    @Override
    public Object visitStaticDiagram(StaticDiagram obj) {
        	return visitAbstractDiagram(obj);
    }

    @objid ("9ae2f39f-4bbb-4144-8145-23e505bbd402")
    @Override
    public Object visitStereotype(Stereotype obj) {
        	return visitModelElement(obj);
    }

    @objid ("2fb0a292-6163-4bf1-9f24-738920db4c1a")
    @Override
    public Object visitStructuralFeature(StructuralFeature obj) {
        	return visitFeature(obj);
    }

    @objid ("c72fab4f-ee55-4276-8bb4-f62c6d0eafd6")
    @Override
    public Object visitStructuredActivityNode(StructuredActivityNode obj) {
        	return visitActivityAction(obj);
    }

    @objid ("a26e669f-1932-492f-ab5c-903aba151020")
    @Override
    public Object visitSubstitution(Substitution obj) {
        	return visitModelElement(obj);
    }

    @objid ("d9a143b8-14f6-4e8e-bbf8-97b7106680cb")
    @Override
    public Object visitTagParameter(TagParameter obj) {
        	return visitElement(obj);
    }

    @objid ("4b24abde-5849-403c-aadb-6c575d9b21d3")
    @Override
    public Object visitTagType(TagType obj) {
        	return visitModelElement(obj);
    }

    @objid ("8d651682-bdf1-4958-9f32-15bfd1073d40")
    @Override
    public Object visitTaggedValue(TaggedValue obj) {
        	return visitModelElement(obj);
    }

    @objid ("8b1a3fdb-f886-44b7-a3c3-43e8f67a3ee3")
    @Override
    public Object visitTemplateBinding(TemplateBinding obj) {
        	return visitModelElement(obj);
    }

    @objid ("6e88b30e-2396-4f16-ae70-fac0973e4b4b")
    @Override
    public Object visitTemplateParameter(TemplateParameter obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("5d36201a-916d-45e3-8a19-115436bcf3f4")
    @Override
    public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj) {
        	return visitModelElement(obj);
    }

    @objid ("979c18bf-682e-41ba-8468-99440d5cee79")
    @Override
    public Object visitTerm(Term obj) {
        	return visitAnalystElement(obj);
    }

    @objid ("134c163c-cbaf-4bbc-8c2c-f908844466e6")
    @Override
    public Object visitTerminatePseudoState(TerminatePseudoState obj) {
        	return visitAbstractPseudoState(obj);
    }

    @objid ("c44c88b8-2d70-49d5-a714-7d9987787597")
    @Override
    public Object visitTerminateSpecification(TerminateSpecification obj) {
        	return visitExecutionOccurenceSpecification(obj);
    }

    @objid ("cf2a2dd9-44aa-43a4-b8d6-8aa819c7bf9b")
    @Override
    public Object visitTransition(Transition obj) {
        	return visitModelElement(obj);
    }

    @objid ("22352c9c-9d7f-4e65-bdf8-932b299b8e20")
    @Override
    public Object visitTypedPropertyTable(TypedPropertyTable obj) {
        	return visitPropertyTable(obj);
    }

    @objid ("d0af8cab-da77-4fb0-b79b-87fd5a7fe614")
    @Override
    public Object visitUsage(Usage obj) {
        	return visitDependency(obj);
    }

    @objid ("437c7a52-e03b-4c3c-a7be-5372ae4fa7d3")
    @Override
    public Object visitUseCase(UseCase obj) {
        	return visitGeneralClass(obj);
    }

    @objid ("4cf6fcfa-4bea-4c82-be90-c3ca6a4ab469")
    @Override
    public Object visitUseCaseDependency(UseCaseDependency obj) {
        	return visitModelElement(obj);
    }

    @objid ("3facd428-cea9-4560-9d98-6c41504595b9")
    @Override
    public Object visitUseCaseDiagram(UseCaseDiagram obj) {
        	return visitStaticDiagram(obj);
    }

    @objid ("8a0b1e3d-dddf-4dba-9c95-5ba5b67a11eb")
    @Override
    public Object visitValuePin(ValuePin obj) {
        	return visitInputPin(obj);
    }

}
