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

@objid ("000e976e-c4bf-1fd8-97fe-001ec947cd2a")
public class InterfaceData extends GeneralClassData {
    @objid ("39d9d54f-88c7-48e7-9ca4-1c81b0293f0d")
     List<SmObjectImpl> mRequiring = null;

    @objid ("a9aa486b-727d-4664-8e54-7cdc16e0333a")
     List<SmObjectImpl> mImplementedLink = null;

    @objid ("8885e206-9d70-43e7-995f-d802d34269cb")
     List<SmObjectImpl> mProviding = null;

    @objid ("2fd4eab0-77a7-4e72-8c31-0227c4928346")
    public InterfaceData(InterfaceSmClass smClass) {
        super(smClass);
    }

}
