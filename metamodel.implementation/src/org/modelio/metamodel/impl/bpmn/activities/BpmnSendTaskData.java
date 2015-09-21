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
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0082e34e-c4bf-1fd8-97fe-001ec947cd2a")
public class BpmnSendTaskData extends BpmnTaskData {
    @objid ("8ca99eb9-fb89-4aa6-b06f-3156583f6704")
     Object mImplementation = "##WebService";

    @objid ("c349738f-bac0-43b0-a60c-7d0af42d1609")
     SmObjectImpl mMessageRef;

    @objid ("dea63667-a949-4ea3-8944-5d776aafcdb4")
     SmObjectImpl mOperationRef;

    @objid ("474826bc-6ec0-4ab1-b645-c6ed233fb975")
     SmObjectImpl mCalledOperation;

    @objid ("72cfe672-ca1e-4abb-9859-34103f87c524")
    public BpmnSendTaskData(BpmnSendTaskSmClass smClass) {
        super(smClass);
    }

}
