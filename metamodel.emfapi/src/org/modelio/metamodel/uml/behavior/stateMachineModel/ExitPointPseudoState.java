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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;

/**
 * ExitPointPseudoState v0.0.9054
 * 
 * 
 * An exit point pseudostate is an exit point of a state machine or composite state. Entering an exit point within any region of the composite state or state machine referenced by a submachine state implies the exit of this composite state or submachine state and the triggering of the transition that has this exit point as source in the state machine enclosing the submachine or composite state.
 */
@objid ("004fc78e-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExitPointPseudoState extends AbstractPseudoState {
    @objid ("9b66b00c-bbf5-45c8-b306-c5577587562b")
    public static final String MNAME = "ExitPointPseudoState";

    /**
     * Getter for relation 'ExitPointPseudoState->ExitOf'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("fa60c7a1-8c0b-434e-a019-31b3858b5437")
    State getExitOf();

    /**
     * Setter for relation 'ExitPointPseudoState->ExitOf'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("1b7f2910-2d0d-4446-9706-21e640aca84b")
    void setExitOf(State value);

    /**
     * Getter for relation 'ExitPointPseudoState->Connection'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("9c1e44da-9bb5-48b4-95df-9ba56a1c41f8")
    EList<ConnectionPointReference> getConnection();

    /**
     * Filtered Getter for relation 'ExitPointPseudoState->Connection'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("91451e58-8772-4610-acad-145805d5c094")
    <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ExitPointPseudoState->ExitOfMachine'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9ad1f6e9-1195-4a5f-95f0-d3ba5edd4921")
    StateMachine getExitOfMachine();

    /**
     * Setter for relation 'ExitPointPseudoState->ExitOfMachine'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6fcfd794-f5b6-422b-940a-0c96a1300a2d")
    void setExitOfMachine(StateMachine value);

}
