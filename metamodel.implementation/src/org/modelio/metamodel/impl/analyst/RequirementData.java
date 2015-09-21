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
package org.modelio.metamodel.impl.analyst;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("cdb4e302-697f-4730-9228-27f71f3c6d4d")
public class RequirementData extends AnalystElementData {
    @objid ("48f3f638-9dd7-41e4-bd28-e558455225bd")
     List<SmObjectImpl> mSubRequirement = null;

    @objid ("6c2f9ceb-3c60-4fa7-8905-5f3ab73f7ba9")
     SmObjectImpl mOwnerContainer;

    @objid ("41fe492e-3ffb-490e-9f5e-a2e705279cbe")
     SmObjectImpl mParentRequirement;

    @objid ("50031f08-789a-4c3c-841a-c4a87da3a522")
     List<SmObjectImpl> mArchivedRequirementVersion = null;

    @objid ("7ff4f0a3-b0f7-4619-8320-2fb397bb7faf")
     SmObjectImpl mLastRequirementVersion;

    @objid ("dc1e48d9-7983-4a50-bef9-7a0625902e7f")
    public RequirementData(RequirementSmClass smClass) {
        super(smClass);
    }

}
