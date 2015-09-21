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
package org.modelio.metamodel.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.bpmn.activities.BpmnCallActivity;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcessType;
import org.modelio.metamodel.bpmn.processCollaboration.OptionalBoolean;
import org.modelio.metamodel.bpmn.resources.BpmnResourceRole;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;

/**
 * BpmnProcess v0.0.9054
 * 
 * 
 * A Process describes a sequence or flow of Activities in an organization with the objective of carrying out work. In BPMN a Process is depicted as a graph of Flow Elements, which are a set of Activities, Events, Gateways, and Sequence Flow that define finite execution semantics. Processes may be defined at any level from enterprise-wide Processes to Processes performed by a single person. Low-level Processes may be grouped together to achieve a common business goal.
 * Note that BPMN uses the term Process specifically to mean a set of flow elements. It uses the terms Collaboration and Choreography when modeling the interaction between Processes
 * 
 * Ownership:
 * A process belongs to a Collaboration
 */
@objid ("00762104-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnProcess extends BpmnRootElement {
    @objid ("87b70889-4733-46c1-bfae-d6e0990c8b0e")
    public static final String MNAME = "BpmnProcess";

    /**
     * Getter for attribute 'BpmnProcess.ProcessType'
     * 
     * Metamodel description:
     * <i>The processType attribute Provides additional information about the level of abstraction modeled by this Process.
     * A public Process shows only those flow elements that are relevant to external consumers. Internal details are not modeled. These Processes are publicly visible and can be used within a Collaboration. Note that the public processType was named abstract in BPMN 1.2.
     * The BPMN 1.2 processType private has been divided into two (2) types:
     * An executable Process is a private Process that has been modeled for the purpose of being executed. Of course, during the development cycle of the Process, there will be stages where the Process does not have enough detail to be ?executable.?
     * A non-executable Process is a private Process that has been modeled for the purpose of documenting Process behavior at a modeler-defined level of detail. Thus, information required for execution, such as formal condition Expressions are typically not included in a non-executable
     * Process.
     * By default, the processType is ?none,? meaning undefined.</i>
     */
    @objid ("f7679f5e-59d6-438f-ad3b-54f09dcb9745")
    BpmnProcessType getProcessType();

    /**
     * Setter for attribute 'BpmnProcess.ProcessType'
     * 
     * Metamodel description:
     * <i>The processType attribute Provides additional information about the level of abstraction modeled by this Process.
     * A public Process shows only those flow elements that are relevant to external consumers. Internal details are not modeled. These Processes are publicly visible and can be used within a Collaboration. Note that the public processType was named abstract in BPMN 1.2.
     * The BPMN 1.2 processType private has been divided into two (2) types:
     * An executable Process is a private Process that has been modeled for the purpose of being executed. Of course, during the development cycle of the Process, there will be stages where the Process does not have enough detail to be ?executable.?
     * A non-executable Process is a private Process that has been modeled for the purpose of documenting Process behavior at a modeler-defined level of detail. Thus, information required for execution, such as formal condition Expressions are typically not included in a non-executable
     * Process.
     * By default, the processType is ?none,? meaning undefined.</i>
     */
    @objid ("3ff1f225-95e9-41b3-9c14-f7151cef25d5")
    void setProcessType(BpmnProcessType value);

    /**
     * Getter for attribute 'BpmnProcess.IsClosed'
     * 
     * Metamodel description:
     * <i>A boolean value specifying whether interactions, such as sending and receiving Messages and Events, not modeled in the Process can occur when the Process is executed or performed. If the value is true, they MAY NOT occur. If the value is false, they MAY occur.</i>
     */
    @objid ("bb9e21ab-de39-495c-a9f1-4c2224590570")
    boolean isIsClosed();

    /**
     * Setter for attribute 'BpmnProcess.IsClosed'
     * 
     * Metamodel description:
     * <i>A boolean value specifying whether interactions, such as sending and receiving Messages and Events, not modeled in the Process can occur when the Process is executed or performed. If the value is true, they MAY NOT occur. If the value is false, they MAY occur.</i>
     */
    @objid ("cd8234c0-171a-494f-b237-8a51c6e48008")
    void setIsClosed(boolean value);

    /**
     * Getter for attribute 'BpmnProcess.IsExecutable'
     * 
     * Metamodel description:
     * <i>An optional Boolean value specifying whether the Process is executable.
     * 
     * An executable Process is a private Process that has been modeled for the purpose of being executed according to the semantics of Chapter 14 (see page 442). Of course, during the development cycle of the Process, there will be stages where the Process does not have enough detail to be 'executable.' 
     * 
     * A non-executable Process is a private Process that has been modeled for the purpose of documenting Process behavior at a modeler-defined level of detail. Thus, information needed for execution, such as formal condition expressions are typically not included in a non-executable Process. 
     * 
     * For public Processes, no value has the same semantics as if the value were false. The value MAY not be true for public Processes.</i>
     */
    @objid ("3d5a1d8e-04d9-41f1-85f1-2e8dc7656828")
    OptionalBoolean getIsExecutable();

    /**
     * Setter for attribute 'BpmnProcess.IsExecutable'
     * 
     * Metamodel description:
     * <i>An optional Boolean value specifying whether the Process is executable.
     * 
     * An executable Process is a private Process that has been modeled for the purpose of being executed according to the semantics of Chapter 14 (see page 442). Of course, during the development cycle of the Process, there will be stages where the Process does not have enough detail to be 'executable.' 
     * 
     * A non-executable Process is a private Process that has been modeled for the purpose of documenting Process behavior at a modeler-defined level of detail. Thus, information needed for execution, such as formal condition expressions are typically not included in a non-executable Process. 
     * 
     * For public Processes, no value has the same semantics as if the value were false. The value MAY not be true for public Processes.</i>
     */
    @objid ("85ab4560-6624-418c-b2d2-121d1a8e4dce")
    void setIsExecutable(OptionalBoolean value);

    /**
     * Getter for relation 'BpmnProcess->Caller'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("36d0fee4-340e-4eed-ba60-304428828910")
    EList<BpmnCallActivity> getCaller();

    /**
     * Filtered Getter for relation 'BpmnProcess->Caller'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("149ce55f-7888-4601-97af-6f900e8cdc65")
    <T extends BpmnCallActivity> List<T> getCaller(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnProcess->Supports'
     * 
     * Metamodel description:
     * <i>Modelers can declare that they intend all executions or performances of one Process to also be valid for another Process. This means they expect all the executions or performances of the first Processes to also follow the steps laid out in the second Process.</i>
     */
    @objid ("c434b3de-cb9e-4b65-9d75-dcec0d6fd23c")
    EList<BpmnProcess> getSupports();

    /**
     * Filtered Getter for relation 'BpmnProcess->Supports'
     * 
     * Metamodel description:
     * <i>Modelers can declare that they intend all executions or performances of one Process to also be valid for another Process. This means they expect all the executions or performances of the first Processes to also follow the steps laid out in the second Process.</i>
     */
    @objid ("353dd3d0-4e92-4a64-8377-96b8ce88eeaf")
    <T extends BpmnProcess> List<T> getSupports(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnProcess->Artifact'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("61b22b37-b8ff-4a8f-b8ba-4f539c1503d2")
    EList<BpmnArtifact> getArtifact();

    /**
     * Filtered Getter for relation 'BpmnProcess->Artifact'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d74785fd-04f9-4a78-a719-426b4fdbbbf3")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnProcess->LaneSet'
     * 
     * Metamodel description:
     * <i>laneset of the process. The process is represented in this cas by a pool which is decomposed by lansets and lanes.</i>
     */
    @objid ("b96c10ce-2685-4943-9a86-e26c15ecc109")
    EList<BpmnLaneSet> getLaneSet();

    /**
     * Filtered Getter for relation 'BpmnProcess->LaneSet'
     * 
     * Metamodel description:
     * <i>laneset of the process. The process is represented in this cas by a pool which is decomposed by lansets and lanes.</i>
     */
    @objid ("5f8407c2-940d-4f1c-ac51-29c6ed4bcb02")
    <T extends BpmnLaneSet> List<T> getLaneSet(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnProcess->Supported'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8092baa4-8f9c-45b4-8cb1-089ce5049d3a")
    EList<BpmnProcess> getSupported();

    /**
     * Filtered Getter for relation 'BpmnProcess->Supported'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("10e13bc6-8cf0-4c06-909b-fd990094b5db")
    <T extends BpmnProcess> List<T> getSupported(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnProcess->Participant'
     * 
     * Metamodel description:
     * <i>When a participant is decomposed by a process, both are related by this association.</i>
     */
    @objid ("971ed3ae-e3e9-40c0-b16a-f2b752b98314")
    BpmnParticipant getParticipant();

    /**
     * Setter for relation 'BpmnProcess->Participant'
     * 
     * Metamodel description:
     * <i>When a participant is decomposed by a process, both are related by this association.</i>
     */
    @objid ("1a47a22c-005a-4b93-ad92-fd50bfec34ba")
    void setParticipant(BpmnParticipant value);

    /**
     * Getter for relation 'BpmnProcess->FlowElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("aa3e7322-d0d5-4a77-b7cf-7399afb6a317")
    EList<BpmnFlowElement> getFlowElement();

    /**
     * Filtered Getter for relation 'BpmnProcess->FlowElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e368702b-c8ee-4f4b-a0d5-51c273f3a195")
    <T extends BpmnFlowElement> List<T> getFlowElement(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnProcess->Resource'
     * 
     * Metamodel description:
     * <i>Resources attached to the process, such as auditing or monitoring. These resources can be defined externally, in particular by the user, in order to attach descritpion properties to a process.</i>
     */
    @objid ("5464871b-aebd-48f7-8cb4-df0d27dd3fd4")
    EList<BpmnResourceRole> getResource();

    /**
     * Filtered Getter for relation 'BpmnProcess->Resource'
     * 
     * Metamodel description:
     * <i>Resources attached to the process, such as auditing or monitoring. These resources can be defined externally, in particular by the user, in order to attach descritpion properties to a process.</i>
     */
    @objid ("7cfa7c99-1575-45d5-ae52-9b78d5c03139")
    <T extends BpmnResourceRole> List<T> getResource(java.lang.Class<T> filterClass);

}
