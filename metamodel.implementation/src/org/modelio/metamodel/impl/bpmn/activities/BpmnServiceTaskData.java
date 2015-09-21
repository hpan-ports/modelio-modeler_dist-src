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
package org.modelio.metamodel.impl.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00836ee0-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnServiceTaskData extends BpmnTaskData {
    @objid ("7bae2f5f-8262-406a-8161-73fb8cc1bbc9")
     Object mImplementation = "##WebService";

    @objid ("951fc490-3629-4706-bb3a-efdb10ce80a5")
     SmObjectImpl mCalledOperation;

    @objid ("20fb9c7b-917d-4d91-bc8b-55aff6a178e9")
     SmObjectImpl mOperationRef;

    @objid ("afca58b8-507b-4a34-8658-a5cf72131006")
    public BpmnServiceTaskData(BpmnServiceTaskSmClass smClass) {
        super(smClass);
    }

}
