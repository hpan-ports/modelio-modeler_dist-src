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
package org.modelio.metamodel.impl.mda;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.statik.ComponentData;
import org.modelio.metamodel.mda.ModuleState;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0065c782-c4bf-1fd8-97fe-001ec947cd2a")
public class ModuleComponentData extends ComponentData {
    @objid ("d59d4f75-74ed-4915-8d7e-c15a73d90fcb")
     Object mLicenseKey = 0;

    @objid ("378a234b-f3b3-47da-a77f-f9907d706b92")
     Object mMajVersion = 0;

    @objid ("aff3ce19-d105-4e01-a23c-35366b005fa5")
     Object mMinVersion = 0;

    @objid ("f34e0de8-6660-42b6-ae7c-8aee94edd1d9")
     Object mMinMinVersion = "";

    @objid ("32cc44e3-b00f-4554-b198-97a4de8c0b8a")
     Object mMinBinVersionCompatibility = "";

    @objid ("d594ded1-581a-4b76-82f9-8fc08307cd15")
     Object mJavaClassName = "";

    @objid ("a7c2f273-bd9d-4010-b995-462c9891b72a")
     Object mState = ModuleState.SOMODULESTATEACTIVATED;

    @objid ("bb1f7d09-df1c-4d81-8d86-e6eeb750c4d4")
     List<SmObjectImpl> mDefinedPropertyType = null;

    @objid ("fb839b6f-e21e-4e28-be86-36f69630eac2")
     List<SmObjectImpl> mOwnedProfile = null;

    @objid ("a63031f0-9e44-49e2-bb25-5e785d31c511")
     List<SmObjectImpl> mModuleParameter = null;

    @objid ("db3e4d51-e2aa-4f3c-afdc-f9ac3f7c218a")
     List<SmObjectImpl> mDependsOn = null;

    @objid ("ad7d8f4f-f2c6-426c-86f0-f73d55701a5b")
     List<SmObjectImpl> mImpacted = null;

    @objid ("d0f1c0d0-766d-49ab-af55-eb4cb30ed9f8")
    public ModuleComponentData(ModuleComponentSmClass smClass) {
        super(smClass);
    }

}
