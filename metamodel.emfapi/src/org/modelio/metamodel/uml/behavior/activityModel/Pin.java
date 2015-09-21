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
import org.modelio.metamodel.uml.statik.Parameter;

/**
 * Pin v0.0.9054
 * 
 * 
 * A pin represents an input to an action or an output from an action.
 */
@objid ("003b6582-c4bf-1fd8-97fe-001ec947cd2a")
public interface Pin extends ObjectNode {
    @objid ("6a6e697a-7045-45c8-83c0-f288f8fbc043")
    public static final String MNAME = "Pin";

    /**
     * Getter for attribute 'Pin.IsControl'
     * 
     * Metamodel description:
     * <i>Indicates whether the pins provide data to the actions, or just controls when it executes it.</i>
     */
    @objid ("c5ef9387-470f-4193-936c-f6d530ff8b3e")
    boolean isIsControl();

    /**
     * Setter for attribute 'Pin.IsControl'
     * 
     * Metamodel description:
     * <i>Indicates whether the pins provide data to the actions, or just controls when it executes it.</i>
     */
    @objid ("c170bae6-b8ad-499e-87e7-3453658e15c1")
    void setIsControl(boolean value);

    /**
     * Getter for attribute 'Pin.IsExpansion'
     * 
     * Metamodel description:
     * <i>Indicates whether the pin is used for expansion: enables an iteration of the action on the tokens attached to the pin.</i>
     */
    @objid ("c42018b3-25ba-487f-b7d3-4715bfe00cee")
    boolean isIsExpansion();

    /**
     * Setter for attribute 'Pin.IsExpansion'
     * 
     * Metamodel description:
     * <i>Indicates whether the pin is used for expansion: enables an iteration of the action on the tokens attached to the pin.</i>
     */
    @objid ("ca8f9f77-2ae2-47dd-b7c5-9862875103e9")
    void setIsExpansion(boolean value);

    /**
     * Getter for relation 'Pin->Matched'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("aa56954f-3dc5-4080-8b5c-970479d7bddf")
    Parameter getMatched();

    /**
     * Setter for relation 'Pin->Matched'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("60614654-2b4b-4b77-a55d-b1713f3cf3a7")
    void setMatched(Parameter value);

}
