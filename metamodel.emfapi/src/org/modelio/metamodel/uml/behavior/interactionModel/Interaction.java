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
package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionFragment;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionUse;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;

@objid ("004683fe-c4bf-1fd8-97fe-001ec947cd2a")
public interface Interaction extends Behavior {
    @objid ("39cd649e-0ac1-4836-9d73-a0b6f34c2e8b")
    EList<Gate> getFormalGate();

    @objid ("2cb03e7c-e0d3-44a4-a022-7eb1dd7fba00")
    <T extends Gate> List<T> getFormalGate(java.lang.Class<T> filterClass);

    @objid ("ddd1f31c-582e-4764-88f8-f9ae70ea683d")
    EList<InteractionFragment> getFragment();

    @objid ("e3604248-b32c-495b-95ef-6d24318d2794")
    <T extends InteractionFragment> List<T> getFragment(java.lang.Class<T> filterClass);

    @objid ("82f388ec-b57d-469b-baa6-ea5051dfbd7f")
    EList<Lifeline> getOwnedLine();

    @objid ("a73aebed-135a-48e1-81b0-e80ecf8f2e7f")
    <T extends Lifeline> List<T> getOwnedLine(java.lang.Class<T> filterClass);

    @objid ("720e2459-9240-4afd-9052-30915c042680")
    EList<InteractionUse> getReferedUse();

    @objid ("291c2605-e7a9-40a5-9377-eca251ed1115")
    <T extends InteractionUse> List<T> getReferedUse(java.lang.Class<T> filterClass);

}
