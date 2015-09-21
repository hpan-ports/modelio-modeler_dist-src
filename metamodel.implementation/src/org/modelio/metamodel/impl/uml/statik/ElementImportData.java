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
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("000879a6-c4bf-1fd8-97fe-001ec947cd2a")
public class ElementImportData extends ModelElementData {
    @objid ("1dd25522-2a7e-42c1-8b40-4fc4dd3c2cdb")
     Object mVisibility = VisibilityMode.PRIVATE;

    @objid ("7a8cd04c-3ae2-45b6-9ada-d474672d17c5")
     SmObjectImpl mImportingNameSpace;

    @objid ("aab08b47-a1f9-4e9c-8aea-7f49ea7d8142")
     SmObjectImpl mImportedElement;

    @objid ("5fb170b9-18e2-4191-b128-408a9736ce93")
     SmObjectImpl mImportingOperation;

    @objid ("1a08f2f7-6ed9-4ab5-9221-0a8028ca640a")
    public ElementImportData(ElementImportSmClass smClass) {
        super(smClass);
    }

}
