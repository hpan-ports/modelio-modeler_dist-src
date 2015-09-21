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
package org.modelio.metamodel.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.analyst.AnalystProject;
import org.modelio.metamodel.analyst.Term;

/**
 * Dictionary v0.0.9054
 * 
 * 
 * A Dictionary can contain Terms and other Dictionaries. Its purpose can be described in the Text attribute. 
 * 
 * A Dictionary belongs to its parent Dictionary, except for the root Dictionary, which belongs to the AnalystProject.
 * 
 * A Dictionary can be typed. In this case, all owned dictionaries and terms must have the same type. It then also has a default PropertyValueSet, which stores all PropertySet property default values (see PropertyValue). This default PropertyValueSet is then used to initialize new Term property values and Dictionary default values.
 */
@objid ("005b9e06-c4bf-1fd8-97fe-001ec947cd2a")
public interface Dictionary extends AnalystContainer {
    @objid ("095aad5b-8826-487e-adf1-9925ad289360")
    public static final String MNAME = "Dictionary";

    /**
     * Getter for relation 'Dictionary->OwnedDictionary'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("113ea5af-f86b-487c-9974-041a95949b15")
    EList<Dictionary> getOwnedDictionary();

    /**
     * Filtered Getter for relation 'Dictionary->OwnedDictionary'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("79796059-9853-4af8-9dcd-3869be4dcb9f")
    <T extends Dictionary> List<T> getOwnedDictionary(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Dictionary->OwnerDictionary'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("6d2558c2-cd3b-4aac-832c-de950391faca")
    Dictionary getOwnerDictionary();

    /**
     * Setter for relation 'Dictionary->OwnerDictionary'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("28b54559-4957-424f-85f6-09ffd6b7d4ae")
    void setOwnerDictionary(Dictionary value);

    /**
     * Getter for relation 'Dictionary->OwnerProject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("8e656ac1-6027-4ebe-87de-e15b4d4ea668")
    AnalystProject getOwnerProject();

    /**
     * Setter for relation 'Dictionary->OwnerProject'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1a5be801-ac42-4c9e-bb7a-8d9507216687")
    void setOwnerProject(AnalystProject value);

    /**
     * Getter for relation 'Dictionary->OwnedTerm'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fe5715f5-636a-4ca6-9a6d-9900851d81b4")
    EList<Term> getOwnedTerm();

    /**
     * Filtered Getter for relation 'Dictionary->OwnedTerm'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e39d458c-ed32-49c2-b59a-255f8d122196")
    <T extends Term> List<T> getOwnedTerm(java.lang.Class<T> filterClass);

}
