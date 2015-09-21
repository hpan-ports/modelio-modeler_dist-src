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

@objid ("004f999e-c4bf-1fd8-97fe-001ec947cd2a")
public class EntryPointPseudoStateData extends AbstractPseudoStateData {
    @objid ("eea78d66-b086-4e0e-9567-f99f563ec749")
     SmObjectImpl mEntryOf;

    @objid ("87176391-ac46-46e5-a334-38267dcabacb")
     List<SmObjectImpl> mConnection = null;

    @objid ("0ef3f40d-4d19-4321-ae6b-7d974afd06e7")
     SmObjectImpl mEntryOfMachine;

    @objid ("cbf65090-42a6-4f15-9245-a637aa6ecb53")
    public EntryPointPseudoStateData(EntryPointPseudoStateSmClass smClass) {
        super(smClass);
    }

}
