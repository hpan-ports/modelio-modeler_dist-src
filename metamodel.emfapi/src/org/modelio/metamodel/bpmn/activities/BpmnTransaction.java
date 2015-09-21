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
import org.modelio.metamodel.bpmn.activities.TransactionMethod;

/**
 * BpmnTransaction v0.0.9054
 * 
 * 
 * A Transaction is a specialized type of Sub-Process which will have a special behavior that is controlled through a transaction protocol (such as WS-Transaction). The boundary of the Sub-Process will be double-lined to indicate that it is a Transaction
 */
@objid ("00855ebc-c4bf-1fd8-97fe-001ec947cd2a")
public interface BpmnTransaction extends BpmnSubProcess {
    @objid ("3f881c26-7f29-4d4d-9076-e8e65fbf453a")
    public static final String MNAME = "BpmnTransaction";

    /**
     * Getter for attribute 'BpmnTransaction.Protocol'
     * 
     * Metamodel description:
     * <i>The elements that make up the internal Sub-Process flow.
     * This association is only applicable when the XSD Interchange is used. In the case of the XMI interchange, this association is inherited from the FlowElementsContainer class.</i>
     */
    @objid ("db37cf2b-fa37-4573-8de8-1c516734eeca")
    String getProtocol();

    /**
     * Setter for attribute 'BpmnTransaction.Protocol'
     * 
     * Metamodel description:
     * <i>The elements that make up the internal Sub-Process flow.
     * This association is only applicable when the XSD Interchange is used. In the case of the XMI interchange, this association is inherited from the FlowElementsContainer class.</i>
     */
    @objid ("669d484c-9e44-4602-a770-5a1e16c47271")
    void setProtocol(String value);

    /**
     * Getter for attribute 'BpmnTransaction.Method'
     * 
     * Metamodel description:
     * <i>TransactionMethod is an attribute that defines the technique that will be used to undo a Transaction that has been cancelled.
     * The default is compensate, but the attribute MAY be set to store or image.</i>
     */
    @objid ("becc8e69-2bea-4b28-ae4d-707b472ee631")
    TransactionMethod getMethod();

    /**
     * Setter for attribute 'BpmnTransaction.Method'
     * 
     * Metamodel description:
     * <i>TransactionMethod is an attribute that defines the technique that will be used to undo a Transaction that has been cancelled.
     * The default is compensate, but the attribute MAY be set to store or image.</i>
     */
    @objid ("fc146488-84c9-4fa6-ab02-9383b7635c44")
    void setMethod(TransactionMethod value);

}
