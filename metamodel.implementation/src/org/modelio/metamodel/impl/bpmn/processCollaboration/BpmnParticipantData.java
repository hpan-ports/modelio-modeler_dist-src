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
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0075e3f6-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnParticipantData extends BpmnBaseElementData {
    @objid ("6ce553f4-db2e-45c8-922e-b1b10a6119f7")
     Object mMultiplicityMin = 0;

    @objid ("0482f957-2162-4636-b983-c30fd23996ea")
     Object mMultiplicityMax = 0;

    @objid ("6b7491c9-79a5-44a9-aa70-66dfec65f28f")
     SmObjectImpl mProcess;

    @objid ("2a66d56b-bce1-45d9-977e-832f0f4ad030")
     SmObjectImpl mContainer;

    @objid ("6f8f89d1-48d4-4b0a-94dc-2eb30ddeaf46")
     SmObjectImpl mType;

    @objid ("b6399cb0-aed2-49fd-a879-90d7528b876b")
     List<SmObjectImpl> mEndPointRefs = null;

    @objid ("0fde8d94-7742-4222-9343-54259e198cc8")
     List<SmObjectImpl> mInterfaceRefs = null;

    @objid ("909ba5ba-e22d-4828-8c71-48d379022c1b")
     SmObjectImpl mPackageRef;

    @objid ("77db037e-37ce-4c3b-b369-6efb23ebbc08")
    public BpmnParticipantData(BpmnParticipantSmClass smClass) {
        super(smClass);
    }

}
