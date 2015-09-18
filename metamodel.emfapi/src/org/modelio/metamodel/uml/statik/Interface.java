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
    @objid ("1ba866b8-2e6a-4920-b52e-80c0c6efd35e")
    EList<RequiredInterface> getRequiring();

    @objid ("60377a23-4baa-4ab3-8cd7-1ad83445d4f3")
    <T extends RequiredInterface> List<T> getRequiring(java.lang.Class<T> filterClass);

    @objid ("8a04e1f5-5d7b-434d-b501-736a7ec4147a")
    EList<InterfaceRealization> getImplementedLink();

    @objid ("2a40880c-8202-43fc-a8ec-2c132c9c4b69")
    <T extends InterfaceRealization> List<T> getImplementedLink(java.lang.Class<T> filterClass);

    @objid ("218d6d16-ee86-42dc-bd88-4fa54d50611c")
    EList<ProvidedInterface> getProviding();

    @objid ("1b2dd1fc-a9e5-48e2-8bc0-c8cb254642be")
    <T extends ProvidedInterface> List<T> getProviding(java.lang.Class<T> filterClass);

}
