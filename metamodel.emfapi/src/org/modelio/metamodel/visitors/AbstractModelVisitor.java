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

@objid ("00106c06-4f2c-1032-829a-001ec947cd2a")
public class AbstractModelVisitor implements IModelVisitor {
    @objid ("d16536ad-259a-4cd2-b106-8bb2588c7cab")
    @Override
    public Object visitAbstraction(Abstraction obj) {
        	return null;
    }

    @objid ("713762ae-72af-4501-b637-4eb0de7f6e51")
    @Override
    public Object visitConstraint(Constraint obj) {
        	return null;
    }

    @objid ("d7252527-7f59-4bb7-b3c3-60566b4fdc72")
    @Override
    public Object visitDependency(Dependency obj) {
        	return null;
    }

    @objid ("1020d15b-b3b0-48bd-817a-29509d8afd08")
    @Override
    public Object visitElement(Element obj) {
        	return null;
    }

    @objid ("e592df1a-1cae-471e-b7fb-f4c365227707")
    @Override
    public Object visitModelElement(ModelElement obj) {
        	return null;
    }

    @objid ("b874170a-23dc-4df8-9764-87cc3942a58d")
    @Override
    public Object visitModelTree(ModelTree obj) {
        	return null;
    }

    @objid ("9f776a6b-d260-4190-b1d2-9b9707eb7558")
    @Override
    public Object visitNote(Note obj) {
        	return null;
    }

    @objid ("0215d746-06de-43e1-ae1c-c7bb39454d1a")
    @Override
    public Object visitNoteType(NoteType obj) {
        	return null;
    }

    @objid ("cb647cb2-edf0-4c0b-9544-a8f5f5a86850")
    @Override
    public Object visitProfile(Profile obj) {
        	return null;
    }

    @objid ("769fad21-144a-40a0-b227-99d41f5259d0")
    @Override
    public Object visitStereotype(Stereotype obj) {
        	return null;
    }

    @objid ("e83bea23-28ab-4b81-b14c-f80ccf864c36")
    @Override
    public Object visitSubstitution(Substitution obj) {
        	return null;
    }

    @objid ("7349a50f-407c-4788-88b4-09a5b90821de")
    @Override
    public Object visitTagParameter(TagParameter obj) {
        	return null;
    }

    @objid ("72f0b8dd-7600-4d67-9930-eeaee0d16451")
    @Override
    public Object visitTagType(TagType obj) {
        	return null;
    }

    @objid ("6c9031aa-568f-4827-ae2c-4c7a70b84714")
    @Override
    public Object visitTaggedValue(TaggedValue obj) {
        	return null;
    }

    @objid ("6406b40a-e282-4c31-ac9a-53f1208bc533")
    @Override
    public Object visitUsage(Usage obj) {
        	return null;
    }

    @objid ("3a4e149d-deb5-4cb8-8a77-d467012d13b7")
    @Override
    public Object visitMetaclassReference(MetaclassReference obj) {
        	return null;
    }

    @objid ("37cc51da-b676-40fd-b3b5-45925f653079")
    @Override
    public Object visitExternDocument(ExternDocument obj) {
        	return null;
    }

    @objid ("fe5c474f-bbe9-4b4a-88f7-9fb1a450ae4a")
    @Override
    public Object visitExternDocumentType(ExternDocumentType obj) {
        	return null;
    }

    @objid ("f6c31791-b0ce-4a92-86f7-5095f812e371")
    @Override
    public Object visitEnumeratedPropertyType(EnumeratedPropertyType obj) {
        	return null;
    }

    @objid ("788f027a-e4ea-4f8c-a4c3-78acfb68ff42")
    @Override
    public Object visitLocalPropertyTable(LocalPropertyTable obj) {
        	return null;
    }

    @objid ("51b3fec8-33fd-44f0-b2a9-2de26a3eb68b")
    @Override
    public Object visitPropertyDefinition(PropertyDefinition obj) {
        	return null;
    }

