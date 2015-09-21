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
package org.modelio.metamodel.impl.bpmn.processCollaboration;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0074d240-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnLaneData extends BpmnBaseElementData {
    @objid ("1fe37ed5-e276-4c05-8741-6e5957724557")
     SmObjectImpl mChildLaneSet;

    @objid ("6030c75e-e684-4d63-b084-465231c71c8f")
     SmObjectImpl mPartitionElement;

    @objid ("0cab7b91-a01d-4c06-a8ff-ae30e4af8024")
     List<SmObjectImpl> mFlowElementRef = null;

    @objid ("1cd39bd2-3939-4133-9449-b17534fdf818")
     SmObjectImpl mLaneSet;

    @objid ("c1d087ec-da1d-4502-bfdd-e9c406498c7c")
    public BpmnLaneData(BpmnLaneSmClass smClass) {
        super(smClass);
    }

}
