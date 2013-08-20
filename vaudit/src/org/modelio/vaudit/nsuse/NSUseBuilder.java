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
import org.eclipse.emf.common.util.EList;
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
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.Manifestation;
import org.modelio.metamodel.uml.statik.NameSpace;
import org.modelio.metamodel.uml.statik.NamespaceUse;
import org.modelio.metamodel.uml.statik.NaryAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.NaryConnectorEnd;
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
import org.modelio.vaudit.plugin.Vaudit;
import org.modelio.vcore.session.api.repository.IRepository;
import org.modelio.vcore.session.impl.GenericFactory;

@objid ("ceda606e-ea0c-4c63-b339-6ef9d56d5768")
class NSUseBuilder extends AbstractModelVisitor {
    @objid ("690e1462-7f16-4903-9ada-ffb15db5438c")
    private IRepository repository;

    @objid ("a1555efe-355c-4580-8f17-9ec5d125d695")
    private GenericFactory genericFactory;

    @objid ("3036dde4-dcee-4ec7-8ecf-f6c7c70644da")
    public NSUseBuilder(GenericFactory genericFactory, IRepository repository) {
        this.repository = repository;
        this.genericFactory = genericFactory;
    }

    @objid ("f9c1fdbb-b9de-44c5-bd81-75fad4d4fff8")
    @Override
    public Object visitAbstraction(Abstraction obj) {
        return visitDependency(obj);
    }

    @objid ("cf0ea951-e56c-4a40-87ad-4e66054c46eb")
    @Override
    public Object visitDependency(Dependency dep) {
        NSUseUtils.dereferenceNSUsesCausedBy(dep);
        
        ModelElement src0 = dep.getImpacted();
        ModelElement dest0 = dep.getDependsOn();
        NameSpace src1;
        NameSpace dest1;
        src1 = NSUseUtils.getNameSpaceOwner(src0);
        dest1 = NSUseUtils.getNameSpaceOwner(dest0);
        addNSUses(src1, dest1, dep);
        return null;
    }

