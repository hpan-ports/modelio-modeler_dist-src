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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;

/**
 * CallBehaviorAction v0.0.9054
 * 
 * 
 * CallBehaviorAction is a call action that invokes a behavior directly rather than invoking a behavioral feature that, in turn, results in the invocation of that behavior. The argument values of the action are available to the execution of the invoked behavior. For synchronous calls the execution of the call behavior action waits until the execution of the invoked behavior completes and a result is returned on its output pin. The action completes immediately without a result, if the call is asynchronous.
 */
@objid ("002af378-c4bf-1fd8-97fe-001ec947cd2a")
public interface CallBehaviorAction extends CallAction {
    @objid ("80899afe-763f-4acb-9a15-70d63f74e870")
    public static final String MNAME = "CallBehaviorAction";

    /**
     * Getter for relation 'CallBehaviorAction->Called'
     * 
     * Metamodel description:
     * <i>The invoked behavior. It must be capable of accepting and returning control.</i>
     */
    @objid ("d2e30f86-9c08-46f5-acfc-471f906b0b37")
    Behavior getCalled();

    /**
     * Setter for relation 'CallBehaviorAction->Called'
     * 
     * Metamodel description:
     * <i>The invoked behavior. It must be capable of accepting and returning control.</i>
     */
    @objid ("31c62c68-e694-4976-b02f-fca87bea39c8")
    void setCalled(Behavior value);

}
