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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("001da934-c4bf-1fd8-97fe-001ec947cd2a")
public class TemplateParameterData extends GeneralClassData {
    @objid ("ffc6bf9b-0998-434e-b057-b6131572de11")
     Object mDefaultValue = "";

    @objid ("b20af1c7-b9a8-4a93-89cc-2e00e14862af")
     Object mIsValueParameter = false;

    @objid ("33196484-9dfb-4a0f-bb22-f236b60063df")
     List<SmObjectImpl> mParameterSubstitution = null;

    @objid ("0e28b155-9d15-479f-93ee-978c2c4f3736")
     SmObjectImpl mType;

    @objid ("383aa4cd-4902-451b-98e4-b4fd5d38a3e4")
     SmObjectImpl mParameterized;

    @objid ("fd8bb6cb-0679-4eb1-8a9d-6d25125fff55")
     SmObjectImpl mOwnedParameterElement;

    @objid ("124125a9-8a7a-4f83-8754-2ca22967c15d")
     SmObjectImpl mDefaultType;

    @objid ("5da4654b-27e3-4544-88a2-f5bf5378afec")
     SmObjectImpl mParameterizedOperation;

    @objid ("5d840942-6b81-4466-ac39-f7ed70dd2b39")
    public TemplateParameterData(TemplateParameterSmClass smClass) {
        super(smClass);
    }

}
