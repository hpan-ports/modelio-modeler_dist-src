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
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("007f5012-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnCallActivityData extends BpmnActivityData {
    @objid ("5e99938a-4caa-4f1a-ba90-d7b70eccf478")
     SmObjectImpl mCalledGlobalTask;

    @objid ("ea41afa6-6f8c-4ff2-9107-004076b033dd")
     SmObjectImpl mCalledProcess;

    @objid ("8fea903c-4e2e-411a-a904-5c160d269ccd")
     SmObjectImpl mCalledOperation;

    @objid ("5a52df43-1410-4435-84ab-cfe267cf3e30")
     SmObjectImpl mCalledBehavior;

    @objid ("d52384b8-8ba0-4cca-876b-a0626bd159d7")
    public BpmnCallActivityData(BpmnCallActivitySmClass smClass) {
        super(smClass);
    }

}
