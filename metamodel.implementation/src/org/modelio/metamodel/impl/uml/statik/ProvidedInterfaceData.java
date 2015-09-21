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

@objid ("001a1ddc-c4bf-1fd8-97fe-001ec947cd2a")
public class ProvidedInterfaceData extends ModelElementData {
    @objid ("c6c646bd-9721-4500-8694-cc790c12f491")
     List<SmObjectImpl> mProvidedElement = null;

    @objid ("9c93e7a8-e06a-4eb6-8c55-91575ede102a")
     SmObjectImpl mProviding;

    @objid ("371bc287-4e37-4ca3-a9fc-28bc47df46f4")
     List<SmObjectImpl> mConsumer = null;

    @objid ("97791cab-ed59-42d2-8cfa-7dc2de53690c")
     List<SmObjectImpl> mNaryConsumer = null;

    @objid ("3c5b3064-219a-425e-b029-af515474a54f")
    public ProvidedInterfaceData(ProvidedInterfaceSmClass smClass) {
        super(smClass);
    }

}
