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
import org.modelio.metamodel.impl.uml.infrastructure.ElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0069a7f8-ec87-1098-b22e-001ec947cd2a")
public class PropertyTableData extends ElementData {
    @objid ("df1d80d6-4232-4c0c-9a18-0868402f84f3")
     Object mName = "";

    @objid ("b9f3ab28-6277-4f9b-8230-6777e85b3cde")
     Object mContent = "";

    @objid ("2e683245-2698-4eba-bdbc-28886ab14180")
     SmObjectImpl mOwner;

    @objid ("4bee55e4-94e3-4b9f-a97a-98e21ce6cd1c")
     SmObjectImpl mOwnerValDef;

    @objid ("3113ea6b-ba5a-4c58-a920-54660206e5d5")
     SmObjectImpl mOwnerQuery;

    @objid ("e8dffd2c-b47a-4c9b-a5ec-38ff4392aa3b")
    public PropertyTableData(PropertyTableSmClass smClass) {
        super(smClass);
    }

}
