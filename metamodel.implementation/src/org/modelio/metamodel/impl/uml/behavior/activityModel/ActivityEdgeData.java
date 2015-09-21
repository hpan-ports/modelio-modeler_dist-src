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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00275f10-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ActivityEdgeData extends ModelElementData {
    @objid ("44832650-3316-4a4c-8837-6cd41582f3d6")
     Object mGuard = "";

    @objid ("a69eaae2-57d6-4af4-aace-c54278e4628f")
     Object mWeight = "1";

    @objid ("8e27bedf-8bfe-4c0e-b5a6-dbb42d06408a")
     SmObjectImpl mTarget;

    @objid ("358c4a4a-b9eb-4ccf-b1f4-e9d9098b469d")
     SmObjectImpl mSource;

    @objid ("13a0b092-4aaa-4ccc-9c55-afde43dfff63")
     SmObjectImpl mInterrupts;

    @objid ("82406048-8112-4053-a124-039c90faae5f")
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("4385c95a-126d-4a25-9700-200bb1303042")
    public ActivityEdgeData(ActivityEdgeSmClass smClass) {
        super(smClass);
    }

}
