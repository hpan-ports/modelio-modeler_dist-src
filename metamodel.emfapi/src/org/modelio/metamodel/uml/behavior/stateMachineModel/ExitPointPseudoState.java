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

@objid ("004fc78e-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExitPointPseudoState extends AbstractPseudoState {
    @objid ("00670025-4345-4894-a9a8-d99539e8998e")
    State getExitOf();

    @objid ("a8315ea6-c777-4d12-80b0-3811628a478d")
    void setExitOf(State value);

    @objid ("eddab16f-5fa1-4275-a892-8cf0baad2004")
    EList<ConnectionPointReference> getConnection();

    @objid ("bd820d11-a809-4a19-adc5-13714a644a9a")
    <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass);

    @objid ("cd29b56c-ed53-4cc9-98cc-0aeb843a6f9d")
    StateMachine getExitOfMachine();

    @objid ("a17f6006-3b6a-4260-929d-9f050b5f1c60")
    void setExitOfMachine(StateMachine value);

}
