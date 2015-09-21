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
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;

/**
 * ExecutionSpecification v0.0.9054
 * 
 * 
 * An ExecutionSpecification is a specification of the execution of a unit of behavior or action within the Lifeline. The duration of an ExecutionSpecification is represented by two ExecutionOccurrenceSpecifications, the start ExecutionOccurrenceSpecification and the finish ExecutionOccurrenceSpecification.
 */
@objid ("0044c988-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExecutionSpecification extends InteractionFragment {
    @objid ("98384b5f-b08e-4b50-82ea-704bf50b4aca")
    public static final String MNAME = "ExecutionSpecification";

    /**
     * Getter for relation 'ExecutionSpecification->Finish'
     * 
     * Metamodel description:
     * <i>References the OccurrenceSpecification that designates the completion of the execution.</i>
     */
    @objid ("febb094d-3baa-4504-ad40-f4561faee624")
    ExecutionOccurenceSpecification getFinish();

    /**
     * Setter for relation 'ExecutionSpecification->Finish'
     * 
     * Metamodel description:
     * <i>References the OccurrenceSpecification that designates the completion of the execution.</i>
     */
    @objid ("74512d43-bbaf-43cf-9865-20f8f909075e")
    void setFinish(ExecutionOccurenceSpecification value);

    /**
     * Getter for relation 'ExecutionSpecification->Start'
     * 
     * Metamodel description:
     * <i>References the OccurrenceSpecification that designates the start of the execution.</i>
     */
    @objid ("fa574585-78c0-4ad6-891d-d434e761d1b1")
    ExecutionOccurenceSpecification getStart();

    /**
     * Setter for relation 'ExecutionSpecification->Start'
     * 
     * Metamodel description:
     * <i>References the OccurrenceSpecification that designates the start of the execution.</i>
     */
    @objid ("51dffd1a-86a5-42e1-920c-c91bbb79f5fd")
    void setStart(ExecutionOccurenceSpecification value);

}
