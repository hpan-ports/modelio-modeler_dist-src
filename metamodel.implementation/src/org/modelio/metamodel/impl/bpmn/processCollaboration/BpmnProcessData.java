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
package org.modelio.metamodel.impl.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.processCollaboration.BpmnProcessType;
import org.modelio.metamodel.bpmn.processCollaboration.OptionalBoolean;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00768e50-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnProcessData extends BpmnRootElementData {
    @objid ("3fa55a6e-dad4-4808-82a0-f29766a8f938")
     Object mProcessType = BpmnProcessType.NONEPROCESS;

    @objid ("a376223b-e0ac-4b7c-b40c-3f6329a78999")
     Object mIsClosed = false;

    @objid ("e8604c0d-8343-4073-9976-b650405d0278")
     Object mIsExecutable = OptionalBoolean.OUNDEFINED;

    @objid ("0f187368-2e92-452a-9704-e03c0fa3223f")
     List<SmObjectImpl> mCaller = null;

    @objid ("034ad0df-cdec-4139-a276-e200f1afaa45")
     List<SmObjectImpl> mSupports = null;

    @objid ("f309cdfb-d334-48af-88ee-f1fef47fcca3")
     List<SmObjectImpl> mArtifact = null;

    @objid ("617d4701-bd2b-4fdc-80af-ce80a3d3b713")
     List<SmObjectImpl> mLaneSet = null;

    @objid ("bda57644-cb59-4657-bd45-0e524bbeb98a")
     List<SmObjectImpl> mSupported = null;

    @objid ("d4886e9a-0e9b-4bc6-b994-3152f5fdea6b")
     SmObjectImpl mParticipant;

    @objid ("27689ce4-bbc8-4d22-885c-907a8b420baa")
     List<SmObjectImpl> mFlowElement = null;

    @objid ("ee6adaa0-ba7a-4cc2-9f77-eb18e9cbf3ed")
     List<SmObjectImpl> mResource = null;

    @objid ("c58fe837-ced0-471e-8fab-580a5003a9f3")
    public BpmnProcessData(BpmnProcessSmClass smClass) {
        super(smClass);
    }

}
