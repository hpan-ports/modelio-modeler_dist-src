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
 * AcceptTimeEventAction v0.0.9054
 * 
 * 
 * An AcceptTimeEventAction waits for the occurrence of a time event meeting a specified condition. 
 * The time expression specifies a point in time. It can be absolute or can be relative to some other point in time.
 */
@objid ("00258b22-c4bf-1fd8-97fe-001ec947cd2a")
public interface AcceptTimeEventAction extends ActivityAction {
    @objid ("31c03763-84e1-4291-af4c-1ee87f718461")
    public static final String MNAME = "AcceptTimeEventAction";

    /**
     * Getter for attribute 'AcceptTimeEventAction.TimeExpresion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b6824f4b-c784-45d8-b86d-9a5e1d237d12")
    String getTimeExpresion();

    /**
     * Setter for attribute 'AcceptTimeEventAction.TimeExpresion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("66ad90dc-9a4c-4e19-983d-315fd09d0bad")
    void setTimeExpresion(String value);

}
