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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("002a3320-c4bf-1fd8-97fe-001ec947cd2a")
public class ActivityPartitionData extends ActivityGroupData {
    @objid ("d5453634-a2b3-405c-a3ec-41ca6f2c7b3e")
     Object mIsDimension = false;

    @objid ("58250b41-e2df-47fa-8624-00d409681dd8")
     Object mIsExternal = false;

    @objid ("b76ce370-c02d-4400-b354-13c46fc89638")
     SmObjectImpl mRepresented;

    @objid ("216da8dd-a7c7-43b2-84a0-5a008d763208")
     List<SmObjectImpl> mContainedNode = null;

    @objid ("a38207a6-98f3-473e-a2fd-177817ad6e8f")
     List<SmObjectImpl> mOutgoing = null;

    @objid ("a9703071-512a-4e8a-a1cf-080dd109b112")
     SmObjectImpl mSuperPartition;

    @objid ("7f0b6419-9f1b-4294-a50d-23ee2f46058c")
     List<SmObjectImpl> mSubPartition = null;

    @objid ("3d177ca7-2eca-4925-925a-d2eebce55ffc")
     List<SmObjectImpl> mIncoming = null;

    @objid ("578f35b7-bfd9-49f1-b34e-782e7e6bc024")
    public ActivityPartitionData(ActivityPartitionSmClass smClass) {
        super(smClass);
    }

}
