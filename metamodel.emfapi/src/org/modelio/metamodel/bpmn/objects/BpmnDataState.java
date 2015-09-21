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
package org.modelio.metamodel.bpmn.objects;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnItemAwareElement;
import org.modelio.metamodel.bpmn.rootElements.BpmnBaseElement;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;

/**
 * BpmnDataState v0.0.9054
 * 
 * 
 * null
 */
@objid ("00084846-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataState extends BpmnBaseElement {
    @objid ("f5645a91-7b43-4b38-91b1-fa816cca5e71")
    public static final String MNAME = "BpmnDataState";

    /**
     * Getter for relation 'BpmnDataState->Item'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c8d376e4-9340-49a5-b03d-ac98e254de0c")
    BpmnItemAwareElement getItem();

    /**
     * Setter for relation 'BpmnDataState->Item'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0e4b6fd6-5d60-42dc-86b4-087aee57d925")
    void setItem(BpmnItemAwareElement value);

    /**
     * Getter for relation 'BpmnDataState->UmlState'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("24da4803-5e39-46be-8978-6ba3f329b22d")
    State getUmlState();

    /**
     * Setter for relation 'BpmnDataState->UmlState'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bc37ca4a-7d74-45d1-9d7d-0c8e9d4d0a36")
    void setUmlState(State value);

}
