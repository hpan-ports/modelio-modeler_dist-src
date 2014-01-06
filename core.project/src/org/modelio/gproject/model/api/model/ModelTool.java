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
                                    

package org.modelio.gproject.model.api.model;

import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.gproject.model.copy.CopyMachine;
import org.modelio.gproject.model.facilities.CompositionInitializer;
import org.modelio.gproject.model.importer.core.IImportReport;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLane;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityAction;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityEdge;
import org.modelio.metamodel.uml.behavior.activityModel.ActivityNode;
import org.modelio.metamodel.uml.behavior.activityModel.ControlFlow;
import org.modelio.metamodel.uml.behavior.activityModel.ExceptionHandler;
import org.modelio.metamodel.uml.behavior.activityModel.InputPin;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationChannel;
import org.modelio.metamodel.uml.behavior.communicationModel.CommunicationNode;
import org.modelio.metamodel.uml.behavior.interactionModel.Message;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageEnd;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCase;
import org.modelio.metamodel.uml.behavior.usecaseModel.UseCaseDependency;
import org.modelio.metamodel.uml.informationFlow.DataFlow;
import org.modelio.metamodel.uml.informationFlow.InformationFlow;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Artifact;
import org.modelio.metamodel.uml.statik.AssociationEnd;
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.metamodel.uml.statik.Binding;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.Connector;
import org.modelio.metamodel.uml.statik.ConnectorEnd;
import org.modelio.metamodel.uml.statik.ElementImport;
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
import org.modelio.metamodel.uml.statik.Operation;
import org.modelio.metamodel.uml.statik.Package;
import org.modelio.metamodel.uml.statik.PackageImport;
import org.modelio.metamodel.uml.statik.PackageMerge;
import org.modelio.metamodel.uml.statik.Port;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RaisedException;
import org.modelio.metamodel.uml.statik.RequiredInterface;
import org.modelio.metamodel.uml.statik.TemplateBinding;
import org.modelio.metamodel.visitors.DefaultModelVisitor;
import org.modelio.vcore.session.impl.CoreSession;
import org.modelio.vcore.smkernel.SmDepVal;
import org.modelio.vcore.smkernel.SmObjectImpl;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Implementation of {@link IModelTool}.
 */
@objid ("7e9c041b-1eb2-11e2-8009-002564c97630")
public class ModelTool implements IModelTool {
    @objid ("7e9c041d-1eb2-11e2-8009-002564c97630")
    private final GetTargetVisitor getTargetVisitor = new GetTargetVisitor();

    @objid ("7e9c041f-1eb2-11e2-8009-002564c97630")
    private final GetSourceVisitor getSourceVisitor = new GetSourceVisitor();

    @objid ("7ea5897f-1eb2-11e2-8009-002564c97630")
    private final ChangeDestinationVisitor changeDestVisitor = new ChangeDestinationVisitor();

    @objid ("7ea58980-1eb2-11e2-8009-002564c97630")
    private final ChangeSourceVisitor changeSourceVisitor = new ChangeSourceVisitor();

    @objid ("7e9c0421-1eb2-11e2-8009-002564c97630")
    @Override
    public MObject getSource(MObject aLink) {
        return (MObject) aLink.accept(this.getSourceVisitor);
    }

    @objid ("7e9c0427-1eb2-11e2-8009-002564c97630")
    @Override
    public MObject getTarget(MObject aLink) {
        return (MObject) aLink.accept(this.getTargetVisitor);
    }

    @objid ("7ea58981-1eb2-11e2-8009-002564c97630")
    @Override
    public void setSource(MObject link, final MObject oldSource, MObject newSource) throws IllegalArgumentException {
        this.changeSourceVisitor.oldSource = oldSource;
        this.changeSourceVisitor.newSource = newSource;
        try {
            link.accept(this.changeSourceVisitor);
        } catch (final ClassCastException e) {
            throw new IllegalArgumentException(newSource + " is not a legal source for " + link, e);
        }
    }

    @objid ("7ea58988-1eb2-11e2-8009-002564c97630")
    @Override
    public void setTarget(MObject link, final MObject oldTarget, MObject newTarget) throws IllegalArgumentException {
        this.changeDestVisitor.oldDest = oldTarget;
        this.changeDestVisitor.newDest = newTarget;
        try {
            link.accept(this.changeDestVisitor);
        } catch (final ClassCastException e) {
            throw new IllegalArgumentException(newTarget + " is not a legal target for " + link, e);
        }
    }

    @objid ("14bc773f-152b-412a-a074-1fb7378b9343")
    @Override
    public MObject cloneElement(MObject toClone) {
        return copyElement(toClone, toClone.getCompositionOwner());
    }

    @objid ("aa9b2f1b-b769-4d7c-ba3c-cb9d43bf1eb1")
    @Override
    public List<? extends MObject> cloneElements(List<? extends MObject> toClone) {
        return copyElements(toClone, toClone.get(0).getCompositionOwner());
    }

    @objid ("9257f8e2-f213-4ff3-a3ee-158b04d45899")
    @Override
    public MObject copyElement(MObject toCopy, MObject target) {
        List<MObject> elementsToCopy = new ArrayList<>();
        elementsToCopy.add(toCopy);
        
        List<? extends MObject> copiedElements = copyElements(elementsToCopy, target);
        if (copiedElements.size() > 0) {
            return copiedElements.get(0);
        }
        return null;
    }

