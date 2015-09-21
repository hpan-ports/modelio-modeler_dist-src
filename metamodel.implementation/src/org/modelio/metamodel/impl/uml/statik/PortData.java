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
import org.modelio.metamodel.uml.statik.PortOrientation;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00193926-c4bf-1fd8-97fe-001ec947cd2a")
public class PortData extends BindableInstanceData {
    @objid ("a4002ff3-0d61-4bb3-96e5-5eee9de83b8c")
     Object mIsBehavior = false;

    @objid ("66c2e7dd-2ff7-4b91-b6cb-f5596dc46a5a")
     Object mIsService = false;

    @objid ("0e86fc16-da07-41c5-8628-506755fa4004")
     Object mIsConjugated = false;

    @objid ("c93b397b-89fc-4715-8dea-bbad879f75dc")
     Object mDirection = PortOrientation.NONE;

    @objid ("5d999e8f-9648-40ab-b1fc-18d6c431911f")
     List<SmObjectImpl> mProvided = null;

    @objid ("248e20c4-1203-40ae-bcae-16aa5d1404f9")
     List<SmObjectImpl> mRequired = null;

    @objid ("c8d9fbf2-b2dd-49d4-905f-b1f9d68d1222")
    public PortData(PortSmClass smClass) {
        super(smClass);
    }

}
