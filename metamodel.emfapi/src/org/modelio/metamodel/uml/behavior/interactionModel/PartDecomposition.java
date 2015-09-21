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
package org.modelio.metamodel.uml.behavior.interactionModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;

/**
 * PartDecomposition v0.0.9054
 * 
 * 
 * A Lifeline has a class associated as the type of the Instance that the Lifeline represents. That class may have an internal structure and the PartDecomposition is an Interaction that describes the behavior of that internal structure relative to the Interaction where the decomposition is referenced.
 * 
 * A PartDecomposition is a specialization of InteractionUse. It associates with the Instance that it decomposes.
 */
@objid ("004ae91c-c4bf-1fd8-97fe-001ec947cd2a")
public interface PartDecomposition extends InteractionUse {
    @objid ("07f4da62-3be7-4c6e-af94-939618940104")
    public static final String MNAME = "PartDecomposition";

    /**
     * Getter for relation 'PartDecomposition->Decomposed'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("875eae48-e138-40c2-a1f0-c0c84214cdcd")
    Lifeline getDecomposed();

    /**
     * Setter for relation 'PartDecomposition->Decomposed'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("19e416de-be33-4dec-b841-3ff7ec45641d")
    void setDecomposed(Lifeline value);

}
