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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyType;

@objid ("0062d8ba-c4bf-1fd8-97fe-001ec947cd2a")
public interface PropertyContainer extends ModelElement {
    @objid ("f343d2c7-0679-4c95-b3b0-40c5c455f7ae")
    EList<PropertyTableDefinition> getDefinedTable();

    @objid ("e05b3dc1-ef94-46d0-894b-2985b9bd873c")
    <T extends PropertyTableDefinition> List<T> getDefinedTable(java.lang.Class<T> filterClass);

    @objid ("4f0f396f-2165-4b5f-a4c0-afe6af145da1")
    AnalystProject getOwnerProject();

    @objid ("2d87a959-91cf-4267-9e5e-b172433b3a1e")
    void setOwnerProject(AnalystProject value);

    @objid ("6a18095b-673d-4952-94e5-f311d1324f18")
    EList<PropertyType> getDefinedType();

    @objid ("12dac582-5682-4421-b25f-094d340da0af")
    <T extends PropertyType> List<T> getDefinedType(java.lang.Class<T> filterClass);

}
