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
import org.modelio.metamodel.uml.behavior.commonBehaviors.ParameterEffectKind;
import org.modelio.metamodel.uml.statik.PassingMode;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0018552e-c4bf-1fd8-97fe-001ec947cd2a")
public class ParameterData extends ModelElementData {
    @objid ("81bb8e4a-080d-4f67-8179-48d79eee146c")
     Object mParameterPassing = PassingMode.IN;

    @objid ("2b2a0552-5e56-4d24-92b8-58e60378b321")
     Object mMultiplicityMin = "1";

    @objid ("97956a30-dbf4-4a06-bb3e-873871a61fa1")
     Object mMultiplicityMax = "1";

    @objid ("97bf1f6d-0a8c-43a0-9702-69af0c0e584a")
     Object mTypeConstraint = "";

    @objid ("794e1b16-9814-4aa0-b09f-418271e6d788")
     Object mDefaultValue = "";

    @objid ("9481c795-6b7a-436b-970f-1716eb6e4de2")
     Object mIsOrdered = false;

    @objid ("6b01e5a8-1051-4949-aafb-8d1c4f6c9786")
     Object mIsUnique = false;

    @objid ("7b0effa1-b129-4afc-a421-378247de78cb")
     Object mIsException = false;

    @objid ("1c17386f-4862-43d0-af4a-da8a48e10760")
     Object mIsStream = false;

    @objid ("6bfcae4c-5c58-4a3e-a5f0-35dbf59cff87")
     Object mEffect = ParameterEffectKind.READEFFECT;

    @objid ("1d7ed1fe-5947-47af-b20d-6950ad87a002")
     List<SmObjectImpl> mBpmnRepresentingDataInput = null;

    @objid ("46d5fdb1-1811-41a2-b3f1-84fa4ce3d97e")
     SmObjectImpl mType;

    @objid ("01863ea9-ca2d-463d-8929-cf0d84872cf9")
     SmObjectImpl mComposed;

    @objid ("5d8dc722-4be6-4734-8183-8fcd907df588")
     List<SmObjectImpl> mMatching = null;

    @objid ("b04921cc-ea9a-4dd0-8e39-4e48a592b7b4")
     List<SmObjectImpl> mBpmnRepresentingDataOutput = null;

    @objid ("3b28c63c-a146-475b-9b51-d6773b5817e2")
     List<SmObjectImpl> mSRepresentation = null;

    @objid ("07a87679-4f1b-4871-af3f-ee223dc69eda")
     SmObjectImpl mReturned;

    @objid ("24590c03-584a-4f39-9164-ec157384197f")
     List<SmObjectImpl> mBehaviorParam = null;

    @objid ("410fa621-1282-4bf9-af35-e6dbe5b577ee")
    public ParameterData(ParameterSmClass smClass) {
        super(smClass);
    }

}
