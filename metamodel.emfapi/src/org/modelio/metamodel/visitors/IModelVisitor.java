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
import org.modelio.vcore.smkernel.mapi.MVisitor;

@objid ("000a4862-4f2c-1032-829a-001ec947cd2a")
public interface IModelVisitor extends MVisitor {
    @objid ("ef0fe29a-d078-4706-b306-c3f0d5adb740")
    Object visitAbstraction(Abstraction obj);

    @objid ("f2e75c6d-377e-431b-bbe8-64d9a8714655")
    Object visitConstraint(Constraint obj);

    @objid ("6f423278-864f-4c37-a21d-de5ea1c327ef")
    Object visitDependency(Dependency obj);

    @objid ("8f6a90d2-f167-4732-805e-abfffdf258b0")
    Object visitElement(Element obj);

    @objid ("037a9a7c-09dc-4116-ac1f-7495d3c0a98f")
    Object visitModelElement(ModelElement obj);

    @objid ("168fb6f8-aae4-441e-86f0-5fa6c0bc77c8")
    Object visitModelTree(ModelTree obj);

    @objid ("2d38b1e1-7e4b-4609-909f-1352b90a261d")
    Object visitNote(Note obj);

    @objid ("36084a96-d1ce-4d1c-855a-9ddb7dd84790")
    Object visitNoteType(NoteType obj);

    @objid ("fd82ac2c-6129-42c8-b15f-f49386335eba")
    Object visitProfile(Profile obj);

    @objid ("202672f1-fb2e-4126-8b7b-15c5df030b05")
    Object visitStereotype(Stereotype obj);

    @objid ("21375f20-9e6d-4a58-be81-e3b891dfd166")
    Object visitSubstitution(Substitution obj);

    @objid ("cf4cd4db-48d5-41ba-b45f-7d2f7d094664")
    Object visitTagParameter(TagParameter obj);

    @objid ("32036ba3-c4ec-42b8-a714-3dfd9336ef31")
    Object visitTagType(TagType obj);

    @objid ("4c1fd07b-dc64-47e0-83f7-6436b94a3b55")
    Object visitTaggedValue(TaggedValue obj);

    @objid ("ff7260e6-b87d-4cc1-a815-ff201b88a023")
    Object visitUsage(Usage obj);

    @objid ("3e446c19-bf3a-4ca7-b9bf-7a5aebe44e61")
    Object visitMetaclassReference(MetaclassReference obj);

    @objid ("f0dc14a6-e286-4592-9918-b88f54ad93f4")
    Object visitExternDocument(ExternDocument obj);

    @objid ("635d1a9e-dd67-46fd-8c7e-cfb2d51b19cd")
    Object visitExternDocumentType(ExternDocumentType obj);

    @objid ("b7e18695-3a3e-4c0e-aa48-6e5d7ecc388d")
    Object visitEnumeratedPropertyType(EnumeratedPropertyType obj);

    @objid ("8ca8c0a5-6866-40a3-9a9e-ddb24e60e527")
    Object visitLocalPropertyTable(LocalPropertyTable obj);

    @objid ("dbd8033f-4a7e-4183-9fd7-f344de3de8ec")
    Object visitPropertyDefinition(PropertyDefinition obj);

    @objid ("fe63065e-4476-41ae-9c99-d1d8c1cb0ced")
    Object visitPropertyEnumerationLitteral(PropertyEnumerationLitteral obj);

    @objid ("57f22f63-6128-4b05-8b9a-bb5af385646c")
    Object visitPropertyTable(PropertyTable obj);

    @objid ("e779bc3d-b06c-46b8-8265-20327ad4278a")
    Object visitPropertyTableDefinition(PropertyTableDefinition obj);

    @objid ("f46f167e-1de7-4892-be1a-343209b245a0")
    Object visitPropertyType(PropertyType obj);

    @objid ("faeedbe4-85d2-4450-b1c0-5fba4e74e1d0")
    Object visitTypedPropertyTable(TypedPropertyTable obj);

    @objid ("24c89c67-ad6a-40ea-ab6c-d228f230b3ed")
    Object visitArtifact(Artifact obj);

    @objid ("8cd7895c-7f59-4804-b230-ec5624b03100")
    Object visitAssociationEnd(AssociationEnd obj);

    @objid ("a48eb62d-f1e6-4d3c-8aeb-0aef64f0d322")
    Object visitAttribute(Attribute obj);

    @objid ("c41d4d28-64d0-42c8-8b0d-d3d848699360")
    Object visitAttributeLink(AttributeLink obj);

    @objid ("a92a46f0-f51f-4352-adaf-d1437137c0be")
    Object visitBindableInstance(BindableInstance obj);

    @objid ("ca1ea5e2-ee37-49c4-9dd3-5298b9eb32ff")
    Object visitBinding(Binding obj);

    @objid ("4212f3d6-8268-49dd-b68c-57186eedf901")
    Object visitClass(Class obj);

    @objid ("97a311a6-fe98-4716-9a38-7e4c581bc904")
    Object visitClassAssociation(ClassAssociation obj);

    @objid ("d78a8ffb-7f92-4173-a3a6-dece8e666347")
    Object visitClassifier(Classifier obj);

