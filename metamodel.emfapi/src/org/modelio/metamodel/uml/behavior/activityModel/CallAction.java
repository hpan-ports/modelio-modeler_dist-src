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

/**
 * CallAction v0.0.9054
 */
@objid ("002a65de-c4bf-1fd8-97fe-001ec947cd2a")
public interface CallAction extends ActivityAction {
    @objid ("e0c7be0e-0b5c-4389-ba24-5fc2eaa6fd35")
    public static final String MNAME = "CallAction";

    /**
     * Getter for attribute 'CallAction.IsSynchronous'
     * 
     * Metamodel description:
     * <i>If true, the call is synchronous and the caller waits for completion of the invoked behavior. If false, the call is asynchronous and the caller proceeds immediately and does not expect a return value.</i>
     */
    @objid ("656ca07b-a3ad-4415-9199-4f16f6b7f38c")
    boolean isIsSynchronous();

    /**
     * Setter for attribute 'CallAction.IsSynchronous'
     * 
     * Metamodel description:
     * <i>If true, the call is synchronous and the caller waits for completion of the invoked behavior. If false, the call is asynchronous and the caller proceeds immediately and does not expect a return value.</i>
     */
    @objid ("47d6beea-769a-4f50-9c47-123c69f740ad")
    void setIsSynchronous(boolean value);

}
