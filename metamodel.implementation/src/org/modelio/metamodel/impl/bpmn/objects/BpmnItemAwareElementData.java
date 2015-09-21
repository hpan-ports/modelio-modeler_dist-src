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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnFlowElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("000765a2-c4c0-1fd8-97fe-001ec947cd2a")
public abstract class BpmnItemAwareElementData extends BpmnFlowElementData {
    @objid ("7afd01a2-1463-4563-bf4f-88c8435fb4c5")
     SmObjectImpl mType;

    @objid ("fb05bf18-f53c-4616-961c-73e4f595d3d6")
     List<SmObjectImpl> mTargetOfDataAssociation = null;

    @objid ("130574ba-3514-4808-8808-fe9d3a0e463a")
     SmObjectImpl mItemSubjectRef;

    @objid ("0c726a71-e5ba-45c5-bcfe-99f92b6b9701")
     SmObjectImpl mInState;

    @objid ("b98dd290-54a5-4a65-a95a-79bd6c2b3c50")
     SmObjectImpl mRepresentedAssociationEnd;

    @objid ("661f7f88-66ee-46b2-b6bc-9aa945653552")
     SmObjectImpl mDataState;

    @objid ("431c91e0-288e-40dd-854c-830c2c049424")
     List<SmObjectImpl> mSourceOfDataAssociation = null;

    @objid ("90da9aec-5270-4675-9149-a4c593181e4d")
     SmObjectImpl mRepresentedAttribute;

    @objid ("1a8fa3f3-2d20-4e2b-9304-11447aa24fc9")
     SmObjectImpl mRepresentedInstance;

    @objid ("21178fa5-a6a2-4777-b5af-0d27fc09a8be")
    public BpmnItemAwareElementData(BpmnItemAwareElementSmClass smClass) {
        super(smClass);
    }

}
