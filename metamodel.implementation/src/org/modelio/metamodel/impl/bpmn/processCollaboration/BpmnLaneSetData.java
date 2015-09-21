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

@objid ("00754d60-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnLaneSetData extends BpmnBaseElementData {
    @objid ("24525351-eeaa-48ba-8335-acb7ba0f9593")
     List<SmObjectImpl> mLane = null;

    @objid ("5ce2cf55-bdbb-419a-a63d-d60441fdd03c")
     SmObjectImpl mProcess;

    @objid ("f134b2be-8f80-4a03-be3b-855ce28168a8")
     SmObjectImpl mParentLane;

    @objid ("eaac3a34-9d95-4085-a6be-8d5361821476")
     SmObjectImpl mSubProcess;

    @objid ("6ba1993d-3493-4969-86d3-468c16b9f0cd")
    public BpmnLaneSetData(BpmnLaneSetSmClass smClass) {
        super(smClass);
    }

}
