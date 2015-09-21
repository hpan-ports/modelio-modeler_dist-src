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
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;

/**
 * ConnectionPointReference v0.0.9054
 */
@objid ("004e3efa-c4bf-1fd8-97fe-001ec947cd2a")
public interface ConnectionPointReference extends StateVertex {
    @objid ("073652e9-f2ed-40ff-9c8f-2bad07962ec9")
    public static final String MNAME = "ConnectionPointReference";

    /**
     * Getter for relation 'ConnectionPointReference->Exit'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("fd9853cc-b64d-4b7c-9098-3022342ee98b")
    ExitPointPseudoState getExit();

    /**
     * Setter for relation 'ConnectionPointReference->Exit'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("c58677c1-3dcf-4325-b6d7-2c2f4c7f59e9")
    void setExit(ExitPointPseudoState value);

    /**
     * Getter for relation 'ConnectionPointReference->Entry'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("038d086d-2d22-4a29-8793-a35644a18c47")
    EntryPointPseudoState getEntry();

    /**
     * Setter for relation 'ConnectionPointReference->Entry'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("2420cd73-51cb-4c87-95e1-d979a41c97dc")
    void setEntry(EntryPointPseudoState value);

    /**
     * Getter for relation 'ConnectionPointReference->OwnerState'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("9ae8c1b1-0cad-4c3f-b91b-51b8f54995ae")
    State getOwnerState();

    /**
     * Setter for relation 'ConnectionPointReference->OwnerState'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("4c240058-9a3a-4478-bea5-890452d08c2a")
    void setOwnerState(State value);

}
