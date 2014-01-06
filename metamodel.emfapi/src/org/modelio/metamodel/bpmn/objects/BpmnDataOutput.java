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
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.uml.statik.Parameter;

@objid ("0005b81a-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataOutput extends BpmnItemAwareElement {
    @objid ("ebacf819-5c78-4d00-b7e9-6e1e67497a3f")
    Parameter getRepresentedParameter();

    @objid ("79d09522-10a0-4694-9bbb-75e4841091c8")
    void setRepresentedParameter(Parameter value);

    @objid ("fc1b0167-444b-48a5-9157-2da03edf32fc")
    BpmnActivity getOwnerActivity();

    @objid ("cda2fb2d-3aa5-41df-b331-177204e1767f")
    void setOwnerActivity(BpmnActivity value);

    @objid ("a8115fbd-8af6-407d-865a-163c77586ab4")
    BpmnCatchEvent getCatched();

    @objid ("5b269ae6-8f3f-400a-96ac-373e668764f4")
    void setCatched(BpmnCatchEvent value);

    @objid ("4f0b8711-a466-4ebe-8b3e-d4af5bcaa383")
    BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics();

    @objid ("3773ff4f-7d12-426f-a0e7-bd9d331a553c")
    void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value);

}
