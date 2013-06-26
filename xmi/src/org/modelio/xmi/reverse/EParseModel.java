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
                                    

package org.modelio.xmi.reverse;

import java.util.HashMap;
import java.util.Map;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.uml2.uml.DurationObservation;
import org.eclipse.uml2.uml.ExceptionHandler;
import org.eclipse.uml2.uml.FinalNode;
import org.eclipse.uml2.uml.FinalState;
import org.eclipse.uml2.uml.InstanceSpecification;
import org.eclipse.uml2.uml.InstanceValue;
import org.eclipse.uml2.uml.ObjectFlow;
import org.eclipse.uml2.uml.ObjectNode;
import org.eclipse.uml2.uml.Observation;
import org.eclipse.uml2.uml.Package;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.StringExpression;
import org.eclipse.uml2.uml.TimeObservation;
import org.eclipse.uml2.uml.util.UMLSwitch;

@objid ("a6d05e08-c07b-4091-952d-36ae01708143")
public class EParseModel extends UMLSwitch<Object> {
    @objid ("f0118f9e-f89d-4e92-9b5e-96f8300b9594")
    private XMIImportBehavior behavior;

    @objid ("a6546e08-19db-4d82-b00d-d225e82d89c6")
    private Map<Object, Object> visitorMap;

    @objid ("e14b41d9-cb7f-4a91-aa4b-fec920ff805c")
    public EParseModel(XMIImportBehavior behavior, Package ecoreRootModel) {
        this.behavior = behavior;
        this.visitorMap = new HashMap<Object, Object>();
        this.visitorMap.put(ecoreRootModel, ecoreRootModel);
    }

