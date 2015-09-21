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
package org.modelio.metamodel.impl.uml.behavior.usecaseModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.statik.GeneralClassData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0058d388-c4bf-1fd8-97fe-001ec947cd2a")
public class UseCaseData extends GeneralClassData {
    @objid ("93b14a2c-510e-4cfa-ac71-a838ab1d8220")
     List<SmObjectImpl> mUsed = null;

    @objid ("026fb07f-3d4c-436f-9717-e9a077645224")
     List<SmObjectImpl> mOwnedExtension = null;

    @objid ("be88502a-5ff2-4373-81ab-b6476a5484c7")
     List<SmObjectImpl> mUser = null;

    @objid ("1d351913-0309-4d64-9d6c-a11bead7e56e")
    public UseCaseData(UseCaseSmClass smClass) {
        super(smClass);
    }

}
