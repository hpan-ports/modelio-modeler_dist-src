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

/**
 * LocalPropertyTable v0.0.9054
 * 
 * 
 * Non typed property table that is owned by nobody.
 * <p>
 * This table is not copied nor imported with the element referencing it.
 * This table is not versioned either.
 */
@objid ("006c6ff6-ec87-1098-b22e-001ec947cd2a")
public interface LocalPropertyTable extends PropertyTable {
    @objid ("ae92310e-ef0c-4d04-b5a5-c71062130531")
    public static final String MNAME = "LocalPropertyTable";

    /**
     * Getter for relation 'LocalPropertyTable->LocalAnnoted'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ff7a6f24-f688-454b-8911-7b9e63098f47")
    ModelElement getLocalAnnoted();

    /**
     * Setter for relation 'LocalPropertyTable->LocalAnnoted'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("68c48b22-a4ab-4c49-8d73-abdae95d8605")
    void setLocalAnnoted(ModelElement value);

}
