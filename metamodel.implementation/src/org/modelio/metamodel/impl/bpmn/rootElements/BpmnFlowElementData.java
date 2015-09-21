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
package org.modelio.metamodel.impl.bpmn.rootElements;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("007984ac-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnFlowElementData extends BpmnBaseElementData {
    @objid ("6d7ed8fd-1a2d-43d9-ba9c-0ab302502be0")
     List<SmObjectImpl> mGroups = null;

    @objid ("306cb5f8-4409-428e-b8c0-d2b95cbbf31f")
     SmObjectImpl mSubProcess;

    @objid ("cb64a3f9-c3c7-44fd-bbc0-612f4f171fab")
     List<SmObjectImpl> mLane = null;

    @objid ("97a50f59-ff8b-474e-a783-e42fe477739b")
     SmObjectImpl mContainer;

    @objid ("20268c37-4cbd-4021-84fb-6ea31edf6161")
    public BpmnFlowElementData(BpmnFlowElementSmClass smClass) {
        super(smClass);
    }

}
