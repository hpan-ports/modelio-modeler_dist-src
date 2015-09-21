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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;

/**
 * PropertyContainer v0.0.9054
 * 
 * 
 * A PropertyContainer can contain a PropertySet or a PropertyType.
 */
@objid ("0062d8ba-c4bf-1fd8-97fe-001ec947cd2a")
public interface PropertyContainer extends ModelElement {
    @objid ("448f0ca7-3ed7-4d96-b0a7-7c4561b6e95e")
    public static final String MNAME = "PropertyContainer";

    /**
     * Getter for relation 'PropertyContainer->DefinedTable'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8108c9e1-71e5-4eb8-ba08-d3802003a3fb")
    EList<PropertyTableDefinition> getDefinedTable();

    /**
     * Filtered Getter for relation 'PropertyContainer->DefinedTable'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c2f7e730-8753-4887-92ef-bf635805cc2d")
    <T extends PropertyTableDefinition> List<T> getDefinedTable(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'PropertyContainer->OwnerProject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4040289b-a3c9-4212-8fe6-30bb4c3d071b")
    AnalystProject getOwnerProject();

    /**
     * Setter for relation 'PropertyContainer->OwnerProject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0ba87dd6-0e25-4595-939d-51e51c67d9bf")
    void setOwnerProject(AnalystProject value);

    /**
     * Getter for relation 'PropertyContainer->DefinedType'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("f817c061-484a-45b5-a3fe-4639671596ee")
    EList<PropertyType> getDefinedType();

    /**
     * Filtered Getter for relation 'PropertyContainer->DefinedType'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("3dea3050-57cd-413f-b9db-3fd273395af4")
    <T extends PropertyType> List<T> getDefinedType(java.lang.Class<T> filterClass);

}
