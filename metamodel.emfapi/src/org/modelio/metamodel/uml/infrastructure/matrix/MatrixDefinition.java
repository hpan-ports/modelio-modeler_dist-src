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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;

@objid ("8a02f9a1-ae38-48d8-8f92-04ce8b6edc5c")
public interface MatrixDefinition extends ModelElement {
    @objid ("f925f4fd-8908-4c57-9046-3dd349ca9da9")
    QueryDefinition getLinesDefinition();

    @objid ("391c6c61-cea1-4ed3-b66c-5c8af0d3a3f2")
    void setLinesDefinition(QueryDefinition value);

    @objid ("e5154fb1-386f-43c7-b320-a0cc7e06c684")
    QueryDefinition getColumnsDefinition();

    @objid ("c44fb8e0-590b-4607-b14d-ef706e7723a4")
    void setColumnsDefinition(QueryDefinition value);

    @objid ("b6c63b5c-1eb3-415b-956c-601d16209d37")
    MatrixValueDefinition getValuesDefinition();

    @objid ("41fbd249-b9e7-435c-8091-2e6c77e1c211")
    void setValuesDefinition(MatrixValueDefinition value);

    @objid ("3c17df5f-11a0-4282-8931-dbc3050fcb76")
    QueryDefinition getDepthDefinition();

    @objid ("ef04165f-d7c6-41e5-889f-ddc64b0c74f3")
    void setDepthDefinition(QueryDefinition value);

    @objid ("0d4b48e6-39b3-4387-b7f2-b6da021382bc")
    ModelElement getOwner();

    @objid ("776d84cd-d586-4b3a-a956-313b0b05f227")
    void setOwner(ModelElement value);

}
