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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.metamodel.uml.statik.NaryAssociation;

/**
 * ClassAssociation v0.0.9054
 * 
 * 
 * A ClassAssociation is represented in UML as a Class that plays the role of an Association.
 * 
 * In Modelio, a ClassAssociation belongs to an Association.
 */
@objid ("0002bc78-c4bf-1fd8-97fe-001ec947cd2a")
public interface ClassAssociation extends ModelElement {
    @objid ("f8fdb408-9aac-42bc-b86a-0d47b8146c67")
    public static final String MNAME = "ClassAssociation";

    /**
     * Getter for relation 'ClassAssociation->NaryAssociationPart'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b771cd17-4490-4a77-94ac-57ed1bb24044")
    NaryAssociation getNaryAssociationPart();

    /**
     * Setter for relation 'ClassAssociation->NaryAssociationPart'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0ac01d64-ea62-45ec-8f74-32eddd84c4fa")
    void setNaryAssociationPart(NaryAssociation value);

    /**
     * Getter for relation 'ClassAssociation->ClassPart'
     * 
     * Metamodel description:
     * <i>Link to the Class that composes the ClassAssociation.</i>
     */
    @objid ("8e457ca7-2417-43a4-8117-a9d752ca09e8")
    Class getClassPart();

    /**
     * Setter for relation 'ClassAssociation->ClassPart'
     * 
     * Metamodel description:
     * <i>Link to the Class that composes the ClassAssociation.</i>
     */
    @objid ("2e24269f-4759-4647-bd7e-555e8c06a804")
    void setClassPart(Class value);

    /**
     * Getter for relation 'ClassAssociation->AssociationPart'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b083246e-fcbd-4afb-8a65-2f0414ea8c99")
    Association getAssociationPart();

    /**
     * Setter for relation 'ClassAssociation->AssociationPart'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cd3e1b8c-e072-4379-8058-edcf1a2ec873")
    void setAssociationPart(Association value);

}
