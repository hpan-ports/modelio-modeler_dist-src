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
import org.modelio.metamodel.bpmn.activities.BpmnActivity;
import org.modelio.metamodel.bpmn.activities.BpmnMultiInstanceLoopCharacteristics;
import org.modelio.metamodel.bpmn.events.BpmnThrowEvent;
import org.modelio.metamodel.uml.statik.Parameter;

/**
 * BpmnDataInput v0.0.9054
 * 
 * 
 * Activities and Processes often required data in order to execute. In addition they may produce data during or as a result of execution. Data requirements are captured as Data Inputs
 * DataInput elements may appear in a Process diagram to show the inputs to
 * the Process as whole, which are passed along as the inputs of Activities by DataAssociations.
 * 
 * Ownership:
 * A DtaInput is owned by a process, or by an activity.
 */
@objid ("00065874-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataInput extends BpmnItemAwareElement {
    @objid ("0fff9113-c9a1-4340-9a5f-933839daec47")
    public static final String MNAME = "BpmnDataInput";

    /**
     * Getter for relation 'BpmnDataInput->RepresentedParameter'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f509fe85-f6d9-47e0-95d3-40e326683c01")
    Parameter getRepresentedParameter();

    /**
     * Setter for relation 'BpmnDataInput->RepresentedParameter'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9cd5d5b3-c1d1-4391-8b39-a89b0d428220")
    void setRepresentedParameter(Parameter value);

    /**
     * Getter for relation 'BpmnDataInput->OwnerLoopCharacteristics'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("26099856-5631-4671-92eb-f0931323ddb8")
    BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics();

    /**
     * Setter for relation 'BpmnDataInput->OwnerLoopCharacteristics'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a238d8f5-fdf8-4c92-9661-ccd4f0db8708")
    void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value);

    /**
     * Getter for relation 'BpmnDataInput->OwnerActivity'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("01b1f5aa-bcb9-4d89-9df1-d5a873bec245")
    BpmnActivity getOwnerActivity();

    /**
     * Setter for relation 'BpmnDataInput->OwnerActivity'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a09eb58d-21a8-49da-8a8b-d258b7b7d8b7")
    void setOwnerActivity(BpmnActivity value);

    /**
     * Getter for relation 'BpmnDataInput->OwnerThrowEvent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0ecd49a3-3d6d-4262-9b9f-741f4bb48a2f")
    BpmnThrowEvent getOwnerThrowEvent();

    /**
     * Setter for relation 'BpmnDataInput->OwnerThrowEvent'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bb413ab3-4595-4a67-aedf-a28abef4637d")
    void setOwnerThrowEvent(BpmnThrowEvent value);

}
