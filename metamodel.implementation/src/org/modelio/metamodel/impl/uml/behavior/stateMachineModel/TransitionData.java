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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00561594-c4bf-1fd8-97fe-001ec947cd2a")
public class TransitionData extends ModelElementData {
    @objid ("259b48b1-ac8a-4d55-a6c3-1e3d5fae9c5d")
     Object mEffect = "";

    @objid ("5fbcd640-f8c5-45b9-aec2-c0567325e1f1")
     Object mReceivedEvents = "";

    @objid ("30d44542-5095-4794-b4a4-97371a306850")
     Object mSentEvents = "";

    @objid ("da78ef84-328e-408c-a5a9-f331165970ed")
     Object mGuard = "";

    @objid ("c2739be1-a30a-4135-a13d-e60d48269ce0")
     Object mPostCondition = "";

    @objid ("f8a63ae1-e6af-4e24-a60e-f94c04a44717")
     SmObjectImpl mProcessed;

    @objid ("a2da544f-2b8b-465d-a441-18cce18d1de2")
     SmObjectImpl mTrigger;

    @objid ("78db82e5-62fb-4ae5-b9b8-6cc8ae3cd03b")
     SmObjectImpl mBehaviorEffect;

    @objid ("70573a51-1b13-4e53-8b0a-1052abfd9900")
     SmObjectImpl mTarget;

    @objid ("fd78e2df-a9b7-4c7b-8fae-0c0fcb5a22b7")
     SmObjectImpl mSource;

    @objid ("695c2429-52cb-4513-96f8-f26e0e100437")
     SmObjectImpl mEffects;

    @objid ("a3c835fa-d62f-4d6d-8e59-653c9bc04143")
    public TransitionData(TransitionSmClass smClass) {
        super(smClass);
    }

}
