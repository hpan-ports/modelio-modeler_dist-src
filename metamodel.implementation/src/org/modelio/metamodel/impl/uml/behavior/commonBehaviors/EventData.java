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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.uml.behavior.commonBehaviors.EventType;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0042dd58-c4bf-1fd8-97fe-001ec947cd2a")
public class EventData extends ModelElementData {
    @objid ("a70999f5-7b88-44bc-85cc-2c438d766a28")
     Object mExpression = "";

    @objid ("4786e4d2-10a0-4f20-b41c-f758ffcee89c")
     Object mKind = EventType.SIGNALEVENT;

    @objid ("d5f0564e-e0a3-4fdc-b744-a7d336c072e9")
     List<SmObjectImpl> mTriggered = null;

    @objid ("856d1c5a-57c9-4f4b-9389-0ebf04fb8753")
     SmObjectImpl mModel;

    @objid ("077688f8-8814-4fff-905f-b5bcedf1cd3a")
     List<SmObjectImpl> mOrigin = null;

    @objid ("5acfa367-035a-4a85-8b83-71d00f43609a")
     SmObjectImpl mCalled;

    @objid ("0c264840-ad9e-4e16-aa70-ffbe3971041f")
     SmObjectImpl mComposed;

    @objid ("6102fab8-1be6-4b5f-87d1-0c400ca58e98")
    public EventData(EventSmClass smClass) {
        super(smClass);
    }

}
