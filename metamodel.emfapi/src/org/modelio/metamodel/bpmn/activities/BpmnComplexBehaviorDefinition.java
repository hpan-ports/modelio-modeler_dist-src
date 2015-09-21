/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnImplicitThrowEvent;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

/**
 * BpmnComplexBehaviorDefinition v0.0.9054
 * 
 * 
 * This element controls when and which Events are thrown in case behavior of the Multi-Instance Activity is set to complex.
 */
@objid ("007f7bdc-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnComplexBehaviorDefinition extends BpmnBaseElement {
    @objid ("0b759883-9629-4346-ac64-1198c96c83b8")
    public static final String MNAME = "BpmnComplexBehaviorDefinition";

    /**
     * Getter for attribute 'BpmnComplexBehaviorDefinition.Condition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0682b05f-e8a6-4849-81d7-3b92772d6516")
    String getCondition();

    /**
     * Setter for attribute 'BpmnComplexBehaviorDefinition.Condition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d57ef7dd-eebe-4154-86d1-e6141f00e780")
    void setCondition(String value);

    /**
     * Getter for relation 'BpmnComplexBehaviorDefinition->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d5765869-2c73-4a3a-95e9-748667592602")
    BpmnMultiInstanceLoopCharacteristics getOwner();

    /**
     * Setter for relation 'BpmnComplexBehaviorDefinition->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cb873346-49b6-4108-b9f0-1fd592eaee57")
    void setOwner(BpmnMultiInstanceLoopCharacteristics value);

    /**
     * Getter for relation 'BpmnComplexBehaviorDefinition->Event'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("367ad058-e952-4b82-876d-6417b7e6764d")
    BpmnImplicitThrowEvent getEvent();

    /**
     * Setter for relation 'BpmnComplexBehaviorDefinition->Event'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e1bc3f92-e076-40e5-a418-55782352f9f1")
    void setEvent(BpmnImplicitThrowEvent value);

}
