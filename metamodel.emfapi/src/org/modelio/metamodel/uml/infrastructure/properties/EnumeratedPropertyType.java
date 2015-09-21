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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyEnumerationLitteral;

/**
 * EnumeratedPropertyType v0.0.9054
 * 
 * 
 * Enumerated property type. Owns the literals that are allowed as property values.
 */
@objid ("00706656-ec87-1098-b22e-001ec947cd2a")
public interface EnumeratedPropertyType extends PropertyType {
    @objid ("7f91248e-e558-47d1-8d66-1a0ce6612b5e")
    public static final String MNAME = "EnumeratedPropertyType";

    /**
     * Returns the literal represented by 's' or null if not found
     * @param s @return
     */
    @objid ("980fb52a-eaee-4290-b6b6-bde39e3d8dc7")
    PropertyEnumerationLitteral getLitteral(String s);

    /**
     * Getter for relation 'EnumeratedPropertyType->Litteral'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("85814ae4-5927-4ba8-b999-fc9cc64ba76f")
    EList<PropertyEnumerationLitteral> getLitteral();

    /**
     * Filtered Getter for relation 'EnumeratedPropertyType->Litteral'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("429bc933-1188-40a0-8b20-0b644c724877")
    <T extends PropertyEnumerationLitteral> List<T> getLitteral(java.lang.Class<T> filterClass);

}
