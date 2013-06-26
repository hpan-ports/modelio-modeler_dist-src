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
    @objid ("94f055bd-26bd-475d-8189-7d5a5f6ffbc4")
    boolean isTriggeredByEvent();

    @objid ("a58fca8a-f9a7-4710-b764-aba9f89ee06d")
    void setTriggeredByEvent(boolean value);

    @objid ("a13e0896-a2fe-40c5-af70-fca226d1598f")
    EList<BpmnArtifact> getArtifact();

    @objid ("842e42bb-c31a-41f6-9b86-ac178cecd4a4")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    @objid ("78bbbe6c-a688-45c2-8841-6cd70104a29e")
    EList<BpmnFlowElement> getFlowElement();

    @objid ("bb126790-89da-4746-8809-f7d2c9e31750")
    <T extends BpmnFlowElement> List<T> getFlowElement(java.lang.Class<T> filterClass);

    @objid ("b3fa9be5-7d0b-468b-b917-33d1db0e5fd2")
    EList<BpmnLaneSet> getLaneSet();

    @objid ("58070e46-fdd2-4ba1-90d5-d73c526e09c2")
    <T extends BpmnLaneSet> List<T> getLaneSet(java.lang.Class<T> filterClass);

}