    @objid ("026b25d0-9037-416b-91c6-254d3f3e0983")
    @Override
    public List<MObject> copyElements(List<? extends MObject> toCopy, MObject target) {
        CoreSession localSession = CoreSession.getSession(target);
        CoreSession refSession = null;
        
        List<SmObjectImpl> smObjectsToCopy = new ArrayList<>();
        for (MObject mObject : toCopy) {
            smObjectsToCopy.add((SmObjectImpl) mObject);
        
            if (refSession == null) {
                refSession = CoreSession.getSession(mObject);
            }
        }
        
        List<MObject> ret = new ArrayList<>();
        
        CopyMachine machine = new CopyMachine();
        final IImportReport report = machine.execute(localSession, (SmObjectImpl) target, refSession, smObjectsToCopy);
        
        // Fill the returned list in the appropriate order
        for (MObject ref : toCopy) {
            ret.add(report.getCreatedObject((SmObjectImpl) ref));
        }
        return ret;
    }

    @objid ("01f41c74-0000-00ef-0000-000000000000")
    private void moveTo(SmObjectImpl smObject, CompositionInitializer parentInitiliazer, SmObjectImpl oldParentHint) {
        SmDepVal compositionDepVal = smObject.getCompositionRelation();
        
        boolean ok;
        
        if (compositionDepVal.value != null) {
            if (compositionDepVal.dep.isMultiple()) {
                ok = smObject.eraseDepVal(compositionDepVal.dep, oldParentHint);
            } else {
                ok = smObject.appendDepVal (compositionDepVal.dep, null);
            }
        } else {
            ok = true;
        }
        
        if (ok) {
        
            if (!parentInitiliazer.execute (smObject, compositionDepVal.dep)) {
                // TODO error message
                //GetAbsoluteSymbol sym;
                //String msg; 
                //         msg.pformat (RC2::getRC("messages.properties").getString("CannotMoveObject").c_str(),
                //         sym.get(smObject).c_str(),
                //         RC2::getRC("classof.properties").getString(smObject.ClassOf.Name).c_str(),
                //         sym.get(newParent).c_str(),
                //         RC2::getRC("classof.properties").getString(newParent.ClassOf.Name).c_str());
                //        
                //         OLog::error(msg);
        
                throw new RuntimeException("CannotMoveObject");
            }
        }
    }

    @objid ("01f41c74-0000-00fe-0000-000000000000")
    @Override
    public void moveElements(List<? extends MObject> toMove, MObject newParent, MObject oldParentHint) {
        CompositionInitializer parentInitiliazer = new CompositionInitializer((SmObjectImpl) newParent);
        
        for (MObject elementToMove : toMove) {
            moveTo((SmObjectImpl) elementToMove, parentInitiliazer, (SmObjectImpl) oldParentHint);
        }
    }

    @objid ("a03dba89-24d0-11e2-ba1c-002564c97630")
    @Override
    public void moveElement(MObject toMove, MObject newParent, MObject oldParentHint) {
        CompositionInitializer parentInitiliazer = new CompositionInitializer((SmObjectImpl) newParent);
        moveTo((SmObjectImpl) toMove, parentInitiliazer, (SmObjectImpl) oldParentHint);
    }

    @objid ("514cfe7f-28b1-4637-bfd1-3cf154c66a04")
    @Override
    public List<List<? extends MObject>> copyElements(List<List<? extends MObject>> toCopy, List<MObject> target) {
        CoreSession localSession = null;
        CoreSession refSession = null;
        
        for (MObject mObject : target) {
            localSession = CoreSession.getSession(mObject);
            break;
        }
        
        List<List<SmObjectImpl>> listsToCopy = new ArrayList<>();
        for (List<? extends MObject> list : toCopy) {
            List<SmObjectImpl> smObjectsToCopy = new ArrayList<>();
            
            for (MObject mObject : list) {
                smObjectsToCopy.add((SmObjectImpl) mObject);
        
                if (refSession == null) {
                    refSession = CoreSession.getSession(mObject);
                }
            }
            
            listsToCopy.add(smObjectsToCopy);
        }
        
        List<SmObjectImpl> targetList = new ArrayList<>();
        for (MObject mObject : target) {
            targetList.add((SmObjectImpl) mObject);
        }
        
        List<List<? extends MObject>> ret = new ArrayList<>();
        
        CopyMachine machine = new CopyMachine();
        final IImportReport report = machine.execute(localSession, targetList, refSession, listsToCopy);
        
        // Fill the returned list in the appropriate order
        for (List<? extends MObject> list : toCopy) {
            List<MObject> copies = new ArrayList<>();
            
            for (MObject ref : list) {
                copies.add(report.getCreatedObject((SmObjectImpl) ref));
            }
            
            ret.add(copies);
        }
        return ret;
    }

    @objid ("7e9c042d-1eb2-11e2-8009-002564c97630")
    static class GetSourceVisitor extends DefaultModelVisitor {
        @objid ("7e9c0430-1eb2-11e2-8009-002564c97630")
        public GetSourceVisitor() {
        }

        @objid ("7e9c0433-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitActivityEdge(ActivityEdge theActivityEdge) {
            return theActivityEdge.getSource();
        }

        @objid ("7e9c0439-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitAssociationEnd(AssociationEnd theAssociationEnd) {
            if (theAssociationEnd.isNavigable()) {
                return theAssociationEnd.getSource();
            } else {
                return theAssociationEnd.getOpposite().getTarget();
            }
        }

