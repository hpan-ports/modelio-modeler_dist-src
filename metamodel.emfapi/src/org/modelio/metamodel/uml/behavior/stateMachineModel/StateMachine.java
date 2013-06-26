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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.KindOfStateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;

@objid ("005404fc-c4bf-1fd8-97fe-001ec947cd2a")
public interface StateMachine extends Behavior {
    @objid ("99c26699-e369-41eb-8141-80aff58c8dff")
    KindOfStateMachine getKind();

    @objid ("0512d2dc-4d37-4fb9-9031-efbc3ec793cf")
    void setKind(KindOfStateMachine value);

    @objid ("072c011e-3cd0-41e5-ad68-c8951c44fe45")
    Region getTop();

    @objid ("ad73ed33-fd65-4fd6-8cb1-8ed8df94a499")
    void setTop(Region value);

    @objid ("8f0bc768-24e4-482a-9344-3d456127e773")
    EList<State> getSubmachineState();

    @objid ("9fba7a8b-329d-4c6c-8314-9c02b2429aea")
    <T extends State> List<T> getSubmachineState(java.lang.Class<T> filterClass);

    @objid ("2c1e23d9-824e-4637-b206-1915cdb0604a")
    EList<EntryPointPseudoState> getEntryPoint();

    @objid ("4af6f6ef-6ef4-421e-bcc3-dca5381f1fa3")
    <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass);

    @objid ("055e4e3e-412c-4bdc-a52a-e5039b7ccd89")
    EList<ExitPointPseudoState> getExitPoint();

    @objid ("b7b8ec4b-4980-483e-9a64-d3ff0433fa53")
    <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass);

}
