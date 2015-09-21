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
import org.modelio.metamodel.uml.infrastructure.Constraint;

/**
 * DurationConstraint v0.0.9054
 * 
 * 
 * NOTE : This class is not yet available in Modelio.
 * 
 * A DurationConstraint is a Constraint that must reference 2 MessageEnds.
 * It expresses that the time between 2 MessagesEnds must be comprised between DurationMin and DurationMax.
 * 
 * Modelio specific:
 * DurationConstraint has been greatly simplified to improve its useability : its bounds are expressed directly textually instead of using the IntervalConstraint and DurationIntervals OMG metaclasses.
 */
@objid ("0043d1ea-c4bf-1fd8-97fe-001ec947cd2a")
public interface DurationConstraint extends Constraint {
    @objid ("8aef46a5-dbb6-4df3-bc3f-51553912c824")
    public static final String MNAME = "DurationConstraint";

    /**
     * Getter for attribute 'DurationConstraint.DurationMin'
     * 
     * Metamodel description:
     * <i>The minimum duration between 2 MessageEnds.</i>
     */
    @objid ("0b948de8-41cf-425d-9c61-70f38cc23ef1")
    String getDurationMin();

    /**
     * Setter for attribute 'DurationConstraint.DurationMin'
     * 
     * Metamodel description:
     * <i>The minimum duration between 2 MessageEnds.</i>
     */
    @objid ("b5ba4078-6aa3-441c-a011-4051f4e0438e")
    void setDurationMin(String value);

    /**
     * Getter for attribute 'DurationConstraint.DurationMax'
     * 
     * Metamodel description:
     * <i>The maximum duration between 2 MessageEnds.</i>
     */
    @objid ("8813513d-4609-44d3-847c-20577f953c09")
    String getDurationMax();

    /**
     * Setter for attribute 'DurationConstraint.DurationMax'
     * 
     * Metamodel description:
     * <i>The maximum duration between 2 MessageEnds.</i>
     */
    @objid ("2be67ba6-c9cd-43e5-9cd5-9df9b736d249")
    void setDurationMax(String value);

}
