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
package org.modelio.metamodel.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperator;

@objid ("00435a1c-c4bf-1fd8-97fe-001ec947cd2a")
public interface CombinedFragment extends InteractionFragment {
    @objid ("d5cbab87-f59b-4457-ae1a-f6ff5451de01")
    InteractionOperator getOperator();

    @objid ("0bd9aaa6-52ff-4b8c-9d0e-9d102955591d")
    void setOperator(InteractionOperator value);

    @objid ("067712c0-1a63-4a93-97e4-d188ba6e2754")
    EList<InteractionOperand> getOperand();

    @objid ("6c7219d1-dd5e-4600-b4f8-a419ff1ef6c8")
    <T extends InteractionOperand> List<T> getOperand(java.lang.Class<T> filterClass);

    @objid ("52e0be70-4ed3-43df-8d97-66f63ebd3122")
    EList<Gate> getFragmentGate();

    @objid ("398266fc-bdd2-497e-bf1e-431fb3a9a066")
    <T extends Gate> List<T> getFragmentGate(java.lang.Class<T> filterClass);

}
