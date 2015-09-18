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
import org.modelio.metamodel.uml.behavior.stateMachineModel.Region;
import org.modelio.metamodel.uml.behavior.stateMachineModel.Transition;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

@objid ("0054944e-c4bf-1fd8-97fe-001ec947cd2a")
public interface StateVertex extends ModelElement {
    @objid ("2510e610-d5bd-46b5-bfe4-22755e6ed92b")
    EList<Transition> getOutGoing();

    @objid ("52e9aa1c-4ce2-4a6a-b6a3-3f375a602477")
    <T extends Transition> List<T> getOutGoing(java.lang.Class<T> filterClass);

    @objid ("bc740e21-37fe-4a4e-9f79-614811d6cb5c")
    EList<Transition> getIncoming();

    @objid ("02bc8eae-bf73-43b1-a1d5-f375400f687e")
    <T extends Transition> List<T> getIncoming(java.lang.Class<T> filterClass);

    @objid ("b1a3c2ec-d867-4dbf-a7e2-71751725e73b")
    Region getParent();

    @objid ("81bb0b68-f57a-439a-8abd-a1f462c6811d")
    void setParent(Region value);

}