        @objid ("7e9c043f-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBinding(Binding theBinding) {
            MObject src = theBinding.getRole();
            if (src == null) {
                src = theBinding.getConnectorRole();
            }
            if (src == null) {
                src = theBinding.getConnectorEndRole();
            }
            return src;
        }

        @objid ("7e9c0445-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitClassAssociation(final ClassAssociation theClassAssociation) {
            return theClassAssociation.getAssociationPart();
        }

        @objid ("7e9c044c-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitControlFlow(ControlFlow theControlFlow) {
            return visitActivityEdge(theControlFlow);
        }

        @objid ("7e9e6556-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitDataFlow(DataFlow theDataFlow) {
            return theDataFlow.getOwner();
        }

        @objid ("7e9e655c-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitDependency(Dependency theDependency) {
            return theDependency.getImpacted();
        }

        @objid ("7e9e6562-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitElementImport(ElementImport theElementImport) {
            ModelElement ret = theElementImport.getImportingNameSpace();
            if (ret == null) {
                ret = theElementImport.getImportingOperation();
            }
            return ret;
        }

        @objid ("7e9e6568-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitExceptionHandler(final ExceptionHandler theExceptionHandler) {
            return theExceptionHandler.getProtectedNode();
        }

        @objid ("7e9e656f-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitGeneralization(Generalization theGeneralization) {
            return theGeneralization.getSubType();
        }

        @objid ("7e9e6575-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitInformationFlow(InformationFlow theInformationFlow) {
            final List<ModelElement> ret = theInformationFlow.getInformationSource();
            if (ret.isEmpty()) {
                return null;
            } else if (ret.size() == 1) {
                return ret.get(0);
            } else {
                throw new UnsupportedOperationException(theInformationFlow + " has " + ret.size() + " sources.");
            }
        }

        @objid ("7e9e657a-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitInterfaceRealization(InterfaceRealization theInterfaceRealization) {
            return theInterfaceRealization.getImplementer();
        }

        @objid ("7e9e6580-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitLinkEnd(LinkEnd theLinkEnd) {
            if (theLinkEnd.isNavigable()) {
                return theLinkEnd.getSource();
            } else {
                return theLinkEnd.getOpposite().getTarget();
            }
        }

        @objid ("7e9e6586-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitManifestation(Manifestation theManifestation) {
            return theManifestation.getOwner();
        }

        @objid ("7e9e658c-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitMessage(Message theMessage) {
            return theMessage.getSendEvent();
        }

        @objid ("7e9e6592-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitModelElement(ModelElement theModelElement) {
            throw new IllegalArgumentException(theModelElement + " is not a link element.");
        }

        @objid ("7e9e6597-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitNamespaceUse(NamespaceUse theNamespaceUse) {
            return theNamespaceUse.getUser();
        }

        @objid ("7e9e659d-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitPackageImport(PackageImport thePackageImport) {
            ModelElement ret = thePackageImport.getImportingNameSpace();
            if (ret == null) {
                ret = thePackageImport.getImportingOperation();
            }
            return ret;
        }

        @objid ("7e9e65a3-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitPackageMerge(PackageMerge thePackageMerge) {
            return thePackageMerge.getReceivingPackage();
        }

        @objid ("7e9e65a9-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitRaisedException(RaisedException theRaisedException) {
            return theRaisedException.getThrower();
        }

        @objid ("7e9e65af-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitTemplateBinding(TemplateBinding theTemplateBinding) {
            ModelElement ret = theTemplateBinding.getBoundElement();
            if (ret == null) {
                ret = theTemplateBinding.getBoundOperation();
            }
            return ret;
        }

        @objid ("7ea0c6b6-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitTransition(Transition theTransition) {
            return theTransition.getSource();
        }

        @objid ("7ea0c6bc-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitUseCaseDependency(final UseCaseDependency theUseCaseDependency) {
            return theUseCaseDependency.getOrigin();
        }

        @objid ("7ea0c6c3-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBpmnSequenceFlow(final BpmnSequenceFlow theBpmnSequenceFlow) {
            return theBpmnSequenceFlow.getSourceRef();
        }

        @objid ("7ea0c6ca-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBpmnMessageFlow(final BpmnMessageFlow theBpmnMessageFlow) {
            return theBpmnMessageFlow.getSourceRef();
        }

        @objid ("7ea0c6d1-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBpmnDataAssociation(final BpmnDataAssociation theBpmnDataAssociation) {
            if (theBpmnDataAssociation.getSourceRef().size() > 0) {
                return theBpmnDataAssociation.getSourceRef().get(0);
            }
            
            if (theBpmnDataAssociation.getEndingActivity() != null) {
                return theBpmnDataAssociation.getEndingActivity();
            }
            
            if (theBpmnDataAssociation.getStartingActivity() != null) {
                return theBpmnDataAssociation.getStartingActivity();
            }
            
            if (theBpmnDataAssociation.getEndingEvent() != null) {
                return theBpmnDataAssociation.getEndingEvent();
            }
            return null;
        }

        @objid ("37c51951-7358-4f9c-aa04-c8a47aff2987")
        @Override
        public Object visitNaryAssociationEnd(NaryAssociationEnd theNaryAssociationEnd) {
            return theNaryAssociationEnd.getNaryAssociation();
        }

        @objid ("bc6f440d-d6c6-49ab-ac8f-d1dcfb933ece")
        @Override
        public Object visitNaryLinkEnd(NaryLinkEnd theNaryLinkEnd) {
            return theNaryLinkEnd.getNaryLink();
        }

