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
package org.modelio.metamodel.impl.uml.behavior.communicationModel;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.metamodel.impl.uml.infrastructure.ModelElementData;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("005adeee-c4bf-1fd8-97fe-001ec947cd2a")
public class CommunicationNodeData extends ModelElementData {
    @objid ("e7d142f4-5576-444e-ab67-2569aa4f9697")
     Object mSelector = "";

    @objid ("21274e6e-38d9-480c-9702-04fc262bc293")
     SmObjectImpl mOwner;

    @objid ("9e058c6a-c331-4f4c-ba70-ef0acff74a86")
     SmObjectImpl mRepresented;

    @objid ("e66cfab4-7a91-40ea-be74-e16519419f05")
     List<SmObjectImpl> mStarted = null;

    @objid ("9cfc3ab3-bf1e-4211-b1d3-e0b3b18141b9")
     List<SmObjectImpl> mEnded = null;

    @objid ("94bb0d96-2d7c-49cc-a9a6-e095b00d475e")
    public CommunicationNodeData(CommunicationNodeSmClass smClass) {
        super(smClass);
    }

}
