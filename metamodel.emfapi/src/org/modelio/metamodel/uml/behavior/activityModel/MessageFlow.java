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
import org.modelio.metamodel.uml.behavior.activityModel.ActivityPartition;

/**
 * MessageFlow v0.0.9054
 * 
 * 
 * A Message Flow is used to show the flow of messages between two entities that are prepared to send and receive them. 
 * 
 * In BPMN, two separate Pools in the Diagram will represent the two entities.
 */
@objid ("0037db42-c4bf-1fd8-97fe-001ec947cd2a")
public interface MessageFlow extends ActivityEdge {
    @objid ("e138a716-cda5-44fb-beed-0a10cc466b7e")
    public static final String MNAME = "MessageFlow";

    /**
     * Getter for relation 'MessageFlow->TargetPartition'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("9a82dfd4-7a3e-48e0-a477-0f66b7a949d4")
    ActivityPartition getTargetPartition();

    /**
     * Setter for relation 'MessageFlow->TargetPartition'
     * 
     * Metamodel description:
     * <i></i>
     */
    @objid ("1b53e650-33b2-4c1a-b6ba-e4e1982a81b9")
    void setTargetPartition(ActivityPartition value);

    /**
     * Getter for relation 'MessageFlow->SourcePartition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f7661136-a34a-4423-9b2f-9f1d97ff8a75")
    ActivityPartition getSourcePartition();

    /**
     * Setter for relation 'MessageFlow->SourcePartition'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("cf069a81-149b-4319-a759-bdeb5f11c613")
    void setSourcePartition(ActivityPartition value);

}
