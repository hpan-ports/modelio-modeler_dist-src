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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.rootElements.BpmnAssociationDirection;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00779282-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnAssociationData extends BpmnArtifactData {
    @objid ("09609429-38c8-42b5-b151-d26a552ee398")
     Object mAssociationDirection = BpmnAssociationDirection.NONEDIRECTION;

    @objid ("ce1c605d-7733-41d6-86e5-875350709cab")
     SmObjectImpl mTargetRef;

    @objid ("841c74f8-2747-4d7c-aa35-0142dcba27b2")
     SmObjectImpl mSourceRef;

    @objid ("e69b4822-6142-4482-a0a4-e5dd76fbfbea")
    public BpmnAssociationData(BpmnAssociationSmClass smClass) {
        super(smClass);
    }

}
