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
import org.modelio.metamodel.bpmn.activities.AdHocOrdering;

@objid ("007e3c68-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnAdHocSubProcessData extends BpmnSubProcessData {
    @objid ("61fd8ae1-ea09-455a-9131-74036a482f81")
     Object mOrdering = AdHocOrdering.PARALLELORDERING;

    @objid ("890076f9-c478-4494-9854-2dad1659aee8")
     Object mCancelRemainingInstances = true;

    @objid ("2e478ae5-92f0-4853-afec-adfb321e63f6")
     Object mCompletionCondition = "";

    @objid ("3f784750-9ec1-4a08-b1e7-257e435b9c6f")
    public BpmnAdHocSubProcessData(BpmnAdHocSubProcessSmClass smClass) {
        super(smClass);
    }

}
