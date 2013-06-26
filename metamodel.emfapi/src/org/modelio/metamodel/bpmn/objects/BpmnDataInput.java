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
package org.modelio.metamodel.bpmn.objects;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("00065874-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataInput extends BpmnItemAwareElement {
    @objid ("1fbee4ba-4e06-4f39-9698-7abc511743af")
    Parameter getRepresentedParameter();

    @objid ("7e31c188-958f-4bff-a4ac-0ad73ddf5236")
    void setRepresentedParameter(Parameter value);

    @objid ("ac00a841-bb47-4604-97aa-ec8bac62b727")
    BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics();

    @objid ("d23c7cf9-9d82-4146-9800-8bbef99141ab")
    void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value);

    @objid ("954668eb-4bd5-4257-9878-e4a9a30e13be")
    BpmnActivity getOwnerActivity();

    @objid ("8449d384-e6a2-47b8-ba07-c090acd4ee23")
    void setOwnerActivity(BpmnActivity value);

    @objid ("c8518a42-6b5a-4020-a03d-2d8755565044")
    BpmnThrowEvent getOwnerThrowEvent();

    @objid ("5cb27170-bc36-40d7-b87e-8fa0b9a5d326")
    void setOwnerThrowEvent(BpmnThrowEvent value);

}
