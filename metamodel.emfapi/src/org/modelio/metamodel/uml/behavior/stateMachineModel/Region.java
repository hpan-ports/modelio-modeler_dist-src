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
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0056e10e-c4bf-1fd8-97fe-001ec947cd2a")
public interface Region extends ModelElement {
    @objid ("95315de8-c6b6-4a4e-8885-48eaca544917")
    State getParent();

    @objid ("d37f8921-deff-4ca6-a467-f1dd680f0f4c")
    void setParent(State value);

    @objid ("e34125b2-c429-4be8-b790-da83fbec27c5")
    StateMachine getRepresented();

    @objid ("0aa85ea3-9ac6-4beb-8d1c-be7f5cdcdad0")
    void setRepresented(StateMachine value);

    @objid ("0393e910-6b61-4e62-8e56-47db68107f0e")
    EList<StateVertex> getSub();

    @objid ("1e867a29-1c1e-4a4a-ad3d-fceb9026b16f")
    <T extends StateVertex> List<T> getSub(java.lang.Class<T> filterClass);

}
