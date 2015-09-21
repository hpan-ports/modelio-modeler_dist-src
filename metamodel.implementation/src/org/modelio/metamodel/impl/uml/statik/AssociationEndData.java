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
import org.modelio.metamodel.uml.statik.AggregationKind;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0097b0da-c4be-1fd8-97fe-001ec947cd2a")
public class AssociationEndData extends StructuralFeatureData {
    @objid ("d1c94dd1-0c2d-4787-b694-bb028a836141")
     Object mAggregation = AggregationKind.KINDISASSOCIATION;

    @objid ("608d45b9-5d2b-4cba-a6b4-c146cc46f9c6")
     Object mIsChangeable = true;

    @objid ("6ba173b2-4823-4561-a5a6-12f6d60e4cd6")
     SmObjectImpl mTarget;

    @objid ("12ba9b09-6b07-4550-9f10-2bb00fc26cc0")
     SmObjectImpl mOppositeOwner;

    @objid ("8295b58e-2f57-4339-b1c6-aa30211ccd39")
     SmObjectImpl mSource;

    @objid ("5f738300-dfec-4727-a880-728e567c6b5f")
     List<SmObjectImpl> mOccurence = null;

    @objid ("14f9c7d8-22e7-449f-89ef-89edc4d60ffd")
     List<SmObjectImpl> mSent = null;

    @objid ("5ebfd6cc-b875-4a86-bd71-b4ee8f1916b7")
     List<SmObjectImpl> mQualifier = null;

    @objid ("2c728267-2598-454a-9b63-fba3e93fd445")
     SmObjectImpl mOpposite;

    @objid ("6986b536-1fe9-41a7-97a9-25f41bdf5d38")
     List<SmObjectImpl> mRepresentingObjectNode = null;

    @objid ("e48518ba-b8ff-46c3-a393-785a6878093c")
     SmObjectImpl mAssociation;

    @objid ("f65d4596-74d3-4737-9c2a-0d704b4f8e0b")
     List<SmObjectImpl> mRepresentingItem = null;

    @objid ("d6ec764b-673c-4f1d-ad07-419015cb6ae2")
    public AssociationEndData(AssociationEndSmClass smClass) {
        super(smClass);
    }

}
