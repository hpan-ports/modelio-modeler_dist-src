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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00169568-c4bf-1fd8-97fe-001ec947cd2a")
public class PackageImportData extends ModelElementData {
    @objid ("c13f8c1f-46a1-45cd-b992-6da2a78f0d7b")
     Object mVisibility = VisibilityMode.PRIVATE;

    @objid ("89dc1603-6d9d-4611-a093-96a90ede808e")
     SmObjectImpl mImportingOperation;

    @objid ("c6acd35d-5572-48cf-a10c-d42da50e2f12")
     SmObjectImpl mImportingNameSpace;

    @objid ("14dee9f8-cffa-4894-8cde-ce1b9045109c")
     SmObjectImpl mImportedPackage;

    @objid ("ad5f9b4d-ed8f-49c9-bba0-0562c6e2f017")
    public PackageImportData(PackageImportSmClass smClass) {
        super(smClass);
    }

}
