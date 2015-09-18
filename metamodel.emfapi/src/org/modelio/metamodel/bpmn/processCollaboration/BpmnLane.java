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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("00746c56-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnLane extends BpmnBaseElement {
    @objid ("f693cbf1-d52d-45c4-8638-90756217e329")
    BpmnLaneSet getChildLaneSet();

    @objid ("f8ab16a7-4cc7-488c-a171-4fd05b5a93d6")
    void setChildLaneSet(BpmnLaneSet value);

    @objid ("6bf9769e-f3dc-4832-9ccb-0e389b105207")
    ModelElement getPartitionElement();

    @objid ("95b869a1-425c-44af-aa36-586fa78cd70f")
    void setPartitionElement(ModelElement value);

    @objid ("9fe866d8-1c5f-44fd-8117-3fdf36056490")
    EList<BpmnFlowElement> getFlowElementRef();

    @objid ("3d1b5519-2cb9-4813-96b7-fa298dfc9f74")
    <T extends BpmnFlowElement> List<T> getFlowElementRef(java.lang.Class<T> filterClass);

    @objid ("76ffa3ce-2582-4b1c-aa88-a05a83ce8032")
    BpmnLaneSet getLaneSet();

    @objid ("e8b575e1-db45-4959-b515-9e4ab78c0c37")
    void setLaneSet(BpmnLaneSet value);

}
