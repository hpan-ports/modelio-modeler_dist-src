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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("008fbe34-c4be-1fd8-97fe-001ec947cd2a")
public class TagTypeData extends ModelElementData {
    @objid ("fd0d2e8e-8050-43f9-8ae6-e255cfad520e")
     Object mParamNumber = "1";

    @objid ("a84bcd52-b49e-455c-8158-0cf048f7d4e9")
     Object mIsQualified = false;

    @objid ("70edb98b-f344-41c7-b602-248522b3f708")
     Object mBelongToPrototype = false;

    @objid ("17cf7b8d-3f94-475d-9dd5-40b467302d58")
     Object mIsHidden = false;

    @objid ("e1d5d1a6-ca2b-4235-8853-fa515b4df855")
     Object mLabelKey = "";

    @objid ("828f076e-1d10-4711-8f0f-7011f7695c1c")
     List<SmObjectImpl> mTagOccurence = null;

    @objid ("9391598c-1043-428f-a491-c883a44c3251")
     SmObjectImpl mOwnerStereotype;

    @objid ("1a071a1b-d729-48fe-9314-a317350e3874")
     SmObjectImpl mOwnerReference;

    @objid ("fdc2c374-1060-4649-a22e-79fae568bdeb")
    public TagTypeData(TagTypeSmClass smClass) {
        super(smClass);
    }

}
