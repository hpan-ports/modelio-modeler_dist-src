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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.uml.behavior.activityModel.ObjectNodeOrderingKind;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0039b58e-c4bf-1fd8-97fe-001ec947cd2a")
public abstract class ObjectNodeData extends ActivityNodeData {
    @objid ("2e761e42-de83-4470-8673-33bad6555f34")
     Object mIsControlType = false;

    @objid ("51977997-9fb8-404d-b704-ea83fbdfa60d")
     Object mOrdering = ObjectNodeOrderingKind.FIFO;

    @objid ("a2f89532-8662-47f2-9833-50847711ffc8")
     Object mSelectionBehavior = "";

    @objid ("681e0eba-06d5-4bae-9223-cf2aff5178d2")
     Object mUpperBound = "1";

    @objid ("f4c96270-b9ff-4b56-ad4c-9dc7333c2010")
     SmObjectImpl mRepresented;

    @objid ("cc40cb94-36db-476d-ab5d-253b0c7cc469")
     SmObjectImpl mRepresentedRealParameter;

    @objid ("c1ab6301-ff82-4573-b43c-13a4e20f9a29")
     SmObjectImpl mType;

    @objid ("41fcddd8-c31f-444f-98b5-e038d0714401")
     SmObjectImpl mRepresentedRole;

    @objid ("835641ec-c753-4e66-a7a5-5b250f43201e")
     SmObjectImpl mRepresentedAttribute;

    @objid ("aa445b0c-e8cb-4f3e-ad24-d5b994f8148a")
     SmObjectImpl mInState;

    @objid ("78fde836-c73e-4e53-bda6-be966f7e19be")
    public ObjectNodeData(ObjectNodeSmClass smClass) {
        super(smClass);
    }

}
