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

@objid ("007a05d0-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnFlowNodeData extends BpmnFlowElementData {
    @objid ("0f4b7ac4-a780-484f-a8f4-d6f50ee2a19e")
     List<SmObjectImpl> mOutgoing = null;

    @objid ("282b16e4-63bb-4f60-b1a9-2edab043a744")
     List<SmObjectImpl> mResource = null;

    @objid ("26979fed-b6e3-4943-8119-b5b182d3b934")
     List<SmObjectImpl> mIncoming = null;

    @objid ("64584ea5-7a57-4698-8ddd-25d3767918b9")
    public BpmnFlowNodeData(BpmnFlowNodeSmClass smClass) {
        super(smClass);
    }

}