    @objid ("76489a2a-845b-44b1-b1b1-a3ff08dc490d")
    Object visitCollaboration(Collaboration obj);

    @objid ("f9735bb1-38f6-4cad-bbaa-feea0507af81")
    Object visitCollaborationUse(CollaborationUse obj);

    @objid ("5a7bd891-0a80-4ec2-b0da-1c695ad17252")
    Object visitComponent(Component obj);

    @objid ("ce329389-a8ff-4b48-a0ad-7bc6bf7e8ccb")
    Object visitNaryConnector(NaryConnector obj);

    @objid ("450c2f83-e4b7-4779-9372-1a0f6cce564e")
    Object visitConnectorEnd(ConnectorEnd obj);

    @objid ("76adde09-4394-4b08-8ef8-7b3c63efced0")
    Object visitDataType(DataType obj);

    @objid ("b59976e1-9a1a-4226-a1f8-018aa187c8e7")
    Object visitElementImport(ElementImport obj);

    @objid ("bbf694c7-dd84-44ef-a92e-8fac0492be2f")
    Object visitElementRealization(ElementRealization obj);

    @objid ("4d06a0d8-cacf-42e1-83a0-189cf6815153")
    Object visitEnumeration(Enumeration obj);

    @objid ("12c66f08-166a-4876-934a-c255a95b0170")
    Object visitEnumerationLiteral(EnumerationLiteral obj);

    @objid ("30e3bc0f-c3f1-4be9-8342-7124906c0a4e")
    Object visitFeature(Feature obj);

    @objid ("4559d886-639d-4bc7-b317-8cd2d1f35800")
    Object visitGeneralClass(GeneralClass obj);

    @objid ("27b5422e-8527-450a-8ad2-e745dc8f880f")
    Object visitGeneralization(Generalization obj);

    @objid ("530a221f-d864-41b4-b368-8851bb8c3257")
    Object visitInstance(Instance obj);

    @objid ("cf8d1612-2306-44f5-b961-1dac21f95642")
    Object visitInterface(Interface obj);

    @objid ("0735a9fa-79bb-428b-ab16-26778ac1054e")
    Object visitInterfaceRealization(InterfaceRealization obj);

    @objid ("d9598cf7-9575-43d6-8908-f310a69856fa")
    Object visitLinkEnd(LinkEnd obj);

    @objid ("8e3957ba-4337-4fbd-a21c-7343129d3d21")
    Object visitManifestation(Manifestation obj);

    @objid ("75ceae2a-badc-4553-a920-69e40f78ac1f")
    Object visitNameSpace(NameSpace obj);

    @objid ("80ecd967-d0cc-48cf-9e4e-0245e2508eb8")
    Object visitNamespaceUse(NamespaceUse obj);

    @objid ("dbad8a8b-28bf-4459-9238-c25f6fed1592")
    Object visitNode(Node obj);

    @objid ("764238ab-9fd0-438e-a623-f7f743e1c8a2")
    Object visitOperation(Operation obj);

    @objid ("b652f987-77d7-4b6b-b504-67663dab1b18")
    Object visitPackage(Package obj);

    @objid ("e661916c-3e78-49df-869e-fb8399309743")
    Object visitPackageImport(PackageImport obj);

    @objid ("bde2b03c-4c4c-4303-9c29-99cbebfa44e8")
    Object visitPackageMerge(PackageMerge obj);

    @objid ("1095f705-7f5b-44fe-b67e-0f620e8fc87b")
    Object visitParameter(Parameter obj);

    @objid ("70c01629-1f26-46ba-b7e8-6e8bc317cfdc")
    Object visitPort(Port obj);

    @objid ("0fe7ddbe-5e3d-4d32-975c-15f544ae8f45")
    Object visitProvidedInterface(ProvidedInterface obj);

    @objid ("17cb73f0-bb55-48db-bdc6-01d0759f16d2")
    Object visitRaisedException(RaisedException obj);

    @objid ("3ef2c7c5-ed2c-45aa-b8d2-775cf97b4ce5")
    Object visitRequiredInterface(RequiredInterface obj);

    @objid ("d0d9bba8-b323-4b6a-973b-46dff1e04ead")
    Object visitTemplateBinding(TemplateBinding obj);

    @objid ("6e692816-317f-451c-bacb-c754fc229559")
    Object visitTemplateParameter(TemplateParameter obj);

    @objid ("be52d8c4-e6b5-46fe-a28e-7123467e6cf5")
    Object visitTemplateParameterSubstitution(TemplateParameterSubstitution obj);

    @objid ("c4d8b243-9868-422e-b6cf-40dfee91ca39")
    Object visitStructuralFeature(StructuralFeature obj);

    @objid ("55230ada-87fe-4c44-82e5-8c8eb478e0d3")
    Object visitBehavioralFeature(BehavioralFeature obj);

    @objid ("1079a0e8-94d5-4fd8-ad8e-a171ed61d265")
    Object visitNaryAssociationEnd(NaryAssociationEnd obj);

    @objid ("ed24f43f-53ae-4acc-88a4-ed22d7cf6ec4")
    Object visitNaryAssociation(NaryAssociation obj);