        @objid ("01bfbe45-b1cc-4960-a4e3-74fd07731a83")
        @Override
        public Object visitCommunicationChannel(CommunicationChannel theChannel) {
            return theChannel.getStart();
        }

    }

    @objid ("7ea0c6d8-1eb2-11e2-8009-002564c97630")
    static class GetTargetVisitor extends DefaultModelVisitor {
        @objid ("7ea0c6db-1eb2-11e2-8009-002564c97630")
        public GetTargetVisitor() {
        }

        @objid ("7ea0c6de-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitActivityEdge(ActivityEdge theActivityEdge) {
            return theActivityEdge.getTarget();
        }

        @objid ("7ea0c6e4-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitAssociationEnd(AssociationEnd theAssociationEnd) {
            if (theAssociationEnd.isNavigable()) {
                return theAssociationEnd.getTarget();
            } else {
                return theAssociationEnd.getOpposite().getSource();
            }
        }

        @objid ("7ea0c6ea-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBinding(Binding theBinding) {
            return theBinding.getRepresentedFeature();
        }

        @objid ("7ea0c6f0-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitClassAssociation(final ClassAssociation theClassAssociation) {
            return theClassAssociation.getClassPart();
        }

        @objid ("7ea0c6f7-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitDataFlow(DataFlow theDataFlow) {
            return theDataFlow.getDestination();
        }

        @objid ("7ea0c6fd-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitDependency(Dependency theDependency) {
            return theDependency.getDependsOn();
        }

        @objid ("7ea0c703-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitElementImport(ElementImport theElementImport) {
            return theElementImport.getImportedElement();
        }

        @objid ("7ea0c709-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitExceptionHandler(final ExceptionHandler theExceptionHandler) {
            return theExceptionHandler.getExceptionInput();
        }

        @objid ("7ea0c710-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitGeneralization(Generalization theGeneralization) {
            return theGeneralization.getSuperType();
        }

        @objid ("7ea32818-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitInformationFlow(InformationFlow theInformationFlow) {
            final List<ModelElement> ret = theInformationFlow.getInformationTarget();
            if (ret.isEmpty()) {
                return null;
            } else if (ret.size() == 1) {
                return ret.get(0);
            } else {
                throw new UnsupportedOperationException(theInformationFlow + " has " + ret.size() + " targets.");
            }
        }

        @objid ("7ea3281d-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitInterfaceRealization(InterfaceRealization theInterfaceRealization) {
            return theInterfaceRealization.getImplemented();
        }

        @objid ("7ea32823-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitLinkEnd(LinkEnd theLinkEnd) {
            if (theLinkEnd.isNavigable()) {
                return theLinkEnd.getTarget();
            } else {
                return theLinkEnd.getOpposite().getSource();
            }
        }

        @objid ("7ea32829-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitManifestation(Manifestation theManifestation) {
            return theManifestation.getUtilizedElement();
        }

        @objid ("7ea3282f-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitMessage(Message theMessage) {
            return theMessage.getReceiveEvent();
        }

        @objid ("7ea32835-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitModelElement(ModelElement theModelElement) {
            throw new IllegalArgumentException(theModelElement + " is not a link element.");
        }

        @objid ("7ea3283a-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitNamespaceUse(NamespaceUse theNamespaceUse) {
            return theNamespaceUse.getUsed();
        }

        @objid ("7ea32840-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitPackageImport(PackageImport thePackageImport) {
            return thePackageImport.getImportedPackage();
        }

        @objid ("7ea32846-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitPackageMerge(PackageMerge thePackageMerge) {
            return thePackageMerge.getMergedPackage();
        }

        @objid ("7ea3284c-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitRaisedException(RaisedException theRaisedException) {
            return theRaisedException.getThrownType();
        }

        @objid ("7ea32852-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitTemplateBinding(TemplateBinding theTemplateBinding) {
            final ModelElement ret = theTemplateBinding.getInstanciatedTemplate();
            if (ret == null) {
                return theTemplateBinding.getInstanciatedTemplateOperation();
            }
            return ret;
        }

        @objid ("7ea32858-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitTransition(Transition theTransition) {
            return theTransition.getTarget();
        }

        @objid ("7ea3285e-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitUseCaseDependency(final UseCaseDependency theUseCaseDependency) {
            return theUseCaseDependency.getTarget();
        }

        @objid ("7ea32865-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBpmnSequenceFlow(final BpmnSequenceFlow theBpmnSequenceFlow) {
            return theBpmnSequenceFlow.getTargetRef();
        }

        @objid ("7ea3286c-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBpmnMessageFlow(final BpmnMessageFlow theBpmnMessageFlow) {
            return theBpmnMessageFlow.getTargetRef();
        }

        @objid ("7ea58976-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBpmnDataAssociation(final BpmnDataAssociation theBpmnDataAssociation) {
            if (theBpmnDataAssociation.getTargetRef() != null) {
                return theBpmnDataAssociation.getTargetRef();
            }
            
            if (theBpmnDataAssociation.getEndingActivity() != null) {
                return theBpmnDataAssociation.getEndingActivity();
            }
            
            if (theBpmnDataAssociation.getStartingActivity() != null) {
                return theBpmnDataAssociation.getStartingActivity();
            }
            
            if (theBpmnDataAssociation.getStartingEvent() != null) {
                return theBpmnDataAssociation.getStartingEvent();
            }
            return null;
        }

