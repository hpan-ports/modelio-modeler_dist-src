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
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.stateMachineModel.EntryPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.ExitPointPseudoState;
import org.modelio.metamodel.uml.behavior.stateMachineModel.KindOfStateMachine;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.State;

@objid ("005404fc-c4bf-1fd8-97fe-001ec947cd2a")
public interface StateMachine extends Behavior {
    @objid ("c2de35eb-9f8f-40d0-b42b-4ba7e58678b3")
    KindOfStateMachine getKind();

    @objid ("f3f3e127-246d-4411-a47f-1969eb89eb7a")
    void setKind(KindOfStateMachine value);

    @objid ("49bdc1ad-3470-4d07-86d5-cb0ecc14065f")
    Region getTop();

    @objid ("dfa60ced-637d-4c43-aafa-24e8f487a770")
    void setTop(Region value);

    @objid ("d5ba7626-4740-49d2-9d77-fed4ec8c431c")
    EList<State> getSubmachineState();

    @objid ("927298bb-a690-4132-8ec0-77845d09d57b")
    <T extends State> List<T> getSubmachineState(java.lang.Class<T> filterClass);

    @objid ("6732a1bc-3ac1-4c17-b6ae-ff657048cb9b")
    EList<EntryPointPseudoState> getEntryPoint();

    @objid ("5d89797a-0500-4d76-a596-6ab2d5051161")
    <T extends EntryPointPseudoState> List<T> getEntryPoint(java.lang.Class<T> filterClass);

    @objid ("ef595e8e-3937-4805-8781-4bcd7715b131")
    EList<ExitPointPseudoState> getExitPoint();

    @objid ("04b550d7-0a77-4085-99b1-4f1fb56372d2")
    <T extends ExitPointPseudoState> List<T> getExitPoint(java.lang.Class<T> filterClass);

}
