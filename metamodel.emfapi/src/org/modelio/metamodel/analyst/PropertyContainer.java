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
    @objid ("f9a4b6c2-bdf3-44fd-bd79-680274f11334")
    EList<PropertyTableDefinition> getDefinedTable();

    @objid ("1930c45a-3a2c-42c7-a19b-9ea9cd4f1abe")
    <T extends PropertyTableDefinition> List<T> getDefinedTable(java.lang.Class<T> filterClass);

    @objid ("21206262-9ccd-4f33-b45a-a0cd39e8a211")
    AnalystProject getOwnerProject();

    @objid ("8ec259ed-e3a2-4120-a841-966f91d2dfd1")
    void setOwnerProject(AnalystProject value);

    @objid ("98abb481-944d-4664-b618-9cfcae4221d3")
    EList<PropertyType> getDefinedType();

    @objid ("cfa1312e-b094-4853-a19d-4eb01c5d4371")
    <T extends PropertyType> List<T> getDefinedType(java.lang.Class<T> filterClass);

}
