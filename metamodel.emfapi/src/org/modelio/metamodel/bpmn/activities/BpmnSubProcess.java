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
    @objid ("f17259b7-69ba-4d35-98cc-502a52ab219b")
    boolean isTriggeredByEvent();

    @objid ("a347f13b-73e2-4bf9-8171-c8ab29ad80a9")
    void setTriggeredByEvent(boolean value);

    @objid ("29885955-862e-4c65-950c-25a344724959")
    EList<BpmnArtifact> getArtifact();

    @objid ("404f9a14-5a94-424c-b1af-0cca6a532490")
    <T extends BpmnArtifact> List<T> getArtifact(java.lang.Class<T> filterClass);

    @objid ("34fc7dc2-72cc-4611-a525-c7c0e6419134")
    EList<BpmnFlowElement> getFlowElement();

    @objid ("ae0dfdda-429b-45c3-927a-14a3306e6a13")
    <T extends BpmnFlowElement> List<T> getFlowElement(java.lang.Class<T> filterClass);

    @objid ("116a2930-4071-49a2-8b9c-42730907fead")
    EList<BpmnLaneSet> getLaneSet();

    @objid ("4835dfc7-2326-4b1a-8b7a-c411ea3651ce")
    <T extends BpmnLaneSet> List<T> getLaneSet(java.lang.Class<T> filterClass);

}
