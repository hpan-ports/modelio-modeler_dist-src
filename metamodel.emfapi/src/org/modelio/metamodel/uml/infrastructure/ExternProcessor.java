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
package org.modelio.metamodel.uml.infrastructure;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixValueDefinition;
import org.modelio.metamodel.uml.infrastructure.matrix.QueryDefinition;

/**
 * ExternProcessor v0.0.9054
 * 
 * 
 * Represents an external processor.
 * 
 * An external processor references a java class that can be executed.
 */
@objid ("e5bf50a8-5a3e-4c5c-9bf8-83310c530ee3")
public interface ExternProcessor extends ModelElement {
    @objid ("74a99319-277b-43a4-a87c-cbb6f9645533")
    public static final String MNAME = "ExternProcessor";

    /**
     * Getter for attribute 'ExternProcessor.ClassName'
     * 
     * Metamodel description:
     * <i>Class name of the external processor.
     * Should be a complete Java class name.</i>
     */
    @objid ("2f8487cd-947a-4385-bcf7-62ae2f8b71af")
    String getClassName();

    /**
     * Setter for attribute 'ExternProcessor.ClassName'
     * 
     * Metamodel description:
     * <i>Class name of the external processor.
     * Should be a complete Java class name.</i>
     */
    @objid ("e3132c3b-18c0-4b55-a4e1-5a126f91a387")
    void setClassName(String value);

    /**
     * Getter for relation 'ExternProcessor->OwnerQuery'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e8df7509-d4c0-4063-91c9-3456da7aadb1")
    QueryDefinition getOwnerQuery();

    /**
     * Setter for relation 'ExternProcessor->OwnerQuery'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("09c37786-b156-4f7e-b73c-8d29a74a75cf")
    void setOwnerQuery(QueryDefinition value);

    /**
     * Getter for relation 'ExternProcessor->OwnerValDef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5694afdc-5b55-4982-abea-d985f1bdc399")
    MatrixValueDefinition getOwnerValDef();

    /**
     * Setter for relation 'ExternProcessor->OwnerValDef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6a53df31-8174-4d36-87cd-1733e783112d")
    void setOwnerValDef(MatrixValueDefinition value);

}
