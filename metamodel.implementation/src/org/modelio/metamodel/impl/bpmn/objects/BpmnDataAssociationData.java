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
package org.modelio.metamodel.impl.bpmn.objects;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.bpmn.rootElements.BpmnBaseElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0004de90-c4c0-1fd8-97fe-001ec947cd2a")
public class BpmnDataAssociationData extends BpmnBaseElementData {
    @objid ("1f76c560-4e71-45b7-9f3b-4c8fd918c571")
     Object mAssignment = "";

    @objid ("f988480e-6080-4883-875d-76c5fba40366")
     Object mTransfomation = "";

    @objid ("96833bec-4281-43e7-b47b-edd735dd4cba")
     Object mLanguage = "";

    @objid ("2ae30587-0a22-43f6-abff-fc445e1b8b7b")
     List<SmObjectImpl> mSourceRef = null;

    @objid ("c14abb44-b444-48e0-96c6-fad95c291893")
     SmObjectImpl mTargetRef;

    @objid ("0beba19a-8e6d-4b62-8528-5de492bd93d7")
     SmObjectImpl mEndingActivity;

    @objid ("065c5273-dc3e-4658-afdc-8fc7b741eca2")
     SmObjectImpl mStartingActivity;

    @objid ("fab1950e-56f7-479d-9c57-18b9c7f4eb56")
     SmObjectImpl mStartingEvent;

    @objid ("d0ac9a7e-904a-4612-a6cb-7750ed06348b")
     List<SmObjectImpl> mVisualShortCut = null;

    @objid ("12451160-bd38-442b-8269-0ad92ac991da")
     SmObjectImpl mEndingEvent;

    @objid ("d822a44c-72d8-4edb-b6b8-89331eda0927")
    public BpmnDataAssociationData(BpmnDataAssociationSmClass smClass) {
        super(smClass);
    }

}
