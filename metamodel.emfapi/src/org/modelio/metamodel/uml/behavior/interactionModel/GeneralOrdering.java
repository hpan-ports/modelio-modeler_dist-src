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
import org.modelio.metamodel.uml.behavior.interactionModel.OccurrenceSpecification;
import org.modelio.metamodel.uml.infrastructure.Element;

/**
 * GeneralOrdering v0.0.9054
 * 
 * 
 * NOT IMPLEMENTED IN SEQUENCE DIAGRAMS.
 * 
 * This mechanism provides the ability to define partial orders of OccurrenceSpecifications that may otherwise not have a specified order.
 * 
 * A GeneralOrdering may appear anywhere in an Interaction, but only between OccurrenceSpecifications.
 */
@objid ("0045de18-c4bf-1fd8-97fe-001ec947cd2a")
public interface GeneralOrdering extends Element {
    @objid ("fb74329d-8a0b-49ae-95a4-b039a6e2a54c")
    public static final String MNAME = "GeneralOrdering";

    /**
     * Getter for relation 'GeneralOrdering->Before'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3584b3ef-a5e8-4d93-847b-e5f5447d195f")
    OccurrenceSpecification getBefore();

    /**
     * Setter for relation 'GeneralOrdering->Before'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1100d898-3d9b-449b-adac-90dc201ecf6b")
    void setBefore(OccurrenceSpecification value);

    /**
     * Getter for relation 'GeneralOrdering->After'
     * 
     * Metamodel description:
     * <i>The OccurrenceSpecification referred comes after the OccurrenceSpecification referred by before.</i>
     */
    @objid ("756fa356-ce51-431a-a7e5-947b13fb4f1c")
    OccurrenceSpecification getAfter();

    /**
     * Setter for relation 'GeneralOrdering->After'
     * 
     * Metamodel description:
     * <i>The OccurrenceSpecification referred comes after the OccurrenceSpecification referred by before.</i>
     */
    @objid ("a4ab26ff-1486-4548-ac5d-74860a13b20d")
    void setAfter(OccurrenceSpecification value);

}
