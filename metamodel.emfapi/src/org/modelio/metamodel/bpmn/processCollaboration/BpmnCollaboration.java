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
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;

/**
 * BpmnCollaboration v0.0.9054
 * 
 * 
 * The Collaboration package contains classes which are used for modeling Collaborations, which is a collection of Participants shown as Pools, their interactions as shown by Message Flow, and may include Processes within the Pools and/or Choreographies between the Pools.
 * 
 * Ownership:
 * Collaborations/Processes are structured under UML Packages or Classifiers or operations.
 */
@objid ("0073c9fe-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnCollaboration extends BpmnRootElement {
    @objid ("1874d5b7-1b7e-4633-a5b5-e93f41fef07c")
    public static final String MNAME = "BpmnCollaboration";

    /**
     * Getter for attribute 'BpmnCollaboration.IsClosed'
     * 
     * Metamodel description:
     * <i>A boolean value specifying whether Message Flow not modeled in the Collaboration can occur when the Collaboration is carried out.
     * ? If the value is true, they MAY NOT occur.
     * ? If the value is false, they MAY occur.</i>
     */
    @objid ("eb8c5e4e-f11a-4aac-a602-90c0e75c2d60")
    boolean isIsClosed();

    /**
     * Setter for attribute 'BpmnCollaboration.IsClosed'
     * 
     * Metamodel description:
     * <i>A boolean value specifying whether Message Flow not modeled in the Collaboration can occur when the Collaboration is carried out.
     * ? If the value is true, they MAY NOT occur.
     * ? If the value is false, they MAY occur.</i>
     */
    @objid ("129ff225-6780-45f7-a8df-bdbda9b6bbf4")
    void setIsClosed(boolean value);

    /**
     * Getter for relation 'BpmnCollaboration->Artifact'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b1d6e99a-6924-4a63-b99f-20f30794adf4")
    EList<BpmnArtifact> getArtifact();

    /**
     * Filtered Getter for relation 'BpmnCollaboration->Artifact'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5ad8b57a-dfae-4436-b00d-583345ac2bfc")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnCollaboration->MessageFlow'
     * 
     * Metamodel description:
     * <i>This provides the list of Message Flow that are used in the
     * Collaboration.</i>
     */
    @objid ("36adb40b-40d4-4c81-879c-b31c77e67499")
    EList<BpmnMessageFlow> getMessageFlow();

    /**
     * Filtered Getter for relation 'BpmnCollaboration->MessageFlow'
     * 
     * Metamodel description:
     * <i>This provides the list of Message Flow that are used in the
     * Collaboration.</i>
     */
    @objid ("964dac3d-a208-475a-b52c-ad25cef45b81")
    <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'BpmnCollaboration->Participants'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b547b52e-a598-467c-b2ee-93a93917458c")
    EList<BpmnParticipant> getParticipants();

    /**
     * Filtered Getter for relation 'BpmnCollaboration->Participants'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c7122e24-ba74-4796-b6a2-f14383014300")
    <T extends BpmnParticipant> List<T> getParticipants(java.lang.Class<T> filterClass);

}
