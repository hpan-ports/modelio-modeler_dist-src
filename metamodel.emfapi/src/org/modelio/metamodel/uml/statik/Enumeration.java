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
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.mda.ModuleParameter;
import org.modelio.metamodel.uml.statik.EnumerationLiteral;

/**
 * Enumeration v0.0.9054
 * 
 * 
 * An Enumeration corresponds to C++ or Java enum, or equivalent types in Pascal, Ada or any other language. 
 * 
 * In Modelio, an Enumeration belongs to its NameSpace.
 */
@objid ("000981a2-c4bf-1fd8-97fe-001ec947cd2a")
public interface Enumeration extends GeneralClass {
    @objid ("7c126abc-37f2-476c-bf28-bbc3eb501002")
    public static final String MNAME = "Enumeration";

    /**
     * Getter for relation 'Enumeration->Value'
     * 
     * Metamodel description:
     * <i>Link to the "Literal", which represents the possible values of the type representatives.</i>
     */
    @objid ("c7ce3193-b12e-4551-a314-304e2972ed76")
    EList<EnumerationLiteral> getValue();

    /**
     * Filtered Getter for relation 'Enumeration->Value'
     * 
     * Metamodel description:
     * <i>Link to the "Literal", which represents the possible values of the type representatives.</i>
     */
    @objid ("1c0dddc7-2df0-4ded-8e29-633dfc6f695a")
    <T extends EnumerationLiteral> List<T> getValue(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Enumeration->OccurenceConfigParam'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1fa6bb3a-4d34-40a6-8f1e-423a141bce27")
    EList<ModuleParameter> getOccurenceConfigParam();

    /**
     * Filtered Getter for relation 'Enumeration->OccurenceConfigParam'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4a483599-ab06-4474-a4a4-2d3a3070e2dd")
    <T extends ModuleParameter> List<T> getOccurenceConfigParam(java.lang.Class<T> filterClass);

}
