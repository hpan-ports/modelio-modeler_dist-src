/*
 * Copyright 2013 Modeliosoft
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
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("00891e1c-c4be-1fd8-97fe-001ec947cd2a")
public interface ModelTree extends ModelElement {
    @objid ("1649267d-4cf7-47a0-b24b-096138ee5aeb")
    ModelTree getOwner();

    @objid ("0fd99362-ea29-4201-9e2f-45b92ba378ff")
    void setOwner(ModelTree value);

    @objid ("ce801df4-bd01-41cf-a452-63a63b5e595c")
    EList<ModelTree> getOwnedElement();

    @objid ("97031dfd-b2f5-43c8-8622-575c13a698a1")
    <T extends ModelTree> List<T> getOwnedElement(java.lang.Class<T> filterClass);

}
