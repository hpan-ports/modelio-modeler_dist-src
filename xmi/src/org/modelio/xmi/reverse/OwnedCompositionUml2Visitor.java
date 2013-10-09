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
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
import org.modelio.metamodel.uml.behavior.interactionModel.StateInvariant;
import org.modelio.xmi.plugin.Xmi;
import org.modelio.xmi.util.ReverseProperties;

@objid ("7ce8b001-ab1e-4c42-bcf6-91c226038bbe")
public class OwnedCompositionUml2Visitor extends UMLSwitch<Object> {
    @objid ("907eb4bf-055c-486b-a82a-e2540461a3f3")
    private XMIImportBehavior behavior;

    @objid ("9a4cea09-0f7d-4ca4-b0b9-589bbb7115e4")
    private Map<Object, Object> visitorMap;

    @objid ("02368aee-ed5a-4398-a1ca-305c479ec841")
    public OwnedCompositionUml2Visitor(XMIImportBehavior behavior, Package ecoreRootModel) {
        this.behavior = behavior;
        this.visitorMap = new HashMap<Object, Object>();
        
        ReverseProperties.getInstance();
        if (ecoreRootModel instanceof org.eclipse.uml2.uml.Model)
            this.visitorMap.put(ecoreRootModel, ecoreRootModel);
    }

    @objid ("16405fe1-7b42-40af-a39d-663498d2e4f0")
    @Override
    public Object doSwitch(EObject inputElement) {
        if (inputElement != null)
            return super.doSwitch(inputElement);
        else
            return null;
    }

