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

@objid ("00106c06-4f2c-1032-829a-001ec947cd2a")
public class AbstractModelVisitor implements IModelVisitor {
    @objid ("2c9de21b-c7e4-4606-bd84-dc52c1bcaf38")
    @Override
    public Object visitAbstraction(Abstraction obj) {
        	return null;
    }

    @objid ("3d6562f3-0acb-4f96-b29e-53b6121a4983")
    @Override
    public Object visitConstraint(Constraint obj) {
        	return null;
    }

    @objid ("a267dca1-2a60-4cfd-aca1-b14909e3512a")
    @Override
    public Object visitDependency(Dependency obj) {
        	return null;
    }

    @objid ("e3abb38c-32c8-416b-861f-578e259fd1fc")
    @Override
    public Object visitElement(Element obj) {
        	return null;
    }

    @objid ("566457be-1b03-4cfd-8a31-000aad63fdbf")
    @Override
    public Object visitModelElement(ModelElement obj) {
        	return null;
    }

    @objid ("2e1834d1-43b6-47e4-96bd-4f5a62716f34")
    @Override
    public Object visitModelTree(ModelTree obj) {
        	return null;
    }

    @objid ("db148498-5bf3-4500-ac7a-8f9c17c60728")
    @Override
    public Object visitNote(Note obj) {
        	return null;
    }

    @objid ("90f2c833-a921-4266-88ef-0f520a8226f4")
    @Override
    public Object visitNoteType(NoteType obj) {
        	return null;
    }

    @objid ("efec64a6-758e-497c-bf85-7120401f7c23")
    @Override
    public Object visitProfile(Profile obj) {
        	return null;
    }

    @objid ("df5fbf49-d662-465b-afce-d6a76a835818")
    @Override
    public Object visitStereotype(Stereotype obj) {
        	return null;
    }

    @objid ("926f436e-245b-4244-b027-aea2b1dc3050")
    @Override
    public Object visitSubstitution(Substitution obj) {
        	return null;
    }

    @objid ("a5230e2c-172d-44ea-b454-e4d4af387ebc")
    @Override
    public Object visitTagParameter(TagParameter obj) {
        	return null;
    }

    @objid ("8d665c5a-86cd-464f-8114-2ae17e24593a")
    @Override
    public Object visitTagType(TagType obj) {
        	return null;
    }

    @objid ("8b3111a1-5ea2-445d-bc8b-228528552c08")
    @Override
    public Object visitTaggedValue(TaggedValue obj) {
        	return null;
    }

    @objid ("a8277e83-d878-4d46-9c99-c62c43225fe3")
    @Override
    public Object visitUsage(Usage obj) {
        	return null;
    }

    @objid ("8e6d2f40-3e20-461f-befe-10daa5cf6b30")
    @Override
    public Object visitMetaclassReference(MetaclassReference obj) {
        	return null;
    }

    @objid ("8b8ffefe-342d-494d-9ef8-255ebae329bf")
    @Override
    public Object visitExternDocument(ExternDocument obj) {
        	return null;
    }

    @objid ("e93b6c54-4f0f-49f8-9d3c-2026bcdb99e8")
    @Override
    public Object visitExternDocumentType(ExternDocumentType obj) {
        	return null;
    }

    @objid ("e4c07f78-f4af-4145-80e3-912200ab052e")
    @Override
    public Object visitEnumeratedPropertyType(EnumeratedPropertyType obj) {
        	return null;
    }

    @objid ("44236f7d-4b75-4806-ab7b-be974a612987")
    @Override
    public Object visitLocalPropertyTable(LocalPropertyTable obj) {
        	return null;
    }

    @objid ("9479c08d-f1b1-4f9b-a2f6-b92a44a30c0e")
    @Override
    public Object visitPropertyDefinition(PropertyDefinition obj) {
        	return null;
    }