        @objid ("85fd4ae3-0ab5-401e-9415-7bf89d142f1f")
        @Override
        public Object visitNaryAssociationEnd(NaryAssociationEnd theNaryAssociationEnd) {
            return theNaryAssociationEnd.getOwner();
        }

        @objid ("8a38da19-257d-4286-b716-c350120eab52")
        @Override
        public Object visitNaryLinkEnd(NaryLinkEnd theNaryLinkEnd) {
            return theNaryLinkEnd.getSource();
        }

        @objid ("8d6d1164-5faf-4768-b890-7dbb604eba11")
        @Override
        public Object visitCommunicationChannel(CommunicationChannel theChannel) {
            return theChannel.getEnd();
        }

    }

    @objid ("7ea5898f-1eb2-11e2-8009-002564c97630")
    static class ChangeSourceVisitor extends DefaultModelVisitor {
        @objid ("7ea58992-1eb2-11e2-8009-002564c97630")
        public MObject newSource;

        @objid ("7ea58993-1eb2-11e2-8009-002564c97630")
        public MObject oldSource;

        @objid ("7ea58994-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitActivityEdge(ActivityEdge theActivityEdge) {
            theActivityEdge.setSource((ActivityNode) this.newSource);
            return null;
        }

        @objid ("7ea5899a-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitAssociationEnd(AssociationEnd theAssociationEnd) {
            if (theAssociationEnd.getOpposite().isNavigable()) {
                theAssociationEnd.getOpposite().setTarget((Classifier) this.newSource, true);
            } else {
                theAssociationEnd.setSource((Classifier) this.newSource, true);
            }
            return null;
        }

        @objid ("7ea589a0-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBinding(Binding theBinding) {
            if (this.newSource instanceof BindableInstance) {
                theBinding.setRole((BindableInstance) this.newSource);
            } else if (this.newSource instanceof NaryConnector) {
                theBinding.setConnectorRole((NaryConnector) this.newSource);
            } else if (this.newSource instanceof Connector) {
                theBinding.setConnectorEndRole((ConnectorEnd) this.newSource);
            } else if (this.newSource instanceof ConnectorEnd) {
                theBinding.setConnectorEndRole((ConnectorEnd) this.newSource);
            } else {
                throw new IllegalArgumentException(this.newSource + " cannot be the source of " + theBinding);
            }
            return null;
        }

        @objid ("7ea589a6-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBpmnDataAssociation(final BpmnDataAssociation theBpmnDataAssociation) {
            if (this.newSource instanceof BpmnActivity) {
            
                if (theBpmnDataAssociation.getTargetRef() == null) {
                    return null;
                }
            
                theBpmnDataAssociation.setStartingActivity((BpmnActivity) this.newSource);
                for (final BpmnItemAwareElement old : theBpmnDataAssociation.getSourceRef()) {
                    theBpmnDataAssociation.getSourceRef().remove(old);
                }
                theBpmnDataAssociation.setStartingEvent(null);
            } else if (this.newSource instanceof BpmnThrowEvent) {
            
                if (theBpmnDataAssociation.getTargetRef() == null) {
                    return null;
                }
            
                theBpmnDataAssociation.setStartingEvent((BpmnThrowEvent) this.newSource);
                for (final BpmnItemAwareElement old : theBpmnDataAssociation.getSourceRef()) {
                    theBpmnDataAssociation.getSourceRef().remove(old);
                }
            
                theBpmnDataAssociation.setStartingActivity(null);
            } else if (this.newSource instanceof BpmnItemAwareElement) {
            
                if (theBpmnDataAssociation.getEndingActivity() == null && theBpmnDataAssociation.getEndingEvent() == null) {
                    return null;
                }
            
                for (final BpmnItemAwareElement old : theBpmnDataAssociation.getSourceRef()) {
                    theBpmnDataAssociation.getSourceRef().remove(old);
                }
            
                theBpmnDataAssociation.getSourceRef().add((BpmnItemAwareElement) this.newSource);
                theBpmnDataAssociation.setStartingEvent(null);
                theBpmnDataAssociation.setStartingActivity(null);
            }
            return null;
        }

        @objid ("7ea589ad-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBpmnMessageFlow(final BpmnMessageFlow theBpmnMessageFlow) {
            if (this.newSource instanceof BpmnParticipant || this.newSource instanceof BpmnEvent
                    || this.newSource instanceof BpmnActivity || this.newSource instanceof BpmnLane
                    || this.newSource instanceof BpmnTask) {
                theBpmnMessageFlow.setSourceRef((BpmnBaseElement) this.newSource);
            }
            return null;
        }

        @objid ("7ea589b4-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBpmnSequenceFlow(final BpmnSequenceFlow theBpmnSequenceFlow) {
            if (this.newSource instanceof BpmnFlowNode) {
                theBpmnSequenceFlow.setSourceRef((BpmnFlowNode) this.newSource);
            }
            return null;
        }

        @objid ("7ea589bb-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitClassAssociation(final ClassAssociation theClassAssociation) {
            theClassAssociation.setNaryAssociationPart((NaryAssociation) this.newSource);
            return null;
        }

        @objid ("7ea589c2-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitDataFlow(DataFlow theDataFlow) {
            theDataFlow.setOwner((NameSpace) this.newSource);
            return null;
        }

        @objid ("7ea589c8-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitDependency(Dependency theDependency) {
            theDependency.setImpacted((ModelElement) this.newSource);
            return null;
        }