    @objid ("27e81b36-5445-4c1f-9841-a12b2fc68070")
    @Override
    public Object caseAbstraction(org.eclipse.uml2.uml.Abstraction inputAbstraction) {
        Object theResult = visitorMap.get(inputAbstraction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AbstractionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputAbstraction, inputAbstraction);
            behavior.visitAbstraction(inputAbstraction);
            this.doSwitch((EObject) inputAbstraction.getMapping());
        }
        return null;
    }

    @objid ("e7acdab6-c15b-4b65-a617-e67ac4fcc135")
    @Override
    public Object caseAcceptCallAction(org.eclipse.uml2.uml.AcceptCallAction inputAcceptCallAction) {
        Object theResult = visitorMap.get(inputAcceptCallAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AcceptCallActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputAcceptCallAction, inputAcceptCallAction);
            behavior.visitAcceptCallAction(inputAcceptCallAction);
            this.doSwitch((EObject) inputAcceptCallAction
                    .getReturnInformation());
        }
        return null;
    }

    @objid ("205c5d1f-2e84-48dc-b468-1ae14782f133")
    @Override
    public Object caseAcceptEventAction(org.eclipse.uml2.uml.AcceptEventAction inputAcceptEventAction) {
        Object theResult = visitorMap.get(inputAcceptEventAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AcceptEventActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputAcceptEventAction, inputAcceptEventAction);
            behavior.visitAcceptEventAction(inputAcceptEventAction);
            for (Object result : inputAcceptEventAction.getResults()) {
                this.doSwitch((EObject) result);
            }
            for (Object trigger : inputAcceptEventAction.getTriggers()) {
                this.doSwitch((EObject) trigger);
            }
        }
        return null;
    }

    @objid ("eb43b090-fa9c-4998-a1d7-2a1e13624217")
    @Override
    public Object caseAction(org.eclipse.uml2.uml.Action inputAction) {
        for (Object output : inputAction.getOutputs()) {
            this.doSwitch((EObject) output);
        }
        for (Object input : inputAction.getInputs()) {
            this.doSwitch((EObject) input);
        }
        for (Object localPrecondition : inputAction.getLocalPreconditions()) {
            this.doSwitch((EObject) localPrecondition);
        }
        for (Object localPostcondition : inputAction.getLocalPostconditions()) {
            this.doSwitch((EObject) localPostcondition);
        }
        return null;
    }

    @objid ("91e0fc1f-22b5-43df-95a5-168cb9ada6d6")
    @Override
    public Object caseActionExecutionSpecification(org.eclipse.uml2.uml.ActionExecutionSpecification inputActionExecutionSpecification) {
        Object theResult = visitorMap.get(inputActionExecutionSpecification);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ActionExecutionSpecificationImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputActionExecutionSpecification,
                    inputActionExecutionSpecification);
            behavior
            .visitActionExecutionSpecification(inputActionExecutionSpecification);
        }
        return null;
    }

    @objid ("2b08096a-2495-4207-b0eb-049ffe00bdc2")
    @Override
    public Object caseActionInputPin(org.eclipse.uml2.uml.ActionInputPin inputActionInputPin) {
        Object theResult = visitorMap.get(inputActionInputPin);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ActionInputPinImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputActionInputPin, inputActionInputPin);
            behavior.visitActionInputPin(inputActionInputPin);
            this.doSwitch((EObject) inputActionInputPin.getFromAction());
        }
        return null;
    }

    @objid ("6986e125-cac3-4062-9d07-e927b0fe7ac2")
    @Override
    public Object caseActivity(org.eclipse.uml2.uml.Activity inputActivity) {
        Object theResult = visitorMap.get(inputActivity);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ActivityImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputActivity, inputActivity);
            behavior.visitActivity(inputActivity);
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
            for (Object group : inputActivity.getGroups()) {
                this.doSwitch((EObject) group);
            }
        }
        return null;
    }

    @objid ("aa56b88d-5d32-4852-a8a6-f8ae8cf88c61")
    @Override
    public Object caseActivityEdge(org.eclipse.uml2.uml.ActivityEdge inputActivityEdge) {
        this.doSwitch((EObject) inputActivityEdge.getGuard());
        this.doSwitch((EObject) inputActivityEdge.getWeight());
        return null;
    }

    @objid ("d6b22be7-9d3b-4616-ae10-4c9f1a7796dc")
    @Override
    public Object caseActivityFinalNode(org.eclipse.uml2.uml.ActivityFinalNode inputActivityFinalNode) {
        Object theResult = visitorMap.get(inputActivityFinalNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ActivityFinalNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputActivityFinalNode, inputActivityFinalNode);
            behavior.visitActivityFinalNode(inputActivityFinalNode);
        }
        return null;
    }

    @objid ("f7cfb9b6-757f-4212-82fd-9f9501c353b0")
    @Override
    public Object caseActivityGroup(org.eclipse.uml2.uml.ActivityGroup inputActivityGroup) {
        for (Object subgroup : inputActivityGroup.getSubgroups()) {
            this.doSwitch((EObject) subgroup);
        }
        return null;
    }

    @objid ("05270fba-161b-4a84-a773-568e25ef3d16")
    @Override
    public Object caseActivityNode(org.eclipse.uml2.uml.ActivityNode inputActivityNode) {
        return null;
    }

    @objid ("9142d730-50c5-45d0-a08c-526e84027a52")
    @Override
    public Object caseActivityParameterNode(org.eclipse.uml2.uml.ActivityParameterNode inputActivityParameterNode) {
        Object theResult = visitorMap.get(inputActivityParameterNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ActivityParameterNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputActivityParameterNode,
                    inputActivityParameterNode);
            behavior.visitActivityParameterNode(inputActivityParameterNode);
        }
        return null;
    }

    @objid ("8280f93c-7b3a-4c59-a498-51fab501ed2b")
    @Override
    public Object caseActivityPartition(org.eclipse.uml2.uml.ActivityPartition inputActivityPartition) {
        Object theResult = visitorMap.get(inputActivityPartition);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ActivityPartitionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputActivityPartition, inputActivityPartition);
            behavior.visitActivityPartition(inputActivityPartition);
            for (Object subpartition : inputActivityPartition
                    .getSubpartitions()) {
                this.doSwitch((EObject) subpartition);
            }
        }
        return null;
    }

    @objid ("c2d9e6e5-6f0e-4e9c-abda-d925023415e1")
    @Override
    public Object caseActor(org.eclipse.uml2.uml.Actor inputActor) {
        Object theResult = visitorMap.get(inputActor);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ActorImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputActor, inputActor);
            behavior.visitActor(inputActor);
        }
        return null;
    }

    @objid ("2dc7d226-70f8-4212-b79b-0ae913751918")
    @Override
    public Object caseAddStructuralFeatureValueAction(org.eclipse.uml2.uml.AddStructuralFeatureValueAction inputAddStructuralFeatureValueAction) {
        Object theResult = visitorMap.get(inputAddStructuralFeatureValueAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AddStructuralFeatureValueActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputAddStructuralFeatureValueAction,
                    inputAddStructuralFeatureValueAction);
            behavior
            .visitAddStructuralFeatureValueAction(inputAddStructuralFeatureValueAction);
            this.doSwitch((EObject) inputAddStructuralFeatureValueAction
                    .getInsertAt());
        }
        return null;
    }

    @objid ("0f548bb5-d573-4bd6-81af-802e630c62ca")
    @Override
    public Object caseAddVariableValueAction(org.eclipse.uml2.uml.AddVariableValueAction inputAddVariableValueAction) {
        Object theResult = visitorMap.get(inputAddVariableValueAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AddVariableValueActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputAddVariableValueAction,
                    inputAddVariableValueAction);
            behavior.visitAddVariableValueAction(inputAddVariableValueAction);
            this.doSwitch((EObject) inputAddVariableValueAction.getInsertAt());
        }
        return null;
    }

    @objid ("d6d5d0ca-f886-406e-a98c-7b90d1ca53f1")
    @Override
    public Object caseAnyReceiveEvent(org.eclipse.uml2.uml.AnyReceiveEvent inputAnyReceiveEvent) {
        Object theResult = visitorMap.get(inputAnyReceiveEvent);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AnyReceiveEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputAnyReceiveEvent, inputAnyReceiveEvent);
            behavior.visitAnyReceiveEvent(inputAnyReceiveEvent);
        }
        return null;
    }

    @objid ("91784f20-ae3d-4cdc-bca0-bc07b930f5d8")
    @Override
    public Object caseArtifact(org.eclipse.uml2.uml.Artifact inputArtifact) {
        Object theResult = visitorMap.get(inputArtifact);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ArtifactImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputArtifact, inputArtifact);
            behavior.visitArtifact(inputArtifact);
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
        return null;
    }

    @objid ("43ff2733-8687-4118-836b-b6040e49a523")
    @Override
    public Object caseAssociation(org.eclipse.uml2.uml.Association inputAssociation) {
        Object theResult = visitorMap.get(inputAssociation);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        
        if (theResult == null
                || !("AssociationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
        
            visitorMap.put(inputAssociation, inputAssociation);
            behavior.visitAssociation(inputAssociation);
            for (Object ownedEnd : inputAssociation.getMemberEnds()) {
                this.doSwitch((EObject) ownedEnd);
            }
        
        }
        return null;
    }

    @objid ("d3826c71-5647-426c-b4f2-abdc0c67e2cd")
    @Override
    public Object caseAssociationClass(org.eclipse.uml2.uml.AssociationClass inputAssociationClass) {
        Object theResult = visitorMap.get(inputAssociationClass);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("AssociationClassImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputAssociationClass, inputAssociationClass);
            behavior.visitAssociationClass(inputAssociationClass);
            for (Object ownedEnd : inputAssociationClass.getMemberEnds()) {
                this.doSwitch((EObject) ownedEnd);
            }
        }
        return null;
    }

    @objid ("4428550f-f29e-42db-ae41-650692bde390")
    @Override
    public Object caseBehavior(org.eclipse.uml2.uml.Behavior inputBehavior) {
        for (Object ownedParameter : inputBehavior.getOwnedParameters()) {
            this.doSwitch((EObject) ownedParameter);
        }
        for (Object precondition : inputBehavior.getPreconditions()) {
            this.doSwitch((EObject) precondition);
        }
        for (Object postcondition : inputBehavior.getPostconditions()) {
            this.doSwitch((EObject) postcondition);
        }
        for (Object ownedParameterSet : inputBehavior.getOwnedParameterSets()) {
            this.doSwitch((EObject) ownedParameterSet);
        }
        return null;
    }

    @objid ("d2434408-6c08-4ee1-99a8-9c1fd8f67b43")
    @Override
    public Object caseBehavioralFeature(org.eclipse.uml2.uml.BehavioralFeature inputBehavioralFeature) {
        for (Object ownedParameter : inputBehavioralFeature
                .getOwnedParameters()) {
            this.doSwitch((EObject) ownedParameter);
        }
        for (Object ownedParameterSet : inputBehavioralFeature
                .getOwnedParameterSets()) {
            this.doSwitch((EObject) ownedParameterSet);
        }
        return null;
    }

    @objid ("4b5fdf25-eb15-4d6d-ad6c-46ffabbd8e57")
    @Override
    public Object caseBehavioredClassifier(org.eclipse.uml2.uml.BehavioredClassifier inputBehavioredClassifier) {
        for (Object ownedBehavior : inputBehavioredClassifier
                .getOwnedBehaviors()) {
            this.doSwitch((EObject) ownedBehavior);
        }
        for (Object interfaceRealization : inputBehavioredClassifier
                .getInterfaceRealizations()) {
            this.doSwitch((EObject) interfaceRealization);
        }
        for (Object ownedTrigger : inputBehavioredClassifier.getOwnedTriggers()) {
            this.doSwitch((EObject) ownedTrigger);
        }
        return null;
    }

    @objid ("524ccfad-3d27-4077-8e8b-6bc12f0f4615")
    @Override
    public Object caseBehaviorExecutionSpecification(org.eclipse.uml2.uml.BehaviorExecutionSpecification inputBehaviorExecutionSpecification) {
        Object theResult = visitorMap.get(inputBehaviorExecutionSpecification);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("BehaviorExecutionSpecificationImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputBehaviorExecutionSpecification,
                    inputBehaviorExecutionSpecification);
            behavior
            .visitBehaviorExecutionSpecification(inputBehaviorExecutionSpecification);
        }
        return null;
    }

    @objid ("0070859e-5c2d-486f-9a74-d2b92a6e9a3a")
    @Override
    public Object caseBroadcastSignalAction(org.eclipse.uml2.uml.BroadcastSignalAction inputBroadcastSignalAction) {
        Object theResult = visitorMap.get(inputBroadcastSignalAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("BroadcastSignalActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputBroadcastSignalAction,
                    inputBroadcastSignalAction);
            behavior.visitBroadcastSignalAction(inputBroadcastSignalAction);
        }
        return null;
    }

    @objid ("1b3d3fd0-eb48-4ae6-8fc8-b3bdef686e2d")
    @Override
    public Object caseCallAction(org.eclipse.uml2.uml.CallAction inputCallAction) {
        for (Object result : inputCallAction.getResults()) {
            this.doSwitch((EObject) result);
        }
        return null;
    }

    @objid ("1fb16e81-4c01-41b2-b718-380de6d5719d")
    @Override
    public Object caseCallBehaviorAction(org.eclipse.uml2.uml.CallBehaviorAction inputCallBehaviorAction) {
        Object theResult = visitorMap.get(inputCallBehaviorAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CallBehaviorActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputCallBehaviorAction, inputCallBehaviorAction);
            behavior.visitCallBehaviorAction(inputCallBehaviorAction);
        }
        return null;
    }

    @objid ("cdf287dd-656d-42b8-b4dc-14410b107ddd")
    @Override
    public Object caseCallEvent(org.eclipse.uml2.uml.CallEvent inputCallEvent) {
        Object theResult = visitorMap.get(inputCallEvent);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CallEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputCallEvent, inputCallEvent);
            behavior.visitCallEvent(inputCallEvent);
        }
        return null;
    }

    @objid ("e553c33c-1966-4b87-8809-f2f3593fbdad")
    @Override
    public Object caseCallOperationAction(org.eclipse.uml2.uml.CallOperationAction inputCallOperationAction) {
        Object theResult = visitorMap.get(inputCallOperationAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CallOperationActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputCallOperationAction, inputCallOperationAction);
            behavior.visitCallOperationAction(inputCallOperationAction);
            this.doSwitch((EObject) inputCallOperationAction.getTarget());
        }
        return null;
    }

    @objid ("f7196433-4fe5-4d2c-8afc-e4a7c1814179")
    @Override
    public Object caseCentralBufferNode(org.eclipse.uml2.uml.CentralBufferNode inputCentralBufferNode) {
        Object theResult = visitorMap.get(inputCentralBufferNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CentralBufferNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputCentralBufferNode, inputCentralBufferNode);
            behavior.visitCentralBufferNode(inputCentralBufferNode);
        }
        return null;
    }

    @objid ("3058e201-ef46-4fbc-818d-b07633355681")
    @Override
    public Object caseChangeEvent(org.eclipse.uml2.uml.ChangeEvent inputChangeEvent) {
        Object theResult = visitorMap.get(inputChangeEvent);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ChangeEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputChangeEvent, inputChangeEvent);
            behavior.visitChangeEvent(inputChangeEvent);
            this.doSwitch((EObject) inputChangeEvent.getChangeExpression());
        }
        return null;
    }

    @objid ("40e6b8ac-393c-468a-894c-b01fd6e0dc3d")
    @Override
    public Object caseClass(org.eclipse.uml2.uml.Class inputClass) {
        Object theResult = visitorMap.get(inputClass);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ClassImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputClass, inputClass);
            behavior.visitClass(inputClass);
            for (Object nestedClassifier : inputClass.getNestedClassifiers()) {
                this.doSwitch((EObject) nestedClassifier);
            }
            for (Object ownedAttribute : inputClass.getOwnedAttributes()) {
                this.doSwitch((EObject) ownedAttribute);
            }
            for (Object ownedOperation : inputClass.getOwnedOperations()) {
                this.doSwitch((EObject) ownedOperation);
            }
            for (Object ownedReception : inputClass.getOwnedReceptions()) {
                this.doSwitch((EObject) ownedReception);
            }
        }
        return null;
    }

    @objid ("7959fa87-87e8-4258-bd73-d9ebf296cb07")
    @Override
    public Object caseClassifier(org.eclipse.uml2.uml.Classifier inputClassifier) {
        for (Object generalization : inputClassifier.getGeneralizations()) {
            this.doSwitch((EObject) generalization);
        }
        for (Object substitution : inputClassifier.getSubstitutions()) {
            this.doSwitch((EObject) substitution);
        }
        for (Object collaborationUse : inputClassifier.getCollaborationUses()) {
            this.doSwitch((EObject) collaborationUse);
        }
        for (Object ownedUseCase : inputClassifier.getOwnedUseCases()) {
            this.doSwitch((EObject) ownedUseCase);
        }
        this.doSwitch((EObject) inputClassifier.getOwnedTemplateSignature());
        return null;
    }

    @objid ("6a853c40-e71a-418e-aa38-99c75ebe4438")
    @Override
    public Object caseClassifierTemplateParameter(org.eclipse.uml2.uml.ClassifierTemplateParameter inputClassifierTemplateParameter) {
        Object theResult = visitorMap.get(inputClassifierTemplateParameter);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ClassifierTemplateParameterImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputClassifierTemplateParameter,
                    inputClassifierTemplateParameter);
            behavior
            .visitClassifierTemplateParameter(inputClassifierTemplateParameter);
        }
        return null;
    }

    @objid ("779121c9-ec07-4cf3-9ab3-94649352627a")
    @Override
    public Object caseClause(org.eclipse.uml2.uml.Clause inputClause) {
        Object theResult = visitorMap.get(inputClause);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ClauseImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputClause, inputClause);
            behavior.visitClause(inputClause);
        }
        return null;
    }

    @objid ("75fe39b9-a022-408e-ab67-924ca4942193")
    @Override
    public Object caseClearAssociationAction(org.eclipse.uml2.uml.ClearAssociationAction inputClearAssociationAction) {
        Object theResult = visitorMap.get(inputClearAssociationAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ClearAssociationActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputClearAssociationAction,
                    inputClearAssociationAction);
            behavior.visitClearAssociationAction(inputClearAssociationAction);
            this.doSwitch((EObject) inputClearAssociationAction.getObject());
        }
        return null;
    }

    @objid ("a0cb1a7b-1bdb-49e2-ab7f-6f0f005834ea")
    @Override
    public Object caseClearStructuralFeatureAction(org.eclipse.uml2.uml.ClearStructuralFeatureAction inputClearStructuralFeatureAction) {
        Object theResult = visitorMap.get(inputClearStructuralFeatureAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ClearStructuralFeatureActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputClearStructuralFeatureAction,
                    inputClearStructuralFeatureAction);
            behavior
            .visitClearStructuralFeatureAction(inputClearStructuralFeatureAction);
        }
        return null;
    }

    @objid ("62229e75-ccf5-408a-bba1-25150f617585")
    @Override
    public Object caseClearVariableAction(org.eclipse.uml2.uml.ClearVariableAction inputClearVariableAction) {
        Object theResult = visitorMap.get(inputClearVariableAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ClearVariableActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputClearVariableAction, inputClearVariableAction);
            behavior.visitClearVariableAction(inputClearVariableAction);
        }
        return null;
    }

    @objid ("a13523bb-aa97-4ad7-827f-b0cf90752358")
    @Override
    public Object caseCollaboration(org.eclipse.uml2.uml.Collaboration inputCollaboration) {
        Object theResult = visitorMap.get(inputCollaboration);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CollaborationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputCollaboration, inputCollaboration);
            behavior.visitCollaboration(inputCollaboration);
        }
        return null;
    }

    @objid ("058bb3f3-4339-4a1e-ab00-5dac3d83a8f3")
    @Override
    public Object caseCollaborationUse(org.eclipse.uml2.uml.CollaborationUse inputCollaborationUse) {
        Object theResult = visitorMap.get(inputCollaborationUse);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CollaborationUseImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputCollaborationUse, inputCollaborationUse);
            behavior.visitCollaborationUse(inputCollaborationUse);
            for (Object roleBinding : inputCollaborationUse.getRoleBindings()) {
                this.doSwitch((EObject) roleBinding);
            }
        }
        return null;
    }

    @objid ("72d258a2-6506-45d4-87b9-6afb7fdf4fd2")
    @Override
    public Object caseCombinedFragment(org.eclipse.uml2.uml.CombinedFragment inputCombinedFragment) {
        Object theResult = visitorMap.get(inputCombinedFragment);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CombinedFragmentImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputCombinedFragment, inputCombinedFragment);
            behavior.visitCombinedFragment(inputCombinedFragment);
            for (Object operand : inputCombinedFragment.getOperands()) {
                this.doSwitch((EObject) operand);
            }
            for (Object cfragmentGate : inputCombinedFragment
                    .getCfragmentGates()) {
                this.doSwitch((EObject) cfragmentGate);
            }
        }
        return null;
    }

    @objid ("19227dae-a30a-4604-a410-6e6c95854640")
    @Override
    public Object caseComment(org.eclipse.uml2.uml.Comment inputComment) {
        Object theResult = visitorMap.get(inputComment);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CommentImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputComment, inputComment);
            behavior.visitComment(inputComment);
        }
        return null;
    }

    @objid ("6b22db4b-00fb-4cdf-9a62-926461935d51")
    @Override
    public Object caseCommunicationPath(org.eclipse.uml2.uml.CommunicationPath inputCommunicationPath) {
        Object theResult = visitorMap.get(inputCommunicationPath);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CommunicationPathImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputCommunicationPath, inputCommunicationPath);
            behavior.visitCommunicationPath(inputCommunicationPath);
        }
        return null;
    }

    @objid ("fe50e510-3d48-415c-9010-7c17101e933b")
    @Override
    public Object caseComponent(org.eclipse.uml2.uml.Component inputComponent) {
        Object theResult = visitorMap.get(inputComponent);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ComponentImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputComponent, inputComponent);
            behavior.visitComponent(inputComponent);
            for (Object realization : inputComponent.getRealizations()) {
                this.doSwitch((EObject) realization);
            }
            for (Object packagedElement : inputComponent.getPackagedElements()) {
                this.doSwitch((EObject) packagedElement);
            }
        }
        return null;
    }

    @objid ("e3f2bdec-72be-4539-b507-e913225f735b")
    @Override
    public Object caseComponentRealization(org.eclipse.uml2.uml.ComponentRealization inputComponentRealization) {
        Object theResult = visitorMap.get(inputComponentRealization);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ComponentRealizationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap
            .put(inputComponentRealization, inputComponentRealization);
            behavior.visitComponentRealization(inputComponentRealization);
        }
        return null;
    }

    @objid ("d047d6f0-48a7-4b9a-a467-3019277ec2e5")
    @Override
    public Object caseConditionalNode(org.eclipse.uml2.uml.ConditionalNode inputConditionalNode) {
        Object theResult = visitorMap.get(inputConditionalNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ConditionalNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputConditionalNode, inputConditionalNode);
            behavior.visitConditionalNode(inputConditionalNode);
            for (Object clause : inputConditionalNode.getClauses()) {
                this.doSwitch((EObject) clause);
            }
            for (Object result : inputConditionalNode.getResults()) {
                this.doSwitch((EObject) result);
            }
        }
        return null;
    }

    @objid ("abbfc782-57fc-4db4-8ffb-a67299ab5d96")
    @Override
    public Object caseConnectableElement(org.eclipse.uml2.uml.ConnectableElement inputConnectableElement) {
        return null;
    }

    @objid ("ae2abc1b-326c-463d-97d8-fb274760dc18")
    @Override
    public Object caseConnectableElementTemplateParameter(org.eclipse.uml2.uml.ConnectableElementTemplateParameter inputConnectableElementTemplateParameter) {
        Object theResult = visitorMap
                .get(inputConnectableElementTemplateParameter);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ConnectableElementTemplateParameterImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputConnectableElementTemplateParameter,
                    inputConnectableElementTemplateParameter);
            behavior
            .visitConnectableElementTemplateParameter(inputConnectableElementTemplateParameter);
        }
        return null;
    }

    @objid ("9997d82b-2a3d-4028-be96-417d761855ac")
    @Override
    public Object caseConnectionPointReference(org.eclipse.uml2.uml.ConnectionPointReference inputConnectionPointReference) {
        Object theResult = visitorMap.get(inputConnectionPointReference);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ConnectionPointReferenceImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputConnectionPointReference,
                    inputConnectionPointReference);
            behavior
            .visitConnectionPointReference(inputConnectionPointReference);
        }
        return null;
    }

    @objid ("1fed9173-5569-4cb5-badf-193140277fb9")
    @Override
    public Object caseConnector(org.eclipse.uml2.uml.Connector inputConnector) {
        Object theResult = visitorMap.get(inputConnector);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ConnectorImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputConnector, inputConnector);
            behavior.visitConnector(inputConnector);
            for (Object end : inputConnector.getEnds()) {
                this.doSwitch((EObject) end);
            }
        }
        return null;
    }

    @objid ("ad251001-4483-4f68-8bd9-0935ea70e25b")
    @Override
    public Object caseConnectorEnd(org.eclipse.uml2.uml.ConnectorEnd inputConnectorEnd) {
        Object theResult = visitorMap.get(inputConnectorEnd);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ConnectorEndImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputConnectorEnd, inputConnectorEnd);
            behavior.visitConnectorEnd(inputConnectorEnd);
        }
        return null;
    }

    @objid ("70fd3148-0319-42a1-aaf2-5a54e2d7158c")
    @Override
    public Object caseConsiderIgnoreFragment(org.eclipse.uml2.uml.ConsiderIgnoreFragment inputConsiderIgnoreFragment) {
        Object theResult = visitorMap.get(inputConsiderIgnoreFragment);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ConsiderIgnoreFragmentImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputConsiderIgnoreFragment,
                    inputConsiderIgnoreFragment);
            behavior.visitConsiderIgnoreFragment(inputConsiderIgnoreFragment);
        }
        return null;
    }

    @objid ("b36e32e2-1c99-44bb-9663-a2c561db0d8a")
    @Override
    public Object caseConstraint(org.eclipse.uml2.uml.Constraint inputConstraint) {
        Object theResult = visitorMap.get(inputConstraint);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ConstraintImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputConstraint, inputConstraint);
            behavior.visitConstraint(inputConstraint);
            this.doSwitch((EObject) inputConstraint.getSpecification());
        }
        return null;
    }

    @objid ("2231f66b-1c3f-4fb0-89ba-aea27db187df")
    @Override
    public Object caseContinuation(org.eclipse.uml2.uml.Continuation inputContinuation) {
        Object theResult = visitorMap.get(inputContinuation);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ContinuationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputContinuation, inputContinuation);
            behavior.visitContinuation(inputContinuation);
        }
        return null;
    }

    @objid ("63caf0c3-9be6-47bc-9e0d-9b5d3ca39e1b")
    @Override
    public Object caseControlFlow(org.eclipse.uml2.uml.ControlFlow inputControlFlow) {
        Object theResult = visitorMap.get(inputControlFlow);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ControlFlowImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputControlFlow, inputControlFlow);
            behavior.visitControlFlow(inputControlFlow);
        }
        return null;
    }

    @objid ("0ed3d274-562e-48e5-9783-b6909788f514")
    @Override
    public Object caseControlNode(org.eclipse.uml2.uml.ControlNode inputControlNode) {
        return null;
    }

    @objid ("858a0128-a7e0-4477-a8ef-aad479f4b013")
    @Override
    public Object caseCreateLinkAction(org.eclipse.uml2.uml.CreateLinkAction inputCreateLinkAction) {
        Object theResult = visitorMap.get(inputCreateLinkAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CreateLinkActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputCreateLinkAction, inputCreateLinkAction);
            behavior.visitCreateLinkAction(inputCreateLinkAction);
            for (Object endData : inputCreateLinkAction.getEndData()) {
                this.doSwitch((EObject) endData);
            }
        }
        return null;
    }

    @objid ("e2a64c90-c658-42ce-9568-87bb2364eca1")
    @Override
    public Object caseCreateLinkObjectAction(org.eclipse.uml2.uml.CreateLinkObjectAction inputCreateLinkObjectAction) {
        Object theResult = visitorMap.get(inputCreateLinkObjectAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CreateLinkObjectActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputCreateLinkObjectAction,
                    inputCreateLinkObjectAction);
            behavior.visitCreateLinkObjectAction(inputCreateLinkObjectAction);
            this.doSwitch((EObject) inputCreateLinkObjectAction.getResult());
        }
        return null;
    }

    @objid ("b3ccb6a8-1b92-47cc-b50a-0b99fdd2dd23")
    @Override
    public Object caseCreateObjectAction(org.eclipse.uml2.uml.CreateObjectAction inputCreateObjectAction) {
        Object theResult = visitorMap.get(inputCreateObjectAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CreateObjectActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputCreateObjectAction, inputCreateObjectAction);
            behavior.visitCreateObjectAction(inputCreateObjectAction);
            this.doSwitch((EObject) inputCreateObjectAction.getResult());
        }
        return null;
    }

    @objid ("083dfc75-7b36-4157-81ab-aabce39726ca")
    @Override
    public Object caseCreationEvent(org.eclipse.uml2.uml.CreationEvent inputCreationEvent) {
        Object theResult = visitorMap.get(inputCreationEvent);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("CreationEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputCreationEvent, inputCreationEvent);
            behavior.visitCreationEvent(inputCreationEvent);
        }
        return null;
    }

    @objid ("e0c234de-e53b-4c4f-94d6-6b3903aec705")
    @Override
    public Object caseDataStoreNode(org.eclipse.uml2.uml.DataStoreNode inputDataStoreNode) {
        Object theResult = visitorMap.get(inputDataStoreNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DataStoreNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputDataStoreNode, inputDataStoreNode);
            behavior.visitDataStoreNode(inputDataStoreNode);
        }
        return null;
    }

    @objid ("74d07a62-3957-40e6-8289-b98b9cc6a977")
    @Override
    public Object caseDataType(org.eclipse.uml2.uml.DataType inputDataType) {
        Object theResult = visitorMap.get(inputDataType);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DataTypeImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputDataType, inputDataType);
            behavior.visitDataType(inputDataType);
            for (Object ownedAttribute : inputDataType.getOwnedAttributes()) {
                this.doSwitch((EObject) ownedAttribute);
            }
            for (Object ownedOperation : inputDataType.getOwnedOperations()) {
                this.doSwitch((EObject) ownedOperation);
            }
        }
        return null;
    }

    @objid ("abf9f675-9d11-48e2-b1bb-078b16f793d7")
    @Override
    public Object caseDecisionNode(org.eclipse.uml2.uml.DecisionNode inputDecisionNode) {
        Object theResult = visitorMap.get(inputDecisionNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DecisionNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputDecisionNode, inputDecisionNode);
            behavior.visitDecisionNode(inputDecisionNode);
        }
        return null;
    }

    @objid ("85b52a8a-4461-4abf-a34e-17272d0bb045")
    @Override
    public Object caseDependency(org.eclipse.uml2.uml.Dependency inputDependency) {
        Object theResult = visitorMap.get(inputDependency);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DependencyImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputDependency, inputDependency);
            behavior.visitDependency(inputDependency);
        }
        return null;
    }

    @objid ("64f5c7b1-d148-404b-85df-5d4b6669301e")
    @Override
    public Object caseDeployedArtifact(org.eclipse.uml2.uml.DeployedArtifact inputDeployedArtifact) {
        return null;
    }

    @objid ("932a47a4-730d-476e-9967-a2e26889c265")
    @Override
    public Object caseDeployment(org.eclipse.uml2.uml.Deployment inputDeployment) {
        Object theResult = visitorMap.get(inputDeployment);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DeploymentImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputDeployment, inputDeployment);
            behavior.visitDeployment(inputDeployment);
            for (Object configuration : inputDeployment.getConfigurations()) {
                this.doSwitch((EObject) configuration);
            }
        }
        return null;
    }

    @objid ("76cbb93a-215a-430d-92d4-6a14607f7300")
    @Override
    public Object caseDeploymentSpecification(org.eclipse.uml2.uml.DeploymentSpecification inputDeploymentSpecification) {
        Object theResult = visitorMap.get(inputDeploymentSpecification);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DeploymentSpecificationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputDeploymentSpecification,
                    inputDeploymentSpecification);
            behavior.visitDeploymentSpecification(inputDeploymentSpecification);
        }
        return null;
    }

    @objid ("276bdf89-bd49-48d0-bf1e-07d570046e7d")
    @Override
    public Object caseDeploymentTarget(org.eclipse.uml2.uml.DeploymentTarget inputDeploymentTarget) {
        for (Object deployment : inputDeploymentTarget.getDeployments()) {
            this.doSwitch((EObject) deployment);
        }
        return null;
    }

    @objid ("a5c24fa4-cc1b-472a-bfa4-c20fc7ccf6dd")
    @Override
    public Object caseDestroyLinkAction(org.eclipse.uml2.uml.DestroyLinkAction inputDestroyLinkAction) {
        Object theResult = visitorMap.get(inputDestroyLinkAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DestroyLinkActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputDestroyLinkAction, inputDestroyLinkAction);
            behavior.visitDestroyLinkAction(inputDestroyLinkAction);
            for (Object endData : inputDestroyLinkAction.getEndData()) {
                this.doSwitch((EObject) endData);
            }
        }
        return null;
    }

    @objid ("c852d9e5-b327-4c6a-929f-3f4d22f311ca")
    @Override
    public Object caseDestroyObjectAction(org.eclipse.uml2.uml.DestroyObjectAction inputDestroyObjectAction) {
        Object theResult = visitorMap.get(inputDestroyObjectAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DestroyObjectActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputDestroyObjectAction, inputDestroyObjectAction);
            behavior.visitDestroyObjectAction(inputDestroyObjectAction);
            this.doSwitch((EObject) inputDestroyObjectAction.getTarget());
        }
        return null;
    }

    @objid ("9a72b7f7-15cd-4eee-b02d-1e00406fc6f7")
    @Override
    public Object caseDestructionEvent(org.eclipse.uml2.uml.DestructionEvent inputDestructionEvent) {
        Object theResult = visitorMap.get(inputDestructionEvent);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DestructionEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputDestructionEvent, inputDestructionEvent);
            behavior.visitDestructionEvent(inputDestructionEvent);
        }
        return null;
    }

    @objid ("2bc7ac5f-6e59-4cda-9c98-2d830f581a88")
    @Override
    public Object caseDevice(org.eclipse.uml2.uml.Device inputDevice) {
        Object theResult = visitorMap.get(inputDevice);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DeviceImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputDevice, inputDevice);
            behavior.visitDevice(inputDevice);
        }
        return null;
    }

    @objid ("8aa18ba5-9543-4f5b-a9cb-a89e1cc607e4")
    @Override
    public Object caseDirectedRelationship(org.eclipse.uml2.uml.DirectedRelationship inputDirectedRelationship) {
        return null;
    }

    @objid ("03959060-77cb-4410-91c5-c7af799bd774")
    @Override
    public Object caseDuration(org.eclipse.uml2.uml.Duration inputDuration) {
        Object theResult = visitorMap.get(inputDuration);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DurationImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputDuration, inputDuration);
            behavior.visitDuration(inputDuration);
        }
        return null;
    }

    @objid ("bbb265b0-8379-4bd7-99d0-e5a1de8b06c4")
    @Override
    public Object caseDurationConstraint(org.eclipse.uml2.uml.DurationConstraint inputDurationConstraint) {
        Object theResult = visitorMap.get(inputDurationConstraint);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DurationConstraintImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputDurationConstraint, inputDurationConstraint);
            behavior.visitDurationConstraint(inputDurationConstraint);
            this.doSwitch((EObject) inputDurationConstraint.getSpecification());
        }
        return null;
    }

    @objid ("18317a87-ef4f-424a-895e-e852234447ce")
    @Override
    public Object caseDurationInterval(org.eclipse.uml2.uml.DurationInterval inputDurationInterval) {
        Object theResult = visitorMap.get(inputDurationInterval);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DurationIntervalImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputDurationInterval, inputDurationInterval);
            behavior.visitDurationInterval(inputDurationInterval);
        }
        return null;
    }

    @objid ("d538d2d0-4199-470d-a580-64197b7567ff")
    @Override
    public Object caseDurationObservation(final DurationObservation inputDurationIservation) {
        Object theResult = visitorMap.get(inputDurationIservation);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("DurationIservationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputDurationIservation, inputDurationIservation);
            behavior.visitDurationObservation(inputDurationIservation);
        }
        return null;
    }

    @objid ("5e9ee055-4723-4337-9a8f-20d0f79ff296")
    @Override
    public Object caseElement(org.eclipse.uml2.uml.Element inputElement) {
        for (Object ownedElement : inputElement.getOwnedElements()) {
            this.doSwitch((EObject) ownedElement);
        }
        for (Object ownedComment : inputElement.getOwnedComments()) {
            this.doSwitch((EObject) ownedComment);
        }
        return null;
    }

    @objid ("8bce1e42-297b-4ff6-a2c0-fc3472cef63a")
    @Override
    public Object caseElementImport(org.eclipse.uml2.uml.ElementImport inputElementImport) {
        Object theResult = visitorMap.get(inputElementImport);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ElementImportImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputElementImport, inputElementImport);
            behavior.visitElementImport(inputElementImport);
        }
        return null;
    }

    @objid ("be1b5263-335b-4af8-8b82-e9965977eb67")
    @Override
    public Object caseEncapsulatedClassifier(org.eclipse.uml2.uml.EncapsulatedClassifier inputEncapsulatedClassifier) {
        for (Object ownedPort : inputEncapsulatedClassifier.getOwnedPorts()) {
            this.doSwitch((EObject) ownedPort);
        }
        return null;
    }

    @objid ("b0e24f2d-f4db-4a6c-8428-a208eff5c8bc")
    @Override
    public Object caseEnumeration(org.eclipse.uml2.uml.Enumeration inputEnumeration) {
        Object theResult = visitorMap.get(inputEnumeration);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("EnumerationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputEnumeration, inputEnumeration);
            behavior.visitEnumeration(inputEnumeration);
            for (Object ownedLiteral : inputEnumeration.getOwnedLiterals()) {
                this.doSwitch((EObject) ownedLiteral);
            }
        }
        return null;
    }

    @objid ("c9a8ba7f-4d9f-4429-b9d0-d3dcd7e9de77")
    @Override
    public Object caseEnumerationLiteral(org.eclipse.uml2.uml.EnumerationLiteral inputEnumerationLiteral) {
        Object theResult = visitorMap.get(inputEnumerationLiteral);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("EnumerationLiteralImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputEnumerationLiteral, inputEnumerationLiteral);
            behavior.visitEnumerationLiteral(inputEnumerationLiteral);
        }
        return null;
    }

    @objid ("2b431795-25eb-4263-8d59-7e70d56e81bc")
    @Override
    public Object caseEvent(org.eclipse.uml2.uml.Event inputEvent) {
        return null;
    }

    @objid ("2e084c84-2786-4877-b4f7-ecc123b57a74")
    @Override
    public Object caseExceptionHandler(ExceptionHandler inputExceptionHandler) {
        Object theResult = visitorMap.get(inputExceptionHandler);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExceptionHandlerImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputExceptionHandler, inputExceptionHandler);
            behavior.visitExceptionHandler(inputExceptionHandler);
        }
        return null;
    }

    @objid ("fd22c060-669f-46af-a4e2-5d81343b704b")
    @Override
    public Object caseExecutableNode(org.eclipse.uml2.uml.ExecutableNode inputExecutableNode) {
        for (Object handler : inputExecutableNode.getHandlers()) {
            this.doSwitch((EObject) handler);
        }
        return null;
    }

    @objid ("12616057-b0fb-4732-8fb3-483c6531b405")
    @Override
    public Object caseExecutionEnvironment(org.eclipse.uml2.uml.ExecutionEnvironment inputExecutionEnvironment) {
        Object theResult = visitorMap.get(inputExecutionEnvironment);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExecutionEnvironmentImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap
            .put(inputExecutionEnvironment, inputExecutionEnvironment);
            behavior.visitExecutionEnvironment(inputExecutionEnvironment);
        }
        return null;
    }

    @objid ("007a9134-b9ae-4b80-baa6-ae6827fcac63")
    @Override
    public Object caseExecutionEvent(org.eclipse.uml2.uml.ExecutionEvent inputExecutionEvent) {
        Object theResult = visitorMap.get(inputExecutionEvent);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExecutionEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputExecutionEvent, inputExecutionEvent);
            behavior.visitExecutionEvent(inputExecutionEvent);
        }
        return null;
    }

    @objid ("f38da0b2-f9e5-43ba-b629-dc85dded7caa")
    @Override
    public Object caseExecutionOccurrenceSpecification(org.eclipse.uml2.uml.ExecutionOccurrenceSpecification inputExecutionOccurrenceSpecification) {
        Object theResult = visitorMap
                .get(inputExecutionOccurrenceSpecification);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExecutionOccurrenceSpecificationImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputExecutionOccurrenceSpecification,
                    inputExecutionOccurrenceSpecification);
            behavior
            .visitExecutionOccurrenceSpecification(inputExecutionOccurrenceSpecification);
        }
        return null;
    }

    @objid ("88bd4357-5f92-46c8-bd4b-7de912b891da")
    @Override
    public Object caseExecutionSpecification(org.eclipse.uml2.uml.ExecutionSpecification inputExecutionSpecification) {
        return null;
    }

    @objid ("1abd6556-7598-440b-a69c-12fa409e9be2")
    @Override
    public Object caseExpansionNode(org.eclipse.uml2.uml.ExpansionNode inputExpansionNode) {
        Object theResult = visitorMap.get(inputExpansionNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExpansionNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputExpansionNode, inputExpansionNode);
            behavior.visitExpansionNode(inputExpansionNode);
        }
        return null;
    }

    @objid ("11327808-8d91-4782-987a-e71d6f8e463e")
    @Override
    public Object caseExpansionRegion(org.eclipse.uml2.uml.ExpansionRegion inputExpansionRegion) {
        Object theResult = visitorMap.get(inputExpansionRegion);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExpansionRegionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputExpansionRegion, inputExpansionRegion);
            behavior.visitExpansionRegion(inputExpansionRegion);
        }
        return null;
    }

    @objid ("6fc8eca4-4208-4694-9807-a13da9c0d691")
    @Override
    public Object caseExpression(org.eclipse.uml2.uml.Expression inputExpression) {
        Object theResult = visitorMap.get(inputExpression);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExpressionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputExpression, inputExpression);
            behavior.visitExpression(inputExpression);
            for (Object operand : inputExpression.getOperands()) {
                this.doSwitch((EObject) operand);
            }
        }
        return null;
    }

    @objid ("3e30d78d-7184-4444-9d57-d343dd54c827")
    @Override
    public Object caseExtend(org.eclipse.uml2.uml.Extend inputExtend) {
        Object theResult = visitorMap.get(inputExtend);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExtendImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputExtend, inputExtend);
            behavior.visitExtend(inputExtend);
            this.doSwitch((EObject) inputExtend.getCondition());
        }
        return null;
    }

    @objid ("c2316afe-5ac0-45a5-865c-a4bfa5e70d96")
    @Override
    public Object caseExtension(org.eclipse.uml2.uml.Extension inputExtension) {
        Object theResult = visitorMap.get(inputExtension);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExtensionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputExtension, inputExtension);
            behavior.visitExtension(inputExtension);
            for (Object ownedEnd : inputExtension.getOwnedEnds()) {
                this.doSwitch((EObject) ownedEnd);
            }
        }
        return null;
    }

    @objid ("a7b8de6e-09fb-4729-9f0d-ce14c2445ef9")
    @Override
    public Object caseExtensionEnd(org.eclipse.uml2.uml.ExtensionEnd inputExtensionEnd) {
        Object theResult = visitorMap.get(inputExtensionEnd);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExtensionEndImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputExtensionEnd, inputExtensionEnd);
            behavior.visitExtensionEnd(inputExtensionEnd);
        }
        return null;
    }

    @objid ("f385b4ae-7b73-4c5c-acb9-1d9650e29532")
    @Override
    public Object caseExtensionPoint(org.eclipse.uml2.uml.ExtensionPoint inputExtensionPoint) {
        Object theResult = visitorMap.get(inputExtensionPoint);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ExtensionPointImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputExtensionPoint, inputExtensionPoint);
            behavior.visitExtensionPoint(inputExtensionPoint);
        }
        return null;
    }

    @objid ("773ea02f-b946-49b6-8ecd-dd3506ae0b66")
    @Override
    public Object caseFeature(org.eclipse.uml2.uml.Feature inputFeature) {
        return null;
    }

    @objid ("3d0e36d9-61a7-42a0-9d4a-eb1853b44e68")
    @Override
    public Object caseFinalNode(FinalNode inputFinalNode) {
        return null;
    }

    @objid ("a35fb956-5ede-45c8-93f8-13156175ff9e")
    @Override
    public Object caseFinalState(FinalState inputFinalState) {
        Object theResult = visitorMap.get(inputFinalState);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("FinalStateImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputFinalState, inputFinalState);
            behavior.visitFinalState(inputFinalState);
        }
        return null;
    }

    @objid ("b21065c9-9087-4858-8481-31ab4b820b0f")
    @Override
    public Object caseFlowFinalNode(org.eclipse.uml2.uml.FlowFinalNode inputFlowFinalNode) {
        Object theResult = visitorMap.get(inputFlowFinalNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("FlowFinalNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputFlowFinalNode, inputFlowFinalNode);
            behavior.visitFlowFinalNode(inputFlowFinalNode);
        }
        return null;
    }

    @objid ("7e1704dc-ce27-4dd1-9303-39be841fedfb")
    @Override
    public Object caseForkNode(org.eclipse.uml2.uml.ForkNode inputForkNode) {
        Object theResult = visitorMap.get(inputForkNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ForkNodeImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputForkNode, inputForkNode);
            behavior.visitForkNode(inputForkNode);
        }
        return null;
    }

    @objid ("9fcaba33-9c57-4edd-bdfa-e71c509083b3")
    @Override
    public Object caseFunctionBehavior(org.eclipse.uml2.uml.FunctionBehavior inputFunctionBehavior) {
        Object theResult = visitorMap.get(inputFunctionBehavior);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("FunctionBehaviorImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputFunctionBehavior, inputFunctionBehavior);
            behavior.visitFunctionBehavior(inputFunctionBehavior);
        }
        return null;
    }

    @objid ("84982b8b-cb97-4fc2-a85a-56f9343ecfe4")
    @Override
    public Object caseGate(org.eclipse.uml2.uml.Gate inputGate) {
        Object theResult = visitorMap.get(inputGate);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("GateImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputGate, inputGate);
            behavior.visitGate(inputGate);
        }
        return null;
    }

    @objid ("19e575e1-3a12-487f-a627-3719b2953d53")
    @Override
    public Object caseGeneralization(org.eclipse.uml2.uml.Generalization inputGeneralization) {
        Object theResult = visitorMap.get(inputGeneralization);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("GeneralizationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputGeneralization, inputGeneralization);
            behavior.visitGeneralization(inputGeneralization);
        }
        return null;
    }

    @objid ("15a9a038-02d0-41bf-8cda-3255f739dd2b")
    @Override
    public Object caseGeneralizationSet(org.eclipse.uml2.uml.GeneralizationSet inputGeneralizationSet) {
        Object theResult = visitorMap.get(inputGeneralizationSet);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("GeneralizationSetImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputGeneralizationSet, inputGeneralizationSet);
            behavior.visitGeneralizationSet(inputGeneralizationSet);
        }
        return null;
    }

    @objid ("096461e2-ded5-4f05-bdff-b052468b86f7")
    @Override
    public Object caseGeneralOrdering(org.eclipse.uml2.uml.GeneralOrdering inputGeneralOrdering) {
        Object theResult = visitorMap.get(inputGeneralOrdering);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("GeneralOrderingImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputGeneralOrdering, inputGeneralOrdering);
            behavior.visitGeneralOrdering(inputGeneralOrdering);
        }
        return null;
    }

    @objid ("5da16dcb-be5b-4eec-ab13-c0751cd4df71")
    @Override
    public Object caseImage(org.eclipse.uml2.uml.Image inputImage) {
        Object theResult = visitorMap.get(inputImage);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ImageImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputImage, inputImage);
            behavior.visitImage(inputImage);
        }
        return null;
    }

    @objid ("e291580f-46ec-44ed-adb9-666079889e61")
    @Override
    public Object caseInclude(org.eclipse.uml2.uml.Include inputInclude) {
        Object theResult = visitorMap.get(inputInclude);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("IncludeImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputInclude, inputInclude);
            behavior.visitInclude(inputInclude);
        }
        return null;
    }

    @objid ("42712be8-369e-4807-b43d-e863d0a4b96b")
    @Override
    public Object caseInformationFlow(org.eclipse.uml2.uml.InformationFlow inputInformationFlow) {
        Object theResult = visitorMap.get(inputInformationFlow);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InformationFlowImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputInformationFlow, inputInformationFlow);
            behavior.visitInformationFlow(inputInformationFlow);
        }
        return null;
    }

    @objid ("e3b15733-0cd2-4960-bb01-f8a0d8d767ae")
    @Override
    public Object caseInformationItem(org.eclipse.uml2.uml.InformationItem inputInformationItem) {
        Object theResult = visitorMap.get(inputInformationItem);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InformationItemImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputInformationItem, inputInformationItem);
            behavior.visitInformationItem(inputInformationItem);
        }
        return null;
    }

    @objid ("1a2fc0f1-4217-42eb-bd99-f6b255c639df")
    @Override
    public Object caseInitialNode(org.eclipse.uml2.uml.InitialNode inputInitialNode) {
        Object theResult = visitorMap.get(inputInitialNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InitialNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputInitialNode, inputInitialNode);
            behavior.visitInitialNode(inputInitialNode);
        }
        return null;
    }

    @objid ("2be5883e-df90-45b7-be4c-3216bd4059f5")
    @Override
    public Object caseInputPin(org.eclipse.uml2.uml.InputPin inputInputPin) {
        Object theResult = visitorMap.get(inputInputPin);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InputPinImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputInputPin, inputInputPin);
            behavior.visitInputPin(inputInputPin);
        }
        return null;
    }

    @objid ("c7504cfa-112e-45f5-a5b7-6cb40a93dac8")
    @Override
    public Object caseInstanceSpecification(InstanceSpecification inputInstanceSpecification) {
        Object theResult = visitorMap.get(inputInstanceSpecification);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InstanceSpecificationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputInstanceSpecification,
                    inputInstanceSpecification);
            behavior.visitInstanceSpecification(inputInstanceSpecification);
            for (Object slot : inputInstanceSpecification.getSlots()) {
                this.doSwitch((EObject) slot);
            }
            this.doSwitch((EObject) inputInstanceSpecification
                    .getSpecification());
        }
        return null;
    }

    @objid ("a2fa9c75-7ba1-4574-ba7c-afe9881eba08")
    @Override
    public Object caseInstanceValue(InstanceValue inputInstanceValue) {
        Object theResult = visitorMap.get(inputInstanceValue);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InstanceValueImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputInstanceValue, inputInstanceValue);
            behavior.visitInstanceValue(inputInstanceValue);
        }
        return null;
    }

    @objid ("fc3b8471-3f16-4912-9c5d-3fe8c8a4060e")
    @Override
    public Object caseInteraction(org.eclipse.uml2.uml.Interaction inputInteraction) {
        Object theResult = visitorMap.get(inputInteraction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        int currentMarging = 100;
        final int space = 70;
        if (theResult == null
                || !("InteractionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputInteraction, inputInteraction);
            behavior.visitInteraction(inputInteraction);
            for (Object lifeline : inputInteraction.getLifelines()) {
                this.doSwitch((EObject) lifeline);
            }
            for (Object message : inputInteraction.getMessages()) {
                this.doSwitch((EObject) message);
            }
        
            for (org.eclipse.uml2.uml.Gate formalGate : inputInteraction.getFormalGates()) {
                this.doSwitch((EObject) formalGate);
                Object temp = ReverseProperties.getInstance().getMappedElement(formalGate);
                if (temp instanceof Gate){
                    ((Gate) temp).setLineNumber(currentMarging);
                    currentMarging += space;
                }
        
            }
        
            for (org.eclipse.uml2.uml.InteractionFragment fragment : inputInteraction.getFragments()) {
                Object temp = ReverseProperties.getInstance().getMappedElement(fragment);
                if (temp instanceof InteractionFragment){
                    ((InteractionFragment) temp).setLineNumber(currentMarging);
                    currentMarging += space;
                }
        
                this.doSwitch((EObject) fragment);
        
                if (temp instanceof InteractionUse){
                    ((InteractionUse) temp).setEndLineNumber(currentMarging);
                    currentMarging += space;
                }else if (temp instanceof InteractionOperand){
                    ((InteractionOperand) temp).setEndLineNumber(currentMarging);
                    currentMarging += space;
                }else if (temp instanceof StateInvariant){
                    ((StateInvariant) temp).setEndLineNumber(currentMarging);
                    currentMarging += space;
                }
            }
        
            for (Object action : inputInteraction.getActions()) {
                this.doSwitch((EObject) action);
            }
        
        }
        return null;
    }

    @objid ("ac562f2f-31f4-46f9-a47f-d3dcd96d1d15")
    @Override
    public Object caseInteractionConstraint(org.eclipse.uml2.uml.InteractionConstraint inputInteractionConstraint) {
        Object theResult = visitorMap.get(inputInteractionConstraint);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InteractionConstraintImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputInteractionConstraint,
                    inputInteractionConstraint);
            behavior.visitInteractionConstraint(inputInteractionConstraint);
            this.doSwitch((EObject) inputInteractionConstraint.getMinint());
            this.doSwitch((EObject) inputInteractionConstraint.getMaxint());
        }
        return null;
    }

    @objid ("b506a490-e72b-4a64-87b4-e5b81f3db81d")
    @Override
    public Object caseInteractionFragment(org.eclipse.uml2.uml.InteractionFragment inputInteractionFragment) {
        for (Object generalOrdering : inputInteractionFragment
                .getGeneralOrderings()) {
            this.doSwitch((EObject) generalOrdering);
        }
        return null;
    }

    @objid ("9ef4ecad-4b18-46e2-838d-5a134b79fe02")
    @Override
    public Object caseInteractionOperand(org.eclipse.uml2.uml.InteractionOperand inputInteractionOperand) {
        Object theResult = visitorMap.get(inputInteractionOperand);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InteractionOperandImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputInteractionOperand, inputInteractionOperand);
            behavior.visitInteractionOperand(inputInteractionOperand);
            this.doSwitch((EObject) inputInteractionOperand.getGuard());
            for (Object fragment : inputInteractionOperand.getFragments()) {
                this.doSwitch((EObject) fragment);
            }
        
        
        }
        return null;
    }

    @objid ("9cd6b4b5-76bb-4d4b-9377-71ea05c0c63a")
    @Override
    public Object caseInteractionUse(org.eclipse.uml2.uml.InteractionUse inputInteractionUse) {
        Object theResult = visitorMap.get(inputInteractionUse);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InteractionUseImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputInteractionUse, inputInteractionUse);
            behavior.visitInteractionUse(inputInteractionUse);
            for (Object actualGate : inputInteractionUse.getActualGates()) {
                this.doSwitch((EObject) actualGate);
            }
            for (Object argument : inputInteractionUse.getArguments()) {
                this.doSwitch((EObject) argument);
            }
        }
        return null;
    }

    @objid ("ea28ea21-aa11-4aca-a004-eb63e332bf66")
    @Override
    public Object caseInterface(org.eclipse.uml2.uml.Interface inputInterface) {
        Object theResult = visitorMap.get(inputInterface);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InterfaceImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputInterface, inputInterface);
            behavior.visitInterface(inputInterface);
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
            for (Object ownedReception : inputInterface.getOwnedReceptions()) {
                this.doSwitch((EObject) ownedReception);
            }
            this.doSwitch((EObject) inputInterface.getProtocol());
        }
        return null;
    }

    @objid ("ef1c006a-9165-4570-bb01-a05b2333c9e8")
    @Override
    public Object caseInterfaceRealization(org.eclipse.uml2.uml.InterfaceRealization inputInterfaceRealization) {
        Object theResult = visitorMap.get(inputInterfaceRealization);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InterfaceRealizationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap
            .put(inputInterfaceRealization, inputInterfaceRealization);
            behavior.visitInterfaceRealization(inputInterfaceRealization);
        }
        return null;
    }

    @objid ("fa4127c0-054c-4ab1-a0e6-94293f3a0e1d")
    @Override
    public Object caseInterruptibleActivityRegion(org.eclipse.uml2.uml.InterruptibleActivityRegion inputInterruptibleActivityRegion) {
        Object theResult = visitorMap.get(inputInterruptibleActivityRegion);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("InterruptibleActivityRegionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputInterruptibleActivityRegion,
                    inputInterruptibleActivityRegion);
            behavior
            .visitInterruptibleActivityRegion(inputInterruptibleActivityRegion);
        }
        return null;
    }

    @objid ("69bec4bb-d208-45e5-8da1-24cdd4a3509b")
    @Override
    public Object caseInterval(org.eclipse.uml2.uml.Interval inputInterval) {
        Object theResult = visitorMap.get(inputInterval);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("IntervalImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputInterval, inputInterval);
            behavior.visitInterval(inputInterval);
        }
        return null;
    }

    @objid ("4545e0d8-f55a-4c9e-80e2-602154764448")
    @Override
    public Object caseIntervalConstraint(org.eclipse.uml2.uml.IntervalConstraint inputIntervalConstraint) {
        Object theResult = visitorMap.get(inputIntervalConstraint);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("IntervalConstraintImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputIntervalConstraint, inputIntervalConstraint);
            behavior.visitIntervalConstraint(inputIntervalConstraint);
            this.doSwitch((EObject) inputIntervalConstraint.getSpecification());
        }
        return null;
    }

    @objid ("2de3a0b2-912d-44ef-bf81-a39f2adbd0af")
    @Override
    public Object caseInvocationAction(org.eclipse.uml2.uml.InvocationAction inputInvocationAction) {
        for (Object argument : inputInvocationAction.getArguments()) {
            this.doSwitch((EObject) argument);
        }
        return null;
    }

    @objid ("ee0072c5-8aca-4ecd-ad7a-2a488093e0c3")
    @Override
    public Object caseJoinNode(org.eclipse.uml2.uml.JoinNode inputJoinNode) {
        Object theResult = visitorMap.get(inputJoinNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("JoinNodeImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputJoinNode, inputJoinNode);
            behavior.visitJoinNode(inputJoinNode);
            this.doSwitch((EObject) inputJoinNode.getJoinSpec());
        }
        return null;
    }

    @objid ("67a990cf-1ba7-418e-9776-a14f715b9366")
    @Override
    public Object caseLifeline(org.eclipse.uml2.uml.Lifeline inputLifeline) {
        Object theResult = visitorMap.get(inputLifeline);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LifelineImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputLifeline, inputLifeline);
            behavior.visitLifeline(inputLifeline);
            this.doSwitch((EObject) inputLifeline.getSelector());
        }
        return null;
    }

    @objid ("0c8032ab-958b-4eed-8c46-e257b8b1effc")
    @Override
    public Object caseLinkAction(org.eclipse.uml2.uml.LinkAction inputLinkAction) {
        for (Object endData : inputLinkAction.getEndData()) {
            this.doSwitch((EObject) endData);
        }
        for (Object inputValue : inputLinkAction.getInputValues()) {
            this.doSwitch((EObject) inputValue);
        }
        return null;
    }

    @objid ("960f6d40-2d6f-4e58-8e8d-42ceeaf24613")
    @Override
    public Object caseLinkEndCreationData(org.eclipse.uml2.uml.LinkEndCreationData inputLinkEndCreationData) {
        Object theResult = visitorMap.get(inputLinkEndCreationData);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LinkEndCreationDataImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputLinkEndCreationData, inputLinkEndCreationData);
            behavior.visitLinkEndCreationData(inputLinkEndCreationData);
        }
        return null;
    }

    @objid ("b1798235-bc9d-4c5c-8e70-7858d9464e32")
    @Override
    public Object caseLinkEndData(org.eclipse.uml2.uml.LinkEndData inputLinkEndData) {
        Object theResult = visitorMap.get(inputLinkEndData);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LinkEndDataImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputLinkEndData, inputLinkEndData);
            behavior.visitLinkEndData(inputLinkEndData);
            for (Object qualifier : inputLinkEndData.getQualifiers()) {
                this.doSwitch((EObject) qualifier);
            }
        }
        return null;
    }

    @objid ("287bca2d-5a4c-460a-acd6-d50c9c80ea36")
    @Override
    public Object caseLinkEndDestructionData(org.eclipse.uml2.uml.LinkEndDestructionData inputLinkEndDestructionData) {
        Object theResult = visitorMap.get(inputLinkEndDestructionData);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LinkEndDestructionDataImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputLinkEndDestructionData,
                    inputLinkEndDestructionData);
            behavior.visitLinkEndDestructionData(inputLinkEndDestructionData);
        }
        return null;
    }

    @objid ("f0acbda2-8fa1-489e-9656-49128fbe7522")
    @Override
    public Object caseLiteralBoolean(org.eclipse.uml2.uml.LiteralBoolean inputLiteralBoolean) {
        Object theResult = visitorMap.get(inputLiteralBoolean);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LiteralBooleanImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputLiteralBoolean, inputLiteralBoolean);
            behavior.visitLiteralBoolean(inputLiteralBoolean);
        }
        return null;
    }

    @objid ("e1856304-7c79-4917-b538-fcc7dcdea630")
    @Override
    public Object caseLiteralInteger(org.eclipse.uml2.uml.LiteralInteger inputLiteralInteger) {
        Object theResult = visitorMap.get(inputLiteralInteger);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LiteralIntegerImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputLiteralInteger, inputLiteralInteger);
            behavior.visitLiteralInteger(inputLiteralInteger);
        }
        return null;
    }

    @objid ("897072f2-c6a8-4052-8233-004ec5f0317d")
    @Override
    public Object caseLiteralNull(org.eclipse.uml2.uml.LiteralNull inputLiteralNull) {
        Object theResult = visitorMap.get(inputLiteralNull);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LiteralNullImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputLiteralNull, inputLiteralNull);
            behavior.visitLiteralNull(inputLiteralNull);
        }
        return null;
    }

    @objid ("f44703d0-3e98-408a-9824-04a0bcf0239d")
    @Override
    public Object caseLiteralSpecification(org.eclipse.uml2.uml.LiteralSpecification inputLiteralSpecification) {
        return null;
    }

    @objid ("95e730bd-c0c8-43f8-90ce-c069d69b231b")
    @Override
    public Object caseLiteralString(org.eclipse.uml2.uml.LiteralString inputLiteralString) {
        Object theResult = visitorMap.get(inputLiteralString);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LiteralStringImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputLiteralString, inputLiteralString);
            behavior.visitLiteralString(inputLiteralString);
        }
        return null;
    }

    @objid ("045883f7-e87b-4757-a4c0-51fcdf6f8e91")
    @Override
    public Object caseLiteralUnlimitedNatural(org.eclipse.uml2.uml.LiteralUnlimitedNatural inputLiteralUnlimitedNatural) {
        Object theResult = visitorMap.get(inputLiteralUnlimitedNatural);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LiteralUnlimitedNaturalImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputLiteralUnlimitedNatural,
                    inputLiteralUnlimitedNatural);
            behavior.visitLiteralUnlimitedNatural(inputLiteralUnlimitedNatural);
        }
        return null;
    }

    @objid ("a908d807-8f19-4753-830d-9af7e3083cb1")
    @Override
    public Object caseLoopNode(org.eclipse.uml2.uml.LoopNode inputLoopNode) {
        Object theResult = visitorMap.get(inputLoopNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("LoopNodeImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputLoopNode, inputLoopNode);
            behavior.visitLoopNode(inputLoopNode);
            for (Object result : inputLoopNode.getResults()) {
                this.doSwitch((EObject) result);
            }
            for (Object loopVariableInput : inputLoopNode
                    .getLoopVariableInputs()) {
                this.doSwitch((EObject) loopVariableInput);
            }
        }
        return null;
    }

    @objid ("e9e4534f-a221-43ef-a77a-8ce0c9043f2f")
    @Override
    public Object caseManifestation(org.eclipse.uml2.uml.Manifestation inputManifestation) {
        Object theResult = visitorMap.get(inputManifestation);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ManifestationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputManifestation, inputManifestation);
            behavior.visitManifestation(inputManifestation);
        }
        return null;
    }

    @objid ("2fb29d84-3ae6-4299-a82b-c20e27601714")
    @Override
    public Object caseMergeNode(org.eclipse.uml2.uml.MergeNode inputMergeNode) {
        Object theResult = visitorMap.get(inputMergeNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("MergeNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputMergeNode, inputMergeNode);
            behavior.visitMergeNode(inputMergeNode);
        }
        return null;
    }

    @objid ("86b4c55d-e4ed-4a40-8deb-8e697820d040")
    @Override
    public Object caseMessage(org.eclipse.uml2.uml.Message inputMessage) {
        Object theResult = visitorMap.get(inputMessage);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("MessageImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputMessage, inputMessage);
            behavior.visitMessage(inputMessage);
            for (Object argument : inputMessage.getArguments()) {
                this.doSwitch((EObject) argument);
            }
        }
        return null;
    }

    @objid ("84bd8b01-df55-4975-89a5-973146e63a0f")
    @Override
    public Object caseMessageEnd(org.eclipse.uml2.uml.MessageEnd inputMessageEnd) {
        return null;
    }

    @objid ("4329f04f-674b-40a1-85cb-ceb111137646")
    @Override
    public Object caseMessageEvent(org.eclipse.uml2.uml.MessageEvent inputMessageEvent) {
        return null;
    }

    @objid ("33496b27-6e16-4bfd-8923-d99d61eae114")
    @Override
    public Object caseMessageOccurrenceSpecification(org.eclipse.uml2.uml.MessageOccurrenceSpecification inputMessageOccurrenceSpecification) {
        Object theResult = visitorMap.get(inputMessageOccurrenceSpecification);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("MessageOccurrenceSpecificationImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputMessageOccurrenceSpecification,
                    inputMessageOccurrenceSpecification);
            behavior
            .visitMessageOccurrenceSpecification(inputMessageOccurrenceSpecification);
        }
        return null;
    }

    @objid ("d3a30932-1ba9-440b-bccf-13aad073bc6f")
    @Override
    public Object caseModel(org.eclipse.uml2.uml.Model inputModel) {
        Object theResult = visitorMap.get(inputModel);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ModelImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputModel, inputModel);
            behavior.visitModel(inputModel);
        }
        return null;
    }

    @objid ("c6435716-82ad-4d55-b098-812274d7ed5d")
    @Override
    public Object caseMultiplicityElement(org.eclipse.uml2.uml.MultiplicityElement inputMultiplicityElement) {
        this.doSwitch((EObject) inputMultiplicityElement.getUpperValue());
        this.doSwitch((EObject) inputMultiplicityElement.getLowerValue());
        return null;
    }

    @objid ("d354e9e8-396d-436d-8a31-c92ae08f8d80")
    @Override
    public Object caseNamedElement(org.eclipse.uml2.uml.NamedElement inputNamedElement) {
        this.doSwitch((EObject) inputNamedElement.getNameExpression());
        return null;
    }

    @objid ("f5e1677b-de6c-4284-88b5-89e4b9e6200f")
    @Override
    public Object caseNamespace(org.eclipse.uml2.uml.Namespace inputNamespace) {
        for (Object elementImport : inputNamespace.getElementImports()) {
            this.doSwitch((EObject) elementImport);
        }
        for (Object packageImport : inputNamespace.getPackageImports()) {
            this.doSwitch((EObject) packageImport);
        }
        for (Object ownedRule : inputNamespace.getOwnedRules()) {
            this.doSwitch((EObject) ownedRule);
        }
        for (Object ownedMember : inputNamespace.getOwnedMembers()) {
            this.doSwitch((EObject) ownedMember);
        }
        return null;
    }

    @objid ("d08ebd19-3339-47d7-a9a5-823f6621fff0")
    @Override
    public Object caseNode(org.eclipse.uml2.uml.Node inputNode) {
        Object theResult = visitorMap.get(inputNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("NodeImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputNode, inputNode);
            behavior.visitNode(inputNode);
            for (Object nestedNode : inputNode.getNestedNodes()) {
                this.doSwitch((EObject) nestedNode);
            }
        }
        return null;
    }

    @objid ("7afc3ec4-f7e7-4929-a9aa-c5dfd193fe9d")
    @Override
    public Object caseObjectFlow(ObjectFlow inputObjectFlow) {
        Object theResult = visitorMap.get(inputObjectFlow);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ObjectFlowImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputObjectFlow, inputObjectFlow);
            behavior.visitObjectFlow(inputObjectFlow);
        }
        return null;
    }

    @objid ("0f307b19-e9c3-48cf-9c7a-d8b34bfc6fce")
    @Override
    public Object caseObjectNode(ObjectNode inputObjectNode) {
        this.doSwitch((EObject) inputObjectNode.getUpperBound());
        return null;
    }

    @objid ("8b1bdeb2-7ac8-49a8-b5d7-20abce706b2f")
    @Override
    public Object caseObservation(final Observation inputIservation) {
        return null;
    }

    @objid ("4b4f7ed0-6854-4e4b-9ae2-818e0fa6fca0")
    @Override
    public Object caseOccurrenceSpecification(org.eclipse.uml2.uml.OccurrenceSpecification inputOccurrenceSpecification) {
        Object theResult = visitorMap.get(inputOccurrenceSpecification);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("OccurrenceSpecificationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputOccurrenceSpecification,
                    inputOccurrenceSpecification);
            behavior.visitOccurrenceSpecification(inputOccurrenceSpecification);
        }
        return null;
    }

    @objid ("6766a3c4-78bc-45a8-8514-e54d21d571f1")
    @Override
    public Object caseOpaqueAction(org.eclipse.uml2.uml.OpaqueAction inputOpaqueAction) {
        Object theResult = visitorMap.get(inputOpaqueAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("OpaqueActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputOpaqueAction, inputOpaqueAction);
            behavior.visitOpaqueAction(inputOpaqueAction);
        
            for (Object inputValue : inputOpaqueAction.getInputValues()) {
                this.doSwitch((EObject) inputValue);
            }
            for (Object outputValue : inputOpaqueAction.getOutputValues()) {
                this.doSwitch((EObject) outputValue);
            }
        }
        return null;
    }

    @objid ("bd896445-3f24-4fa8-a437-774fd0d7e984")
    @Override
    public Object caseOpaqueBehavior(org.eclipse.uml2.uml.OpaqueBehavior inputOpaqueBehavior) {
        Object theResult = visitorMap.get(inputOpaqueBehavior);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("OpaqueBehaviorImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputOpaqueBehavior, inputOpaqueBehavior);
            behavior.visitOpaqueBehavior(inputOpaqueBehavior);
        }
        return null;
    }

    @objid ("ee80f362-9a17-4340-b4fb-8cb2c506f340")
    @Override
    public Object caseOpaqueExpression(org.eclipse.uml2.uml.OpaqueExpression inputOpaqueExpression) {
        Object theResult = visitorMap.get(inputOpaqueExpression);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("OpaqueExpressionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputOpaqueExpression, inputOpaqueExpression);
            behavior.visitOpaqueExpression(inputOpaqueExpression);
        }
        return null;
    }

    @objid ("9b72c8a7-2341-4f01-8d50-547f40db032f")
    @Override
    public Object caseOperation(org.eclipse.uml2.uml.Operation inputOperation) {
        Object theResult = visitorMap.get(inputOperation);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("OperationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputOperation, inputOperation);
            behavior.visitOperation(inputOperation);
            for (Object precondition : inputOperation.getPreconditions()) {
                this.doSwitch((EObject) precondition);
            }
            for (Object postcondition : inputOperation.getPostconditions()) {
                this.doSwitch((EObject) postcondition);
            }
            this.doSwitch((EObject) inputOperation.getBodyCondition());
            for (Object ownedParameter : inputOperation.getOwnedParameters()) {
                this.doSwitch((EObject) ownedParameter);
            }
        }
        return null;
    }

    @objid ("ea2c61e9-e67f-4eee-b75e-15015698e0db")
    @Override
    public Object caseOperationTemplateParameter(org.eclipse.uml2.uml.OperationTemplateParameter inputOperationTemplateParameter) {
        Object theResult = visitorMap.get(inputOperationTemplateParameter);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("OperationTemplateParameterImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputOperationTemplateParameter,
                    inputOperationTemplateParameter);
            behavior
            .visitOperationTemplateParameter(inputOperationTemplateParameter);
        }
        return null;
    }

    @objid ("6ec9d1b9-e655-4b33-b083-2823f00aedd8")
    @Override
    public Object caseOutputPin(org.eclipse.uml2.uml.OutputPin inputOutputPin) {
        Object theResult = visitorMap.get(inputOutputPin);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("OutputPinImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputOutputPin, inputOutputPin);
            behavior.visitOutputPin(inputOutputPin);
        }
        return null;
    }

    @objid ("b35497f2-06c2-4da8-8774-7c6e1ea00a9f")
    @Override
    public Object casePackage(org.eclipse.uml2.uml.Package inputPackage) {
        Object theResult = visitorMap.get(inputPackage);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PackageImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputPackage, inputPackage);
            // [CVI]: ignore visit of relations defined at "Package" level for
            // an element of type "Model"
            if (inputPackage instanceof org.eclipse.uml2.uml.Model)
                return null;
        
            behavior.visitPackage(inputPackage);
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
            for (Object profileApplication : inputPackage
                    .getProfileApplications()) {
                this.doSwitch((EObject) profileApplication);
            }
        }
        return null;
    }

    @objid ("24718b5d-b72e-4848-b006-03233018b4d6")
    @Override
    public Object casePackageableElement(org.eclipse.uml2.uml.PackageableElement inputPackageableElement) {
        return null;
    }

    @objid ("073a1846-1522-45c0-aa23-b6dc686b8115")
    @Override
    public Object casePackageImport(org.eclipse.uml2.uml.PackageImport inputPackageImport) {
        Object theResult = visitorMap.get(inputPackageImport);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PackageImportImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputPackageImport, inputPackageImport);
            behavior.visitPackageImport(inputPackageImport);
        }
        return null;
    }

    @objid ("e5b274e9-91d7-4470-9844-6bc4091ea326")
    @Override
    public Object casePackageMerge(org.eclipse.uml2.uml.PackageMerge inputPackageMerge) {
        Object theResult = visitorMap.get(inputPackageMerge);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PackageMergeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputPackageMerge, inputPackageMerge);
            behavior.visitPackageMerge(inputPackageMerge);
        }
        return null;
    }

    @objid ("c0c7e45e-a059-4bcb-93f5-5e53a9530e14")
    @Override
    public Object caseParameter(org.eclipse.uml2.uml.Parameter inputParameter) {
        Object theResult = visitorMap.get(inputParameter);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ParameterImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputParameter, inputParameter);
            behavior.visitParameter(inputParameter);
            this.doSwitch((EObject) inputParameter.getDefaultValue());
        }
        return null;
    }

    @objid ("80275f73-273a-4ecc-902c-738f43d4f93f")
    @Override
    public Object caseParameterableElement(org.eclipse.uml2.uml.ParameterableElement inputParameterableElement) {
        return null;
    }

    @objid ("29b3e34c-229f-4990-b64c-52e2203ebf22")
    @Override
    public Object caseParameterSet(org.eclipse.uml2.uml.ParameterSet inputParameterSet) {
        Object theResult = visitorMap.get(inputParameterSet);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ParameterSetImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputParameterSet, inputParameterSet);
            behavior.visitParameterSet(inputParameterSet);
            for (Object condition : inputParameterSet.getConditions()) {
                this.doSwitch((EObject) condition);
            }
        }
        return null;
    }

    @objid ("4902fce2-ff9c-4123-9dac-ff05ffc91837")
    @Override
    public Object casePartDecomposition(org.eclipse.uml2.uml.PartDecomposition inputPartDecomposition) {
        Object theResult = visitorMap.get(inputPartDecomposition);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PartDecompositionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputPartDecomposition, inputPartDecomposition);
            behavior.visitPartDecomposition(inputPartDecomposition);
        }
        return null;
    }

    @objid ("ff897010-ec26-4584-b52e-2b63ede6ac03")
    @Override
    public Object casePin(org.eclipse.uml2.uml.Pin inputPin) {
        Object theResult = visitorMap.get(inputPin);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PinImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputPin, inputPin);
            behavior.visitPin(inputPin);
        }
        return null;
    }

    @objid ("366f8ee3-37e3-4dd0-ba4a-ac3f41b65517")
    @Override
    public Object casePort(org.eclipse.uml2.uml.Port inputPort) {
        Object theResult = visitorMap.get(inputPort);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PortImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputPort, inputPort);
            behavior.visitPort(inputPort);
        }
        return null;
    }

    @objid ("b671cd3b-de97-4115-8749-748cc0b103e3")
    @Override
    public Object casePrimitiveType(org.eclipse.uml2.uml.PrimitiveType inputPrimitiveType) {
        Object theResult = visitorMap.get(inputPrimitiveType);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PrimitiveTypeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputPrimitiveType, inputPrimitiveType);
            behavior.visitPrimitiveType(inputPrimitiveType);
        
            for (Object ownedTemplateBinding : inputPrimitiveType.getTemplateBindings()) {
                this.doSwitch((EObject) ownedTemplateBinding);
            }
        }
        return null;
    }

    @objid ("3b68f7b9-bb15-4f38-991c-0d872fee2c36")
    @Override
    public Object caseProfile(org.eclipse.uml2.uml.Profile inputProfile) {
        Object theResult = visitorMap.get(inputProfile);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ProfileImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputProfile, inputProfile);
            behavior.visitProfile(inputProfile);
            for (Object ownedStereotype : inputProfile.getOwnedStereotypes()) {
                this.doSwitch((EObject) ownedStereotype);
            }
        
            //                    for (Object metaclassReference : inputProfile
            //                            .getMetaclassReferences()) {
            //                        this.doSwitch((EObject) metaclassReference);
            //                    }
            //                    for (Object metamodelReference : inputProfile
            //                            .getMetamodelReferences()) {
            //                        this.doSwitch((EObject) metamodelReference);
            //                    }
        }
        return null;
    }

    @objid ("b1e8055a-6395-4beb-98e1-0861700e055a")
    @Override
    public Object caseProfileApplication(org.eclipse.uml2.uml.ProfileApplication inputProfileApplication) {
        Object theResult = visitorMap.get(inputProfileApplication);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ProfileApplicationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputProfileApplication, inputProfileApplication);
            behavior.visitProfileApplication(inputProfileApplication);
            try{
                this.doSwitch( inputProfileApplication.getAppliedProfile());
            }catch(Exception e ){
                Xmi.LOG.error(Xmi.PLUGIN_ID, e);
            }
        
        }
        return null;
    }

    @objid ("299b8218-9208-47ed-b572-2d1a691189cc")
    @Override
    public Object caseProperty(Property inputProperty) {
        Object theResult = visitorMap.get(inputProperty);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PropertyImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputProperty, inputProperty);
            behavior.visitProperty(inputProperty);
            this.doSwitch((EObject) inputProperty.getDefaultValue());
            for (Object qualifier : inputProperty.getQualifiers()) {
                this.doSwitch((EObject) qualifier);
            }
        }
        return null;
    }

    @objid ("4a1fa45f-272b-46f0-8e03-12bbee7c0cee")
    @Override
    public Object caseProtocolConformance(org.eclipse.uml2.uml.ProtocolConformance inputProtocolConformance) {
        Object theResult = visitorMap.get(inputProtocolConformance);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ProtocolConformanceImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputProtocolConformance, inputProtocolConformance);
            behavior.visitProtocolConformance(inputProtocolConformance);
        }
        return null;
    }

    @objid ("636179f0-2b8f-414a-99c2-1899ce099e6d")
    @Override
    public Object caseProtocolStateMachine(org.eclipse.uml2.uml.ProtocolStateMachine inputProtocolStateMachine) {
        Object theResult = visitorMap.get(inputProtocolStateMachine);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ProtocolStateMachineImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap
            .put(inputProtocolStateMachine, inputProtocolStateMachine);
            behavior.visitProtocolStateMachine(inputProtocolStateMachine);
            for (Object conformance : inputProtocolStateMachine
                    .getConformances()) {
                this.doSwitch((EObject) conformance);
            }
        }
        return null;
    }

    @objid ("d3c86c41-1fd8-40ab-b634-2f880a965be3")
    @Override
    public Object caseProtocolTransition(org.eclipse.uml2.uml.ProtocolTransition inputProtocolTransition) {
        Object theResult = visitorMap.get(inputProtocolTransition);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ProtocolTransitionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputProtocolTransition, inputProtocolTransition);
            behavior.visitProtocolTransition(inputProtocolTransition);
            this.doSwitch((EObject) inputProtocolTransition.getPostCondition());
            this.doSwitch((EObject) inputProtocolTransition.getPreCondition());
        }
        return null;
    }

    @objid ("0eb1b2ab-e02f-445c-a21c-6728ae0d817d")
    @Override
    public Object casePseudostate(org.eclipse.uml2.uml.Pseudostate inputPseudostate) {
        Object theResult = visitorMap.get(inputPseudostate);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("PseudostateImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputPseudostate, inputPseudostate);
            behavior.visitPseudostate(inputPseudostate);
        }
        return null;
    }

    @objid ("a001ee0d-a00d-49fa-9181-5f805fac742c")
    @Override
    public Object caseQualifierValue(org.eclipse.uml2.uml.QualifierValue inputQualifierValue) {
        Object theResult = visitorMap.get(inputQualifierValue);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("QualifierValueImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputQualifierValue, inputQualifierValue);
            behavior.visitQualifierValue(inputQualifierValue);
        }
        return null;
    }

    @objid ("ef47926b-95f2-4c2e-8411-7e47f0bb0c17")
    @Override
    public Object caseRaiseExceptionAction(org.eclipse.uml2.uml.RaiseExceptionAction inputRaiseExceptionAction) {
        Object theResult = visitorMap.get(inputRaiseExceptionAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("RaiseExceptionActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap
            .put(inputRaiseExceptionAction, inputRaiseExceptionAction);
            behavior.visitRaiseExceptionAction(inputRaiseExceptionAction);
            this.doSwitch((EObject) inputRaiseExceptionAction.getException());
        }
        return null;
    }

    @objid ("6afe2c04-8310-41d5-872d-4f9703d14f1c")
    @Override
    public Object caseReadExtentAction(org.eclipse.uml2.uml.ReadExtentAction inputReadExtentAction) {
        Object theResult = visitorMap.get(inputReadExtentAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadExtentActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputReadExtentAction, inputReadExtentAction);
            behavior.visitReadExtentAction(inputReadExtentAction);
            this.doSwitch((EObject) inputReadExtentAction.getResult());
        }
        return null;
    }

    @objid ("ec940ecc-ad5d-4590-995f-1290f0137697")
    @Override
    public Object caseReadIsClassifiedObjectAction(org.eclipse.uml2.uml.ReadIsClassifiedObjectAction inputReadIsClassifiedObjectAction) {
        Object theResult = visitorMap.get(inputReadIsClassifiedObjectAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadIsClassifiedObjectActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputReadIsClassifiedObjectAction,
                    inputReadIsClassifiedObjectAction);
            behavior
            .visitReadIsClassifiedObjectAction(inputReadIsClassifiedObjectAction);
            this.doSwitch((EObject) inputReadIsClassifiedObjectAction
                    .getResult());
            this.doSwitch((EObject) inputReadIsClassifiedObjectAction
                    .getObject());
        }
        return null;
    }

    @objid ("2e9256fc-441f-4ee8-9ea5-b3ef578f8a42")
    @Override
    public Object caseReadLinkAction(org.eclipse.uml2.uml.ReadLinkAction inputReadLinkAction) {
        Object theResult = visitorMap.get(inputReadLinkAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadLinkActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputReadLinkAction, inputReadLinkAction);
            behavior.visitReadLinkAction(inputReadLinkAction);
            this.doSwitch((EObject) inputReadLinkAction.getResult());
        }
        return null;
    }

    @objid ("e31fa33b-de68-4792-b5c3-f6b81019ba47")
    @Override
    public Object caseReadLinkObjectEndAction(org.eclipse.uml2.uml.ReadLinkObjectEndAction inputReadLinkObjectEndAction) {
        Object theResult = visitorMap.get(inputReadLinkObjectEndAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadLinkObjectEndActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputReadLinkObjectEndAction,
                    inputReadLinkObjectEndAction);
            behavior.visitReadLinkObjectEndAction(inputReadLinkObjectEndAction);
            this.doSwitch((EObject) inputReadLinkObjectEndAction.getObject());
            this.doSwitch((EObject) inputReadLinkObjectEndAction.getResult());
        }
        return null;
    }

    @objid ("2b556956-d346-46a1-bf94-94175c6f38df")
    @Override
    public Object caseReadLinkObjectEndQualifierAction(org.eclipse.uml2.uml.ReadLinkObjectEndQualifierAction inputReadLinkObjectEndQualifierAction) {
        Object theResult = visitorMap
                .get(inputReadLinkObjectEndQualifierAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadLinkObjectEndQualifierActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputReadLinkObjectEndQualifierAction,
                    inputReadLinkObjectEndQualifierAction);
            behavior
            .visitReadLinkObjectEndQualifierAction(inputReadLinkObjectEndQualifierAction);
            this.doSwitch((EObject) inputReadLinkObjectEndQualifierAction
                    .getObject());
            this.doSwitch((EObject) inputReadLinkObjectEndQualifierAction
                    .getResult());
        }
        return null;
    }

    @objid ("3f807ec1-f4fc-4eff-a69e-dffec05f04a2")
    @Override
    public Object caseReadSelfAction(org.eclipse.uml2.uml.ReadSelfAction inputReadSelfAction) {
        Object theResult = visitorMap.get(inputReadSelfAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadSelfActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputReadSelfAction, inputReadSelfAction);
            behavior.visitReadSelfAction(inputReadSelfAction);
            this.doSwitch((EObject) inputReadSelfAction.getResult());
        }
        return null;
    }

    @objid ("2d0090aa-fada-4e56-9b73-c06957cfdf61")
    @Override
    public Object caseReadStructuralFeatureAction(org.eclipse.uml2.uml.ReadStructuralFeatureAction inputReadStructuralFeatureAction) {
        Object theResult = visitorMap.get(inputReadStructuralFeatureAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadStructuralFeatureActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputReadStructuralFeatureAction,
                    inputReadStructuralFeatureAction);
            behavior
            .visitReadStructuralFeatureAction(inputReadStructuralFeatureAction);
            this.doSwitch((EObject) inputReadStructuralFeatureAction
                    .getResult());
        }
        return null;
    }

    @objid ("524ba8d9-33d3-4127-901f-e3c8488a3c1c")
    @Override
    public Object caseReadVariableAction(org.eclipse.uml2.uml.ReadVariableAction inputReadVariableAction) {
        Object theResult = visitorMap.get(inputReadVariableAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReadVariableActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputReadVariableAction, inputReadVariableAction);
            behavior.visitReadVariableAction(inputReadVariableAction);
            this.doSwitch((EObject) inputReadVariableAction.getResult());
        }
        return null;
    }

    @objid ("1fd0cdb9-1bd9-4b1d-a7fb-7ccd72577cc9")
    @Override
    public Object caseRealization(org.eclipse.uml2.uml.Realization inputRealization) {
        Object theResult = visitorMap.get(inputRealization);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("RealizationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputRealization, inputRealization);
            behavior.visitRealization(inputRealization);
        }
        return null;
    }

    @objid ("e6c8a0a0-0f04-45a3-ae0a-a22d41bc5ad2")
    @Override
    public Object caseReceiveOperationEvent(org.eclipse.uml2.uml.ReceiveOperationEvent inputReceiveOperationEvent) {
        Object theResult = visitorMap.get(inputReceiveOperationEvent);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReceiveOperationEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputReceiveOperationEvent,
                    inputReceiveOperationEvent);
            behavior.visitReceiveOperationEvent(inputReceiveOperationEvent);
        }
        return null;
    }

    @objid ("49c92e68-c2cf-425b-80bc-5bddf739aa10")
    @Override
    public Object caseReceiveSignalEvent(org.eclipse.uml2.uml.ReceiveSignalEvent inputReceiveSignalEvent) {
        Object theResult = visitorMap.get(inputReceiveSignalEvent);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReceiveSignalEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputReceiveSignalEvent, inputReceiveSignalEvent);
            behavior.visitReceiveSignalEvent(inputReceiveSignalEvent);
        }
        return null;
    }

    @objid ("44fcd601-2194-45b3-a098-a1a7b41c85b8")
    @Override
    public Object caseReception(org.eclipse.uml2.uml.Reception inputReception) {
        Object theResult = visitorMap.get(inputReception);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReceptionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputReception, inputReception);
            behavior.visitReception(inputReception);
        }
        return null;
    }

    @objid ("2c24fb67-b1a9-4b9a-8651-f7d26d9434be")
    @Override
    public Object caseReclassifyObjectAction(org.eclipse.uml2.uml.ReclassifyObjectAction inputReclassifyObjectAction) {
        Object theResult = visitorMap.get(inputReclassifyObjectAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReclassifyObjectActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputReclassifyObjectAction,
                    inputReclassifyObjectAction);
            behavior.visitReclassifyObjectAction(inputReclassifyObjectAction);
            this.doSwitch((EObject) inputReclassifyObjectAction.getObject());
        }
        return null;
    }

    @objid ("2cd8bd69-de07-4d2e-9527-7219b15441de")
    @Override
    public Object caseRedefinableElement(org.eclipse.uml2.uml.RedefinableElement inputRedefinableElement) {
        return null;
    }

    @objid ("8c637e54-584c-4b32-813a-4e5633c8371e")
    @Override
    public Object caseRedefinableTemplateSignature(org.eclipse.uml2.uml.RedefinableTemplateSignature inputRedefinableTemplateSignature) {
        Object theResult = visitorMap.get(inputRedefinableTemplateSignature);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("RedefinableTemplateSignatureImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputRedefinableTemplateSignature,
                    inputRedefinableTemplateSignature);
            behavior
            .visitRedefinableTemplateSignature(inputRedefinableTemplateSignature);
        }
        return null;
    }

    @objid ("5cc0ad85-e9f8-4b74-9372-3e8e250f4f78")
    @Override
    public Object caseReduceAction(org.eclipse.uml2.uml.ReduceAction inputReduceAction) {
        Object theResult = visitorMap.get(inputReduceAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReduceActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputReduceAction, inputReduceAction);
            behavior.visitReduceAction(inputReduceAction);
            this.doSwitch((EObject) inputReduceAction.getResult());
            this.doSwitch((EObject) inputReduceAction.getCollection());
        }
        return null;
    }

    @objid ("d55fca34-a71f-479e-b8ec-aeca03d5a8a7")
    @Override
    public Object caseRegion(org.eclipse.uml2.uml.Region inputRegion) {
        Object theResult = visitorMap.get(inputRegion);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("RegionImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputRegion, inputRegion);
            behavior.visitRegion(inputRegion);
            for (Object subvertex : inputRegion.getSubvertices()) {
                this.doSwitch((EObject) subvertex);
            }
            for (Object transition : inputRegion.getTransitions()) {
                this.doSwitch((EObject) transition);
            }
        }
        return null;
    }

    @objid ("b3c642aa-658e-4ab7-8af7-7ee1d743020f")
    @Override
    public Object caseRelationship(org.eclipse.uml2.uml.Relationship inputRelationship) {
        return null;
    }

    @objid ("e1156e6c-eea7-4c63-99a3-943468019af6")
    @Override
    public Object caseRemoveStructuralFeatureValueAction(org.eclipse.uml2.uml.RemoveStructuralFeatureValueAction inputRemoveStructuralFeatureValueAction) {
        Object theResult = visitorMap
                .get(inputRemoveStructuralFeatureValueAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("RemoveStructuralFeatureValueActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputRemoveStructuralFeatureValueAction,
                    inputRemoveStructuralFeatureValueAction);
            behavior
            .visitRemoveStructuralFeatureValueAction(inputRemoveStructuralFeatureValueAction);
            this.doSwitch((EObject) inputRemoveStructuralFeatureValueAction
                    .getRemoveAt());
        }
        return null;
    }

    @objid ("0650fb76-9711-4f8f-bf5c-79971fcd03a4")
    @Override
    public Object caseRemoveVariableValueAction(org.eclipse.uml2.uml.RemoveVariableValueAction inputRemoveVariableValueAction) {
        Object theResult = visitorMap.get(inputRemoveVariableValueAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("RemoveVariableValueActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputRemoveVariableValueAction,
                    inputRemoveVariableValueAction);
            behavior
            .visitRemoveVariableValueAction(inputRemoveVariableValueAction);
            this.doSwitch((EObject) inputRemoveVariableValueAction
                    .getRemoveAt());
        }
        return null;
    }

    @objid ("0d114447-0924-4f99-8094-666e32df2cd5")
    @Override
    public Object caseReplyAction(org.eclipse.uml2.uml.ReplyAction inputReplyAction) {
        Object theResult = visitorMap.get(inputReplyAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ReplyActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputReplyAction, inputReplyAction);
            behavior.visitReplyAction(inputReplyAction);
            this.doSwitch((EObject) inputReplyAction.getReturnInformation());
            for (Object replyValue : inputReplyAction.getReplyValues()) {
                this.doSwitch((EObject) replyValue);
            }
        }
        return null;
    }

    @objid ("10d1a7ff-93f2-478c-83d2-bae9b5362514")
    @Override
    public Object caseSendObjectAction(org.eclipse.uml2.uml.SendObjectAction inputSendObjectAction) {
        Object theResult = visitorMap.get(inputSendObjectAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SendObjectActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputSendObjectAction, inputSendObjectAction);
            behavior.visitSendObjectAction(inputSendObjectAction);
            this.doSwitch((EObject) inputSendObjectAction.getTarget());
            this.doSwitch((EObject) inputSendObjectAction.getRequest());
        }
        return null;
    }

    @objid ("15cf4d09-ec5b-45c4-9438-7cf6268f8965")
    @Override
    public Object caseSendOperationEvent(org.eclipse.uml2.uml.SendOperationEvent inputSendOperationEvent) {
        Object theResult = visitorMap.get(inputSendOperationEvent);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SendOperationEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputSendOperationEvent, inputSendOperationEvent);
            behavior.visitSendOperationEvent(inputSendOperationEvent);
        }
        return null;
    }

    @objid ("9817ef78-510a-4f1e-84b9-334e7756f3fc")
    @Override
    public Object caseSendSignalAction(org.eclipse.uml2.uml.SendSignalAction inputSendSignalAction) {
        Object theResult = visitorMap.get(inputSendSignalAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SendSignalActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputSendSignalAction, inputSendSignalAction);
            behavior.visitSendSignalAction(inputSendSignalAction);
            this.doSwitch((EObject) inputSendSignalAction.getTarget());
        }
        return null;
    }

    @objid ("c013d518-6103-40d4-b81d-476a06eb07d1")
    @Override
    public Object caseSendSignalEvent(org.eclipse.uml2.uml.SendSignalEvent inputSendSignalEvent) {
        Object theResult = visitorMap.get(inputSendSignalEvent);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SendSignalEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputSendSignalEvent, inputSendSignalEvent);
            behavior.visitSendSignalEvent(inputSendSignalEvent);
        }
        return null;
    }

    @objid ("ac9cb89d-bc70-49ef-8e1a-4a047ef04ae5")
    @Override
    public Object caseSequenceNode(org.eclipse.uml2.uml.SequenceNode inputSequenceNode) {
        Object theResult = visitorMap.get(inputSequenceNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SequenceNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputSequenceNode, inputSequenceNode);
            behavior.visitSequenceNode(inputSequenceNode);
            for (Object executableNode : inputSequenceNode.getExecutableNodes()) {
                this.doSwitch((EObject) executableNode);
            }
        }
        return null;
    }

    @objid ("64b633aa-83c7-48fb-90b6-f75d42cf67ab")
    @Override
    public Object caseSignal(org.eclipse.uml2.uml.Signal inputSignal) {
        Object theResult = visitorMap.get(inputSignal);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SignalImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputSignal, inputSignal);
            behavior.visitSignal(inputSignal);
            for (Object ownedAttribute : inputSignal.getOwnedAttributes()) {
                this.doSwitch((EObject) ownedAttribute);
            }
        }
        return null;
    }

    @objid ("0ef9b40b-0db9-4d72-83e6-d7de98741b45")
    @Override
    public Object caseSignalEvent(org.eclipse.uml2.uml.SignalEvent inputSignalEvent) {
        Object theResult = visitorMap.get(inputSignalEvent);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SignalEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputSignalEvent, inputSignalEvent);
            behavior.visitSignalEvent(inputSignalEvent);
        }
        return null;
    }

    @objid ("025aa44b-867a-4a57-a2c8-33596de0a15d")
    @Override
    public Object caseSlot(org.eclipse.uml2.uml.Slot inputSlot) {
        Object theResult = visitorMap.get(inputSlot);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SlotImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputSlot, inputSlot);
            behavior.visitSlot(inputSlot);
            for (Object value : inputSlot.getValues()) {
                this.doSwitch((EObject) value);
            }
        }
        return null;
    }

    @objid ("f264b72a-caea-4bb4-a0ca-07bd959c0e56")
    @Override
    public Object caseStartClassifierBehaviorAction(org.eclipse.uml2.uml.StartClassifierBehaviorAction inputStartClassifierBehaviorAction) {
        Object theResult = visitorMap.get(inputStartClassifierBehaviorAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("StartClassifierBehaviorActionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputStartClassifierBehaviorAction,
                    inputStartClassifierBehaviorAction);
            behavior
            .visitStartClassifierBehaviorAction(inputStartClassifierBehaviorAction);
            this.doSwitch((EObject) inputStartClassifierBehaviorAction
                    .getObject());
        }
        return null;
    }

    @objid ("d975ade3-06f9-4389-82b1-8f5b169b1a8d")
    @Override
    public Object caseState(org.eclipse.uml2.uml.State inputState) {
        Object theResult = visitorMap.get(inputState);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("StateImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputState, inputState);
            behavior.visitState(inputState);
            for (Object connection : inputState.getConnections()) {
                this.doSwitch((EObject) connection);
            }
            for (Object region : inputState.getRegions()) {
                this.doSwitch((EObject) region);
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
        return null;
    }

    @objid ("7bdebcf3-dd84-4f71-b370-38f72e22474e")
    @Override
    public Object caseStateInvariant(org.eclipse.uml2.uml.StateInvariant inputStateInvariant) {
        Object theResult = visitorMap.get(inputStateInvariant);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("StateInvariantImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputStateInvariant, inputStateInvariant);
            behavior.visitStateInvariant(inputStateInvariant);
            this.doSwitch((EObject) inputStateInvariant.getInvariant());
        }
        return null;
    }

    @objid ("9496b94a-b9d8-4f9e-ac7f-c7faf430e046")
    @Override
    public Object caseStateMachine(org.eclipse.uml2.uml.StateMachine inputStateMachine) {
        Object theResult = visitorMap.get(inputStateMachine);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("StateMachineImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputStateMachine, inputStateMachine);
            behavior.visitStateMachine(inputStateMachine);
            for (Object region : inputStateMachine.getRegions()) {
                this.doSwitch((EObject) region);
            }
            for (Object connectionPoint : inputStateMachine
                    .getConnectionPoints()) {
                this.doSwitch((EObject) connectionPoint);
            }
        }
        return null;
    }

    @objid ("18561e18-d375-4d57-924e-f1983c5c5a20")
    @Override
    public Object caseStereotype(org.eclipse.uml2.uml.Stereotype inputStereotype) {
        Object theResult = visitorMap.get(inputStereotype);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("StereotypeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputStereotype, inputStereotype);
            behavior.visitStereotype(inputStereotype);
            for (Object icon : inputStereotype.getIcons()) {
                this.doSwitch((EObject) icon);
            }
        }
        return null;
    }

    @objid ("cf7b669b-1916-4415-9498-dbdf32c73c1b")
    @Override
    public Object caseStringExpression(StringExpression inputStringExpression) {
        Object theResult = visitorMap.get(inputStringExpression);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("StringExpressionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputStringExpression, inputStringExpression);
            behavior.visitStringExpression(inputStringExpression);
            for (Object subExpression : inputStringExpression
                    .getSubExpressions()) {
                this.doSwitch((EObject) subExpression);
            }
        }
        return null;
    }

    @objid ("50444a03-45cb-4de2-bd5b-03f73aba65f1")
    @Override
    public Object caseStructuralFeature(org.eclipse.uml2.uml.StructuralFeature inputStructuralFeature) {
        return null;
    }

    @objid ("674313d8-5727-4d75-923a-4424281a072a")
    @Override
    public Object caseStructuralFeatureAction(org.eclipse.uml2.uml.StructuralFeatureAction inputStructuralFeatureAction) {
        this.doSwitch((EObject) inputStructuralFeatureAction.getObject());
        return null;
    }

    @objid ("15be7b98-46f9-4378-8ec4-256fdc883082")
    @Override
    public Object caseStructuredActivityNode(org.eclipse.uml2.uml.StructuredActivityNode inputStructuredActivityNode) {
        Object theResult = visitorMap.get(inputStructuredActivityNode);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("StructuredActivityNodeImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputStructuredActivityNode,
                    inputStructuredActivityNode);
            behavior.visitStructuredActivityNode(inputStructuredActivityNode);
            for (Object variable : inputStructuredActivityNode.getVariables()) {
                this.doSwitch((EObject) variable);
            }
            for (Object node : inputStructuredActivityNode.getNodes()) {
                this.doSwitch((EObject) node);
            }
            for (Object edge : inputStructuredActivityNode.getEdges()) {
                this.doSwitch((EObject) edge);
            }
        }
        return null;
    }

    @objid ("7ec72331-17e2-40da-bb9f-b813e76439ae")
    @Override
    public Object caseStructuredClassifier(org.eclipse.uml2.uml.StructuredClassifier inputStructuredClassifier) {
        for (Object ownedAttribute : inputStructuredClassifier
                .getOwnedAttributes()) {
            this.doSwitch((EObject) ownedAttribute);
        }
        for (Object ownedConnector : inputStructuredClassifier
                .getOwnedConnectors()) {
            this.doSwitch((EObject) ownedConnector);
        }
        return null;
    }

    @objid ("2a2205d0-90ac-46a5-b6cd-1c7e70d596b1")
    @Override
    public Object caseSubstitution(org.eclipse.uml2.uml.Substitution inputSubstitution) {
        Object theResult = visitorMap.get(inputSubstitution);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("SubstitutionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputSubstitution, inputSubstitution);
            behavior.visitSubstitution(inputSubstitution);
        }
        return null;
    }

    @objid ("3c96c51c-2877-4ba4-af8e-93edda663b4e")
    @Override
    public Object caseTemplateableElement(org.eclipse.uml2.uml.TemplateableElement inputTemplateableElement) {
        for (Object templateBinding : inputTemplateableElement
                .getTemplateBindings()) {
            this.doSwitch((EObject) templateBinding);
        }
        this.doSwitch((EObject) inputTemplateableElement
                .getOwnedTemplateSignature());
        return null;
    }

    @objid ("ceb0829a-89af-4b9c-8596-832c56e59e73")
    @Override
    public Object caseTemplateBinding(org.eclipse.uml2.uml.TemplateBinding inputTemplateBinding) {
        Object theResult = visitorMap.get(inputTemplateBinding);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TemplateBindingImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputTemplateBinding, inputTemplateBinding);
            behavior.visitTemplateBinding(inputTemplateBinding);
            for (Object parameterSubstitution : inputTemplateBinding
                    .getParameterSubstitutions()) {
                this.doSwitch((EObject) parameterSubstitution);
            }
        }
        return null;
    }

    @objid ("1d7b913e-2ef2-450e-9a75-65a52c33a1fc")
    @Override
    public Object caseTemplateParameter(org.eclipse.uml2.uml.TemplateParameter inputTemplateParameter) {
        Object theResult = visitorMap.get(inputTemplateParameter);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TemplateParameterImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputTemplateParameter, inputTemplateParameter);
            behavior.visitTemplateParameter(inputTemplateParameter);
            this.doSwitch((EObject) inputTemplateParameter
                    .getOwnedParameteredElement());
            this.doSwitch((EObject) inputTemplateParameter.getOwnedDefault());
        }
        return null;
    }

    @objid ("1b120d72-31dc-4f03-941b-6fe26e075d3f")
    @Override
    public Object caseTemplateParameterSubstitution(org.eclipse.uml2.uml.TemplateParameterSubstitution inputTemplateParameterSubstitution) {
        Object theResult = visitorMap.get(inputTemplateParameterSubstitution);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TemplateParameterSubstitutionImpl".equals(theResult
                        .getClass().getSimpleName()))) {
            visitorMap.put(inputTemplateParameterSubstitution,
                    inputTemplateParameterSubstitution);
            behavior
            .visitTemplateParameterSubstitution(inputTemplateParameterSubstitution);
            //            for (Object ownedActual : inputTemplateParameterSubstitution
            //                    .getOwnedActuals()) {
            //                this.doSwitch((EObject) ownedActual);
            //            }
        
            this.doSwitch((EObject) inputTemplateParameterSubstitution.getOwnedActual());
        
        }
        return null;
    }

    @objid ("25fc0622-a8c2-445d-9cc7-68dc15c033ac")
    @Override
    public Object caseTemplateSignature(org.eclipse.uml2.uml.TemplateSignature inputTemplateSignature) {
        Object theResult = visitorMap.get(inputTemplateSignature);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TemplateSignatureImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputTemplateSignature, inputTemplateSignature);
            behavior.visitTemplateSignature(inputTemplateSignature);
            for (Object ownedParameter : inputTemplateSignature
                    .getOwnedParameters()) {
                this.doSwitch((EObject) ownedParameter);
            }
        }
        return null;
    }

    @objid ("11f260b2-52b7-4fbb-8417-44d20f5220ea")
    @Override
    public Object caseTestIdentityAction(org.eclipse.uml2.uml.TestIdentityAction inputTestIdentityAction) {
        Object theResult = visitorMap.get(inputTestIdentityAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TestIdentityActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputTestIdentityAction, inputTestIdentityAction);
            behavior.visitTestIdentityAction(inputTestIdentityAction);
            this.doSwitch((EObject) inputTestIdentityAction.getFirst());
            this.doSwitch((EObject) inputTestIdentityAction.getSecond());
            this.doSwitch((EObject) inputTestIdentityAction.getResult());
        }
        return null;
    }

    @objid ("813f80ff-75d9-4555-8e6e-b00603cbf952")
    @Override
    public Object caseTimeConstraint(org.eclipse.uml2.uml.TimeConstraint inputTimeConstraint) {
        Object theResult = visitorMap.get(inputTimeConstraint);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TimeConstraintImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputTimeConstraint, inputTimeConstraint);
            behavior.visitTimeConstraint(inputTimeConstraint);
            this.doSwitch((EObject) inputTimeConstraint.getSpecification());
        }
        return null;
    }

    @objid ("9fd34e72-7f2f-47a2-aeb1-3639e1f9d879")
    @Override
    public Object caseTimeEvent(org.eclipse.uml2.uml.TimeEvent inputTimeEvent) {
        Object theResult = visitorMap.get(inputTimeEvent);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TimeEventImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputTimeEvent, inputTimeEvent);
            behavior.visitTimeEvent(inputTimeEvent);
            this.doSwitch((EObject) inputTimeEvent.getWhen());
        }
        return null;
    }

    @objid ("82365276-7b4f-4985-b1f4-ab619fd95c04")
    @Override
    public Object caseTimeExpression(org.eclipse.uml2.uml.TimeExpression inputTimeExpression) {
        Object theResult = visitorMap.get(inputTimeExpression);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TimeExpressionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputTimeExpression, inputTimeExpression);
            behavior.visitTimeExpression(inputTimeExpression);
        }
        return null;
    }

    @objid ("ed7bf911-69eb-41a7-b181-bba95dd4ba87")
    @Override
    public Object caseTimeInterval(org.eclipse.uml2.uml.TimeInterval inputTimeInterval) {
        Object theResult = visitorMap.get(inputTimeInterval);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TimeIntervalImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputTimeInterval, inputTimeInterval);
            behavior.visitTimeInterval(inputTimeInterval);
        }
        return null;
    }

    @objid ("1653b07e-04f4-4755-ac73-1967b74aac7a")
    @Override
    public Object caseTimeObservation(final TimeObservation inputTimeIservation) {
        Object theResult = visitorMap.get(inputTimeIservation);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TimeIservationImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputTimeIservation, inputTimeIservation);
            behavior.visitTimeIservation(inputTimeIservation);
        }
        return null;
    }

    @objid ("b9c76b29-e655-4900-973f-04aacb06506e")
    @Override
    public Object caseTransition(org.eclipse.uml2.uml.Transition inputTransition) {
        Object theResult = visitorMap.get(inputTransition);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TransitionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputTransition, inputTransition);
            behavior.visitTransition(inputTransition);
            this.doSwitch((EObject) inputTransition.getGuard());
            this.doSwitch((EObject) inputTransition.getEffect());
            for (Object trigger : inputTransition.getTriggers()) {
                this.doSwitch((EObject) trigger);
            }
        }
        return null;
    }

    @objid ("080819cb-f0ca-4780-9ddb-9e6ce30c7bcf")
    @Override
    public Object caseTrigger(org.eclipse.uml2.uml.Trigger inputTrigger) {
        Object theResult = visitorMap.get(inputTrigger);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("TriggerImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputTrigger, inputTrigger);
            behavior.visitTrigger(inputTrigger);
        }
        return null;
    }

    @objid ("aa5ef681-4dc5-424b-a8a2-f8d6498fbf6e")
    @Override
    public Object caseType(org.eclipse.uml2.uml.Type inputType) {
        return null;
    }

    @objid ("7b3d329d-f860-4a21-bec9-9a3f19d319f0")
    @Override
    public Object caseTypedElement(org.eclipse.uml2.uml.TypedElement inputTypedElement) {
        return null;
    }

    @objid ("b87e74e3-2abc-46b3-b836-bfaba77f2225")
    @Override
    public Object caseUnmarshallAction(org.eclipse.uml2.uml.UnmarshallAction inputUnmarshallAction) {
        Object theResult = visitorMap.get(inputUnmarshallAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("UnmarshallActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputUnmarshallAction, inputUnmarshallAction);
            behavior.visitUnmarshallAction(inputUnmarshallAction);
            for (Object result : inputUnmarshallAction.getResults()) {
                this.doSwitch((EObject) result);
            }
            this.doSwitch((EObject) inputUnmarshallAction.getObject());
        }
        return null;
    }

    @objid ("2b25e949-5e21-47ff-b7d7-e8654786a1e4")
    @Override
    public Object caseUsage(org.eclipse.uml2.uml.Usage inputUsage) {
        Object theResult = visitorMap.get(inputUsage);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("UsageImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputUsage, inputUsage);
            behavior.visitUsage(inputUsage);
        }
        return null;
    }

    @objid ("36bfa8f7-ad27-46e4-8d52-971a0beeec28")
    @Override
    public Object caseUseCase(org.eclipse.uml2.uml.UseCase inputUseCase) {
        Object theResult = visitorMap.get(inputUseCase);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("UseCaseImpl".equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputUseCase, inputUseCase);
            behavior.visitUseCase(inputUseCase);
            for (Object include : inputUseCase.getIncludes()) {
                this.doSwitch((EObject) include);
            }
            for (Object extend : inputUseCase.getExtends()) {
                this.doSwitch((EObject) extend);
            }
            for (Object extensionPoint : inputUseCase.getExtensionPoints()) {
                this.doSwitch((EObject) extensionPoint);
            }
        }
        return null;
    }

    @objid ("d29127ee-e7b3-49da-8d76-c7cdd00015a5")
    @Override
    public Object caseValuePin(org.eclipse.uml2.uml.ValuePin inputValuePin) {
        Object theResult = visitorMap.get(inputValuePin);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ValuePinImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputValuePin, inputValuePin);
            behavior.visitValuePin(inputValuePin);
            this.doSwitch((EObject) inputValuePin.getValue());
        }
        return null;
    }

    @objid ("f2abba71-4934-4a28-b3e0-efa15060925b")
    @Override
    public Object caseValueSpecification(org.eclipse.uml2.uml.ValueSpecification inputValueSpecification) {
        return null;
    }

    @objid ("62db7254-9599-4bfc-872a-fadbb64f64f0")
    @Override
    public Object caseValueSpecificationAction(org.eclipse.uml2.uml.ValueSpecificationAction inputValueSpecificationAction) {
        Object theResult = visitorMap.get(inputValueSpecificationAction);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("ValueSpecificationActionImpl".equals(theResult.getClass()
                        .getSimpleName()))) {
            visitorMap.put(inputValueSpecificationAction,
                    inputValueSpecificationAction);
            behavior
            .visitValueSpecificationAction(inputValueSpecificationAction);
            this.doSwitch((EObject) inputValueSpecificationAction.getValue());
            this.doSwitch((EObject) inputValueSpecificationAction.getResult());
        }
        return null;
    }

    @objid ("81baa223-0986-4804-9e96-b15b460d1084")
    @Override
    public Object caseVariable(org.eclipse.uml2.uml.Variable inputVariable) {
        Object theResult = visitorMap.get(inputVariable);
        // If this concrete element is inherited by another concrete element, it
        // shall be in the visitorMap. Also do call the treatment defined at the
        // current super level:
        if (theResult == null
                || !("VariableImpl"
                        .equals(theResult.getClass().getSimpleName()))) {
            visitorMap.put(inputVariable, inputVariable);
            behavior.visitVariable(inputVariable);
        }
        return null;
    }

    @objid ("fa070d71-9021-4c69-a4fe-f604ffeb8b5c")
    @Override
    public Object caseVariableAction(org.eclipse.uml2.uml.VariableAction inputVariableAction) {
        return null;
    }

    @objid ("1e3b31d9-63cc-43ca-b0e7-cdbef9bdce66")
    @Override
    public Object caseVertex(org.eclipse.uml2.uml.Vertex inputVertex) {
        return null;
    }

    @objid ("f674d839-b646-4cab-a7c8-2c1c2b847bc7")
    @Override
    public Object caseWriteLinkAction(org.eclipse.uml2.uml.WriteLinkAction inputWriteLinkAction) {
        return null;
    }

    @objid ("46dabffc-933f-4f02-8f6b-c830c68f7cd0")
    @Override
    public Object caseWriteStructuralFeatureAction(org.eclipse.uml2.uml.WriteStructuralFeatureAction inputWriteStructuralFeatureAction) {
        this.doSwitch((EObject) inputWriteStructuralFeatureAction.getValue());
        return null;
    }

    @objid ("63ae7f6e-2342-4bb7-a05d-caaeaf0b09db")
    @Override
    public Object caseWriteVariableAction(org.eclipse.uml2.uml.WriteVariableAction inputWriteVariableAction) {
        this.doSwitch((EObject) inputWriteVariableAction.getValue());
        return null;
    }

    @objid ("9eeabfb8-88d8-46e3-9fab-85cf9b2ae5aa")
    public XMIImportBehavior getBehavior() {
        return this.behavior;
    }

    @objid ("b5281801-30cc-4ed4-88d6-2ba48b2cff6a")
    public Map<Object, Object> getVisitorMap() {
        return this.visitorMap;
    }

}
