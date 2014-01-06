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
package org.modelio.metamodel.uml.infrastructure.matrix;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;

@objid ("1b70521e-83b3-42a8-a6ca-a0b86b8dc3ea")
public interface QueryDefinition extends Element {
    @objid ("840ef7c9-07c9-4722-a097-bffb3a4dcf39")
    boolean isUsingAdditions();

    @objid ("39582192-fab8-4924-b0cb-a3262b079e9d")
    void setUsingAdditions(boolean value);

    @objid ("9749b6d0-6582-4a5d-9fb5-c6b1f6df2aff")
    EList<Element> getAdded();

    @objid ("57f116a9-592b-4988-9fbd-3ed5b4930ae3")
    <T extends Element> List<T> getAdded(java.lang.Class<T> filterClass);

    @objid ("7bb9793b-66fc-4aea-9183-8b9e81168322")
    ExternProcessor getProcessor();

    @objid ("9766caac-00d0-48c9-8e70-737a09af3604")
    void setProcessor(ExternProcessor value);

    @objid ("8e6fd26d-5455-4995-88cd-5f13054ac67a")
    PropertyTable getParameters();

    @objid ("9e3a87df-d120-4738-b97a-acf57828d04a")
    void setParameters(PropertyTable value);

    @objid ("8bf5c030-63e4-40a4-9a07-1e31ade40a6a")
    MatrixDefinition getOwnerAsLine();

    @objid ("a3acfbb9-bbb2-444a-aab3-a9eb0c80f02a")
    void setOwnerAsLine(MatrixDefinition value);

    @objid ("1ba6990f-a4cc-4b61-bfc3-ef3e25001037")
    MatrixDefinition getOwnerAsCol();

    @objid ("87325326-8044-4c4e-bb12-9f0e89a5f2f2")
    void setOwnerAsCol(MatrixDefinition value);

    @objid ("d87edb3e-7e61-48db-9964-cbb2a9b8125c")
    MatrixDefinition getOwnerAsDepth();

    @objid ("40186232-c87f-4a36-a3c1-0e34bae584ab")
    void setOwnerAsDepth(MatrixDefinition value);

}