        @objid ("7ea589ce-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitElementImport(ElementImport theElementImport) {
            if (this.newSource instanceof NameSpace) {
                theElementImport.setImportingNameSpace((NameSpace) this.newSource);
            } else if (this.newSource instanceof Operation) {
                theElementImport.setImportingOperation((Operation) this.newSource);
            } else {
                throw new IllegalArgumentException(this.newSource + " cannot be the source of " + theElementImport);
            }
            return null;
        }

        @objid ("7ea7ead6-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitExceptionHandler(final ExceptionHandler theExceptionHandler) {
            theExceptionHandler.setProtectedNode((ActivityAction) this.newSource);
            return null;
        }

        @objid ("7ea7eadd-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitGeneralization(Generalization theGeneralization) {
            theGeneralization.setSubType((NameSpace) this.newSource);
            return null;
        }

        @objid ("7ea7eae3-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitInformationFlow(InformationFlow theInformationFlow) {
            for (final ModelElement s : theInformationFlow.getInformationSource()) {
                theInformationFlow.getInformationSource().remove(s);
            }
            
            theInformationFlow.getInformationSource().add((ModelElement) this.newSource);
            return null;
        }

        @objid ("7ea7eae9-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitInterfaceRealization(InterfaceRealization theInterfaceRealization) {
            theInterfaceRealization.setImplementer((NameSpace) this.newSource);
            return null;
        }

        @objid ("7ea7eaef-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitLinkEnd(LinkEnd theLinkEnd) {
            if (theLinkEnd.getOpposite().isNavigable()) {
                theLinkEnd.getOpposite().setTarget((Instance) this.newSource, true);
            } else {
                theLinkEnd.setSource((Instance) this.newSource, true);
            }
            return null;
        }

        @objid ("7ea7eaf5-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitManifestation(Manifestation theManifestation) {
            theManifestation.setOwner((Artifact) this.newSource);
            return null;
        }

        @objid ("7ea7eafb-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitMessage(Message theMessage) {
            theMessage.setSendEvent((MessageEnd) this.newSource);
            return null;
        }

        @objid ("7ea7eb01-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitModelElement(ModelElement theModelElement) {
            throw new IllegalArgumentException(theModelElement + " is not a link element.");
        }

        @objid ("7ea7eb06-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitNamespaceUse(NamespaceUse theNamespaceUse) {
            theNamespaceUse.setUser((NameSpace) this.newSource);
            return null;
        }

        @objid ("7ea7eb0c-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitPackageImport(PackageImport thePackageImport) {
            if (this.newSource instanceof NameSpace) {
                thePackageImport.setImportingNameSpace((NameSpace) this.newSource);
            } else if (this.newSource instanceof Operation) {
                thePackageImport.setImportingOperation((Operation) this.newSource);
            } else {
                throw new ClassCastException();
            }
            return null;
        }

        @objid ("7ea7eb12-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitPackageMerge(PackageMerge thePackageMerge) {
            thePackageMerge.setReceivingPackage((Package) this.newSource);
            return null;
        }

        @objid ("7ea7eb18-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitProvidedInterface(final ProvidedInterface theProvidedInterface) {
            theProvidedInterface.setProviding((Port) this.newSource);
            return null;
        }

        @objid ("7ea7eb1f-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitRaisedException(RaisedException theRaisedException) {
            theRaisedException.setThrower((Operation) this.newSource);
            return null;
        }

        @objid ("7ea7eb25-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitRequiredInterface(final RequiredInterface theRequiredInterface) {
            theRequiredInterface.setRequiring((Port) this.newSource);
            return null;
        }

        @objid ("7ea7eb2c-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitTemplateBinding(TemplateBinding theTemplateBinding) {
            if (theTemplateBinding instanceof NameSpace) {
                theTemplateBinding.setBoundElement((NameSpace) this.newSource);
            } else if (theTemplateBinding instanceof Operation) {
                theTemplateBinding.setBoundOperation((Operation) this.newSource);
            } else {
                throw new ClassCastException();
            }
            return null;
        }

        @objid ("7eaa4c36-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitTransition(Transition theTransition) {
            theTransition.setSource((StateVertex) this.newSource);
            return null;
        }

        @objid ("7eaa4c3c-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitUseCaseDependency(UseCaseDependency theUseCaseDependency) {
            theUseCaseDependency.setOrigin((UseCase) this.newSource);
            return null;
        }

        @objid ("2564905a-5eda-4ee9-9be0-4ce180516fa9")
        @Override
        public Object visitNaryAssociationEnd(NaryAssociationEnd theNaryAssociationEnd) {
            theNaryAssociationEnd.setOwner((Classifier) this.newSource);
            return null;
        }

        @objid ("521c6ce5-fda4-402c-a313-52c37195b327")
        @Override
        public Object visitNaryLinkEnd(NaryLinkEnd theNaryLinkEnd) {
            theNaryLinkEnd.setSource((Instance) this.newSource);
            return null;
        }

        @objid ("5b3e53a4-b654-4227-83ae-8fb0d8bec1bf")
        @Override
        public Object visitCommunicationChannel(CommunicationChannel theChannel) {
            theChannel.setStart((CommunicationNode) this.newSource);
            return null;
        }

    }

    @objid ("7eaa4c42-1eb2-11e2-8009-002564c97630")
    static class ChangeDestinationVisitor extends DefaultModelVisitor {
        @objid ("7eaa4c45-1eb2-11e2-8009-002564c97630")
        public MObject newDest;

