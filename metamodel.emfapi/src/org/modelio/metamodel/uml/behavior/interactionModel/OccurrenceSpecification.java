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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.interactionModel.GeneralOrdering;

/**
 * OccurrenceSpecification v0.0.9054
 * 
 * 
 * An OccurrenceSpecification is the basic semantic unit of Interactions. The sequences of occurrences specified by them are the meanings of Interactions.
 * 
 * OccurrenceSpecifications are ordered along a Lifeline.
 */
@objid ("004a586c-c4bf-1fd8-97fe-001ec947cd2a")
public interface OccurrenceSpecification extends InteractionFragment {
    @objid ("80d36b0d-298a-4071-be5a-c03b35848558")
    public static final String MNAME = "OccurrenceSpecification";

    /**
     * Getter for relation 'OccurrenceSpecification->ToAfter'
     * 
     * Metamodel description:
     * <i>NOT TO DOCUMENT : References the GeneralOrderings that specify EventOcurrences that must occur after this OccurrenceSpecification.</i>
     */
    @objid ("4277b4d4-29c8-4dea-b481-a855b58a7f1d")
    EList<GeneralOrdering> getToAfter();

    /**
     * Filtered Getter for relation 'OccurrenceSpecification->ToAfter'
     * 
     * Metamodel description:
     * <i>NOT TO DOCUMENT : References the GeneralOrderings that specify EventOcurrences that must occur after this OccurrenceSpecification.</i>
     */
    @objid ("fec197a1-83c3-4299-bc4f-b205ad87d532")
    <T extends GeneralOrdering> List<T> getToAfter(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'OccurrenceSpecification->ToBefore'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4630a61d-e06f-4b77-a7e7-4409a358bcb5")
    EList<GeneralOrdering> getToBefore();

    /**
     * Filtered Getter for relation 'OccurrenceSpecification->ToBefore'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("18f6ae05-d0bb-4d6b-9908-a4a0de51878e")
    <T extends GeneralOrdering> List<T> getToBefore(java.lang.Class<T> filterClass);

}
