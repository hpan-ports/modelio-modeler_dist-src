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
/*   Metamodel version: 9022              */
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
    @objid ("2862650c-34c8-4689-a302-d424ba112055")
    boolean isIsClosed();

    @objid ("632d3ce1-762b-4c33-a4a9-5afa082a6fdf")
    void setIsClosed(boolean value);

    @objid ("3f566037-de7e-474e-8b84-8406a0fbf3ea")
    EList<BpmnArtifact> getArtifact();

    @objid ("f5c16c7b-aa86-4643-ac6a-8bef6d42d30d")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    @objid ("ddcd4c54-0503-49ea-ae41-2599b1e4a482")
    EList<BpmnMessageFlow> getMessageFlow();

    @objid ("8557287c-6ad3-405b-85b8-2fe3721425a1")
    <T extends BpmnMessageFlow> List<T> getMessageFlow(java.lang.Class<T> filterClass);

    @objid ("7c2cbac7-183a-43ea-bcde-e249ac8de27b")
    EList<BpmnParticipant> getParticipants();

    @objid ("d9feff23-500b-42b7-84bc-4ec7aa7e94a9")
    <T extends BpmnParticipant> List<T> getParticipants(java.lang.Class<T> filterClass);

}
