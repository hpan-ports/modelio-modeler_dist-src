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

@objid ("0022bc4e-c4bf-1fd8-97fe-001ec947cd2a")
public class NaryLinkData extends ModelElementData {
    @objid ("25decc67-eb07-4d3d-bb77-8ed22a52a7b7")
     List<SmObjectImpl> mNaryLinkEnd = null;

    @objid ("3ce01e27-6f38-483d-8e65-29b0ec2f7d5c")
     SmObjectImpl mModel;

    @objid ("b888f1d4-c921-458e-9fc8-d4bde59a93fb")
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("749022d8-98fc-469e-a6bc-324ab27b1da9")
     List<SmObjectImpl> mSent = null;

    @objid ("ddad9c51-9074-44a6-86fe-4c1ea5ef9a81")
    public NaryLinkData(NaryLinkSmClass smClass) {
        super(smClass);
    }

}
