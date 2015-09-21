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
package org.modelio.metamodel.uml.behavior.activityModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * LoopNode v0.0.9054
 * 
 * 
 * First the setup section of the loop node is executed.
 * 
 * When the setup section has completed execution (if the test comes first) or when the body section has completed execution of an iteration, the test section is executed.
 * 
 * When the test section has completed execution, the Boolean value on the designated test expression is examined. If the value is true, the body section is executed again. If the value is false, execution of the loop node is complete.
 * 
 * Modelio specific : 
 * In order to make the Setup and Test sections easier to fill, these are string expressions in Modelio, instead of a set of activity nodes in the OMG UML specification.
 */
@objid ("00372b20-c4bf-1fd8-97fe-001ec947cd2a")
public interface LoopNode extends StructuredActivityNode {
    @objid ("0aaa0b78-8214-45ce-bcb9-91009378b214")
    public static final String MNAME = "LoopNode";

    /**
     * Getter for attribute 'LoopNode.IsTestedFirst'
     * 
     * Metamodel description:
     * <i>If true, the test is performed before the first execution of the body. If false, the body is executed once before the test is performed. The default value is false. </i>
     */
    @objid ("43f930fa-3be0-4d1b-9891-9edc05366614")
    boolean isIsTestedFirst();

    /**
     * Setter for attribute 'LoopNode.IsTestedFirst'
     * 
     * Metamodel description:
     * <i>If true, the test is performed before the first execution of the body. If false, the body is executed once before the test is performed. The default value is false. </i>
     */
    @objid ("025fff8b-436a-4880-9810-d0bf1c320890")
    void setIsTestedFirst(boolean value);

    /**
     * Getter for attribute 'LoopNode.Setup'
     * 
     * Metamodel description:
     * <i>Section that initialize values or perform other setup computations for the loop.</i>
     */
    @objid ("6a1ef45e-9148-4b7f-8037-cc28eedb1bcf")
    String getSetup();

    /**
     * Setter for attribute 'LoopNode.Setup'
     * 
     * Metamodel description:
     * <i>Section that initialize values or perform other setup computations for the loop.</i>
     */
    @objid ("a9ac2d87-3a08-4245-9656-714453eea723")
    void setSetup(String value);

    /**
     * Getter for attribute 'LoopNode.Test'
     * 
     * Metamodel description:
     * <i>Expression that computes a Boolean value to determine if another execution of the body will be performed.</i>
     */
    @objid ("f2abac4b-4fbd-4fbe-8128-75e6c22fb920")
    String getTest();

    /**
     * Setter for attribute 'LoopNode.Test'
     * 
     * Metamodel description:
     * <i>Expression that computes a Boolean value to determine if another execution of the body will be performed.</i>
     */
    @objid ("3673c583-5a94-459d-bbaf-f834da9b2630")
    void setTest(String value);

}
