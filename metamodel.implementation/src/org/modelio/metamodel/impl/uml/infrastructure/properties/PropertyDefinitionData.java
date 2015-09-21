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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00653092-ec87-1098-b22e-001ec947cd2a")
public class PropertyDefinitionData extends ModelElementData {
    @objid ("37bebb11-654e-4374-bde9-005205923111")
     Object mIsEditable = true;

    @objid ("0804c7ba-e54b-4500-ac33-bca6de736c3b")
     Object mDefaultValue = "";

    @objid ("249a5f5b-282d-46e7-85f8-2569c04e0a1c")
     SmObjectImpl mType;

    @objid ("cd730ae6-cffd-4207-bb33-710426fa93bf")
     SmObjectImpl mOwner;

    @objid ("6b2f8828-2dd2-4fc8-b784-20d81e852822")
    public PropertyDefinitionData(PropertyDefinitionSmClass smClass) {
        super(smClass);
    }

}
