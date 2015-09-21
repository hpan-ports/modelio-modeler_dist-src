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
package org.modelio.metamodel.impl.bpmn.events;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("008909ea-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnCatchEventData extends BpmnEventData {
    @objid ("55a1de9a-1472-41bb-9abc-2d6d7ae94d9f")
     Object mParallelMultiple = false;

    @objid ("7a05f929-6327-4632-9f22-ac448d99cbea")
     List<SmObjectImpl> mDataOutputAssociation = null;

    @objid ("13cacf12-fbf1-4e43-b8d8-4ad7037b08d8")
     SmObjectImpl mDataOutput;

    @objid ("b7389685-7aa4-43ff-8183-7fc1a2139466")
    public BpmnCatchEventData(BpmnCatchEventSmClass smClass) {
        super(smClass);
    }

}