        @objid ("7eaa4c46-1eb2-11e2-8009-002564c97630")
        public MObject oldDest;

        @objid ("7eaa4c47-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitActivityEdge(ActivityEdge theActivityEdge) {
            theActivityEdge.setTarget((ActivityNode) this.newDest);
            return null;
        }

        @objid ("7eaa4c4d-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitAssociationEnd(AssociationEnd theAssociationEnd) {
            if (theAssociationEnd.isNavigable()) {
                theAssociationEnd.setTarget((Classifier) this.newDest, true);
            } else {
                theAssociationEnd.getOpposite().setSource((Classifier) this.newDest, true);
            }
            return null;
        }

        @objid ("7eaa4c53-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBinding(Binding theBinding) {
            theBinding.setRepresentedFeature((ModelElement) this.newDest);
            return null;
        }

        @objid ("7eaa4c59-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBpmnDataAssociation(final BpmnDataAssociation theBpmnDataAssociation) {
            if (this.newDest instanceof BpmnActivity) {
            
                if (theBpmnDataAssociation.getSourceRef() == null) {
                    return null;
                }
            
                theBpmnDataAssociation.setEndingActivity((BpmnActivity) this.newDest);
                theBpmnDataAssociation.setEndingEvent((BpmnCatchEvent) null);
                theBpmnDataAssociation.setTargetRef(null);
            
                theBpmnDataAssociation.setStartingEvent(null);
            } else if (this.newDest instanceof BpmnCatchEvent) {
            
                if (theBpmnDataAssociation.getSourceRef() == null) {
                    return null;
                }
            
                theBpmnDataAssociation.setEndingEvent((BpmnCatchEvent) this.newDest);
                theBpmnDataAssociation.setTargetRef(null);
                theBpmnDataAssociation.setEndingActivity(null);
            } else if (this.newDest instanceof BpmnItemAwareElement) {
            
                if (theBpmnDataAssociation.getStartingActivity() == null && theBpmnDataAssociation.getStartingEvent() == null) {
                    return null;
                }
            
                theBpmnDataAssociation.setTargetRef((BpmnItemAwareElement) this.newDest);
                theBpmnDataAssociation.setEndingEvent(null);
                theBpmnDataAssociation.setEndingActivity(null);
            }
            return null;
        }

        @objid ("7eaa4c60-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBpmnMessageFlow(final BpmnMessageFlow theBpmnMessageFlow) {
            if (this.newDest instanceof BpmnParticipant || this.newDest instanceof BpmnEvent
                    || this.newDest instanceof BpmnActivity || this.newDest instanceof BpmnLane || this.newDest instanceof BpmnTask) {
                theBpmnMessageFlow.setTargetRef((BpmnBaseElement) this.newDest);
            }
            return null;
        }

        @objid ("7eaa4c67-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitBpmnSequenceFlow(final BpmnSequenceFlow theBpmnSequenceFlow) {
            if (this.newDest instanceof BpmnFlowNode) {
                theBpmnSequenceFlow.setTargetRef((BpmnFlowNode) this.newDest);
            }
            return null;
        }

        @objid ("7eaa4c6e-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitClassAssociation(final ClassAssociation theClassAssociation) {
            theClassAssociation.setClassPart((Class) this.newDest);
            return null;
        }

        @objid ("7eaa4c75-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitDataFlow(DataFlow theDataFlow) {
            theDataFlow.setDestination((NameSpace) this.newDest);
            return null;
        }

        @objid ("7eaa4c7b-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitDependency(Dependency theDependency) {
            theDependency.setDependsOn((ModelElement) this.newDest);
            return null;
        }

        @objid ("7eaa4c81-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitElementImport(ElementImport theElementImport) {
            theElementImport.setImportedElement((NameSpace) this.newDest);
            return null;
        }

        @objid ("7eaa4c87-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitExceptionHandler(final ExceptionHandler theExceptionHandler) {
            theExceptionHandler.setExceptionInput((InputPin) this.newDest);
            return null;
        }

        @objid ("7eaa4c8e-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitGeneralization(Generalization theGeneralization) {
            theGeneralization.setSuperType((NameSpace) this.newDest);
            return null;
        }

        @objid ("7eacad94-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitInformationFlow(InformationFlow theInformationFlow) {
            theInformationFlow.getInformationTarget().add((ModelElement) this.newDest);
            return null;
        }

        @objid ("7eacad9a-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitInterfaceRealization(InterfaceRealization theInterfaceRealization) {
            theInterfaceRealization.setImplemented((Interface) this.newDest);
            return null;
        }

        @objid ("7eacada0-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitLinkEnd(LinkEnd theLinkEnd) {
            if (theLinkEnd.isNavigable()) {
                theLinkEnd.setTarget((Instance) this.newDest, true);
            } else {
                theLinkEnd.getOpposite().setSource((Instance) this.newDest, true);
            }
            return null;
        }

        @objid ("7eacada6-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitManifestation(Manifestation theManifestation) {
            theManifestation.setUtilizedElement((ModelElement) this.newDest);
            return null;
        }

        @objid ("7eacadac-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitMessage(Message theMessage) {
            theMessage.setReceiveEvent((MessageEnd) this.newDest);
            return null;
        }

        @objid ("7eacadb2-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitModelElement(ModelElement theModelElement) {
            throw new IllegalArgumentException(theModelElement + " is not a link element.");
        }

