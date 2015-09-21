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
 * BpmnInclusiveGateway v0.0.9054
 * 
 * 
 * A diverging Inclusive Gateway (Inclusive Decision) can be used to create alternative but also parallel paths within a Process flow. Unlike the Exclusive Gateway, all condition Expressions are evaluated. The true evaluation of one condition Expression does not exclude the evaluation of other condition Expressions. All Sequence Flow with a true evaluation will be traversed by a token. Since each path is considered to be independent, all combinations of the paths may be taken, from zero to all. However, it should be designed so that at least one path is taken.
 */
@objid ("00019a82-c4c0-1fd8-97fe-001ec947cd2a")
public interface BpmnInclusiveGateway extends BpmnGateway {
    @objid ("772db815-cd16-47e3-aba6-353fec9356b3")
    public static final String MNAME = "BpmnInclusiveGateway";

    /**
     * Getter for relation 'BpmnInclusiveGateway->DefaultFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("f2b8d163-8f3e-4164-a389-11cbf81eeff0")
    BpmnSequenceFlow getDefaultFlow();

    /**
     * Setter for relation 'BpmnInclusiveGateway->DefaultFlow'
     * 
     * Metamodel description:
     * <i>null</i>
     */
    @objid ("feabb329-5d6c-4f17-9177-eed0e1befe8e")
    void setDefaultFlow(BpmnSequenceFlow value);

}
