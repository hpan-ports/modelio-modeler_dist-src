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
package org.modelio.metamodel.impl.uml.behavior.usecaseModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.uml.statik.VisibilityMode;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0059d030-c4bf-1fd8-97fe-001ec947cd2a")
public class ExtensionPointData extends ModelElementData {
    @objid ("7312f78b-aab9-485a-9ed0-7ae27669eb7b")
     Object mVisibility = VisibilityMode.PUBLIC;

    @objid ("c8f8687e-eb04-49df-8596-dc3060e54515")
     List<SmObjectImpl> mExtended = null;

    @objid ("199135dc-8860-4c7f-8b9e-a1d5f74eb74d")
     SmObjectImpl mOwner;

    @objid ("800beab8-10f0-486f-bda8-0f62683c2d90")
    public ExtensionPointData(ExtensionPointSmClass smClass) {
        super(smClass);
    }

}
