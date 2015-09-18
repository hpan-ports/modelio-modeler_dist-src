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
import org.modelio.metamodel.uml.behavior.interactionModel.Gate;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperand;
import org.modelio.metamodel.uml.behavior.interactionModel.InteractionOperator;

@objid ("00435a1c-c4bf-1fd8-97fe-001ec947cd2a")
public interface CombinedFragment extends InteractionFragment {
    @objid ("48f5ad03-838f-44fb-8af1-a7d283daf6e1")
    InteractionOperator getOperator();

    @objid ("7d976dd3-dabc-4175-8a46-7b432e09ecd1")
    void setOperator(InteractionOperator value);

    @objid ("a2246a2a-de42-4f8b-8e71-2e60a9b3aa4f")
    EList<InteractionOperand> getOperand();

    @objid ("18ef52c5-0ef0-464e-9a97-7fc00f103f63")
    <T extends InteractionOperand> List<T> getOperand(java.lang.Class<T> filterClass);

    @objid ("1da6c520-c952-49d1-b903-508b8a19af1d")
    EList<Gate> getFragmentGate();

    @objid ("58708e8d-1285-4ab5-99ab-c4f6c9fda2fb")
    <T extends Gate> List<T> getFragmentGate(java.lang.Class<T> filterClass);

}