    @objid ("d724484d-c54f-4510-b00b-c7ba2e422016")
    @Override
    public Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj) {
        	return null;
    }

    @objid ("b95fd41e-0f79-4192-9ca1-e30740e8e2cc")
    @Override
    public Object visitPropertyTable(PropertyTable obj) {
        	return null;
    }

    @objid ("8eea5449-af9a-43c8-a71b-2d1298ea748a")
    @Override
    public Object visitPropertyTableDefinition(PropertyTableDefinition obj) {
        	return null;
    }

    @objid ("14a04cc6-ded6-4aa4-9111-459954dda193")
    @Override
    public Object visitPropertyType(PropertyType obj) {
        	return null;
    }

    @objid ("2aed3543-f96e-4a26-9661-782cea6c71a4")
    @Override
    public Object visitTypedPropertyTable(TypedPropertyTable obj) {
        	return null;
    }

    @objid ("f1f3b918-e4d3-437c-ab55-9f39828ffbe6")
    @Override
    public Object visitMatrixDefinition(MatrixDefinition obj) {
        	return null;
    }

    @objid ("9b53d907-13d8-40a1-9658-8d54309f455f")
    @Override
    public Object visitQueryDefinition(QueryDefinition obj) {
        	return null;
    }

    @objid ("e83e9aad-672c-4657-8ee5-e1dbf3787138")
    @Override
    public Object visitMatrixValueDefinition(MatrixValueDefinition obj) {
        	return null;
    }

    @objid ("017dcfc9-5ad9-4f31-8d51-239e33faec68")
    @Override
    public Object visitExternProcessor(ExternProcessor obj) {
        	return null;
    }

    @objid ("c4cd8fc3-da83-4dc4-b720-3a45ca1575f0")
    @Override
    public Object visitArtifact(Artifact obj) {
        	return null;
    }

    @objid ("f7055728-f119-4b07-802c-e0faaac58c74")
    @Override
    public Object visitAssociationEnd(AssociationEnd obj) {
        	return null;
    }

    @objid ("6bb712ae-9689-4dd6-a8ff-e2aab4b60983")
    @Override
    public Object visitAttribute(Attribute obj) {
        	return null;
    }

    @objid ("c52a9b35-fe10-42fb-bc18-54a70aa0f99e")
    @Override
    public Object visitAttributeLink(AttributeLink obj) {
        	return null;
    }

    @objid ("fc3ad545-71fd-459f-b169-c12592b439dc")
    @Override
    public Object visitBindableInstance(BindableInstance obj) {
        	return null;
    }

    @objid ("44183f7a-2bf8-40b3-b219-f28c27d06cd2")
    @Override
    public Object visitBinding(Binding obj) {
        	return null;
    }

    @objid ("c302d9e7-93b9-4bfe-896c-905b3c7c9d51")
    @Override
    public Object visitClass(Class obj) {
        	return null;
    }

    @objid ("7d1e51a6-4b84-4231-bde2-2731e084a90f")
    @Override
    public Object visitClassAssociation(ClassAssociation obj) {
        	return null;
    }

    @objid ("0ae8e594-8233-4f68-a220-c69eeb056ec3")
    @Override
    public Object visitClassifier(Classifier obj) {
        	return null;
    }

    @objid ("de30fbf0-63dc-4a86-a452-da8d2dcb5c5e")
    @Override
    public Object visitCollaboration(Collaboration obj) {
        	return null;
    }

    @objid ("6dbc875f-6a1d-47bc-9199-9071620f902b")
    @Override
    public Object visitCollaborationUse(CollaborationUse obj) {
        	return null;
    }

    @objid ("067cda66-1a79-48c5-8f41-18f0656ff9ef")
    @Override
    public Object visitComponent(Component obj) {
        	return null;
    }

    @objid ("34a98472-2661-4142-bcaf-7c04aa77c1a7")
    @Override
    public Object visitNaryConnector(NaryConnector obj) {
        	return null;
    }

    @objid ("af5e124e-1313-4008-b038-bdfa7376b6ca")
    @Override
    public Object visitConnectorEnd(ConnectorEnd obj) {
        	return null;
    }

    @objid ("c7d4f504-a263-4b66-9456-c67dc2122851")
    @Override
    public Object visitDataType(DataType obj) {
        	return null;
    }

    @objid ("e7d89f7c-2f0c-4dff-948c-ab834a7262c2")
    @Override
    public Object visitElementImport(ElementImport obj) {
        	return null;
    }

    @objid ("bb6a5865-e880-4116-b744-2eaa5bc1a982")
    @Override
    public Object visitElementRealization(ElementRealization obj) {
        	return null;
    }

    @objid ("cb5ffc18-bf01-449d-9724-96987905547b")
    @Override
    public Object visitEnumeration(Enumeration obj) {
        	return null;
    }

    @objid ("8a18a453-4386-4b10-995c-e9fc4db47884")
    @Override
    public Object visitEnumerationLiteral(EnumerationLiteral obj) {
        	return null;
    }

    @objid ("4c56725d-65ad-4bed-a5b8-c3953a234717")
    @Override
    public Object visitFeature(Feature obj) {
        	return null;
    }

    @objid ("957eaf14-7670-4f26-bb1a-d1f7e146935d")
    @Override
    public Object visitGeneralClass(GeneralClass obj) {
        	return null;
    }

    @objid ("2fba3f9a-9b32-4b53-98aa-36c4ce73b865")
    @Override
    public Object visitGeneralization(Generalization obj) {
        	return null;
    }

    @objid ("6f46f6b1-80a1-4f52-a385-35d5eb372970")
    @Override
    public Object visitInstance(Instance obj) {
        	return null;
    }

    @objid ("77b04b38-c77c-4ff3-bb52-a39b214ebd18")
    @Override
    public Object visitInterface(Interface obj) {
        	return null;
    }

    @objid ("5db5cccc-b25b-4f96-b94a-e089f10be607")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization obj) {
        	return null;
    }

    @objid ("4cd75622-c430-48a6-80ce-a61052d6ec6a")
    @Override
    public Object visitLinkEnd(LinkEnd obj) {
        	return null;
    }

    @objid ("f69d336c-6514-4dc0-855f-7ccd21aec5df")
    @Override
    public Object visitManifestation(Manifestation obj) {
        	return null;
    }

    @objid ("6371d933-9689-4866-9625-ffed59fc53ab")
    @Override
    public Object visitNameSpace(NameSpace obj) {
        	return null;
    }

    @objid ("389e38a9-bf59-4584-8458-605a26fb0928")
    @Override
    public Object visitNamespaceUse(NamespaceUse obj) {
        	return null;
    }

    @objid ("5c0c34d1-b39b-4f3a-8d80-bfb12f70d303")
    @Override
    public Object visitNode(Node obj) {
        	return null;
    }

    @objid ("b323cc88-b6a7-4277-a6f8-797a9003f152")
    @Override
    public Object visitOperation(Operation obj) {
        	return null;
    }

    @objid ("5577ff5d-f186-4e86-8bfa-8ea9d229db86")
    @Override
    public Object visitPackage(Package obj) {
        	return null;
    }

    @objid ("183e008c-8e42-448e-9ae4-c1d5accdc4ad")
    @Override
    public Object visitPackageImport(PackageImport obj) {
        	return null;
    }

    @objid ("c024345a-ebba-47ee-9986-ee468ab9293c")
    @Override
    public Object visitPackageMerge(PackageMerge obj) {
        	return null;
    }

    @objid ("0d96af56-312e-4318-b19c-75b40e98b4fe")
    @Override
    public Object visitParameter(Parameter obj) {
        	return null;
    }

    @objid ("64e44cbf-638c-4e7a-bb2e-ed0896947b2f")
    @Override
    public Object visitPort(Port obj) {
        	return null;
    }

    @objid ("64b67008-8a53-47f8-b06c-d697727752a4")
    @Override
    public Object visitProvidedInterface(ProvidedInterface obj) {
        	return null;
    }

    @objid ("0e5ebdb4-8155-4531-be08-c622975fec0d")
    @Override
    public Object visitRaisedException(RaisedException obj) {
        	return null;
    }

    @objid ("fa1b37dc-ef8e-4475-a4ef-5fd10cd75cf3")
    @Override
    public Object visitRequiredInterface(RequiredInterface obj) {
        	return null;
    }

    @objid ("b9720eb3-6451-4ddd-b043-e177f33dff96")
    @Override
    public Object visitTemplateBinding(TemplateBinding obj) {
        	return null;
    }

    @objid ("07aa72c0-63bf-4dd6-96c4-949dc07091f9")
    @Override
    public Object visitTemplateParameter(TemplateParameter obj) {
        	return null;
    }

    @objid ("6ed70949-ca4b-4302-8ef5-bbdb71a8d71a")
    @Override
    public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj) {
        	return null;
    }

    @objid ("a69fb24c-abaf-4ce6-b7dc-c843f03ebb06")
    @Override
    public Object visitStructuralFeature(StructuralFeature obj) {
        	return null;
    }

    @objid ("13ded491-ff0e-47b7-a4d7-b87c422bae52")
    @Override
    public Object visitBehavioralFeature(BehavioralFeature obj) {
        	return null;
    }

    @objid ("e4cf1178-be35-4776-963d-df9efd2717ed")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd obj) {
        	return null;
    }

    @objid ("c2b75817-6641-4c11-b25e-ad411f464bff")
    @Override
    public Object visitNaryAssociation(NaryAssociation obj) {
        	return null;
    }

    @objid ("90be6a3c-ce97-4fe1-8ef4-2b802cf4b08f")
    @Override
    public Object visitNaryLink(NaryLink obj) {
        	return null;
    }

    @objid ("36f1f0fd-2aa9-438d-85a1-7bb4c9cab989")
    @Override
    public Object visitNaryLinkEnd(NaryLinkEnd obj) {
        	return null;
    }

    @objid ("431786a1-f019-4299-b162-8a63e46b9e58")
    @Override
    public Object visitNaryConnectorEnd(NaryConnectorEnd obj) {
        	return null;
    }

    @objid ("9f2db1bc-8c98-493c-ba11-12c673fd2acf")
    @Override
    public Object visitAssociation(Association obj) {
        	return null;
    }

    @objid ("4a4ed15d-78d6-4da3-b207-2230fcccf449")
    @Override
    public Object visitLink(Link obj) {
        	return null;
    }

    @objid ("42dcf0d5-25df-4943-a23e-baa5e86c129f")
    @Override
    public Object visitConnector(Connector obj) {
        	return null;
    }

    @objid ("5a8d8bb9-8ee6-45e7-be3d-cdcc64032626")
    @Override
    public Object visitAcceptCallEventAction(AcceptCallEventAction obj) {
        	return null;
    }

    @objid ("e15afe52-fde5-4d54-8687-ef362a1c707f")
    @Override
    public Object visitAcceptChangeEventAction(AcceptChangeEventAction obj) {
        	return null;
    }

    @objid ("491171dc-3366-4c7b-b64c-9a5ab86ee7fd")
    @Override
    public Object visitAcceptSignalAction(AcceptSignalAction obj) {
        	return null;
    }

    @objid ("126817fb-4b59-4774-bddd-64b8a7ed895d")
    @Override
    public Object visitAcceptTimeEventAction(AcceptTimeEventAction obj) {
        	return null;
    }

    @objid ("b0be295d-259e-46b6-b976-7e7f05ee7644")
    @Override
    public Object visitActivity(Activity obj) {
        	return null;
    }

    @objid ("734eacbc-e9b2-485c-8091-129a0b28ac95")
    @Override
    public Object visitActivityAction(ActivityAction obj) {
        	return null;
    }

    @objid ("227ffdd0-c974-4407-8f62-8f9f0f9c496b")
    @Override
    public Object visitActivityEdge(ActivityEdge obj) {
        	return null;
    }

    @objid ("90bf6ccc-dd23-4df4-9275-7d662223b90b")
    @Override
    public Object visitActivityFinalNode(ActivityFinalNode obj) {
        	return null;
    }

    @objid ("d0884983-348d-4314-9274-6e04b415dd51")
    @Override
    public Object visitActivityGroup(ActivityGroup obj) {
        	return null;
    }

    @objid ("c36ff845-34c3-42a8-94db-49025feb16d4")
    @Override
    public Object visitActivityNode(ActivityNode obj) {
        	return null;
    }

    @objid ("f30e0385-55a3-42d2-b15a-5fa19909b82e")
    @Override
    public Object visitActivityParameterNode(ActivityParameterNode obj) {
        	return null;
    }

    @objid ("d1d10157-4d1c-4cc3-8b81-e3cb53726c72")
    @Override
    public Object visitActivityPartition(ActivityPartition obj) {
        	return null;
    }

    @objid ("63034482-00d8-4216-a4d5-dc388e9a6c8d")
    @Override
    public Object visitCallAction(CallAction obj) {
        	return null;
    }

    @objid ("e0b5e03c-15de-414b-b488-7edc58815a22")
    @Override
    public Object visitCallBehaviorAction(CallBehaviorAction obj) {
        	return null;
    }

    @objid ("39ace451-a15e-4680-8c94-1d4bac7ecccd")
    @Override
    public Object visitCallOperationAction(CallOperationAction obj) {
        	return null;
    }

    @objid ("175b58e9-ff02-47ca-9d6a-c4f6e1f98e4e")
    @Override
    public Object visitCentralBufferNode(CentralBufferNode obj) {
        	return null;
    }

    @objid ("7b4324b7-5ec8-42db-b166-6e1bbea74601")
    @Override
    public Object visitClause(Clause obj) {
        	return null;
    }

    @objid ("7040ddc9-92e2-4667-8fb1-a62383b4cc6e")
    @Override
    public Object visitConditionalNode(ConditionalNode obj) {
        	return null;
    }

    @objid ("d4e9a3db-06d4-4152-8727-7ee9f1a3cdb5")
    @Override
    public Object visitControlFlow(ControlFlow obj) {
        	return null;
    }

    @objid ("85e3341a-9b20-4e5d-9410-935ceb0785cf")
    @Override
    public Object visitControlNode(ControlNode obj) {
        	return null;
    }

    @objid ("a57c3b95-fd61-43f9-aceb-f5b57998336a")
    @Override
    public Object visitDataStoreNode(DataStoreNode obj) {
        	return null;
    }

    @objid ("b4890525-37be-4a21-8a05-41aee22ef0be")
    @Override
    public Object visitDecisionMergeNode(DecisionMergeNode obj) {
        	return null;
    }

    @objid ("a19d958b-b2dd-4ecf-b600-02c732e52341")
    @Override
    public Object visitExceptionHandler(ExceptionHandler obj) {
        	return null;
    }

    @objid ("8d400e61-2971-4a7d-a00a-afc8d460cf69")
    @Override
    public Object visitExpansionNode(ExpansionNode obj) {
        	return null;
    }

    @objid ("9e87e4d8-8196-47bd-98e3-913682678176")
    @Override
    public Object visitExpansionRegion(ExpansionRegion obj) {
        	return null;
    }

    @objid ("f6ccb8a4-655b-4f31-b616-777a076cc287")
    @Override
    public Object visitFinalNode(FinalNode obj) {
        	return null;
    }

    @objid ("c2566594-0520-40aa-955c-05b7ba05f61f")
    @Override
    public Object visitFlowFinalNode(FlowFinalNode obj) {
        	return null;
    }

    @objid ("216bdb47-de26-4531-9aa9-79d5d7523ee8")
    @Override
    public Object visitForkJoinNode(ForkJoinNode obj) {
        	return null;
    }

    @objid ("28087aa1-a635-4714-9e76-9feac6b3a430")
    @Override
    public Object visitInitialNode(InitialNode obj) {
        	return null;
    }

    @objid ("8b9b3339-9780-40b4-aef8-9fa22cfb2ab8")
    @Override
    public Object visitInputPin(InputPin obj) {
        	return null;
    }

    @objid ("a418bb91-ffa8-46ff-8fc5-03edff35a834")
    @Override
    public Object visitInstanceNode(InstanceNode obj) {
        	return null;
    }

    @objid ("5df5fe3d-6e95-416a-b2a9-4315d1312f11")
    @Override
    public Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj) {
        	return null;
    }

    @objid ("70edf7f0-ee23-49a7-88ff-34893c53df36")
    @Override
    public Object visitLoopNode(LoopNode obj) {
        	return null;
    }

    @objid ("7d39e60b-13f4-4109-ad5e-a2c10c280cb7")
    @Override
    public Object visitMessageFlow(MessageFlow obj) {
        	return null;
    }

    @objid ("475fde3b-0331-4c75-be5c-fb851ed1d7cb")
    @Override
    public Object visitObjectFlow(ObjectFlow obj) {
        	return null;
    }

    @objid ("51ea2083-0d1d-4250-a030-132f6a6252fe")
    @Override
    public Object visitObjectNode(ObjectNode obj) {
        	return null;
    }

    @objid ("b1f691c2-0359-44a2-b873-855943d61e5f")
    @Override
    public Object visitOpaqueAction(OpaqueAction obj) {
        	return null;
    }

    @objid ("7d0afa3f-8c98-4892-8599-dae86cc49e30")
    @Override
    public Object visitOutputPin(OutputPin obj) {
        	return null;
    }

    @objid ("5bbc57b2-c513-4db7-a018-9ad8d5db04c2")
    @Override
    public Object visitPin(Pin obj) {
        	return null;
    }

    @objid ("7d589b0c-e7b7-49b0-9074-aa5fa6dd77a3")
    @Override
    public Object visitSendSignalAction(SendSignalAction obj) {
        	return null;
    }

    @objid ("5782a5ee-3219-4ca0-aa7f-81ee4859f8ed")
    @Override
    public Object visitStructuredActivityNode(StructuredActivityNode obj) {
        	return null;
    }

    @objid ("8e64665d-d5a8-4a68-b76a-767823a670e2")
    @Override
    public Object visitValuePin(ValuePin obj) {
        	return null;
    }

    @objid ("d99d47a5-8807-4817-aebe-279745bd148d")
    @Override
    public Object visitBehavior(Behavior obj) {
        	return null;
    }

    @objid ("4d3db035-1163-445d-a7bd-1bba4232784d")
    @Override
    public Object visitBehaviorParameter(BehaviorParameter obj) {
        	return null;
    }

    @objid ("2e7c6c04-ac02-4419-b34d-286a038085b7")
    @Override
    public Object visitOpaqueBehavior(OpaqueBehavior obj) {
        	return null;
    }

    @objid ("3fe4dc57-028b-4e7d-8dfa-f1a94a534fd8")
    @Override
    public Object visitSignal(Signal obj) {
        	return null;
    }

    @objid ("aed21800-d5da-4945-9bc3-6677d50b934d")
    @Override
    public Object visitEvent(Event obj) {
        	return null;
    }

    @objid ("6295565f-380c-4236-9630-6dd0c40bfc33")
    @Override
    public Object visitCombinedFragment(CombinedFragment obj) {
        	return null;
    }

    @objid ("7499bd0e-7822-4a45-aded-2d2e868fb8eb")
    @Override
    public Object visitDurationConstraint(DurationConstraint obj) {
        	return null;
    }

    @objid ("b16bdc50-ae9f-4f3e-a0c6-4efd1523072a")
    @Override
    public Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj) {
        	return null;
    }

    @objid ("84b11617-4196-4f46-bb69-33687fd9e99a")
    @Override
    public Object visitExecutionSpecification(ExecutionSpecification obj) {
        	return null;
    }

    @objid ("41fa30a0-803b-45dc-b8e3-d31d376d30b7")
    @Override
    public Object visitGate(Gate obj) {
        	return null;
    }

    @objid ("24971ef5-f960-43b5-8011-d0eb65deaec6")
    @Override
    public Object visitGeneralOrdering(GeneralOrdering obj) {
        	return null;
    }

    @objid ("f472a119-6676-4545-80f0-3901d6206fef")
    @Override
    public Object visitInteraction(Interaction obj) {
        	return null;
    }

    @objid ("3e45ec66-c2a8-43c0-8893-9c8eb29adc06")
    @Override
    public Object visitInteractionFragment(InteractionFragment obj) {
        	return null;
    }

    @objid ("7b38d378-f5de-483c-978f-9e6ba528356a")
    @Override
    public Object visitInteractionOperand(InteractionOperand obj) {
        	return null;
    }

    @objid ("a792253e-c4ca-4ebb-802b-0593bb5a63b8")
    @Override
    public Object visitInteractionUse(InteractionUse obj) {
        	return null;
    }

    @objid ("3a1f62e1-a155-4a75-97b2-780d6518698a")
    @Override
    public Object visitLifeline(Lifeline obj) {
        	return null;
    }

    @objid ("1a8ec878-5b36-460f-93bf-9a809f016522")
    @Override
    public Object visitMessage(Message obj) {
        	return null;
    }

    @objid ("448c2baf-3041-44cc-99fd-12daca404042")
    @Override
    public Object visitMessageEnd(MessageEnd obj) {
        	return null;
    }

    @objid ("71e11a84-6ad1-4b48-a7b2-6fbd5674cd68")
    @Override
    public Object visitOccurrenceSpecification(OccurrenceSpecification obj) {
        	return null;
    }

    @objid ("09c1157f-4718-4048-9d26-435eac2878f8")
    @Override
    public Object visitPartDecomposition(PartDecomposition obj) {
        	return null;
    }

    @objid ("f86aab0f-aa9d-475a-b878-940585931819")
    @Override
    public Object visitStateInvariant(StateInvariant obj) {
        	return null;
    }

    @objid ("b12c5269-cfea-472c-aaab-c9fa4483d599")
    @Override
    public Object visitTerminateSpecification(TerminateSpecification obj) {
        	return null;
    }

    @objid ("edb09737-c29f-4a9a-bf17-f93923575e16")
    @Override
    public Object visitAbstractPseudoState(AbstractPseudoState obj) {
        	return null;
    }

    @objid ("d8651c79-daad-4e92-98d8-51bc1f3e11ea")
    @Override
    public Object visitChoicePseudoState(ChoicePseudoState obj) {
        	return null;
    }

    @objid ("ea0bfa01-ab0b-41ee-a0cc-49c4513d61d9")
    @Override
    public Object visitConnectionPointReference(ConnectionPointReference obj) {
        	return null;
    }

    @objid ("e36f6e87-cc45-4ec9-90fa-e2c7f3d114c8")
    @Override
    public Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj) {
        	return null;
    }

    @objid ("b053f9de-5418-47fa-8edc-2ffda7a1c5a0")
    @Override
    public Object visitEntryPointPseudoState(EntryPointPseudoState obj) {
        	return null;
    }

    @objid ("3542bd00-ef7b-4f5b-88b0-83676b2f8398")
    @Override
    public Object visitExitPointPseudoState(ExitPointPseudoState obj) {
        	return null;
    }

    @objid ("88b5365d-96f0-45a5-b383-796a7c101f48")
    @Override
    public Object visitForkPseudoState(ForkPseudoState obj) {
        	return null;
    }

    @objid ("e5e5fc45-74e4-40b6-9630-5c36e3c6daf5")
    @Override
    public Object visitInitialPseudoState(InitialPseudoState obj) {
        	return null;
    }

    @objid ("7092c593-bec1-4e1d-a18b-885a29a89221")
    @Override
    public Object visitInternalTransition(InternalTransition obj) {
        	return null;
    }

    @objid ("85d4f872-a6f1-4579-94b3-d2e18249cdee")
    @Override
    public Object visitJoinPseudoState(JoinPseudoState obj) {
        	return null;
    }

    @objid ("23e73472-abd7-4b95-96eb-e3440e571d17")
    @Override
    public Object visitJunctionPseudoState(JunctionPseudoState obj) {
        	return null;
    }

    @objid ("a511c144-93ca-4167-8385-4403898ec05c")
    @Override
    public Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj) {
        	return null;
    }

    @objid ("9a6a3093-f340-4798-a557-631db1d2297f")
    @Override
    public Object visitState(State obj) {
        	return null;
    }

    @objid ("9b9fce5d-b5f9-4696-b114-4cc9387d1efa")
    @Override
    public Object visitStateMachine(StateMachine obj) {
        	return null;
    }

    @objid ("611c6593-a1db-4b62-bd91-cbe675048e85")
    @Override
    public Object visitStateVertex(StateVertex obj) {
        	return null;
    }

    @objid ("020f47a4-58df-431d-adae-bc06f10cb501")
    @Override
    public Object visitTerminatePseudoState(TerminatePseudoState obj) {
        	return null;
    }

    @objid ("46a4cc42-67eb-4197-bdb3-1f92f78d3da0")
    @Override
    public Object visitTransition(Transition obj) {
        	return null;
    }

    @objid ("d5571e46-f749-44f7-89d4-14f9ac466621")
    @Override
    public Object visitFinalState(FinalState obj) {
        	return null;
    }

    @objid ("af058bf1-e209-4ad8-813d-113bca2801c8")
    @Override
    public Object visitRegion(Region obj) {
        	return null;
    }

    @objid ("fec4c06c-f581-4784-b58e-a49035b29c70")
    @Override
    public Object visitActor(Actor obj) {
        	return null;
    }

    @objid ("83ebd1f3-9e86-42a3-8504-ac34bb792904")
    @Override
    public Object visitUseCase(UseCase obj) {
        	return null;
    }

    @objid ("da1ec96a-dbfd-4ff1-b947-cd2d4e0c4a23")
    @Override
    public Object visitUseCaseDependency(UseCaseDependency obj) {
        	return null;
    }

    @objid ("63993a0c-70be-4381-9052-7b6b237ddb77")
    @Override
    public Object visitExtensionPoint(ExtensionPoint obj) {
        	return null;
    }

    @objid ("f463b1de-1510-462a-8fb4-5496810b1993")
    @Override
    public Object visitAnalystItem(AnalystItem obj) {
        	return null;
    }

    @objid ("2710f433-28d7-4817-9c55-865ac3f175d0")
    @Override
    public Object visitAnalystElement(AnalystElement obj) {
        	return null;
    }

    @objid ("f3157fcf-dd2b-4bae-bae0-04fc0e2114c7")
    @Override
    public Object visitAnalystContainer(AnalystContainer obj) {
        	return null;
    }

    @objid ("40d9a169-c496-4e40-a6a7-a48b828206f1")
    @Override
    public Object visitAnalystProject(AnalystProject obj) {
        	return null;
    }

    @objid ("e740f553-9ead-40a4-842f-91cb547f4ce6")
    @Override
    public Object visitAnalystPropertyTable(AnalystPropertyTable obj) {
        	return null;
    }

    @objid ("0ed7eafa-8dc2-430e-9616-9570d1afc85d")
    @Override
    public Object visitBusinessRule(BusinessRule obj) {
        	return null;
    }

    @objid ("9bc4c38d-1407-4cf9-aec3-0df70b612948")
    @Override
    public Object visitBusinessRuleContainer(BusinessRuleContainer obj) {
        	return null;
    }

    @objid ("82d7fb08-d98d-4784-8c26-dfec8125dc92")
    @Override
    public Object visitDictionary(Dictionary obj) {
        	return null;
    }

    @objid ("655cce5b-dbbb-4d69-81d6-9211418f1de2")
    @Override
    public Object visitGoal(Goal obj) {
        	return null;
    }

    @objid ("a5d273c5-b7bb-4839-b653-f3395fa9c1e1")
    @Override
    public Object visitGoalContainer(GoalContainer obj) {
        	return null;
    }

    @objid ("69320aab-0c5c-435f-aa80-8edd604f30ef")
    @Override
    public Object visitPropertyContainer(PropertyContainer obj) {
        	return null;
    }

    @objid ("28226308-626d-4032-a972-48f15758ff04")
    @Override
    public Object visitRequirement(Requirement obj) {
        	return null;
    }

    @objid ("6ea786b0-fd61-4aa3-8fce-1fecb83f3da2")
    @Override
    public Object visitRequirementContainer(RequirementContainer obj) {
        	return null;
    }

    @objid ("0c60a1d3-6703-48cc-8064-226597934daf")
    @Override
    public Object visitTerm(Term obj) {
        	return null;
    }

    @objid ("fc6a134f-9ca4-40cb-814f-28c7b36fbf76")
    @Override
    public Object visitGenericAnalystContainer(GenericAnalystContainer obj) {
        	return null;
    }

    @objid ("ce659eb9-4f82-420e-97f1-07a9fe730504")
    @Override
    public Object visitGenericAnalystElement(GenericAnalystElement obj) {
        	return null;
    }

    @objid ("d932195e-cb5b-4628-ba5c-a7adf25c90b9")
    @Override
    public Object visitInformationFlow(InformationFlow obj) {
        	return null;
    }

    @objid ("9a2c7d8f-2d37-4629-ac2c-209fef5597b9")
    @Override
    public Object visitInformationItem(InformationItem obj) {
        	return null;
    }

    @objid ("d36b5de1-97a4-4478-9e9a-e234ffe03f19")
    @Override
    public Object visitDataFlow(DataFlow obj) {
        	return null;
    }

    @objid ("e89c7596-0d30-43da-a92e-b1297f3afc72")
    @Override
    public Object visitCommunicationInteraction(CommunicationInteraction obj) {
        	return null;
    }

    @objid ("463ece4c-e3ff-4d40-a3a5-ad9f598377b5")
    @Override
    public Object visitCommunicationNode(CommunicationNode obj) {
        	return null;
    }

    @objid ("f9ee0034-2b56-4575-9b4d-c45b4dd45d47")
    @Override
    public Object visitCommunicationMessage(CommunicationMessage obj) {
        	return null;
    }

    @objid ("a1138abe-7a4f-47cb-b2e1-ce2050f36954")
    @Override
    public Object visitCommunicationChannel(CommunicationChannel obj) {
        	return null;
    }

    @objid ("67bd0a7a-52ce-4b57-a3ac-21cc7da8457b")
    @Override
    public Object visitBpmnCollaboration(BpmnCollaboration obj) {
        	return null;
    }

    @objid ("f752df61-9b0c-44a4-9f8f-ca5b5171597e")
    @Override
    public Object visitBpmnLane(BpmnLane obj) {
        	return null;
    }

    @objid ("38db1db3-b4fe-4c73-b917-5f82bee282df")
    @Override
    public Object visitBpmnLaneSet(BpmnLaneSet obj) {
        	return null;
    }

    @objid ("bad357e1-4c2c-46ae-b547-e99590bc2880")
    @Override
    public Object visitBpmnParticipant(BpmnParticipant obj) {
        	return null;
    }

    @objid ("356617c8-9258-4775-99a2-85f1c408ed5c")
    @Override
    public Object visitBpmnProcess(BpmnProcess obj) {
        	return null;
    }

    @objid ("ab2170c9-7ac0-4a3e-9887-75fbf578c715")
    @Override
    public Object visitBpmnAssociation(BpmnAssociation obj) {
        	return null;
    }

    @objid ("0d7a2aa6-5533-4100-b7a0-791c05cb51fb")
    @Override
    public Object visitBpmnBaseElement(BpmnBaseElement obj) {
        	return null;
    }

    @objid ("a312eb81-466e-4920-9475-81e66950605e")
    @Override
    public Object visitBpmnArtifact(BpmnArtifact obj) {
        	return null;
    }

    @objid ("3acd56e4-87cf-46d7-a9e1-08fd2661986a")
    @Override
    public Object visitBpmnFlowElement(BpmnFlowElement obj) {
        	return null;
    }

    @objid ("27778a24-dd05-4bf8-811c-408dbfca3543")
    @Override
    public Object visitBpmnFlowNode(BpmnFlowNode obj) {
        	return null;
    }

    @objid ("247eed86-5153-4c42-99f8-8a96e9a2970a")
    @Override
    public Object visitBpmnGroup(BpmnGroup obj) {
        	return null;
    }

    @objid ("bc290398-e21e-4de3-ac24-c08f21d7bcad")
    @Override
    public Object visitBpmnRootElement(BpmnRootElement obj) {
        	return null;
    }

    @objid ("f007fc2c-59bd-4619-a51f-6624d4d9e9b9")
    @Override
    public Object visitBpmnBehavior(BpmnBehavior obj) {
        	return null;
    }

    @objid ("906f15c0-e72c-4752-8d07-c90ac21e17db")
    @Override
    public Object visitBpmnMessage(BpmnMessage obj) {
        	return null;
    }

    @objid ("8eab9631-4ac4-4247-8f4d-2eed3d87dfb0")
    @Override
    public Object visitBpmnMessageFlow(BpmnMessageFlow obj) {
        	return null;
    }

    @objid ("f99e8315-3b2d-4a72-9b51-884a3eb0d8f4")
    @Override
    public Object visitBpmnSequenceFlow(BpmnSequenceFlow obj) {
        	return null;
    }

    @objid ("7a17cdb5-7d4c-4ef9-81d9-0fa458503846")
    @Override
    public Object visitBpmnActivity(BpmnActivity obj) {
        	return null;
    }

    @objid ("e5bd844b-e9c8-4398-ae1b-1a5821b6d420")
    @Override
    public Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj) {
        	return null;
    }

    @objid ("24acc4c5-fba2-4432-956d-6ac568acf19c")
    @Override
    public Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj) {
        	return null;
    }

    @objid ("0abd6f08-8070-4284-bd13-5b51bdd2cf67")
    @Override
    public Object visitBpmnCallActivity(BpmnCallActivity obj) {
        	return null;
    }

    @objid ("0d4bc351-bb1e-430c-8c81-0174e0b686b3")
    @Override
    public Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj) {
        	return null;
    }

    @objid ("4caacf86-471c-4cd5-9b7f-6ee3c7d62174")
    @Override
    public Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj) {
        	return null;
    }

    @objid ("d5ad0930-3618-43d9-800e-5a02ed1042e6")
    @Override
    public Object visitBpmnManualTask(BpmnManualTask obj) {
        	return null;
    }

    @objid ("8ff121b9-b0e7-4970-ba18-b42541e2f5ce")
    @Override
    public Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj) {
        	return null;
    }

    @objid ("3f435492-efdd-4e22-9832-77a86783b737")
    @Override
    public Object visitBpmnReceiveTask(BpmnReceiveTask obj) {
        	return null;
    }

    @objid ("41fa76a9-3ff4-4b8a-b510-d69194f0f06f")
    @Override
    public Object visitBpmnScriptTask(BpmnScriptTask obj) {
        	return null;
    }

    @objid ("35463263-3e69-4423-84db-5b0de07cd99f")
    @Override
    public Object visitBpmnSendTask(BpmnSendTask obj) {
        	return null;
    }

    @objid ("a83a1549-69c2-45df-a1d8-304afdabb43b")
    @Override
    public Object visitBpmnServiceTask(BpmnServiceTask obj) {
        	return null;
    }

    @objid ("61c0f0cc-7b6b-4e0f-b083-8c616aa0b70f")
    @Override
    public Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj) {
        	return null;
    }

    @objid ("86b591ad-5bc5-436d-9fd1-b329c48919df")
    @Override
    public Object visitBpmnSubProcess(BpmnSubProcess obj) {
        	return null;
    }

    @objid ("73e0fb63-7304-4cb6-aa89-93477a26ac85")
    @Override
    public Object visitBpmnTask(BpmnTask obj) {
        	return null;
    }

    @objid ("82d17bcb-8245-44a3-b7ba-38d9b213a931")
    @Override
    public Object visitBpmnTransaction(BpmnTransaction obj) {
        	return null;
    }

    @objid ("1dd19b72-76aa-4457-b342-7bab63e287f5")
    @Override
    public Object visitBpmnUserTask(BpmnUserTask obj) {
        	return null;
    }

    @objid ("468a11aa-3f9b-45dd-92d6-2c469ce3ea0d")
    @Override
    public Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj) {
        	return null;
    }

    @objid ("bc1dbb3d-d20d-4abf-acf7-1ff4be243621")
    @Override
    public Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj) {
        	return null;
    }

    @objid ("62e0bfd1-6a08-4000-829c-bcc1d5122110")
    @Override
    public Object visitBpmnCatchEvent(BpmnCatchEvent obj) {
        	return null;
    }

    @objid ("ef1b47f9-7f53-47f3-9d52-45972315e74a")
    @Override
    public Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj) {
        	return null;
    }

    @objid ("3d42ba82-fc58-4280-8674-30892bcf6fe7")
    @Override
    public Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj) {
        	return null;
    }

    @objid ("f4a58069-9cd6-499b-aa67-3a4adae1292d")
    @Override
    public Object visitBpmnEndEvent(BpmnEndEvent obj) {
        	return null;
    }

    @objid ("b12981e1-7f14-4faa-9f4a-d8eb03df74fb")
    @Override
    public Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj) {
        	return null;
    }

    @objid ("cc627298-3f7f-405f-b1eb-8f9c287ae711")
    @Override
    public Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj) {
        	return null;
    }

    @objid ("92c2b446-f0b8-4ac3-aa50-21a3316b14c7")
    @Override
    public Object visitBpmnEvent(BpmnEvent obj) {
        	return null;
    }

    @objid ("fa47b9a9-2d26-4ae4-b010-fec471eb5e65")
    @Override
    public Object visitBpmnEventDefinition(BpmnEventDefinition obj) {
        	return null;
    }

    @objid ("d6468f8c-3f95-4a54-abf6-6680d3bd7134")
    @Override
    public Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj) {
        	return null;
    }

    @objid ("ab74d8c3-3990-4875-a3ad-d12d2c3f3846")
    @Override
    public Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj) {
        	return null;
    }

    @objid ("a8fb72cf-1a88-4a65-9b37-a9094c35962e")
    @Override
    public Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj) {
        	return null;
    }

    @objid ("0a51a690-4f0a-4109-b6f4-2cdb4ac1e89a")
    @Override
    public Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj) {
        	return null;
    }

    @objid ("fe75f5d8-9677-4828-a72b-c062cbbea43f")
    @Override
    public Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj) {
        	return null;
    }

    @objid ("0aed728f-e9b3-471e-a4ea-99d0919c6a3a")
    @Override
    public Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj) {
        	return null;
    }

    @objid ("33a12c98-5df0-4b7d-9539-204f91ca7db2")
    @Override
    public Object visitBpmnStartEvent(BpmnStartEvent obj) {
        	return null;
    }

    @objid ("e7c73915-7a42-407c-bcf3-212c756aeb14")
    @Override
    public Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj) {
        	return null;
    }

    @objid ("fad1bb24-29bc-41ad-b40e-b85eac69c8a5")
    @Override
    public Object visitBpmnThrowEvent(BpmnThrowEvent obj) {
        	return null;
    }

    @objid ("c64f08e9-6fc6-4bbf-be26-d371e59cbd1e")
    @Override
    public Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj) {
        	return null;
    }

    @objid ("4a968151-07cd-436c-8c37-d6e4946cb976")
    @Override
    public Object visitBpmnComplexGateway(BpmnComplexGateway obj) {
        	return null;
    }

    @objid ("63d44018-d282-4674-902c-53122ebdc5cc")
    @Override
    public Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj) {
        	return null;
    }

    @objid ("695ed9f7-3364-492e-9cef-df276ac51136")
    @Override
    public Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj) {
        	return null;
    }

    @objid ("a4690f9d-d2d2-4a14-9d59-8359ace2cabf")
    @Override
    public Object visitBpmnGateway(BpmnGateway obj) {
        	return null;
    }

    @objid ("5b4af4b1-8cab-4a0b-9bfa-63ad3bb61c62")
    @Override
    public Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj) {
        	return null;
    }

    @objid ("ee9c66e3-742f-4329-8e6d-7f1d70d55a61")
    @Override
    public Object visitBpmnParallelGateway(BpmnParallelGateway obj) {
        	return null;
    }

    @objid ("bc075cbb-b35b-4a18-b26e-176cfa7737a5")
    @Override
    public Object visitBpmnDataObject(BpmnDataObject obj) {
        	return null;
    }

    @objid ("5552e93e-6206-4b2a-8bb0-2c15bf92c75d")
    @Override
    public Object visitBpmnDataStore(BpmnDataStore obj) {
        	return null;
    }

    @objid ("74ca7c8f-7d79-4c1e-ae1a-cafd5a038e85")
    @Override
    public Object visitBpmnDataAssociation(BpmnDataAssociation obj) {
        	return null;
    }

    @objid ("57ebf346-be2c-4ce9-8795-b970587240a5")
    @Override
    public Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj) {
        	return null;
    }

    @objid ("fc4a7c39-0db0-42a6-9842-82adb1cf6155")
    @Override
    public Object visitBpmnDataOutput(BpmnDataOutput obj) {
        	return null;
    }

    @objid ("81b3492c-1e5a-42a6-9581-4d77d359f5cc")
    @Override
    public Object visitBpmnDataInput(BpmnDataInput obj) {
        	return null;
    }

    @objid ("7d064252-809d-411f-984b-0c6093326dbb")
    @Override
    public Object visitBpmnItemAwareElement(BpmnItemAwareElement obj) {
        	return null;
    }

    @objid ("a25ccace-c2e7-4463-9382-99c5b95ce21e")
    @Override
    public Object visitBpmnItemDefinition(BpmnItemDefinition obj) {
        	return null;
    }

    @objid ("5887d0c2-7a1a-46ee-983d-73e57f6c6eba")
    @Override
    public Object visitBpmnDataState(BpmnDataState obj) {
        	return null;
    }

    @objid ("d6e10df3-83cb-4a9a-86a4-67784f8b8510")
    @Override
    public Object visitBpmnResource(BpmnResource obj) {
        	return null;
    }

    @objid ("7d121557-e1a3-4822-9f34-98593506e080")
    @Override
    public Object visitBpmnResourceParameter(BpmnResourceParameter obj) {
        	return null;
    }

    @objid ("0ccb0742-4838-4431-bc9c-1595c55ea458")
    @Override
    public Object visitBpmnResourceRole(BpmnResourceRole obj) {
        	return null;
    }

    @objid ("4c09309f-4521-425c-bbc0-93ef74de136a")
    @Override
    public Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj) {
        	return null;
    }

    @objid ("48d5e4a2-3217-42c8-853d-ee3c98a7c8a7")
    @Override
    public Object visitBpmnOperation(BpmnOperation obj) {
        	return null;
    }

    @objid ("6ce213e8-e43e-490f-afb5-43ab3bde6090")
    @Override
    public Object visitBpmnInterface(BpmnInterface obj) {
        	return null;
    }

    @objid ("6fd9cdfc-9b42-4fc0-a906-077a5ead24a9")
    @Override
    public Object visitBpmnEndPoint(BpmnEndPoint obj) {
        	return null;
    }

    @objid ("f906dfbe-b0c2-49bd-ab01-e4bbace942c0")
    @Override
    public Object visitAbstractDiagram(AbstractDiagram obj) {
        	return null;
    }

    @objid ("70ae1da7-ed62-4e07-a54c-5d42c2a65826")
    @Override
    public Object visitActivityDiagram(ActivityDiagram obj) {
        	return null;
    }

    @objid ("70fb8c51-259c-4175-9260-16243b96dd70")
    @Override
    public Object visitBehaviorDiagram(BehaviorDiagram obj) {
        	return null;
    }

    @objid ("fd589d21-57fd-4723-b98d-0453dd4d2bf5")
    @Override
    public Object visitClassDiagram(ClassDiagram obj) {
        	return null;
    }

    @objid ("2677b51f-1f57-4bb2-9196-918778583b62")
    @Override
    public Object visitCommunicationDiagram(CommunicationDiagram obj) {
        	return null;
    }

    @objid ("ba47395f-332f-408a-bab9-8d47cff02d7d")
    @Override
    public Object visitDeploymentDiagram(DeploymentDiagram obj) {
        	return null;
    }

    @objid ("f0c0ae71-c97d-42cd-a52f-f28e632f7050")
    @Override
    public Object visitDiagramSet(DiagramSet obj) {
        	return null;
    }

    @objid ("98a27fd0-8d5e-43b7-8bd5-c0b89ed579df")
    @Override
    public Object visitSequenceDiagram(SequenceDiagram obj) {
        	return null;
    }

    @objid ("41c71fbc-9c66-4c92-8fbc-2ade026c916f")
    @Override
    public Object visitStateMachineDiagram(StateMachineDiagram obj) {
        	return null;
    }

    @objid ("67c5e6fc-2065-4ef1-8416-d6ed1db1f9c9")
    @Override
    public Object visitStaticDiagram(StaticDiagram obj) {
        	return null;
    }

    @objid ("f43182c9-e38c-408a-88eb-41df294c6437")
    @Override
    public Object visitUseCaseDiagram(UseCaseDiagram obj) {
        	return null;
    }

    @objid ("24091230-4a50-4ea0-9827-7c18646d2017")
    @Override
    public Object visitObjectDiagram(ObjectDiagram obj) {
        	return null;
    }

    @objid ("9d22ae20-77a2-4923-8ff4-878fae761ae8")
    @Override
    public Object visitCompositeStructureDiagram(CompositeStructureDiagram obj) {
        	return null;
    }

    @objid ("a0f6b286-2e55-4d40-92a6-15d95d5c9da5")
    @Override
    public Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj) {
        	return null;
    }

    @objid ("b8b8e2af-6382-43ab-b10b-99a398b2d8bc")
    @Override
    public Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj) {
        	return null;
    }

    @objid ("5ec30702-7fe5-4217-9d15-2b833fb6805d")
    @Override
    public Object visitModuleParameter(ModuleParameter obj) {
        	return null;
    }

    @objid ("7516d065-5b45-4f1b-8729-a4f6b68c4272")
    @Override
    public Object visitModuleComponent(ModuleComponent obj) {
        	return null;
    }

    @objid ("e37bc8b4-5eac-456d-ac15-09472d42a101")
    @Override
    public Object visitProject(Project obj) {
        	return null;
    }

}
