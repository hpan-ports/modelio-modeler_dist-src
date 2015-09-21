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
package org.modelio.metamodel.impl.uml.statik;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("001be5d6-c4bf-1fd8-97fe-001ec947cd2a")
public class RequiredInterfaceData extends ModelElementData {
    @objid ("96b5f948-b8f3-456b-bd73-cf3d4a799454")
     List<SmObjectImpl> mRequiredElement = null;

    @objid ("18aa74d7-d982-40bf-98e3-bc06038d94ae")
     List<SmObjectImpl> mProvider = null;

    @objid ("0e54483c-a23f-41bc-9357-c8c91cbe0198")
     SmObjectImpl mRequiring;

    @objid ("f17aa452-5f1f-4eb2-baef-0d2c14e5ee4c")
     List<SmObjectImpl> mNaryProvider = null;

    @objid ("df027818-2e62-4fe9-a0c7-e336a5abca5c")
    public RequiredInterfaceData(RequiredInterfaceSmClass smClass) {
        super(smClass);
    }

}
