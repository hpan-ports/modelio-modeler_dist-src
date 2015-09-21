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

/**
 * BpmnStandardLoopCharacteristics v0.0.9054
 * 
 * 
 * null
 */
@objid ("00839f78-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnStandardLoopCharacteristics extends BpmnLoopCharacteristics {
    @objid ("7c826c20-ae4f-4691-a760-53bca1916b9a")
    public static final String MNAME = "BpmnStandardLoopCharacteristics";

    /**
     * Getter for attribute 'BpmnStandardLoopCharacteristics.TestBefore'
     * 
     * Metamodel description:
     * <i>Flag that controls whether the loop condition is evaluated at the beginning (testBefore = true) or at the end (testBefore = false) of the
     * loop iteration.</i>
     */
    @objid ("5ef9e936-8143-4a84-9620-121464605e56")
    boolean isTestBefore();

    /**
     * Setter for attribute 'BpmnStandardLoopCharacteristics.TestBefore'
     * 
     * Metamodel description:
     * <i>Flag that controls whether the loop condition is evaluated at the beginning (testBefore = true) or at the end (testBefore = false) of the
     * loop iteration.</i>
     */
    @objid ("c2ac1ae0-09b2-460b-a97f-d9f5b79e7b81")
    void setTestBefore(boolean value);

    /**
     * Getter for attribute 'BpmnStandardLoopCharacteristics.LoopCondition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f8788e8b-a96d-4d65-8824-436297bcbfd6")
    String getLoopCondition();

    /**
     * Setter for attribute 'BpmnStandardLoopCharacteristics.LoopCondition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a63b133c-0b64-442b-8465-9888d5ea45da")
    void setLoopCondition(String value);

    /**
     * Getter for attribute 'BpmnStandardLoopCharacteristics.LoopMaximum'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("44cbe92d-08d3-4d4a-aec8-301014edbb7d")
    String getLoopMaximum();

    /**
     * Setter for attribute 'BpmnStandardLoopCharacteristics.LoopMaximum'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4c166472-606b-48a3-8aa2-af1ea994679b")
    void setLoopMaximum(String value);

}
