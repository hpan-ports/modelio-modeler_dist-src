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
package org.modelio.metamodel.analyst;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.analyst.AnalystPropertyTable;
import org.modelio.metamodel.uml.infrastructure.ModelElement;

/**
 * AnalystItem v0.0.9054
 * 
 * 
 * This is the root class for all Analyst model elements.
 */
@objid ("ab041cd6-1250-48a8-9ddb-0a1064baf5c4")
public interface AnalystItem extends ModelElement {
    @objid ("99b92cc6-2f53-4585-b954-381b07075ec7")
    public static final String MNAME = "AnalystItem";

    /**
     * Getter for attribute 'AnalystItem.Definition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("45913f28-4cce-42c0-afee-6c09d1a42381")
    String getDefinition();

    /**
     * Setter for attribute 'AnalystItem.Definition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("eb5af337-5e80-4941-af94-48f053c8201a")
    void setDefinition(String value);

    /**
     * Getter for relation 'AnalystItem->AnalystProperties'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("89d709b0-a6d7-44a6-a57e-165d611ed153")
    AnalystPropertyTable getAnalystProperties();

    /**
     * Setter for relation 'AnalystItem->AnalystProperties'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5559c9e4-19e3-47f7-bb96-ced6b9450e37")
    void setAnalystProperties(AnalystPropertyTable value);

}
