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
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;

/**
 * BpmnLoopCharacteristics v0.0.9054
 * 
 * 
 * null
 */
@objid ("007ff738-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnLoopCharacteristics extends BpmnBaseElement {
    @objid ("7a5d1f0a-0303-4770-96fe-33433d2fa878")
    public static final String MNAME = "BpmnLoopCharacteristics";

    /**
     * Getter for relation 'BpmnLoopCharacteristics->OwnerActivity'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4939a685-aba3-44ed-862b-0711c824639a")
    BpmnActivity getOwnerActivity();

    /**
     * Setter for relation 'BpmnLoopCharacteristics->OwnerActivity'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d27a67b6-ee22-4525-9696-567571806e67")
    void setOwnerActivity(BpmnActivity value);

}
