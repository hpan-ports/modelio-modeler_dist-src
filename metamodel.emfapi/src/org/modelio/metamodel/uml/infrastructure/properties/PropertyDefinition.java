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
package org.modelio.metamodel.uml.infrastructure.properties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;

@objid ("00640c80-ec87-1098-b22e-001ec947cd2a")
public interface PropertyDefinition extends ModelElement {
    @objid ("ad379e47-3980-40d4-8afd-0d9c378e0f07")
    boolean isIsEditable();

    @objid ("fda81b98-e0af-4edd-9368-8931236cbb7b")
    void setIsEditable(boolean value);

    @objid ("b9b71daf-3634-4bbe-bf85-1bcf714e16a5")
    String getDefaultValue();

    @objid ("8a9b4488-d6f8-4f0e-a8f5-1a5eb998a529")
    void setDefaultValue(String value);

    @objid ("d2ccf09d-b393-4582-94af-a778d7a86a12")
    PropertyType getType();

    @objid ("a9f402a8-30ed-475b-8cfa-cefdf29463c7")
    void setType(PropertyType value);

    @objid ("ab56209b-2989-4f0b-869d-2b68c421cf80")
    PropertyTableDefinition getOwner();

    @objid ("071304cc-26cd-4c8e-85ee-98a18de64160")
    void setOwner(PropertyTableDefinition value);

}
