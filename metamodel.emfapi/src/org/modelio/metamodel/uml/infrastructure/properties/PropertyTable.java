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

import java.util.Properties;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;

@objid ("00688c1a-ec87-1098-b22e-001ec947cd2a")
public interface PropertyTable extends Element {
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

    @objid ("ae814cd4-12f0-49a1-8947-f5819bf89069")
    String getName();

    @objid ("39e920be-304f-40bf-9b76-0b736a35446d")
    void setName(String value);

    @objid ("7c58dd68-6e17-4afe-8803-ed4941e708d7")
    String getContent();

    @objid ("d934cef9-3392-44a0-b88e-d2fdbae9268a")
    void setContent(String value);

    @objid ("3c9bf617-32ed-48b0-8e48-55be35ea85d0")
    ModelElement getOwner();

    @objid ("e2671ffd-0e1c-4372-aea0-6af31bb725a1")
    void setOwner(ModelElement value);

    @objid ("bfbb8314-0111-4e55-ae03-bdf9d67531e9")
    MatrixValueDefinition getOwnerValDef();

    @objid ("dd10b450-5d07-4180-b40c-2aabc7bc472b")
    void setOwnerValDef(MatrixValueDefinition value);

    @objid ("1caf8bf0-6460-42fc-98bc-0f19d71f95eb")
    QueryDefinition getOwnerQuery();

    @objid ("8eba7733-00ae-4871-96fd-4a6b671582ef")
    void setOwnerQuery(QueryDefinition value);

}
