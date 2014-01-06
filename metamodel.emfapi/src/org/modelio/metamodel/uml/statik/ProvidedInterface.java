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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Port;

@objid ("00198dea-c4bf-1fd8-97fe-001ec947cd2a")
public interface ProvidedInterface extends ModelElement {
    @objid ("812a4fc3-f399-4c5e-bd76-27391195d629")
    EList<Interface> getProvidedElement();

    @objid ("77132d65-894f-4d64-afc0-43f3a92ac15d")
    <T extends Interface> List<T> getProvidedElement(java.lang.Class<T> filterClass);

    @objid ("00be1db1-b77f-4f90-8ccf-30d4497fb4ed")
    Port getProviding();

    @objid ("7f837e56-6601-4f99-9aeb-6c47f4c01a2f")
    void setProviding(Port value);

    @objid ("05829e31-ff15-4fbd-b8a2-0a0cfbe44446")
    EList<LinkEnd> getConsumer();

    @objid ("f9295454-6c9a-40f3-a787-1564813d854a")
    <T extends LinkEnd> List<T> getConsumer(java.lang.Class<T> filterClass);

    @objid ("44ada3fe-afd3-464a-aad2-a51635dd21ae")
    EList<NaryLinkEnd> getNaryConsumer();

    @objid ("b255b772-7a94-4717-b492-7c66331317ad")
    <T extends NaryLinkEnd> List<T> getNaryConsumer(java.lang.Class<T> filterClass);

}
