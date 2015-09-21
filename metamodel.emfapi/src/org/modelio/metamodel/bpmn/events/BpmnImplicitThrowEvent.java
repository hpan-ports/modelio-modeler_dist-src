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
package org.modelio.metamodel.bpmn.events;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.activities.BpmnComplexBehaviorDefinition;

/**
 * BpmnImplicitThrowEvent v0.0.9054
 * 
 * 
 * This is a non-graphical Event that this used for Multi-Instance Activities
 */
@objid ("008df234-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnImplicitThrowEvent extends BpmnThrowEvent {
    @objid ("43af496e-ed92-4087-a3c2-0951c1c1976d")
    public static final String MNAME = "BpmnImplicitThrowEvent";

    /**
     * Getter for relation 'BpmnImplicitThrowEvent->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("06a9f1f0-bc3c-470f-bf21-7614e9ec2343")
    BpmnComplexBehaviorDefinition getOwner();

    /**
     * Setter for relation 'BpmnImplicitThrowEvent->Owner'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("b5a28752-f810-4d91-9429-4cab084550ca")
    void setOwner(BpmnComplexBehaviorDefinition value);

}
