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
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00044bf6-c4bf-1fd8-97fe-001ec947cd2a")
public class CollaborationData extends NameSpaceData {
    @objid ("2f39ffab-9bcf-470d-82a6-6a38a62d817b")
     Object mIsConcurrent = false;

    @objid ("3f937930-6800-4dc3-8e7b-10e72d08f80d")
     SmObjectImpl mORepresented;

    @objid ("678e4992-5c9e-48ab-833a-1d0b11275f5c")
     SmObjectImpl mBRepresented;

    @objid ("230dd43f-d4ed-48a3-8cb4-4bc7b79ef3d7")
     List<SmObjectImpl> mOccurrence = null;

    @objid ("b6c64527-cc9f-4dc8-bd72-9fd071ec07e1")
    public CollaborationData(CollaborationSmClass smClass) {
        super(smClass);
    }

}
