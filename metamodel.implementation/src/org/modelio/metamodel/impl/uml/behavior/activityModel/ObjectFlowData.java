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
import org.modelio.metamodel.uml.behavior.activityModel.ObjectFlowEffectKind;

@objid ("0038ffd6-c4bf-1fd8-97fe-001ec947cd2a")
public class ObjectFlowData extends ActivityEdgeData {
    @objid ("eb2ae01a-4699-4827-96e1-48b6b219ecb2")
     Object mTransformationBehavior = "";

    @objid ("56b556c3-6c8c-45e6-88fb-1b30b4e44089")
     Object mSelectionBehavior = "";

    @objid ("5430aca4-8f5a-42b1-bac0-764828cfe516")
     Object mIsMultiCast = false;

    @objid ("50d9b19a-f82d-4882-9cf7-a1c6ee059b69")
     Object mIsMultiReceive = false;

    @objid ("d85e7e49-b237-414c-a8cf-f7c95495c87d")
     Object mEffect = ObjectFlowEffectKind.READFLOW;

    @objid ("586d31b6-ab8f-4dab-aee7-7f2ed803995a")
    public ObjectFlowData(ObjectFlowSmClass smClass) {
        super(smClass);
    }

}
