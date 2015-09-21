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
package org.modelio.metamodel.diagrams;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * ActivityDiagram v0.0.9054
 */
@objid ("0067c92e-c4bf-1fd8-97fe-001ec947cd2a")
public interface ActivityDiagram extends BehaviorDiagram {
    @objid ("9aaa4c80-6790-42a1-9dd1-f091aabe54f4")
    public static final String MNAME = "ActivityDiagram";

    /**
     * Getter for attribute 'ActivityDiagram.IsVertical'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("c6597d1d-d4cd-4fa3-8dc3-17698d07800e")
    boolean isIsVertical();

    /**
     * Setter for attribute 'ActivityDiagram.IsVertical'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("41b24250-2586-42ad-b18d-74725f086460")
    void setIsVertical(boolean value);

}
