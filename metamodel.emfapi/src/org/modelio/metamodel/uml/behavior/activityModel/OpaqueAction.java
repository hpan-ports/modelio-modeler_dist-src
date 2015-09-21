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
 * OpaqueAction v0.0.9054
 * 
 * 
 * The semantics of the action are determined by the implementation. OpaqueAction is introduced for implementation-specific actions or for use as a temporary placeholder before some other action is chosen.
 * 
 * Modelio specific:
 * The action may be filled in one language only.
 * Code generation MDA components may allow specific note types in order to allow the user to fill code in their generated language.
 */
@objid ("0039f63e-c4bf-1fd8-97fe-001ec947cd2a")
public interface OpaqueAction extends ActivityAction {
    @objid ("d1684c94-d5e1-4516-9ec0-a8a2626668c9")
    public static final String MNAME = "OpaqueAction";

    /**
     * Getter for attribute 'OpaqueAction.Body'
     * 
     * Metamodel description:
     * <i>Specifies the action in one language.</i>
     */
    @objid ("d01dbead-5774-4ea2-b472-2bfa6b739b0a")
    String getBody();

    /**
     * Setter for attribute 'OpaqueAction.Body'
     * 
     * Metamodel description:
     * <i>Specifies the action in one language.</i>
     */
    @objid ("da64889c-11de-48e7-805e-8b5b27eb6548")
    void setBody(String value);

}
