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

@objid ("000b775a-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class FeatureData extends ModelElementData {
    @objid ("a20b066c-9361-4a65-b0ba-ad37035d1e65")
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("1931c71e-8093-4d34-988e-1d11f05a90bb")
     Object mIsClass = false;

    @objid ("27a0fa31-cf9d-451c-a8e3-b2aa3dfa0e46")
     Object mIsAbstract = false;

    @objid ("3a45ff28-70aa-4816-bfc0-d8b595dce049")
    public FeatureData(FeatureSmClass smClass) {
        super(smClass);
    }

}
