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
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("0005b81a-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataOutput extends BpmnItemAwareElement {
    @objid ("92d1b80e-158d-4b1e-afe0-a3ef37260e4f")
    Parameter getRepresentedParameter();

    @objid ("1986771a-43fb-4780-99f6-30fd40335fb7")
    void setRepresentedParameter(Parameter value);

    @objid ("b4c9fb7c-e815-4726-a9e3-2a9dd1021ac6")
    BpmnActivity getOwnerActivity();

    @objid ("667e43e4-22b0-4e25-87d4-3d463cf5784b")
    void setOwnerActivity(BpmnActivity value);

    @objid ("a1ec47ba-28df-4566-a60a-8c5b3327e0e5")
    BpmnCatchEvent getCatched();

    @objid ("39475cf4-3700-4be7-abc4-a8cc1b003968")
    void setCatched(BpmnCatchEvent value);

    @objid ("7650e901-bedb-4eb3-86bb-8f61376bafcb")
    BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics();

    @objid ("9a0d6037-ac4a-43fb-9bb0-b990f2e20721")
    void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value);

}
