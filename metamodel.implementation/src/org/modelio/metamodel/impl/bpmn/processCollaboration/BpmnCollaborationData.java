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
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00742fca-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnCollaborationData extends BpmnRootElementData {
    @objid ("fc459ef2-99aa-4ad2-9f2c-0981a2c49936")
     Object mIsClosed = false;

    @objid ("63bf8ab9-5050-4752-a332-4723f0b05906")
     List<SmObjectImpl> mArtifact = null;

    @objid ("602faed0-9ee8-4e83-9b6a-474deea04124")
     List<SmObjectImpl> mMessageFlow = null;

    @objid ("da574d74-7705-4005-9dd0-5ba0e3ca24cd")
     List<SmObjectImpl> mParticipants = null;

    @objid ("fb813d3a-7b6b-4fc2-9b91-4789f37bcd7c")
    public BpmnCollaborationData(BpmnCollaborationSmClass smClass) {
        super(smClass);
    }

}
