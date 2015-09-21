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
import org.modelio.metamodel.uml.statik.Binding;

/**
 * NaryConnector v0.0.9054
 * 
 * 
 * null
 */
@objid ("0005d2fa-c4bf-1fd8-97fe-001ec947cd2a")
public interface NaryConnector extends NaryLink {
    @objid ("404360f2-803e-461d-83ae-cfdb275045b6")
    public static final String MNAME = "NaryConnector";

    /**
     * Getter for relation 'NaryConnector->Representation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("64416d12-2398-4c85-b9ef-18c15cd88794")
    EList<Binding> getRepresentation();

    /**
     * Filtered Getter for relation 'NaryConnector->Representation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a8cdb350-a00c-4a6d-877d-d7f9fd22378d")
    <T extends Binding> List<T> getRepresentation(java.lang.Class<T> filterClass);

    /**
     * Getter for relation 'NaryConnector->RepresentedFeature'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ae7b1293-d825-47f3-87a2-bab26584a675")
    ModelElement getRepresentedFeature();

    /**
     * Setter for relation 'NaryConnector->RepresentedFeature'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5fb0dfcb-d0a2-4701-bd63-9338c04ff577")
    void setRepresentedFeature(ModelElement value);

}
