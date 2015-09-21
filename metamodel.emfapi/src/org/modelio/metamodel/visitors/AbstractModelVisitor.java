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
 * This class is an implementation of IModelVisitor whose visit() methods simply return <code>null</code>.
 */
@objid ("00106c06-4f2c-1032-829a-001ec947cd2a")
public class AbstractModelVisitor implements IModelVisitor {
    @objid ("43c573a4-6aba-420e-9478-76f59874c7ca")
    @Override
    public Object visitAbstractDiagram(AbstractDiagram obj) {
        	return null;
    }

    @objid ("1f0ea924-b5b3-4ddf-a3ca-47189d4eaa25")
    @Override
    public Object visitAbstractPseudoState(AbstractPseudoState obj) {
        	return null;
    }

    @objid ("88122872-0319-41e8-975e-89624ce6ad15")
    @Override
    public Object visitAbstraction(Abstraction obj) {
        	return null;
    }

    @objid ("5ecfe302-9516-44be-97d8-fd7b4b493868")
    @Override
    public Object visitAcceptCallEventAction(AcceptCallEventAction obj) {
        	return null;
    }

    @objid ("51b0de23-4c39-458b-baa7-b40b7ba7a068")
    @Override
    public Object visitAcceptChangeEventAction(AcceptChangeEventAction obj) {
        	return null;
    }

    @objid ("dfc33de9-0166-45c7-bedd-c5f68ec8b03e")
    @Override
    public Object visitAcceptSignalAction(AcceptSignalAction obj) {
        	return null;
    }

    @objid ("2e1a0ad1-ee38-41c6-9b3a-9ec67e164421")
    @Override
    public Object visitAcceptTimeEventAction(AcceptTimeEventAction obj) {
        	return null;
    }

    @objid ("42a1ecb9-5bd9-4c1e-8a8d-4b8c82b87ac6")
    @Override
    public Object visitActivity(Activity obj) {
        	return null;
    }

    @objid ("84cbae8c-0ca6-469b-91dd-63019f802f88")
    @Override
    public Object visitActivityAction(ActivityAction obj) {
        	return null;
    }

    @objid ("b1df34d1-b519-46e0-9c1b-072e4b569b89")
    @Override
    public Object visitActivityDiagram(ActivityDiagram obj) {
        	return null;
    }

    @objid ("4f04792e-e36f-409d-8823-4bf2445a419c")
    @Override
    public Object visitActivityEdge(ActivityEdge obj) {
        	return null;
    }

    @objid ("0415dfb2-d957-4b7d-989c-2b6ee54edf5c")
    @Override
    public Object visitActivityFinalNode(ActivityFinalNode obj) {
        	return null;
    }

    @objid ("a110f9fe-ff78-4e1c-b638-f4d5c98afab3")
    @Override
    public Object visitActivityGroup(ActivityGroup obj) {
        	return null;
    }

    @objid ("0ee00ae8-1539-4b7d-bb1c-755626496f2a")
    @Override
    public Object visitActivityNode(ActivityNode obj) {
        	return null;
    }

    @objid ("134dd501-40f9-4a14-ae89-4e70c7f7b5d0")
    @Override
    public Object visitActivityParameterNode(ActivityParameterNode obj) {
        	return null;
    }

    @objid ("47c0f68f-6c57-4b02-ab3c-d9b4aee53e6a")
    @Override
    public Object visitActivityPartition(ActivityPartition obj) {
        	return null;
    }

    @objid ("4f56dd40-b0de-4462-8c39-ca0083449e4a")
    @Override
    public Object visitActor(Actor obj) {
        	return null;
    }

    @objid ("6e646ef8-a017-423c-adf4-4e77fbd07692")
    @Override
    public Object visitAnalystContainer(AnalystContainer obj) {
        	return null;
    }

    @objid ("488e6f9c-650b-4f26-8019-db4a194f358a")
    @Override
    public Object visitAnalystElement(AnalystElement obj) {
        	return null;
    }

    @objid ("be31c531-51aa-450c-af98-d96cb8d60b20")
    @Override
    public Object visitAnalystItem(AnalystItem obj) {
        	return null;
    }

    @objid ("09d8d12c-7a4c-4ce7-b9de-2bb52d5cbb45")
    @Override
    public Object visitAnalystProject(AnalystProject obj) {
        	return null;
    }

    @objid ("f2b8d80c-608d-4124-b79d-44aebaecd083")
    @Override
    public Object visitAnalystPropertyTable(AnalystPropertyTable obj) {
        	return null;
    }

    @objid ("4b7c4d14-45c0-4f9d-aeda-3bc4a69c6453")
    @Override
    public Object visitArtifact(Artifact obj) {
        	return null;
    }

    @objid ("993d11fe-7452-461f-9abf-47989274eed9")
    @Override
    public Object visitAssociation(Association obj) {
        	return null;
    }

    @objid ("c5cd0882-8099-462b-a0c7-5c088eaf660e")
    @Override
    public Object visitAssociationEnd(AssociationEnd obj) {
        	return null;
    }

    @objid ("342ba5c8-c661-4b14-b7c5-44445c18a557")
    @Override
    public Object visitAttribute(Attribute obj) {
        	return null;
    }

    @objid ("472eb16a-56c6-43f3-bc8d-4ee9a7772710")
    @Override
    public Object visitAttributeLink(AttributeLink obj) {
        	return null;
    }

    @objid ("a9a78dd0-f4ff-4b00-9c29-174e05d118b2")
    @Override
    public Object visitBehavior(Behavior obj) {
        	return null;
    }

    @objid ("8a7ac603-a35f-4346-bf16-ec6513f0ffd6")
    @Override
    public Object visitBehaviorDiagram(BehaviorDiagram obj) {
        	return null;
    }

    @objid ("6f1eca3a-fb80-4569-83c0-79d5a6020b15")
    @Override
    public Object visitBehaviorParameter(BehaviorParameter obj) {
        	return null;
    }

    @objid ("d26d4b49-1797-429b-8242-f466dbe874c2")
    @Override
    public Object visitBehavioralFeature(BehavioralFeature obj) {
        	return null;
    }

    @objid ("4414176d-84e7-45e1-b1a8-34db2484a074")
    @Override
    public Object visitBindableInstance(BindableInstance obj) {
        	return null;
    }

    @objid ("dd0f2770-f132-4de2-85cf-983c699de0cb")
    @Override
    public Object visitBinding(Binding obj) {
        	return null;
    }

