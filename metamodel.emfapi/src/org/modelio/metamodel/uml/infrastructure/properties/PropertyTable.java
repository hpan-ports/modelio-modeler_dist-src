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

    @objid ("b9c7be26-bac2-4d32-a66f-28e66b87b1ec")
    String getName();

    @objid ("2f620f99-3ab7-42be-9425-d643509cce9b")
    void setName(String value);

    @objid ("94b0cc90-1c89-4bbb-8aa7-f1e5cfcd23b5")
    String getContent();

    @objid ("c1da0b50-a08d-40c1-9aca-b83789675cb3")
    void setContent(String value);

    @objid ("ce03fe97-38ea-40ce-8a74-d7821a82823d")
    ModelElement getOwner();

    @objid ("7763a21a-8303-40f4-9efe-f9a58109467d")
    void setOwner(ModelElement value);

    @objid ("4162990f-7ccd-4e37-bc88-88a532b8d3d3")
    MatrixValueDefinition getOwnerValDef();

    @objid ("23a010ec-47c3-4a66-be30-ca72b084b35d")
    void setOwnerValDef(MatrixValueDefinition value);

    @objid ("0318cb66-dd82-4c11-8fe4-96b455a81bbc")
    QueryDefinition getOwnerQuery();

    @objid ("532a6771-9b2b-4823-bca3-29eeca1446ab")
    void setOwnerQuery(QueryDefinition value);

}
