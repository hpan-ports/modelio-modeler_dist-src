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

@objid ("00198dea-c4bf-1fd8-97fe-001ec947cd2a")
public interface ProvidedInterface extends ModelElement {
    @objid ("d7afed85-3460-472a-8181-3019ba04d9ed")
    EList<Interface> getProvidedElement();

    @objid ("2453f3b0-d53d-449b-ba8d-0a5324851c1f")
    <T extends Interface> List<T> getProvidedElement(java.lang.Class<T> filterClass);

    @objid ("4f1767bf-55ad-46a4-a052-76fad351b58c")
    Port getProviding();

    @objid ("74eac836-7afd-4c84-b5e1-a0db0cde9d38")
    void setProviding(Port value);

    @objid ("b627638d-bd99-4d22-adc3-b7d01239e169")
    EList<LinkEnd> getConsumer();

    @objid ("fa98865a-0da8-48f9-a50d-37ca989ae301")
    <T extends LinkEnd> List<T> getConsumer(java.lang.Class<T> filterClass);

    @objid ("f8ef3fe5-7210-4d32-b045-79e3ce141f66")
    EList<NaryLinkEnd> getNaryConsumer();

    @objid ("21edf967-09d7-46ff-af20-85f795ee90dd")
    <T extends NaryLinkEnd> List<T> getNaryConsumer(java.lang.Class<T> filterClass);

}
