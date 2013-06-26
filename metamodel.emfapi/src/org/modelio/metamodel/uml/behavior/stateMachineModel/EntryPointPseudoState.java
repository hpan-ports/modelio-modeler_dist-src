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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
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
    @objid ("dd2dcfe5-6e78-4036-860b-c57686b9809a")
    State getEntryOf();

    @objid ("c83fb809-7179-4d10-954f-1876cadc6dd1")
    void setEntryOf(State value);

    @objid ("2404cb6a-1c70-4def-ab3a-75f1ffd35496")
    EList<ConnectionPointReference> getConnection();

    @objid ("de04a51c-0b37-49e8-9636-470c251265c9")
    <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass);

    @objid ("03c7c946-20b0-46c8-a6c4-7f4d007f9444")
    StateMachine getEntryOfMachine();

    @objid ("bd5cf70b-d28b-4a06-a27e-f4da1e597986")
    void setEntryOfMachine(StateMachine value);

}
