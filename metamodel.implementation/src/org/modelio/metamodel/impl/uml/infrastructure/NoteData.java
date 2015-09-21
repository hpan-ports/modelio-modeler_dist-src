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

@objid ("008a4260-c4be-1fd8-97fe-001ec947cd2a")
public class NoteData extends ModelElementData {
    @objid ("2edb7757-5b2f-4259-8620-c52d95738d9a")
     Object mContent = "";

    @objid ("24f40d1d-c509-4915-a7a0-88add063b788")
     Object mMimeType = "";

    @objid ("4f859cd5-8bbe-41fa-95dd-ebdde4692a89")
     SmObjectImpl mModel;

    @objid ("a83a3282-2f54-4324-9850-4c7d8163d3de")
     SmObjectImpl mSubject;

    @objid ("b9caf51c-37c9-4330-a084-bc99ca200939")
    public NoteData(NoteSmClass smClass) {
        super(smClass);
    }

}
