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
 * BpmnComplexGateway v0.0.9054
 * 
 * 
 * The Complex Gateway can be used to model complex synchronization behavior. An Expression
 * activationCondition is used to describe the precise behavior. For example, this Expression could specify that tokens on three out of five incoming Sequence Flow are needed to activate the Gateway. What tokens are produced by the Gateway is determined by conditions on the outgoing Sequence Flow as in the split behavior of the Inclusive Gateway. If token arrive later on the two remaining Sequence Flow, those tokens cause a reset of the Gateway and new token can be produced on the outgoing Sequence Flow. To determine whether it needs to wait for additional tokens before it can reset, the Gateway uses the synchronization semantics of the Inclusive Gateway.
 */
@objid ("00973ae2-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnComplexGateway extends BpmnGateway {
    @objid ("36225900-b91e-402a-a225-cbfc18438ba8")
    public static final String MNAME = "BpmnComplexGateway";

    /**
     * Getter for attribute 'BpmnComplexGateway.ActivationExpression'
     * 
     * Metamodel description:
     * <i>An activationExpression is a boolean Expression
     * that refers to data and to the activationCount of incoming gates. For example, an activationExpression
     * could be x1+x2+?+xm >= 3 stating that it needs 3 out of the m incoming gates to have a token in order to proceed. To
     * prevent undesirable oscillation of activation of the Complex Gateway, ActivationCount variables should only be
     * used in subexpressions of the form expr >= const where expr is an arithmetic Expression that uses only addition and
     * const is an Expression whose evaluation remains constant during execution of the Process.</i>
     */
    @objid ("b31da4c3-bd7e-41f3-9cb6-788128d963f4")
    String getActivationExpression();

    /**
     * Setter for attribute 'BpmnComplexGateway.ActivationExpression'
     * 
     * Metamodel description:
     * <i>An activationExpression is a boolean Expression
     * that refers to data and to the activationCount of incoming gates. For example, an activationExpression
     * could be x1+x2+?+xm >= 3 stating that it needs 3 out of the m incoming gates to have a token in order to proceed. To
     * prevent undesirable oscillation of activation of the Complex Gateway, ActivationCount variables should only be
     * used in subexpressions of the form expr >= const where expr is an arithmetic Expression that uses only addition and
     * const is an Expression whose evaluation remains constant during execution of the Process.</i>
     */
    @objid ("de13ecb4-934f-4f4f-84f0-ec7e0945f0a9")
    void setActivationExpression(String value);

    /**
     * Getter for relation 'BpmnComplexGateway->DefaultFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("535a9266-9e14-4e53-ab7b-da03be51ccf6")
    BpmnSequenceFlow getDefaultFlow();

    /**
     * Setter for relation 'BpmnComplexGateway->DefaultFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("e153cd52-b25f-4578-8674-96dd56d32ae7")
    void setDefaultFlow(BpmnSequenceFlow value);

}
