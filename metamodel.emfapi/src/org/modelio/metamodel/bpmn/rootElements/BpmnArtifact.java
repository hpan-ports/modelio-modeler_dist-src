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
package org.modelio.metamodel.bpmn.rootElements;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnSubProcess;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnCollaboration;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;

/**
 * BpmnArtifact v0.0.9054
 * 
 * 
 * BPMN provides modelers with the capability of showing additional information about a Process that is not directly related to the Sequence Flow or Message Flow of the Process.
 * At this point, BPMN provides three (3) standard Artifacts: Associations, Groups, and Text Annotations
 */
@objid ("00787d78-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnArtifact extends BpmnBaseElement {
    @objid ("6345482f-6e68-47b7-b365-351f7357df10")
    public static final String MNAME = "BpmnArtifact";

    /**
     * Getter for relation 'BpmnArtifact->SubProcess'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9f078447-e09f-4ed4-bf83-9eca7eea4413")
    BpmnSubProcess getSubProcess();

    /**
     * Setter for relation 'BpmnArtifact->SubProcess'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e34929a2-398e-4664-9610-3d6634dae340")
    void setSubProcess(BpmnSubProcess value);

    /**
     * Getter for relation 'BpmnArtifact->Collaboration'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1b4fd99e-c8d8-4f29-ae71-b01506cee060")
    BpmnCollaboration getCollaboration();

    /**
     * Setter for relation 'BpmnArtifact->Collaboration'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b7304420-5e59-4164-beeb-5c71a4c87abb")
    void setCollaboration(BpmnCollaboration value);

    /**
     * Getter for relation 'BpmnArtifact->Process'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fe5e78eb-c0c1-4702-8c15-8281c5465708")
    BpmnProcess getProcess();

    /**
     * Setter for relation 'BpmnArtifact->Process'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("46b996f0-c29b-40ad-9daa-2afa004a9c2a")
    void setProcess(BpmnProcess value);

}
