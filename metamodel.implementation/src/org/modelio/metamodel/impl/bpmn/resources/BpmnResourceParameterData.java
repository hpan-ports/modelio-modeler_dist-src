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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("000a49ca-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnResourceParameterData extends BpmnBaseElementData {
    @objid ("633a45dc-fcbf-4221-b0c3-7e860bd809c1")
     Object mIsRequired = false;

    @objid ("51c0da5a-b424-4aff-a0f5-a6bcef562a42")
     SmObjectImpl mResource;

    @objid ("b86e0ea2-c972-45d7-8685-ea53bdb1788d")
     SmObjectImpl mType;

    @objid ("614ff1bf-3b0d-4a8b-825e-d4628d0833ed")
     List<SmObjectImpl> mParameterBindingRefs = null;

    @objid ("2b9b1517-e400-4cf3-ad99-3138105948ba")
    public BpmnResourceParameterData(BpmnResourceParameterSmClass smClass) {
        super(smClass);
    }

}
