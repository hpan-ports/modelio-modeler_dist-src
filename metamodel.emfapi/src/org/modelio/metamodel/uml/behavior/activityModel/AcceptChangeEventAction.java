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
 * AcceptChangeEventAction v0.0.9054
 * 
 * 
 * A change event occurs when the Boolean-valued expression becomes true. For example, as a result of a change in the value held in a slot corresponding to an attribute, or a change in the value referenced by a link corresponding to an association. 
 * 
 * A change event is raised implicitly and is not the result of an explicit action. 
 * 
 * Each time the value of the change expression changes from false to true, the change event action is triggered.
 */
@objid ("00249514-c4bf-1fd8-97fe-001ec947cd2a")
public interface AcceptChangeEventAction extends ActivityAction {
    @objid ("da7641b8-7b2f-4cb6-a775-47eee595014e")
    public static final String MNAME = "AcceptChangeEventAction";

    /**
     * Getter for attribute 'AcceptChangeEventAction.ChangeExpresion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("35f3936c-ee7a-463e-9610-aa9567ff3c61")
    String getChangeExpresion();

    /**
     * Setter for attribute 'AcceptChangeEventAction.ChangeExpresion'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d7d1eaf7-361b-4848-a6ee-c42fcb2ba504")
    void setChangeExpresion(String value);

}
