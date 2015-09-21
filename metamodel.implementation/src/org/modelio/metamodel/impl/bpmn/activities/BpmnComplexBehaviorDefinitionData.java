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
package org.modelio.metamodel.impl.bpmn.activities;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("007fcaf6-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnComplexBehaviorDefinitionData extends BpmnBaseElementData {
    @objid ("b80fed4e-1e5c-4ae3-b4d4-25ba3773f0f6")
     Object mCondition = "";

    @objid ("1e39bafd-62ed-4925-a3c6-31425d78eb87")
     SmObjectImpl mOwner;

    @objid ("237d083d-98c4-434c-b1e4-b9c78cd420c5")
     SmObjectImpl mEvent;

    @objid ("ff2f6511-9c76-4a33-ad30-eecb51768825")
    public BpmnComplexBehaviorDefinitionData(BpmnComplexBehaviorDefinitionSmClass smClass) {
        super(smClass);
    }

}