    @objid ("9567c8a5-a176-49f9-8128-36ddf784ad30")
    @Override
    public Object caseAbstraction(org.eclipse.uml2.uml.Abstraction inputAbstraction) {
        Object theResult = visitorMap.get(inputAbstraction);
        if (theResult == null) {
            visitorMap.put(inputAbstraction, inputAbstraction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AbstractionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitAbstraction(inputAbstraction);
            theResult = super.caseAbstraction(inputAbstraction);
            this.doSwitch((EObject) inputAbstraction.getMapping());
        }
        return theResult;
    }

    @objid ("292b767d-d406-435d-a9d1-6f5592cf6462")
    @Override
    public Object caseAcceptCallAction(org.eclipse.uml2.uml.AcceptCallAction inputAcceptCallAction) {
        Object theResult = visitorMap.get(inputAcceptCallAction);
        if (theResult == null) {
            visitorMap.put(inputAcceptCallAction, inputAcceptCallAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AcceptCallActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitAcceptCallAction(inputAcceptCallAction);
            theResult = super.caseAcceptCallAction(inputAcceptCallAction);
            this.doSwitch((EObject) inputAcceptCallAction
                    .getReturnInformation());
        }
        return theResult;
    }

    @objid ("83180d4e-5c74-4346-859d-2f7ed2bf3dd0")
    @Override
    public Object caseAcceptEventAction(org.eclipse.uml2.uml.AcceptEventAction inputAcceptEventAction) {
        Object theResult = visitorMap.get(inputAcceptEventAction);
        if (theResult == null) {
            visitorMap.put(inputAcceptEventAction, inputAcceptEventAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AcceptEventActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitAcceptEventAction(inputAcceptEventAction);
            theResult = super.caseAcceptEventAction(inputAcceptEventAction);
            for (Object result : inputAcceptEventAction.getResults()) {
                this.doSwitch((EObject) result);
            }
            for (Object trigger : inputAcceptEventAction.getTriggers()) {
                this.doSwitch((EObject) trigger);
            }
        }
        return theResult;
    }

    @objid ("4d946267-b71b-4254-846d-5d8f5f292603")
    @Override
    public Object caseAction(org.eclipse.uml2.uml.Action inputAction) {
        Object theResult = super.caseAction(inputAction);
        for (Object output : inputAction.getOutputs()) {
            this.doSwitch((EObject) output);
        }
        for (Object input : inputAction.getInputs()) {
            this.doSwitch((EObject) input);
        }
        this.doSwitch((EObject) inputAction.getContext());
        for (Object localPrecondition : inputAction.getLocalPreconditions()) {
            this.doSwitch((EObject) localPrecondition);
        }
        for (Object localPostcondition : inputAction.getLocalPostconditions()) {
            this.doSwitch((EObject) localPostcondition);
        }
        return theResult;
    }

    @objid ("af75c301-80f3-4e74-95ee-7331898bccc1")
    @Override
    public Object caseActionExecutionSpecification(org.eclipse.uml2.uml.ActionExecutionSpecification inputActionExecutionSpecification) {
        Object theResult = visitorMap.get(inputActionExecutionSpecification);
        if (theResult == null) {
            visitorMap.put(inputActionExecutionSpecification,
                    inputActionExecutionSpecification);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ActionExecutionSpecificationImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitActionExecutionSpecification(inputActionExecutionSpecification);
            theResult = super
            .caseActionExecutionSpecification(inputActionExecutionSpecification);
            this.doSwitch((EObject) inputActionExecutionSpecification
                    .getAction());
        }
        return theResult;
    }

    @objid ("eff0aa5f-1c21-4955-9da9-542426882ad5")
    @Override
    public Object caseActionInputPin(org.eclipse.uml2.uml.ActionInputPin inputActionInputPin) {
        Object theResult = visitorMap.get(inputActionInputPin);
        if (theResult == null) {
            visitorMap.put(inputActionInputPin, inputActionInputPin);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ActionInputPinImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitActionInputPin(inputActionInputPin);
            theResult = super.caseActionInputPin(inputActionInputPin);
            this.doSwitch((EObject) inputActionInputPin.getFromAction());
        }
        return theResult;
    }

    @objid ("adbff075-ff4a-4ed5-a4c2-84949406db26")
    @Override
    public Object caseActivity(org.eclipse.uml2.uml.Activity inputActivity) {
        Object theResult = visitorMap.get(inputActivity);
        if (theResult == null) {
            visitorMap.put(inputActivity, inputActivity);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ActivityImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            behavior.visitActivity(inputActivity);
            theResult = super.caseActivity(inputActivity);
            for (Object structuredNode : inputActivity.getStructuredNodes()) {
                this.doSwitch((EObject) structuredNode);
            }
            for (Object variable : inputActivity.getVariables()) {
                this.doSwitch((EObject) variable);
            }
            for (Object node : inputActivity.getNodes()) {
                this.doSwitch((EObject) node);
            }
            for (Object edge : inputActivity.getEdges()) {
                this.doSwitch((EObject) edge);
            }
            for (Object partition : inputActivity.getPartitions()) {
                this.doSwitch((EObject) partition);
            }
            for (Object group : inputActivity.getGroups()) {
                this.doSwitch((EObject) group);
            }
        }
        return theResult;
    }

    @objid ("eed20d0b-8402-46b2-9048-9a1343b9cebf")
    @Override
    public Object caseActivityEdge(org.eclipse.uml2.uml.ActivityEdge inputActivityEdge) {
        Object theResult = super.caseActivityEdge(inputActivityEdge);
        this.doSwitch((EObject) inputActivityEdge.getActivity());
        this.doSwitch((EObject) inputActivityEdge.getSource());
        this.doSwitch((EObject) inputActivityEdge.getTarget());
        for (Object redefinedEdge : inputActivityEdge.getRedefinedEdges()) {
            this.doSwitch((EObject) redefinedEdge);
        }
        for (Object inPartition : inputActivityEdge.getInPartitions()) {
            this.doSwitch((EObject) inPartition);
        }
        this.doSwitch((EObject) inputActivityEdge.getGuard());
        this.doSwitch((EObject) inputActivityEdge.getWeight());
        this.doSwitch((EObject) inputActivityEdge.getInterrupts());
        this.doSwitch((EObject) inputActivityEdge.getInStructuredNode());
        for (Object inGroup : inputActivityEdge.getInGroups()) {
            this.doSwitch((EObject) inGroup);
        }
        return theResult;
    }

    @objid ("142755d1-6df0-4d12-b3fe-f91190f5df9a")
    @Override
    public Object caseActivityFinalNode(org.eclipse.uml2.uml.ActivityFinalNode inputActivityFinalNode) {
        Object theResult = visitorMap.get(inputActivityFinalNode);
        if (theResult == null) {
            visitorMap.put(inputActivityFinalNode, inputActivityFinalNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ActivityFinalNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitActivityFinalNode(inputActivityFinalNode);
            theResult = super.caseActivityFinalNode(inputActivityFinalNode);
        }
        return theResult;
    }

    @objid ("7f2108a9-d3d3-4116-ac13-29b39379707c")
    @Override
    public Object caseActivityGroup(org.eclipse.uml2.uml.ActivityGroup inputActivityGroup) {
        Object theResult = super.caseActivityGroup(inputActivityGroup);
        for (Object subgroup : inputActivityGroup.getSubgroups()) {
            this.doSwitch((EObject) subgroup);
        }
        this.doSwitch((EObject) inputActivityGroup.getSuperGroup());
        this.doSwitch((EObject) inputActivityGroup.getInActivity());
        for (Object containedNode : inputActivityGroup.getContainedNodes()) {
            this.doSwitch((EObject) containedNode);
        }
        for (Object containedEdge : inputActivityGroup.getContainedEdges()) {
            this.doSwitch((EObject) containedEdge);
        }
        return theResult;
    }

    @objid ("7c378761-7e89-424b-ace4-279812650334")
    @Override
    public Object caseActivityNode(org.eclipse.uml2.uml.ActivityNode inputActivityNode) {
        Object theResult = super.caseActivityNode(inputActivityNode);
        this.doSwitch((EObject) inputActivityNode.getInStructuredNode());
        this.doSwitch((EObject) inputActivityNode.getActivity());
        for (Object outgoing : inputActivityNode.getOutgoings()) {
            this.doSwitch((EObject) outgoing);
        }
        for (Object incoming : inputActivityNode.getIncomings()) {
            this.doSwitch((EObject) incoming);
        }
        for (Object redefinedNode : inputActivityNode.getRedefinedNodes()) {
            this.doSwitch((EObject) redefinedNode);
        }
        for (Object inPartition : inputActivityNode.getInPartitions()) {
            this.doSwitch((EObject) inPartition);
        }
        for (Object inInterruptibleRegion : inputActivityNode
                .getInInterruptibleRegions()) {
            this.doSwitch((EObject) inInterruptibleRegion);
        }
        for (Object inGroup : inputActivityNode.getInGroups()) {
            this.doSwitch((EObject) inGroup);
        }
        return theResult;
    }

    @objid ("b54dfc78-3c91-4f0c-a194-c11ce3fe79cd")
    @Override
    public Object caseActivityParameterNode(org.eclipse.uml2.uml.ActivityParameterNode inputActivityParameterNode) {
        Object theResult = visitorMap.get(inputActivityParameterNode);
        if (theResult == null) {
            visitorMap.put(inputActivityParameterNode,
                    inputActivityParameterNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ActivityParameterNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitActivityParameterNode(inputActivityParameterNode);
            theResult = super
            .caseActivityParameterNode(inputActivityParameterNode);
            this.doSwitch((EObject) inputActivityParameterNode.getParameter());
        }
        return theResult;
    }

    @objid ("836d3190-da54-43b4-ac01-ec56eea6fe2a")
    @Override
    public Object caseActivityPartition(org.eclipse.uml2.uml.ActivityPartition inputActivityPartition) {
        Object theResult = visitorMap.get(inputActivityPartition);
        if (theResult == null) {
            visitorMap.put(inputActivityPartition, inputActivityPartition);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ActivityPartitionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitActivityPartition(inputActivityPartition);
            theResult = super.caseActivityPartition(inputActivityPartition);
            for (Object edge : inputActivityPartition.getEdges()) {
                this.doSwitch((EObject) edge);
            }
            for (Object node : inputActivityPartition.getNodes()) {
                this.doSwitch((EObject) node);
            }
            for (Object subpartition : inputActivityPartition
                    .getSubpartitions()) {
                this.doSwitch((EObject) subpartition);
            }
            this.doSwitch((EObject) inputActivityPartition.getSuperPartition());
            this.doSwitch((EObject) inputActivityPartition.getRepresents());
        }
        return theResult;
    }

    @objid ("453d9f3f-599e-48dc-bd47-b56c3039bae1")
    @Override
    public Object caseActor(org.eclipse.uml2.uml.Actor inputActor) {
        Object theResult = visitorMap.get(inputActor);
        if (theResult == null) {
            visitorMap.put(inputActor, inputActor);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ActorImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitActor(inputActor);
            theResult = super.caseActor(inputActor);
        }
        return theResult;
    }

    @objid ("3c70d902-57b1-460a-b972-1569aeff0d4c")
    @Override
    public Object caseAddStructuralFeatureValueAction(org.eclipse.uml2.uml.AddStructuralFeatureValueAction inputAddStructuralFeatureValueAction) {
        Object theResult = visitorMap.get(inputAddStructuralFeatureValueAction);
        if (theResult == null) {
            visitorMap.put(inputAddStructuralFeatureValueAction,
                    inputAddStructuralFeatureValueAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AddStructuralFeatureValueActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitAddStructuralFeatureValueAction(inputAddStructuralFeatureValueAction);
            theResult = super
            .caseAddStructuralFeatureValueAction(inputAddStructuralFeatureValueAction);
            this.doSwitch((EObject) inputAddStructuralFeatureValueAction
                    .getInsertAt());
        }
        return theResult;
    }

    @objid ("21755bc5-f6a2-4644-b496-e0172ccd737b")
    @Override
    public Object caseAddVariableValueAction(org.eclipse.uml2.uml.AddVariableValueAction inputAddVariableValueAction) {
        Object theResult = visitorMap.get(inputAddVariableValueAction);
        if (theResult == null) {
            visitorMap.put(inputAddVariableValueAction,
                    inputAddVariableValueAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AddVariableValueActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitAddVariableValueAction(inputAddVariableValueAction);
            theResult = super
            .caseAddVariableValueAction(inputAddVariableValueAction);
            this.doSwitch((EObject) inputAddVariableValueAction.getInsertAt());
        }
        return theResult;
    }

    @objid ("22fe4209-4ab7-4d47-965e-e773bc2cf0ae")
    @Override
    public Object caseAnyReceiveEvent(org.eclipse.uml2.uml.AnyReceiveEvent inputAnyReceiveEvent) {
        Object theResult = visitorMap.get(inputAnyReceiveEvent);
        if (theResult == null) {
            visitorMap.put(inputAnyReceiveEvent, inputAnyReceiveEvent);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AnyReceiveEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitAnyReceiveEvent(inputAnyReceiveEvent);
            theResult = super.caseAnyReceiveEvent(inputAnyReceiveEvent);
        }
        return theResult;
    }

    @objid ("fa0aff75-4314-49f2-ac8d-d9108525883e")
    @Override
    public Object caseArtifact(org.eclipse.uml2.uml.Artifact inputArtifact) {
        Object theResult = visitorMap.get(inputArtifact);
        if (theResult == null) {
            visitorMap.put(inputArtifact, inputArtifact);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ArtifactImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            behavior.visitArtifact(inputArtifact);
            theResult = super.caseArtifact(inputArtifact);
            for (Object nestedArtifact : inputArtifact.getNestedArtifacts()) {
                this.doSwitch((EObject) nestedArtifact);
            }
            for (Object manifestation : inputArtifact.getManifestations()) {
                this.doSwitch((EObject) manifestation);
            }
            for (Object ownedOperation : inputArtifact.getOwnedOperations()) {
                this.doSwitch((EObject) ownedOperation);
            }
            for (Object ownedAttribute : inputArtifact.getOwnedAttributes()) {
                this.doSwitch((EObject) ownedAttribute);
            }
        }
        return theResult;
    }

    @objid ("691b0a4a-e97a-44bc-a57a-fa43e2b29193")
    @Override
    public Object caseAssociation(org.eclipse.uml2.uml.Association inputAssociation) {
        Object theResult = visitorMap.get(inputAssociation);
        if (theResult == null) {
            visitorMap.put(inputAssociation, inputAssociation);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AssociationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitAssociation(inputAssociation);
            theResult = super.caseAssociation(inputAssociation);
            for (Object ownedEnd : inputAssociation.getOwnedEnds()) {
                this.doSwitch((EObject) ownedEnd);
            }
            for (Object endType : inputAssociation.getEndTypes()) {
                this.doSwitch((EObject) endType);
            }
            for (Object memberEnd : inputAssociation.getMemberEnds()) {
                this.doSwitch((EObject) memberEnd);
            }
            for (Object navigableOwnedEnd : inputAssociation
                    .getNavigableOwnedEnds()) {
                this.doSwitch((EObject) navigableOwnedEnd);
            }
        }
        return theResult;
    }

    @objid ("a33cf265-d83a-4421-9587-3cf397e72354")
    @Override
    public Object caseAssociationClass(org.eclipse.uml2.uml.AssociationClass inputAssociationClass) {
        Object theResult = visitorMap.get(inputAssociationClass);
        if (theResult == null) {
            visitorMap.put(inputAssociationClass, inputAssociationClass);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AssociationClassImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitAssociationClass(inputAssociationClass);
            theResult = super.caseAssociationClass(inputAssociationClass);
        }
        return theResult;
    }

    @objid ("0bf9147d-c5f2-4e4d-bcf6-f222ee1e0bc3")
    @Override
    public Object caseBehavior(org.eclipse.uml2.uml.Behavior inputBehavior) {
        Object theResult = super.caseBehavior(inputBehavior);
        for (Object redefinedBehavior : inputBehavior.getRedefinedBehaviors()) {
            this.doSwitch((EObject) redefinedBehavior);
        }
        this.doSwitch((EObject) inputBehavior.getSpecification());
        for (Object ownedParameter : inputBehavior.getOwnedParameters()) {
            this.doSwitch((EObject) ownedParameter);
        }
        this.doSwitch((EObject) inputBehavior.getContext());
        for (Object precondition : inputBehavior.getPreconditions()) {
            this.doSwitch((EObject) precondition);
        }
        for (Object postcondition : inputBehavior.getPostconditions()) {
            this.doSwitch((EObject) postcondition);
        }
        for (Object ownedParameterSet : inputBehavior.getOwnedParameterSets()) {
            this.doSwitch((EObject) ownedParameterSet);
        }
        return theResult;
    }

    @objid ("9fe8dc3f-e6c1-429f-9d12-9008d53ecc4f")
    @Override
    public Object caseBehaviorExecutionSpecification(org.eclipse.uml2.uml.BehaviorExecutionSpecification inputBehaviorExecutionSpecification) {
        Object theResult = visitorMap.get(inputBehaviorExecutionSpecification);
        if (theResult == null) {
            visitorMap.put(inputBehaviorExecutionSpecification,
                    inputBehaviorExecutionSpecification);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("BehaviorExecutionSpecificationImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitBehaviorExecutionSpecification(inputBehaviorExecutionSpecification);
            theResult = super
            .caseBehaviorExecutionSpecification(inputBehaviorExecutionSpecification);
            this.doSwitch((EObject) inputBehaviorExecutionSpecification
                    .getBehavior());
        }
        return theResult;
    }

    @objid ("64a584dc-5c71-495c-994e-f8cc4c09531d")
    @Override
    public Object caseBehavioralFeature(org.eclipse.uml2.uml.BehavioralFeature inputBehavioralFeature) {
        Object theResult = super.caseBehavioralFeature(inputBehavioralFeature);
        for (Object ownedParameter : inputBehavioralFeature
                .getOwnedParameters()) {
            this.doSwitch((EObject) ownedParameter);
        }
        for (Object method : inputBehavioralFeature.getMethods()) {
            this.doSwitch((EObject) method);
        }
        for (Object raisedException : inputBehavioralFeature
                .getRaisedExceptions()) {
            this.doSwitch((EObject) raisedException);
        }
        for (Object ownedParameterSet : inputBehavioralFeature
                .getOwnedParameterSets()) {
            this.doSwitch((EObject) ownedParameterSet);
        }
        return theResult;
    }

    @objid ("5ac4d54b-0883-4dd8-beb5-63e4acb3a65a")
    @Override
    public Object caseBehavioredClassifier(org.eclipse.uml2.uml.BehavioredClassifier inputBehavioredClassifier) {
        Object theResult = super
        .caseBehavioredClassifier(inputBehavioredClassifier);
        for (Object ownedBehavior : inputBehavioredClassifier
                .getOwnedBehaviors()) {
            this.doSwitch((EObject) ownedBehavior);
        }
        this.doSwitch((EObject) inputBehavioredClassifier
                .getClassifierBehavior());
        for (Object interfaceRealization : inputBehavioredClassifier
                .getInterfaceRealizations()) {
            this.doSwitch((EObject) interfaceRealization);
        }
        //        for (Object ownedTrigger : inputBehavioredClassifier.getOwnedTriggers()) {
        //            this.doSwitch((EObject) ownedTrigger);
        //        }
        return theResult;
    }

    @objid ("940dc886-5b19-4a5b-ab38-701750d2d1bc")
    @Override
    public Object caseBroadcastSignalAction(org.eclipse.uml2.uml.BroadcastSignalAction inputBroadcastSignalAction) {
        Object theResult = visitorMap.get(inputBroadcastSignalAction);
        if (theResult == null) {
            visitorMap.put(inputBroadcastSignalAction,
                    inputBroadcastSignalAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("BroadcastSignalActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitBroadcastSignalAction(inputBroadcastSignalAction);
            theResult = super
            .caseBroadcastSignalAction(inputBroadcastSignalAction);
            this.doSwitch((EObject) inputBroadcastSignalAction.getSignal());
        }
        return theResult;
    }

    @objid ("35c5cfc9-d204-4ae9-aba1-e7fbbf56f0af")
    @Override
    public Object caseCallAction(org.eclipse.uml2.uml.CallAction inputCallAction) {
        Object theResult = super.caseCallAction(inputCallAction);
        for (Object result : inputCallAction.getResults()) {
            this.doSwitch((EObject) result);
        }
        return theResult;
    }

    @objid ("6cf64002-efa4-47f9-a887-d55e46d27d10")
    @Override
    public Object caseCallBehaviorAction(org.eclipse.uml2.uml.CallBehaviorAction inputCallBehaviorAction) {
        Object theResult = visitorMap.get(inputCallBehaviorAction);
        if (theResult == null) {
            visitorMap.put(inputCallBehaviorAction, inputCallBehaviorAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CallBehaviorActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitCallBehaviorAction(inputCallBehaviorAction);
            theResult = super.caseCallBehaviorAction(inputCallBehaviorAction);
            this.doSwitch((EObject) inputCallBehaviorAction.getBehavior());
        }
        return theResult;
    }

    @objid ("4a6cd5f9-a7ab-4ca4-abb0-27269c788f50")
    @Override
    public Object caseCallEvent(org.eclipse.uml2.uml.CallEvent inputCallEvent) {
        Object theResult = visitorMap.get(inputCallEvent);
        if (theResult == null) {
            visitorMap.put(inputCallEvent, inputCallEvent);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CallEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitCallEvent(inputCallEvent);
            theResult = super.caseCallEvent(inputCallEvent);
            this.doSwitch((EObject) inputCallEvent.getOperation());
        }
        return theResult;
    }

    @objid ("5a34fc3a-b268-49c9-95ab-b1fd2f56e611")
    @Override
    public Object caseCallOperationAction(org.eclipse.uml2.uml.CallOperationAction inputCallOperationAction) {
        Object theResult = visitorMap.get(inputCallOperationAction);
        if (theResult == null) {
            visitorMap.put(inputCallOperationAction, inputCallOperationAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CallOperationActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitCallOperationAction(inputCallOperationAction);
            theResult = super.caseCallOperationAction(inputCallOperationAction);
            this.doSwitch((EObject) inputCallOperationAction.getOperation());
            this.doSwitch((EObject) inputCallOperationAction.getTarget());
        }
        return theResult;
    }

    @objid ("5fe0fc80-6fc4-4cc2-af08-678289d14f5d")
    @Override
    public Object caseCentralBufferNode(org.eclipse.uml2.uml.CentralBufferNode inputCentralBufferNode) {
        Object theResult = visitorMap.get(inputCentralBufferNode);
        if (theResult == null) {
            visitorMap.put(inputCentralBufferNode, inputCentralBufferNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CentralBufferNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitCentralBufferNode(inputCentralBufferNode);
            theResult = super.caseCentralBufferNode(inputCentralBufferNode);
        }
        return theResult;
    }

    @objid ("aecdfde9-6dcc-4468-b2ec-1876f1aabb65")
    @Override
    public Object caseChangeEvent(org.eclipse.uml2.uml.ChangeEvent inputChangeEvent) {
        Object theResult = visitorMap.get(inputChangeEvent);
        if (theResult == null) {
            visitorMap.put(inputChangeEvent, inputChangeEvent);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ChangeEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitChangeEvent(inputChangeEvent);
            theResult = super.caseChangeEvent(inputChangeEvent);
            this.doSwitch((EObject) inputChangeEvent.getChangeExpression());
        }
        return theResult;
    }

    @objid ("fdefee9d-3d89-41f2-ac2a-7042a99df61e")
    @Override
    public Object caseClass(org.eclipse.uml2.uml.Class inputClass) {
        Object theResult = visitorMap.get(inputClass);
        if (theResult == null) {
            visitorMap.put(inputClass, inputClass);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ClassImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitClass(inputClass);
            theResult = super.caseClass(inputClass);
            for (Object nestedClassifier : inputClass.getNestedClassifiers()) {
                this.doSwitch((EObject) nestedClassifier);
            }
            for (Object ownedAttribute : inputClass.getOwnedAttributes()) {
                this.doSwitch((EObject) ownedAttribute);
            }
            for (Object ownedOperation : inputClass.getOwnedOperations()) {
                this.doSwitch((EObject) ownedOperation);
            }
            for (Object superClass : inputClass.getSuperClasses()) {
                this.doSwitch((EObject) superClass);
            }
            for (Object ownedReception : inputClass.getOwnedReceptions()) {
                this.doSwitch((EObject) ownedReception);
            }
            for (Object extension : inputClass.getExtensions()) {
                this.doSwitch((EObject) extension);
            }
        }
        return theResult;
    }

    @objid ("9225ccb6-c334-4f4e-9d23-ee3d8d9ae1dd")
    @Override
    public Object caseClassifier(org.eclipse.uml2.uml.Classifier inputClassifier) {
        Object theResult = super.caseClassifier(inputClassifier);
        for (Object generalization : inputClassifier.getGeneralizations()) {
            this.doSwitch((EObject) generalization);
        }
        for (Object feature : inputClassifier.getFeatures()) {
            this.doSwitch((EObject) feature);
        }
        for (Object inheritedMember : inputClassifier.getInheritedMembers()) {
            this.doSwitch((EObject) inheritedMember);
        }
        for (Object redefinedClassifier : inputClassifier
                .getRedefinedClassifiers()) {
            this.doSwitch((EObject) redefinedClassifier);
        }
        for (Object general : inputClassifier.getGenerals()) {
            this.doSwitch((EObject) general);
        }
        for (Object substitution : inputClassifier.getSubstitutions()) {
            this.doSwitch((EObject) substitution);
        }
        for (Object attribute : inputClassifier.getAttributes()) {
            this.doSwitch((EObject) attribute);
        }
        this.doSwitch((EObject) inputClassifier.getRepresentation());
        for (Object collaborationUse : inputClassifier.getCollaborationUses()) {
            this.doSwitch((EObject) collaborationUse);
        }
        for (Object ownedUseCase : inputClassifier.getOwnedUseCases()) {
            this.doSwitch((EObject) ownedUseCase);
        }
        for (Object useCase : inputClassifier.getUseCases()) {
            this.doSwitch((EObject) useCase);
        }
        for (Object powertypeExtent : inputClassifier.getPowertypeExtents()) {
            this.doSwitch((EObject) powertypeExtent);
        }
        this.doSwitch((EObject) inputClassifier.getOwnedTemplateSignature());
        this.doSwitch((EObject) inputClassifier.getTemplateParameter());
        return theResult;
    }

    @objid ("8f3de447-2c92-49a1-9f8c-d610b99f1e9f")
    @Override
    public Object caseClassifierTemplateParameter(org.eclipse.uml2.uml.ClassifierTemplateParameter inputClassifierTemplateParameter) {
        Object theResult = visitorMap.get(inputClassifierTemplateParameter);
        if (theResult == null) {
            visitorMap.put(inputClassifierTemplateParameter,
                    inputClassifierTemplateParameter);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ClassifierTemplateParameterImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitClassifierTemplateParameter(inputClassifierTemplateParameter);
            theResult = super
            .caseClassifierTemplateParameter(inputClassifierTemplateParameter);
            this.doSwitch((EObject) inputClassifierTemplateParameter
                    .getParameteredElement());
            //            this.doSwitch((EObject) inputClassifierTemplateParameter
            //                    .getDefaultClassifier());
            this.doSwitch((EObject) inputClassifierTemplateParameter
                    .getDefault());
            //            this.doSwitch((EObject) inputClassifierTemplateParameter
            //                    .getConstrainingClassifier());
        
            for (Object constrainingClassifier : inputClassifierTemplateParameter
                    .getConstrainingClassifiers()) {
                this.doSwitch((EObject) constrainingClassifier);
            }
        }
        return theResult;
    }

    @objid ("e9934b8a-4d28-4ffd-ad6d-6a2f2cdd9065")
    @Override
    public Object caseClause(org.eclipse.uml2.uml.Clause inputClause) {
        Object theResult = visitorMap.get(inputClause);
        if (theResult == null) {
            visitorMap.put(inputClause, inputClause);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ClauseImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitClause(inputClause);
            theResult = super.caseClause(inputClause);
            for (Object test : inputClause.getTests()) {
                this.doSwitch((EObject) test);
            }
            for (Object body : inputClause.getBodies()) {
                this.doSwitch((EObject) body);
            }
            for (Object predecessorClause : inputClause.getPredecessorClauses()) {
                this.doSwitch((EObject) predecessorClause);
            }
            for (Object successorClause : inputClause.getSuccessorClauses()) {
                this.doSwitch((EObject) successorClause);
            }
            this.doSwitch((EObject) inputClause.getDecider());
            for (Object bodyOutput : inputClause.getBodyOutputs()) {
                this.doSwitch((EObject) bodyOutput);
            }
        }
        return theResult;
    }

    @objid ("cbd8c12f-70e8-4e9e-8b55-84d7801dc156")
    @Override
    public Object caseClearAssociationAction(org.eclipse.uml2.uml.ClearAssociationAction inputClearAssociationAction) {
        Object theResult = visitorMap.get(inputClearAssociationAction);
        if (theResult == null) {
            visitorMap.put(inputClearAssociationAction,
                    inputClearAssociationAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ClearAssociationActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitClearAssociationAction(inputClearAssociationAction);
            theResult = super
            .caseClearAssociationAction(inputClearAssociationAction);
            this.doSwitch((EObject) inputClearAssociationAction.getObject());
            this.doSwitch((EObject) inputClearAssociationAction
                    .getAssociation());
        }
        return theResult;
    }

    @objid ("ee8ab5aa-a5a0-494a-94db-ad5e113d02d7")
    @Override
    public Object caseClearStructuralFeatureAction(org.eclipse.uml2.uml.ClearStructuralFeatureAction inputClearStructuralFeatureAction) {
        Object theResult = visitorMap.get(inputClearStructuralFeatureAction);
        if (theResult == null) {
            visitorMap.put(inputClearStructuralFeatureAction,
                    inputClearStructuralFeatureAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ClearStructuralFeatureActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitClearStructuralFeatureAction(inputClearStructuralFeatureAction);
            theResult = super
            .caseClearStructuralFeatureAction(inputClearStructuralFeatureAction);
        }
        return theResult;
    }

    @objid ("df42f0cf-5ddb-4a1f-9887-f5be7c4eb605")
    @Override
    public Object caseClearVariableAction(org.eclipse.uml2.uml.ClearVariableAction inputClearVariableAction) {
        Object theResult = visitorMap.get(inputClearVariableAction);
        if (theResult == null) {
            visitorMap.put(inputClearVariableAction, inputClearVariableAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ClearVariableActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitClearVariableAction(inputClearVariableAction);
            theResult = super.caseClearVariableAction(inputClearVariableAction);
        }
        return theResult;
    }

    @objid ("7017f6fb-09a0-46a1-ae6e-7abbe2fc2002")
    @Override
    public Object caseCollaboration(org.eclipse.uml2.uml.Collaboration inputCollaboration) {
        Object theResult = visitorMap.get(inputCollaboration);
        if (theResult == null) {
            visitorMap.put(inputCollaboration, inputCollaboration);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CollaborationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitCollaboration(inputCollaboration);
            theResult = super.caseCollaboration(inputCollaboration);
            for (Object collaborationRole : inputCollaboration
                    .getCollaborationRoles()) {
                this.doSwitch((EObject) collaborationRole);
            }
        }
        return theResult;
    }

    @objid ("f13be56b-1922-44b2-bf59-f268f0bed03d")
    @Override
    public Object caseCollaborationUse(org.eclipse.uml2.uml.CollaborationUse inputCollaborationUse) {
        Object theResult = visitorMap.get(inputCollaborationUse);
        if (theResult == null) {
            visitorMap.put(inputCollaborationUse, inputCollaborationUse);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CollaborationUseImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitCollaborationUse(inputCollaborationUse);
            theResult = super.caseCollaborationUse(inputCollaborationUse);
            this.doSwitch((EObject) inputCollaborationUse.getType());
            for (Object roleBinding : inputCollaborationUse.getRoleBindings()) {
                this.doSwitch((EObject) roleBinding);
            }
        }
        return theResult;
    }

    @objid ("70b2b1e0-0cf8-4121-85bd-92642af186e0")
    @Override
    public Object caseCombinedFragment(org.eclipse.uml2.uml.CombinedFragment inputCombinedFragment) {
        Object theResult = visitorMap.get(inputCombinedFragment);
        if (theResult == null) {
            visitorMap.put(inputCombinedFragment, inputCombinedFragment);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CombinedFragmentImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitCombinedFragment(inputCombinedFragment);
            theResult = super.caseCombinedFragment(inputCombinedFragment);
            for (Object operand : inputCombinedFragment.getOperands()) {
                this.doSwitch((EObject) operand);
            }
            for (Object cfragmentGate : inputCombinedFragment
                    .getCfragmentGates()) {
                this.doSwitch((EObject) cfragmentGate);
            }
        }
        return theResult;
    }

    @objid ("1e73a1a2-a361-4b33-bb1d-834894f18e03")
    @Override
    public Object caseComment(org.eclipse.uml2.uml.Comment inputComment) {
        Object theResult = visitorMap.get(inputComment);
        if (theResult == null) {
            visitorMap.put(inputComment, inputComment);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CommentImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitComment(inputComment);
            theResult = super.caseComment(inputComment);
            for (Object annotatedElement : inputComment.getAnnotatedElements()) {
                this.doSwitch((EObject) annotatedElement);
            }
        }
        return theResult;
    }

    @objid ("e9c04e92-d3e9-445e-963a-246e7c633a5b")
    @Override
    public Object caseCommunicationPath(org.eclipse.uml2.uml.CommunicationPath inputCommunicationPath) {
        Object theResult = visitorMap.get(inputCommunicationPath);
        if (theResult == null) {
            visitorMap.put(inputCommunicationPath, inputCommunicationPath);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CommunicationPathImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitCommunicationPath(inputCommunicationPath);
            theResult = super.caseCommunicationPath(inputCommunicationPath);
        }
        return theResult;
    }

    @objid ("dc4e50e7-2bb4-4e68-904e-f9211530b305")
    @Override
    public Object caseComponent(org.eclipse.uml2.uml.Component inputComponent) {
        Object theResult = visitorMap.get(inputComponent);
        if (theResult == null) {
            visitorMap.put(inputComponent, inputComponent);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ComponentImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitComponent(inputComponent);
            theResult = super.caseComponent(inputComponent);
            for (Object required : inputComponent.getRequireds()) {
                this.doSwitch((EObject) required);
            }
            for (Object provided : inputComponent.getProvideds()) {
                this.doSwitch((EObject) provided);
            }
            for (Object realization : inputComponent.getRealizations()) {
                this.doSwitch((EObject) realization);
            }
            for (Object packagedElement : inputComponent.getPackagedElements()) {
                this.doSwitch((EObject) packagedElement);
            }
        }
        return theResult;
    }

    @objid ("d700efda-9d18-4b27-b603-3a7c3c702cd9")
    @Override
    public Object caseComponentRealization(org.eclipse.uml2.uml.ComponentRealization inputComponentRealization) {
        Object theResult = visitorMap.get(inputComponentRealization);
        if (theResult == null) {
            visitorMap
            .put(inputComponentRealization, inputComponentRealization);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ComponentRealizationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitComponentRealization(inputComponentRealization);
            theResult = super
            .caseComponentRealization(inputComponentRealization);
            this.doSwitch((EObject) inputComponentRealization.getAbstraction());
        
            //            this.doSwitch((EObject) inputComponentRealization
            //                    .getRealizingClassifier());
        
            for (Object realization : inputComponentRealization.getRealizingClassifiers()) {
                this.doSwitch((EObject) realization);
            }
        }
        return theResult;
    }

    @objid ("3fd04f14-3372-41d0-874f-23d65956359e")
    @Override
    public Object caseConditionalNode(org.eclipse.uml2.uml.ConditionalNode inputConditionalNode) {
        Object theResult = visitorMap.get(inputConditionalNode);
        if (theResult == null) {
            visitorMap.put(inputConditionalNode, inputConditionalNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ConditionalNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitConditionalNode(inputConditionalNode);
            theResult = super.caseConditionalNode(inputConditionalNode);
            for (Object clause : inputConditionalNode.getClauses()) {
                this.doSwitch((EObject) clause);
            }
            for (Object result : inputConditionalNode.getResults()) {
                this.doSwitch((EObject) result);
            }
        }
        return theResult;
    }

    @objid ("0d52ff6a-a4f6-4789-aa40-fccc5f4cf7c3")
    @Override
    public Object caseConnectableElement(org.eclipse.uml2.uml.ConnectableElement inputConnectableElement) {
        Object theResult = super
        .caseConnectableElement(inputConnectableElement);
        for (Object end : inputConnectableElement.getEnds()) {
            this.doSwitch((EObject) end);
        }
        this.doSwitch((EObject) inputConnectableElement.getTemplateParameter());
        return theResult;
    }

    @objid ("aa42f0e1-54d1-41fe-a816-2503589ba196")
    @Override
    public Object caseConnectableElementTemplateParameter(org.eclipse.uml2.uml.ConnectableElementTemplateParameter inputConnectableElementTemplateParameter) {
        Object theResult = visitorMap
        .get(inputConnectableElementTemplateParameter);
        if (theResult == null) {
            visitorMap.put(inputConnectableElementTemplateParameter,
                    inputConnectableElementTemplateParameter);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ConnectableElementTemplateParameterImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitConnectableElementTemplateParameter(inputConnectableElementTemplateParameter);
            theResult = super
            .caseConnectableElementTemplateParameter(inputConnectableElementTemplateParameter);
            this.doSwitch((EObject) inputConnectableElementTemplateParameter
                    .getParameteredElement());
        }
        return theResult;
    }

    @objid ("e8e0a973-ef52-402b-a262-b18c78a39392")
    @Override
    public Object caseConnectionPointReference(org.eclipse.uml2.uml.ConnectionPointReference inputConnectionPointReference) {
        Object theResult = visitorMap.get(inputConnectionPointReference);
        if (theResult == null) {
            visitorMap.put(inputConnectionPointReference,
                    inputConnectionPointReference);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ConnectionPointReferenceImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior
            .visitConnectionPointReference(inputConnectionPointReference);
            theResult = super
            .caseConnectionPointReference(inputConnectionPointReference);
            for (Object entry : inputConnectionPointReference.getEntries()) {
                this.doSwitch((EObject) entry);
            }
            this.doSwitch((EObject) inputConnectionPointReference.getState());
            for (Object exit : inputConnectionPointReference.getExits()) {
                this.doSwitch((EObject) exit);
            }
        }
        return theResult;
    }

    @objid ("c8776c0a-ad90-49ec-9929-1886831c55b9")
    @Override
    public Object caseConnector(org.eclipse.uml2.uml.Connector inputConnector) {
        Object theResult = visitorMap.get(inputConnector);
        if (theResult == null) {
            visitorMap.put(inputConnector, inputConnector);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ConnectorImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitConnector(inputConnector);
            theResult = super.caseConnector(inputConnector);
            this.doSwitch((EObject) inputConnector.getType());
            for (Object redefinedConnector : inputConnector
                    .getRedefinedConnectors()) {
                this.doSwitch((EObject) redefinedConnector);
            }
            for (Object end : inputConnector.getEnds()) {
                this.doSwitch((EObject) end);
            }
            for (Object contract : inputConnector.getContracts()) {
                this.doSwitch((EObject) contract);
            }
        }
        return theResult;
    }

    @objid ("46dea458-935f-4a25-9abf-395c77ba1618")
    @Override
    public Object caseConnectorEnd(org.eclipse.uml2.uml.ConnectorEnd inputConnectorEnd) {
        Object theResult = visitorMap.get(inputConnectorEnd);
        if (theResult == null) {
            visitorMap.put(inputConnectorEnd, inputConnectorEnd);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ConnectorEndImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitConnectorEnd(inputConnectorEnd);
            theResult = super.caseConnectorEnd(inputConnectorEnd);
            this.doSwitch((EObject) inputConnectorEnd.getDefiningEnd());
            this.doSwitch((EObject) inputConnectorEnd.getRole());
            this.doSwitch((EObject) inputConnectorEnd.getPartWithPort());
        }
        return theResult;
    }

    @objid ("cae8f9a4-1bc3-4649-8f20-726272098e67")
    @Override
    public Object caseConsiderIgnoreFragment(org.eclipse.uml2.uml.ConsiderIgnoreFragment inputConsiderIgnoreFragment) {
        Object theResult = visitorMap.get(inputConsiderIgnoreFragment);
        if (theResult == null) {
            visitorMap.put(inputConsiderIgnoreFragment,
                    inputConsiderIgnoreFragment);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ConsiderIgnoreFragmentImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitConsiderIgnoreFragment(inputConsiderIgnoreFragment);
            theResult = super
            .caseConsiderIgnoreFragment(inputConsiderIgnoreFragment);
            for (Object message : inputConsiderIgnoreFragment.getMessages()) {
                this.doSwitch((EObject) message);
            }
        }
        return theResult;
    }

    @objid ("dd7e3e5a-a4fc-4e18-88aa-4fd4558daa76")
    @Override
    public Object caseConstraint(org.eclipse.uml2.uml.Constraint inputConstraint) {
        Object theResult = visitorMap.get(inputConstraint);
        if (theResult == null) {
            visitorMap.put(inputConstraint, inputConstraint);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ConstraintImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitConstraint(inputConstraint);
            theResult = super.caseConstraint(inputConstraint);
            for (Object constrainedElement : inputConstraint
                    .getConstrainedElements()) {
                this.doSwitch((EObject) constrainedElement);
            }
            this.doSwitch((EObject) inputConstraint.getSpecification());
            this.doSwitch((EObject) inputConstraint.getContext());
        }
        return theResult;
    }

    @objid ("28a323fd-a9ed-4f2e-97a0-ae75942a8f64")
    @Override
    public Object caseContinuation(org.eclipse.uml2.uml.Continuation inputContinuation) {
        Object theResult = visitorMap.get(inputContinuation);
        if (theResult == null) {
            visitorMap.put(inputContinuation, inputContinuation);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ContinuationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitContinuation(inputContinuation);
            theResult = super.caseContinuation(inputContinuation);
        }
        return theResult;
    }

    @objid ("8e8b6912-3c3f-45ec-b96c-a764986e2694")
    @Override
    public Object caseControlFlow(org.eclipse.uml2.uml.ControlFlow inputControlFlow) {
        Object theResult = visitorMap.get(inputControlFlow);
        if (theResult == null) {
            visitorMap.put(inputControlFlow, inputControlFlow);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ControlFlowImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitControlFlow(inputControlFlow);
            theResult = super.caseControlFlow(inputControlFlow);
        }
        return theResult;
    }

    @objid ("6f8499b6-67b4-4988-9e29-91ece530540c")
    @Override
    public Object caseControlNode(org.eclipse.uml2.uml.ControlNode inputControlNode) {
        return super.caseControlNode(inputControlNode);
    }

    @objid ("1dd0755e-8f02-4a9f-8163-8d0c77cccece")
    @Override
    public Object caseCreateLinkAction(org.eclipse.uml2.uml.CreateLinkAction inputCreateLinkAction) {
        Object theResult = visitorMap.get(inputCreateLinkAction);
        if (theResult == null) {
            visitorMap.put(inputCreateLinkAction, inputCreateLinkAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CreateLinkActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitCreateLinkAction(inputCreateLinkAction);
            theResult = super.caseCreateLinkAction(inputCreateLinkAction);
            for (Object endData : inputCreateLinkAction.getEndData()) {
                this.doSwitch((EObject) endData);
            }
        }
        return theResult;
    }

    @objid ("ae10c2d7-f9f3-4af0-b251-062b36f64aea")
    @Override
    public Object caseCreateLinkObjectAction(org.eclipse.uml2.uml.CreateLinkObjectAction inputCreateLinkObjectAction) {
        Object theResult = visitorMap.get(inputCreateLinkObjectAction);
        if (theResult == null) {
            visitorMap.put(inputCreateLinkObjectAction,
                    inputCreateLinkObjectAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CreateLinkObjectActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitCreateLinkObjectAction(inputCreateLinkObjectAction);
            theResult = super
            .caseCreateLinkObjectAction(inputCreateLinkObjectAction);
            this.doSwitch((EObject) inputCreateLinkObjectAction.getResult());
        }
        return theResult;
    }

    @objid ("1b32fc9e-36a4-40f5-9684-5a56bcc40259")
    @Override
    public Object caseCreateObjectAction(org.eclipse.uml2.uml.CreateObjectAction inputCreateObjectAction) {
        Object theResult = visitorMap.get(inputCreateObjectAction);
        if (theResult == null) {
            visitorMap.put(inputCreateObjectAction, inputCreateObjectAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CreateObjectActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitCreateObjectAction(inputCreateObjectAction);
            theResult = super.caseCreateObjectAction(inputCreateObjectAction);
            this.doSwitch((EObject) inputCreateObjectAction.getClassifier());
            this.doSwitch((EObject) inputCreateObjectAction.getResult());
        }
        return theResult;
    }

    @objid ("62158ea7-b67e-4a3e-ab3c-c6acc905825d")
    @Override
    public Object caseCreationEvent(org.eclipse.uml2.uml.CreationEvent inputCreationEvent) {
        Object theResult = visitorMap.get(inputCreationEvent);
        if (theResult == null) {
            visitorMap.put(inputCreationEvent, inputCreationEvent);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CreationEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitCreationEvent(inputCreationEvent);
            theResult = super.caseCreationEvent(inputCreationEvent);
        }
        return theResult;
    }

    @objid ("de404ac0-70b9-411d-ad8a-f454574fd4f0")
    @Override
    public Object caseDataStoreNode(org.eclipse.uml2.uml.DataStoreNode inputDataStoreNode) {
        Object theResult = visitorMap.get(inputDataStoreNode);
        if (theResult == null) {
            visitorMap.put(inputDataStoreNode, inputDataStoreNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DataStoreNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitDataStoreNode(inputDataStoreNode);
            theResult = super.caseDataStoreNode(inputDataStoreNode);
        }
        return theResult;
    }

    @objid ("e11e89e4-2da5-4005-a3b0-69aaadce51e9")
    @Override
    public Object caseDataType(org.eclipse.uml2.uml.DataType inputDataType) {
        Object theResult = visitorMap.get(inputDataType);
        if (theResult == null) {
            visitorMap.put(inputDataType, inputDataType);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DataTypeImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            behavior.visitDataType(inputDataType);
            theResult = super.caseDataType(inputDataType);
            for (Object ownedAttribute : inputDataType.getOwnedAttributes()) {
                this.doSwitch((EObject) ownedAttribute);
            }
            for (Object ownedOperation : inputDataType.getOwnedOperations()) {
                this.doSwitch((EObject) ownedOperation);
            }
        }
        return theResult;
    }

    @objid ("637499f1-1e36-414b-b077-4312b1e8baa0")
    @Override
    public Object caseDecisionNode(org.eclipse.uml2.uml.DecisionNode inputDecisionNode) {
        Object theResult = visitorMap.get(inputDecisionNode);
        if (theResult == null) {
            visitorMap.put(inputDecisionNode, inputDecisionNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DecisionNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitDecisionNode(inputDecisionNode);
            theResult = super.caseDecisionNode(inputDecisionNode);
            this.doSwitch((EObject) inputDecisionNode.getDecisionInput());
        }
        return theResult;
    }

    @objid ("74c9f794-32e7-4065-8ea4-82a3cc3a2c28")
    @Override
    public Object caseDependency(org.eclipse.uml2.uml.Dependency inputDependency) {
        Object theResult = visitorMap.get(inputDependency);
        if (theResult == null) {
            visitorMap.put(inputDependency, inputDependency);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DependencyImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitDependency(inputDependency);
            theResult = super.caseDependency(inputDependency);
            for (Object supplier : inputDependency.getSuppliers()) {
                this.doSwitch((EObject) supplier);
            }
            for (Object client : inputDependency.getClients()) {
                this.doSwitch((EObject) client);
            }
        }
        return theResult;
    }

    @objid ("c99313e5-5bbe-4d80-9989-32a899529ad5")
    @Override
    public Object caseDeployedArtifact(org.eclipse.uml2.uml.DeployedArtifact inputDeployedArtifact) {
        return super.caseDeployedArtifact(inputDeployedArtifact);
    }

    @objid ("1adfedae-eee0-4906-a431-e8926934fced")
    @Override
    public Object caseDeployment(org.eclipse.uml2.uml.Deployment inputDeployment) {
        Object theResult = visitorMap.get(inputDeployment);
        if (theResult == null) {
            visitorMap.put(inputDeployment, inputDeployment);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DeploymentImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitDeployment(inputDeployment);
            theResult = super.caseDeployment(inputDeployment);
            for (Object deployedArtifact : inputDeployment
                    .getDeployedArtifacts()) {
                this.doSwitch((EObject) deployedArtifact);
            }
            this.doSwitch((EObject) inputDeployment.getLocation());
            for (Object configuration : inputDeployment.getConfigurations()) {
                this.doSwitch((EObject) configuration);
            }
        }
        return theResult;
    }

    @objid ("c53a154a-489d-445c-95cf-4dd570086c11")
    @Override
    public Object caseDeploymentSpecification(org.eclipse.uml2.uml.DeploymentSpecification inputDeploymentSpecification) {
        Object theResult = visitorMap.get(inputDeploymentSpecification);
        if (theResult == null) {
            visitorMap.put(inputDeploymentSpecification,
                    inputDeploymentSpecification);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DeploymentSpecificationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitDeploymentSpecification(inputDeploymentSpecification);
            theResult = super
            .caseDeploymentSpecification(inputDeploymentSpecification);
            this.doSwitch((EObject) inputDeploymentSpecification
                    .getDeployment());
        }
        return theResult;
    }

    @objid ("c0f7cd7e-129a-4cdc-90d5-61c1c905fad3")
    @Override
    public Object caseDeploymentTarget(org.eclipse.uml2.uml.DeploymentTarget inputDeploymentTarget) {
        Object theResult = super.caseDeploymentTarget(inputDeploymentTarget);
        for (Object deployment : inputDeploymentTarget.getDeployments()) {
            this.doSwitch((EObject) deployment);
        }
        for (Object deployedElement : inputDeploymentTarget
                .getDeployedElements()) {
            this.doSwitch((EObject) deployedElement);
        }
        return theResult;
    }

    @objid ("53ada190-af59-48e5-8ed5-413a6352cc08")
    @Override
    public Object caseDestroyLinkAction(org.eclipse.uml2.uml.DestroyLinkAction inputDestroyLinkAction) {
        Object theResult = visitorMap.get(inputDestroyLinkAction);
        if (theResult == null) {
            visitorMap.put(inputDestroyLinkAction, inputDestroyLinkAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DestroyLinkActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitDestroyLinkAction(inputDestroyLinkAction);
            theResult = super.caseDestroyLinkAction(inputDestroyLinkAction);
            for (Object endData : inputDestroyLinkAction.getEndData()) {
                this.doSwitch((EObject) endData);
            }
        }
        return theResult;
    }

    @objid ("8e176cf8-9ad4-4aa7-b0c9-cd61cd9251d2")
    @Override
    public Object caseDestroyObjectAction(org.eclipse.uml2.uml.DestroyObjectAction inputDestroyObjectAction) {
        Object theResult = visitorMap.get(inputDestroyObjectAction);
        if (theResult == null) {
            visitorMap.put(inputDestroyObjectAction, inputDestroyObjectAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DestroyObjectActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitDestroyObjectAction(inputDestroyObjectAction);
            theResult = super.caseDestroyObjectAction(inputDestroyObjectAction);
            this.doSwitch((EObject) inputDestroyObjectAction.getTarget());
        }
        return theResult;
    }

    @objid ("26479f1d-4c52-4f31-81a9-fd557cd29bc4")
    @Override
    public Object caseDestructionEvent(org.eclipse.uml2.uml.DestructionEvent inputDestructionEvent) {
        Object theResult = visitorMap.get(inputDestructionEvent);
        if (theResult == null) {
            visitorMap.put(inputDestructionEvent, inputDestructionEvent);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DestructionEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitDestructionEvent(inputDestructionEvent);
            theResult = super.caseDestructionEvent(inputDestructionEvent);
        }
        return theResult;
    }

    @objid ("6c732e52-b6c4-4fc4-91ee-ac2c8774414c")
    @Override
    public Object caseDevice(org.eclipse.uml2.uml.Device inputDevice) {
        Object theResult = visitorMap.get(inputDevice);
        if (theResult == null) {
            visitorMap.put(inputDevice, inputDevice);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DeviceImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitDevice(inputDevice);
            theResult = super.caseDevice(inputDevice);
        }
        return theResult;
    }

    @objid ("ac649c37-9831-42a3-af7a-b32a42b7b82f")
    @Override
    public Object caseDirectedRelationship(org.eclipse.uml2.uml.DirectedRelationship inputDirectedRelationship) {
        Object theResult = super
        .caseDirectedRelationship(inputDirectedRelationship);
        for (Object source : inputDirectedRelationship.getSources()) {
            this.doSwitch((EObject) source);
        }
        for (Object target : inputDirectedRelationship.getTargets()) {
            this.doSwitch((EObject) target);
        }
        return theResult;
    }

    @objid ("e5e31a2e-75e3-4609-88fa-97cb3e601a80")
    @Override
    public Object caseDuration(org.eclipse.uml2.uml.Duration inputDuration) {
        Object theResult = visitorMap.get(inputDuration);
        if (theResult == null) {
            visitorMap.put(inputDuration, inputDuration);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DurationImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            behavior.visitDuration(inputDuration);
            theResult = super.caseDuration(inputDuration);
            this.doSwitch((EObject) inputDuration.getExpr());
            for (Object observation : inputDuration.getObservations()) {
                this.doSwitch((EObject) observation);
            }
        }
        return theResult;
    }

    @objid ("c686d8fc-fa66-4b13-891d-905ec0affb9a")
    @Override
    public Object caseDurationConstraint(org.eclipse.uml2.uml.DurationConstraint inputDurationConstraint) {
        Object theResult = visitorMap.get(inputDurationConstraint);
        if (theResult == null) {
            visitorMap.put(inputDurationConstraint, inputDurationConstraint);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DurationConstraintImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitDurationConstraint(inputDurationConstraint);
            theResult = super.caseDurationConstraint(inputDurationConstraint);
            this.doSwitch((EObject) inputDurationConstraint.getSpecification());
        }
        return theResult;
    }

    @objid ("270bd71f-f8d2-4170-a99a-0acdc8eace1b")
    @Override
    public Object caseDurationInterval(org.eclipse.uml2.uml.DurationInterval inputDurationInterval) {
        Object theResult = visitorMap.get(inputDurationInterval);
        if (theResult == null) {
            visitorMap.put(inputDurationInterval, inputDurationInterval);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DurationIntervalImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitDurationInterval(inputDurationInterval);
            theResult = super.caseDurationInterval(inputDurationInterval);
            this.doSwitch((EObject) inputDurationInterval.getMin());
            this.doSwitch((EObject) inputDurationInterval.getMax());
        }
        return theResult;
    }

    @objid ("9fd90446-33b9-4433-a5a8-b70a27feac0a")
    @Override
    public Object caseDurationObservation(final DurationObservation inputDurationIservation) {
        Object theResult = visitorMap.get(inputDurationIservation);
        if (theResult == null) {
            visitorMap.put(inputDurationIservation, inputDurationIservation);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DurationIservationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitDurationObservation(inputDurationIservation);
            theResult = super.caseDurationObservation(inputDurationIservation);
            for (Object event : inputDurationIservation.getEvents()) {
                this.doSwitch((EObject) event);
            }
        }
        return theResult;
    }

    @objid ("7cd4caee-3e92-41f1-ab97-359c966b0aa9")
    @Override
    public Object caseElement(org.eclipse.uml2.uml.Element inputElement) {
        Object theResult = super.caseElement(inputElement);
        for (Object ownedElement : inputElement.getOwnedElements()) {
            this.doSwitch((EObject) ownedElement);
        }
        this.doSwitch((EObject) inputElement.getOwner());
        for (Object ownedComment : inputElement.getOwnedComments()) {
            this.doSwitch((EObject) ownedComment);
        }
        return theResult;
    }

    @objid ("62f3bb42-e977-4611-985d-19c7668b1e3f")
    @Override
    public Object caseElementImport(org.eclipse.uml2.uml.ElementImport inputElementImport) {
        Object theResult = visitorMap.get(inputElementImport);
        if (theResult == null) {
            visitorMap.put(inputElementImport, inputElementImport);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ElementImportImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitElementImport(inputElementImport);
            theResult = super.caseElementImport(inputElementImport);
            this.doSwitch((EObject) inputElementImport.getImportedElement());
            this.doSwitch((EObject) inputElementImport.getImportingNamespace());
        }
        return theResult;
    }

    @objid ("105023d8-8875-4832-a75d-484d76dcfde7")
    @Override
    public Object caseEncapsulatedClassifier(org.eclipse.uml2.uml.EncapsulatedClassifier inputEncapsulatedClassifier) {
        Object theResult = super
        .caseEncapsulatedClassifier(inputEncapsulatedClassifier);
        for (Object ownedPort : inputEncapsulatedClassifier.getOwnedPorts()) {
            this.doSwitch((EObject) ownedPort);
        }
        return theResult;
    }

    @objid ("83731774-7515-4a57-af57-5913afd784f6")
    @Override
    public Object caseEnumeration(org.eclipse.uml2.uml.Enumeration inputEnumeration) {
        Object theResult = visitorMap.get(inputEnumeration);
        if (theResult == null) {
            visitorMap.put(inputEnumeration, inputEnumeration);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("EnumerationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitEnumeration(inputEnumeration);
            theResult = super.caseEnumeration(inputEnumeration);
            for (Object ownedLiteral : inputEnumeration.getOwnedLiterals()) {
                this.doSwitch((EObject) ownedLiteral);
            }
        }
        return theResult;
    }

    @objid ("38bf70e7-7332-4990-945b-41fa1a398461")
    @Override
    public Object caseEnumerationLiteral(org.eclipse.uml2.uml.EnumerationLiteral inputEnumerationLiteral) {
        Object theResult = visitorMap.get(inputEnumerationLiteral);
        if (theResult == null) {
            visitorMap.put(inputEnumerationLiteral, inputEnumerationLiteral);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("EnumerationLiteralImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitEnumerationLiteral(inputEnumerationLiteral);
            theResult = super.caseEnumerationLiteral(inputEnumerationLiteral);
            this.doSwitch((EObject) inputEnumerationLiteral.getEnumeration());
        }
        return theResult;
    }

    @objid ("ee551dd3-c8f7-4b42-9379-9ec801b5d6ce")
    @Override
    public Object caseEvent(org.eclipse.uml2.uml.Event inputEvent) {
        return super.caseEvent(inputEvent);
    }

    @objid ("e9139c46-80df-4145-a772-8750f45a8f9b")
    @Override
    public Object caseExceptionHandler(ExceptionHandler inputExceptionHandler) {
        Object theResult = visitorMap.get(inputExceptionHandler);
        if (theResult == null) {
            visitorMap.put(inputExceptionHandler, inputExceptionHandler);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExceptionHandlerImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitExceptionHandler(inputExceptionHandler);
            theResult = super.caseExceptionHandler(inputExceptionHandler);
            this.doSwitch((EObject) inputExceptionHandler.getProtectedNode());
            this.doSwitch((EObject) inputExceptionHandler.getHandlerBody());
            this.doSwitch((EObject) inputExceptionHandler.getExceptionInput());
            for (Object exceptionType : inputExceptionHandler
                    .getExceptionTypes()) {
                this.doSwitch((EObject) exceptionType);
            }
        }
        return theResult;
    }

    @objid ("18190a12-dea9-4b61-b307-7e90de9830d6")
    @Override
    public Object caseExecutableNode(org.eclipse.uml2.uml.ExecutableNode inputExecutableNode) {
        Object theResult = super.caseExecutableNode(inputExecutableNode);
        for (Object handler : inputExecutableNode.getHandlers()) {
            this.doSwitch((EObject) handler);
        }
        return theResult;
    }

    @objid ("7ae23ae0-ab30-4694-a82f-23266dd8b1d6")
    @Override
    public Object caseExecutionEnvironment(org.eclipse.uml2.uml.ExecutionEnvironment inputExecutionEnvironment) {
        Object theResult = visitorMap.get(inputExecutionEnvironment);
        if (theResult == null) {
            visitorMap
            .put(inputExecutionEnvironment, inputExecutionEnvironment);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExecutionEnvironmentImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitExecutionEnvironment(inputExecutionEnvironment);
            theResult = super
            .caseExecutionEnvironment(inputExecutionEnvironment);
        }
        return theResult;
    }

    @objid ("aa37748e-df2a-4779-aad3-1c171bf89c4e")
    @Override
    public Object caseExecutionEvent(org.eclipse.uml2.uml.ExecutionEvent inputExecutionEvent) {
        Object theResult = visitorMap.get(inputExecutionEvent);
        if (theResult == null) {
            visitorMap.put(inputExecutionEvent, inputExecutionEvent);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExecutionEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitExecutionEvent(inputExecutionEvent);
            theResult = super.caseExecutionEvent(inputExecutionEvent);
        }
        return theResult;
    }

    @objid ("97c023d6-f010-400e-801f-f0b3e6db362b")
    @Override
    public Object caseExecutionOccurrenceSpecification(org.eclipse.uml2.uml.ExecutionOccurrenceSpecification inputExecutionOccurrenceSpecification) {
        Object theResult = visitorMap
        .get(inputExecutionOccurrenceSpecification);
        if (theResult == null) {
            visitorMap.put(inputExecutionOccurrenceSpecification,
                    inputExecutionOccurrenceSpecification);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExecutionOccurrenceSpecificationImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitExecutionOccurrenceSpecification(inputExecutionOccurrenceSpecification);
            theResult = super
            .caseExecutionOccurrenceSpecification(inputExecutionOccurrenceSpecification);
            this.doSwitch((EObject) inputExecutionOccurrenceSpecification
                    .getExecution());
        //            this.doSwitch((EObject) inputExecutionOccurrenceSpecification
        //                    .getEvent());
        }
        return theResult;
    }

    @objid ("fd33b90a-b09c-453c-9035-f62ad1970be7")
    @Override
    public Object caseExecutionSpecification(org.eclipse.uml2.uml.ExecutionSpecification inputExecutionSpecification) {
        Object theResult = super
        .caseExecutionSpecification(inputExecutionSpecification);
        this.doSwitch((EObject) inputExecutionSpecification.getStart());
        this.doSwitch((EObject) inputExecutionSpecification.getFinish());
        return theResult;
    }

    @objid ("0fe8faf2-77ba-4c1d-ac1b-8c87e3bba2e2")
    @Override
    public Object caseExpansionNode(org.eclipse.uml2.uml.ExpansionNode inputExpansionNode) {
        Object theResult = visitorMap.get(inputExpansionNode);
        if (theResult == null) {
            visitorMap.put(inputExpansionNode, inputExpansionNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExpansionNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitExpansionNode(inputExpansionNode);
            theResult = super.caseExpansionNode(inputExpansionNode);
            this.doSwitch((EObject) inputExpansionNode.getRegionAsOutput());
            this.doSwitch((EObject) inputExpansionNode.getRegionAsInput());
        }
        return theResult;
    }

    @objid ("6010ba8f-3511-40bd-86b4-0e5934bad9aa")
    @Override
    public Object caseExpansionRegion(org.eclipse.uml2.uml.ExpansionRegion inputExpansionRegion) {
        Object theResult = visitorMap.get(inputExpansionRegion);
        if (theResult == null) {
            visitorMap.put(inputExpansionRegion, inputExpansionRegion);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExpansionRegionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitExpansionRegion(inputExpansionRegion);
            theResult = super.caseExpansionRegion(inputExpansionRegion);
            for (Object outputElement : inputExpansionRegion
                    .getOutputElements()) {
                this.doSwitch((EObject) outputElement);
            }
            for (Object inputElement : inputExpansionRegion.getInputElements()) {
                this.doSwitch((EObject) inputElement);
            }
        }
        return theResult;
    }

    @objid ("6e0ee4fa-45c7-484a-9cbd-d00787588e20")
    @Override
    public Object caseExpression(org.eclipse.uml2.uml.Expression inputExpression) {
        Object theResult = visitorMap.get(inputExpression);
        if (theResult == null) {
            visitorMap.put(inputExpression, inputExpression);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExpressionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitExpression(inputExpression);
            theResult = super.caseExpression(inputExpression);
            for (Object operand : inputExpression.getOperands()) {
                this.doSwitch((EObject) operand);
            }
        }
        return theResult;
    }

    @objid ("d0aa227e-49b2-44d9-8ccc-18c78fc7fd93")
    @Override
    public Object caseExtend(org.eclipse.uml2.uml.Extend inputExtend) {
        Object theResult = visitorMap.get(inputExtend);
        if (theResult == null) {
            visitorMap.put(inputExtend, inputExtend);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExtendImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitExtend(inputExtend);
            theResult = super.caseExtend(inputExtend);
            this.doSwitch((EObject) inputExtend.getExtendedCase());
            this.doSwitch((EObject) inputExtend.getExtension());
            this.doSwitch((EObject) inputExtend.getCondition());
            for (Object extensionLocation : inputExtend.getExtensionLocations()) {
                this.doSwitch((EObject) extensionLocation);
            }
        }
        return theResult;
    }

    @objid ("164b9c3b-60e8-412b-b1be-9626e641d237")
    @Override
    public Object caseExtension(org.eclipse.uml2.uml.Extension inputExtension) {
        Object theResult = visitorMap.get(inputExtension);
        if (theResult == null) {
            visitorMap.put(inputExtension, inputExtension);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExtensionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitExtension(inputExtension);
            theResult = super.caseExtension(inputExtension);
            this.doSwitch((EObject) inputExtension.getMetaclass());
            // this.doSwitch((EObject)inputExtension.getOwnedEnd());
            for (Object ownedEnd : inputExtension.getOwnedEnds()) {
                this.doSwitch((EObject) ownedEnd);
            }
        }
        return theResult;
    }

    @objid ("e664c96c-7ee6-4ece-96cb-34a8006e1780")
    @Override
    public Object caseExtensionEnd(org.eclipse.uml2.uml.ExtensionEnd inputExtensionEnd) {
        Object theResult = visitorMap.get(inputExtensionEnd);
        if (theResult == null) {
            visitorMap.put(inputExtensionEnd, inputExtensionEnd);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExtensionEndImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitExtensionEnd(inputExtensionEnd);
            theResult = super.caseExtensionEnd(inputExtensionEnd);
            this.doSwitch((EObject) inputExtensionEnd.getType());
        }
        return theResult;
    }

    @objid ("b1a82dc7-d816-4aa6-90b7-a17ce92f047b")
    @Override
    public Object caseExtensionPoint(org.eclipse.uml2.uml.ExtensionPoint inputExtensionPoint) {
        Object theResult = visitorMap.get(inputExtensionPoint);
        if (theResult == null) {
            visitorMap.put(inputExtensionPoint, inputExtensionPoint);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExtensionPointImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitExtensionPoint(inputExtensionPoint);
            theResult = super.caseExtensionPoint(inputExtensionPoint);
            this.doSwitch((EObject) inputExtensionPoint.getUseCase());
        }
        return theResult;
    }

    @objid ("60bbcd17-894d-4fa7-abbd-68ff3a53ad8a")
    @Override
    public Object caseFeature(org.eclipse.uml2.uml.Feature inputFeature) {
        Object theResult = super.caseFeature(inputFeature);
        for (Object featuringClassifier : inputFeature
                .getFeaturingClassifiers()) {
            this.doSwitch((EObject) featuringClassifier);
        }
        return theResult;
    }

    @objid ("72db2ce7-0448-4a46-9b9e-d2ded5f9fd20")
    @Override
    public Object caseFinalNode(FinalNode inputFinalNode) {
        return super.caseFinalNode(inputFinalNode);
    }

    @objid ("7e598e46-010c-4868-9883-8d09586e8285")
    @Override
    public Object caseFinalState(FinalState inputFinalState) {
        Object theResult = visitorMap.get(inputFinalState);
        if (theResult == null) {
            visitorMap.put(inputFinalState, inputFinalState);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("FinalStateImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitFinalState(inputFinalState);
            theResult = super.caseFinalState(inputFinalState);
        }
        return theResult;
    }

    @objid ("7f3b2625-ae45-4d15-8bb9-cf553fa5dc5a")
    @Override
    public Object caseFlowFinalNode(org.eclipse.uml2.uml.FlowFinalNode inputFlowFinalNode) {
        Object theResult = visitorMap.get(inputFlowFinalNode);
        if (theResult == null) {
            visitorMap.put(inputFlowFinalNode, inputFlowFinalNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("FlowFinalNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitFlowFinalNode(inputFlowFinalNode);
            theResult = super.caseFlowFinalNode(inputFlowFinalNode);
        }
        return theResult;
    }

    @objid ("52daab22-bd75-4d1c-89b9-814f49f5d5d9")
    @Override
    public Object caseForkNode(org.eclipse.uml2.uml.ForkNode inputForkNode) {
        Object theResult = visitorMap.get(inputForkNode);
        if (theResult == null) {
            visitorMap.put(inputForkNode, inputForkNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ForkNodeImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            behavior.visitForkNode(inputForkNode);
            theResult = super.caseForkNode(inputForkNode);
        }
        return theResult;
    }

    @objid ("7fcf10b4-672a-4011-bfac-c5aae8774ab0")
    @Override
    public Object caseFunctionBehavior(org.eclipse.uml2.uml.FunctionBehavior inputFunctionBehavior) {
        Object theResult = visitorMap.get(inputFunctionBehavior);
        if (theResult == null) {
            visitorMap.put(inputFunctionBehavior, inputFunctionBehavior);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("FunctionBehaviorImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitFunctionBehavior(inputFunctionBehavior);
            theResult = super.caseFunctionBehavior(inputFunctionBehavior);
        }
        return theResult;
    }

    @objid ("74b9cbf6-3121-4524-9a5e-49f8d293c6a7")
    @Override
    public Object caseGate(org.eclipse.uml2.uml.Gate inputGate) {
        Object theResult = visitorMap.get(inputGate);
        if (theResult == null) {
            visitorMap.put(inputGate, inputGate);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("GateImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitGate(inputGate);
            theResult = super.caseGate(inputGate);
        }
        return theResult;
    }

    @objid ("1cd28aa7-a887-40ea-9fc3-b989cbe6f398")
    @Override
    public Object caseGeneralOrdering(org.eclipse.uml2.uml.GeneralOrdering inputGeneralOrdering) {
        Object theResult = visitorMap.get(inputGeneralOrdering);
        if (theResult == null) {
            visitorMap.put(inputGeneralOrdering, inputGeneralOrdering);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("GeneralOrderingImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitGeneralOrdering(inputGeneralOrdering);
            theResult = super.caseGeneralOrdering(inputGeneralOrdering);
            this.doSwitch((EObject) inputGeneralOrdering.getBefore());
            this.doSwitch((EObject) inputGeneralOrdering.getAfter());
        }
        return theResult;
    }

    @objid ("a0c63d2c-3c88-49a1-b00d-a0c5124eac9e")
    @Override
    public Object caseGeneralization(org.eclipse.uml2.uml.Generalization inputGeneralization) {
        Object theResult = visitorMap.get(inputGeneralization);
        if (theResult == null) {
            visitorMap.put(inputGeneralization, inputGeneralization);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("GeneralizationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitGeneralization(inputGeneralization);
            theResult = super.caseGeneralization(inputGeneralization);
            this.doSwitch((EObject) inputGeneralization.getSpecific());
            this.doSwitch((EObject) inputGeneralization.getGeneral());
            for (Object generalizationSet : inputGeneralization
                    .getGeneralizationSets()) {
                this.doSwitch((EObject) generalizationSet);
            }
        }
        return theResult;
    }

    @objid ("ca6bfd44-d79d-4248-a706-6eda83ccaf90")
    @Override
    public Object caseGeneralizationSet(org.eclipse.uml2.uml.GeneralizationSet inputGeneralizationSet) {
        Object theResult = visitorMap.get(inputGeneralizationSet);
        if (theResult == null) {
            visitorMap.put(inputGeneralizationSet, inputGeneralizationSet);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("GeneralizationSetImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitGeneralizationSet(inputGeneralizationSet);
            theResult = super.caseGeneralizationSet(inputGeneralizationSet);
            this.doSwitch((EObject) inputGeneralizationSet.getPowertype());
            for (Object generalization : inputGeneralizationSet
                    .getGeneralizations()) {
                this.doSwitch((EObject) generalization);
            }
        }
        return theResult;
    }

    @objid ("8a91c38e-40ce-4f1f-ab60-87e68209fb70")
    @Override
    public Object caseImage(org.eclipse.uml2.uml.Image inputImage) {
        Object theResult = visitorMap.get(inputImage);
        if (theResult == null) {
            visitorMap.put(inputImage, inputImage);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ImageImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitImage(inputImage);
            theResult = super.caseImage(inputImage);
        }
        return theResult;
    }

    @objid ("184d7d30-30af-4651-a325-97600bb1993c")
    @Override
    public Object caseInclude(org.eclipse.uml2.uml.Include inputInclude) {
        Object theResult = visitorMap.get(inputInclude);
        if (theResult == null) {
            visitorMap.put(inputInclude, inputInclude);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("IncludeImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitInclude(inputInclude);
            theResult = super.caseInclude(inputInclude);
            this.doSwitch((EObject) inputInclude.getIncludingCase());
            this.doSwitch((EObject) inputInclude.getAddition());
        }
        return theResult;
    }

    @objid ("ee4a5239-0151-41d6-a9f7-601456a34d77")
    @Override
    public Object caseInformationFlow(org.eclipse.uml2.uml.InformationFlow inputInformationFlow) {
        Object theResult = visitorMap.get(inputInformationFlow);
        if (theResult == null) {
            visitorMap.put(inputInformationFlow, inputInformationFlow);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InformationFlowImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitInformationFlow(inputInformationFlow);
            theResult = super.caseInformationFlow(inputInformationFlow);
            for (Object realization : inputInformationFlow.getRealizations()) {
                this.doSwitch((EObject) realization);
            }
            for (Object conveyed : inputInformationFlow.getConveyeds()) {
                this.doSwitch((EObject) conveyed);
            }
            for (Object informationSource : inputInformationFlow
                    .getInformationSources()) {
                this.doSwitch((EObject) informationSource);
            }
            for (Object informationTarget : inputInformationFlow
                    .getInformationTargets()) {
                this.doSwitch((EObject) informationTarget);
            }
            for (Object realizingActivityEdge : inputInformationFlow
                    .getRealizingActivityEdges()) {
                this.doSwitch((EObject) realizingActivityEdge);
            }
            for (Object realizingConnector : inputInformationFlow
                    .getRealizingConnectors()) {
                this.doSwitch((EObject) realizingConnector);
            }
            for (Object realizingMessage : inputInformationFlow
                    .getRealizingMessages()) {
                this.doSwitch((EObject) realizingMessage);
            }
        }
        return theResult;
    }

    @objid ("84859ecb-f018-4c3f-bffc-e8d95d3b3e15")
    @Override
    public Object caseInformationItem(org.eclipse.uml2.uml.InformationItem inputInformationItem) {
        Object theResult = visitorMap.get(inputInformationItem);
        if (theResult == null) {
            visitorMap.put(inputInformationItem, inputInformationItem);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InformationItemImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitInformationItem(inputInformationItem);
            theResult = super.caseInformationItem(inputInformationItem);
            for (Object represented : inputInformationItem.getRepresenteds()) {
                this.doSwitch((EObject) represented);
            }
        }
        return theResult;
    }

    @objid ("e1541b2b-d18d-4a0b-927e-6732549fd7f5")
    @Override
    public Object caseInitialNode(org.eclipse.uml2.uml.InitialNode inputInitialNode) {
        Object theResult = visitorMap.get(inputInitialNode);
        if (theResult == null) {
            visitorMap.put(inputInitialNode, inputInitialNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InitialNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitInitialNode(inputInitialNode);
            theResult = super.caseInitialNode(inputInitialNode);
        }
        return theResult;
    }

    @objid ("a91c1954-bd53-4657-8da4-deeacb0bc2c7")
    @Override
    public Object caseInputPin(org.eclipse.uml2.uml.InputPin inputInputPin) {
        Object theResult = visitorMap.get(inputInputPin);
        if (theResult == null) {
            visitorMap.put(inputInputPin, inputInputPin);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InputPinImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            behavior.visitInputPin(inputInputPin);
            theResult = super.caseInputPin(inputInputPin);
        }
        return theResult;
    }

    @objid ("8895f5cd-c795-4de8-bc38-7a363b7f0ccb")
    @Override
    public Object caseInstanceSpecification(InstanceSpecification inputInstanceSpecification) {
        Object theResult = visitorMap.get(inputInstanceSpecification);
        if (theResult == null) {
            visitorMap.put(inputInstanceSpecification,
                    inputInstanceSpecification);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InstanceSpecificationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitInstanceSpecification(inputInstanceSpecification);
            theResult = super
            .caseInstanceSpecification(inputInstanceSpecification);
            for (Object classifier : inputInstanceSpecification
                    .getClassifiers()) {
                this.doSwitch((EObject) classifier);
            }
            for (Object slot : inputInstanceSpecification.getSlots()) {
                this.doSwitch((EObject) slot);
            }
            this.doSwitch((EObject) inputInstanceSpecification
                    .getSpecification());
        }
        return theResult;
    }

    @objid ("c807cbe6-42a1-4814-bc60-4333e24fd4a5")
    @Override
    public Object caseInstanceValue(InstanceValue inputInstanceValue) {
        Object theResult = visitorMap.get(inputInstanceValue);
        if (theResult == null) {
            visitorMap.put(inputInstanceValue, inputInstanceValue);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InstanceValueImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitInstanceValue(inputInstanceValue);
            theResult = super.caseInstanceValue(inputInstanceValue);
            this.doSwitch((EObject) inputInstanceValue.getInstance());
        }
        return theResult;
    }

    @objid ("320064eb-69d2-436f-8498-750740cfffe1")
    @Override
    public Object caseInteraction(org.eclipse.uml2.uml.Interaction inputInteraction) {
        Object theResult = visitorMap.get(inputInteraction);
        if (theResult == null) {
            visitorMap.put(inputInteraction, inputInteraction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InteractionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitInteraction(inputInteraction);
            theResult = super.caseInteraction(inputInteraction);
            for (Object lifeline : inputInteraction.getLifelines()) {
                this.doSwitch((EObject) lifeline);
            }
            for (Object message : inputInteraction.getMessages()) {
                this.doSwitch((EObject) message);
            }
            for (Object fragment : inputInteraction.getFragments()) {
                this.doSwitch((EObject) fragment);
            }
            for (Object action : inputInteraction.getActions()) {
                this.doSwitch((EObject) action);
            }
            for (Object formalGate : inputInteraction.getFormalGates()) {
                this.doSwitch((EObject) formalGate);
            }
        }
        return theResult;
    }

    @objid ("c782f76a-2276-4641-9b76-4041fe59865d")
    @Override
    public Object caseInteractionConstraint(org.eclipse.uml2.uml.InteractionConstraint inputInteractionConstraint) {
        Object theResult = visitorMap.get(inputInteractionConstraint);
        if (theResult == null) {
            visitorMap.put(inputInteractionConstraint,
                    inputInteractionConstraint);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InteractionConstraintImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitInteractionConstraint(inputInteractionConstraint);
            theResult = super
            .caseInteractionConstraint(inputInteractionConstraint);
            this.doSwitch((EObject) inputInteractionConstraint.getMinint());
            this.doSwitch((EObject) inputInteractionConstraint.getMaxint());
        }
        return theResult;
    }

    @objid ("ca5a6c06-460c-422c-ab36-b72ed919dcea")
    @Override
    public Object caseInteractionFragment(org.eclipse.uml2.uml.InteractionFragment inputInteractionFragment) {
        Object theResult = super
        .caseInteractionFragment(inputInteractionFragment);
        for (Object covered : inputInteractionFragment.getCovereds()) {
            this.doSwitch((EObject) covered);
        }
        for (Object generalOrdering : inputInteractionFragment
                .getGeneralOrderings()) {
            this.doSwitch((EObject) generalOrdering);
        }
        this.doSwitch((EObject) inputInteractionFragment
                .getEnclosingInteraction());
        this.doSwitch((EObject) inputInteractionFragment.getEnclosingOperand());
        return theResult;
    }

    @objid ("0fb4ad93-7ac4-4345-b117-92ea55238ed1")
    @Override
    public Object caseInteractionOperand(org.eclipse.uml2.uml.InteractionOperand inputInteractionOperand) {
        Object theResult = visitorMap.get(inputInteractionOperand);
        if (theResult == null) {
            visitorMap.put(inputInteractionOperand, inputInteractionOperand);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InteractionOperandImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitInteractionOperand(inputInteractionOperand);
            theResult = super.caseInteractionOperand(inputInteractionOperand);
            this.doSwitch((EObject) inputInteractionOperand.getGuard());
            for (Object fragment : inputInteractionOperand.getFragments()) {
                this.doSwitch((EObject) fragment);
            }
        }
        return theResult;
    }

    @objid ("ea411216-fce3-4d0f-b235-f6fe53f0e109")
    @Override
    public Object caseInteractionUse(org.eclipse.uml2.uml.InteractionUse inputInteractionUse) {
        Object theResult = visitorMap.get(inputInteractionUse);
        if (theResult == null) {
            visitorMap.put(inputInteractionUse, inputInteractionUse);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InteractionUseImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitInteractionUse(inputInteractionUse);
            theResult = super.caseInteractionUse(inputInteractionUse);
            this.doSwitch((EObject) inputInteractionUse.getRefersTo());
            for (Object actualGate : inputInteractionUse.getActualGates()) {
                this.doSwitch((EObject) actualGate);
            }
            for (Object argument : inputInteractionUse.getArguments()) {
                this.doSwitch((EObject) argument);
            }
        }
        return theResult;
    }

    @objid ("69acfc7f-b61c-4f31-b03e-137837a4fb0a")
    @Override
    public Object caseInterface(org.eclipse.uml2.uml.Interface inputInterface) {
        Object theResult = visitorMap.get(inputInterface);
        if (theResult == null) {
            visitorMap.put(inputInterface, inputInterface);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InterfaceImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitInterface(inputInterface);
            theResult = super.caseInterface(inputInterface);
            for (Object ownedAttribute : inputInterface.getOwnedAttributes()) {
                this.doSwitch((EObject) ownedAttribute);
            }
            for (Object ownedOperation : inputInterface.getOwnedOperations()) {
                this.doSwitch((EObject) ownedOperation);
            }
            for (Object nestedClassifier : inputInterface
                    .getNestedClassifiers()) {
                this.doSwitch((EObject) nestedClassifier);
            }
            for (Object redefinedInterface : inputInterface
                    .getRedefinedInterfaces()) {
                this.doSwitch((EObject) redefinedInterface);
            }
            for (Object ownedReception : inputInterface.getOwnedReceptions()) {
                this.doSwitch((EObject) ownedReception);
            }
            this.doSwitch((EObject) inputInterface.getProtocol());
        }
        return theResult;
    }

    @objid ("f1f07138-b1d8-4672-9136-57c1a5596e4e")
    @Override
    public Object caseInterfaceRealization(org.eclipse.uml2.uml.InterfaceRealization inputInterfaceRealization) {
        Object theResult = visitorMap.get(inputInterfaceRealization);
        if (theResult == null) {
            visitorMap
            .put(inputInterfaceRealization, inputInterfaceRealization);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InterfaceRealizationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitInterfaceRealization(inputInterfaceRealization);
            theResult = super
            .caseInterfaceRealization(inputInterfaceRealization);
            this.doSwitch((EObject) inputInterfaceRealization.getContract());
            this.doSwitch((EObject) inputInterfaceRealization
                    .getImplementingClassifier());
        }
        return theResult;
    }

    @objid ("1765a5de-7ebb-40f9-a88f-a9b9088fb858")
    @Override
    public Object caseInterruptibleActivityRegion(org.eclipse.uml2.uml.InterruptibleActivityRegion inputInterruptibleActivityRegion) {
        Object theResult = visitorMap.get(inputInterruptibleActivityRegion);
        if (theResult == null) {
            visitorMap.put(inputInterruptibleActivityRegion,
                    inputInterruptibleActivityRegion);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InterruptibleActivityRegionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitInterruptibleActivityRegion(inputInterruptibleActivityRegion);
            theResult = super
            .caseInterruptibleActivityRegion(inputInterruptibleActivityRegion);
            for (Object interruptingEdge : inputInterruptibleActivityRegion
                    .getInterruptingEdges()) {
                this.doSwitch((EObject) interruptingEdge);
            }
            for (Object node : inputInterruptibleActivityRegion.getNodes()) {
                this.doSwitch((EObject) node);
            }
        }
        return theResult;
    }

    @objid ("43fb3088-18b3-4162-be4c-fa938351a8f0")
    @Override
    public Object caseInterval(org.eclipse.uml2.uml.Interval inputInterval) {
        Object theResult = visitorMap.get(inputInterval);
        if (theResult == null) {
            visitorMap.put(inputInterval, inputInterval);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("IntervalImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            behavior.visitInterval(inputInterval);
            theResult = super.caseInterval(inputInterval);
            this.doSwitch((EObject) inputInterval.getMin());
            this.doSwitch((EObject) inputInterval.getMax());
        }
        return theResult;
    }

    @objid ("fc00f9ed-2bfb-480c-b852-ff5f0f340004")
    @Override
    public Object caseIntervalConstraint(org.eclipse.uml2.uml.IntervalConstraint inputIntervalConstraint) {
        Object theResult = visitorMap.get(inputIntervalConstraint);
        if (theResult == null) {
            visitorMap.put(inputIntervalConstraint, inputIntervalConstraint);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("IntervalConstraintImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitIntervalConstraint(inputIntervalConstraint);
            theResult = super.caseIntervalConstraint(inputIntervalConstraint);
            this.doSwitch((EObject) inputIntervalConstraint.getSpecification());
        }
        return theResult;
    }

    @objid ("c859ac2b-63cf-4833-b0e4-c6ea099c0de9")
    @Override
    public Object caseInvocationAction(org.eclipse.uml2.uml.InvocationAction inputInvocationAction) {
        Object theResult = super.caseInvocationAction(inputInvocationAction);
        for (Object argument : inputInvocationAction.getArguments()) {
            this.doSwitch((EObject) argument);
        }
        this.doSwitch((EObject) inputInvocationAction.getOnPort());
        return theResult;
    }

    @objid ("1d05bc84-e981-42b0-b1d4-c34bf8d40815")
    @Override
    public Object caseJoinNode(org.eclipse.uml2.uml.JoinNode inputJoinNode) {
        Object theResult = visitorMap.get(inputJoinNode);
        if (theResult == null) {
            visitorMap.put(inputJoinNode, inputJoinNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("JoinNodeImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            behavior.visitJoinNode(inputJoinNode);
            theResult = super.caseJoinNode(inputJoinNode);
            this.doSwitch((EObject) inputJoinNode.getJoinSpec());
        }
        return theResult;
    }

    @objid ("246f801a-9100-4dd1-b17c-8d019ae4bb09")
    @Override
    public Object caseLifeline(org.eclipse.uml2.uml.Lifeline inputLifeline) {
        Object theResult = visitorMap.get(inputLifeline);
        if (theResult == null) {
            visitorMap.put(inputLifeline, inputLifeline);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LifelineImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            behavior.visitLifeline(inputLifeline);
            theResult = super.caseLifeline(inputLifeline);
            for (Object coveredBy : inputLifeline.getCoveredBys()) {
                this.doSwitch((EObject) coveredBy);
            }
            this.doSwitch((EObject) inputLifeline.getRepresents());
            this.doSwitch((EObject) inputLifeline.getInteraction());
            this.doSwitch((EObject) inputLifeline.getSelector());
            this.doSwitch((EObject) inputLifeline.getDecomposedAs());
        }
        return theResult;
    }

    @objid ("44c2feef-04cc-441e-9d4c-faefa8850dc3")
    @Override
    public Object caseLinkAction(org.eclipse.uml2.uml.LinkAction inputLinkAction) {
        Object theResult = super.caseLinkAction(inputLinkAction);
        for (Object endData : inputLinkAction.getEndData()) {
            this.doSwitch((EObject) endData);
        }
        for (Object inputValue : inputLinkAction.getInputValues()) {
            this.doSwitch((EObject) inputValue);
        }
        return theResult;
    }

    @objid ("558de564-7db3-4d0d-a6bc-89ca32efe0ce")
    @Override
    public Object caseLinkEndCreationData(org.eclipse.uml2.uml.LinkEndCreationData inputLinkEndCreationData) {
        Object theResult = visitorMap.get(inputLinkEndCreationData);
        if (theResult == null) {
            visitorMap.put(inputLinkEndCreationData, inputLinkEndCreationData);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LinkEndCreationDataImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitLinkEndCreationData(inputLinkEndCreationData);
            theResult = super.caseLinkEndCreationData(inputLinkEndCreationData);
            this.doSwitch((EObject) inputLinkEndCreationData.getInsertAt());
        }
        return theResult;
    }

    @objid ("a92ca380-6add-4e9c-9242-3b6bef41e298")
    @Override
    public Object caseLinkEndData(org.eclipse.uml2.uml.LinkEndData inputLinkEndData) {
        Object theResult = visitorMap.get(inputLinkEndData);
        if (theResult == null) {
            visitorMap.put(inputLinkEndData, inputLinkEndData);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LinkEndDataImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitLinkEndData(inputLinkEndData);
            theResult = super.caseLinkEndData(inputLinkEndData);
            this.doSwitch((EObject) inputLinkEndData.getValue());
            this.doSwitch((EObject) inputLinkEndData.getEnd());
            for (Object qualifier : inputLinkEndData.getQualifiers()) {
                this.doSwitch((EObject) qualifier);
            }
        }
        return theResult;
    }

    @objid ("e9e0aa39-e41a-4aea-928c-cec8c9e93505")
    @Override
    public Object caseLinkEndDestructionData(org.eclipse.uml2.uml.LinkEndDestructionData inputLinkEndDestructionData) {
        Object theResult = visitorMap.get(inputLinkEndDestructionData);
        if (theResult == null) {
            visitorMap.put(inputLinkEndDestructionData,
                    inputLinkEndDestructionData);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LinkEndDestructionDataImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitLinkEndDestructionData(inputLinkEndDestructionData);
            theResult = super
            .caseLinkEndDestructionData(inputLinkEndDestructionData);
            this.doSwitch((EObject) inputLinkEndDestructionData.getDestroyAt());
        }
        return theResult;
    }

    @objid ("08f472df-26be-4b97-a1c3-5cd14040b61c")
    @Override
    public Object caseLiteralBoolean(org.eclipse.uml2.uml.LiteralBoolean inputLiteralBoolean) {
        Object theResult = visitorMap.get(inputLiteralBoolean);
        if (theResult == null) {
            visitorMap.put(inputLiteralBoolean, inputLiteralBoolean);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LiteralBooleanImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitLiteralBoolean(inputLiteralBoolean);
            theResult = super.caseLiteralBoolean(inputLiteralBoolean);
        }
        return theResult;
    }

    @objid ("104024d0-3dac-4c22-a1df-e21a9d1c4b2f")
    @Override
    public Object caseLiteralInteger(org.eclipse.uml2.uml.LiteralInteger inputLiteralInteger) {
        Object theResult = visitorMap.get(inputLiteralInteger);
        if (theResult == null) {
            visitorMap.put(inputLiteralInteger, inputLiteralInteger);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LiteralIntegerImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitLiteralInteger(inputLiteralInteger);
            theResult = super.caseLiteralInteger(inputLiteralInteger);
        }
        return theResult;
    }

    @objid ("16d5c2b8-d521-4492-a630-e809180e9967")
    @Override
    public Object caseLiteralNull(org.eclipse.uml2.uml.LiteralNull inputLiteralNull) {
        Object theResult = visitorMap.get(inputLiteralNull);
        if (theResult == null) {
            visitorMap.put(inputLiteralNull, inputLiteralNull);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LiteralNullImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitLiteralNull(inputLiteralNull);
            theResult = super.caseLiteralNull(inputLiteralNull);
        }
        return theResult;
    }

    @objid ("fd822718-ac50-4694-a834-d68c77af935b")
    @Override
    public Object caseLiteralSpecification(org.eclipse.uml2.uml.LiteralSpecification inputLiteralSpecification) {
        Object theResult = super
        .caseLiteralSpecification(inputLiteralSpecification);
        return theResult;
    }

    @objid ("6f258579-c260-4f6a-8db6-31df6c4cb606")
    @Override
    public Object caseLiteralString(org.eclipse.uml2.uml.LiteralString inputLiteralString) {
        Object theResult = visitorMap.get(inputLiteralString);
        if (theResult == null) {
            visitorMap.put(inputLiteralString, inputLiteralString);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LiteralStringImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitLiteralString(inputLiteralString);
            theResult = super.caseLiteralString(inputLiteralString);
        }
        return theResult;
    }

    @objid ("177d510a-dced-42ea-bb0f-008bf8599957")
    @Override
    public Object caseLiteralUnlimitedNatural(org.eclipse.uml2.uml.LiteralUnlimitedNatural inputLiteralUnlimitedNatural) {
        Object theResult = visitorMap.get(inputLiteralUnlimitedNatural);
        if (theResult == null) {
            visitorMap.put(inputLiteralUnlimitedNatural,
                    inputLiteralUnlimitedNatural);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LiteralUnlimitedNaturalImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitLiteralUnlimitedNatural(inputLiteralUnlimitedNatural);
            theResult = super
            .caseLiteralUnlimitedNatural(inputLiteralUnlimitedNatural);
        }
        return theResult;
    }

    @objid ("fac5f982-f83e-41fc-a648-ef517a41e6e2")
    @Override
    public Object caseLoopNode(org.eclipse.uml2.uml.LoopNode inputLoopNode) {
        Object theResult = visitorMap.get(inputLoopNode);
        if (theResult == null) {
            visitorMap.put(inputLoopNode, inputLoopNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LoopNodeImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            behavior.visitLoopNode(inputLoopNode);
            theResult = super.caseLoopNode(inputLoopNode);
            for (Object bodyPart : inputLoopNode.getBodyParts()) {
                this.doSwitch((EObject) bodyPart);
            }
            for (Object setupPart : inputLoopNode.getSetupParts()) {
                this.doSwitch((EObject) setupPart);
            }
            this.doSwitch((EObject) inputLoopNode.getDecider());
            for (Object test : inputLoopNode.getTests()) {
                this.doSwitch((EObject) test);
            }
            for (Object result : inputLoopNode.getResults()) {
                this.doSwitch((EObject) result);
            }
            for (Object loopVariable : inputLoopNode.getLoopVariables()) {
                this.doSwitch((EObject) loopVariable);
            }
            for (Object bodyOutput : inputLoopNode.getBodyOutputs()) {
                this.doSwitch((EObject) bodyOutput);
            }
            for (Object loopVariableInput : inputLoopNode
                    .getLoopVariableInputs()) {
                this.doSwitch((EObject) loopVariableInput);
            }
        }
        return theResult;
    }

    @objid ("2fdaecda-c233-4d1c-ab82-bf20e2f1c8f7")
    @Override
    public Object caseManifestation(org.eclipse.uml2.uml.Manifestation inputManifestation) {
        Object theResult = visitorMap.get(inputManifestation);
        if (theResult == null) {
            visitorMap.put(inputManifestation, inputManifestation);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ManifestationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitManifestation(inputManifestation);
            theResult = super.caseManifestation(inputManifestation);
            this.doSwitch((EObject) inputManifestation.getUtilizedElement());
        }
        return theResult;
    }

    @objid ("16b1da18-e2ad-424d-a455-d9e628dc6176")
    @Override
    public Object caseMergeNode(org.eclipse.uml2.uml.MergeNode inputMergeNode) {
        Object theResult = visitorMap.get(inputMergeNode);
        if (theResult == null) {
            visitorMap.put(inputMergeNode, inputMergeNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("MergeNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitMergeNode(inputMergeNode);
            theResult = super.caseMergeNode(inputMergeNode);
        }
        return theResult;
    }

    @objid ("d112c626-2dc5-482a-9287-ef9b2626c402")
    @Override
    public Object caseMessage(org.eclipse.uml2.uml.Message inputMessage) {
        Object theResult = visitorMap.get(inputMessage);
        if (theResult == null) {
            visitorMap.put(inputMessage, inputMessage);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("MessageImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitMessage(inputMessage);
            theResult = super.caseMessage(inputMessage);
            this.doSwitch((EObject) inputMessage.getReceiveEvent());
            this.doSwitch((EObject) inputMessage.getSendEvent());
            this.doSwitch((EObject) inputMessage.getConnector());
            this.doSwitch((EObject) inputMessage.getInteraction());
            for (Object argument : inputMessage.getArguments()) {
                this.doSwitch((EObject) argument);
            }
            this.doSwitch((EObject) inputMessage.getSignature());
        }
        return theResult;
    }

    @objid ("2480d1a6-5399-4c82-b2fb-da3efe50c4a5")
    @Override
    public Object caseMessageEnd(org.eclipse.uml2.uml.MessageEnd inputMessageEnd) {
        Object theResult = super.caseMessageEnd(inputMessageEnd);
        this.doSwitch((EObject) inputMessageEnd.getMessage());
        return theResult;
    }

    @objid ("f678d741-e0ce-4e3e-b861-081e05cd80f2")
    @Override
    public Object caseMessageEvent(org.eclipse.uml2.uml.MessageEvent inputMessageEvent) {
        return super.caseMessageEvent(inputMessageEvent);
    }

    @objid ("982ffa97-9ac6-4635-95df-6d4353077b35")
    @Override
    public Object caseMessageOccurrenceSpecification(org.eclipse.uml2.uml.MessageOccurrenceSpecification inputMessageOccurrenceSpecification) {
        Object theResult = visitorMap.get(inputMessageOccurrenceSpecification);
        if (theResult == null) {
            visitorMap.put(inputMessageOccurrenceSpecification,
                    inputMessageOccurrenceSpecification);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("MessageOccurrenceSpecificationImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitMessageOccurrenceSpecification(inputMessageOccurrenceSpecification);
            theResult = super
            .caseMessageOccurrenceSpecification(inputMessageOccurrenceSpecification);
        }
        return theResult;
    }

    @objid ("6a0d69c0-8e2e-4b6a-ae77-a044da1272a2")
    @Override
    public Object caseModel(org.eclipse.uml2.uml.Model inputModel) {
        Object theResult = visitorMap.get(inputModel);
        if (theResult == null) {
            visitorMap.put(inputModel, inputModel);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ModelImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitModel(inputModel);
            // ReverseProperties revProp = ReverseProperties.getInstance();
            // ModelImpl rootMdl = revProp.getEcoreModel();
            // if (rootMdl.getName().equals(inputModel.getName()))
            theResult = super.caseModel(inputModel);
        }
        return theResult;
    }

    @objid ("415f6f38-babb-421a-b8b7-4d4399c90bdf")
    @Override
    public Object caseMultiplicityElement(org.eclipse.uml2.uml.MultiplicityElement inputMultiplicityElement) {
        Object theResult = super
        .caseMultiplicityElement(inputMultiplicityElement);
        this.doSwitch((EObject) inputMultiplicityElement.getUpperValue());
        this.doSwitch((EObject) inputMultiplicityElement.getLowerValue());
        return theResult;
    }

    @objid ("53657a3a-6b43-472d-9b92-7a3d6b88c08f")
    @Override
    public Object caseNamedElement(org.eclipse.uml2.uml.NamedElement inputNamedElement) {
        Object theResult = super.caseNamedElement(inputNamedElement);
        for (Object clientDependency : inputNamedElement
                .getClientDependencies()) {
            this.doSwitch((EObject) clientDependency);
        }
        this.doSwitch((EObject) inputNamedElement.getNamespace());
        this.doSwitch((EObject) inputNamedElement.getNameExpression());
        return theResult;
    }

    @objid ("952e7609-0379-4979-bf4c-32b55a7239ba")
    @Override
    public Object caseNamespace(org.eclipse.uml2.uml.Namespace inputNamespace) {
        Object theResult = super.caseNamespace(inputNamespace);
        for (Object elementImport : inputNamespace.getElementImports()) {
            this.doSwitch((EObject) elementImport);
        }
        for (Object packageImport : inputNamespace.getPackageImports()) {
            this.doSwitch((EObject) packageImport);
        }
        for (Object ownedRule : inputNamespace.getOwnedRules()) {
            this.doSwitch((EObject) ownedRule);
        }
        for (Object member : inputNamespace.getMembers()) {
            this.doSwitch((EObject) member);
        }
        for (Object importedMember : inputNamespace.getImportedMembers()) {
            this.doSwitch((EObject) importedMember);
        }
        for (Object ownedMember : inputNamespace.getOwnedMembers()) {
            this.doSwitch((EObject) ownedMember);
        }
        return theResult;
    }

    @objid ("25a7ba45-79db-40ef-9228-3d0e204ba2c2")
    @Override
    public Object caseNode(org.eclipse.uml2.uml.Node inputNode) {
        Object theResult = visitorMap.get(inputNode);
        if (theResult == null) {
            visitorMap.put(inputNode, inputNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("NodeImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitNode(inputNode);
            theResult = super.caseNode(inputNode);
            for (Object nestedNode : inputNode.getNestedNodes()) {
                this.doSwitch((EObject) nestedNode);
            }
        }
        return theResult;
    }

    @objid ("79fcb74d-17fa-4884-9db7-141d400f1e5c")
    @Override
    public Object caseObjectFlow(ObjectFlow inputObjectFlow) {
        Object theResult = visitorMap.get(inputObjectFlow);
        if (theResult == null) {
            visitorMap.put(inputObjectFlow, inputObjectFlow);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ObjectFlowImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitObjectFlow(inputObjectFlow);
            theResult = super.caseObjectFlow(inputObjectFlow);
            this.doSwitch((EObject) inputObjectFlow.getTransformation());
            this.doSwitch((EObject) inputObjectFlow.getSelection());
        }
        return theResult;
    }

    @objid ("00e92a07-9366-4d73-bffa-1c4081610945")
    @Override
    public Object caseObjectNode(ObjectNode inputObjectNode) {
        Object theResult = super.caseObjectNode(inputObjectNode);
        this.doSwitch((EObject) inputObjectNode.getUpperBound());
        for (Object inState : inputObjectNode.getInStates()) {
            this.doSwitch((EObject) inState);
        }
        this.doSwitch((EObject) inputObjectNode.getSelection());
        return theResult;
    }

    @objid ("b6b38257-ad75-47cb-a99a-5df9f9e91d40")
    @Override
    public Object caseObservation(final Observation inputIservation) {
        return super.caseObservation(inputIservation);
    }

    @objid ("83bfe7d1-b55b-4003-a48c-2694f2c0bf87")
    @Override
    public Object caseOccurrenceSpecification(org.eclipse.uml2.uml.OccurrenceSpecification inputOccurrenceSpecification) {
        Object theResult = visitorMap.get(inputOccurrenceSpecification);
        if (theResult == null) {
            visitorMap.put(inputOccurrenceSpecification,
                    inputOccurrenceSpecification);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("OccurrenceSpecificationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitOccurrenceSpecification(inputOccurrenceSpecification);
            theResult = super
            .caseOccurrenceSpecification(inputOccurrenceSpecification);
            // this.doSwitch((EObject)inputOccurrenceSpecification.getCovered());
            for (Object covered : inputOccurrenceSpecification.getCovereds()) {
                this.doSwitch((EObject) covered);
            }
            for (Object toAfter : inputOccurrenceSpecification.getToAfters()) {
                this.doSwitch((EObject) toAfter);
            }
            for (Object toBefore : inputOccurrenceSpecification.getToBefores()) {
                this.doSwitch((EObject) toBefore);
            }
        //            this.doSwitch((EObject) inputOccurrenceSpecification.getEvent());
        }
        return theResult;
    }

    @objid ("9184a6c9-ac67-4b60-a6dd-cf60bd1ea4bf")
    @Override
    public Object caseOpaqueAction(org.eclipse.uml2.uml.OpaqueAction inputOpaqueAction) {
        Object theResult = visitorMap.get(inputOpaqueAction);
        if (theResult == null) {
            visitorMap.put(inputOpaqueAction, inputOpaqueAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("OpaqueActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitOpaqueAction(inputOpaqueAction);
            theResult = super.caseOpaqueAction(inputOpaqueAction);
            for (Object inputValue : inputOpaqueAction.getInputValues()) {
                this.doSwitch((EObject) inputValue);
            }
            for (Object outputValue : inputOpaqueAction.getOutputValues()) {
                this.doSwitch((EObject) outputValue);
            }
        }
        return theResult;
    }

    @objid ("64910ea2-4e3a-4867-a685-c9302b9001f0")
    @Override
    public Object caseOpaqueBehavior(org.eclipse.uml2.uml.OpaqueBehavior inputOpaqueBehavior) {
        Object theResult = visitorMap.get(inputOpaqueBehavior);
        if (theResult == null) {
            visitorMap.put(inputOpaqueBehavior, inputOpaqueBehavior);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("OpaqueBehaviorImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitOpaqueBehavior(inputOpaqueBehavior);
            theResult = super.caseOpaqueBehavior(inputOpaqueBehavior);
        }
        return theResult;
    }

    @objid ("f977cf2c-99cc-460e-aaa2-90a27c79b23d")
    @Override
    public Object caseOpaqueExpression(org.eclipse.uml2.uml.OpaqueExpression inputOpaqueExpression) {
        Object theResult = visitorMap.get(inputOpaqueExpression);
        if (theResult == null) {
            visitorMap.put(inputOpaqueExpression, inputOpaqueExpression);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("OpaqueExpressionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitOpaqueExpression(inputOpaqueExpression);
            theResult = super.caseOpaqueExpression(inputOpaqueExpression);
            this.doSwitch((EObject) inputOpaqueExpression.getResult());
            this.doSwitch((EObject) inputOpaqueExpression.getBehavior());
        }
        return theResult;
    }

    @objid ("33a7c4ea-21a8-4d47-8345-5926dc5422a4")
    @Override
    public Object caseOperation(org.eclipse.uml2.uml.Operation inputOperation) {
        Object theResult = visitorMap.get(inputOperation);
        if (theResult == null) {
            visitorMap.put(inputOperation, inputOperation);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("OperationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitOperation(inputOperation);
            theResult = super.caseOperation(inputOperation);
            this.doSwitch((EObject) inputOperation.getClass_());
            for (Object precondition : inputOperation.getPreconditions()) {
                this.doSwitch((EObject) precondition);
            }
            for (Object postcondition : inputOperation.getPostconditions()) {
                this.doSwitch((EObject) postcondition);
            }
            for (Object redefinedOperation : inputOperation
                    .getRedefinedOperations()) {
                this.doSwitch((EObject) redefinedOperation);
            }
            this.doSwitch((EObject) inputOperation.getDatatype());
            this.doSwitch((EObject) inputOperation.getBodyCondition());
            this.doSwitch((EObject) inputOperation.getType());
            for (Object ownedParameter : inputOperation.getOwnedParameters()) {
                this.doSwitch((EObject) ownedParameter);
            }
            for (Object raisedException : inputOperation.getRaisedExceptions()) {
                this.doSwitch((EObject) raisedException);
            }
            this.doSwitch((EObject) inputOperation.getInterface());
            this.doSwitch((EObject) inputOperation.getTemplateParameter());
        }
        return theResult;
    }

    @objid ("9ad60327-ac84-451a-a87e-2a767db1b463")
    @Override
    public Object caseOperationTemplateParameter(org.eclipse.uml2.uml.OperationTemplateParameter inputOperationTemplateParameter) {
        Object theResult = visitorMap.get(inputOperationTemplateParameter);
        if (theResult == null) {
            visitorMap.put(inputOperationTemplateParameter,
                    inputOperationTemplateParameter);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("OperationTemplateParameterImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitOperationTemplateParameter(inputOperationTemplateParameter);
            theResult = super
            .caseOperationTemplateParameter(inputOperationTemplateParameter);
            this.doSwitch((EObject) inputOperationTemplateParameter
                    .getParameteredElement());
        }
        return theResult;
    }

    @objid ("c2ed6a4d-d71c-4e3b-b33c-7baa6088517f")
    @Override
    public Object caseOutputPin(org.eclipse.uml2.uml.OutputPin inputOutputPin) {
        Object theResult = visitorMap.get(inputOutputPin);
        if (theResult == null) {
            visitorMap.put(inputOutputPin, inputOutputPin);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("OutputPinImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitOutputPin(inputOutputPin);
            theResult = super.caseOutputPin(inputOutputPin);
        }
        return theResult;
    }

    @objid ("05f471a9-f8a2-47f5-bcbd-ef4d9cef1dae")
    @Override
    public Object casePackage(org.eclipse.uml2.uml.Package inputPackage) {
        Object theResult = visitorMap.get(inputPackage);
        if (theResult == null) {
            visitorMap.put(inputPackage, inputPackage);
        }
        
        if (inputPackage instanceof org.eclipse.uml2.uml.Model)
            return theResult;
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PackageImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitPackage(inputPackage);
            theResult = super.casePackage(inputPackage);
            for (Object packageMerge : inputPackage.getPackageMerges()) {
                this.doSwitch((EObject) packageMerge);
            }
            for (Object packagedElement : inputPackage.getPackagedElements()) {
                this.doSwitch((EObject) packagedElement);
            }
            for (Object ownedType : inputPackage.getOwnedTypes()) {
                this.doSwitch((EObject) ownedType);
            }
            for (Object nestedPackage : inputPackage.getNestedPackages()) {
                this.doSwitch((EObject) nestedPackage);
            }
            this.doSwitch((EObject) inputPackage.getNestingPackage());
            for (Object profileApplication : inputPackage
                    .getProfileApplications()) {
                this.doSwitch((EObject) profileApplication);
            }
        }
        return theResult;
    }

    @objid ("0ebd3b34-a3ea-4de8-94ad-4833048ea02e")
    @Override
    public Object casePackageImport(org.eclipse.uml2.uml.PackageImport inputPackageImport) {
        Object theResult = visitorMap.get(inputPackageImport);
        if (theResult == null) {
            visitorMap.put(inputPackageImport, inputPackageImport);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PackageImportImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitPackageImport(inputPackageImport);
            theResult = super.casePackageImport(inputPackageImport);
            this.doSwitch((EObject) inputPackageImport.getImportingNamespace());
            this.doSwitch((EObject) inputPackageImport.getImportedPackage());
        }
        return theResult;
    }

    @objid ("6a6bf618-d193-45fc-b4f1-4c86a6710797")
    @Override
    public Object casePackageMerge(org.eclipse.uml2.uml.PackageMerge inputPackageMerge) {
        Object theResult = visitorMap.get(inputPackageMerge);
        if (theResult == null) {
            visitorMap.put(inputPackageMerge, inputPackageMerge);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PackageMergeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitPackageMerge(inputPackageMerge);
            theResult = super.casePackageMerge(inputPackageMerge);
            this.doSwitch((EObject) inputPackageMerge.getReceivingPackage());
            this.doSwitch((EObject) inputPackageMerge.getMergedPackage());
        }
        return theResult;
    }

    @objid ("5eeaa49c-efc4-4efe-b5a9-b48955fd37be")
    @Override
    public Object casePackageableElement(org.eclipse.uml2.uml.PackageableElement inputPackageableElement) {
        Object theResult = super
        .casePackageableElement(inputPackageableElement);
        return theResult;
    }

    @objid ("cdef8f98-3c19-4dab-a1fe-8b2a11ca5dce")
    @Override
    public Object caseParameter(org.eclipse.uml2.uml.Parameter inputParameter) {
        Object theResult = visitorMap.get(inputParameter);
        if (theResult == null) {
            visitorMap.put(inputParameter, inputParameter);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ParameterImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitParameter(inputParameter);
            theResult = super.caseParameter(inputParameter);
            this.doSwitch((EObject) inputParameter.getDefaultValue());
            this.doSwitch((EObject) inputParameter.getOperation());
            for (Object parameterSet : inputParameter.getParameterSets()) {
                this.doSwitch((EObject) parameterSet);
            }
        }
        return theResult;
    }

    @objid ("c66a24b3-08d4-43ce-a062-fdf16d76134f")
    @Override
    public Object caseParameterSet(org.eclipse.uml2.uml.ParameterSet inputParameterSet) {
        Object theResult = visitorMap.get(inputParameterSet);
        if (theResult == null) {
            visitorMap.put(inputParameterSet, inputParameterSet);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ParameterSetImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitParameterSet(inputParameterSet);
            theResult = super.caseParameterSet(inputParameterSet);
            for (Object parameter : inputParameterSet.getParameters()) {
                this.doSwitch((EObject) parameter);
            }
            for (Object condition : inputParameterSet.getConditions()) {
                this.doSwitch((EObject) condition);
            }
        }
        return theResult;
    }

    @objid ("92d0ef3a-d8d7-4d09-a7e7-cde9e03a4ce2")
    @Override
    public Object caseParameterableElement(org.eclipse.uml2.uml.ParameterableElement inputParameterableElement) {
        Object theResult = super
        .caseParameterableElement(inputParameterableElement);
        this.doSwitch((EObject) inputParameterableElement
                .getTemplateParameter());
        this.doSwitch((EObject) inputParameterableElement
                .getOwningTemplateParameter());
        return theResult;
    }

    @objid ("d85ffbac-35a6-4974-90e9-d8d7c051ba51")
    @Override
    public Object casePartDecomposition(org.eclipse.uml2.uml.PartDecomposition inputPartDecomposition) {
        Object theResult = visitorMap.get(inputPartDecomposition);
        if (theResult == null) {
            visitorMap.put(inputPartDecomposition, inputPartDecomposition);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PartDecompositionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitPartDecomposition(inputPartDecomposition);
            theResult = super.casePartDecomposition(inputPartDecomposition);
        }
        return theResult;
    }

    @objid ("ae4e22fe-f930-41f1-81a6-16200473628e")
    @Override
    public Object casePin(org.eclipse.uml2.uml.Pin inputPin) {
        Object theResult = visitorMap.get(inputPin);
        if (theResult == null) {
            visitorMap.put(inputPin, inputPin);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PinImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitPin(inputPin);
            theResult = super.casePin(inputPin);
        }
        return theResult;
    }

    @objid ("0f199e3f-b58e-4640-af03-ec495aab0420")
    @Override
    public Object casePort(org.eclipse.uml2.uml.Port inputPort) {
        Object theResult = visitorMap.get(inputPort);
        if (theResult == null) {
            visitorMap.put(inputPort, inputPort);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PortImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitPort(inputPort);
            theResult = super.casePort(inputPort);
            for (Object required : inputPort.getRequireds()) {
                this.doSwitch((EObject) required);
            }
            for (Object redefinedPort : inputPort.getRedefinedPorts()) {
                this.doSwitch((EObject) redefinedPort);
            }
            for (Object provided : inputPort.getProvideds()) {
                this.doSwitch((EObject) provided);
            }
            this.doSwitch((EObject) inputPort.getProtocol());
        }
        return theResult;
    }

    @objid ("7a98282c-17d8-4916-b531-dac280af7692")
    @Override
    public Object casePrimitiveType(org.eclipse.uml2.uml.PrimitiveType inputPrimitiveType) {
        Object theResult = visitorMap.get(inputPrimitiveType);
        if (theResult == null) {
            visitorMap.put(inputPrimitiveType, inputPrimitiveType);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PrimitiveTypeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitPrimitiveType(inputPrimitiveType);
            theResult = super.casePrimitiveType(inputPrimitiveType);
        }
        return theResult;
    }

    @objid ("3227f8b9-d078-4026-9e80-7761f541e34d")
    @Override
    public Object caseProfile(org.eclipse.uml2.uml.Profile inputProfile) {
        Object theResult = visitorMap.get(inputProfile);
        if (theResult == null) {
            visitorMap.put(inputProfile, inputProfile);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ProfileImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitProfile(inputProfile);
            theResult = super.caseProfile(inputProfile);
            for (Object ownedStereotype : inputProfile.getOwnedStereotypes()) {
                this.doSwitch((EObject) ownedStereotype);
            }
            for (Object metaclassReference : inputProfile
                    .getMetaclassReferences()) {
                this.doSwitch((EObject) metaclassReference);
            }
            for (Object metamodelReference : inputProfile
                    .getMetamodelReferences()) {
                this.doSwitch((EObject) metamodelReference);
            }
        }
        return theResult;
    }

    @objid ("e1b868ea-f177-4e73-8d70-b1567fcfbd92")
    @Override
    public Object caseProfileApplication(org.eclipse.uml2.uml.ProfileApplication inputProfileApplication) {
        Object theResult = visitorMap.get(inputProfileApplication);
        if (theResult == null) {
            visitorMap.put(inputProfileApplication, inputProfileApplication);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ProfileApplicationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitProfileApplication(inputProfileApplication);
            theResult = super.caseProfileApplication(inputProfileApplication);
            this
            .doSwitch((EObject) inputProfileApplication
                    .getAppliedProfile());
            this.doSwitch((EObject) inputProfileApplication
                    .getApplyingPackage());
        }
        return theResult;
    }

    @objid ("49f7bdea-0988-4fbe-ab9c-80d6cfebdb0e")
    @Override
    public Object caseProperty(Property inputProperty) {
        Object theResult = visitorMap.get(inputProperty);
        if (theResult == null) {
            visitorMap.put(inputProperty, inputProperty);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PropertyImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            behavior.visitProperty(inputProperty);
            theResult = super.caseProperty(inputProperty);
            this.doSwitch((EObject) inputProperty.getClass_());
            for (Object redefinedProperty : inputProperty
                    .getRedefinedProperties()) {
                this.doSwitch((EObject) redefinedProperty);
            }
            this.doSwitch((EObject) inputProperty.getOwningAssociation());
            this.doSwitch((EObject) inputProperty.getDatatype());
            this.doSwitch((EObject) inputProperty.getDefaultValue());
            this.doSwitch((EObject) inputProperty.getOpposite());
            for (Object subsettedProperty : inputProperty
                    .getSubsettedProperties()) {
                this.doSwitch((EObject) subsettedProperty);
            }
            this.doSwitch((EObject) inputProperty.getAssociation());
            for (Object qualifier : inputProperty.getQualifiers()) {
                this.doSwitch((EObject) qualifier);
            }
            this.doSwitch((EObject) inputProperty.getAssociationEnd());
        }
        return theResult;
    }

    @objid ("edd1bf8a-de44-4185-b7f7-92b801eb4118")
    @Override
    public Object caseProtocolConformance(org.eclipse.uml2.uml.ProtocolConformance inputProtocolConformance) {
        Object theResult = visitorMap.get(inputProtocolConformance);
        if (theResult == null) {
            visitorMap.put(inputProtocolConformance, inputProtocolConformance);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ProtocolConformanceImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitProtocolConformance(inputProtocolConformance);
            theResult = super.caseProtocolConformance(inputProtocolConformance);
            this.doSwitch((EObject) inputProtocolConformance
                    .getSpecificMachine());
            this.doSwitch((EObject) inputProtocolConformance
                    .getGeneralMachine());
        }
        return theResult;
    }

    @objid ("a983730c-2192-4269-87be-8989aed06001")
    @Override
    public Object caseProtocolStateMachine(org.eclipse.uml2.uml.ProtocolStateMachine inputProtocolStateMachine) {
        Object theResult = visitorMap.get(inputProtocolStateMachine);
        if (theResult == null) {
            visitorMap
            .put(inputProtocolStateMachine, inputProtocolStateMachine);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ProtocolStateMachineImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitProtocolStateMachine(inputProtocolStateMachine);
            theResult = super
            .caseProtocolStateMachine(inputProtocolStateMachine);
            for (Object conformance : inputProtocolStateMachine
                    .getConformances()) {
                this.doSwitch((EObject) conformance);
            }
        }
        return theResult;
    }

    @objid ("ace397b0-81b2-4460-b3eb-fe6f2d2e4836")
    @Override
    public Object caseProtocolTransition(org.eclipse.uml2.uml.ProtocolTransition inputProtocolTransition) {
        Object theResult = visitorMap.get(inputProtocolTransition);
        if (theResult == null) {
            visitorMap.put(inputProtocolTransition, inputProtocolTransition);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ProtocolTransitionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitProtocolTransition(inputProtocolTransition);
            theResult = super.caseProtocolTransition(inputProtocolTransition);
            this.doSwitch((EObject) inputProtocolTransition.getPostCondition());
            for (Object referred : inputProtocolTransition.getReferreds()) {
                this.doSwitch((EObject) referred);
            }
            this.doSwitch((EObject) inputProtocolTransition.getPreCondition());
        }
        return theResult;
    }

    @objid ("c5f7df74-98ca-4470-abf7-caa7ea1f6085")
    @Override
    public Object casePseudostate(org.eclipse.uml2.uml.Pseudostate inputPseudostate) {
        Object theResult = visitorMap.get(inputPseudostate);
        if (theResult == null) {
            visitorMap.put(inputPseudostate, inputPseudostate);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PseudostateImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitPseudostate(inputPseudostate);
            theResult = super.casePseudostate(inputPseudostate);
            this.doSwitch((EObject) inputPseudostate.getStateMachine());
            this.doSwitch((EObject) inputPseudostate.getState());
        }
        return theResult;
    }

    @objid ("645e4a29-6beb-4543-a288-367aadeb2eca")
    @Override
    public Object caseQualifierValue(org.eclipse.uml2.uml.QualifierValue inputQualifierValue) {
        Object theResult = visitorMap.get(inputQualifierValue);
        if (theResult == null) {
            visitorMap.put(inputQualifierValue, inputQualifierValue);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("QualifierValueImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitQualifierValue(inputQualifierValue);
            theResult = super.caseQualifierValue(inputQualifierValue);
            this.doSwitch((EObject) inputQualifierValue.getQualifier());
            this.doSwitch((EObject) inputQualifierValue.getValue());
        }
        return theResult;
    }

    @objid ("dbe2a7ef-1858-4146-a5b9-949cce2e54e5")
    @Override
    public Object caseRaiseExceptionAction(org.eclipse.uml2.uml.RaiseExceptionAction inputRaiseExceptionAction) {
        Object theResult = visitorMap.get(inputRaiseExceptionAction);
        if (theResult == null) {
            visitorMap
            .put(inputRaiseExceptionAction, inputRaiseExceptionAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("RaiseExceptionActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitRaiseExceptionAction(inputRaiseExceptionAction);
            theResult = super
            .caseRaiseExceptionAction(inputRaiseExceptionAction);
            this.doSwitch((EObject) inputRaiseExceptionAction.getException());
        }
        return theResult;
    }

    @objid ("38ab5bf9-fdca-4df9-a356-e17b0468ebd7")
    @Override
    public Object caseReadExtentAction(org.eclipse.uml2.uml.ReadExtentAction inputReadExtentAction) {
        Object theResult = visitorMap.get(inputReadExtentAction);
        if (theResult == null) {
            visitorMap.put(inputReadExtentAction, inputReadExtentAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadExtentActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitReadExtentAction(inputReadExtentAction);
            theResult = super.caseReadExtentAction(inputReadExtentAction);
            this.doSwitch((EObject) inputReadExtentAction.getResult());
            this.doSwitch((EObject) inputReadExtentAction.getClassifier());
        }
        return theResult;
    }

    @objid ("0a5fe7ba-5b70-4f49-9229-182de32c758c")
    @Override
    public Object caseReadIsClassifiedObjectAction(org.eclipse.uml2.uml.ReadIsClassifiedObjectAction inputReadIsClassifiedObjectAction) {
        Object theResult = visitorMap.get(inputReadIsClassifiedObjectAction);
        if (theResult == null) {
            visitorMap.put(inputReadIsClassifiedObjectAction,
                    inputReadIsClassifiedObjectAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadIsClassifiedObjectActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitReadIsClassifiedObjectAction(inputReadIsClassifiedObjectAction);
            theResult = super
            .caseReadIsClassifiedObjectAction(inputReadIsClassifiedObjectAction);
            this.doSwitch((EObject) inputReadIsClassifiedObjectAction
                    .getClassifier());
            this.doSwitch((EObject) inputReadIsClassifiedObjectAction
                    .getResult());
            this.doSwitch((EObject) inputReadIsClassifiedObjectAction
                    .getObject());
        }
        return theResult;
    }

    @objid ("cbd408fa-12c7-4505-b336-c52c6d71f187")
    @Override
    public Object caseReadLinkAction(org.eclipse.uml2.uml.ReadLinkAction inputReadLinkAction) {
        Object theResult = visitorMap.get(inputReadLinkAction);
        if (theResult == null) {
            visitorMap.put(inputReadLinkAction, inputReadLinkAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadLinkActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitReadLinkAction(inputReadLinkAction);
            theResult = super.caseReadLinkAction(inputReadLinkAction);
            this.doSwitch((EObject) inputReadLinkAction.getResult());
        }
        return theResult;
    }

    @objid ("cfa7e3fa-91a1-4c32-9402-c1b552628720")
    @Override
    public Object caseReadLinkObjectEndAction(org.eclipse.uml2.uml.ReadLinkObjectEndAction inputReadLinkObjectEndAction) {
        Object theResult = visitorMap.get(inputReadLinkObjectEndAction);
        if (theResult == null) {
            visitorMap.put(inputReadLinkObjectEndAction,
                    inputReadLinkObjectEndAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadLinkObjectEndActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitReadLinkObjectEndAction(inputReadLinkObjectEndAction);
            theResult = super
            .caseReadLinkObjectEndAction(inputReadLinkObjectEndAction);
            this.doSwitch((EObject) inputReadLinkObjectEndAction.getObject());
            this.doSwitch((EObject) inputReadLinkObjectEndAction.getEnd());
            this.doSwitch((EObject) inputReadLinkObjectEndAction.getResult());
        }
        return theResult;
    }

    @objid ("1f980b40-6398-4969-9b37-0d715e10ce15")
    @Override
    public Object caseReadLinkObjectEndQualifierAction(org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction inputReadLinkObjectEndQualifierAction) {
        Object theResult = visitorMap
        .get(inputReadLinkObjectEndQualifierAction);
        if (theResult == null) {
            visitorMap.put(inputReadLinkObjectEndQualifierAction,
                    inputReadLinkObjectEndQualifierAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadLinkObjectEndQualifierActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitReadLinkObjectEndQualifierAction(inputReadLinkObjectEndQualifierAction);
            theResult = super
            .caseReadLinkObjectEndQualifierAction(inputReadLinkObjectEndQualifierAction);
            this.doSwitch((EObject) inputReadLinkObjectEndQualifierAction
                    .getObject());
            this.doSwitch((EObject) inputReadLinkObjectEndQualifierAction
                    .getResult());
            this.doSwitch((EObject) inputReadLinkObjectEndQualifierAction
                    .getQualifier());
        }
        return theResult;
    }

    @objid ("bd1df0c8-7f42-482f-af0f-86cc49042449")
    @Override
    public Object caseReadSelfAction(org.eclipse.uml2.uml.ReadSelfAction inputReadSelfAction) {
        Object theResult = visitorMap.get(inputReadSelfAction);
        if (theResult == null) {
            visitorMap.put(inputReadSelfAction, inputReadSelfAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadSelfActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitReadSelfAction(inputReadSelfAction);
            theResult = super.caseReadSelfAction(inputReadSelfAction);
            this.doSwitch((EObject) inputReadSelfAction.getResult());
        }
        return theResult;
    }

    @objid ("7f883797-3f47-4782-ae5a-768069f9e2b3")
    @Override
    public Object caseReadStructuralFeatureAction(org.eclipse.uml2.uml.ReadStructuralFeatureAction inputReadStructuralFeatureAction) {
        Object theResult = visitorMap.get(inputReadStructuralFeatureAction);
        if (theResult == null) {
            visitorMap.put(inputReadStructuralFeatureAction,
                    inputReadStructuralFeatureAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadStructuralFeatureActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitReadStructuralFeatureAction(inputReadStructuralFeatureAction);
            theResult = super
            .caseReadStructuralFeatureAction(inputReadStructuralFeatureAction);
            this.doSwitch((EObject) inputReadStructuralFeatureAction
                    .getResult());
        }
        return theResult;
    }

    @objid ("f83acdfd-9ebb-4295-8660-e120d7e2b908")
    @Override
    public Object caseReadVariableAction(org.eclipse.uml2.uml.ReadVariableAction inputReadVariableAction) {
        Object theResult = visitorMap.get(inputReadVariableAction);
        if (theResult == null) {
            visitorMap.put(inputReadVariableAction, inputReadVariableAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadVariableActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitReadVariableAction(inputReadVariableAction);
            theResult = super.caseReadVariableAction(inputReadVariableAction);
            this.doSwitch((EObject) inputReadVariableAction.getResult());
        }
        return theResult;
    }

    @objid ("25cc75f9-424d-4864-aaf9-5300740c82b8")
    @Override
    public Object caseRealization(org.eclipse.uml2.uml.Realization inputRealization) {
        Object theResult = visitorMap.get(inputRealization);
        if (theResult == null) {
            visitorMap.put(inputRealization, inputRealization);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("RealizationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitRealization(inputRealization);
            theResult = super.caseRealization(inputRealization);
        }
        return theResult;
    }

    @objid ("d6268e3a-943f-4073-a96c-f51f896adb4e")
    @Override
    public Object caseReceiveOperationEvent(org.eclipse.uml2.uml.ReceiveOperationEvent inputReceiveOperationEvent) {
        Object theResult = visitorMap.get(inputReceiveOperationEvent);
        if (theResult == null) {
            visitorMap.put(inputReceiveOperationEvent,
                    inputReceiveOperationEvent);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReceiveOperationEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitReceiveOperationEvent(inputReceiveOperationEvent);
            theResult = super
            .caseReceiveOperationEvent(inputReceiveOperationEvent);
            this.doSwitch((EObject) inputReceiveOperationEvent.getOperation());
        }
        return theResult;
    }

    @objid ("209c67df-a3e4-4f42-9b13-3ca94eb8f7ad")
    @Override
    public Object caseReceiveSignalEvent(org.eclipse.uml2.uml.ReceiveSignalEvent inputReceiveSignalEvent) {
        Object theResult = visitorMap.get(inputReceiveSignalEvent);
        if (theResult == null) {
            visitorMap.put(inputReceiveSignalEvent, inputReceiveSignalEvent);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReceiveSignalEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitReceiveSignalEvent(inputReceiveSignalEvent);
            theResult = super.caseReceiveSignalEvent(inputReceiveSignalEvent);
            this.doSwitch((EObject) inputReceiveSignalEvent.getSignal());
        }
        return theResult;
    }

    @objid ("7f860801-c1f1-4c72-a0ac-400e2a69d9dc")
    @Override
    public Object caseReception(org.eclipse.uml2.uml.Reception inputReception) {
        Object theResult = visitorMap.get(inputReception);
        if (theResult == null) {
            visitorMap.put(inputReception, inputReception);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReceptionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitReception(inputReception);
            theResult = super.caseReception(inputReception);
            this.doSwitch((EObject) inputReception.getSignal());
        }
        return theResult;
    }

    @objid ("9fc136c4-1192-4106-9032-cd95b73d820a")
    @Override
    public Object caseReclassifyObjectAction(org.eclipse.uml2.uml.ReclassifyObjectAction inputReclassifyObjectAction) {
        Object theResult = visitorMap.get(inputReclassifyObjectAction);
        if (theResult == null) {
            visitorMap.put(inputReclassifyObjectAction,
                    inputReclassifyObjectAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReclassifyObjectActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitReclassifyObjectAction(inputReclassifyObjectAction);
            theResult = super
            .caseReclassifyObjectAction(inputReclassifyObjectAction);
            for (Object oldClassifier : inputReclassifyObjectAction
                    .getOldClassifiers()) {
                this.doSwitch((EObject) oldClassifier);
            }
            for (Object newClassifier : inputReclassifyObjectAction
                    .getNewClassifiers()) {
                this.doSwitch((EObject) newClassifier);
            }
            this.doSwitch((EObject) inputReclassifyObjectAction.getObject());
        }
        return theResult;
    }

    @objid ("aa3c5614-64b9-4241-93d4-ff6f6bf1e889")
    @Override
    public Object caseRedefinableElement(org.eclipse.uml2.uml.RedefinableElement inputRedefinableElement) {
        Object theResult = super
        .caseRedefinableElement(inputRedefinableElement);
        for (Object redefinedElement : inputRedefinableElement
                .getRedefinedElements()) {
            this.doSwitch((EObject) redefinedElement);
        }
        for (Object redefinitionContext : inputRedefinableElement
                .getRedefinitionContexts()) {
            this.doSwitch((EObject) redefinitionContext);
        }
        return theResult;
    }

    @objid ("4a36ac02-5c5f-4826-8b8b-48d46ba91434")
    @Override
    public Object caseRedefinableTemplateSignature(org.eclipse.uml2.uml.RedefinableTemplateSignature inputRedefinableTemplateSignature) {
        Object theResult = visitorMap.get(inputRedefinableTemplateSignature);
        if (theResult == null) {
            visitorMap.put(inputRedefinableTemplateSignature,
                    inputRedefinableTemplateSignature);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("RedefinableTemplateSignatureImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitRedefinableTemplateSignature(inputRedefinableTemplateSignature);
            theResult = super
            .caseRedefinableTemplateSignature(inputRedefinableTemplateSignature);
            this.doSwitch((EObject) inputRedefinableTemplateSignature
                    .getClassifier());
            for (Object extendedSignature : inputRedefinableTemplateSignature
                    .getExtendedSignatures()) {
                this.doSwitch((EObject) extendedSignature);
            }
            for (Object inheritedParameter : inputRedefinableTemplateSignature
                    .getInheritedParameters()) {
                this.doSwitch((EObject) inheritedParameter);
            }
        }
        return theResult;
    }

    @objid ("91c58943-b5fa-4f87-b8da-ee265f9ab8c3")
    @Override
    public Object caseReduceAction(org.eclipse.uml2.uml.ReduceAction inputReduceAction) {
        Object theResult = visitorMap.get(inputReduceAction);
        if (theResult == null) {
            visitorMap.put(inputReduceAction, inputReduceAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReduceActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitReduceAction(inputReduceAction);
            theResult = super.caseReduceAction(inputReduceAction);
            this.doSwitch((EObject) inputReduceAction.getReducer());
            this.doSwitch((EObject) inputReduceAction.getResult());
            this.doSwitch((EObject) inputReduceAction.getCollection());
        }
        return theResult;
    }

    @objid ("c1540ca1-38b0-4260-9b8b-afe912779e40")
    @Override
    public Object caseRegion(org.eclipse.uml2.uml.Region inputRegion) {
        Object theResult = visitorMap.get(inputRegion);
        if (theResult == null) {
            visitorMap.put(inputRegion, inputRegion);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("RegionImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitRegion(inputRegion);
            theResult = super.caseRegion(inputRegion);
            for (Object subvertex : inputRegion.getSubvertices()) {
                this.doSwitch((EObject) subvertex);
            }
            for (Object transition : inputRegion.getTransitions()) {
                this.doSwitch((EObject) transition);
            }
            this.doSwitch((EObject) inputRegion.getStateMachine());
            this.doSwitch((EObject) inputRegion.getState());
            this.doSwitch((EObject) inputRegion.getExtendedRegion());
            // this.doSwitch((EObject)inputRegion.getRedefinitionContext());
            for (Object redefinitionContext : inputRegion
                    .getRedefinitionContexts()) {
                this.doSwitch((EObject) redefinitionContext);
            }
        }
        return theResult;
    }

    @objid ("b4057f45-b611-430b-9b07-e3eaca9fbfe4")
    @Override
    public Object caseRelationship(org.eclipse.uml2.uml.Relationship inputRelationship) {
        Object theResult = super.caseRelationship(inputRelationship);
        for (Object relatedElement : inputRelationship.getRelatedElements()) {
            this.doSwitch((EObject) relatedElement);
        }
        return theResult;
    }

    @objid ("c7708a40-b327-4844-91d7-e51cff1bb28f")
    @Override
    public Object caseRemoveStructuralFeatureValueAction(org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction inputRemoveStructuralFeatureValueAction) {
        Object theResult = visitorMap
        .get(inputRemoveStructuralFeatureValueAction);
        if (theResult == null) {
            visitorMap.put(inputRemoveStructuralFeatureValueAction,
                    inputRemoveStructuralFeatureValueAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("RemoveStructuralFeatureValueActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitRemoveStructuralFeatureValueAction(inputRemoveStructuralFeatureValueAction);
            theResult = super
            .caseRemoveStructuralFeatureValueAction(inputRemoveStructuralFeatureValueAction);
            this.doSwitch((EObject) inputRemoveStructuralFeatureValueAction
                    .getRemoveAt());
        }
        return theResult;
    }

    @objid ("55508d79-c2ed-4a77-a476-bfbf40999649")
    @Override
    public Object caseRemoveVariableValueAction(org.eclipse.uml2.uml.RemoveVariableValueAction inputRemoveVariableValueAction) {
        Object theResult = visitorMap.get(inputRemoveVariableValueAction);
        if (theResult == null) {
            visitorMap.put(inputRemoveVariableValueAction,
                    inputRemoveVariableValueAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("RemoveVariableValueActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitRemoveVariableValueAction(inputRemoveVariableValueAction);
            theResult = super
            .caseRemoveVariableValueAction(inputRemoveVariableValueAction);
            this.doSwitch((EObject) inputRemoveVariableValueAction
                    .getRemoveAt());
        }
        return theResult;
    }

    @objid ("ceddf53d-82e7-4e47-87c9-6d3040aeb1a9")
    @Override
    public Object caseReplyAction(org.eclipse.uml2.uml.ReplyAction inputReplyAction) {
        Object theResult = visitorMap.get(inputReplyAction);
        if (theResult == null) {
            visitorMap.put(inputReplyAction, inputReplyAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReplyActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitReplyAction(inputReplyAction);
            theResult = super.caseReplyAction(inputReplyAction);
            this.doSwitch((EObject) inputReplyAction.getReplyToCall());
            this.doSwitch((EObject) inputReplyAction.getReturnInformation());
            for (Object replyValue : inputReplyAction.getReplyValues()) {
                this.doSwitch((EObject) replyValue);
            }
        }
        return theResult;
    }

    @objid ("2989cd2b-31fc-4a9a-81f3-ca97fa8cd2a2")
    @Override
    public Object caseSendObjectAction(org.eclipse.uml2.uml.SendObjectAction inputSendObjectAction) {
        Object theResult = visitorMap.get(inputSendObjectAction);
        if (theResult == null) {
            visitorMap.put(inputSendObjectAction, inputSendObjectAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SendObjectActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitSendObjectAction(inputSendObjectAction);
            theResult = super.caseSendObjectAction(inputSendObjectAction);
            this.doSwitch((EObject) inputSendObjectAction.getTarget());
            this.doSwitch((EObject) inputSendObjectAction.getRequest());
        }
        return theResult;
    }

    @objid ("1bf80961-fb7b-42d8-8e4e-b8a5fc9c423e")
    @Override
    public Object caseSendOperationEvent(org.eclipse.uml2.uml.SendOperationEvent inputSendOperationEvent) {
        Object theResult = visitorMap.get(inputSendOperationEvent);
        if (theResult == null) {
            visitorMap.put(inputSendOperationEvent, inputSendOperationEvent);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SendOperationEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitSendOperationEvent(inputSendOperationEvent);
            theResult = super.caseSendOperationEvent(inputSendOperationEvent);
            this.doSwitch((EObject) inputSendOperationEvent.getOperation());
        }
        return theResult;
    }

    @objid ("ad13892c-3a29-4c45-a445-9848bda9ae26")
    @Override
    public Object caseSendSignalAction(org.eclipse.uml2.uml.SendSignalAction inputSendSignalAction) {
        Object theResult = visitorMap.get(inputSendSignalAction);
        if (theResult == null) {
            visitorMap.put(inputSendSignalAction, inputSendSignalAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SendSignalActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitSendSignalAction(inputSendSignalAction);
            theResult = super.caseSendSignalAction(inputSendSignalAction);
            this.doSwitch((EObject) inputSendSignalAction.getTarget());
            this.doSwitch((EObject) inputSendSignalAction.getSignal());
        }
        return theResult;
    }

//    @objid ("1388bab8-4583-11e0-b54c-00137279a832")
//    @Override
//    public Object caseSendSignalEvent(org.eclipse.uml2.uml.SendSignalEvent inputSendSignalEvent) {
//        Object theResult = visitorMap.get(inputSendSignalEvent);
//        if (theResult == null) {
//            visitorMap.put(inputSendSignalEvent, inputSendSignalEvent);
//        }
//
//        // In particular case of this concrete element is inherited by another
//        // concrete element, it
//        // shall be in the visitorMap. Also do call the treatment defined at the
//        // current super level:
//        if (theResult == null
//                || !("SendSignalEventImpl".equals(theResult.getClass()
//                        .getSimpleName()))) {
//            behavior.visitSendSignalEvent(inputSendSignalEvent);
//            theResult = super.caseSendSignalEvent(inputSendSignalEvent);
//            this.doSwitch((EObject) inputSendSignalEvent.getSignal());
//        }
//        return theResult;
//    }
    @objid ("e7ce4221-1e9f-48fd-8bfd-dd5358d19096")
    @Override
    public Object caseSequenceNode(org.eclipse.uml2.uml.SequenceNode inputSequenceNode) {
        Object theResult = visitorMap.get(inputSequenceNode);
        if (theResult == null) {
            visitorMap.put(inputSequenceNode, inputSequenceNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SequenceNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitSequenceNode(inputSequenceNode);
            theResult = super.caseSequenceNode(inputSequenceNode);
            for (Object executableNode : inputSequenceNode.getExecutableNodes()) {
                this.doSwitch((EObject) executableNode);
            }
        }
        return theResult;
    }

    @objid ("d4634613-4917-4c81-af62-45818097f99e")
    @Override
    public Object caseSignal(org.eclipse.uml2.uml.Signal inputSignal) {
        Object theResult = visitorMap.get(inputSignal);
        if (theResult == null) {
            visitorMap.put(inputSignal, inputSignal);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SignalImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitSignal(inputSignal);
            theResult = super.caseSignal(inputSignal);
            for (Object ownedAttribute : inputSignal.getOwnedAttributes()) {
                this.doSwitch((EObject) ownedAttribute);
            }
        }
        return theResult;
    }

    @objid ("2c5990dc-8d91-4ae2-be23-6684b2e4528b")
    @Override
    public Object caseSignalEvent(org.eclipse.uml2.uml.SignalEvent inputSignalEvent) {
        Object theResult = visitorMap.get(inputSignalEvent);
        if (theResult == null) {
            visitorMap.put(inputSignalEvent, inputSignalEvent);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SignalEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitSignalEvent(inputSignalEvent);
            theResult = super.caseSignalEvent(inputSignalEvent);
            this.doSwitch((EObject) inputSignalEvent.getSignal());
        }
        return theResult;
    }

    @objid ("8ca75444-7d4a-4fed-9d84-8610c143937b")
    @Override
    public Object caseSlot(org.eclipse.uml2.uml.Slot inputSlot) {
        Object theResult = visitorMap.get(inputSlot);
        if (theResult == null) {
            visitorMap.put(inputSlot, inputSlot);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SlotImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitSlot(inputSlot);
            theResult = super.caseSlot(inputSlot);
            this.doSwitch((EObject) inputSlot.getOwningInstance());
            this.doSwitch((EObject) inputSlot.getDefiningFeature());
            for (Object value : inputSlot.getValues()) {
                this.doSwitch((EObject) value);
            }
        }
        return theResult;
    }

    @objid ("47f67a7d-b6e8-405e-917f-122b950556f8")
    @Override
    public Object caseStartClassifierBehaviorAction(org.eclipse.uml2.uml.StartClassifierBehaviorAction inputStartClassifierBehaviorAction) {
        Object theResult = visitorMap.get(inputStartClassifierBehaviorAction);
        if (theResult == null) {
            visitorMap.put(inputStartClassifierBehaviorAction,
                    inputStartClassifierBehaviorAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("StartClassifierBehaviorActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitStartClassifierBehaviorAction(inputStartClassifierBehaviorAction);
            theResult = super
            .caseStartClassifierBehaviorAction(inputStartClassifierBehaviorAction);
            this.doSwitch((EObject) inputStartClassifierBehaviorAction
                    .getObject());
        }
        return theResult;
    }

    @objid ("f58f565d-1c12-4017-b822-f08c0b56a109")
    @Override
    public Object caseState(org.eclipse.uml2.uml.State inputState) {
        Object theResult = visitorMap.get(inputState);
        if (theResult == null) {
            visitorMap.put(inputState, inputState);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("StateImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitState(inputState);
            theResult = super.caseState(inputState);
            this.doSwitch((EObject) inputState.getSubmachine());
            for (Object connection : inputState.getConnections()) {
                this.doSwitch((EObject) connection);
            }
            this.doSwitch((EObject) inputState.getRedefinedState());
            for (Object region : inputState.getRegions()) {
                this.doSwitch((EObject) region);
            }
            // this.doSwitch((EObject)inputState.getRedefinitionContext());
            for (Object redefinitionContext : inputState
                    .getRedefinitionContexts()) {
                this.doSwitch((EObject) redefinitionContext);
            }
            this.doSwitch((EObject) inputState.getStateInvariant());
            this.doSwitch((EObject) inputState.getEntry());
            this.doSwitch((EObject) inputState.getExit());
            this.doSwitch((EObject) inputState.getDoActivity());
            for (Object connectionPoint : inputState.getConnectionPoints()) {
                this.doSwitch((EObject) connectionPoint);
            }
            for (Object deferrableTrigger : inputState.getDeferrableTriggers()) {
                this.doSwitch((EObject) deferrableTrigger);
            }
        }
        return theResult;
    }

    @objid ("170e8d10-adde-415f-b7c2-ab3502559286")
    @Override
    public Object caseStateInvariant(org.eclipse.uml2.uml.StateInvariant inputStateInvariant) {
        Object theResult = visitorMap.get(inputStateInvariant);
        if (theResult == null) {
            visitorMap.put(inputStateInvariant, inputStateInvariant);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("StateInvariantImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitStateInvariant(inputStateInvariant);
            theResult = super.caseStateInvariant(inputStateInvariant);
            this.doSwitch((EObject) inputStateInvariant.getInvariant());
            // this.doSwitch((EObject)inputStateInvariant.getCovered());
            for (Object covered : inputStateInvariant.getCovereds()) {
                this.doSwitch((EObject) covered);
            }
        }
        return theResult;
    }

    @objid ("029bc443-233a-44f6-9a90-9f0e4764efeb")
    @Override
    public Object caseStateMachine(org.eclipse.uml2.uml.StateMachine inputStateMachine) {
        Object theResult = visitorMap.get(inputStateMachine);
        if (theResult == null) {
            visitorMap.put(inputStateMachine, inputStateMachine);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("StateMachineImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitStateMachine(inputStateMachine);
            theResult = super.caseStateMachine(inputStateMachine);
            for (Object region : inputStateMachine.getRegions()) {
                this.doSwitch((EObject) region);
            }
            for (Object connectionPoint : inputStateMachine
                    .getConnectionPoints()) {
                this.doSwitch((EObject) connectionPoint);
            }
            for (Object extendedStateMachine : inputStateMachine
                    .getExtendedStateMachines()) {
                this.doSwitch((EObject) extendedStateMachine);
            }
            for (Object submachineState : inputStateMachine
                    .getSubmachineStates()) {
                this.doSwitch((EObject) submachineState);
            }
        }
        return theResult;
    }

    @objid ("523b8f1b-2810-41b8-8a65-08334547fd69")
    @Override
    public Object caseStereotype(org.eclipse.uml2.uml.Stereotype inputStereotype) {
        Object theResult = visitorMap.get(inputStereotype);
        if (theResult == null) {
            visitorMap.put(inputStereotype, inputStereotype);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("StereotypeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitStereotype(inputStereotype);
            theResult = super.caseStereotype(inputStereotype);
            for (Object icon : inputStereotype.getIcons()) {
                this.doSwitch((EObject) icon);
            }
        }
        return theResult;
    }

    @objid ("f725c931-40f6-4e3b-9f8a-64284f42ebe5")
    @Override
    public Object caseStringExpression(StringExpression inputStringExpression) {
        Object theResult = visitorMap.get(inputStringExpression);
        if (theResult == null) {
            visitorMap.put(inputStringExpression, inputStringExpression);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("StringExpressionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitStringExpression(inputStringExpression);
            theResult = super.caseStringExpression(inputStringExpression);
            for (Object subExpression : inputStringExpression
                    .getSubExpressions()) {
                this.doSwitch((EObject) subExpression);
            }
            this
            .doSwitch((EObject) inputStringExpression
                    .getOwningExpression());
        }
        return theResult;
    }

    @objid ("75fbada4-08d7-48f6-bb44-ee07a8a1f139")
    @Override
    public Object caseStructuralFeature(org.eclipse.uml2.uml.StructuralFeature inputStructuralFeature) {
        return super.caseStructuralFeature(inputStructuralFeature);
    }

    @objid ("fff5c85c-43a2-4a91-b885-be04dda0153e")
    @Override
    public Object caseStructuralFeatureAction(org.eclipse.uml2.uml.StructuralFeatureAction inputStructuralFeatureAction) {
        Object theResult = super
        .caseStructuralFeatureAction(inputStructuralFeatureAction);
        this.doSwitch((EObject) inputStructuralFeatureAction
                .getStructuralFeature());
        this.doSwitch((EObject) inputStructuralFeatureAction.getObject());
        return theResult;
    }

    @objid ("3a31a582-7e57-425f-99fe-e7a7755bccf2")
    @Override
    public Object caseStructuredActivityNode(org.eclipse.uml2.uml.StructuredActivityNode inputStructuredActivityNode) {
        Object theResult = visitorMap.get(inputStructuredActivityNode);
        if (theResult == null) {
            visitorMap.put(inputStructuredActivityNode,
                    inputStructuredActivityNode);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("StructuredActivityNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitStructuredActivityNode(inputStructuredActivityNode);
            theResult = super
            .caseStructuredActivityNode(inputStructuredActivityNode);
            for (Object variable : inputStructuredActivityNode.getVariables()) {
                this.doSwitch((EObject) variable);
            }
            for (Object node : inputStructuredActivityNode.getNodes()) {
                this.doSwitch((EObject) node);
            }
            this.doSwitch((EObject) inputStructuredActivityNode.getActivity());
            for (Object edge : inputStructuredActivityNode.getEdges()) {
                this.doSwitch((EObject) edge);
            }
        }
        return theResult;
    }

    @objid ("916f202d-4ce1-40db-96d6-9bd62f01b906")
    @Override
    public Object caseStructuredClassifier(org.eclipse.uml2.uml.StructuredClassifier inputStructuredClassifier) {
        Object theResult = super
        .caseStructuredClassifier(inputStructuredClassifier);
        for (Object ownedAttribute : inputStructuredClassifier
                .getOwnedAttributes()) {
            this.doSwitch((EObject) ownedAttribute);
        }
        for (Object part : inputStructuredClassifier.getParts()) {
            this.doSwitch((EObject) part);
        }
        for (Object role : inputStructuredClassifier.getRoles()) {
            this.doSwitch((EObject) role);
        }
        for (Object ownedConnector : inputStructuredClassifier
                .getOwnedConnectors()) {
            this.doSwitch((EObject) ownedConnector);
        }
        return theResult;
    }

    @objid ("a20b63e5-d03c-4bde-a5d9-5d4f93486cb1")
    @Override
    public Object caseSubstitution(org.eclipse.uml2.uml.Substitution inputSubstitution) {
        Object theResult = visitorMap.get(inputSubstitution);
        if (theResult == null) {
            visitorMap.put(inputSubstitution, inputSubstitution);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SubstitutionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitSubstitution(inputSubstitution);
            theResult = super.caseSubstitution(inputSubstitution);
            this.doSwitch((EObject) inputSubstitution.getContract());
            this.doSwitch((EObject) inputSubstitution
                    .getSubstitutingClassifier());
        }
        return theResult;
    }

    @objid ("a297c2ac-4d9f-4490-80c4-b0bad458e7ce")
    @Override
    public Object caseTemplateBinding(org.eclipse.uml2.uml.TemplateBinding inputTemplateBinding) {
        Object theResult = visitorMap.get(inputTemplateBinding);
        if (theResult == null) {
            visitorMap.put(inputTemplateBinding, inputTemplateBinding);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TemplateBindingImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitTemplateBinding(inputTemplateBinding);
            theResult = super.caseTemplateBinding(inputTemplateBinding);
            this.doSwitch((EObject) inputTemplateBinding.getBoundElement());
            this.doSwitch((EObject) inputTemplateBinding.getSignature());
            for (Object parameterSubstitution : inputTemplateBinding
                    .getParameterSubstitutions()) {
                this.doSwitch((EObject) parameterSubstitution);
            }
        }
        return theResult;
    }

    @objid ("4f13d430-ef5d-4f26-b848-d6971eddd39a")
    @Override
    public Object caseTemplateParameter(org.eclipse.uml2.uml.TemplateParameter inputTemplateParameter) {
        Object theResult = visitorMap.get(inputTemplateParameter);
        if (theResult == null) {
            visitorMap.put(inputTemplateParameter, inputTemplateParameter);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TemplateParameterImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitTemplateParameter(inputTemplateParameter);
            theResult = super.caseTemplateParameter(inputTemplateParameter);
            this.doSwitch((EObject) inputTemplateParameter.getSignature());
            this.doSwitch((EObject) inputTemplateParameter
                    .getParameteredElement());
            this.doSwitch((EObject) inputTemplateParameter
                    .getOwnedParameteredElement());
            this.doSwitch((EObject) inputTemplateParameter.getDefault());
            this.doSwitch((EObject) inputTemplateParameter.getOwnedDefault());
        }
        return theResult;
    }

    @objid ("c5b50316-2942-4997-b2c0-cda65d9a3581")
    @Override
    public Object caseTemplateParameterSubstitution(org.eclipse.uml2.uml.TemplateParameterSubstitution inputTemplateParameterSubstitution) {
        Object theResult = visitorMap.get(inputTemplateParameterSubstitution);
        if (theResult == null) {
            visitorMap.put(inputTemplateParameterSubstitution,
                    inputTemplateParameterSubstitution);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TemplateParameterSubstitutionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            behavior
            .visitTemplateParameterSubstitution(inputTemplateParameterSubstitution);
            theResult = super
            .caseTemplateParameterSubstitution(inputTemplateParameterSubstitution);
            this.doSwitch((EObject) inputTemplateParameterSubstitution
                    .getFormal());
            this.doSwitch((EObject) inputTemplateParameterSubstitution
                    .getTemplateBinding());
            //            for (Object actual : inputTemplateParameterSubstitution
                    //                    .getActuals()) {
            //                this.doSwitch((EObject) actual);
            //            }
            //            for (Object ownedActual : inputTemplateParameterSubstitution
            //                    .getOwnedActuals()) {
            //                this.doSwitch((EObject) ownedActual);
            //            }
        
            this.doSwitch((EObject) inputTemplateParameterSubstitution.getActual());
        
            this.doSwitch((EObject)  inputTemplateParameterSubstitution.getOwnedActual());
        
        }
        return theResult;
    }

    @objid ("24aa0814-fea1-44fa-b9e9-c6a5743f73c0")
    @Override
    public Object caseTemplateSignature(org.eclipse.uml2.uml.TemplateSignature inputTemplateSignature) {
        Object theResult = visitorMap.get(inputTemplateSignature);
        if (theResult == null) {
            visitorMap.put(inputTemplateSignature, inputTemplateSignature);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TemplateSignatureImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitTemplateSignature(inputTemplateSignature);
            theResult = super.caseTemplateSignature(inputTemplateSignature);
            for (Object parameter : inputTemplateSignature.getParameters()) {
                this.doSwitch((EObject) parameter);
            }
            for (Object ownedParameter : inputTemplateSignature
                    .getOwnedParameters()) {
                this.doSwitch((EObject) ownedParameter);
            }
            this.doSwitch((EObject) inputTemplateSignature.getTemplate());
        }
        return theResult;
    }

    @objid ("ef2c961d-551a-404a-a551-ddbdae8c3b2e")
    @Override
    public Object caseTemplateableElement(org.eclipse.uml2.uml.TemplateableElement inputTemplateableElement) {
        Object theResult = super
        .caseTemplateableElement(inputTemplateableElement);
        for (Object templateBinding : inputTemplateableElement
                .getTemplateBindings()) {
            this.doSwitch((EObject) templateBinding);
        }
        this.doSwitch((EObject) inputTemplateableElement
                .getOwnedTemplateSignature());
        return theResult;
    }

    @objid ("a1370792-8796-4fce-a391-ff11651714a7")
    @Override
    public Object caseTestIdentityAction(org.eclipse.uml2.uml.TestIdentityAction inputTestIdentityAction) {
        Object theResult = visitorMap.get(inputTestIdentityAction);
        if (theResult == null) {
            visitorMap.put(inputTestIdentityAction, inputTestIdentityAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TestIdentityActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitTestIdentityAction(inputTestIdentityAction);
            theResult = super.caseTestIdentityAction(inputTestIdentityAction);
            this.doSwitch((EObject) inputTestIdentityAction.getFirst());
            this.doSwitch((EObject) inputTestIdentityAction.getSecond());
            this.doSwitch((EObject) inputTestIdentityAction.getResult());
        }
        return theResult;
    }

    @objid ("84cd497f-a824-4893-8ed8-38958e643d85")
    @Override
    public Object caseTimeConstraint(org.eclipse.uml2.uml.TimeConstraint inputTimeConstraint) {
        Object theResult = visitorMap.get(inputTimeConstraint);
        if (theResult == null) {
            visitorMap.put(inputTimeConstraint, inputTimeConstraint);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TimeConstraintImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitTimeConstraint(inputTimeConstraint);
            theResult = super.caseTimeConstraint(inputTimeConstraint);
            this.doSwitch((EObject) inputTimeConstraint.getSpecification());
        }
        return theResult;
    }

    @objid ("b84a04c8-f481-461f-ad09-f37466ffc635")
    @Override
    public Object caseTimeEvent(org.eclipse.uml2.uml.TimeEvent inputTimeEvent) {
        Object theResult = visitorMap.get(inputTimeEvent);
        if (theResult == null) {
            visitorMap.put(inputTimeEvent, inputTimeEvent);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TimeEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitTimeEvent(inputTimeEvent);
            theResult = super.caseTimeEvent(inputTimeEvent);
            this.doSwitch((EObject) inputTimeEvent.getWhen());
        }
        return theResult;
    }

    @objid ("fb7eee8a-aef6-43da-9958-17662da67c1d")
    @Override
    public Object caseTimeExpression(org.eclipse.uml2.uml.TimeExpression inputTimeExpression) {
        Object theResult = visitorMap.get(inputTimeExpression);
        if (theResult == null) {
            visitorMap.put(inputTimeExpression, inputTimeExpression);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TimeExpressionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitTimeExpression(inputTimeExpression);
            theResult = super.caseTimeExpression(inputTimeExpression);
            this.doSwitch((EObject) inputTimeExpression.getExpr());
            for (Object observation : inputTimeExpression.getObservations()) {
                this.doSwitch((EObject) observation);
            }
        }
        return theResult;
    }

    @objid ("14feb5fa-a23d-43dc-ba06-796fa4e83d61")
    @Override
    public Object caseTimeInterval(org.eclipse.uml2.uml.TimeInterval inputTimeInterval) {
        Object theResult = visitorMap.get(inputTimeInterval);
        if (theResult == null) {
            visitorMap.put(inputTimeInterval, inputTimeInterval);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TimeIntervalImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitTimeInterval(inputTimeInterval);
            theResult = super.caseTimeInterval(inputTimeInterval);
            this.doSwitch((EObject) inputTimeInterval.getMax());
            this.doSwitch((EObject) inputTimeInterval.getMin());
        }
        return theResult;
    }

    @objid ("c5302fcc-bf71-4bf7-b215-cf7ee4ca525a")
    @Override
    public Object caseTimeObservation(final TimeObservation inputTimeIservation) {
        Object theResult = visitorMap.get(inputTimeIservation);
        if (theResult == null) {
            visitorMap.put(inputTimeIservation, inputTimeIservation);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TimeIservationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitTimeIservation(inputTimeIservation);
            theResult = super.caseTimeObservation(inputTimeIservation);
            this.doSwitch((EObject) inputTimeIservation.getEvent());
        }
        return theResult;
    }

    @objid ("be55e389-828b-4ae8-a9d9-04e8c20359cf")
    @Override
    public Object caseTransition(org.eclipse.uml2.uml.Transition inputTransition) {
        Object theResult = visitorMap.get(inputTransition);
        if (theResult == null) {
            visitorMap.put(inputTransition, inputTransition);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TransitionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitTransition(inputTransition);
            theResult = super.caseTransition(inputTransition);
            this.doSwitch((EObject) inputTransition.getContainer());
            this.doSwitch((EObject) inputTransition.getSource());
            this.doSwitch((EObject) inputTransition.getTarget());
            this.doSwitch((EObject) inputTransition.getRedefinedTransition());
            this.doSwitch((EObject) inputTransition.getGuard());
            // this.doSwitch((EObject)inputTransition.getRedefinitionContext());
            for (Object redefinitionContext : inputTransition
                    .getRedefinitionContexts()) {
                this.doSwitch((EObject) redefinitionContext);
            }
            this.doSwitch((EObject) inputTransition.getEffect());
            for (Object trigger : inputTransition.getTriggers()) {
                this.doSwitch((EObject) trigger);
            }
        }
        return theResult;
    }

    @objid ("781c02b9-9144-4bfc-a441-59c619058445")
    @Override
    public Object caseTrigger(org.eclipse.uml2.uml.Trigger inputTrigger) {
        Object theResult = visitorMap.get(inputTrigger);
        if (theResult == null) {
            visitorMap.put(inputTrigger, inputTrigger);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TriggerImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitTrigger(inputTrigger);
            theResult = super.caseTrigger(inputTrigger);
            this.doSwitch((EObject) inputTrigger.getEvent());
            for (Object port : inputTrigger.getPorts()) {
                this.doSwitch((EObject) port);
            }
        }
        return theResult;
    }

    @objid ("3b2665b7-e199-4e83-a4a5-de2f9c04f5a4")
    @Override
    public Object caseType(org.eclipse.uml2.uml.Type inputType) {
        Object theResult = super.caseType(inputType);
        this.doSwitch((EObject) inputType.getPackage());
        return theResult;
    }

    @objid ("b049297a-e2b6-48ad-9275-26696ae572e9")
    @Override
    public Object caseTypedElement(org.eclipse.uml2.uml.TypedElement inputTypedElement) {
        Object theResult = super.caseTypedElement(inputTypedElement);
        this.doSwitch((EObject) inputTypedElement.getType());
        return theResult;
    }

    @objid ("db3c461e-b3ef-4af2-ab66-87523eca6f5e")
    @Override
    public Object caseUnmarshallAction(org.eclipse.uml2.uml.UnmarshallAction inputUnmarshallAction) {
        Object theResult = visitorMap.get(inputUnmarshallAction);
        if (theResult == null) {
            visitorMap.put(inputUnmarshallAction, inputUnmarshallAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("UnmarshallActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior.visitUnmarshallAction(inputUnmarshallAction);
            theResult = super.caseUnmarshallAction(inputUnmarshallAction);
            for (Object result : inputUnmarshallAction.getResults()) {
                this.doSwitch((EObject) result);
            }
            this.doSwitch((EObject) inputUnmarshallAction.getUnmarshallType());
            this.doSwitch((EObject) inputUnmarshallAction.getObject());
        }
        return theResult;
    }

    @objid ("4873f541-2e82-45f7-845d-da2266a4791a")
    @Override
    public Object caseUsage(org.eclipse.uml2.uml.Usage inputUsage) {
        Object theResult = visitorMap.get(inputUsage);
        if (theResult == null) {
            visitorMap.put(inputUsage, inputUsage);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("UsageImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitUsage(inputUsage);
            theResult = super.caseUsage(inputUsage);
        }
        return theResult;
    }

    @objid ("83aa0fef-5518-4235-9f8b-591d3ef2c5c2")
    @Override
    public Object caseUseCase(org.eclipse.uml2.uml.UseCase inputUseCase) {
        Object theResult = visitorMap.get(inputUseCase);
        if (theResult == null) {
            visitorMap.put(inputUseCase, inputUseCase);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("UseCaseImpl".equals(theResult.getClass().getSimpleName()))) {
            behavior.visitUseCase(inputUseCase);
            theResult = super.caseUseCase(inputUseCase);
            for (Object include : inputUseCase.getIncludes()) {
                this.doSwitch((EObject) include);
            }
            for (Object extend : inputUseCase.getExtends()) {
                this.doSwitch((EObject) extend);
            }
            for (Object extensionPoint : inputUseCase.getExtensionPoints()) {
                this.doSwitch((EObject) extensionPoint);
            }
            for (Object subject : inputUseCase.getSubjects()) {
                this.doSwitch((EObject) subject);
            }
        }
        return theResult;
    }

    @objid ("3e660b11-7508-4f1b-99a3-868d4929bacc")
    @Override
    public Object caseValuePin(org.eclipse.uml2.uml.ValuePin inputValuePin) {
        Object theResult = visitorMap.get(inputValuePin);
        if (theResult == null) {
            visitorMap.put(inputValuePin, inputValuePin);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ValuePinImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            behavior.visitValuePin(inputValuePin);
            theResult = super.caseValuePin(inputValuePin);
            this.doSwitch((EObject) inputValuePin.getValue());
        }
        return theResult;
    }

    @objid ("800a2928-ee1e-4198-b86e-a1e0b02a6c32")
    @Override
    public Object caseValueSpecification(org.eclipse.uml2.uml.ValueSpecification inputValueSpecification) {
        return super.caseValueSpecification(inputValueSpecification);
    }

    @objid ("c13b29eb-3d3f-4d1d-981c-acfd8a4cffa8")
    @Override
    public Object caseValueSpecificationAction(org.eclipse.uml2.uml.ValueSpecificationAction inputValueSpecificationAction) {
        Object theResult = visitorMap.get(inputValueSpecificationAction);
        if (theResult == null) {
            visitorMap.put(inputValueSpecificationAction,
                    inputValueSpecificationAction);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ValueSpecificationActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            behavior
            .visitValueSpecificationAction(inputValueSpecificationAction);
            theResult = super
            .caseValueSpecificationAction(inputValueSpecificationAction);
            this.doSwitch((EObject) inputValueSpecificationAction.getValue());
            this.doSwitch((EObject) inputValueSpecificationAction.getResult());
        }
        return theResult;
    }

    @objid ("8ba83915-94d5-4592-ad9d-d37ff667d293")
    @Override
    public Object caseVariable(org.eclipse.uml2.uml.Variable inputVariable) {
        Object theResult = visitorMap.get(inputVariable);
        if (theResult == null) {
            visitorMap.put(inputVariable, inputVariable);
        }
        
        // In particular case of this concrete element is inherited by another
        // concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("VariableImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            behavior.visitVariable(inputVariable);
            theResult = super.caseVariable(inputVariable);
            this.doSwitch((EObject) inputVariable.getScope());
            this.doSwitch((EObject) inputVariable.getActivityScope());
        }
        return theResult;
    }

    @objid ("8e864ee6-5538-4cad-81ea-0800b55aa0be")
    @Override
    public Object caseVariableAction(org.eclipse.uml2.uml.VariableAction inputVariableAction) {
        Object theResult = super.caseVariableAction(inputVariableAction);
        this.doSwitch((EObject) inputVariableAction.getVariable());
        return theResult;
    }

    @objid ("890a2c2e-ef2f-4985-8252-9e4d2aa63f3b")
    @Override
    public Object caseVertex(org.eclipse.uml2.uml.Vertex inputVertex) {
        Object theResult = super.caseVertex(inputVertex);
        this.doSwitch((EObject) inputVertex.getContainer());
        for (Object outgoing : inputVertex.getOutgoings()) {
            this.doSwitch((EObject) outgoing);
        }
        for (Object incoming : inputVertex.getIncomings()) {
            this.doSwitch((EObject) incoming);
        }
        return theResult;
    }

    @objid ("f9a71197-0b69-4fde-bab5-d7c540c9e888")
    @Override
    public Object caseWriteLinkAction(org.eclipse.uml2.uml.WriteLinkAction inputWriteLinkAction) {
        return super.caseWriteLinkAction(inputWriteLinkAction);
    }

    @objid ("471ecdbe-d183-4ee5-9180-5651eeefda19")
    @Override
    public Object caseWriteStructuralFeatureAction(org.eclipse.uml2.uml.WriteStructuralFeatureAction inputWriteStructuralFeatureAction) {
        Object theResult = super
        .caseWriteStructuralFeatureAction(inputWriteStructuralFeatureAction);
        this.doSwitch((EObject) inputWriteStructuralFeatureAction.getValue());
        return theResult;
    }

    @objid ("636b266a-4f04-44fe-951f-bcd6e8e0c98e")
    @Override
    public Object caseWriteVariableAction(org.eclipse.uml2.uml.WriteVariableAction inputWriteVariableAction) {
        Object theResult = super
        .caseWriteVariableAction(inputWriteVariableAction);
        this.doSwitch((EObject) inputWriteVariableAction.getValue());
        return theResult;
    }

    @objid ("bfb542ca-0b7d-4f5f-907f-9516efae4da5")
    @Override
    public Object doSwitch(EObject inputElement) {
        if (inputElement != null)
            return super.doSwitch(inputElement);
        else
            return null;
    }

}
