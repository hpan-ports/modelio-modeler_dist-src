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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;

@objid ("004e3efa-c4bf-1fd8-97fe-001ec947cd2a")
public interface ConnectionPointReference extends StateVertex {
    @objid ("3c6db8a4-f6f6-4783-886e-a2354e0e8405")
    ExitPointPseudoState getExit();

    @objid ("0b49945c-05c2-43a8-9509-0c8462837340")
    void setExit(ExitPointPseudoState value);

    @objid ("7cf86e01-4d75-4223-b2e3-55974d4d65d0")
    EntryPointPseudoState getEntry();

    @objid ("edc03ed8-d7dc-46d8-bf64-9a0a8aba5fa5")
    void setEntry(EntryPointPseudoState value);

    @objid ("515b2104-6939-4db2-9f68-222ddb28ddc8")
    State getOwnerState();

    @objid ("4a3a63bc-f81c-4ef2-ac88-0f90cf09bc18")
    void setOwnerState(State value);

}
