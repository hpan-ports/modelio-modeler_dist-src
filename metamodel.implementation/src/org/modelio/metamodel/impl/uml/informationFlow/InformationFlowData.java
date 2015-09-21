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
package org.modelio.metamodel.impl.uml.informationFlow;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0063bfb4-c4bf-1fd8-97fe-001ec947cd2a")
public class InformationFlowData extends ModelElementData {
    @objid ("a92ffde7-9958-4283-b768-45b6cd23f118")
     SmObjectImpl mOwner;

    @objid ("ceb62bac-15f6-48f8-9a02-25b81dac2aa8")
     List<SmObjectImpl> mInformationSource = null;

    @objid ("a34e074c-75cd-402d-a434-fce209b0811d")
     List<SmObjectImpl> mInformationTarget = null;

    @objid ("495841f5-27a8-45e9-9519-2fef7bd61a53")
     List<SmObjectImpl> mRealizingActivityEdge = null;

    @objid ("737c55d0-55a6-4ccd-b942-3449582546bf")
     List<SmObjectImpl> mRealizingCommunicationMessage = null;

    @objid ("f20b4769-aabe-4d50-95db-518d887f9ac2")
     List<SmObjectImpl> mRealizingFeature = null;

    @objid ("1ee0ba7e-36f7-4cbb-825d-53c5fb03ab30")
     List<SmObjectImpl> mRealizingLink = null;

    @objid ("ec1c7d09-36c5-4cdc-8627-588b38a7d478")
     List<SmObjectImpl> mRealizingMessage = null;

    @objid ("4f7e4ab0-c00c-4dc9-bab3-d7f53102c144")
     List<SmObjectImpl> mRealizingNaryLink = null;

    @objid ("7a86c4bb-8cc1-4bbf-b2c8-63e25055a975")
     List<SmObjectImpl> mConveyed = null;

    @objid ("1495d2d4-fb07-420c-af08-ef5f28980675")
     SmObjectImpl mChannel;

    @objid ("d18e2ad0-1da1-4851-a23b-9192028041e6")
    public InformationFlowData(InformationFlowSmClass smClass) {
        super(smClass);
    }

}
