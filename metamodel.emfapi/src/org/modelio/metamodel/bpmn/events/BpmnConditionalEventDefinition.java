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

/**
 * BpmnConditionalEventDefinition v0.0.9054
 * 
 * 
 * Event defined by a condition
 */
@objid ("0089eafe-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnConditionalEventDefinition extends BpmnEventDefinition {
    @objid ("59b7e787-a794-4bda-8717-fc5eb3644477")
    public static final String MNAME = "BpmnConditionalEventDefinition";

    /**
     * Getter for attribute 'BpmnConditionalEventDefinition.Condition'
     * 
     * Metamodel description:
     * <i>The Expression might be underspecified and provided in the form of natural language.
     * For executable Processes (processType = executable), if the trigger is Conditional, then a FormalExpression MUST be entered.</i>
     */
    @objid ("678d0a9e-5ee1-4d06-b777-06ed5282dc47")
    String getCondition();

    /**
     * Setter for attribute 'BpmnConditionalEventDefinition.Condition'
     * 
     * Metamodel description:
     * <i>The Expression might be underspecified and provided in the form of natural language.
     * For executable Processes (processType = executable), if the trigger is Conditional, then a FormalExpression MUST be entered.</i>
     */
    @objid ("40a189bb-2c33-4624-be7c-6072dc2192ea")
    void setCondition(String value);

}
