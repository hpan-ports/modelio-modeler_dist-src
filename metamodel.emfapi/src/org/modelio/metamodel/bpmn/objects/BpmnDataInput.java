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
    @objid ("215e5423-25da-42f6-bcce-f384b0cfc0a8")
    Parameter getRepresentedParameter();

    @objid ("049b5f62-1b09-4e6e-800e-5ce3bec82178")
    void setRepresentedParameter(Parameter value);

    @objid ("366cbc61-3a35-4bf5-8020-a951ded2fae0")
    BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics();

    @objid ("3fa320b7-12df-4222-96b4-7c21bb59555f")
    void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value);

    @objid ("0e60bbe5-bb38-468e-917c-32ffef986f09")
    BpmnActivity getOwnerActivity();

    @objid ("78401c03-4ba3-4347-b824-f92330a869c5")
    void setOwnerActivity(BpmnActivity value);

    @objid ("339c3689-705d-4096-ad0a-689870038381")
    BpmnThrowEvent getOwnerThrowEvent();

    @objid ("162f7318-d478-4a46-9f4a-30586d624f7a")
    void setOwnerThrowEvent(BpmnThrowEvent value);

}
