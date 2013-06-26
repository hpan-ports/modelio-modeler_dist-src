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
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.StateVertex;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0056e10e-c4bf-1fd8-97fe-001ec947cd2a")
public interface Region extends ModelElement {
    @objid ("73085402-fa0b-4ba7-a535-3b259ae6d322")
    State getParent();

    @objid ("0833812b-7496-4fe2-a99b-3f0f1b5ea227")
    void setParent(State value);

    @objid ("24ac4594-5850-42d9-8c00-aeb9421d17c7")
    StateMachine getRepresented();

    @objid ("1a0c7e1d-cdb4-4544-8dcc-f42214d0dafc")
    void setRepresented(StateMachine value);

    @objid ("7355b7ad-4ab1-4615-9dba-309a0610ec2a")
    EList<StateVertex> getSub();

    @objid ("43ca68f7-54eb-491b-8a14-fc013ae173dc")
    <T extends StateVertex> List<T> getSub(java.lang.Class<T> filterClass);

}
