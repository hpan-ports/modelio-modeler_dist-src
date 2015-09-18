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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("004b7b34-c4bf-1fd8-97fe-001ec947cd2a")
public interface StateInvariant extends OccurrenceSpecification {
    @objid ("4c86a10b-ff16-4364-9539-c7217ac0e445")
    String getBody();

    @objid ("9e158233-cef1-4678-be82-625d49ea8f95")
    void setBody(String value);

    @objid ("b4aad570-295c-4eb3-9d6b-7d1c2c0d5fde")
    int getEndLineNumber();

    @objid ("164742d8-9ee6-47f6-b147-1f2d6749642f")
    void setEndLineNumber(int value);

}
