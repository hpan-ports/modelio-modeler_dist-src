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

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("002db2e8-c4bf-1fd8-97fe-001ec947cd2a")
public class ConditionalNodeData extends StructuredActivityNodeData {
    @objid ("ff6f00b7-13a7-428b-9589-d8a994d3c572")
     Object mIsDeterminate = false;

    @objid ("56f8657b-80c5-41dd-91ff-40d28a652096")
     Object mIsAssured = false;

    @objid ("ab451af1-bf53-46ee-a2bc-ec354616fc15")
     List<SmObjectImpl> mOwnedClause = null;

    @objid ("0c6fcb47-5d33-43cf-a084-fd39ab8d46d0")
    public ConditionalNodeData(ConditionalNodeSmClass smClass) {
        super(smClass);
    }

}
