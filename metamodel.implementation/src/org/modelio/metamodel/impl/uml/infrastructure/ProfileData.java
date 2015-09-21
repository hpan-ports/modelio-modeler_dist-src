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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.statik.PackageData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("008ce3b2-c4be-1fd8-97fe-001ec947cd2a")
public class ProfileData extends PackageData {
    @objid ("1540f01f-b0ae-4542-93c6-47630dbbed85")
     Object mJCode = "";

    @objid ("b851d62f-2941-449c-80da-22c64713cc50")
     List<SmObjectImpl> mDefinedStereotype = null;

    @objid ("6d8c25a5-8b3f-4ff2-b861-5c1a8fb03bdb")
     SmObjectImpl mOwnerModule;

    @objid ("c3fb88b1-8a5c-4690-9810-d041796432ff")
     List<SmObjectImpl> mOwnedReference = null;

    @objid ("185bb9e7-f5e4-4e82-82a7-d138df3bede1")
    public ProfileData(ProfileSmClass smClass) {
        super(smClass);
    }

}
