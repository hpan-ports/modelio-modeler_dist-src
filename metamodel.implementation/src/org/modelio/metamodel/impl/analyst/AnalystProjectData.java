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
 Metamodel: Standard, version 0.0.9025, by Modeliosoft
 Generator version: 3.2.10.9023
 Generated on: May 06, 2015
 */
/* WARNING: GENERATED FILE -  DO NOT EDIT
     Metamodel: Standard, version 0.0.9026, by Modeliosoft
     Generator version: 3.4.00
     Generated on: Jun 23, 2015
*/
package org.modelio.metamodel.impl.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00621268-c4bf-1fd8-97fe-001ec947cd2a")
public class AnalystProjectData extends ModelElementData {
    @objid ("98a84e5f-f784-4883-ba96-9fcc7a66951c")
     SmObjectImpl mPropertyRoot;

    @objid ("da32483d-e345-44a0-91c1-a4dd0b3dc885")
     List<SmObjectImpl> mGoalRoot = null;

    @objid ("06b4e668-5ed9-4d03-a07c-7f2b264512b3")
     List<SmObjectImpl> mBusinessRuleRoot = null;

    @objid ("c8ff31e6-4df9-4173-9f8a-d2e6b56e3b06")
     List<SmObjectImpl> mDictionaryRoot = null;

    @objid ("7e55d825-0c60-468d-ae89-93477cc87c35")
     List<SmObjectImpl> mRequirementRoot = null;

    @objid ("ae37f215-ce03-4a53-bae8-aff7a0228e82")
     List<SmObjectImpl> mGenericRoot = null;

    @objid ("8ecc0dbd-3e42-4cf2-bab9-3c0283bfc81e")
     List<SmObjectImpl> mRiskRoot = null;

    @objid ("452cb905-2b37-4fd9-a4e3-e2bf53716839")
    public AnalystProjectData(AnalystProjectSmClass smClass) {
        super(smClass);
    }

}
