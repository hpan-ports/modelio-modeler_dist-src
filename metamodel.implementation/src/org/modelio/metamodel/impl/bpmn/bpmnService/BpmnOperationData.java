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
package org.modelio.metamodel.impl.bpmn.bpmnService;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("000daf70-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnOperationData extends BpmnBaseElementData {
    @objid ("29979329-75a3-4bb5-bca8-934c13f9f629")
     List<SmObjectImpl> mSender = null;

    @objid ("275eb442-9ed3-4e08-a09f-269e9091207f")
     SmObjectImpl mInMessageRef;

    @objid ("7c62fd1b-f5d9-4825-aa72-81caa6d24575")
     List<SmObjectImpl> mCaller = null;

    @objid ("5dc5b971-c941-45fe-8aae-b7c8d12677e9")
     SmObjectImpl mOutMessageRef;

    @objid ("c868b015-48cb-4aaf-9672-398d0ac623b4")
     List<SmObjectImpl> mEventDefinition = null;

    @objid ("059dd2f1-a6d0-4169-9da4-771701a6d19e")
     SmObjectImpl mImplementationRef;

    @objid ("745ab66b-54d5-48ba-bf2d-668f7556d4a5")
     SmObjectImpl mBpmnInterfaceRef;

    @objid ("70666681-5fd9-4e66-b205-21b04157945e")
     List<SmObjectImpl> mReceiver = null;

    @objid ("de267e52-ac53-49ba-b81c-51db6210e40f")
    public BpmnOperationData(BpmnOperationSmClass smClass) {
        super(smClass);
    }

}
