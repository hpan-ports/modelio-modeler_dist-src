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
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("002659ee-c4bf-1fd8-97fe-001ec947cd2a")
public class ActivityData extends BehaviorData {
    @objid ("cf44b939-1ada-432d-9173-f5ebfb4ea89a")
     Object mIsSingleExecution = false;

    @objid ("4ead7f26-f22f-45a4-834a-0da851ae5e49")
     Object mIsReadOnly = false;

    @objid ("ffb5af68-c3b9-4c41-b630-c634271efa6b")
     List<SmObjectImpl> mOwnedGroup = null;

    @objid ("7d91c981-c349-44e3-a842-8665bd786a0d")
     List<SmObjectImpl> mOwnedNode = null;

    @objid ("742a4fcb-2b10-4b01-ac86-e2635f2a4e7f")
    public ActivityData(ActivitySmClass smClass) {
        super(smClass);
    }

}
