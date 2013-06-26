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
    @objid ("0173c144-14ee-4c81-984a-f67635518b16")
    EList<RequiredInterface> getRequiring();

    @objid ("408a90c4-0e16-4d28-9326-fe261e7921f5")
    <T extends RequiredInterface> List<T> getRequiring(java.lang.Class<T> filterClass);

    @objid ("317cffef-ec7a-435e-b94b-bd87826be58c")
    EList<InterfaceRealization> getImplementedLink();

    @objid ("ecb3ed23-5a6b-473d-b35c-8561db218a0c")
    <T extends InterfaceRealization> List<T> getImplementedLink(java.lang.Class<T> filterClass);

    @objid ("1bc344b7-c1b6-4103-ab13-fe433cf98b28")
    EList<ProvidedInterface> getProviding();

    @objid ("2e10c8c5-b891-46b9-829e-8b35314521cc")
    <T extends ProvidedInterface> List<T> getProviding(java.lang.Class<T> filterClass);

}
