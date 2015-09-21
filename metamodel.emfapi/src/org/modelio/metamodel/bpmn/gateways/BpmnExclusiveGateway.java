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
package org.modelio.metamodel.bpmn.gateways;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.flows.BpmnSequenceFlow;

/**
 * BpmnExclusiveGateway v0.0.9054
 * 
 * 
 * A diverging Exclusive Gateway (Decision) is used to create alternative paths within a Process flow. This is basically the ?diversion point in the road? for a Process. For a given instance of the Process, only one of the paths can be taken.
 * A Decision can be thought of as a question that is asked at a particular point in the Process. The question has a defined set of alternative answers. Each question is associated with a condition Expression that is associated with a Gateway?s outgoing Sequence Flow.
 */
@objid ("000002bc-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnExclusiveGateway extends BpmnGateway {
    @objid ("7a0e7207-a230-49dd-b76c-a41b8f37eeac")
    public static final String MNAME = "BpmnExclusiveGateway";

    /**
     * Getter for relation 'BpmnExclusiveGateway->DefaultFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("90e3a024-63af-464e-89f5-e9abc0f8ad4d")
    BpmnSequenceFlow getDefaultFlow();

    /**
     * Setter for relation 'BpmnExclusiveGateway->DefaultFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("08982276-7354-4f7f-8365-6152d355938e")
    void setDefaultFlow(BpmnSequenceFlow value);

}
