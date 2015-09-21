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

@objid ("000dc94c-c4bf-1fd8-97fe-001ec947cd2a")
public class InstanceData extends ModelElementData {
    @objid ("4318517c-04ab-4ce8-8b21-fb4e89fcfb21")
     Object mIsConstant = false;

    @objid ("d9344f8b-477e-4ca6-8d51-27b804194760")
     Object mMultiplicityMin = "1";

    @objid ("aa0c63fb-34c0-4902-9415-e7460eb8f2de")
     Object mMultiplicityMax = "1";

    @objid ("5a9b596a-0aa8-46b0-b552-ab6155b4b949")
     Object mValue = "";

    @objid ("dd9190a5-70b6-4852-83f7-3512ed93454c")
     List<SmObjectImpl> mRepresentedCommunicationNode = null;

    @objid ("b22e0332-9a9e-48db-85d2-deab198ce804")
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("7ddd735e-21ca-4f5a-b397-82f2966239df")
     List<SmObjectImpl> mOwnedEnd = null;

    @objid ("b6de4809-1048-464e-94d3-6bc14cc6cb89")
     SmObjectImpl mBase;

    @objid ("dce5877b-3fbf-4cd4-9d9b-32162a2cd971")
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("2aeecf36-fd78-4823-9260-298599796e29")
     SmObjectImpl mOwner;

    @objid ("05bbda2f-ad24-413a-a8e4-dd5ffa3c3970")
     List<SmObjectImpl> mOwnedNaryEnd = null;

    @objid ("0eba183a-eaf9-4ec9-95c1-cb71aa9a527b")
     List<SmObjectImpl> mRepresentedLifeLine = null;

    @objid ("cfa45756-cc6b-4674-a380-2e5272ba7bfe")
     List<SmObjectImpl> mSlot = null;

    @objid ("a33baa3e-4836-4c65-8b82-7fd8847dc829")
     List<SmObjectImpl> mPart = null;

    @objid ("5eaed466-0bb6-4ffc-b401-ad1df8a90280")
     List<SmObjectImpl> mTargetingEnd = null;

    @objid ("15adb1dd-f70f-490e-9283-8999e2b100ee")
    public InstanceData(InstanceSmClass smClass) {
        super(smClass);
    }

}
