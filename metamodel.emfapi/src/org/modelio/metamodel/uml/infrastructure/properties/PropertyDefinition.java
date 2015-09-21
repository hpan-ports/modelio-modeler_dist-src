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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;

/**
 * PropertyDefinition v0.0.9054
 * 
 * 
 * null
 */
@objid ("00640c80-ec87-1098-b22e-001ec947cd2a")
public interface PropertyDefinition extends ModelElement {
    @objid ("6afc1a8c-a70c-4c16-a769-7cb0065e24f3")
    public static final String MNAME = "PropertyDefinition";

    /**
     * Getter for attribute 'PropertyDefinition.IsEditable'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("80790fed-0392-49a4-be8d-2c9ccaebf4d6")
    boolean isIsEditable();

    /**
     * Setter for attribute 'PropertyDefinition.IsEditable'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e27e0b67-5625-4590-9c21-dd747ab3f766")
    void setIsEditable(boolean value);

    /**
     * Getter for attribute 'PropertyDefinition.DefaultValue'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ea463e03-661c-42dc-b884-74c37fb045bd")
    String getDefaultValue();

    /**
     * Setter for attribute 'PropertyDefinition.DefaultValue'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f1199d8d-e5fb-49eb-853e-ed82138206f3")
    void setDefaultValue(String value);

    /**
     * Getter for relation 'PropertyDefinition->Type'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("79f396e9-f358-4491-9824-9c00763d1efc")
    PropertyType getType();

    /**
     * Setter for relation 'PropertyDefinition->Type'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("25694b1f-5db1-46eb-98b6-799ec64e16b2")
    void setType(PropertyType value);

    /**
     * Getter for relation 'PropertyDefinition->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e64ec2f9-be40-4752-9f53-17702c44f63e")
    PropertyTableDefinition getOwner();

    /**
     * Setter for relation 'PropertyDefinition->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("510cef67-c086-4309-83ed-b14a28df4f45")
    void setOwner(PropertyTableDefinition value);

}
