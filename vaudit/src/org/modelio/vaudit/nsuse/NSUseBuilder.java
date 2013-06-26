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
                                    

package org.modelio.vaudit.nsuse;

import java.util.ArrayDeque;
import java.util.Deque;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
import org.modelio.metamodel.uml.behavior.stateMachineModel.TerminatePseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.behavior.usecaseModel.Actor;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.informationFlow.InformationItem;
import org.modelio.metamodel.uml.infrastructure.Abstraction;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternDocument;
import org.modelio.metamodel.uml.infrastructure.ExternDocumentType;
import org.modelio.metamodel.uml.infrastructure.MetaclassReference;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Profile;
import org.modelio.metamodel.uml.infrastructure.Substitution;
import org.modelio.metamodel.uml.infrastructure.Usage;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.CollaborationUse;
import org.modelio.metamodel.uml.statik.Component;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.ElementImport;
import org.modelio.metamodel.uml.statik.ElementRealization;
import org.modelio.metamodel.uml.statik.Generalization;
import org.modelio.metamodel.uml.statik.Instance;
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
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.uml.statik.TemplateParameter;
import org.modelio.metamodel.uml.statik.TemplateParameterSubstitution;
import org.modelio.metamodel.visitors.AbstractModelVisitor;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.impl.GenericFactory;

@objid ("ceda606e-ea0c-4c63-b339-6ef9d56d5768")
class NSUseBuilder extends AbstractModelVisitor {
    @objid ("afa07368-6286-4df0-80f7-2c14925c93c4")
    private IRepository repository;

    @objid ("b90f9ce5-f829-44c3-a2e5-1c6823f47047")
    private GenericFactory genericFactory;

    @objid ("f8de0ea5-cab3-494d-8448-c161c458b242")
    public NSUseBuilder(GenericFactory genericFactory, IRepository repository) {
        this.repository = repository;
        this.genericFactory = genericFactory;
    }

    @objid ("102ef11f-0e79-48c3-9d4e-5c8c4a7a1b4b")
    @Override
    public Object visitAbstraction(Abstraction obj) {
        return visitDependency(obj);
    }

    @objid ("d21fe6ac-284a-4351-a65e-a241b96ec396")
    @Override
    public Object visitDependency(Dependency dep) {
        NSUseUtils.dereferenceNSUsesCausedBy(dep);
        
        ModelElement src0 = dep.getImpacted();
        ModelElement dest0 = dep.getDependsOn();
        NameSpace src1;
        NameSpace dest1;
        src1 = NSUseUtils.getNameSpaceOwner(src0);
        if (src1 != null) {
            dest1 = NSUseUtils.getNameSpaceOwner(dest0);
            if (dest1 != null)
                addNSUses(src1, dest1, dep);
        }
        return null;
    }

