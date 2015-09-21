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

@objid ("001037c2-c4bf-1fd8-97fe-001ec947cd2a")
public class LinkEndData extends ModelElementData {
    @objid ("ab5e0be0-5fc5-4261-9f92-b0f5276ae2d3")
     Object mIsOrdered = false;

    @objid ("172b4b98-de4f-4491-8532-f996b53a5075")
     Object mIsUnique = false;

    @objid ("cd313283-4650-4578-ad82-51df4944fd51")
     Object mMultiplicityMax = "1";

    @objid ("2ceb7cc9-8879-4be8-a73e-cf25e5dac520")
     Object mMultiplicityMin = "0";

    @objid ("b55a5df5-30fd-4d46-809a-69b2be6e0359")
     SmObjectImpl mLink;

    @objid ("2fbc70c7-f80d-47da-8573-79ec359d9af3")
     SmObjectImpl mTarget;

    @objid ("496098e8-e2de-40fa-945b-a4a83aca24bd")
     SmObjectImpl mOppositeOwner;

    @objid ("dc65f648-9991-4df6-bd07-a577ca1ca40b")
     List<SmObjectImpl> mRealizedInformationFlow = null;

    @objid ("8420ad43-b299-4e67-86b0-c2902dc73d14")
     SmObjectImpl mModel;

    @objid ("50b2f0f7-5f65-4365-bb3a-46d9516ba030")
     SmObjectImpl mConsumer;

    @objid ("327ba651-48fe-48e1-a062-38db31076b0e")
     SmObjectImpl mOpposite;

    @objid ("74f3108e-dd93-49ba-b87c-ec76d993f3d9")
     SmObjectImpl mSource;

    @objid ("60702e07-c17e-48f2-89a4-1664f82f1700")
     SmObjectImpl mProvider;

    @objid ("53a88d99-7af0-451d-a065-e91d59c0d822")
    public LinkEndData(LinkEndSmClass smClass) {
        super(smClass);
    }

}
