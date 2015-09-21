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
package org.modelio.metamodel.impl.uml.behavior.communicationModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("005b5928-c4bf-1fd8-97fe-001ec947cd2a")
public class CommunicationMessageData extends ModelElementData {
    @objid ("36959304-4e6a-4fff-a637-6dba6228b1c1")
     Object mArgument = "";

    @objid ("9f104b57-df21-4a79-90bd-c2636c2a8e72")
     Object mSequence = "";

    @objid ("3e667e99-8ebc-4958-8384-b9009f244028")
     Object mSortOfMessage = MessageSort.SYNCCALL;

    @objid ("da2f7aa0-33d5-4217-9089-1c1fbaa5357c")
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("f4339248-3802-46d6-870c-8ebe98163390")
     SmObjectImpl mChannel;

    @objid ("a4b2f847-2b5b-4ad5-833a-50a956a038ff")
     SmObjectImpl mInvertedChannel;

    @objid ("788b6b86-3086-4b7c-90c8-8b900daa3376")
     SmObjectImpl mInvoked;

    @objid ("456f33cd-2987-4d10-8196-708bb7b8699b")
     SmObjectImpl mSignalSignature;

    @objid ("e1638815-e8cd-488c-9cda-233d119e8746")
    public CommunicationMessageData(CommunicationMessageSmClass smClass) {
        super(smClass);
    }

}
