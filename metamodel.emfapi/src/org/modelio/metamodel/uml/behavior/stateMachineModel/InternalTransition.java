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
package org.modelio.metamodel.uml.behavior.stateMachineModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;

/**
 * InternalTransition v0.0.9054
 * 
 * 
 * This Transition is related to a State. It can be triggered when entering or exiting the State, or can describe an activity that is performed whilst in the State (do Transitions).  
 * 
 * A Transition belongs to its origin StateVertex.
 */
@objid ("005151a8-c4bf-1fd8-97fe-001ec947cd2a")
public interface InternalTransition extends Transition {
    @objid ("27fbe62e-029b-4d22-b665-a918358c1dd0")
    public static final String MNAME = "InternalTransition";

    /**
     * Getter for relation 'InternalTransition->SComposed'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0312f41e-524c-4b24-9c43-301099b3b713")
    State getSComposed();

    /**
     * Setter for relation 'InternalTransition->SComposed'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e9f278ee-9277-44f8-bf12-1a448c540acd")
    void setSComposed(State value);

}
