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
import org.modelio.metamodel.impl.uml.statik.GeneralClassData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0042606c-c4bf-1fd8-97fe-001ec947cd2a")
public class SignalData extends GeneralClassData {
    @objid ("ca720eb2-4cc7-4ca7-8032-b767ea8e5855")
     Object mIsEvent = false;

    @objid ("937ee24f-2103-4e5b-80d8-a25ef57d84dd")
     Object mIsException = false;

    @objid ("bc74b87b-6226-418f-8fe6-1d31c3ac95cb")
     List<SmObjectImpl> mSender = null;

    @objid ("140bd97d-b0de-4ae7-97d8-72cfdcf3438e")
     List<SmObjectImpl> mUsage = null;

    @objid ("9522be46-d8f6-4381-9c6b-9ac66b312c69")
     List<SmObjectImpl> mSends = null;

    @objid ("4540e3df-4b09-438f-8879-e1a67c47ebca")
     SmObjectImpl mPBase;

    @objid ("ba2812fc-f26a-4730-af1e-a564f19074c0")
     SmObjectImpl mOBase;

    @objid ("6357077d-376b-40e4-a4a2-3d7f835b7a39")
     List<SmObjectImpl> mCommunicationUsage = null;

    @objid ("6252276c-a37c-4b67-88f2-9ef7376e2b53")
     List<SmObjectImpl> mDOccurence = null;

    @objid ("01401a96-9873-42cd-9ac6-cc5046938e52")
     List<SmObjectImpl> mEOccurence = null;

    @objid ("e621bcbe-8c00-46a7-98eb-c9259b643b38")
     SmObjectImpl mBase;

    @objid ("6d83f9e4-2163-41b0-a2e7-af70d2d1d497")
     List<SmObjectImpl> mReceiver = null;

    @objid ("e176cb86-891e-4527-a62a-43154edb8db5")
    public SignalData(SignalSmClass smClass) {
        super(smClass);
    }

}