    @objid ("1ccafb49-1af3-4e19-b281-d6785f8dcf8e")
    Object visitNaryLink(NaryLink obj);

    @objid ("03035856-c257-40c6-aab4-ca9fd2de0f21")
    Object visitNaryLinkEnd(NaryLinkEnd obj);

    @objid ("f1ab0f81-b360-4dec-bfdc-30125a8b8b55")
    Object visitNaryConnectorEnd(NaryConnectorEnd obj);

    @objid ("7ee45d09-5f10-476f-973d-8c4f33e0bf35")
    Object visitAssociation(Association obj);

    @objid ("47431c83-1ddf-462a-a4fd-4d3fa0d692a4")
    Object visitLink(Link obj);

    @objid ("8a02296b-17a2-4b2d-bc58-f894176cd473")
    Object visitConnector(Connector obj);

    @objid ("6de44146-8117-45a6-bb29-23062f5cebd9")
    Object visitAcceptCallEventAction(AcceptCallEventAction obj);

    @objid ("52900428-d82f-4033-ad1d-b71e6a190b72")
    Object visitAcceptChangeEventAction(AcceptChangeEventAction obj);

    @objid ("d109b5a8-5471-4db9-b666-7defa3a0513d")
    Object visitAcceptSignalAction(AcceptSignalAction obj);

    @objid ("3ca8ffc6-df90-4c4a-a75b-7d901a768340")
    Object visitAcceptTimeEventAction(AcceptTimeEventAction obj);

    @objid ("ec5525f4-e750-4d8d-8c50-902bc3dba47e")
    Object visitActivity(Activity obj);

    @objid ("4fc1fc5e-c64b-4c40-8ef0-41fbf0ba31fe")
    Object visitActivityAction(ActivityAction obj);

    @objid ("47140398-c536-44a1-8253-1a5839b3065f")
    Object visitActivityEdge(ActivityEdge obj);

    @objid ("ce43f5c2-abf8-4534-9681-43c0daa9f1d2")
    Object visitActivityFinalNode(ActivityFinalNode obj);

    @objid ("f7df9c48-bb8c-47a2-ab7e-d24c5ce93670")
    Object visitActivityGroup(ActivityGroup obj);

    @objid ("5180e02d-7586-42d7-b354-025a5d18420d")
    Object visitActivityNode(ActivityNode obj);

    @objid ("e5757701-7b5b-46ef-a3aa-db6afc462440")
    Object visitActivityParameterNode(ActivityParameterNode obj);

    @objid ("bec200bb-6773-479a-8edf-b435cec11916")
    Object visitActivityPartition(ActivityPartition obj);

    @objid ("6101a4e7-e60d-4426-bf2a-f5f3bcc6a956")
    Object visitCallAction(CallAction obj);

    @objid ("5683d996-65e6-4f8d-ae4f-37bdfabfe317")
    Object visitCallBehaviorAction(CallBehaviorAction obj);

    @objid ("67ebeae5-b80a-4a1f-8490-dd490b6d0eee")
    Object visitCallOperationAction(CallOperationAction obj);

    @objid ("62b7a234-02d0-4be3-937c-cda5bc07c655")
    Object visitCentralBufferNode(CentralBufferNode obj);

    @objid ("fb5f874e-2df1-4cd6-a242-e99fe086eab2")
    Object visitClause(Clause obj);

    @objid ("76dbdf50-ad4e-4c93-bd9f-7ee1bf4c5fc0")
    Object visitConditionalNode(ConditionalNode obj);

    @objid ("93d32293-da0e-42cc-820c-9567b5c3a39f")
    Object visitControlFlow(ControlFlow obj);

    @objid ("5d92a016-89d7-4a0b-9f3b-3aa45e993410")
    Object visitControlNode(ControlNode obj);

    @objid ("c560b309-0f34-4b7d-a106-28c3cc2ac2af")
    Object visitDataStoreNode(DataStoreNode obj);

    @objid ("d647c9c6-4adc-4eb9-963b-7824d9361c4e")
    Object visitDecisionMergeNode(DecisionMergeNode obj);

    @objid ("17a9b954-98bd-45b1-afaa-c453f1a2f705")
    Object visitExceptionHandler(ExceptionHandler obj);

    @objid ("461e73ee-b18a-49cf-859b-856e058a4de1")
    Object visitExpansionNode(ExpansionNode obj);

    @objid ("7b8bf1fb-c834-4e6b-8617-02b79501d9ae")
    Object visitExpansionRegion(ExpansionRegion obj);

    @objid ("1623060c-3586-44d9-afed-2943a4bca4e9")
    Object visitFinalNode(FinalNode obj);

    @objid ("d9cf73c7-c8e4-488f-8efb-11a2f2217929")
    Object visitFlowFinalNode(FlowFinalNode obj);

    @objid ("2eb1ef37-6e7e-426f-a133-8e4dc1ab7eeb")
    Object visitForkJoinNode(ForkJoinNode obj);

    @objid ("4d9fbe1d-1fd8-462c-98c5-001329f73815")
    Object visitInitialNode(InitialNode obj);

