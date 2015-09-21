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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageKind;
import org.modelio.metamodel.uml.behavior.interactionModel.MessageSort;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("004999e0-c4bf-1fd8-97fe-001ec947cd2a")
public class MessageData extends ModelElementData {
    @objid ("f25da27b-a99a-400d-a762-cee700cbe197")
     Object mArgument = "";

    @objid ("cce96520-ef7c-4203-a4de-6c62bd5581cc")
     Object mKindOfMessage = MessageKind.UNKNOWNKIND;

    @objid ("a302b14a-8307-4fb0-91f6-eb30cae87b53")
     Object mSortOfMessage = MessageSort.SYNCCALL;

    @objid ("8db077c7-43cb-4392-a972-5d7aa5b99015")
     SmObjectImpl mSignalSignature;

    @objid ("d0ad3a6c-fc31-4eb5-b766-7fcd6564760d")
     SmObjectImpl mReceiveEvent;

    @objid ("dc872f67-7592-49c5-8d6b-d4e982a17796")
     SmObjectImpl mSendEvent;

    @objid ("73efb129-0a71-4644-9cae-e0101f0f263f")
     SmObjectImpl mInvoked;

    @objid ("31f97bd6-3fcd-4af5-9b31-5c92080fb71c")
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("025334d8-a67d-477c-af94-c3f929d1945f")
    public MessageData(MessageSmClass smClass) {
        super(smClass);
    }

}