    @objid ("359bbf73-7573-4afa-92af-c42afc6ae0e8")
    @Override
    public Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj) {
        	return null;
    }

    @objid ("012605c7-7c95-439c-9de6-7a35c9c108d3")
    @Override
    public Object visitPropertyTable(PropertyTable obj) {
        	return null;
    }

    @objid ("5d746a0c-91c5-4d68-8155-580314bd17f0")
    @Override
    public Object visitPropertyTableDefinition(PropertyTableDefinition obj) {
        	return null;
    }

    @objid ("4b01cc70-4a45-41f0-94b4-98e300a092d9")
    @Override
    public Object visitPropertyType(PropertyType obj) {
        	return null;
    }

    @objid ("ccce56ce-a34f-4953-9b34-e8a65f6434ad")
    @Override
    public Object visitTypedPropertyTable(TypedPropertyTable obj) {
        	return null;
    }

    @objid ("d555fca0-0a92-4f80-a256-5471d806ad4a")
    @Override
    public Object visitMatrixDefinition(MatrixDefinition obj) {
        	return null;
    }

    @objid ("09529580-fc89-4dcf-914a-9e2f5fd53e65")
    @Override
    public Object visitQueryDefinition(QueryDefinition obj) {
        	return null;
    }

    @objid ("74778bd3-127c-4704-a3a0-6a0141acbfb8")
    @Override
    public Object visitMatrixValueDefinition(MatrixValueDefinition obj) {
        	return null;
    }

    @objid ("41ac21ea-cebb-4904-94b8-cc5ffcbe1c88")
    @Override
    public Object visitExternProcessor(ExternProcessor obj) {
        	return null;
    }

    @objid ("20575941-3167-4455-9a78-bcf1ca3c9ca8")
    @Override
    public Object visitArtifact(Artifact obj) {
        	return null;
    }

    @objid ("9e3a5e7d-7344-47e9-a08a-432fb0adb227")
    @Override
    public Object visitAssociation(Association obj) {
        	return null;
    }

    @objid ("89b447e5-e7a8-4806-a320-f8adb75258cb")
    @Override
    public Object visitAssociationEnd(AssociationEnd obj) {
        	return null;
    }

    @objid ("6e063018-a63b-4f5c-ba66-4b65c17a5998")
    @Override
    public Object visitAttribute(Attribute obj) {
        	return null;
    }

    @objid ("63a5cce8-7ed3-4ec4-a544-182fe5be49f2")
    @Override
    public Object visitAttributeLink(AttributeLink obj) {
        	return null;
    }

    @objid ("d4a32e66-86cd-4416-ab8b-45b2dfe70592")
    @Override
    public Object visitBehavioralFeature(BehavioralFeature obj) {
        	return null;
    }

    @objid ("8ae79dea-3d23-4c99-be70-b79d093b5a05")
    @Override
    public Object visitBindableInstance(BindableInstance obj) {
        	return null;
    }

    @objid ("ab701743-1b22-4675-af43-38af038b3c89")
    @Override
    public Object visitBinding(Binding obj) {
        	return null;
    }

    @objid ("446b4e5c-771d-4161-aad5-d5c9c65d9319")
    @Override
    public Object visitClass(Class obj) {
        	return null;
    }

    @objid ("3d4387b1-82df-4506-82cf-e9c945344ac1")
    @Override
    public Object visitClassAssociation(ClassAssociation obj) {
        	return null;
    }

    @objid ("19866487-71b6-4ede-b555-4b2bce1e7eb2")
    @Override
    public Object visitClassifier(Classifier obj) {
        	return null;
    }

    @objid ("ad1d9753-c295-4a31-b007-e7275879878b")
    @Override
    public Object visitCollaboration(Collaboration obj) {
        	return null;
    }

    @objid ("383ec1fe-f7ef-45c8-a4b2-d4213e0ab638")
    @Override
    public Object visitCollaborationUse(CollaborationUse obj) {
        	return null;
    }

    @objid ("20e21743-a9ba-40ca-a74e-7c49af47ebc4")
    @Override
    public Object visitComponent(Component obj) {
        	return null;
    }

    @objid ("4f01e8fe-057e-4346-be29-30da612d9c7e")
    @Override
    public Object visitComponentRealization(ComponentRealization obj) {
        	return null;
    }

    @objid ("7f8db255-1fe7-4a74-8792-154e0ff63c08")
    @Override
    public Object visitConnector(Connector obj) {
        	return null;
    }

    @objid ("1e5cdfdf-5dd7-4cf0-a9de-4b46b21179f2")
    @Override
    public Object visitConnectorEnd(ConnectorEnd obj) {
        	return null;
    }

    @objid ("806695dd-7571-40ee-a736-2786570002c9")
    @Override
    public Object visitDataType(DataType obj) {
        	return null;
    }

    @objid ("c67526f2-49b0-47e1-9aae-34540c3038f4")
    @Override
    public Object visitElementImport(ElementImport obj) {
        	return null;
    }

    @objid ("770d9d07-bd6b-4d01-9b4f-e76aab13593b")
    @Override
    public Object visitElementRealization(ElementRealization obj) {
        	return null;
    }

    @objid ("f88ab17c-66d9-4858-8b79-57146f46dca3")
    @Override
    public Object visitEnumeration(Enumeration obj) {
        	return null;
    }

    @objid ("6bb0839b-0a48-437c-9379-ce830522b677")
    @Override
    public Object visitEnumerationLiteral(EnumerationLiteral obj) {
        	return null;
    }

    @objid ("c7c5c748-c1ed-446a-bf9e-6ea3c87c3ab3")
    @Override
    public Object visitFeature(Feature obj) {
        	return null;
    }

    @objid ("cf983390-c4ea-47e6-9f70-28071087562d")
    @Override
    public Object visitGeneralClass(GeneralClass obj) {
        	return null;
    }

    @objid ("471053de-85c5-4387-a534-68fb5d12b885")
    @Override
    public Object visitGeneralization(Generalization obj) {
        	return null;
    }

    @objid ("12b44e77-8470-4efb-a31d-be52f37035ba")
    @Override
    public Object visitInstance(Instance obj) {
        	return null;
    }

    @objid ("e37225c6-176d-462e-9939-fb93c1f2ef85")
    @Override
    public Object visitInterface(Interface obj) {
        	return null;
    }

    @objid ("e0bb00fd-cda0-47c6-85fc-6fdac977f710")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization obj) {
        	return null;
    }

    @objid ("24bb4a09-cfaf-4bc0-a84c-c6f04b41163f")
    @Override
    public Object visitLink(Link obj) {
        	return null;
    }

    @objid ("36f71bbd-7f02-4800-9d05-ab817c23c1b3")
    @Override
    public Object visitLinkEnd(LinkEnd obj) {
        	return null;
    }

    @objid ("45ac3262-905a-452b-8b81-ee9e221d5c2c")
    @Override
    public Object visitManifestation(Manifestation obj) {
        	return null;
    }

    @objid ("3a6822b0-3185-422e-89c4-dc0b33f937ae")
    @Override
    public Object visitNameSpace(NameSpace obj) {
        	return null;
    }

    @objid ("b182c0de-b217-42bd-94fe-84251cae4b34")
    @Override
    public Object visitNamespaceUse(NamespaceUse obj) {
        	return null;
    }

    @objid ("a224c41b-3086-46b3-aa8f-acb475cd1da3")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd obj) {
        	return null;
    }

    @objid ("5db461dc-ac80-4fd0-92b1-db89708024c8")
    @Override
    public Object visitNaryAssociation(NaryAssociation obj) {
        	return null;
    }

    @objid ("39263082-415f-4d11-a317-8e32c4ffc6fd")
    @Override
    public Object visitNaryConnector(NaryConnector obj) {
        	return null;
    }

    @objid ("e9bc3973-8710-4328-b124-75db84023c11")
    @Override
    public Object visitNaryConnectorEnd(NaryConnectorEnd obj) {
        	return null;
    }

    @objid ("8bc533d0-c271-4580-92a1-65d931cd13ea")
    @Override
    public Object visitNaryLink(NaryLink obj) {
        	return null;
    }

    @objid ("e3ac1ed0-afbb-4537-b017-204f28f013fd")
    @Override
    public Object visitNaryLinkEnd(NaryLinkEnd obj) {
        	return null;
    }

    @objid ("17d4505a-9801-4824-b5b0-fcd8a6fe35c7")
    @Override
    public Object visitNode(Node obj) {
        	return null;
    }

    @objid ("f519f148-4a73-4c4e-bfd6-0bedd264d372")
    @Override
    public Object visitOperation(Operation obj) {
        	return null;
    }

    @objid ("b3ebbe83-16aa-4e05-9224-6fa9077b4d1e")
    @Override
    public Object visitPackage(Package obj) {
        	return null;
    }

    @objid ("73bd084e-b0e9-44c5-b5b9-cd381e0dd6a7")
    @Override
    public Object visitPackageImport(PackageImport obj) {
        	return null;
    }

    @objid ("b3b4db25-dffd-4411-90db-be96da2c9acb")
    @Override
    public Object visitPackageMerge(PackageMerge obj) {
        	return null;
    }

    @objid ("cdec729a-43ed-4625-bd87-9a4595db7750")
    @Override
    public Object visitParameter(Parameter obj) {
        	return null;
    }

    @objid ("7fb3cbdd-4f52-4d24-b96b-0e937b525586")
    @Override
    public Object visitPort(Port obj) {
        	return null;
    }

    @objid ("d4399ad7-078a-4236-af25-4f19f9b5c2c7")
    @Override
    public Object visitProvidedInterface(ProvidedInterface obj) {
        	return null;
    }

    @objid ("3d06b828-5957-425c-82fa-605e37bc43cf")
    @Override
    public Object visitRaisedException(RaisedException obj) {
        	return null;
    }

    @objid ("fd5f5958-5a17-40f5-80c3-6d0461fa3104")
    @Override
    public Object visitRequiredInterface(RequiredInterface obj) {
        	return null;
    }

    @objid ("a08a8105-5e60-4be3-93a2-8fa3d55cfa8a")
    @Override
    public Object visitStructuralFeature(StructuralFeature obj) {
        	return null;
    }

    @objid ("9e5a6aa5-5d47-47ff-a745-eaa86ffaf116")
    @Override
    public Object visitTemplateBinding(TemplateBinding obj) {
        	return null;
    }

    @objid ("28698806-1448-4ee8-ab75-7002d9718ef8")
    @Override
    public Object visitTemplateParameter(TemplateParameter obj) {
        	return null;
    }

    @objid ("18c1049f-2e91-4381-abf7-d5a20cdcd5b7")
    @Override
    public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj) {
        	return null;
    }

    @objid ("54773ba9-cd07-4585-959b-ebc0b99af04d")
    @Override
    public Object visitAcceptCallEventAction(AcceptCallEventAction obj) {
        	return null;
    }

    @objid ("a87685d3-fe59-4fa3-b6ed-aa1c2410c400")
    @Override
    public Object visitAcceptChangeEventAction(AcceptChangeEventAction obj) {
        	return null;
    }

    @objid ("b51cabf3-61cf-4a97-b056-32d7577072b5")
    @Override
    public Object visitAcceptSignalAction(AcceptSignalAction obj) {
        	return null;
    }

    @objid ("3b2964b4-a82e-46f2-8886-faf4fe1f8279")
    @Override
    public Object visitAcceptTimeEventAction(AcceptTimeEventAction obj) {
        	return null;
    }

    @objid ("26545785-ff84-4cfd-810c-1e23695b6be2")
    @Override
    public Object visitActivity(Activity obj) {
        	return null;
    }

    @objid ("e85e12ca-f0e2-4181-a22b-5ffc10075062")
    @Override
    public Object visitActivityAction(ActivityAction obj) {
        	return null;
    }

    @objid ("01a019da-0695-4ed4-a666-df7f614a8958")
    @Override
    public Object visitActivityEdge(ActivityEdge obj) {
        	return null;
    }

    @objid ("85bc88c5-c19f-4f83-85a8-55e38420a656")
    @Override
    public Object visitActivityFinalNode(ActivityFinalNode obj) {
        	return null;
    }

    @objid ("140b3e4d-5e8c-4d46-bc9f-cca0daa1ef1c")
    @Override
    public Object visitActivityGroup(ActivityGroup obj) {
        	return null;
    }

    @objid ("6d5cf58d-812e-4aab-b7b1-851fcc651d6c")
    @Override
    public Object visitActivityNode(ActivityNode obj) {
        	return null;
    }

    @objid ("9c0297ad-1e6d-4b02-a3ad-9790c3f9bb72")
    @Override
    public Object visitActivityParameterNode(ActivityParameterNode obj) {
        	return null;
    }

    @objid ("bfaa4eed-1986-413c-9014-5cd44c399534")
    @Override
    public Object visitActivityPartition(ActivityPartition obj) {
        	return null;
    }

    @objid ("a2841a8a-91a9-4c58-929d-7248be0c9164")
    @Override
    public Object visitCallAction(CallAction obj) {
        	return null;
    }

    @objid ("4c55ed4e-ca74-4066-a3d2-b6adf4386165")
    @Override
    public Object visitCallBehaviorAction(CallBehaviorAction obj) {
        	return null;
    }

    @objid ("f2036a73-0fdd-4e8a-b949-0b9b0abb9a1a")
    @Override
    public Object visitCallOperationAction(CallOperationAction obj) {
        	return null;
    }

    @objid ("6a7fb507-4e2f-4905-8de0-b8c6473f1c99")
    @Override
    public Object visitCentralBufferNode(CentralBufferNode obj) {
        	return null;
    }

    @objid ("4eba9714-2f9e-476b-819c-698032375022")
    @Override
    public Object visitClause(Clause obj) {
        	return null;
    }

    @objid ("5fdb3040-cf45-4ec4-8e58-bf7793a3cf5b")
    @Override
    public Object visitConditionalNode(ConditionalNode obj) {
        	return null;
    }

    @objid ("6da14fff-272c-4e36-8598-7ef5d7473152")
    @Override
    public Object visitControlFlow(ControlFlow obj) {
        	return null;
    }

    @objid ("dd33ba36-2178-40e2-8003-9ada061b6949")
    @Override
    public Object visitControlNode(ControlNode obj) {
        	return null;
    }

    @objid ("90c3700c-bc73-4805-935f-5cc270a25fd6")
    @Override
    public Object visitDataStoreNode(DataStoreNode obj) {
        	return null;
    }

    @objid ("f1e34188-46fe-4f02-a586-de1d61aa5648")
    @Override
    public Object visitDecisionMergeNode(DecisionMergeNode obj) {
        	return null;
    }

    @objid ("78f63f01-bd23-4594-bdbc-4bcb75984e7b")
    @Override
    public Object visitExceptionHandler(ExceptionHandler obj) {
        	return null;
    }

    @objid ("04949de8-8fde-4376-a000-96b73fb4f191")
    @Override
    public Object visitExpansionNode(ExpansionNode obj) {
        	return null;
    }

    @objid ("648e90b4-1b26-4d81-8b98-f9e8d2d65c76")
    @Override
    public Object visitExpansionRegion(ExpansionRegion obj) {
        	return null;
    }

    @objid ("f6448bf5-623d-4c01-839e-32b72206e0e4")
    @Override
    public Object visitFinalNode(FinalNode obj) {
        	return null;
    }

    @objid ("122a3fce-ee4f-43a0-bc44-cb02023b230a")
    @Override
    public Object visitFlowFinalNode(FlowFinalNode obj) {
        	return null;
    }

    @objid ("5953d12d-c8c6-4e7f-852d-eb845fe5db8f")
    @Override
    public Object visitForkJoinNode(ForkJoinNode obj) {
        	return null;
    }

    @objid ("67a720cb-9399-41cb-bdcb-2e3676b3b644")
    @Override
    public Object visitInitialNode(InitialNode obj) {
        	return null;
    }

    @objid ("7fd81816-441f-431b-8812-1dc262b3bc81")
    @Override
    public Object visitInputPin(InputPin obj) {
        	return null;
    }

    @objid ("76f302b9-db3d-429d-b213-48eeb824887e")
    @Override
    public Object visitInstanceNode(InstanceNode obj) {
        	return null;
    }

    @objid ("2b5450e5-ed0e-484a-9ae3-9ec0665c9719")
    @Override
    public Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj) {
        	return null;
    }

    @objid ("199ba629-b9f4-4a55-b723-a81cc09d6aae")
    @Override
    public Object visitLoopNode(LoopNode obj) {
        	return null;
    }

    @objid ("c7f28dc1-1157-4e6e-a95f-9231d52a2107")
    @Override
    public Object visitMessageFlow(MessageFlow obj) {
        	return null;
    }

    @objid ("9619f6db-b103-4ccd-a769-dd296adf1eb5")
    @Override
    public Object visitObjectFlow(ObjectFlow obj) {
        	return null;
    }

    @objid ("53cd02b2-1a8c-4a89-9c95-d3b4d0c5f2b0")
    @Override
    public Object visitObjectNode(ObjectNode obj) {
        	return null;
    }

    @objid ("2fd49cbb-15e7-41c2-a7d0-69ce2dd8ae42")
    @Override
    public Object visitOpaqueAction(OpaqueAction obj) {
        	return null;
    }

    @objid ("8fcad23a-9940-4aaf-912a-f06670a92b23")
    @Override
    public Object visitOutputPin(OutputPin obj) {
        	return null;
    }

    @objid ("4d9463fd-273d-4ab9-993b-c7a19eeeb7b7")
    @Override
    public Object visitPin(Pin obj) {
        	return null;
    }

    @objid ("ddeb3852-e57d-4538-8128-59e6ae55dbea")
    @Override
    public Object visitSendSignalAction(SendSignalAction obj) {
        	return null;
    }

    @objid ("1d0e364d-3dc0-4b95-bfe5-21079caed5d2")
    @Override
    public Object visitStructuredActivityNode(StructuredActivityNode obj) {
        	return null;
    }

    @objid ("5e6d2bb7-f022-41b6-9cc9-a5bb41136d8f")
    @Override
    public Object visitValuePin(ValuePin obj) {
        	return null;
    }

    @objid ("503d1d76-ae3b-4b18-be29-51d74b88c192")
    @Override
    public Object visitBehavior(Behavior obj) {
        	return null;
    }

    @objid ("c4857f64-f52e-41f2-a780-a19204850672")
    @Override
    public Object visitBehaviorParameter(BehaviorParameter obj) {
        	return null;
    }

    @objid ("f54e6b37-a319-4c75-b6e4-b34b5c13480f")
    @Override
    public Object visitOpaqueBehavior(OpaqueBehavior obj) {
        	return null;
    }

    @objid ("612ae2e0-73d1-40d0-a8af-d9b2a6874376")
    @Override
    public Object visitSignal(Signal obj) {
        	return null;
    }

    @objid ("6f816751-78e9-4b80-b6a0-b0449d4302d0")
    @Override
    public Object visitEvent(Event obj) {
        	return null;
    }

    @objid ("d3516b1c-8b10-43ab-bacd-a6921a61a1aa")
    @Override
    public Object visitCombinedFragment(CombinedFragment obj) {
        	return null;
    }

    @objid ("b168c0a7-6e19-46d9-a84d-c16881c8e6ca")
    @Override
    public Object visitDurationConstraint(DurationConstraint obj) {
        	return null;
    }

    @objid ("9c945a99-dd2a-430f-b3dc-ca7bf7e841a9")
    @Override
    public Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj) {
        	return null;
    }

    @objid ("b02cbc4b-1e1b-49bd-ad7b-ffa4843f66c2")
    @Override
    public Object visitExecutionSpecification(ExecutionSpecification obj) {
        	return null;
    }

    @objid ("025429dc-c98d-4cc0-86e2-bc1bcf51d98a")
    @Override
    public Object visitGate(Gate obj) {
        	return null;
    }

    @objid ("93749b05-1f07-49f0-973f-cc168a7936db")
    @Override
    public Object visitGeneralOrdering(GeneralOrdering obj) {
        	return null;
    }

    @objid ("08b4bb0c-fd8c-4f89-96ad-b9e2c4d13c89")
    @Override
    public Object visitInteraction(Interaction obj) {
        	return null;
    }

    @objid ("acdd4a34-db40-4b60-9d0f-85fe26f007c9")
    @Override
    public Object visitInteractionFragment(InteractionFragment obj) {
        	return null;
    }

    @objid ("b251d796-62cb-4afa-9b01-032be2299eec")
    @Override
    public Object visitInteractionOperand(InteractionOperand obj) {
        	return null;
    }

    @objid ("da40ea0c-e854-4993-83fe-eba4444f4c0b")
    @Override
    public Object visitInteractionUse(InteractionUse obj) {
        	return null;
    }

    @objid ("ac5da836-eee3-4155-912f-0b4b2ec6a337")
    @Override
    public Object visitLifeline(Lifeline obj) {
        	return null;
    }

    @objid ("03efcecd-8453-42d9-94a3-b5f0593a0949")
    @Override
    public Object visitMessage(Message obj) {
        	return null;
    }

    @objid ("7204da07-2f69-444f-9bbe-3fc121f99e6d")
    @Override
    public Object visitMessageEnd(MessageEnd obj) {
        	return null;
    }

    @objid ("8e2c89c6-4428-4b40-b069-de77583c1cd6")
    @Override
    public Object visitOccurrenceSpecification(OccurrenceSpecification obj) {
        	return null;
    }

    @objid ("5b1a1a51-f8c5-4a40-851c-1f5fdfae6a7a")
    @Override
    public Object visitPartDecomposition(PartDecomposition obj) {
        	return null;
    }

    @objid ("5b9ad33d-8d9f-4b2c-9944-205b85152066")
    @Override
    public Object visitStateInvariant(StateInvariant obj) {
        	return null;
    }

    @objid ("18190c00-0932-4d38-9661-6a8cfe7f1e58")
    @Override
    public Object visitTerminateSpecification(TerminateSpecification obj) {
        	return null;
    }

    @objid ("b71adffb-4937-4b0a-b494-22864de7fb61")
    @Override
    public Object visitAbstractPseudoState(AbstractPseudoState obj) {
        	return null;
    }

    @objid ("dbc71d6d-70df-41b9-86d7-f86f66aa0388")
    @Override
    public Object visitChoicePseudoState(ChoicePseudoState obj) {
        	return null;
    }

    @objid ("282fee19-49f2-451e-9d64-44164cab8cb3")
    @Override
    public Object visitConnectionPointReference(ConnectionPointReference obj) {
        	return null;
    }

    @objid ("6c1132fd-9dbe-4081-8491-cf336a9144a2")
    @Override
    public Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj) {
        	return null;
    }

    @objid ("af8c331f-ee00-425d-a42c-c0ab58b22984")
    @Override
    public Object visitEntryPointPseudoState(EntryPointPseudoState obj) {
        	return null;
    }

    @objid ("879f780e-b3a5-4eb9-9d6c-11b95bd4593e")
    @Override
    public Object visitExitPointPseudoState(ExitPointPseudoState obj) {
        	return null;
    }

    @objid ("e9526985-96e7-48d5-9988-2da5566eb4ee")
    @Override
    public Object visitForkPseudoState(ForkPseudoState obj) {
        	return null;
    }

    @objid ("cb07ab9a-7bef-4268-9960-cd5a2241cab2")
    @Override
    public Object visitInitialPseudoState(InitialPseudoState obj) {
        	return null;
    }

    @objid ("04138a59-77ca-4647-8640-559d80825035")
    @Override
    public Object visitInternalTransition(InternalTransition obj) {
        	return null;
    }

    @objid ("9e3dd3a7-915e-4dd6-be14-052dcb99cb03")
    @Override
    public Object visitJoinPseudoState(JoinPseudoState obj) {
        	return null;
    }

    @objid ("f1f19ee8-755a-4d85-9601-9e620c5c6174")
    @Override
    public Object visitJunctionPseudoState(JunctionPseudoState obj) {
        	return null;
    }

    @objid ("eca806ea-a8f5-4a1b-894e-2f88de274065")
    @Override
    public Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj) {
        	return null;
    }

    @objid ("118d85a1-17f0-46c7-957d-335cdffc937d")
    @Override
    public Object visitState(State obj) {
        	return null;
    }

    @objid ("27afeb97-26a4-4816-8af6-8a3de5932e09")
    @Override
    public Object visitStateMachine(StateMachine obj) {
        	return null;
    }

    @objid ("214c9019-77e7-4cc4-807b-00a331b56a26")
    @Override
    public Object visitStateVertex(StateVertex obj) {
        	return null;
    }

    @objid ("f032dcff-b816-44b1-a356-6193ace71496")
    @Override
    public Object visitTerminatePseudoState(TerminatePseudoState obj) {
        	return null;
    }

    @objid ("12e4718b-5633-4462-a7d4-8f0edab8c113")
    @Override
    public Object visitTransition(Transition obj) {
        	return null;
    }

    @objid ("50218600-818d-41a6-9318-1afdc3dab004")
    @Override
    public Object visitFinalState(FinalState obj) {
        	return null;
    }

    @objid ("0b72d142-ee13-4aeb-b7d6-cff35f55a9aa")
    @Override
    public Object visitRegion(Region obj) {
        	return null;
    }

    @objid ("828947fe-6166-482b-9c33-4379c6c2c747")
    @Override
    public Object visitActor(Actor obj) {
        	return null;
    }

    @objid ("4ba81232-c711-45d6-9dd1-807cb71ed79a")
    @Override
    public Object visitUseCase(UseCase obj) {
        	return null;
    }

    @objid ("a4f069f1-54a2-4ae9-9a37-40edf7c8d543")
    @Override
    public Object visitUseCaseDependency(UseCaseDependency obj) {
        	return null;
    }

    @objid ("5e9524aa-66e3-4cc7-b4af-d005a58fdf3a")
    @Override
    public Object visitExtensionPoint(ExtensionPoint obj) {
        	return null;
    }

    @objid ("cad668f0-473a-4ddd-a19b-4064154806d0")
    @Override
    public Object visitAnalystItem(AnalystItem obj) {
        	return null;
    }

    @objid ("3e461d01-8862-4a22-bd9b-0290b8034ba0")
    @Override
    public Object visitAnalystElement(AnalystElement obj) {
        	return null;
    }

    @objid ("4d42ff4b-4df9-4211-a870-804ac6f4fb5b")
    @Override
    public Object visitAnalystContainer(AnalystContainer obj) {
        	return null;
    }

    @objid ("8e59b631-a2cc-4d03-bd1d-78e846fa96df")
    @Override
    public Object visitAnalystProject(AnalystProject obj) {
        	return null;
    }

    @objid ("a851577b-3728-455c-b479-bc60781e14b4")
    @Override
    public Object visitAnalystPropertyTable(AnalystPropertyTable obj) {
        	return null;
    }

    @objid ("d471efb0-d3da-4d4d-88a9-639f78336813")
    @Override
    public Object visitBusinessRule(BusinessRule obj) {
        	return null;
    }

    @objid ("09eb3ea8-b3ea-4504-b59b-1c7b3bd7d834")
    @Override
    public Object visitBusinessRuleContainer(BusinessRuleContainer obj) {
        	return null;
    }

    @objid ("b4f112d0-5540-41ac-95fe-d8bf84f5b3f3")
    @Override
    public Object visitDictionary(Dictionary obj) {
        	return null;
    }

    @objid ("497edf68-9550-484b-89db-b505bb49df25")
    @Override
    public Object visitGoal(Goal obj) {
        	return null;
    }

    @objid ("18150e97-489a-45ac-a4c6-1ac1b278a2f1")
    @Override
    public Object visitGoalContainer(GoalContainer obj) {
        	return null;
    }

    @objid ("1be02df3-92dc-447f-936c-7cd8a79cafaa")
    @Override
    public Object visitPropertyContainer(PropertyContainer obj) {
        	return null;
    }

    @objid ("5b6d775d-86bb-43cf-a4f3-3281f4b16ca9")
    @Override
    public Object visitRequirement(Requirement obj) {
        	return null;
    }

    @objid ("ba8c7e66-895e-4818-8543-0b4500eac54d")
    @Override
    public Object visitRequirementContainer(RequirementContainer obj) {
        	return null;
    }

    @objid ("3ad5abcd-cc64-49cb-a4f5-caaeef24fdc9")
    @Override
    public Object visitTerm(Term obj) {
        	return null;
    }

    @objid ("e449a259-52ab-4eb4-854d-bc50878def17")
    @Override
    public Object visitGenericAnalystContainer(GenericAnalystContainer obj) {
        	return null;
    }

    @objid ("fd641140-2a7b-4dc6-896f-fc35fc5002fb")
    @Override
    public Object visitGenericAnalystElement(GenericAnalystElement obj) {
        	return null;
    }

    @objid ("1682377e-7c8c-4134-a228-754ca852baac")
    @Override
    public Object visitInformationFlow(InformationFlow obj) {
        	return null;
    }

    @objid ("08fd6be1-a7f1-4692-83bb-87178e4b5cdd")
    @Override
    public Object visitInformationItem(InformationItem obj) {
        	return null;
    }

    @objid ("7b6269e1-547e-4b94-a48e-ce9ef9e1b5c1")
    @Override
    public Object visitDataFlow(DataFlow obj) {
        	return null;
    }

    @objid ("a6dd5c87-4e5a-43fa-a0fc-c9980ba1f4c7")
    @Override
    public Object visitCommunicationInteraction(CommunicationInteraction obj) {
        	return null;
    }

    @objid ("9dc632ae-44f1-42a7-8e65-985e13496284")
    @Override
    public Object visitCommunicationNode(CommunicationNode obj) {
        	return null;
    }

    @objid ("edede1c3-2eca-4f5e-a8df-0b08549f1825")
    @Override
    public Object visitCommunicationMessage(CommunicationMessage obj) {
        	return null;
    }

    @objid ("f524288f-4ff7-47e5-b567-72a2e4dc842e")
    @Override
    public Object visitCommunicationChannel(CommunicationChannel obj) {
        	return null;
    }

    @objid ("83a34ecc-386a-486c-bc5a-408f64d8093e")
    @Override
    public Object visitBpmnCollaboration(BpmnCollaboration obj) {
        	return null;
    }

    @objid ("62e545d6-955a-4b74-8f72-c2aa4be24ba5")
    @Override
    public Object visitBpmnLane(BpmnLane obj) {
        	return null;
    }

    @objid ("fcf4be52-a0cb-4d43-9e09-e6a68406d893")
    @Override
    public Object visitBpmnLaneSet(BpmnLaneSet obj) {
        	return null;
    }

    @objid ("a23ee507-8864-4263-b30b-07aaa09bf4bc")
    @Override
    public Object visitBpmnParticipant(BpmnParticipant obj) {
        	return null;
    }

    @objid ("3ded6641-235d-4206-8cae-98981e508990")
    @Override
    public Object visitBpmnProcess(BpmnProcess obj) {
        	return null;
    }

    @objid ("31b725a7-72e5-45d4-81e8-f43db0316d70")
    @Override
    public Object visitBpmnAssociation(BpmnAssociation obj) {
        	return null;
    }

    @objid ("eea5019f-fe81-4c87-9102-6a35d4634e14")
    @Override
    public Object visitBpmnBaseElement(BpmnBaseElement obj) {
        	return null;
    }

    @objid ("b6ad5d10-4bb5-4328-9436-8a55b1b0914d")
    @Override
    public Object visitBpmnArtifact(BpmnArtifact obj) {
        	return null;
    }

    @objid ("177e764a-5d3d-466c-ba39-458f4770578d")
    @Override
    public Object visitBpmnFlowElement(BpmnFlowElement obj) {
        	return null;
    }

    @objid ("588c56c1-e27f-4cd1-bd66-195b118ab375")
    @Override
    public Object visitBpmnFlowNode(BpmnFlowNode obj) {
        	return null;
    }

    @objid ("0d2406b2-7dad-4a47-9041-df762d074a45")
    @Override
    public Object visitBpmnGroup(BpmnGroup obj) {
        	return null;
    }

    @objid ("4f8ffda1-8f6b-4ff6-bddd-5d71b59be613")
    @Override
    public Object visitBpmnRootElement(BpmnRootElement obj) {
        	return null;
    }

    @objid ("380b4e91-b653-4186-8a95-89ccdad158c9")
    @Override
    public Object visitBpmnBehavior(BpmnBehavior obj) {
        	return null;
    }

    @objid ("a9933f0b-d6f7-44a6-a739-7c25866e4680")
    @Override
    public Object visitBpmnMessage(BpmnMessage obj) {
        	return null;
    }

    @objid ("90515be0-ef1a-40b7-ba78-394c1deb600e")
    @Override
    public Object visitBpmnMessageFlow(BpmnMessageFlow obj) {
        	return null;
    }

    @objid ("65b9b04a-46af-42d2-95ab-54752c0530aa")
    @Override
    public Object visitBpmnSequenceFlow(BpmnSequenceFlow obj) {
        	return null;
    }

    @objid ("e6485c6b-e8f2-4da7-9d6c-dd71815570be")
    @Override
    public Object visitBpmnActivity(BpmnActivity obj) {
        	return null;
    }

    @objid ("72de13a4-c82a-428e-8b32-d00622eafffc")
    @Override
    public Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj) {
        	return null;
    }

    @objid ("789f3e42-283d-4067-8d43-240b36671b95")
    @Override
    public Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj) {
        	return null;
    }

    @objid ("7715e867-8375-4cd1-8760-1f72b9208a7a")
    @Override
    public Object visitBpmnCallActivity(BpmnCallActivity obj) {
        	return null;
    }

    @objid ("ee358500-ac97-4ffb-9101-3887ad713d48")
    @Override
    public Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj) {
        	return null;
    }

    @objid ("01647dac-ca90-45f9-a0b5-92254adb8be4")
    @Override
    public Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj) {
        	return null;
    }

    @objid ("ce016ef4-b927-4aca-824b-9cf021880820")
    @Override
    public Object visitBpmnManualTask(BpmnManualTask obj) {
        	return null;
    }

    @objid ("ce31aef1-f81c-4a58-884a-4faa711ae882")
    @Override
    public Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj) {
        	return null;
    }

    @objid ("ad53a84b-587d-4663-851c-6e5441df8d4a")
    @Override
    public Object visitBpmnReceiveTask(BpmnReceiveTask obj) {
        	return null;
    }

    @objid ("61e7ba02-135e-4f9e-8561-3abf78183140")
    @Override
    public Object visitBpmnScriptTask(BpmnScriptTask obj) {
        	return null;
    }

    @objid ("670a3a9b-8270-4f39-8d1e-3f921f39cd21")
    @Override
    public Object visitBpmnSendTask(BpmnSendTask obj) {
        	return null;
    }

    @objid ("fabcbe80-7834-45b7-9210-578507ecc6b3")
    @Override
    public Object visitBpmnServiceTask(BpmnServiceTask obj) {
        	return null;
    }

    @objid ("d249be7f-b230-49fc-97a5-e1081850c1d2")
    @Override
    public Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj) {
        	return null;
    }

    @objid ("1e31f04b-f33b-4b12-9b56-b008afd9d1df")
    @Override
    public Object visitBpmnSubProcess(BpmnSubProcess obj) {
        	return null;
    }

    @objid ("289e7669-7584-47f9-82bc-88d09ccf9268")
    @Override
    public Object visitBpmnTask(BpmnTask obj) {
        	return null;
    }

    @objid ("91dbab60-8ceb-436b-b702-ea0613e6e212")
    @Override
    public Object visitBpmnTransaction(BpmnTransaction obj) {
        	return null;
    }

    @objid ("799d87c5-af87-4e27-a7f9-2c71976a6382")
    @Override
    public Object visitBpmnUserTask(BpmnUserTask obj) {
        	return null;
    }

    @objid ("383022fb-aa02-48d1-81bb-094c28eb1708")
    @Override
    public Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj) {
        	return null;
    }

    @objid ("d6cfac92-83e7-465b-a3b8-73c1e2f48e4f")
    @Override
    public Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj) {
        	return null;
    }

    @objid ("7df7adf9-8b81-4ffb-9496-0591d4e31df3")
    @Override
    public Object visitBpmnCatchEvent(BpmnCatchEvent obj) {
        	return null;
    }

    @objid ("e70588e8-a1dd-4c3e-84aa-ad2fb81a1055")
    @Override
    public Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj) {
        	return null;
    }

    @objid ("c0b70001-f82f-48a8-a91a-abdc02bcd724")
    @Override
    public Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj) {
        	return null;
    }

    @objid ("4615334a-8e7b-46cd-9ac2-bcb7ba2cbb84")
    @Override
    public Object visitBpmnEndEvent(BpmnEndEvent obj) {
        	return null;
    }

    @objid ("d1b00c1f-3c59-484c-afbc-1148ed6d8eb0")
    @Override
    public Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj) {
        	return null;
    }

    @objid ("e1e02c24-7be5-41fb-9173-a4aa58c4988e")
    @Override
    public Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj) {
        	return null;
    }

    @objid ("35498c80-4ec4-428d-8f9b-683433dc2e5c")
    @Override
    public Object visitBpmnEvent(BpmnEvent obj) {
        	return null;
    }

    @objid ("46a15f9f-7be6-4406-974d-ba8ea04a846b")
    @Override
    public Object visitBpmnEventDefinition(BpmnEventDefinition obj) {
        	return null;
    }

    @objid ("1e0f8ff4-461d-475b-965c-230dbfe23577")
    @Override
    public Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj) {
        	return null;
    }

    @objid ("42332119-ce5d-4eed-b70f-47ef56eaa59d")
    @Override
    public Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj) {
        	return null;
    }

    @objid ("dcd2d332-fdcf-469b-842c-940349d76dac")
    @Override
    public Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj) {
        	return null;
    }

    @objid ("e4cee627-4e29-4d9e-9355-d15352ee98be")
    @Override
    public Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj) {
        	return null;
    }

    @objid ("bf098815-51cf-47d5-a2d3-5f3cb560dd7a")
    @Override
    public Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj) {
        	return null;
    }

    @objid ("0037fe6d-ea6f-4c24-ad0d-94c079c9ea18")
    @Override
    public Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj) {
        	return null;
    }

    @objid ("230b90a5-cc59-4889-9151-cdea6d0a6bb1")
    @Override
    public Object visitBpmnStartEvent(BpmnStartEvent obj) {
        	return null;
    }

    @objid ("d80568d8-7150-463d-b86f-a39d2aea25d1")
    @Override
    public Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj) {
        	return null;
    }

    @objid ("efbe77f5-d09c-4185-a447-797af10cae5d")
    @Override
    public Object visitBpmnThrowEvent(BpmnThrowEvent obj) {
        	return null;
    }

    @objid ("f940817d-b6f5-4648-8e1a-156d3f1c770c")
    @Override
    public Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj) {
        	return null;
    }

    @objid ("b62beb28-d256-4cd5-b254-19e6e9487ed5")
    @Override
    public Object visitBpmnComplexGateway(BpmnComplexGateway obj) {
        	return null;
    }

    @objid ("80548109-099d-426a-8996-33a9bea8be80")
    @Override
    public Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj) {
        	return null;
    }

    @objid ("efb495c7-890d-4ca2-bad1-273720efa09d")
    @Override
    public Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj) {
        	return null;
    }

    @objid ("0513874f-c84d-44b0-9fe9-db6f2a2c0d92")
    @Override
    public Object visitBpmnGateway(BpmnGateway obj) {
        	return null;
    }

    @objid ("83bb5ee2-c32a-4b2e-a721-0510c61256d8")
    @Override
    public Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj) {
        	return null;
    }

    @objid ("960ce5df-23d2-4a0d-8d79-445280a60419")
    @Override
    public Object visitBpmnParallelGateway(BpmnParallelGateway obj) {
        	return null;
    }

    @objid ("03c0dd1c-56b4-4114-a665-402cb849d17a")
    @Override
    public Object visitBpmnDataObject(BpmnDataObject obj) {
        	return null;
    }

    @objid ("3c302c17-27e7-4cf2-95a3-bbf03b149020")
    @Override
    public Object visitBpmnDataStore(BpmnDataStore obj) {
        	return null;
    }

    @objid ("c83375b5-c420-432c-9ff6-43dc9deefa85")
    @Override
    public Object visitBpmnDataAssociation(BpmnDataAssociation obj) {
        	return null;
    }

    @objid ("3be0c110-b17e-41bc-95fb-bf66e596f0f3")
    @Override
    public Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj) {
        	return null;
    }

    @objid ("643c5d5a-b873-4310-99d5-c154109ee0a7")
    @Override
    public Object visitBpmnDataOutput(BpmnDataOutput obj) {
        	return null;
    }

    @objid ("e9914738-4644-40b7-8fbb-aacc748daea8")
    @Override
    public Object visitBpmnDataInput(BpmnDataInput obj) {
        	return null;
    }

    @objid ("00b01bab-3659-40e6-b115-3eff50e5fb26")
    @Override
    public Object visitBpmnItemAwareElement(BpmnItemAwareElement obj) {
        	return null;
    }

    @objid ("db9d98a5-078c-4738-ba86-baf5774663d7")
    @Override
    public Object visitBpmnItemDefinition(BpmnItemDefinition obj) {
        	return null;
    }

    @objid ("fcc7f076-1122-437a-8169-480757ab63df")
    @Override
    public Object visitBpmnDataState(BpmnDataState obj) {
        	return null;
    }

    @objid ("a2c75b9f-0f2d-4087-86a0-bcfeb73ab42f")
    @Override
    public Object visitBpmnResource(BpmnResource obj) {
        	return null;
    }

    @objid ("0892a232-6829-4385-8897-6470020367bd")
    @Override
    public Object visitBpmnResourceParameter(BpmnResourceParameter obj) {
        	return null;
    }

    @objid ("c687856a-97db-4d52-89bc-fcd91dfb4eb2")
    @Override
    public Object visitBpmnResourceRole(BpmnResourceRole obj) {
        	return null;
    }

    @objid ("d8b209a9-b614-49b1-b786-908eeabd6313")
    @Override
    public Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj) {
        	return null;
    }

    @objid ("43f75ab5-911b-4617-8526-2732086ef684")
    @Override
    public Object visitBpmnOperation(BpmnOperation obj) {
        	return null;
    }

    @objid ("baf0d0e5-01b3-410e-a52a-ff44ac8c17e4")
    @Override
    public Object visitBpmnInterface(BpmnInterface obj) {
        	return null;
    }

    @objid ("80dfaaef-0eb1-41d7-9e65-4aaf5f6d4c0a")
    @Override
    public Object visitBpmnEndPoint(BpmnEndPoint obj) {
        	return null;
    }

    @objid ("fe745995-e342-426d-a013-fdad019c9f01")
    @Override
    public Object visitAbstractDiagram(AbstractDiagram obj) {
        	return null;
    }

    @objid ("3f7f9c0c-7968-400d-8339-f667ea3fe71d")
    @Override
    public Object visitActivityDiagram(ActivityDiagram obj) {
        	return null;
    }

    @objid ("8a5d5fbe-6f07-44c6-afd5-50e4912f662f")
    @Override
    public Object visitBehaviorDiagram(BehaviorDiagram obj) {
        	return null;
    }

    @objid ("49648175-c367-4f59-bc92-ba13faf4985c")
    @Override
    public Object visitClassDiagram(ClassDiagram obj) {
        	return null;
    }

    @objid ("2eb4ab38-3631-485d-8e2a-bde2e4ec22e4")
    @Override
    public Object visitCommunicationDiagram(CommunicationDiagram obj) {
        	return null;
    }

    @objid ("5d637ed1-927e-46d3-80fc-369e77060581")
    @Override
    public Object visitDeploymentDiagram(DeploymentDiagram obj) {
        	return null;
    }

    @objid ("1ef7e7d8-86df-4106-8369-933f031c357b")
    @Override
    public Object visitDiagramSet(DiagramSet obj) {
        	return null;
    }

    @objid ("8d735194-e626-41e0-9f97-1dcdf45be7c2")
    @Override
    public Object visitSequenceDiagram(SequenceDiagram obj) {
        	return null;
    }

    @objid ("d1b44f35-d05a-48e6-9881-c10733480489")
    @Override
    public Object visitStateMachineDiagram(StateMachineDiagram obj) {
        	return null;
    }

    @objid ("85d50ac7-3278-4a63-aeb2-adfd9b1c1e68")
    @Override
    public Object visitStaticDiagram(StaticDiagram obj) {
        	return null;
    }

    @objid ("fc2a58d6-0d3b-4a3b-b24b-b89a34ff94aa")
    @Override
    public Object visitUseCaseDiagram(UseCaseDiagram obj) {
        	return null;
    }

    @objid ("55663fbc-de32-4366-939f-b25ddf23bd75")
    @Override
    public Object visitObjectDiagram(ObjectDiagram obj) {
        	return null;
    }

    @objid ("633e0130-5a23-43b0-9a69-b9a4adb356e0")
    @Override
    public Object visitCompositeStructureDiagram(CompositeStructureDiagram obj) {
        	return null;
    }

    @objid ("666654b9-2838-4ce8-93ca-d02617613151")
    @Override
    public Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj) {
        	return null;
    }

    @objid ("4b881f40-6d27-4266-85bd-847672fcfead")
    @Override
    public Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj) {
        	return null;
    }

    @objid ("42575134-79d5-47cc-98df-e24bfd6187c7")
    @Override
    public Object visitModuleParameter(ModuleParameter obj) {
        	return null;
    }

    @objid ("14f8268a-7618-4ded-bc59-97cf1ffbfe01")
    @Override
    public Object visitModuleComponent(ModuleComponent obj) {
        	return null;
    }

    @objid ("f43e6eee-391f-4042-8e32-d695a44dde69")
    @Override
    public Object visitProject(Project obj) {
        	return null;
    }

}
