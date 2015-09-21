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
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.metamodel.uml.statik.NaryAssociation;

/**
 * NaryAssociationEnd v0.0.9054
 * 
 * 
 * null
 */
@objid ("00209ca2-c4bf-1fd8-97fe-001ec947cd2a")
public interface NaryAssociationEnd extends StructuralFeature {
    @objid ("49b46121-866f-49e6-9507-2a7b3154ac63")
    public static final String MNAME = "NaryAssociationEnd";

    /**
     * Getter for relation 'NaryAssociationEnd->NaryAssociation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("06191c59-fb95-430a-b42b-9b5b566c9dae")
    NaryAssociation getNaryAssociation();

    /**
     * Setter for relation 'NaryAssociationEnd->NaryAssociation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3cc3d6b5-6e3e-4715-bc8d-601b62b8a59f")
    void setNaryAssociation(NaryAssociation value);

    /**
     * Getter for relation 'NaryAssociationEnd->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("3f2b72bb-a954-4a26-8302-e1d442d4b403")
    Classifier getOwner();

    /**
     * Setter for relation 'NaryAssociationEnd->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("30b69c8a-c588-4617-92f3-27dcf72e7149")
    void setOwner(Classifier value);

}
