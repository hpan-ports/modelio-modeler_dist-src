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
import org.modelio.metamodel.bpmn.activities.AdHocOrdering;

/**
 * BpmnAdHocSubProcess v0.0.9054
 * 
 * 
 * An Ad-Hoc Sub-Process is a specialized type of Sub-Process that is a group of Activities that have no required sequence relationships. A set of Activities can be defined for the Process, but the sequence and number of performances for the Activities is determined by the performers of the Activities.
 */
@objid ("007df21c-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnAdHocSubProcess extends BpmnSubProcess {
    @objid ("d237af29-b887-467d-a6f9-ca1b7adcff0c")
    public static final String MNAME = "BpmnAdHocSubProcess";

    /**
     * Getter for attribute 'BpmnAdHocSubProcess.Ordering'
     * 
     * Metamodel description:
     * <i>This attribute defines if the Activities within the Process can be performed in parallel or must be performed sequentially. The default setting is parallel and the setting of sequential is a restriction on the performance that may be required due to shared resources. When the setting is sequential, then only one Activity can be performed at a time. When the setting is parallel, then zero (0) to all the Activities of the Sub-Process can be performed in parallel.</i>
     */
    @objid ("e738162a-381e-4012-8af6-1c2808798e90")
    AdHocOrdering getOrdering();

    /**
     * Setter for attribute 'BpmnAdHocSubProcess.Ordering'
     * 
     * Metamodel description:
     * <i>This attribute defines if the Activities within the Process can be performed in parallel or must be performed sequentially. The default setting is parallel and the setting of sequential is a restriction on the performance that may be required due to shared resources. When the setting is sequential, then only one Activity can be performed at a time. When the setting is parallel, then zero (0) to all the Activities of the Sub-Process can be performed in parallel.</i>
     */
    @objid ("f737d96a-117f-4347-a268-8f7e63130873")
    void setOrdering(AdHocOrdering value);

    /**
     * Getter for attribute 'BpmnAdHocSubProcess.CancelRemainingInstances'
     * 
     * Metamodel description:
     * <i>This attribute is used only if ordering is parallel. It determines whether running instances are cancelled when the completionCondition becomes true.</i>
     */
    @objid ("a3faf4b5-7e36-4636-bf09-19654b3137ad")
    boolean isCancelRemainingInstances();

    /**
     * Setter for attribute 'BpmnAdHocSubProcess.CancelRemainingInstances'
     * 
     * Metamodel description:
     * <i>This attribute is used only if ordering is parallel. It determines whether running instances are cancelled when the completionCondition becomes true.</i>
     */
    @objid ("1f86d3e1-0c3f-466e-a80d-1a1ed5f840e2")
    void setCancelRemainingInstances(boolean value);

    /**
     * Getter for attribute 'BpmnAdHocSubProcess.CompletionCondition'
     * 
     * Metamodel description:
     * <i>This Expression defines the conditions when the Process will end. When the Expression is evaluated to true, the Process will be terminated.</i>
     */
    @objid ("31e06489-872c-416c-99bf-d618258ff04a")
    String getCompletionCondition();

    /**
     * Setter for attribute 'BpmnAdHocSubProcess.CompletionCondition'
     * 
     * Metamodel description:
     * <i>This Expression defines the conditions when the Process will end. When the Expression is evaluated to true, the Process will be terminated.</i>
     */
    @objid ("10d8284d-4ad9-4915-93f4-4d143636da63")
    void setCompletionCondition(String value);

}
