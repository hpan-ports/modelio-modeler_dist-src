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
package org.modelio.metamodel.uml.infrastructure.properties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;

@objid ("00640c80-ec87-1098-b22e-001ec947cd2a")
public interface PropertyDefinition extends ModelElement {
    @objid ("e775813e-345a-48e8-af5d-a15ddbce2d25")
    boolean isIsEditable();

    @objid ("1d013922-b9fa-49be-b430-c477e953df15")
    void setIsEditable(boolean value);

    @objid ("f178a20a-5dc4-430c-911d-c0a1faaa47bc")
    String getDefaultValue();

    @objid ("33f5f740-5508-492d-a9e7-9393ba2c8d90")
    void setDefaultValue(String value);

    @objid ("4b631554-3366-477d-a292-30dc4cce891c")
    PropertyType getType();

    @objid ("d64c448a-40af-4f20-ac92-3c3f1f5d3856")
    void setType(PropertyType value);

    @objid ("fab09783-6554-4ef0-b9e1-2eb2dacb4153")
    PropertyTableDefinition getOwner();

    @objid ("84b7b0b1-1ff0-4ee7-8ca0-2463500510ec")
    void setOwner(PropertyTableDefinition value);

}