    @objid ("7a735fe4-9bcd-4e6c-86b6-2b7741b52cd1")
    @Override
    public Object visitProfile(Profile obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("0b15d592-4d02-4850-b2db-b7d888f74110")
    @Override
    public Object visitSubstitution(Substitution subst) {
        NSUseUtils.dereferenceNSUsesCausedBy(subst);
        
        NameSpace src = subst.getSubstitutingClassifier();
        NameSpace dest = subst.getContract();
        if (src != null && dest != null) {
            addNSUses(src, dest, subst);
        }
        return null;
    }

    @objid ("03c6d9e0-b6bc-40ec-becb-02d7c7296098")
    @Override
    public Object visitUsage(Usage obj) {
        return visitDependency(obj);
    }

    @objid ("733d7e2c-30cd-46c9-9793-8aef58cc8e58")
    @Override
    public Object visitMetaclassReference(MetaclassReference obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("a4dbd640-8827-4ac2-be96-62c384ee64b7")
    @Override
    public Object visitExternDocument(ExternDocument obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("9e92715b-632c-484c-9d5d-f0699de1a0f1")
    @Override
    public Object visitExternDocumentType(ExternDocumentType obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("9815e6ba-faf0-41cf-abf9-402865a72a63")
    @Override
    public Object visitArtifact(Artifact obj) {
        return visitClassifier(obj);
    }

    @objid ("cb412cfd-7986-433b-b62d-a8016ab13421")
    @Override
    public Object visitAssociationEnd(AssociationEnd end) {
        if (end.getAssociation() != null) {
            visitAssociation(end.getAssociation());
        }
        return null;
    }

    @objid ("85e96f6a-eefb-46e0-bc18-89b0dd10e2f5")
    @Override
    public Object visitAttribute(Attribute att) {
        NSUseUtils.dereferenceNSUsesCausedBy(att);
        
        Classifier type = att.getType();
        Classifier src = att.getOwner();
        if (src == null) {
            AssociationEnd role = att.getQualified();
            if (role != null)
                src = role.getOwner();
        }
        
        addNSUses(src, type, att);
        return null;
    }

    @objid ("9dbf1b8a-0e5a-455f-9fc0-18cafc5affdc")
    @Override
    public Object visitBindableInstance(BindableInstance bi) {
        // Call inherited
        visitInstance(bi);
        
        // Take into account represented features
        NameSpace src = NSUseUtils.getNameSpaceOwner(bi);
        NameSpace dest = NSUseUtils.getNameSpaceOwner(bi.getRepresentedFeature());
        
        addNSUses(src, dest, bi);
        return null;
    }

    @objid ("32f9ad54-ddb9-4d92-a8f7-d1c7178f865d")
    @Override
    public Object visitBinding(Binding binding) {
        NSUseUtils.dereferenceNSUsesCausedBy(binding);
        
        NameSpace src = NSUseUtils.getNameSpaceOwner(binding.getOwner());
        NameSpace dest = NSUseUtils.getNameSpaceOwner(binding.getRole());
        
        addNSUses(src, dest, binding);
        
        dest = NSUseUtils.getNameSpaceOwner(binding.getRepresentedFeature());
        addNSUses(src, dest, binding);
        return null;
    }

    @objid ("ac80ea7e-effc-4d20-8159-8720c7801efb")
    @Override
    public Object visitClassAssociation(ClassAssociation theClassAssociation) {
        NSUseUtils.dereferenceNSUsesCausedBy(theClassAssociation);
        
        NameSpace dest = theClassAssociation.getClassPart();
        Association assoc = theClassAssociation.getAssociationPart();
        if (assoc != null) {
            int nbNavigable = 0;
            for (AssociationEnd role : assoc.getEnd()) {
                if (role.isValid() && role.isNavigable())
                    nbNavigable++;
            }
            // Generate all roles if:
            // - non oriented association (ie nbNavigable == 0)
            // - or bidirectional association (ie nbNavigable == 2)
            // In the other case generate only navigable roles
            boolean generateAll = (nbNavigable == 0) || (nbNavigable == 2);
        
            for (AssociationEnd role : assoc.getEnd()) {
                if (role.isValid() && (generateAll || role.isNavigable())) {
                    NameSpace src = role.getOwner();
                    addNSUses(src, dest, theClassAssociation);
                }
            }
        }
        
        NaryAssociation naryAssoc = theClassAssociation.getNaryAssociationPart();
        if (naryAssoc != null) {
            for (NaryAssociationEnd role : naryAssoc.getNaryEnd()) {
                if (role.isValid()) {
                    NameSpace src = role.getOwner();
                    addNSUses(src, dest, theClassAssociation);
                }
            }
        }
        return null;
    }

    @objid ("933e2edc-4f7d-4b53-913b-54fe21e11711")
    @Override
    public Object visitCollaborationUse(CollaborationUse theCollaborationUse) {
        NSUseUtils.dereferenceNSUsesCausedBy(theCollaborationUse);
        
        NameSpace src = theCollaborationUse.getNRepresented();
        NameSpace dest = theCollaborationUse.getType();
        
        if (src == null) {
            Operation op = theCollaborationUse.getORepresented();
            if (op != null && op.isValid()) {
                src = op.getOwner();
            }
        }
        if (src != null && !src.isValid())
            src = null;
        
        if (dest != null && !dest.isValid())
            dest = null;
        
        addNSUses(src, dest, theCollaborationUse);
        return null;
    }

    @objid ("43b0f671-376e-47e5-8b62-78fdefc75e1b")
    @Override
    public Object visitComponent(Component obj) {
        return visitClass(obj);
    }

    @objid ("48ac4cfe-b151-4531-9027-3422a2caca57")
    @Override
    public Object visitConnectorEnd(ConnectorEnd theConnectorEnd) {
        visitLinkEnd(theConnectorEnd);
        
        // Take into account represented features
        NameSpace src = NSUseUtils.getNameSpaceOwner(theConnectorEnd);
        ModelElement feat = theConnectorEnd.getRepresentedFeature();
        
        NameSpace dest = NSUseUtils.getNameSpaceOwner(feat);
        addNSUses(src, dest, theConnectorEnd);
        return null;
    }

    @objid ("75676f4f-e0c5-4306-a84f-8a7d425728b8")
    @Override
    public Object visitElementImport(ElementImport theElementImport) {
        NSUseUtils.dereferenceNSUsesCausedBy(theElementImport);
        
        NameSpace src = theElementImport.getImportingNameSpace();
        NameSpace dest = theElementImport.getImportedElement();
        
        if (src == null) {
            Operation src2 = theElementImport.getImportingOperation();
            if (src2 != null)
                src = src2.getOwner();
        }
        
        addNSUses(src, dest, theElementImport);
        return null;
    }

    @objid ("93322007-32dc-4d77-bcce-bbb9160e9ea8")
    @Override
    public Object visitElementRealization(ElementRealization obj) {
        return visitDependency(obj);
    }

    @objid ("07fd5b6b-0161-4cc6-bd25-363f1403bf27")
    @Override
    public Object visitGeneralization(Generalization theGeneralization) {
        NSUseUtils.dereferenceNSUsesCausedBy(theGeneralization);
        addNSUses(theGeneralization.getSubType(), theGeneralization.getSuperType(), theGeneralization);
        return null;
    }

    @objid ("7ef2544c-d5cb-4951-87da-d788428bf46a")
    @Override
    public Object visitInstance(Instance theInstance) {
        NSUseUtils.dereferenceNSUsesCausedBy(theInstance);
        
        NameSpace src = NSUseUtils.getNameSpaceOwner(theInstance);
        NameSpace dest = theInstance.getBase();
        
        addNSUses(src, dest, theInstance);
        return null;
    }

    @objid ("aa4b8bb1-a2af-4344-be5b-9e8b97e33994")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization theInterfaceRealization) {
        NSUseUtils.dereferenceNSUsesCausedBy(theInterfaceRealization);
        addNSUses(theInterfaceRealization.getImplementer(), theInterfaceRealization.getImplemented(), theInterfaceRealization);
        return null;
    }

    @objid ("c51c6d01-4421-474b-bc03-b5336d0d0591")
    @Override
    public Object visitLinkEnd(LinkEnd theLinkEnd) {
        if (theLinkEnd.getLink() != null) {
            return visitLink(theLinkEnd.getLink());
        }
        return null;
    }

    @objid ("b8db0398-fc27-4489-b1ae-56e4ffeb5655")
    @Override
    public Object visitManifestation(Manifestation theManifestation) {
        NSUseUtils.dereferenceNSUsesCausedBy(theManifestation);
        
        NameSpace src = theManifestation.getOwner();
        ModelElement manifested = theManifestation.getUtilizedElement();
        
        NameSpace dest = NSUseUtils.getNameSpaceOwner(manifested);
        
        addNSUses(src, dest, theManifestation);
        return null;
    }

    @objid ("a40f6a11-3cff-495b-a253-628d11ec7722")
    @Override
    public Object visitNamespaceUse(NamespaceUse theNamespaceUse) {
        NSUseUtils.dereferenceNSUsesCausedBy(theNamespaceUse);
        
        NameSpace aSource = theNamespaceUse.getUser();
        NameSpace aDest = theNamespaceUse.getUsed();
        
        if (aSource != null && aDest != null && aSource.getCompositionOwner() != aDest.getCompositionOwner()) {
        
            Deque<NameSpace> sourceOwners = new ArrayDeque<>();
            Deque<NameSpace> destOwners = new ArrayDeque<>();
            NSUseUtils.getRelativePathsFromCommonRoot(aSource, aDest, sourceOwners, destOwners);
        
            // Re-add the last common
            sourceOwners.addLast(aSource);
            destOwners.addLast(aDest);
        
            if (sourceOwners.size() > 1 || destOwners.size() > 1) {
                // Get the 2 brothers
                NameSpace i1 = sourceOwners.getFirst();
                NameSpace i2 = destOwners.getFirst();
        
                // Add the uses between the 2 brothers
                if (i1 != i2) {
                    addNSUse(i1, i2, theNamespaceUse);
                }
            }
        }
        return null;
    }

    @objid ("1e71eba6-f569-42dc-8414-2684aa292834")
    @Override
    public Object visitNode(Node obj) {
        return null; // no processing
    }

    @objid ("299ce064-09b8-490f-b602-1a2093ef07e0")
    @Override
    public Object visitOperation(Operation theOperation) {
        NSUseUtils.dereferenceNSUsesCausedBy(theOperation);
        
        NameSpace src = theOperation.getOwner();
        Operation redefined = theOperation.getRedefines();
        
        if (redefined != null) {
            NameSpace dest = redefined.getOwner();
            addNSUses(src, dest, theOperation);
        }
        return null;
    }

    @objid ("412f5b60-a842-498a-8a66-ae850bf53889")
    @Override
    public Object visitPackage(Package obj) {
        return null; // no processing
    }

    @objid ("eb46157f-b218-4f24-b369-f722bad1fa09")
    @Override
    public Object visitPackageImport(PackageImport thePackageImport) {
        NSUseUtils.dereferenceNSUsesCausedBy(thePackageImport);
        
        NameSpace src = thePackageImport.getImportingNameSpace();
        NameSpace dest = thePackageImport.getImportedPackage();
        if (src == null) {
            Operation src2 = thePackageImport.getImportingOperation();
            if (src2 != null)
                src = src2.getOwner();
        }
        
        addNSUses(src, dest, thePackageImport);
        return null;
    }

    @objid ("012824a9-f6c8-43a1-917e-00dba5056152")
    @Override
    public Object visitPackageMerge(PackageMerge thePackageMerge) {
        NSUseUtils.dereferenceNSUsesCausedBy(thePackageMerge);
        addNSUses(thePackageMerge.getReceivingPackage(), thePackageMerge.getMergedPackage(), thePackageMerge);
        return null;
    }

    @objid ("2651006e-a45d-4ad4-86f5-9dc723af439d")
    @Override
    public Object visitParameter(Parameter theParameter) {
        NSUseUtils.dereferenceNSUsesCausedBy(theParameter);
        addNSUses(NSUseUtils.getNameSpaceOwner(theParameter), theParameter.getType(), theParameter);
        return null;
    }

    @objid ("0345743e-ce5a-4c32-8a80-4a21171fe23d")
    @Override
    public Object visitPort(Port obj) {
        return visitBindableInstance(obj);
    }

    @objid ("f61d5181-0c52-4bc2-a5b1-c17c247ce3a2")
    @Override
    public Object visitProvidedInterface(ProvidedInterface theProvidedInterface) {
        NSUseUtils.dereferenceNSUsesCausedBy(theProvidedInterface);
        
        NameSpace src = NSUseUtils.getNameSpaceOwner(theProvidedInterface.getProviding());
        for (NameSpace dest : theProvidedInterface.getProvidedElement()) {
            addNSUses(src, dest, theProvidedInterface);
        }
        return null;
    }

    @objid ("d5fb175b-9085-4194-bea9-707bd856f8f9")
    @Override
    public Object visitRaisedException(RaisedException theRaisedException) {
        NSUseUtils.dereferenceNSUsesCausedBy(theRaisedException);
        
        Operation op = theRaisedException.getThrower();
        if (op != null) {
            addNSUses(op.getOwner(), theRaisedException.getThrownType(), theRaisedException);
        }
        return null;
    }

    @objid ("351280d0-0e7b-46cd-bebe-6e0ef48473d8")
    @Override
    public Object visitRequiredInterface(RequiredInterface theRequiredInterface) {
        NSUseUtils.dereferenceNSUsesCausedBy(theRequiredInterface);
        
        NameSpace src = NSUseUtils.getNameSpaceOwner(theRequiredInterface.getRequiring());
        
        if (src != null) {
            for (NameSpace dest : theRequiredInterface.getRequiredElement()) {
                addNSUses(src, dest, theRequiredInterface);
            }
        }
        return null;
    }

    @objid ("2bf2f32d-5f90-4037-aff4-436439980118")
    @Override
    public Object visitTemplateBinding(TemplateBinding theTemplateBinding) {
        NSUseUtils.dereferenceNSUsesCausedBy(theTemplateBinding);
        
        NameSpace src = theTemplateBinding.getBoundElement();
        if (src == null) {
            Operation op = theTemplateBinding.getBoundOperation();
            if (op != null)
                src = op.getOwner();
        }
        
        NameSpace dest = theTemplateBinding.getInstanciatedTemplate();
        if (dest == null) {
            Operation op = theTemplateBinding.getInstanciatedTemplateOperation();
            if (op != null)
                dest = op.getOwner();
        }
        
        addNSUses(src, dest, theTemplateBinding);
        return null;
    }

    @objid ("cbc189e1-b4a4-4a3d-83f3-8584d822dc66")
    @Override
    public Object visitTemplateParameter(TemplateParameter theTemplateParameter) {
        NSUseUtils.dereferenceNSUsesCausedBy(theTemplateParameter);
        
        NameSpace src = theTemplateParameter.getParameterized();
        if (src == null) {
            Operation op = theTemplateParameter.getParameterizedOperation();
            if (op != null)
                src = op.getOwner();
        }
        
        if (src != null) {
            NameSpace dest = NSUseUtils.getNameSpaceOwner(theTemplateParameter.getType());
            addNSUses(src, dest, theTemplateParameter);
        
            dest = NSUseUtils.getNameSpaceOwner(theTemplateParameter.getDefaultType());
            addNSUses(src, dest, theTemplateParameter);
        }
        return null;
    }

    @objid ("359f0886-0137-4222-9fa4-83b14451ab74")
    @Override
    public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution theTemplateParameterSubstitution) {
        NSUseUtils.dereferenceNSUsesCausedBy(theTemplateParameterSubstitution);
        
        addNSUses(NSUseUtils.getNameSpaceOwner(theTemplateParameterSubstitution.getOwner()),
                NSUseUtils.getNameSpaceOwner(theTemplateParameterSubstitution.getActual()), theTemplateParameterSubstitution);
        return null;
    }

    @objid ("0633e352-40f5-4703-9811-60478dc02067")
    @Override
    public Object visitNaryAssociation(NaryAssociation theNaryAssociation) {
        NSUseUtils.dereferenceNSUsesCausedBy(theNaryAssociation);
        
        for (NaryAssociationEnd role : theNaryAssociation.getNaryEnd()) {
            NSUseUtils.dereferenceNSUsesCausedBy(role);
        }
        
        for (NaryAssociationEnd role : theNaryAssociation.getNaryEnd()) {
            if (role.isValid()) {
                NameSpace src = role.getOwner();
        
                for (NaryAssociationEnd otherRole : theNaryAssociation.getNaryEnd()) {
                    if (otherRole.isValid() && otherRole != role) {
                        NameSpace dest = otherRole.getOwner();
                        addNSUses(src, dest, role);
                    }
                }
            }
        }
        return null;
    }

    @objid ("ef968c7e-8a9b-46f1-8e73-d4512224cc56")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd end) {
        if (end.getNaryAssociation() != null) {
            visitNaryAssociation(end.getNaryAssociation());
        }
        return null;
    }

    @objid ("ffa77d29-969c-4f18-9c4d-21a0becf12c4")
    @Override
    public Object visitNaryLink(NaryLink theNaryLink) {
        NSUseUtils.dereferenceNSUsesCausedBy(theNaryLink);
        
        for (NaryLinkEnd role : theNaryLink.getNaryLinkEnd()) {
            NSUseUtils.dereferenceNSUsesCausedBy(role);
        }
        
        for (NaryLinkEnd role : theNaryLink.getNaryLinkEnd()) {
            if (role.isValid()) {
                NameSpace src = NSUseUtils.getNameSpaceOwner(role);
        
                for (NaryLinkEnd otherRole : theNaryLink.getNaryLinkEnd()) {
                    if (otherRole.isValid() && otherRole != role) {
                        NameSpace dest = NSUseUtils.getNameSpaceOwner(otherRole);
                        addNSUses(src, dest, role);
                    }
                }
            }
        }
        return null;
    }

    @objid ("1db9e638-5489-425f-ab78-407908c8bbf1")
    @Override
    public Object visitNaryConnector(NaryConnector theLink) {
        return visitNaryLink(theLink);
    }

    @objid ("c3041099-3d76-438c-be58-e0eb2e68878f")
    @Override
    public Object visitNaryConnectorEnd(NaryConnectorEnd theLinkEnd) {
        return visitNaryLinkEnd(theLinkEnd);
    }

    @objid ("d7dbc9d6-afee-4014-b879-722332691173")
    @Override
    public Object visitNaryLinkEnd(NaryLinkEnd theLinkEnd) {
        if (theLinkEnd.getNaryLink() != null) {
            return visitNaryLink(theLinkEnd.getNaryLink());
        }
        return null;
    }

    @objid ("e9f14cec-04a6-4e88-a24c-fce4859b403d")
    @Override
    public Object visitAssociation(Association theAssociation) {
        NSUseUtils.dereferenceNSUsesCausedBy(theAssociation);
        
        int nbNavigable = 0;
        for (AssociationEnd role : theAssociation.getEnd()) {
            NSUseUtils.dereferenceNSUsesCausedBy(role);
            if (role.isValid() && role.isNavigable())
                nbNavigable++;
        }
        
        // Generate all roles if:
        // - non oriented association
        // - or bidirectional association.
        // In the other case generate only navigable roles
        boolean generateAll = (nbNavigable == 0) || (nbNavigable == 2);
        
        for (AssociationEnd role : theAssociation.getEnd()) {
            if (role.isValid() && (generateAll || role.isNavigable())) {
                NameSpace src = role.getOwner();
                NameSpace dest = role.getOpposite().getOwner();
                addNSUses(src, dest, role);
            }
        }
        return null;
    }

    @objid ("56d2f979-6d8a-4255-8ddb-243be77d4be4")
    @Override
    public Object visitLink(Link theLink) {
        NSUseUtils.dereferenceNSUsesCausedBy(theLink);
        
        int nbNavigable = 0;
        for (LinkEnd role : theLink.getLinkEnd()) {
            NSUseUtils.dereferenceNSUsesCausedBy(role);
            if (role.isValid() && role.isNavigable())
                nbNavigable++;
        }
        
        // Generate all roles if:
        // - non oriented association
        // - or bidirectional association.
        // In the other case generate only navigable roles
        boolean generateAll = (nbNavigable == 0) || (nbNavigable == 2);
        
        for (LinkEnd role : theLink.getLinkEnd()) {
            if (role.isValid() && (generateAll || role.isNavigable())) {
                NameSpace src = NSUseUtils.getNameSpaceOwner(role);
                NameSpace dest = NSUseUtils.getNameSpaceOwner(role.getOpposite());
                addNSUses(src, dest, role);
            }
        }
        return null;
    }

    @objid ("6a505e12-c805-4546-b10f-325e579649e8")
    @Override
    public Object visitConnector(Connector theConnector) {
        return visitLink(theConnector);
    }

    @objid ("6811693b-2e2f-4621-be42-d5e242ea7b2d")
    @Override
    public Object visitAcceptCallEventAction(AcceptCallEventAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("9d901d73-58aa-4c5f-83ac-07ae56678fcf")
    @Override
    public Object visitAcceptChangeEventAction(AcceptChangeEventAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("650325f3-4a23-4572-bedf-6b9ec12b4a16")
    @Override
    public Object visitAcceptSignalAction(AcceptSignalAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("2d7e2f63-0ed3-4a8a-bd39-80e0d13a48ad")
    @Override
    public Object visitAcceptTimeEventAction(AcceptTimeEventAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("0d1836c4-5623-4de9-9a33-4226c406cc99")
    @Override
    public Object visitActivity(Activity obj) {
        return visitBehavior(obj);
    }

    @objid ("13f8b9a7-bbc6-475d-b15c-05937226d829")
    @Override
    public Object visitActivityAction(ActivityAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("d6d056a2-99ed-4054-82b4-6f4713ef2617")
    @Override
    public Object visitActivityEdge(ActivityEdge obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("18c50521-2ad1-41e1-b08c-2f75ec712332")
    @Override
    public Object visitActivityFinalNode(ActivityFinalNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("f3c6cc13-2bd9-4bc5-ab1c-5f80b82e2334")
    @Override
    public Object visitActivityGroup(ActivityGroup obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("1b0f8ed5-174a-43ee-90c1-4d846019bafc")
    @Override
    public Object visitActivityNode(ActivityNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("fbfb6048-bf55-4832-8f68-1815448b4e40")
    @Override
    public Object visitActivityParameterNode(ActivityParameterNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("b21ac101-0ccb-47ea-b3f2-26cd7df46caa")
    @Override
    public Object visitActivityPartition(ActivityPartition obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("5177e381-c74e-4c92-8173-19cab7439a68")
    @Override
    public Object visitCallAction(CallAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("b4c1def6-8bca-45c4-b5fc-593b3bb4cc33")
    @Override
    public Object visitCallBehaviorAction(CallBehaviorAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("fafe560f-d173-4c52-b943-034a06daf42b")
    @Override
    public Object visitCallOperationAction(CallOperationAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("45498792-eb5d-44d6-9e8f-e75448eb89a8")
    @Override
    public Object visitCentralBufferNode(CentralBufferNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("9fa0a29c-4314-4fb1-89f6-05b7129674b6")
    @Override
    public Object visitClause(Clause obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("0e43844e-2a85-4016-ae88-511eb47a2812")
    @Override
    public Object visitConditionalNode(ConditionalNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("59102496-e531-44b5-9ba2-3270df50d154")
    @Override
    public Object visitControlFlow(ControlFlow obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("bfbb1874-cdc8-4d63-bfe1-fef62411e2b8")
    @Override
    public Object visitControlNode(ControlNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("4560291c-232e-49de-b808-cecc574dc281")
    @Override
    public Object visitDataStoreNode(DataStoreNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("239ca3b0-4d4a-407f-b10a-d38b89c2f1a9")
    @Override
    public Object visitDecisionMergeNode(DecisionMergeNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("28cd9c15-a19b-4700-8df5-64085f6691b5")
    @Override
    public Object visitExceptionHandler(ExceptionHandler obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("60744284-f10e-40b1-8841-92ef82245dde")
    @Override
    public Object visitExpansionNode(ExpansionNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("586adeba-5296-4743-870c-d2bf892c34bc")
    @Override
    public Object visitExpansionRegion(ExpansionRegion obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("473fb870-4555-4152-a20c-72a377ecc761")
    @Override
    public Object visitFinalNode(FinalNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("0e6ac905-2640-428f-93d3-30c313d07f1b")
    @Override
    public Object visitFlowFinalNode(FlowFinalNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("b4c06f13-d201-4220-be74-c96eb3aac1c0")
    @Override
    public Object visitForkJoinNode(ForkJoinNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("e0713b7c-2f79-4662-b79c-7c5173f4f4e0")
    @Override
    public Object visitInitialNode(InitialNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("3d396a18-3a9f-4fa4-b74e-1c234b556e85")
    @Override
    public Object visitInputPin(InputPin obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("d6036c09-bea8-4408-83ff-2c7c532f8ffa")
    @Override
    public Object visitInstanceNode(InstanceNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("b298317c-4b00-4579-81db-f0057ac5da2f")
    @Override
    public Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("827decd8-c996-4573-83f6-739627718ed8")
    @Override
    public Object visitLoopNode(LoopNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("0422a272-5c4e-4aa9-8a11-e8a35cdbc006")
    @Override
    public Object visitMessageFlow(MessageFlow obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("9ee95897-1052-4a83-a5b0-431283a0c64b")
    @Override
    public Object visitObjectFlow(ObjectFlow obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("936e37d8-0c43-4f8f-b187-0d2a746f533b")
    @Override
    public Object visitObjectNode(ObjectNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("10ff46a7-57d2-4b56-840d-0776e988faa1")
    @Override
    public Object visitOpaqueAction(OpaqueAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("9acf0621-ee71-428a-ae9f-efa18b432d79")
    @Override
    public Object visitOutputPin(OutputPin obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("d2614b80-dca7-4347-b0f3-b48af172adc7")
    @Override
    public Object visitPin(Pin obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("4f3a253c-18af-4d0a-b1a9-8e2cc68704a6")
    @Override
    public Object visitSendSignalAction(SendSignalAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("c7fb329b-79f1-4295-ae2d-9ca6d65cc1a3")
    @Override
    public Object visitStructuredActivityNode(StructuredActivityNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("4f8d60aa-784f-41b7-98dd-1b991d770731")
    @Override
    public Object visitValuePin(ValuePin obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("1d67e8f4-fa08-46a1-9c52-da538f74c8b8")
    @Override
    public Object visitBehaviorParameter(BehaviorParameter obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("c6d67c6b-08f2-4694-9857-d9209e5487ed")
    @Override
    public Object visitOpaqueBehavior(OpaqueBehavior obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("1032db11-2db5-49f8-94ae-33b509309ab1")
    @Override
    public Object visitSignal(Signal theSignal) {
        NSUseUtils.dereferenceNSUsesCausedBy(theSignal);
        
        NameSpace src = theSignal;
        NameSpace dest = theSignal.getBase();
        if (dest == null) {
            Operation op = theSignal.getOBase();
            if (op != null) {
                dest = op.getOwner();
            }
        }
        if (dest == null) {
            dest = NSUseUtils.getNameSpaceOwner(theSignal.getPBase());
        }
        
        addNSUses(src, dest, theSignal);
        return null;
    }

    @objid ("95de858d-4008-4f03-972f-91620f97f657")
    @Override
    public Object visitEvent(Event theEvent) {
        NSUseUtils.dereferenceNSUsesCausedBy(theEvent);
        
        Behavior m = theEvent.getComposed();
        if (m != null) {
            NameSpace src = m.getOwner();
            if (src == null) {
                Operation o = m.getOwnerOperation();
                if (o != null) {
                    src = o.getOwner();
                }
            }
            if ((src != null)) {
                NameSpace dest = null;
        
                // called operation
                Operation called = theEvent.getCalled();
                if (called != null) {
                    dest = called.getOwner();
                    addNSUses(src, dest, theEvent);
                }
        
                // model signal
                dest = theEvent.getModel();
                addNSUses(src, dest, theEvent);
            }
        }
        return null;
    }

    @objid ("f9283df6-8384-4edc-83ea-a6b10789c315")
    @Override
    public Object visitCombinedFragment(CombinedFragment obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("363776b4-858b-4277-999a-e606c3a262fa")
    @Override
    public Object visitDurationConstraint(DurationConstraint obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("cbef6ddd-7e04-4ca6-b4f0-49cf8e3c26d4")
    @Override
    public Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("600a53c6-816d-4cee-822e-d56125ddeb67")
    @Override
    public Object visitExecutionSpecification(ExecutionSpecification obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("fff94130-0f09-4068-9744-c80c86c6fcc8")
    @Override
    public Object visitGate(Gate obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("d2350f7e-8fb2-4b01-b06c-ee6b39512441")
    @Override
    public Object visitGeneralOrdering(GeneralOrdering obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("397fb194-a710-47a4-83f0-f52c7897ff67")
    @Override
    public Object visitInteractionFragment(InteractionFragment obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("25856f88-9827-446f-8967-af5913e11565")
    @Override
    public Object visitInteractionOperand(InteractionOperand obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("851e086c-f4b3-46bf-a70f-82aa6ce2b13c")
    @Override
    public Object visitInteractionUse(InteractionUse obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("2d28179f-d8e1-458d-bd06-66baab033b7c")
    @Override
    public Object visitLifeline(Lifeline obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("143e6488-2786-4d16-b7a3-a71fac1188e4")
    @Override
    public Object visitMessage(Message theMessage) {
        NSUseUtils.dereferenceNSUsesCausedBy(theMessage);
        
        NameSpace src = NSUseUtils.getNameSpaceOwner(theMessage);
        NameSpace dest;
        Operation op = theMessage.getInvoked();
        if ((src != null) && op != null) {
            dest = op.getOwner();
            addNSUses(src, dest, theMessage);
        }
        return null;
    }

    @objid ("4542c6b0-9d7e-4d53-88ed-d2d315f03642")
    @Override
    public Object visitMessageEnd(MessageEnd obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("26436b42-5150-48ce-b432-b2651fbbb445")
    @Override
    public Object visitOccurrenceSpecification(OccurrenceSpecification obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("1b662ef4-cd91-4aa5-91c6-889a2be997bc")
    @Override
    public Object visitPartDecomposition(PartDecomposition obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("9fba4057-8c57-489d-9b2b-67b2c1ae0e7a")
    @Override
    public Object visitStateInvariant(StateInvariant obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("d938d279-6c35-4170-b40f-0e1298b6d5cd")
    @Override
    public Object visitTerminateSpecification(TerminateSpecification obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("90c37000-2864-4260-933b-d7d5e0bef086")
    @Override
    public Object visitAbstractPseudoState(AbstractPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("12ee86da-2b2f-432a-9b60-af81dff93797")
    @Override
    public Object visitChoicePseudoState(ChoicePseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("5117c241-eb48-4a8a-9625-c0527fc67468")
    @Override
    public Object visitConnectionPointReference(ConnectionPointReference obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("4f7a5d1f-95bd-4027-bcb7-47076d55026b")
    @Override
    public Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("38ab1ecb-ef0e-4c9e-935a-dc8eea49eb6d")
    @Override
    public Object visitEntryPointPseudoState(EntryPointPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("5dad8089-f6b3-445c-89b5-adaa26dcc65d")
    @Override
    public Object visitExitPointPseudoState(ExitPointPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("54e83421-e5d3-4b9f-ad07-12f7aae0cf89")
    @Override
    public Object visitForkPseudoState(ForkPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("547f00b5-60e5-42e8-9a8d-c05678a6bceb")
    @Override
    public Object visitInitialPseudoState(InitialPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("5c0aa165-a093-45d8-8890-b6b7d6cc51ce")
    @Override
    public Object visitInternalTransition(InternalTransition obj) {
        return visitTransition(obj);
    }

    @objid ("c1c20f8b-a0bc-4cf8-974d-bd27594686f5")
    @Override
    public Object visitJoinPseudoState(JoinPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("8328271d-fb91-4083-a0e7-d482452402ae")
    @Override
    public Object visitJunctionPseudoState(JunctionPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("88fc7209-69c3-4178-b36e-13f911b11c7e")
    @Override
    public Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("02ebffcb-2164-40bc-abdc-3d6eb4e5e7d1")
    @Override
    public Object visitTerminatePseudoState(TerminatePseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("2e6d54d1-2da7-4816-82d5-b017d2d1e5ad")
    @Override
    public Object visitTransition(Transition theTransition) {
        NSUseUtils.dereferenceNSUsesCausedBy(theTransition);
        
        NameSpace src = NSUseUtils.getNameSpaceOwner(theTransition);
        if ((src != null)) {
            NameSpace dest = theTransition.getEffects();
            addNSUses(src, dest, theTransition);
        
            dest = NSUseUtils.getNameSpaceOwner(theTransition.getTrigger());
            addNSUses(src, dest, theTransition);
        }
        return null;
    }

    @objid ("1f013b59-e417-4056-b8cc-2c024cde0167")
    @Override
    public Object visitFinalState(FinalState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("5706b220-9c84-4214-ba4c-c1e00bb93d29")
    @Override
    public Object visitRegion(Region obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("e25ab2de-3cd4-41dc-bcdc-1972a05408d6")
    @Override
    public Object visitActor(Actor obj) {
        return visitGeneralClass(obj);
    }

    @objid ("4f6082c4-b0f2-4149-bdde-355a723fbeb4")
    @Override
    public Object visitUseCaseDependency(UseCaseDependency theUseCaseDependency) {
        NSUseUtils.dereferenceNSUsesCausedBy(theUseCaseDependency);
        
        NameSpace src = theUseCaseDependency.getOrigin();
        NameSpace dest = theUseCaseDependency.getTarget();
        
        addNSUses(src, dest, theUseCaseDependency);
        return null;
    }

    @objid ("0f0c5b6c-17ec-4adb-9380-453a4ad68173")
    @Override
    public Object visitInformationFlow(InformationFlow obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("6468648a-2ba8-4e97-8b4e-f5af04fceed9")
    @Override
    public Object visitInformationItem(InformationItem obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("80c7309b-6d90-4f07-b666-c84c53d53786")
    @Override
    public Object visitDataFlow(DataFlow theDataFlow) {
        NSUseUtils.dereferenceNSUsesCausedBy(theDataFlow);
        
        NameSpace src1 = theDataFlow.getOrigin();
        NameSpace dest1 = theDataFlow.getDestination();
        NameSpace dest2 = theDataFlow.getSModel();
        
        if (src1 != null && src1.isValid()) {
            if (dest1 != null && dest1.isValid()) {
                addNSUses(src1, dest1, theDataFlow);
            }
            if (dest2 != null && dest2.isValid()) {
                addNSUses(src1, dest2, theDataFlow);
            }
        }
        return null;
    }

    @objid ("822df26b-8cab-42c5-b7dd-a52a2cba26c5")
    @Override
    public Object visitCommunicationInteraction(CommunicationInteraction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("44f0da87-c470-407a-944e-453dc8b32dfe")
    @Override
    public Object visitCommunicationNode(CommunicationNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("55a133dd-bc6f-470e-9cc2-d35b4c405c53")
    @Override
    public Object visitCommunicationMessage(CommunicationMessage obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("49217eba-246a-4245-9fe7-fc1f25870868")
    @Override
    public Object visitCommunicationChannel(CommunicationChannel obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("0c971700-92cd-41f4-acf1-bee9f58d7e47")
    private void addNSUses(NameSpace aSource, NameSpace aDest, Element aCause) {
        if (aSource != null && aDest != null && aCause != null) {
            NamespaceUse use = addNSUse(aSource, aDest, aCause);
            if (use != null) {
                visitNamespaceUse(use);
            }
        }
    }

    @objid ("1dc42072-96a8-432f-bc6e-fbeba60a4409")
    private NamespaceUse addNSUse(NameSpace aSource, NameSpace aDest, Element aCause) {
        NamespaceUse aUse = null;
        if (aSource != aDest) {
            for (NamespaceUse ns : aSource.getUsedNsu()) {
                if (ns.isValid() && ns.getUsed() == aDest) {
                    ns.getCause().add(aCause);
                    aUse = ns;
                    break;
                }
            }
        
            if (aUse == null) {
                aUse = this.genericFactory.create(NamespaceUse.class, this.repository);
                if (aUse != null) {
                    aUse.getCause().add(aCause);
                    aUse.setUser(aSource);
                    aUse.setUsed(aDest);
                }
            }
        }
        return aUse;
    }

    @objid ("98806d3a-a97d-4851-9aec-e0183943c262")
    public void buildFor(Element e) {
        //System.out.println("build NSU for " + e.getName());
        e.accept(this);
    }

}
