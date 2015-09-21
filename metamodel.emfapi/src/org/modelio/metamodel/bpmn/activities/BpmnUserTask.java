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
package org.modelio.metamodel.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;

/**
 * BpmnUserTask v0.0.9054
 * 
 * 
 * A User Task is a typical ?workflow? Task where a human performer performs the Task with the assistance of a software application and is scheduled through a task list manager of some sort.
 * A User Task is executed by and managed by a business process runtime. Attributes concerning the human involvement,like people assignments and UI rendering can be specified in great detail.
 */
@objid ("0086182a-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnUserTask extends BpmnTask {
    @objid ("871720bc-b672-470d-94df-ffa6d110f41b")
    public static final String MNAME = "BpmnUserTask";

    /**
     * Getter for attribute 'BpmnUserTask.Implementation'
     * 
     * Metamodel description:
     * <i>This attribute specifies the technology that will be used to send and receive the Messages. A Web service is the default technology.</i>
     */
    @objid ("18f5bf5f-d327-4b75-bc7e-f74eadf353e6")
    String getImplementation();

    /**
     * Setter for attribute 'BpmnUserTask.Implementation'
     * 
     * Metamodel description:
     * <i>This attribute specifies the technology that will be used to send and receive the Messages. A Web service is the default technology.</i>
     */
    @objid ("a8022dec-56a6-4224-88d0-f57c75db5694")
    void setImplementation(String value);

}
