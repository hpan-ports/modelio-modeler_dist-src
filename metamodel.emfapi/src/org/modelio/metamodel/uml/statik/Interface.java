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
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

/**
 * Interface v0.0.9054
 * 
 * 
 * An Interface specifies a contract. Any Instance of a Classifier that realizes the Interface must fulfill this contract. The obligations that may be associated with an Interface take the form of various kinds of Constraints (such as pre-conditions and post-conditions) or protocol specifications, which may impose ordering restrictions on Interactions through the Interface. 
 * 
 * Since Interfaces are declarations, they are not instanciable. Instead, an Interface specification is implemented by an Instance of an instanciable Classifier, which means that the instanciable Classifier presents a public facade that conforms to the Interface specification. 
 * 
 * Note that a given Classifier may implement more than one Interface and that an Interface may be implemented by a number of different Classifiers.  
 * 
 * Constraints: The visibility of all Features owned by an Interface must be public.
 */
@objid ("000e151e-c4bf-1fd8-97fe-001ec947cd2a")
public interface Interface extends GeneralClass {
    @objid ("cf9d3946-1d10-4782-989c-f23166c85ba1")
    public static final String MNAME = "Interface";

    /**
     * Getter for relation 'Interface->Requiring'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4aa1ff4b-8dd1-4a02-97e6-04ba1d5c4fa2")
    EList<RequiredInterface> getRequiring();

    /**
     * Filtered Getter for relation 'Interface->Requiring'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b3848398-9d00-4f4c-b105-ef162c7b9a03")
    <T extends RequiredInterface> List<T> getRequiring(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Interface->ImplementedLink'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("60a81e8e-2b02-4269-81a7-3bb650271401")
    EList<InterfaceRealization> getImplementedLink();

    /**
     * Filtered Getter for relation 'Interface->ImplementedLink'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c0c36abe-97e8-46c7-b2c5-75d80da0b8fa")
    <T extends InterfaceRealization> List<T> getImplementedLink(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'Interface->Providing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("87b74fcd-1675-4ed3-bfe2-a460300cc9c4")
    EList<ProvidedInterface> getProviding();

    /**
     * Filtered Getter for relation 'Interface->Providing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("06610830-8e8f-4eb7-bb56-a0e742b5d4a1")
    <T extends ProvidedInterface> List<T> getProviding(java.lang.Class<T> filterClass);

}
