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
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0048846a-c4bf-1fd8-97fe-001ec947cd2a")
public class InteractionUseData extends InteractionFragmentData {
    @objid ("7fb4bc89-03f1-4b7c-8e20-34e2af6702cb")
     Object mEndLineNumber = 0;

    @objid ("0b7629ad-cec9-41dd-b971-0cd92989d336")
     List<SmObjectImpl> mActualGate = null;

    @objid ("c3be0f31-2cd9-49a0-91e1-a0196b72630a")
     SmObjectImpl mRefersTo;

    @objid ("21ceda6f-9d3e-4a9d-93b7-bd12eaf3bf72")
    public InteractionUseData(InteractionUseSmClass smClass) {
        super(smClass);
    }

}