    @objid ("572394d7-8a53-40a7-8e23-b19933bd0ab4")
    Object visitInputPin(InputPin obj);

    @objid ("f6a69bc4-c06c-41a1-906f-40a7911c34ad")
    Object visitInstanceNode(InstanceNode obj);

    @objid ("24b6318e-3cf2-4d41-813a-845571dbd0de")
    Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj);

    @objid ("f79c92e7-22a9-45ab-950e-443f310d3d3d")
    Object visitLoopNode(LoopNode obj);

    @objid ("f715cc47-ccdd-46e1-807a-87f7ed638eef")
    Object visitMessageFlow(MessageFlow obj);

    @objid ("94176f03-9126-43e5-a4b5-be5b6595b242")
    Object visitObjectFlow(ObjectFlow obj);

    @objid ("ceba3740-1594-43c0-9265-d11951caaee4")
    Object visitObjectNode(ObjectNode obj);

    @objid ("4f3b18ca-cf31-4539-8b9d-71ab8513c287")
    Object visitOpaqueAction(OpaqueAction obj);

    @objid ("bc57226d-409e-49ee-919a-0f3d284c28a0")
    Object visitOutputPin(OutputPin obj);

    @objid ("0ac7f475-2a14-4ef0-91fa-eda2404889fa")
    Object visitPin(Pin obj);

    @objid ("3c740b56-9603-45f4-9665-3daa0abc7f4d")
    Object visitSendSignalAction(SendSignalAction obj);

    @objid ("5822215a-94ea-4a0a-8f8a-b6eedabd32ca")
    Object visitStructuredActivityNode(StructuredActivityNode obj);

    @objid ("2dd07ab0-870e-4377-89b6-66e724f9ec9f")
    Object visitValuePin(ValuePin obj);

    @objid ("8be4c037-a655-46be-a6d1-6a0a4eb59219")
    Object visitBehavior(Behavior obj);

    @objid ("65eacab8-ff1f-4119-8779-5cc9ea901707")
    Object visitBehaviorParameter(BehaviorParameter obj);

    @objid ("43f558a2-5ad4-48f5-87a3-beb99d044d21")
    Object visitOpaqueBehavior(OpaqueBehavior obj);

    @objid ("d72d4e38-a168-4163-8ac4-f37422407186")
    Object visitSignal(Signal obj);

    @objid ("4b92d336-67be-432d-aba5-3f5c32c31410")
    Object visitEvent(Event obj);

    @objid ("efbdc0c4-c635-48a8-965d-b7c8552e864e")
    Object visitCombinedFragment(CombinedFragment obj);

    @objid ("a1406bdc-efb6-4326-b9d6-72561e6b5f72")
    Object visitDurationConstraint(DurationConstraint obj);

    @objid ("7f7d6d3d-2a02-41ff-b3b8-d3d45f1b6ee7")
    Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj);

    @objid ("ca19d5bb-83cd-49fb-96da-cbab3b63eefe")
    Object visitExecutionSpecification(ExecutionSpecification obj);

    @objid ("cedd840c-9f8b-4150-8ad2-b66ec4f3633f")
    Object visitGate(Gate obj);

    @objid ("3d708361-bb78-4404-b0f8-52b045e949c1")
    Object visitGeneralOrdering(GeneralOrdering obj);

    @objid ("8b14662e-7dd1-43f2-96dd-f99ffaaa8e92")
    Object visitInteraction(Interaction obj);

    @objid ("7ad0f3d6-36c8-4d49-9949-7bbb87dbde13")
    Object visitInteractionFragment(InteractionFragment obj);

    @objid ("0f5f3ca6-3e3a-4899-8c61-97d5afcdb333")
    Object visitInteractionOperand(InteractionOperand obj);

    @objid ("f26f9139-ce54-4c19-9c5c-c0d3e25767b1")
    Object visitInteractionUse(InteractionUse obj);

    @objid ("97d251cc-4228-4415-858b-a55ef4cec90a")
    Object visitLifeline(Lifeline obj);

    @objid ("b01a77fb-4a48-4b9f-901f-f1c8dd7aa5c2")
    Object visitMessage(Message obj);

    @objid ("8d82c4c3-a3d8-478c-b35d-bb9961472cac")
    Object visitMessageEnd(MessageEnd obj);

    @objid ("384febdf-f016-4e1c-a247-bc68adff8f1f")
    Object visitOccurrenceSpecification(OccurrenceSpecification obj);

    @objid ("96b1423b-75c7-4db7-a288-86c58e7075b9")
    Object visitPartDecomposition(PartDecomposition obj);

    @objid ("951c088a-20b1-413f-be28-cf4ee338ec52")
    Object visitStateInvariant(StateInvariant obj);

    @objid ("fb6e5852-eb32-48f2-8b19-21eaf59c205f")
    Object visitTerminateSpecification(TerminateSpecification obj);

    @objid ("1a9496dd-fb4a-4760-b181-2d84983b2bb2")
    Object visitAbstractPseudoState(AbstractPseudoState obj);

    @objid ("ce7af0cc-76a6-4959-9a10-768503fadb8d")
    Object visitChoicePseudoState(ChoicePseudoState obj);

    @objid ("5e44d76c-d651-4136-861b-b7e9f0810a03")
    Object visitConnectionPointReference(ConnectionPointReference obj);

    @objid ("32ba7816-4083-4c1a-be44-df25331eac16")
    Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj);

    @objid ("e5cd9ad8-5687-4d1c-88fc-637487b5e683")
    Object visitEntryPointPseudoState(EntryPointPseudoState obj);

    @objid ("5a6b17f2-0cea-41b8-91e7-eb7ccc277948")
    Object visitExitPointPseudoState(ExitPointPseudoState obj);

    @objid ("41dffde0-3b33-4d9e-a98e-9a8a920ed0e3")
    Object visitForkPseudoState(ForkPseudoState obj);

    @objid ("2d843212-9d41-4cb0-9d27-337efa68ec28")
    Object visitInitialPseudoState(InitialPseudoState obj);

    @objid ("d971452c-d3d8-493d-b505-7da90cfd5f84")
    Object visitInternalTransition(InternalTransition obj);

    @objid ("c1981553-c993-4052-a76f-814087a3dd44")
    Object visitJoinPseudoState(JoinPseudoState obj);

    @objid ("7436b817-dbe0-4aed-9c41-d58f0a6897c4")
    Object visitJunctionPseudoState(JunctionPseudoState obj);

    @objid ("18655357-5883-4764-b239-71725439609c")
    Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj);

    @objid ("b93c789f-5d0d-4c8d-ab9d-a77e26b18c54")
    Object visitState(State obj);

    @objid ("66b094ed-0f45-4268-9686-1ba86df29cc6")
    Object visitStateMachine(StateMachine obj);

    @objid ("83461b62-2473-4f92-b25a-62752665f817")
    Object visitStateVertex(StateVertex obj);

    @objid ("78ef0f04-a78e-4072-9bf4-c1442eb86f95")
    Object visitTerminatePseudoState(TerminatePseudoState obj);

    @objid ("15614a0d-5603-456e-8a15-bdeef1fc2a8f")
    Object visitTransition(Transition obj);

    @objid ("6fb19dfa-a755-4251-8a7c-6fed261c15dd")
    Object visitFinalState(FinalState obj);

    @objid ("874c4867-b961-486a-a82c-0f8ae8a832a5")
    Object visitRegion(Region obj);

    @objid ("e463cb0c-1e25-4cb5-ac35-c8c9a82746a8")
    Object visitActor(Actor obj);

    @objid ("4814c4a7-a243-427a-875a-cc1bbae81cbd")
    Object visitUseCase(UseCase obj);

    @objid ("1e191600-7922-4d3d-bf46-94f88f59e7a9")
    Object visitUseCaseDependency(UseCaseDependency obj);

    @objid ("c180edf2-afa2-4a68-b493-154b5680b876")
    Object visitExtensionPoint(ExtensionPoint obj);

    @objid ("36732002-77fc-4723-91e4-752904d1a12e")
    Object visitAnalystItem(AnalystItem obj);

    @objid ("9de12b45-744e-46d0-9830-0abe8663ee69")
    Object visitAnalystElement(AnalystElement obj);

    @objid ("d319b69f-dfd9-48ec-b8ab-16e2d819e131")
    Object visitAnalystContainer(AnalystContainer obj);

    @objid ("7af80d32-026c-4268-93fa-bbaa9b66b018")
    Object visitAnalystProject(AnalystProject obj);

    @objid ("b5b41c91-801b-4e07-8831-188c8f22b6ac")
    Object visitAnalystPropertyTable(AnalystPropertyTable obj);

    @objid ("52af748f-de4c-49ed-bda7-667d014bfc4d")
    Object visitBusinessRule(BusinessRule obj);

    @objid ("c0df0299-d464-49e7-99ea-0698cede4d44")
    Object visitBusinessRuleContainer(BusinessRuleContainer obj);

    @objid ("433da648-2a68-46e6-ae07-302cf2bc2dce")
    Object visitDictionary(Dictionary obj);

    @objid ("2f7f072b-bce9-458b-9f54-378f76af50f6")
    Object visitGoal(Goal obj);

    @objid ("d74d84b2-cc57-49c0-913f-9471e97f6c09")
    Object visitGoalContainer(GoalContainer obj);

    @objid ("1e33308a-0f74-421d-995f-6e74b7e70a24")
    Object visitPropertyContainer(PropertyContainer obj);

    @objid ("686dce0e-da21-4155-8763-6d03a4dd3627")
    Object visitRequirement(Requirement obj);

    @objid ("bc8dc33b-9847-45f1-ad5b-608402f0e2c4")
    Object visitRequirementContainer(RequirementContainer obj);

    @objid ("3719694a-71fd-461e-8d30-474f81f5e539")
    Object visitTerm(Term obj);

    @objid ("4aafc9f2-2276-41fa-ae25-180e5ab3e756")
    Object visitInformationFlow(InformationFlow obj);

    @objid ("0de8926b-6025-444b-ac88-c2a841a20be5")
    Object visitInformationItem(InformationItem obj);

    @objid ("1d53c86f-db86-4826-ab0a-bf2dd1fa41b0")
    Object visitDataFlow(DataFlow obj);

    @objid ("29068c73-49fb-412c-925f-d7b4f59c6786")
    Object visitCommunicationInteraction(CommunicationInteraction obj);

    @objid ("0f6708cc-be82-4317-bf42-b347be08360e")
    Object visitCommunicationNode(CommunicationNode obj);

    @objid ("63d874bd-4874-41ef-8c75-7a621fc21fe4")
    Object visitCommunicationMessage(CommunicationMessage obj);

    @objid ("bf61c1bc-4e60-4cde-95b7-09a86f436ccc")
    Object visitCommunicationChannel(CommunicationChannel obj);

    @objid ("be05a2ac-cdb0-4a93-94d4-59b958e45ab1")
    Object visitBpmnCollaboration(BpmnCollaboration obj);

    @objid ("3d50aa40-f3ce-46b6-b1cf-374f9106be0b")
    Object visitBpmnLane(BpmnLane obj);

    @objid ("0c8ee6de-0e39-4463-a580-7c91cb296157")
    Object visitBpmnLaneSet(BpmnLaneSet obj);

    @objid ("071ad17c-615f-490d-b042-f77f5b434fb6")
    Object visitBpmnParticipant(BpmnParticipant obj);

    @objid ("5e237c71-8cae-4fe1-ac20-d0bd71996239")
    Object visitBpmnProcess(BpmnProcess obj);

    @objid ("cab2130c-3e45-4bac-8acc-1115c756c44c")
    Object visitBpmnAssociation(BpmnAssociation obj);

    @objid ("8eb26dae-ad46-4860-8945-8a47b16a228f")
    Object visitBpmnBaseElement(BpmnBaseElement obj);

    @objid ("39f4f537-be48-46ce-b0cd-35b71ee71497")
    Object visitBpmnArtifact(BpmnArtifact obj);

    @objid ("5087d362-c9df-4ea7-9659-14193f98dd02")
    Object visitBpmnFlowElement(BpmnFlowElement obj);

    @objid ("0d6e2973-f36f-4ee4-be79-286877eba8ff")
    Object visitBpmnFlowNode(BpmnFlowNode obj);

    @objid ("c6146e42-1309-44cb-8467-ad25a9404660")
    Object visitBpmnGroup(BpmnGroup obj);

    @objid ("9587ef25-5cf2-456c-a3ca-809c85ed43f9")
    Object visitBpmnRootElement(BpmnRootElement obj);

    @objid ("fa19df9b-aab0-4a70-a19d-2e4b8ec968b9")
    Object visitBpmnBehavior(BpmnBehavior obj);

    @objid ("5b6591e6-1f2e-4582-830a-859a63fd21c7")
    Object visitBpmnMessage(BpmnMessage obj);

    @objid ("b4986147-6f58-4e44-96c1-19fc62d58a2f")
    Object visitBpmnMessageFlow(BpmnMessageFlow obj);

    @objid ("24f37ee4-504c-4e93-ba85-64f55efbae00")
    Object visitBpmnSequenceFlow(BpmnSequenceFlow obj);

    @objid ("66b83020-ba38-4738-a0f7-3553a82f98f1")
    Object visitBpmnActivity(BpmnActivity obj);

    @objid ("e38f3070-5b2d-4c3b-b3e6-99dbd196ac95")
    Object visitBpmnAdHocSubProcess(BpmnAdHocSubProcess obj);

    @objid ("6fdf7c56-5b61-47b8-b8a5-96eae3663857")
    Object visitBpmnBusinessRuleTask(BpmnBusinessRuleTask obj);

    @objid ("ea4aec44-11a5-4695-819b-ff9719f2eb64")
    Object visitBpmnCallActivity(BpmnCallActivity obj);

    @objid ("3fe6033f-9ce3-4ec2-880c-8b19fed07289")
    Object visitBpmnComplexBehaviorDefinition(BpmnComplexBehaviorDefinition obj);

    @objid ("51a65936-1259-4af2-b09d-416d0ef6b236")
    Object visitBpmnLoopCharacteristics(BpmnLoopCharacteristics obj);

    @objid ("2b2d78fc-d809-4b5c-8078-b028f3d0121f")
    Object visitBpmnManualTask(BpmnManualTask obj);

    @objid ("803264af-d404-4862-a7b2-3ee8a88ce866")
    Object visitBpmnMultiInstanceLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics obj);

    @objid ("59db3594-baf1-49cc-b89e-361c2464118e")
    Object visitBpmnReceiveTask(BpmnReceiveTask obj);

    @objid ("c851a3fa-2893-4f4c-93ea-9d0c74cfcbc7")
    Object visitBpmnScriptTask(BpmnScriptTask obj);

    @objid ("bc21a35c-52bf-42da-866c-13caf4bfa3cf")
    Object visitBpmnSendTask(BpmnSendTask obj);

    @objid ("fd7a7f2f-4c51-43bb-b710-85f3e548d435")
    Object visitBpmnServiceTask(BpmnServiceTask obj);

    @objid ("26a42118-c89c-4c81-bd6f-25593555f8b6")
    Object visitBpmnStandardLoopCharacteristics(BpmnStandardLoopCharacteristics obj);

    @objid ("5d841743-9be6-4c2b-addf-bb056b1ce93a")
    Object visitBpmnSubProcess(BpmnSubProcess obj);

    @objid ("a78d595f-4b39-4153-a50a-5483da96b229")
    Object visitBpmnTask(BpmnTask obj);

    @objid ("1a96d1a2-f8ed-42f0-bc6e-b485a48bc047")
    Object visitBpmnTransaction(BpmnTransaction obj);

    @objid ("a64062ce-c90f-402e-9340-5eab294988fc")
    Object visitBpmnUserTask(BpmnUserTask obj);

    @objid ("4cbd8b4b-cb6b-4ceb-91ca-e10d01ceac65")
    Object visitBpmnBoundaryEvent(BpmnBoundaryEvent obj);

    @objid ("dce489ce-e608-490e-810a-4327a65fa130")
    Object visitBpmnCancelEventDefinition(BpmnCancelEventDefinition obj);

    @objid ("21fd2e02-f39c-41f3-a3f3-574ead3484df")
    Object visitBpmnCatchEvent(BpmnCatchEvent obj);

    @objid ("039049b2-788e-4566-bc3c-738bcdc75f8d")
    Object visitBpmnCompensateEventDefinition(BpmnCompensateEventDefinition obj);

    @objid ("be560ea7-4c91-4ad5-9369-a3e65ebeef80")
    Object visitBpmnConditionalEventDefinition(BpmnConditionalEventDefinition obj);

    @objid ("baa0a07d-a4cf-4254-878a-61cad767976a")
    Object visitBpmnEndEvent(BpmnEndEvent obj);

    @objid ("6c3b3396-4d7b-4e28-a81d-cce3a91abddc")
    Object visitBpmnErrorEventDefinition(BpmnErrorEventDefinition obj);

    @objid ("fa4efaf0-de5e-40fd-b0ca-e6840cfe30a1")
    Object visitBpmnEscalationEventDefinition(BpmnEscalationEventDefinition obj);

    @objid ("ac52beac-43c7-436f-b9a4-ae133a40a7ae")
    Object visitBpmnEvent(BpmnEvent obj);

    @objid ("ceb2eb98-a22e-4dca-9fd4-d342d5d81745")
    Object visitBpmnEventDefinition(BpmnEventDefinition obj);

    @objid ("f5cd3309-32b4-4287-a111-97871a2a8b9f")
    Object visitBpmnImplicitThrowEvent(BpmnImplicitThrowEvent obj);

    @objid ("5810ff3c-996f-422e-b037-c227fa23640d")
    Object visitBpmnIntermediateCatchEvent(BpmnIntermediateCatchEvent obj);

    @objid ("9af2c49d-62ab-4bc9-b691-e62449d76334")
    Object visitBpmnIntermediateThrowEvent(BpmnIntermediateThrowEvent obj);

    @objid ("1ad54508-df68-45b4-8218-bc166ee3f3b7")
    Object visitBpmnLinkEventDefinition(BpmnLinkEventDefinition obj);

    @objid ("7a03769f-b6e8-4768-ad7c-f9121e73085b")
    Object visitBpmnMessageEventDefinition(BpmnMessageEventDefinition obj);

    @objid ("490e86bc-e98a-499c-8047-1a3e1ed52ca0")
    Object visitBpmnSignalEventDefinition(BpmnSignalEventDefinition obj);

    @objid ("81dc72e3-3458-49fd-9915-8919d78f6613")
    Object visitBpmnStartEvent(BpmnStartEvent obj);

    @objid ("b430ff5c-9269-4ee1-8ef0-895d44868d4a")
    Object visitBpmnTerminateEventDefinition(BpmnTerminateEventDefinition obj);

    @objid ("6e2c1828-dbc9-43cf-9b39-87952517aeed")
    Object visitBpmnThrowEvent(BpmnThrowEvent obj);

    @objid ("83b3c77a-ab2a-423a-a4c1-a332e197cdce")
    Object visitBpmnTimerEventDefinition(BpmnTimerEventDefinition obj);

    @objid ("7197f119-f5ef-4154-8dbf-c2a130643e0b")
    Object visitBpmnComplexGateway(BpmnComplexGateway obj);

    @objid ("d48e2c2e-d2a1-4388-ba6e-e84da0ea39bb")
    Object visitBpmnEventBasedGateway(BpmnEventBasedGateway obj);

    @objid ("024cda8c-9a1d-48c8-b635-9f299ee9e93c")
    Object visitBpmnExclusiveGateway(BpmnExclusiveGateway obj);

    @objid ("3e08ebb2-46df-453d-8fa2-020e83988bb8")
    Object visitBpmnGateway(BpmnGateway obj);

    @objid ("d8846d06-a9e9-4757-a7ca-491ddd4b865f")
    Object visitBpmnInclusiveGateway(BpmnInclusiveGateway obj);

    @objid ("54d7b6ac-871e-4682-a955-4a818cea2bbf")
    Object visitBpmnParallelGateway(BpmnParallelGateway obj);

    @objid ("531d07c4-09fd-44e4-92db-3565034a4414")
    Object visitBpmnDataObject(BpmnDataObject obj);

    @objid ("c7263da3-64be-43d4-92ec-8007444a5120")
    Object visitBpmnDataStore(BpmnDataStore obj);

    @objid ("dfd5aaaf-8503-404f-a3e1-5f79798f8d29")
    Object visitBpmnDataAssociation(BpmnDataAssociation obj);

    @objid ("2380d38a-b026-417a-aa44-b2a7a936898b")
    Object visitBpmnSequenceFlowDataAssociation(BpmnSequenceFlowDataAssociation obj);

    @objid ("722fa5a8-ea8d-443c-9876-8bc25e08b257")
    Object visitBpmnDataOutput(BpmnDataOutput obj);

    @objid ("3447d442-6517-4808-a9be-ea72ff8a9c7c")
    Object visitBpmnDataInput(BpmnDataInput obj);

    @objid ("5f701683-7f9f-4194-bcd7-67965c59fa23")
    Object visitBpmnItemAwareElement(BpmnItemAwareElement obj);

    @objid ("f79f2560-03a5-4d76-b163-e3f7b39fab1a")
    Object visitBpmnItemDefinition(BpmnItemDefinition obj);

    @objid ("b3373a09-71e4-41d8-8418-df065391dacd")
    Object visitBpmnDataState(BpmnDataState obj);

    @objid ("b2b7f378-0ec9-4136-bece-bfed3e676421")
    Object visitBpmnResource(BpmnResource obj);

    @objid ("ddd38a02-e511-4463-a069-f33ba64a2535")
    Object visitBpmnResourceParameter(BpmnResourceParameter obj);

    @objid ("1d2e0aa3-d9a1-409b-8114-0d82380bb1b7")
    Object visitBpmnResourceRole(BpmnResourceRole obj);

    @objid ("e5fd5cb1-124a-46ad-af44-697c2238bd84")
    Object visitBpmnResourceParameterBinding(BpmnResourceParameterBinding obj);

    @objid ("5e7ac77e-09a3-4451-ac9a-ff67f1849bce")
    Object visitBpmnOperation(BpmnOperation obj);

    @objid ("1ce0cbad-c4d8-4b06-b4f1-a3a7db3284ef")
    Object visitBpmnInterface(BpmnInterface obj);

    @objid ("b8772167-b5a3-40dc-a940-9ca9b7805b06")
    Object visitBpmnEndPoint(BpmnEndPoint obj);

    @objid ("bee8beb0-ed5a-4f7b-9831-827aaec30654")
    Object visitAbstractDiagram(AbstractDiagram obj);

    @objid ("92918a80-30ef-4880-a5ee-8b48cee723cb")
    Object visitActivityDiagram(ActivityDiagram obj);

    @objid ("0f08eded-a40d-4b3f-aad1-374ddb9bc238")
    Object visitBehaviorDiagram(BehaviorDiagram obj);

    @objid ("4910ae9d-2eac-4f19-8c02-25dd4d024017")
    Object visitClassDiagram(ClassDiagram obj);

    @objid ("1d4642ae-97c1-4e97-b392-4034fbd94d3a")
    Object visitCommunicationDiagram(CommunicationDiagram obj);

    @objid ("6847ea21-3aa8-48a9-b309-3c5fac555b58")
    Object visitDeploymentDiagram(DeploymentDiagram obj);

    @objid ("8aafe3ea-4d83-4ee9-97ba-5d3ef6de2f87")
    Object visitDiagramSet(DiagramSet obj);

    @objid ("3543c3e6-8f89-4270-b9c9-e4ed9016d323")
    Object visitSequenceDiagram(SequenceDiagram obj);

    @objid ("8926c93b-a209-47f9-bc44-92c06d5fecbd")
    Object visitStateMachineDiagram(StateMachineDiagram obj);

    @objid ("f8608f3d-60e9-425e-8b4b-40a541bf1e2e")
    Object visitStaticDiagram(StaticDiagram obj);

    @objid ("c1bc5154-ab3a-499a-84ee-213e14b1a30a")
    Object visitUseCaseDiagram(UseCaseDiagram obj);

    @objid ("e265253c-552c-42d0-9773-c25b52c510e2")
    Object visitObjectDiagram(ObjectDiagram obj);

    @objid ("9882a3f7-4c0a-4889-b2d7-b59870b35b8e")
    Object visitCompositeStructureDiagram(CompositeStructureDiagram obj);

    @objid ("3476f05d-09fd-48e4-a334-a48803ced70e")
    Object visitBpmnProcessCollaborationDiagram(BpmnProcessCollaborationDiagram obj);

    @objid ("0f0f8ea7-510a-4706-9713-057fcb8c9ca7")
    Object visitBpmnSubProcessDiagram(BpmnSubProcessDiagram obj);

    @objid ("4a18e096-f719-4bf0-9539-e21520e65ad4")
    Object visitModuleParameter(ModuleParameter obj);

    @objid ("7712932a-5945-46b6-9fff-2c1afd95c98d")
    Object visitModuleComponent(ModuleComponent obj);

    @objid ("2e1da980-fb23-468a-ac1d-6f3c2370d0a0")
    Object visitProject(Project obj);

}