    @objid ("5461904d-07fb-4312-935c-c499c04c5ee6")
    @Override
    public Object visitBpmnActivity(BpmnActivity obj) {
        	return null;
    }

    @objid ("d7ca0121-f2d9-4c32-90e4-94bfc82a8c09")
    @Override
    public Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj) {
        	return null;
    }

    @objid ("44b09168-96e1-4c08-88e0-8c47e06e0958")
    @Override
    public Object visitBpmnArtifact(BpmnArtifact obj) {
        	return null;
    }

    @objid ("e5673e6a-31cc-486a-a2c6-9d70cf601862")
    @Override
    public Object visitBpmnAssociation(BpmnAssociation obj) {
        	return null;
    }

    @objid ("f225675c-eebb-4c9c-916b-5e8a7e6824ef")
    @Override
    public Object visitBpmnBaseElement(BpmnBaseElement obj) {
        	return null;
    }

    @objid ("7ce9d0d3-d88c-4026-b938-d857910c94a3")
    @Override
    public Object visitBpmnBehavior(BpmnBehavior obj) {
        	return null;
    }

    @objid ("aa5d0a31-0dad-46ac-9739-fe1b37e925fb")
    @Override
    public Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj) {
        	return null;
    }

    @objid ("e80736bd-b21b-43a5-a6b9-a4634fb9d981")
    @Override
    public Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj) {
        	return null;
    }

    @objid ("b0584d20-8cab-4287-b372-7b71f571f8c0")
    @Override
    public Object visitBpmnCallActivity(BpmnCallActivity obj) {
        	return null;
    }

    @objid ("778a49f1-3417-4adb-a0ed-5ec3a6ca4d31")
    @Override
    public Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj) {
        	return null;
    }

    @objid ("5b52ba38-39a6-408c-949e-53686f5b0ccd")
    @Override
    public Object visitBpmnCatchEvent(BpmnCatchEvent obj) {
        	return null;
    }

    @objid ("f6e8c7e5-a758-4540-8b17-ae7bfc68ebed")
    @Override
    public Object visitBpmnCollaboration(BpmnCollaboration obj) {
        	return null;
    }

    @objid ("2c0069c0-20df-41d8-baba-33e72b754d5b")
    @Override
    public Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj) {
        	return null;
    }

    @objid ("ae91a6d9-7e5d-45b8-9b3e-a292b28d44c6")
    @Override
    public Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj) {
        	return null;
    }

    @objid ("ef1f853c-1383-4e1b-a4d9-f9d74b312260")
    @Override
    public Object visitBpmnComplexGateway(BpmnComplexGateway obj) {
        	return null;
    }

    @objid ("01a73d6d-1976-4d76-afd8-9ecd5a2a3613")
    @Override
    public Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj) {
        	return null;
    }

    @objid ("c22e0a9c-f4fe-4c2d-8701-4c6a4fe0ac01")
    @Override
    public Object visitBpmnDataAssociation(BpmnDataAssociation obj) {
        	return null;
    }

    @objid ("bc708943-f5af-4e88-8714-7db371bce322")
    @Override
    public Object visitBpmnDataInput(BpmnDataInput obj) {
        	return null;
    }

    @objid ("cec4e4a3-18eb-41a5-b95b-b033dee62991")
    @Override
    public Object visitBpmnDataObject(BpmnDataObject obj) {
        	return null;
    }

    @objid ("e08adb7e-3535-4ea0-bfe0-930be3ffca73")
    @Override
    public Object visitBpmnDataOutput(BpmnDataOutput obj) {
        	return null;
    }

    @objid ("9769e602-5dfa-433b-9cd9-609110bdfeb2")
    @Override
    public Object visitBpmnDataState(BpmnDataState obj) {
        	return null;
    }

    @objid ("6fefc31a-d849-49a4-8578-3ddd1a70f98d")
    @Override
    public Object visitBpmnDataStore(BpmnDataStore obj) {
        	return null;
    }

    @objid ("b16c3f13-5dd3-4c0c-b68b-abf587129fda")
    @Override
    public Object visitBpmnEndEvent(BpmnEndEvent obj) {
        	return null;
    }

    @objid ("35619571-6b03-434a-a002-8087cf955a17")
    @Override
    public Object visitBpmnEndPoint(BpmnEndPoint obj) {
        	return null;
    }

    @objid ("80c4b7b7-d025-4e48-a803-dd0cdcf257bc")
    @Override
    public Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj) {
        	return null;
    }

    @objid ("4e9a24c6-1abd-425e-9799-a4d082a467d5")
    @Override
    public Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj) {
        	return null;
    }

    @objid ("3e2da1c2-3e0e-45f0-8e88-fe7518dd89c0")
    @Override
    public Object visitBpmnEvent(BpmnEvent obj) {
        	return null;
    }

    @objid ("40acba82-e29c-416e-8854-ce0bcc8a2336")
    @Override
    public Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj) {
        	return null;
    }

    @objid ("95aad726-5837-4892-a685-939a0370b578")
    @Override
    public Object visitBpmnEventDefinition(BpmnEventDefinition obj) {
        	return null;
    }

    @objid ("b50c8213-1adb-47e6-baeb-390431c93fd0")
    @Override
    public Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj) {
        	return null;
    }

    @objid ("48bfb33b-7b46-4d27-9c16-6a5b6f4ecc1d")
    @Override
    public Object visitBpmnFlowElement(BpmnFlowElement obj) {
        	return null;
    }

    @objid ("8032a19b-a576-445a-b2e4-4970212d5d4c")
    @Override
    public Object visitBpmnFlowNode(BpmnFlowNode obj) {
        	return null;
    }

    @objid ("5e43e48c-5740-4ede-a9c3-65ac63c87853")
    @Override
    public Object visitBpmnGateway(BpmnGateway obj) {
        	return null;
    }

    @objid ("47645ac0-d457-47e8-a32a-3fea356302b7")
    @Override
    public Object visitBpmnGroup(BpmnGroup obj) {
        	return null;
    }

    @objid ("1c87da5d-f12f-4879-86da-3950073e9e97")
    @Override
    public Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj) {
        	return null;
    }

    @objid ("88948ad8-f9a2-4e84-b9cb-3ae41ce27a85")
    @Override
    public Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj) {
        	return null;
    }

    @objid ("d3526f1d-a5d0-4630-b105-e9941ffb2522")
    @Override
    public Object visitBpmnInterface(BpmnInterface obj) {
        	return null;
    }

    @objid ("57010966-9b84-4a3c-81e8-7c339f4a76e1")
    @Override
    public Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj) {
        	return null;
    }

    @objid ("c50ac867-969c-4e02-8c79-ff218530c98a")
    @Override
    public Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj) {
        	return null;
    }

    @objid ("b85f99f7-d68a-416f-b0b2-abe046c9c7e6")
    @Override
    public Object visitBpmnItemAwareElement(BpmnItemAwareElement obj) {
        	return null;
    }

    @objid ("e93c0d11-8386-4a5d-8e44-9ddcdab380fe")
    @Override
    public Object visitBpmnItemDefinition(BpmnItemDefinition obj) {
        	return null;
    }

    @objid ("a62958a6-7784-48e4-9dc2-992bad91868c")
    @Override
    public Object visitBpmnLane(BpmnLane obj) {
        	return null;
    }

    @objid ("b21bf3cd-05c7-403f-bf44-fb9969f39eef")
    @Override
    public Object visitBpmnLaneSet(BpmnLaneSet obj) {
        	return null;
    }

    @objid ("f6450560-39a0-4c46-82c1-ffb5c028e55f")
    @Override
    public Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj) {
        	return null;
    }

    @objid ("23f2ae05-70cc-42ac-a9b1-9b1f35e8db38")
    @Override
    public Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj) {
        	return null;
    }

    @objid ("a9050dc3-8f0a-40a3-8b1e-8c3f91f4f895")
    @Override
    public Object visitBpmnManualTask(BpmnManualTask obj) {
        	return null;
    }

    @objid ("1a1fc577-bb25-4c01-8dbb-7466b4e9a41d")
    @Override
    public Object visitBpmnMessage(BpmnMessage obj) {
        	return null;
    }

    @objid ("0f35b92a-51e0-406d-b7d6-0be2b1ff1d0f")
    @Override
    public Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj) {
        	return null;
    }

    @objid ("559b8bcd-4b89-4760-9480-b56f71cc0d5d")
    @Override
    public Object visitBpmnMessageFlow(BpmnMessageFlow obj) {
        	return null;
    }

    @objid ("591d0d80-2179-4f59-8bc2-f33f815b2e89")
    @Override
    public Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj) {
        	return null;
    }

    @objid ("6ef934c5-1ab3-48a4-b692-417413e0ffa4")
    @Override
    public Object visitBpmnOperation(BpmnOperation obj) {
        	return null;
    }

    @objid ("99fbd1ac-25cd-457c-991e-a2b065313d17")
    @Override
    public Object visitBpmnParallelGateway(BpmnParallelGateway obj) {
        	return null;
    }

    @objid ("e16d1b87-82af-49ff-b97d-139dc9645790")
    @Override
    public Object visitBpmnParticipant(BpmnParticipant obj) {
        	return null;
    }

    @objid ("a07dfc48-b944-4fb2-b9db-8c2a820cabe0")
    @Override
    public Object visitBpmnProcess(BpmnProcess obj) {
        	return null;
    }

    @objid ("13c31e2c-0980-4435-98a4-66859c6832df")
    @Override
    public Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj) {
        	return null;
    }

    @objid ("d36e7b4f-e489-4e5c-badc-3fd471f1dda3")
    @Override
    public Object visitBpmnReceiveTask(BpmnReceiveTask obj) {
        	return null;
    }

    @objid ("f78b1303-6d48-49aa-96f6-90376885a970")
    @Override
    public Object visitBpmnResource(BpmnResource obj) {
        	return null;
    }

    @objid ("0b96ac7f-316a-47ba-b1c8-f74fa3952d05")
    @Override
    public Object visitBpmnResourceParameter(BpmnResourceParameter obj) {
        	return null;
    }

    @objid ("558cc21c-660b-4c38-b125-b3d733e50cc4")
    @Override
    public Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj) {
        	return null;
    }

    @objid ("068fddf8-5f30-4fd7-b103-2c66ea05ae6b")
    @Override
    public Object visitBpmnResourceRole(BpmnResourceRole obj) {
        	return null;
    }

    @objid ("aea46a55-3a70-4273-a3c7-9f8227a3bba0")
    @Override
    public Object visitBpmnRootElement(BpmnRootElement obj) {
        	return null;
    }

    @objid ("79755f87-74e3-4f50-9304-941314386d61")
    @Override
    public Object visitBpmnScriptTask(BpmnScriptTask obj) {
        	return null;
    }

    @objid ("0aa6381f-6974-4c30-b5bd-c37ccd5c7175")
    @Override
    public Object visitBpmnSendTask(BpmnSendTask obj) {
        	return null;
    }

    @objid ("df30dba4-2f04-49dd-af50-c44edd8be427")
    @Override
    public Object visitBpmnSequenceFlow(BpmnSequenceFlow obj) {
        	return null;
    }

    @objid ("2e3851f0-d39f-4fa0-b380-275e3b2a8424")
    @Override
    public Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj) {
        	return null;
    }

    @objid ("1fbdab18-f0f1-4eeb-9390-b4690689fe94")
    @Override
    public Object visitBpmnServiceTask(BpmnServiceTask obj) {
        	return null;
    }

    @objid ("86985532-df8d-4dfd-b42f-43ff5b2899bb")
    @Override
    public Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj) {
        	return null;
    }

    @objid ("c204ec6d-eaae-4dde-8c1e-d39f5a131cce")
    @Override
    public Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj) {
        	return null;
    }

    @objid ("d98a2a1e-2d30-42da-8f3d-ae8fe0c468b7")
    @Override
    public Object visitBpmnStartEvent(BpmnStartEvent obj) {
        	return null;
    }

    @objid ("80dc5ff9-e40c-4a0b-b5c0-053cde204741")
    @Override
    public Object visitBpmnSubProcess(BpmnSubProcess obj) {
        	return null;
    }

    @objid ("68cb1a14-fd0d-443d-989b-b39cca8a1576")
    @Override
    public Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj) {
        	return null;
    }

    @objid ("7a54ced9-54a7-47f3-98bd-16a7ed13ece8")
    @Override
    public Object visitBpmnTask(BpmnTask obj) {
        	return null;
    }

    @objid ("1c942756-89f3-46d7-9d5f-96e63d8cd5a3")
    @Override
    public Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj) {
        	return null;
    }

    @objid ("cd218100-1aa2-4e3d-84b8-0a5e5db6200e")
    @Override
    public Object visitBpmnThrowEvent(BpmnThrowEvent obj) {
        	return null;
    }

    @objid ("65374876-24be-4c71-a615-306b73ec4178")
    @Override
    public Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj) {
        	return null;
    }

    @objid ("410d52ed-d442-42f7-812e-91d86e1ae1c0")
    @Override
    public Object visitBpmnTransaction(BpmnTransaction obj) {
        	return null;
    }

    @objid ("a866ae37-1f3a-4a6f-8186-9167e3123d34")
    @Override
    public Object visitBpmnUserTask(BpmnUserTask obj) {
        	return null;
    }

    @objid ("55ab0cd6-8235-4411-b31c-dc473de344be")
    @Override
    public Object visitBusinessRule(BusinessRule obj) {
        	return null;
    }

    @objid ("8b3bc540-f917-4d9f-993f-b337531e415d")
    @Override
    public Object visitBusinessRuleContainer(BusinessRuleContainer obj) {
        	return null;
    }

    @objid ("226ab5a5-3a57-4d93-b31a-7d46eb602014")
    @Override
    public Object visitCallAction(CallAction obj) {
        	return null;
    }

    @objid ("1c0b60a8-5d32-4b78-a171-30b86bbe8ddf")
    @Override
    public Object visitCallBehaviorAction(CallBehaviorAction obj) {
        	return null;
    }

    @objid ("931fffe1-ac25-43f9-9f64-521c59f63c4d")
    @Override
    public Object visitCallOperationAction(CallOperationAction obj) {
        	return null;
    }

    @objid ("a568b0d6-b323-471e-88a9-1f7792c1bc6c")
    @Override
    public Object visitCentralBufferNode(CentralBufferNode obj) {
        	return null;
    }

    @objid ("63cd8545-1548-44d4-a85c-6a5c8bf5fb9a")
    @Override
    public Object visitChoicePseudoState(ChoicePseudoState obj) {
        	return null;
    }

    @objid ("24c6bdb2-1b42-4f5b-a190-12768814602c")
    @Override
    public Object visitClass(Class obj) {
        	return null;
    }

    @objid ("4007221c-93e9-4189-98d3-55b161203dd6")
    @Override
    public Object visitClassAssociation(ClassAssociation obj) {
        	return null;
    }

    @objid ("22a9c3e3-3b2a-4486-a0c9-c82dc8a5bc3d")
    @Override
    public Object visitClassDiagram(ClassDiagram obj) {
        	return null;
    }

    @objid ("08badbe7-9f68-40b4-894c-f11d4b29a35c")
    @Override
    public Object visitClassifier(Classifier obj) {
        	return null;
    }

    @objid ("5a8faa2e-46e1-4de7-b922-70e9036263c8")
    @Override
    public Object visitClause(Clause obj) {
        	return null;
    }

    @objid ("14783ad1-a02f-48f5-b201-9ddd92249e73")
    @Override
    public Object visitCollaboration(Collaboration obj) {
        	return null;
    }

    @objid ("61bfef80-06dd-4d32-97bf-cecd547a9755")
    @Override
    public Object visitCollaborationUse(CollaborationUse obj) {
        	return null;
    }

    @objid ("2553f0cf-14d6-4037-b08b-494f6c777f0c")
    @Override
    public Object visitCombinedFragment(CombinedFragment obj) {
        	return null;
    }

    @objid ("677522a4-85d6-45c5-92af-e7d0f05234e9")
    @Override
    public Object visitCommunicationChannel(CommunicationChannel obj) {
        	return null;
    }

    @objid ("a9acb5dc-e420-447a-8d8b-60a8f4c5f8e5")
    @Override
    public Object visitCommunicationDiagram(CommunicationDiagram obj) {
        	return null;
    }

    @objid ("24508ecc-fcd5-45a2-8eb2-2dee73620282")
    @Override
    public Object visitCommunicationInteraction(CommunicationInteraction obj) {
        	return null;
    }

    @objid ("df9b1347-eeea-4991-9ad1-926c91684dfb")
    @Override
    public Object visitCommunicationMessage(CommunicationMessage obj) {
        	return null;
    }

    @objid ("ebd3cc98-aed0-4b3e-8608-1c507b48279f")
    @Override
    public Object visitCommunicationNode(CommunicationNode obj) {
        	return null;
    }

    @objid ("ac80b43c-e74b-426c-b83d-8346b40d2a5f")
    @Override
    public Object visitComponent(Component obj) {
        	return null;
    }

    @objid ("7efda445-3622-4492-affc-1273308e06c7")
    @Override
    public Object visitComponentRealization(ComponentRealization obj) {
        	return null;
    }

    @objid ("ad8bf68f-8716-462d-890e-9c93953568a8")
    @Override
    public Object visitCompositeStructureDiagram(CompositeStructureDiagram obj) {
        	return null;
    }

    @objid ("52fbdece-f00c-413e-81d8-71e036a44620")
    @Override
    public Object visitConditionalNode(ConditionalNode obj) {
        	return null;
    }

    @objid ("7e2fd921-1442-446b-b4c7-9d6ed348a6e0")
    @Override
    public Object visitConnectionPointReference(ConnectionPointReference obj) {
        	return null;
    }

    @objid ("58b6c599-04d4-41fc-8f42-cf68d40326be")
    @Override
    public Object visitConnector(Connector obj) {
        	return null;
    }

    @objid ("4896f6eb-9ed9-4a96-8804-a7fddb5205d4")
    @Override
    public Object visitConnectorEnd(ConnectorEnd obj) {
        	return null;
    }

    @objid ("71f61f62-f299-483a-a4bf-acaeac2ea9f6")
    @Override
    public Object visitConstraint(Constraint obj) {
        	return null;
    }

    @objid ("af0847e6-3ccd-4177-9660-abd668e61bf0")
    @Override
    public Object visitControlFlow(ControlFlow obj) {
        	return null;
    }

    @objid ("74f0284a-b7be-413a-b9df-2bb604e72af8")
    @Override
    public Object visitControlNode(ControlNode obj) {
        	return null;
    }

    @objid ("d95c18e8-fc00-4e4d-b9a5-f0fab2404b2d")
    @Override
    public Object visitDataFlow(DataFlow obj) {
        	return null;
    }

    @objid ("5fb2ccea-2594-4bdc-a85f-3f1476d948a6")
    @Override
    public Object visitDataStoreNode(DataStoreNode obj) {
        	return null;
    }

    @objid ("54231130-18ce-4392-98e8-c3f2bdb0c02c")
    @Override
    public Object visitDataType(DataType obj) {
        	return null;
    }

    @objid ("b062ce8a-9baf-4984-b489-77f82d9697cf")
    @Override
    public Object visitDecisionMergeNode(DecisionMergeNode obj) {
        	return null;
    }

    @objid ("2b5beaf4-8d95-4880-a438-218d7f070c63")
    @Override
    public Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj) {
        	return null;
    }

    @objid ("e1068a49-e8e5-46b2-9513-f1461c602e52")
    @Override
    public Object visitDependency(Dependency obj) {
        	return null;
    }

    @objid ("d33c8376-9fd4-4d2d-a7e4-ad0a9c8461a2")
    @Override
    public Object visitDeploymentDiagram(DeploymentDiagram obj) {
        	return null;
    }

    @objid ("3de5ec64-efa2-4057-a675-910994a29a8e")
    @Override
    public Object visitDiagramSet(DiagramSet obj) {
        	return null;
    }

    @objid ("e42490df-3b9a-4f1f-b34a-73fcf884497d")
    @Override
    public Object visitDictionary(Dictionary obj) {
        	return null;
    }

    @objid ("4fc9cdeb-1c5a-45e2-b71c-e2df3f0032f8")
    @Override
    public Object visitDurationConstraint(DurationConstraint obj) {
        	return null;
    }

    @objid ("2378405e-d403-4b6f-a9b1-289cbd0861c0")
    @Override
    public Object visitElement(Element obj) {
        	return null;
    }

    @objid ("66193d79-fd16-4c47-ac21-5679dc74b605")
    @Override
    public Object visitElementImport(ElementImport obj) {
        	return null;
    }

    @objid ("3cfc9bba-d0fb-41c6-a9ac-daa869f41894")
    @Override
    public Object visitElementRealization(ElementRealization obj) {
        	return null;
    }

    @objid ("bfe2b550-9cee-4bc0-8fa2-e20661be7a27")
    @Override
    public Object visitEntryPointPseudoState(EntryPointPseudoState obj) {
        	return null;
    }

    @objid ("7e214d31-ec38-4be3-86ab-f3cd1ec26cc2")
    @Override
    public Object visitEnumeratedPropertyType(EnumeratedPropertyType obj) {
        	return null;
    }

    @objid ("a4067fc8-4bc8-4165-b262-63817632b522")
    @Override
    public Object visitEnumeration(Enumeration obj) {
        	return null;
    }

    @objid ("080f58c3-77ca-46d5-a164-b32017f55cef")
    @Override
    public Object visitEnumerationLiteral(EnumerationLiteral obj) {
        	return null;
    }

    @objid ("a47338b5-4814-48c0-8159-1546a7f638e7")
    @Override
    public Object visitEvent(Event obj) {
        	return null;
    }

    @objid ("4a24a0c5-61cf-4b5c-b0e9-669fe2a433a5")
    @Override
    public Object visitExceptionHandler(ExceptionHandler obj) {
        	return null;
    }

    @objid ("7cba5755-1814-4b0e-9f9d-d80679b91737")
    @Override
    public Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj) {
        	return null;
    }

    @objid ("8a9f6225-5449-4bcd-a931-5eb15c23f284")
    @Override
    public Object visitExecutionSpecification(ExecutionSpecification obj) {
        	return null;
    }

    @objid ("9a6549ab-1307-40c2-8eb6-9ad29e3d9749")
    @Override
    public Object visitExitPointPseudoState(ExitPointPseudoState obj) {
        	return null;
    }

    @objid ("c5becf05-9576-42ab-9d9d-ae33a92a3ad8")
    @Override
    public Object visitExpansionNode(ExpansionNode obj) {
        	return null;
    }

    @objid ("5eccd0f1-42c1-4957-ac67-f743656d95d1")
    @Override
    public Object visitExpansionRegion(ExpansionRegion obj) {
        	return null;
    }

    @objid ("13254594-e0e1-4a1c-a9be-2a13a5af3cea")
    @Override
    public Object visitExtensionPoint(ExtensionPoint obj) {
        	return null;
    }

    @objid ("744062f3-16f1-4da2-b50c-0f90290e14cf")
    @Override
    public Object visitExternDocument(ExternDocument obj) {
        	return null;
    }

    @objid ("17d497ed-2004-4f9f-b1e3-fff6689f2e07")
    @Override
    public Object visitExternDocumentType(ExternDocumentType obj) {
        	return null;
    }

    @objid ("1121c142-6dd9-4761-bc9c-85e040a7dcd0")
    @Override
    public Object visitExternProcessor(ExternProcessor obj) {
        	return null;
    }

    @objid ("d7b57293-50ce-4fe9-a3be-8dbb41454d7c")
    @Override
    public Object visitFeature(Feature obj) {
        	return null;
    }

    @objid ("8bc7d6f3-c87b-4fec-bd0c-0c839bdde56c")
    @Override
    public Object visitFinalNode(FinalNode obj) {
        	return null;
    }

    @objid ("e3a29bbe-5367-4125-bd06-c80d7873c98d")
    @Override
    public Object visitFinalState(FinalState obj) {
        	return null;
    }

    @objid ("21f734e2-48fb-4fac-9376-fb88719cdc32")
    @Override
    public Object visitFlowFinalNode(FlowFinalNode obj) {
        	return null;
    }

    @objid ("172129ba-d61d-43b3-8394-681669fd592e")
    @Override
    public Object visitForkJoinNode(ForkJoinNode obj) {
        	return null;
    }

    @objid ("861b0f2e-ae03-4fe8-8afc-7e8d8996b494")
    @Override
    public Object visitForkPseudoState(ForkPseudoState obj) {
        	return null;
    }

    @objid ("ac388131-0472-45f0-a1cc-c3cd83bcd9f3")
    @Override
    public Object visitGate(Gate obj) {
        	return null;
    }

    @objid ("deea5288-7e78-45b6-838d-897d8c0474a9")
    @Override
    public Object visitGeneralClass(GeneralClass obj) {
        	return null;
    }

    @objid ("045aab82-e4df-48c1-aa52-74e46f511182")
    @Override
    public Object visitGeneralOrdering(GeneralOrdering obj) {
        	return null;
    }

    @objid ("d4d332c4-badf-49a8-889c-6f20d5b3a248")
    @Override
    public Object visitGeneralization(Generalization obj) {
        	return null;
    }

    @objid ("f917590d-d8ff-42dc-a67e-cfdc60c364d1")
    @Override
    public Object visitGenericAnalystContainer(GenericAnalystContainer obj) {
        	return null;
    }

    @objid ("b6456cc9-747e-4bc7-97a3-e836bf821b16")
    @Override
    public Object visitGenericAnalystElement(GenericAnalystElement obj) {
        	return null;
    }

    @objid ("684809a9-f55a-4e36-80ae-8e1345d3ce2f")
    @Override
    public Object visitGoal(Goal obj) {
        	return null;
    }

    @objid ("57a802b5-f9f7-4aa4-be29-74c265afad15")
    @Override
    public Object visitGoalContainer(GoalContainer obj) {
        	return null;
    }

    @objid ("cc3726a7-b163-40f4-874a-2125fcd99212")
    @Override
    public Object visitInformationFlow(InformationFlow obj) {
        	return null;
    }

    @objid ("748f2d4f-2ebe-47a6-82e5-b27b41f441c8")
    @Override
    public Object visitInformationItem(InformationItem obj) {
        	return null;
    }

    @objid ("ab4617f3-3102-437c-9672-97f2423f98bb")
    @Override
    public Object visitInitialNode(InitialNode obj) {
        	return null;
    }

    @objid ("7d95c2a6-0dad-4796-9eea-7adc15bfbb85")
    @Override
    public Object visitInitialPseudoState(InitialPseudoState obj) {
        	return null;
    }

    @objid ("a8d9328a-287f-4390-864f-3fcd3b463db9")
    @Override
    public Object visitInputPin(InputPin obj) {
        	return null;
    }

    @objid ("89992211-6399-4aae-8cea-0e57cf7835ed")
    @Override
    public Object visitInstance(Instance obj) {
        	return null;
    }

    @objid ("ec6827f8-8a50-4dd5-83ba-209bc3ecc250")
    @Override
    public Object visitInstanceNode(InstanceNode obj) {
        	return null;
    }

    @objid ("64fb6586-3f52-4ce8-a99c-8be9c7a753b7")
    @Override
    public Object visitInteraction(Interaction obj) {
        	return null;
    }

    @objid ("967c54ce-ce2d-4b25-bad6-de16196a91af")
    @Override
    public Object visitInteractionFragment(InteractionFragment obj) {
        	return null;
    }

    @objid ("57eb186c-c782-48c6-b543-f5526113c289")
    @Override
    public Object visitInteractionOperand(InteractionOperand obj) {
        	return null;
    }

    @objid ("11f97a41-a1e8-41b9-ae35-6d8df3201386")
    @Override
    public Object visitInteractionUse(InteractionUse obj) {
        	return null;
    }

    @objid ("83d7aa3e-6358-4a98-921f-d9acb7d31fda")
    @Override
    public Object visitInterface(Interface obj) {
        	return null;
    }

    @objid ("feeee0e7-9f21-4962-a7c8-2fafdd3b967c")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization obj) {
        	return null;
    }

    @objid ("9116376e-37c1-46a1-bc03-32bb51a25845")
    @Override
    public Object visitInternalTransition(InternalTransition obj) {
        	return null;
    }

    @objid ("037f4bb3-1b68-4aaf-8786-197c96fa4963")
    @Override
    public Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj) {
        	return null;
    }

    @objid ("e0617d83-999c-4910-99ae-57b98e7ff3d9")
    @Override
    public Object visitJoinPseudoState(JoinPseudoState obj) {
        	return null;
    }

    @objid ("d47fafc6-22aa-404f-9aec-b0ef6c120165")
    @Override
    public Object visitJunctionPseudoState(JunctionPseudoState obj) {
        	return null;
    }

    @objid ("3a14ce59-6900-4fbc-93f3-42173e62237d")
    @Override
    public Object visitLifeline(Lifeline obj) {
        	return null;
    }

    @objid ("2dc828c5-7269-4ffd-ba2e-e113377e5c3e")
    @Override
    public Object visitLink(Link obj) {
        	return null;
    }

    @objid ("e9c96f5f-770e-4d00-ba7e-779066576c08")
    @Override
    public Object visitLinkEnd(LinkEnd obj) {
        	return null;
    }

    @objid ("1d570ca0-e4bd-4609-870b-d5ab0be2605e")
    @Override
    public Object visitLocalPropertyTable(LocalPropertyTable obj) {
        	return null;
    }

    @objid ("e5a3fa82-ad86-4074-8fd7-a0598c0b4a7e")
    @Override
    public Object visitLoopNode(LoopNode obj) {
        	return null;
    }

    @objid ("b665017d-397b-4e0f-ba7b-55421b82380f")
    @Override
    public Object visitManifestation(Manifestation obj) {
        	return null;
    }

    @objid ("06c533eb-2879-43ca-a60e-93f96b7bad09")
    @Override
    public Object visitMatrixDefinition(MatrixDefinition obj) {
        	return null;
    }

    @objid ("b18dba70-9e87-4fbb-bb2d-aa1d657df0af")
    @Override
    public Object visitMatrixValueDefinition(MatrixValueDefinition obj) {
        	return null;
    }

    @objid ("63289bc3-b665-4b3c-b501-d94d26d15d5a")
    @Override
    public Object visitMessage(Message obj) {
        	return null;
    }

    @objid ("d76ff55f-93cf-4f0f-aefb-e05ca5d6f80a")
    @Override
    public Object visitMessageEnd(MessageEnd obj) {
        	return null;
    }

    @objid ("4b0bfd7b-1197-46b7-b03b-6f6b9bf77d15")
    @Override
    public Object visitMessageFlow(MessageFlow obj) {
        	return null;
    }

    @objid ("ede45ff6-c345-4364-b161-9f4dcd0c0d25")
    @Override
    public Object visitMetaclassReference(MetaclassReference obj) {
        	return null;
    }

    @objid ("1fbc9df1-c448-4d08-9293-db905352806e")
    @Override
    public Object visitModelElement(ModelElement obj) {
        	return null;
    }

    @objid ("f5222906-0b2f-4dbd-b07c-b6b68ea6373a")
    @Override
    public Object visitModelTree(ModelTree obj) {
        	return null;
    }

    @objid ("a6ff1c80-dc19-4e2b-bfeb-0f6341414ce7")
    @Override
    public Object visitModuleComponent(ModuleComponent obj) {
        	return null;
    }

    @objid ("e14811f2-f98c-4c4b-a9ec-6a45613ce4b7")
    @Override
    public Object visitModuleParameter(ModuleParameter obj) {
        	return null;
    }

    @objid ("cc3466a4-0202-493a-a83b-cec31c0baa55")
    @Override
    public Object visitNameSpace(NameSpace obj) {
        	return null;
    }

    @objid ("a8df6e5a-6c4b-4a0f-a9ab-d83e542d2c3c")
    @Override
    public Object visitNamespaceUse(NamespaceUse obj) {
        	return null;
    }

    @objid ("598b87af-6721-44b7-9362-a63fb863c07e")
    @Override
    public Object visitNaryAssociation(NaryAssociation obj) {
        	return null;
    }

    @objid ("7bb43bac-a71c-41d1-8ea9-d336c693d672")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd obj) {
        	return null;
    }

    @objid ("37e7a5f6-21fc-4fa7-991b-c84adb69260e")
    @Override
    public Object visitNaryConnector(NaryConnector obj) {
        	return null;
    }

    @objid ("0d58951b-7490-4d41-a99d-fe316c8cc9bb")
    @Override
    public Object visitNaryConnectorEnd(NaryConnectorEnd obj) {
        	return null;
    }

    @objid ("85c6265a-3bde-417f-a902-f9c51a6637c1")
    @Override
    public Object visitNaryLink(NaryLink obj) {
        	return null;
    }

    @objid ("a3223157-2ee8-44ad-b125-376dfa97c29c")
    @Override
    public Object visitNaryLinkEnd(NaryLinkEnd obj) {
        	return null;
    }

    @objid ("d772f34e-b297-4358-84db-0919a2305351")
    @Override
    public Object visitNode(Node obj) {
        	return null;
    }

    @objid ("eb4f0c6d-0bc4-464a-a68f-3a55d5382bfe")
    @Override
    public Object visitNote(Note obj) {
        	return null;
    }

    @objid ("78e21c01-77d8-429b-8987-ebe62e92d38d")
    @Override
    public Object visitNoteType(NoteType obj) {
        	return null;
    }

    @objid ("153544eb-40ea-4200-bff8-455c37bcdd97")
    @Override
    public Object visitObjectDiagram(ObjectDiagram obj) {
        	return null;
    }

    @objid ("7ce9dc25-707f-489f-b01e-575e87ab5d19")
    @Override
    public Object visitObjectFlow(ObjectFlow obj) {
        	return null;
    }

    @objid ("572e4081-60f2-4b2f-a2d5-4d3d04f2f6fc")
    @Override
    public Object visitObjectNode(ObjectNode obj) {
        	return null;
    }

    @objid ("5214239b-cb3e-42c1-85cd-95b602771665")
    @Override
    public Object visitOccurrenceSpecification(OccurrenceSpecification obj) {
        	return null;
    }

    @objid ("b245717a-068c-42d1-bd40-cb2bfc21ab2d")
    @Override
    public Object visitOpaqueAction(OpaqueAction obj) {
        	return null;
    }

    @objid ("544bd847-a942-4424-9e2d-9c4679abe957")
    @Override
    public Object visitOpaqueBehavior(OpaqueBehavior obj) {
        	return null;
    }

    @objid ("1c2a6af5-2e72-49ec-a5d4-b4b953aea2a4")
    @Override
    public Object visitOperation(Operation obj) {
        	return null;
    }

    @objid ("b9fe13e6-c5fe-4475-8a69-d99943981254")
    @Override
    public Object visitOutputPin(OutputPin obj) {
        	return null;
    }

    @objid ("7d9cd572-a5d9-4e4c-bf86-2816f7867d9e")
    @Override
    public Object visitPackage(Package obj) {
        	return null;
    }

    @objid ("9a2f4d14-c35b-4f25-92bb-d10156006d06")
    @Override
    public Object visitPackageImport(PackageImport obj) {
        	return null;
    }

    @objid ("70a2f233-5197-449e-ac50-5130e1ebe465")
    @Override
    public Object visitPackageMerge(PackageMerge obj) {
        	return null;
    }

    @objid ("f0525e3f-d41b-4e75-b8cc-b981cc95369a")
    @Override
    public Object visitParameter(Parameter obj) {
        	return null;
    }

    @objid ("22ba62c2-1d9c-4037-88a8-92b95249aa17")
    @Override
    public Object visitPartDecomposition(PartDecomposition obj) {
        	return null;
    }

    @objid ("a7fd3540-4356-4497-bc3b-acf134d43bf2")
    @Override
    public Object visitPin(Pin obj) {
        	return null;
    }

    @objid ("b9aaf815-a8d1-4f14-90a9-daaa47e0d170")
    @Override
    public Object visitPort(Port obj) {
        	return null;
    }

    @objid ("aedb0b2c-44fb-4a39-bd0b-18bffd9ef85e")
    @Override
    public Object visitProfile(Profile obj) {
        	return null;
    }

    @objid ("e38c3f55-4501-4298-a466-b9a8db63ed90")
    @Override
    public Object visitProject(Project obj) {
        	return null;
    }

    @objid ("97385917-1c59-4b57-9dae-7325bd19091a")
    @Override
    public Object visitPropertyContainer(PropertyContainer obj) {
        	return null;
    }

    @objid ("89454e23-30c8-42ab-ae00-10f906dc7e60")
    @Override
    public Object visitPropertyDefinition(PropertyDefinition obj) {
        	return null;
    }

    @objid ("9526bf74-28e1-4f4f-a968-bb34b7fee649")
    @Override
    public Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj) {
        	return null;
    }

    @objid ("9405592b-3b12-4b8e-ab8a-aa645cda9985")
    @Override
    public Object visitPropertyTable(PropertyTable obj) {
        	return null;
    }

    @objid ("60916c85-3274-490b-96f5-0ae7c8808145")
    @Override
    public Object visitPropertyTableDefinition(PropertyTableDefinition obj) {
        	return null;
    }

    @objid ("50fcd010-53fb-46e2-9007-9c4865411241")
    @Override
    public Object visitPropertyType(PropertyType obj) {
        	return null;
    }

    @objid ("0b8b7c9c-d6a7-41a0-92c5-f03773b4e39a")
    @Override
    public Object visitProvidedInterface(ProvidedInterface obj) {
        	return null;
    }

    @objid ("5cac67f6-5d9e-4733-b237-ea2bda3c3e3e")
    @Override
    public Object visitQueryDefinition(QueryDefinition obj) {
        	return null;
    }

    @objid ("8cf97601-12ce-4cf0-8273-ee72d86cd361")
    @Override
    public Object visitRaisedException(RaisedException obj) {
        	return null;
    }

    @objid ("759dbe23-71a0-446b-a110-fe7057bfcbf2")
    @Override
    public Object visitRegion(Region obj) {
        	return null;
    }

    @objid ("9dea582d-d884-461d-9780-25b6c8990b27")
    @Override
    public Object visitRequiredInterface(RequiredInterface obj) {
        	return null;
    }

    @objid ("8ba73c23-ffe2-4f44-b12e-5f5b2580528a")
    @Override
    public Object visitRequirement(Requirement obj) {
        	return null;
    }

    @objid ("6ad4024b-2b1c-4a68-9563-d3116190e39f")
    @Override
    public Object visitRequirementContainer(RequirementContainer obj) {
        	return null;
    }

    @objid ("564599da-8496-41ae-a7c2-42c56df540ee")
    @Override
    public Object visitRisk(Risk obj) {
        	return null;
    }

    @objid ("17a298b4-26fe-415f-8c85-196d1f317b87")
    @Override
    public Object visitRiskContainer(RiskContainer obj) {
        	return null;
    }

    @objid ("af358cff-e3a9-4668-8dc3-9ce916b91e09")
    @Override
    public Object visitSendSignalAction(SendSignalAction obj) {
        	return null;
    }

    @objid ("ab03065d-8546-417c-9dfe-e739d9796523")
    @Override
    public Object visitSequenceDiagram(SequenceDiagram obj) {
        	return null;
    }

    @objid ("da2bda27-7c92-4dee-9e6d-2741a28cfacf")
    @Override
    public Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj) {
        	return null;
    }

    @objid ("c069cdb6-7beb-4583-b673-c1c73112f3f1")
    @Override
    public Object visitSignal(Signal obj) {
        	return null;
    }

    @objid ("9b5867bb-c4df-410e-98ab-ba4ef800f2b8")
    @Override
    public Object visitState(State obj) {
        	return null;
    }

    @objid ("4c59b18b-ac03-4f68-8fcc-66f40faaa3d8")
    @Override
    public Object visitStateInvariant(StateInvariant obj) {
        	return null;
    }

    @objid ("1793435b-b58d-4902-b4ae-b61b76709742")
    @Override
    public Object visitStateMachine(StateMachine obj) {
        	return null;
    }

    @objid ("ea0a93c4-b06f-4d47-ae29-16f487cf267d")
    @Override
    public Object visitStateMachineDiagram(StateMachineDiagram obj) {
        	return null;
    }

    @objid ("18fb464a-a5a7-4c30-9d6f-98e101f0a5aa")
    @Override
    public Object visitStateVertex(StateVertex obj) {
        	return null;
    }

    @objid ("bcb61241-83bd-4837-b01e-54d294a04ee9")
    @Override
    public Object visitStaticDiagram(StaticDiagram obj) {
        	return null;
    }

    @objid ("721b055d-ad1c-4c9d-a7e0-c886997bf8a1")
    @Override
    public Object visitStereotype(Stereotype obj) {
        	return null;
    }

    @objid ("805d37f1-89b4-4487-8968-829ce50813eb")
    @Override
    public Object visitStructuralFeature(StructuralFeature obj) {
        	return null;
    }

    @objid ("ef0bfa90-2033-4aa3-aaa2-fbab6686b84a")
    @Override
    public Object visitStructuredActivityNode(StructuredActivityNode obj) {
        	return null;
    }

    @objid ("78794e30-b842-4914-a90c-a17e8761070f")
    @Override
    public Object visitSubstitution(Substitution obj) {
        	return null;
    }

    @objid ("3efa55c5-8517-4926-b13e-b14b60296109")
    @Override
    public Object visitTagParameter(TagParameter obj) {
        	return null;
    }

    @objid ("3dd00903-60a2-4b3c-a635-40ed4267b65f")
    @Override
    public Object visitTagType(TagType obj) {
        	return null;
    }

    @objid ("6ffacf97-e8d1-49b4-b3e8-5a45402b2db9")
    @Override
    public Object visitTaggedValue(TaggedValue obj) {
        	return null;
    }

    @objid ("6f6bee66-31fa-49af-a4d9-e2e535b76207")
    @Override
    public Object visitTemplateBinding(TemplateBinding obj) {
        	return null;
    }

    @objid ("68965f07-e0de-4c6b-a907-15ca95cf59ea")
    @Override
    public Object visitTemplateParameter(TemplateParameter obj) {
        	return null;
    }

    @objid ("b623ba96-0687-407c-8e92-c462f047dd8f")
    @Override
    public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj) {
        	return null;
    }

    @objid ("d6cec0b6-5adf-4a64-8dee-a97a1485d44c")
    @Override
    public Object visitTerm(Term obj) {
        	return null;
    }

    @objid ("7e841009-44ae-4cab-b19c-f9a1f901e694")
    @Override
    public Object visitTerminatePseudoState(TerminatePseudoState obj) {
        	return null;
    }

    @objid ("bb4d2e6f-9eed-4be2-b43f-1e9fa7a70703")
    @Override
    public Object visitTerminateSpecification(TerminateSpecification obj) {
        	return null;
    }

    @objid ("345bbc6f-e8fe-4a05-b65a-e3b78d398b0d")
    @Override
    public Object visitTransition(Transition obj) {
        	return null;
    }

    @objid ("bb38e731-d647-479b-9561-2aa4fc18cb51")
    @Override
    public Object visitTypedPropertyTable(TypedPropertyTable obj) {
        	return null;
    }

    @objid ("86bcfa03-b5a5-4000-a918-9ee65e357d0c")
    @Override
    public Object visitUsage(Usage obj) {
        	return null;
    }

    @objid ("9b92f053-1961-447c-8a19-bac74f1aa54a")
    @Override
    public Object visitUseCase(UseCase obj) {
        	return null;
    }

    @objid ("38d24108-065d-4b96-9508-c1155d495d7a")
    @Override
    public Object visitUseCaseDependency(UseCaseDependency obj) {
        	return null;
    }

    @objid ("178c983a-2dff-4f85-929f-0a6b9846dd69")
    @Override
    public Object visitUseCaseDiagram(UseCaseDiagram obj) {
        	return null;
    }

    @objid ("b44217ea-3442-461c-834f-4ed2a7b2ed2b")
    @Override
    public Object visitValuePin(ValuePin obj) {
        	return null;
    }

}
