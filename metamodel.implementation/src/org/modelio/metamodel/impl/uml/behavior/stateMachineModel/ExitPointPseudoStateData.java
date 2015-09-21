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
package org.modelio.metamodel.impl.uml.behavior.stateMachineModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00501928-c4bf-1fd8-97fe-001ec947cd2a")
public class ExitPointPseudoStateData extends AbstractPseudoStateData {
    @objid ("c50ba3d3-dbb0-4a10-80d9-92384f8bd732")
     SmObjectImpl mExitOf;

    @objid ("d5f5651f-ec1d-4379-9b80-73e245c06113")
     List<SmObjectImpl> mConnection = null;

    @objid ("5c4146f0-3785-4a42-8c4c-dd5fb9d545b0")
     SmObjectImpl mExitOfMachine;

    @objid ("a54435d8-87ac-47f8-9cba-4b38de9b7dfe")
    public ExitPointPseudoStateData(ExitPointPseudoStateSmClass smClass) {
        super(smClass);
    }

}
