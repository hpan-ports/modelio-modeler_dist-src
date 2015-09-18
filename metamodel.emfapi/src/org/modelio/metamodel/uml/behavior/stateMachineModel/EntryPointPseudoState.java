/*
 * Copyright 2013 Modeliosoft
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
package org.modelio.metamodel.uml.behavior.stateMachineModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ConnectionPointReference;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;

@objid ("004f3f3a-c4bf-1fd8-97fe-001ec947cd2a")
public interface EntryPointPseudoState extends AbstractPseudoState {
    @objid ("8bd51b0f-26f2-464c-9f54-bfbdc9c18752")
    State getEntryOf();

    @objid ("30d338a5-f53a-4160-b2c9-771395176b81")
    void setEntryOf(State value);

    @objid ("cd003d48-21d5-4745-af63-74af2ca0499f")
    EList<ConnectionPointReference> getConnection();

    @objid ("d3213bb3-4017-4958-93ec-b4d7a683e305")
    <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass);

    @objid ("9a1439af-4fa2-4618-966e-e258d3af9cc7")
    StateMachine getEntryOfMachine();

    @objid ("1024c6dd-5f91-4ba7-8cb6-d447b27fdbad")
    void setEntryOfMachine(StateMachine value);

}
