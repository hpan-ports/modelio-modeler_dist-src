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
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0046e4ac-c4bf-1fd8-97fe-001ec947cd2a")
public class InteractionData extends BehaviorData {
    @objid ("18c5f5cd-9ca1-4c14-a4c1-3fdae74b2143")
     List<SmObjectImpl> mFormalGate = null;

    @objid ("83d4a9c8-d46c-4045-b8a0-9ea1523dd8a8")
     List<SmObjectImpl> mFragment = null;

    @objid ("e3cd4aee-8e3f-4b80-acdc-d3b32d84d35f")
     List<SmObjectImpl> mOwnedLine = null;

    @objid ("7080b929-ece2-4c9f-b27a-496dec542169")
     List<SmObjectImpl> mReferedUse = null;

    @objid ("b9e117c0-fb3d-4077-99f7-8590e4462016")
    public InteractionData(InteractionSmClass smClass) {
        super(smClass);
    }

}
