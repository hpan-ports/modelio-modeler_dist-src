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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Port;

@objid ("001b5224-c4bf-1fd8-97fe-001ec947cd2a")
public interface RequiredInterface extends ModelElement {
    @objid ("ef1a912d-ee55-42fe-9f26-e661a163e2ee")
    EList<Interface> getRequiredElement();

    @objid ("31770e79-b1f9-4cce-b8c6-a302fdb926bf")
    <T extends Interface> List<T> getRequiredElement(java.lang.Class<T> filterClass);

    @objid ("98cf8a3a-4b46-4244-8607-6a2c0a9900ef")
    EList<LinkEnd> getProvider();

    @objid ("3d430ef9-1fb5-4dd2-bf26-9506b5a28a05")
    <T extends LinkEnd> List<T> getProvider(java.lang.Class<T> filterClass);

    @objid ("48970186-dc83-44c7-97c5-efa66fc3c87a")
    Port getRequiring();

    @objid ("dcc74508-b211-4850-be1c-8d9cd793fbfb")
    void setRequiring(Port value);

    @objid ("d3ca8370-a900-44bb-8401-08dad7ed39f7")
    EList<NaryLinkEnd> getNaryProvider();

    @objid ("cb5f3d8d-cfcd-4dc7-aa39-50910600dd0d")
    <T extends NaryLinkEnd> List<T> getNaryProvider(java.lang.Class<T> filterClass);

}
