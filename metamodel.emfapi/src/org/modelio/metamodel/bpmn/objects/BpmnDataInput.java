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
    @objid ("dddb33a5-9c1f-4d0d-8310-8e070c72f74c")
    Parameter getRepresentedParameter();

    @objid ("8bc5f265-83c1-4395-aada-d47f37de3eb3")
    void setRepresentedParameter(Parameter value);

    @objid ("e2bb8460-bdb6-4e3d-aa6e-ab05ea161e32")
    BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics();

    @objid ("677edd9b-44d4-4d63-b6eb-c4941ec9f034")
    void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value);

    @objid ("be933940-ad6b-47c3-914a-b551f594f7de")
    BpmnActivity getOwnerActivity();

    @objid ("b7883699-e13e-4bbc-ab22-c326fe192b62")
    void setOwnerActivity(BpmnActivity value);

    @objid ("ca7ed8be-a76e-489f-9eeb-696b41e297ad")
    BpmnThrowEvent getOwnerThrowEvent();

    @objid ("eb2f8761-6436-443b-bcad-28666c2d18fe")
    void setOwnerThrowEvent(BpmnThrowEvent value);

}
