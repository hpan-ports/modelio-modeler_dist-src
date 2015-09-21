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
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.NameSpace;

/**
 * NamespaceUse v0.0.9054
 * 
 * 
 * null
 */
@objid ("0012264a-c4bf-1fd8-97fe-001ec947cd2a")
public interface NamespaceUse extends Element {
    @objid ("07a61baa-32f4-4ef4-be8f-667f2f446958")
    public static final String MNAME = "NamespaceUse";

    /**
     * Getter for relation 'NamespaceUse->User'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d1fae855-5ca1-40c4-8f4a-8c8fc03cd98b")
    NameSpace getUser();

    /**
     * Setter for relation 'NamespaceUse->User'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5472ed21-4615-41c1-bc56-e984e01d49e1")
    void setUser(NameSpace value);

    /**
     * Getter for relation 'NamespaceUse->Used'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3f850c4e-5017-49d9-beb2-300e086a82ea")
    NameSpace getUsed();

    /**
     * Setter for relation 'NamespaceUse->Used'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("32543259-2e61-48f9-8c76-80040468f22d")
    void setUsed(NameSpace value);

    /**
     * Getter for relation 'NamespaceUse->Cause'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c55a5f7d-283f-4e22-b862-049e68d00dd6")
    EList<Element> getCause();

    /**
     * Filtered Getter for relation 'NamespaceUse->Cause'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("15bbbd6b-eb7c-41b6-9052-9602a7cbca1c")
    <T extends Element> List<T> getCause(java.lang.Class<T> filterClass);

}
