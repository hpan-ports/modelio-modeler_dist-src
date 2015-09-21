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
import org.modelio.metamodel.uml.infrastructure.properties.EnumeratedPropertyType;

/**
 * PropertyEnumerationLitteral v0.0.9054
 * 
 * 
 * Enumeration literal for properties. A PropertyEnumerationLitteral belongs to an EnumeratedPropertyType. Its Name attribute gives the literal value.
 */
@objid ("00726262-ec87-1098-b22e-001ec947cd2a")
public interface PropertyEnumerationLitteral extends ModelElement {
    @objid ("725c2498-9d69-4740-af59-29c74bfe34df")
    public static final String MNAME = "PropertyEnumerationLitteral";

    /**
     * Compare 'this' literal with 'v' based on the ordering of the literals in
     * the EnumeratedPropertyType owning 'this' literal.
     * If 'l' does not belong to 'this' owner, the method returns -1 (meaning l < this by convention)
     * @param l @return
     */
    @objid ("3f7c4c9d-6307-4688-9ae7-6d02f373cc0f")
    int compareTo(PropertyEnumerationLitteral l);

    /**
     * Getter for relation 'PropertyEnumerationLitteral->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6971faf9-d330-4968-94f2-32cd3c824e5e")
    EnumeratedPropertyType getOwner();

    /**
     * Setter for relation 'PropertyEnumerationLitteral->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d4ea64bc-b69e-42a6-ad23-77ed4d245403")
    void setOwner(EnumeratedPropertyType value);

}
