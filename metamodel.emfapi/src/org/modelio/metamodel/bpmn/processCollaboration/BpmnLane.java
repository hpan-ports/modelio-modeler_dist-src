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
import org.modelio.metamodel.bpmn.processCollaboration.BpmnLaneSet;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnFlowElement;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("00746c56-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnLane extends BpmnBaseElement {
    @objid ("cee4740e-cdd8-484b-97ff-68313eab59fc")
    BpmnLaneSet getChildLaneSet();

    @objid ("5e4a8942-ca7b-452b-9a4b-1959102ac027")
    void setChildLaneSet(BpmnLaneSet value);

    @objid ("8911ff7c-9d54-4f28-b40a-9af9f88ffc9a")
    ModelElement getPartitionElement();

    @objid ("7da8379b-652d-4b8c-a2aa-ec3e8438c442")
    void setPartitionElement(ModelElement value);

    @objid ("9a24e1a9-08f3-4996-a6c8-ae57141803a6")
    EList<BpmnFlowElement> getFlowElementRef();

    @objid ("e2d41cbf-69a2-472b-8e15-0d627f324e42")
    <T extends BpmnFlowElement> List<T> getFlowElementRef(java.lang.Class<T> filterClass);

    @objid ("5c7dfc39-5295-4ae0-8dbe-2f9c48e74c03")
    BpmnLaneSet getLaneSet();

    @objid ("caf357ee-f609-496c-a8e0-4e439d354bf6")
    void setLaneSet(BpmnLaneSet value);

}
