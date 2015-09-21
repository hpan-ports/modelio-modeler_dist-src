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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00459ffc-c4bf-1fd8-97fe-001ec947cd2a")
public class GateData extends MessageEndData {
    @objid ("412b6705-2e3e-4e73-99d3-5300c4bd7064")
     SmObjectImpl mOwnerUse;

    @objid ("9b03641d-ba86-4133-85a9-4d28c1af3dc8")
     List<SmObjectImpl> mActual = null;

    @objid ("791e9e6a-e154-4bb8-a216-db5cd461330b")
     SmObjectImpl mOwnerInteraction;

    @objid ("5a388e13-c18f-4dbe-9cb5-36c1d59b8522")
     SmObjectImpl mOwnerFragment;

    @objid ("4a775079-26b2-46f7-b9f4-5a164e897a43")
     SmObjectImpl mFormal;

    @objid ("34eb1c81-f341-4545-a7dc-0c7d8d847306")
    public GateData(GateSmClass smClass) {
        super(smClass);
    }

}
