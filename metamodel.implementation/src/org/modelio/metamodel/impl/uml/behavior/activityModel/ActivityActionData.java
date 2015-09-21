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

@objid ("0026da86-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ActivityActionData extends ActivityNodeData {
    @objid ("581f06c6-6d50-4760-ab0a-8be0c1c998f0")
     Object mIsMultipleInstance = false;

    @objid ("c342e84a-0c9e-4f97-b610-5e3a8e8f581b")
     Object mIsCompensation = false;

    @objid ("56efa4f9-33bd-400e-843b-6e54f759e9df")
     List<SmObjectImpl> mOutput = null;

    @objid ("49dda3c6-8822-4329-a3fc-05d61692bec9")
     List<SmObjectImpl> mInput = null;

    @objid ("04a03c65-e18c-4e1e-9caa-e1297aa163cf")
     List<SmObjectImpl> mHandler = null;

    @objid ("86701756-668b-46b5-a674-21aa6b8d750e")
    public ActivityActionData(ActivityActionSmClass smClass) {
        super(smClass);
    }

}
