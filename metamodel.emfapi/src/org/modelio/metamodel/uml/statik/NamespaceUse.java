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
import org.modelio.metamodel.uml.infrastructure.Element;
import org.modelio.metamodel.uml.statik.NameSpace;

@objid ("0012264a-c4bf-1fd8-97fe-001ec947cd2a")
public interface NamespaceUse extends Element {
    @objid ("70d65bf6-ffb0-4f43-80e6-4604c22bad10")
    NameSpace getUser();

    @objid ("8428ba36-597c-4283-bc87-b942b74ec6dc")
    void setUser(NameSpace value);

    @objid ("11ce6df7-e07f-459a-881b-c434482e829e")
    NameSpace getUsed();

    @objid ("1b3010af-4d33-4a0e-8217-82be167c2a46")
    void setUsed(NameSpace value);

    @objid ("d11922bc-2d4d-48c1-834f-4db89912fe8f")
    EList<Element> getCause();

    @objid ("955ff3cb-176f-46cb-b59f-c5bc8dcb027d")
    <T extends Element> List<T> getCause(java.lang.Class<T> filterClass);

}
