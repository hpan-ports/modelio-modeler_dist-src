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
package org.modelio.metamodel.bpmn.events;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnEvent;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

@objid ("008d3f9c-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnEventDefinition extends BpmnBaseElement {
    @objid ("7f8a8340-a22e-4bed-a593-adfe799ba106")
    BpmnEvent getDefined();

    @objid ("547fbf17-fbe6-4639-80f0-5caf14f24bb8")
    void setDefined(BpmnEvent value);

    @objid ("cd4e2203-2601-47fa-9796-8d9e55a9684b")
    EList<BpmnMultiInstanceLoopCharacteristics> getLoopRef();

    @objid ("1069cd0a-3702-4922-be97-fb0439432117")
    <T extends BpmnMultiInstanceLoopCharacteristics> List<T> getLoopRef(java.lang.Class<T> filterClass);

}
