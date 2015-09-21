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

@objid ("0091fc9e-c4be-1fd8-97fe-001ec947cd2a")
public class MetaclassReferenceData extends ElementData {
    @objid ("f9239f0d-83bc-4969-b52d-f79ea02d6fa9")
     Object mReferencedClassName = "";

    @objid ("76b8d345-9e1e-47c5-92a9-93cdb2e47d07")
     SmObjectImpl mDefinedTable;

    @objid ("5df80b07-2af9-4eb4-bc17-e2c9c6b374d8")
     List<SmObjectImpl> mDefinedNoteType = null;

    @objid ("24d43b12-70a9-4bde-adb8-c8ca51e5c7d7")
     List<SmObjectImpl> mDefinedExternDocumentType = null;

    @objid ("56f571d6-772c-466e-8161-943f49ff675c")
     SmObjectImpl mOwnerProfile;

    @objid ("a3fc5b83-964f-4912-abc8-0551981f4895")
     List<SmObjectImpl> mDefinedTagType = null;

    @objid ("62761aa8-1a2d-4667-bb03-fd6dee7b7a8c")
    public MetaclassReferenceData(MetaclassReferenceSmClass smClass) {
        super(smClass);
    }

}
