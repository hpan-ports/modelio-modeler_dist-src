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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowNodeData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("007dc792-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnActivityData extends BpmnFlowNodeData {
    @objid ("fc2bdfcf-6076-4ae9-b6fa-c0e8cd11d000")
     Object mIsForCompensation = false;

    @objid ("c731e211-cb9c-43c2-8ce2-e15fd13516b8")
     Object mStartQuantity = 1;

    @objid ("7b67e9be-3ee9-4881-b5fd-a1c94b20146a")
     Object mCompletionQuantity = 1;

    @objid ("e2e21831-fb2f-4fed-87f7-0370e5f50f15")
     List<SmObjectImpl> mCompensateEventDefinitions = null;

    @objid ("394e6490-c220-4669-a59d-a39693d06b1e")
     List<SmObjectImpl> mInputSpecification = null;

    @objid ("c79de987-09a0-402d-a0e6-78857a7397a2")
     List<SmObjectImpl> mDataInputAssociation = null;

    @objid ("588f79e0-d49e-4cc0-bafb-20447e68f1aa")
     List<SmObjectImpl> mOutputSpecification = null;

    @objid ("27dd2509-e4d9-4aa7-962b-a577a54fdbae")
     SmObjectImpl mLoopCharacteristics;

    @objid ("b81c0fd3-6d70-4295-affe-176b89da374b")
     List<SmObjectImpl> mBoundaryEventRef = null;

    @objid ("ed267dd0-d3aa-4895-a217-aa227dd881ac")
     List<SmObjectImpl> mDataOutputAssociation = null;

    @objid ("f4421e15-5e50-4b36-9bea-5a866834514c")
     SmObjectImpl mDefaultFlow;

    @objid ("2cc55613-c87d-43c0-9ce2-5c67dda1dbf4")
    public BpmnActivityData(BpmnActivitySmClass smClass) {
        super(smClass);
    }

}
