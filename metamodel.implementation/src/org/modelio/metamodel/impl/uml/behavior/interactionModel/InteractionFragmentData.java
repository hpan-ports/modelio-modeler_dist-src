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

@objid ("0047676a-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class InteractionFragmentData extends ModelElementData {
    @objid ("61822ad2-ea00-49a6-8f04-ee932a9ede7f")
     Object mLineNumber = -1;

    @objid ("6bbd8949-ea4b-4637-9872-12464a8702a7")
     SmObjectImpl mEnclosingOperand;

    @objid ("187aa921-a9e3-48f6-b071-a16f9909ea68")
     SmObjectImpl mEnclosingInteraction;

    @objid ("e5a8f107-ed2f-4678-9095-530c606d2613")
     List<SmObjectImpl> mCovered = null;

    @objid ("5c6400f0-4606-40af-b18b-02ebfda7ebae")
    public InteractionFragmentData(InteractionFragmentSmClass smClass) {
        super(smClass);
    }

}
