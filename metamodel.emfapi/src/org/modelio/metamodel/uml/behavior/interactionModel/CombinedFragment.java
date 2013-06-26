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
    @objid ("62daab0b-1b2b-4df8-83c7-f8e99a099f2c")
    InteractionOperator getOperator();

    @objid ("79c6b9c1-c99f-43f2-b21e-c13070627026")
    void setOperator(InteractionOperator value);

    @objid ("53e341ca-fcd1-458b-a049-a51c879d8e9c")
    EList<InteractionOperand> getOperand();

    @objid ("0a09eb7f-dc68-416c-817b-46f48359e026")
    <T extends InteractionOperand> List<T> getOperand(java.lang.Class<T> filterClass);

    @objid ("beacb103-f28e-4309-ac18-56dab631e1aa")
    EList<Gate> getFragmentGate();

    @objid ("09eb0c6e-da15-42fc-bf09-fddc27c08c68")
    <T extends Gate> List<T> getFragmentGate(java.lang.Class<T> filterClass);

}
