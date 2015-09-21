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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.KindOfStateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;

/**
 * StateMachine v0.0.9054
 * 
 * 
 * State diagams can also define usage protocol for Classes.  
 * 
 * In Modelio, a StateMachine belongs to a Package, an Operation, a UseCase or a Class. Its natural position is to belong to a Class.
 */
@objid ("005404fc-c4bf-1fd8-97fe-001ec947cd2a")
public interface StateMachine extends Behavior {
    @objid ("4f0a400b-87ae-4885-8ea5-bd30d6a0c7fa")
    public static final String MNAME = "StateMachine";

    /**
     * Getter for attribute 'StateMachine.Kind'
     * 
     * Metamodel description:
     * <i>A state machine can be a dynamic state machine, as usually defined in UML (Harel state diagrams), or a protocol state machine. Protocol state machines represent the usage protocol of the Class' Operations. It defines in which order and for which condition and state an Operation can be invoked.</i>
     */
    @objid ("4008e7db-781f-4a7c-aebd-f0e1222d4b39")
    KindOfStateMachine getKind();

    /**
     * Setter for attribute 'StateMachine.Kind'
     * 
     * Metamodel description:
     * <i>A state machine can be a dynamic state machine, as usually defined in UML (Harel state diagrams), or a protocol state machine. Protocol state machines represent the usage protocol of the Class' Operations. It defines in which order and for which condition and state an Operation can be invoked.</i>
     */
    @objid ("8d4fce42-06a9-49bf-911d-9909a4a69aa7")
    void setKind(KindOfStateMachine value);

    /**
     * Getter for relation 'StateMachine->Top'
     * 
     * Metamodel description:
     * <i>Defines the root state for the current StateMachine. All other states will be substates of the TopState.</i>
     */
    @objid ("53d3c230-fd84-464c-8610-a813cd4147e3")
    Region getTop();

    /**
     * Setter for relation 'StateMachine->Top'
     * 
     * Metamodel description:
     * <i>Defines the root state for the current StateMachine. All other states will be substates of the TopState.</i>
     */
    @objid ("998e3fb9-c249-4278-962d-4258374b0a47")
    void setTop(Region value);

    /**
     * Getter for relation 'StateMachine->SubmachineState'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("ab559b0a-0e98-4c5f-a3dd-74a2aba223eb")
    EList<State> getSubmachineState();

    /**
     * Filtered Getter for relation 'StateMachine->SubmachineState'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("76008ef1-3380-4d22-a680-2026e6b0a884")
    <T extends State> List<T> getSubmachineState(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'StateMachine->EntryPoint'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("905c9949-dc51-4f68-b9f1-4bc8e4257a4c")
    EList<EntryPointPseudoState> getEntryPoint();

    /**
     * Filtered Getter for relation 'StateMachine->EntryPoint'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c9ffe914-25be-4d88-8220-552853174eef")
    <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'StateMachine->ExitPoint'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3b641093-2c42-40a3-84d9-116599bd66bc")
    EList<ExitPointPseudoState> getExitPoint();

    /**
     * Filtered Getter for relation 'StateMachine->ExitPoint'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("53e3a71d-0f52-4b44-8d85-c00066bbe2df")
    <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass);

}
