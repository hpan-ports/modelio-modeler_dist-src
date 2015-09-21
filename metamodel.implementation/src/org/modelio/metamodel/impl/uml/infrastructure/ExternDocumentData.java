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

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.vcore.smkernel.SmObjectImpl;

@objid ("0092b9d6-c4be-1fd8-97fe-001ec947cd2a")
public class ExternDocumentData extends ModelElementData {
    @objid ("06e8ff20-4948-4849-b3cb-2a470217d2e5")
     Object mMimeType = "";

    @objid ("fc442954-fe70-4c23-b3a7-e6479445f6d7")
     Object mPath = "";

    @objid ("9a55e346-9f9d-4b42-81ee-ddefc44059d5")
     Object mAbstract = "";

    @objid ("279a7aaa-0f79-48bc-b0e6-715242097ad5")
     SmObjectImpl mType;

    @objid ("7106348c-224d-4f0a-b45f-d17b5a514b45")
     SmObjectImpl mSubject;

    @objid ("5b654d61-6484-437b-bf03-0efcea968f57")
    public ExternDocumentData(ExternDocumentSmClass smClass) {
        super(smClass);
    }

}
