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
package org.modelio.metamodel.impl.uml.infrastructure;

import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("00937678-c4be-1fd8-97fe-001ec947cd2a")
public class ExternDocumentTypeData extends ModelElementData {
    @objid ("9bf4f09e-f814-4a72-b88b-04e90819e6a1")
     Object mIsHidden = false;

    @objid ("0480eee4-4a2d-43e4-8a69-db2dc2951879")
     Object mLabelKey = "";

    @objid ("77c26dbb-efdf-42fc-9ac0-eaa156e47c29")
     Object mIcon = "";

    @objid ("b275c9d9-8c5f-4eb2-a473-164711e05fad")
     Object mImage = "";

    @objid ("68fe20b7-520f-4f39-9a85-7b8f203ef7e2")
     SmObjectImpl mOwnerStereotype;

    @objid ("ec1fb47f-54ae-41a1-8d95-6ef982652106")
     List<SmObjectImpl> mTypedDoc = null;

    @objid ("667ad8e4-50a3-4858-9943-90c90a8df4d6")
     SmObjectImpl mOwnerReference;

    @objid ("588c8642-c9c8-4f29-b73c-d7014d5515a4")
    public ExternDocumentTypeData(ExternDocumentTypeSmClass smClass) {
        super(smClass);
    }

}
