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
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0004d404-c4bf-1fd8-97fe-001ec947cd2a")
public class CollaborationUseData extends ModelElementData {
    @objid ("d269c386-8a86-4ed6-b480-1369218534d2")
     SmObjectImpl mType;

    @objid ("5533df13-1af1-4f09-a69d-d78af4502f32")
     SmObjectImpl mNRepresented;

    @objid ("fcaae887-077b-4c8b-a572-9da227730d03")
     SmObjectImpl mORepresented;

    @objid ("547b1dc1-6997-4e5e-986e-b9d8a779e65f")
     List<SmObjectImpl> mRoleBinding = null;

    @objid ("c4c3c028-44d4-400c-b345-dff3c0ed82fc")
    public CollaborationUseData(CollaborationUseSmClass smClass) {
        super(smClass);
    }

}
