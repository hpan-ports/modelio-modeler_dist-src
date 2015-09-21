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
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionSpecification;

/**
 * ExecutionOccurenceSpecification v0.0.9054
 * 
 * 
 * An execution occurence specification is a kind of message end. It specifies the occurrence of message events, such as sending and receiving signals or invoking or receiving operation calls. 
 * 
 * Messages are generated either by synchronous operation calls or asynchronous signal sends. They are received by the execution of corresponding accept event actions.
 * 
 * It can also represent an execution occurrence specification : in other words, it can represent a moment in time at which actions or behaviors start or finish.
 */
@objid ("00444a76-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExecutionOccurenceSpecification extends MessageEnd {
    @objid ("e1ca2bb2-37e5-4422-9de3-e18087fb6377")
    public static final String MNAME = "ExecutionOccurenceSpecification";

    /**
     * Getter for relation 'ExecutionOccurenceSpecification->Finished'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a57108b1-198b-425d-9912-4a434d7dc348")
    ExecutionSpecification getFinished();

    /**
     * Setter for relation 'ExecutionOccurenceSpecification->Finished'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("885c424b-9c40-4b09-a8fe-cce915fdd2b7")
    void setFinished(ExecutionSpecification value);

    /**
     * Getter for relation 'ExecutionOccurenceSpecification->Started'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("62980392-9ed8-4175-8a96-015e11c293b0")
    ExecutionSpecification getStarted();

    /**
     * Setter for relation 'ExecutionOccurenceSpecification->Started'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("dd02fcc9-b953-456c-8d4c-18a0fe487b7f")
    void setStarted(ExecutionSpecification value);

}
