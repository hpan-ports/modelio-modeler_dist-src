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
package org.modelio.metamodel.impl.bpmn.bpmnService;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnRootElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("000e4fac-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnInterfaceData extends BpmnRootElementData {
    @objid ("403a1e10-0aec-4b70-a876-6716d7f5be8e")
     SmObjectImpl mImplementationRef;

    @objid ("929aa226-bb46-4c20-b565-acc4d3e41533")
     List<SmObjectImpl> mOperation = null;

    @objid ("076e9383-ff38-4fd9-af86-035a79ec5c9a")
     List<SmObjectImpl> mParticipantRef = null;

    @objid ("82809249-90e2-4c54-b7f0-060beb7e2046")
    public BpmnInterfaceData(BpmnInterfaceSmClass smClass) {
        super(smClass);
    }

}
