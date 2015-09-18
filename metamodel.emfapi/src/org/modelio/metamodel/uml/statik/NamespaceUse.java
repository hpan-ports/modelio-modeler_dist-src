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
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.NameSpace;

@objid ("0012264a-c4bf-1fd8-97fe-001ec947cd2a")
public interface NamespaceUse extends Element {
    @objid ("cd9e259f-5317-4cc6-8ef4-2ba371acd592")
    NameSpace getUser();

    @objid ("2ae3fa5d-b58a-406c-a6d3-6663aab128b2")
    void setUser(NameSpace value);

    @objid ("1083590e-d703-454e-a69f-8ac13c5a1ff0")
    NameSpace getUsed();

    @objid ("fa56391b-0303-4973-81a6-768dca9d2528")
    void setUsed(NameSpace value);

    @objid ("dbbf205f-b940-4322-af89-06c405412b46")
    EList<Element> getCause();

    @objid ("18b4be9b-d4fe-4a2f-a39d-5ab6a36ad265")
    <T extends Element> List<T> getCause(java.lang.Class<T> filterClass);

}
