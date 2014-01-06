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
/*   Metamodel version: 9019              */
/*   SemGen version   : 2.0.07.9012       */
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.modelio.metamodel.uml.statik.InterfaceRealization;
import org.modelio.metamodel.uml.statik.ProvidedInterface;
import org.modelio.metamodel.uml.statik.RequiredInterface;

@objid ("000e151e-c4bf-1fd8-97fe-001ec947cd2a")
public interface Interface extends GeneralClass {
    @objid ("d346f683-bd98-4f81-97a0-235c6c5b3981")
    EList<RequiredInterface> getRequiring();

    @objid ("767c7b60-ac6e-44ac-a142-c65c561f4815")
    <T extends RequiredInterface> List<T> getRequiring(java.lang.Class<T> filterClass);

    @objid ("010df0f6-fdcc-4e23-a765-d2a49d05e887")
    EList<InterfaceRealization> getImplementedLink();

    @objid ("07d91b7d-a279-40f6-9318-00afde657e6d")
    <T extends InterfaceRealization> List<T> getImplementedLink(java.lang.Class<T> filterClass);

    @objid ("38b95f20-d23c-4362-8e65-0abc6d9e7680")
    EList<ProvidedInterface> getProviding();

    @objid ("fcb3b6f6-d5dc-4da5-9a27-c8d2739b63b9")
    <T extends ProvidedInterface> List<T> getProviding(java.lang.Class<T> filterClass);

}
