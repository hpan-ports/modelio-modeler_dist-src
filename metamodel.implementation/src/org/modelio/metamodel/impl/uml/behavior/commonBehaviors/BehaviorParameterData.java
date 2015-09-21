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
package org.modelio.metamodel.impl.uml.behavior.commonBehaviors;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.statik.ParameterData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00416784-c4bf-1fd8-97fe-001ec947cd2a")
public class BehaviorParameterData extends ParameterData {
    @objid ("b455fb8a-7185-4c9b-8fdc-448f795707fb")
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("77aedc5e-ea38-4593-9ee9-7889dcb4a29a")
     SmObjectImpl mOwner;

    @objid ("29abbeb8-628c-4180-a159-eb57df1ed468")
     SmObjectImpl mMapped;

    @objid ("017c8093-8497-4c1c-99e6-824ec3ac8bcd")
    public BehaviorParameterData(BehaviorParameterSmClass smClass) {
        super(smClass);
    }

}
