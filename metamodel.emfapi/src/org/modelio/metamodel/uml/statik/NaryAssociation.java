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
import org.modelio.metamodel.uml.statik.ClassAssociation;
import org.modelio.metamodel.uml.statik.NaryAssociationEnd;
import org.modelio.metamodel.uml.statik.NaryLink;

/**
 * NaryAssociation v0.0.9054
 * 
 * 
 * null
 */
@objid ("0021601a-c4bf-1fd8-97fe-001ec947cd2a")
public interface NaryAssociation extends ModelElement {
    @objid ("64132394-74f2-4779-8f2b-b9038067b5b3")
    public static final String MNAME = "NaryAssociation";

    /**
     * Getter for relation 'NaryAssociation->Occurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("bfcf9646-714c-4ed7-b936-888c9eb5bed5")
    EList<NaryLink> getOccurence();

    /**
     * Filtered Getter for relation 'NaryAssociation->Occurence'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5a34d701-5d8b-4658-b908-e94cdd32a088")
    <T extends NaryLink> List<T> getOccurence(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NaryAssociation->NaryEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("120988d1-7b6b-4aed-b06a-ba005513b496")
    EList<NaryAssociationEnd> getNaryEnd();

    /**
     * Filtered Getter for relation 'NaryAssociation->NaryEnd'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("7556a78a-7609-4172-87ea-9b23cfcea07f")
    <T extends NaryAssociationEnd> List<T> getNaryEnd(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NaryAssociation->LinkToClass'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("c38d749b-0e1b-4375-a99c-48043197132e")
    ClassAssociation getLinkToClass();

    /**
     * Setter for relation 'NaryAssociation->LinkToClass'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("66af1492-1d17-4d5a-9421-f393a6fbd572")
    void setLinkToClass(ClassAssociation value);

}
