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
package org.modelio.metamodel.impl.bpmn.flows;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("007c30f8-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnMessageData extends BpmnRootElementData {
    @objid ("23771f44-ace0-40ab-b727-c2d04d5ccc44")
     SmObjectImpl mType;

    @objid ("a0dd038b-16cc-4cd1-ae3e-75162c2e1178")
     List<SmObjectImpl> mOutputMessage = null;

    @objid ("99dbf285-3171-4c98-b4af-2a64ec267060")
     SmObjectImpl mItemRef;

    @objid ("28e8592a-06a1-4161-8334-3879e4447ff3")
     SmObjectImpl mInState;

    @objid ("026fc858-ea72-4b19-8932-ff1621d0ee96")
     List<SmObjectImpl> mEventDefinition = null;

    @objid ("ab52e7c8-4d0c-41ab-ac6d-ab0674233560")
     List<SmObjectImpl> mSender = null;

    @objid ("b25cb00a-cddd-4213-afe3-e0d3cab3e260")
     List<SmObjectImpl> mInputMessage = null;

    @objid ("7a28bc9b-c7a2-4378-9c5a-3a466607c812")
     List<SmObjectImpl> mReceiver = null;

    @objid ("61b14296-8516-413b-960e-41f66765a2e4")
     List<SmObjectImpl> mMessageFlow = null;

    @objid ("8683d434-1cca-4646-90c1-45a01514991f")
    public BpmnMessageData(BpmnMessageSmClass smClass) {
        super(smClass);
    }

}
