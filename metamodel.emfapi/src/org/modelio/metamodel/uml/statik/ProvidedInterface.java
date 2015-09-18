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
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Port;

@objid ("00198dea-c4bf-1fd8-97fe-001ec947cd2a")
public interface ProvidedInterface extends ModelElement {
    @objid ("0e77f1f0-9db5-45e1-9300-b1d60eb05628")
    EList<Interface> getProvidedElement();

    @objid ("b7195bd6-28f0-4394-aaed-556aaa377e43")
    <T extends Interface> List<T> getProvidedElement(java.lang.Class<T> filterClass);

    @objid ("10192957-3538-46bb-a141-94d7bc358bd6")
    Port getProviding();

    @objid ("f1ebd7c1-452e-4556-b91a-2f465929c07e")
    void setProviding(Port value);

    @objid ("c35d14e9-1f26-410d-bb60-e82b6e01d596")
    EList<LinkEnd> getConsumer();

    @objid ("52924eb4-3670-468c-9412-3dc2d1e782d2")
    <T extends LinkEnd> List<T> getConsumer(java.lang.Class<T> filterClass);

    @objid ("86323326-e74a-4488-ac6b-c6e1f605562d")
    EList<NaryLinkEnd> getNaryConsumer();

    @objid ("b3451ec1-2199-43e7-8cc0-788c825203b4")
    <T extends NaryLinkEnd> List<T> getNaryConsumer(java.lang.Class<T> filterClass);

}
