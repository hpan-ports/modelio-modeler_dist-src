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
import org.modelio.metamodel.uml.statik.Artifact;

/**
 * Manifestation v0.0.9054
 * 
 * 
 * An Artifact embodies or manifests a number of ModelElements.  
 * 
 * An Artifact owns Manifestations, each of which represents the utilization of a packageable element. Specific profiles are expected to stereotype the Manifestation relationship to indicate particular forms of Manifestation, for example, <<tool generated>> and <<custom code>> might be two Manifestations for different Classes embodied in an Artifact.  
 * 
 * In Modelio, Manifestation derives directly from ModelElement, because Manifestations can only start from Artifact.
 */
@objid ("00108470-c4bf-1fd8-97fe-001ec947cd2a")
public interface Manifestation extends ModelElement {
    @objid ("4704848c-6eee-4990-a4c8-999d413e7f05")
    public static final String MNAME = "Manifestation";

    /**
     * Getter for relation 'Manifestation->UtilizedElement'
     * 
     * Metamodel description:
     * <i>Elements that are rendered by the Artifact.</i>
     */
    @objid ("58a27027-534e-44bf-97f1-c8c1f6cfe30d")
    ModelElement getUtilizedElement();

    /**
     * Setter for relation 'Manifestation->UtilizedElement'
     * 
     * Metamodel description:
     * <i>Elements that are rendered by the Artifact.</i>
     */
    @objid ("b95de616-f3d0-41c1-b181-05fb2599e7cd")
    void setUtilizedElement(ModelElement value);

    /**
     * Getter for relation 'Manifestation->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b9bb3a6e-9842-4257-9eac-3244b413e84c")
    Artifact getOwner();

    /**
     * Setter for relation 'Manifestation->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("ee2e9278-e3ea-45be-97d8-98abb1f44740")
    void setOwner(Artifact value);

}
