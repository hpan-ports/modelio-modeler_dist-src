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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.KindOfStateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;

@objid ("005404fc-c4bf-1fd8-97fe-001ec947cd2a")
public interface StateMachine extends Behavior {
    @objid ("9db9a735-a528-4e0e-ba6d-9067bcf8fe7c")
    KindOfStateMachine getKind();

    @objid ("3f74cfa8-0928-4a45-9a53-7561b5fc37ab")
    void setKind(KindOfStateMachine value);

    @objid ("59820a82-5d31-41d7-a13d-70acee8a1ea2")
    Region getTop();

    @objid ("1ffd2e1d-89b5-41b9-b84c-7ede6dc3f7dc")
    void setTop(Region value);

    @objid ("f9cf8bdf-1e8d-4c00-b29c-be8876581d71")
    EList<State> getSubmachineState();

    @objid ("cec710b8-e34f-4721-aa8b-2c0f0e9e3b0a")
    <T extends State> List<T> getSubmachineState(java.lang.Class<T> filterClass);

    @objid ("70355193-faf5-4033-87cb-186c33ec9e5f")
    EList<EntryPointPseudoState> getEntryPoint();

    @objid ("e9032dbc-92d8-46e6-8eca-ad46e9d15b07")
    <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass);

    @objid ("4599f2a4-09fa-44d9-b4c7-eacd29dae3c5")
    EList<ExitPointPseudoState> getExitPoint();

    @objid ("16b2e5b5-dfd6-41eb-91bc-92c6b8e711e2")
    <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass);

}
