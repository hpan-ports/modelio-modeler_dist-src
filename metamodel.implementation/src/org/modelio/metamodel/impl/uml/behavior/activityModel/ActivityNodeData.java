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
package org.modelio.metamodel.impl.uml.behavior.activityModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00290914-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ActivityNodeData extends ModelElementData {
    @objid ("9524ad98-7cfe-472b-99c0-a09545fe2917")
     SmObjectImpl mOwner;

    @objid ("0c190027-eb68-45e5-82fd-884f0d6503f4")
     SmObjectImpl mOwnerPartition;

    @objid ("fe844a3a-ec6f-4841-b22b-58dd36110a14")
     List<SmObjectImpl> mIncoming = null;

    @objid ("9475ac84-4b00-4896-80d4-24dea85e62ed")
     SmObjectImpl mOwnerClause;

    @objid ("4ed5b2a7-8afa-4557-905d-3b331fe2f868")
     SmObjectImpl mOwnerNode;

    @objid ("97c2d365-fd7d-4800-a0ac-e6ea201bb1d0")
     List<SmObjectImpl> mOutgoing = null;

    @objid ("c594e2b1-65a7-41de-a3c9-0b9001163167")
    public ActivityNodeData(ActivityNodeSmClass smClass) {
        super(smClass);
    }

}
