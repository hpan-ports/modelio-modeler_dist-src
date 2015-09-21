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
package org.modelio.metamodel.uml.statik;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Attribute;
import org.modelio.metamodel.uml.statik.Instance;

/**
 * AttributeLink v0.0.9054
 * 
 * 
 * An AttributeLink defines an Attribute's value at instance level. AttributeLinks appear attached to Instances or Parts. 
 * 
 * In UML 2.0, attribute links are called slots. 
 * 
 * In Modelio, an AttributeLink belongs to an Instance.
 */
@objid ("009893c4-c4be-1fd8-97fe-001ec947cd2a")
public interface AttributeLink extends ModelElement {
    @objid ("5d5fee56-2e6d-4d45-afe4-2529ead47a66")
    public static final String MNAME = "AttributeLink";

    /**
     * Getter for attribute 'AttributeLink.Value'
     * 
     * Metamodel description:
     * <i>Current value of the Attribute's Slot for the Instance.</i>
     */
    @objid ("021a1bc4-ced6-4f59-839c-2e5f2b666ac5")
    String getValue();

    /**
     * Setter for attribute 'AttributeLink.Value'
     * 
     * Metamodel description:
     * <i>Current value of the Attribute's Slot for the Instance.</i>
     */
    @objid ("8761c3db-0770-46ba-805c-b3c57cabac03")
    void setValue(String value);

    /**
     * Getter for relation 'AttributeLink->Attributed'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9a4811dd-8eba-4a64-9357-4ed23500ecbc")
    Instance getAttributed();

    /**
     * Setter for relation 'AttributeLink->Attributed'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e9970e7b-3502-4650-9ca0-715063ec21b0")
    void setAttributed(Instance value);

    /**
     * Getter for relation 'AttributeLink->Base'
     * 
     * Metamodel description:
     * <i>Defines the optional Attribute that specifies the AttributeLink.</i>
     */
    @objid ("183cfbf6-4174-41e1-8924-2f4cc18651ba")
    Attribute getBase();

    /**
     * Setter for relation 'AttributeLink->Base'
     * 
     * Metamodel description:
     * <i>Defines the optional Attribute that specifies the AttributeLink.</i>
     */
    @objid ("1e042038-5b83-44fa-845c-2878b0ec216d")
    void setBase(Attribute value);

}
