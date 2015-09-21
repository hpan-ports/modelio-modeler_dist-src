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

@objid ("67558b34-b4c9-476e-939c-3da1dcc447df")
public class CommunicationChannelData extends ModelElementData {
    @objid ("7c3c1d72-622e-47ca-88a9-628bf3d0fe84")
     List<SmObjectImpl> mStartToEndMessage = null;

    @objid ("71a3df2b-cf65-4ac0-9ac5-7473996235bb")
     SmObjectImpl mChannel;

    @objid ("84140b3b-b8d4-4b80-8c19-b066546b3aec")
     SmObjectImpl mStart;

    @objid ("8fcd69ab-99cd-44c2-b184-7ae62824df2c")
     SmObjectImpl mNaryChannel;

    @objid ("d38e7102-2d58-4d32-8ec1-27a1951b4980")
     List<SmObjectImpl> mEndToStartMessage = null;

    @objid ("d070607f-b17d-4be4-b381-af184f3c7602")
     SmObjectImpl mEnd;

    @objid ("e9d75055-ede0-4130-996d-c7627f2a55a0")
    public CommunicationChannelData(CommunicationChannelSmClass smClass) {
        super(smClass);
    }

}
