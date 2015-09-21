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

@objid ("00011508-c4bf-1fd8-97fe-001ec947cd2a")
public class BindableInstanceData extends InstanceData {
    @objid ("84415532-4714-400b-9ba0-21656edc6817")
     SmObjectImpl mCluster;

    @objid ("15d6c5dc-770f-4eab-9696-19138d61ac73")
     SmObjectImpl mInternalOwner;

    @objid ("9335d95b-3ae8-4422-978a-4b51c39c0b2e")
     List<SmObjectImpl> mRepresentation = null;

    @objid ("d8ed512f-8a3a-43cf-8b7a-000029119165")
     SmObjectImpl mRepresentedFeature;

    @objid ("aabe89b1-b0c3-4f84-a175-a267e300a9dc")
    public BindableInstanceData(BindableInstanceSmClass smClass) {
        super(smClass);
    }

}
