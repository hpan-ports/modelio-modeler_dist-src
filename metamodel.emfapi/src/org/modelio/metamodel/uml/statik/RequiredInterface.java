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
 * RequiredInterface v0.0.9054
 */
@objid ("001b5224-c4bf-1fd8-97fe-001ec947cd2a")
public interface RequiredInterface extends ModelElement {
    @objid ("d490737f-4d3a-40d4-adc6-b11b2fe2e4ec")
    public static final String MNAME = "RequiredInterface";

    /**
     * Getter for relation 'RequiredInterface->RequiredElement'
     * 
     * Metamodel description:
     * <i>Interface required by the Port.</i>
     */
    @objid ("2d27bf21-fb5a-4fef-bc92-d7a09206c324")
    EList<Interface> getRequiredElement();

    /**
     * Filtered Getter for relation 'RequiredInterface->RequiredElement'
     * 
     * Metamodel description:
     * <i>Interface required by the Port.</i>
     */
    @objid ("8104f5d5-782c-4060-9318-d5e088fb3f4c")
    <T extends Interface> List<T> getRequiredElement(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'RequiredInterface->Provider'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bd70e00f-ec2c-48c6-80aa-8b76d0ffbc10")
    EList<LinkEnd> getProvider();

    /**
     * Filtered Getter for relation 'RequiredInterface->Provider'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("11956d60-c8a0-48e5-8b91-658dc5fee75b")
    <T extends LinkEnd> List<T> getProvider(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'RequiredInterface->Requiring'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("1d018953-2a1d-49f5-989b-9c6c36560857")
    Port getRequiring();

    /**
     * Setter for relation 'RequiredInterface->Requiring'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("66b83340-2970-4551-a1ef-d4244b7e627f")
    void setRequiring(Port value);

    /**
     * Getter for relation 'RequiredInterface->NaryProvider'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2d6df3f1-b8c7-4333-97e0-3febe7612f76")
    EList<NaryLinkEnd> getNaryProvider();

    /**
     * Filtered Getter for relation 'RequiredInterface->NaryProvider'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("9d64330c-5c04-451c-89b8-700ef9271b6f")
    <T extends NaryLinkEnd> List<T> getNaryProvider(java.lang.Class<T> filterClass);

}
