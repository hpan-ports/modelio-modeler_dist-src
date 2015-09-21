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
package org.modelio.metamodel.impl.bpmn.resources;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("000b8d44-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnResourceParameterBindingData extends BpmnBaseElementData {
    @objid ("034eb4cb-330a-438f-8dd5-c459208a6a33")
     Object mExpression = "";

    @objid ("72b2e090-26f8-4d4b-88b8-c3ecdc6357c5")
     SmObjectImpl mResourceRole;

    @objid ("c6d602cd-cfe5-4844-978d-f88a4353423f")
     SmObjectImpl mParameterRef;

    @objid ("3e65a4f9-fb1b-428a-8cf9-35a8b425c408")
    public BpmnResourceParameterBindingData(BpmnResourceParameterBindingSmClass smClass) {
        super(smClass);
    }

}
