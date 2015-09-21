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
import org.modelio.metamodel.bpmn.bpmnService.BpmnOperation;
import org.modelio.metamodel.uml.statik.Operation;

/**
 * BpmnServiceTask v0.0.9054
 * 
 * 
 * A Service Task is a Task that uses some sort of service, which could be a Web service or an automated application.
 * A Service Task object shares the same shape as the Task, which is a rectangle that has rounded corners. However, there is a graphical marker in the upper left corner of the shape that indicates that the Task is a Service Task
 */
@objid ("008313be-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnServiceTask extends BpmnTask {
    @objid ("91000a8a-ee18-40ce-8f3f-96f7969cd3c4")
    public static final String MNAME = "BpmnServiceTask";

    /**
     * Getter for attribute 'BpmnServiceTask.Implementation'
     * 
     * Metamodel description:
     * <i>This attribute specifies the technology that will be used to send and receive the Messages. 
     * 
     * Valid values are "##unspecified" for leaving the implementation technology open, "##WebService" for the Web service technology or a URI identifying any other technology or coordination protocol.
     * 
     * A Web service is the default technology.</i>
     */
    @objid ("6ca8c371-c6c2-4144-b144-fd839ebf9ed1")
    String getImplementation();

    /**
     * Setter for attribute 'BpmnServiceTask.Implementation'
     * 
     * Metamodel description:
     * <i>This attribute specifies the technology that will be used to send and receive the Messages. 
     * 
     * Valid values are "##unspecified" for leaving the implementation technology open, "##WebService" for the Web service technology or a URI identifying any other technology or coordination protocol.
     * 
     * A Web service is the default technology.</i>
     */
    @objid ("dbf3355d-2ff5-4374-a11a-ea04f1d27506")
    void setImplementation(String value);

    /**
     * Getter for relation 'BpmnServiceTask->CalledOperation'
     * 
     * Metamodel description:
     * <i>specifies the operation that is invoked.</i>
     */
    @objid ("f75ed692-0095-4705-903e-ff1729843a64")
    Operation getCalledOperation();

    /**
     * Setter for relation 'BpmnServiceTask->CalledOperation'
     * 
     * Metamodel description:
     * <i>specifies the operation that is invoked.</i>
     */
    @objid ("aaf03e66-3d8d-40d8-8c84-adb6aa3c911a")
    void setCalledOperation(Operation value);

    /**
     * Getter for relation 'BpmnServiceTask->OperationRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("d7a0b757-475c-499b-8353-8b16fca02f6e")
    BpmnOperation getOperationRef();

    /**
     * Setter for relation 'BpmnServiceTask->OperationRef'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("5804b5ff-bdff-4d8b-a712-00b9ad17b8eb")
    void setOperationRef(BpmnOperation value);

}
