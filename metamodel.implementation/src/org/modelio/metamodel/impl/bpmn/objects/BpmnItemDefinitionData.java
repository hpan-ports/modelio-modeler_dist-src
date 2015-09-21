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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.bpmn.objects.BpmnItemKind;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00080bd8-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnItemDefinitionData extends BpmnRootElementData {
    @objid ("6fcdc5fc-1dbd-4e8c-87b7-2ffbc34a5bef")
     Object mItemKind = BpmnItemKind.INFORMATION;

    @objid ("cb598a4a-6fda-4015-906d-8e672d182a25")
     Object mIsCollection = false;

    @objid ("93e46754-41e4-4c30-b284-9ee57ea77cee")
     SmObjectImpl mStructureRef;

    @objid ("89505ee2-c2e6-40e5-b29b-e1a852a0bfe5")
     List<SmObjectImpl> mTypedMessage = null;

    @objid ("95299006-fd96-497e-a307-33c14690093e")
     List<SmObjectImpl> mTypedItem = null;

    @objid ("4fdc9316-8605-4c6c-89eb-86b8c8135b8e")
     List<SmObjectImpl> mTypedResourceParameter = null;

    @objid ("499f710f-0b74-42e9-84d1-24bd9fce46b1")
    public BpmnItemDefinitionData(BpmnItemDefinitionSmClass smClass) {
        super(smClass);
    }

}
