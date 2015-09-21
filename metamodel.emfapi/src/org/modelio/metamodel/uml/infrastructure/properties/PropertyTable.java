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

import java.util.Properties;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;

/**
 * PropertyTable v0.0.9054
 * 
 * 
 * Property table
 * <p>
 * A property table has a name and a stores a key/value map.
 */
@objid ("00688c1a-ec87-1098-b22e-001ec947cd2a")
public interface PropertyTable extends Element {
    @objid ("60a4f474-4e25-4b3c-a642-a0b2e3e31f64")
    public static final String MNAME = "PropertyTable";

    /**
     * Get a property value.
     * @param key a property
     * @return its value or <code>null</code>.
     */
    @objid ("5652fdad-2826-11e2-bf07-001ec947ccaf")
    String getProperty(String key);

    /**
     * Set the property table content.
     * @param newContent the new table content.
     */
    @objid ("12071b01-282d-11e2-bf07-001ec947ccaf")
    void setContent(Properties newContent);

    /**
     * Set a property value.
     * @param key a property.
     * @param value its value.
     */
    @objid ("5652fdb0-2826-11e2-bf07-001ec947ccaf")
    void setProperty(String key, String value);

    /**
     * Get a copy of the property table content.
     * <p>
     * Modifying the returned Properties will not have any effect on
     * the PropertyTable.
     * @return a copy of the properties.
     * @throws java.lang.IllegalStateException if the 'Content' attribute has an illegal format.
     * This can only happen if {@link #setContent(String)} is called directly.
     */
    @objid ("5652fdb3-2826-11e2-bf07-001ec947ccaf")
    Properties toProperties() throws IllegalStateException;

    /**
     * Getter for attribute 'PropertyTable.name'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4e5a2065-91fc-496f-8657-b4d7e92c293f")
    String getName();

    /**
     * Setter for attribute 'PropertyTable.name'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("16fc0a94-8670-48c8-bb81-63ae403dec32")
    void setName(String value);

    /**
     * Getter for attribute 'PropertyTable.content'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d5f148c6-3061-451a-b213-d1ceedb8b1a6")
    String getContent();

    /**
     * Setter for attribute 'PropertyTable.content'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cc2c6451-581a-46ea-a497-644b624e767e")
    void setContent(String value);

    /**
     * Getter for relation 'PropertyTable->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7eeb44ed-aeb6-4470-b2f5-b2a9f64dc385")
    ModelElement getOwner();

    /**
     * Setter for relation 'PropertyTable->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e9cfb59b-8b61-41b7-92a6-b9b52256ee0f")
    void setOwner(ModelElement value);

    /**
     * Getter for relation 'PropertyTable->OwnerValDef'
     * 
     * Metamodel description:
     * <i>Matrix value definition owning the property table.</i>
     */
    @objid ("ff00ac20-67b8-4662-b828-e3501ceb3e35")
    MatrixValueDefinition getOwnerValDef();

    /**
     * Setter for relation 'PropertyTable->OwnerValDef'
     * 
     * Metamodel description:
     * <i>Matrix value definition owning the property table.</i>
     */
    @objid ("af9ff0f3-cd19-4444-82b5-01c96c94652a")
    void setOwnerValDef(MatrixValueDefinition value);

    /**
     * Getter for relation 'PropertyTable->OwnerQuery'
     * 
     * Metamodel description:
     * <i>Query owner</i>
     */
    @objid ("96deeb25-5c51-43db-962c-fb338aeb9f35")
    QueryDefinition getOwnerQuery();

    /**
     * Setter for relation 'PropertyTable->OwnerQuery'
     * 
     * Metamodel description:
     * <i>Query owner</i>
     */
    @objid ("1d92b57e-f388-46db-ba80-8cf5536add96")
    void setOwnerQuery(QueryDefinition value);

}
