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
import org.modelio.metamodel.uml.behavior.interactionModel.Interaction;

@objid ("00482c5e-c4bf-1fd8-97fe-001ec947cd2a")
public interface InteractionUse extends InteractionFragment {
    @objid ("4ab8248b-4987-44fa-b5ad-4315c8b521cc")
    int getEndLineNumber();

    @objid ("bd7d6a34-41a1-46da-987a-53fb96ef99f0")
    void setEndLineNumber(int value);

    @objid ("04c0d8c7-4ec1-4376-aeff-db713ed719de")
    EList<Gate> getActualGate();

    @objid ("ade24e58-3bef-4922-ada8-7ea9c4aac2cf")
    <T extends Gate> List<T> getActualGate(java.lang.Class<T> filterClass);

    @objid ("2e65e71e-772c-432a-a634-4b0ed4054047")
    Interaction getRefersTo();

    @objid ("720f32cc-15df-4c2c-8d49-5e20149fe496")
    void setRefersTo(Interaction value);

}
