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

@objid ("004fc78e-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExitPointPseudoState extends AbstractPseudoState {
    @objid ("e5bdc08f-9b1c-4645-93b9-fbcfead063d8")
    State getExitOf();

    @objid ("e0dd82e5-a45f-4ea8-b99f-2c17fd30ac68")
    void setExitOf(State value);

    @objid ("b51cfe15-82aa-4d3e-b7ce-84a153bcbc09")
    EList<ConnectionPointReference> getConnection();

    @objid ("7639f355-d4ec-4d91-9dc9-fa46f723308d")
    <T extends ConnectionPointReference> List<T> getConnection(java.lang.Class<T> filterClass);

    @objid ("3582ae0c-d251-4b83-8b68-22006dc61616")
    StateMachine getExitOfMachine();

    @objid ("48993ea1-5b9b-4ace-ad57-21c6996e8b47")
    void setExitOfMachine(StateMachine value);

}
