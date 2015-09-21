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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.mda.ModuleParameterType;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00653042-c4bf-1fd8-97fe-001ec947cd2a")
public class ModuleParameterData extends ModelElementData {
    @objid ("dbb98965-d861-4f64-86c3-5cd6defd5fc0")
     Object mGroupName = "";

    @objid ("4a486205-17db-4171-b91a-d1ba9022d8a7")
     Object mType = ModuleParameterType.TYPE_PARAM_STRING;

    @objid ("4e2b548e-876f-4192-a92b-5c62e2803f13")
     Object mIsUserRead = true;

    @objid ("e416566b-e8cd-499f-acdc-523a6d234f6c")
     Object mIsUserWrite = true;

    @objid ("c11b7258-5e26-4742-935d-b1524571216a")
     Object mIsApiRead = true;

    @objid ("0d63d6ac-1657-40c9-9f13-dff00152445f")
     Object mIsApiWrite = true;

    @objid ("2b2cc4ed-880e-4dbd-9d62-32c450a1f4dd")
     Object mDefaultValue = "";

    @objid ("a6580cf5-6f12-4d4e-a323-6349eaf270b7")
     SmObjectImpl mOwner;

    @objid ("6ab9ba44-2836-46b2-9066-7b5dc782b580")
     SmObjectImpl mEnumType;

    @objid ("7396da13-11c4-47bd-8cf6-e8ce2cbd32c1")
    public ModuleParameterData(ModuleParameterSmClass smClass) {
        super(smClass);
    }

}
