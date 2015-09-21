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
 * CallOperationAction v0.0.9054
 * 
 * 
 * CallOperationAction is an action that transmits an operation call request to the target object, where it may cause the invocation of associated behavior. The argument values of the action are available to the execution of the invoked behavior. If the action is marked synchronous, the execution of the call operation action waits until the execution of the invoked behavior completes and a reply transmission is returned to the caller; otherwise execution of the action is complete when the invocation of the operation is established and the execution of the invoked operation proceeds 
 * concurrently with the execution of the calling behavior. Any values returned as part of the reply transmission are put on the result output pins of the call operation action. Upon receipt of the reply transmission, execution of the call operation action is complete.
 */
@objid ("002b8324-c4bf-1fd8-97fe-001ec947cd2a")
public interface CallOperationAction extends CallAction {
    @objid ("2b5ebb73-51a1-41ac-a027-b113cac2336a")
    public static final String MNAME = "CallOperationAction";

    /**
     * Getter for relation 'CallOperationAction->Called'
     * 
     * Metamodel description:
     * <i>The Operation to be invoked by the action execution.</i>
     */
    @objid ("7827f943-c947-4fe9-9e4f-20eab1f3ff6a")
    Operation getCalled();

    /**
     * Setter for relation 'CallOperationAction->Called'
     * 
     * Metamodel description:
     * <i>The Operation to be invoked by the action execution.</i>
     */
    @objid ("d7edfe88-88e0-44f6-9402-96244d5c66b0")
    void setCalled(Operation value);

}
