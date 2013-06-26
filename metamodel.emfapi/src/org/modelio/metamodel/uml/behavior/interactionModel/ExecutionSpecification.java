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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.behavior.interactionModel.ExecutionOccurenceSpecification;

@objid ("0044c988-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExecutionSpecification extends InteractionFragment {
    @objid ("09946a81-7f84-423b-b8a5-3fe394f7d08e")
    ExecutionOccurenceSpecification getFinish();

    @objid ("90668055-bed6-40be-928c-db0a0b90ff2f")
    void setFinish(ExecutionOccurenceSpecification value);

    @objid ("d8c4623c-c8b3-4aa4-ba6c-2035647954b0")
    ExecutionOccurenceSpecification getStart();

    @objid ("287a76e3-e824-464e-9fc7-99edb2ff3876")
    void setStart(ExecutionOccurenceSpecification value);

}
