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
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0040ed22-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BehaviorData extends ModelElementData {
    @objid ("5f84e387-2f04-4522-9988-4c5cd9a0b945")
     Object mIsReentrant = false;

    @objid ("fcff0645-36cf-496b-a5e9-02c1078b47c8")
     List<SmObjectImpl> mBpmnCaller = null;

    @objid ("85b618b8-3ffc-4be7-b320-68cdd8bb8691")
     SmObjectImpl mOwner;

    @objid ("20c3e4c1-a8e4-44f3-a06b-cc7e6946de7e")
     List<SmObjectImpl> mParameter = null;

    @objid ("7230d610-e716-4564-972c-8bb3a6439090")
     SmObjectImpl mOwnerOperation;

    @objid ("8e81d58d-0426-4c99-82f7-3880f81e1523")
     List<SmObjectImpl> mOwnedCollaboration = null;

    @objid ("f8a1508c-73c5-4262-9685-7353ad689698")
     List<SmObjectImpl> mCaller = null;

    @objid ("2d2ff7b7-c524-41fc-8983-72cd178c9eb7")
     List<SmObjectImpl> mEComponent = null;

    @objid ("67b68d98-d968-4bf2-bc42-f585a96f67d1")
     List<SmObjectImpl> mEffectOf = null;

    @objid ("6899d228-434d-45e7-893e-53b25d186a82")
    public BehaviorData(BehaviorSmClass smClass) {
        super(smClass);
    }

}
