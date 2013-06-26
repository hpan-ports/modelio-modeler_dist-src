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
/*   Metamodel version: 9015              */
/*   SemGen version   : 2.0.06.9012       */
package org.modelio.metamodel.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

@objid ("00891e1c-c4be-1fd8-97fe-001ec947cd2a")
public interface ModelTree extends ModelElement {
    @objid ("0f9350ea-0aaa-4ad2-a0e9-7152eff9080b")
    ModelTree getOwner();

    @objid ("973d46d1-ea42-4697-9b3c-3da75e617e33")
    void setOwner(ModelTree value);

    @objid ("7f7f7f8d-65ff-48a2-b5e9-dbeeb1469eb2")
    EList<ModelTree> getOwnedElement();

    @objid ("63cd7436-900c-4a9e-9a91-dd959bf80775")
    <T extends ModelTree> List<T> getOwnedElement(java.lang.Class<T> filterClass);

}
