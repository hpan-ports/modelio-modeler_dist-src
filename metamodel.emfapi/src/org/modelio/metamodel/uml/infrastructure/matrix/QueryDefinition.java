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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.infrastructure.ExternProcessor;
import org.modelio.metamodel.uml.infrastructure.matrix.MatrixDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTable;

/**
 * QueryDefinition v0.0.9054
 * 
 * 
 * Line or column query definition.
 * 
 * Uses an external processor to execute the query.
 */
@objid ("1b70521e-83b3-42a8-a6ca-a0b86b8dc3ea")
public interface QueryDefinition extends Element {
    @objid ("747173e8-232d-4d95-9fe9-abf3a8f86e9d")
    public static final String MNAME = "QueryDefinition";

    /**
     * Getter for attribute 'QueryDefinition.UsingAdditions'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("aed6bbc1-a083-4362-b043-5fdcf43ea1e0")
    boolean isUsingAdditions();

    /**
     * Setter for attribute 'QueryDefinition.UsingAdditions'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3996b1c6-f51f-45e4-9300-e69f306c6057")
    void setUsingAdditions(boolean value);

    /**
     * Getter for relation 'QueryDefinition->Added'
     * 
     * Metamodel description:
     * <i>Elements manually added to the lines or columns.</i>
     */
    @objid ("7c872567-c795-486c-b672-5912c915eddd")
    EList<Element> getAdded();

    /**
     * Filtered Getter for relation 'QueryDefinition->Added'
     * 
     * Metamodel description:
     * <i>Elements manually added to the lines or columns.</i>
     */
    @objid ("f47be5b0-0768-4fb7-9c84-fea773760bd4")
    <T extends Element> List<T> getAdded(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'QueryDefinition->Processor'
     * 
     * Metamodel description:
     * <i>External processor used to execute the query.</i>
     */
    @objid ("3d0621fa-5936-4977-b870-8ae81df09f74")
    ExternProcessor getProcessor();

    /**
     * Setter for relation 'QueryDefinition->Processor'
     * 
     * Metamodel description:
     * <i>External processor used to execute the query.</i>
     */
    @objid ("5a12ea68-7662-4e88-883b-f9b184d274c3")
    void setProcessor(ExternProcessor value);

    /**
     * Getter for relation 'QueryDefinition->Parameters'
     * 
     * Metamodel description:
     * <i>Parameters to pass to the external processor.</i>
     */
    @objid ("bc11fad2-93d8-4f86-a3db-f8dced18e19f")
    PropertyTable getParameters();

    /**
     * Setter for relation 'QueryDefinition->Parameters'
     * 
     * Metamodel description:
     * <i>Parameters to pass to the external processor.</i>
     */
    @objid ("1d14a0e1-d599-4a17-b1a1-e0ff3c4ee9a6")
    void setParameters(PropertyTable value);

    /**
     * Getter for relation 'QueryDefinition->OwnerAsLine'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ca0412e9-0480-48db-91f2-ad620c9087aa")
    MatrixDefinition getOwnerAsLine();

    /**
     * Setter for relation 'QueryDefinition->OwnerAsLine'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("45444a7b-a72a-48b7-bd67-40cd26985f60")
    void setOwnerAsLine(MatrixDefinition value);

    /**
     * Getter for relation 'QueryDefinition->OwnerAsCol'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d024fe09-b64a-4d1c-a3e3-f7785dd83444")
    MatrixDefinition getOwnerAsCol();

    /**
     * Setter for relation 'QueryDefinition->OwnerAsCol'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("416b6b08-3aed-47b1-af11-7570a381d658")
    void setOwnerAsCol(MatrixDefinition value);

    /**
     * Getter for relation 'QueryDefinition->OwnerAsDepth'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("315fff54-e8dc-4d17-9e29-42367d8f87e9")
    MatrixDefinition getOwnerAsDepth();

    /**
     * Setter for relation 'QueryDefinition->OwnerAsDepth'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6d163abe-41b4-4144-b805-a77e04af229d")
    void setOwnerAsDepth(MatrixDefinition value);

}
