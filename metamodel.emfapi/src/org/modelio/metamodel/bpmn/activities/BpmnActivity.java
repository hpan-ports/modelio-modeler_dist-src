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


/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9022              */
/*   SemGen version   : 2.0.07.9012       */
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.bpmn.activities;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnBoundaryEvent;
import org.modelio.metamodel.bpmn.events.BpmnCompensateEventDefinition;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;
import org.modelio.metamodel.bpmn.objects.BpmnDataAssociation;
import org.modelio.metamodel.bpmn.objects.BpmnDataInput;
import org.modelio.metamodel.bpmn.objects.BpmnDataOutput;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowNode;

/**
 * BpmnActivity v0.0.9054
 * 
 * 
 * An Activity is work that is performed within a Business Process. An Activity can be atomic or non-atomic (compound). The types of Activities that are a part of a Process are: Task, Sub-Process, and Call Activity, which allows the inclusion of re-usable Tasks and Processes in the diagram.
 * 
 * Ownership
 * An activity belongs to a GlowElementContainer or to a sub process.
 */
@objid ("007d712a-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnActivity extends BpmnFlowNode {
    @objid ("972da4ea-6182-4464-b8a8-838259770745")
    public static final String MNAME = "BpmnActivity";

    /**
     * Getter for attribute 'BpmnActivity.IsForCompensation'
     * 
     * Metamodel description:
     * <i>A flag that identifies whether this Activity is intended for the purposes of compensation.
     * If false, then this Activity executes as a result of normal execution flow.
     * If true, this Activity is only activated when a Compensation Event is detected and initiated under Compensation Event visibility scope</i>
     */
    @objid ("b1e492ed-5045-4e27-ae66-8e935b481028")
    boolean isIsForCompensation();

    /**
     * Setter for attribute 'BpmnActivity.IsForCompensation'
     * 
     * Metamodel description:
     * <i>A flag that identifies whether this Activity is intended for the purposes of compensation.
     * If false, then this Activity executes as a result of normal execution flow.
     * If true, this Activity is only activated when a Compensation Event is detected and initiated under Compensation Event visibility scope</i>
     */
    @objid ("a628544d-d39f-4000-a0f3-72bd340ba2fd")
    void setIsForCompensation(boolean value);

    /**
     * Getter for attribute 'BpmnActivity.StartQuantity'
     * 
     * Metamodel description:
     * <i>The default value is 1. The value MUST NOT be less than 1. This attribute defines the number of tokens that must arrive before the Activity can begin. Note that any value for the attribute that is greater than 1 is an advanced type of modeling and should be used with caution.</i>
     */
    @objid ("b1c25dfe-7ae3-4f19-9aec-d714e5c559a8")
    int getStartQuantity();

    /**
     * Setter for attribute 'BpmnActivity.StartQuantity'
     * 
     * Metamodel description:
     * <i>The default value is 1. The value MUST NOT be less than 1. This attribute defines the number of tokens that must arrive before the Activity can begin. Note that any value for the attribute that is greater than 1 is an advanced type of modeling and should be used with caution.</i>
     */
    @objid ("19b82aee-33b2-4e39-afe7-0cd91d3e6633")
    void setStartQuantity(int value);

    /**
     * Getter for attribute 'BpmnActivity.CompletionQuantity'
     * 
     * Metamodel description:
     * <i>The default value is 1. The value MUST NOT be less than 1. This attribute defines the number of tokens that must be generated from the Activity. This number of tokens will be sent done any outgoing Sequence Flow (assuming any Sequence Flow conditions are satisfied).
     * Note that any value for the attribute that is greater than 1 is an advanced type of modeling and should be used with caution.</i>
     */
    @objid ("9011b14b-039b-42e6-9ff1-b94fc0f79858")
    int getCompletionQuantity();

    /**
     * Setter for attribute 'BpmnActivity.CompletionQuantity'
     * 
     * Metamodel description:
     * <i>The default value is 1. The value MUST NOT be less than 1. This attribute defines the number of tokens that must be generated from the Activity. This number of tokens will be sent done any outgoing Sequence Flow (assuming any Sequence Flow conditions are satisfied).
     * Note that any value for the attribute that is greater than 1 is an advanced type of modeling and should be used with caution.</i>
     */
    @objid ("080238a7-aefe-4155-a52e-359667ac7aee")
    void setCompletionQuantity(int value);

    /**
     * Getter for relation 'BpmnActivity->CompensateEventDefinitions'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9d9ab956-9e25-4548-bdd2-22466065a3a1")
    EList<BpmnCompensateEventDefinition> getCompensateEventDefinitions();

    /**
     * Filtered Getter for relation 'BpmnActivity->CompensateEventDefinitions'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2bc3f396-78d5-4f17-b05b-590b3ab3e2ea")
    <T extends BpmnCompensateEventDefinition> List<T> getCompensateEventDefinitions(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnActivity->InputSpecification'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("292d0d55-54fa-48e4-83b4-79e64cdf54fe")
    EList<BpmnDataInput> getInputSpecification();

    /**
     * Filtered Getter for relation 'BpmnActivity->InputSpecification'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("495eb980-7523-47b2-9d78-a0ff9c5c3788")
    <T extends BpmnDataInput> List<T> getInputSpecification(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnActivity->DataInputAssociation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("17ff1fe2-8e66-43c0-b747-65b1891a5764")
    EList<BpmnDataAssociation> getDataInputAssociation();

    /**
     * Filtered Getter for relation 'BpmnActivity->DataInputAssociation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1c5aad36-e5aa-423b-8dd5-c593787828ef")
    <T extends BpmnDataAssociation> List<T> getDataInputAssociation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnActivity->OutputSpecification'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9baf010b-a423-41d7-b6b9-254a40ff25c9")
    EList<BpmnDataOutput> getOutputSpecification();

    /**
     * Filtered Getter for relation 'BpmnActivity->OutputSpecification'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6ec5f970-2a04-4ff8-873a-d1ac662313dc")
    <T extends BpmnDataOutput> List<T> getOutputSpecification(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnActivity->LoopCharacteristics'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("90ec7e3f-2f66-43f0-a296-c5a0bbcaa7c9")
    BpmnLoopCharacteristics getLoopCharacteristics();

    /**
     * Setter for relation 'BpmnActivity->LoopCharacteristics'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2b33deb7-ac64-4c7d-9b32-5564257d4f14")
    void setLoopCharacteristics(BpmnLoopCharacteristics value);

    /**
     * Getter for relation 'BpmnActivity->BoundaryEventRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1e3a0421-e814-4a32-9496-d96cd29ef43c")
    EList<BpmnBoundaryEvent> getBoundaryEventRef();

    /**
     * Filtered Getter for relation 'BpmnActivity->BoundaryEventRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("12dcf98a-3a9b-4caf-b801-5e1b89abb905")
    <T extends BpmnBoundaryEvent> List<T> getBoundaryEventRef(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnActivity->DataOutputAssociation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5b400475-cfe9-4e78-a942-d224144ee324")
    EList<BpmnDataAssociation> getDataOutputAssociation();

    /**
     * Filtered Getter for relation 'BpmnActivity->DataOutputAssociation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("109307ed-f5d7-4fa5-a9cc-7e44ee13297e")
    <T extends BpmnDataAssociation> List<T> getDataOutputAssociation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnActivity->DefaultFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3b75a932-af39-4ef2-a6a5-0d0860266feb")
    BpmnSequenceFlow getDefaultFlow();

    /**
     * Setter for relation 'BpmnActivity->DefaultFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1af3d959-3622-4e8e-8fa7-0cff4d16688a")
    void setDefaultFlow(BpmnSequenceFlow value);

}
