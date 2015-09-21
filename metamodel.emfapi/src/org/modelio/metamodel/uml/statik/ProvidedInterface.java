/* 
 * Copyright 2013-2015 Modeliosoft
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
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.emf.common.util.EList;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.metamodel.uml.statik.LinkEnd;
import org.modelio.metamodel.uml.statik.NaryLinkEnd;
import org.modelio.metamodel.uml.statik.Port;

/**
 * ProvidedInterface v0.0.9054
 */
@objid ("00198dea-c4bf-1fd8-97fe-001ec947cd2a")
public interface ProvidedInterface extends ModelElement {
    @objid ("7571c67b-18d7-48ca-b278-d71552273a59")
    public static final String MNAME = "ProvidedInterface";

    /**
     * Getter for relation 'ProvidedInterface->ProvidedElement'
     * 
     * Metamodel description:
     * <i>Interface provided by the Port.</i>
     */
    @objid ("16f6ee6f-9136-413b-8cfc-b3956cd228eb")
    EList<Interface> getProvidedElement();

    /**
     * Filtered Getter for relation 'ProvidedInterface->ProvidedElement'
     * 
     * Metamodel description:
     * <i>Interface provided by the Port.</i>
     */
    @objid ("66fbed06-d43f-4084-b4fe-98d81cc829b3")
    <T extends Interface> List<T> getProvidedElement(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ProvidedInterface->Providing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("93a93ae5-55e8-4931-8904-f8705a734344")
    Port getProviding();

    /**
     * Setter for relation 'ProvidedInterface->Providing'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f7918a56-48dc-464f-ae34-cee61346fff5")
    void setProviding(Port value);

    /**
     * Getter for relation 'ProvidedInterface->Consumer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("86391080-6ed1-46a3-8cff-dce67698fbc9")
    EList<LinkEnd> getConsumer();

    /**
     * Filtered Getter for relation 'ProvidedInterface->Consumer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("4ddbb64e-02a8-43a7-b556-66828470363b")
    <T extends LinkEnd> List<T> getConsumer(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'ProvidedInterface->NaryConsumer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("82bfbe6d-9395-4964-95bc-72c4ca2fac89")
    EList<NaryLinkEnd> getNaryConsumer();

    /**
     * Filtered Getter for relation 'ProvidedInterface->NaryConsumer'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7f7e341c-7fd4-4679-8acf-b79740fd88b6")
    <T extends NaryLinkEnd> List<T> getNaryConsumer(java.lang.Class<T> filterClass);

}
