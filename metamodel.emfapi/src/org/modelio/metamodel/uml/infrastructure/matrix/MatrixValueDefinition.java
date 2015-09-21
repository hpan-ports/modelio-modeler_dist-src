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
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;

/**
 * MatrixValueDefinition v0.0.9054
 * 
 * 
 * Definition of a matrix value.
 * 
 * References an external java processor able to compute a matrix value and to modify it.
 */
@objid ("6ae11939-6513-44a4-b535-1daf76e27f63")
public interface MatrixValueDefinition extends Element {
    @objid ("c87a132b-1223-4cc6-82f0-adccb8efe86c")
    public static final String MNAME = "MatrixValueDefinition";

    /**
     * Getter for relation 'MatrixValueDefinition->Processor'
     * 
     * Metamodel description:
     * <i>External java processor that displays and edit matrix values.</i>
     */
    @objid ("413ecfe9-0cac-4152-825c-889c8d3d4d93")
    ExternProcessor getProcessor();

    /**
     * Setter for relation 'MatrixValueDefinition->Processor'
     * 
     * Metamodel description:
     * <i>External java processor that displays and edit matrix values.</i>
     */
    @objid ("acde1ba3-463e-4c11-a26f-fa4a184a0805")
    void setProcessor(ExternProcessor value);

    /**
     * Getter for relation 'MatrixValueDefinition->Parameters'
     * 
     * Metamodel description:
     * <i>Parameters to pass to the external processor.</i>
     */
    @objid ("82b65bc9-d017-42ef-b474-640cfe989f06")
    PropertyTable getParameters();

    /**
     * Setter for relation 'MatrixValueDefinition->Parameters'
     * 
     * Metamodel description:
     * <i>Parameters to pass to the external processor.</i>
     */
    @objid ("27421592-3deb-4a4a-8e47-f9e1d4f63d79")
    void setParameters(PropertyTable value);

    /**
     * Getter for relation 'MatrixValueDefinition->Matrix'
     * 
     * Metamodel description:
     * <i>Matrix owner</i>
     */
    @objid ("af867e35-a368-4bf7-bcc2-b5e5e1553e8e")
    MatrixDefinition getMatrix();

    /**
     * Setter for relation 'MatrixValueDefinition->Matrix'
     * 
     * Metamodel description:
     * <i>Matrix owner</i>
     */
    @objid ("ed02b313-0316-454b-be01-bc883f1f1d0f")
    void setMatrix(MatrixDefinition value);

}
