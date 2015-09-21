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
package org.modelio.metamodel.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionKind;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionNode;

/**
 * ExpansionRegion v0.0.9054
 * 
 * 
 * null
 */
@objid ("0031bab4-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExpansionRegion extends StructuredActivityNode {
    @objid ("60edfa60-a514-4a49-91ad-d24c8a460373")
    public static final String MNAME = "ExpansionRegion";

    /**
     * Getter for attribute 'ExpansionRegion.Mode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("87e8dd67-d2a5-4efc-a202-49ba106baa65")
    ExpansionKind getMode();

    /**
     * Setter for attribute 'ExpansionRegion.Mode'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c28fa66e-f9b1-4f3e-98d8-62f02fa75be4")
    void setMode(ExpansionKind value);

    /**
     * Getter for relation 'ExpansionRegion->OutputElement'
     * 
     * Metamodel description:
     * <i>An object node that accepts a separate element of the output collection during each of the multiple executions of the 
     * region. The values are formed into a collection that is available when the execution of the region is complete.</i>
     */
    @objid ("fb5a2010-b337-4313-968b-dea41e4aa908")
    EList<ExpansionNode> getOutputElement();

    /**
     * Filtered Getter for relation 'ExpansionRegion->OutputElement'
     * 
     * Metamodel description:
     * <i>An object node that accepts a separate element of the output collection during each of the multiple executions of the 
     * region. The values are formed into a collection that is available when the execution of the region is complete.</i>
     */
    @objid ("afb8cd51-8fa7-4b23-a495-c0fd427df97a")
    <T extends ExpansionNode> List<T> getOutputElement(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ExpansionRegion->InputElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("00f8841e-08af-4a88-afdc-86fc6c1ee3bf")
    EList<ExpansionNode> getInputElement();

    /**
     * Filtered Getter for relation 'ExpansionRegion->InputElement'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c19d4db9-87f7-4bf4-82be-e5e9fd52eb1f")
    <T extends ExpansionNode> List<T> getInputElement(java.lang.Class<T> filterClass);

}