        @objid ("7eacadb7-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitNamespaceUse(NamespaceUse theNamespaceUse) {
            theNamespaceUse.setUsed((NameSpace) this.newDest);
            return null;
        }

        @objid ("7eacadbd-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitPackageImport(PackageImport thePackageImport) {
            thePackageImport.setImportedPackage((Package) this.newDest);
            return null;
        }

        @objid ("7eacadc3-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitPackageMerge(PackageMerge thePackageMerge) {
            thePackageMerge.setMergedPackage((Package) this.newDest);
            return null;
        }

        @objid ("7eacadc9-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitProvidedInterface(final ProvidedInterface theProvidedInterface) {
            if (this.newDest == null) {
                setTarget(theProvidedInterface, null);
                return null;
            }
            if (this.newDest instanceof NaryConnectorEnd) {
                setTarget(theProvidedInterface, (NaryConnectorEnd) this.newDest);
                return null;
            } else {
                // Not supported
                throw new IllegalArgumentException(this.newDest + " is not a supported target for " + theProvidedInterface+". Use a NaryConnectorEnd.");
            }
        }

        @objid ("7eacadcf-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitRaisedException(RaisedException theRaisedException) {
            theRaisedException.setThrownType((Classifier) this.newDest);
            return null;
        }

        @objid ("7eacadd5-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitRequiredInterface(final RequiredInterface theRequiredInterface) {
            if (this.newDest == null) {
                setTarget(theRequiredInterface, null);
                return null;
            }
            if (this.newDest instanceof NaryConnectorEnd) {
                setTarget(theRequiredInterface, (NaryConnectorEnd) this.newDest);
                return null;
            } else {
                // Not supported
                throw new IllegalArgumentException(this.newDest + " is not a supported target for " + theRequiredInterface+". Use a NaryConnectorEnd.");
            }
        }

        @objid ("7eacaddb-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitTemplateBinding(TemplateBinding theTemplateBinding) {
            if (this.newDest instanceof NameSpace) {
                theTemplateBinding.setInstanciatedTemplate((NameSpace) this.newDest);
            } else if (this.newDest instanceof Operation) {
                theTemplateBinding.setInstanciatedTemplateOperation((Operation) this.newDest);
            } else {
                throw new ClassCastException();
            }
            return null;
        }

        @objid ("7eacade1-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitTransition(Transition theTransition) {
            theTransition.setTarget((StateVertex) this.newDest);
            return null;
        }

        @objid ("7eacade7-1eb2-11e2-8009-002564c97630")
        @Override
        public Object visitUseCaseDependency(UseCaseDependency theUseCaseDependency) {
            theUseCaseDependency.setTarget((UseCase) this.newDest);
            return null;
        }

        @objid ("7eaf0ef3-1eb2-11e2-8009-002564c97630")
        private void removeTarget(final RequiredInterface el) {
            for (LinkEnd end : new ArrayList<>(el.getProvider())) {
                final Link l = end.getLink();
                if (l != null) {
                    l.delete();
                } else {
                    end.delete();
                }
            }
            
            for (NaryLinkEnd end : new ArrayList<>(el.getNaryProvider())) {
                final NaryLink l = end.getNaryLink();
                if (l != null && l.getNaryLinkEnd().size() <= 2)
                    l.delete();
                else
                    end.delete();
            }
        }

        @objid ("7eaf0ef8-1eb2-11e2-8009-002564c97630")
        private void setTarget(final RequiredInterface el, final NaryConnectorEnd target) {
            if (el.getProvider().contains(target)) {
                return;
            }
            
            removeTarget(el);
            
            if (target != null) {
                el.getNaryProvider().add(target);
            }
        }

        @objid ("7eaf0f02-1eb2-11e2-8009-002564c97630")
        private void removeTarget(final ProvidedInterface el) {
            for (LinkEnd end : new ArrayList<>(el.getConsumer())) {
                final Link l = end.getLink();
                if (l != null) {
                    l.delete();
                } else {
                    end.delete();
                }
            }
            
            for (NaryLinkEnd end : new ArrayList<>(el.getNaryConsumer())) {
                final NaryLink l = end.getNaryLink();
                if (l != null && l.getNaryLinkEnd().size() <= 2)
                    l.delete();
                else
                    end.delete();
            }
        }

        @objid ("7eaf0f07-1eb2-11e2-8009-002564c97630")
        private void setTarget(final ProvidedInterface el, final NaryConnectorEnd target) {
            if (el.getNaryConsumer().contains(target)) {
                return;
            }
            
            removeTarget(el);
            
            if (target != null) {
                el.getNaryConsumer().add(target);
            }
        }

        @objid ("91eaeacf-978f-4dea-a984-5cb02a2dc897")
        @Override
        public Object visitNaryAssociationEnd(NaryAssociationEnd theNaryAssociationEnd) {
            theNaryAssociationEnd.setNaryAssociation((NaryAssociation) this.newDest);
            return null;
        }

        @objid ("5c9dce71-cd61-4c79-935d-94b28ffb0419")
        @Override
        public Object visitNaryLinkEnd(NaryLinkEnd theNaryLinkEnd) {
            theNaryLinkEnd.setNaryLink((NaryLink) this.newDest);
            return null;
        }

        @objid ("ad450d41-0130-44b2-9de6-355434f10fca")
        @Override
        public Object visitCommunicationChannel(CommunicationChannel theChannel) {
            theChannel.setEnd((CommunicationNode) this.newDest);
            return null;
        }

    }

}
