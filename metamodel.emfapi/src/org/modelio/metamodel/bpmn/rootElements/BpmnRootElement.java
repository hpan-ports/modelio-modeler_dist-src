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
package org.modelio.metamodel.bpmn.rootElements;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnBehavior;

/**
 * BpmnRootElement v0.0.9054
 * 
 * 
 * null
 */
@objid ("007ab098-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnRootElement extends BpmnBaseElement {
    @objid ("7f81d071-d783-439a-8618-f28b5f112549")
    public static final String MNAME = "BpmnRootElement";

    /**
     * Getter for relation 'BpmnRootElement->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("a9b714f8-1cbf-43af-9f2f-db09bff6f367")
    BpmnBehavior getOwner();

    /**
     * Setter for relation 'BpmnRootElement->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("fd40d894-7529-4862-a420-baac50798586")
    void setOwner(BpmnBehavior value);

}
