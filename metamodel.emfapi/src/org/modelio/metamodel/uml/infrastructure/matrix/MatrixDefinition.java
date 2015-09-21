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
package org.modelio.metamodel.uml.infrastructure.matrix;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;

/**
 * MatrixDefinition v0.0.9054
 * 
 * 
 * Definition of a matrix.
 * 
 * A matrix is defined by a lines columns and the value for a line and a column.
 * Line and column content are each defined by a query definition.
 * The matrix values are defined by a MatrixValueDefniition.
 */
@objid ("8a02f9a1-ae38-48d8-8f92-04ce8b6edc5c")
public interface MatrixDefinition extends ModelElement {
    @objid ("01a21eb5-01ed-41be-ae23-d4cca7740f64")
    public static final String MNAME = "MatrixDefinition";

    /**
     * Getter for relation 'MatrixDefinition->LinesDefinition'
     * 
     * Metamodel description:
     * <i>Lines definition.</i>
     */
    @objid ("6a645175-74a4-48ff-9e1b-790d7a8b2113")
    QueryDefinition getLinesDefinition();

    /**
     * Setter for relation 'MatrixDefinition->LinesDefinition'
     * 
     * Metamodel description:
     * <i>Lines definition.</i>
     */
    @objid ("9fb336be-a6da-436c-8331-06629d2028ec")
    void setLinesDefinition(QueryDefinition value);

    /**
     * Getter for relation 'MatrixDefinition->ColumnsDefinition'
     * 
     * Metamodel description:
     * <i>Columns definition. If not specified, the line definition is used.</i>
     */
    @objid ("527458c1-25a5-44e1-9d08-61098c620312")
    QueryDefinition getColumnsDefinition();

    /**
     * Setter for relation 'MatrixDefinition->ColumnsDefinition'
     * 
     * Metamodel description:
     * <i>Columns definition. If not specified, the line definition is used.</i>
     */
    @objid ("108b92a8-a154-458c-8972-c70fe5057000")
    void setColumnsDefinition(QueryDefinition value);

    /**
     * Getter for relation 'MatrixDefinition->ValuesDefinition'
     * 
     * Metamodel description:
     * <i>Matrix values definition.</i>
     */
    @objid ("58dd7e06-23b8-4f1d-8b3f-a685ceeec6e2")
    MatrixValueDefinition getValuesDefinition();

    /**
     * Setter for relation 'MatrixDefinition->ValuesDefinition'
     * 
     * Metamodel description:
     * <i>Matrix values definition.</i>
     */
    @objid ("226f1479-3f14-458d-99d6-987579af8987")
    void setValuesDefinition(MatrixValueDefinition value);

    /**
     * Getter for relation 'MatrixDefinition->DepthDefinition'
     * 
     * Metamodel description:
     * <i>Depth definition. May be left undefined.</i>
     */
    @objid ("9644f5a4-9c58-40a2-b789-7faba1fd0fd3")
    QueryDefinition getDepthDefinition();

    /**
     * Setter for relation 'MatrixDefinition->DepthDefinition'
     * 
     * Metamodel description:
     * <i>Depth definition. May be left undefined.</i>
     */
    @objid ("fa72d47a-db57-476d-bf6e-dd976c916d9b")
    void setDepthDefinition(QueryDefinition value);

    /**
     * Getter for relation 'MatrixDefinition->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1e952be4-0a48-4ee6-b349-2f5711cfbaa5")
    ModelElement getOwner();

    /**
     * Setter for relation 'MatrixDefinition->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("943f9add-37c5-4866-a9a9-e54d564231fc")
    void setOwner(ModelElement value);

}
