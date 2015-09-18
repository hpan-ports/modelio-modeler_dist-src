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
    @objid ("8e1cf75d-2da0-408f-af68-99eed0bc8345")
    boolean isUsingAdditions();

    @objid ("f4a82796-6d52-4b84-b5d0-c174149a498c")
    void setUsingAdditions(boolean value);

    @objid ("ff42c8b9-8e33-4e2e-9284-e478ce31171a")
    EList<Element> getAdded();

    @objid ("763bb422-6378-462f-ab63-67f415968162")
    <T extends Element> List<T> getAdded(java.lang.Class<T> filterClass);

    @objid ("8411c03d-c450-4810-8da4-d6e3be80765a")
    ExternProcessor getProcessor();

    @objid ("3d2d93e4-8841-4b8b-99d1-85670d901ebd")
    void setProcessor(ExternProcessor value);

    @objid ("112ef889-d9a0-4ba2-8f8d-5f65f6742e0f")
    PropertyTable getParameters();

    @objid ("919e2200-9ff6-4c47-a6da-57f3f59d6f21")
    void setParameters(PropertyTable value);

    @objid ("4e954317-d5ec-4d89-a66a-897796d17c09")
    MatrixDefinition getOwnerAsLine();

    @objid ("d9a3307b-0955-4340-ba2f-018748f81694")
    void setOwnerAsLine(MatrixDefinition value);

    @objid ("edcb7524-81e5-4bb0-b26f-6cf8444db041")
    MatrixDefinition getOwnerAsCol();

    @objid ("aa036384-11d3-4df5-945d-81c4a8a6772b")
    void setOwnerAsCol(MatrixDefinition value);

    @objid ("7ddc4e32-b787-4ec6-a12d-3ae1c28bfdc2")
    MatrixDefinition getOwnerAsDepth();

    @objid ("914ac3d3-42ee-4c33-8e38-b05ec1e5f78d")
    void setOwnerAsDepth(MatrixDefinition value);

}
