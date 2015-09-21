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
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("863f32ce-beeb-40a6-b9e0-8ee3cabd5975")
public class RiskData extends AnalystElementData {
    @objid ("3c203da1-8ae3-4491-9aa7-2986be89f080")
     List<SmObjectImpl> mSubRisk = null;

    @objid ("3ba9a4fb-1cfb-4174-805c-2e7582abc768")
     SmObjectImpl mOwnerContainer;

    @objid ("4860a27e-32bc-4a51-a688-578dd7e2c04c")
     SmObjectImpl mParentRisk;

    @objid ("6d613b31-a651-4319-a576-483ffc7bdf06")
     List<SmObjectImpl> mArchivedRiskVersion = null;

    @objid ("583a31fc-c4ff-405c-a58d-5eb7ed6cd282")
     SmObjectImpl mLastRiskVersion;

    @objid ("1124d4d8-4a18-4e03-b2d0-aeabe63e4e42")
    public RiskData(RiskSmClass smClass) {
        super(smClass);
    }

}
