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
package org.modelio.metamodel.impl.uml.infrastructure.properties;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyBaseType;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("006f8eac-ec87-1098-b22e-001ec947cd2a")
public class PropertyTypeData extends ModelElementData {
    @objid ("0bb3ee42-ed57-4fcc-8fc2-3fb95d5e721a")
     Object mBaseType = PropertyBaseType.STRING;

    @objid ("b93c90d0-4fc7-48e3-8507-a1b801940bd6")
     SmObjectImpl mAnalystOwner;

    @objid ("b6284064-f57c-4b4e-bdd9-17fcc1598334")
     List<SmObjectImpl> mTyped = null;

    @objid ("9adc1579-9413-4824-bcb3-3a52d328c465")
     SmObjectImpl mModuleOwner;

    @objid ("ced259ed-31b6-4d2d-b261-4c54ea96dbfb")
    public PropertyTypeData(PropertyTypeSmClass smClass) {
        super(smClass);
    }

}
