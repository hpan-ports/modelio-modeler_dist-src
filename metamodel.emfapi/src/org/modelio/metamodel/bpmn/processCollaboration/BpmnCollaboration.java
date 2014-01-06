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
                                    

/* WARNING: GENERATED FILE -  DO NOT EDIT */
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.flows.BpmnMessageFlow;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnParticipant;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnRootElement;

@objid ("0073c9fe-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnCollaboration extends BpmnRootElement {
    @objid ("b24aa142-66a2-45a6-a0d3-9c029176c7df")
    boolean isIsClosed();

    @objid ("55764281-ec37-4e24-bc82-7c01fb033724")
    void setIsClosed(boolean value);

    @objid ("157afa50-47a5-4253-ab60-f32d6eadb434")
    EList<BpmnArtifact> getArtifact();

    @objid ("e76aab82-be60-457b-9881-756717389443")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    @objid ("c3d9551d-5440-44af-a4f9-81ceb6d4a20b")
    EList<BpmnMessageFlow> getMessageFlow();

    @objid ("26544904-9349-452f-aaec-49ddcb4ec16a")
    <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass);

    @objid ("f070f0f9-75fb-48d7-a46c-de81aa348fe6")
    EList<BpmnParticipant> getParticipants();

    @objid ("8df39101-093c-4401-9082-5806c9549301")
    <T extends BpmnParticipant> List<T> getParticipants(java.lang.Class<T> filterClass);

}
