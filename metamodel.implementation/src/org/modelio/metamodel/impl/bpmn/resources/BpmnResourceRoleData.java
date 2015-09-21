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
package org.modelio.metamodel.impl.bpmn.resources;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("000aeda8-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnResourceRoleData extends BpmnBaseElementData {
    @objid ("39820945-65e5-41f2-91ef-dbc6920b7b52")
     SmObjectImpl mResourceRef;

    @objid ("12c68d44-e4b7-4a53-a1d0-00f2a9e05fe0")
     SmObjectImpl mAnnotated;

    @objid ("f8946cea-892e-4559-a73c-a9840f0aa97e")
     List<SmObjectImpl> mResourceParameterBinding = null;

    @objid ("0b2c9cf4-a4cb-46aa-b12b-887f6cd655a3")
     SmObjectImpl mProcess;

    @objid ("ad38bab3-15e0-4292-8d5a-f9f1f410aebf")
    public BpmnResourceRoleData(BpmnResourceRoleSmClass smClass) {
        super(smClass);
    }

}
