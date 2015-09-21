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


/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.0.01.9022
     Generated on: 28 janv. 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 9024, by Modeliosoft
     Generator version: 3.2.07.9022
     Generated on: Mar 10, 2015
*/
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.bpmn.gateways;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.gateways.BpmnEventBasedGatewayType;

@objid ("00985c10-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnEventBasedGatewayData extends BpmnGatewayData {
    @objid ("d328978e-eb2e-4be7-a22e-41ef14c97b3b")
     Object mInstanciate = false;

    @objid ("bb52ca2b-b63b-4514-9709-dcf816e4bd33")
     Object mEventGatewayType = BpmnEventBasedGatewayType.EXCLUSIVEGATEWAY;

    @objid ("40bd348d-c9a9-4062-8355-0a50e9442b2c")
    public BpmnEventBasedGatewayData(BpmnEventBasedGatewaySmClass smClass) {
        super(smClass);
    }

}
