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
package org.modelio.metamodel.impl.bpmn.objects;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00061d64-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataOutputData extends BpmnItemAwareElementData {
    @objid ("ca946437-3058-4e44-9ccb-df68b58dc116")
     SmObjectImpl mRepresentedParameter;

    @objid ("14efafa1-3049-483c-a896-177a6d37884e")
     SmObjectImpl mOwnerActivity;

    @objid ("73f44ccc-11d6-421d-a0c6-0ce7e12e0775")
     SmObjectImpl mCatched;

    @objid ("55839e7a-cb10-44e3-ad8e-da83d32f9719")
     SmObjectImpl mOwnerLoopCharacteristics;

    @objid ("fcce6af7-33fe-42bb-b7a9-1789afa99674")
    public BpmnDataOutputData(BpmnDataOutputSmClass smClass) {
        super(smClass);
    }

}
