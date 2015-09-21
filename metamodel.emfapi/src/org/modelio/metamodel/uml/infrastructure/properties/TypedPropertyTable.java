/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.infrastructure.properties;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;

/**
 * TypedPropertyTable v0.0.9054
 * 
 * 
 * Property table whose possible keys are restrained to the table definition.
 */
@objid ("006a7cb4-ec87-1098-b22e-001ec947cd2a")
public interface TypedPropertyTable extends PropertyTable {
    @objid ("213c2d46-47f8-456b-97db-9c937cad4d9f")
    public static final String MNAME = "TypedPropertyTable";

    /**
     * Get a property value.
     * @param prop a property.
     * @return its value
     */
    @objid ("054ae888-2834-11e2-bf07-001ec947ccaf")
    String getProperty(PropertyDefinition prop);

    /**
     * Set a property value.
     * @param prop a property.
     * @param value its value.
     */
    @objid ("054ae88c-2834-11e2-bf07-001ec947ccaf")
    void setProperty(PropertyDefinition prop, String value);

    /**
     * Getter for relation 'TypedPropertyTable->Type'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f43ac085-271e-467f-92fb-c5ce95dfc95f")
    PropertyTableDefinition getType();

    /**
     * Setter for relation 'TypedPropertyTable->Type'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a619329b-3957-46fa-aa42-7733ab6a07a3")
    void setType(PropertyTableDefinition value);

}
