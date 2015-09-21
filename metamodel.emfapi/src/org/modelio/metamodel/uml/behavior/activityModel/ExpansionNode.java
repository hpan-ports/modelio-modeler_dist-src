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
package org.modelio.metamodel.uml.behavior.activityModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.activityModel.ExpansionRegion;

/**
 * ExpansionNode v0.0.9054
 * 
 * 
 * null
 */
@objid ("00311a8c-c4bf-1fd8-97fe-001ec947cd2a")
public interface ExpansionNode extends ObjectNode {
    @objid ("09fb0a5c-2717-4771-9269-fd8e8b8c72ac")
    public static final String MNAME = "ExpansionNode";

    /**
     * Getter for relation 'ExpansionNode->RegionAsOutput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fd8acbb4-31c0-4b10-ab41-1ebafe5eed07")
    ExpansionRegion getRegionAsOutput();

    /**
     * Setter for relation 'ExpansionNode->RegionAsOutput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("0ecf33a5-b490-40b6-b36e-0e9b6276c67d")
    void setRegionAsOutput(ExpansionRegion value);

    /**
     * Getter for relation 'ExpansionNode->RegionAsInput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("2fba0676-2773-4a95-892c-4e47585e3fe0")
    ExpansionRegion getRegionAsInput();

    /**
     * Setter for relation 'ExpansionNode->RegionAsInput'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b6543209-7e3b-4824-9c0d-17620a8b3418")
    void setRegionAsInput(ExpansionRegion value);

}
