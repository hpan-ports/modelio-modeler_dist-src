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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("008489ba-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnSubProcessData extends BpmnActivityData {
    @objid ("f50597d7-994b-481e-a058-2601100dab0c")
     Object mTriggeredByEvent = false;

    @objid ("1d14ae78-bf3e-4c49-bbaa-35d6a38c23ba")
     List<SmObjectImpl> mArtifact = null;

    @objid ("d8c41228-2d68-4366-8a54-b8f5a5cbbe81")
     List<SmObjectImpl> mFlowElement = null;

    @objid ("de7a23cb-90ad-47f2-8644-aca9d25bd13a")
     List<SmObjectImpl> mLaneSet = null;

    @objid ("4aabf44c-10cc-4bf2-aa32-580af4ffa386")
    public BpmnSubProcessData(BpmnSubProcessSmClass smClass) {
        super(smClass);
    }

}
