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
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00783e94-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class BpmnBaseElementData extends ModelElementData {
    @objid ("61d2fe84-50c5-4d6c-98dd-76e08f1b752b")
     List<SmObjectImpl> mOutgoingAssoc = null;

    @objid ("8e731a5a-ca8c-4637-adea-a388f2df3155")
     List<SmObjectImpl> mIncomingAssoc = null;

    @objid ("c996db16-9d0c-4ec9-b8e7-2d2f577dc53e")
     List<SmObjectImpl> mIncomingFlow = null;

    @objid ("caa7f8c4-87c1-43fe-a5f7-0b27287b6f3c")
     List<SmObjectImpl> mOutgoingFlow = null;

    @objid ("72648a91-ec8a-4b94-876a-6b920cc865a0")
    public BpmnBaseElementData(BpmnBaseElementSmClass smClass) {
        super(smClass);
    }

}
