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
import org.modelio.metamodel.uml.statik.KindOfAccess;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("001f7f70-c4bf-1fd8-97fe-001ec947cd2a")
public class StructuralFeatureData extends FeatureData {
    @objid ("61ce0932-895b-48f7-adff-5dcc918e4490")
     Object mChangeable = KindOfAccess.READWRITE;

    @objid ("c797b331-caa3-496c-8bfa-64a6aff08d39")
     Object mIsDerived = false;

    @objid ("6c2b41dd-b9dc-4b87-b8ea-89e087d93291")
     Object mIsOrdered = false;

    @objid ("4c0f6d93-aa31-4c87-924a-f45b2aa1d60b")
     Object mIsUnique = false;

    @objid ("72dcf9d4-9ea4-423d-ab23-356f687cd886")
     Object mMultiplicityMin = "0";

    @objid ("86abe69d-ed18-4a74-a86f-5922cb725d95")
     Object mMultiplicityMax = "1";

    @objid ("9b9b7299-2b1e-4ea3-a521-6a527f3c1e73")
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("f86a45eb-c641-4720-ad79-63f3c56121fe")
    public StructuralFeatureData(StructuralFeatureSmClass smClass) {
        super(smClass);
    }

}
