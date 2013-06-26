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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("007f7bdc-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnComplexBehaviorDefinition extends BpmnBaseElement {
    @objid ("295ce84b-588f-4a8e-9bb0-27d87573093d")
    String getCondition();

    @objid ("1e3a5a37-8478-41fe-afeb-357eb291e0d0")
    void setCondition(String value);

    @objid ("fe7356e0-05f3-4a7b-8f73-ab53caaade46")
    BpmnMultiInstanceLoopCharacteristics getOwner();

    @objid ("6a68b58f-80f1-45fb-976d-bdeb646664fc")
    void setOwner(BpmnMultiInstanceLoopCharacteristics value);

    @objid ("153c0d4a-0969-4728-a720-29b7a275b1b6")
    BpmnImplicitThrowEvent getEvent();

    @objid ("033c5068-4fca-49db-9dc6-d3f67d6c1740")
    void setEvent(BpmnImplicitThrowEvent value);

}
