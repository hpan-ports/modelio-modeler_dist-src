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
package org.modelio.metamodel.bpmn.activities;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.rootElements.BpmnArtifact;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;

@objid ("00843028-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnSubProcess extends BpmnActivity {
    @objid ("e0fd9c24-34ba-4a59-8b67-99fcb8e64412")
    boolean isTriggeredByEvent();

    @objid ("3072f6e8-0456-4f58-857b-29834bf6630f")
    void setTriggeredByEvent(boolean value);

    @objid ("82c45ccc-a9e3-4c9a-81d0-4e547c9d3d88")
    EList<BpmnArtifact> getArtifact();

    @objid ("26e19a33-fb8d-4a44-bcc8-8b4d463e207e")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    @objid ("a82ec34d-c3be-4ec2-896c-ce02b6239094")
    EList<BpmnFlowElement> getFlowElement();

    @objid ("17511a1e-a38e-471f-8769-303f547e6996")
    <T extends BpmnFlowElement> List<T> getFlowElement(java.lang.Class<T> filterClass);

    @objid ("9056cbc7-11fe-42b0-8e18-a092ee214c6d")
    EList<BpmnLaneSet> getLaneSet();

    @objid ("f63088a2-a604-4ae3-a505-c678551e293d")
    <T extends BpmnLaneSet> List<T> getLaneSet(java.lang.Class<T> filterClass);

}
