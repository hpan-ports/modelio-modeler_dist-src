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
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("007d254e-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnSequenceFlowData extends BpmnFlowElementData {
    @objid ("19f01b1a-07f4-4f28-8b09-8d51b82b2491")
     Object mIsImmediate = false;

    @objid ("595cb56c-a8a5-42f6-882b-3300bcf0aa20")
     Object mConditionExpression = "";

    @objid ("8b5d1ecf-5f35-436c-aab2-2b0faf86cd2a")
     SmObjectImpl mSourceRef;

    @objid ("6a64b5aa-7819-4769-9c9b-ddc8cf052abf")
     SmObjectImpl mTargetRef;

    @objid ("b23173b2-6de5-4d7e-a736-78fc18f15ffe")
     SmObjectImpl mDefaultOfInclusive;

    @objid ("c4fa11d2-e872-4584-8251-89a85720bda5")
     SmObjectImpl mDefaultFrom;

    @objid ("1e7f978b-4e13-4e8c-852a-4537adac5942")
     SmObjectImpl mDefaultOfExclusive;

    @objid ("ecbab926-4084-41b1-b2c0-9c6f15aeacc3")
     List<SmObjectImpl> mConnector = null;

    @objid ("da40bd44-88ac-4544-8f4c-7b506e4b5271")
     SmObjectImpl mDefaultOfComplex;

    @objid ("6c71ea1b-16d7-4411-bdb5-949aa9b9a157")
    public BpmnSequenceFlowData(BpmnSequenceFlowSmClass smClass) {
        super(smClass);
    }

}
