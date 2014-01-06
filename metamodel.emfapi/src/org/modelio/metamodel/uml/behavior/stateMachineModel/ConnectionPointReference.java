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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.behavior.stateMachineModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;

@objid ("004e3efa-c4bf-1fd8-97fe-001ec947cd2a")
public interface ConnectionPointReference extends StateVertex {
    @objid ("97210769-8695-4914-b9e9-cd395d5a6da6")
    ExitPointPseudoState getExit();

    @objid ("b0a2920c-e9c8-4230-a034-d63df3c203bf")
    void setExit(ExitPointPseudoState value);

    @objid ("655390bb-2449-40c3-9d0c-2bf594fea7aa")
    EntryPointPseudoState getEntry();

    @objid ("c818e050-0922-46d7-89fc-cec08b686e85")
    void setEntry(EntryPointPseudoState value);

    @objid ("3bb54826-747d-4cf0-810f-c7608528a44b")
    State getOwnerState();

    @objid ("7f487f2c-6abf-4265-9397-68300fd28248")
    void setOwnerState(State value);

}
