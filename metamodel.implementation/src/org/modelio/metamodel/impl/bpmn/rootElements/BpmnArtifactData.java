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
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0078e650-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnArtifactData extends BpmnBaseElementData {
    @objid ("6b6a3abd-84eb-46b8-9189-89a0ee67f881")
     SmObjectImpl mSubProcess;

    @objid ("2e141747-d23e-438b-a86a-4986165ee1d7")
     SmObjectImpl mCollaboration;

    @objid ("1c7114cc-f85e-49d2-aad8-230f9fad0791")
     SmObjectImpl mProcess;

    @objid ("bd47160e-e8ab-4c00-ab9e-d70e85b4c95a")
    public BpmnArtifactData(BpmnArtifactSmClass smClass) {
        super(smClass);
    }

}
