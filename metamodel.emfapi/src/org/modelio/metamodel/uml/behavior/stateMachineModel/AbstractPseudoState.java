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

/**
 * AbstractPseudoState v0.0.9054
 * 
 * 
 * PseudoStates represent every kind of graphical Node in a StateMachine, except States, such as a branch, a fork, and so on. 
 * 
 * Modelio specific:
 * AbstractPseudoState is used to seemlessly migrate old PseudoState elements to the upcoming UML2PseudoState class hierarchy.
 */
@objid ("004d4b30-c4bf-1fd8-97fe-001ec947cd2a")
public interface AbstractPseudoState extends StateVertex {
    @objid ("b61faf21-beb6-4a69-bb0c-02d732610e17")
    public static final String MNAME = "AbstractPseudoState";

}
