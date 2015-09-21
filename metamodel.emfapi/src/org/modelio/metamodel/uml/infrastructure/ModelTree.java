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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;

/**
 * ModelTree v0.0.9054
 * 
 * 
 * The ElementOwnerShip association provides a hierarchy of ModelElements that can be managed by the model explorer or by the teamwork facility. 
 * 
 * This metaclass is not part of the UML standard. NameSpace is a typical subclass, which takes advantage of the containment facility provided by ModelTree.
 */
@objid ("00891e1c-c4be-1fd8-97fe-001ec947cd2a")
public interface ModelTree extends ModelElement {
    @objid ("b76018e7-5eec-4f30-979f-b3569849001d")
    public static final String MNAME = "ModelTree";

    /**
     * Getter for relation 'ModelTree->Owner'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("3d619101-c794-488b-b78b-64532dd15b0b")
    ModelTree getOwner();

    /**
     * Setter for relation 'ModelTree->Owner'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("517854eb-6692-4e43-a7af-9d5f8533bb63")
    void setOwner(ModelTree value);

    /**
     * Getter for relation 'ModelTree->OwnedElement'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("5d648825-f252-45ef-9651-13a6e134e6eb")
    EList<ModelTree> getOwnedElement();

    /**
     * Filtered Getter for relation 'ModelTree->OwnedElement'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("befde15b-fed9-4bc0-9aab-c0015dd471a0")
    <T extends ModelTree> List<T> getOwnedElement(java.lang.Class<T> filterClass);

}
