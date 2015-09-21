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
package org.modelio.metamodel.impl.uml.behavior.interactionModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00490d86-c4bf-1fd8-97fe-001ec947cd2a")
public class LifelineData extends ModelElementData {
    @objid ("84eb7264-a907-4dd5-8358-f2ce5bb00598")
     Object mSelector = "";

    @objid ("3874487a-5a6e-447c-89a0-7afb0bc069c9")
     List<SmObjectImpl> mCoveredBy = null;

    @objid ("dbf00e1f-ad22-4f8d-8853-105f8af25c86")
     SmObjectImpl mDecomposedAs;

    @objid ("584dd55c-d4a1-4ea6-80ab-c4cb7169bf45")
     SmObjectImpl mOwner;

    @objid ("eca9f40b-3acf-4399-96d5-5c4f43bab13a")
     SmObjectImpl mRepresented;

    @objid ("0ca38796-2e6d-4fb7-99a7-6236a8dfcde3")
    public LifelineData(LifelineSmClass smClass) {
        super(smClass);
    }

}
