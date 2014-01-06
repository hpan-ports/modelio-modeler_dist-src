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
    @objid ("075a10ad-23a6-4025-a10f-c9979ee95435")
    EList<PropertyTableDefinition> getDefinedTable();

    @objid ("33622597-dcf0-4b84-a438-a3ee26019388")
    <T extends PropertyTableDefinition> List<T> getDefinedTable(java.lang.Class<T> filterClass);

    @objid ("74122a33-dc6e-4991-b7a3-7f1841382bc7")
    AnalystProject getOwnerProject();

    @objid ("a972f2ae-7264-457e-bc2d-82a02f0737b3")
    void setOwnerProject(AnalystProject value);

    @objid ("a69be267-cb08-4e52-8e74-cad9b06842da")
    EList<PropertyType> getDefinedType();

    @objid ("cedc5d1b-7f4d-4dc5-8b41-50ef505816ce")
    <T extends PropertyType> List<T> getDefinedType(java.lang.Class<T> filterClass);

}
