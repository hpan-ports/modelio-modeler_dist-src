# imports of api
from org.modelio.api.app import IModelioContext
from org.modelio.api.app.navigation import INavigationListener
from org.modelio.api.app.navigation import INavigationService
from org.modelio.api.app.picking import IPickingService
from org.modelio.api.app.picking import IPickingProvider
from org.modelio.api.app.picking import IPickingClient
from org.modelio.api.app.picking import IPickingSession
from org.modelio.api.audit import IAuditService
from org.modelio.api.astyle import AStyle
from org.modelio.api.astyle import AStyleInterface
from org.modelio.api.diagram import IDiagramGraphic
from org.modelio.api.diagram import IDiagramLink
from org.modelio.api.diagram import IDiagramNode
from org.modelio.api.diagram import ILinkPath
from org.modelio.api.diagram import ContributorCategory
from org.modelio.api.diagram import InvalidDestinationPointException
from org.modelio.api.diagram import InvalidPointsPathException
from org.modelio.api.diagram import InvalidSourcePointException
from org.modelio.api.diagram.autodiagram import IAutoDiagramFactory
from org.modelio.api.diagram.autodiagram import IDiagramCreator
from org.modelio.api.diagram.dg import IDiagramDG
from org.modelio.api.diagram import IDiagramHandle
from org.modelio.api.diagram import IDiagramCustomizer
from org.modelio.api.diagram import IDiagramService
from org.modelio.api.diagram.tools import DefaultAttachedBoxCommand
from org.modelio.api.diagram.tools import DefaultBoxCommand
from org.modelio.api.diagram.tools import DefaultLinkCommand
from org.modelio.api.diagram.tools import DefaultMultiLinkCommand
from org.modelio.api.diagram.tools import IAttachedBoxCommand
from org.modelio.api.diagram.tools import IBoxCommand
from org.modelio.api.diagram.tools import IDiagramCommand
from org.modelio.api.diagram.tools import ILinkCommand
from org.modelio.api.diagram.tools import IMultiLinkCommand
from org.modelio.api.diagram.style import IStyleHandle
from org.modelio.api.editor import IEditionService
from org.modelio.api.editor import IMDATextEditor
from org.modelio.api.editor import IMDAEditorListener
from org.modelio.api.editor import EditorType
from org.modelio.api import Messages
from org.modelio.api.exchange import IExchangeService
from org.modelio.api.exchange import XmiException
from org.modelio.api.exchange import XmiExportConfiguration
from org.modelio.api.exchange import XmiImportConfiguration
from org.modelio.api.log import ILogService
from org.modelio.api.mc import DefaultModelComponentContributor
from org.modelio.api.mc import IModelComponentDescriptor
from org.modelio.api.mc import IModelComponentService
from org.modelio.api.mc import AbstractModelComponentContributor
from org.modelio.api.meta import IMetamodelService
from org.modelio.api.model import IAnalystModel
from org.modelio.api.model import IDefaultNameService
from org.modelio.api.model import IImageService
from org.modelio.api.model import IMetamodelExtensions
from org.modelio.api.model import IModelManipulationService
from org.modelio.api.model import IModelingSession
from org.modelio.api.model import ITransaction
from org.modelio.api.model import IUMLTypes
from org.modelio.api.model import IUmlModel
from org.modelio.api.model import InvalidPathException
from org.modelio.api.model import InvalidTransactionException
from org.modelio.api.model import InvalidUuidException
from org.modelio.api.model.change import IElementDeletedEvent
from org.modelio.api.model.change import IElementMovedEvent
from org.modelio.api.model.change import IModelChangeEvent
from org.modelio.api.model.change import IModelChangeHandler
from org.modelio.api.model.change import IModelChangeListener
from org.modelio.api.model.change import IStatusChangeEvent
from org.modelio.api.model.change import IStatusChangeHandler
from org.modelio.api.model.change import IStatusChangeListener
from org.modelio.api.modelio import Modelio
from org.modelio.api.module import AbstractJavaModule
from org.modelio.api.module import DefaultModuleSession
from org.modelio.api.module import IModuleDescriptor
from org.modelio.api.module import IModuleSession
from org.modelio.api.module import IParameterEditionModel
from org.modelio.api.module import IParameterGroupModel
from org.modelio.api.module import IParameterModel
from org.modelio.api.module import ModuleException
from org.modelio.api.module import ModuleState
from org.modelio.api.module import UnknownModuleException
from org.modelio.api.module import UnknownModuleParameterException
from org.modelio.api.module.contrib import ModuleActionDelegatingHandler
from org.modelio.api.module.paramEdition import BoolParameterModel
from org.modelio.api.module.paramEdition import ColorParameterModel
from org.modelio.api.module.paramEdition import DefaultParametersEditionModel
from org.modelio.api.module.paramEdition import DirectoryParameterModel
from org.modelio.api.module.paramEdition import EnumParameterModel
from org.modelio.api.module.paramEdition import FileParameterModel
from org.modelio.api.module.paramEdition import IntParameterModel
from org.modelio.api.module.paramEdition import ModuleParameterType
from org.modelio.api.module.paramEdition import ParameterGroupModel
from org.modelio.api.module.paramEdition import ParameterModel
from org.modelio.api.module.paramEdition import ParametersEditionModel
from org.modelio.api.module.paramEdition import PasswordParameterModel
from org.modelio.api.module.paramEdition import StringParameterModel
from org.modelio.api.module import IModulePropertyView
from org.modelio.api.module import IModulePropertyModel
from org.modelio.api.module import IModule
from org.modelio.api.module.propertiesPage import AbstractModulePropertyPage
from org.modelio.api.module.propertiesPage import IModulePropertyPage
from org.modelio.api.module.propertiesPage import IModulePropertyTable
from org.modelio.api.module.commands import ActionLocation
from org.modelio.api.module.commands import DefaultModuleAction
from org.modelio.api.module.commands import DefaultModuleContextualCommand
from org.modelio.api.module.commands import IModuleAction
from org.modelio.api.module.commands import IModuleContextualCommand
from org.modelio.api.module.script import IScriptService
from org.modelio.api.module import IConfigParamValidator
from org.modelio.api.module import IModuleAPIConfiguration
from org.modelio.api.module import IModuleUserConfiguration
from org.modelio.api.module import IModuleService
from org.modelio.api.module import IPeerModule
from org.modelio.api.module.diagrams import DiagramCustomizationDescriptor
from org.modelio.api.module.diagrams import DiagramToolDescriptor
from org.modelio.api.module import ILicenseInfos
from org.modelio.api.module import LicenseInfos
from org.modelio.api.ui import IModelioDialog
from org.modelio.api.ui import ModelioDialog
from org.modelio.api.ui import ModelioWizardDialog
from org.modelio.api.ui import UIColor
from org.modelio.api.ui import UIFont
from org.modelio.api.ui.diagramcreation import IDiagramWizardContributor
from org.modelio.api.ui.dnd import IEditorDropClient
from org.modelio.api.ui.dnd import EditorDropListener
from org.modelio.api.ui.dnd import ModelElementTransfer
from org.modelio.api.ui.text import IElementChangeListener
from org.modelio.api.ui.text import IElementFilter
from org.modelio.api.ui.text import ResultsProposalPopup
from org.modelio.api.ui.text import TextWrapperForIElement
# imports of emfapi
from org.modelio.metamodel import Metamodel
from org.modelio.metamodel.analyst import Dictionary
from org.modelio.metamodel.analyst import AnalystProject
from org.modelio.metamodel.analyst import Term
from org.modelio.metamodel.analyst import PropertyContainer
from org.modelio.metamodel.analyst import AnalystPropertyTable
from org.modelio.metamodel.analyst import BusinessRule
from org.modelio.metamodel.analyst import BusinessRuleContainer
from org.modelio.metamodel.analyst import Goal
from org.modelio.metamodel.analyst import GoalContainer
from org.modelio.metamodel.analyst import Requirement
from org.modelio.metamodel.analyst import RequirementContainer
from org.modelio.metamodel.analyst import AnalystItem
from org.modelio.metamodel.analyst import AnalystElement
from org.modelio.metamodel.analyst import AnalystContainer
from org.modelio.metamodel.bpmn.processCollaboration import BpmnProcessType
from org.modelio.metamodel.bpmn.processCollaboration import OptionalBoolean
from org.modelio.metamodel.bpmn.processCollaboration import BpmnCollaboration
from org.modelio.metamodel.bpmn.processCollaboration import BpmnLane
from org.modelio.metamodel.bpmn.processCollaboration import BpmnLaneSet
from org.modelio.metamodel.bpmn.processCollaboration import BpmnParticipant
from org.modelio.metamodel.bpmn.processCollaboration import BpmnProcess
from org.modelio.metamodel.bpmn.rootElements import BpmnAssociationDirection
from org.modelio.metamodel.bpmn.rootElements import BpmnAssociation
from org.modelio.metamodel.bpmn.rootElements import BpmnBaseElement
from org.modelio.metamodel.bpmn.rootElements import BpmnArtifact
from org.modelio.metamodel.bpmn.rootElements import BpmnFlowElement
from org.modelio.metamodel.bpmn.rootElements import BpmnFlowNode
from org.modelio.metamodel.bpmn.rootElements import BpmnGroup
from org.modelio.metamodel.bpmn.rootElements import BpmnRootElement
from org.modelio.metamodel.bpmn.rootElements import BpmnBehavior
from org.modelio.metamodel.bpmn.flows import BpmnMessage
from org.modelio.metamodel.bpmn.flows import BpmnMessageFlow
from org.modelio.metamodel.bpmn.flows import BpmnSequenceFlow
from org.modelio.metamodel.bpmn.activities import AdHocOrdering
from org.modelio.metamodel.bpmn.activities import MultiInstanceBehavior
from org.modelio.metamodel.bpmn.activities import TransactionMethod
from org.modelio.metamodel.bpmn.activities import BpmnActivity
from org.modelio.metamodel.bpmn.activities import BpmnAdHocSubProcess
from org.modelio.metamodel.bpmn.activities import BpmnBusinessRuleTask
from org.modelio.metamodel.bpmn.activities import BpmnCallActivity
from org.modelio.metamodel.bpmn.activities import BpmnComplexBehaviorDefinition
from org.modelio.metamodel.bpmn.activities import BpmnLoopCharacteristics
from org.modelio.metamodel.bpmn.activities import BpmnManualTask
from org.modelio.metamodel.bpmn.activities import BpmnMultiInstanceLoopCharacteristics
from org.modelio.metamodel.bpmn.activities import BpmnReceiveTask
from org.modelio.metamodel.bpmn.activities import BpmnScriptTask
from org.modelio.metamodel.bpmn.activities import BpmnSendTask
from org.modelio.metamodel.bpmn.activities import BpmnServiceTask
from org.modelio.metamodel.bpmn.activities import BpmnStandardLoopCharacteristics
from org.modelio.metamodel.bpmn.activities import BpmnSubProcess
from org.modelio.metamodel.bpmn.activities import BpmnTask
from org.modelio.metamodel.bpmn.activities import BpmnTransaction
from org.modelio.metamodel.bpmn.activities import BpmnUserTask
from org.modelio.metamodel.bpmn.events import BpmnBoundaryEvent
from org.modelio.metamodel.bpmn.events import BpmnCancelEventDefinition
from org.modelio.metamodel.bpmn.events import BpmnCatchEvent
from org.modelio.metamodel.bpmn.events import BpmnCompensateEventDefinition
from org.modelio.metamodel.bpmn.events import BpmnConditionalEventDefinition
from org.modelio.metamodel.bpmn.events import BpmnEndEvent
from org.modelio.metamodel.bpmn.events import BpmnErrorEventDefinition
from org.modelio.metamodel.bpmn.events import BpmnEscalationEventDefinition
from org.modelio.metamodel.bpmn.events import BpmnEvent
from org.modelio.metamodel.bpmn.events import BpmnEventDefinition
from org.modelio.metamodel.bpmn.events import BpmnImplicitThrowEvent
from org.modelio.metamodel.bpmn.events import BpmnIntermediateCatchEvent
from org.modelio.metamodel.bpmn.events import BpmnIntermediateThrowEvent
from org.modelio.metamodel.bpmn.events import BpmnLinkEventDefinition
from org.modelio.metamodel.bpmn.events import BpmnMessageEventDefinition
from org.modelio.metamodel.bpmn.events import BpmnSignalEventDefinition
from org.modelio.metamodel.bpmn.events import BpmnStartEvent
from org.modelio.metamodel.bpmn.events import BpmnTerminateEventDefinition
from org.modelio.metamodel.bpmn.events import BpmnThrowEvent
from org.modelio.metamodel.bpmn.events import BpmnTimerEventDefinition
from org.modelio.metamodel.bpmn.gateways import BpmnEventBasedGatewayType
from org.modelio.metamodel.bpmn.gateways import BpmnGatewayDirection
from org.modelio.metamodel.bpmn.gateways import BpmnComplexGateway
from org.modelio.metamodel.bpmn.gateways import BpmnEventBasedGateway
from org.modelio.metamodel.bpmn.gateways import BpmnExclusiveGateway
from org.modelio.metamodel.bpmn.gateways import BpmnGateway
from org.modelio.metamodel.bpmn.gateways import BpmnInclusiveGateway
from org.modelio.metamodel.bpmn.gateways import BpmnParallelGateway
from org.modelio.metamodel.bpmn.objects import BpmnItemKind
from org.modelio.metamodel.bpmn.objects import BpmnDataObject
from org.modelio.metamodel.bpmn.objects import BpmnDataStore
from org.modelio.metamodel.bpmn.objects import BpmnDataAssociation
from org.modelio.metamodel.bpmn.objects import BpmnSequenceFlowDataAssociation
from org.modelio.metamodel.bpmn.objects import BpmnDataOutput
from org.modelio.metamodel.bpmn.objects import BpmnDataInput
from org.modelio.metamodel.bpmn.objects import BpmnItemAwareElement
from org.modelio.metamodel.bpmn.objects import BpmnItemDefinition
from org.modelio.metamodel.bpmn.objects import BpmnDataState
from org.modelio.metamodel.bpmn.resources import BpmnResource
from org.modelio.metamodel.bpmn.resources import BpmnResourceParameter
from org.modelio.metamodel.bpmn.resources import BpmnResourceRole
from org.modelio.metamodel.bpmn.resources import BpmnResourceParameterBinding
from org.modelio.metamodel.bpmn.bpmnDiagrams import BpmnProcessCollaborationDiagram
from org.modelio.metamodel.bpmn.bpmnDiagrams import BpmnSubProcessDiagram
from org.modelio.metamodel.bpmn.bpmnService import BpmnOperation
from org.modelio.metamodel.bpmn.bpmnService import BpmnInterface
from org.modelio.metamodel.bpmn.bpmnService import BpmnEndPoint
from org.modelio.metamodel.diagrams import AbstractDiagram
from org.modelio.metamodel.diagrams import ActivityDiagram
from org.modelio.metamodel.diagrams import BehaviorDiagram
from org.modelio.metamodel.diagrams import ClassDiagram
from org.modelio.metamodel.diagrams import CommunicationDiagram
from org.modelio.metamodel.diagrams import DeploymentDiagram
from org.modelio.metamodel.diagrams import DiagramSet
from org.modelio.metamodel.diagrams import SequenceDiagram
from org.modelio.metamodel.diagrams import StateMachineDiagram
from org.modelio.metamodel.diagrams import StaticDiagram
from org.modelio.metamodel.diagrams import UseCaseDiagram
from org.modelio.metamodel.diagrams import ObjectDiagram
from org.modelio.metamodel.diagrams import CompositeStructureDiagram
from org.modelio.metamodel.experts.meta import IMetaTool
from org.modelio.metamodel.experts.meta import MetaTool
from org.modelio.metamodel.experts.meta import IMetaExpert
from org.modelio.metamodel.experts.meta.impl import DefaultMetaExpert
from org.modelio.metamodel.experts.links import ILinkTool
from org.modelio.metamodel.experts.links import LinkTool
from org.modelio.metamodel.experts.links import ILinkExpert
from org.modelio.metamodel.experts.links.impl import BindingCreationExpert
from org.modelio.metamodel.experts.links.impl import BpmnDataAssociationCreationExpert
from org.modelio.metamodel.experts.links.impl import BpmnMessageFlowCreationExpert
from org.modelio.metamodel.experts.links.impl import BpmnSequenceFlowCreationExpert
from org.modelio.metamodel.experts.links.impl import ClassAssociationCreationExpert
from org.modelio.metamodel.experts.links.impl import TemplateBindingCreationExpert
from org.modelio.metamodel.experts.links.impl import DefaultLinkExpert
from org.modelio.metamodel.experts.links.impl import SatisfyCreationExpert
from org.modelio.metamodel.experts.links.impl import DeriveCreationExpert
from org.modelio.metamodel.experts.links.impl import MeasureCreationExpert
from org.modelio.metamodel.experts.links.impl import GuaranteeCreationExpert
from org.modelio.metamodel.experts.links.impl import AntonymCreationExpert
from org.modelio.metamodel.experts.links.impl import RelatedCreationExpert
from org.modelio.metamodel.experts.links.impl import AssignedCreationExpert
from org.modelio.metamodel.experts.links.impl import ContextCreationExpert
from org.modelio.metamodel.experts.links.impl import SynonymCreationExpert
from org.modelio.metamodel.experts.links.impl import RefersCreationExpert
from org.modelio.metamodel.experts.links.impl import VerifyCreationExpert
from org.modelio.metamodel.experts.links.impl import NegativeInfluenceCreationExpert
from org.modelio.metamodel.experts.links.impl import PositiveInfluenceCreationExpert
from org.modelio.metamodel.experts.links.impl import ImplementCreationExpert
from org.modelio.metamodel.experts.links.impl import RefineCreationExpert
from org.modelio.metamodel.experts.links.impl import PartCreationExpert
from org.modelio.metamodel.experts.links.impl import KindOfCreationExpert
from org.modelio.metamodel.experts.links.impl import HomonymCreationExpert
from org.modelio.metamodel.mda import ModuleState
from org.modelio.metamodel.mda import ModuleParameterType
from org.modelio.metamodel.mda import ModuleParameter
from org.modelio.metamodel.mda import ModuleComponent
from org.modelio.metamodel.mda import Project
from org.modelio.metamodel.uml.infrastructure import Abstraction
from org.modelio.metamodel.uml.infrastructure import Constraint
from org.modelio.metamodel.uml.infrastructure import Dependency
from org.modelio.metamodel.uml.infrastructure import Element
from org.modelio.metamodel.uml.infrastructure import ModelElement
from org.modelio.metamodel.uml.infrastructure import ModelTree
from org.modelio.metamodel.uml.infrastructure import Note
from org.modelio.metamodel.uml.infrastructure import NoteType
from org.modelio.metamodel.uml.infrastructure import Profile
from org.modelio.metamodel.uml.infrastructure import Stereotype
from org.modelio.metamodel.uml.infrastructure import Substitution
from org.modelio.metamodel.uml.infrastructure import TagParameter
from org.modelio.metamodel.uml.infrastructure import TagType
from org.modelio.metamodel.uml.infrastructure import TaggedValue
from org.modelio.metamodel.uml.infrastructure import Usage
from org.modelio.metamodel.uml.infrastructure import MetaclassReference
from org.modelio.metamodel.uml.infrastructure import ExternDocument
from org.modelio.metamodel.uml.infrastructure import ExternDocumentType
from org.modelio.metamodel.uml.infrastructure.properties import PropertyDefinition
from org.modelio.metamodel.uml.infrastructure.properties import PropertyTableDefinition
from org.modelio.metamodel.uml.infrastructure.properties import PropertyTable
from org.modelio.metamodel.uml.infrastructure.properties import TypedPropertyTable
from org.modelio.metamodel.uml.infrastructure.properties import LocalPropertyTable
from org.modelio.metamodel.uml.infrastructure.properties import PropertyType
from org.modelio.metamodel.uml.infrastructure.properties import EnumeratedPropertyType
from org.modelio.metamodel.uml.infrastructure.properties import PropertyEnumerationLitteral
from org.modelio.metamodel.uml.infrastructure.properties import PropertyBaseType
from org.modelio.metamodel.uml.infrastructure.matrix import MatrixDefinition
from org.modelio.metamodel.uml.infrastructure.matrix import QueryDefinition
from org.modelio.metamodel.uml.infrastructure.matrix import MatrixValueDefinition
from org.modelio.metamodel.uml.infrastructure import ExternProcessor
from org.modelio.metamodel.uml.statik import AggregationKind
from org.modelio.metamodel.uml.statik import KindOfAccess
from org.modelio.metamodel.uml.statik import MethodPassingMode
from org.modelio.metamodel.uml.statik import PassingMode
from org.modelio.metamodel.uml.statik import VisibilityMode
from org.modelio.metamodel.uml.statik import Artifact
from org.modelio.metamodel.uml.statik import AssociationEnd
from org.modelio.metamodel.uml.statik import Attribute
from org.modelio.metamodel.uml.statik import AttributeLink
from org.modelio.metamodel.uml.statik import BindableInstance
from org.modelio.metamodel.uml.statik import Binding
from org.modelio.metamodel.uml.statik import Class
from org.modelio.metamodel.uml.statik import ClassAssociation
from org.modelio.metamodel.uml.statik import Classifier
from org.modelio.metamodel.uml.statik import Collaboration
from org.modelio.metamodel.uml.statik import CollaborationUse
from org.modelio.metamodel.uml.statik import Component
from org.modelio.metamodel.uml.statik import NaryConnector
from org.modelio.metamodel.uml.statik import ConnectorEnd
from org.modelio.metamodel.uml.statik import DataType
from org.modelio.metamodel.uml.statik import ElementImport
from org.modelio.metamodel.uml.statik import ElementRealization
from org.modelio.metamodel.uml.statik import Enumeration
from org.modelio.metamodel.uml.statik import EnumerationLiteral
from org.modelio.metamodel.uml.statik import Feature
from org.modelio.metamodel.uml.statik import GeneralClass
from org.modelio.metamodel.uml.statik import Generalization
from org.modelio.metamodel.uml.statik import Instance
from org.modelio.metamodel.uml.statik import Interface
from org.modelio.metamodel.uml.statik import InterfaceRealization
from org.modelio.metamodel.uml.statik import LinkEnd
from org.modelio.metamodel.uml.statik import Manifestation
from org.modelio.metamodel.uml.statik import NameSpace
from org.modelio.metamodel.uml.statik import NamespaceUse
from org.modelio.metamodel.uml.statik import Node
from org.modelio.metamodel.uml.statik import Operation
from org.modelio.metamodel.uml.statik import Package
from org.modelio.metamodel.uml.statik import PackageImport
from org.modelio.metamodel.uml.statik import PackageMerge
from org.modelio.metamodel.uml.statik import Parameter
from org.modelio.metamodel.uml.statik import Port
from org.modelio.metamodel.uml.statik import ProvidedInterface
from org.modelio.metamodel.uml.statik import RaisedException
from org.modelio.metamodel.uml.statik import RequiredInterface
from org.modelio.metamodel.uml.statik import TemplateBinding
from org.modelio.metamodel.uml.statik import TemplateParameter
from org.modelio.metamodel.uml.statik import TemplateParameterSubstitution
from org.modelio.metamodel.uml.statik import StructuralFeature
from org.modelio.metamodel.uml.statik import BehavioralFeature
from org.modelio.metamodel.uml.statik import NaryAssociationEnd
from org.modelio.metamodel.uml.statik import NaryAssociation
from org.modelio.metamodel.uml.statik import NaryLink
from org.modelio.metamodel.uml.statik import PortOrientation
from org.modelio.metamodel.uml.statik import NaryLinkEnd
from org.modelio.metamodel.uml.statik import NaryConnectorEnd
from org.modelio.metamodel.uml.statik import Association
from org.modelio.metamodel.uml.statik import Link
from org.modelio.metamodel.uml.statik import Connector
from org.modelio.metamodel.uml.statik import Navigability
from org.modelio.metamodel.uml.behavior.activityModel import DecisionNodeKind
from org.modelio.metamodel.uml.behavior.activityModel import ExpansionKind
from org.modelio.metamodel.uml.behavior.activityModel import ObjectFlowEffectKind
from org.modelio.metamodel.uml.behavior.activityModel import ObjectNodeOrderingKind
from org.modelio.metamodel.uml.behavior.activityModel import PinPassingMode
from org.modelio.metamodel.uml.behavior.activityModel import AcceptCallEventAction
from org.modelio.metamodel.uml.behavior.activityModel import AcceptChangeEventAction
from org.modelio.metamodel.uml.behavior.activityModel import AcceptSignalAction
from org.modelio.metamodel.uml.behavior.activityModel import AcceptTimeEventAction
from org.modelio.metamodel.uml.behavior.activityModel import Activity
from org.modelio.metamodel.uml.behavior.activityModel import ActivityAction
from org.modelio.metamodel.uml.behavior.activityModel import ActivityEdge
from org.modelio.metamodel.uml.behavior.activityModel import ActivityFinalNode
from org.modelio.metamodel.uml.behavior.activityModel import ActivityGroup
from org.modelio.metamodel.uml.behavior.activityModel import ActivityNode
from org.modelio.metamodel.uml.behavior.activityModel import ActivityParameterNode
from org.modelio.metamodel.uml.behavior.activityModel import ActivityPartition
from org.modelio.metamodel.uml.behavior.activityModel import CallAction
from org.modelio.metamodel.uml.behavior.activityModel import CallBehaviorAction
from org.modelio.metamodel.uml.behavior.activityModel import CallOperationAction
from org.modelio.metamodel.uml.behavior.activityModel import CentralBufferNode
from org.modelio.metamodel.uml.behavior.activityModel import Clause
from org.modelio.metamodel.uml.behavior.activityModel import ConditionalNode
from org.modelio.metamodel.uml.behavior.activityModel import ControlFlow
from org.modelio.metamodel.uml.behavior.activityModel import ControlNode
from org.modelio.metamodel.uml.behavior.activityModel import DataStoreNode
from org.modelio.metamodel.uml.behavior.activityModel import DecisionMergeNode
from org.modelio.metamodel.uml.behavior.activityModel import ExceptionHandler
from org.modelio.metamodel.uml.behavior.activityModel import ExpansionNode
from org.modelio.metamodel.uml.behavior.activityModel import ExpansionRegion
from org.modelio.metamodel.uml.behavior.activityModel import FinalNode
from org.modelio.metamodel.uml.behavior.activityModel import FlowFinalNode
from org.modelio.metamodel.uml.behavior.activityModel import ForkJoinNode
from org.modelio.metamodel.uml.behavior.activityModel import InitialNode
from org.modelio.metamodel.uml.behavior.activityModel import InputPin
from org.modelio.metamodel.uml.behavior.activityModel import InstanceNode
from org.modelio.metamodel.uml.behavior.activityModel import InterruptibleActivityRegion
from org.modelio.metamodel.uml.behavior.activityModel import LoopNode
from org.modelio.metamodel.uml.behavior.activityModel import MessageFlow
from org.modelio.metamodel.uml.behavior.activityModel import ObjectFlow
from org.modelio.metamodel.uml.behavior.activityModel import ObjectNode
from org.modelio.metamodel.uml.behavior.activityModel import OpaqueAction
from org.modelio.metamodel.uml.behavior.activityModel import OutputPin
from org.modelio.metamodel.uml.behavior.activityModel import Pin
from org.modelio.metamodel.uml.behavior.activityModel import SendSignalAction
from org.modelio.metamodel.uml.behavior.activityModel import StructuredActivityNode
from org.modelio.metamodel.uml.behavior.activityModel import ValuePin
from org.modelio.metamodel.uml.behavior.commonBehaviors import ParameterEffectKind
from org.modelio.metamodel.uml.behavior.commonBehaviors import EventType
from org.modelio.metamodel.uml.behavior.commonBehaviors import Behavior
from org.modelio.metamodel.uml.behavior.commonBehaviors import BehaviorParameter
from org.modelio.metamodel.uml.behavior.commonBehaviors import OpaqueBehavior
from org.modelio.metamodel.uml.behavior.commonBehaviors import Signal
from org.modelio.metamodel.uml.behavior.commonBehaviors import Event
from org.modelio.metamodel.uml.behavior.interactionModel import InteractionOperator
from org.modelio.metamodel.uml.behavior.interactionModel import MessageKind
from org.modelio.metamodel.uml.behavior.interactionModel import MessageSort
from org.modelio.metamodel.uml.behavior.interactionModel import RelativeTime
from org.modelio.metamodel.uml.behavior.interactionModel import CombinedFragment
from org.modelio.metamodel.uml.behavior.interactionModel import DurationConstraint
from org.modelio.metamodel.uml.behavior.interactionModel import ExecutionOccurenceSpecification
from org.modelio.metamodel.uml.behavior.interactionModel import ExecutionSpecification
from org.modelio.metamodel.uml.behavior.interactionModel import Gate
from org.modelio.metamodel.uml.behavior.interactionModel import GeneralOrdering
from org.modelio.metamodel.uml.behavior.interactionModel import Interaction
from org.modelio.metamodel.uml.behavior.interactionModel import InteractionFragment
from org.modelio.metamodel.uml.behavior.interactionModel import InteractionOperand
from org.modelio.metamodel.uml.behavior.interactionModel import InteractionUse
from org.modelio.metamodel.uml.behavior.interactionModel import Lifeline
from org.modelio.metamodel.uml.behavior.interactionModel import Message
from org.modelio.metamodel.uml.behavior.interactionModel import MessageEnd
from org.modelio.metamodel.uml.behavior.interactionModel import OccurrenceSpecification
from org.modelio.metamodel.uml.behavior.interactionModel import PartDecomposition
from org.modelio.metamodel.uml.behavior.interactionModel import StateInvariant
from org.modelio.metamodel.uml.behavior.interactionModel import TerminateSpecification
from org.modelio.metamodel.uml.behavior.stateMachineModel import KindOfControl
from org.modelio.metamodel.uml.behavior.stateMachineModel import KindOfStateMachine
from org.modelio.metamodel.uml.behavior.stateMachineModel import PredefinedEventType
from org.modelio.metamodel.uml.behavior.stateMachineModel import StateKind
from org.modelio.metamodel.uml.behavior.stateMachineModel import AbstractPseudoState
from org.modelio.metamodel.uml.behavior.stateMachineModel import ChoicePseudoState
from org.modelio.metamodel.uml.behavior.stateMachineModel import ConnectionPointReference
from org.modelio.metamodel.uml.behavior.stateMachineModel import DeepHistoryPseudoState
from org.modelio.metamodel.uml.behavior.stateMachineModel import EntryPointPseudoState
from org.modelio.metamodel.uml.behavior.stateMachineModel import ExitPointPseudoState
from org.modelio.metamodel.uml.behavior.stateMachineModel import ForkPseudoState
from org.modelio.metamodel.uml.behavior.stateMachineModel import InitialPseudoState
from org.modelio.metamodel.uml.behavior.stateMachineModel import InternalTransition
from org.modelio.metamodel.uml.behavior.stateMachineModel import JoinPseudoState
from org.modelio.metamodel.uml.behavior.stateMachineModel import JunctionPseudoState
from org.modelio.metamodel.uml.behavior.stateMachineModel import ShallowHistoryPseudoState
from org.modelio.metamodel.uml.behavior.stateMachineModel import State
from org.modelio.metamodel.uml.behavior.stateMachineModel import StateMachine
from org.modelio.metamodel.uml.behavior.stateMachineModel import StateVertex
from org.modelio.metamodel.uml.behavior.stateMachineModel import TerminatePseudoState
from org.modelio.metamodel.uml.behavior.stateMachineModel import Transition
from org.modelio.metamodel.uml.behavior.stateMachineModel import FinalState
from org.modelio.metamodel.uml.behavior.stateMachineModel import Region
from org.modelio.metamodel.uml.behavior.usecaseModel import Actor
from org.modelio.metamodel.uml.behavior.usecaseModel import UseCase
from org.modelio.metamodel.uml.behavior.usecaseModel import UseCaseDependency
from org.modelio.metamodel.uml.behavior.usecaseModel import ExtensionPoint
from org.modelio.metamodel.uml.behavior.communicationModel import CommunicationInteraction
from org.modelio.metamodel.uml.behavior.communicationModel import CommunicationNode
from org.modelio.metamodel.uml.behavior.communicationModel import CommunicationMessage
from org.modelio.metamodel.uml.behavior.communicationModel import CommunicationChannel
from org.modelio.metamodel.uml.informationFlow import InformationFlow
from org.modelio.metamodel.uml.informationFlow import InformationItem
from org.modelio.metamodel.uml.informationFlow import DataFlow
from org.modelio.metamodel.visitors import IModelVisitor
from org.modelio.metamodel.visitors import AbstractModelVisitor
from org.modelio.metamodel.visitors import DefaultModelVisitor
from org.modelio.metamodel.factory import IElementInitializer
from org.modelio.metamodel.factory import IModelFactory
from org.modelio.metamodel.factory import ElementNotUniqueException
from org.modelio.metamodel.factory import ExtensionNotFoundException

