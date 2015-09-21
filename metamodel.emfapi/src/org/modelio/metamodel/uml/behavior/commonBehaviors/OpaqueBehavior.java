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
package org.modelio.metamodel.uml.behavior.commonBehaviors;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * OpaqueBehavior v0.0.9054
 * 
 * 
 * The semantics of the behavior are determined by the implementation.
 * 
 * MDA components have to provide notes types and tag types to define the semantics.
 */
@objid ("00419286-c4bf-1fd8-97fe-001ec947cd2a")
public interface OpaqueBehavior extends Behavior {
    @objid ("87e2e1c1-9317-4c36-8c14-57180f7b03eb")
    public static final String MNAME = "OpaqueBehavior";

    /**
     * Getter for attribute 'OpaqueBehavior.Body'
     * 
     * Metamodel description:
     * <i>Specifies the behavior in one language.</i>
     */
    @objid ("c297dff1-02df-41a5-be3b-16d66b1c4130")
    String getBody();

    /**
     * Setter for attribute 'OpaqueBehavior.Body'
     * 
     * Metamodel description:
     * <i>Specifies the behavior in one language.</i>
     */
    @objid ("fe76c15a-860a-480d-a082-0288d841ccac")
    void setBody(String value);

}
