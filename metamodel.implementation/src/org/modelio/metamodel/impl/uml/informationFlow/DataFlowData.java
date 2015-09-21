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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0064a956-c4bf-1fd8-97fe-001ec947cd2a")
public class DataFlowData extends ModelElementData {
    @objid ("001bb1dd-7b8b-4f23-b7c0-36abc5e4f4cb")
     SmObjectImpl mDestination;

    @objid ("a82a7c7d-1abb-406a-b5ed-aef412495f37")
     SmObjectImpl mOrigin;

    @objid ("5ca33942-89e3-485c-9988-9ca0846aadab")
     SmObjectImpl mOwner;

    @objid ("4f3f415b-22cb-48d1-9cfa-1435befa7adb")
     SmObjectImpl mSModel;

    @objid ("b7c9db24-9f4e-46ca-aa05-dd2a6ceed222")
    public DataFlowData(DataFlowSmClass smClass) {
        super(smClass);
    }

}
