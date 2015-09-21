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
import org.modelio.metamodel.bpmn.events.BpmnCatchEvent;
import org.modelio.metamodel.uml.statik.Parameter;

/**
 * BpmnDataOutput v0.0.9054
 * 
 * 
 * Activities and Processes often required data in order to execute. In addition they may produce data during or as a result of execution. Data that is produced is captured using Data Outputs
 * 
 * A DataOutput belong either to a process or to an activity.
 */
@objid ("0005b81a-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataOutput extends BpmnItemAwareElement {
    @objid ("71b25dc0-f87b-4944-acd3-5c52a4806f26")
    public static final String MNAME = "BpmnDataOutput";

    /**
     * Getter for relation 'BpmnDataOutput->RepresentedParameter'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8b71e69a-346b-4a60-9e0a-71940ce620de")
    Parameter getRepresentedParameter();

    /**
     * Setter for relation 'BpmnDataOutput->RepresentedParameter'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4c73a61e-38bf-4657-8256-29643cd6c00c")
    void setRepresentedParameter(Parameter value);

    /**
     * Getter for relation 'BpmnDataOutput->OwnerActivity'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b5ec17d4-f6d7-4145-b9aa-30aa976624ba")
    BpmnActivity getOwnerActivity();

    /**
     * Setter for relation 'BpmnDataOutput->OwnerActivity'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1dfbd5c3-ee6f-4344-b5c9-9d244757a97c")
    void setOwnerActivity(BpmnActivity value);

    /**
     * Getter for relation 'BpmnDataOutput->Catched'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8793315b-0f27-4b75-888f-7e07a4fffa94")
    BpmnCatchEvent getCatched();

    /**
     * Setter for relation 'BpmnDataOutput->Catched'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0dc00492-3327-48ff-b687-486b0cfd41a4")
    void setCatched(BpmnCatchEvent value);

    /**
     * Getter for relation 'BpmnDataOutput->OwnerLoopCharacteristics'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9e185bec-e9f3-4d11-9758-59485d0ae225")
    BpmnMultiInstanceLoopCharacteristics getOwnerLoopCharacteristics();

    /**
     * Setter for relation 'BpmnDataOutput->OwnerLoopCharacteristics'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("dea687f8-24ad-4a58-9892-bc4891249db4")
    void setOwnerLoopCharacteristics(BpmnMultiInstanceLoopCharacteristics value);

}
