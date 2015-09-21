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
package org.modelio.metamodel.uml.behavior.interactionModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * StateInvariant v0.0.9054
 * 
 * 
 * A StateInvariant is a runtime constraint on the participants of the interaction. It may be used to specify a variety of different kinds of constraints, such as values of attributes or variables, internal or external states, and so on.
 * 
 * A StateInvariant is an InteractionFragment and is placed on a Lifeline.
 */
@objid ("004b7b34-c4bf-1fd8-97fe-001ec947cd2a")
public interface StateInvariant extends OccurrenceSpecification {
    @objid ("e39514d1-1660-48a8-87b1-f14c31c59629")
    public static final String MNAME = "StateInvariant";

    /**
     * Getter for attribute 'StateInvariant.Body'
     * 
     * Metamodel description:
     * <i>A Constraint that should hold at runtime for this StateInvariant.</i>
     */
    @objid ("953e68ca-6d97-46e6-ab94-ba50e0e55128")
    String getBody();

    /**
     * Setter for attribute 'StateInvariant.Body'
     * 
     * Metamodel description:
     * <i>A Constraint that should hold at runtime for this StateInvariant.</i>
     */
    @objid ("0082e361-e40a-43cd-b351-73f748e1b9a0")
    void setBody(String value);

    /**
     * Getter for attribute 'StateInvariant.EndLineNumber'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0d71ef02-a8be-48d1-84f8-f55bf5e49d85")
    int getEndLineNumber();

    /**
     * Setter for attribute 'StateInvariant.EndLineNumber'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f48ed00f-8141-4583-aff5-7a30f40991e4")
    void setEndLineNumber(int value);

}
