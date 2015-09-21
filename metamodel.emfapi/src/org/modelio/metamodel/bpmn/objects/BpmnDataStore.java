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

/**
 * BpmnDataStore v0.0.9054
 * 
 * 
 * A DataStore provides a mechanism for Activities to retrieve or update stored information that will persist beyond the scope of the Process.
 * 
 * Ownership :
 * 
 * A datastore belongs to a FlowElement container (Process) or a SubProcess
 */
@objid ("0003e1c0-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnDataStore extends BpmnItemAwareElement {
    @objid ("50771b81-6e63-4431-a1a1-f915983b216f")
    public static final String MNAME = "BpmnDataStore";

    /**
     * Getter for attribute 'BpmnDataStore.Capacity'
     * 
     * Metamodel description:
     * <i>Defines the capacity of the Data Store. This is not needed if the isUnlimited attribute is set to true.</i>
     */
    @objid ("6822eaa1-a15b-42db-9d91-0bc9aca7b8f8")
    int getCapacity();

    /**
     * Setter for attribute 'BpmnDataStore.Capacity'
     * 
     * Metamodel description:
     * <i>Defines the capacity of the Data Store. This is not needed if the isUnlimited attribute is set to true.</i>
     */
    @objid ("f0886582-31f6-4dae-bfb7-3691f345b790")
    void setCapacity(int value);

    /**
     * Getter for attribute 'BpmnDataStore.IsUnlimited'
     * 
     * Metamodel description:
     * <i>If isUnlimited is set to true, then the capacity of a Data Store is set as unlimited and will override any value of the capacity attribute.</i>
     */
    @objid ("86c606b3-b5c6-4dfd-a482-5af4e3e4c35d")
    boolean isIsUnlimited();

    /**
     * Setter for attribute 'BpmnDataStore.IsUnlimited'
     * 
     * Metamodel description:
     * <i>If isUnlimited is set to true, then the capacity of a Data Store is set as unlimited and will override any value of the capacity attribute.</i>
     */
    @objid ("c49bed5f-5451-4fb0-82fc-ee6b032ceeae")
    void setIsUnlimited(boolean value);

}
