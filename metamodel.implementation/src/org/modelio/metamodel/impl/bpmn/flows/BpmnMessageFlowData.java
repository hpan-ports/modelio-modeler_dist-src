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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("007cb096-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnMessageFlowData extends BpmnBaseElementData {
    @objid ("ebfc831c-5d1d-40c7-acff-6e3546ac22ac")
     SmObjectImpl mMessageRef;

    @objid ("a6f530f3-c9b2-4aff-a08b-a7fcdbb4308b")
     SmObjectImpl mSourceRef;

    @objid ("b13550b7-3700-4d76-aa99-640cab7e6421")
     SmObjectImpl mTargetRef;

    @objid ("c2ae917c-9711-4870-901b-56e1b18c85c9")
     SmObjectImpl mCollaboration;

    @objid ("d179b631-0004-4c09-b947-91ddfe90076e")
    public BpmnMessageFlowData(BpmnMessageFlowSmClass smClass) {
        super(smClass);
    }

}