    @objid ("cd76b3cb-d77e-459c-a4e2-8acc81c1afd9")
    @Override
    public Object visitProfile(Profile obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("26ef68ab-d9a9-475f-89b6-4530f56f123c")
    @Override
    public Object visitSubstitution(Substitution subst) {
        NSUseUtils.dereferenceNSUsesCausedBy(subst);
        NameSpace src = subst.getSubstitutingClassifier();
        NameSpace dest = subst.getContract();
        addNSUses(src, dest, subst);
        return null;
    }

    @objid ("2c69aec4-b3d3-49e7-a472-9c690eb2e076")
    @Override
    public Object visitUsage(Usage obj) {
        return visitDependency(obj);
    }

    @objid ("3a3f4932-42c4-460a-92c7-e8881d6aa5dc")
    @Override
    public Object visitMetaclassReference(MetaclassReference obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("fe225648-ff0e-4c78-ad86-b2827fe36bba")
    @Override
    public Object visitExternDocument(ExternDocument obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("cfa83795-c4d5-4d37-b204-563436b42736")
    @Override
    public Object visitExternDocumentType(ExternDocumentType obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("e514d4af-0c99-4006-bed2-12077205e616")
    @Override
    public Object visitArtifact(Artifact obj) {
        return visitClassifier(obj);
    }

    @objid ("5355b97e-949b-4f9b-9037-5c8e8ef0f574")
    @Override
    public Object visitAssociationEnd(AssociationEnd end) {
        NSUseUtils.dereferenceNSUsesCausedBy(end);
        
        // Generate NSU if:
        // - non oriented association
        // - or bidirectional association.
        // In the other case generate only navigable roles
        if (end.isNavigable()) {
            NameSpace src = end.getOwner();
            NameSpace dest = end.getTarget();
            addNSUses(src, dest, end);
        } else {
            AssociationEnd opposite = end.getOpposite();
            if ((opposite != null) && (!opposite.isNavigable())) {
                NameSpace src = end.getOwner();
                NameSpace dest = opposite.getOwner();
                addNSUses(src, dest, end);
            }
        }
        return null;
    }

    @objid ("fd4b198b-cec9-49b5-88ee-5a920cf80460")
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

    @objid ("1444ae45-2d63-4235-8ee1-987f53d5eaa6")
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

    @objid ("b490600d-170e-4532-a136-d86c010bec66")
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

    @objid ("9ef87db6-7fb7-4edf-bdc1-5a3aa5ad4d97")
    @Override
    public Object visitClassAssociation(ClassAssociation theClassAssociation) {
        NSUseUtils.dereferenceNSUsesCausedBy(theClassAssociation);
        
        NameSpace dest = theClassAssociation.getClassPart();
        Association assoc = theClassAssociation.getAssociationPart();
        if (assoc != null) {
            int nbNavigable = 0;
            EList<AssociationEnd> end = assoc.getEnd();
            for (AssociationEnd role : end) {
                if (role.isValid() && role.isNavigable())
                    nbNavigable++;
            }
            // Generate all roles if:
            // - non oriented association (ie nbNavigable == 0)
            // - or bidirectional association (ie nbNavigable == 2)
            // In the other case generate only navigable roles
            boolean generateAll = (nbNavigable == 0) || (nbNavigable == 2);
        
            for (AssociationEnd role : end) {
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

    @objid ("c4c7b805-5487-4eec-8783-b917c490cedd")
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

    @objid ("39f93876-696e-4191-960d-0a08a38c870d")
    @Override
    public Object visitComponent(Component obj) {
        return visitClass(obj);
    }

    @objid ("c1a6c09a-a64e-4c91-aa2a-c9217112dbfc")
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

    @objid ("fd81d783-8c76-4a35-8060-a0c81cbebba3")
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

    @objid ("1d268400-a8b5-4b2a-a233-90a30d9d5df2")
    @Override
    public Object visitElementRealization(ElementRealization obj) {
        return visitDependency(obj);
    }

    @objid ("2519aa87-9199-4137-a21c-3cc3a94d5637")
    @Override
    public Object visitGeneralization(Generalization theGeneralization) {
        NSUseUtils.dereferenceNSUsesCausedBy(theGeneralization);
        addNSUses(theGeneralization.getSubType(), theGeneralization.getSuperType(), theGeneralization);
        return null;
    }

    @objid ("9d7e39ea-5f42-4359-b1b8-af3097c3a241")
    @Override
    public Object visitInstance(Instance theInstance) {
        NSUseUtils.dereferenceNSUsesCausedBy(theInstance);
        
        NameSpace src = NSUseUtils.getNameSpaceOwner(theInstance);
        NameSpace dest = theInstance.getBase();
        
        addNSUses(src, dest, theInstance);
        return null;
    }

    @objid ("b70e5f63-4899-41e6-befc-ae69e75634e6")
    @Override
    public Object visitInterfaceRealization(InterfaceRealization theInterfaceRealization) {
        NSUseUtils.dereferenceNSUsesCausedBy(theInterfaceRealization);
        addNSUses(theInterfaceRealization.getImplementer(), theInterfaceRealization.getImplemented(), theInterfaceRealization);
        return null;
    }

    @objid ("a7cc0d28-284c-4a07-bb33-8beff16f6ba5")
    @Override
    public Object visitLinkEnd(LinkEnd theLinkEnd) {
        NSUseUtils.dereferenceNSUsesCausedBy(theLinkEnd);
        
        // Generate NSU if:
        // - non oriented link
        // - or bidirectional link.
        // In the other case generate only navigable roles
        if (theLinkEnd.isNavigable()) {
            NameSpace src = NSUseUtils.getNameSpaceOwner(theLinkEnd.getOwner());
            NameSpace dest = NSUseUtils.getNameSpaceOwner(theLinkEnd.getTarget());
            addNSUses(src, dest, theLinkEnd);
        } else {
            LinkEnd opposite = theLinkEnd.getOpposite();
            if (!opposite.isNavigable()) {
                NameSpace src = NSUseUtils.getNameSpaceOwner(theLinkEnd.getOwner());
                NameSpace dest = NSUseUtils.getNameSpaceOwner(opposite.getOwner());
                addNSUses(src, dest, theLinkEnd);
            }
        }
        return null;
    }

    @objid ("c1dd9373-09bd-4606-9dff-530de258830c")
    @Override
    public Object visitManifestation(Manifestation theManifestation) {
        NSUseUtils.dereferenceNSUsesCausedBy(theManifestation);
        
        NameSpace src = theManifestation.getOwner();
        ModelElement manifested = theManifestation.getUtilizedElement();
        
        NameSpace dest = NSUseUtils.getNameSpaceOwner(manifested);
        
        addNSUses(src, dest, theManifestation);
        return null;
    }

    @objid ("ba47257c-4d5a-4728-9940-7036a4baed33")
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

    @objid ("2168d587-bc9b-48f5-aa3d-0f23a44b36db")
    @Override
    public Object visitNode(Node obj) {
        return null; // no processing
    }

    @objid ("fc0729ab-261b-4994-bee8-7aeea427abe1")
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

    @objid ("5eb29546-39ea-4036-b665-a874dc905f7e")
    @Override
    public Object visitPackage(Package obj) {
        return null; // no processing
    }

    @objid ("6e7fdad2-628e-4b1d-8307-a48ca0d45dfb")
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

    @objid ("1862c56e-5c65-4093-a7a9-e5e07766a56f")
    @Override
    public Object visitPackageMerge(PackageMerge thePackageMerge) {
        NSUseUtils.dereferenceNSUsesCausedBy(thePackageMerge);
        addNSUses(thePackageMerge.getReceivingPackage(), thePackageMerge.getMergedPackage(), thePackageMerge);
        return null;
    }

    @objid ("02d348d2-7f88-4ede-9d4c-d02819deb8a9")
    @Override
    public Object visitParameter(Parameter theParameter) {
        NSUseUtils.dereferenceNSUsesCausedBy(theParameter);
        addNSUses(NSUseUtils.getNameSpaceOwner(theParameter), theParameter.getType(), theParameter);
        return null;
    }

    @objid ("da250c72-fa47-4a95-8d80-d8f57847db33")
    @Override
    public Object visitPort(Port obj) {
        return visitBindableInstance(obj);
    }

    @objid ("ea7cd044-11e6-448f-932e-0e7d10ecbccc")
    @Override
    public Object visitProvidedInterface(ProvidedInterface theProvidedInterface) {
        NSUseUtils.dereferenceNSUsesCausedBy(theProvidedInterface);
        
        NameSpace src = NSUseUtils.getNameSpaceOwner(theProvidedInterface.getProviding());
        for (NameSpace dest : theProvidedInterface.getProvidedElement()) {
            addNSUses(src, dest, theProvidedInterface);
        }
        return null;
    }

    @objid ("301a5d8b-019a-4afa-b107-0ccb44bda8bf")
    @Override
    public Object visitRaisedException(RaisedException theRaisedException) {
        NSUseUtils.dereferenceNSUsesCausedBy(theRaisedException);
        
        Operation op = theRaisedException.getThrower();
        if (op != null) {
            addNSUses(op.getOwner(), theRaisedException.getThrownType(), theRaisedException);
        }
        return null;
    }

    @objid ("afc9fbec-d768-49ba-a822-1820e1ec55ce")
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

    @objid ("f3539dce-0b0b-4542-a023-f82296a3c135")
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

    @objid ("87ca09c3-4196-4508-a894-a5cffef3f644")
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

    @objid ("4bec793c-c798-4f55-aa00-2f8acbfbdc2b")
    @Override
    public Object visitTemplateParameterSubstitution(TemplateParameterSubstitution theTemplateParameterSubstitution) {
        NSUseUtils.dereferenceNSUsesCausedBy(theTemplateParameterSubstitution);
        
        addNSUses(NSUseUtils.getNameSpaceOwner(theTemplateParameterSubstitution.getOwner()),
                NSUseUtils.getNameSpaceOwner(theTemplateParameterSubstitution.getActual()), theTemplateParameterSubstitution);
        return null;
    }

    @objid ("98d081a5-4e14-46aa-b3bc-a156145cf34d")
    @Override
    public Object visitNaryAssociationEnd(NaryAssociationEnd end) {
        NSUseUtils.dereferenceNSUsesCausedBy(end);
        
        NameSpace src = end.getOwner();
        
        for (NaryAssociationEnd otherRole : end.getNaryAssociation().getNaryEnd()) {
            if (otherRole.isValid() && otherRole != end) {
                NameSpace dest = otherRole.getOwner();
                addNSUses(src, dest, end);
            }
        }
        return null;
    }

    @objid ("48849328-1d61-4910-b1c1-800e226a769e")
    @Override
    public Object visitNaryConnectorEnd(NaryConnectorEnd theLinkEnd) {
        return visitNaryLinkEnd(theLinkEnd);
    }

    @objid ("270cc419-6056-4ab9-841c-69f1deee369e")
    @Override
    public Object visitNaryLinkEnd(NaryLinkEnd theLinkEnd) {
        NSUseUtils.dereferenceNSUsesCausedBy(theLinkEnd);
        
        NameSpace src = NSUseUtils.getNameSpaceOwner(theLinkEnd);
        
        for (NaryLinkEnd otherRole : theLinkEnd.getNaryLink().getNaryLinkEnd()) {
            if (otherRole.isValid() && otherRole != theLinkEnd) {
                NameSpace dest = NSUseUtils.getNameSpaceOwner(otherRole);
                addNSUses(src, dest, theLinkEnd);
            }
        }
        return null;
    }

    @objid ("f80f6cfe-6429-449a-862a-baef6b4e6638")
    @Override
    public Object visitConnector(Connector theConnector) {
        return visitLink(theConnector);
    }

    @objid ("35c7fe3a-66cc-4258-ba59-4714ef8f4d91")
    @Override
    public Object visitAcceptCallEventAction(AcceptCallEventAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("e99410e2-f79b-462e-9d76-5080486e2570")
    @Override
    public Object visitAcceptChangeEventAction(AcceptChangeEventAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("e47004cb-0933-4700-b523-3a7f8134605c")
    @Override
    public Object visitAcceptSignalAction(AcceptSignalAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("4de3dbfe-2165-4db4-bb80-69dc6709fdc7")
    @Override
    public Object visitAcceptTimeEventAction(AcceptTimeEventAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("721e89b5-50b6-46ad-9af2-d998a7334cee")
    @Override
    public Object visitActivity(Activity obj) {
        return visitBehavior(obj);
    }

    @objid ("f9e2b6fb-0174-45f0-a752-c6149da9b941")
    @Override
    public Object visitActivityAction(ActivityAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("29dbb537-360d-45a9-83b0-0eb4df812387")
    @Override
    public Object visitActivityEdge(ActivityEdge obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("1dab41b6-5ae0-4969-badd-533abbdc603b")
    @Override
    public Object visitActivityFinalNode(ActivityFinalNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("82ec1e17-aebf-4da7-825f-fb989dce57c4")
    @Override
    public Object visitActivityGroup(ActivityGroup obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("a11df0be-c9d2-4d6d-940a-c0acf3bf26e1")
    @Override
    public Object visitActivityNode(ActivityNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("67e843dc-302c-4b67-840c-89c23b9f6712")
    @Override
    public Object visitActivityParameterNode(ActivityParameterNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("c58976e7-4bdc-4494-9f04-6cc613649f7f")
    @Override
    public Object visitActivityPartition(ActivityPartition obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("6ab75cdb-6afe-42cc-a902-dba8ab247ad2")
    @Override
    public Object visitCallAction(CallAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("b41052a5-54d4-4432-8f79-0979bb92e80d")
    @Override
    public Object visitCallBehaviorAction(CallBehaviorAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("5f6d0df5-a1cb-41ba-8aa3-3239d36d69e0")
    @Override
    public Object visitCallOperationAction(CallOperationAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("5432fefc-ca2d-4083-880e-1cea93cb00b3")
    @Override
    public Object visitCentralBufferNode(CentralBufferNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("89c972e3-12a8-4bcb-93f4-00966a8bc6d3")
    @Override
    public Object visitClause(Clause obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("f6e5d6a8-d553-4ddd-9edc-4196b51f6da4")
    @Override
    public Object visitConditionalNode(ConditionalNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("51e6456d-0f9c-4ef9-b821-7a3b7e8ab3e0")
    @Override
    public Object visitControlFlow(ControlFlow obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("398e6184-268c-41f3-90cd-6a34b7b716ad")
    @Override
    public Object visitControlNode(ControlNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("ed3c2f98-4b7c-444f-b531-51d2bfa3fc64")
    @Override
    public Object visitDataStoreNode(DataStoreNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("8b13c365-dc7c-424f-aba4-43deaaf325d2")
    @Override
    public Object visitDecisionMergeNode(DecisionMergeNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("91687bfe-779a-49b0-8bd7-d9a17029401a")
    @Override
    public Object visitExceptionHandler(ExceptionHandler obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("a9bccf67-b778-46f7-90f8-fb97b9188fc3")
    @Override
    public Object visitExpansionNode(ExpansionNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("410e9ce7-127f-4682-8392-b73ef11227c0")
    @Override
    public Object visitExpansionRegion(ExpansionRegion obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("24dbfb31-cc61-4b89-b6f5-d6335a055861")
    @Override
    public Object visitFinalNode(FinalNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("f2c9e9c5-69ea-4e35-96bf-fac93315859e")
    @Override
    public Object visitFlowFinalNode(FlowFinalNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("041a9a55-f38b-423f-97e3-ccf9a144ac7e")
    @Override
    public Object visitForkJoinNode(ForkJoinNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("f8d6df9f-b48e-4830-9796-9a2855d79389")
    @Override
    public Object visitInitialNode(InitialNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("813fb722-2978-4e1b-bd49-8d0a9d7a20c3")
    @Override
    public Object visitInputPin(InputPin obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("4ae31b25-05d9-4f87-979b-ed4f3ab09562")
    @Override
    public Object visitInstanceNode(InstanceNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("7c40bc8a-73a8-47f2-8e52-0201d69fba91")
    @Override
    public Object visitInterruptibleActivityRegion(InterruptibleActivityRegion obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("45e029ae-55ce-4e1f-9734-7703dc10348f")
    @Override
    public Object visitLoopNode(LoopNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("74200ffe-8faa-408f-9f50-06a3d2c29cb7")
    @Override
    public Object visitMessageFlow(MessageFlow obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("74d9325e-ff8b-4a35-b9ee-39990ca6ea41")
    @Override
    public Object visitObjectFlow(ObjectFlow obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("849f3553-7172-48cc-a598-d10e80fb25fe")
    @Override
    public Object visitObjectNode(ObjectNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("3cf29808-61c7-4b1e-83be-a268043eedc4")
    @Override
    public Object visitOpaqueAction(OpaqueAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("a51b5d50-6c87-4435-a82b-65b173770639")
    @Override
    public Object visitOutputPin(OutputPin obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("cc1a3e4f-e6d2-4ca6-b4ce-87910ff975b0")
    @Override
    public Object visitPin(Pin obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("ce05e38e-494e-438a-b806-f69bba9af45c")
    @Override
    public Object visitSendSignalAction(SendSignalAction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("a50221d2-8915-482f-9253-c5278b122068")
    @Override
    public Object visitStructuredActivityNode(StructuredActivityNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("9886fd43-0912-448b-854d-bd3f49baf964")
    @Override
    public Object visitValuePin(ValuePin obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("59fbea77-14ba-4aba-8f6f-893877dacc95")
    @Override
    public Object visitBehaviorParameter(BehaviorParameter obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("06271554-538d-43c5-b72a-bf1460b2ed33")
    @Override
    public Object visitOpaqueBehavior(OpaqueBehavior obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("e0c26e56-48de-4129-add3-3342d890b580")
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

    @objid ("dbb22490-8fef-41d1-a69e-1fbe469ec48b")
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

    @objid ("0a10f312-84ee-4d2d-92e4-a1cae7ef9b85")
    @Override
    public Object visitCombinedFragment(CombinedFragment obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("031c7c8d-e059-4434-a8bd-4893411b5f40")
    @Override
    public Object visitDurationConstraint(DurationConstraint obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("e671f8b0-84cc-4ff7-bd77-f59000a981e7")
    @Override
    public Object visitExecutionOccurenceSpecification(ExecutionOccurenceSpecification obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("52801a77-4a02-46bf-aa41-0079c9812bc2")
    @Override
    public Object visitExecutionSpecification(ExecutionSpecification obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("4ba90b20-45ba-4281-ac90-b8a017cbdcfa")
    @Override
    public Object visitGate(Gate obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("e997813e-6b39-408b-a526-495c2ebadc3f")
    @Override
    public Object visitGeneralOrdering(GeneralOrdering obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("57bf317c-dd0d-48ef-a50b-cfe48f089069")
    @Override
    public Object visitInteractionFragment(InteractionFragment obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("526b4470-0db2-4d8d-88ba-14c76339604c")
    @Override
    public Object visitInteractionOperand(InteractionOperand obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("ae050362-8c27-41c0-b167-c2105940620c")
    @Override
    public Object visitInteractionUse(InteractionUse obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("26538f15-bf97-4702-851d-72491b04d7f4")
    @Override
    public Object visitLifeline(Lifeline obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("5df05332-b4b7-4eb2-b429-10f9cc379aaa")
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

    @objid ("7521e831-b741-4146-8648-d1292738d2ac")
    @Override
    public Object visitMessageEnd(MessageEnd obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("5330b67a-e673-4525-a1bf-1895a4d872a7")
    @Override
    public Object visitOccurrenceSpecification(OccurrenceSpecification obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("21d1efb4-3052-4c20-9b20-21c9dfb862ed")
    @Override
    public Object visitPartDecomposition(PartDecomposition obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("ae7bb448-28df-46b2-b4f3-677c9427418e")
    @Override
    public Object visitStateInvariant(StateInvariant obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("32cda63f-37c5-48cf-a022-96459849cbfa")
    @Override
    public Object visitTerminateSpecification(TerminateSpecification obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("548557e3-e9e6-433a-bb06-8a0509782603")
    @Override
    public Object visitAbstractPseudoState(AbstractPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("1ac0df78-941e-4bbb-b248-848df459633f")
    @Override
    public Object visitChoicePseudoState(ChoicePseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("9c71360a-52b1-4821-b21d-1652676b32f7")
    @Override
    public Object visitConnectionPointReference(ConnectionPointReference obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("23cb2ab4-958a-42e9-821b-53c765e3fa4f")
    @Override
    public Object visitDeepHistoryPseudoState(DeepHistoryPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("9620372d-9332-4c22-9707-2a82e07fed8a")
    @Override
    public Object visitEntryPointPseudoState(EntryPointPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("498f937a-15e3-4e49-a7e9-2ed13901dfda")
    @Override
    public Object visitExitPointPseudoState(ExitPointPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("e33ce5b7-5ee2-4ea4-9a9e-10fb593bab74")
    @Override
    public Object visitForkPseudoState(ForkPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("be142e73-7895-426f-a026-effc7bc52f10")
    @Override
    public Object visitInitialPseudoState(InitialPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("90eea3c9-e34c-442d-8578-1c939a934749")
    @Override
    public Object visitInternalTransition(InternalTransition obj) {
        return visitTransition(obj);
    }

    @objid ("c5f7cc5c-69b4-4ba5-bdf4-e91a5f711b89")
    @Override
    public Object visitJoinPseudoState(JoinPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("0bab69a0-8ee0-4eb1-ac47-ecb4d163be31")
    @Override
    public Object visitJunctionPseudoState(JunctionPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("323a511b-435d-4f2c-8421-47185b201129")
    @Override
    public Object visitShallowHistoryPseudoState(ShallowHistoryPseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("26440808-e1cd-421d-bef8-a5fe7decc9ba")
    @Override
    public Object visitTerminatePseudoState(TerminatePseudoState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("21f92485-c728-470b-83ca-364c3bd1eea8")
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

    @objid ("d9922b1c-62f1-429f-9f22-f54066b244a1")
    @Override
    public Object visitFinalState(FinalState obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("4c7032d7-a9ff-4746-97a5-2ab413095e13")
    @Override
    public Object visitRegion(Region obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("60238d27-f48f-4409-8a81-7deed8713f95")
    @Override
    public Object visitActor(Actor obj) {
        return visitGeneralClass(obj);
    }

    @objid ("44eb40fb-24f2-4768-bc24-1316ee9ecaf1")
    @Override
    public Object visitUseCaseDependency(UseCaseDependency theUseCaseDependency) {
        NSUseUtils.dereferenceNSUsesCausedBy(theUseCaseDependency);
        
        NameSpace src = theUseCaseDependency.getOrigin();
        NameSpace dest = theUseCaseDependency.getTarget();
        
        addNSUses(src, dest, theUseCaseDependency);
        return null;
    }

    @objid ("c0f71bb7-9b8f-4084-912b-bc7432392c43")
    @Override
    public Object visitInformationFlow(InformationFlow obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("d64d892f-01eb-4753-bec7-5c8e14b453ff")
    @Override
    public Object visitInformationItem(InformationItem obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("9fd3ba0a-a1ae-4148-be3b-e4231ac46e60")
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

    @objid ("8bbba3f4-4e55-4252-8b29-d86eff4ddcec")
    @Override
    public Object visitCommunicationInteraction(CommunicationInteraction obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("58e78599-e21a-4b9c-a8fc-c8349eae2f9e")
    @Override
    public Object visitCommunicationNode(CommunicationNode obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("27f8419f-d17b-4e55-9876-74b16bf54d69")
    @Override
    public Object visitCommunicationMessage(CommunicationMessage obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("99d79056-9ac9-4226-9139-66bbfde71d59")
    @Override
    public Object visitCommunicationChannel(CommunicationChannel obj) {
        NSUseUtils.dereferenceNSUsesCausedBy(obj);
        return null;
    }

    @objid ("39a15ca0-dcf4-49f8-94d2-71aa75c459b0")
    private void addNSUses(NameSpace aSource, NameSpace aDest, Element aCause) {
        if (aSource != null && aDest != null && aCause != null) {
            NamespaceUse use = addNSUse(aSource, aDest, aCause);
            if (use != null) {
                visitNamespaceUse(use);
            }
        }
    }

    /**
     * Return null if an existing NSU has been used
     * @param aSource
     * @param aDest
     * @param aCause @return
     */
    @objid ("996958d8-b316-40e8-bb1e-06f788e76256")
    private NamespaceUse addNSUse(NameSpace aSource, NameSpace aDest, Element aCause) {
        if (Vaudit.LOG.isDebugEnabled())
            Vaudit.LOG.debug("\t\taddNSUse %s\t%s\t cause=%s", aSource.getName(), aDest.getName(), aCause.toString());
        
        NamespaceUse aUse = null;
        if (aSource != aDest) {
            for (NamespaceUse ns : aSource.getUsedNsu()) {
                if (ns.isValid() && ns.getUsed() == aDest) {
                    ns.getCause().add(aCause);
                    aUse = ns;
                    return null;
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

    @objid ("5a1ea0c5-7772-4b3e-868b-3bfedc9e1c06")
    public void buildFor(Element e) {
        e.accept(this);
    }

}
