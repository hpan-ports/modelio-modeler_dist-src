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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0053d27a-c4bf-1fd8-97fe-001ec947cd2a")
public class StateData extends StateVertexData {
    @objid ("c3a5867b-c5ee-4cd2-980a-6552480820cc")
     List<SmObjectImpl> mExitPoint = null;

    @objid ("85a00801-4c03-4fd4-bd19-26ddaed9ee35")
     List<SmObjectImpl> mBpmnDataStateRefs = null;

    @objid ("bb46c12b-42fa-4bda-bd70-825b0c4fc5da")
     List<SmObjectImpl> mDeffered = null;

    @objid ("084f347b-29fc-4e94-8999-49d8cf719a6c")
     List<SmObjectImpl> mInternal = null;

    @objid ("5cc649ac-a08c-4408-88cd-8362cd55e315")
     List<SmObjectImpl> mEntryPoint = null;

    @objid ("8a9ab73e-1cd7-4a27-843e-c040b5bb65d4")
     List<SmObjectImpl> mOwnedRegion = null;

    @objid ("86f1ed31-4242-4f6b-9b21-d63f516f68f3")
     List<SmObjectImpl> mRequiredStateOfBpmnMessage = null;

    @objid ("325a801d-833a-483e-96cc-92b49f57df90")
     List<SmObjectImpl> mRequiredStateOf = null;

    @objid ("2cc42d5e-e34d-45b7-bc34-f6c5cc3614b0")
     List<SmObjectImpl> mConnection = null;

    @objid ("ed6d73eb-240e-4746-9635-139900e5b673")
     SmObjectImpl mSubMachine;

    @objid ("d18f5dc7-925e-4d9f-8d03-077d34cf48e5")
     List<SmObjectImpl> mRequiredStateOfBpmnItem = null;

    @objid ("26b1813f-551d-44c6-9f83-f0193311904c")
    public StateData(StateSmClass smClass) {
        super(smClass);
    }

}
