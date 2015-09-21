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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.behavior.commonBehaviors.BehaviorData;
import org.modelio.metamodel.uml.behavior.stateMachineModel.KindOfStateMachine;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00546122-c4bf-1fd8-97fe-001ec947cd2a")
public class StateMachineData extends BehaviorData {
    @objid ("860f95c0-2626-4532-97fc-fe415363f5fa")
     Object mKind = KindOfStateMachine.DYNAMIC;

    @objid ("4b37cf2a-8ddc-44ca-a6f8-ce09622bd402")
     SmObjectImpl mTop;

    @objid ("60d89a7f-fca2-448e-87c1-00b8c5913314")
     List<SmObjectImpl> mSubmachineState = null;

    @objid ("93890367-2bff-45ac-88a4-a77327f28cc9")
     List<SmObjectImpl> mEntryPoint = null;

    @objid ("d3c6b7ba-ecd8-44e2-b69a-022a38769060")
     List<SmObjectImpl> mExitPoint = null;

    @objid ("fd6af152-f81f-4789-ada2-1f95cc849416")
    public StateMachineData(StateMachineSmClass smClass) {
        super(smClass);
    }

}
