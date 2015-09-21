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
import org.modelio.metamodel.uml.statik.Operation;

/**
 * AcceptCallEventAction v0.0.9054
 * 
 * 
 * AcceptCallAction is an accept event action representing the receipt of a synchronous call request. In addition to the normal operation parameters, the action produces an output that is needed later to supply the information to the ReplyAction necessary to return control to the caller.
 * 
 * This action is for synchronous calls. If it is used to handle an asynchronous call, execution of the subsequent reply action will complete immediately with no effects.
 */
@objid ("00241b8e-c4bf-1fd8-97fe-001ec947cd2a")
public interface AcceptCallEventAction extends ActivityAction {
    @objid ("90f665d0-b748-45db-904c-b91576108b02")
    public static final String MNAME = "AcceptCallEventAction";

    /**
     * Getter for relation 'AcceptCallEventAction->Called'
     * 
     * Metamodel description:
     * <i>The Operation invoked by the call event.</i>
     */
    @objid ("0bde9763-75ce-41d7-880d-ca6a64163dd6")
    Operation getCalled();

    /**
     * Setter for relation 'AcceptCallEventAction->Called'
     * 
     * Metamodel description:
     * <i>The Operation invoked by the call event.</i>
     */
    @objid ("c63173a7-076f-4188-a2fb-39571aad9b2c")
    void setCalled(Operation value);

}
