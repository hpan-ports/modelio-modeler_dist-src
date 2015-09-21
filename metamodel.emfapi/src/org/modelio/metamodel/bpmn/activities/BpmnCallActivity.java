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
import org.modelio.metamodel.bpmn.activities.BpmnTask;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcess;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
import org.modelio.metamodel.uml.statik.Operation;

/**
 * BpmnCallActivity v0.0.9054
 * 
 * 
 * A Call Activity identifies a point in the Process where a global Process or a Global Task is used. The Call Activity acts as a ?wrapper? for the invocation of a global Process or Global Task within the execution. The activation of a call Activity results in the transfer of control to the called global Process or Global Task.
 */
@objid ("007f01c0-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnCallActivity extends BpmnActivity {
    @objid ("102fb4fb-d506-47a4-bc0d-a97ca2bf51e6")
    public static final String MNAME = "BpmnCallActivity";

    /**
     * Getter for relation 'BpmnCallActivity->CalledGlobalTask'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("43dcdb56-4921-4edf-96d6-db2e7af77ccd")
    BpmnTask getCalledGlobalTask();

    /**
     * Setter for relation 'BpmnCallActivity->CalledGlobalTask'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("46ac2b2b-767e-4b4b-bb45-66250fcb47d3")
    void setCalledGlobalTask(BpmnTask value);

    /**
     * Getter for relation 'BpmnCallActivity->CalledProcess'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("51b15611-eee0-40d0-9408-ad9ecb4eb9d1")
    BpmnProcess getCalledProcess();

    /**
     * Setter for relation 'BpmnCallActivity->CalledProcess'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e5cc53b9-4e8c-4a50-9d8e-431d45d6a669")
    void setCalledProcess(BpmnProcess value);

    /**
     * Getter for relation 'BpmnCallActivity->CalledOperation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e3918f97-ff09-459c-8375-b9a8eddbc241")
    Operation getCalledOperation();

    /**
     * Setter for relation 'BpmnCallActivity->CalledOperation'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("70f8ea2a-dfe9-49a9-a778-10a5837af3e1")
    void setCalledOperation(Operation value);

    /**
     * Getter for relation 'BpmnCallActivity->CalledBehavior'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("16f64106-ceaf-4e02-ba9c-d2399f3b5058")
    Behavior getCalledBehavior();

    /**
     * Setter for relation 'BpmnCallActivity->CalledBehavior'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("dcfee098-636f-4fb0-ac7b-340485133cb9")
    void setCalledBehavior(Behavior value);

}
