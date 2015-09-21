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
 * EntryPointPseudoState v0.0.9054
 * 
 * 
 * An entry point pseudostate is an entry point of a state machine or composite state. In each region of the state machine or composite state it has a single transition to a vertex within the same region.
 */
@objid ("004f3f3a-c4bf-1fd8-97fe-001ec947cd2a")
public interface EntryPointPseudoState extends AbstractPseudoState {
    @objid ("738ff1a9-1f21-4769-b859-ed3d6cc17b01")
    public static final String MNAME = "EntryPointPseudoState";

    /**
     * Getter for relation 'EntryPointPseudoState->EntryOf'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("6889b73a-97c9-4577-858a-0eae4be878ed")
    State getEntryOf();

    /**
     * Setter for relation 'EntryPointPseudoState->EntryOf'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("4b011990-a549-4955-8f9d-ba783ca33aab")
    void setEntryOf(State value);

    /**
     * Getter for relation 'EntryPointPseudoState->Connection'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("0dda4773-a354-4c5d-9c05-abd7771dfc3f")
    EList<ConnectionPointReference> getConnection();

    /**
     * Filtered Getter for relation 'EntryPointPseudoState->Connection'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("9e0a832e-a62d-40de-afce-3ba88ae5c7c3")
    <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'EntryPointPseudoState->EntryOfMachine'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a08b16b5-151c-4736-84f2-ef0b4e23d773")
    StateMachine getEntryOfMachine();

    /**
     * Setter for relation 'EntryPointPseudoState->EntryOfMachine'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("79bee5a2-c4e7-41e0-91b0-e6eb66571d9d")
    void setEntryOfMachine(StateMachine value);

}
