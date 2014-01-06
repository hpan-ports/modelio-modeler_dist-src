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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0056e10e-c4bf-1fd8-97fe-001ec947cd2a")
public interface Region extends ModelElement {
    @objid ("73916aef-4090-4d7d-9f39-39623e048b16")
    State getParent();

    @objid ("48410b93-59aa-44a8-8896-10e0be2088ea")
    void setParent(State value);

    @objid ("28c4ff2f-c844-4f2c-af87-d5471a2ba79d")
    StateMachine getRepresented();

    @objid ("3b986332-777a-4b06-94d9-4ceb07200293")
    void setRepresented(StateMachine value);

    @objid ("6707de94-d6b0-4f03-92b2-3438b36fd7f8")
    EList<StateVertex> getSub();

    @objid ("2d1d278e-c800-47db-8bbd-cf82a8e0acad")
    <T extends StateVertex> List<T> getSub(java.lang.Class<T> filterClass);

}
