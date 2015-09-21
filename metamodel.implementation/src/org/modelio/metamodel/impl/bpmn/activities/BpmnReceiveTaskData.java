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

@objid ("0081d3c8-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnReceiveTaskData extends BpmnTaskData {
    @objid ("31a16feb-a383-448a-b451-4cdabcc181e6")
     Object mImplementation = "##WebService";

    @objid ("9bca7afb-5eab-4335-92ef-b05591e58089")
     Object mInstanciate = false;

    @objid ("031747b9-823b-416d-9ce0-614f4e6a2d09")
     SmObjectImpl mMessageRef;

    @objid ("6f37ee59-8262-4851-b465-70ab005b818e")
     SmObjectImpl mOperationRef;

    @objid ("c77baa70-c11a-4459-a8c1-e0e447d7a776")
     SmObjectImpl mCalledOperation;

    @objid ("56d12da8-82f3-4df1-bc26-8e75f1f4e791")
    public BpmnReceiveTaskData(BpmnReceiveTaskSmClass smClass) {
        super(smClass);
    }

}
