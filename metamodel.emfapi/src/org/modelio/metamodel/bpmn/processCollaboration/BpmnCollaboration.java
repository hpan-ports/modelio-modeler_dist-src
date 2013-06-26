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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("ecdd0f13-b237-4839-95fe-3b7251329e5a")
    boolean isIsClosed();

    @objid ("fdee6ae9-1f6d-41d3-bfe8-e2f2255cd4fe")
    void setIsClosed(boolean value);

    @objid ("7d4cc21b-a794-46a9-8e68-dd2a89c7372e")
    EList<BpmnArtifact> getArtifact();

    @objid ("57ee8104-c7b9-4e21-a60c-6b792f09cf9b")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    @objid ("38e6b9f5-c1d7-417d-adf7-d43d743efc87")
    EList<BpmnMessageFlow> getMessageFlow();

    @objid ("7fd62f3c-317c-4e8c-a216-893788d93e96")
    <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass);

    @objid ("66a2fd6e-b209-47e8-99eb-f4810ffefacf")
    EList<BpmnParticipant> getParticipants();

    @objid ("f5bd7958-6610-4f03-85e3-e51429a1b9d9")
    <T extends BpmnParticipant> List<T> getParticipants(java.lang.Class<T> filterClass);

}
